// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.webhookconfigs

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
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

/** Update a webhook configuration. Only fields present in the request change. */
class WebhookConfigUpdateParams
private constructor(
    private val configId: String?,
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun configId(): Optional<String> = Optional.ofNullable(configId)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * Updated event subscriptions.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEvents(): Optional<List<WebhookEvent>> = body.webhookEvents()

    /**
     * Updated headers.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookHeaders(): Optional<WebhookHeaders> = body.webhookHeaders()

    /**
     * Updated output format.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookOutputFormat(): Optional<WebhookOutputFormat> = body.webhookOutputFormat()

    /**
     * Updated signing secret (write-only). Send to rotate the secret.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookSigningSecret(): Optional<String> = body.webhookSigningSecret()

    /**
     * Updated webhook URL.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [webhookEvents].
     *
     * Unlike [webhookEvents], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookEvents(): JsonField<List<WebhookEvent>> = body._webhookEvents()

    /**
     * Returns the raw JSON value of [webhookHeaders].
     *
     * Unlike [webhookHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookHeaders(): JsonField<WebhookHeaders> = body._webhookHeaders()

    /**
     * Returns the raw JSON value of [webhookOutputFormat].
     *
     * Unlike [webhookOutputFormat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookOutputFormat(): JsonField<WebhookOutputFormat> = body._webhookOutputFormat()

    /**
     * Returns the raw JSON value of [webhookSigningSecret].
     *
     * Unlike [webhookSigningSecret], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookSigningSecret(): JsonField<String> = body._webhookSigningSecret()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WebhookConfigUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [WebhookConfigUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookConfigUpdateParams]. */
    class Builder internal constructor() {

        private var configId: String? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(webhookConfigUpdateParams: WebhookConfigUpdateParams) = apply {
            configId = webhookConfigUpdateParams.configId
            organizationId = webhookConfigUpdateParams.organizationId
            projectId = webhookConfigUpdateParams.projectId
            body = webhookConfigUpdateParams.body.toBuilder()
            additionalHeaders = webhookConfigUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = webhookConfigUpdateParams.additionalQueryParams.toBuilder()
        }

        fun configId(configId: String?) = apply { this.configId = configId }

        /** Alias for calling [Builder.configId] with `configId.orElse(null)`. */
        fun configId(configId: Optional<String>) = configId(configId.getOrNull())

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [webhookEvents]
         * - [webhookHeaders]
         * - [webhookOutputFormat]
         * - [webhookSigningSecret]
         * - [webhookUrl]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Updated event subscriptions. */
        fun webhookEvents(webhookEvents: List<WebhookEvent>?) = apply {
            body.webhookEvents(webhookEvents)
        }

        /** Alias for calling [Builder.webhookEvents] with `webhookEvents.orElse(null)`. */
        fun webhookEvents(webhookEvents: Optional<List<WebhookEvent>>) =
            webhookEvents(webhookEvents.getOrNull())

        /**
         * Sets [Builder.webhookEvents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEvents] with a well-typed `List<WebhookEvent>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookEvents(webhookEvents: JsonField<List<WebhookEvent>>) = apply {
            body.webhookEvents(webhookEvents)
        }

        /**
         * Adds a single [WebhookEvent] to [webhookEvents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWebhookEvent(webhookEvent: WebhookEvent) = apply {
            body.addWebhookEvent(webhookEvent)
        }

        /** Updated headers. */
        fun webhookHeaders(webhookHeaders: WebhookHeaders?) = apply {
            body.webhookHeaders(webhookHeaders)
        }

        /** Alias for calling [Builder.webhookHeaders] with `webhookHeaders.orElse(null)`. */
        fun webhookHeaders(webhookHeaders: Optional<WebhookHeaders>) =
            webhookHeaders(webhookHeaders.getOrNull())

        /**
         * Sets [Builder.webhookHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookHeaders] with a well-typed [WebhookHeaders] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookHeaders(webhookHeaders: JsonField<WebhookHeaders>) = apply {
            body.webhookHeaders(webhookHeaders)
        }

        /** Updated output format. */
        fun webhookOutputFormat(webhookOutputFormat: WebhookOutputFormat?) = apply {
            body.webhookOutputFormat(webhookOutputFormat)
        }

        /**
         * Alias for calling [Builder.webhookOutputFormat] with `webhookOutputFormat.orElse(null)`.
         */
        fun webhookOutputFormat(webhookOutputFormat: Optional<WebhookOutputFormat>) =
            webhookOutputFormat(webhookOutputFormat.getOrNull())

        /**
         * Sets [Builder.webhookOutputFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookOutputFormat] with a well-typed
         * [WebhookOutputFormat] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun webhookOutputFormat(webhookOutputFormat: JsonField<WebhookOutputFormat>) = apply {
            body.webhookOutputFormat(webhookOutputFormat)
        }

        /** Updated signing secret (write-only). Send to rotate the secret. */
        fun webhookSigningSecret(webhookSigningSecret: String?) = apply {
            body.webhookSigningSecret(webhookSigningSecret)
        }

        /**
         * Alias for calling [Builder.webhookSigningSecret] with
         * `webhookSigningSecret.orElse(null)`.
         */
        fun webhookSigningSecret(webhookSigningSecret: Optional<String>) =
            webhookSigningSecret(webhookSigningSecret.getOrNull())

        /**
         * Sets [Builder.webhookSigningSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookSigningSecret] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookSigningSecret(webhookSigningSecret: JsonField<String>) = apply {
            body.webhookSigningSecret(webhookSigningSecret)
        }

        /** Updated webhook URL. */
        fun webhookUrl(webhookUrl: String?) = apply { body.webhookUrl(webhookUrl) }

        /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
        fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [WebhookConfigUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WebhookConfigUpdateParams =
            WebhookConfigUpdateParams(
                configId,
                organizationId,
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> configId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Request to update a stored webhook configuration. Only set fields change. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val webhookEvents: JsonField<List<WebhookEvent>>,
        private val webhookHeaders: JsonField<WebhookHeaders>,
        private val webhookOutputFormat: JsonField<WebhookOutputFormat>,
        private val webhookSigningSecret: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("webhook_events")
            @ExcludeMissing
            webhookEvents: JsonField<List<WebhookEvent>> = JsonMissing.of(),
            @JsonProperty("webhook_headers")
            @ExcludeMissing
            webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of(),
            @JsonProperty("webhook_output_format")
            @ExcludeMissing
            webhookOutputFormat: JsonField<WebhookOutputFormat> = JsonMissing.of(),
            @JsonProperty("webhook_signing_secret")
            @ExcludeMissing
            webhookSigningSecret: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            webhookEvents,
            webhookHeaders,
            webhookOutputFormat,
            webhookSigningSecret,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * Updated event subscriptions.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookEvents(): Optional<List<WebhookEvent>> =
            webhookEvents.getOptional("webhook_events")

        /**
         * Updated headers.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookHeaders(): Optional<WebhookHeaders> =
            webhookHeaders.getOptional("webhook_headers")

        /**
         * Updated output format.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookOutputFormat(): Optional<WebhookOutputFormat> =
            webhookOutputFormat.getOptional("webhook_output_format")

        /**
         * Updated signing secret (write-only). Send to rotate the secret.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookSigningSecret(): Optional<String> =
            webhookSigningSecret.getOptional("webhook_signing_secret")

        /**
         * Updated webhook URL.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [webhookEvents].
         *
         * Unlike [webhookEvents], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_events")
        @ExcludeMissing
        fun _webhookEvents(): JsonField<List<WebhookEvent>> = webhookEvents

        /**
         * Returns the raw JSON value of [webhookHeaders].
         *
         * Unlike [webhookHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_headers")
        @ExcludeMissing
        fun _webhookHeaders(): JsonField<WebhookHeaders> = webhookHeaders

        /**
         * Returns the raw JSON value of [webhookOutputFormat].
         *
         * Unlike [webhookOutputFormat], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_output_format")
        @ExcludeMissing
        fun _webhookOutputFormat(): JsonField<WebhookOutputFormat> = webhookOutputFormat

        /**
         * Returns the raw JSON value of [webhookSigningSecret].
         *
         * Unlike [webhookSigningSecret], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_signing_secret")
        @ExcludeMissing
        fun _webhookSigningSecret(): JsonField<String> = webhookSigningSecret

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var webhookEvents: JsonField<MutableList<WebhookEvent>>? = null
            private var webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of()
            private var webhookOutputFormat: JsonField<WebhookOutputFormat> = JsonMissing.of()
            private var webhookSigningSecret: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                webhookEvents = body.webhookEvents.map { it.toMutableList() }
                webhookHeaders = body.webhookHeaders
                webhookOutputFormat = body.webhookOutputFormat
                webhookSigningSecret = body.webhookSigningSecret
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Updated event subscriptions. */
            fun webhookEvents(webhookEvents: List<WebhookEvent>?) =
                webhookEvents(JsonField.ofNullable(webhookEvents))

            /** Alias for calling [Builder.webhookEvents] with `webhookEvents.orElse(null)`. */
            fun webhookEvents(webhookEvents: Optional<List<WebhookEvent>>) =
                webhookEvents(webhookEvents.getOrNull())

            /**
             * Sets [Builder.webhookEvents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookEvents] with a well-typed
             * `List<WebhookEvent>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun webhookEvents(webhookEvents: JsonField<List<WebhookEvent>>) = apply {
                this.webhookEvents = webhookEvents.map { it.toMutableList() }
            }

            /**
             * Adds a single [WebhookEvent] to [webhookEvents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWebhookEvent(webhookEvent: WebhookEvent) = apply {
                webhookEvents =
                    (webhookEvents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("webhookEvents", it).add(webhookEvent)
                    }
            }

            /** Updated headers. */
            fun webhookHeaders(webhookHeaders: WebhookHeaders?) =
                webhookHeaders(JsonField.ofNullable(webhookHeaders))

            /** Alias for calling [Builder.webhookHeaders] with `webhookHeaders.orElse(null)`. */
            fun webhookHeaders(webhookHeaders: Optional<WebhookHeaders>) =
                webhookHeaders(webhookHeaders.getOrNull())

            /**
             * Sets [Builder.webhookHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookHeaders] with a well-typed [WebhookHeaders]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun webhookHeaders(webhookHeaders: JsonField<WebhookHeaders>) = apply {
                this.webhookHeaders = webhookHeaders
            }

            /** Updated output format. */
            fun webhookOutputFormat(webhookOutputFormat: WebhookOutputFormat?) =
                webhookOutputFormat(JsonField.ofNullable(webhookOutputFormat))

            /**
             * Alias for calling [Builder.webhookOutputFormat] with
             * `webhookOutputFormat.orElse(null)`.
             */
            fun webhookOutputFormat(webhookOutputFormat: Optional<WebhookOutputFormat>) =
                webhookOutputFormat(webhookOutputFormat.getOrNull())

            /**
             * Sets [Builder.webhookOutputFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookOutputFormat] with a well-typed
             * [WebhookOutputFormat] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun webhookOutputFormat(webhookOutputFormat: JsonField<WebhookOutputFormat>) = apply {
                this.webhookOutputFormat = webhookOutputFormat
            }

            /** Updated signing secret (write-only). Send to rotate the secret. */
            fun webhookSigningSecret(webhookSigningSecret: String?) =
                webhookSigningSecret(JsonField.ofNullable(webhookSigningSecret))

            /**
             * Alias for calling [Builder.webhookSigningSecret] with
             * `webhookSigningSecret.orElse(null)`.
             */
            fun webhookSigningSecret(webhookSigningSecret: Optional<String>) =
                webhookSigningSecret(webhookSigningSecret.getOrNull())

            /**
             * Sets [Builder.webhookSigningSecret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookSigningSecret] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun webhookSigningSecret(webhookSigningSecret: JsonField<String>) = apply {
                this.webhookSigningSecret = webhookSigningSecret
            }

            /** Updated webhook URL. */
            fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

            /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
            fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (webhookEvents ?: JsonMissing.of()).map { it.toImmutable() },
                    webhookHeaders,
                    webhookOutputFormat,
                    webhookSigningSecret,
                    webhookUrl,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            webhookEvents().ifPresent { it.forEach { it.validate() } }
            webhookHeaders().ifPresent { it.validate() }
            webhookOutputFormat().ifPresent { it.validate() }
            webhookSigningSecret()
            webhookUrl()
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
            (webhookEvents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (webhookHeaders.asKnown().getOrNull()?.validity() ?: 0) +
                (webhookOutputFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookSigningSecret.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                webhookEvents == other.webhookEvents &&
                webhookHeaders == other.webhookHeaders &&
                webhookOutputFormat == other.webhookOutputFormat &&
                webhookSigningSecret == other.webhookSigningSecret &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                webhookEvents,
                webhookHeaders,
                webhookOutputFormat,
                webhookSigningSecret,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{webhookEvents=$webhookEvents, webhookHeaders=$webhookHeaders, webhookOutputFormat=$webhookOutputFormat, webhookSigningSecret=$webhookSigningSecret, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    class WebhookEvent @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BATCH_CANCELLED = of("batch.cancelled")

            @JvmField val BATCH_ERROR = of("batch.error")

            @JvmField val BATCH_PENDING = of("batch.pending")

            @JvmField val BATCH_RUNNING = of("batch.running")

            @JvmField val BATCH_SUCCESS = of("batch.success")

            @JvmField val CLASSIFY_CANCELLED = of("classify.cancelled")

            @JvmField val CLASSIFY_ERROR = of("classify.error")

            @JvmField val CLASSIFY_PARTIAL_SUCCESS = of("classify.partial_success")

            @JvmField val CLASSIFY_PENDING = of("classify.pending")

            @JvmField val CLASSIFY_RUNNING = of("classify.running")

            @JvmField val CLASSIFY_SUCCESS = of("classify.success")

            @JvmField val EXTRACT_CANCELLED = of("extract.cancelled")

            @JvmField val EXTRACT_ERROR = of("extract.error")

            @JvmField val EXTRACT_PARTIAL_SUCCESS = of("extract.partial_success")

            @JvmField val EXTRACT_PENDING = of("extract.pending")

            @JvmField val EXTRACT_SUCCESS = of("extract.success")

            @JvmField val PARSE_CANCELLED = of("parse.cancelled")

            @JvmField val PARSE_ERROR = of("parse.error")

            @JvmField val PARSE_PARTIAL_SUCCESS = of("parse.partial_success")

            @JvmField val PARSE_PENDING = of("parse.pending")

            @JvmField val PARSE_RUNNING = of("parse.running")

            @JvmField val PARSE_SUCCESS = of("parse.success")

            @JvmField val SHEETS_CANCELLED = of("sheets.cancelled")

            @JvmField val SHEETS_ERROR = of("sheets.error")

            @JvmField val SHEETS_PARTIAL_SUCCESS = of("sheets.partial_success")

            @JvmField val SHEETS_PENDING = of("sheets.pending")

            @JvmField val SHEETS_SUCCESS = of("sheets.success")

            @JvmField val SPLIT_CANCELLED = of("split.cancelled")

            @JvmField val SPLIT_ERROR = of("split.error")

            @JvmField val SPLIT_PENDING = of("split.pending")

            @JvmField val SPLIT_PROCESSING = of("split.processing")

            @JvmField val SPLIT_SUCCESS = of("split.success")

            @JvmField val UNMAPPED_EVENT = of("unmapped_event")

            @JvmStatic fun of(value: String) = WebhookEvent(JsonField.of(value))
        }

        /** An enum containing [WebhookEvent]'s known values. */
        enum class Known {
            BATCH_CANCELLED,
            BATCH_ERROR,
            BATCH_PENDING,
            BATCH_RUNNING,
            BATCH_SUCCESS,
            CLASSIFY_CANCELLED,
            CLASSIFY_ERROR,
            CLASSIFY_PARTIAL_SUCCESS,
            CLASSIFY_PENDING,
            CLASSIFY_RUNNING,
            CLASSIFY_SUCCESS,
            EXTRACT_CANCELLED,
            EXTRACT_ERROR,
            EXTRACT_PARTIAL_SUCCESS,
            EXTRACT_PENDING,
            EXTRACT_SUCCESS,
            PARSE_CANCELLED,
            PARSE_ERROR,
            PARSE_PARTIAL_SUCCESS,
            PARSE_PENDING,
            PARSE_RUNNING,
            PARSE_SUCCESS,
            SHEETS_CANCELLED,
            SHEETS_ERROR,
            SHEETS_PARTIAL_SUCCESS,
            SHEETS_PENDING,
            SHEETS_SUCCESS,
            SPLIT_CANCELLED,
            SPLIT_ERROR,
            SPLIT_PENDING,
            SPLIT_PROCESSING,
            SPLIT_SUCCESS,
            UNMAPPED_EVENT,
        }

        /**
         * An enum containing [WebhookEvent]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WebhookEvent] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BATCH_CANCELLED,
            BATCH_ERROR,
            BATCH_PENDING,
            BATCH_RUNNING,
            BATCH_SUCCESS,
            CLASSIFY_CANCELLED,
            CLASSIFY_ERROR,
            CLASSIFY_PARTIAL_SUCCESS,
            CLASSIFY_PENDING,
            CLASSIFY_RUNNING,
            CLASSIFY_SUCCESS,
            EXTRACT_CANCELLED,
            EXTRACT_ERROR,
            EXTRACT_PARTIAL_SUCCESS,
            EXTRACT_PENDING,
            EXTRACT_SUCCESS,
            PARSE_CANCELLED,
            PARSE_ERROR,
            PARSE_PARTIAL_SUCCESS,
            PARSE_PENDING,
            PARSE_RUNNING,
            PARSE_SUCCESS,
            SHEETS_CANCELLED,
            SHEETS_ERROR,
            SHEETS_PARTIAL_SUCCESS,
            SHEETS_PENDING,
            SHEETS_SUCCESS,
            SPLIT_CANCELLED,
            SPLIT_ERROR,
            SPLIT_PENDING,
            SPLIT_PROCESSING,
            SPLIT_SUCCESS,
            UNMAPPED_EVENT,
            /**
             * An enum member indicating that [WebhookEvent] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BATCH_CANCELLED -> Value.BATCH_CANCELLED
                BATCH_ERROR -> Value.BATCH_ERROR
                BATCH_PENDING -> Value.BATCH_PENDING
                BATCH_RUNNING -> Value.BATCH_RUNNING
                BATCH_SUCCESS -> Value.BATCH_SUCCESS
                CLASSIFY_CANCELLED -> Value.CLASSIFY_CANCELLED
                CLASSIFY_ERROR -> Value.CLASSIFY_ERROR
                CLASSIFY_PARTIAL_SUCCESS -> Value.CLASSIFY_PARTIAL_SUCCESS
                CLASSIFY_PENDING -> Value.CLASSIFY_PENDING
                CLASSIFY_RUNNING -> Value.CLASSIFY_RUNNING
                CLASSIFY_SUCCESS -> Value.CLASSIFY_SUCCESS
                EXTRACT_CANCELLED -> Value.EXTRACT_CANCELLED
                EXTRACT_ERROR -> Value.EXTRACT_ERROR
                EXTRACT_PARTIAL_SUCCESS -> Value.EXTRACT_PARTIAL_SUCCESS
                EXTRACT_PENDING -> Value.EXTRACT_PENDING
                EXTRACT_SUCCESS -> Value.EXTRACT_SUCCESS
                PARSE_CANCELLED -> Value.PARSE_CANCELLED
                PARSE_ERROR -> Value.PARSE_ERROR
                PARSE_PARTIAL_SUCCESS -> Value.PARSE_PARTIAL_SUCCESS
                PARSE_PENDING -> Value.PARSE_PENDING
                PARSE_RUNNING -> Value.PARSE_RUNNING
                PARSE_SUCCESS -> Value.PARSE_SUCCESS
                SHEETS_CANCELLED -> Value.SHEETS_CANCELLED
                SHEETS_ERROR -> Value.SHEETS_ERROR
                SHEETS_PARTIAL_SUCCESS -> Value.SHEETS_PARTIAL_SUCCESS
                SHEETS_PENDING -> Value.SHEETS_PENDING
                SHEETS_SUCCESS -> Value.SHEETS_SUCCESS
                SPLIT_CANCELLED -> Value.SPLIT_CANCELLED
                SPLIT_ERROR -> Value.SPLIT_ERROR
                SPLIT_PENDING -> Value.SPLIT_PENDING
                SPLIT_PROCESSING -> Value.SPLIT_PROCESSING
                SPLIT_SUCCESS -> Value.SPLIT_SUCCESS
                UNMAPPED_EVENT -> Value.UNMAPPED_EVENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BATCH_CANCELLED -> Known.BATCH_CANCELLED
                BATCH_ERROR -> Known.BATCH_ERROR
                BATCH_PENDING -> Known.BATCH_PENDING
                BATCH_RUNNING -> Known.BATCH_RUNNING
                BATCH_SUCCESS -> Known.BATCH_SUCCESS
                CLASSIFY_CANCELLED -> Known.CLASSIFY_CANCELLED
                CLASSIFY_ERROR -> Known.CLASSIFY_ERROR
                CLASSIFY_PARTIAL_SUCCESS -> Known.CLASSIFY_PARTIAL_SUCCESS
                CLASSIFY_PENDING -> Known.CLASSIFY_PENDING
                CLASSIFY_RUNNING -> Known.CLASSIFY_RUNNING
                CLASSIFY_SUCCESS -> Known.CLASSIFY_SUCCESS
                EXTRACT_CANCELLED -> Known.EXTRACT_CANCELLED
                EXTRACT_ERROR -> Known.EXTRACT_ERROR
                EXTRACT_PARTIAL_SUCCESS -> Known.EXTRACT_PARTIAL_SUCCESS
                EXTRACT_PENDING -> Known.EXTRACT_PENDING
                EXTRACT_SUCCESS -> Known.EXTRACT_SUCCESS
                PARSE_CANCELLED -> Known.PARSE_CANCELLED
                PARSE_ERROR -> Known.PARSE_ERROR
                PARSE_PARTIAL_SUCCESS -> Known.PARSE_PARTIAL_SUCCESS
                PARSE_PENDING -> Known.PARSE_PENDING
                PARSE_RUNNING -> Known.PARSE_RUNNING
                PARSE_SUCCESS -> Known.PARSE_SUCCESS
                SHEETS_CANCELLED -> Known.SHEETS_CANCELLED
                SHEETS_ERROR -> Known.SHEETS_ERROR
                SHEETS_PARTIAL_SUCCESS -> Known.SHEETS_PARTIAL_SUCCESS
                SHEETS_PENDING -> Known.SHEETS_PENDING
                SHEETS_SUCCESS -> Known.SHEETS_SUCCESS
                SPLIT_CANCELLED -> Known.SPLIT_CANCELLED
                SPLIT_ERROR -> Known.SPLIT_ERROR
                SPLIT_PENDING -> Known.SPLIT_PENDING
                SPLIT_PROCESSING -> Known.SPLIT_PROCESSING
                SPLIT_SUCCESS -> Known.SPLIT_SUCCESS
                UNMAPPED_EVENT -> Known.UNMAPPED_EVENT
                else -> throw LlamaCloudInvalidDataException("Unknown WebhookEvent: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LlamaCloudInvalidDataException("Value is not a String")
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
        fun validate(): WebhookEvent = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WebhookEvent && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Updated headers. */
    class WebhookHeaders
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

            /** Returns a mutable builder for constructing an instance of [WebhookHeaders]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookHeaders]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookHeaders: WebhookHeaders) = apply {
                additionalProperties = webhookHeaders.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [WebhookHeaders].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookHeaders = WebhookHeaders(additionalProperties.toImmutable())
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
        fun validate(): WebhookHeaders = apply {
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

            return other is WebhookHeaders && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "WebhookHeaders{additionalProperties=$additionalProperties}"
    }

    /** Updated output format. */
    class WebhookOutputFormat
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val JSON = of("json")

            @JvmField val STRING = of("string")

            @JvmStatic fun of(value: String) = WebhookOutputFormat(JsonField.of(value))
        }

        /** An enum containing [WebhookOutputFormat]'s known values. */
        enum class Known {
            JSON,
            STRING,
        }

        /**
         * An enum containing [WebhookOutputFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WebhookOutputFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            JSON,
            STRING,
            /**
             * An enum member indicating that [WebhookOutputFormat] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                JSON -> Value.JSON
                STRING -> Value.STRING
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                JSON -> Known.JSON
                STRING -> Known.STRING
                else -> throw LlamaCloudInvalidDataException("Unknown WebhookOutputFormat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LlamaCloudInvalidDataException("Value is not a String")
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
        fun validate(): WebhookOutputFormat = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WebhookOutputFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookConfigUpdateParams &&
            configId == other.configId &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            configId,
            organizationId,
            projectId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "WebhookConfigUpdateParams{configId=$configId, organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
