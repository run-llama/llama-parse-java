// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

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

/**
 * An extract job's review: its settings, flags, field actions and decision, with the result as read
 * and as reviewed.
 */
class ExtractReview
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val confidenceThreshold: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val decidedAt: JsonField<OffsetDateTime>,
    private val decidedBy: JsonField<String>,
    private val decidedReason: JsonField<String>,
    private val fieldActions: JsonField<FieldActions>,
    private val fieldsInScope: JsonField<List<String>>,
    private val flags: JsonField<List<Flag>>,
    private val jobId: JsonField<String>,
    private val openFlags: JsonField<List<String>>,
    private val originalResult: JsonField<OriginalResult>,
    private val requiredFields: JsonField<List<String>>,
    private val retainUntil: JsonField<OffsetDateTime>,
    private val reviewedResult: JsonField<ReviewedResult>,
    private val revision: JsonField<Long>,
    private val sourceFileId: JsonField<String>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confidence_threshold")
        @ExcludeMissing
        confidenceThreshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("decided_at")
        @ExcludeMissing
        decidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("decided_by") @ExcludeMissing decidedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decided_reason")
        @ExcludeMissing
        decidedReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("field_actions")
        @ExcludeMissing
        fieldActions: JsonField<FieldActions> = JsonMissing.of(),
        @JsonProperty("fields_in_scope")
        @ExcludeMissing
        fieldsInScope: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("flags") @ExcludeMissing flags: JsonField<List<Flag>> = JsonMissing.of(),
        @JsonProperty("job_id") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("open_flags")
        @ExcludeMissing
        openFlags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("original_result")
        @ExcludeMissing
        originalResult: JsonField<OriginalResult> = JsonMissing.of(),
        @JsonProperty("required_fields")
        @ExcludeMissing
        requiredFields: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("retain_until")
        @ExcludeMissing
        retainUntil: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("reviewed_result")
        @ExcludeMissing
        reviewedResult: JsonField<ReviewedResult> = JsonMissing.of(),
        @JsonProperty("revision") @ExcludeMissing revision: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("source_file_id")
        @ExcludeMissing
        sourceFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        confidenceThreshold,
        createdAt,
        decidedAt,
        decidedBy,
        decidedReason,
        fieldActions,
        fieldsInScope,
        flags,
        jobId,
        openFlags,
        originalResult,
        requiredFields,
        retainUntil,
        reviewedResult,
        revision,
        sourceFileId,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the review.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Fields read below this confidence are flagged.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun confidenceThreshold(): Double = confidenceThreshold.getRequired("confidence_threshold")

    /**
     * When review was turned on.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * When it was approved or rejected.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decidedAt(): Optional<OffsetDateTime> = decidedAt.getOptional("decided_at")

    /**
     * ID of the user who approved or rejected it.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decidedBy(): Optional<String> = decidedBy.getOptional("decided_by")

    /**
     * Why it was rejected.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decidedReason(): Optional<String> = decidedReason.getOptional("decided_reason")

    /**
     * The latest action per field, keyed by JSON Pointer.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fieldActions(): FieldActions = fieldActions.getRequired("field_actions")

    /**
     * JSON Pointers of the fields the threshold applies to; empty means all.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fieldsInScope(): List<String> = fieldsInScope.getRequired("fields_in_scope")

    /**
     * Fields the review asks a person to check.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun flags(): List<Flag> = flags.getRequired("flags")

    /**
     * The extract job reviewed.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jobId(): String = jobId.getRequired("job_id")

    /**
     * JSON Pointers of flagged fields nobody checked.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun openFlags(): List<String> = openFlags.getRequired("open_flags")

    /**
     * The result as the model read it.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originalResult(): Optional<OriginalResult> = originalResult.getOptional("original_result")

    /**
     * JSON Pointers of fields flagged when empty.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiredFields(): List<String> = requiredFields.getRequired("required_fields")

    /**
     * When the job and its document may be deleted.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun retainUntil(): OffsetDateTime = retainUntil.getRequired("retain_until")

    /**
     * The result with the field actions.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reviewedResult(): ReviewedResult = reviewedResult.getRequired("reviewed_result")

    /**
     * Bumped by every change; actions name the one they saw.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun revision(): Long = revision.getRequired("revision")

    /**
     * The file the job read, or the file behind the parse job it read; null for a URL.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceFileId(): Optional<String> = sourceFileId.getOptional("source_file_id")

    /**
     * pending until approved or rejected.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * When the review last changed.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [confidenceThreshold].
     *
     * Unlike [confidenceThreshold], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("confidence_threshold")
    @ExcludeMissing
    fun _confidenceThreshold(): JsonField<Double> = confidenceThreshold

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [decidedAt].
     *
     * Unlike [decidedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decided_at")
    @ExcludeMissing
    fun _decidedAt(): JsonField<OffsetDateTime> = decidedAt

    /**
     * Returns the raw JSON value of [decidedBy].
     *
     * Unlike [decidedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decided_by") @ExcludeMissing fun _decidedBy(): JsonField<String> = decidedBy

    /**
     * Returns the raw JSON value of [decidedReason].
     *
     * Unlike [decidedReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decided_reason")
    @ExcludeMissing
    fun _decidedReason(): JsonField<String> = decidedReason

    /**
     * Returns the raw JSON value of [fieldActions].
     *
     * Unlike [fieldActions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("field_actions")
    @ExcludeMissing
    fun _fieldActions(): JsonField<FieldActions> = fieldActions

    /**
     * Returns the raw JSON value of [fieldsInScope].
     *
     * Unlike [fieldsInScope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fields_in_scope")
    @ExcludeMissing
    fun _fieldsInScope(): JsonField<List<String>> = fieldsInScope

    /**
     * Returns the raw JSON value of [flags].
     *
     * Unlike [flags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flags") @ExcludeMissing fun _flags(): JsonField<List<Flag>> = flags

    /**
     * Returns the raw JSON value of [jobId].
     *
     * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    /**
     * Returns the raw JSON value of [openFlags].
     *
     * Unlike [openFlags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open_flags")
    @ExcludeMissing
    fun _openFlags(): JsonField<List<String>> = openFlags

    /**
     * Returns the raw JSON value of [originalResult].
     *
     * Unlike [originalResult], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("original_result")
    @ExcludeMissing
    fun _originalResult(): JsonField<OriginalResult> = originalResult

    /**
     * Returns the raw JSON value of [requiredFields].
     *
     * Unlike [requiredFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required_fields")
    @ExcludeMissing
    fun _requiredFields(): JsonField<List<String>> = requiredFields

    /**
     * Returns the raw JSON value of [retainUntil].
     *
     * Unlike [retainUntil], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retain_until")
    @ExcludeMissing
    fun _retainUntil(): JsonField<OffsetDateTime> = retainUntil

    /**
     * Returns the raw JSON value of [reviewedResult].
     *
     * Unlike [reviewedResult], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewed_result")
    @ExcludeMissing
    fun _reviewedResult(): JsonField<ReviewedResult> = reviewedResult

    /**
     * Returns the raw JSON value of [revision].
     *
     * Unlike [revision], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revision") @ExcludeMissing fun _revision(): JsonField<Long> = revision

    /**
     * Returns the raw JSON value of [sourceFileId].
     *
     * Unlike [sourceFileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_file_id")
    @ExcludeMissing
    fun _sourceFileId(): JsonField<String> = sourceFileId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [ExtractReview].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .confidenceThreshold()
         * .createdAt()
         * .decidedAt()
         * .decidedBy()
         * .decidedReason()
         * .fieldActions()
         * .fieldsInScope()
         * .flags()
         * .jobId()
         * .openFlags()
         * .originalResult()
         * .requiredFields()
         * .retainUntil()
         * .reviewedResult()
         * .revision()
         * .sourceFileId()
         * .status()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractReview]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var confidenceThreshold: JsonField<Double>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var decidedAt: JsonField<OffsetDateTime>? = null
        private var decidedBy: JsonField<String>? = null
        private var decidedReason: JsonField<String>? = null
        private var fieldActions: JsonField<FieldActions>? = null
        private var fieldsInScope: JsonField<MutableList<String>>? = null
        private var flags: JsonField<MutableList<Flag>>? = null
        private var jobId: JsonField<String>? = null
        private var openFlags: JsonField<MutableList<String>>? = null
        private var originalResult: JsonField<OriginalResult>? = null
        private var requiredFields: JsonField<MutableList<String>>? = null
        private var retainUntil: JsonField<OffsetDateTime>? = null
        private var reviewedResult: JsonField<ReviewedResult>? = null
        private var revision: JsonField<Long>? = null
        private var sourceFileId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractReview: ExtractReview) = apply {
            id = extractReview.id
            confidenceThreshold = extractReview.confidenceThreshold
            createdAt = extractReview.createdAt
            decidedAt = extractReview.decidedAt
            decidedBy = extractReview.decidedBy
            decidedReason = extractReview.decidedReason
            fieldActions = extractReview.fieldActions
            fieldsInScope = extractReview.fieldsInScope.map { it.toMutableList() }
            flags = extractReview.flags.map { it.toMutableList() }
            jobId = extractReview.jobId
            openFlags = extractReview.openFlags.map { it.toMutableList() }
            originalResult = extractReview.originalResult
            requiredFields = extractReview.requiredFields.map { it.toMutableList() }
            retainUntil = extractReview.retainUntil
            reviewedResult = extractReview.reviewedResult
            revision = extractReview.revision
            sourceFileId = extractReview.sourceFileId
            status = extractReview.status
            updatedAt = extractReview.updatedAt
            additionalProperties = extractReview.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the review. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Fields read below this confidence are flagged. */
        fun confidenceThreshold(confidenceThreshold: Double) =
            confidenceThreshold(JsonField.of(confidenceThreshold))

        /**
         * Sets [Builder.confidenceThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidenceThreshold] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun confidenceThreshold(confidenceThreshold: JsonField<Double>) = apply {
            this.confidenceThreshold = confidenceThreshold
        }

        /** When review was turned on. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** When it was approved or rejected. */
        fun decidedAt(decidedAt: OffsetDateTime?) = decidedAt(JsonField.ofNullable(decidedAt))

        /** Alias for calling [Builder.decidedAt] with `decidedAt.orElse(null)`. */
        fun decidedAt(decidedAt: Optional<OffsetDateTime>) = decidedAt(decidedAt.getOrNull())

        /**
         * Sets [Builder.decidedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decidedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun decidedAt(decidedAt: JsonField<OffsetDateTime>) = apply { this.decidedAt = decidedAt }

        /** ID of the user who approved or rejected it. */
        fun decidedBy(decidedBy: String?) = decidedBy(JsonField.ofNullable(decidedBy))

        /** Alias for calling [Builder.decidedBy] with `decidedBy.orElse(null)`. */
        fun decidedBy(decidedBy: Optional<String>) = decidedBy(decidedBy.getOrNull())

        /**
         * Sets [Builder.decidedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decidedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun decidedBy(decidedBy: JsonField<String>) = apply { this.decidedBy = decidedBy }

        /** Why it was rejected. */
        fun decidedReason(decidedReason: String?) =
            decidedReason(JsonField.ofNullable(decidedReason))

        /** Alias for calling [Builder.decidedReason] with `decidedReason.orElse(null)`. */
        fun decidedReason(decidedReason: Optional<String>) =
            decidedReason(decidedReason.getOrNull())

        /**
         * Sets [Builder.decidedReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decidedReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun decidedReason(decidedReason: JsonField<String>) = apply {
            this.decidedReason = decidedReason
        }

        /** The latest action per field, keyed by JSON Pointer. */
        fun fieldActions(fieldActions: FieldActions) = fieldActions(JsonField.of(fieldActions))

        /**
         * Sets [Builder.fieldActions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldActions] with a well-typed [FieldActions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fieldActions(fieldActions: JsonField<FieldActions>) = apply {
            this.fieldActions = fieldActions
        }

        /** JSON Pointers of the fields the threshold applies to; empty means all. */
        fun fieldsInScope(fieldsInScope: List<String>) = fieldsInScope(JsonField.of(fieldsInScope))

        /**
         * Sets [Builder.fieldsInScope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldsInScope] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fieldsInScope(fieldsInScope: JsonField<List<String>>) = apply {
            this.fieldsInScope = fieldsInScope.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.fieldsInScope].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFieldsInScope(fieldsInScope: String) = apply {
            this.fieldsInScope =
                (this.fieldsInScope ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fieldsInScope", it).add(fieldsInScope)
                }
        }

        /** Fields the review asks a person to check. */
        fun flags(flags: List<Flag>) = flags(JsonField.of(flags))

        /**
         * Sets [Builder.flags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flags] with a well-typed `List<Flag>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flags(flags: JsonField<List<Flag>>) = apply {
            this.flags = flags.map { it.toMutableList() }
        }

        /**
         * Adds a single [Flag] to [flags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFlag(flag: Flag) = apply {
            flags =
                (flags ?: JsonField.of(mutableListOf())).also { checkKnown("flags", it).add(flag) }
        }

        /** The extract job reviewed. */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /**
         * Sets [Builder.jobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** JSON Pointers of flagged fields nobody checked. */
        fun openFlags(openFlags: List<String>) = openFlags(JsonField.of(openFlags))

        /**
         * Sets [Builder.openFlags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openFlags] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openFlags(openFlags: JsonField<List<String>>) = apply {
            this.openFlags = openFlags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [openFlags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOpenFlag(openFlag: String) = apply {
            openFlags =
                (openFlags ?: JsonField.of(mutableListOf())).also {
                    checkKnown("openFlags", it).add(openFlag)
                }
        }

        /** The result as the model read it. */
        fun originalResult(originalResult: OriginalResult?) =
            originalResult(JsonField.ofNullable(originalResult))

        /** Alias for calling [Builder.originalResult] with `originalResult.orElse(null)`. */
        fun originalResult(originalResult: Optional<OriginalResult>) =
            originalResult(originalResult.getOrNull())

        /**
         * Sets [Builder.originalResult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalResult] with a well-typed [OriginalResult] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originalResult(originalResult: JsonField<OriginalResult>) = apply {
            this.originalResult = originalResult
        }

        /** JSON Pointers of fields flagged when empty. */
        fun requiredFields(requiredFields: List<String>) =
            requiredFields(JsonField.of(requiredFields))

        /**
         * Sets [Builder.requiredFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredFields] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requiredFields(requiredFields: JsonField<List<String>>) = apply {
            this.requiredFields = requiredFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [requiredFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredField(requiredField: String) = apply {
            requiredFields =
                (requiredFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiredFields", it).add(requiredField)
                }
        }

        /** When the job and its document may be deleted. */
        fun retainUntil(retainUntil: OffsetDateTime) = retainUntil(JsonField.of(retainUntil))

        /**
         * Sets [Builder.retainUntil] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retainUntil] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun retainUntil(retainUntil: JsonField<OffsetDateTime>) = apply {
            this.retainUntil = retainUntil
        }

        /** The result with the field actions. */
        fun reviewedResult(reviewedResult: ReviewedResult) =
            reviewedResult(JsonField.of(reviewedResult))

        /**
         * Sets [Builder.reviewedResult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewedResult] with a well-typed [ReviewedResult] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewedResult(reviewedResult: JsonField<ReviewedResult>) = apply {
            this.reviewedResult = reviewedResult
        }

        /** Bumped by every change; actions name the one they saw. */
        fun revision(revision: Long) = revision(JsonField.of(revision))

        /**
         * Sets [Builder.revision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revision] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revision(revision: JsonField<Long>) = apply { this.revision = revision }

        /** The file the job read, or the file behind the parse job it read; null for a URL. */
        fun sourceFileId(sourceFileId: String?) = sourceFileId(JsonField.ofNullable(sourceFileId))

        /** Alias for calling [Builder.sourceFileId] with `sourceFileId.orElse(null)`. */
        fun sourceFileId(sourceFileId: Optional<String>) = sourceFileId(sourceFileId.getOrNull())

        /**
         * Sets [Builder.sourceFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceFileId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceFileId(sourceFileId: JsonField<String>) = apply {
            this.sourceFileId = sourceFileId
        }

        /** pending until approved or rejected. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** When the review last changed. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [ExtractReview].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .confidenceThreshold()
         * .createdAt()
         * .decidedAt()
         * .decidedBy()
         * .decidedReason()
         * .fieldActions()
         * .fieldsInScope()
         * .flags()
         * .jobId()
         * .openFlags()
         * .originalResult()
         * .requiredFields()
         * .retainUntil()
         * .reviewedResult()
         * .revision()
         * .sourceFileId()
         * .status()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExtractReview =
            ExtractReview(
                checkRequired("id", id),
                checkRequired("confidenceThreshold", confidenceThreshold),
                checkRequired("createdAt", createdAt),
                checkRequired("decidedAt", decidedAt),
                checkRequired("decidedBy", decidedBy),
                checkRequired("decidedReason", decidedReason),
                checkRequired("fieldActions", fieldActions),
                checkRequired("fieldsInScope", fieldsInScope).map { it.toImmutable() },
                checkRequired("flags", flags).map { it.toImmutable() },
                checkRequired("jobId", jobId),
                checkRequired("openFlags", openFlags).map { it.toImmutable() },
                checkRequired("originalResult", originalResult),
                checkRequired("requiredFields", requiredFields).map { it.toImmutable() },
                checkRequired("retainUntil", retainUntil),
                checkRequired("reviewedResult", reviewedResult),
                checkRequired("revision", revision),
                checkRequired("sourceFileId", sourceFileId),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): ExtractReview = apply {
        if (validated) {
            return@apply
        }

        id()
        confidenceThreshold()
        createdAt()
        decidedAt()
        decidedBy()
        decidedReason()
        fieldActions().validate()
        fieldsInScope()
        flags().forEach { it.validate() }
        jobId()
        openFlags()
        originalResult().ifPresent { it.validate() }
        requiredFields()
        retainUntil()
        reviewedResult().validate()
        revision()
        sourceFileId()
        status().validate()
        updatedAt()
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
            (if (confidenceThreshold.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (decidedAt.asKnown().isPresent) 1 else 0) +
            (if (decidedBy.asKnown().isPresent) 1 else 0) +
            (if (decidedReason.asKnown().isPresent) 1 else 0) +
            (fieldActions.asKnown().getOrNull()?.validity() ?: 0) +
            (fieldsInScope.asKnown().getOrNull()?.size ?: 0) +
            (flags.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (jobId.asKnown().isPresent) 1 else 0) +
            (openFlags.asKnown().getOrNull()?.size ?: 0) +
            (originalResult.asKnown().getOrNull()?.validity() ?: 0) +
            (requiredFields.asKnown().getOrNull()?.size ?: 0) +
            (if (retainUntil.asKnown().isPresent) 1 else 0) +
            (reviewedResult.asKnown().getOrNull()?.validity() ?: 0) +
            (if (revision.asKnown().isPresent) 1 else 0) +
            (if (sourceFileId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** The latest action per field, keyed by JSON Pointer. */
    class FieldActions
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

            /** Returns a mutable builder for constructing an instance of [FieldActions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FieldActions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fieldActions: FieldActions) = apply {
                additionalProperties = fieldActions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [FieldActions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FieldActions = FieldActions(additionalProperties.toImmutable())
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
        fun validate(): FieldActions = apply {
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

            return other is FieldActions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FieldActions{additionalProperties=$additionalProperties}"
    }

    /** A field the review asks a person to check. */
    class Flag
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val handled: JsonField<Boolean>,
        private val path: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val cell: JsonField<Cell>,
        private val confidence: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("handled") @ExcludeMissing handled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("cell") @ExcludeMissing cell: JsonField<Cell> = JsonMissing.of(),
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Double> = JsonMissing.of(),
        ) : this(handled, path, reason, cell, confidence, mutableMapOf())

        /**
         * Whether someone confirmed, corrected or cleared it.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun handled(): Boolean = handled.getRequired("handled")

        /**
         * JSON Pointer of the field.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun path(): String = path.getRequired("path")

        /**
         * below_threshold, or required_empty for a required field left empty.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * Where in a list the least confident value is.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cell(): Optional<Cell> = cell.getOptional("cell")

        /**
         * The field's confidence; for a list, its least confident value.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun confidence(): Optional<Double> = confidence.getOptional("confidence")

        /**
         * Returns the raw JSON value of [handled].
         *
         * Unlike [handled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("handled") @ExcludeMissing fun _handled(): JsonField<Boolean> = handled

        /**
         * Returns the raw JSON value of [path].
         *
         * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [cell].
         *
         * Unlike [cell], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cell") @ExcludeMissing fun _cell(): JsonField<Cell> = cell

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Double> = confidence

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
             * Returns a mutable builder for constructing an instance of [Flag].
             *
             * The following fields are required:
             * ```java
             * .handled()
             * .path()
             * .reason()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Flag]. */
        class Builder internal constructor() {

            private var handled: JsonField<Boolean>? = null
            private var path: JsonField<String>? = null
            private var reason: JsonField<Reason>? = null
            private var cell: JsonField<Cell> = JsonMissing.of()
            private var confidence: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(flag: Flag) = apply {
                handled = flag.handled
                path = flag.path
                reason = flag.reason
                cell = flag.cell
                confidence = flag.confidence
                additionalProperties = flag.additionalProperties.toMutableMap()
            }

            /** Whether someone confirmed, corrected or cleared it. */
            fun handled(handled: Boolean) = handled(JsonField.of(handled))

            /**
             * Sets [Builder.handled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.handled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun handled(handled: JsonField<Boolean>) = apply { this.handled = handled }

            /** JSON Pointer of the field. */
            fun path(path: String) = path(JsonField.of(path))

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            /** below_threshold, or required_empty for a required field left empty. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** Where in a list the least confident value is. */
            fun cell(cell: Cell?) = cell(JsonField.ofNullable(cell))

            /** Alias for calling [Builder.cell] with `cell.orElse(null)`. */
            fun cell(cell: Optional<Cell>) = cell(cell.getOrNull())

            /**
             * Sets [Builder.cell] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cell] with a well-typed [Cell] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cell(cell: JsonField<Cell>) = apply { this.cell = cell }

            /** The field's confidence; for a list, its least confident value. */
            fun confidence(confidence: Double?) = confidence(JsonField.ofNullable(confidence))

            /**
             * Alias for [Builder.confidence].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun confidence(confidence: Double) = confidence(confidence as Double?)

            /** Alias for calling [Builder.confidence] with `confidence.orElse(null)`. */
            fun confidence(confidence: Optional<Double>) = confidence(confidence.getOrNull())

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

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
             * Returns an immutable instance of [Flag].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .handled()
             * .path()
             * .reason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Flag =
                Flag(
                    checkRequired("handled", handled),
                    checkRequired("path", path),
                    checkRequired("reason", reason),
                    cell,
                    confidence,
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
        fun validate(): Flag = apply {
            if (validated) {
                return@apply
            }

            handled()
            path()
            reason().validate()
            cell().ifPresent { it.validate() }
            confidence()
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
            (if (handled.asKnown().isPresent) 1 else 0) +
                (if (path.asKnown().isPresent) 1 else 0) +
                (reason.asKnown().getOrNull()?.validity() ?: 0) +
                (cell.asKnown().getOrNull()?.validity() ?: 0) +
                (if (confidence.asKnown().isPresent) 1 else 0)

        /** below_threshold, or required_empty for a required field left empty. */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val BELOW_THRESHOLD = of("below_threshold")

                @JvmField val REQUIRED_EMPTY = of("required_empty")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                BELOW_THRESHOLD,
                REQUIRED_EMPTY,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BELOW_THRESHOLD,
                REQUIRED_EMPTY,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
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
                    BELOW_THRESHOLD -> Value.BELOW_THRESHOLD
                    REQUIRED_EMPTY -> Value.REQUIRED_EMPTY
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
                    BELOW_THRESHOLD -> Known.BELOW_THRESHOLD
                    REQUIRED_EMPTY -> Known.REQUIRED_EMPTY
                    else -> throw LlamaCloudInvalidDataException("Unknown Reason: $value")
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
            fun validate(): Reason = apply {
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

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Where in a list the least confident value is. */
        class Cell
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val row: JsonField<Long>,
            private val column: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("row") @ExcludeMissing row: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("column") @ExcludeMissing column: JsonField<String> = JsonMissing.of(),
            ) : this(row, column, mutableMapOf())

            /**
             * Index of the row, from 0.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun row(): Long = row.getRequired("row")

            /**
             * Property of the row, when rows are objects.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun column(): Optional<String> = column.getOptional("column")

            /**
             * Returns the raw JSON value of [row].
             *
             * Unlike [row], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("row") @ExcludeMissing fun _row(): JsonField<Long> = row

            /**
             * Returns the raw JSON value of [column].
             *
             * Unlike [column], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("column") @ExcludeMissing fun _column(): JsonField<String> = column

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
                 * Returns a mutable builder for constructing an instance of [Cell].
                 *
                 * The following fields are required:
                 * ```java
                 * .row()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Cell]. */
            class Builder internal constructor() {

                private var row: JsonField<Long>? = null
                private var column: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cell: Cell) = apply {
                    row = cell.row
                    column = cell.column
                    additionalProperties = cell.additionalProperties.toMutableMap()
                }

                /** Index of the row, from 0. */
                fun row(row: Long) = row(JsonField.of(row))

                /**
                 * Sets [Builder.row] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.row] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun row(row: JsonField<Long>) = apply { this.row = row }

                /** Property of the row, when rows are objects. */
                fun column(column: String?) = column(JsonField.ofNullable(column))

                /** Alias for calling [Builder.column] with `column.orElse(null)`. */
                fun column(column: Optional<String>) = column(column.getOrNull())

                /**
                 * Sets [Builder.column] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.column] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun column(column: JsonField<String>) = apply { this.column = column }

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
                 * Returns an immutable instance of [Cell].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .row()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Cell =
                    Cell(checkRequired("row", row), column, additionalProperties.toMutableMap())
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
            fun validate(): Cell = apply {
                if (validated) {
                    return@apply
                }

                row()
                column()
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
                (if (row.asKnown().isPresent) 1 else 0) + (if (column.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cell &&
                    row == other.row &&
                    column == other.column &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(row, column, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Cell{row=$row, column=$column, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Flag &&
                handled == other.handled &&
                path == other.path &&
                reason == other.reason &&
                cell == other.cell &&
                confidence == other.confidence &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(handled, path, reason, cell, confidence, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Flag{handled=$handled, path=$path, reason=$reason, cell=$cell, confidence=$confidence, additionalProperties=$additionalProperties}"
    }

    /** The result as the model read it. */
    class OriginalResult
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

            /** Returns a mutable builder for constructing an instance of [OriginalResult]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OriginalResult]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(originalResult: OriginalResult) = apply {
                additionalProperties = originalResult.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OriginalResult].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OriginalResult = OriginalResult(additionalProperties.toImmutable())
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
        fun validate(): OriginalResult = apply {
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

            return other is OriginalResult && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OriginalResult{additionalProperties=$additionalProperties}"
    }

    /** The result with the field actions. */
    class ReviewedResult
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

            /** Returns a mutable builder for constructing an instance of [ReviewedResult]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ReviewedResult]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reviewedResult: ReviewedResult) = apply {
                additionalProperties = reviewedResult.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ReviewedResult].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ReviewedResult = ReviewedResult(additionalProperties.toImmutable())
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
        fun validate(): ReviewedResult = apply {
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

            return other is ReviewedResult && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ReviewedResult{additionalProperties=$additionalProperties}"
    }

    /** pending until approved or rejected. */
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

            @JvmField val APPROVED = of("approved")

            @JvmField val PENDING = of("pending")

            @JvmField val REJECTED = of("rejected")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            APPROVED,
            PENDING,
            REJECTED,
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
            APPROVED,
            PENDING,
            REJECTED,
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
                APPROVED -> Value.APPROVED
                PENDING -> Value.PENDING
                REJECTED -> Value.REJECTED
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
                APPROVED -> Known.APPROVED
                PENDING -> Known.PENDING
                REJECTED -> Known.REJECTED
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

        return other is ExtractReview &&
            id == other.id &&
            confidenceThreshold == other.confidenceThreshold &&
            createdAt == other.createdAt &&
            decidedAt == other.decidedAt &&
            decidedBy == other.decidedBy &&
            decidedReason == other.decidedReason &&
            fieldActions == other.fieldActions &&
            fieldsInScope == other.fieldsInScope &&
            flags == other.flags &&
            jobId == other.jobId &&
            openFlags == other.openFlags &&
            originalResult == other.originalResult &&
            requiredFields == other.requiredFields &&
            retainUntil == other.retainUntil &&
            reviewedResult == other.reviewedResult &&
            revision == other.revision &&
            sourceFileId == other.sourceFileId &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            confidenceThreshold,
            createdAt,
            decidedAt,
            decidedBy,
            decidedReason,
            fieldActions,
            fieldsInScope,
            flags,
            jobId,
            openFlags,
            originalResult,
            requiredFields,
            retainUntil,
            reviewedResult,
            revision,
            sourceFileId,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractReview{id=$id, confidenceThreshold=$confidenceThreshold, createdAt=$createdAt, decidedAt=$decidedAt, decidedBy=$decidedBy, decidedReason=$decidedReason, fieldActions=$fieldActions, fieldsInScope=$fieldsInScope, flags=$flags, jobId=$jobId, openFlags=$openFlags, originalResult=$originalResult, requiredFields=$requiredFields, retainUntil=$retainUntil, reviewedResult=$reviewedResult, revision=$revision, sourceFileId=$sourceFileId, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
