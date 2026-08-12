// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.split

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import ai.llamaindex.llamacloud.models.beta.split.SplitCategory
import ai.llamaindex.llamacloud.models.beta.split.SplitResultResponse
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A split job. */
class SplitCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val categories: JsonField<List<SplitCategory>>,
    private val documentInputType: JsonField<DocumentInputType>,
    private val fileInput: JsonField<String>,
    private val projectId: JsonField<String>,
    private val status: JsonField<String>,
    private val userId: JsonField<String>,
    private val configurationId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val errorMessage: JsonField<String>,
    private val result: JsonField<SplitResultResponse>,
    private val splittingStrategy: JsonField<SplittingStrategy>,
    private val transactionId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<List<SplitCategory>> = JsonMissing.of(),
        @JsonProperty("document_input_type")
        @ExcludeMissing
        documentInputType: JsonField<DocumentInputType> = JsonMissing.of(),
        @JsonProperty("file_input") @ExcludeMissing fileInput: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<SplitResultResponse> = JsonMissing.of(),
        @JsonProperty("splitting_strategy")
        @ExcludeMissing
        splittingStrategy: JsonField<SplittingStrategy> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        categories,
        documentInputType,
        fileInput,
        projectId,
        status,
        userId,
        configurationId,
        createdAt,
        errorMessage,
        result,
        splittingStrategy,
        transactionId,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the split job.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Categories used for splitting.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun categories(): List<SplitCategory> = categories.getRequired("categories")

    /**
     * Whether the input was a file or parse job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentInputType(): DocumentInputType =
        documentInputType.getRequired("document_input_type")

    /**
     * File ID or parse job ID
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileInput(): String = fileInput.getRequired("file_input")

    /**
     * Project this job belongs to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * Current job status. Valid values are: pending, processing, completed, failed, cancelled.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * User who created this job.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * Split configuration ID used for this job.
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
     * Error message if the job failed.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * Result of a completed split job.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<SplitResultResponse> = result.getOptional("result")

    /**
     * Strategy used for splitting.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun splittingStrategy(): Optional<SplittingStrategy> =
        splittingStrategy.getOptional("splitting_strategy")

    /**
     * Idempotency key scoped to the project, if one was provided.
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
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<List<SplitCategory>> = categories

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<SplitResultResponse> = result

    /**
     * Returns the raw JSON value of [splittingStrategy].
     *
     * Unlike [splittingStrategy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("splitting_strategy")
    @ExcludeMissing
    fun _splittingStrategy(): JsonField<SplittingStrategy> = splittingStrategy

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
         * Returns a mutable builder for constructing an instance of [SplitCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .categories()
         * .documentInputType()
         * .fileInput()
         * .projectId()
         * .status()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SplitCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var categories: JsonField<MutableList<SplitCategory>>? = null
        private var documentInputType: JsonField<DocumentInputType>? = null
        private var fileInput: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var status: JsonField<String>? = null
        private var userId: JsonField<String>? = null
        private var configurationId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var result: JsonField<SplitResultResponse> = JsonMissing.of()
        private var splittingStrategy: JsonField<SplittingStrategy> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(splitCreateResponse: SplitCreateResponse) = apply {
            id = splitCreateResponse.id
            categories = splitCreateResponse.categories.map { it.toMutableList() }
            documentInputType = splitCreateResponse.documentInputType
            fileInput = splitCreateResponse.fileInput
            projectId = splitCreateResponse.projectId
            status = splitCreateResponse.status
            userId = splitCreateResponse.userId
            configurationId = splitCreateResponse.configurationId
            createdAt = splitCreateResponse.createdAt
            errorMessage = splitCreateResponse.errorMessage
            result = splitCreateResponse.result
            splittingStrategy = splitCreateResponse.splittingStrategy
            transactionId = splitCreateResponse.transactionId
            updatedAt = splitCreateResponse.updatedAt
            additionalProperties = splitCreateResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the split job. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Categories used for splitting. */
        fun categories(categories: List<SplitCategory>) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed `List<SplitCategory>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun categories(categories: JsonField<List<SplitCategory>>) = apply {
            this.categories = categories.map { it.toMutableList() }
        }

        /**
         * Adds a single [SplitCategory] to [categories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: SplitCategory) = apply {
            categories =
                (categories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("categories", it).add(category)
                }
        }

        /** Whether the input was a file or parse job */
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

        /** File ID or parse job ID */
        fun fileInput(fileInput: String) = fileInput(JsonField.of(fileInput))

        /**
         * Sets [Builder.fileInput] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileInput] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fileInput(fileInput: JsonField<String>) = apply { this.fileInput = fileInput }

        /** Project this job belongs to. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /**
         * Current job status. Valid values are: pending, processing, completed, failed, cancelled.
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** User who created this job. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Split configuration ID used for this job. */
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

        /** Error message if the job failed. */
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

        /** Result of a completed split job. */
        fun result(result: SplitResultResponse?) = result(JsonField.ofNullable(result))

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<SplitResultResponse>) = result(result.getOrNull())

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [SplitResultResponse] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun result(result: JsonField<SplitResultResponse>) = apply { this.result = result }

        /** Strategy used for splitting. */
        fun splittingStrategy(splittingStrategy: SplittingStrategy) =
            splittingStrategy(JsonField.of(splittingStrategy))

        /**
         * Sets [Builder.splittingStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.splittingStrategy] with a well-typed [SplittingStrategy]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun splittingStrategy(splittingStrategy: JsonField<SplittingStrategy>) = apply {
            this.splittingStrategy = splittingStrategy
        }

        /** Idempotency key scoped to the project, if one was provided. */
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
         * Returns an immutable instance of [SplitCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .categories()
         * .documentInputType()
         * .fileInput()
         * .projectId()
         * .status()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SplitCreateResponse =
            SplitCreateResponse(
                checkRequired("id", id),
                checkRequired("categories", categories).map { it.toImmutable() },
                checkRequired("documentInputType", documentInputType),
                checkRequired("fileInput", fileInput),
                checkRequired("projectId", projectId),
                checkRequired("status", status),
                checkRequired("userId", userId),
                configurationId,
                createdAt,
                errorMessage,
                result,
                splittingStrategy,
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
    fun validate(): SplitCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        categories().forEach { it.validate() }
        documentInputType().validate()
        fileInput()
        projectId()
        status()
        userId()
        configurationId()
        createdAt()
        errorMessage()
        result().ifPresent { it.validate() }
        splittingStrategy().ifPresent { it.validate() }
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
            (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (documentInputType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fileInput.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (configurationId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (splittingStrategy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Whether the input was a file or parse job */
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

            @JvmField val FILE_ID = of("file_id")

            @JvmField val PARSE_JOB_ID = of("parse_job_id")

            @JvmField val URL = of("url")

            @JvmStatic fun of(value: String) = DocumentInputType(JsonField.of(value))
        }

        /** An enum containing [DocumentInputType]'s known values. */
        enum class Known {
            FILE_ID,
            PARSE_JOB_ID,
            URL,
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
            FILE_ID,
            PARSE_JOB_ID,
            URL,
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
                FILE_ID -> Value.FILE_ID
                PARSE_JOB_ID -> Value.PARSE_JOB_ID
                URL -> Value.URL
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
                FILE_ID -> Known.FILE_ID
                PARSE_JOB_ID -> Known.PARSE_JOB_ID
                URL -> Known.URL
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

    /** Strategy used for splitting. */
    class SplittingStrategy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowUncategorized: JsonField<AllowUncategorized>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allow_uncategorized")
            @ExcludeMissing
            allowUncategorized: JsonField<AllowUncategorized> = JsonMissing.of()
        ) : this(allowUncategorized, mutableMapOf())

        /**
         * Controls handling of pages that don't match any category. 'include': pages can be grouped
         * as 'uncategorized' and included in results. 'forbid': all pages must be assigned to a
         * defined category. 'omit': pages can be classified as 'uncategorized' but are excluded
         * from results.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun allowUncategorized(): Optional<AllowUncategorized> =
            allowUncategorized.getOptional("allow_uncategorized")

        /**
         * Returns the raw JSON value of [allowUncategorized].
         *
         * Unlike [allowUncategorized], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_uncategorized")
        @ExcludeMissing
        fun _allowUncategorized(): JsonField<AllowUncategorized> = allowUncategorized

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

            /** Returns a mutable builder for constructing an instance of [SplittingStrategy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SplittingStrategy]. */
        class Builder internal constructor() {

            private var allowUncategorized: JsonField<AllowUncategorized> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(splittingStrategy: SplittingStrategy) = apply {
                allowUncategorized = splittingStrategy.allowUncategorized
                additionalProperties = splittingStrategy.additionalProperties.toMutableMap()
            }

            /**
             * Controls handling of pages that don't match any category. 'include': pages can be
             * grouped as 'uncategorized' and included in results. 'forbid': all pages must be
             * assigned to a defined category. 'omit': pages can be classified as 'uncategorized'
             * but are excluded from results.
             */
            fun allowUncategorized(allowUncategorized: AllowUncategorized) =
                allowUncategorized(JsonField.of(allowUncategorized))

            /**
             * Sets [Builder.allowUncategorized] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowUncategorized] with a well-typed
             * [AllowUncategorized] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allowUncategorized(allowUncategorized: JsonField<AllowUncategorized>) = apply {
                this.allowUncategorized = allowUncategorized
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
             * Returns an immutable instance of [SplittingStrategy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SplittingStrategy =
                SplittingStrategy(allowUncategorized, additionalProperties.toMutableMap())
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
        fun validate(): SplittingStrategy = apply {
            if (validated) {
                return@apply
            }

            allowUncategorized().ifPresent { it.validate() }
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
        internal fun validity(): Int = (allowUncategorized.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Controls handling of pages that don't match any category. 'include': pages can be grouped
         * as 'uncategorized' and included in results. 'forbid': all pages must be assigned to a
         * defined category. 'omit': pages can be classified as 'uncategorized' but are excluded
         * from results.
         */
        class AllowUncategorized
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val FORBID = of("forbid")

                @JvmField val INCLUDE = of("include")

                @JvmField val OMIT = of("omit")

                @JvmStatic fun of(value: String) = AllowUncategorized(JsonField.of(value))
            }

            /** An enum containing [AllowUncategorized]'s known values. */
            enum class Known {
                FORBID,
                INCLUDE,
                OMIT,
            }

            /**
             * An enum containing [AllowUncategorized]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AllowUncategorized] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FORBID,
                INCLUDE,
                OMIT,
                /**
                 * An enum member indicating that [AllowUncategorized] was instantiated with an
                 * unknown value.
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
                    FORBID -> Value.FORBID
                    INCLUDE -> Value.INCLUDE
                    OMIT -> Value.OMIT
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
                    FORBID -> Known.FORBID
                    INCLUDE -> Known.INCLUDE
                    OMIT -> Known.OMIT
                    else ->
                        throw LlamaCloudInvalidDataException("Unknown AllowUncategorized: $value")
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
            fun validate(): AllowUncategorized = apply {
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

                return other is AllowUncategorized && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SplittingStrategy &&
                allowUncategorized == other.allowUncategorized &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(allowUncategorized, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SplittingStrategy{allowUncategorized=$allowUncategorized, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SplitCreateResponse &&
            id == other.id &&
            categories == other.categories &&
            documentInputType == other.documentInputType &&
            fileInput == other.fileInput &&
            projectId == other.projectId &&
            status == other.status &&
            userId == other.userId &&
            configurationId == other.configurationId &&
            createdAt == other.createdAt &&
            errorMessage == other.errorMessage &&
            result == other.result &&
            splittingStrategy == other.splittingStrategy &&
            transactionId == other.transactionId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            categories,
            documentInputType,
            fileInput,
            projectId,
            status,
            userId,
            configurationId,
            createdAt,
            errorMessage,
            result,
            splittingStrategy,
            transactionId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SplitCreateResponse{id=$id, categories=$categories, documentInputType=$documentInputType, fileInput=$fileInput, projectId=$projectId, status=$status, userId=$userId, configurationId=$configurationId, createdAt=$createdAt, errorMessage=$errorMessage, result=$result, splittingStrategy=$splittingStrategy, transactionId=$transactionId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
