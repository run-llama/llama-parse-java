// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.batch

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response schema for a batch processing job. */
class BatchCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val jobType: JsonField<JobType>,
    private val projectId: JsonField<String>,
    private val status: JsonField<Status>,
    private val totalItems: JsonField<Long>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val directoryId: JsonField<String>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val errorMessage: JsonField<String>,
    private val failedItems: JsonField<Long>,
    private val jobRecordId: JsonField<String>,
    private val processedItems: JsonField<Long>,
    private val skippedItems: JsonField<Long>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val workflowId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("job_type") @ExcludeMissing jobType: JsonField<JobType> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("total_items") @ExcludeMissing totalItems: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("directory_id")
        @ExcludeMissing
        directoryId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failed_items")
        @ExcludeMissing
        failedItems: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("job_record_id")
        @ExcludeMissing
        jobRecordId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processed_items")
        @ExcludeMissing
        processedItems: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("skipped_items")
        @ExcludeMissing
        skippedItems: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("started_at")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("workflow_id")
        @ExcludeMissing
        workflowId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        jobType,
        projectId,
        status,
        totalItems,
        completedAt,
        createdAt,
        directoryId,
        effectiveAt,
        errorMessage,
        failedItems,
        jobRecordId,
        processedItems,
        skippedItems,
        startedAt,
        updatedAt,
        workflowId,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the batch job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Type of processing operation (parse or classify)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jobType(): JobType = jobType.getRequired("job_type")

    /**
     * Project this job belongs to
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * Current job status
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Total number of items in the job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalItems(): Long = totalItems.getRequired("total_items")

    /**
     * Timestamp when job completed
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Directory being processed
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun directoryId(): Optional<String> = directoryId.getOptional("directory_id")

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
     * Number of items that failed processing
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failedItems(): Optional<Long> = failedItems.getOptional("failed_items")

    /**
     * The job record ID associated with this status, if any.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobRecordId(): Optional<String> = jobRecordId.getOptional("job_record_id")

    /**
     * Number of items processed so far
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun processedItems(): Optional<Long> = processedItems.getOptional("processed_items")

    /**
     * Number of items skipped (already processed or size limit)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skippedItems(): Optional<Long> = skippedItems.getOptional("skipped_items")

    /**
     * Timestamp when job processing started
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

    /**
     * Update datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Async job tracking ID
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workflowId(): Optional<String> = workflowId.getOptional("workflow_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [jobType].
     *
     * Unlike [jobType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_type") @ExcludeMissing fun _jobType(): JsonField<JobType> = jobType

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [totalItems].
     *
     * Unlike [totalItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_items") @ExcludeMissing fun _totalItems(): JsonField<Long> = totalItems

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [directoryId].
     *
     * Unlike [directoryId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("directory_id")
    @ExcludeMissing
    fun _directoryId(): JsonField<String> = directoryId

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
     * Returns the raw JSON value of [failedItems].
     *
     * Unlike [failedItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failed_items") @ExcludeMissing fun _failedItems(): JsonField<Long> = failedItems

    /**
     * Returns the raw JSON value of [jobRecordId].
     *
     * Unlike [jobRecordId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_record_id")
    @ExcludeMissing
    fun _jobRecordId(): JsonField<String> = jobRecordId

    /**
     * Returns the raw JSON value of [processedItems].
     *
     * Unlike [processedItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processed_items")
    @ExcludeMissing
    fun _processedItems(): JsonField<Long> = processedItems

    /**
     * Returns the raw JSON value of [skippedItems].
     *
     * Unlike [skippedItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skipped_items")
    @ExcludeMissing
    fun _skippedItems(): JsonField<Long> = skippedItems

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [workflowId].
     *
     * Unlike [workflowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workflow_id") @ExcludeMissing fun _workflowId(): JsonField<String> = workflowId

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
         * Returns a mutable builder for constructing an instance of [BatchCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .jobType()
         * .projectId()
         * .status()
         * .totalItems()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var jobType: JsonField<JobType>? = null
        private var projectId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var totalItems: JsonField<Long>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var directoryId: JsonField<String> = JsonMissing.of()
        private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var failedItems: JsonField<Long> = JsonMissing.of()
        private var jobRecordId: JsonField<String> = JsonMissing.of()
        private var processedItems: JsonField<Long> = JsonMissing.of()
        private var skippedItems: JsonField<Long> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var workflowId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(batchCreateResponse: BatchCreateResponse) = apply {
            id = batchCreateResponse.id
            jobType = batchCreateResponse.jobType
            projectId = batchCreateResponse.projectId
            status = batchCreateResponse.status
            totalItems = batchCreateResponse.totalItems
            completedAt = batchCreateResponse.completedAt
            createdAt = batchCreateResponse.createdAt
            directoryId = batchCreateResponse.directoryId
            effectiveAt = batchCreateResponse.effectiveAt
            errorMessage = batchCreateResponse.errorMessage
            failedItems = batchCreateResponse.failedItems
            jobRecordId = batchCreateResponse.jobRecordId
            processedItems = batchCreateResponse.processedItems
            skippedItems = batchCreateResponse.skippedItems
            startedAt = batchCreateResponse.startedAt
            updatedAt = batchCreateResponse.updatedAt
            workflowId = batchCreateResponse.workflowId
            additionalProperties = batchCreateResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the batch job */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Type of processing operation (parse or classify) */
        fun jobType(jobType: JobType) = jobType(JsonField.of(jobType))

        /**
         * Sets [Builder.jobType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobType] with a well-typed [JobType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobType(jobType: JsonField<JobType>) = apply { this.jobType = jobType }

        /** Project this job belongs to */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Current job status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Total number of items in the job */
        fun totalItems(totalItems: Long) = totalItems(JsonField.of(totalItems))

        /**
         * Sets [Builder.totalItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalItems] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalItems(totalItems: JsonField<Long>) = apply { this.totalItems = totalItems }

        /** Timestamp when job completed */
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

        /** Directory being processed */
        fun directoryId(directoryId: String?) = directoryId(JsonField.ofNullable(directoryId))

        /** Alias for calling [Builder.directoryId] with `directoryId.orElse(null)`. */
        fun directoryId(directoryId: Optional<String>) = directoryId(directoryId.getOrNull())

        /**
         * Sets [Builder.directoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.directoryId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun directoryId(directoryId: JsonField<String>) = apply { this.directoryId = directoryId }

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

        /** Number of items that failed processing */
        fun failedItems(failedItems: Long) = failedItems(JsonField.of(failedItems))

        /**
         * Sets [Builder.failedItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failedItems] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failedItems(failedItems: JsonField<Long>) = apply { this.failedItems = failedItems }

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

        /** Number of items processed so far */
        fun processedItems(processedItems: Long) = processedItems(JsonField.of(processedItems))

        /**
         * Sets [Builder.processedItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processedItems] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun processedItems(processedItems: JsonField<Long>) = apply {
            this.processedItems = processedItems
        }

        /** Number of items skipped (already processed or size limit) */
        fun skippedItems(skippedItems: Long) = skippedItems(JsonField.of(skippedItems))

        /**
         * Sets [Builder.skippedItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skippedItems] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun skippedItems(skippedItems: JsonField<Long>) = apply { this.skippedItems = skippedItems }

        /** Timestamp when job processing started */
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

        /** Async job tracking ID */
        fun workflowId(workflowId: String?) = workflowId(JsonField.ofNullable(workflowId))

        /** Alias for calling [Builder.workflowId] with `workflowId.orElse(null)`. */
        fun workflowId(workflowId: Optional<String>) = workflowId(workflowId.getOrNull())

        /**
         * Sets [Builder.workflowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workflowId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workflowId(workflowId: JsonField<String>) = apply { this.workflowId = workflowId }

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
         * Returns an immutable instance of [BatchCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .jobType()
         * .projectId()
         * .status()
         * .totalItems()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchCreateResponse =
            BatchCreateResponse(
                checkRequired("id", id),
                checkRequired("jobType", jobType),
                checkRequired("projectId", projectId),
                checkRequired("status", status),
                checkRequired("totalItems", totalItems),
                completedAt,
                createdAt,
                directoryId,
                effectiveAt,
                errorMessage,
                failedItems,
                jobRecordId,
                processedItems,
                skippedItems,
                startedAt,
                updatedAt,
                workflowId,
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
    fun validate(): BatchCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        jobType().validate()
        projectId()
        status().validate()
        totalItems()
        completedAt()
        createdAt()
        directoryId()
        effectiveAt()
        errorMessage()
        failedItems()
        jobRecordId()
        processedItems()
        skippedItems()
        startedAt()
        updatedAt()
        workflowId()
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
            (jobType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (totalItems.asKnown().isPresent) 1 else 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (directoryId.asKnown().isPresent) 1 else 0) +
            (if (effectiveAt.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (failedItems.asKnown().isPresent) 1 else 0) +
            (if (jobRecordId.asKnown().isPresent) 1 else 0) +
            (if (processedItems.asKnown().isPresent) 1 else 0) +
            (if (skippedItems.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (workflowId.asKnown().isPresent) 1 else 0)

    /** Type of processing operation (parse or classify) */
    class JobType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PARSE = of("parse")

            @JvmField val EXTRACT = of("extract")

            @JvmField val CLASSIFY = of("classify")

            @JvmStatic fun of(value: String) = JobType(JsonField.of(value))
        }

        /** An enum containing [JobType]'s known values. */
        enum class Known {
            PARSE,
            EXTRACT,
            CLASSIFY,
        }

        /**
         * An enum containing [JobType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [JobType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PARSE,
            EXTRACT,
            CLASSIFY,
            /** An enum member indicating that [JobType] was instantiated with an unknown value. */
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
                PARSE -> Value.PARSE
                EXTRACT -> Value.EXTRACT
                CLASSIFY -> Value.CLASSIFY
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
                PARSE -> Known.PARSE
                EXTRACT -> Known.EXTRACT
                CLASSIFY -> Known.CLASSIFY
                else -> throw LlamaCloudInvalidDataException("Unknown JobType: $value")
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
        fun validate(): JobType = apply {
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

            return other is JobType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Current job status */
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

            @JvmField val PENDING = of("pending")

            @JvmField val RUNNING = of("running")

            @JvmField val DISPATCHED = of("dispatched")

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmField val CANCELLED = of("cancelled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            RUNNING,
            DISPATCHED,
            COMPLETED,
            FAILED,
            CANCELLED,
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
            PENDING,
            RUNNING,
            DISPATCHED,
            COMPLETED,
            FAILED,
            CANCELLED,
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
                PENDING -> Value.PENDING
                RUNNING -> Value.RUNNING
                DISPATCHED -> Value.DISPATCHED
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                CANCELLED -> Value.CANCELLED
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
                PENDING -> Known.PENDING
                RUNNING -> Known.RUNNING
                DISPATCHED -> Known.DISPATCHED
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                CANCELLED -> Known.CANCELLED
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

        return other is BatchCreateResponse &&
            id == other.id &&
            jobType == other.jobType &&
            projectId == other.projectId &&
            status == other.status &&
            totalItems == other.totalItems &&
            completedAt == other.completedAt &&
            createdAt == other.createdAt &&
            directoryId == other.directoryId &&
            effectiveAt == other.effectiveAt &&
            errorMessage == other.errorMessage &&
            failedItems == other.failedItems &&
            jobRecordId == other.jobRecordId &&
            processedItems == other.processedItems &&
            skippedItems == other.skippedItems &&
            startedAt == other.startedAt &&
            updatedAt == other.updatedAt &&
            workflowId == other.workflowId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            jobType,
            projectId,
            status,
            totalItems,
            completedAt,
            createdAt,
            directoryId,
            effectiveAt,
            errorMessage,
            failedItems,
            jobRecordId,
            processedItems,
            skippedItems,
            startedAt,
            updatedAt,
            workflowId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchCreateResponse{id=$id, jobType=$jobType, projectId=$projectId, status=$status, totalItems=$totalItems, completedAt=$completedAt, createdAt=$createdAt, directoryId=$directoryId, effectiveAt=$effectiveAt, errorMessage=$errorMessage, failedItems=$failedItems, jobRecordId=$jobRecordId, processedItems=$processedItems, skippedItems=$skippedItems, startedAt=$startedAt, updatedAt=$updatedAt, workflowId=$workflowId, additionalProperties=$additionalProperties}"
}
