// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.sheets

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SheetListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<SheetsJob>>,
    private val nextPageToken: JsonField<String>,
    private val totalSize: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<SheetsJob>> = JsonMissing.of(),
        @JsonProperty("next_page_token")
        @ExcludeMissing
        nextPageToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_size") @ExcludeMissing totalSize: JsonField<Long> = JsonMissing.of(),
    ) : this(items, nextPageToken, totalSize, mutableMapOf())

    /**
     * The list of items.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<SheetsJob> = items.getRequired("items")

    /**
     * A token, which can be sent as page_token to retrieve the next page. If this field is omitted,
     * there are no subsequent pages.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPageToken(): Optional<String> = nextPageToken.getOptional("next_page_token")

    /**
     * The total number of items available. This is only populated when specifically requested. The
     * value may be an estimate and can be used for display purposes only.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalSize(): Optional<Long> = totalSize.getOptional("total_size")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<SheetsJob>> = items

    /**
     * Returns the raw JSON value of [nextPageToken].
     *
     * Unlike [nextPageToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_page_token")
    @ExcludeMissing
    fun _nextPageToken(): JsonField<String> = nextPageToken

    /**
     * Returns the raw JSON value of [totalSize].
     *
     * Unlike [totalSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_size") @ExcludeMissing fun _totalSize(): JsonField<Long> = totalSize

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
         * Returns a mutable builder for constructing an instance of [SheetListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SheetListPageResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<SheetsJob>>? = null
        private var nextPageToken: JsonField<String> = JsonMissing.of()
        private var totalSize: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sheetListPageResponse: SheetListPageResponse) = apply {
            items = sheetListPageResponse.items.map { it.toMutableList() }
            nextPageToken = sheetListPageResponse.nextPageToken
            totalSize = sheetListPageResponse.totalSize
            additionalProperties = sheetListPageResponse.additionalProperties.toMutableMap()
        }

        /** The list of items. */
        fun items(items: List<SheetsJob>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<SheetsJob>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun items(items: JsonField<List<SheetsJob>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [SheetsJob] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: SheetsJob) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /**
         * A token, which can be sent as page_token to retrieve the next page. If this field is
         * omitted, there are no subsequent pages.
         */
        fun nextPageToken(nextPageToken: String?) =
            nextPageToken(JsonField.ofNullable(nextPageToken))

        /** Alias for calling [Builder.nextPageToken] with `nextPageToken.orElse(null)`. */
        fun nextPageToken(nextPageToken: Optional<String>) =
            nextPageToken(nextPageToken.getOrNull())

        /**
         * Sets [Builder.nextPageToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPageToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextPageToken(nextPageToken: JsonField<String>) = apply {
            this.nextPageToken = nextPageToken
        }

        /**
         * The total number of items available. This is only populated when specifically requested.
         * The value may be an estimate and can be used for display purposes only.
         */
        fun totalSize(totalSize: Long?) = totalSize(JsonField.ofNullable(totalSize))

        /**
         * Alias for [Builder.totalSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalSize(totalSize: Long) = totalSize(totalSize as Long?)

        /** Alias for calling [Builder.totalSize] with `totalSize.orElse(null)`. */
        fun totalSize(totalSize: Optional<Long>) = totalSize(totalSize.getOrNull())

        /**
         * Sets [Builder.totalSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalSize(totalSize: JsonField<Long>) = apply { this.totalSize = totalSize }

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
         * Returns an immutable instance of [SheetListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SheetListPageResponse =
            SheetListPageResponse(
                checkRequired("items", items).map { it.toImmutable() },
                nextPageToken,
                totalSize,
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
    fun validate(): SheetListPageResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        nextPageToken()
        totalSize()
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextPageToken.asKnown().isPresent) 1 else 0) +
            (if (totalSize.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SheetListPageResponse &&
            items == other.items &&
            nextPageToken == other.nextPageToken &&
            totalSize == other.totalSize &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(items, nextPageToken, totalSize, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SheetListPageResponse{items=$items, nextPageToken=$nextPageToken, totalSize=$totalSize, additionalProperties=$additionalProperties}"
}
