// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.metadata

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects

class MetadataCreateResponse
@JsonCreator
private constructor(
    @com.fasterxml.jackson.annotation.JsonValue
    private val additionalProperties: Map<String, JsonValue>
) {

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [MetadataCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetadataCreateResponse]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(metadataCreateResponse: MetadataCreateResponse) = apply {
            additionalProperties = metadataCreateResponse.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [MetadataCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MetadataCreateResponse =
            MetadataCreateResponse(additionalProperties.toImmutable())
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
    fun validate(): MetadataCreateResponse = apply {
        if (validated) {
            return@apply
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
    internal fun validity(): Int =
        additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetadataCreateResponse && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "MetadataCreateResponse{additionalProperties=$additionalProperties}"
}
