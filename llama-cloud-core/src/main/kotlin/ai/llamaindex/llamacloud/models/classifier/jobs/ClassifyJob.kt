// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.classifier.jobs

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import ai.llamaindex.llamacloud.models.parsing.StatusEnum
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A classify job. */
class ClassifyJob
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val projectId: JsonField<String>,
    private val rules: JsonField<List<ClassifierRule>>,
    private val status: JsonField<StatusEnum>,
    private val userId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val errorMessage: JsonField<String>,
    private val jobRecordId: JsonField<String>,
    private val mode: JsonField<Mode>,
    private val parsingConfiguration: JsonField<ClassifyParsingConfiguration>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rules")
        @ExcludeMissing
        rules: JsonField<List<ClassifierRule>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<StatusEnum> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("job_record_id")
        @ExcludeMissing
        jobRecordId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        @JsonProperty("parsing_configuration")
        @ExcludeMissing
        parsingConfiguration: JsonField<ClassifyParsingConfiguration> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        projectId,
        rules,
        status,
        userId,
        createdAt,
        effectiveAt,
        errorMessage,
        jobRecordId,
        mode,
        parsingConfiguration,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The ID of the project
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * The rules to classify the files
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rules(): List<ClassifierRule> = rules.getRequired("rules")

    /**
     * The status of the classify job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): StatusEnum = status.getRequired("status")

    /**
     * The ID of the user
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

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
     * The job record ID associated with this status, if any.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobRecordId(): Optional<String> = jobRecordId.getOptional("job_record_id")

    /**
     * The classification mode to use
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = mode.getOptional("mode")

    /**
     * The configuration for the parsing job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parsingConfiguration(): Optional<ClassifyParsingConfiguration> =
        parsingConfiguration.getOptional("parsing_configuration")

    /**
     * Update datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [rules].
     *
     * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<ClassifierRule>> = rules

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<StatusEnum> = status

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Returns the raw JSON value of [jobRecordId].
     *
     * Unlike [jobRecordId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_record_id")
    @ExcludeMissing
    fun _jobRecordId(): JsonField<String> = jobRecordId

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

    /**
     * Returns the raw JSON value of [parsingConfiguration].
     *
     * Unlike [parsingConfiguration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parsing_configuration")
    @ExcludeMissing
    fun _parsingConfiguration(): JsonField<ClassifyParsingConfiguration> = parsingConfiguration

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
         * Returns a mutable builder for constructing an instance of [ClassifyJob].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .projectId()
         * .rules()
         * .status()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClassifyJob]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var rules: JsonField<MutableList<ClassifierRule>>? = null
        private var status: JsonField<StatusEnum>? = null
        private var userId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var jobRecordId: JsonField<String> = JsonMissing.of()
        private var mode: JsonField<Mode> = JsonMissing.of()
        private var parsingConfiguration: JsonField<ClassifyParsingConfiguration> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(classifyJob: ClassifyJob) = apply {
            id = classifyJob.id
            projectId = classifyJob.projectId
            rules = classifyJob.rules.map { it.toMutableList() }
            status = classifyJob.status
            userId = classifyJob.userId
            createdAt = classifyJob.createdAt
            effectiveAt = classifyJob.effectiveAt
            errorMessage = classifyJob.errorMessage
            jobRecordId = classifyJob.jobRecordId
            mode = classifyJob.mode
            parsingConfiguration = classifyJob.parsingConfiguration
            updatedAt = classifyJob.updatedAt
            additionalProperties = classifyJob.additionalProperties.toMutableMap()
        }

        /** Unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The ID of the project */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** The rules to classify the files */
        fun rules(rules: List<ClassifierRule>) = rules(JsonField.of(rules))

        /**
         * Sets [Builder.rules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rules] with a well-typed `List<ClassifierRule>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rules(rules: JsonField<List<ClassifierRule>>) = apply {
            this.rules = rules.map { it.toMutableList() }
        }

        /**
         * Adds a single [ClassifierRule] to [rules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRule(rule: ClassifierRule) = apply {
            rules =
                (rules ?: JsonField.of(mutableListOf())).also { checkKnown("rules", it).add(rule) }
        }

        /** The status of the classify job */
        fun status(status: StatusEnum) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [StatusEnum] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<StatusEnum>) = apply { this.status = status }

        /** The ID of the user */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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

        /** The classification mode to use */
        fun mode(mode: Mode) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

        /** The configuration for the parsing job */
        fun parsingConfiguration(parsingConfiguration: ClassifyParsingConfiguration) =
            parsingConfiguration(JsonField.of(parsingConfiguration))

        /**
         * Sets [Builder.parsingConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parsingConfiguration] with a well-typed
         * [ClassifyParsingConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun parsingConfiguration(parsingConfiguration: JsonField<ClassifyParsingConfiguration>) =
            apply {
                this.parsingConfiguration = parsingConfiguration
            }

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
         * Returns an immutable instance of [ClassifyJob].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .projectId()
         * .rules()
         * .status()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClassifyJob =
            ClassifyJob(
                checkRequired("id", id),
                checkRequired("projectId", projectId),
                checkRequired("rules", rules).map { it.toImmutable() },
                checkRequired("status", status),
                checkRequired("userId", userId),
                createdAt,
                effectiveAt,
                errorMessage,
                jobRecordId,
                mode,
                parsingConfiguration,
                updatedAt,
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
    fun validate(): ClassifyJob = apply {
        if (validated) {
            return@apply
        }

        id()
        projectId()
        rules().forEach { it.validate() }
        status().validate()
        userId()
        createdAt()
        effectiveAt()
        errorMessage()
        jobRecordId()
        mode().ifPresent { it.validate() }
        parsingConfiguration().ifPresent { it.validate() }
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
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (effectiveAt.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (jobRecordId.asKnown().isPresent) 1 else 0) +
            (mode.asKnown().getOrNull()?.validity() ?: 0) +
            (parsingConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** The classification mode to use */
    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FAST = of("FAST")

            @JvmField val MULTIMODAL = of("MULTIMODAL")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            FAST,
            MULTIMODAL,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAST,
            MULTIMODAL,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                FAST -> Value.FAST
                MULTIMODAL -> Value.MULTIMODAL
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
                FAST -> Known.FAST
                MULTIMODAL -> Known.MULTIMODAL
                else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
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
        fun validate(): Mode = apply {
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClassifyJob &&
            id == other.id &&
            projectId == other.projectId &&
            rules == other.rules &&
            status == other.status &&
            userId == other.userId &&
            createdAt == other.createdAt &&
            effectiveAt == other.effectiveAt &&
            errorMessage == other.errorMessage &&
            jobRecordId == other.jobRecordId &&
            mode == other.mode &&
            parsingConfiguration == other.parsingConfiguration &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            projectId,
            rules,
            status,
            userId,
            createdAt,
            effectiveAt,
            errorMessage,
            jobRecordId,
            mode,
            parsingConfiguration,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClassifyJob{id=$id, projectId=$projectId, rules=$rules, status=$status, userId=$userId, createdAt=$createdAt, effectiveAt=$effectiveAt, errorMessage=$errorMessage, jobRecordId=$jobRecordId, mode=$mode, parsingConfiguration=$parsingConfiguration, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
