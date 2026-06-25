// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import com.llamacloud_prod.api.models.pipelines.documents.TextNode
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema for the result of an retrieval execution. */
class PipelineRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pipelineId: JsonField<String>,
    private val retrievalNodes: JsonField<List<RetrievalNode>>,
    private val className: JsonField<String>,
    private val imageNodes: JsonField<List<PageScreenshotNodeWithScore>>,
    private val inferredSearchFilters: JsonField<MetadataFilters>,
    private val metadata: JsonField<Metadata>,
    private val pageFigureNodes: JsonField<List<PageFigureNodeWithScore>>,
    private val retrievalLatency: JsonField<RetrievalLatency>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("pipeline_id")
        @ExcludeMissing
        pipelineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retrieval_nodes")
        @ExcludeMissing
        retrievalNodes: JsonField<List<RetrievalNode>> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("image_nodes")
        @ExcludeMissing
        imageNodes: JsonField<List<PageScreenshotNodeWithScore>> = JsonMissing.of(),
        @JsonProperty("inferred_search_filters")
        @ExcludeMissing
        inferredSearchFilters: JsonField<MetadataFilters> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("page_figure_nodes")
        @ExcludeMissing
        pageFigureNodes: JsonField<List<PageFigureNodeWithScore>> = JsonMissing.of(),
        @JsonProperty("retrieval_latency")
        @ExcludeMissing
        retrievalLatency: JsonField<RetrievalLatency> = JsonMissing.of(),
    ) : this(
        pipelineId,
        retrievalNodes,
        className,
        imageNodes,
        inferredSearchFilters,
        metadata,
        pageFigureNodes,
        retrievalLatency,
        mutableMapOf(),
    )

    /**
     * The ID of the pipeline that the query was retrieved against.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pipelineId(): String = pipelineId.getRequired("pipeline_id")

    /**
     * The nodes retrieved by the pipeline for the given query.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun retrievalNodes(): List<RetrievalNode> = retrievalNodes.getRequired("retrieval_nodes")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The image nodes retrieved by the pipeline for the given query. Deprecated - will soon be
     * replaced with 'page_screenshot_nodes'.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun imageNodes(): Optional<List<PageScreenshotNodeWithScore>> =
        imageNodes.getOptional("image_nodes")

    /**
     * Metadata filters for vector stores.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inferredSearchFilters(): Optional<MetadataFilters> =
        inferredSearchFilters.getOptional("inferred_search_filters")

    /**
     * Metadata associated with the retrieval execution
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * The page figure nodes retrieved by the pipeline for the given query.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageFigureNodes(): Optional<List<PageFigureNodeWithScore>> =
        pageFigureNodes.getOptional("page_figure_nodes")

    /**
     * The end-to-end latency for retrieval and reranking.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retrievalLatency(): Optional<RetrievalLatency> =
        retrievalLatency.getOptional("retrieval_latency")

    /**
     * Returns the raw JSON value of [pipelineId].
     *
     * Unlike [pipelineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pipeline_id") @ExcludeMissing fun _pipelineId(): JsonField<String> = pipelineId

    /**
     * Returns the raw JSON value of [retrievalNodes].
     *
     * Unlike [retrievalNodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retrieval_nodes")
    @ExcludeMissing
    fun _retrievalNodes(): JsonField<List<RetrievalNode>> = retrievalNodes

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [imageNodes].
     *
     * Unlike [imageNodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("image_nodes")
    @ExcludeMissing
    fun _imageNodes(): JsonField<List<PageScreenshotNodeWithScore>> = imageNodes

    /**
     * Returns the raw JSON value of [inferredSearchFilters].
     *
     * Unlike [inferredSearchFilters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inferred_search_filters")
    @ExcludeMissing
    fun _inferredSearchFilters(): JsonField<MetadataFilters> = inferredSearchFilters

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [pageFigureNodes].
     *
     * Unlike [pageFigureNodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_figure_nodes")
    @ExcludeMissing
    fun _pageFigureNodes(): JsonField<List<PageFigureNodeWithScore>> = pageFigureNodes

    /**
     * Returns the raw JSON value of [retrievalLatency].
     *
     * Unlike [retrievalLatency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("retrieval_latency")
    @ExcludeMissing
    fun _retrievalLatency(): JsonField<RetrievalLatency> = retrievalLatency

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
         * Returns a mutable builder for constructing an instance of [PipelineRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .pipelineId()
         * .retrievalNodes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineRetrieveResponse]. */
    class Builder internal constructor() {

        private var pipelineId: JsonField<String>? = null
        private var retrievalNodes: JsonField<MutableList<RetrievalNode>>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var imageNodes: JsonField<MutableList<PageScreenshotNodeWithScore>>? = null
        private var inferredSearchFilters: JsonField<MetadataFilters> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var pageFigureNodes: JsonField<MutableList<PageFigureNodeWithScore>>? = null
        private var retrievalLatency: JsonField<RetrievalLatency> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pipelineRetrieveResponse: PipelineRetrieveResponse) = apply {
            pipelineId = pipelineRetrieveResponse.pipelineId
            retrievalNodes = pipelineRetrieveResponse.retrievalNodes.map { it.toMutableList() }
            className = pipelineRetrieveResponse.className
            imageNodes = pipelineRetrieveResponse.imageNodes.map { it.toMutableList() }
            inferredSearchFilters = pipelineRetrieveResponse.inferredSearchFilters
            metadata = pipelineRetrieveResponse.metadata
            pageFigureNodes = pipelineRetrieveResponse.pageFigureNodes.map { it.toMutableList() }
            retrievalLatency = pipelineRetrieveResponse.retrievalLatency
            additionalProperties = pipelineRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The ID of the pipeline that the query was retrieved against. */
        fun pipelineId(pipelineId: String) = pipelineId(JsonField.of(pipelineId))

        /**
         * Sets [Builder.pipelineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pipelineId(pipelineId: JsonField<String>) = apply { this.pipelineId = pipelineId }

        /** The nodes retrieved by the pipeline for the given query. */
        fun retrievalNodes(retrievalNodes: List<RetrievalNode>) =
            retrievalNodes(JsonField.of(retrievalNodes))

        /**
         * Sets [Builder.retrievalNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrievalNodes] with a well-typed `List<RetrievalNode>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun retrievalNodes(retrievalNodes: JsonField<List<RetrievalNode>>) = apply {
            this.retrievalNodes = retrievalNodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [RetrievalNode] to [retrievalNodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRetrievalNode(retrievalNode: RetrievalNode) = apply {
            retrievalNodes =
                (retrievalNodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("retrievalNodes", it).add(retrievalNode)
                }
        }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /**
         * The image nodes retrieved by the pipeline for the given query. Deprecated - will soon be
         * replaced with 'page_screenshot_nodes'.
         */
        @Deprecated("deprecated")
        fun imageNodes(imageNodes: List<PageScreenshotNodeWithScore>) =
            imageNodes(JsonField.of(imageNodes))

        /**
         * Sets [Builder.imageNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageNodes] with a well-typed
         * `List<PageScreenshotNodeWithScore>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun imageNodes(imageNodes: JsonField<List<PageScreenshotNodeWithScore>>) = apply {
            this.imageNodes = imageNodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [PageScreenshotNodeWithScore] to [imageNodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addImageNode(imageNode: PageScreenshotNodeWithScore) = apply {
            imageNodes =
                (imageNodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("imageNodes", it).add(imageNode)
                }
        }

        /** Metadata filters for vector stores. */
        fun inferredSearchFilters(inferredSearchFilters: MetadataFilters?) =
            inferredSearchFilters(JsonField.ofNullable(inferredSearchFilters))

        /**
         * Alias for calling [Builder.inferredSearchFilters] with
         * `inferredSearchFilters.orElse(null)`.
         */
        fun inferredSearchFilters(inferredSearchFilters: Optional<MetadataFilters>) =
            inferredSearchFilters(inferredSearchFilters.getOrNull())

        /**
         * Sets [Builder.inferredSearchFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inferredSearchFilters] with a well-typed
         * [MetadataFilters] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun inferredSearchFilters(inferredSearchFilters: JsonField<MetadataFilters>) = apply {
            this.inferredSearchFilters = inferredSearchFilters
        }

        /** Metadata associated with the retrieval execution */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The page figure nodes retrieved by the pipeline for the given query. */
        fun pageFigureNodes(pageFigureNodes: List<PageFigureNodeWithScore>) =
            pageFigureNodes(JsonField.of(pageFigureNodes))

        /**
         * Sets [Builder.pageFigureNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageFigureNodes] with a well-typed
         * `List<PageFigureNodeWithScore>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun pageFigureNodes(pageFigureNodes: JsonField<List<PageFigureNodeWithScore>>) = apply {
            this.pageFigureNodes = pageFigureNodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [PageFigureNodeWithScore] to [pageFigureNodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPageFigureNode(pageFigureNode: PageFigureNodeWithScore) = apply {
            pageFigureNodes =
                (pageFigureNodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pageFigureNodes", it).add(pageFigureNode)
                }
        }

        /** The end-to-end latency for retrieval and reranking. */
        fun retrievalLatency(retrievalLatency: RetrievalLatency) =
            retrievalLatency(JsonField.of(retrievalLatency))

        /**
         * Sets [Builder.retrievalLatency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrievalLatency] with a well-typed [RetrievalLatency]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun retrievalLatency(retrievalLatency: JsonField<RetrievalLatency>) = apply {
            this.retrievalLatency = retrievalLatency
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
         * Returns an immutable instance of [PipelineRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pipelineId()
         * .retrievalNodes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PipelineRetrieveResponse =
            PipelineRetrieveResponse(
                checkRequired("pipelineId", pipelineId),
                checkRequired("retrievalNodes", retrievalNodes).map { it.toImmutable() },
                className,
                (imageNodes ?: JsonMissing.of()).map { it.toImmutable() },
                inferredSearchFilters,
                metadata,
                (pageFigureNodes ?: JsonMissing.of()).map { it.toImmutable() },
                retrievalLatency,
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
    fun validate(): PipelineRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        pipelineId()
        retrievalNodes().forEach { it.validate() }
        className()
        imageNodes().ifPresent { it.forEach { it.validate() } }
        inferredSearchFilters().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
        pageFigureNodes().ifPresent { it.forEach { it.validate() } }
        retrievalLatency().ifPresent { it.validate() }
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
        (if (pipelineId.asKnown().isPresent) 1 else 0) +
            (retrievalNodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (imageNodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (inferredSearchFilters.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (pageFigureNodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (retrievalLatency.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Same as NodeWithScore but type for node is a TextNode instead of BaseNode. FastAPI doesn't
     * accept abstract classes like BaseNode.
     */
    class RetrievalNode
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val node: JsonField<TextNode>,
        private val className: JsonField<String>,
        private val score: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("node") @ExcludeMissing node: JsonField<TextNode> = JsonMissing.of(),
            @JsonProperty("class_name")
            @ExcludeMissing
            className: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
        ) : this(node, className, score, mutableMapOf())

        /**
         * Provided for backward compatibility.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun node(): TextNode = node.getRequired("node")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun className(): Optional<String> = className.getOptional("class_name")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * Returns the raw JSON value of [node].
         *
         * Unlike [node], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("node") @ExcludeMissing fun _node(): JsonField<TextNode> = node

        /**
         * Returns the raw JSON value of [className].
         *
         * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

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
             * Returns a mutable builder for constructing an instance of [RetrievalNode].
             *
             * The following fields are required:
             * ```java
             * .node()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RetrievalNode]. */
        class Builder internal constructor() {

            private var node: JsonField<TextNode>? = null
            private var className: JsonField<String> = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(retrievalNode: RetrievalNode) = apply {
                node = retrievalNode.node
                className = retrievalNode.className
                score = retrievalNode.score
                additionalProperties = retrievalNode.additionalProperties.toMutableMap()
            }

            /** Provided for backward compatibility. */
            fun node(node: TextNode) = node(JsonField.of(node))

            /**
             * Sets [Builder.node] to an arbitrary JSON value.
             *
             * You should usually call [Builder.node] with a well-typed [TextNode] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun node(node: JsonField<TextNode>) = apply { this.node = node }

            fun className(className: String) = className(JsonField.of(className))

            /**
             * Sets [Builder.className] to an arbitrary JSON value.
             *
             * You should usually call [Builder.className] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun className(className: JsonField<String>) = apply { this.className = className }

            fun score(score: Double?) = score(JsonField.ofNullable(score))

            /**
             * Alias for [Builder.score].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun score(score: Double) = score(score as Double?)

            /** Alias for calling [Builder.score] with `score.orElse(null)`. */
            fun score(score: Optional<Double>) = score(score.getOrNull())

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

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
             * Returns an immutable instance of [RetrievalNode].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .node()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RetrievalNode =
                RetrievalNode(
                    checkRequired("node", node),
                    className,
                    score,
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
        fun validate(): RetrievalNode = apply {
            if (validated) {
                return@apply
            }

            node().validate()
            className()
            score()
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
            (node.asKnown().getOrNull()?.validity() ?: 0) +
                (if (className.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RetrievalNode &&
                node == other.node &&
                className == other.className &&
                score == other.score &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(node, className, score, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RetrievalNode{node=$node, className=$className, score=$score, additionalProperties=$additionalProperties}"
    }

    /** Metadata associated with the retrieval execution */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** The end-to-end latency for retrieval and reranking. */
    class RetrievalLatency
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

            /** Returns a mutable builder for constructing an instance of [RetrievalLatency]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RetrievalLatency]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(retrievalLatency: RetrievalLatency) = apply {
                additionalProperties = retrievalLatency.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RetrievalLatency].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RetrievalLatency = RetrievalLatency(additionalProperties.toImmutable())
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
        fun validate(): RetrievalLatency = apply {
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

            return other is RetrievalLatency && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RetrievalLatency{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelineRetrieveResponse &&
            pipelineId == other.pipelineId &&
            retrievalNodes == other.retrievalNodes &&
            className == other.className &&
            imageNodes == other.imageNodes &&
            inferredSearchFilters == other.inferredSearchFilters &&
            metadata == other.metadata &&
            pageFigureNodes == other.pageFigureNodes &&
            retrievalLatency == other.retrievalLatency &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            pipelineId,
            retrievalNodes,
            className,
            imageNodes,
            inferredSearchFilters,
            metadata,
            pageFigureNodes,
            retrievalLatency,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PipelineRetrieveResponse{pipelineId=$pipelineId, retrievalNodes=$retrievalNodes, className=$className, imageNodes=$imageNodes, inferredSearchFilters=$inferredSearchFilters, metadata=$metadata, pageFigureNodes=$pageFigureNodes, retrievalLatency=$retrievalLatency, additionalProperties=$additionalProperties}"
}
