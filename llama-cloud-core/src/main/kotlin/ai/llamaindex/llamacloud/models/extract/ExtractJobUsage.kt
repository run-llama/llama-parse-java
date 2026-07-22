// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

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
import kotlin.jvm.optionals.getOrNull

/** Extraction usage metrics. */
class ExtractJobUsage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val numPagesBilled: JsonField<Long>,
    private val numPagesExtracted: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("num_pages_billed")
        @ExcludeMissing
        numPagesBilled: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("num_pages_extracted")
        @ExcludeMissing
        numPagesExtracted: JsonField<Long> = JsonMissing.of(),
    ) : this(numPagesBilled, numPagesExtracted, mutableMapOf())

    /**
     * Number of effective pages billed
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numPagesBilled(): Optional<Long> = numPagesBilled.getOptional("num_pages_billed")

    /**
     * Number of pages extracted
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numPagesExtracted(): Optional<Long> = numPagesExtracted.getOptional("num_pages_extracted")

    /**
     * Returns the raw JSON value of [numPagesBilled].
     *
     * Unlike [numPagesBilled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_pages_billed")
    @ExcludeMissing
    fun _numPagesBilled(): JsonField<Long> = numPagesBilled

    /**
     * Returns the raw JSON value of [numPagesExtracted].
     *
     * Unlike [numPagesExtracted], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("num_pages_extracted")
    @ExcludeMissing
    fun _numPagesExtracted(): JsonField<Long> = numPagesExtracted

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

        /** Returns a mutable builder for constructing an instance of [ExtractJobUsage]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractJobUsage]. */
    class Builder internal constructor() {

        private var numPagesBilled: JsonField<Long> = JsonMissing.of()
        private var numPagesExtracted: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractJobUsage: ExtractJobUsage) = apply {
            numPagesBilled = extractJobUsage.numPagesBilled
            numPagesExtracted = extractJobUsage.numPagesExtracted
            additionalProperties = extractJobUsage.additionalProperties.toMutableMap()
        }

        /** Number of effective pages billed */
        fun numPagesBilled(numPagesBilled: Long?) =
            numPagesBilled(JsonField.ofNullable(numPagesBilled))

        /**
         * Alias for [Builder.numPagesBilled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numPagesBilled(numPagesBilled: Long) = numPagesBilled(numPagesBilled as Long?)

        /** Alias for calling [Builder.numPagesBilled] with `numPagesBilled.orElse(null)`. */
        fun numPagesBilled(numPagesBilled: Optional<Long>) =
            numPagesBilled(numPagesBilled.getOrNull())

        /**
         * Sets [Builder.numPagesBilled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numPagesBilled] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numPagesBilled(numPagesBilled: JsonField<Long>) = apply {
            this.numPagesBilled = numPagesBilled
        }

        /** Number of pages extracted */
        fun numPagesExtracted(numPagesExtracted: Long?) =
            numPagesExtracted(JsonField.ofNullable(numPagesExtracted))

        /**
         * Alias for [Builder.numPagesExtracted].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numPagesExtracted(numPagesExtracted: Long) =
            numPagesExtracted(numPagesExtracted as Long?)

        /** Alias for calling [Builder.numPagesExtracted] with `numPagesExtracted.orElse(null)`. */
        fun numPagesExtracted(numPagesExtracted: Optional<Long>) =
            numPagesExtracted(numPagesExtracted.getOrNull())

        /**
         * Sets [Builder.numPagesExtracted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numPagesExtracted] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numPagesExtracted(numPagesExtracted: JsonField<Long>) = apply {
            this.numPagesExtracted = numPagesExtracted
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
         * Returns an immutable instance of [ExtractJobUsage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExtractJobUsage =
            ExtractJobUsage(numPagesBilled, numPagesExtracted, additionalProperties.toMutableMap())
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
    fun validate(): ExtractJobUsage = apply {
        if (validated) {
            return@apply
        }

        numPagesBilled()
        numPagesExtracted()
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
        (if (numPagesBilled.asKnown().isPresent) 1 else 0) +
            (if (numPagesExtracted.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractJobUsage &&
            numPagesBilled == other.numPagesBilled &&
            numPagesExtracted == other.numPagesExtracted &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(numPagesBilled, numPagesExtracted, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractJobUsage{numPagesBilled=$numPagesBilled, numPagesExtracted=$numPagesExtracted, additionalProperties=$additionalProperties}"
}
