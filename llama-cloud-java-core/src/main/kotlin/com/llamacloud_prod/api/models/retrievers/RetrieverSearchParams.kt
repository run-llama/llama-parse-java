// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.retrievers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve data using specified pipelines without creating a persistent retriever. */
class RetrieverSearchParams
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
     * The query to retrieve against.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = body.query()

    /**
     * The mode of composite retrieval.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<CompositeRetrievalMode> = body.mode()

    /**
     * The pipelines to use for retrieval.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pipelines(): Optional<List<RetrieverPipeline>> = body.pipelines()

    /**
     * The rerank configuration for composite retrieval.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rerankConfig(): Optional<ReRankConfig> = body.rerankConfig()

    /**
     * (use rerank_config.top_n instead) The number of nodes to retrieve after reranking over
     * retrieved nodes from all retrieval tools.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun rerankTopN(): Optional<Long> = body.rerankTopN()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mode(): JsonField<CompositeRetrievalMode> = body._mode()

    /**
     * Returns the raw JSON value of [pipelines].
     *
     * Unlike [pipelines], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pipelines(): JsonField<List<RetrieverPipeline>> = body._pipelines()

    /**
     * Returns the raw JSON value of [rerankConfig].
     *
     * Unlike [rerankConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rerankConfig(): JsonField<ReRankConfig> = body._rerankConfig()

    /**
     * Returns the raw JSON value of [rerankTopN].
     *
     * Unlike [rerankTopN], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated") fun _rerankTopN(): JsonField<Long> = body._rerankTopN()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RetrieverSearchParams].
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrieverSearchParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(retrieverSearchParams: RetrieverSearchParams) = apply {
            organizationId = retrieverSearchParams.organizationId
            projectId = retrieverSearchParams.projectId
            body = retrieverSearchParams.body.toBuilder()
            additionalHeaders = retrieverSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = retrieverSearchParams.additionalQueryParams.toBuilder()
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
         * - [query]
         * - [mode]
         * - [pipelines]
         * - [rerankConfig]
         * - [rerankTopN]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The query to retrieve against. */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

        /** The mode of composite retrieval. */
        fun mode(mode: CompositeRetrievalMode) = apply { body.mode(mode) }

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [CompositeRetrievalMode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mode(mode: JsonField<CompositeRetrievalMode>) = apply { body.mode(mode) }

        /** The pipelines to use for retrieval. */
        fun pipelines(pipelines: List<RetrieverPipeline>) = apply { body.pipelines(pipelines) }

        /**
         * Sets [Builder.pipelines] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelines] with a well-typed `List<RetrieverPipeline>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pipelines(pipelines: JsonField<List<RetrieverPipeline>>) = apply {
            body.pipelines(pipelines)
        }

        /**
         * Adds a single [RetrieverPipeline] to [pipelines].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPipeline(pipeline: RetrieverPipeline) = apply { body.addPipeline(pipeline) }

        /** The rerank configuration for composite retrieval. */
        fun rerankConfig(rerankConfig: ReRankConfig) = apply { body.rerankConfig(rerankConfig) }

        /**
         * Sets [Builder.rerankConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rerankConfig] with a well-typed [ReRankConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rerankConfig(rerankConfig: JsonField<ReRankConfig>) = apply {
            body.rerankConfig(rerankConfig)
        }

        /**
         * (use rerank_config.top_n instead) The number of nodes to retrieve after reranking over
         * retrieved nodes from all retrieval tools.
         */
        @Deprecated("deprecated")
        fun rerankTopN(rerankTopN: Long?) = apply { body.rerankTopN(rerankTopN) }

        /**
         * Alias for [Builder.rerankTopN].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("deprecated") fun rerankTopN(rerankTopN: Long) = rerankTopN(rerankTopN as Long?)

        /** Alias for calling [Builder.rerankTopN] with `rerankTopN.orElse(null)`. */
        @Deprecated("deprecated")
        fun rerankTopN(rerankTopN: Optional<Long>) = rerankTopN(rerankTopN.getOrNull())

        /**
         * Sets [Builder.rerankTopN] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rerankTopN] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun rerankTopN(rerankTopN: JsonField<Long>) = apply { body.rerankTopN(rerankTopN) }

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
         * Returns an immutable instance of [RetrieverSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetrieverSearchParams =
            RetrieverSearchParams(
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

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val query: JsonField<String>,
        private val mode: JsonField<CompositeRetrievalMode>,
        private val pipelines: JsonField<List<RetrieverPipeline>>,
        private val rerankConfig: JsonField<ReRankConfig>,
        private val rerankTopN: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mode")
            @ExcludeMissing
            mode: JsonField<CompositeRetrievalMode> = JsonMissing.of(),
            @JsonProperty("pipelines")
            @ExcludeMissing
            pipelines: JsonField<List<RetrieverPipeline>> = JsonMissing.of(),
            @JsonProperty("rerank_config")
            @ExcludeMissing
            rerankConfig: JsonField<ReRankConfig> = JsonMissing.of(),
            @JsonProperty("rerank_top_n")
            @ExcludeMissing
            rerankTopN: JsonField<Long> = JsonMissing.of(),
        ) : this(query, mode, pipelines, rerankConfig, rerankTopN, mutableMapOf())

        /**
         * The query to retrieve against.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun query(): String = query.getRequired("query")

        /**
         * The mode of composite retrieval.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mode(): Optional<CompositeRetrievalMode> = mode.getOptional("mode")

        /**
         * The pipelines to use for retrieval.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pipelines(): Optional<List<RetrieverPipeline>> = pipelines.getOptional("pipelines")

        /**
         * The rerank configuration for composite retrieval.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rerankConfig(): Optional<ReRankConfig> = rerankConfig.getOptional("rerank_config")

        /**
         * (use rerank_config.top_n instead) The number of nodes to retrieve after reranking over
         * retrieved nodes from all retrieval tools.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun rerankTopN(): Optional<Long> = rerankTopN.getOptional("rerank_top_n")

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<CompositeRetrievalMode> = mode

        /**
         * Returns the raw JSON value of [pipelines].
         *
         * Unlike [pipelines], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pipelines")
        @ExcludeMissing
        fun _pipelines(): JsonField<List<RetrieverPipeline>> = pipelines

        /**
         * Returns the raw JSON value of [rerankConfig].
         *
         * Unlike [rerankConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rerank_config")
        @ExcludeMissing
        fun _rerankConfig(): JsonField<ReRankConfig> = rerankConfig

        /**
         * Returns the raw JSON value of [rerankTopN].
         *
         * Unlike [rerankTopN], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("rerank_top_n")
        @ExcludeMissing
        fun _rerankTopN(): JsonField<Long> = rerankTopN

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
             * .query()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var query: JsonField<String>? = null
            private var mode: JsonField<CompositeRetrievalMode> = JsonMissing.of()
            private var pipelines: JsonField<MutableList<RetrieverPipeline>>? = null
            private var rerankConfig: JsonField<ReRankConfig> = JsonMissing.of()
            private var rerankTopN: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                query = body.query
                mode = body.mode
                pipelines = body.pipelines.map { it.toMutableList() }
                rerankConfig = body.rerankConfig
                rerankTopN = body.rerankTopN
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The query to retrieve against. */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

            /** The mode of composite retrieval. */
            fun mode(mode: CompositeRetrievalMode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [CompositeRetrievalMode]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mode(mode: JsonField<CompositeRetrievalMode>) = apply { this.mode = mode }

            /** The pipelines to use for retrieval. */
            fun pipelines(pipelines: List<RetrieverPipeline>) = pipelines(JsonField.of(pipelines))

            /**
             * Sets [Builder.pipelines] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pipelines] with a well-typed
             * `List<RetrieverPipeline>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun pipelines(pipelines: JsonField<List<RetrieverPipeline>>) = apply {
                this.pipelines = pipelines.map { it.toMutableList() }
            }

            /**
             * Adds a single [RetrieverPipeline] to [pipelines].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPipeline(pipeline: RetrieverPipeline) = apply {
                pipelines =
                    (pipelines ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pipelines", it).add(pipeline)
                    }
            }

            /** The rerank configuration for composite retrieval. */
            fun rerankConfig(rerankConfig: ReRankConfig) = rerankConfig(JsonField.of(rerankConfig))

            /**
             * Sets [Builder.rerankConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rerankConfig] with a well-typed [ReRankConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rerankConfig(rerankConfig: JsonField<ReRankConfig>) = apply {
                this.rerankConfig = rerankConfig
            }

            /**
             * (use rerank_config.top_n instead) The number of nodes to retrieve after reranking
             * over retrieved nodes from all retrieval tools.
             */
            @Deprecated("deprecated")
            fun rerankTopN(rerankTopN: Long?) = rerankTopN(JsonField.ofNullable(rerankTopN))

            /**
             * Alias for [Builder.rerankTopN].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            @Deprecated("deprecated")
            fun rerankTopN(rerankTopN: Long) = rerankTopN(rerankTopN as Long?)

            /** Alias for calling [Builder.rerankTopN] with `rerankTopN.orElse(null)`. */
            @Deprecated("deprecated")
            fun rerankTopN(rerankTopN: Optional<Long>) = rerankTopN(rerankTopN.getOrNull())

            /**
             * Sets [Builder.rerankTopN] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rerankTopN] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun rerankTopN(rerankTopN: JsonField<Long>) = apply { this.rerankTopN = rerankTopN }

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
             * .query()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("query", query),
                    mode,
                    (pipelines ?: JsonMissing.of()).map { it.toImmutable() },
                    rerankConfig,
                    rerankTopN,
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

            query()
            mode().ifPresent { it.validate() }
            pipelines().ifPresent { it.forEach { it.validate() } }
            rerankConfig().ifPresent { it.validate() }
            rerankTopN()
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
            (if (query.asKnown().isPresent) 1 else 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0) +
                (pipelines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (rerankConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rerankTopN.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                query == other.query &&
                mode == other.mode &&
                pipelines == other.pipelines &&
                rerankConfig == other.rerankConfig &&
                rerankTopN == other.rerankTopN &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(query, mode, pipelines, rerankConfig, rerankTopN, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{query=$query, mode=$mode, pipelines=$pipelines, rerankConfig=$rerankConfig, rerankTopN=$rerankTopN, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrieverSearchParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RetrieverSearchParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
