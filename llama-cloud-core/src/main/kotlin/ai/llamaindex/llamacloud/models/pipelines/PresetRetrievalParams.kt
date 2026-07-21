// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
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

/** Schema for the search params for an retrieval execution that can be preset for a pipeline. */
class PresetRetrievalParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val alpha: JsonField<Double>,
    private val className: JsonField<String>,
    private val denseSimilarityCutoff: JsonField<Double>,
    private val denseSimilarityTopK: JsonField<Long>,
    private val enableReranking: JsonField<Boolean>,
    private val filesTopK: JsonField<Long>,
    private val rerankTopN: JsonField<Long>,
    private val retrievalMode: JsonField<RetrievalMode>,
    private val retrieveImageNodes: JsonField<Boolean>,
    private val retrievePageFigureNodes: JsonField<Boolean>,
    private val retrievePageScreenshotNodes: JsonField<Boolean>,
    private val searchFilters: JsonField<MetadataFilters>,
    private val searchFiltersInferenceSchema: JsonField<SearchFiltersInferenceSchema>,
    private val sparseSimilarityTopK: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("alpha") @ExcludeMissing alpha: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dense_similarity_cutoff")
        @ExcludeMissing
        denseSimilarityCutoff: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dense_similarity_top_k")
        @ExcludeMissing
        denseSimilarityTopK: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("enable_reranking")
        @ExcludeMissing
        enableReranking: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("files_top_k") @ExcludeMissing filesTopK: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rerank_top_n")
        @ExcludeMissing
        rerankTopN: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("retrieval_mode")
        @ExcludeMissing
        retrievalMode: JsonField<RetrievalMode> = JsonMissing.of(),
        @JsonProperty("retrieve_image_nodes")
        @ExcludeMissing
        retrieveImageNodes: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("retrieve_page_figure_nodes")
        @ExcludeMissing
        retrievePageFigureNodes: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("retrieve_page_screenshot_nodes")
        @ExcludeMissing
        retrievePageScreenshotNodes: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("search_filters")
        @ExcludeMissing
        searchFilters: JsonField<MetadataFilters> = JsonMissing.of(),
        @JsonProperty("search_filters_inference_schema")
        @ExcludeMissing
        searchFiltersInferenceSchema: JsonField<SearchFiltersInferenceSchema> = JsonMissing.of(),
        @JsonProperty("sparse_similarity_top_k")
        @ExcludeMissing
        sparseSimilarityTopK: JsonField<Long> = JsonMissing.of(),
    ) : this(
        alpha,
        className,
        denseSimilarityCutoff,
        denseSimilarityTopK,
        enableReranking,
        filesTopK,
        rerankTopN,
        retrievalMode,
        retrieveImageNodes,
        retrievePageFigureNodes,
        retrievePageScreenshotNodes,
        searchFilters,
        searchFiltersInferenceSchema,
        sparseSimilarityTopK,
        mutableMapOf(),
    )

    /**
     * Alpha value for hybrid retrieval to determine the weights between dense and sparse retrieval.
     * 0 is sparse retrieval and 1 is dense retrieval.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alpha(): Optional<Double> = alpha.getOptional("alpha")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * Minimum similarity score wrt query for retrieval
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun denseSimilarityCutoff(): Optional<Double> =
        denseSimilarityCutoff.getOptional("dense_similarity_cutoff")

    /**
     * Number of nodes for dense retrieval.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun denseSimilarityTopK(): Optional<Long> =
        denseSimilarityTopK.getOptional("dense_similarity_top_k")

    /**
     * Enable reranking for retrieval
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableReranking(): Optional<Boolean> = enableReranking.getOptional("enable_reranking")

    /**
     * Number of files to retrieve (only for retrieval mode files_via_metadata and
     * files_via_content).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filesTopK(): Optional<Long> = filesTopK.getOptional("files_top_k")

    /**
     * Number of reranked nodes for returning.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rerankTopN(): Optional<Long> = rerankTopN.getOptional("rerank_top_n")

    /**
     * The retrieval mode for the query.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retrievalMode(): Optional<RetrievalMode> = retrievalMode.getOptional("retrieval_mode")

    /**
     * Whether to retrieve image nodes.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun retrieveImageNodes(): Optional<Boolean> =
        retrieveImageNodes.getOptional("retrieve_image_nodes")

    /**
     * Whether to retrieve page figure nodes.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retrievePageFigureNodes(): Optional<Boolean> =
        retrievePageFigureNodes.getOptional("retrieve_page_figure_nodes")

    /**
     * Whether to retrieve page screenshot nodes.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retrievePageScreenshotNodes(): Optional<Boolean> =
        retrievePageScreenshotNodes.getOptional("retrieve_page_screenshot_nodes")

    /**
     * Metadata filters for vector stores.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchFilters(): Optional<MetadataFilters> = searchFilters.getOptional("search_filters")

    /**
     * JSON Schema that will be used to infer search_filters. Omit or leave as null to skip
     * inference.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchFiltersInferenceSchema(): Optional<SearchFiltersInferenceSchema> =
        searchFiltersInferenceSchema.getOptional("search_filters_inference_schema")

    /**
     * Number of nodes for sparse retrieval.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sparseSimilarityTopK(): Optional<Long> =
        sparseSimilarityTopK.getOptional("sparse_similarity_top_k")

    /**
     * Returns the raw JSON value of [alpha].
     *
     * Unlike [alpha], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alpha") @ExcludeMissing fun _alpha(): JsonField<Double> = alpha

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [denseSimilarityCutoff].
     *
     * Unlike [denseSimilarityCutoff], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dense_similarity_cutoff")
    @ExcludeMissing
    fun _denseSimilarityCutoff(): JsonField<Double> = denseSimilarityCutoff

    /**
     * Returns the raw JSON value of [denseSimilarityTopK].
     *
     * Unlike [denseSimilarityTopK], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dense_similarity_top_k")
    @ExcludeMissing
    fun _denseSimilarityTopK(): JsonField<Long> = denseSimilarityTopK

    /**
     * Returns the raw JSON value of [enableReranking].
     *
     * Unlike [enableReranking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enable_reranking")
    @ExcludeMissing
    fun _enableReranking(): JsonField<Boolean> = enableReranking

    /**
     * Returns the raw JSON value of [filesTopK].
     *
     * Unlike [filesTopK], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("files_top_k") @ExcludeMissing fun _filesTopK(): JsonField<Long> = filesTopK

    /**
     * Returns the raw JSON value of [rerankTopN].
     *
     * Unlike [rerankTopN], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rerank_top_n") @ExcludeMissing fun _rerankTopN(): JsonField<Long> = rerankTopN

    /**
     * Returns the raw JSON value of [retrievalMode].
     *
     * Unlike [retrievalMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retrieval_mode")
    @ExcludeMissing
    fun _retrievalMode(): JsonField<RetrievalMode> = retrievalMode

    /**
     * Returns the raw JSON value of [retrieveImageNodes].
     *
     * Unlike [retrieveImageNodes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("retrieve_image_nodes")
    @ExcludeMissing
    fun _retrieveImageNodes(): JsonField<Boolean> = retrieveImageNodes

    /**
     * Returns the raw JSON value of [retrievePageFigureNodes].
     *
     * Unlike [retrievePageFigureNodes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("retrieve_page_figure_nodes")
    @ExcludeMissing
    fun _retrievePageFigureNodes(): JsonField<Boolean> = retrievePageFigureNodes

    /**
     * Returns the raw JSON value of [retrievePageScreenshotNodes].
     *
     * Unlike [retrievePageScreenshotNodes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("retrieve_page_screenshot_nodes")
    @ExcludeMissing
    fun _retrievePageScreenshotNodes(): JsonField<Boolean> = retrievePageScreenshotNodes

    /**
     * Returns the raw JSON value of [searchFilters].
     *
     * Unlike [searchFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("search_filters")
    @ExcludeMissing
    fun _searchFilters(): JsonField<MetadataFilters> = searchFilters

    /**
     * Returns the raw JSON value of [searchFiltersInferenceSchema].
     *
     * Unlike [searchFiltersInferenceSchema], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("search_filters_inference_schema")
    @ExcludeMissing
    fun _searchFiltersInferenceSchema(): JsonField<SearchFiltersInferenceSchema> =
        searchFiltersInferenceSchema

    /**
     * Returns the raw JSON value of [sparseSimilarityTopK].
     *
     * Unlike [sparseSimilarityTopK], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sparse_similarity_top_k")
    @ExcludeMissing
    fun _sparseSimilarityTopK(): JsonField<Long> = sparseSimilarityTopK

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

        /** Returns a mutable builder for constructing an instance of [PresetRetrievalParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PresetRetrievalParams]. */
    class Builder internal constructor() {

        private var alpha: JsonField<Double> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var denseSimilarityCutoff: JsonField<Double> = JsonMissing.of()
        private var denseSimilarityTopK: JsonField<Long> = JsonMissing.of()
        private var enableReranking: JsonField<Boolean> = JsonMissing.of()
        private var filesTopK: JsonField<Long> = JsonMissing.of()
        private var rerankTopN: JsonField<Long> = JsonMissing.of()
        private var retrievalMode: JsonField<RetrievalMode> = JsonMissing.of()
        private var retrieveImageNodes: JsonField<Boolean> = JsonMissing.of()
        private var retrievePageFigureNodes: JsonField<Boolean> = JsonMissing.of()
        private var retrievePageScreenshotNodes: JsonField<Boolean> = JsonMissing.of()
        private var searchFilters: JsonField<MetadataFilters> = JsonMissing.of()
        private var searchFiltersInferenceSchema: JsonField<SearchFiltersInferenceSchema> =
            JsonMissing.of()
        private var sparseSimilarityTopK: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(presetRetrievalParams: PresetRetrievalParams) = apply {
            alpha = presetRetrievalParams.alpha
            className = presetRetrievalParams.className
            denseSimilarityCutoff = presetRetrievalParams.denseSimilarityCutoff
            denseSimilarityTopK = presetRetrievalParams.denseSimilarityTopK
            enableReranking = presetRetrievalParams.enableReranking
            filesTopK = presetRetrievalParams.filesTopK
            rerankTopN = presetRetrievalParams.rerankTopN
            retrievalMode = presetRetrievalParams.retrievalMode
            retrieveImageNodes = presetRetrievalParams.retrieveImageNodes
            retrievePageFigureNodes = presetRetrievalParams.retrievePageFigureNodes
            retrievePageScreenshotNodes = presetRetrievalParams.retrievePageScreenshotNodes
            searchFilters = presetRetrievalParams.searchFilters
            searchFiltersInferenceSchema = presetRetrievalParams.searchFiltersInferenceSchema
            sparseSimilarityTopK = presetRetrievalParams.sparseSimilarityTopK
            additionalProperties = presetRetrievalParams.additionalProperties.toMutableMap()
        }

        /**
         * Alpha value for hybrid retrieval to determine the weights between dense and sparse
         * retrieval. 0 is sparse retrieval and 1 is dense retrieval.
         */
        fun alpha(alpha: Double?) = alpha(JsonField.ofNullable(alpha))

        /**
         * Alias for [Builder.alpha].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun alpha(alpha: Double) = alpha(alpha as Double?)

        /** Alias for calling [Builder.alpha] with `alpha.orElse(null)`. */
        fun alpha(alpha: Optional<Double>) = alpha(alpha.getOrNull())

        /**
         * Sets [Builder.alpha] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alpha] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alpha(alpha: JsonField<Double>) = apply { this.alpha = alpha }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** Minimum similarity score wrt query for retrieval */
        fun denseSimilarityCutoff(denseSimilarityCutoff: Double?) =
            denseSimilarityCutoff(JsonField.ofNullable(denseSimilarityCutoff))

        /**
         * Alias for [Builder.denseSimilarityCutoff].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun denseSimilarityCutoff(denseSimilarityCutoff: Double) =
            denseSimilarityCutoff(denseSimilarityCutoff as Double?)

        /**
         * Alias for calling [Builder.denseSimilarityCutoff] with
         * `denseSimilarityCutoff.orElse(null)`.
         */
        fun denseSimilarityCutoff(denseSimilarityCutoff: Optional<Double>) =
            denseSimilarityCutoff(denseSimilarityCutoff.getOrNull())

        /**
         * Sets [Builder.denseSimilarityCutoff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.denseSimilarityCutoff] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun denseSimilarityCutoff(denseSimilarityCutoff: JsonField<Double>) = apply {
            this.denseSimilarityCutoff = denseSimilarityCutoff
        }

        /** Number of nodes for dense retrieval. */
        fun denseSimilarityTopK(denseSimilarityTopK: Long?) =
            denseSimilarityTopK(JsonField.ofNullable(denseSimilarityTopK))

        /**
         * Alias for [Builder.denseSimilarityTopK].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun denseSimilarityTopK(denseSimilarityTopK: Long) =
            denseSimilarityTopK(denseSimilarityTopK as Long?)

        /**
         * Alias for calling [Builder.denseSimilarityTopK] with `denseSimilarityTopK.orElse(null)`.
         */
        fun denseSimilarityTopK(denseSimilarityTopK: Optional<Long>) =
            denseSimilarityTopK(denseSimilarityTopK.getOrNull())

        /**
         * Sets [Builder.denseSimilarityTopK] to an arbitrary JSON value.
         *
         * You should usually call [Builder.denseSimilarityTopK] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun denseSimilarityTopK(denseSimilarityTopK: JsonField<Long>) = apply {
            this.denseSimilarityTopK = denseSimilarityTopK
        }

        /** Enable reranking for retrieval */
        fun enableReranking(enableReranking: Boolean?) =
            enableReranking(JsonField.ofNullable(enableReranking))

        /**
         * Alias for [Builder.enableReranking].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun enableReranking(enableReranking: Boolean) = enableReranking(enableReranking as Boolean?)

        /** Alias for calling [Builder.enableReranking] with `enableReranking.orElse(null)`. */
        fun enableReranking(enableReranking: Optional<Boolean>) =
            enableReranking(enableReranking.getOrNull())

        /**
         * Sets [Builder.enableReranking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableReranking] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableReranking(enableReranking: JsonField<Boolean>) = apply {
            this.enableReranking = enableReranking
        }

        /**
         * Number of files to retrieve (only for retrieval mode files_via_metadata and
         * files_via_content).
         */
        fun filesTopK(filesTopK: Long?) = filesTopK(JsonField.ofNullable(filesTopK))

        /**
         * Alias for [Builder.filesTopK].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun filesTopK(filesTopK: Long) = filesTopK(filesTopK as Long?)

        /** Alias for calling [Builder.filesTopK] with `filesTopK.orElse(null)`. */
        fun filesTopK(filesTopK: Optional<Long>) = filesTopK(filesTopK.getOrNull())

        /**
         * Sets [Builder.filesTopK] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filesTopK] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filesTopK(filesTopK: JsonField<Long>) = apply { this.filesTopK = filesTopK }

        /** Number of reranked nodes for returning. */
        fun rerankTopN(rerankTopN: Long?) = rerankTopN(JsonField.ofNullable(rerankTopN))

        /**
         * Alias for [Builder.rerankTopN].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun rerankTopN(rerankTopN: Long) = rerankTopN(rerankTopN as Long?)

        /** Alias for calling [Builder.rerankTopN] with `rerankTopN.orElse(null)`. */
        fun rerankTopN(rerankTopN: Optional<Long>) = rerankTopN(rerankTopN.getOrNull())

        /**
         * Sets [Builder.rerankTopN] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rerankTopN] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rerankTopN(rerankTopN: JsonField<Long>) = apply { this.rerankTopN = rerankTopN }

        /** The retrieval mode for the query. */
        fun retrievalMode(retrievalMode: RetrievalMode) = retrievalMode(JsonField.of(retrievalMode))

        /**
         * Sets [Builder.retrievalMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrievalMode] with a well-typed [RetrievalMode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun retrievalMode(retrievalMode: JsonField<RetrievalMode>) = apply {
            this.retrievalMode = retrievalMode
        }

        /** Whether to retrieve image nodes. */
        @Deprecated("deprecated")
        fun retrieveImageNodes(retrieveImageNodes: Boolean) =
            retrieveImageNodes(JsonField.of(retrieveImageNodes))

        /**
         * Sets [Builder.retrieveImageNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrieveImageNodes] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun retrieveImageNodes(retrieveImageNodes: JsonField<Boolean>) = apply {
            this.retrieveImageNodes = retrieveImageNodes
        }

        /** Whether to retrieve page figure nodes. */
        fun retrievePageFigureNodes(retrievePageFigureNodes: Boolean) =
            retrievePageFigureNodes(JsonField.of(retrievePageFigureNodes))

        /**
         * Sets [Builder.retrievePageFigureNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrievePageFigureNodes] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun retrievePageFigureNodes(retrievePageFigureNodes: JsonField<Boolean>) = apply {
            this.retrievePageFigureNodes = retrievePageFigureNodes
        }

        /** Whether to retrieve page screenshot nodes. */
        fun retrievePageScreenshotNodes(retrievePageScreenshotNodes: Boolean) =
            retrievePageScreenshotNodes(JsonField.of(retrievePageScreenshotNodes))

        /**
         * Sets [Builder.retrievePageScreenshotNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrievePageScreenshotNodes] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun retrievePageScreenshotNodes(retrievePageScreenshotNodes: JsonField<Boolean>) = apply {
            this.retrievePageScreenshotNodes = retrievePageScreenshotNodes
        }

        /** Metadata filters for vector stores. */
        fun searchFilters(searchFilters: MetadataFilters?) =
            searchFilters(JsonField.ofNullable(searchFilters))

        /** Alias for calling [Builder.searchFilters] with `searchFilters.orElse(null)`. */
        fun searchFilters(searchFilters: Optional<MetadataFilters>) =
            searchFilters(searchFilters.getOrNull())

        /**
         * Sets [Builder.searchFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchFilters] with a well-typed [MetadataFilters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun searchFilters(searchFilters: JsonField<MetadataFilters>) = apply {
            this.searchFilters = searchFilters
        }

        /**
         * JSON Schema that will be used to infer search_filters. Omit or leave as null to skip
         * inference.
         */
        fun searchFiltersInferenceSchema(
            searchFiltersInferenceSchema: SearchFiltersInferenceSchema?
        ) = searchFiltersInferenceSchema(JsonField.ofNullable(searchFiltersInferenceSchema))

        /**
         * Alias for calling [Builder.searchFiltersInferenceSchema] with
         * `searchFiltersInferenceSchema.orElse(null)`.
         */
        fun searchFiltersInferenceSchema(
            searchFiltersInferenceSchema: Optional<SearchFiltersInferenceSchema>
        ) = searchFiltersInferenceSchema(searchFiltersInferenceSchema.getOrNull())

        /**
         * Sets [Builder.searchFiltersInferenceSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchFiltersInferenceSchema] with a well-typed
         * [SearchFiltersInferenceSchema] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun searchFiltersInferenceSchema(
            searchFiltersInferenceSchema: JsonField<SearchFiltersInferenceSchema>
        ) = apply { this.searchFiltersInferenceSchema = searchFiltersInferenceSchema }

        /** Number of nodes for sparse retrieval. */
        fun sparseSimilarityTopK(sparseSimilarityTopK: Long?) =
            sparseSimilarityTopK(JsonField.ofNullable(sparseSimilarityTopK))

        /**
         * Alias for [Builder.sparseSimilarityTopK].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sparseSimilarityTopK(sparseSimilarityTopK: Long) =
            sparseSimilarityTopK(sparseSimilarityTopK as Long?)

        /**
         * Alias for calling [Builder.sparseSimilarityTopK] with
         * `sparseSimilarityTopK.orElse(null)`.
         */
        fun sparseSimilarityTopK(sparseSimilarityTopK: Optional<Long>) =
            sparseSimilarityTopK(sparseSimilarityTopK.getOrNull())

        /**
         * Sets [Builder.sparseSimilarityTopK] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sparseSimilarityTopK] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sparseSimilarityTopK(sparseSimilarityTopK: JsonField<Long>) = apply {
            this.sparseSimilarityTopK = sparseSimilarityTopK
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
         * Returns an immutable instance of [PresetRetrievalParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PresetRetrievalParams =
            PresetRetrievalParams(
                alpha,
                className,
                denseSimilarityCutoff,
                denseSimilarityTopK,
                enableReranking,
                filesTopK,
                rerankTopN,
                retrievalMode,
                retrieveImageNodes,
                retrievePageFigureNodes,
                retrievePageScreenshotNodes,
                searchFilters,
                searchFiltersInferenceSchema,
                sparseSimilarityTopK,
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
    fun validate(): PresetRetrievalParams = apply {
        if (validated) {
            return@apply
        }

        alpha()
        className()
        denseSimilarityCutoff()
        denseSimilarityTopK()
        enableReranking()
        filesTopK()
        rerankTopN()
        retrievalMode().ifPresent { it.validate() }
        retrieveImageNodes()
        retrievePageFigureNodes()
        retrievePageScreenshotNodes()
        searchFilters().ifPresent { it.validate() }
        searchFiltersInferenceSchema().ifPresent { it.validate() }
        sparseSimilarityTopK()
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
        (if (alpha.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (denseSimilarityCutoff.asKnown().isPresent) 1 else 0) +
            (if (denseSimilarityTopK.asKnown().isPresent) 1 else 0) +
            (if (enableReranking.asKnown().isPresent) 1 else 0) +
            (if (filesTopK.asKnown().isPresent) 1 else 0) +
            (if (rerankTopN.asKnown().isPresent) 1 else 0) +
            (retrievalMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (retrieveImageNodes.asKnown().isPresent) 1 else 0) +
            (if (retrievePageFigureNodes.asKnown().isPresent) 1 else 0) +
            (if (retrievePageScreenshotNodes.asKnown().isPresent) 1 else 0) +
            (searchFilters.asKnown().getOrNull()?.validity() ?: 0) +
            (searchFiltersInferenceSchema.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sparseSimilarityTopK.asKnown().isPresent) 1 else 0)

    /**
     * JSON Schema that will be used to infer search_filters. Omit or leave as null to skip
     * inference.
     */
    class SearchFiltersInferenceSchema
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

            /**
             * Returns a mutable builder for constructing an instance of
             * [SearchFiltersInferenceSchema].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SearchFiltersInferenceSchema]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(searchFiltersInferenceSchema: SearchFiltersInferenceSchema) = apply {
                additionalProperties =
                    searchFiltersInferenceSchema.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SearchFiltersInferenceSchema].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SearchFiltersInferenceSchema =
                SearchFiltersInferenceSchema(additionalProperties.toImmutable())
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
        fun validate(): SearchFiltersInferenceSchema = apply {
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

            return other is SearchFiltersInferenceSchema &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SearchFiltersInferenceSchema{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PresetRetrievalParams &&
            alpha == other.alpha &&
            className == other.className &&
            denseSimilarityCutoff == other.denseSimilarityCutoff &&
            denseSimilarityTopK == other.denseSimilarityTopK &&
            enableReranking == other.enableReranking &&
            filesTopK == other.filesTopK &&
            rerankTopN == other.rerankTopN &&
            retrievalMode == other.retrievalMode &&
            retrieveImageNodes == other.retrieveImageNodes &&
            retrievePageFigureNodes == other.retrievePageFigureNodes &&
            retrievePageScreenshotNodes == other.retrievePageScreenshotNodes &&
            searchFilters == other.searchFilters &&
            searchFiltersInferenceSchema == other.searchFiltersInferenceSchema &&
            sparseSimilarityTopK == other.sparseSimilarityTopK &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            alpha,
            className,
            denseSimilarityCutoff,
            denseSimilarityTopK,
            enableReranking,
            filesTopK,
            rerankTopN,
            retrievalMode,
            retrieveImageNodes,
            retrievePageFigureNodes,
            retrievePageScreenshotNodes,
            searchFilters,
            searchFiltersInferenceSchema,
            sparseSimilarityTopK,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PresetRetrievalParams{alpha=$alpha, className=$className, denseSimilarityCutoff=$denseSimilarityCutoff, denseSimilarityTopK=$denseSimilarityTopK, enableReranking=$enableReranking, filesTopK=$filesTopK, rerankTopN=$rerankTopN, retrievalMode=$retrievalMode, retrieveImageNodes=$retrieveImageNodes, retrievePageFigureNodes=$retrievePageFigureNodes, retrievePageScreenshotNodes=$retrievePageScreenshotNodes, searchFilters=$searchFilters, searchFiltersInferenceSchema=$searchFiltersInferenceSchema, sparseSimilarityTopK=$sparseSimilarityTopK, additionalProperties=$additionalProperties}"
}
