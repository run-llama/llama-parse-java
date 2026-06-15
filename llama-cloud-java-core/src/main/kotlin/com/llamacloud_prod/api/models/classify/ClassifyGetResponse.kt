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
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response for a classify job. */
class ClassifyGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val configuration: JsonField<ClassifyConfiguration>,
    private val documentInputType: JsonField<DocumentInputType>,
    private val fileInput: JsonField<String>,
    private val projectId: JsonField<String>,
    private val status: JsonField<Status>,
    private val userId: JsonField<String>,
    private val configurationId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val errorMessage: JsonField<String>,
    private val parseJobId: JsonField<String>,
    private val result: JsonField<ClassifyResult>,
    private val transactionId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        configuration: JsonField<ClassifyConfiguration> = JsonMissing.of(),
        @JsonProperty("document_input_type")
        @ExcludeMissing
        documentInputType: JsonField<DocumentInputType> = JsonMissing.of(),
        @JsonProperty("file_input") @ExcludeMissing fileInput: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("configuration_id")
        @ExcludeMissing
        configurationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parse_job_id")
        @ExcludeMissing
        parseJobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<ClassifyResult> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        configuration,
        documentInputType,
        fileInput,
        projectId,
        status,
        userId,
        configurationId,
        createdAt,
        errorMessage,
        parseJobId,
        result,
        transactionId,
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
     * Classify configuration used for this job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configuration(): ClassifyConfiguration = configuration.getRequired("configuration")

    /**
     * Whether the input was a file or parse job (FILE or PARSE_JOB)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentInputType(): DocumentInputType =
        documentInputType.getRequired("document_input_type")

    /**
     * ID of the input file or parse job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileInput(): String = fileInput.getRequired("file_input")

    /**
     * Project this job belongs to
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * Current job status: PENDING, RUNNING, COMPLETED, or FAILED
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * User who created this job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * Product configuration ID
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configurationId(): Optional<String> = configurationId.getOptional("configuration_id")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Error message if job failed
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * Associated parse job ID
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parseJobId(): Optional<String> = parseJobId.getOptional("parse_job_id")

    /**
     * Result of classifying a document.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<ClassifyResult> = result.getOptional("result")

    /**
     * Idempotency key
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

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
     * Returns the raw JSON value of [configuration].
     *
     * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration")
    @ExcludeMissing
    fun _configuration(): JsonField<ClassifyConfiguration> = configuration

    /**
     * Returns the raw JSON value of [documentInputType].
     *
     * Unlike [documentInputType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("document_input_type")
    @ExcludeMissing
    fun _documentInputType(): JsonField<DocumentInputType> = documentInputType

    /**
     * Returns the raw JSON value of [fileInput].
     *
     * Unlike [fileInput], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_input") @ExcludeMissing fun _fileInput(): JsonField<String> = fileInput

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
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [configurationId].
     *
     * Unlike [configurationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration_id")
    @ExcludeMissing
    fun _configurationId(): JsonField<String> = configurationId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [parseJobId].
     *
     * Unlike [parseJobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parse_job_id") @ExcludeMissing fun _parseJobId(): JsonField<String> = parseJobId

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<ClassifyResult> = result

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

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
         * Returns a mutable builder for constructing an instance of [ClassifyGetResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .configuration()
         * .documentInputType()
         * .fileInput()
         * .projectId()
         * .status()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClassifyGetResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var configuration: JsonField<ClassifyConfiguration>? = null
        private var documentInputType: JsonField<DocumentInputType>? = null
        private var fileInput: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var userId: JsonField<String>? = null
        private var configurationId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var parseJobId: JsonField<String> = JsonMissing.of()
        private var result: JsonField<ClassifyResult> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(classifyGetResponse: ClassifyGetResponse) = apply {
            id = classifyGetResponse.id
            configuration = classifyGetResponse.configuration
            documentInputType = classifyGetResponse.documentInputType
            fileInput = classifyGetResponse.fileInput
            projectId = classifyGetResponse.projectId
            status = classifyGetResponse.status
            userId = classifyGetResponse.userId
            configurationId = classifyGetResponse.configurationId
            createdAt = classifyGetResponse.createdAt
            errorMessage = classifyGetResponse.errorMessage
            parseJobId = classifyGetResponse.parseJobId
            result = classifyGetResponse.result
            transactionId = classifyGetResponse.transactionId
            updatedAt = classifyGetResponse.updatedAt
            additionalProperties = classifyGetResponse.additionalProperties.toMutableMap()
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

        /** Classify configuration used for this job */
        fun configuration(configuration: ClassifyConfiguration) =
            configuration(JsonField.of(configuration))

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

        /** Whether the input was a file or parse job (FILE or PARSE_JOB) */
        fun documentInputType(documentInputType: DocumentInputType) =
            documentInputType(JsonField.of(documentInputType))

        /**
         * Sets [Builder.documentInputType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentInputType] with a well-typed [DocumentInputType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentInputType(documentInputType: JsonField<DocumentInputType>) = apply {
            this.documentInputType = documentInputType
        }

        /** ID of the input file or parse job */
        fun fileInput(fileInput: String) = fileInput(JsonField.of(fileInput))

        /**
         * Sets [Builder.fileInput] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileInput] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fileInput(fileInput: JsonField<String>) = apply { this.fileInput = fileInput }

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

        /** Current job status: PENDING, RUNNING, COMPLETED, or FAILED */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** User who created this job */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Product configuration ID */
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

        /** Error message if job failed */
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

        /** Associated parse job ID */
        fun parseJobId(parseJobId: String?) = parseJobId(JsonField.ofNullable(parseJobId))

        /** Alias for calling [Builder.parseJobId] with `parseJobId.orElse(null)`. */
        fun parseJobId(parseJobId: Optional<String>) = parseJobId(parseJobId.getOrNull())

        /**
         * Sets [Builder.parseJobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parseJobId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parseJobId(parseJobId: JsonField<String>) = apply { this.parseJobId = parseJobId }

        /** Result of classifying a document. */
        fun result(result: ClassifyResult?) = result(JsonField.ofNullable(result))

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<ClassifyResult>) = result(result.getOrNull())

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [ClassifyResult] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun result(result: JsonField<ClassifyResult>) = apply { this.result = result }

        /** Idempotency key */
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
         * Returns an immutable instance of [ClassifyGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .configuration()
         * .documentInputType()
         * .fileInput()
         * .projectId()
         * .status()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClassifyGetResponse =
            ClassifyGetResponse(
                checkRequired("id", id),
                checkRequired("configuration", configuration),
                checkRequired("documentInputType", documentInputType),
                checkRequired("fileInput", fileInput),
                checkRequired("projectId", projectId),
                checkRequired("status", status),
                checkRequired("userId", userId),
                configurationId,
                createdAt,
                errorMessage,
                parseJobId,
                result,
                transactionId,
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
    fun validate(): ClassifyGetResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        configuration().validate()
        documentInputType().validate()
        fileInput()
        projectId()
        status().validate()
        userId()
        configurationId()
        createdAt()
        errorMessage()
        parseJobId()
        result().ifPresent { it.validate() }
        transactionId()
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
            (configuration.asKnown().getOrNull()?.validity() ?: 0) +
            (documentInputType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fileInput.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (configurationId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (parseJobId.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Whether the input was a file or parse job (FILE or PARSE_JOB) */
    class DocumentInputType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val URL = of("url")

            @JvmField val FILE_ID = of("file_id")

            @JvmField val PARSE_JOB_ID = of("parse_job_id")

            @JvmStatic fun of(value: String) = DocumentInputType(JsonField.of(value))
        }

        /** An enum containing [DocumentInputType]'s known values. */
        enum class Known {
            URL,
            FILE_ID,
            PARSE_JOB_ID,
        }

        /**
         * An enum containing [DocumentInputType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocumentInputType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            URL,
            FILE_ID,
            PARSE_JOB_ID,
            /**
             * An enum member indicating that [DocumentInputType] was instantiated with an unknown
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
                URL -> Value.URL
                FILE_ID -> Value.FILE_ID
                PARSE_JOB_ID -> Value.PARSE_JOB_ID
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
                URL -> Known.URL
                FILE_ID -> Known.FILE_ID
                PARSE_JOB_ID -> Known.PARSE_JOB_ID
                else -> throw LlamaCloudInvalidDataException("Unknown DocumentInputType: $value")
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
        fun validate(): DocumentInputType = apply {
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

            return other is DocumentInputType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Current job status: PENDING, RUNNING, COMPLETED, or FAILED */
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

            @JvmField val PENDING = of("PENDING")

            @JvmField val RUNNING = of("RUNNING")

            @JvmField val COMPLETED = of("COMPLETED")

            @JvmField val FAILED = of("FAILED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            RUNNING,
            COMPLETED,
            FAILED,
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
            COMPLETED,
            FAILED,
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
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
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
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
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

        return other is ClassifyGetResponse &&
            id == other.id &&
            configuration == other.configuration &&
            documentInputType == other.documentInputType &&
            fileInput == other.fileInput &&
            projectId == other.projectId &&
            status == other.status &&
            userId == other.userId &&
            configurationId == other.configurationId &&
            createdAt == other.createdAt &&
            errorMessage == other.errorMessage &&
            parseJobId == other.parseJobId &&
            result == other.result &&
            transactionId == other.transactionId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            configuration,
            documentInputType,
            fileInput,
            projectId,
            status,
            userId,
            configurationId,
            createdAt,
            errorMessage,
            parseJobId,
            result,
            transactionId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClassifyGetResponse{id=$id, configuration=$configuration, documentInputType=$documentInputType, fileInput=$fileInput, projectId=$projectId, status=$status, userId=$userId, configurationId=$configurationId, createdAt=$createdAt, errorMessage=$errorMessage, parseJobId=$parseJobId, result=$result, transactionId=$transactionId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
