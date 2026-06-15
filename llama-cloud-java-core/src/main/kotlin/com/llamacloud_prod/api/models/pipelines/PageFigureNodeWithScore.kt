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
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Page figure metadata with score */
class PageFigureNodeWithScore
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val node: JsonField<Node>,
    private val score: JsonField<Double>,
    private val className: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("node") @ExcludeMissing node: JsonField<Node> = JsonMissing.of(),
        @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
    ) : this(node, score, className, mutableMapOf())

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun node(): Node = node.getRequired("node")

    /**
     * The score of the figure node
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun score(): Double = score.getRequired("score")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * Returns the raw JSON value of [node].
     *
     * Unlike [node], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("node") @ExcludeMissing fun _node(): JsonField<Node> = node

    /**
     * Returns the raw JSON value of [score].
     *
     * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

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
         * Returns a mutable builder for constructing an instance of [PageFigureNodeWithScore].
         *
         * The following fields are required:
         * ```java
         * .node()
         * .score()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PageFigureNodeWithScore]. */
    class Builder internal constructor() {

        private var node: JsonField<Node>? = null
        private var score: JsonField<Double>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pageFigureNodeWithScore: PageFigureNodeWithScore) = apply {
            node = pageFigureNodeWithScore.node
            score = pageFigureNodeWithScore.score
            className = pageFigureNodeWithScore.className
            additionalProperties = pageFigureNodeWithScore.additionalProperties.toMutableMap()
        }

        fun node(node: Node) = node(JsonField.of(node))

        /**
         * Sets [Builder.node] to an arbitrary JSON value.
         *
         * You should usually call [Builder.node] with a well-typed [Node] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun node(node: JsonField<Node>) = apply { this.node = node }

        /** The score of the figure node */
        fun score(score: Double) = score(JsonField.of(score))

        /**
         * Sets [Builder.score] to an arbitrary JSON value.
         *
         * You should usually call [Builder.score] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun score(score: JsonField<Double>) = apply { this.score = score }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

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
         * Returns an immutable instance of [PageFigureNodeWithScore].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .node()
         * .score()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PageFigureNodeWithScore =
            PageFigureNodeWithScore(
                checkRequired("node", node),
                checkRequired("score", score),
                className,
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
    fun validate(): PageFigureNodeWithScore = apply {
        if (validated) {
            return@apply
        }

        node().validate()
        score()
        className()
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
        (node.asKnown().getOrNull()?.validity() ?: 0) +
            (if (score.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0)

    class Node
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val confidence: JsonField<Double>,
        private val figureName: JsonField<String>,
        private val figureSize: JsonField<Long>,
        private val fileId: JsonField<String>,
        private val pageIndex: JsonField<Long>,
        private val isLikelyNoise: JsonField<Boolean>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("figure_name")
            @ExcludeMissing
            figureName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("figure_size")
            @ExcludeMissing
            figureSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page_index")
            @ExcludeMissing
            pageIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("is_likely_noise")
            @ExcludeMissing
            isLikelyNoise: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(
            confidence,
            figureName,
            figureSize,
            fileId,
            pageIndex,
            isLikelyNoise,
            metadata,
            mutableMapOf(),
        )

        /**
         * The confidence of the figure
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun confidence(): Double = confidence.getRequired("confidence")

        /**
         * The name of the figure
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun figureName(): String = figureName.getRequired("figure_name")

        /**
         * The size of the figure in bytes
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun figureSize(): Long = figureSize.getRequired("figure_size")

        /**
         * The ID of the file that the figure was taken from
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileId(): String = fileId.getRequired("file_id")

        /**
         * The index of the page for which the figure is taken (0-indexed)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pageIndex(): Long = pageIndex.getRequired("page_index")

        /**
         * Whether the figure is likely to be noise
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isLikelyNoise(): Optional<Boolean> = isLikelyNoise.getOptional("is_likely_noise")

        /**
         * Metadata for the figure
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Double> = confidence

        /**
         * Returns the raw JSON value of [figureName].
         *
         * Unlike [figureName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("figure_name")
        @ExcludeMissing
        fun _figureName(): JsonField<String> = figureName

        /**
         * Returns the raw JSON value of [figureSize].
         *
         * Unlike [figureSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("figure_size") @ExcludeMissing fun _figureSize(): JsonField<Long> = figureSize

        /**
         * Returns the raw JSON value of [fileId].
         *
         * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

        /**
         * Returns the raw JSON value of [pageIndex].
         *
         * Unlike [pageIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_index") @ExcludeMissing fun _pageIndex(): JsonField<Long> = pageIndex

        /**
         * Returns the raw JSON value of [isLikelyNoise].
         *
         * Unlike [isLikelyNoise], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_likely_noise")
        @ExcludeMissing
        fun _isLikelyNoise(): JsonField<Boolean> = isLikelyNoise

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
             * .confidence()
             * .figureName()
             * .figureSize()
             * .fileId()
             * .pageIndex()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Node]. */
        class Builder internal constructor() {

            private var confidence: JsonField<Double>? = null
            private var figureName: JsonField<String>? = null
            private var figureSize: JsonField<Long>? = null
            private var fileId: JsonField<String>? = null
            private var pageIndex: JsonField<Long>? = null
            private var isLikelyNoise: JsonField<Boolean> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(node: Node) = apply {
                confidence = node.confidence
                figureName = node.figureName
                figureSize = node.figureSize
                fileId = node.fileId
                pageIndex = node.pageIndex
                isLikelyNoise = node.isLikelyNoise
                metadata = node.metadata
                additionalProperties = node.additionalProperties.toMutableMap()
            }

            /** The confidence of the figure */
            fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

            /** The name of the figure */
            fun figureName(figureName: String) = figureName(JsonField.of(figureName))

            /**
             * Sets [Builder.figureName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.figureName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun figureName(figureName: JsonField<String>) = apply { this.figureName = figureName }

            /** The size of the figure in bytes */
            fun figureSize(figureSize: Long) = figureSize(JsonField.of(figureSize))

            /**
             * Sets [Builder.figureSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.figureSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun figureSize(figureSize: JsonField<Long>) = apply { this.figureSize = figureSize }

            /** The ID of the file that the figure was taken from */
            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

            /**
             * Sets [Builder.fileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

            /** The index of the page for which the figure is taken (0-indexed) */
            fun pageIndex(pageIndex: Long) = pageIndex(JsonField.of(pageIndex))

            /**
             * Sets [Builder.pageIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageIndex(pageIndex: JsonField<Long>) = apply { this.pageIndex = pageIndex }

            /** Whether the figure is likely to be noise */
            fun isLikelyNoise(isLikelyNoise: Boolean) = isLikelyNoise(JsonField.of(isLikelyNoise))

            /**
             * Sets [Builder.isLikelyNoise] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isLikelyNoise] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isLikelyNoise(isLikelyNoise: JsonField<Boolean>) = apply {
                this.isLikelyNoise = isLikelyNoise
            }

            /** Metadata for the figure */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
             * .confidence()
             * .figureName()
             * .figureSize()
             * .fileId()
             * .pageIndex()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Node =
                Node(
                    checkRequired("confidence", confidence),
                    checkRequired("figureName", figureName),
                    checkRequired("figureSize", figureSize),
                    checkRequired("fileId", fileId),
                    checkRequired("pageIndex", pageIndex),
                    isLikelyNoise,
                    metadata,
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

            confidence()
            figureName()
            figureSize()
            fileId()
            pageIndex()
            isLikelyNoise()
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
            (if (confidence.asKnown().isPresent) 1 else 0) +
                (if (figureName.asKnown().isPresent) 1 else 0) +
                (if (figureSize.asKnown().isPresent) 1 else 0) +
                (if (fileId.asKnown().isPresent) 1 else 0) +
                (if (pageIndex.asKnown().isPresent) 1 else 0) +
                (if (isLikelyNoise.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0)

        /** Metadata for the figure */
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
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Node &&
                confidence == other.confidence &&
                figureName == other.figureName &&
                figureSize == other.figureSize &&
                fileId == other.fileId &&
                pageIndex == other.pageIndex &&
                isLikelyNoise == other.isLikelyNoise &&
                metadata == other.metadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                confidence,
                figureName,
                figureSize,
                fileId,
                pageIndex,
                isLikelyNoise,
                metadata,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Node{confidence=$confidence, figureName=$figureName, figureSize=$figureSize, fileId=$fileId, pageIndex=$pageIndex, isLikelyNoise=$isLikelyNoise, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PageFigureNodeWithScore &&
            node == other.node &&
            score == other.score &&
            className == other.className &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(node, score, className, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PageFigureNodeWithScore{node=$node, score=$score, className=$className, additionalProperties=$additionalProperties}"
}
