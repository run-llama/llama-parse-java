// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.chat

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Paginated list of chat sessions. */
class ChatListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<ChatListResponse>>,
    private val nextPageToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<ChatListResponse>> = JsonMissing.of(),
        @JsonProperty("next_page_token")
        @ExcludeMissing
        nextPageToken: JsonField<String> = JsonMissing.of(),
    ) : this(items, nextPageToken, mutableMapOf())

    /**
     * Chat sessions for the current page.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<ChatListResponse> = items.getRequired("items")

    /**
     * Opaque token to retrieve the next page. Omitted when there are no further pages.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPageToken(): Optional<String> = nextPageToken.getOptional("next_page_token")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<ChatListResponse>> = items

    /**
     * Returns the raw JSON value of [nextPageToken].
     *
     * Unlike [nextPageToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_page_token")
    @ExcludeMissing
    fun _nextPageToken(): JsonField<String> = nextPageToken

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
         * Returns a mutable builder for constructing an instance of [ChatListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatListPageResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<ChatListResponse>>? = null
        private var nextPageToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatListPageResponse: ChatListPageResponse) = apply {
            items = chatListPageResponse.items.map { it.toMutableList() }
            nextPageToken = chatListPageResponse.nextPageToken
            additionalProperties = chatListPageResponse.additionalProperties.toMutableMap()
        }

        /** Chat sessions for the current page. */
        fun items(items: List<ChatListResponse>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<ChatListResponse>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun items(items: JsonField<List<ChatListResponse>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChatListResponse] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: ChatListResponse) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /** Opaque token to retrieve the next page. Omitted when there are no further pages. */
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
         * Returns an immutable instance of [ChatListPageResponse].
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
        fun build(): ChatListPageResponse =
            ChatListPageResponse(
                checkRequired("items", items).map { it.toImmutable() },
                nextPageToken,
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
    fun validate(): ChatListPageResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        nextPageToken()
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
            (if (nextPageToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatListPageResponse &&
            items == other.items &&
            nextPageToken == other.nextPageToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, nextPageToken, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatListPageResponse{items=$items, nextPageToken=$nextPageToken, additionalProperties=$additionalProperties}"
}
