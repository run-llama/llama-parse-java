// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.retrievers

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import ai.llamaindex.llamacloud.models.pipelines.PageFigureNodeWithScore
import ai.llamaindex.llamacloud.models.pipelines.PageScreenshotNodeWithScore
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CompositeRetrievalResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val imageNodes: JsonField<List<PageScreenshotNodeWithScore>>,
    private val nodes: JsonField<List<Node>>,
    private val pageFigureNodes: JsonField<List<PageFigureNodeWithScore>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("image_nodes")
        @ExcludeMissing
        imageNodes: JsonField<List<PageScreenshotNodeWithScore>> = JsonMissing.of(),
        @JsonProperty("nodes") @ExcludeMissing nodes: JsonField<List<Node>> = JsonMissing.of(),
        @JsonProperty("page_figure_nodes")
        @ExcludeMissing
        pageFigureNodes: JsonField<List<PageFigureNodeWithScore>> = JsonMissing.of(),
    ) : this(imageNodes, nodes, pageFigureNodes, mutableMapOf())

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
     * The retrieved nodes from the composite retrieval.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nodes(): Optional<List<Node>> = nodes.getOptional("nodes")

    /**
     * The page figure nodes retrieved by the pipeline for the given query.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageFigureNodes(): Optional<List<PageFigureNodeWithScore>> =
        pageFigureNodes.getOptional("page_figure_nodes")

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
     * Returns the raw JSON value of [nodes].
     *
     * Unlike [nodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nodes") @ExcludeMissing fun _nodes(): JsonField<List<Node>> = nodes

    /**
     * Returns the raw JSON value of [pageFigureNodes].
     *
     * Unlike [pageFigureNodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_figure_nodes")
    @ExcludeMissing
    fun _pageFigureNodes(): JsonField<List<PageFigureNodeWithScore>> = pageFigureNodes

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

        /** Returns a mutable builder for constructing an instance of [CompositeRetrievalResult]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompositeRetrievalResult]. */
    class Builder internal constructor() {

        private var imageNodes: JsonField<MutableList<PageScreenshotNodeWithScore>>? = null
        private var nodes: JsonField<MutableList<Node>>? = null
        private var pageFigureNodes: JsonField<MutableList<PageFigureNodeWithScore>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(compositeRetrievalResult: CompositeRetrievalResult) = apply {
            imageNodes = compositeRetrievalResult.imageNodes.map { it.toMutableList() }
            nodes = compositeRetrievalResult.nodes.map { it.toMutableList() }
            pageFigureNodes = compositeRetrievalResult.pageFigureNodes.map { it.toMutableList() }
            additionalProperties = compositeRetrievalResult.additionalProperties.toMutableMap()
        }

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

        /** The retrieved nodes from the composite retrieval. */
        fun nodes(nodes: List<Node>) = nodes(JsonField.of(nodes))

        /**
         * Sets [Builder.nodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nodes] with a well-typed `List<Node>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nodes(nodes: JsonField<List<Node>>) = apply {
            this.nodes = nodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Node] to [nodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNode(node: Node) = apply {
            nodes =
                (nodes ?: JsonField.of(mutableListOf())).also { checkKnown("nodes", it).add(node) }
        }

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
         * Returns an immutable instance of [CompositeRetrievalResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CompositeRetrievalResult =
            CompositeRetrievalResult(
                (imageNodes ?: JsonMissing.of()).map { it.toImmutable() },
                (nodes ?: JsonMissing.of()).map { it.toImmutable() },
                (pageFigureNodes ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): CompositeRetrievalResult = apply {
        if (validated) {
            return@apply
        }

        imageNodes().ifPresent { it.forEach { it.validate() } }
        nodes().ifPresent { it.forEach { it.validate() } }
        pageFigureNodes().ifPresent { it.forEach { it.validate() } }
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
        (imageNodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (nodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pageFigureNodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Node
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val node: JsonField<InnerNode>,
        private val className: JsonField<String>,
        private val score: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("node") @ExcludeMissing node: JsonField<InnerNode> = JsonMissing.of(),
            @JsonProperty("class_name")
            @ExcludeMissing
            className: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
        ) : this(node, className, score, mutableMapOf())

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun node(): InnerNode = node.getRequired("node")

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
        @JsonProperty("node") @ExcludeMissing fun _node(): JsonField<InnerNode> = node

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
             * Returns a mutable builder for constructing an instance of [Node].
             *
             * The following fields are required:
             * ```java
             * .node()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Node]. */
        class Builder internal constructor() {

            private var node: JsonField<InnerNode>? = null
            private var className: JsonField<String> = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(node: Node) = apply {
                this.node = node.node
                className = node.className
                score = node.score
                additionalProperties = node.additionalProperties.toMutableMap()
            }

            fun node(node: InnerNode) = node(JsonField.of(node))

            /**
             * Sets [Builder.node] to an arbitrary JSON value.
             *
             * You should usually call [Builder.node] with a well-typed [InnerNode] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun node(node: JsonField<InnerNode>) = apply { this.node = node }

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
             * Returns an immutable instance of [Node].
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
            fun build(): Node =
                Node(
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
        fun validate(): Node = apply {
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

        class InnerNode
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val endCharIdx: JsonField<Long>,
            private val pipelineId: JsonField<String>,
            private val retrieverId: JsonField<String>,
            private val retrieverPipelineName: JsonField<String>,
            private val startCharIdx: JsonField<Long>,
            private val text: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("end_char_idx")
                @ExcludeMissing
                endCharIdx: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("pipeline_id")
                @ExcludeMissing
                pipelineId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("retriever_id")
                @ExcludeMissing
                retrieverId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("retriever_pipeline_name")
                @ExcludeMissing
                retrieverPipelineName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("start_char_idx")
                @ExcludeMissing
                startCharIdx: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(
                id,
                endCharIdx,
                pipelineId,
                retrieverId,
                retrieverPipelineName,
                startCharIdx,
                text,
                metadata,
                mutableMapOf(),
            )

            /**
             * The ID of the retrieved node.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The end character index of the retrieved node in the document
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun endCharIdx(): Optional<Long> = endCharIdx.getOptional("end_char_idx")

            /**
             * The ID of the pipeline this node was retrieved from.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pipelineId(): String = pipelineId.getRequired("pipeline_id")

            /**
             * The ID of the retriever this node was retrieved from.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun retrieverId(): String = retrieverId.getRequired("retriever_id")

            /**
             * The name of the retrieval pipeline this node was retrieved from.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun retrieverPipelineName(): String =
                retrieverPipelineName.getRequired("retriever_pipeline_name")

            /**
             * The start character index of the retrieved node in the document
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun startCharIdx(): Optional<Long> = startCharIdx.getOptional("start_char_idx")

            /**
             * The text of the retrieved node.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun text(): String = text.getRequired("text")

            /**
             * Metadata associated with the retrieved node.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [endCharIdx].
             *
             * Unlike [endCharIdx], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("end_char_idx")
            @ExcludeMissing
            fun _endCharIdx(): JsonField<Long> = endCharIdx

            /**
             * Returns the raw JSON value of [pipelineId].
             *
             * Unlike [pipelineId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pipeline_id")
            @ExcludeMissing
            fun _pipelineId(): JsonField<String> = pipelineId

            /**
             * Returns the raw JSON value of [retrieverId].
             *
             * Unlike [retrieverId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("retriever_id")
            @ExcludeMissing
            fun _retrieverId(): JsonField<String> = retrieverId

            /**
             * Returns the raw JSON value of [retrieverPipelineName].
             *
             * Unlike [retrieverPipelineName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("retriever_pipeline_name")
            @ExcludeMissing
            fun _retrieverPipelineName(): JsonField<String> = retrieverPipelineName

            /**
             * Returns the raw JSON value of [startCharIdx].
             *
             * Unlike [startCharIdx], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_char_idx")
            @ExcludeMissing
            fun _startCharIdx(): JsonField<Long> = startCharIdx

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [InnerNode].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .endCharIdx()
                 * .pipelineId()
                 * .retrieverId()
                 * .retrieverPipelineName()
                 * .startCharIdx()
                 * .text()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InnerNode]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var endCharIdx: JsonField<Long>? = null
                private var pipelineId: JsonField<String>? = null
                private var retrieverId: JsonField<String>? = null
                private var retrieverPipelineName: JsonField<String>? = null
                private var startCharIdx: JsonField<Long>? = null
                private var text: JsonField<String>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(innerNode: InnerNode) = apply {
                    id = innerNode.id
                    endCharIdx = innerNode.endCharIdx
                    pipelineId = innerNode.pipelineId
                    retrieverId = innerNode.retrieverId
                    retrieverPipelineName = innerNode.retrieverPipelineName
                    startCharIdx = innerNode.startCharIdx
                    text = innerNode.text
                    metadata = innerNode.metadata
                    additionalProperties = innerNode.additionalProperties.toMutableMap()
                }

                /** The ID of the retrieved node. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The end character index of the retrieved node in the document */
                fun endCharIdx(endCharIdx: Long?) = endCharIdx(JsonField.ofNullable(endCharIdx))

                /**
                 * Alias for [Builder.endCharIdx].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun endCharIdx(endCharIdx: Long) = endCharIdx(endCharIdx as Long?)

                /** Alias for calling [Builder.endCharIdx] with `endCharIdx.orElse(null)`. */
                fun endCharIdx(endCharIdx: Optional<Long>) = endCharIdx(endCharIdx.getOrNull())

                /**
                 * Sets [Builder.endCharIdx] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endCharIdx] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endCharIdx(endCharIdx: JsonField<Long>) = apply { this.endCharIdx = endCharIdx }

                /** The ID of the pipeline this node was retrieved from. */
                fun pipelineId(pipelineId: String) = pipelineId(JsonField.of(pipelineId))

                /**
                 * Sets [Builder.pipelineId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pipelineId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pipelineId(pipelineId: JsonField<String>) = apply {
                    this.pipelineId = pipelineId
                }

                /** The ID of the retriever this node was retrieved from. */
                fun retrieverId(retrieverId: String) = retrieverId(JsonField.of(retrieverId))

                /**
                 * Sets [Builder.retrieverId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.retrieverId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun retrieverId(retrieverId: JsonField<String>) = apply {
                    this.retrieverId = retrieverId
                }

                /** The name of the retrieval pipeline this node was retrieved from. */
                fun retrieverPipelineName(retrieverPipelineName: String) =
                    retrieverPipelineName(JsonField.of(retrieverPipelineName))

                /**
                 * Sets [Builder.retrieverPipelineName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.retrieverPipelineName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun retrieverPipelineName(retrieverPipelineName: JsonField<String>) = apply {
                    this.retrieverPipelineName = retrieverPipelineName
                }

                /** The start character index of the retrieved node in the document */
                fun startCharIdx(startCharIdx: Long?) =
                    startCharIdx(JsonField.ofNullable(startCharIdx))

                /**
                 * Alias for [Builder.startCharIdx].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun startCharIdx(startCharIdx: Long) = startCharIdx(startCharIdx as Long?)

                /** Alias for calling [Builder.startCharIdx] with `startCharIdx.orElse(null)`. */
                fun startCharIdx(startCharIdx: Optional<Long>) =
                    startCharIdx(startCharIdx.getOrNull())

                /**
                 * Sets [Builder.startCharIdx] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startCharIdx] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun startCharIdx(startCharIdx: JsonField<Long>) = apply {
                    this.startCharIdx = startCharIdx
                }

                /** The text of the retrieved node. */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                /** Metadata associated with the retrieved node. */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [InnerNode].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .endCharIdx()
                 * .pipelineId()
                 * .retrieverId()
                 * .retrieverPipelineName()
                 * .startCharIdx()
                 * .text()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InnerNode =
                    InnerNode(
                        checkRequired("id", id),
                        checkRequired("endCharIdx", endCharIdx),
                        checkRequired("pipelineId", pipelineId),
                        checkRequired("retrieverId", retrieverId),
                        checkRequired("retrieverPipelineName", retrieverPipelineName),
                        checkRequired("startCharIdx", startCharIdx),
                        checkRequired("text", text),
                        metadata,
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
            fun validate(): InnerNode = apply {
                if (validated) {
                    return@apply
                }

                id()
                endCharIdx()
                pipelineId()
                retrieverId()
                retrieverPipelineName()
                startCharIdx()
                text()
                metadata().ifPresent { it.validate() }
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
                    (if (endCharIdx.asKnown().isPresent) 1 else 0) +
                    (if (pipelineId.asKnown().isPresent) 1 else 0) +
                    (if (retrieverId.asKnown().isPresent) 1 else 0) +
                    (if (retrieverPipelineName.asKnown().isPresent) 1 else 0) +
                    (if (startCharIdx.asKnown().isPresent) 1 else 0) +
                    (if (text.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0)

            /** Metadata associated with the retrieved node. */
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
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InnerNode &&
                    id == other.id &&
                    endCharIdx == other.endCharIdx &&
                    pipelineId == other.pipelineId &&
                    retrieverId == other.retrieverId &&
                    retrieverPipelineName == other.retrieverPipelineName &&
                    startCharIdx == other.startCharIdx &&
                    text == other.text &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    endCharIdx,
                    pipelineId,
                    retrieverId,
                    retrieverPipelineName,
                    startCharIdx,
                    text,
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InnerNode{id=$id, endCharIdx=$endCharIdx, pipelineId=$pipelineId, retrieverId=$retrieverId, retrieverPipelineName=$retrieverPipelineName, startCharIdx=$startCharIdx, text=$text, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Node &&
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
            "Node{node=$node, className=$className, score=$score, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompositeRetrievalResult &&
            imageNodes == other.imageNodes &&
            nodes == other.nodes &&
            pageFigureNodes == other.pageFigureNodes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(imageNodes, nodes, pageFigureNodes, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompositeRetrievalResult{imageNodes=$imageNodes, nodes=$nodes, pageFigureNodes=$pageFigureNodes, additionalProperties=$additionalProperties}"
}
