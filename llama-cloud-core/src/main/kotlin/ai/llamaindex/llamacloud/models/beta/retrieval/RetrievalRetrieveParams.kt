// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.retrieval

import ai.llamaindex.llamacloud.core.BaseDeserializer
import ai.llamaindex.llamacloud.core.BaseSerializer
import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.allMaxBy
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.getOrThrow
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve relevant chunks via hybrid search (vector + full-text), with filtering on built-in or
 * user-defined metadata.
 */
class RetrievalRetrieveParams
private constructor(
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * ID of the index to retrieve against.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun indexId(): String = body.indexId()

    /**
     * Natural-language query to retrieve relevant chunks.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = body.query()

    /**
     * Filters on user-defined metadata fields.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFilters(): Optional<CustomFilters> = body.customFilters()

    /**
     * Weight of the full-text search pipeline (0-1).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fullTextPipelineWeight(): Optional<Double> = body.fullTextPipelineWeight()

    /**
     * Number of candidates for approximate nearest neighbor search.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numCandidates(): Optional<Long> = body.numCandidates()

    /**
     * Reranking configuration applied after hybrid search. Enabled by default.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rerank(): Optional<Rerank> = body.rerank()

    /**
     * Minimum score threshold for returned results.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scoreThreshold(): Optional<Double> = body.scoreThreshold()

    /**
     * Filters on built-in document fields (page range, chunk index, etc.).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun staticFilters(): Optional<StaticFilters> = body.staticFilters()

    /**
     * Maximum number of results to return.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topK(): Optional<Long> = body.topK()

    /**
     * Weight of the vector search pipeline (0-1).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vectorPipelineWeight(): Optional<Double> = body.vectorPipelineWeight()

    /**
     * Returns the raw JSON value of [indexId].
     *
     * Unlike [indexId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _indexId(): JsonField<String> = body._indexId()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

    /**
     * Returns the raw JSON value of [customFilters].
     *
     * Unlike [customFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFilters(): JsonField<CustomFilters> = body._customFilters()

    /**
     * Returns the raw JSON value of [fullTextPipelineWeight].
     *
     * Unlike [fullTextPipelineWeight], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _fullTextPipelineWeight(): JsonField<Double> = body._fullTextPipelineWeight()

    /**
     * Returns the raw JSON value of [numCandidates].
     *
     * Unlike [numCandidates], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numCandidates(): JsonField<Long> = body._numCandidates()

    /**
     * Returns the raw JSON value of [rerank].
     *
     * Unlike [rerank], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rerank(): JsonField<Rerank> = body._rerank()

    /**
     * Returns the raw JSON value of [scoreThreshold].
     *
     * Unlike [scoreThreshold], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scoreThreshold(): JsonField<Double> = body._scoreThreshold()

    /**
     * Returns the raw JSON value of [staticFilters].
     *
     * Unlike [staticFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _staticFilters(): JsonField<StaticFilters> = body._staticFilters()

    /**
     * Returns the raw JSON value of [topK].
     *
     * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topK(): JsonField<Long> = body._topK()

    /**
     * Returns the raw JSON value of [vectorPipelineWeight].
     *
     * Unlike [vectorPipelineWeight], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _vectorPipelineWeight(): JsonField<Double> = body._vectorPipelineWeight()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RetrievalRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .indexId()
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrievalRetrieveParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(retrievalRetrieveParams: RetrievalRetrieveParams) = apply {
            organizationId = retrievalRetrieveParams.organizationId
            projectId = retrievalRetrieveParams.projectId
            body = retrievalRetrieveParams.body.toBuilder()
            additionalHeaders = retrievalRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = retrievalRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [indexId]
         * - [query]
         * - [customFilters]
         * - [fullTextPipelineWeight]
         * - [numCandidates]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ID of the index to retrieve against. */
        fun indexId(indexId: String) = apply { body.indexId(indexId) }

        /**
         * Sets [Builder.indexId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun indexId(indexId: JsonField<String>) = apply { body.indexId(indexId) }

        /** Natural-language query to retrieve relevant chunks. */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

        /** Filters on user-defined metadata fields. */
        fun customFilters(customFilters: CustomFilters?) = apply {
            body.customFilters(customFilters)
        }

        /** Alias for calling [Builder.customFilters] with `customFilters.orElse(null)`. */
        fun customFilters(customFilters: Optional<CustomFilters>) =
            customFilters(customFilters.getOrNull())

        /**
         * Sets [Builder.customFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFilters] with a well-typed [CustomFilters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFilters(customFilters: JsonField<CustomFilters>) = apply {
            body.customFilters(customFilters)
        }

        /** Weight of the full-text search pipeline (0-1). */
        fun fullTextPipelineWeight(fullTextPipelineWeight: Double?) = apply {
            body.fullTextPipelineWeight(fullTextPipelineWeight)
        }

        /**
         * Alias for [Builder.fullTextPipelineWeight].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fullTextPipelineWeight(fullTextPipelineWeight: Double) =
            fullTextPipelineWeight(fullTextPipelineWeight as Double?)

        /**
         * Alias for calling [Builder.fullTextPipelineWeight] with
         * `fullTextPipelineWeight.orElse(null)`.
         */
        fun fullTextPipelineWeight(fullTextPipelineWeight: Optional<Double>) =
            fullTextPipelineWeight(fullTextPipelineWeight.getOrNull())

        /**
         * Sets [Builder.fullTextPipelineWeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullTextPipelineWeight] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fullTextPipelineWeight(fullTextPipelineWeight: JsonField<Double>) = apply {
            body.fullTextPipelineWeight(fullTextPipelineWeight)
        }

        /** Number of candidates for approximate nearest neighbor search. */
        fun numCandidates(numCandidates: Long?) = apply { body.numCandidates(numCandidates) }

        /**
         * Alias for [Builder.numCandidates].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numCandidates(numCandidates: Long) = numCandidates(numCandidates as Long?)

        /** Alias for calling [Builder.numCandidates] with `numCandidates.orElse(null)`. */
        fun numCandidates(numCandidates: Optional<Long>) = numCandidates(numCandidates.getOrNull())

        /**
         * Sets [Builder.numCandidates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numCandidates] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numCandidates(numCandidates: JsonField<Long>) = apply {
            body.numCandidates(numCandidates)
        }

        /** Reranking configuration applied after hybrid search. Enabled by default. */
        fun rerank(rerank: Rerank) = apply { body.rerank(rerank) }

        /**
         * Sets [Builder.rerank] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rerank] with a well-typed [Rerank] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rerank(rerank: JsonField<Rerank>) = apply { body.rerank(rerank) }

        /** Minimum score threshold for returned results. */
        fun scoreThreshold(scoreThreshold: Double?) = apply { body.scoreThreshold(scoreThreshold) }

        /**
         * Alias for [Builder.scoreThreshold].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun scoreThreshold(scoreThreshold: Double) = scoreThreshold(scoreThreshold as Double?)

        /** Alias for calling [Builder.scoreThreshold] with `scoreThreshold.orElse(null)`. */
        fun scoreThreshold(scoreThreshold: Optional<Double>) =
            scoreThreshold(scoreThreshold.getOrNull())

        /**
         * Sets [Builder.scoreThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scoreThreshold] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scoreThreshold(scoreThreshold: JsonField<Double>) = apply {
            body.scoreThreshold(scoreThreshold)
        }

        /** Filters on built-in document fields (page range, chunk index, etc.). */
        fun staticFilters(staticFilters: StaticFilters?) = apply {
            body.staticFilters(staticFilters)
        }

        /** Alias for calling [Builder.staticFilters] with `staticFilters.orElse(null)`. */
        fun staticFilters(staticFilters: Optional<StaticFilters>) =
            staticFilters(staticFilters.getOrNull())

        /**
         * Sets [Builder.staticFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.staticFilters] with a well-typed [StaticFilters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun staticFilters(staticFilters: JsonField<StaticFilters>) = apply {
            body.staticFilters(staticFilters)
        }

        /** Maximum number of results to return. */
        fun topK(topK: Long?) = apply { body.topK(topK) }

        /**
         * Alias for [Builder.topK].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topK(topK: Long) = topK(topK as Long?)

        /** Alias for calling [Builder.topK] with `topK.orElse(null)`. */
        fun topK(topK: Optional<Long>) = topK(topK.getOrNull())

        /**
         * Sets [Builder.topK] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topK(topK: JsonField<Long>) = apply { body.topK(topK) }

        /** Weight of the vector search pipeline (0-1). */
        fun vectorPipelineWeight(vectorPipelineWeight: Double?) = apply {
            body.vectorPipelineWeight(vectorPipelineWeight)
        }

        /**
         * Alias for [Builder.vectorPipelineWeight].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun vectorPipelineWeight(vectorPipelineWeight: Double) =
            vectorPipelineWeight(vectorPipelineWeight as Double?)

        /**
         * Alias for calling [Builder.vectorPipelineWeight] with
         * `vectorPipelineWeight.orElse(null)`.
         */
        fun vectorPipelineWeight(vectorPipelineWeight: Optional<Double>) =
            vectorPipelineWeight(vectorPipelineWeight.getOrNull())

        /**
         * Sets [Builder.vectorPipelineWeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorPipelineWeight] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vectorPipelineWeight(vectorPipelineWeight: JsonField<Double>) = apply {
            body.vectorPipelineWeight(vectorPipelineWeight)
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
         * Returns an immutable instance of [RetrievalRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .indexId()
         * .query()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetrievalRetrieveParams =
            RetrievalRetrieveParams(
                organizationId,
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Hybrid retrieval request combining vector and full-text search. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val indexId: JsonField<String>,
        private val query: JsonField<String>,
        private val customFilters: JsonField<CustomFilters>,
        private val fullTextPipelineWeight: JsonField<Double>,
        private val numCandidates: JsonField<Long>,
        private val rerank: JsonField<Rerank>,
        private val scoreThreshold: JsonField<Double>,
        private val staticFilters: JsonField<StaticFilters>,
        private val topK: JsonField<Long>,
        private val vectorPipelineWeight: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("index_id") @ExcludeMissing indexId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_filters")
            @ExcludeMissing
            customFilters: JsonField<CustomFilters> = JsonMissing.of(),
            @JsonProperty("full_text_pipeline_weight")
            @ExcludeMissing
            fullTextPipelineWeight: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("num_candidates")
            @ExcludeMissing
            numCandidates: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rerank") @ExcludeMissing rerank: JsonField<Rerank> = JsonMissing.of(),
            @JsonProperty("score_threshold")
            @ExcludeMissing
            scoreThreshold: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("static_filters")
            @ExcludeMissing
            staticFilters: JsonField<StaticFilters> = JsonMissing.of(),
            @JsonProperty("top_k") @ExcludeMissing topK: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("vector_pipeline_weight")
            @ExcludeMissing
            vectorPipelineWeight: JsonField<Double> = JsonMissing.of(),
        ) : this(
            indexId,
            query,
            customFilters,
            fullTextPipelineWeight,
            numCandidates,
            rerank,
            scoreThreshold,
            staticFilters,
            topK,
            vectorPipelineWeight,
            mutableMapOf(),
        )

        /**
         * ID of the index to retrieve against.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun indexId(): String = indexId.getRequired("index_id")

        /**
         * Natural-language query to retrieve relevant chunks.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun query(): String = query.getRequired("query")

        /**
         * Filters on user-defined metadata fields.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFilters(): Optional<CustomFilters> = customFilters.getOptional("custom_filters")

        /**
         * Weight of the full-text search pipeline (0-1).
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fullTextPipelineWeight(): Optional<Double> =
            fullTextPipelineWeight.getOptional("full_text_pipeline_weight")

        /**
         * Number of candidates for approximate nearest neighbor search.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun numCandidates(): Optional<Long> = numCandidates.getOptional("num_candidates")

        /**
         * Reranking configuration applied after hybrid search. Enabled by default.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rerank(): Optional<Rerank> = rerank.getOptional("rerank")

        /**
         * Minimum score threshold for returned results.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scoreThreshold(): Optional<Double> = scoreThreshold.getOptional("score_threshold")

        /**
         * Filters on built-in document fields (page range, chunk index, etc.).
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun staticFilters(): Optional<StaticFilters> = staticFilters.getOptional("static_filters")

        /**
         * Maximum number of results to return.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun topK(): Optional<Long> = topK.getOptional("top_k")

        /**
         * Weight of the vector search pipeline (0-1).
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun vectorPipelineWeight(): Optional<Double> =
            vectorPipelineWeight.getOptional("vector_pipeline_weight")

        /**
         * Returns the raw JSON value of [indexId].
         *
         * Unlike [indexId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index_id") @ExcludeMissing fun _indexId(): JsonField<String> = indexId

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

        /**
         * Returns the raw JSON value of [customFilters].
         *
         * Unlike [customFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_filters")
        @ExcludeMissing
        fun _customFilters(): JsonField<CustomFilters> = customFilters

        /**
         * Returns the raw JSON value of [fullTextPipelineWeight].
         *
         * Unlike [fullTextPipelineWeight], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("full_text_pipeline_weight")
        @ExcludeMissing
        fun _fullTextPipelineWeight(): JsonField<Double> = fullTextPipelineWeight

        /**
         * Returns the raw JSON value of [numCandidates].
         *
         * Unlike [numCandidates], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("num_candidates")
        @ExcludeMissing
        fun _numCandidates(): JsonField<Long> = numCandidates

        /**
         * Returns the raw JSON value of [rerank].
         *
         * Unlike [rerank], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rerank") @ExcludeMissing fun _rerank(): JsonField<Rerank> = rerank

        /**
         * Returns the raw JSON value of [scoreThreshold].
         *
         * Unlike [scoreThreshold], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("score_threshold")
        @ExcludeMissing
        fun _scoreThreshold(): JsonField<Double> = scoreThreshold

        /**
         * Returns the raw JSON value of [staticFilters].
         *
         * Unlike [staticFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("static_filters")
        @ExcludeMissing
        fun _staticFilters(): JsonField<StaticFilters> = staticFilters

        /**
         * Returns the raw JSON value of [topK].
         *
         * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

        /**
         * Returns the raw JSON value of [vectorPipelineWeight].
         *
         * Unlike [vectorPipelineWeight], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("vector_pipeline_weight")
        @ExcludeMissing
        fun _vectorPipelineWeight(): JsonField<Double> = vectorPipelineWeight

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .indexId()
             * .query()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var indexId: JsonField<String>? = null
            private var query: JsonField<String>? = null
            private var customFilters: JsonField<CustomFilters> = JsonMissing.of()
            private var fullTextPipelineWeight: JsonField<Double> = JsonMissing.of()
            private var numCandidates: JsonField<Long> = JsonMissing.of()
            private var rerank: JsonField<Rerank> = JsonMissing.of()
            private var scoreThreshold: JsonField<Double> = JsonMissing.of()
            private var staticFilters: JsonField<StaticFilters> = JsonMissing.of()
            private var topK: JsonField<Long> = JsonMissing.of()
            private var vectorPipelineWeight: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                indexId = body.indexId
                query = body.query
                customFilters = body.customFilters
                fullTextPipelineWeight = body.fullTextPipelineWeight
                numCandidates = body.numCandidates
                rerank = body.rerank
                scoreThreshold = body.scoreThreshold
                staticFilters = body.staticFilters
                topK = body.topK
                vectorPipelineWeight = body.vectorPipelineWeight
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the index to retrieve against. */
            fun indexId(indexId: String) = indexId(JsonField.of(indexId))

            /**
             * Sets [Builder.indexId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.indexId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun indexId(indexId: JsonField<String>) = apply { this.indexId = indexId }

            /** Natural-language query to retrieve relevant chunks. */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

            /** Filters on user-defined metadata fields. */
            fun customFilters(customFilters: CustomFilters?) =
                customFilters(JsonField.ofNullable(customFilters))

            /** Alias for calling [Builder.customFilters] with `customFilters.orElse(null)`. */
            fun customFilters(customFilters: Optional<CustomFilters>) =
                customFilters(customFilters.getOrNull())

            /**
             * Sets [Builder.customFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFilters] with a well-typed [CustomFilters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customFilters(customFilters: JsonField<CustomFilters>) = apply {
                this.customFilters = customFilters
            }

            /** Weight of the full-text search pipeline (0-1). */
            fun fullTextPipelineWeight(fullTextPipelineWeight: Double?) =
                fullTextPipelineWeight(JsonField.ofNullable(fullTextPipelineWeight))

            /**
             * Alias for [Builder.fullTextPipelineWeight].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun fullTextPipelineWeight(fullTextPipelineWeight: Double) =
                fullTextPipelineWeight(fullTextPipelineWeight as Double?)

            /**
             * Alias for calling [Builder.fullTextPipelineWeight] with
             * `fullTextPipelineWeight.orElse(null)`.
             */
            fun fullTextPipelineWeight(fullTextPipelineWeight: Optional<Double>) =
                fullTextPipelineWeight(fullTextPipelineWeight.getOrNull())

            /**
             * Sets [Builder.fullTextPipelineWeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullTextPipelineWeight] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fullTextPipelineWeight(fullTextPipelineWeight: JsonField<Double>) = apply {
                this.fullTextPipelineWeight = fullTextPipelineWeight
            }

            /** Number of candidates for approximate nearest neighbor search. */
            fun numCandidates(numCandidates: Long?) =
                numCandidates(JsonField.ofNullable(numCandidates))

            /**
             * Alias for [Builder.numCandidates].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numCandidates(numCandidates: Long) = numCandidates(numCandidates as Long?)

            /** Alias for calling [Builder.numCandidates] with `numCandidates.orElse(null)`. */
            fun numCandidates(numCandidates: Optional<Long>) =
                numCandidates(numCandidates.getOrNull())

            /**
             * Sets [Builder.numCandidates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numCandidates] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numCandidates(numCandidates: JsonField<Long>) = apply {
                this.numCandidates = numCandidates
            }

            /** Reranking configuration applied after hybrid search. Enabled by default. */
            fun rerank(rerank: Rerank) = rerank(JsonField.of(rerank))

            /**
             * Sets [Builder.rerank] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rerank] with a well-typed [Rerank] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rerank(rerank: JsonField<Rerank>) = apply { this.rerank = rerank }

            /** Minimum score threshold for returned results. */
            fun scoreThreshold(scoreThreshold: Double?) =
                scoreThreshold(JsonField.ofNullable(scoreThreshold))

            /**
             * Alias for [Builder.scoreThreshold].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun scoreThreshold(scoreThreshold: Double) = scoreThreshold(scoreThreshold as Double?)

            /** Alias for calling [Builder.scoreThreshold] with `scoreThreshold.orElse(null)`. */
            fun scoreThreshold(scoreThreshold: Optional<Double>) =
                scoreThreshold(scoreThreshold.getOrNull())

            /**
             * Sets [Builder.scoreThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scoreThreshold] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scoreThreshold(scoreThreshold: JsonField<Double>) = apply {
                this.scoreThreshold = scoreThreshold
            }

            /** Filters on built-in document fields (page range, chunk index, etc.). */
            fun staticFilters(staticFilters: StaticFilters?) =
                staticFilters(JsonField.ofNullable(staticFilters))

            /** Alias for calling [Builder.staticFilters] with `staticFilters.orElse(null)`. */
            fun staticFilters(staticFilters: Optional<StaticFilters>) =
                staticFilters(staticFilters.getOrNull())

            /**
             * Sets [Builder.staticFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.staticFilters] with a well-typed [StaticFilters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun staticFilters(staticFilters: JsonField<StaticFilters>) = apply {
                this.staticFilters = staticFilters
            }

            /** Maximum number of results to return. */
            fun topK(topK: Long?) = topK(JsonField.ofNullable(topK))

            /**
             * Alias for [Builder.topK].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun topK(topK: Long) = topK(topK as Long?)

            /** Alias for calling [Builder.topK] with `topK.orElse(null)`. */
            fun topK(topK: Optional<Long>) = topK(topK.getOrNull())

            /**
             * Sets [Builder.topK] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

            /** Weight of the vector search pipeline (0-1). */
            fun vectorPipelineWeight(vectorPipelineWeight: Double?) =
                vectorPipelineWeight(JsonField.ofNullable(vectorPipelineWeight))

            /**
             * Alias for [Builder.vectorPipelineWeight].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun vectorPipelineWeight(vectorPipelineWeight: Double) =
                vectorPipelineWeight(vectorPipelineWeight as Double?)

            /**
             * Alias for calling [Builder.vectorPipelineWeight] with
             * `vectorPipelineWeight.orElse(null)`.
             */
            fun vectorPipelineWeight(vectorPipelineWeight: Optional<Double>) =
                vectorPipelineWeight(vectorPipelineWeight.getOrNull())

            /**
             * Sets [Builder.vectorPipelineWeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorPipelineWeight] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun vectorPipelineWeight(vectorPipelineWeight: JsonField<Double>) = apply {
                this.vectorPipelineWeight = vectorPipelineWeight
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .indexId()
             * .query()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("indexId", indexId),
                    checkRequired("query", query),
                    customFilters,
                    fullTextPipelineWeight,
                    numCandidates,
                    rerank,
                    scoreThreshold,
                    staticFilters,
                    topK,
                    vectorPipelineWeight,
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

            indexId()
            query()
            customFilters().ifPresent { it.validate() }
            fullTextPipelineWeight()
            numCandidates()
            rerank().ifPresent { it.validate() }
            scoreThreshold()
            staticFilters().ifPresent { it.validate() }
            topK()
            vectorPipelineWeight()
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
            (if (indexId.asKnown().isPresent) 1 else 0) +
                (if (query.asKnown().isPresent) 1 else 0) +
                (customFilters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fullTextPipelineWeight.asKnown().isPresent) 1 else 0) +
                (if (numCandidates.asKnown().isPresent) 1 else 0) +
                (rerank.asKnown().getOrNull()?.validity() ?: 0) +
                (if (scoreThreshold.asKnown().isPresent) 1 else 0) +
                (staticFilters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (topK.asKnown().isPresent) 1 else 0) +
                (if (vectorPipelineWeight.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                indexId == other.indexId &&
                query == other.query &&
                customFilters == other.customFilters &&
                fullTextPipelineWeight == other.fullTextPipelineWeight &&
                numCandidates == other.numCandidates &&
                rerank == other.rerank &&
                scoreThreshold == other.scoreThreshold &&
                staticFilters == other.staticFilters &&
                topK == other.topK &&
                vectorPipelineWeight == other.vectorPipelineWeight &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                indexId,
                query,
                customFilters,
                fullTextPipelineWeight,
                numCandidates,
                rerank,
                scoreThreshold,
                staticFilters,
                topK,
                vectorPipelineWeight,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{indexId=$indexId, query=$query, customFilters=$customFilters, fullTextPipelineWeight=$fullTextPipelineWeight, numCandidates=$numCandidates, rerank=$rerank, scoreThreshold=$scoreThreshold, staticFilters=$staticFilters, topK=$topK, vectorPipelineWeight=$vectorPipelineWeight, additionalProperties=$additionalProperties}"
    }

    /** Filters on user-defined metadata fields. */
    class CustomFilters
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

            /** Returns a mutable builder for constructing an instance of [CustomFilters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFilters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFilters: CustomFilters) = apply {
                additionalProperties = customFilters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomFilters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFilters = CustomFilters(additionalProperties.toImmutable())
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
        fun validate(): CustomFilters = apply {
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

            return other is CustomFilters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFilters{additionalProperties=$additionalProperties}"
    }

    /** Reranking configuration applied after hybrid search. Enabled by default. */
    class Rerank
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val enabled: JsonField<Boolean>,
        private val topN: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("top_n") @ExcludeMissing topN: JsonField<Long> = JsonMissing.of(),
        ) : this(enabled, topN, mutableMapOf())

        /**
         * Set to false to disable reranking.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

        /**
         * Number of results to return after reranking.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun topN(): Optional<Long> = topN.getOptional("top_n")

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [topN].
         *
         * Unlike [topN], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_n") @ExcludeMissing fun _topN(): JsonField<Long> = topN

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

            /** Returns a mutable builder for constructing an instance of [Rerank]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rerank]. */
        class Builder internal constructor() {

            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var topN: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rerank: Rerank) = apply {
                enabled = rerank.enabled
                topN = rerank.topN
                additionalProperties = rerank.additionalProperties.toMutableMap()
            }

            /** Set to false to disable reranking. */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /** Number of results to return after reranking. */
            fun topN(topN: Long?) = topN(JsonField.ofNullable(topN))

            /**
             * Alias for [Builder.topN].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun topN(topN: Long) = topN(topN as Long?)

            /** Alias for calling [Builder.topN] with `topN.orElse(null)`. */
            fun topN(topN: Optional<Long>) = topN(topN.getOrNull())

            /**
             * Sets [Builder.topN] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topN] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topN(topN: JsonField<Long>) = apply { this.topN = topN }

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
             * Returns an immutable instance of [Rerank].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Rerank = Rerank(enabled, topN, additionalProperties.toMutableMap())
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
        fun validate(): Rerank = apply {
            if (validated) {
                return@apply
            }

            enabled()
            topN()
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
            (if (enabled.asKnown().isPresent) 1 else 0) + (if (topN.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rerank &&
                enabled == other.enabled &&
                topN == other.topN &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(enabled, topN, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rerank{enabled=$enabled, topN=$topN, additionalProperties=$additionalProperties}"
    }

    /** Filters on built-in document fields (page range, chunk index, etc.). */
    class StaticFilters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val parsedDirectoryFileId: JsonField<ParsedDirectoryFileId>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("parsed_directory_file_id")
            @ExcludeMissing
            parsedDirectoryFileId: JsonField<ParsedDirectoryFileId> = JsonMissing.of()
        ) : this(parsedDirectoryFileId, mutableMapOf())

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parsedDirectoryFileId(): Optional<ParsedDirectoryFileId> =
            parsedDirectoryFileId.getOptional("parsed_directory_file_id")

        /**
         * Returns the raw JSON value of [parsedDirectoryFileId].
         *
         * Unlike [parsedDirectoryFileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("parsed_directory_file_id")
        @ExcludeMissing
        fun _parsedDirectoryFileId(): JsonField<ParsedDirectoryFileId> = parsedDirectoryFileId

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

            /** Returns a mutable builder for constructing an instance of [StaticFilters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StaticFilters]. */
        class Builder internal constructor() {

            private var parsedDirectoryFileId: JsonField<ParsedDirectoryFileId> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(staticFilters: StaticFilters) = apply {
                parsedDirectoryFileId = staticFilters.parsedDirectoryFileId
                additionalProperties = staticFilters.additionalProperties.toMutableMap()
            }

            fun parsedDirectoryFileId(parsedDirectoryFileId: ParsedDirectoryFileId?) =
                parsedDirectoryFileId(JsonField.ofNullable(parsedDirectoryFileId))

            /**
             * Alias for calling [Builder.parsedDirectoryFileId] with
             * `parsedDirectoryFileId.orElse(null)`.
             */
            fun parsedDirectoryFileId(parsedDirectoryFileId: Optional<ParsedDirectoryFileId>) =
                parsedDirectoryFileId(parsedDirectoryFileId.getOrNull())

            /**
             * Sets [Builder.parsedDirectoryFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parsedDirectoryFileId] with a well-typed
             * [ParsedDirectoryFileId] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun parsedDirectoryFileId(parsedDirectoryFileId: JsonField<ParsedDirectoryFileId>) =
                apply {
                    this.parsedDirectoryFileId = parsedDirectoryFileId
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
             * Returns an immutable instance of [StaticFilters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StaticFilters =
                StaticFilters(parsedDirectoryFileId, additionalProperties.toMutableMap())
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
        fun validate(): StaticFilters = apply {
            if (validated) {
                return@apply
            }

            parsedDirectoryFileId().ifPresent { it.validate() }
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
            (parsedDirectoryFileId.asKnown().getOrNull()?.validity() ?: 0)

        class ParsedDirectoryFileId
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val operator: JsonField<Operator>,
            private val value: JsonField<Value>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
            ) : this(operator, value, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Value = value.getRequired("value")

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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
                 * [ParsedDirectoryFileId].
                 *
                 * The following fields are required:
                 * ```java
                 * .operator()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ParsedDirectoryFileId]. */
            class Builder internal constructor() {

                private var operator: JsonField<Operator>? = null
                private var value: JsonField<Value>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parsedDirectoryFileId: ParsedDirectoryFileId) = apply {
                    operator = parsedDirectoryFileId.operator
                    value = parsedDirectoryFileId.value
                    additionalProperties = parsedDirectoryFileId.additionalProperties.toMutableMap()
                }

                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                fun value(value: Value) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Value] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Value>) = apply { this.value = value }

                /** Alias for calling [value] with `Value.ofString(string)`. */
                fun value(string: String) = value(Value.ofString(string))

                /** Alias for calling [value] with `Value.ofStrings(strings)`. */
                fun valueOfStrings(strings: List<String>) = value(Value.ofStrings(strings))

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
                 * Returns an immutable instance of [ParsedDirectoryFileId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .operator()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ParsedDirectoryFileId =
                    ParsedDirectoryFileId(
                        checkRequired("operator", operator),
                        checkRequired("value", value),
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
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ParsedDirectoryFileId = apply {
                if (validated) {
                    return@apply
                }

                operator().validate()
                value().validate()
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
                (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (value.asKnown().getOrNull()?.validity() ?: 0)

            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val EQ = of("eq")

                    @JvmField val GT = of("gt")

                    @JvmField val GTE = of("gte")

                    @JvmField val IN = of("in")

                    @JvmField val LT = of("lt")

                    @JvmField val LTE = of("lte")

                    @JvmField val NE = of("ne")

                    @JvmField val NIN = of("nin")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    EQ,
                    GT,
                    GTE,
                    IN,
                    LT,
                    LTE,
                    NE,
                    NIN,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EQ,
                    GT,
                    GTE,
                    IN,
                    LT,
                    LTE,
                    NE,
                    NIN,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
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
                        EQ -> Value.EQ
                        GT -> Value.GT
                        GTE -> Value.GTE
                        IN -> Value.IN
                        LT -> Value.LT
                        LTE -> Value.LTE
                        NE -> Value.NE
                        NIN -> Value.NIN
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
                        EQ -> Known.EQ
                        GT -> Known.GT
                        GTE -> Known.GTE
                        IN -> Known.IN
                        LT -> Known.LT
                        LTE -> Known.LTE
                        NE -> Known.NE
                        NIN -> Known.NIN
                        else -> throw LlamaCloudInvalidDataException("Unknown Operator: $value")
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
                fun validate(): Operator = apply {
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

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @JsonDeserialize(using = Value.Deserializer::class)
            @JsonSerialize(using = Value.Serializer::class)
            class Value
            private constructor(
                private val string: String? = null,
                private val strings: List<String>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

                fun isString(): Boolean = string != null

                fun isStrings(): Boolean = strings != null

                fun asString(): String = string.getOrThrow("string")

                fun asStrings(): List<String> = strings.getOrThrow("strings")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import ai.llamaindex.llamacloud.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = value.accept(new Value.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitString(String string) {
                 *         return Optional.of(string.toString());
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
                        string != null -> visitor.visitString(string)
                        strings != null -> visitor.visitStrings(strings)
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Value = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitStrings(strings: List<String>) {}
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
                            override fun visitString(string: String) = 1

                            override fun visitStrings(strings: List<String>) = strings.size

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Value && string == other.string && strings == other.strings
                }

                override fun hashCode(): Int = Objects.hash(string, strings)

                override fun toString(): String =
                    when {
                        string != null -> "Value{string=$string}"
                        strings != null -> "Value{strings=$strings}"
                        _json != null -> "Value{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Value")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Value(string = string)

                    @JvmStatic
                    fun ofStrings(strings: List<String>) = Value(strings = strings.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [Value] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitStrings(strings: List<String>): T

                    /**
                     * Maps an unknown variant of [Value] to a value of type [T].
                     *
                     * An instance of [Value] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException("Unknown Value: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Value(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                        Value(strings = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Value(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Value>(Value::class) {

                    override fun serialize(
                        value: Value,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.strings != null -> generator.writeObject(value.strings)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ParsedDirectoryFileId &&
                    operator == other.operator &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(operator, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ParsedDirectoryFileId{operator=$operator, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StaticFilters &&
                parsedDirectoryFileId == other.parsedDirectoryFileId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(parsedDirectoryFileId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StaticFilters{parsedDirectoryFileId=$parsedDirectoryFileId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrievalRetrieveParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RetrievalRetrieveParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
