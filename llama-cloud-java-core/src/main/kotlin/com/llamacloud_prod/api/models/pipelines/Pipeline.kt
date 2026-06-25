// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.BaseDeserializer
import com.llamacloud_prod.api.core.BaseSerializer
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.allMaxBy
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.getOrThrow
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import com.llamacloud_prod.api.models.datasinks.DataSink
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema for a pipeline. */
class Pipeline
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val embeddingConfig: JsonField<EmbeddingConfig>,
    private val name: JsonField<String>,
    private val projectId: JsonField<String>,
    private val configHash: JsonField<ConfigHash>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dataSink: JsonField<DataSink>,
    private val embeddingModelConfig: JsonField<EmbeddingModelConfig>,
    private val embeddingModelConfigId: JsonField<String>,
    private val llamaParseParameters: JsonField<LlamaParseParameters>,
    private val managedPipelineId: JsonField<String>,
    private val metadataConfig: JsonField<PipelineMetadataConfig>,
    private val pipelineType: JsonField<PipelineType>,
    private val presetRetrievalParameters: JsonField<PresetRetrievalParams>,
    private val sparseModelConfig: JsonField<SparseModelConfig>,
    private val status: JsonField<Status>,
    private val transformConfig: JsonField<TransformConfig>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embedding_config")
        @ExcludeMissing
        embeddingConfig: JsonField<EmbeddingConfig> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config_hash")
        @ExcludeMissing
        configHash: JsonField<ConfigHash> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("data_sink") @ExcludeMissing dataSink: JsonField<DataSink> = JsonMissing.of(),
        @JsonProperty("embedding_model_config")
        @ExcludeMissing
        embeddingModelConfig: JsonField<EmbeddingModelConfig> = JsonMissing.of(),
        @JsonProperty("embedding_model_config_id")
        @ExcludeMissing
        embeddingModelConfigId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("llama_parse_parameters")
        @ExcludeMissing
        llamaParseParameters: JsonField<LlamaParseParameters> = JsonMissing.of(),
        @JsonProperty("managed_pipeline_id")
        @ExcludeMissing
        managedPipelineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata_config")
        @ExcludeMissing
        metadataConfig: JsonField<PipelineMetadataConfig> = JsonMissing.of(),
        @JsonProperty("pipeline_type")
        @ExcludeMissing
        pipelineType: JsonField<PipelineType> = JsonMissing.of(),
        @JsonProperty("preset_retrieval_parameters")
        @ExcludeMissing
        presetRetrievalParameters: JsonField<PresetRetrievalParams> = JsonMissing.of(),
        @JsonProperty("sparse_model_config")
        @ExcludeMissing
        sparseModelConfig: JsonField<SparseModelConfig> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transform_config")
        @ExcludeMissing
        transformConfig: JsonField<TransformConfig> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        embeddingConfig,
        name,
        projectId,
        configHash,
        createdAt,
        dataSink,
        embeddingModelConfig,
        embeddingModelConfigId,
        llamaParseParameters,
        managedPipelineId,
        metadataConfig,
        pipelineType,
        presetRetrievalParameters,
        sparseModelConfig,
        status,
        transformConfig,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embeddingConfig(): EmbeddingConfig = embeddingConfig.getRequired("embedding_config")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * Hashes for the configuration of a pipeline.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configHash(): Optional<ConfigHash> = configHash.getOptional("config_hash")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Schema for a data sink.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSink(): Optional<DataSink> = dataSink.getOptional("data_sink")

    /**
     * Schema for an embedding model config.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embeddingModelConfig(): Optional<EmbeddingModelConfig> =
        embeddingModelConfig.getOptional("embedding_model_config")

    /**
     * The ID of the EmbeddingModelConfig this pipeline is using.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embeddingModelConfigId(): Optional<String> =
        embeddingModelConfigId.getOptional("embedding_model_config_id")

    /**
     * Settings that can be configured for how to use LlamaParse to parse files within a LlamaCloud
     * pipeline.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llamaParseParameters(): Optional<LlamaParseParameters> =
        llamaParseParameters.getOptional("llama_parse_parameters")

    /**
     * The ID of the ManagedPipeline this playground pipeline is linked to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedPipelineId(): Optional<String> = managedPipelineId.getOptional("managed_pipeline_id")

    /**
     * Metadata configuration for the pipeline.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadataConfig(): Optional<PipelineMetadataConfig> =
        metadataConfig.getOptional("metadata_config")

    /**
     * Type of pipeline. Either PLAYGROUND or MANAGED.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pipelineType(): Optional<PipelineType> = pipelineType.getOptional("pipeline_type")

    /**
     * Preset retrieval parameters for the pipeline.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presetRetrievalParameters(): Optional<PresetRetrievalParams> =
        presetRetrievalParameters.getOptional("preset_retrieval_parameters")

    /**
     * Configuration for sparse embedding models used in hybrid search.
     *
     * This allows users to choose between Splade and BM25 models for sparse retrieval in managed
     * data sinks.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sparseModelConfig(): Optional<SparseModelConfig> =
        sparseModelConfig.getOptional("sparse_model_config")

    /**
     * Status of the pipeline.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Configuration for the transformation.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transformConfig(): Optional<TransformConfig> =
        transformConfig.getOptional("transform_config")

    /**
     * Update datetime
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
     * Returns the raw JSON value of [embeddingConfig].
     *
     * Unlike [embeddingConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embedding_config")
    @ExcludeMissing
    fun _embeddingConfig(): JsonField<EmbeddingConfig> = embeddingConfig

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
     * Returns the raw JSON value of [configHash].
     *
     * Unlike [configHash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config_hash")
    @ExcludeMissing
    fun _configHash(): JsonField<ConfigHash> = configHash

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [dataSink].
     *
     * Unlike [dataSink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_sink") @ExcludeMissing fun _dataSink(): JsonField<DataSink> = dataSink

    /**
     * Returns the raw JSON value of [embeddingModelConfig].
     *
     * Unlike [embeddingModelConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("embedding_model_config")
    @ExcludeMissing
    fun _embeddingModelConfig(): JsonField<EmbeddingModelConfig> = embeddingModelConfig

    /**
     * Returns the raw JSON value of [embeddingModelConfigId].
     *
     * Unlike [embeddingModelConfigId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("embedding_model_config_id")
    @ExcludeMissing
    fun _embeddingModelConfigId(): JsonField<String> = embeddingModelConfigId

    /**
     * Returns the raw JSON value of [llamaParseParameters].
     *
     * Unlike [llamaParseParameters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("llama_parse_parameters")
    @ExcludeMissing
    fun _llamaParseParameters(): JsonField<LlamaParseParameters> = llamaParseParameters

    /**
     * Returns the raw JSON value of [managedPipelineId].
     *
     * Unlike [managedPipelineId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("managed_pipeline_id")
    @ExcludeMissing
    fun _managedPipelineId(): JsonField<String> = managedPipelineId

    /**
     * Returns the raw JSON value of [metadataConfig].
     *
     * Unlike [metadataConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata_config")
    @ExcludeMissing
    fun _metadataConfig(): JsonField<PipelineMetadataConfig> = metadataConfig

    /**
     * Returns the raw JSON value of [pipelineType].
     *
     * Unlike [pipelineType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pipeline_type")
    @ExcludeMissing
    fun _pipelineType(): JsonField<PipelineType> = pipelineType

    /**
     * Returns the raw JSON value of [presetRetrievalParameters].
     *
     * Unlike [presetRetrievalParameters], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("preset_retrieval_parameters")
    @ExcludeMissing
    fun _presetRetrievalParameters(): JsonField<PresetRetrievalParams> = presetRetrievalParameters

    /**
     * Returns the raw JSON value of [sparseModelConfig].
     *
     * Unlike [sparseModelConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sparse_model_config")
    @ExcludeMissing
    fun _sparseModelConfig(): JsonField<SparseModelConfig> = sparseModelConfig

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [transformConfig].
     *
     * Unlike [transformConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transform_config")
    @ExcludeMissing
    fun _transformConfig(): JsonField<TransformConfig> = transformConfig

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
         * Returns a mutable builder for constructing an instance of [Pipeline].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .embeddingConfig()
         * .name()
         * .projectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Pipeline]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var embeddingConfig: JsonField<EmbeddingConfig>? = null
        private var name: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var configHash: JsonField<ConfigHash> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dataSink: JsonField<DataSink> = JsonMissing.of()
        private var embeddingModelConfig: JsonField<EmbeddingModelConfig> = JsonMissing.of()
        private var embeddingModelConfigId: JsonField<String> = JsonMissing.of()
        private var llamaParseParameters: JsonField<LlamaParseParameters> = JsonMissing.of()
        private var managedPipelineId: JsonField<String> = JsonMissing.of()
        private var metadataConfig: JsonField<PipelineMetadataConfig> = JsonMissing.of()
        private var pipelineType: JsonField<PipelineType> = JsonMissing.of()
        private var presetRetrievalParameters: JsonField<PresetRetrievalParams> = JsonMissing.of()
        private var sparseModelConfig: JsonField<SparseModelConfig> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var transformConfig: JsonField<TransformConfig> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pipeline: Pipeline) = apply {
            id = pipeline.id
            embeddingConfig = pipeline.embeddingConfig
            name = pipeline.name
            projectId = pipeline.projectId
            configHash = pipeline.configHash
            createdAt = pipeline.createdAt
            dataSink = pipeline.dataSink
            embeddingModelConfig = pipeline.embeddingModelConfig
            embeddingModelConfigId = pipeline.embeddingModelConfigId
            llamaParseParameters = pipeline.llamaParseParameters
            managedPipelineId = pipeline.managedPipelineId
            metadataConfig = pipeline.metadataConfig
            pipelineType = pipeline.pipelineType
            presetRetrievalParameters = pipeline.presetRetrievalParameters
            sparseModelConfig = pipeline.sparseModelConfig
            status = pipeline.status
            transformConfig = pipeline.transformConfig
            updatedAt = pipeline.updatedAt
            additionalProperties = pipeline.additionalProperties.toMutableMap()
        }

        /** Unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun embeddingConfig(embeddingConfig: EmbeddingConfig) =
            embeddingConfig(JsonField.of(embeddingConfig))

        /**
         * Sets [Builder.embeddingConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingConfig] with a well-typed [EmbeddingConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun embeddingConfig(embeddingConfig: JsonField<EmbeddingConfig>) = apply {
            this.embeddingConfig = embeddingConfig
        }

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofAzureEmbedding(azureEmbedding)`.
         */
        fun embeddingConfig(azureEmbedding: AzureOpenAIEmbeddingConfig) =
            embeddingConfig(EmbeddingConfig.ofAzureEmbedding(azureEmbedding))

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofBedrockEmbedding(bedrockEmbedding)`.
         */
        fun embeddingConfig(bedrockEmbedding: BedrockEmbeddingConfig) =
            embeddingConfig(EmbeddingConfig.ofBedrockEmbedding(bedrockEmbedding))

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofCohereEmbedding(cohereEmbedding)`.
         */
        fun embeddingConfig(cohereEmbedding: CohereEmbeddingConfig) =
            embeddingConfig(EmbeddingConfig.ofCohereEmbedding(cohereEmbedding))

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofGeminiEmbedding(geminiEmbedding)`.
         */
        fun embeddingConfig(geminiEmbedding: GeminiEmbeddingConfig) =
            embeddingConfig(EmbeddingConfig.ofGeminiEmbedding(geminiEmbedding))

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofHuggingfaceApiEmbedding(huggingfaceApiEmbedding)`.
         */
        fun embeddingConfig(huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig) =
            embeddingConfig(EmbeddingConfig.ofHuggingfaceApiEmbedding(huggingfaceApiEmbedding))

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofManagedOpenAIEmbedding(managedOpenAIEmbedding)`.
         */
        fun embeddingConfig(managedOpenAIEmbedding: EmbeddingConfig.ManagedOpenAIEmbedding) =
            embeddingConfig(EmbeddingConfig.ofManagedOpenAIEmbedding(managedOpenAIEmbedding))

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofOpenAIEmbedding(openaiEmbedding)`.
         */
        fun embeddingConfig(openaiEmbedding: OpenAIEmbeddingConfig) =
            embeddingConfig(EmbeddingConfig.ofOpenAIEmbedding(openaiEmbedding))

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofVertexaiEmbedding(vertexaiEmbedding)`.
         */
        fun embeddingConfig(vertexaiEmbedding: VertexAiEmbeddingConfig) =
            embeddingConfig(EmbeddingConfig.ofVertexaiEmbedding(vertexaiEmbedding))

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Hashes for the configuration of a pipeline. */
        fun configHash(configHash: ConfigHash?) = configHash(JsonField.ofNullable(configHash))

        /** Alias for calling [Builder.configHash] with `configHash.orElse(null)`. */
        fun configHash(configHash: Optional<ConfigHash>) = configHash(configHash.getOrNull())

        /**
         * Sets [Builder.configHash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configHash] with a well-typed [ConfigHash] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configHash(configHash: JsonField<ConfigHash>) = apply { this.configHash = configHash }

        /** Creation datetime */
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

        /** Schema for a data sink. */
        fun dataSink(dataSink: DataSink?) = dataSink(JsonField.ofNullable(dataSink))

        /** Alias for calling [Builder.dataSink] with `dataSink.orElse(null)`. */
        fun dataSink(dataSink: Optional<DataSink>) = dataSink(dataSink.getOrNull())

        /**
         * Sets [Builder.dataSink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSink] with a well-typed [DataSink] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataSink(dataSink: JsonField<DataSink>) = apply { this.dataSink = dataSink }

        /** Schema for an embedding model config. */
        fun embeddingModelConfig(embeddingModelConfig: EmbeddingModelConfig?) =
            embeddingModelConfig(JsonField.ofNullable(embeddingModelConfig))

        /**
         * Alias for calling [Builder.embeddingModelConfig] with
         * `embeddingModelConfig.orElse(null)`.
         */
        fun embeddingModelConfig(embeddingModelConfig: Optional<EmbeddingModelConfig>) =
            embeddingModelConfig(embeddingModelConfig.getOrNull())

        /**
         * Sets [Builder.embeddingModelConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingModelConfig] with a well-typed
         * [EmbeddingModelConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun embeddingModelConfig(embeddingModelConfig: JsonField<EmbeddingModelConfig>) = apply {
            this.embeddingModelConfig = embeddingModelConfig
        }

        /** The ID of the EmbeddingModelConfig this pipeline is using. */
        fun embeddingModelConfigId(embeddingModelConfigId: String?) =
            embeddingModelConfigId(JsonField.ofNullable(embeddingModelConfigId))

        /**
         * Alias for calling [Builder.embeddingModelConfigId] with
         * `embeddingModelConfigId.orElse(null)`.
         */
        fun embeddingModelConfigId(embeddingModelConfigId: Optional<String>) =
            embeddingModelConfigId(embeddingModelConfigId.getOrNull())

        /**
         * Sets [Builder.embeddingModelConfigId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingModelConfigId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddingModelConfigId(embeddingModelConfigId: JsonField<String>) = apply {
            this.embeddingModelConfigId = embeddingModelConfigId
        }

        /**
         * Settings that can be configured for how to use LlamaParse to parse files within a
         * LlamaCloud pipeline.
         */
        fun llamaParseParameters(llamaParseParameters: LlamaParseParameters?) =
            llamaParseParameters(JsonField.ofNullable(llamaParseParameters))

        /**
         * Alias for calling [Builder.llamaParseParameters] with
         * `llamaParseParameters.orElse(null)`.
         */
        fun llamaParseParameters(llamaParseParameters: Optional<LlamaParseParameters>) =
            llamaParseParameters(llamaParseParameters.getOrNull())

        /**
         * Sets [Builder.llamaParseParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llamaParseParameters] with a well-typed
         * [LlamaParseParameters] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun llamaParseParameters(llamaParseParameters: JsonField<LlamaParseParameters>) = apply {
            this.llamaParseParameters = llamaParseParameters
        }

        /** The ID of the ManagedPipeline this playground pipeline is linked to. */
        fun managedPipelineId(managedPipelineId: String?) =
            managedPipelineId(JsonField.ofNullable(managedPipelineId))

        /** Alias for calling [Builder.managedPipelineId] with `managedPipelineId.orElse(null)`. */
        fun managedPipelineId(managedPipelineId: Optional<String>) =
            managedPipelineId(managedPipelineId.getOrNull())

        /**
         * Sets [Builder.managedPipelineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managedPipelineId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun managedPipelineId(managedPipelineId: JsonField<String>) = apply {
            this.managedPipelineId = managedPipelineId
        }

        /** Metadata configuration for the pipeline. */
        fun metadataConfig(metadataConfig: PipelineMetadataConfig?) =
            metadataConfig(JsonField.ofNullable(metadataConfig))

        /** Alias for calling [Builder.metadataConfig] with `metadataConfig.orElse(null)`. */
        fun metadataConfig(metadataConfig: Optional<PipelineMetadataConfig>) =
            metadataConfig(metadataConfig.getOrNull())

        /**
         * Sets [Builder.metadataConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataConfig] with a well-typed
         * [PipelineMetadataConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun metadataConfig(metadataConfig: JsonField<PipelineMetadataConfig>) = apply {
            this.metadataConfig = metadataConfig
        }

        /** Type of pipeline. Either PLAYGROUND or MANAGED. */
        fun pipelineType(pipelineType: PipelineType) = pipelineType(JsonField.of(pipelineType))

        /**
         * Sets [Builder.pipelineType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineType] with a well-typed [PipelineType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pipelineType(pipelineType: JsonField<PipelineType>) = apply {
            this.pipelineType = pipelineType
        }

        /** Preset retrieval parameters for the pipeline. */
        fun presetRetrievalParameters(presetRetrievalParameters: PresetRetrievalParams) =
            presetRetrievalParameters(JsonField.of(presetRetrievalParameters))

        /**
         * Sets [Builder.presetRetrievalParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presetRetrievalParameters] with a well-typed
         * [PresetRetrievalParams] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun presetRetrievalParameters(presetRetrievalParameters: JsonField<PresetRetrievalParams>) =
            apply {
                this.presetRetrievalParameters = presetRetrievalParameters
            }

        /**
         * Configuration for sparse embedding models used in hybrid search.
         *
         * This allows users to choose between Splade and BM25 models for sparse retrieval in
         * managed data sinks.
         */
        fun sparseModelConfig(sparseModelConfig: SparseModelConfig?) =
            sparseModelConfig(JsonField.ofNullable(sparseModelConfig))

        /** Alias for calling [Builder.sparseModelConfig] with `sparseModelConfig.orElse(null)`. */
        fun sparseModelConfig(sparseModelConfig: Optional<SparseModelConfig>) =
            sparseModelConfig(sparseModelConfig.getOrNull())

        /**
         * Sets [Builder.sparseModelConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sparseModelConfig] with a well-typed [SparseModelConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sparseModelConfig(sparseModelConfig: JsonField<SparseModelConfig>) = apply {
            this.sparseModelConfig = sparseModelConfig
        }

        /** Status of the pipeline. */
        fun status(status: Status?) = status(JsonField.ofNullable(status))

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Configuration for the transformation. */
        fun transformConfig(transformConfig: TransformConfig) =
            transformConfig(JsonField.of(transformConfig))

        /**
         * Sets [Builder.transformConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transformConfig] with a well-typed [TransformConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transformConfig(transformConfig: JsonField<TransformConfig>) = apply {
            this.transformConfig = transformConfig
        }

        /** Alias for calling [transformConfig] with `TransformConfig.ofAuto(auto)`. */
        fun transformConfig(auto: AutoTransformConfig) =
            transformConfig(TransformConfig.ofAuto(auto))

        /**
         * Alias for calling [transformConfig] with `TransformConfig.ofAdvancedMode(advancedMode)`.
         */
        fun transformConfig(advancedMode: AdvancedModeTransformConfig) =
            transformConfig(TransformConfig.ofAdvancedMode(advancedMode))

        /** Update datetime */
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
         * Returns an immutable instance of [Pipeline].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .embeddingConfig()
         * .name()
         * .projectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Pipeline =
            Pipeline(
                checkRequired("id", id),
                checkRequired("embeddingConfig", embeddingConfig),
                checkRequired("name", name),
                checkRequired("projectId", projectId),
                configHash,
                createdAt,
                dataSink,
                embeddingModelConfig,
                embeddingModelConfigId,
                llamaParseParameters,
                managedPipelineId,
                metadataConfig,
                pipelineType,
                presetRetrievalParameters,
                sparseModelConfig,
                status,
                transformConfig,
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
    fun validate(): Pipeline = apply {
        if (validated) {
            return@apply
        }

        id()
        embeddingConfig().validate()
        name()
        projectId()
        configHash().ifPresent { it.validate() }
        createdAt()
        dataSink().ifPresent { it.validate() }
        embeddingModelConfig().ifPresent { it.validate() }
        embeddingModelConfigId()
        llamaParseParameters().ifPresent { it.validate() }
        managedPipelineId()
        metadataConfig().ifPresent { it.validate() }
        pipelineType().ifPresent { it.validate() }
        presetRetrievalParameters().ifPresent { it.validate() }
        sparseModelConfig().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
        transformConfig().ifPresent { it.validate() }
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
            (embeddingConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (configHash.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (dataSink.asKnown().getOrNull()?.validity() ?: 0) +
            (embeddingModelConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (embeddingModelConfigId.asKnown().isPresent) 1 else 0) +
            (llamaParseParameters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (managedPipelineId.asKnown().isPresent) 1 else 0) +
            (metadataConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (pipelineType.asKnown().getOrNull()?.validity() ?: 0) +
            (presetRetrievalParameters.asKnown().getOrNull()?.validity() ?: 0) +
            (sparseModelConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (transformConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = EmbeddingConfig.Deserializer::class)
    @JsonSerialize(using = EmbeddingConfig.Serializer::class)
    class EmbeddingConfig
    private constructor(
        private val azureEmbedding: AzureOpenAIEmbeddingConfig? = null,
        private val bedrockEmbedding: BedrockEmbeddingConfig? = null,
        private val cohereEmbedding: CohereEmbeddingConfig? = null,
        private val geminiEmbedding: GeminiEmbeddingConfig? = null,
        private val huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig? = null,
        private val managedOpenAIEmbedding: ManagedOpenAIEmbedding? = null,
        private val openaiEmbedding: OpenAIEmbeddingConfig? = null,
        private val vertexaiEmbedding: VertexAiEmbeddingConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        fun azureEmbedding(): Optional<AzureOpenAIEmbeddingConfig> =
            Optional.ofNullable(azureEmbedding)

        fun bedrockEmbedding(): Optional<BedrockEmbeddingConfig> =
            Optional.ofNullable(bedrockEmbedding)

        fun cohereEmbedding(): Optional<CohereEmbeddingConfig> =
            Optional.ofNullable(cohereEmbedding)

        fun geminiEmbedding(): Optional<GeminiEmbeddingConfig> =
            Optional.ofNullable(geminiEmbedding)

        fun huggingfaceApiEmbedding(): Optional<HuggingFaceInferenceApiEmbeddingConfig> =
            Optional.ofNullable(huggingfaceApiEmbedding)

        fun managedOpenAIEmbedding(): Optional<ManagedOpenAIEmbedding> =
            Optional.ofNullable(managedOpenAIEmbedding)

        fun openaiEmbedding(): Optional<OpenAIEmbeddingConfig> =
            Optional.ofNullable(openaiEmbedding)

        fun vertexaiEmbedding(): Optional<VertexAiEmbeddingConfig> =
            Optional.ofNullable(vertexaiEmbedding)

        fun isAzureEmbedding(): Boolean = azureEmbedding != null

        fun isBedrockEmbedding(): Boolean = bedrockEmbedding != null

        fun isCohereEmbedding(): Boolean = cohereEmbedding != null

        fun isGeminiEmbedding(): Boolean = geminiEmbedding != null

        fun isHuggingfaceApiEmbedding(): Boolean = huggingfaceApiEmbedding != null

        fun isManagedOpenAIEmbedding(): Boolean = managedOpenAIEmbedding != null

        fun isOpenAIEmbedding(): Boolean = openaiEmbedding != null

        fun isVertexaiEmbedding(): Boolean = vertexaiEmbedding != null

        fun asAzureEmbedding(): AzureOpenAIEmbeddingConfig =
            azureEmbedding.getOrThrow("azureEmbedding")

        fun asBedrockEmbedding(): BedrockEmbeddingConfig =
            bedrockEmbedding.getOrThrow("bedrockEmbedding")

        fun asCohereEmbedding(): CohereEmbeddingConfig =
            cohereEmbedding.getOrThrow("cohereEmbedding")

        fun asGeminiEmbedding(): GeminiEmbeddingConfig =
            geminiEmbedding.getOrThrow("geminiEmbedding")

        fun asHuggingfaceApiEmbedding(): HuggingFaceInferenceApiEmbeddingConfig =
            huggingfaceApiEmbedding.getOrThrow("huggingfaceApiEmbedding")

        fun asManagedOpenAIEmbedding(): ManagedOpenAIEmbedding =
            managedOpenAIEmbedding.getOrThrow("managedOpenAIEmbedding")

        fun asOpenAIEmbedding(): OpenAIEmbeddingConfig =
            openaiEmbedding.getOrThrow("openaiEmbedding")

        fun asVertexaiEmbedding(): VertexAiEmbeddingConfig =
            vertexaiEmbedding.getOrThrow("vertexaiEmbedding")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.llamacloud_prod.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = embeddingConfig.accept(new EmbeddingConfig.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitAzureEmbedding(AzureOpenAIEmbeddingConfig azureEmbedding) {
         *         return Optional.of(azureEmbedding.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                azureEmbedding != null -> visitor.visitAzureEmbedding(azureEmbedding)
                bedrockEmbedding != null -> visitor.visitBedrockEmbedding(bedrockEmbedding)
                cohereEmbedding != null -> visitor.visitCohereEmbedding(cohereEmbedding)
                geminiEmbedding != null -> visitor.visitGeminiEmbedding(geminiEmbedding)
                huggingfaceApiEmbedding != null ->
                    visitor.visitHuggingfaceApiEmbedding(huggingfaceApiEmbedding)
                managedOpenAIEmbedding != null ->
                    visitor.visitManagedOpenAIEmbedding(managedOpenAIEmbedding)
                openaiEmbedding != null -> visitor.visitOpenAIEmbedding(openaiEmbedding)
                vertexaiEmbedding != null -> visitor.visitVertexaiEmbedding(vertexaiEmbedding)
                else -> visitor.unknown(_json)
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
        fun validate(): EmbeddingConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAzureEmbedding(azureEmbedding: AzureOpenAIEmbeddingConfig) {
                        azureEmbedding.validate()
                    }

                    override fun visitBedrockEmbedding(bedrockEmbedding: BedrockEmbeddingConfig) {
                        bedrockEmbedding.validate()
                    }

                    override fun visitCohereEmbedding(cohereEmbedding: CohereEmbeddingConfig) {
                        cohereEmbedding.validate()
                    }

                    override fun visitGeminiEmbedding(geminiEmbedding: GeminiEmbeddingConfig) {
                        geminiEmbedding.validate()
                    }

                    override fun visitHuggingfaceApiEmbedding(
                        huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig
                    ) {
                        huggingfaceApiEmbedding.validate()
                    }

                    override fun visitManagedOpenAIEmbedding(
                        managedOpenAIEmbedding: ManagedOpenAIEmbedding
                    ) {
                        managedOpenAIEmbedding.validate()
                    }

                    override fun visitOpenAIEmbedding(openaiEmbedding: OpenAIEmbeddingConfig) {
                        openaiEmbedding.validate()
                    }

                    override fun visitVertexaiEmbedding(
                        vertexaiEmbedding: VertexAiEmbeddingConfig
                    ) {
                        vertexaiEmbedding.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitAzureEmbedding(azureEmbedding: AzureOpenAIEmbeddingConfig) =
                        azureEmbedding.validity()

                    override fun visitBedrockEmbedding(bedrockEmbedding: BedrockEmbeddingConfig) =
                        bedrockEmbedding.validity()

                    override fun visitCohereEmbedding(cohereEmbedding: CohereEmbeddingConfig) =
                        cohereEmbedding.validity()

                    override fun visitGeminiEmbedding(geminiEmbedding: GeminiEmbeddingConfig) =
                        geminiEmbedding.validity()

                    override fun visitHuggingfaceApiEmbedding(
                        huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig
                    ) = huggingfaceApiEmbedding.validity()

                    override fun visitManagedOpenAIEmbedding(
                        managedOpenAIEmbedding: ManagedOpenAIEmbedding
                    ) = managedOpenAIEmbedding.validity()

                    override fun visitOpenAIEmbedding(openaiEmbedding: OpenAIEmbeddingConfig) =
                        openaiEmbedding.validity()

                    override fun visitVertexaiEmbedding(
                        vertexaiEmbedding: VertexAiEmbeddingConfig
                    ) = vertexaiEmbedding.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EmbeddingConfig &&
                azureEmbedding == other.azureEmbedding &&
                bedrockEmbedding == other.bedrockEmbedding &&
                cohereEmbedding == other.cohereEmbedding &&
                geminiEmbedding == other.geminiEmbedding &&
                huggingfaceApiEmbedding == other.huggingfaceApiEmbedding &&
                managedOpenAIEmbedding == other.managedOpenAIEmbedding &&
                openaiEmbedding == other.openaiEmbedding &&
                vertexaiEmbedding == other.vertexaiEmbedding
        }

        override fun hashCode(): Int =
            Objects.hash(
                azureEmbedding,
                bedrockEmbedding,
                cohereEmbedding,
                geminiEmbedding,
                huggingfaceApiEmbedding,
                managedOpenAIEmbedding,
                openaiEmbedding,
                vertexaiEmbedding,
            )

        override fun toString(): String =
            when {
                azureEmbedding != null -> "EmbeddingConfig{azureEmbedding=$azureEmbedding}"
                bedrockEmbedding != null -> "EmbeddingConfig{bedrockEmbedding=$bedrockEmbedding}"
                cohereEmbedding != null -> "EmbeddingConfig{cohereEmbedding=$cohereEmbedding}"
                geminiEmbedding != null -> "EmbeddingConfig{geminiEmbedding=$geminiEmbedding}"
                huggingfaceApiEmbedding != null ->
                    "EmbeddingConfig{huggingfaceApiEmbedding=$huggingfaceApiEmbedding}"
                managedOpenAIEmbedding != null ->
                    "EmbeddingConfig{managedOpenAIEmbedding=$managedOpenAIEmbedding}"
                openaiEmbedding != null -> "EmbeddingConfig{openaiEmbedding=$openaiEmbedding}"
                vertexaiEmbedding != null -> "EmbeddingConfig{vertexaiEmbedding=$vertexaiEmbedding}"
                _json != null -> "EmbeddingConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid EmbeddingConfig")
            }

        companion object {

            @JvmStatic
            fun ofAzureEmbedding(azureEmbedding: AzureOpenAIEmbeddingConfig) =
                EmbeddingConfig(azureEmbedding = azureEmbedding)

            @JvmStatic
            fun ofBedrockEmbedding(bedrockEmbedding: BedrockEmbeddingConfig) =
                EmbeddingConfig(bedrockEmbedding = bedrockEmbedding)

            @JvmStatic
            fun ofCohereEmbedding(cohereEmbedding: CohereEmbeddingConfig) =
                EmbeddingConfig(cohereEmbedding = cohereEmbedding)

            @JvmStatic
            fun ofGeminiEmbedding(geminiEmbedding: GeminiEmbeddingConfig) =
                EmbeddingConfig(geminiEmbedding = geminiEmbedding)

            @JvmStatic
            fun ofHuggingfaceApiEmbedding(
                huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig
            ) = EmbeddingConfig(huggingfaceApiEmbedding = huggingfaceApiEmbedding)

            @JvmStatic
            fun ofManagedOpenAIEmbedding(managedOpenAIEmbedding: ManagedOpenAIEmbedding) =
                EmbeddingConfig(managedOpenAIEmbedding = managedOpenAIEmbedding)

            @JvmStatic
            fun ofOpenAIEmbedding(openaiEmbedding: OpenAIEmbeddingConfig) =
                EmbeddingConfig(openaiEmbedding = openaiEmbedding)

            @JvmStatic
            fun ofVertexaiEmbedding(vertexaiEmbedding: VertexAiEmbeddingConfig) =
                EmbeddingConfig(vertexaiEmbedding = vertexaiEmbedding)
        }

        /**
         * An interface that defines how to map each variant of [EmbeddingConfig] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitAzureEmbedding(azureEmbedding: AzureOpenAIEmbeddingConfig): T

            fun visitBedrockEmbedding(bedrockEmbedding: BedrockEmbeddingConfig): T

            fun visitCohereEmbedding(cohereEmbedding: CohereEmbeddingConfig): T

            fun visitGeminiEmbedding(geminiEmbedding: GeminiEmbeddingConfig): T

            fun visitHuggingfaceApiEmbedding(
                huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig
            ): T

            fun visitManagedOpenAIEmbedding(managedOpenAIEmbedding: ManagedOpenAIEmbedding): T

            fun visitOpenAIEmbedding(openaiEmbedding: OpenAIEmbeddingConfig): T

            fun visitVertexaiEmbedding(vertexaiEmbedding: VertexAiEmbeddingConfig): T

            /**
             * Maps an unknown variant of [EmbeddingConfig] to a value of type [T].
             *
             * An instance of [EmbeddingConfig] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown EmbeddingConfig: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<EmbeddingConfig>(EmbeddingConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): EmbeddingConfig {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "AZURE_EMBEDDING" -> {
                        return tryDeserialize(node, jacksonTypeRef<AzureOpenAIEmbeddingConfig>())
                            ?.let { EmbeddingConfig(azureEmbedding = it, _json = json) }
                            ?: EmbeddingConfig(_json = json)
                    }
                    "BEDROCK_EMBEDDING" -> {
                        return tryDeserialize(node, jacksonTypeRef<BedrockEmbeddingConfig>())?.let {
                            EmbeddingConfig(bedrockEmbedding = it, _json = json)
                        } ?: EmbeddingConfig(_json = json)
                    }
                    "COHERE_EMBEDDING" -> {
                        return tryDeserialize(node, jacksonTypeRef<CohereEmbeddingConfig>())?.let {
                            EmbeddingConfig(cohereEmbedding = it, _json = json)
                        } ?: EmbeddingConfig(_json = json)
                    }
                    "GEMINI_EMBEDDING" -> {
                        return tryDeserialize(node, jacksonTypeRef<GeminiEmbeddingConfig>())?.let {
                            EmbeddingConfig(geminiEmbedding = it, _json = json)
                        } ?: EmbeddingConfig(_json = json)
                    }
                    "HUGGINGFACE_API_EMBEDDING" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<HuggingFaceInferenceApiEmbeddingConfig>(),
                            )
                            ?.let { EmbeddingConfig(huggingfaceApiEmbedding = it, _json = json) }
                            ?: EmbeddingConfig(_json = json)
                    }
                    "MANAGED_OPENAI_EMBEDDING" -> {
                        return tryDeserialize(node, jacksonTypeRef<ManagedOpenAIEmbedding>())?.let {
                            EmbeddingConfig(managedOpenAIEmbedding = it, _json = json)
                        } ?: EmbeddingConfig(_json = json)
                    }
                    "OPENAI_EMBEDDING" -> {
                        return tryDeserialize(node, jacksonTypeRef<OpenAIEmbeddingConfig>())?.let {
                            EmbeddingConfig(openaiEmbedding = it, _json = json)
                        } ?: EmbeddingConfig(_json = json)
                    }
                    "VERTEXAI_EMBEDDING" -> {
                        return tryDeserialize(node, jacksonTypeRef<VertexAiEmbeddingConfig>())
                            ?.let { EmbeddingConfig(vertexaiEmbedding = it, _json = json) }
                            ?: EmbeddingConfig(_json = json)
                    }
                }

                return EmbeddingConfig(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<EmbeddingConfig>(EmbeddingConfig::class) {

            override fun serialize(
                value: EmbeddingConfig,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.azureEmbedding != null -> generator.writeObject(value.azureEmbedding)
                    value.bedrockEmbedding != null -> generator.writeObject(value.bedrockEmbedding)
                    value.cohereEmbedding != null -> generator.writeObject(value.cohereEmbedding)
                    value.geminiEmbedding != null -> generator.writeObject(value.geminiEmbedding)
                    value.huggingfaceApiEmbedding != null ->
                        generator.writeObject(value.huggingfaceApiEmbedding)
                    value.managedOpenAIEmbedding != null ->
                        generator.writeObject(value.managedOpenAIEmbedding)
                    value.openaiEmbedding != null -> generator.writeObject(value.openaiEmbedding)
                    value.vertexaiEmbedding != null ->
                        generator.writeObject(value.vertexaiEmbedding)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid EmbeddingConfig")
                }
            }
        }

        class ManagedOpenAIEmbedding
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val component: JsonField<Component>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("component")
                @ExcludeMissing
                component: JsonField<Component> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(component, type, mutableMapOf())

            /**
             * Configuration for the Managed OpenAI embedding model.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun component(): Optional<Component> = component.getOptional("component")

            /**
             * Type of the embedding model.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [component].
             *
             * Unlike [component], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("component")
            @ExcludeMissing
            fun _component(): JsonField<Component> = component

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * [ManagedOpenAIEmbedding].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ManagedOpenAIEmbedding]. */
            class Builder internal constructor() {

                private var component: JsonField<Component> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(managedOpenAIEmbedding: ManagedOpenAIEmbedding) = apply {
                    component = managedOpenAIEmbedding.component
                    type = managedOpenAIEmbedding.type
                    additionalProperties =
                        managedOpenAIEmbedding.additionalProperties.toMutableMap()
                }

                /** Configuration for the Managed OpenAI embedding model. */
                fun component(component: Component) = component(JsonField.of(component))

                /**
                 * Sets [Builder.component] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.component] with a well-typed [Component] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun component(component: JsonField<Component>) = apply {
                    this.component = component
                }

                /** Type of the embedding model. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ManagedOpenAIEmbedding].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ManagedOpenAIEmbedding =
                    ManagedOpenAIEmbedding(component, type, additionalProperties.toMutableMap())
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
            fun validate(): ManagedOpenAIEmbedding = apply {
                if (validated) {
                    return@apply
                }

                component().ifPresent { it.validate() }
                type().ifPresent { it.validate() }
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
                (component.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Configuration for the Managed OpenAI embedding model. */
            class Component
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val className: JsonField<String>,
                private val embedBatchSize: JsonField<Long>,
                private val modelName: JsonField<ModelName>,
                private val numWorkers: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("class_name")
                    @ExcludeMissing
                    className: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("embed_batch_size")
                    @ExcludeMissing
                    embedBatchSize: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("model_name")
                    @ExcludeMissing
                    modelName: JsonField<ModelName> = JsonMissing.of(),
                    @JsonProperty("num_workers")
                    @ExcludeMissing
                    numWorkers: JsonField<Long> = JsonMissing.of(),
                ) : this(className, embedBatchSize, modelName, numWorkers, mutableMapOf())

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun className(): Optional<String> = className.getOptional("class_name")

                /**
                 * The batch size for embedding calls.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun embedBatchSize(): Optional<Long> =
                    embedBatchSize.getOptional("embed_batch_size")

                /**
                 * The name of the OpenAI embedding model.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun modelName(): Optional<ModelName> = modelName.getOptional("model_name")

                /**
                 * The number of workers to use for async embedding calls.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun numWorkers(): Optional<Long> = numWorkers.getOptional("num_workers")

                /**
                 * Returns the raw JSON value of [className].
                 *
                 * Unlike [className], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("class_name")
                @ExcludeMissing
                fun _className(): JsonField<String> = className

                /**
                 * Returns the raw JSON value of [embedBatchSize].
                 *
                 * Unlike [embedBatchSize], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("embed_batch_size")
                @ExcludeMissing
                fun _embedBatchSize(): JsonField<Long> = embedBatchSize

                /**
                 * Returns the raw JSON value of [modelName].
                 *
                 * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("model_name")
                @ExcludeMissing
                fun _modelName(): JsonField<ModelName> = modelName

                /**
                 * Returns the raw JSON value of [numWorkers].
                 *
                 * Unlike [numWorkers], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("num_workers")
                @ExcludeMissing
                fun _numWorkers(): JsonField<Long> = numWorkers

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

                    /** Returns a mutable builder for constructing an instance of [Component]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Component]. */
                class Builder internal constructor() {

                    private var className: JsonField<String> = JsonMissing.of()
                    private var embedBatchSize: JsonField<Long> = JsonMissing.of()
                    private var modelName: JsonField<ModelName> = JsonMissing.of()
                    private var numWorkers: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(component: Component) = apply {
                        className = component.className
                        embedBatchSize = component.embedBatchSize
                        modelName = component.modelName
                        numWorkers = component.numWorkers
                        additionalProperties = component.additionalProperties.toMutableMap()
                    }

                    fun className(className: String) = className(JsonField.of(className))

                    /**
                     * Sets [Builder.className] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.className] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun className(className: JsonField<String>) = apply {
                        this.className = className
                    }

                    /** The batch size for embedding calls. */
                    fun embedBatchSize(embedBatchSize: Long) =
                        embedBatchSize(JsonField.of(embedBatchSize))

                    /**
                     * Sets [Builder.embedBatchSize] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.embedBatchSize] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun embedBatchSize(embedBatchSize: JsonField<Long>) = apply {
                        this.embedBatchSize = embedBatchSize
                    }

                    /** The name of the OpenAI embedding model. */
                    fun modelName(modelName: ModelName) = modelName(JsonField.of(modelName))

                    /**
                     * Sets [Builder.modelName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.modelName] with a well-typed [ModelName]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun modelName(modelName: JsonField<ModelName>) = apply {
                        this.modelName = modelName
                    }

                    /** The number of workers to use for async embedding calls. */
                    fun numWorkers(numWorkers: Long?) = numWorkers(JsonField.ofNullable(numWorkers))

                    /**
                     * Alias for [Builder.numWorkers].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun numWorkers(numWorkers: Long) = numWorkers(numWorkers as Long?)

                    /** Alias for calling [Builder.numWorkers] with `numWorkers.orElse(null)`. */
                    fun numWorkers(numWorkers: Optional<Long>) = numWorkers(numWorkers.getOrNull())

                    /**
                     * Sets [Builder.numWorkers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.numWorkers] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun numWorkers(numWorkers: JsonField<Long>) = apply {
                        this.numWorkers = numWorkers
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Component].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Component =
                        Component(
                            className,
                            embedBatchSize,
                            modelName,
                            numWorkers,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Component = apply {
                    if (validated) {
                        return@apply
                    }

                    className()
                    embedBatchSize()
                    modelName().ifPresent { it.validate() }
                    numWorkers()
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
                    (if (className.asKnown().isPresent) 1 else 0) +
                        (if (embedBatchSize.asKnown().isPresent) 1 else 0) +
                        (modelName.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (numWorkers.asKnown().isPresent) 1 else 0)

                /** The name of the OpenAI embedding model. */
                class ModelName
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField
                        val OPENAI_TEXT_EMBEDDING_3_SMALL = of("openai-text-embedding-3-small")

                        @JvmStatic fun of(value: String) = ModelName(JsonField.of(value))
                    }

                    /** An enum containing [ModelName]'s known values. */
                    enum class Known {
                        OPENAI_TEXT_EMBEDDING_3_SMALL
                    }

                    /**
                     * An enum containing [ModelName]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ModelName] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        OPENAI_TEXT_EMBEDDING_3_SMALL,
                        /**
                         * An enum member indicating that [ModelName] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            OPENAI_TEXT_EMBEDDING_3_SMALL -> Value.OPENAI_TEXT_EMBEDDING_3_SMALL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LlamaCloudInvalidDataException if this class instance's value is a
                     *   not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            OPENAI_TEXT_EMBEDDING_3_SMALL -> Known.OPENAI_TEXT_EMBEDDING_3_SMALL
                            else ->
                                throw LlamaCloudInvalidDataException("Unknown ModelName: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LlamaCloudInvalidDataException if this class instance's value does
                     *   not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LlamaCloudInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): ModelName = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelName && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Component &&
                        className == other.className &&
                        embedBatchSize == other.embedBatchSize &&
                        modelName == other.modelName &&
                        numWorkers == other.numWorkers &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        className,
                        embedBatchSize,
                        modelName,
                        numWorkers,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Component{className=$className, embedBatchSize=$embedBatchSize, modelName=$modelName, numWorkers=$numWorkers, additionalProperties=$additionalProperties}"
            }

            /** Type of the embedding model. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MANAGED_OPENAI_EMBEDDING = of("MANAGED_OPENAI_EMBEDDING")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    MANAGED_OPENAI_EMBEDDING
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MANAGED_OPENAI_EMBEDDING,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MANAGED_OPENAI_EMBEDDING -> Value.MANAGED_OPENAI_EMBEDDING
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
                        MANAGED_OPENAI_EMBEDDING -> Known.MANAGED_OPENAI_EMBEDDING
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ManagedOpenAIEmbedding &&
                    component == other.component &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(component, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ManagedOpenAIEmbedding{component=$component, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    /** Hashes for the configuration of a pipeline. */
    class ConfigHash
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val embeddingConfigHash: JsonField<String>,
        private val parsingConfigHash: JsonField<String>,
        private val transformConfigHash: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("embedding_config_hash")
            @ExcludeMissing
            embeddingConfigHash: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parsing_config_hash")
            @ExcludeMissing
            parsingConfigHash: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transform_config_hash")
            @ExcludeMissing
            transformConfigHash: JsonField<String> = JsonMissing.of(),
        ) : this(embeddingConfigHash, parsingConfigHash, transformConfigHash, mutableMapOf())

        /**
         * Hash of the embedding config.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun embeddingConfigHash(): Optional<String> =
            embeddingConfigHash.getOptional("embedding_config_hash")

        /**
         * Hash of the llama parse parameters.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parsingConfigHash(): Optional<String> =
            parsingConfigHash.getOptional("parsing_config_hash")

        /**
         * Hash of the transform config.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transformConfigHash(): Optional<String> =
            transformConfigHash.getOptional("transform_config_hash")

        /**
         * Returns the raw JSON value of [embeddingConfigHash].
         *
         * Unlike [embeddingConfigHash], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("embedding_config_hash")
        @ExcludeMissing
        fun _embeddingConfigHash(): JsonField<String> = embeddingConfigHash

        /**
         * Returns the raw JSON value of [parsingConfigHash].
         *
         * Unlike [parsingConfigHash], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parsing_config_hash")
        @ExcludeMissing
        fun _parsingConfigHash(): JsonField<String> = parsingConfigHash

        /**
         * Returns the raw JSON value of [transformConfigHash].
         *
         * Unlike [transformConfigHash], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transform_config_hash")
        @ExcludeMissing
        fun _transformConfigHash(): JsonField<String> = transformConfigHash

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

            /** Returns a mutable builder for constructing an instance of [ConfigHash]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConfigHash]. */
        class Builder internal constructor() {

            private var embeddingConfigHash: JsonField<String> = JsonMissing.of()
            private var parsingConfigHash: JsonField<String> = JsonMissing.of()
            private var transformConfigHash: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configHash: ConfigHash) = apply {
                embeddingConfigHash = configHash.embeddingConfigHash
                parsingConfigHash = configHash.parsingConfigHash
                transformConfigHash = configHash.transformConfigHash
                additionalProperties = configHash.additionalProperties.toMutableMap()
            }

            /** Hash of the embedding config. */
            fun embeddingConfigHash(embeddingConfigHash: String?) =
                embeddingConfigHash(JsonField.ofNullable(embeddingConfigHash))

            /**
             * Alias for calling [Builder.embeddingConfigHash] with
             * `embeddingConfigHash.orElse(null)`.
             */
            fun embeddingConfigHash(embeddingConfigHash: Optional<String>) =
                embeddingConfigHash(embeddingConfigHash.getOrNull())

            /**
             * Sets [Builder.embeddingConfigHash] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddingConfigHash] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun embeddingConfigHash(embeddingConfigHash: JsonField<String>) = apply {
                this.embeddingConfigHash = embeddingConfigHash
            }

            /** Hash of the llama parse parameters. */
            fun parsingConfigHash(parsingConfigHash: String?) =
                parsingConfigHash(JsonField.ofNullable(parsingConfigHash))

            /**
             * Alias for calling [Builder.parsingConfigHash] with `parsingConfigHash.orElse(null)`.
             */
            fun parsingConfigHash(parsingConfigHash: Optional<String>) =
                parsingConfigHash(parsingConfigHash.getOrNull())

            /**
             * Sets [Builder.parsingConfigHash] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parsingConfigHash] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parsingConfigHash(parsingConfigHash: JsonField<String>) = apply {
                this.parsingConfigHash = parsingConfigHash
            }

            /** Hash of the transform config. */
            fun transformConfigHash(transformConfigHash: String?) =
                transformConfigHash(JsonField.ofNullable(transformConfigHash))

            /**
             * Alias for calling [Builder.transformConfigHash] with
             * `transformConfigHash.orElse(null)`.
             */
            fun transformConfigHash(transformConfigHash: Optional<String>) =
                transformConfigHash(transformConfigHash.getOrNull())

            /**
             * Sets [Builder.transformConfigHash] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transformConfigHash] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transformConfigHash(transformConfigHash: JsonField<String>) = apply {
                this.transformConfigHash = transformConfigHash
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
             * Returns an immutable instance of [ConfigHash].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConfigHash =
                ConfigHash(
                    embeddingConfigHash,
                    parsingConfigHash,
                    transformConfigHash,
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
        fun validate(): ConfigHash = apply {
            if (validated) {
                return@apply
            }

            embeddingConfigHash()
            parsingConfigHash()
            transformConfigHash()
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
            (if (embeddingConfigHash.asKnown().isPresent) 1 else 0) +
                (if (parsingConfigHash.asKnown().isPresent) 1 else 0) +
                (if (transformConfigHash.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConfigHash &&
                embeddingConfigHash == other.embeddingConfigHash &&
                parsingConfigHash == other.parsingConfigHash &&
                transformConfigHash == other.transformConfigHash &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                embeddingConfigHash,
                parsingConfigHash,
                transformConfigHash,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConfigHash{embeddingConfigHash=$embeddingConfigHash, parsingConfigHash=$parsingConfigHash, transformConfigHash=$transformConfigHash, additionalProperties=$additionalProperties}"
    }

    /** Schema for an embedding model config. */
    class EmbeddingModelConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val embeddingConfig: JsonField<EmbeddingConfig>,
        private val name: JsonField<String>,
        private val projectId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("embedding_config")
            @ExcludeMissing
            embeddingConfig: JsonField<EmbeddingConfig> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, embeddingConfig, name, projectId, createdAt, updatedAt, mutableMapOf())

        /**
         * Unique identifier
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The embedding configuration for the embedding model config.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun embeddingConfig(): EmbeddingConfig = embeddingConfig.getRequired("embedding_config")

        /**
         * The name of the embedding model config.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectId(): String = projectId.getRequired("project_id")

        /**
         * Creation datetime
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Update datetime
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [embeddingConfig].
         *
         * Unlike [embeddingConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("embedding_config")
        @ExcludeMissing
        fun _embeddingConfig(): JsonField<EmbeddingConfig> = embeddingConfig

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
             * Returns a mutable builder for constructing an instance of [EmbeddingModelConfig].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .embeddingConfig()
             * .name()
             * .projectId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EmbeddingModelConfig]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var embeddingConfig: JsonField<EmbeddingConfig>? = null
            private var name: JsonField<String>? = null
            private var projectId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(embeddingModelConfig: EmbeddingModelConfig) = apply {
                id = embeddingModelConfig.id
                embeddingConfig = embeddingModelConfig.embeddingConfig
                name = embeddingModelConfig.name
                projectId = embeddingModelConfig.projectId
                createdAt = embeddingModelConfig.createdAt
                updatedAt = embeddingModelConfig.updatedAt
                additionalProperties = embeddingModelConfig.additionalProperties.toMutableMap()
            }

            /** Unique identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The embedding configuration for the embedding model config. */
            fun embeddingConfig(embeddingConfig: EmbeddingConfig) =
                embeddingConfig(JsonField.of(embeddingConfig))

            /**
             * Sets [Builder.embeddingConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddingConfig] with a well-typed [EmbeddingConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun embeddingConfig(embeddingConfig: JsonField<EmbeddingConfig>) = apply {
                this.embeddingConfig = embeddingConfig
            }

            /**
             * Alias for calling [embeddingConfig] with
             * `EmbeddingConfig.ofAzureEmbedding(azureEmbedding)`.
             */
            fun embeddingConfig(azureEmbedding: AzureOpenAIEmbeddingConfig) =
                embeddingConfig(EmbeddingConfig.ofAzureEmbedding(azureEmbedding))

            /**
             * Alias for calling [embeddingConfig] with
             * `EmbeddingConfig.ofBedrockEmbedding(bedrockEmbedding)`.
             */
            fun embeddingConfig(bedrockEmbedding: BedrockEmbeddingConfig) =
                embeddingConfig(EmbeddingConfig.ofBedrockEmbedding(bedrockEmbedding))

            /**
             * Alias for calling [embeddingConfig] with
             * `EmbeddingConfig.ofCohereEmbedding(cohereEmbedding)`.
             */
            fun embeddingConfig(cohereEmbedding: CohereEmbeddingConfig) =
                embeddingConfig(EmbeddingConfig.ofCohereEmbedding(cohereEmbedding))

            /**
             * Alias for calling [embeddingConfig] with
             * `EmbeddingConfig.ofGeminiEmbedding(geminiEmbedding)`.
             */
            fun embeddingConfig(geminiEmbedding: GeminiEmbeddingConfig) =
                embeddingConfig(EmbeddingConfig.ofGeminiEmbedding(geminiEmbedding))

            /**
             * Alias for calling [embeddingConfig] with
             * `EmbeddingConfig.ofHuggingfaceApiEmbedding(huggingfaceApiEmbedding)`.
             */
            fun embeddingConfig(huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig) =
                embeddingConfig(EmbeddingConfig.ofHuggingfaceApiEmbedding(huggingfaceApiEmbedding))

            /**
             * Alias for calling [embeddingConfig] with
             * `EmbeddingConfig.ofOpenAIEmbedding(openaiEmbedding)`.
             */
            fun embeddingConfig(openaiEmbedding: OpenAIEmbeddingConfig) =
                embeddingConfig(EmbeddingConfig.ofOpenAIEmbedding(openaiEmbedding))

            /**
             * Alias for calling [embeddingConfig] with
             * `EmbeddingConfig.ofVertexaiEmbedding(vertexaiEmbedding)`.
             */
            fun embeddingConfig(vertexaiEmbedding: VertexAiEmbeddingConfig) =
                embeddingConfig(EmbeddingConfig.ofVertexaiEmbedding(vertexaiEmbedding))

            /** The name of the embedding model config. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** Creation datetime */
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Update datetime */
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [EmbeddingModelConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .embeddingConfig()
             * .name()
             * .projectId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EmbeddingModelConfig =
                EmbeddingModelConfig(
                    checkRequired("id", id),
                    checkRequired("embeddingConfig", embeddingConfig),
                    checkRequired("name", name),
                    checkRequired("projectId", projectId),
                    createdAt,
                    updatedAt,
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
        fun validate(): EmbeddingModelConfig = apply {
            if (validated) {
                return@apply
            }

            id()
            embeddingConfig().validate()
            name()
            projectId()
            createdAt()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (embeddingConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (projectId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** The embedding configuration for the embedding model config. */
        @JsonDeserialize(using = EmbeddingConfig.Deserializer::class)
        @JsonSerialize(using = EmbeddingConfig.Serializer::class)
        class EmbeddingConfig
        private constructor(
            private val azureEmbedding: AzureOpenAIEmbeddingConfig? = null,
            private val bedrockEmbedding: BedrockEmbeddingConfig? = null,
            private val cohereEmbedding: CohereEmbeddingConfig? = null,
            private val geminiEmbedding: GeminiEmbeddingConfig? = null,
            private val huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig? = null,
            private val openaiEmbedding: OpenAIEmbeddingConfig? = null,
            private val vertexaiEmbedding: VertexAiEmbeddingConfig? = null,
            private val _json: JsonValue? = null,
        ) {

            fun azureEmbedding(): Optional<AzureOpenAIEmbeddingConfig> =
                Optional.ofNullable(azureEmbedding)

            fun bedrockEmbedding(): Optional<BedrockEmbeddingConfig> =
                Optional.ofNullable(bedrockEmbedding)

            fun cohereEmbedding(): Optional<CohereEmbeddingConfig> =
                Optional.ofNullable(cohereEmbedding)

            fun geminiEmbedding(): Optional<GeminiEmbeddingConfig> =
                Optional.ofNullable(geminiEmbedding)

            fun huggingfaceApiEmbedding(): Optional<HuggingFaceInferenceApiEmbeddingConfig> =
                Optional.ofNullable(huggingfaceApiEmbedding)

            fun openaiEmbedding(): Optional<OpenAIEmbeddingConfig> =
                Optional.ofNullable(openaiEmbedding)

            fun vertexaiEmbedding(): Optional<VertexAiEmbeddingConfig> =
                Optional.ofNullable(vertexaiEmbedding)

            fun isAzureEmbedding(): Boolean = azureEmbedding != null

            fun isBedrockEmbedding(): Boolean = bedrockEmbedding != null

            fun isCohereEmbedding(): Boolean = cohereEmbedding != null

            fun isGeminiEmbedding(): Boolean = geminiEmbedding != null

            fun isHuggingfaceApiEmbedding(): Boolean = huggingfaceApiEmbedding != null

            fun isOpenAIEmbedding(): Boolean = openaiEmbedding != null

            fun isVertexaiEmbedding(): Boolean = vertexaiEmbedding != null

            fun asAzureEmbedding(): AzureOpenAIEmbeddingConfig =
                azureEmbedding.getOrThrow("azureEmbedding")

            fun asBedrockEmbedding(): BedrockEmbeddingConfig =
                bedrockEmbedding.getOrThrow("bedrockEmbedding")

            fun asCohereEmbedding(): CohereEmbeddingConfig =
                cohereEmbedding.getOrThrow("cohereEmbedding")

            fun asGeminiEmbedding(): GeminiEmbeddingConfig =
                geminiEmbedding.getOrThrow("geminiEmbedding")

            fun asHuggingfaceApiEmbedding(): HuggingFaceInferenceApiEmbeddingConfig =
                huggingfaceApiEmbedding.getOrThrow("huggingfaceApiEmbedding")

            fun asOpenAIEmbedding(): OpenAIEmbeddingConfig =
                openaiEmbedding.getOrThrow("openaiEmbedding")

            fun asVertexaiEmbedding(): VertexAiEmbeddingConfig =
                vertexaiEmbedding.getOrThrow("vertexaiEmbedding")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.llamacloud_prod.api.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = embeddingConfig.accept(new EmbeddingConfig.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitAzureEmbedding(AzureOpenAIEmbeddingConfig azureEmbedding) {
             *         return Optional.of(azureEmbedding.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    azureEmbedding != null -> visitor.visitAzureEmbedding(azureEmbedding)
                    bedrockEmbedding != null -> visitor.visitBedrockEmbedding(bedrockEmbedding)
                    cohereEmbedding != null -> visitor.visitCohereEmbedding(cohereEmbedding)
                    geminiEmbedding != null -> visitor.visitGeminiEmbedding(geminiEmbedding)
                    huggingfaceApiEmbedding != null ->
                        visitor.visitHuggingfaceApiEmbedding(huggingfaceApiEmbedding)
                    openaiEmbedding != null -> visitor.visitOpenAIEmbedding(openaiEmbedding)
                    vertexaiEmbedding != null -> visitor.visitVertexaiEmbedding(vertexaiEmbedding)
                    else -> visitor.unknown(_json)
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
            fun validate(): EmbeddingConfig = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitAzureEmbedding(
                            azureEmbedding: AzureOpenAIEmbeddingConfig
                        ) {
                            azureEmbedding.validate()
                        }

                        override fun visitBedrockEmbedding(
                            bedrockEmbedding: BedrockEmbeddingConfig
                        ) {
                            bedrockEmbedding.validate()
                        }

                        override fun visitCohereEmbedding(cohereEmbedding: CohereEmbeddingConfig) {
                            cohereEmbedding.validate()
                        }

                        override fun visitGeminiEmbedding(geminiEmbedding: GeminiEmbeddingConfig) {
                            geminiEmbedding.validate()
                        }

                        override fun visitHuggingfaceApiEmbedding(
                            huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig
                        ) {
                            huggingfaceApiEmbedding.validate()
                        }

                        override fun visitOpenAIEmbedding(openaiEmbedding: OpenAIEmbeddingConfig) {
                            openaiEmbedding.validate()
                        }

                        override fun visitVertexaiEmbedding(
                            vertexaiEmbedding: VertexAiEmbeddingConfig
                        ) {
                            vertexaiEmbedding.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitAzureEmbedding(
                            azureEmbedding: AzureOpenAIEmbeddingConfig
                        ) = azureEmbedding.validity()

                        override fun visitBedrockEmbedding(
                            bedrockEmbedding: BedrockEmbeddingConfig
                        ) = bedrockEmbedding.validity()

                        override fun visitCohereEmbedding(cohereEmbedding: CohereEmbeddingConfig) =
                            cohereEmbedding.validity()

                        override fun visitGeminiEmbedding(geminiEmbedding: GeminiEmbeddingConfig) =
                            geminiEmbedding.validity()

                        override fun visitHuggingfaceApiEmbedding(
                            huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig
                        ) = huggingfaceApiEmbedding.validity()

                        override fun visitOpenAIEmbedding(openaiEmbedding: OpenAIEmbeddingConfig) =
                            openaiEmbedding.validity()

                        override fun visitVertexaiEmbedding(
                            vertexaiEmbedding: VertexAiEmbeddingConfig
                        ) = vertexaiEmbedding.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EmbeddingConfig &&
                    azureEmbedding == other.azureEmbedding &&
                    bedrockEmbedding == other.bedrockEmbedding &&
                    cohereEmbedding == other.cohereEmbedding &&
                    geminiEmbedding == other.geminiEmbedding &&
                    huggingfaceApiEmbedding == other.huggingfaceApiEmbedding &&
                    openaiEmbedding == other.openaiEmbedding &&
                    vertexaiEmbedding == other.vertexaiEmbedding
            }

            override fun hashCode(): Int =
                Objects.hash(
                    azureEmbedding,
                    bedrockEmbedding,
                    cohereEmbedding,
                    geminiEmbedding,
                    huggingfaceApiEmbedding,
                    openaiEmbedding,
                    vertexaiEmbedding,
                )

            override fun toString(): String =
                when {
                    azureEmbedding != null -> "EmbeddingConfig{azureEmbedding=$azureEmbedding}"
                    bedrockEmbedding != null ->
                        "EmbeddingConfig{bedrockEmbedding=$bedrockEmbedding}"
                    cohereEmbedding != null -> "EmbeddingConfig{cohereEmbedding=$cohereEmbedding}"
                    geminiEmbedding != null -> "EmbeddingConfig{geminiEmbedding=$geminiEmbedding}"
                    huggingfaceApiEmbedding != null ->
                        "EmbeddingConfig{huggingfaceApiEmbedding=$huggingfaceApiEmbedding}"
                    openaiEmbedding != null -> "EmbeddingConfig{openaiEmbedding=$openaiEmbedding}"
                    vertexaiEmbedding != null ->
                        "EmbeddingConfig{vertexaiEmbedding=$vertexaiEmbedding}"
                    _json != null -> "EmbeddingConfig{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid EmbeddingConfig")
                }

            companion object {

                @JvmStatic
                fun ofAzureEmbedding(azureEmbedding: AzureOpenAIEmbeddingConfig) =
                    EmbeddingConfig(azureEmbedding = azureEmbedding)

                @JvmStatic
                fun ofBedrockEmbedding(bedrockEmbedding: BedrockEmbeddingConfig) =
                    EmbeddingConfig(bedrockEmbedding = bedrockEmbedding)

                @JvmStatic
                fun ofCohereEmbedding(cohereEmbedding: CohereEmbeddingConfig) =
                    EmbeddingConfig(cohereEmbedding = cohereEmbedding)

                @JvmStatic
                fun ofGeminiEmbedding(geminiEmbedding: GeminiEmbeddingConfig) =
                    EmbeddingConfig(geminiEmbedding = geminiEmbedding)

                @JvmStatic
                fun ofHuggingfaceApiEmbedding(
                    huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig
                ) = EmbeddingConfig(huggingfaceApiEmbedding = huggingfaceApiEmbedding)

                @JvmStatic
                fun ofOpenAIEmbedding(openaiEmbedding: OpenAIEmbeddingConfig) =
                    EmbeddingConfig(openaiEmbedding = openaiEmbedding)

                @JvmStatic
                fun ofVertexaiEmbedding(vertexaiEmbedding: VertexAiEmbeddingConfig) =
                    EmbeddingConfig(vertexaiEmbedding = vertexaiEmbedding)
            }

            /**
             * An interface that defines how to map each variant of [EmbeddingConfig] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitAzureEmbedding(azureEmbedding: AzureOpenAIEmbeddingConfig): T

                fun visitBedrockEmbedding(bedrockEmbedding: BedrockEmbeddingConfig): T

                fun visitCohereEmbedding(cohereEmbedding: CohereEmbeddingConfig): T

                fun visitGeminiEmbedding(geminiEmbedding: GeminiEmbeddingConfig): T

                fun visitHuggingfaceApiEmbedding(
                    huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig
                ): T

                fun visitOpenAIEmbedding(openaiEmbedding: OpenAIEmbeddingConfig): T

                fun visitVertexaiEmbedding(vertexaiEmbedding: VertexAiEmbeddingConfig): T

                /**
                 * Maps an unknown variant of [EmbeddingConfig] to a value of type [T].
                 *
                 * An instance of [EmbeddingConfig] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LlamaCloudInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LlamaCloudInvalidDataException("Unknown EmbeddingConfig: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<EmbeddingConfig>(EmbeddingConfig::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): EmbeddingConfig {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                    when (type) {
                        "AZURE_EMBEDDING" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<AzureOpenAIEmbeddingConfig>(),
                                )
                                ?.let { EmbeddingConfig(azureEmbedding = it, _json = json) }
                                ?: EmbeddingConfig(_json = json)
                        }
                        "BEDROCK_EMBEDDING" -> {
                            return tryDeserialize(node, jacksonTypeRef<BedrockEmbeddingConfig>())
                                ?.let { EmbeddingConfig(bedrockEmbedding = it, _json = json) }
                                ?: EmbeddingConfig(_json = json)
                        }
                        "COHERE_EMBEDDING" -> {
                            return tryDeserialize(node, jacksonTypeRef<CohereEmbeddingConfig>())
                                ?.let { EmbeddingConfig(cohereEmbedding = it, _json = json) }
                                ?: EmbeddingConfig(_json = json)
                        }
                        "GEMINI_EMBEDDING" -> {
                            return tryDeserialize(node, jacksonTypeRef<GeminiEmbeddingConfig>())
                                ?.let { EmbeddingConfig(geminiEmbedding = it, _json = json) }
                                ?: EmbeddingConfig(_json = json)
                        }
                        "HUGGINGFACE_API_EMBEDDING" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<HuggingFaceInferenceApiEmbeddingConfig>(),
                                )
                                ?.let {
                                    EmbeddingConfig(huggingfaceApiEmbedding = it, _json = json)
                                } ?: EmbeddingConfig(_json = json)
                        }
                        "OPENAI_EMBEDDING" -> {
                            return tryDeserialize(node, jacksonTypeRef<OpenAIEmbeddingConfig>())
                                ?.let { EmbeddingConfig(openaiEmbedding = it, _json = json) }
                                ?: EmbeddingConfig(_json = json)
                        }
                        "VERTEXAI_EMBEDDING" -> {
                            return tryDeserialize(node, jacksonTypeRef<VertexAiEmbeddingConfig>())
                                ?.let { EmbeddingConfig(vertexaiEmbedding = it, _json = json) }
                                ?: EmbeddingConfig(_json = json)
                        }
                    }

                    return EmbeddingConfig(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<EmbeddingConfig>(EmbeddingConfig::class) {

                override fun serialize(
                    value: EmbeddingConfig,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.azureEmbedding != null -> generator.writeObject(value.azureEmbedding)
                        value.bedrockEmbedding != null ->
                            generator.writeObject(value.bedrockEmbedding)
                        value.cohereEmbedding != null ->
                            generator.writeObject(value.cohereEmbedding)
                        value.geminiEmbedding != null ->
                            generator.writeObject(value.geminiEmbedding)
                        value.huggingfaceApiEmbedding != null ->
                            generator.writeObject(value.huggingfaceApiEmbedding)
                        value.openaiEmbedding != null ->
                            generator.writeObject(value.openaiEmbedding)
                        value.vertexaiEmbedding != null ->
                            generator.writeObject(value.vertexaiEmbedding)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid EmbeddingConfig")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EmbeddingModelConfig &&
                id == other.id &&
                embeddingConfig == other.embeddingConfig &&
                name == other.name &&
                projectId == other.projectId &&
                createdAt == other.createdAt &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                embeddingConfig,
                name,
                projectId,
                createdAt,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EmbeddingModelConfig{id=$id, embeddingConfig=$embeddingConfig, name=$name, projectId=$projectId, createdAt=$createdAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** Status of the pipeline. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CREATED = of("CREATED")

            @JvmField val DELETING = of("DELETING")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CREATED,
            DELETING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREATED,
            DELETING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                CREATED -> Value.CREATED
                DELETING -> Value.DELETING
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
                CREATED -> Known.CREATED
                DELETING -> Known.DELETING
                else -> throw LlamaCloudInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Configuration for the transformation. */
    @JsonDeserialize(using = TransformConfig.Deserializer::class)
    @JsonSerialize(using = TransformConfig.Serializer::class)
    class TransformConfig
    private constructor(
        private val auto: AutoTransformConfig? = null,
        private val advancedMode: AdvancedModeTransformConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        fun auto(): Optional<AutoTransformConfig> = Optional.ofNullable(auto)

        fun advancedMode(): Optional<AdvancedModeTransformConfig> =
            Optional.ofNullable(advancedMode)

        fun isAuto(): Boolean = auto != null

        fun isAdvancedMode(): Boolean = advancedMode != null

        fun asAuto(): AutoTransformConfig = auto.getOrThrow("auto")

        fun asAdvancedMode(): AdvancedModeTransformConfig = advancedMode.getOrThrow("advancedMode")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.llamacloud_prod.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = transformConfig.accept(new TransformConfig.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitAuto(AutoTransformConfig auto) {
         *         return Optional.of(auto.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                auto != null -> visitor.visitAuto(auto)
                advancedMode != null -> visitor.visitAdvancedMode(advancedMode)
                else -> visitor.unknown(_json)
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
        fun validate(): TransformConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAuto(auto: AutoTransformConfig) {
                        auto.validate()
                    }

                    override fun visitAdvancedMode(advancedMode: AdvancedModeTransformConfig) {
                        advancedMode.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitAuto(auto: AutoTransformConfig) = auto.validity()

                    override fun visitAdvancedMode(advancedMode: AdvancedModeTransformConfig) =
                        advancedMode.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransformConfig &&
                auto == other.auto &&
                advancedMode == other.advancedMode
        }

        override fun hashCode(): Int = Objects.hash(auto, advancedMode)

        override fun toString(): String =
            when {
                auto != null -> "TransformConfig{auto=$auto}"
                advancedMode != null -> "TransformConfig{advancedMode=$advancedMode}"
                _json != null -> "TransformConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TransformConfig")
            }

        companion object {

            @JvmStatic fun ofAuto(auto: AutoTransformConfig) = TransformConfig(auto = auto)

            @JvmStatic
            fun ofAdvancedMode(advancedMode: AdvancedModeTransformConfig) =
                TransformConfig(advancedMode = advancedMode)
        }

        /**
         * An interface that defines how to map each variant of [TransformConfig] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitAuto(auto: AutoTransformConfig): T

            fun visitAdvancedMode(advancedMode: AdvancedModeTransformConfig): T

            /**
             * Maps an unknown variant of [TransformConfig] to a value of type [T].
             *
             * An instance of [TransformConfig] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown TransformConfig: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<TransformConfig>(TransformConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TransformConfig {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AutoTransformConfig>())?.let {
                                TransformConfig(auto = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AdvancedModeTransformConfig>())
                                ?.let { TransformConfig(advancedMode = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> TransformConfig(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<TransformConfig>(TransformConfig::class) {

            override fun serialize(
                value: TransformConfig,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.auto != null -> generator.writeObject(value.auto)
                    value.advancedMode != null -> generator.writeObject(value.advancedMode)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TransformConfig")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Pipeline &&
            id == other.id &&
            embeddingConfig == other.embeddingConfig &&
            name == other.name &&
            projectId == other.projectId &&
            configHash == other.configHash &&
            createdAt == other.createdAt &&
            dataSink == other.dataSink &&
            embeddingModelConfig == other.embeddingModelConfig &&
            embeddingModelConfigId == other.embeddingModelConfigId &&
            llamaParseParameters == other.llamaParseParameters &&
            managedPipelineId == other.managedPipelineId &&
            metadataConfig == other.metadataConfig &&
            pipelineType == other.pipelineType &&
            presetRetrievalParameters == other.presetRetrievalParameters &&
            sparseModelConfig == other.sparseModelConfig &&
            status == other.status &&
            transformConfig == other.transformConfig &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            embeddingConfig,
            name,
            projectId,
            configHash,
            createdAt,
            dataSink,
            embeddingModelConfig,
            embeddingModelConfigId,
            llamaParseParameters,
            managedPipelineId,
            metadataConfig,
            pipelineType,
            presetRetrievalParameters,
            sparseModelConfig,
            status,
            transformConfig,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Pipeline{id=$id, embeddingConfig=$embeddingConfig, name=$name, projectId=$projectId, configHash=$configHash, createdAt=$createdAt, dataSink=$dataSink, embeddingModelConfig=$embeddingModelConfig, embeddingModelConfigId=$embeddingModelConfigId, llamaParseParameters=$llamaParseParameters, managedPipelineId=$managedPipelineId, metadataConfig=$metadataConfig, pipelineType=$pipelineType, presetRetrievalParameters=$presetRetrievalParameters, sparseModelConfig=$sparseModelConfig, status=$status, transformConfig=$transformConfig, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
