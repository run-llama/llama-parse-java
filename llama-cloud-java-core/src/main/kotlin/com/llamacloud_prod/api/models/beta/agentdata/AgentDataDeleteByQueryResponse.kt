// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.agentdata

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects

/** API response for bulk delete operation */
class AgentDataDeleteByQueryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deletedCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deleted_count")
        @ExcludeMissing
        deletedCount: JsonField<Long> = JsonMissing.of()
    ) : this(deletedCount, mutableMapOf())

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deletedCount(): Long = deletedCount.getRequired("deleted_count")

    /**
     * Returns the raw JSON value of [deletedCount].
     *
     * Unlike [deletedCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted_count")
    @ExcludeMissing
    fun _deletedCount(): JsonField<Long> = deletedCount

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [AgentDataDeleteByQueryResponse].
         *
         * The following fields are required:
         * ```java
         * .deletedCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentDataDeleteByQueryResponse]. */
    class Builder internal constructor() {

        private var deletedCount: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentDataDeleteByQueryResponse: AgentDataDeleteByQueryResponse) = apply {
            deletedCount = agentDataDeleteByQueryResponse.deletedCount
            additionalProperties =
                agentDataDeleteByQueryResponse.additionalProperties.toMutableMap()
        }

        fun deletedCount(deletedCount: Long) = deletedCount(JsonField.of(deletedCount))

        /**
         * Sets [Builder.deletedCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deletedCount(deletedCount: JsonField<Long>) = apply { this.deletedCount = deletedCount }

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
         * Returns an immutable instance of [AgentDataDeleteByQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .deletedCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentDataDeleteByQueryResponse =
            AgentDataDeleteByQueryResponse(
                checkRequired("deletedCount", deletedCount),
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): AgentDataDeleteByQueryResponse = apply {
        if (validated) {
            return@apply
        }

        deletedCount()
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
    @JvmSynthetic internal fun validity(): Int = (if (deletedCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentDataDeleteByQueryResponse &&
            deletedCount == other.deletedCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(deletedCount, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentDataDeleteByQueryResponse{deletedCount=$deletedCount, additionalProperties=$additionalProperties}"
}
