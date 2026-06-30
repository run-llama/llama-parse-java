// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classify

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Request to create a classify job. */
class ClassifyCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val configuration: JsonField<ClassifyConfiguration>,
    private val configurationId: JsonField<String>,
    private val fileId: JsonField<String>,
    private val fileInput: JsonField<String>,
    private val parseJobId: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val webhookConfigurations: JsonField<List<WebhookConfiguration>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("configuration")
        @ExcludeMissing
        configuration: JsonField<ClassifyConfiguration> = JsonMissing.of(),
        @JsonProperty("configuration_id")
        @ExcludeMissing
        configurationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_input") @ExcludeMissing fileInput: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parse_job_id")
        @ExcludeMissing
        parseJobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_configurations")
        @ExcludeMissing
        webhookConfigurations: JsonField<List<WebhookConfiguration>> = JsonMissing.of(),
    ) : this(
        configuration,
        configurationId,
        fileId,
        fileInput,
        parseJobId,
        transactionId,
        webhookConfigurations,
        mutableMapOf(),
    )

    /**
     * Configuration for a classify job.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configuration(): Optional<ClassifyConfiguration> =
        configuration.getOptional("configuration")

    /**
     * Saved configuration ID
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configurationId(): Optional<String> = configurationId.getOptional("configuration_id")

    /**
     * Deprecated: use file_input instead
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun fileId(): Optional<String> = fileId.getOptional("file_id")

    /**
     * File ID or parse job ID to classify
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileInput(): Optional<String> = fileInput.getOptional("file_input")

    /**
     * Deprecated: use file_input instead
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun parseJobId(): Optional<String> = parseJobId.getOptional("parse_job_id")

    /**
     * Idempotency key scoped to the project. Reusing a key returns the original job; the new
     * request body is ignored.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

    /**
     * Outbound webhook endpoints to notify on job status changes
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookConfigurations(): Optional<List<WebhookConfiguration>> =
        webhookConfigurations.getOptional("webhook_configurations")

    /**
     * Returns the raw JSON value of [configuration].
     *
     * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration")
    @ExcludeMissing
    fun _configuration(): JsonField<ClassifyConfiguration> = configuration

    /**
     * Returns the raw JSON value of [configurationId].
     *
     * Unlike [configurationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration_id")
    @ExcludeMissing
    fun _configurationId(): JsonField<String> = configurationId

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("file_id")
    @ExcludeMissing
    fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [fileInput].
     *
     * Unlike [fileInput], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_input") @ExcludeMissing fun _fileInput(): JsonField<String> = fileInput

    /**
     * Returns the raw JSON value of [parseJobId].
     *
     * Unlike [parseJobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("parse_job_id")
    @ExcludeMissing
    fun _parseJobId(): JsonField<String> = parseJobId

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [webhookConfigurations].
     *
     * Unlike [webhookConfigurations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_configurations")
    @ExcludeMissing
    fun _webhookConfigurations(): JsonField<List<WebhookConfiguration>> = webhookConfigurations

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

        /** Returns a mutable builder for constructing an instance of [ClassifyCreateRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClassifyCreateRequest]. */
    class Builder internal constructor() {

        private var configuration: JsonField<ClassifyConfiguration> = JsonMissing.of()
        private var configurationId: JsonField<String> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var fileInput: JsonField<String> = JsonMissing.of()
        private var parseJobId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var webhookConfigurations: JsonField<MutableList<WebhookConfiguration>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(classifyCreateRequest: ClassifyCreateRequest) = apply {
            configuration = classifyCreateRequest.configuration
            configurationId = classifyCreateRequest.configurationId
            fileId = classifyCreateRequest.fileId
            fileInput = classifyCreateRequest.fileInput
            parseJobId = classifyCreateRequest.parseJobId
            transactionId = classifyCreateRequest.transactionId
            webhookConfigurations =
                classifyCreateRequest.webhookConfigurations.map { it.toMutableList() }
            additionalProperties = classifyCreateRequest.additionalProperties.toMutableMap()
        }

        /** Configuration for a classify job. */
        fun configuration(configuration: ClassifyConfiguration?) =
            configuration(JsonField.ofNullable(configuration))

        /** Alias for calling [Builder.configuration] with `configuration.orElse(null)`. */
        fun configuration(configuration: Optional<ClassifyConfiguration>) =
            configuration(configuration.getOrNull())

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed [ClassifyConfiguration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun configuration(configuration: JsonField<ClassifyConfiguration>) = apply {
            this.configuration = configuration
        }

        /** Saved configuration ID */
        fun configurationId(configurationId: String?) =
            configurationId(JsonField.ofNullable(configurationId))

        /** Alias for calling [Builder.configurationId] with `configurationId.orElse(null)`. */
        fun configurationId(configurationId: Optional<String>) =
            configurationId(configurationId.getOrNull())

        /**
         * Sets [Builder.configurationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configurationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configurationId(configurationId: JsonField<String>) = apply {
            this.configurationId = configurationId
        }

        /** Deprecated: use file_input instead */
        @Deprecated("deprecated") fun fileId(fileId: String?) = fileId(JsonField.ofNullable(fileId))

        /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
        @Deprecated("deprecated") fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /** File ID or parse job ID to classify */
        fun fileInput(fileInput: String?) = fileInput(JsonField.ofNullable(fileInput))

        /** Alias for calling [Builder.fileInput] with `fileInput.orElse(null)`. */
        fun fileInput(fileInput: Optional<String>) = fileInput(fileInput.getOrNull())

        /**
         * Sets [Builder.fileInput] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileInput] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fileInput(fileInput: JsonField<String>) = apply { this.fileInput = fileInput }

        /** Deprecated: use file_input instead */
        @Deprecated("deprecated")
        fun parseJobId(parseJobId: String?) = parseJobId(JsonField.ofNullable(parseJobId))

        /** Alias for calling [Builder.parseJobId] with `parseJobId.orElse(null)`. */
        @Deprecated("deprecated")
        fun parseJobId(parseJobId: Optional<String>) = parseJobId(parseJobId.getOrNull())

        /**
         * Sets [Builder.parseJobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parseJobId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun parseJobId(parseJobId: JsonField<String>) = apply { this.parseJobId = parseJobId }

        /**
         * Idempotency key scoped to the project. Reusing a key returns the original job; the new
         * request body is ignored.
         */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** Alias for calling [Builder.transactionId] with `transactionId.orElse(null)`. */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.getOrNull())

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** Outbound webhook endpoints to notify on job status changes */
        fun webhookConfigurations(webhookConfigurations: List<WebhookConfiguration>?) =
            webhookConfigurations(JsonField.ofNullable(webhookConfigurations))

        /**
         * Alias for calling [Builder.webhookConfigurations] with
         * `webhookConfigurations.orElse(null)`.
         */
        fun webhookConfigurations(webhookConfigurations: Optional<List<WebhookConfiguration>>) =
            webhookConfigurations(webhookConfigurations.getOrNull())

        /**
         * Sets [Builder.webhookConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookConfigurations] with a well-typed
         * `List<WebhookConfiguration>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun webhookConfigurations(webhookConfigurations: JsonField<List<WebhookConfiguration>>) =
            apply {
                this.webhookConfigurations = webhookConfigurations.map { it.toMutableList() }
            }

        /**
         * Adds a single [WebhookConfiguration] to [webhookConfigurations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWebhookConfiguration(webhookConfiguration: WebhookConfiguration) = apply {
            webhookConfigurations =
                (webhookConfigurations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("webhookConfigurations", it).add(webhookConfiguration)
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
         * Returns an immutable instance of [ClassifyCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ClassifyCreateRequest =
            ClassifyCreateRequest(
                configuration,
                configurationId,
                fileId,
                fileInput,
                parseJobId,
                transactionId,
                (webhookConfigurations ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ClassifyCreateRequest = apply {
        if (validated) {
            return@apply
        }

        configuration().ifPresent { it.validate() }
        configurationId()
        fileId()
        fileInput()
        parseJobId()
        transactionId()
        webhookConfigurations().ifPresent { it.forEach { it.validate() } }
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
        (configuration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (configurationId.asKnown().isPresent) 1 else 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (if (fileInput.asKnown().isPresent) 1 else 0) +
            (if (parseJobId.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (webhookConfigurations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Configuration for a single outbound webhook endpoint. */
    class WebhookConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val webhookEvents: JsonField<List<WebhookEvent>>,
        private val webhookHeaders: JsonField<WebhookHeaders>,
        private val webhookOutputFormat: JsonField<String>,
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
            webhookOutputFormat: JsonField<String> = JsonMissing.of(),
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
         * Events to subscribe to (e.g. 'parse.success', 'extract.error'). If null, all events are
         * delivered.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookEvents(): Optional<List<WebhookEvent>> =
            webhookEvents.getOptional("webhook_events")

        /**
         * Custom HTTP headers sent with each webhook request (e.g. auth tokens)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookHeaders(): Optional<WebhookHeaders> =
            webhookHeaders.getOptional("webhook_headers")

        /**
         * Response format sent to the webhook: 'string' (default) or 'json'
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookOutputFormat(): Optional<String> =
            webhookOutputFormat.getOptional("webhook_output_format")

        /**
         * Shared signing secret used to sign webhook deliveries. When set, each request includes an
         * HMAC-SHA256 signature of the request body in the 'LC-Signature' header (value
         * 'sha256=<hex>'). Recompute the HMAC over the raw request body with this secret to verify
         * the delivery is authentic.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookSigningSecret(): Optional<String> =
            webhookSigningSecret.getOptional("webhook_signing_secret")

        /**
         * URL to receive webhook POST notifications
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
        fun _webhookOutputFormat(): JsonField<String> = webhookOutputFormat

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

            /** Returns a mutable builder for constructing an instance of [WebhookConfiguration]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookConfiguration]. */
        class Builder internal constructor() {

            private var webhookEvents: JsonField<MutableList<WebhookEvent>>? = null
            private var webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of()
            private var webhookOutputFormat: JsonField<String> = JsonMissing.of()
            private var webhookSigningSecret: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookConfiguration: WebhookConfiguration) = apply {
                webhookEvents = webhookConfiguration.webhookEvents.map { it.toMutableList() }
                webhookHeaders = webhookConfiguration.webhookHeaders
                webhookOutputFormat = webhookConfiguration.webhookOutputFormat
                webhookSigningSecret = webhookConfiguration.webhookSigningSecret
                webhookUrl = webhookConfiguration.webhookUrl
                additionalProperties = webhookConfiguration.additionalProperties.toMutableMap()
            }

            /**
             * Events to subscribe to (e.g. 'parse.success', 'extract.error'). If null, all events
             * are delivered.
             */
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

            /** Custom HTTP headers sent with each webhook request (e.g. auth tokens) */
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

            /** Response format sent to the webhook: 'string' (default) or 'json' */
            fun webhookOutputFormat(webhookOutputFormat: String?) =
                webhookOutputFormat(JsonField.ofNullable(webhookOutputFormat))

            /**
             * Alias for calling [Builder.webhookOutputFormat] with
             * `webhookOutputFormat.orElse(null)`.
             */
            fun webhookOutputFormat(webhookOutputFormat: Optional<String>) =
                webhookOutputFormat(webhookOutputFormat.getOrNull())

            /**
             * Sets [Builder.webhookOutputFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookOutputFormat] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun webhookOutputFormat(webhookOutputFormat: JsonField<String>) = apply {
                this.webhookOutputFormat = webhookOutputFormat
            }

            /**
             * Shared signing secret used to sign webhook deliveries. When set, each request
             * includes an HMAC-SHA256 signature of the request body in the 'LC-Signature' header
             * (value 'sha256=<hex>'). Recompute the HMAC over the raw request body with this secret
             * to verify the delivery is authentic.
             */
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

            /** URL to receive webhook POST notifications */
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
             * Returns an immutable instance of [WebhookConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookConfiguration =
                WebhookConfiguration(
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
        fun validate(): WebhookConfiguration = apply {
            if (validated) {
                return@apply
            }

            webhookEvents().ifPresent { it.forEach { it.validate() } }
            webhookHeaders().ifPresent { it.validate() }
            webhookOutputFormat()
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
                (if (webhookOutputFormat.asKnown().isPresent) 1 else 0) +
                (if (webhookSigningSecret.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        class WebhookEvent @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
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
                 * An enum member indicating that [WebhookEvent] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        /** Custom HTTP headers sent with each webhook request (e.g. auth tokens) */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WebhookConfiguration &&
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
            "WebhookConfiguration{webhookEvents=$webhookEvents, webhookHeaders=$webhookHeaders, webhookOutputFormat=$webhookOutputFormat, webhookSigningSecret=$webhookSigningSecret, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClassifyCreateRequest &&
            configuration == other.configuration &&
            configurationId == other.configurationId &&
            fileId == other.fileId &&
            fileInput == other.fileInput &&
            parseJobId == other.parseJobId &&
            transactionId == other.transactionId &&
            webhookConfigurations == other.webhookConfigurations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            configuration,
            configurationId,
            fileId,
            fileInput,
            parseJobId,
            transactionId,
            webhookConfigurations,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClassifyCreateRequest{configuration=$configuration, configurationId=$configurationId, fileId=$fileId, fileInput=$fileInput, parseJobId=$parseJobId, transactionId=$transactionId, webhookConfigurations=$webhookConfigurations, additionalProperties=$additionalProperties}"
}
