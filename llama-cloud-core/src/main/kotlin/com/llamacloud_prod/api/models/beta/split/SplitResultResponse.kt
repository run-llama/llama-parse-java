// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.split

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Result of a completed split job. */
class SplitResultResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val segments: JsonField<List<SplitSegmentResponse>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("segments")
        @ExcludeMissing
        segments: JsonField<List<SplitSegmentResponse>> = JsonMissing.of()
    ) : this(segments, mutableMapOf())

    /**
     * List of document segments.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun segments(): List<SplitSegmentResponse> = segments.getRequired("segments")

    /**
     * Returns the raw JSON value of [segments].
     *
     * Unlike [segments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segments")
    @ExcludeMissing
    fun _segments(): JsonField<List<SplitSegmentResponse>> = segments

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
         * Returns a mutable builder for constructing an instance of [SplitResultResponse].
         *
         * The following fields are required:
         * ```java
         * .segments()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SplitResultResponse]. */
    class Builder internal constructor() {

        private var segments: JsonField<MutableList<SplitSegmentResponse>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(splitResultResponse: SplitResultResponse) = apply {
            segments = splitResultResponse.segments.map { it.toMutableList() }
            additionalProperties = splitResultResponse.additionalProperties.toMutableMap()
        }

        /** List of document segments. */
        fun segments(segments: List<SplitSegmentResponse>) = segments(JsonField.of(segments))

        /**
         * Sets [Builder.segments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segments] with a well-typed `List<SplitSegmentResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun segments(segments: JsonField<List<SplitSegmentResponse>>) = apply {
            this.segments = segments.map { it.toMutableList() }
        }

        /**
         * Adds a single [SplitSegmentResponse] to [segments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSegment(segment: SplitSegmentResponse) = apply {
            segments =
                (segments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("segments", it).add(segment)
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
         * Returns an immutable instance of [SplitResultResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .segments()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SplitResultResponse =
            SplitResultResponse(
                checkRequired("segments", segments).map { it.toImmutable() },
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
    fun validate(): SplitResultResponse = apply {
        if (validated) {
            return@apply
        }

        segments().forEach { it.validate() }
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
        (segments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SplitResultResponse &&
            segments == other.segments &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(segments, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SplitResultResponse{segments=$segments, additionalProperties=$additionalProperties}"
}
