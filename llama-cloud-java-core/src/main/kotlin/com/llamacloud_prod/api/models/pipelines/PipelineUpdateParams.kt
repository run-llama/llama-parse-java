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
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.allMaxBy
import com.llamacloud_prod.api.core.getOrThrow
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update an existing pipeline's configuration. */
@Deprecated("deprecated")
class PipelineUpdateParams
private constructor(
    private val pipelineId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pipelineId(): Optional<String> = Optional.ofNullable(pipelineId)

    /**
     * Schema for creating a data sink.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSink(): Optional<DataSinkCreate> = body.dataSink()

    /**
     * Data sink ID. When provided instead of data_sink, the data sink will be looked up by ID.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSinkId(): Optional<String> = body.dataSinkId()

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embeddingConfig(): Optional<EmbeddingConfig> = body.embeddingConfig()

    /**
     * Embedding model config ID. When provided instead of embedding_config, the embedding model
     * config will be looked up by ID.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embeddingModelConfigId(): Optional<String> = body.embeddingModelConfigId()

    /**
     * Settings that can be configured for how to use LlamaParse to parse files within a LlamaCloud
     * pipeline.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun llamaParseParameters(): Optional<LlamaParseParameters> = body.llamaParseParameters()

    /**
     * The ID of the ManagedPipeline this playground pipeline is linked to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedPipelineId(): Optional<String> = body.managedPipelineId()

    /**
     * Metadata configuration for the pipeline.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadataConfig(): Optional<PipelineMetadataConfig> = body.metadataConfig()

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Schema for the search params for an retrieval execution that can be preset for a pipeline.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presetRetrievalParameters(): Optional<PresetRetrievalParams> =
        body.presetRetrievalParameters()

    /**
     * Configuration for sparse embedding models used in hybrid search.
     *
     * This allows users to choose between Splade and BM25 models for sparse retrieval in managed
     * data sinks.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sparseModelConfig(): Optional<SparseModelConfig> = body.sparseModelConfig()

    /**
     * Status of the pipeline deployment.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = body.status()

    /**
     * Configuration for the transformation.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transformConfig(): Optional<TransformConfig> = body.transformConfig()

    /**
     * Returns the raw JSON value of [dataSink].
     *
     * Unlike [dataSink], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataSink(): JsonField<DataSinkCreate> = body._dataSink()

    /**
     * Returns the raw JSON value of [dataSinkId].
     *
     * Unlike [dataSinkId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataSinkId(): JsonField<String> = body._dataSinkId()

    /**
     * Returns the raw JSON value of [embeddingConfig].
     *
     * Unlike [embeddingConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _embeddingConfig(): JsonField<EmbeddingConfig> = body._embeddingConfig()

    /**
     * Returns the raw JSON value of [embeddingModelConfigId].
     *
     * Unlike [embeddingModelConfigId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _embeddingModelConfigId(): JsonField<String> = body._embeddingModelConfigId()

    /**
     * Returns the raw JSON value of [llamaParseParameters].
     *
     * Unlike [llamaParseParameters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    fun _llamaParseParameters(): JsonField<LlamaParseParameters> = body._llamaParseParameters()

    /**
     * Returns the raw JSON value of [managedPipelineId].
     *
     * Unlike [managedPipelineId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _managedPipelineId(): JsonField<String> = body._managedPipelineId()

    /**
     * Returns the raw JSON value of [metadataConfig].
     *
     * Unlike [metadataConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadataConfig(): JsonField<PipelineMetadataConfig> = body._metadataConfig()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [presetRetrievalParameters].
     *
     * Unlike [presetRetrievalParameters], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _presetRetrievalParameters(): JsonField<PresetRetrievalParams> =
        body._presetRetrievalParameters()

    /**
     * Returns the raw JSON value of [sparseModelConfig].
     *
     * Unlike [sparseModelConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sparseModelConfig(): JsonField<SparseModelConfig> = body._sparseModelConfig()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<String> = body._status()

    /**
     * Returns the raw JSON value of [transformConfig].
     *
     * Unlike [transformConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transformConfig(): JsonField<TransformConfig> = body._transformConfig()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PipelineUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PipelineUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineUpdateParams]. */
    class Builder internal constructor() {

        private var pipelineId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pipelineUpdateParams: PipelineUpdateParams) = apply {
            pipelineId = pipelineUpdateParams.pipelineId
            body = pipelineUpdateParams.body.toBuilder()
            additionalHeaders = pipelineUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = pipelineUpdateParams.additionalQueryParams.toBuilder()
        }

        fun pipelineId(pipelineId: String?) = apply { this.pipelineId = pipelineId }

        /** Alias for calling [Builder.pipelineId] with `pipelineId.orElse(null)`. */
        fun pipelineId(pipelineId: Optional<String>) = pipelineId(pipelineId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [dataSink]
         * - [dataSinkId]
         * - [embeddingConfig]
         * - [embeddingModelConfigId]
         * - [llamaParseParameters]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Schema for creating a data sink. */
        fun dataSink(dataSink: DataSinkCreate?) = apply { body.dataSink(dataSink) }

        /** Alias for calling [Builder.dataSink] with `dataSink.orElse(null)`. */
        fun dataSink(dataSink: Optional<DataSinkCreate>) = dataSink(dataSink.getOrNull())

        /**
         * Sets [Builder.dataSink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSink] with a well-typed [DataSinkCreate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataSink(dataSink: JsonField<DataSinkCreate>) = apply { body.dataSink(dataSink) }

        /**
         * Data sink ID. When provided instead of data_sink, the data sink will be looked up by ID.
         */
        fun dataSinkId(dataSinkId: String?) = apply { body.dataSinkId(dataSinkId) }

        /** Alias for calling [Builder.dataSinkId] with `dataSinkId.orElse(null)`. */
        fun dataSinkId(dataSinkId: Optional<String>) = dataSinkId(dataSinkId.getOrNull())

        /**
         * Sets [Builder.dataSinkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSinkId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataSinkId(dataSinkId: JsonField<String>) = apply { body.dataSinkId(dataSinkId) }

        fun embeddingConfig(embeddingConfig: EmbeddingConfig?) = apply {
            body.embeddingConfig(embeddingConfig)
        }

        /** Alias for calling [Builder.embeddingConfig] with `embeddingConfig.orElse(null)`. */
        fun embeddingConfig(embeddingConfig: Optional<EmbeddingConfig>) =
            embeddingConfig(embeddingConfig.getOrNull())

        /**
         * Sets [Builder.embeddingConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingConfig] with a well-typed [EmbeddingConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun embeddingConfig(embeddingConfig: JsonField<EmbeddingConfig>) = apply {
            body.embeddingConfig(embeddingConfig)
        }

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofAzureEmbedding(azureEmbedding)`.
         */
        fun embeddingConfig(azureEmbedding: AzureOpenAIEmbeddingConfig) = apply {
            body.embeddingConfig(azureEmbedding)
        }

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofBedrockEmbedding(bedrockEmbedding)`.
         */
        fun embeddingConfig(bedrockEmbedding: BedrockEmbeddingConfig) = apply {
            body.embeddingConfig(bedrockEmbedding)
        }

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofCohereEmbedding(cohereEmbedding)`.
         */
        fun embeddingConfig(cohereEmbedding: CohereEmbeddingConfig) = apply {
            body.embeddingConfig(cohereEmbedding)
        }

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofGeminiEmbedding(geminiEmbedding)`.
         */
        fun embeddingConfig(geminiEmbedding: GeminiEmbeddingConfig) = apply {
            body.embeddingConfig(geminiEmbedding)
        }

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofHuggingfaceApiEmbedding(huggingfaceApiEmbedding)`.
         */
        fun embeddingConfig(huggingfaceApiEmbedding: HuggingFaceInferenceApiEmbeddingConfig) =
            apply {
                body.embeddingConfig(huggingfaceApiEmbedding)
            }

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofOpenAIEmbedding(openaiEmbedding)`.
         */
        fun embeddingConfig(openaiEmbedding: OpenAIEmbeddingConfig) = apply {
            body.embeddingConfig(openaiEmbedding)
        }

        /**
         * Alias for calling [embeddingConfig] with
         * `EmbeddingConfig.ofVertexaiEmbedding(vertexaiEmbedding)`.
         */
        fun embeddingConfig(vertexaiEmbedding: VertexAiEmbeddingConfig) = apply {
            body.embeddingConfig(vertexaiEmbedding)
        }

        /**
         * Embedding model config ID. When provided instead of embedding_config, the embedding model
         * config will be looked up by ID.
         */
        fun embeddingModelConfigId(embeddingModelConfigId: String?) = apply {
            body.embeddingModelConfigId(embeddingModelConfigId)
        }

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
            body.embeddingModelConfigId(embeddingModelConfigId)
        }

        /**
         * Settings that can be configured for how to use LlamaParse to parse files within a
         * LlamaCloud pipeline.
         */
        @Deprecated("deprecated")
        fun llamaParseParameters(llamaParseParameters: LlamaParseParameters?) = apply {
            body.llamaParseParameters(llamaParseParameters)
        }

        /**
         * Alias for calling [Builder.llamaParseParameters] with
         * `llamaParseParameters.orElse(null)`.
         */
        @Deprecated("deprecated")
        fun llamaParseParameters(llamaParseParameters: Optional<LlamaParseParameters>) =
            llamaParseParameters(llamaParseParameters.getOrNull())

        /**
         * Sets [Builder.llamaParseParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llamaParseParameters] with a well-typed
         * [LlamaParseParameters] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun llamaParseParameters(llamaParseParameters: JsonField<LlamaParseParameters>) = apply {
            body.llamaParseParameters(llamaParseParameters)
        }

        /** The ID of the ManagedPipeline this playground pipeline is linked to. */
        fun managedPipelineId(managedPipelineId: String?) = apply {
            body.managedPipelineId(managedPipelineId)
        }

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
            body.managedPipelineId(managedPipelineId)
        }

        /** Metadata configuration for the pipeline. */
        fun metadataConfig(metadataConfig: PipelineMetadataConfig?) = apply {
            body.metadataConfig(metadataConfig)
        }

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
            body.metadataConfig(metadataConfig)
        }

        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Schema for the search params for an retrieval execution that can be preset for a
         * pipeline.
         */
        fun presetRetrievalParameters(presetRetrievalParameters: PresetRetrievalParams?) = apply {
            body.presetRetrievalParameters(presetRetrievalParameters)
        }

        /**
         * Alias for calling [Builder.presetRetrievalParameters] with
         * `presetRetrievalParameters.orElse(null)`.
         */
        fun presetRetrievalParameters(presetRetrievalParameters: Optional<PresetRetrievalParams>) =
            presetRetrievalParameters(presetRetrievalParameters.getOrNull())

        /**
         * Sets [Builder.presetRetrievalParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presetRetrievalParameters] with a well-typed
         * [PresetRetrievalParams] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun presetRetrievalParameters(presetRetrievalParameters: JsonField<PresetRetrievalParams>) =
            apply {
                body.presetRetrievalParameters(presetRetrievalParameters)
            }

        /**
         * Configuration for sparse embedding models used in hybrid search.
         *
         * This allows users to choose between Splade and BM25 models for sparse retrieval in
         * managed data sinks.
         */
        fun sparseModelConfig(sparseModelConfig: SparseModelConfig?) = apply {
            body.sparseModelConfig(sparseModelConfig)
        }

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
            body.sparseModelConfig(sparseModelConfig)
        }

        /** Status of the pipeline deployment. */
        fun status(status: String?) = apply { body.status(status) }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { body.status(status) }

        /** Configuration for the transformation. */
        fun transformConfig(transformConfig: TransformConfig?) = apply {
            body.transformConfig(transformConfig)
        }

        /** Alias for calling [Builder.transformConfig] with `transformConfig.orElse(null)`. */
        fun transformConfig(transformConfig: Optional<TransformConfig>) =
            transformConfig(transformConfig.getOrNull())

        /**
         * Sets [Builder.transformConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transformConfig] with a well-typed [TransformConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transformConfig(transformConfig: JsonField<TransformConfig>) = apply {
            body.transformConfig(transformConfig)
        }

        /** Alias for calling [transformConfig] with `TransformConfig.ofAuto(auto)`. */
        fun transformConfig(auto: AutoTransformConfig) = apply { body.transformConfig(auto) }

        /**
         * Alias for calling [transformConfig] with `TransformConfig.ofAdvancedMode(advancedMode)`.
         */
        fun transformConfig(advancedMode: AdvancedModeTransformConfig) = apply {
            body.transformConfig(advancedMode)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PipelineUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PipelineUpdateParams =
            PipelineUpdateParams(
                pipelineId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pipelineId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Schema for updating a pipeline. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dataSink: JsonField<DataSinkCreate>,
        private val dataSinkId: JsonField<String>,
        private val embeddingConfig: JsonField<EmbeddingConfig>,
        private val embeddingModelConfigId: JsonField<String>,
        private val llamaParseParameters: JsonField<LlamaParseParameters>,
        private val managedPipelineId: JsonField<String>,
        private val metadataConfig: JsonField<PipelineMetadataConfig>,
        private val name: JsonField<String>,
        private val presetRetrievalParameters: JsonField<PresetRetrievalParams>,
        private val sparseModelConfig: JsonField<SparseModelConfig>,
        private val status: JsonField<String>,
        private val transformConfig: JsonField<TransformConfig>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data_sink")
            @ExcludeMissing
            dataSink: JsonField<DataSinkCreate> = JsonMissing.of(),
            @JsonProperty("data_sink_id")
            @ExcludeMissing
            dataSinkId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("embedding_config")
            @ExcludeMissing
            embeddingConfig: JsonField<EmbeddingConfig> = JsonMissing.of(),
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
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("preset_retrieval_parameters")
            @ExcludeMissing
            presetRetrievalParameters: JsonField<PresetRetrievalParams> = JsonMissing.of(),
            @JsonProperty("sparse_model_config")
            @ExcludeMissing
            sparseModelConfig: JsonField<SparseModelConfig> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transform_config")
            @ExcludeMissing
            transformConfig: JsonField<TransformConfig> = JsonMissing.of(),
        ) : this(
            dataSink,
            dataSinkId,
            embeddingConfig,
            embeddingModelConfigId,
            llamaParseParameters,
            managedPipelineId,
            metadataConfig,
            name,
            presetRetrievalParameters,
            sparseModelConfig,
            status,
            transformConfig,
            mutableMapOf(),
        )

        /**
         * Schema for creating a data sink.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dataSink(): Optional<DataSinkCreate> = dataSink.getOptional("data_sink")

        /**
         * Data sink ID. When provided instead of data_sink, the data sink will be looked up by ID.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dataSinkId(): Optional<String> = dataSinkId.getOptional("data_sink_id")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun embeddingConfig(): Optional<EmbeddingConfig> =
            embeddingConfig.getOptional("embedding_config")

        /**
         * Embedding model config ID. When provided instead of embedding_config, the embedding model
         * config will be looked up by ID.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun embeddingModelConfigId(): Optional<String> =
            embeddingModelConfigId.getOptional("embedding_model_config_id")

        /**
         * Settings that can be configured for how to use LlamaParse to parse files within a
         * LlamaCloud pipeline.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun llamaParseParameters(): Optional<LlamaParseParameters> =
            llamaParseParameters.getOptional("llama_parse_parameters")

        /**
         * The ID of the ManagedPipeline this playground pipeline is linked to.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun managedPipelineId(): Optional<String> =
            managedPipelineId.getOptional("managed_pipeline_id")

        /**
         * Metadata configuration for the pipeline.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadataConfig(): Optional<PipelineMetadataConfig> =
            metadataConfig.getOptional("metadata_config")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Schema for the search params for an retrieval execution that can be preset for a
         * pipeline.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun presetRetrievalParameters(): Optional<PresetRetrievalParams> =
            presetRetrievalParameters.getOptional("preset_retrieval_parameters")

        /**
         * Configuration for sparse embedding models used in hybrid search.
         *
         * This allows users to choose between Splade and BM25 models for sparse retrieval in
         * managed data sinks.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sparseModelConfig(): Optional<SparseModelConfig> =
            sparseModelConfig.getOptional("sparse_model_config")

        /**
         * Status of the pipeline deployment.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Configuration for the transformation.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transformConfig(): Optional<TransformConfig> =
            transformConfig.getOptional("transform_config")

        /**
         * Returns the raw JSON value of [dataSink].
         *
         * Unlike [dataSink], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data_sink")
        @ExcludeMissing
        fun _dataSink(): JsonField<DataSinkCreate> = dataSink

        /**
         * Returns the raw JSON value of [dataSinkId].
         *
         * Unlike [dataSinkId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data_sink_id")
        @ExcludeMissing
        fun _dataSinkId(): JsonField<String> = dataSinkId

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
         * Unlike [llamaParseParameters], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
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
         * Unlike [metadataConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("metadata_config")
        @ExcludeMissing
        fun _metadataConfig(): JsonField<PipelineMetadataConfig> = metadataConfig

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [presetRetrievalParameters].
         *
         * Unlike [presetRetrievalParameters], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("preset_retrieval_parameters")
        @ExcludeMissing
        fun _presetRetrievalParameters(): JsonField<PresetRetrievalParams> =
            presetRetrievalParameters

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
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [transformConfig].
         *
         * Unlike [transformConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transform_config")
        @ExcludeMissing
        fun _transformConfig(): JsonField<TransformConfig> = transformConfig

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var dataSink: JsonField<DataSinkCreate> = JsonMissing.of()
            private var dataSinkId: JsonField<String> = JsonMissing.of()
            private var embeddingConfig: JsonField<EmbeddingConfig> = JsonMissing.of()
            private var embeddingModelConfigId: JsonField<String> = JsonMissing.of()
            private var llamaParseParameters: JsonField<LlamaParseParameters> = JsonMissing.of()
            private var managedPipelineId: JsonField<String> = JsonMissing.of()
            private var metadataConfig: JsonField<PipelineMetadataConfig> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var presetRetrievalParameters: JsonField<PresetRetrievalParams> =
                JsonMissing.of()
            private var sparseModelConfig: JsonField<SparseModelConfig> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var transformConfig: JsonField<TransformConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                dataSink = body.dataSink
                dataSinkId = body.dataSinkId
                embeddingConfig = body.embeddingConfig
                embeddingModelConfigId = body.embeddingModelConfigId
                llamaParseParameters = body.llamaParseParameters
                managedPipelineId = body.managedPipelineId
                metadataConfig = body.metadataConfig
                name = body.name
                presetRetrievalParameters = body.presetRetrievalParameters
                sparseModelConfig = body.sparseModelConfig
                status = body.status
                transformConfig = body.transformConfig
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Schema for creating a data sink. */
            fun dataSink(dataSink: DataSinkCreate?) = dataSink(JsonField.ofNullable(dataSink))

            /** Alias for calling [Builder.dataSink] with `dataSink.orElse(null)`. */
            fun dataSink(dataSink: Optional<DataSinkCreate>) = dataSink(dataSink.getOrNull())

            /**
             * Sets [Builder.dataSink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataSink] with a well-typed [DataSinkCreate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataSink(dataSink: JsonField<DataSinkCreate>) = apply { this.dataSink = dataSink }

            /**
             * Data sink ID. When provided instead of data_sink, the data sink will be looked up by
             * ID.
             */
            fun dataSinkId(dataSinkId: String?) = dataSinkId(JsonField.ofNullable(dataSinkId))

            /** Alias for calling [Builder.dataSinkId] with `dataSinkId.orElse(null)`. */
            fun dataSinkId(dataSinkId: Optional<String>) = dataSinkId(dataSinkId.getOrNull())

            /**
             * Sets [Builder.dataSinkId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataSinkId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataSinkId(dataSinkId: JsonField<String>) = apply { this.dataSinkId = dataSinkId }

            fun embeddingConfig(embeddingConfig: EmbeddingConfig?) =
                embeddingConfig(JsonField.ofNullable(embeddingConfig))

            /** Alias for calling [Builder.embeddingConfig] with `embeddingConfig.orElse(null)`. */
            fun embeddingConfig(embeddingConfig: Optional<EmbeddingConfig>) =
                embeddingConfig(embeddingConfig.getOrNull())

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

            /**
             * Embedding model config ID. When provided instead of embedding_config, the embedding
             * model config will be looked up by ID.
             */
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
             * You should usually call [Builder.embeddingModelConfigId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun embeddingModelConfigId(embeddingModelConfigId: JsonField<String>) = apply {
                this.embeddingModelConfigId = embeddingModelConfigId
            }

            /**
             * Settings that can be configured for how to use LlamaParse to parse files within a
             * LlamaCloud pipeline.
             */
            @Deprecated("deprecated")
            fun llamaParseParameters(llamaParseParameters: LlamaParseParameters?) =
                llamaParseParameters(JsonField.ofNullable(llamaParseParameters))

            /**
             * Alias for calling [Builder.llamaParseParameters] with
             * `llamaParseParameters.orElse(null)`.
             */
            @Deprecated("deprecated")
            fun llamaParseParameters(llamaParseParameters: Optional<LlamaParseParameters>) =
                llamaParseParameters(llamaParseParameters.getOrNull())

            /**
             * Sets [Builder.llamaParseParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llamaParseParameters] with a well-typed
             * [LlamaParseParameters] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun llamaParseParameters(llamaParseParameters: JsonField<LlamaParseParameters>) =
                apply {
                    this.llamaParseParameters = llamaParseParameters
                }

            /** The ID of the ManagedPipeline this playground pipeline is linked to. */
            fun managedPipelineId(managedPipelineId: String?) =
                managedPipelineId(JsonField.ofNullable(managedPipelineId))

            /**
             * Alias for calling [Builder.managedPipelineId] with `managedPipelineId.orElse(null)`.
             */
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
             * [PipelineMetadataConfig] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun metadataConfig(metadataConfig: JsonField<PipelineMetadataConfig>) = apply {
                this.metadataConfig = metadataConfig
            }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Schema for the search params for an retrieval execution that can be preset for a
             * pipeline.
             */
            fun presetRetrievalParameters(presetRetrievalParameters: PresetRetrievalParams?) =
                presetRetrievalParameters(JsonField.ofNullable(presetRetrievalParameters))

            /**
             * Alias for calling [Builder.presetRetrievalParameters] with
             * `presetRetrievalParameters.orElse(null)`.
             */
            fun presetRetrievalParameters(
                presetRetrievalParameters: Optional<PresetRetrievalParams>
            ) = presetRetrievalParameters(presetRetrievalParameters.getOrNull())

            /**
             * Sets [Builder.presetRetrievalParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presetRetrievalParameters] with a well-typed
             * [PresetRetrievalParams] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun presetRetrievalParameters(
                presetRetrievalParameters: JsonField<PresetRetrievalParams>
            ) = apply { this.presetRetrievalParameters = presetRetrievalParameters }

            /**
             * Configuration for sparse embedding models used in hybrid search.
             *
             * This allows users to choose between Splade and BM25 models for sparse retrieval in
             * managed data sinks.
             */
            fun sparseModelConfig(sparseModelConfig: SparseModelConfig?) =
                sparseModelConfig(JsonField.ofNullable(sparseModelConfig))

            /**
             * Alias for calling [Builder.sparseModelConfig] with `sparseModelConfig.orElse(null)`.
             */
            fun sparseModelConfig(sparseModelConfig: Optional<SparseModelConfig>) =
                sparseModelConfig(sparseModelConfig.getOrNull())

            /**
             * Sets [Builder.sparseModelConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sparseModelConfig] with a well-typed
             * [SparseModelConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun sparseModelConfig(sparseModelConfig: JsonField<SparseModelConfig>) = apply {
                this.sparseModelConfig = sparseModelConfig
            }

            /** Status of the pipeline deployment. */
            fun status(status: String?) = status(JsonField.ofNullable(status))

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<String>) = status(status.getOrNull())

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Configuration for the transformation. */
            fun transformConfig(transformConfig: TransformConfig?) =
                transformConfig(JsonField.ofNullable(transformConfig))

            /** Alias for calling [Builder.transformConfig] with `transformConfig.orElse(null)`. */
            fun transformConfig(transformConfig: Optional<TransformConfig>) =
                transformConfig(transformConfig.getOrNull())

            /**
             * Sets [Builder.transformConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transformConfig] with a well-typed [TransformConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transformConfig(transformConfig: JsonField<TransformConfig>) = apply {
                this.transformConfig = transformConfig
            }

            /** Alias for calling [transformConfig] with `TransformConfig.ofAuto(auto)`. */
            fun transformConfig(auto: AutoTransformConfig) =
                transformConfig(TransformConfig.ofAuto(auto))

            /**
             * Alias for calling [transformConfig] with
             * `TransformConfig.ofAdvancedMode(advancedMode)`.
             */
            fun transformConfig(advancedMode: AdvancedModeTransformConfig) =
                transformConfig(TransformConfig.ofAdvancedMode(advancedMode))

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    dataSink,
                    dataSinkId,
                    embeddingConfig,
                    embeddingModelConfigId,
                    llamaParseParameters,
                    managedPipelineId,
                    metadataConfig,
                    name,
                    presetRetrievalParameters,
                    sparseModelConfig,
                    status,
                    transformConfig,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            dataSink().ifPresent { it.validate() }
            dataSinkId()
            embeddingConfig().ifPresent { it.validate() }
            embeddingModelConfigId()
            llamaParseParameters().ifPresent { it.validate() }
            managedPipelineId()
            metadataConfig().ifPresent { it.validate() }
            name()
            presetRetrievalParameters().ifPresent { it.validate() }
            sparseModelConfig().ifPresent { it.validate() }
            status()
            transformConfig().ifPresent { it.validate() }
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
            (dataSink.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dataSinkId.asKnown().isPresent) 1 else 0) +
                (embeddingConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (embeddingModelConfigId.asKnown().isPresent) 1 else 0) +
                (llamaParseParameters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (managedPipelineId.asKnown().isPresent) 1 else 0) +
                (metadataConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (presetRetrievalParameters.asKnown().getOrNull()?.validity() ?: 0) +
                (sparseModelConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (transformConfig.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                dataSink == other.dataSink &&
                dataSinkId == other.dataSinkId &&
                embeddingConfig == other.embeddingConfig &&
                embeddingModelConfigId == other.embeddingModelConfigId &&
                llamaParseParameters == other.llamaParseParameters &&
                managedPipelineId == other.managedPipelineId &&
                metadataConfig == other.metadataConfig &&
                name == other.name &&
                presetRetrievalParameters == other.presetRetrievalParameters &&
                sparseModelConfig == other.sparseModelConfig &&
                status == other.status &&
                transformConfig == other.transformConfig &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dataSink,
                dataSinkId,
                embeddingConfig,
                embeddingModelConfigId,
                llamaParseParameters,
                managedPipelineId,
                metadataConfig,
                name,
                presetRetrievalParameters,
                sparseModelConfig,
                status,
                transformConfig,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dataSink=$dataSink, dataSinkId=$dataSinkId, embeddingConfig=$embeddingConfig, embeddingModelConfigId=$embeddingModelConfigId, llamaParseParameters=$llamaParseParameters, managedPipelineId=$managedPipelineId, metadataConfig=$metadataConfig, name=$name, presetRetrievalParameters=$presetRetrievalParameters, sparseModelConfig=$sparseModelConfig, status=$status, transformConfig=$transformConfig, additionalProperties=$additionalProperties}"
    }

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
                bedrockEmbedding != null -> "EmbeddingConfig{bedrockEmbedding=$bedrockEmbedding}"
                cohereEmbedding != null -> "EmbeddingConfig{cohereEmbedding=$cohereEmbedding}"
                geminiEmbedding != null -> "EmbeddingConfig{geminiEmbedding=$geminiEmbedding}"
                huggingfaceApiEmbedding != null ->
                    "EmbeddingConfig{huggingfaceApiEmbedding=$huggingfaceApiEmbedding}"
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
                    value.openaiEmbedding != null -> generator.writeObject(value.openaiEmbedding)
                    value.vertexaiEmbedding != null ->
                        generator.writeObject(value.vertexaiEmbedding)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid EmbeddingConfig")
                }
            }
        }
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

        return other is PipelineUpdateParams &&
            pipelineId == other.pipelineId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pipelineId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PipelineUpdateParams{pipelineId=$pipelineId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
