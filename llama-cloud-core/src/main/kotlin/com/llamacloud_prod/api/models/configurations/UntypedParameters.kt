// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Catch-all for configurations without a dedicated typed schema.
 *
 * Accepts arbitrary JSON fields alongside ``product_type``.
 */
class UntypedParameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val productType: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("product_type") @ExcludeMissing productType: JsonValue = JsonMissing.of()
    ) : this(productType, mutableMapOf())

    /**
     * Product type.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("unknown")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("product_type") @ExcludeMissing fun _productType(): JsonValue = productType

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [UntypedParameters]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UntypedParameters]. */
    class Builder internal constructor() {

        private var productType: JsonValue = JsonValue.from("unknown")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(untypedParameters: UntypedParameters) = apply {
            productType = untypedParameters.productType
            additionalProperties = untypedParameters.additionalProperties.toMutableMap()
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("unknown")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productType(productType: JsonValue) = apply { this.productType = productType }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [UntypedParameters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UntypedParameters =
            UntypedParameters(productType, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): UntypedParameters = apply {
        if (validated) {
            return@apply
        }

        _productType().let {
            if (it != JsonValue.from("unknown")) {
                throw LlamaCloudInvalidDataException("'productType' is invalid, received $it")
            }
        }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaCloudInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int = productType.let { if (it == JsonValue.from("unknown")) 1 else 0 }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UntypedParameters &&
            productType == other.productType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(productType, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UntypedParameters{productType=$productType, additionalProperties=$additionalProperties}"
}
