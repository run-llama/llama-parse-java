// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.jobdatapoints

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

/** A job data point. */
class JobDataPoint
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customTag: JsonField<String>,
    private val projectId: JsonField<String>,
    private val status: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val errorMessage: JsonField<String>,
    private val stateTransitions: JsonField<StateTransitions>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_tag") @ExcludeMissing customTag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state_transitions")
        @ExcludeMissing
        stateTransitions: JsonField<StateTransitions> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        customTag,
        projectId,
        status,
        updatedAt,
        errorMessage,
        stateTransitions,
        mutableMapOf(),
    )

    /**
     * Job ID.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Created timestamp.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Custom tag.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customTag(): String = customTag.getRequired("custom_tag")

    /**
     * Project ID.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * Job status.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * Updated timestamp.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Error message, if any.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * Job state transition timestamps.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stateTransitions(): Optional<StateTransitions> =
        stateTransitions.getOptional("state_transitions")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customTag].
     *
     * Unlike [customTag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_tag") @ExcludeMissing fun _customTag(): JsonField<String> = customTag

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [stateTransitions].
     *
     * Unlike [stateTransitions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("state_transitions")
    @ExcludeMissing
    fun _stateTransitions(): JsonField<StateTransitions> = stateTransitions

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
         * Returns a mutable builder for constructing an instance of [JobDataPoint].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .customTag()
         * .projectId()
         * .status()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobDataPoint]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customTag: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var status: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var stateTransitions: JsonField<StateTransitions> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(jobDataPoint: JobDataPoint) = apply {
            id = jobDataPoint.id
            createdAt = jobDataPoint.createdAt
            customTag = jobDataPoint.customTag
            projectId = jobDataPoint.projectId
            status = jobDataPoint.status
            updatedAt = jobDataPoint.updatedAt
            errorMessage = jobDataPoint.errorMessage
            stateTransitions = jobDataPoint.stateTransitions
            additionalProperties = jobDataPoint.additionalProperties.toMutableMap()
        }

        /** Job ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Created timestamp. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Custom tag. */
        fun customTag(customTag: String) = customTag(JsonField.of(customTag))

        /**
         * Sets [Builder.customTag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customTag] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customTag(customTag: JsonField<String>) = apply { this.customTag = customTag }

        /** Project ID. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Job status. */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Updated timestamp. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Error message, if any. */
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

        /** Job state transition timestamps. */
        fun stateTransitions(stateTransitions: StateTransitions) =
            stateTransitions(JsonField.of(stateTransitions))

        /**
         * Sets [Builder.stateTransitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stateTransitions] with a well-typed [StateTransitions]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun stateTransitions(stateTransitions: JsonField<StateTransitions>) = apply {
            this.stateTransitions = stateTransitions
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
         * Returns an immutable instance of [JobDataPoint].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .customTag()
         * .projectId()
         * .status()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobDataPoint =
            JobDataPoint(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("customTag", customTag),
                checkRequired("projectId", projectId),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                errorMessage,
                stateTransitions,
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
    fun validate(): JobDataPoint = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        customTag()
        projectId()
        status()
        updatedAt()
        errorMessage()
        stateTransitions().ifPresent { it.validate() }
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (customTag.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (stateTransitions.asKnown().getOrNull()?.validity() ?: 0)

    /** Job state transition timestamps. */
    class StateTransitions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cancelledAt: JsonField<OffsetDateTime>,
        private val completedAt: JsonField<OffsetDateTime>,
        private val failedAt: JsonField<OffsetDateTime>,
        private val pendingAt: JsonField<OffsetDateTime>,
        private val runningAt: JsonField<OffsetDateTime>,
        private val throttledAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cancelled_at")
            @ExcludeMissing
            cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("completed_at")
            @ExcludeMissing
            completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("failed_at")
            @ExcludeMissing
            failedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("pending_at")
            @ExcludeMissing
            pendingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("running_at")
            @ExcludeMissing
            runningAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("throttled_at")
            @ExcludeMissing
            throttledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            cancelledAt,
            completedAt,
            failedAt,
            pendingAt,
            runningAt,
            throttledAt,
            mutableMapOf(),
        )

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cancelledAt(): Optional<OffsetDateTime> = cancelledAt.getOptional("cancelled_at")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun failedAt(): Optional<OffsetDateTime> = failedAt.getOptional("failed_at")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pendingAt(): Optional<OffsetDateTime> = pendingAt.getOptional("pending_at")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun runningAt(): Optional<OffsetDateTime> = runningAt.getOptional("running_at")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun throttledAt(): Optional<OffsetDateTime> = throttledAt.getOptional("throttled_at")

        /**
         * Returns the raw JSON value of [cancelledAt].
         *
         * Unlike [cancelledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cancelled_at")
        @ExcludeMissing
        fun _cancelledAt(): JsonField<OffsetDateTime> = cancelledAt

        /**
         * Returns the raw JSON value of [completedAt].
         *
         * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completed_at")
        @ExcludeMissing
        fun _completedAt(): JsonField<OffsetDateTime> = completedAt

        /**
         * Returns the raw JSON value of [failedAt].
         *
         * Unlike [failedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("failed_at")
        @ExcludeMissing
        fun _failedAt(): JsonField<OffsetDateTime> = failedAt

        /**
         * Returns the raw JSON value of [pendingAt].
         *
         * Unlike [pendingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pending_at")
        @ExcludeMissing
        fun _pendingAt(): JsonField<OffsetDateTime> = pendingAt

        /**
         * Returns the raw JSON value of [runningAt].
         *
         * Unlike [runningAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("running_at")
        @ExcludeMissing
        fun _runningAt(): JsonField<OffsetDateTime> = runningAt

        /**
         * Returns the raw JSON value of [throttledAt].
         *
         * Unlike [throttledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("throttled_at")
        @ExcludeMissing
        fun _throttledAt(): JsonField<OffsetDateTime> = throttledAt

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

            /** Returns a mutable builder for constructing an instance of [StateTransitions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StateTransitions]. */
        class Builder internal constructor() {

            private var cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var failedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var pendingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var runningAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var throttledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stateTransitions: StateTransitions) = apply {
                cancelledAt = stateTransitions.cancelledAt
                completedAt = stateTransitions.completedAt
                failedAt = stateTransitions.failedAt
                pendingAt = stateTransitions.pendingAt
                runningAt = stateTransitions.runningAt
                throttledAt = stateTransitions.throttledAt
                additionalProperties = stateTransitions.additionalProperties.toMutableMap()
            }

            fun cancelledAt(cancelledAt: OffsetDateTime?) =
                cancelledAt(JsonField.ofNullable(cancelledAt))

            /** Alias for calling [Builder.cancelledAt] with `cancelledAt.orElse(null)`. */
            fun cancelledAt(cancelledAt: Optional<OffsetDateTime>) =
                cancelledAt(cancelledAt.getOrNull())

            /**
             * Sets [Builder.cancelledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelledAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cancelledAt(cancelledAt: JsonField<OffsetDateTime>) = apply {
                this.cancelledAt = cancelledAt
            }

            fun completedAt(completedAt: OffsetDateTime?) =
                completedAt(JsonField.ofNullable(completedAt))

            /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
            fun completedAt(completedAt: Optional<OffsetDateTime>) =
                completedAt(completedAt.getOrNull())

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                this.completedAt = completedAt
            }

            fun failedAt(failedAt: OffsetDateTime?) = failedAt(JsonField.ofNullable(failedAt))

            /** Alias for calling [Builder.failedAt] with `failedAt.orElse(null)`. */
            fun failedAt(failedAt: Optional<OffsetDateTime>) = failedAt(failedAt.getOrNull())

            /**
             * Sets [Builder.failedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failedAt(failedAt: JsonField<OffsetDateTime>) = apply { this.failedAt = failedAt }

            fun pendingAt(pendingAt: OffsetDateTime?) = pendingAt(JsonField.ofNullable(pendingAt))

            /** Alias for calling [Builder.pendingAt] with `pendingAt.orElse(null)`. */
            fun pendingAt(pendingAt: Optional<OffsetDateTime>) = pendingAt(pendingAt.getOrNull())

            /**
             * Sets [Builder.pendingAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pendingAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pendingAt(pendingAt: JsonField<OffsetDateTime>) = apply {
                this.pendingAt = pendingAt
            }

            fun runningAt(runningAt: OffsetDateTime?) = runningAt(JsonField.ofNullable(runningAt))

            /** Alias for calling [Builder.runningAt] with `runningAt.orElse(null)`. */
            fun runningAt(runningAt: Optional<OffsetDateTime>) = runningAt(runningAt.getOrNull())

            /**
             * Sets [Builder.runningAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runningAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runningAt(runningAt: JsonField<OffsetDateTime>) = apply {
                this.runningAt = runningAt
            }

            fun throttledAt(throttledAt: OffsetDateTime?) =
                throttledAt(JsonField.ofNullable(throttledAt))

            /** Alias for calling [Builder.throttledAt] with `throttledAt.orElse(null)`. */
            fun throttledAt(throttledAt: Optional<OffsetDateTime>) =
                throttledAt(throttledAt.getOrNull())

            /**
             * Sets [Builder.throttledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.throttledAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun throttledAt(throttledAt: JsonField<OffsetDateTime>) = apply {
                this.throttledAt = throttledAt
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
             * Returns an immutable instance of [StateTransitions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StateTransitions =
                StateTransitions(
                    cancelledAt,
                    completedAt,
                    failedAt,
                    pendingAt,
                    runningAt,
                    throttledAt,
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
        fun validate(): StateTransitions = apply {
            if (validated) {
                return@apply
            }

            cancelledAt()
            completedAt()
            failedAt()
            pendingAt()
            runningAt()
            throttledAt()
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
            (if (cancelledAt.asKnown().isPresent) 1 else 0) +
                (if (completedAt.asKnown().isPresent) 1 else 0) +
                (if (failedAt.asKnown().isPresent) 1 else 0) +
                (if (pendingAt.asKnown().isPresent) 1 else 0) +
                (if (runningAt.asKnown().isPresent) 1 else 0) +
                (if (throttledAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StateTransitions &&
                cancelledAt == other.cancelledAt &&
                completedAt == other.completedAt &&
                failedAt == other.failedAt &&
                pendingAt == other.pendingAt &&
                runningAt == other.runningAt &&
                throttledAt == other.throttledAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cancelledAt,
                completedAt,
                failedAt,
                pendingAt,
                runningAt,
                throttledAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StateTransitions{cancelledAt=$cancelledAt, completedAt=$completedAt, failedAt=$failedAt, pendingAt=$pendingAt, runningAt=$runningAt, throttledAt=$throttledAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobDataPoint &&
            id == other.id &&
            createdAt == other.createdAt &&
            customTag == other.customTag &&
            projectId == other.projectId &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            errorMessage == other.errorMessage &&
            stateTransitions == other.stateTransitions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            customTag,
            projectId,
            status,
            updatedAt,
            errorMessage,
            stateTransitions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JobDataPoint{id=$id, createdAt=$createdAt, customTag=$customTag, projectId=$projectId, status=$status, updatedAt=$updatedAt, errorMessage=$errorMessage, stateTransitions=$stateTransitions, additionalProperties=$additionalProperties}"
}
