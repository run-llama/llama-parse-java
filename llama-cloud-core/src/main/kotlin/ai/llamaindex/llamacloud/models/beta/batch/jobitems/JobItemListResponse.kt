// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.batch.jobitems

import ai.llamaindex.llamacloud.core.Enum
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

/** Detailed information about an item in a batch job. */
class JobItemListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val itemId: JsonField<String>,
    private val itemName: JsonField<String>,
    private val status: JsonField<Status>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val errorMessage: JsonField<String>,
    private val jobId: JsonField<String>,
    private val jobRecordId: JsonField<String>,
    private val skipReason: JsonField<String>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("item_name") @ExcludeMissing itemName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("job_id") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("job_record_id")
        @ExcludeMissing
        jobRecordId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("skip_reason")
        @ExcludeMissing
        skipReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("started_at")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        itemId,
        itemName,
        status,
        completedAt,
        effectiveAt,
        errorMessage,
        jobId,
        jobRecordId,
        skipReason,
        startedAt,
        mutableMapOf(),
    )

    /**
     * ID of the item
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun itemId(): String = itemId.getRequired("item_id")

    /**
     * Name of the item
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun itemName(): String = itemName.getRequired("item_name")

    /**
     * Processing status of this item
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * When processing completed for this item
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveAt(): Optional<OffsetDateTime> = effectiveAt.getOptional("effective_at")

    /**
     * Error message for the latest job attempt, if any.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * Job ID for the underlying processing job (links to parse/extract job results)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobId(): Optional<String> = jobId.getOptional("job_id")

    /**
     * The job record ID associated with this status, if any.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobRecordId(): Optional<String> = jobRecordId.getOptional("job_record_id")

    /**
     * Reason item was skipped (e.g., 'already_processed', 'size_limit_exceeded')
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipReason(): Optional<String> = skipReason.getOptional("skip_reason")

    /**
     * When processing started for this item
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

    /**
     * Returns the raw JSON value of [itemId].
     *
     * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

    /**
     * Returns the raw JSON value of [itemName].
     *
     * Unlike [itemName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("item_name") @ExcludeMissing fun _itemName(): JsonField<String> = itemName

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_at")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [jobId].
     *
     * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    /**
     * Returns the raw JSON value of [jobRecordId].
     *
     * Unlike [jobRecordId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_record_id")
    @ExcludeMissing
    fun _jobRecordId(): JsonField<String> = jobRecordId

    /**
     * Returns the raw JSON value of [skipReason].
     *
     * Unlike [skipReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skip_reason") @ExcludeMissing fun _skipReason(): JsonField<String> = skipReason

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

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
         * Returns a mutable builder for constructing an instance of [JobItemListResponse].
         *
         * The following fields are required:
         * ```java
         * .itemId()
         * .itemName()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobItemListResponse]. */
    class Builder internal constructor() {

        private var itemId: JsonField<String>? = null
        private var itemName: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var jobId: JsonField<String> = JsonMissing.of()
        private var jobRecordId: JsonField<String> = JsonMissing.of()
        private var skipReason: JsonField<String> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(jobItemListResponse: JobItemListResponse) = apply {
            itemId = jobItemListResponse.itemId
            itemName = jobItemListResponse.itemName
            status = jobItemListResponse.status
            completedAt = jobItemListResponse.completedAt
            effectiveAt = jobItemListResponse.effectiveAt
            errorMessage = jobItemListResponse.errorMessage
            jobId = jobItemListResponse.jobId
            jobRecordId = jobItemListResponse.jobRecordId
            skipReason = jobItemListResponse.skipReason
            startedAt = jobItemListResponse.startedAt
            additionalProperties = jobItemListResponse.additionalProperties.toMutableMap()
        }

        /** ID of the item */
        fun itemId(itemId: String) = itemId(JsonField.of(itemId))

        /**
         * Sets [Builder.itemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

        /** Name of the item */
        fun itemName(itemName: String) = itemName(JsonField.of(itemName))

        /**
         * Sets [Builder.itemName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun itemName(itemName: JsonField<String>) = apply { this.itemName = itemName }

        /** Processing status of this item */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** When processing completed for this item */
        fun completedAt(completedAt: OffsetDateTime?) =
            completedAt(JsonField.ofNullable(completedAt))

        /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
        fun completedAt(completedAt: Optional<OffsetDateTime>) =
            completedAt(completedAt.getOrNull())

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * Sets [Builder.effectiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        /** Error message for the latest job attempt, if any. */
        fun errorMessage(errorMessage: String?) = errorMessage(JsonField.ofNullable(errorMessage))

        /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
        fun errorMessage(errorMessage: Optional<String>) = errorMessage(errorMessage.getOrNull())

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        /** Job ID for the underlying processing job (links to parse/extract job results) */
        fun jobId(jobId: String?) = jobId(JsonField.ofNullable(jobId))

        /** Alias for calling [Builder.jobId] with `jobId.orElse(null)`. */
        fun jobId(jobId: Optional<String>) = jobId(jobId.getOrNull())

        /**
         * Sets [Builder.jobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** The job record ID associated with this status, if any. */
        fun jobRecordId(jobRecordId: String?) = jobRecordId(JsonField.ofNullable(jobRecordId))

        /** Alias for calling [Builder.jobRecordId] with `jobRecordId.orElse(null)`. */
        fun jobRecordId(jobRecordId: Optional<String>) = jobRecordId(jobRecordId.getOrNull())

        /**
         * Sets [Builder.jobRecordId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobRecordId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jobRecordId(jobRecordId: JsonField<String>) = apply { this.jobRecordId = jobRecordId }

        /** Reason item was skipped (e.g., 'already_processed', 'size_limit_exceeded') */
        fun skipReason(skipReason: String?) = skipReason(JsonField.ofNullable(skipReason))

        /** Alias for calling [Builder.skipReason] with `skipReason.orElse(null)`. */
        fun skipReason(skipReason: Optional<String>) = skipReason(skipReason.getOrNull())

        /**
         * Sets [Builder.skipReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun skipReason(skipReason: JsonField<String>) = apply { this.skipReason = skipReason }

        /** When processing started for this item */
        fun startedAt(startedAt: OffsetDateTime?) = startedAt(JsonField.ofNullable(startedAt))

        /** Alias for calling [Builder.startedAt] with `startedAt.orElse(null)`. */
        fun startedAt(startedAt: Optional<OffsetDateTime>) = startedAt(startedAt.getOrNull())

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

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
         * Returns an immutable instance of [JobItemListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .itemId()
         * .itemName()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobItemListResponse =
            JobItemListResponse(
                checkRequired("itemId", itemId),
                checkRequired("itemName", itemName),
                checkRequired("status", status),
                completedAt,
                effectiveAt,
                errorMessage,
                jobId,
                jobRecordId,
                skipReason,
                startedAt,
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
    fun validate(): JobItemListResponse = apply {
        if (validated) {
            return@apply
        }

        itemId()
        itemName()
        status().validate()
        completedAt()
        effectiveAt()
        errorMessage()
        jobId()
        jobRecordId()
        skipReason()
        startedAt()
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
        (if (itemId.asKnown().isPresent) 1 else 0) +
            (if (itemName.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (if (effectiveAt.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (jobId.asKnown().isPresent) 1 else 0) +
            (if (jobRecordId.asKnown().isPresent) 1 else 0) +
            (if (skipReason.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0)

    /** Processing status of this item */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmField val PENDING = of("pending")

            @JvmField val PROCESSING = of("processing")

            @JvmField val SKIPPED = of("skipped")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            COMPLETED,
            FAILED,
            PENDING,
            PROCESSING,
            SKIPPED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELLED,
            COMPLETED,
            FAILED,
            PENDING,
            PROCESSING,
            SKIPPED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
                SKIPPED -> Value.SKIPPED
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
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                SKIPPED -> Known.SKIPPED
                else -> throw LlamaCloudInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobItemListResponse &&
            itemId == other.itemId &&
            itemName == other.itemName &&
            status == other.status &&
            completedAt == other.completedAt &&
            effectiveAt == other.effectiveAt &&
            errorMessage == other.errorMessage &&
            jobId == other.jobId &&
            jobRecordId == other.jobRecordId &&
            skipReason == other.skipReason &&
            startedAt == other.startedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            itemId,
            itemName,
            status,
            completedAt,
            effectiveAt,
            errorMessage,
            jobId,
            jobRecordId,
            skipReason,
            startedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JobItemListResponse{itemId=$itemId, itemName=$itemName, status=$status, completedAt=$completedAt, effectiveAt=$effectiveAt, errorMessage=$errorMessage, jobId=$jobId, jobRecordId=$jobRecordId, skipReason=$skipReason, startedAt=$startedAt, additionalProperties=$additionalProperties}"
}
