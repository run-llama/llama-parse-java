// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.split

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** A segment of the split document. */
class SplitSegmentResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val category: JsonField<String>,
    private val confidenceCategory: JsonField<String>,
    private val pages: JsonField<List<Long>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confidence_category")
        @ExcludeMissing
        confidenceCategory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Long>> = JsonMissing.of(),
    ) : this(category, confidenceCategory, pages, mutableMapOf())

    /**
     * Category name this split belongs to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): String = category.getRequired("category")

    /**
     * Categorical confidence level. Valid values are: high, medium, low.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun confidenceCategory(): String = confidenceCategory.getRequired("confidence_category")

    /**
     * 1-indexed page numbers in this split.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pages(): List<Long> = pages.getRequired("pages")

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

    /**
     * Returns the raw JSON value of [confidenceCategory].
     *
     * Unlike [confidenceCategory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("confidence_category")
    @ExcludeMissing
    fun _confidenceCategory(): JsonField<String> = confidenceCategory

    /**
     * Returns the raw JSON value of [pages].
     *
     * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Long>> = pages

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
         * Returns a mutable builder for constructing an instance of [SplitSegmentResponse].
         *
         * The following fields are required:
         * ```java
         * .category()
         * .confidenceCategory()
         * .pages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SplitSegmentResponse]. */
    class Builder internal constructor() {

        private var category: JsonField<String>? = null
        private var confidenceCategory: JsonField<String>? = null
        private var pages: JsonField<MutableList<Long>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(splitSegmentResponse: SplitSegmentResponse) = apply {
            category = splitSegmentResponse.category
            confidenceCategory = splitSegmentResponse.confidenceCategory
            pages = splitSegmentResponse.pages.map { it.toMutableList() }
            additionalProperties = splitSegmentResponse.additionalProperties.toMutableMap()
        }

        /** Category name this split belongs to. */
        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

        /** Categorical confidence level. Valid values are: high, medium, low. */
        fun confidenceCategory(confidenceCategory: String) =
            confidenceCategory(JsonField.of(confidenceCategory))

        /**
         * Sets [Builder.confidenceCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidenceCategory] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun confidenceCategory(confidenceCategory: JsonField<String>) = apply {
            this.confidenceCategory = confidenceCategory
        }

        /** 1-indexed page numbers in this split. */
        fun pages(pages: List<Long>) = pages(JsonField.of(pages))

        /**
         * Sets [Builder.pages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pages] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pages(pages: JsonField<List<Long>>) = apply {
            this.pages = pages.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [pages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPage(page: Long) = apply {
            pages =
                (pages ?: JsonField.of(mutableListOf())).also { checkKnown("pages", it).add(page) }
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
         * Returns an immutable instance of [SplitSegmentResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .category()
         * .confidenceCategory()
         * .pages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SplitSegmentResponse =
            SplitSegmentResponse(
                checkRequired("category", category),
                checkRequired("confidenceCategory", confidenceCategory),
                checkRequired("pages", pages).map { it.toImmutable() },
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
    fun validate(): SplitSegmentResponse = apply {
        if (validated) {
            return@apply
        }

        category()
        confidenceCategory()
        pages()
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
        (if (category.asKnown().isPresent) 1 else 0) +
            (if (confidenceCategory.asKnown().isPresent) 1 else 0) +
            (pages.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SplitSegmentResponse &&
            category == other.category &&
            confidenceCategory == other.confidenceCategory &&
            pages == other.pages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(category, confidenceCategory, pages, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SplitSegmentResponse{category=$category, confidenceCategory=$confidenceCategory, pages=$pages, additionalProperties=$additionalProperties}"
}
