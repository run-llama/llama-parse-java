// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

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

class ManagedIngestionStatusResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val status: JsonField<Status>,
    private val deploymentDate: JsonField<OffsetDateTime>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val error: JsonField<List<Error>>,
    private val jobId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("deployment_date")
        @ExcludeMissing
        deploymentDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<List<Error>> = JsonMissing.of(),
        @JsonProperty("job_id") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
    ) : this(status, deploymentDate, effectiveAt, error, jobId, mutableMapOf())

    /**
     * Status of the ingestion.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Date of the deployment.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deploymentDate(): Optional<OffsetDateTime> = deploymentDate.getOptional("deployment_date")

    /**
     * When the status is effective
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveAt(): Optional<OffsetDateTime> = effectiveAt.getOptional("effective_at")

    /**
     * List of errors that occurred during ingestion.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<List<Error>> = error.getOptional("error")

    /**
     * ID of the latest job.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobId(): Optional<String> = jobId.getOptional("job_id")

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [deploymentDate].
     *
     * Unlike [deploymentDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deployment_date")
    @ExcludeMissing
    fun _deploymentDate(): JsonField<OffsetDateTime> = deploymentDate

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_at")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<List<Error>> = error

    /**
     * Returns the raw JSON value of [jobId].
     *
     * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

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
         * Returns a mutable builder for constructing an instance of
         * [ManagedIngestionStatusResponse].
         *
         * The following fields are required:
         * ```java
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ManagedIngestionStatusResponse]. */
    class Builder internal constructor() {

        private var status: JsonField<Status>? = null
        private var deploymentDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var error: JsonField<MutableList<Error>>? = null
        private var jobId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(managedIngestionStatusResponse: ManagedIngestionStatusResponse) = apply {
            status = managedIngestionStatusResponse.status
            deploymentDate = managedIngestionStatusResponse.deploymentDate
            effectiveAt = managedIngestionStatusResponse.effectiveAt
            error = managedIngestionStatusResponse.error.map { it.toMutableList() }
            jobId = managedIngestionStatusResponse.jobId
            additionalProperties =
                managedIngestionStatusResponse.additionalProperties.toMutableMap()
        }

        /** Status of the ingestion. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Date of the deployment. */
        fun deploymentDate(deploymentDate: OffsetDateTime?) =
            deploymentDate(JsonField.ofNullable(deploymentDate))

        /** Alias for calling [Builder.deploymentDate] with `deploymentDate.orElse(null)`. */
        fun deploymentDate(deploymentDate: Optional<OffsetDateTime>) =
            deploymentDate(deploymentDate.getOrNull())

        /**
         * Sets [Builder.deploymentDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deploymentDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deploymentDate(deploymentDate: JsonField<OffsetDateTime>) = apply {
            this.deploymentDate = deploymentDate
        }

        /** When the status is effective */
        fun effectiveAt(effectiveAt: OffsetDateTime?) =
            effectiveAt(JsonField.ofNullable(effectiveAt))

        /** Alias for calling [Builder.effectiveAt] with `effectiveAt.orElse(null)`. */
        fun effectiveAt(effectiveAt: Optional<OffsetDateTime>) =
            effectiveAt(effectiveAt.getOrNull())

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

        /** List of errors that occurred during ingestion. */
        fun error(error: List<Error>?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<List<Error>>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed `List<Error>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun error(error: JsonField<List<Error>>) = apply {
            this.error = error.map { it.toMutableList() }
        }

        /**
         * Adds a single [Error] to [Builder.error].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: Error) = apply {
            this.error =
                (this.error ?: JsonField.of(mutableListOf())).also {
                    checkKnown("error", it).add(error)
                }
        }

        /** ID of the latest job. */
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
         * Returns an immutable instance of [ManagedIngestionStatusResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ManagedIngestionStatusResponse =
            ManagedIngestionStatusResponse(
                checkRequired("status", status),
                deploymentDate,
                effectiveAt,
                (error ?: JsonMissing.of()).map { it.toImmutable() },
                jobId,
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
    fun validate(): ManagedIngestionStatusResponse = apply {
        if (validated) {
            return@apply
        }

        status().validate()
        deploymentDate()
        effectiveAt()
        error().ifPresent { it.forEach { it.validate() } }
        jobId()
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
        (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (deploymentDate.asKnown().isPresent) 1 else 0) +
            (if (effectiveAt.asKnown().isPresent) 1 else 0) +
            (error.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (jobId.asKnown().isPresent) 1 else 0)

    /** Status of the ingestion. */
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

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmField val ERROR = of("ERROR")

            @JvmField val IN_PROGRESS = of("IN_PROGRESS")

            @JvmField val NOT_STARTED = of("NOT_STARTED")

            @JvmField val PARTIAL_SUCCESS = of("PARTIAL_SUCCESS")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            ERROR,
            IN_PROGRESS,
            NOT_STARTED,
            PARTIAL_SUCCESS,
            SUCCESS,
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
            ERROR,
            IN_PROGRESS,
            NOT_STARTED,
            PARTIAL_SUCCESS,
            SUCCESS,
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
                ERROR -> Value.ERROR
                IN_PROGRESS -> Value.IN_PROGRESS
                NOT_STARTED -> Value.NOT_STARTED
                PARTIAL_SUCCESS -> Value.PARTIAL_SUCCESS
                SUCCESS -> Value.SUCCESS
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
                ERROR -> Known.ERROR
                IN_PROGRESS -> Known.IN_PROGRESS
                NOT_STARTED -> Known.NOT_STARTED
                PARTIAL_SUCCESS -> Known.PARTIAL_SUCCESS
                SUCCESS -> Known.SUCCESS
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

    class Error
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val jobId: JsonField<String>,
        private val message: JsonField<String>,
        private val step: JsonField<Step>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("job_id") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("step") @ExcludeMissing step: JsonField<Step> = JsonMissing.of(),
        ) : this(jobId, message, step, mutableMapOf())

        /**
         * ID of the job that failed.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun jobId(): String = jobId.getRequired("job_id")

        /**
         * List of errors that occurred during ingestion.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * Name of the job that failed.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun step(): Step = step.getRequired("step")

        /**
         * Returns the raw JSON value of [jobId].
         *
         * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [step].
         *
         * Unlike [step], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("step") @ExcludeMissing fun _step(): JsonField<Step> = step

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
             * Returns a mutable builder for constructing an instance of [Error].
             *
             * The following fields are required:
             * ```java
             * .jobId()
             * .message()
             * .step()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var jobId: JsonField<String>? = null
            private var message: JsonField<String>? = null
            private var step: JsonField<Step>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(error: Error) = apply {
                jobId = error.jobId
                message = error.message
                step = error.step
                additionalProperties = error.additionalProperties.toMutableMap()
            }

            /** ID of the job that failed. */
            fun jobId(jobId: String) = jobId(JsonField.of(jobId))

            /**
             * Sets [Builder.jobId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

            /** List of errors that occurred during ingestion. */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /** Name of the job that failed. */
            fun step(step: Step) = step(JsonField.of(step))

            /**
             * Sets [Builder.step] to an arbitrary JSON value.
             *
             * You should usually call [Builder.step] with a well-typed [Step] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun step(step: JsonField<Step>) = apply { this.step = step }

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
             * Returns an immutable instance of [Error].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .jobId()
             * .message()
             * .step()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Error =
                Error(
                    checkRequired("jobId", jobId),
                    checkRequired("message", message),
                    checkRequired("step", step),
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
        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            jobId()
            message()
            step().validate()
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
            (if (jobId.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (step.asKnown().getOrNull()?.validity() ?: 0)

        /** Name of the job that failed. */
        class Step @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DATA_SOURCE = of("DATA_SOURCE")

                @JvmField val FILE_UPDATER = of("FILE_UPDATER")

                @JvmField val INGESTION = of("INGESTION")

                @JvmField val MANAGED_INGESTION = of("MANAGED_INGESTION")

                @JvmField val METADATA_UPDATE = of("METADATA_UPDATE")

                @JvmField val PARSE = of("PARSE")

                @JvmField val TRANSFORM = of("TRANSFORM")

                @JvmStatic fun of(value: String) = Step(JsonField.of(value))
            }

            /** An enum containing [Step]'s known values. */
            enum class Known {
                DATA_SOURCE,
                FILE_UPDATER,
                INGESTION,
                MANAGED_INGESTION,
                METADATA_UPDATE,
                PARSE,
                TRANSFORM,
            }

            /**
             * An enum containing [Step]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Step] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DATA_SOURCE,
                FILE_UPDATER,
                INGESTION,
                MANAGED_INGESTION,
                METADATA_UPDATE,
                PARSE,
                TRANSFORM,
                /** An enum member indicating that [Step] was instantiated with an unknown value. */
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
                    DATA_SOURCE -> Value.DATA_SOURCE
                    FILE_UPDATER -> Value.FILE_UPDATER
                    INGESTION -> Value.INGESTION
                    MANAGED_INGESTION -> Value.MANAGED_INGESTION
                    METADATA_UPDATE -> Value.METADATA_UPDATE
                    PARSE -> Value.PARSE
                    TRANSFORM -> Value.TRANSFORM
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
                    DATA_SOURCE -> Known.DATA_SOURCE
                    FILE_UPDATER -> Known.FILE_UPDATER
                    INGESTION -> Known.INGESTION
                    MANAGED_INGESTION -> Known.MANAGED_INGESTION
                    METADATA_UPDATE -> Known.METADATA_UPDATE
                    PARSE -> Known.PARSE
                    TRANSFORM -> Known.TRANSFORM
                    else -> throw LlamaCloudInvalidDataException("Unknown Step: $value")
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
            fun validate(): Step = apply {
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

                return other is Step && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Error &&
                jobId == other.jobId &&
                message == other.message &&
                step == other.step &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(jobId, message, step, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Error{jobId=$jobId, message=$message, step=$step, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManagedIngestionStatusResponse &&
            status == other.status &&
            deploymentDate == other.deploymentDate &&
            effectiveAt == other.effectiveAt &&
            error == other.error &&
            jobId == other.jobId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(status, deploymentDate, effectiveAt, error, jobId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ManagedIngestionStatusResponse{status=$status, deploymentDate=$deploymentDate, effectiveAt=$effectiveAt, error=$error, jobId=$jobId, additionalProperties=$additionalProperties}"
}
