// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Bounding box with coordinates and optional metadata. */
class BBox
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val h: JsonField<Double>,
    private val w: JsonField<Double>,
    private val x: JsonField<Double>,
    private val y: JsonField<Double>,
    private val confidence: JsonField<Double>,
    private val endIndex: JsonField<Long>,
    private val label: JsonField<String>,
    private val r: JsonField<Double>,
    private val startIndex: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("h") @ExcludeMissing h: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w") @ExcludeMissing w: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("x") @ExcludeMissing x: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("y") @ExcludeMissing y: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("confidence")
        @ExcludeMissing
        confidence: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("end_index") @ExcludeMissing endIndex: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("r") @ExcludeMissing r: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_index") @ExcludeMissing startIndex: JsonField<Long> = JsonMissing.of(),
    ) : this(h, w, x, y, confidence, endIndex, label, r, startIndex, mutableMapOf())

    /**
     * Height of the bounding box
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun h(): Double = h.getRequired("h")

    /**
     * Width of the bounding box
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun w(): Double = w.getRequired("w")

    /**
     * X coordinate of the bounding box
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun x(): Double = x.getRequired("x")

    /**
     * Y coordinate of the bounding box
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun y(): Double = y.getRequired("y")

    /**
     * Confidence score
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun confidence(): Optional<Double> = confidence.getOptional("confidence")

    /**
     * End index in the text
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endIndex(): Optional<Long> = endIndex.getOptional("end_index")

    /**
     * Label for the bounding box
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Optional visual text rotation angle in degrees. Omitted when unrotated.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun r(): Optional<Double> = r.getOptional("r")

    /**
     * Start index in the text
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startIndex(): Optional<Long> = startIndex.getOptional("start_index")

    /**
     * Returns the raw JSON value of [h].
     *
     * Unlike [h], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("h") @ExcludeMissing fun _h(): JsonField<Double> = h

    /**
     * Returns the raw JSON value of [w].
     *
     * Unlike [w], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w") @ExcludeMissing fun _w(): JsonField<Double> = w

    /**
     * Returns the raw JSON value of [x].
     *
     * Unlike [x], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<Double> = x

    /**
     * Returns the raw JSON value of [y].
     *
     * Unlike [y], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("y") @ExcludeMissing fun _y(): JsonField<Double> = y

    /**
     * Returns the raw JSON value of [confidence].
     *
     * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confidence") @ExcludeMissing fun _confidence(): JsonField<Double> = confidence

    /**
     * Returns the raw JSON value of [endIndex].
     *
     * Unlike [endIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_index") @ExcludeMissing fun _endIndex(): JsonField<Long> = endIndex

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [r].
     *
     * Unlike [r], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("r") @ExcludeMissing fun _r(): JsonField<Double> = r

    /**
     * Returns the raw JSON value of [startIndex].
     *
     * Unlike [startIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_index") @ExcludeMissing fun _startIndex(): JsonField<Long> = startIndex

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
         * Returns a mutable builder for constructing an instance of [BBox].
         *
         * The following fields are required:
         * ```java
         * .h()
         * .w()
         * .x()
         * .y()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BBox]. */
    class Builder internal constructor() {

        private var h: JsonField<Double>? = null
        private var w: JsonField<Double>? = null
        private var x: JsonField<Double>? = null
        private var y: JsonField<Double>? = null
        private var confidence: JsonField<Double> = JsonMissing.of()
        private var endIndex: JsonField<Long> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var r: JsonField<Double> = JsonMissing.of()
        private var startIndex: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bBox: BBox) = apply {
            h = bBox.h
            w = bBox.w
            x = bBox.x
            y = bBox.y
            confidence = bBox.confidence
            endIndex = bBox.endIndex
            label = bBox.label
            r = bBox.r
            startIndex = bBox.startIndex
            additionalProperties = bBox.additionalProperties.toMutableMap()
        }

        /** Height of the bounding box */
        fun h(h: Double) = h(JsonField.of(h))

        /**
         * Sets [Builder.h] to an arbitrary JSON value.
         *
         * You should usually call [Builder.h] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun h(h: JsonField<Double>) = apply { this.h = h }

        /** Width of the bounding box */
        fun w(w: Double) = w(JsonField.of(w))

        /**
         * Sets [Builder.w] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w(w: JsonField<Double>) = apply { this.w = w }

        /** X coordinate of the bounding box */
        fun x(x: Double) = x(JsonField.of(x))

        /**
         * Sets [Builder.x] to an arbitrary JSON value.
         *
         * You should usually call [Builder.x] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun x(x: JsonField<Double>) = apply { this.x = x }

        /** Y coordinate of the bounding box */
        fun y(y: Double) = y(JsonField.of(y))

        /**
         * Sets [Builder.y] to an arbitrary JSON value.
         *
         * You should usually call [Builder.y] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun y(y: JsonField<Double>) = apply { this.y = y }

        /** Confidence score */
        fun confidence(confidence: Double?) = confidence(JsonField.ofNullable(confidence))

        /**
         * Alias for [Builder.confidence].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun confidence(confidence: Double) = confidence(confidence as Double?)

        /** Alias for calling [Builder.confidence] with `confidence.orElse(null)`. */
        fun confidence(confidence: Optional<Double>) = confidence(confidence.getOrNull())

        /**
         * Sets [Builder.confidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidence] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

        /** End index in the text */
        fun endIndex(endIndex: Long?) = endIndex(JsonField.ofNullable(endIndex))

        /**
         * Alias for [Builder.endIndex].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun endIndex(endIndex: Long) = endIndex(endIndex as Long?)

        /** Alias for calling [Builder.endIndex] with `endIndex.orElse(null)`. */
        fun endIndex(endIndex: Optional<Long>) = endIndex(endIndex.getOrNull())

        /**
         * Sets [Builder.endIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endIndex] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endIndex(endIndex: JsonField<Long>) = apply { this.endIndex = endIndex }

        /** Label for the bounding box */
        fun label(label: String?) = label(JsonField.ofNullable(label))

        /** Alias for calling [Builder.label] with `label.orElse(null)`. */
        fun label(label: Optional<String>) = label(label.getOrNull())

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Optional visual text rotation angle in degrees. Omitted when unrotated. */
        fun r(r: Double?) = r(JsonField.ofNullable(r))

        /**
         * Alias for [Builder.r].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun r(r: Double) = r(r as Double?)

        /** Alias for calling [Builder.r] with `r.orElse(null)`. */
        fun r(r: Optional<Double>) = r(r.getOrNull())

        /**
         * Sets [Builder.r] to an arbitrary JSON value.
         *
         * You should usually call [Builder.r] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun r(r: JsonField<Double>) = apply { this.r = r }

        /** Start index in the text */
        fun startIndex(startIndex: Long?) = startIndex(JsonField.ofNullable(startIndex))

        /**
         * Alias for [Builder.startIndex].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun startIndex(startIndex: Long) = startIndex(startIndex as Long?)

        /** Alias for calling [Builder.startIndex] with `startIndex.orElse(null)`. */
        fun startIndex(startIndex: Optional<Long>) = startIndex(startIndex.getOrNull())

        /**
         * Sets [Builder.startIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startIndex] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startIndex(startIndex: JsonField<Long>) = apply { this.startIndex = startIndex }

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
         * Returns an immutable instance of [BBox].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .h()
         * .w()
         * .x()
         * .y()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BBox =
            BBox(
                checkRequired("h", h),
                checkRequired("w", w),
                checkRequired("x", x),
                checkRequired("y", y),
                confidence,
                endIndex,
                label,
                r,
                startIndex,
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
    fun validate(): BBox = apply {
        if (validated) {
            return@apply
        }

        h()
        w()
        x()
        y()
        confidence()
        endIndex()
        label()
        r()
        startIndex()
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
        (if (h.asKnown().isPresent) 1 else 0) +
            (if (w.asKnown().isPresent) 1 else 0) +
            (if (x.asKnown().isPresent) 1 else 0) +
            (if (y.asKnown().isPresent) 1 else 0) +
            (if (confidence.asKnown().isPresent) 1 else 0) +
            (if (endIndex.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (r.asKnown().isPresent) 1 else 0) +
            (if (startIndex.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BBox &&
            h == other.h &&
            w == other.w &&
            x == other.x &&
            y == other.y &&
            confidence == other.confidence &&
            endIndex == other.endIndex &&
            label == other.label &&
            r == other.r &&
            startIndex == other.startIndex &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(h, w, x, y, confidence, endIndex, label, r, startIndex, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BBox{h=$h, w=$w, x=$x, y=$y, confidence=$confidence, endIndex=$endIndex, label=$label, r=$r, startIndex=$startIndex, additionalProperties=$additionalProperties}"
}
