// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.retrieval

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** A single grep match within a file. */
class RetrievalGrepResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<String>,
    private val endChar: JsonField<Long>,
    private val startChar: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_char") @ExcludeMissing endChar: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("start_char") @ExcludeMissing startChar: JsonField<Long> = JsonMissing.of(),
    ) : this(content, endChar, startChar, mutableMapOf())

    /**
     * Matched text content.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): String = content.getRequired("content")

    /**
     * End character offset of the match.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endChar(): Long = endChar.getRequired("end_char")

    /**
     * Start character offset of the match.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startChar(): Long = startChar.getRequired("start_char")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [endChar].
     *
     * Unlike [endChar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_char") @ExcludeMissing fun _endChar(): JsonField<Long> = endChar

    /**
     * Returns the raw JSON value of [startChar].
     *
     * Unlike [startChar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_char") @ExcludeMissing fun _startChar(): JsonField<Long> = startChar

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
         * Returns a mutable builder for constructing an instance of [RetrievalGrepResponse].
         *
         * The following fields are required:
         * ```java
         * .content()
         * .endChar()
         * .startChar()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrievalGrepResponse]. */
    class Builder internal constructor() {

        private var content: JsonField<String>? = null
        private var endChar: JsonField<Long>? = null
        private var startChar: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(retrievalGrepResponse: RetrievalGrepResponse) = apply {
            content = retrievalGrepResponse.content
            endChar = retrievalGrepResponse.endChar
            startChar = retrievalGrepResponse.startChar
            additionalProperties = retrievalGrepResponse.additionalProperties.toMutableMap()
        }

        /** Matched text content. */
        fun content(content: String) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        /** End character offset of the match. */
        fun endChar(endChar: Long) = endChar(JsonField.of(endChar))

        /**
         * Sets [Builder.endChar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endChar] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endChar(endChar: JsonField<Long>) = apply { this.endChar = endChar }

        /** Start character offset of the match. */
        fun startChar(startChar: Long) = startChar(JsonField.of(startChar))

        /**
         * Sets [Builder.startChar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startChar] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startChar(startChar: JsonField<Long>) = apply { this.startChar = startChar }

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
         * Returns an immutable instance of [RetrievalGrepResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .content()
         * .endChar()
         * .startChar()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetrievalGrepResponse =
            RetrievalGrepResponse(
                checkRequired("content", content),
                checkRequired("endChar", endChar),
                checkRequired("startChar", startChar),
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
    fun validate(): RetrievalGrepResponse = apply {
        if (validated) {
            return@apply
        }

        content()
        endChar()
        startChar()
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
        (if (content.asKnown().isPresent) 1 else 0) +
            (if (endChar.asKnown().isPresent) 1 else 0) +
            (if (startChar.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrievalGrepResponse &&
            content == other.content &&
            endChar == other.endChar &&
            startChar == other.startChar &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(content, endChar, startChar, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RetrievalGrepResponse{content=$content, endChar=$endChar, startChar=$startChar, additionalProperties=$additionalProperties}"
}
