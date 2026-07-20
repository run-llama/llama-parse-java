// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.configurations

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Typed parameters for an *extract v2* product configuration. */
class ExtractV2Parameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataSchema: JsonField<DataSchema>,
    private val productType: JsonValue,
    private val citeSources: JsonField<Boolean>,
    private val confidenceScores: JsonField<Boolean>,
    private val extractionTarget: JsonField<ExtractionTarget>,
    private val maxPages: JsonField<Long>,
    private val parseConfigId: JsonField<String>,
    private val parseTier: JsonField<String>,
    private val systemPrompt: JsonField<String>,
    private val targetPages: JsonField<String>,
    private val tier: JsonField<Tier>,
    private val version: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data_schema")
        @ExcludeMissing
        dataSchema: JsonField<DataSchema> = JsonMissing.of(),
        @JsonProperty("product_type") @ExcludeMissing productType: JsonValue = JsonMissing.of(),
        @JsonProperty("cite_sources")
        @ExcludeMissing
        citeSources: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("confidence_scores")
        @ExcludeMissing
        confidenceScores: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("extraction_target")
        @ExcludeMissing
        extractionTarget: JsonField<ExtractionTarget> = JsonMissing.of(),
        @JsonProperty("max_pages") @ExcludeMissing maxPages: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parse_config_id")
        @ExcludeMissing
        parseConfigId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parse_tier") @ExcludeMissing parseTier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("system_prompt")
        @ExcludeMissing
        systemPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_pages")
        @ExcludeMissing
        targetPages: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<Tier> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
    ) : this(
        dataSchema,
        productType,
        citeSources,
        confidenceScores,
        extractionTarget,
        maxPages,
        parseConfigId,
        parseTier,
        systemPrompt,
        targetPages,
        tier,
        version,
        mutableMapOf(),
    )

    /**
     * JSON Schema defining the fields to extract. Validate with the /schema/validate endpoint
     * first.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataSchema(): DataSchema = dataSchema.getRequired("data_schema")

    /**
     * Product type.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("extract_v2")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("product_type") @ExcludeMissing fun _productType(): JsonValue = productType

    /**
     * Include citations in results
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun citeSources(): Optional<Boolean> = citeSources.getOptional("cite_sources")

    /**
     * Include confidence scores in results
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun confidenceScores(): Optional<Boolean> = confidenceScores.getOptional("confidence_scores")

    /**
     * Granularity of extraction: per_doc returns one object per document, per_page returns one
     * object per page, per_table_row returns one object per table row
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extractionTarget(): Optional<ExtractionTarget> =
        extractionTarget.getOptional("extraction_target")

    /**
     * Maximum number of pages to process. Omit for no limit.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxPages(): Optional<Long> = maxPages.getOptional("max_pages")

    /**
     * Saved parse configuration ID to control how the document is parsed before extraction
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parseConfigId(): Optional<String> = parseConfigId.getOptional("parse_config_id")

    /**
     * Parse tier to use before extraction. Defaults to the extract tier if not specified.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parseTier(): Optional<String> = parseTier.getOptional("parse_tier")

    /**
     * Custom system prompt to guide extraction behavior
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun systemPrompt(): Optional<String> = systemPrompt.getOptional("system_prompt")

    /**
     * Comma-separated page numbers or ranges to process (1-based). Omit to process all pages.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetPages(): Optional<String> = targetPages.getOptional("target_pages")

    /**
     * Extract tier: cost_effective (5 credits/page), agentic (15 credits/page), or agentic_plus (50
     * credits/page)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tier(): Optional<Tier> = tier.getOptional("tier")

    /**
     * Use 'latest' for the latest release for the selected tier or a date string (YYYY-MM-DD
     * format) to pin to the nearest release at or before that date. Job responses always report the
     * concrete resolved version the job runs, fixed at job creation; saved configurations keep the
     * value as provided.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<String> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [dataSchema].
     *
     * Unlike [dataSchema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_schema")
    @ExcludeMissing
    fun _dataSchema(): JsonField<DataSchema> = dataSchema

    /**
     * Returns the raw JSON value of [citeSources].
     *
     * Unlike [citeSources], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cite_sources")
    @ExcludeMissing
    fun _citeSources(): JsonField<Boolean> = citeSources

    /**
     * Returns the raw JSON value of [confidenceScores].
     *
     * Unlike [confidenceScores], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("confidence_scores")
    @ExcludeMissing
    fun _confidenceScores(): JsonField<Boolean> = confidenceScores

    /**
     * Returns the raw JSON value of [extractionTarget].
     *
     * Unlike [extractionTarget], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("extraction_target")
    @ExcludeMissing
    fun _extractionTarget(): JsonField<ExtractionTarget> = extractionTarget

    /**
     * Returns the raw JSON value of [maxPages].
     *
     * Unlike [maxPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_pages") @ExcludeMissing fun _maxPages(): JsonField<Long> = maxPages

    /**
     * Returns the raw JSON value of [parseConfigId].
     *
     * Unlike [parseConfigId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parse_config_id")
    @ExcludeMissing
    fun _parseConfigId(): JsonField<String> = parseConfigId

    /**
     * Returns the raw JSON value of [parseTier].
     *
     * Unlike [parseTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parse_tier") @ExcludeMissing fun _parseTier(): JsonField<String> = parseTier

    /**
     * Returns the raw JSON value of [systemPrompt].
     *
     * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("system_prompt")
    @ExcludeMissing
    fun _systemPrompt(): JsonField<String> = systemPrompt

    /**
     * Returns the raw JSON value of [targetPages].
     *
     * Unlike [targetPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_pages")
    @ExcludeMissing
    fun _targetPages(): JsonField<String> = targetPages

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Tier> = tier

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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
         * Returns a mutable builder for constructing an instance of [ExtractV2Parameters].
         *
         * The following fields are required:
         * ```java
         * .dataSchema()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractV2Parameters]. */
    class Builder internal constructor() {

        private var dataSchema: JsonField<DataSchema>? = null
        private var productType: JsonValue = JsonValue.from("extract_v2")
        private var citeSources: JsonField<Boolean> = JsonMissing.of()
        private var confidenceScores: JsonField<Boolean> = JsonMissing.of()
        private var extractionTarget: JsonField<ExtractionTarget> = JsonMissing.of()
        private var maxPages: JsonField<Long> = JsonMissing.of()
        private var parseConfigId: JsonField<String> = JsonMissing.of()
        private var parseTier: JsonField<String> = JsonMissing.of()
        private var systemPrompt: JsonField<String> = JsonMissing.of()
        private var targetPages: JsonField<String> = JsonMissing.of()
        private var tier: JsonField<Tier> = JsonMissing.of()
        private var version: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractV2Parameters: ExtractV2Parameters) = apply {
            dataSchema = extractV2Parameters.dataSchema
            productType = extractV2Parameters.productType
            citeSources = extractV2Parameters.citeSources
            confidenceScores = extractV2Parameters.confidenceScores
            extractionTarget = extractV2Parameters.extractionTarget
            maxPages = extractV2Parameters.maxPages
            parseConfigId = extractV2Parameters.parseConfigId
            parseTier = extractV2Parameters.parseTier
            systemPrompt = extractV2Parameters.systemPrompt
            targetPages = extractV2Parameters.targetPages
            tier = extractV2Parameters.tier
            version = extractV2Parameters.version
            additionalProperties = extractV2Parameters.additionalProperties.toMutableMap()
        }

        /**
         * JSON Schema defining the fields to extract. Validate with the /schema/validate endpoint
         * first.
         */
        fun dataSchema(dataSchema: DataSchema) = dataSchema(JsonField.of(dataSchema))

        /**
         * Sets [Builder.dataSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSchema] with a well-typed [DataSchema] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataSchema(dataSchema: JsonField<DataSchema>) = apply { this.dataSchema = dataSchema }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("extract_v2")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productType(productType: JsonValue) = apply { this.productType = productType }

        /** Include citations in results */
        fun citeSources(citeSources: Boolean) = citeSources(JsonField.of(citeSources))

        /**
         * Sets [Builder.citeSources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citeSources] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun citeSources(citeSources: JsonField<Boolean>) = apply { this.citeSources = citeSources }

        /** Include confidence scores in results */
        fun confidenceScores(confidenceScores: Boolean) =
            confidenceScores(JsonField.of(confidenceScores))

        /**
         * Sets [Builder.confidenceScores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidenceScores] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun confidenceScores(confidenceScores: JsonField<Boolean>) = apply {
            this.confidenceScores = confidenceScores
        }

        /**
         * Granularity of extraction: per_doc returns one object per document, per_page returns one
         * object per page, per_table_row returns one object per table row
         */
        fun extractionTarget(extractionTarget: ExtractionTarget) =
            extractionTarget(JsonField.of(extractionTarget))

        /**
         * Sets [Builder.extractionTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extractionTarget] with a well-typed [ExtractionTarget]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun extractionTarget(extractionTarget: JsonField<ExtractionTarget>) = apply {
            this.extractionTarget = extractionTarget
        }

        /** Maximum number of pages to process. Omit for no limit. */
        fun maxPages(maxPages: Long?) = maxPages(JsonField.ofNullable(maxPages))

        /**
         * Alias for [Builder.maxPages].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxPages(maxPages: Long) = maxPages(maxPages as Long?)

        /** Alias for calling [Builder.maxPages] with `maxPages.orElse(null)`. */
        fun maxPages(maxPages: Optional<Long>) = maxPages(maxPages.getOrNull())

        /**
         * Sets [Builder.maxPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPages] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxPages(maxPages: JsonField<Long>) = apply { this.maxPages = maxPages }

        /** Saved parse configuration ID to control how the document is parsed before extraction */
        fun parseConfigId(parseConfigId: String?) =
            parseConfigId(JsonField.ofNullable(parseConfigId))

        /** Alias for calling [Builder.parseConfigId] with `parseConfigId.orElse(null)`. */
        fun parseConfigId(parseConfigId: Optional<String>) =
            parseConfigId(parseConfigId.getOrNull())

        /**
         * Sets [Builder.parseConfigId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parseConfigId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parseConfigId(parseConfigId: JsonField<String>) = apply {
            this.parseConfigId = parseConfigId
        }

        /** Parse tier to use before extraction. Defaults to the extract tier if not specified. */
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

        /** Custom system prompt to guide extraction behavior */
        fun systemPrompt(systemPrompt: String?) = systemPrompt(JsonField.ofNullable(systemPrompt))

        /** Alias for calling [Builder.systemPrompt] with `systemPrompt.orElse(null)`. */
        fun systemPrompt(systemPrompt: Optional<String>) = systemPrompt(systemPrompt.getOrNull())

        /**
         * Sets [Builder.systemPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun systemPrompt(systemPrompt: JsonField<String>) = apply {
            this.systemPrompt = systemPrompt
        }

        /**
         * Comma-separated page numbers or ranges to process (1-based). Omit to process all pages.
         */
        fun targetPages(targetPages: String?) = targetPages(JsonField.ofNullable(targetPages))

        /** Alias for calling [Builder.targetPages] with `targetPages.orElse(null)`. */
        fun targetPages(targetPages: Optional<String>) = targetPages(targetPages.getOrNull())

        /**
         * Sets [Builder.targetPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetPages] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetPages(targetPages: JsonField<String>) = apply { this.targetPages = targetPages }

        /**
         * Extract tier: cost_effective (5 credits/page), agentic (15 credits/page), or agentic_plus
         * (50 credits/page)
         */
        fun tier(tier: Tier) = tier(JsonField.of(tier))

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [Tier] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tier(tier: JsonField<Tier>) = apply { this.tier = tier }

        /**
         * Use 'latest' for the latest release for the selected tier or a date string (YYYY-MM-DD
         * format) to pin to the nearest release at or before that date. Job responses always report
         * the concrete resolved version the job runs, fixed at job creation; saved configurations
         * keep the value as provided.
         */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

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
         * Returns an immutable instance of [ExtractV2Parameters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dataSchema()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExtractV2Parameters =
            ExtractV2Parameters(
                checkRequired("dataSchema", dataSchema),
                productType,
                citeSources,
                confidenceScores,
                extractionTarget,
                maxPages,
                parseConfigId,
                parseTier,
                systemPrompt,
                targetPages,
                tier,
                version,
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
    fun validate(): ExtractV2Parameters = apply {
        if (validated) {
            return@apply
        }

        dataSchema().validate()
        _productType().let {
            if (it != JsonValue.from("extract_v2")) {
                throw LlamaCloudInvalidDataException("'productType' is invalid, received $it")
            }
        }
        citeSources()
        confidenceScores()
        extractionTarget().ifPresent { it.validate() }
        maxPages()
        parseConfigId()
        parseTier()
        systemPrompt()
        targetPages()
        tier().ifPresent { it.validate() }
        version()
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
        (dataSchema.asKnown().getOrNull()?.validity() ?: 0) +
            productType.let { if (it == JsonValue.from("extract_v2")) 1 else 0 } +
            (if (citeSources.asKnown().isPresent) 1 else 0) +
            (if (confidenceScores.asKnown().isPresent) 1 else 0) +
            (extractionTarget.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maxPages.asKnown().isPresent) 1 else 0) +
            (if (parseConfigId.asKnown().isPresent) 1 else 0) +
            (if (parseTier.asKnown().isPresent) 1 else 0) +
            (if (systemPrompt.asKnown().isPresent) 1 else 0) +
            (if (targetPages.asKnown().isPresent) 1 else 0) +
            (tier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /**
     * JSON Schema defining the fields to extract. Validate with the /schema/validate endpoint
     * first.
     */
    class DataSchema
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

            /** Returns a mutable builder for constructing an instance of [DataSchema]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DataSchema]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataSchema: DataSchema) = apply {
                additionalProperties = dataSchema.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DataSchema].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DataSchema = DataSchema(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): DataSchema = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is DataSchema && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DataSchema{additionalProperties=$additionalProperties}"
    }

    /**
     * Granularity of extraction: per_doc returns one object per document, per_page returns one
     * object per page, per_table_row returns one object per table row
     */
    class ExtractionTarget @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PER_DOC = of("per_doc")

            @JvmField val PER_PAGE = of("per_page")

            @JvmField val PER_TABLE_ROW = of("per_table_row")

            @JvmStatic fun of(value: String) = ExtractionTarget(JsonField.of(value))
        }

        /** An enum containing [ExtractionTarget]'s known values. */
        enum class Known {
            PER_DOC,
            PER_PAGE,
            PER_TABLE_ROW,
        }

        /**
         * An enum containing [ExtractionTarget]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ExtractionTarget] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PER_DOC,
            PER_PAGE,
            PER_TABLE_ROW,
            /**
             * An enum member indicating that [ExtractionTarget] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PER_DOC -> Value.PER_DOC
                PER_PAGE -> Value.PER_PAGE
                PER_TABLE_ROW -> Value.PER_TABLE_ROW
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PER_DOC -> Known.PER_DOC
                PER_PAGE -> Known.PER_PAGE
                PER_TABLE_ROW -> Known.PER_TABLE_ROW
                else -> throw LlamaCloudInvalidDataException("Unknown ExtractionTarget: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LlamaCloudInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ExtractionTarget = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExtractionTarget && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Extract tier: cost_effective (5 credits/page), agentic (15 credits/page), or agentic_plus (50
     * credits/page)
     */
    class Tier @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AGENTIC = of("agentic")

            @JvmField val AGENTIC_PLUS = of("agentic_plus")

            @JvmField val COST_EFFECTIVE = of("cost_effective")

            @JvmStatic fun of(value: String) = Tier(JsonField.of(value))
        }

        /** An enum containing [Tier]'s known values. */
        enum class Known {
            AGENTIC,
            AGENTIC_PLUS,
            COST_EFFECTIVE,
        }

        /**
         * An enum containing [Tier]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Tier] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AGENTIC,
            AGENTIC_PLUS,
            COST_EFFECTIVE,
            /** An enum member indicating that [Tier] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AGENTIC -> Value.AGENTIC
                AGENTIC_PLUS -> Value.AGENTIC_PLUS
                COST_EFFECTIVE -> Value.COST_EFFECTIVE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AGENTIC -> Known.AGENTIC
                AGENTIC_PLUS -> Known.AGENTIC_PLUS
                COST_EFFECTIVE -> Known.COST_EFFECTIVE
                else -> throw LlamaCloudInvalidDataException("Unknown Tier: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LlamaCloudInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Tier = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractV2Parameters &&
            dataSchema == other.dataSchema &&
            productType == other.productType &&
            citeSources == other.citeSources &&
            confidenceScores == other.confidenceScores &&
            extractionTarget == other.extractionTarget &&
            maxPages == other.maxPages &&
            parseConfigId == other.parseConfigId &&
            parseTier == other.parseTier &&
            systemPrompt == other.systemPrompt &&
            targetPages == other.targetPages &&
            tier == other.tier &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dataSchema,
            productType,
            citeSources,
            confidenceScores,
            extractionTarget,
            maxPages,
            parseConfigId,
            parseTier,
            systemPrompt,
            targetPages,
            tier,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractV2Parameters{dataSchema=$dataSchema, productType=$productType, citeSources=$citeSources, confidenceScores=$confidenceScores, extractionTarget=$extractionTarget, maxPages=$maxPages, parseConfigId=$parseConfigId, parseTier=$parseTier, systemPrompt=$systemPrompt, targetPages=$targetPages, tier=$tier, version=$version, additionalProperties=$additionalProperties}"
}
