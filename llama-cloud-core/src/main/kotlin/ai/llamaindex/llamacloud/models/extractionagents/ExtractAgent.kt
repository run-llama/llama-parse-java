// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extractionagents

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema and configuration for an extraction agent. */
class ExtractAgent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val config: JsonField<Config>,
    private val dataSchema: JsonField<DataSchema>,
    private val name: JsonField<String>,
    private val projectId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customConfiguration: JsonField<CustomConfiguration>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
        @JsonProperty("data_schema")
        @ExcludeMissing
        dataSchema: JsonField<DataSchema> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_configuration")
        @ExcludeMissing
        customConfiguration: JsonField<CustomConfiguration> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        config,
        dataSchema,
        name,
        projectId,
        createdAt,
        customConfiguration,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * The id of the extraction agent.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The configuration parameters for the extraction agent.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun config(): Config = config.getRequired("config")

    /**
     * The schema of the data.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataSchema(): DataSchema = dataSchema.getRequired("data_schema")

    /**
     * The name of the extraction agent.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The ID of the project that the extraction agent belongs to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * The creation time of the extraction agent.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Custom configuration type for the extraction agent. Currently supports 'default'.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customConfiguration(): Optional<CustomConfiguration> =
        customConfiguration.getOptional("custom_configuration")

    /**
     * The last update time of the extraction agent.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

    /**
     * Returns the raw JSON value of [dataSchema].
     *
     * Unlike [dataSchema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_schema")
    @ExcludeMissing
    fun _dataSchema(): JsonField<DataSchema> = dataSchema

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customConfiguration].
     *
     * Unlike [customConfiguration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("custom_configuration")
    @ExcludeMissing
    fun _customConfiguration(): JsonField<CustomConfiguration> = customConfiguration

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [ExtractAgent].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .config()
         * .dataSchema()
         * .name()
         * .projectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractAgent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var config: JsonField<Config>? = null
        private var dataSchema: JsonField<DataSchema>? = null
        private var name: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customConfiguration: JsonField<CustomConfiguration> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractAgent: ExtractAgent) = apply {
            id = extractAgent.id
            config = extractAgent.config
            dataSchema = extractAgent.dataSchema
            name = extractAgent.name
            projectId = extractAgent.projectId
            createdAt = extractAgent.createdAt
            customConfiguration = extractAgent.customConfiguration
            updatedAt = extractAgent.updatedAt
            additionalProperties = extractAgent.additionalProperties.toMutableMap()
        }

        /** The id of the extraction agent. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The configuration parameters for the extraction agent. */
        fun config(config: Config) = config(JsonField.of(config))

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { this.config = config }

        /** The schema of the data. */
        fun dataSchema(dataSchema: DataSchema) = dataSchema(JsonField.of(dataSchema))

        /**
         * Sets [Builder.dataSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSchema] with a well-typed [DataSchema] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataSchema(dataSchema: JsonField<DataSchema>) = apply { this.dataSchema = dataSchema }

        /** The name of the extraction agent. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The ID of the project that the extraction agent belongs to. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** The creation time of the extraction agent. */
        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Custom configuration type for the extraction agent. Currently supports 'default'. */
        fun customConfiguration(customConfiguration: CustomConfiguration?) =
            customConfiguration(JsonField.ofNullable(customConfiguration))

        /**
         * Alias for calling [Builder.customConfiguration] with `customConfiguration.orElse(null)`.
         */
        fun customConfiguration(customConfiguration: Optional<CustomConfiguration>) =
            customConfiguration(customConfiguration.getOrNull())

        /**
         * Sets [Builder.customConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customConfiguration] with a well-typed
         * [CustomConfiguration] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun customConfiguration(customConfiguration: JsonField<CustomConfiguration>) = apply {
            this.customConfiguration = customConfiguration
        }

        /** The last update time of the extraction agent. */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [ExtractAgent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .config()
         * .dataSchema()
         * .name()
         * .projectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExtractAgent =
            ExtractAgent(
                checkRequired("id", id),
                checkRequired("config", config),
                checkRequired("dataSchema", dataSchema),
                checkRequired("name", name),
                checkRequired("projectId", projectId),
                createdAt,
                customConfiguration,
                updatedAt,
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
    fun validate(): ExtractAgent = apply {
        if (validated) {
            return@apply
        }

        id()
        config().validate()
        dataSchema().validate()
        name()
        projectId()
        createdAt()
        customConfiguration().ifPresent { it.validate() }
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (config.asKnown().getOrNull()?.validity() ?: 0) +
            (dataSchema.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (customConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** The configuration parameters for the extraction agent. */
    class Config
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val chunkMode: JsonField<ChunkMode>,
        private val citationBbox: JsonField<Boolean>,
        private val citeSources: JsonField<Boolean>,
        private val confidenceScores: JsonField<Boolean>,
        private val extractModel: JsonField<ExtractModel>,
        private val extractionMode: JsonField<ExtractionMode>,
        private val extractionTarget: JsonField<ExtractionTarget>,
        private val highResolutionMode: JsonField<Boolean>,
        private val invalidateCache: JsonField<Boolean>,
        private val multimodalFastMode: JsonField<Boolean>,
        private val numPagesContext: JsonField<Long>,
        private val pageRange: JsonField<String>,
        private val parseModel: JsonField<ParseModel>,
        private val priority: JsonField<Priority>,
        private val systemPrompt: JsonField<String>,
        private val useReasoning: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("chunk_mode")
            @ExcludeMissing
            chunkMode: JsonField<ChunkMode> = JsonMissing.of(),
            @JsonProperty("citation_bbox")
            @ExcludeMissing
            citationBbox: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("cite_sources")
            @ExcludeMissing
            citeSources: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("confidence_scores")
            @ExcludeMissing
            confidenceScores: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("extract_model")
            @ExcludeMissing
            extractModel: JsonField<ExtractModel> = JsonMissing.of(),
            @JsonProperty("extraction_mode")
            @ExcludeMissing
            extractionMode: JsonField<ExtractionMode> = JsonMissing.of(),
            @JsonProperty("extraction_target")
            @ExcludeMissing
            extractionTarget: JsonField<ExtractionTarget> = JsonMissing.of(),
            @JsonProperty("high_resolution_mode")
            @ExcludeMissing
            highResolutionMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("invalidate_cache")
            @ExcludeMissing
            invalidateCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("multimodal_fast_mode")
            @ExcludeMissing
            multimodalFastMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("num_pages_context")
            @ExcludeMissing
            numPagesContext: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_range")
            @ExcludeMissing
            pageRange: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parse_model")
            @ExcludeMissing
            parseModel: JsonField<ParseModel> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Priority> = JsonMissing.of(),
            @JsonProperty("system_prompt")
            @ExcludeMissing
            systemPrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("use_reasoning")
            @ExcludeMissing
            useReasoning: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            chunkMode,
            citationBbox,
            citeSources,
            confidenceScores,
            extractModel,
            extractionMode,
            extractionTarget,
            highResolutionMode,
            invalidateCache,
            multimodalFastMode,
            numPagesContext,
            pageRange,
            parseModel,
            priority,
            systemPrompt,
            useReasoning,
            mutableMapOf(),
        )

        /**
         * The mode to use for chunking the document.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun chunkMode(): Optional<ChunkMode> = chunkMode.getOptional("chunk_mode")

        /**
         * Whether to fetch citation bounding boxes for the extraction. Only available in PREMIUM
         * mode. Deprecated: this is now synonymous with cite_sources.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun citationBbox(): Optional<Boolean> = citationBbox.getOptional("citation_bbox")

        /**
         * Whether to cite sources for the extraction.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun citeSources(): Optional<Boolean> = citeSources.getOptional("cite_sources")

        /**
         * Whether to fetch confidence scores for the extraction.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun confidenceScores(): Optional<Boolean> =
            confidenceScores.getOptional("confidence_scores")

        /**
         * The extract model to use for data extraction. If not provided, uses the default for the
         * extraction mode.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun extractModel(): Optional<ExtractModel> = extractModel.getOptional("extract_model")

        /**
         * The extraction mode specified (FAST, BALANCED, MULTIMODAL, PREMIUM).
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun extractionMode(): Optional<ExtractionMode> =
            extractionMode.getOptional("extraction_mode")

        /**
         * The extraction target specified.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun extractionTarget(): Optional<ExtractionTarget> =
            extractionTarget.getOptional("extraction_target")

        /**
         * Whether to use high resolution mode for the extraction.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun highResolutionMode(): Optional<Boolean> =
            highResolutionMode.getOptional("high_resolution_mode")

        /**
         * Whether to invalidate the cache for the extraction.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invalidateCache(): Optional<Boolean> = invalidateCache.getOptional("invalidate_cache")

        /**
         * DEPRECATED: Whether to use fast mode for multimodal extraction.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun multimodalFastMode(): Optional<Boolean> =
            multimodalFastMode.getOptional("multimodal_fast_mode")

        /**
         * Number of pages to pass as context on long document extraction.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun numPagesContext(): Optional<Long> = numPagesContext.getOptional("num_pages_context")

        /**
         * Comma-separated list of page numbers or ranges to extract from (1-based, e.g.,
         * '1,3,5-7,9' or '1-3,8-10').
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageRange(): Optional<String> = pageRange.getOptional("page_range")

        /**
         * Public model names.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parseModel(): Optional<ParseModel> = parseModel.getOptional("parse_model")

        /**
         * The priority for the request. This field may be ignored or overwritten depending on the
         * organization tier.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun priority(): Optional<Priority> = priority.getOptional("priority")

        /**
         * The system prompt to use for the extraction.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun systemPrompt(): Optional<String> = systemPrompt.getOptional("system_prompt")

        /**
         * Whether to use reasoning for the extraction.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun useReasoning(): Optional<Boolean> = useReasoning.getOptional("use_reasoning")

        /**
         * Returns the raw JSON value of [chunkMode].
         *
         * Unlike [chunkMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chunk_mode")
        @ExcludeMissing
        fun _chunkMode(): JsonField<ChunkMode> = chunkMode

        /**
         * Returns the raw JSON value of [citationBbox].
         *
         * Unlike [citationBbox], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("citation_bbox")
        @ExcludeMissing
        fun _citationBbox(): JsonField<Boolean> = citationBbox

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
         * Returns the raw JSON value of [extractModel].
         *
         * Unlike [extractModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extract_model")
        @ExcludeMissing
        fun _extractModel(): JsonField<ExtractModel> = extractModel

        /**
         * Returns the raw JSON value of [extractionMode].
         *
         * Unlike [extractionMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extraction_mode")
        @ExcludeMissing
        fun _extractionMode(): JsonField<ExtractionMode> = extractionMode

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
         * Returns the raw JSON value of [highResolutionMode].
         *
         * Unlike [highResolutionMode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("high_resolution_mode")
        @ExcludeMissing
        fun _highResolutionMode(): JsonField<Boolean> = highResolutionMode

        /**
         * Returns the raw JSON value of [invalidateCache].
         *
         * Unlike [invalidateCache], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invalidate_cache")
        @ExcludeMissing
        fun _invalidateCache(): JsonField<Boolean> = invalidateCache

        /**
         * Returns the raw JSON value of [multimodalFastMode].
         *
         * Unlike [multimodalFastMode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("multimodal_fast_mode")
        @ExcludeMissing
        fun _multimodalFastMode(): JsonField<Boolean> = multimodalFastMode

        /**
         * Returns the raw JSON value of [numPagesContext].
         *
         * Unlike [numPagesContext], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("num_pages_context")
        @ExcludeMissing
        fun _numPagesContext(): JsonField<Long> = numPagesContext

        /**
         * Returns the raw JSON value of [pageRange].
         *
         * Unlike [pageRange], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_range") @ExcludeMissing fun _pageRange(): JsonField<String> = pageRange

        /**
         * Returns the raw JSON value of [parseModel].
         *
         * Unlike [parseModel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parse_model")
        @ExcludeMissing
        fun _parseModel(): JsonField<ParseModel> = parseModel

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Priority> = priority

        /**
         * Returns the raw JSON value of [systemPrompt].
         *
         * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("system_prompt")
        @ExcludeMissing
        fun _systemPrompt(): JsonField<String> = systemPrompt

        /**
         * Returns the raw JSON value of [useReasoning].
         *
         * Unlike [useReasoning], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("use_reasoning")
        @ExcludeMissing
        fun _useReasoning(): JsonField<Boolean> = useReasoning

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

            /** Returns a mutable builder for constructing an instance of [Config]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Config]. */
        class Builder internal constructor() {

            private var chunkMode: JsonField<ChunkMode> = JsonMissing.of()
            private var citationBbox: JsonField<Boolean> = JsonMissing.of()
            private var citeSources: JsonField<Boolean> = JsonMissing.of()
            private var confidenceScores: JsonField<Boolean> = JsonMissing.of()
            private var extractModel: JsonField<ExtractModel> = JsonMissing.of()
            private var extractionMode: JsonField<ExtractionMode> = JsonMissing.of()
            private var extractionTarget: JsonField<ExtractionTarget> = JsonMissing.of()
            private var highResolutionMode: JsonField<Boolean> = JsonMissing.of()
            private var invalidateCache: JsonField<Boolean> = JsonMissing.of()
            private var multimodalFastMode: JsonField<Boolean> = JsonMissing.of()
            private var numPagesContext: JsonField<Long> = JsonMissing.of()
            private var pageRange: JsonField<String> = JsonMissing.of()
            private var parseModel: JsonField<ParseModel> = JsonMissing.of()
            private var priority: JsonField<Priority> = JsonMissing.of()
            private var systemPrompt: JsonField<String> = JsonMissing.of()
            private var useReasoning: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                chunkMode = config.chunkMode
                citationBbox = config.citationBbox
                citeSources = config.citeSources
                confidenceScores = config.confidenceScores
                extractModel = config.extractModel
                extractionMode = config.extractionMode
                extractionTarget = config.extractionTarget
                highResolutionMode = config.highResolutionMode
                invalidateCache = config.invalidateCache
                multimodalFastMode = config.multimodalFastMode
                numPagesContext = config.numPagesContext
                pageRange = config.pageRange
                parseModel = config.parseModel
                priority = config.priority
                systemPrompt = config.systemPrompt
                useReasoning = config.useReasoning
                additionalProperties = config.additionalProperties.toMutableMap()
            }

            /** The mode to use for chunking the document. */
            fun chunkMode(chunkMode: ChunkMode) = chunkMode(JsonField.of(chunkMode))

            /**
             * Sets [Builder.chunkMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chunkMode] with a well-typed [ChunkMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chunkMode(chunkMode: JsonField<ChunkMode>) = apply { this.chunkMode = chunkMode }

            /**
             * Whether to fetch citation bounding boxes for the extraction. Only available in
             * PREMIUM mode. Deprecated: this is now synonymous with cite_sources.
             */
            @Deprecated("deprecated")
            fun citationBbox(citationBbox: Boolean) = citationBbox(JsonField.of(citationBbox))

            /**
             * Sets [Builder.citationBbox] to an arbitrary JSON value.
             *
             * You should usually call [Builder.citationBbox] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun citationBbox(citationBbox: JsonField<Boolean>) = apply {
                this.citationBbox = citationBbox
            }

            /** Whether to cite sources for the extraction. */
            fun citeSources(citeSources: Boolean) = citeSources(JsonField.of(citeSources))

            /**
             * Sets [Builder.citeSources] to an arbitrary JSON value.
             *
             * You should usually call [Builder.citeSources] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun citeSources(citeSources: JsonField<Boolean>) = apply {
                this.citeSources = citeSources
            }

            /** Whether to fetch confidence scores for the extraction. */
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
             * The extract model to use for data extraction. If not provided, uses the default for
             * the extraction mode.
             */
            fun extractModel(extractModel: ExtractModel?) =
                extractModel(JsonField.ofNullable(extractModel))

            /** Alias for calling [Builder.extractModel] with `extractModel.orElse(null)`. */
            fun extractModel(extractModel: Optional<ExtractModel>) =
                extractModel(extractModel.getOrNull())

            /**
             * Sets [Builder.extractModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extractModel] with a well-typed [ExtractModel] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extractModel(extractModel: JsonField<ExtractModel>) = apply {
                this.extractModel = extractModel
            }

            /**
             * Sets [extractModel] to an arbitrary [String].
             *
             * You should usually call [extractModel] with a well-typed [ExtractModel] constant
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extractModel(value: String) = extractModel(ExtractModel.of(value))

            /** The extraction mode specified (FAST, BALANCED, MULTIMODAL, PREMIUM). */
            fun extractionMode(extractionMode: ExtractionMode) =
                extractionMode(JsonField.of(extractionMode))

            /**
             * Sets [Builder.extractionMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extractionMode] with a well-typed [ExtractionMode]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun extractionMode(extractionMode: JsonField<ExtractionMode>) = apply {
                this.extractionMode = extractionMode
            }

            /** The extraction target specified. */
            fun extractionTarget(extractionTarget: ExtractionTarget) =
                extractionTarget(JsonField.of(extractionTarget))

            /**
             * Sets [Builder.extractionTarget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extractionTarget] with a well-typed
             * [ExtractionTarget] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun extractionTarget(extractionTarget: JsonField<ExtractionTarget>) = apply {
                this.extractionTarget = extractionTarget
            }

            /** Whether to use high resolution mode for the extraction. */
            fun highResolutionMode(highResolutionMode: Boolean) =
                highResolutionMode(JsonField.of(highResolutionMode))

            /**
             * Sets [Builder.highResolutionMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.highResolutionMode] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun highResolutionMode(highResolutionMode: JsonField<Boolean>) = apply {
                this.highResolutionMode = highResolutionMode
            }

            /** Whether to invalidate the cache for the extraction. */
            fun invalidateCache(invalidateCache: Boolean) =
                invalidateCache(JsonField.of(invalidateCache))

            /**
             * Sets [Builder.invalidateCache] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invalidateCache] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invalidateCache(invalidateCache: JsonField<Boolean>) = apply {
                this.invalidateCache = invalidateCache
            }

            /** DEPRECATED: Whether to use fast mode for multimodal extraction. */
            fun multimodalFastMode(multimodalFastMode: Boolean) =
                multimodalFastMode(JsonField.of(multimodalFastMode))

            /**
             * Sets [Builder.multimodalFastMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.multimodalFastMode] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun multimodalFastMode(multimodalFastMode: JsonField<Boolean>) = apply {
                this.multimodalFastMode = multimodalFastMode
            }

            /** Number of pages to pass as context on long document extraction. */
            fun numPagesContext(numPagesContext: Long?) =
                numPagesContext(JsonField.ofNullable(numPagesContext))

            /**
             * Alias for [Builder.numPagesContext].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numPagesContext(numPagesContext: Long) = numPagesContext(numPagesContext as Long?)

            /** Alias for calling [Builder.numPagesContext] with `numPagesContext.orElse(null)`. */
            fun numPagesContext(numPagesContext: Optional<Long>) =
                numPagesContext(numPagesContext.getOrNull())

            /**
             * Sets [Builder.numPagesContext] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numPagesContext] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numPagesContext(numPagesContext: JsonField<Long>) = apply {
                this.numPagesContext = numPagesContext
            }

            /**
             * Comma-separated list of page numbers or ranges to extract from (1-based, e.g.,
             * '1,3,5-7,9' or '1-3,8-10').
             */
            fun pageRange(pageRange: String?) = pageRange(JsonField.ofNullable(pageRange))

            /** Alias for calling [Builder.pageRange] with `pageRange.orElse(null)`. */
            fun pageRange(pageRange: Optional<String>) = pageRange(pageRange.getOrNull())

            /**
             * Sets [Builder.pageRange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageRange] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageRange(pageRange: JsonField<String>) = apply { this.pageRange = pageRange }

            /** Public model names. */
            fun parseModel(parseModel: ParseModel?) = parseModel(JsonField.ofNullable(parseModel))

            /** Alias for calling [Builder.parseModel] with `parseModel.orElse(null)`. */
            fun parseModel(parseModel: Optional<ParseModel>) = parseModel(parseModel.getOrNull())

            /**
             * Sets [Builder.parseModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parseModel] with a well-typed [ParseModel] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parseModel(parseModel: JsonField<ParseModel>) = apply {
                this.parseModel = parseModel
            }

            /**
             * The priority for the request. This field may be ignored or overwritten depending on
             * the organization tier.
             */
            fun priority(priority: Priority?) = priority(JsonField.ofNullable(priority))

            /** Alias for calling [Builder.priority] with `priority.orElse(null)`. */
            fun priority(priority: Optional<Priority>) = priority(priority.getOrNull())

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Priority] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

            /** The system prompt to use for the extraction. */
            fun systemPrompt(systemPrompt: String?) =
                systemPrompt(JsonField.ofNullable(systemPrompt))

            /** Alias for calling [Builder.systemPrompt] with `systemPrompt.orElse(null)`. */
            fun systemPrompt(systemPrompt: Optional<String>) =
                systemPrompt(systemPrompt.getOrNull())

            /**
             * Sets [Builder.systemPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.systemPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun systemPrompt(systemPrompt: JsonField<String>) = apply {
                this.systemPrompt = systemPrompt
            }

            /** Whether to use reasoning for the extraction. */
            fun useReasoning(useReasoning: Boolean) = useReasoning(JsonField.of(useReasoning))

            /**
             * Sets [Builder.useReasoning] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useReasoning] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useReasoning(useReasoning: JsonField<Boolean>) = apply {
                this.useReasoning = useReasoning
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
             * Returns an immutable instance of [Config].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Config =
                Config(
                    chunkMode,
                    citationBbox,
                    citeSources,
                    confidenceScores,
                    extractModel,
                    extractionMode,
                    extractionTarget,
                    highResolutionMode,
                    invalidateCache,
                    multimodalFastMode,
                    numPagesContext,
                    pageRange,
                    parseModel,
                    priority,
                    systemPrompt,
                    useReasoning,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            chunkMode().ifPresent { it.validate() }
            citationBbox()
            citeSources()
            confidenceScores()
            extractModel()
            extractionMode().ifPresent { it.validate() }
            extractionTarget().ifPresent { it.validate() }
            highResolutionMode()
            invalidateCache()
            multimodalFastMode()
            numPagesContext()
            pageRange()
            parseModel().ifPresent { it.validate() }
            priority().ifPresent { it.validate() }
            systemPrompt()
            useReasoning()
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
            (chunkMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (citationBbox.asKnown().isPresent) 1 else 0) +
                (if (citeSources.asKnown().isPresent) 1 else 0) +
                (if (confidenceScores.asKnown().isPresent) 1 else 0) +
                (if (extractModel.asKnown().isPresent) 1 else 0) +
                (extractionMode.asKnown().getOrNull()?.validity() ?: 0) +
                (extractionTarget.asKnown().getOrNull()?.validity() ?: 0) +
                (if (highResolutionMode.asKnown().isPresent) 1 else 0) +
                (if (invalidateCache.asKnown().isPresent) 1 else 0) +
                (if (multimodalFastMode.asKnown().isPresent) 1 else 0) +
                (if (numPagesContext.asKnown().isPresent) 1 else 0) +
                (if (pageRange.asKnown().isPresent) 1 else 0) +
                (parseModel.asKnown().getOrNull()?.validity() ?: 0) +
                (priority.asKnown().getOrNull()?.validity() ?: 0) +
                (if (systemPrompt.asKnown().isPresent) 1 else 0) +
                (if (useReasoning.asKnown().isPresent) 1 else 0)

        /** The mode to use for chunking the document. */
        class ChunkMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PAGE = of("PAGE")

                @JvmField val SECTION = of("SECTION")

                @JvmStatic fun of(value: String) = ChunkMode(JsonField.of(value))
            }

            /** An enum containing [ChunkMode]'s known values. */
            enum class Known {
                PAGE,
                SECTION,
            }

            /**
             * An enum containing [ChunkMode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ChunkMode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PAGE,
                SECTION,
                /**
                 * An enum member indicating that [ChunkMode] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PAGE -> Value.PAGE
                    SECTION -> Value.SECTION
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    PAGE -> Known.PAGE
                    SECTION -> Known.SECTION
                    else -> throw LlamaCloudInvalidDataException("Unknown ChunkMode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ChunkMode = apply {
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

                return other is ChunkMode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Extract model options. */
        class ExtractModel @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val GEMINI_2_0_FLASH = of("gemini-2.0-flash")

                @JvmField val GEMINI_2_5_FLASH = of("gemini-2.5-flash")

                @JvmField val GEMINI_2_5_FLASH_LITE = of("gemini-2.5-flash-lite")

                @JvmField val GEMINI_2_5_PRO = of("gemini-2.5-pro")

                @JvmField val OPENAI_GPT_4_1 = of("openai-gpt-4-1")

                @JvmField val OPENAI_GPT_4_1_MINI = of("openai-gpt-4-1-mini")

                @JvmField val OPENAI_GPT_4_1_NANO = of("openai-gpt-4-1-nano")

                @JvmField val OPENAI_GPT_4O = of("openai-gpt-4o")

                @JvmField val OPENAI_GPT_4O_MINI = of("openai-gpt-4o-mini")

                @JvmField val OPENAI_GPT_5 = of("openai-gpt-5")

                @JvmField val OPENAI_GPT_5_MINI = of("openai-gpt-5-mini")

                @JvmStatic fun of(value: String) = ExtractModel(JsonField.of(value))
            }

            /** An enum containing [ExtractModel]'s known values. */
            enum class Known {
                GEMINI_2_0_FLASH,
                GEMINI_2_5_FLASH,
                GEMINI_2_5_FLASH_LITE,
                GEMINI_2_5_PRO,
                OPENAI_GPT_4_1,
                OPENAI_GPT_4_1_MINI,
                OPENAI_GPT_4_1_NANO,
                OPENAI_GPT_4O,
                OPENAI_GPT_4O_MINI,
                OPENAI_GPT_5,
                OPENAI_GPT_5_MINI,
            }

            /**
             * An enum containing [ExtractModel]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ExtractModel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GEMINI_2_0_FLASH,
                GEMINI_2_5_FLASH,
                GEMINI_2_5_FLASH_LITE,
                GEMINI_2_5_PRO,
                OPENAI_GPT_4_1,
                OPENAI_GPT_4_1_MINI,
                OPENAI_GPT_4_1_NANO,
                OPENAI_GPT_4O,
                OPENAI_GPT_4O_MINI,
                OPENAI_GPT_5,
                OPENAI_GPT_5_MINI,
                /**
                 * An enum member indicating that [ExtractModel] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    GEMINI_2_0_FLASH -> Value.GEMINI_2_0_FLASH
                    GEMINI_2_5_FLASH -> Value.GEMINI_2_5_FLASH
                    GEMINI_2_5_FLASH_LITE -> Value.GEMINI_2_5_FLASH_LITE
                    GEMINI_2_5_PRO -> Value.GEMINI_2_5_PRO
                    OPENAI_GPT_4_1 -> Value.OPENAI_GPT_4_1
                    OPENAI_GPT_4_1_MINI -> Value.OPENAI_GPT_4_1_MINI
                    OPENAI_GPT_4_1_NANO -> Value.OPENAI_GPT_4_1_NANO
                    OPENAI_GPT_4O -> Value.OPENAI_GPT_4O
                    OPENAI_GPT_4O_MINI -> Value.OPENAI_GPT_4O_MINI
                    OPENAI_GPT_5 -> Value.OPENAI_GPT_5
                    OPENAI_GPT_5_MINI -> Value.OPENAI_GPT_5_MINI
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    GEMINI_2_0_FLASH -> Known.GEMINI_2_0_FLASH
                    GEMINI_2_5_FLASH -> Known.GEMINI_2_5_FLASH
                    GEMINI_2_5_FLASH_LITE -> Known.GEMINI_2_5_FLASH_LITE
                    GEMINI_2_5_PRO -> Known.GEMINI_2_5_PRO
                    OPENAI_GPT_4_1 -> Known.OPENAI_GPT_4_1
                    OPENAI_GPT_4_1_MINI -> Known.OPENAI_GPT_4_1_MINI
                    OPENAI_GPT_4_1_NANO -> Known.OPENAI_GPT_4_1_NANO
                    OPENAI_GPT_4O -> Known.OPENAI_GPT_4O
                    OPENAI_GPT_4O_MINI -> Known.OPENAI_GPT_4O_MINI
                    OPENAI_GPT_5 -> Known.OPENAI_GPT_5
                    OPENAI_GPT_5_MINI -> Known.OPENAI_GPT_5_MINI
                    else -> throw LlamaCloudInvalidDataException("Unknown ExtractModel: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ExtractModel = apply {
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

                return other is ExtractModel && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The extraction mode specified (FAST, BALANCED, MULTIMODAL, PREMIUM). */
        class ExtractionMode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BALANCED = of("BALANCED")

                @JvmField val FAST = of("FAST")

                @JvmField val MULTIMODAL = of("MULTIMODAL")

                @JvmField val PREMIUM = of("PREMIUM")

                @JvmStatic fun of(value: String) = ExtractionMode(JsonField.of(value))
            }

            /** An enum containing [ExtractionMode]'s known values. */
            enum class Known {
                BALANCED,
                FAST,
                MULTIMODAL,
                PREMIUM,
            }

            /**
             * An enum containing [ExtractionMode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ExtractionMode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BALANCED,
                FAST,
                MULTIMODAL,
                PREMIUM,
                /**
                 * An enum member indicating that [ExtractionMode] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BALANCED -> Value.BALANCED
                    FAST -> Value.FAST
                    MULTIMODAL -> Value.MULTIMODAL
                    PREMIUM -> Value.PREMIUM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    BALANCED -> Known.BALANCED
                    FAST -> Known.FAST
                    MULTIMODAL -> Known.MULTIMODAL
                    PREMIUM -> Known.PREMIUM
                    else -> throw LlamaCloudInvalidDataException("Unknown ExtractionMode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ExtractionMode = apply {
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

                return other is ExtractionMode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The extraction target specified. */
        class ExtractionTarget
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PER_DOC = of("PER_DOC")

                @JvmField val PER_PAGE = of("PER_PAGE")

                @JvmField val PER_TABLE_ROW = of("PER_TABLE_ROW")

                @JvmStatic fun of(value: String) = ExtractionTarget(JsonField.of(value))
            }

            /** An enum containing [ExtractionTarget]'s known values. */
            enum class Known {
                PER_DOC,
                PER_PAGE,
                PER_TABLE_ROW,
            }

            /**
             * An enum containing [ExtractionTarget]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ExtractionTarget] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PER_DOC,
                PER_PAGE,
                PER_TABLE_ROW,
                /**
                 * An enum member indicating that [ExtractionTarget] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        /** Public model names. */
        class ParseModel @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ANTHROPIC_HAIKU_3_5 = of("anthropic-haiku-3.5")

                @JvmField val ANTHROPIC_HAIKU_4_5 = of("anthropic-haiku-4.5")

                @JvmField val ANTHROPIC_SONNET_3_5 = of("anthropic-sonnet-3.5")

                @JvmField val ANTHROPIC_SONNET_3_5_V2 = of("anthropic-sonnet-3.5-v2")

                @JvmField val ANTHROPIC_SONNET_3_7 = of("anthropic-sonnet-3.7")

                @JvmField val ANTHROPIC_SONNET_4_0 = of("anthropic-sonnet-4.0")

                @JvmField val ANTHROPIC_SONNET_4_5 = of("anthropic-sonnet-4.5")

                @JvmField val GEMINI_2_0_FLASH = of("gemini-2.0-flash")

                @JvmField val GEMINI_2_0_FLASH_LITE = of("gemini-2.0-flash-lite")

                @JvmField val GEMINI_2_5_FLASH = of("gemini-2.5-flash")

                @JvmField val GEMINI_2_5_FLASH_LITE = of("gemini-2.5-flash-lite")

                @JvmField val GEMINI_2_5_PRO = of("gemini-2.5-pro")

                @JvmField val GEMINI_3_0_PRO = of("gemini-3.0-pro")

                @JvmField val GEMINI_3_1_PRO = of("gemini-3.1-pro")

                @JvmField val OPENAI_GPT_4_1 = of("openai-gpt-4-1")

                @JvmField val OPENAI_GPT_4_1_MINI = of("openai-gpt-4-1-mini")

                @JvmField val OPENAI_GPT_4_1_NANO = of("openai-gpt-4-1-nano")

                @JvmField val OPENAI_GPT_4O = of("openai-gpt-4o")

                @JvmField val OPENAI_GPT_4O_MINI = of("openai-gpt-4o-mini")

                @JvmField val OPENAI_GPT_5 = of("openai-gpt-5")

                @JvmField val OPENAI_GPT_5_MINI = of("openai-gpt-5-mini")

                @JvmField val OPENAI_GPT_5_NANO = of("openai-gpt-5-nano")

                @JvmField val OPENAI_TEXT_EMBEDDING_3_LARGE = of("openai-text-embedding-3-large")

                @JvmField val OPENAI_TEXT_EMBEDDING_3_SMALL = of("openai-text-embedding-3-small")

                @JvmField val OPENAI_WHISPER_1 = of("openai-whisper-1")

                @JvmStatic fun of(value: String) = ParseModel(JsonField.of(value))
            }

            /** An enum containing [ParseModel]'s known values. */
            enum class Known {
                ANTHROPIC_HAIKU_3_5,
                ANTHROPIC_HAIKU_4_5,
                ANTHROPIC_SONNET_3_5,
                ANTHROPIC_SONNET_3_5_V2,
                ANTHROPIC_SONNET_3_7,
                ANTHROPIC_SONNET_4_0,
                ANTHROPIC_SONNET_4_5,
                GEMINI_2_0_FLASH,
                GEMINI_2_0_FLASH_LITE,
                GEMINI_2_5_FLASH,
                GEMINI_2_5_FLASH_LITE,
                GEMINI_2_5_PRO,
                GEMINI_3_0_PRO,
                GEMINI_3_1_PRO,
                OPENAI_GPT_4_1,
                OPENAI_GPT_4_1_MINI,
                OPENAI_GPT_4_1_NANO,
                OPENAI_GPT_4O,
                OPENAI_GPT_4O_MINI,
                OPENAI_GPT_5,
                OPENAI_GPT_5_MINI,
                OPENAI_GPT_5_NANO,
                OPENAI_TEXT_EMBEDDING_3_LARGE,
                OPENAI_TEXT_EMBEDDING_3_SMALL,
                OPENAI_WHISPER_1,
            }

            /**
             * An enum containing [ParseModel]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ParseModel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ANTHROPIC_HAIKU_3_5,
                ANTHROPIC_HAIKU_4_5,
                ANTHROPIC_SONNET_3_5,
                ANTHROPIC_SONNET_3_5_V2,
                ANTHROPIC_SONNET_3_7,
                ANTHROPIC_SONNET_4_0,
                ANTHROPIC_SONNET_4_5,
                GEMINI_2_0_FLASH,
                GEMINI_2_0_FLASH_LITE,
                GEMINI_2_5_FLASH,
                GEMINI_2_5_FLASH_LITE,
                GEMINI_2_5_PRO,
                GEMINI_3_0_PRO,
                GEMINI_3_1_PRO,
                OPENAI_GPT_4_1,
                OPENAI_GPT_4_1_MINI,
                OPENAI_GPT_4_1_NANO,
                OPENAI_GPT_4O,
                OPENAI_GPT_4O_MINI,
                OPENAI_GPT_5,
                OPENAI_GPT_5_MINI,
                OPENAI_GPT_5_NANO,
                OPENAI_TEXT_EMBEDDING_3_LARGE,
                OPENAI_TEXT_EMBEDDING_3_SMALL,
                OPENAI_WHISPER_1,
                /**
                 * An enum member indicating that [ParseModel] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ANTHROPIC_HAIKU_3_5 -> Value.ANTHROPIC_HAIKU_3_5
                    ANTHROPIC_HAIKU_4_5 -> Value.ANTHROPIC_HAIKU_4_5
                    ANTHROPIC_SONNET_3_5 -> Value.ANTHROPIC_SONNET_3_5
                    ANTHROPIC_SONNET_3_5_V2 -> Value.ANTHROPIC_SONNET_3_5_V2
                    ANTHROPIC_SONNET_3_7 -> Value.ANTHROPIC_SONNET_3_7
                    ANTHROPIC_SONNET_4_0 -> Value.ANTHROPIC_SONNET_4_0
                    ANTHROPIC_SONNET_4_5 -> Value.ANTHROPIC_SONNET_4_5
                    GEMINI_2_0_FLASH -> Value.GEMINI_2_0_FLASH
                    GEMINI_2_0_FLASH_LITE -> Value.GEMINI_2_0_FLASH_LITE
                    GEMINI_2_5_FLASH -> Value.GEMINI_2_5_FLASH
                    GEMINI_2_5_FLASH_LITE -> Value.GEMINI_2_5_FLASH_LITE
                    GEMINI_2_5_PRO -> Value.GEMINI_2_5_PRO
                    GEMINI_3_0_PRO -> Value.GEMINI_3_0_PRO
                    GEMINI_3_1_PRO -> Value.GEMINI_3_1_PRO
                    OPENAI_GPT_4_1 -> Value.OPENAI_GPT_4_1
                    OPENAI_GPT_4_1_MINI -> Value.OPENAI_GPT_4_1_MINI
                    OPENAI_GPT_4_1_NANO -> Value.OPENAI_GPT_4_1_NANO
                    OPENAI_GPT_4O -> Value.OPENAI_GPT_4O
                    OPENAI_GPT_4O_MINI -> Value.OPENAI_GPT_4O_MINI
                    OPENAI_GPT_5 -> Value.OPENAI_GPT_5
                    OPENAI_GPT_5_MINI -> Value.OPENAI_GPT_5_MINI
                    OPENAI_GPT_5_NANO -> Value.OPENAI_GPT_5_NANO
                    OPENAI_TEXT_EMBEDDING_3_LARGE -> Value.OPENAI_TEXT_EMBEDDING_3_LARGE
                    OPENAI_TEXT_EMBEDDING_3_SMALL -> Value.OPENAI_TEXT_EMBEDDING_3_SMALL
                    OPENAI_WHISPER_1 -> Value.OPENAI_WHISPER_1
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ANTHROPIC_HAIKU_3_5 -> Known.ANTHROPIC_HAIKU_3_5
                    ANTHROPIC_HAIKU_4_5 -> Known.ANTHROPIC_HAIKU_4_5
                    ANTHROPIC_SONNET_3_5 -> Known.ANTHROPIC_SONNET_3_5
                    ANTHROPIC_SONNET_3_5_V2 -> Known.ANTHROPIC_SONNET_3_5_V2
                    ANTHROPIC_SONNET_3_7 -> Known.ANTHROPIC_SONNET_3_7
                    ANTHROPIC_SONNET_4_0 -> Known.ANTHROPIC_SONNET_4_0
                    ANTHROPIC_SONNET_4_5 -> Known.ANTHROPIC_SONNET_4_5
                    GEMINI_2_0_FLASH -> Known.GEMINI_2_0_FLASH
                    GEMINI_2_0_FLASH_LITE -> Known.GEMINI_2_0_FLASH_LITE
                    GEMINI_2_5_FLASH -> Known.GEMINI_2_5_FLASH
                    GEMINI_2_5_FLASH_LITE -> Known.GEMINI_2_5_FLASH_LITE
                    GEMINI_2_5_PRO -> Known.GEMINI_2_5_PRO
                    GEMINI_3_0_PRO -> Known.GEMINI_3_0_PRO
                    GEMINI_3_1_PRO -> Known.GEMINI_3_1_PRO
                    OPENAI_GPT_4_1 -> Known.OPENAI_GPT_4_1
                    OPENAI_GPT_4_1_MINI -> Known.OPENAI_GPT_4_1_MINI
                    OPENAI_GPT_4_1_NANO -> Known.OPENAI_GPT_4_1_NANO
                    OPENAI_GPT_4O -> Known.OPENAI_GPT_4O
                    OPENAI_GPT_4O_MINI -> Known.OPENAI_GPT_4O_MINI
                    OPENAI_GPT_5 -> Known.OPENAI_GPT_5
                    OPENAI_GPT_5_MINI -> Known.OPENAI_GPT_5_MINI
                    OPENAI_GPT_5_NANO -> Known.OPENAI_GPT_5_NANO
                    OPENAI_TEXT_EMBEDDING_3_LARGE -> Known.OPENAI_TEXT_EMBEDDING_3_LARGE
                    OPENAI_TEXT_EMBEDDING_3_SMALL -> Known.OPENAI_TEXT_EMBEDDING_3_SMALL
                    OPENAI_WHISPER_1 -> Known.OPENAI_WHISPER_1
                    else -> throw LlamaCloudInvalidDataException("Unknown ParseModel: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ParseModel = apply {
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

                return other is ParseModel && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The priority for the request. This field may be ignored or overwritten depending on the
         * organization tier.
         */
        class Priority @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CRITICAL = of("critical")

                @JvmField val HIGH = of("high")

                @JvmField val LOW = of("low")

                @JvmField val MEDIUM = of("medium")

                @JvmStatic fun of(value: String) = Priority(JsonField.of(value))
            }

            /** An enum containing [Priority]'s known values. */
            enum class Known {
                CRITICAL,
                HIGH,
                LOW,
                MEDIUM,
            }

            /**
             * An enum containing [Priority]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Priority] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CRITICAL,
                HIGH,
                LOW,
                MEDIUM,
                /**
                 * An enum member indicating that [Priority] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CRITICAL -> Value.CRITICAL
                    HIGH -> Value.HIGH
                    LOW -> Value.LOW
                    MEDIUM -> Value.MEDIUM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    CRITICAL -> Known.CRITICAL
                    HIGH -> Known.HIGH
                    LOW -> Known.LOW
                    MEDIUM -> Known.MEDIUM
                    else -> throw LlamaCloudInvalidDataException("Unknown Priority: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Priority = apply {
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

                return other is Priority && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Config &&
                chunkMode == other.chunkMode &&
                citationBbox == other.citationBbox &&
                citeSources == other.citeSources &&
                confidenceScores == other.confidenceScores &&
                extractModel == other.extractModel &&
                extractionMode == other.extractionMode &&
                extractionTarget == other.extractionTarget &&
                highResolutionMode == other.highResolutionMode &&
                invalidateCache == other.invalidateCache &&
                multimodalFastMode == other.multimodalFastMode &&
                numPagesContext == other.numPagesContext &&
                pageRange == other.pageRange &&
                parseModel == other.parseModel &&
                priority == other.priority &&
                systemPrompt == other.systemPrompt &&
                useReasoning == other.useReasoning &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                chunkMode,
                citationBbox,
                citeSources,
                confidenceScores,
                extractModel,
                extractionMode,
                extractionTarget,
                highResolutionMode,
                invalidateCache,
                multimodalFastMode,
                numPagesContext,
                pageRange,
                parseModel,
                priority,
                systemPrompt,
                useReasoning,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Config{chunkMode=$chunkMode, citationBbox=$citationBbox, citeSources=$citeSources, confidenceScores=$confidenceScores, extractModel=$extractModel, extractionMode=$extractionMode, extractionTarget=$extractionTarget, highResolutionMode=$highResolutionMode, invalidateCache=$invalidateCache, multimodalFastMode=$multimodalFastMode, numPagesContext=$numPagesContext, pageRange=$pageRange, parseModel=$parseModel, priority=$priority, systemPrompt=$systemPrompt, useReasoning=$useReasoning, additionalProperties=$additionalProperties}"
    }

    /** The schema of the data. */
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

    /** Custom configuration type for the extraction agent. Currently supports 'default'. */
    class CustomConfiguration
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEFAULT = of("default")

            @JvmStatic fun of(value: String) = CustomConfiguration(JsonField.of(value))
        }

        /** An enum containing [CustomConfiguration]'s known values. */
        enum class Known {
            DEFAULT
        }

        /**
         * An enum containing [CustomConfiguration]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CustomConfiguration] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEFAULT,
            /**
             * An enum member indicating that [CustomConfiguration] was instantiated with an unknown
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
                DEFAULT -> Value.DEFAULT
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
                DEFAULT -> Known.DEFAULT
                else -> throw LlamaCloudInvalidDataException("Unknown CustomConfiguration: $value")
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
        fun validate(): CustomConfiguration = apply {
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

            return other is CustomConfiguration && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractAgent &&
            id == other.id &&
            config == other.config &&
            dataSchema == other.dataSchema &&
            name == other.name &&
            projectId == other.projectId &&
            createdAt == other.createdAt &&
            customConfiguration == other.customConfiguration &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            config,
            dataSchema,
            name,
            projectId,
            createdAt,
            customConfiguration,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractAgent{id=$id, config=$config, dataSchema=$dataSchema, name=$name, projectId=$projectId, createdAt=$createdAt, customConfiguration=$customConfiguration, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
