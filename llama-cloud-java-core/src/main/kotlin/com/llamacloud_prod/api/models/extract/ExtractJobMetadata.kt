// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.extract

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Extraction metadata. */
class ExtractJobMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fieldMetadata: JsonField<ExtractedFieldMetadata>,
    private val parseJobId: JsonField<String>,
    private val parseTier: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("field_metadata")
        @ExcludeMissing
        fieldMetadata: JsonField<ExtractedFieldMetadata> = JsonMissing.of(),
        @JsonProperty("parse_job_id")
        @ExcludeMissing
        parseJobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parse_tier") @ExcludeMissing parseTier: JsonField<String> = JsonMissing.of(),
    ) : this(fieldMetadata, parseJobId, parseTier, mutableMapOf())

    /**
     * Metadata for extracted fields including document, page, and row level info.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldMetadata(): Optional<ExtractedFieldMetadata> =
        fieldMetadata.getOptional("field_metadata")

    /**
     * Reference to the ParseJob ID used for parsing
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parseJobId(): Optional<String> = parseJobId.getOptional("parse_job_id")

    /**
     * Parse tier used for parsing the document
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parseTier(): Optional<String> = parseTier.getOptional("parse_tier")

    /**
     * Returns the raw JSON value of [fieldMetadata].
     *
     * Unlike [fieldMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("field_metadata")
    @ExcludeMissing
    fun _fieldMetadata(): JsonField<ExtractedFieldMetadata> = fieldMetadata

    /**
     * Returns the raw JSON value of [parseJobId].
     *
     * Unlike [parseJobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parse_job_id") @ExcludeMissing fun _parseJobId(): JsonField<String> = parseJobId

    /**
     * Returns the raw JSON value of [parseTier].
     *
     * Unlike [parseTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parse_tier") @ExcludeMissing fun _parseTier(): JsonField<String> = parseTier

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

        /** Returns a mutable builder for constructing an instance of [ExtractJobMetadata]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractJobMetadata]. */
    class Builder internal constructor() {

        private var fieldMetadata: JsonField<ExtractedFieldMetadata> = JsonMissing.of()
        private var parseJobId: JsonField<String> = JsonMissing.of()
        private var parseTier: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractJobMetadata: ExtractJobMetadata) = apply {
            fieldMetadata = extractJobMetadata.fieldMetadata
            parseJobId = extractJobMetadata.parseJobId
            parseTier = extractJobMetadata.parseTier
            additionalProperties = extractJobMetadata.additionalProperties.toMutableMap()
        }

        /** Metadata for extracted fields including document, page, and row level info. */
        fun fieldMetadata(fieldMetadata: ExtractedFieldMetadata?) =
            fieldMetadata(JsonField.ofNullable(fieldMetadata))

        /** Alias for calling [Builder.fieldMetadata] with `fieldMetadata.orElse(null)`. */
        fun fieldMetadata(fieldMetadata: Optional<ExtractedFieldMetadata>) =
            fieldMetadata(fieldMetadata.getOrNull())

        /**
         * Sets [Builder.fieldMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldMetadata] with a well-typed
         * [ExtractedFieldMetadata] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun fieldMetadata(fieldMetadata: JsonField<ExtractedFieldMetadata>) = apply {
            this.fieldMetadata = fieldMetadata
        }

        /** Reference to the ParseJob ID used for parsing */
        fun parseJobId(parseJobId: String?) = parseJobId(JsonField.ofNullable(parseJobId))

        /** Alias for calling [Builder.parseJobId] with `parseJobId.orElse(null)`. */
        fun parseJobId(parseJobId: Optional<String>) = parseJobId(parseJobId.getOrNull())

        /**
         * Sets [Builder.parseJobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parseJobId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parseJobId(parseJobId: JsonField<String>) = apply { this.parseJobId = parseJobId }

        /** Parse tier used for parsing the document */
        fun parseTier(parseTier: String?) = parseTier(JsonField.ofNullable(parseTier))

        /** Alias for calling [Builder.parseTier] with `parseTier.orElse(null)`. */
        fun parseTier(parseTier: Optional<String>) = parseTier(parseTier.getOrNull())

        /**
         * Sets [Builder.parseTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parseTier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parseTier(parseTier: JsonField<String>) = apply { this.parseTier = parseTier }

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
         * Returns an immutable instance of [ExtractJobMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExtractJobMetadata =
            ExtractJobMetadata(
                fieldMetadata,
                parseJobId,
                parseTier,
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
    fun validate(): ExtractJobMetadata = apply {
        if (validated) {
            return@apply
        }

        fieldMetadata().ifPresent { it.validate() }
        parseJobId()
        parseTier()
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
        (fieldMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (parseJobId.asKnown().isPresent) 1 else 0) +
            (if (parseTier.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractJobMetadata &&
            fieldMetadata == other.fieldMetadata &&
            parseJobId == other.parseJobId &&
            parseTier == other.parseTier &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fieldMetadata, parseJobId, parseTier, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractJobMetadata{fieldMetadata=$fieldMetadata, parseJobId=$parseJobId, parseTier=$parseTier, additionalProperties=$additionalProperties}"
}
