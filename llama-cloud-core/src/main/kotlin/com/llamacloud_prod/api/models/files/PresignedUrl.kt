// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.files

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema for a presigned URL. */
class PresignedUrl
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expiresAt: JsonField<OffsetDateTime>,
    private val url: JsonField<String>,
    private val formFields: JsonField<FormFields>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("form_fields")
        @ExcludeMissing
        formFields: JsonField<FormFields> = JsonMissing.of(),
    ) : this(expiresAt, url, formFields, mutableMapOf())

    /**
     * The time at which the presigned URL expires
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * A presigned URL for IO operations against a private file
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Form fields for a presigned POST request
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun formFields(): Optional<FormFields> = formFields.getOptional("form_fields")

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [formFields].
     *
     * Unlike [formFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("form_fields")
    @ExcludeMissing
    fun _formFields(): JsonField<FormFields> = formFields

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
         * Returns a mutable builder for constructing an instance of [PresignedUrl].
         *
         * The following fields are required:
         * ```java
         * .expiresAt()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PresignedUrl]. */
    class Builder internal constructor() {

        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var url: JsonField<String>? = null
        private var formFields: JsonField<FormFields> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(presignedUrl: PresignedUrl) = apply {
            expiresAt = presignedUrl.expiresAt
            url = presignedUrl.url
            formFields = presignedUrl.formFields
            additionalProperties = presignedUrl.additionalProperties.toMutableMap()
        }

        /** The time at which the presigned URL expires */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** A presigned URL for IO operations against a private file */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Form fields for a presigned POST request */
        fun formFields(formFields: FormFields?) = formFields(JsonField.ofNullable(formFields))

        /** Alias for calling [Builder.formFields] with `formFields.orElse(null)`. */
        fun formFields(formFields: Optional<FormFields>) = formFields(formFields.getOrNull())

        /**
         * Sets [Builder.formFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formFields] with a well-typed [FormFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun formFields(formFields: JsonField<FormFields>) = apply { this.formFields = formFields }

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
         * Returns an immutable instance of [PresignedUrl].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .expiresAt()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PresignedUrl =
            PresignedUrl(
                checkRequired("expiresAt", expiresAt),
                checkRequired("url", url),
                formFields,
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
    fun validate(): PresignedUrl = apply {
        if (validated) {
            return@apply
        }

        expiresAt()
        url()
        formFields().ifPresent { it.validate() }
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
        (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (formFields.asKnown().getOrNull()?.validity() ?: 0)

    /** Form fields for a presigned POST request */
    class FormFields
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

            /** Returns a mutable builder for constructing an instance of [FormFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FormFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(formFields: FormFields) = apply {
                additionalProperties = formFields.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [FormFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FormFields = FormFields(additionalProperties.toImmutable())
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
        fun validate(): FormFields = apply {
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

            return other is FormFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FormFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PresignedUrl &&
            expiresAt == other.expiresAt &&
            url == other.url &&
            formFields == other.formFields &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(expiresAt, url, formFields, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PresignedUrl{expiresAt=$expiresAt, url=$url, formFields=$formFields, additionalProperties=$additionalProperties}"
}
