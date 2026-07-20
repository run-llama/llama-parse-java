// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.images

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ImageListPageFiguresResponse
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
        @JsonProperty("figure_size") @ExcludeMissing figureSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("page_index") @ExcludeMissing pageIndex: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("is_likely_noise")
        @ExcludeMissing
        isLikelyNoise: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
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
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isLikelyNoise(): Optional<Boolean> = isLikelyNoise.getOptional("is_likely_noise")

    /**
     * Metadata for the figure
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Returns the raw JSON value of [confidence].
     *
     * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confidence") @ExcludeMissing fun _confidence(): JsonField<Double> = confidence

    /**
     * Returns the raw JSON value of [figureName].
     *
     * Unlike [figureName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("figure_name") @ExcludeMissing fun _figureName(): JsonField<String> = figureName

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
     * Unlike [isLikelyNoise], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [ImageListPageFiguresResponse].
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

    /** A builder for [ImageListPageFiguresResponse]. */
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
        internal fun from(imageListPageFiguresResponse: ImageListPageFiguresResponse) = apply {
            confidence = imageListPageFiguresResponse.confidence
            figureName = imageListPageFiguresResponse.figureName
            figureSize = imageListPageFiguresResponse.figureSize
            fileId = imageListPageFiguresResponse.fileId
            pageIndex = imageListPageFiguresResponse.pageIndex
            isLikelyNoise = imageListPageFiguresResponse.isLikelyNoise
            metadata = imageListPageFiguresResponse.metadata
            additionalProperties = imageListPageFiguresResponse.additionalProperties.toMutableMap()
        }

        /** The confidence of the figure */
        fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

        /**
         * Sets [Builder.confidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidence] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

        /** The name of the figure */
        fun figureName(figureName: String) = figureName(JsonField.of(figureName))

        /**
         * Sets [Builder.figureName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.figureName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun figureName(figureName: JsonField<String>) = apply { this.figureName = figureName }

        /** The size of the figure in bytes */
        fun figureSize(figureSize: Long) = figureSize(JsonField.of(figureSize))

        /**
         * Sets [Builder.figureSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.figureSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun figureSize(figureSize: JsonField<Long>) = apply { this.figureSize = figureSize }

        /** The ID of the file that the figure was taken from */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /** The index of the page for which the figure is taken (0-indexed) */
        fun pageIndex(pageIndex: Long) = pageIndex(JsonField.of(pageIndex))

        /**
         * Sets [Builder.pageIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageIndex] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [ImageListPageFiguresResponse].
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
        fun build(): ImageListPageFiguresResponse =
            ImageListPageFiguresResponse(
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ImageListPageFiguresResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImageListPageFiguresResponse &&
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
        "ImageListPageFiguresResponse{confidence=$confidence, figureName=$figureName, figureSize=$figureSize, fileId=$fileId, pageIndex=$pageIndex, isLikelyNoise=$isLikelyNoise, metadata=$metadata, additionalProperties=$additionalProperties}"
}
