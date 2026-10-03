// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.attachments

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Metadata for a single file attachment. */
class AttachmentListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val size: JsonField<Long>,
    private val lastModified: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("last_modified")
        @ExcludeMissing
        lastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(name, size, lastModified, mutableMapOf())

    /**
     * Name of the attachment
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Size of the attachment in bytes
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun size(): Long = size.getRequired("size")

    /**
     * When the attachment was last modified
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModified(): Optional<OffsetDateTime> = lastModified.getOptional("last_modified")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

    /**
     * Returns the raw JSON value of [lastModified].
     *
     * Unlike [lastModified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_modified")
    @ExcludeMissing
    fun _lastModified(): JsonField<OffsetDateTime> = lastModified

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
         * Returns a mutable builder for constructing an instance of [AttachmentListResponse].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .size()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttachmentListResponse]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var size: JsonField<Long>? = null
        private var lastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(attachmentListResponse: AttachmentListResponse) = apply {
            name = attachmentListResponse.name
            size = attachmentListResponse.size
            lastModified = attachmentListResponse.lastModified
            additionalProperties = attachmentListResponse.additionalProperties.toMutableMap()
        }

        /** Name of the attachment */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Size of the attachment in bytes */
        fun size(size: Long) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Long>) = apply { this.size = size }

        /** When the attachment was last modified */
        fun lastModified(lastModified: OffsetDateTime?) =
            lastModified(JsonField.ofNullable(lastModified))

        /** Alias for calling [Builder.lastModified] with `lastModified.orElse(null)`. */
        fun lastModified(lastModified: Optional<OffsetDateTime>) =
            lastModified(lastModified.getOrNull())

        /**
         * Sets [Builder.lastModified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastModified] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastModified(lastModified: JsonField<OffsetDateTime>) = apply {
            this.lastModified = lastModified
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
         * Returns an immutable instance of [AttachmentListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .size()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttachmentListResponse =
            AttachmentListResponse(
                checkRequired("name", name),
                checkRequired("size", size),
                lastModified,
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
    fun validate(): AttachmentListResponse = apply {
        if (validated) {
            return@apply
        }

        name()
        size()
        lastModified()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (size.asKnown().isPresent) 1 else 0) +
            (if (lastModified.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttachmentListResponse &&
            name == other.name &&
            size == other.size &&
            lastModified == other.lastModified &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, size, lastModified, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttachmentListResponse{name=$name, size=$size, lastModified=$lastModified, additionalProperties=$additionalProperties}"
}
