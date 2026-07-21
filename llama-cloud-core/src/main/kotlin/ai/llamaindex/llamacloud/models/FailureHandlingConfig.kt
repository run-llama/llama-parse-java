// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Configuration for handling different types of failures during data source processing. */
class FailureHandlingConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val skipListFailures: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("skip_list_failures")
        @ExcludeMissing
        skipListFailures: JsonField<Boolean> = JsonMissing.of()
    ) : this(skipListFailures, mutableMapOf())

    /**
     * Whether to skip failed batches/lists and continue processing
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipListFailures(): Optional<Boolean> = skipListFailures.getOptional("skip_list_failures")

    /**
     * Returns the raw JSON value of [skipListFailures].
     *
     * Unlike [skipListFailures], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("skip_list_failures")
    @ExcludeMissing
    fun _skipListFailures(): JsonField<Boolean> = skipListFailures

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

        /** Returns a mutable builder for constructing an instance of [FailureHandlingConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FailureHandlingConfig]. */
    class Builder internal constructor() {

        private var skipListFailures: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(failureHandlingConfig: FailureHandlingConfig) = apply {
            skipListFailures = failureHandlingConfig.skipListFailures
            additionalProperties = failureHandlingConfig.additionalProperties.toMutableMap()
        }

        /** Whether to skip failed batches/lists and continue processing */
        fun skipListFailures(skipListFailures: Boolean) =
            skipListFailures(JsonField.of(skipListFailures))

        /**
         * Sets [Builder.skipListFailures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipListFailures] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun skipListFailures(skipListFailures: JsonField<Boolean>) = apply {
            this.skipListFailures = skipListFailures
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
         * Returns an immutable instance of [FailureHandlingConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FailureHandlingConfig =
            FailureHandlingConfig(skipListFailures, additionalProperties.toMutableMap())
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
    fun validate(): FailureHandlingConfig = apply {
        if (validated) {
            return@apply
        }

        skipListFailures()
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
    internal fun validity(): Int = (if (skipListFailures.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FailureHandlingConfig &&
            skipListFailures == other.skipListFailures &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(skipListFailures, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FailureHandlingConfig{skipListFailures=$skipListFailures, additionalProperties=$additionalProperties}"
}
