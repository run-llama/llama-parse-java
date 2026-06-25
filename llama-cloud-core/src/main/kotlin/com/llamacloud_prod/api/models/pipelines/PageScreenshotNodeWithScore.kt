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

/** Page screenshot metadata with score */
class PageScreenshotNodeWithScore
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
     * The score of the screenshot node
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
         * Returns a mutable builder for constructing an instance of [PageScreenshotNodeWithScore].
         *
         * The following fields are required:
         * ```java
         * .node()
         * .score()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PageScreenshotNodeWithScore]. */
    class Builder internal constructor() {

        private var node: JsonField<Node>? = null
        private var score: JsonField<Double>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pageScreenshotNodeWithScore: PageScreenshotNodeWithScore) = apply {
            node = pageScreenshotNodeWithScore.node
            score = pageScreenshotNodeWithScore.score
            className = pageScreenshotNodeWithScore.className
            additionalProperties = pageScreenshotNodeWithScore.additionalProperties.toMutableMap()
        }

        fun node(node: Node) = node(JsonField.of(node))

        /**
         * Sets [Builder.node] to an arbitrary JSON value.
         *
         * You should usually call [Builder.node] with a well-typed [Node] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun node(node: JsonField<Node>) = apply { this.node = node }

        /** The score of the screenshot node */
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
         * Returns an immutable instance of [PageScreenshotNodeWithScore].
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
        fun build(): PageScreenshotNodeWithScore =
            PageScreenshotNodeWithScore(
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
    fun validate(): PageScreenshotNodeWithScore = apply {
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
        private val fileId: JsonField<String>,
        private val imageSize: JsonField<Long>,
        private val pageIndex: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("image_size")
            @ExcludeMissing
            imageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_index")
            @ExcludeMissing
            pageIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(fileId, imageSize, pageIndex, metadata, mutableMapOf())

        /**
         * The ID of the file that the page screenshot was taken from
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileId(): String = fileId.getRequired("file_id")

        /**
         * The size of the image in bytes
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun imageSize(): Long = imageSize.getRequired("image_size")

        /**
         * The index of the page for which the screenshot is taken (0-indexed)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pageIndex(): Long = pageIndex.getRequired("page_index")

        /**
         * Metadata for the screenshot
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Returns the raw JSON value of [fileId].
         *
         * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

        /**
         * Returns the raw JSON value of [imageSize].
         *
         * Unlike [imageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_size") @ExcludeMissing fun _imageSize(): JsonField<Long> = imageSize

        /**
         * Returns the raw JSON value of [pageIndex].
         *
         * Unlike [pageIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_index") @ExcludeMissing fun _pageIndex(): JsonField<Long> = pageIndex

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
             * .fileId()
             * .imageSize()
             * .pageIndex()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Node]. */
        class Builder internal constructor() {

            private var fileId: JsonField<String>? = null
            private var imageSize: JsonField<Long>? = null
            private var pageIndex: JsonField<Long>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(node: Node) = apply {
                fileId = node.fileId
                imageSize = node.imageSize
                pageIndex = node.pageIndex
                metadata = node.metadata
                additionalProperties = node.additionalProperties.toMutableMap()
            }

            /** The ID of the file that the page screenshot was taken from */
            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

            /**
             * Sets [Builder.fileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

            /** The size of the image in bytes */
            fun imageSize(imageSize: Long) = imageSize(JsonField.of(imageSize))

            /**
             * Sets [Builder.imageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageSize(imageSize: JsonField<Long>) = apply { this.imageSize = imageSize }

            /** The index of the page for which the screenshot is taken (0-indexed) */
            fun pageIndex(pageIndex: Long) = pageIndex(JsonField.of(pageIndex))

            /**
             * Sets [Builder.pageIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageIndex(pageIndex: JsonField<Long>) = apply { this.pageIndex = pageIndex }

            /** Metadata for the screenshot */
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
             * .fileId()
             * .imageSize()
             * .pageIndex()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Node =
                Node(
                    checkRequired("fileId", fileId),
                    checkRequired("imageSize", imageSize),
                    checkRequired("pageIndex", pageIndex),
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

            fileId()
            imageSize()
            pageIndex()
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
            (if (fileId.asKnown().isPresent) 1 else 0) +
                (if (imageSize.asKnown().isPresent) 1 else 0) +
                (if (pageIndex.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0)

        /** Metadata for the screenshot */
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
                fileId == other.fileId &&
                imageSize == other.imageSize &&
                pageIndex == other.pageIndex &&
                metadata == other.metadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(fileId, imageSize, pageIndex, metadata, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Node{fileId=$fileId, imageSize=$imageSize, pageIndex=$pageIndex, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PageScreenshotNodeWithScore &&
            node == other.node &&
            score == other.score &&
            className == other.className &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(node, score, className, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PageScreenshotNodeWithScore{node=$node, score=$score, className=$className, additionalProperties=$additionalProperties}"
}
