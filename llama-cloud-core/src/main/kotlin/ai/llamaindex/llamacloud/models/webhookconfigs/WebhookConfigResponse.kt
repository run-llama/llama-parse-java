// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.webhookconfigs

import ai.llamaindex.llamacloud.core.Enum
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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A stored webhook configuration. The signing secret is never included. */
class WebhookConfigResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val hasSecret: JsonField<Boolean>,
    private val tenantId: JsonField<String>,
    private val tenantType: JsonValue,
    private val webhookUrl: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val webhookEvents: JsonField<List<WebhookEvent>>,
    private val webhookHeaders: JsonField<WebhookHeaders>,
    private val webhookOutputFormat: JsonField<WebhookOutputFormat>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_secret")
        @ExcludeMissing
        hasSecret: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_type") @ExcludeMissing tenantType: JsonValue = JsonMissing.of(),
        @JsonProperty("webhook_url")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("webhook_events")
        @ExcludeMissing
        webhookEvents: JsonField<List<WebhookEvent>> = JsonMissing.of(),
        @JsonProperty("webhook_headers")
        @ExcludeMissing
        webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of(),
        @JsonProperty("webhook_output_format")
        @ExcludeMissing
        webhookOutputFormat: JsonField<WebhookOutputFormat> = JsonMissing.of(),
    ) : this(
        id,
        hasSecret,
        tenantId,
        tenantType,
        webhookUrl,
        createdAt,
        updatedAt,
        webhookEvents,
        webhookHeaders,
        webhookOutputFormat,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the webhook configuration.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Whether a signing secret is configured for this endpoint.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasSecret(): Boolean = hasSecret.getRequired("has_secret")

    /**
     * Owner tenant ID.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * Owner tenant type.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("project")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("tenant_type") @ExcludeMissing fun _tenantType(): JsonValue = tenantType

    /**
     * URL that receives webhook POST notifications.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun webhookUrl(): String = webhookUrl.getRequired("webhook_url")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Update datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Subscribed events (null = all events).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEvents(): Optional<List<WebhookEvent>> = webhookEvents.getOptional("webhook_events")

    /**
     * Custom HTTP headers sent with each request.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookHeaders(): Optional<WebhookHeaders> = webhookHeaders.getOptional("webhook_headers")

    /**
     * Response format sent to the webhook.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookOutputFormat(): Optional<WebhookOutputFormat> =
        webhookOutputFormat.getOptional("webhook_output_format")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [hasSecret].
     *
     * Unlike [hasSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_secret") @ExcludeMissing fun _hasSecret(): JsonField<Boolean> = hasSecret

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_url") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [webhookEvents].
     *
     * Unlike [webhookEvents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_events")
    @ExcludeMissing
    fun _webhookEvents(): JsonField<List<WebhookEvent>> = webhookEvents

    /**
     * Returns the raw JSON value of [webhookHeaders].
     *
     * Unlike [webhookHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_headers")
    @ExcludeMissing
    fun _webhookHeaders(): JsonField<WebhookHeaders> = webhookHeaders

    /**
     * Returns the raw JSON value of [webhookOutputFormat].
     *
     * Unlike [webhookOutputFormat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_output_format")
    @ExcludeMissing
    fun _webhookOutputFormat(): JsonField<WebhookOutputFormat> = webhookOutputFormat

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
         * Returns a mutable builder for constructing an instance of [WebhookConfigResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .hasSecret()
         * .tenantId()
         * .webhookUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookConfigResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var hasSecret: JsonField<Boolean>? = null
        private var tenantId: JsonField<String>? = null
        private var tenantType: JsonValue = JsonValue.from("project")
        private var webhookUrl: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var webhookEvents: JsonField<MutableList<WebhookEvent>>? = null
        private var webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of()
        private var webhookOutputFormat: JsonField<WebhookOutputFormat> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookConfigResponse: WebhookConfigResponse) = apply {
            id = webhookConfigResponse.id
            hasSecret = webhookConfigResponse.hasSecret
            tenantId = webhookConfigResponse.tenantId
            tenantType = webhookConfigResponse.tenantType
            webhookUrl = webhookConfigResponse.webhookUrl
            createdAt = webhookConfigResponse.createdAt
            updatedAt = webhookConfigResponse.updatedAt
            webhookEvents = webhookConfigResponse.webhookEvents.map { it.toMutableList() }
            webhookHeaders = webhookConfigResponse.webhookHeaders
            webhookOutputFormat = webhookConfigResponse.webhookOutputFormat
            additionalProperties = webhookConfigResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the webhook configuration. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Whether a signing secret is configured for this endpoint. */
        fun hasSecret(hasSecret: Boolean) = hasSecret(JsonField.of(hasSecret))

        /**
         * Sets [Builder.hasSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasSecret] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasSecret(hasSecret: JsonField<Boolean>) = apply { this.hasSecret = hasSecret }

        /** Owner tenant ID. */
        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("project")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tenantType(tenantType: JsonValue) = apply { this.tenantType = tenantType }

        /** URL that receives webhook POST notifications. */
        fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

        /** Creation datetime */
        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Update datetime */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Subscribed events (null = all events). */
        fun webhookEvents(webhookEvents: List<WebhookEvent>?) =
            webhookEvents(JsonField.ofNullable(webhookEvents))

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

        /** Custom HTTP headers sent with each request. */
        fun webhookHeaders(webhookHeaders: WebhookHeaders?) =
            webhookHeaders(JsonField.ofNullable(webhookHeaders))

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
            this.webhookHeaders = webhookHeaders
        }

        /** Response format sent to the webhook. */
        fun webhookOutputFormat(webhookOutputFormat: WebhookOutputFormat?) =
            webhookOutputFormat(JsonField.ofNullable(webhookOutputFormat))

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
            this.webhookOutputFormat = webhookOutputFormat
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
         * Returns an immutable instance of [WebhookConfigResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .hasSecret()
         * .tenantId()
         * .webhookUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookConfigResponse =
            WebhookConfigResponse(
                checkRequired("id", id),
                checkRequired("hasSecret", hasSecret),
                checkRequired("tenantId", tenantId),
                tenantType,
                checkRequired("webhookUrl", webhookUrl),
                createdAt,
                updatedAt,
                (webhookEvents ?: JsonMissing.of()).map { it.toImmutable() },
                webhookHeaders,
                webhookOutputFormat,
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
    fun validate(): WebhookConfigResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        hasSecret()
        tenantId()
        _tenantType().let {
            if (it != JsonValue.from("project")) {
                throw LlamaCloudInvalidDataException("'tenantType' is invalid, received $it")
            }
        }
        webhookUrl()
        createdAt()
        updatedAt()
        webhookEvents().ifPresent { it.forEach { it.validate() } }
        webhookHeaders().ifPresent { it.validate() }
        webhookOutputFormat().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (hasSecret.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            tenantType.let { if (it == JsonValue.from("project")) 1 else 0 } +
            (if (webhookUrl.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (webhookEvents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (webhookHeaders.asKnown().getOrNull()?.validity() ?: 0) +
            (webhookOutputFormat.asKnown().getOrNull()?.validity() ?: 0)

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

    /** Custom HTTP headers sent with each request. */
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

    /** Response format sent to the webhook. */
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

        return other is WebhookConfigResponse &&
            id == other.id &&
            hasSecret == other.hasSecret &&
            tenantId == other.tenantId &&
            tenantType == other.tenantType &&
            webhookUrl == other.webhookUrl &&
            createdAt == other.createdAt &&
            updatedAt == other.updatedAt &&
            webhookEvents == other.webhookEvents &&
            webhookHeaders == other.webhookHeaders &&
            webhookOutputFormat == other.webhookOutputFormat &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            hasSecret,
            tenantId,
            tenantType,
            webhookUrl,
            createdAt,
            updatedAt,
            webhookEvents,
            webhookHeaders,
            webhookOutputFormat,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookConfigResponse{id=$id, hasSecret=$hasSecret, tenantId=$tenantId, tenantType=$tenantType, webhookUrl=$webhookUrl, createdAt=$createdAt, updatedAt=$updatedAt, webhookEvents=$webhookEvents, webhookHeaders=$webhookHeaders, webhookOutputFormat=$webhookOutputFormat, additionalProperties=$additionalProperties}"
}
