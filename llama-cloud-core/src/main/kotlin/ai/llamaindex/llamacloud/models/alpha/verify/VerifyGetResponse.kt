// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.alpha.verify

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

/** Response for a Verify job. */
class VerifyGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val configuration: JsonField<Configuration>,
    private val documentInputType: JsonField<DocumentInputType>,
    private val fileInput: JsonField<String>,
    private val projectId: JsonField<String>,
    private val status: JsonField<Status>,
    private val userId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val errorMessage: JsonField<String>,
    private val result: JsonField<Result>,
    private val transactionId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        configuration: JsonField<Configuration> = JsonMissing.of(),
        @JsonProperty("document_input_type")
        @ExcludeMissing
        documentInputType: JsonField<DocumentInputType> = JsonMissing.of(),
        @JsonProperty("file_input") @ExcludeMissing fileInput: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
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
        createdAt,
        errorMessage,
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
     * Verify configuration used for this job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configuration(): Configuration = configuration.getRequired("configuration")

    /**
     * Type of the document input (FILE)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentInputType(): DocumentInputType =
        documentInputType.getRequired("document_input_type")

    /**
     * ID of the input file
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
     * Current job status: PENDING, RUNNING, COMPLETED, FAILED, or CANCELLED
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
     * Result of a Verify (doctored-document) analysis.
     *
     * Raw per-signal detail (evidence list, per-family sub-scores, raw regions, forensic heatmaps)
     * is available separately via the job's details endpoint.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<Result> = result.getOptional("result")

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
    fun _configuration(): JsonField<Configuration> = configuration

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
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

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
         * Returns a mutable builder for constructing an instance of [VerifyGetResponse].
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

    /** A builder for [VerifyGetResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var configuration: JsonField<Configuration>? = null
        private var documentInputType: JsonField<DocumentInputType>? = null
        private var fileInput: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var userId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(verifyGetResponse: VerifyGetResponse) = apply {
            id = verifyGetResponse.id
            configuration = verifyGetResponse.configuration
            documentInputType = verifyGetResponse.documentInputType
            fileInput = verifyGetResponse.fileInput
            projectId = verifyGetResponse.projectId
            status = verifyGetResponse.status
            userId = verifyGetResponse.userId
            createdAt = verifyGetResponse.createdAt
            errorMessage = verifyGetResponse.errorMessage
            result = verifyGetResponse.result
            transactionId = verifyGetResponse.transactionId
            updatedAt = verifyGetResponse.updatedAt
            additionalProperties = verifyGetResponse.additionalProperties.toMutableMap()
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

        /** Verify configuration used for this job */
        fun configuration(configuration: Configuration) = configuration(JsonField.of(configuration))

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed [Configuration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configuration(configuration: JsonField<Configuration>) = apply {
            this.configuration = configuration
        }

        /** Type of the document input (FILE) */
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

        /** ID of the input file */
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

        /** Current job status: PENDING, RUNNING, COMPLETED, FAILED, or CANCELLED */
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

        /**
         * Result of a Verify (doctored-document) analysis.
         *
         * Raw per-signal detail (evidence list, per-family sub-scores, raw regions, forensic
         * heatmaps) is available separately via the job's details endpoint.
         */
        fun result(result: Result?) = result(JsonField.ofNullable(result))

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<Result>) = result(result.getOrNull())

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

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
         * Returns an immutable instance of [VerifyGetResponse].
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
        fun build(): VerifyGetResponse =
            VerifyGetResponse(
                checkRequired("id", id),
                checkRequired("configuration", configuration),
                checkRequired("documentInputType", documentInputType),
                checkRequired("fileInput", fileInput),
                checkRequired("projectId", projectId),
                checkRequired("status", status),
                checkRequired("userId", userId),
                createdAt,
                errorMessage,
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
    fun validate(): VerifyGetResponse = apply {
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
        createdAt()
        errorMessage()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Verify configuration used for this job */
    class Configuration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val targetPages: JsonField<String>,
        private val tier: JsonField<Tier>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("target_pages")
            @ExcludeMissing
            targetPages: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tier") @ExcludeMissing tier: JsonField<Tier> = JsonMissing.of(),
        ) : this(targetPages, tier, mutableMapOf())

        /**
         * Comma-separated page numbers or ranges to analyze (1-based). Omit to analyze all pages.
         * Ignored for non-PDF inputs.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun targetPages(): Optional<String> = targetPages.getOptional("target_pages")

        /**
         * Verify tier: 'fast' runs only the quick deterministic forensic checks (metadata, content
         * integrity, container structure, pixel statistics); 'agentic' (default) runs the full
         * pipeline including the learned detectors and the semantic review pass.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tier(): Optional<Tier> = tier.getOptional("tier")

        /**
         * Returns the raw JSON value of [targetPages].
         *
         * Unlike [targetPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target_pages")
        @ExcludeMissing
        fun _targetPages(): JsonField<String> = targetPages

        /**
         * Returns the raw JSON value of [tier].
         *
         * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Tier> = tier

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

            /** Returns a mutable builder for constructing an instance of [Configuration]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Configuration]. */
        class Builder internal constructor() {

            private var targetPages: JsonField<String> = JsonMissing.of()
            private var tier: JsonField<Tier> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configuration: Configuration) = apply {
                targetPages = configuration.targetPages
                tier = configuration.tier
                additionalProperties = configuration.additionalProperties.toMutableMap()
            }

            /**
             * Comma-separated page numbers or ranges to analyze (1-based). Omit to analyze all
             * pages. Ignored for non-PDF inputs.
             */
            fun targetPages(targetPages: String?) = targetPages(JsonField.ofNullable(targetPages))

            /** Alias for calling [Builder.targetPages] with `targetPages.orElse(null)`. */
            fun targetPages(targetPages: Optional<String>) = targetPages(targetPages.getOrNull())

            /**
             * Sets [Builder.targetPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetPages] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetPages(targetPages: JsonField<String>) = apply {
                this.targetPages = targetPages
            }

            /**
             * Verify tier: 'fast' runs only the quick deterministic forensic checks (metadata,
             * content integrity, container structure, pixel statistics); 'agentic' (default) runs
             * the full pipeline including the learned detectors and the semantic review pass.
             */
            fun tier(tier: Tier) = tier(JsonField.of(tier))

            /**
             * Sets [Builder.tier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tier] with a well-typed [Tier] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tier(tier: JsonField<Tier>) = apply { this.tier = tier }

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
             * Returns an immutable instance of [Configuration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Configuration =
                Configuration(targetPages, tier, additionalProperties.toMutableMap())
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
        fun validate(): Configuration = apply {
            if (validated) {
                return@apply
            }

            targetPages()
            tier().ifPresent { it.validate() }
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
            (if (targetPages.asKnown().isPresent) 1 else 0) +
                (tier.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Verify tier: 'fast' runs only the quick deterministic forensic checks (metadata, content
         * integrity, container structure, pixel statistics); 'agentic' (default) runs the full
         * pipeline including the learned detectors and the semantic review pass.
         */
        class Tier @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val AGENTIC = of("agentic")

                @JvmField val FAST = of("fast")

                @JvmStatic fun of(value: String) = Tier(JsonField.of(value))
            }

            /** An enum containing [Tier]'s known values. */
            enum class Known {
                AGENTIC,
                FAST,
            }

            /**
             * An enum containing [Tier]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Tier] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AGENTIC,
                FAST,
                /** An enum member indicating that [Tier] was instantiated with an unknown value. */
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
                    AGENTIC -> Value.AGENTIC
                    FAST -> Value.FAST
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
                    AGENTIC -> Known.AGENTIC
                    FAST -> Known.FAST
                    else -> throw LlamaCloudInvalidDataException("Unknown Tier: $value")
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
            fun validate(): Tier = apply {
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

                return other is Tier && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Configuration &&
                targetPages == other.targetPages &&
                tier == other.tier &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(targetPages, tier, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Configuration{targetPages=$targetPages, tier=$tier, additionalProperties=$additionalProperties}"
    }

    /** Type of the document input (FILE) */
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

    /** Current job status: PENDING, RUNNING, COMPLETED, FAILED, or CANCELLED */
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

            @JvmField val COMPLETED = of("COMPLETED")

            @JvmField val FAILED = of("FAILED")

            @JvmField val PENDING = of("PENDING")

            @JvmField val RUNNING = of("RUNNING")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            COMPLETED,
            FAILED,
            PENDING,
            RUNNING,
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
            RUNNING,
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
                RUNNING -> Value.RUNNING
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
                RUNNING -> Known.RUNNING
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

    /**
     * Result of a Verify (doctored-document) analysis.
     *
     * Raw per-signal detail (evidence list, per-family sub-scores, raw regions, forensic heatmaps)
     * is available separately via the job's details endpoint.
     */
    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val detectorVersion: JsonField<String>,
        private val overallScore: JsonField<Double>,
        private val verdict: JsonField<Verdict>,
        private val compositeScores: JsonField<CompositeScores>,
        private val confidence: JsonField<Double>,
        private val error: JsonField<String>,
        private val pageCount: JsonField<Long>,
        private val pageDimensions: JsonField<List<PageDimension>>,
        private val reasoning: JsonField<String>,
        private val suspectRegions: JsonField<List<SuspectRegion>>,
        private val syntheticScore: JsonField<Double>,
        private val tamperingScore: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("detector_version")
            @ExcludeMissing
            detectorVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overall_score")
            @ExcludeMissing
            overallScore: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("verdict") @ExcludeMissing verdict: JsonField<Verdict> = JsonMissing.of(),
            @JsonProperty("composite_scores")
            @ExcludeMissing
            compositeScores: JsonField<CompositeScores> = JsonMissing.of(),
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page_count")
            @ExcludeMissing
            pageCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_dimensions")
            @ExcludeMissing
            pageDimensions: JsonField<List<PageDimension>> = JsonMissing.of(),
            @JsonProperty("reasoning")
            @ExcludeMissing
            reasoning: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suspect_regions")
            @ExcludeMissing
            suspectRegions: JsonField<List<SuspectRegion>> = JsonMissing.of(),
            @JsonProperty("synthetic_score")
            @ExcludeMissing
            syntheticScore: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tampering_score")
            @ExcludeMissing
            tamperingScore: JsonField<Double> = JsonMissing.of(),
        ) : this(
            detectorVersion,
            overallScore,
            verdict,
            compositeScores,
            confidence,
            error,
            pageCount,
            pageDimensions,
            reasoning,
            suspectRegions,
            syntheticScore,
            tamperingScore,
            mutableMapOf(),
        )

        /**
         * Version of the detector that produced the result
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun detectorVersion(): String = detectorVersion.getRequired("detector_version")

        /**
         * Overall doctoring likelihood (0 to 1)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun overallScore(): Double = overallScore.getRequired("overall_score")

        /**
         * Overall verdict for the document
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun verdict(): Verdict = verdict.getRequired("verdict")

        /**
         * Composite scores, each answering one question about the document
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun compositeScores(): Optional<CompositeScores> =
            compositeScores.getOptional("composite_scores")

        /**
         * Confidence in the verdict (0 to 1): how firmly the detected signals support the verdict
         * bucket, independent of the doctoring likelihood itself
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun confidence(): Optional<Double> = confidence.getOptional("confidence")

        /**
         * Error detail when the analysis could not complete
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * Number of analysed pages (1 for images/docx)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageCount(): Optional<Long> = pageCount.getOptional("page_count")

        /**
         * Rendered pixel size per page, so region bboxes can be scaled onto the page
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageDimensions(): Optional<List<PageDimension>> =
            pageDimensions.getOptional("page_dimensions")

        /**
         * Explanation of the verdict
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reasoning(): Optional<String> = reasoning.getOptional("reasoning")

        /**
         * Regions that led to the suspected fraud, ranked most-suspect first, each with an
         * explanation of what makes it suspect
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun suspectRegions(): Optional<List<SuspectRegion>> =
            suspectRegions.getOptional("suspect_regions")

        /**
         * Likelihood (0 to 1) that the document is wholly generated or fabricated rather than a
         * capture of a real document. Null for jobs completed before this score was introduced
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun syntheticScore(): Optional<Double> = syntheticScore.getOptional("synthetic_score")

        /**
         * Likelihood (0 to 1) that a real captured document was locally edited — a genuine capture
         * with regions altered after the fact. Null for jobs completed before this score was
         * introduced
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tamperingScore(): Optional<Double> = tamperingScore.getOptional("tampering_score")

        /**
         * Returns the raw JSON value of [detectorVersion].
         *
         * Unlike [detectorVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("detector_version")
        @ExcludeMissing
        fun _detectorVersion(): JsonField<String> = detectorVersion

        /**
         * Returns the raw JSON value of [overallScore].
         *
         * Unlike [overallScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overall_score")
        @ExcludeMissing
        fun _overallScore(): JsonField<Double> = overallScore

        /**
         * Returns the raw JSON value of [verdict].
         *
         * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Verdict> = verdict

        /**
         * Returns the raw JSON value of [compositeScores].
         *
         * Unlike [compositeScores], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("composite_scores")
        @ExcludeMissing
        fun _compositeScores(): JsonField<CompositeScores> = compositeScores

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Double> = confidence

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [pageCount].
         *
         * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_count") @ExcludeMissing fun _pageCount(): JsonField<Long> = pageCount

        /**
         * Returns the raw JSON value of [pageDimensions].
         *
         * Unlike [pageDimensions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("page_dimensions")
        @ExcludeMissing
        fun _pageDimensions(): JsonField<List<PageDimension>> = pageDimensions

        /**
         * Returns the raw JSON value of [reasoning].
         *
         * Unlike [reasoning], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reasoning") @ExcludeMissing fun _reasoning(): JsonField<String> = reasoning

        /**
         * Returns the raw JSON value of [suspectRegions].
         *
         * Unlike [suspectRegions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("suspect_regions")
        @ExcludeMissing
        fun _suspectRegions(): JsonField<List<SuspectRegion>> = suspectRegions

        /**
         * Returns the raw JSON value of [syntheticScore].
         *
         * Unlike [syntheticScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("synthetic_score")
        @ExcludeMissing
        fun _syntheticScore(): JsonField<Double> = syntheticScore

        /**
         * Returns the raw JSON value of [tamperingScore].
         *
         * Unlike [tamperingScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tampering_score")
        @ExcludeMissing
        fun _tamperingScore(): JsonField<Double> = tamperingScore

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
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .detectorVersion()
             * .overallScore()
             * .verdict()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var detectorVersion: JsonField<String>? = null
            private var overallScore: JsonField<Double>? = null
            private var verdict: JsonField<Verdict>? = null
            private var compositeScores: JsonField<CompositeScores> = JsonMissing.of()
            private var confidence: JsonField<Double> = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var pageCount: JsonField<Long> = JsonMissing.of()
            private var pageDimensions: JsonField<MutableList<PageDimension>>? = null
            private var reasoning: JsonField<String> = JsonMissing.of()
            private var suspectRegions: JsonField<MutableList<SuspectRegion>>? = null
            private var syntheticScore: JsonField<Double> = JsonMissing.of()
            private var tamperingScore: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                detectorVersion = result.detectorVersion
                overallScore = result.overallScore
                verdict = result.verdict
                compositeScores = result.compositeScores
                confidence = result.confidence
                error = result.error
                pageCount = result.pageCount
                pageDimensions = result.pageDimensions.map { it.toMutableList() }
                reasoning = result.reasoning
                suspectRegions = result.suspectRegions.map { it.toMutableList() }
                syntheticScore = result.syntheticScore
                tamperingScore = result.tamperingScore
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** Version of the detector that produced the result */
            fun detectorVersion(detectorVersion: String) =
                detectorVersion(JsonField.of(detectorVersion))

            /**
             * Sets [Builder.detectorVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detectorVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detectorVersion(detectorVersion: JsonField<String>) = apply {
                this.detectorVersion = detectorVersion
            }

            /** Overall doctoring likelihood (0 to 1) */
            fun overallScore(overallScore: Double) = overallScore(JsonField.of(overallScore))

            /**
             * Sets [Builder.overallScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overallScore] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overallScore(overallScore: JsonField<Double>) = apply {
                this.overallScore = overallScore
            }

            /** Overall verdict for the document */
            fun verdict(verdict: Verdict) = verdict(JsonField.of(verdict))

            /**
             * Sets [Builder.verdict] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verdict] with a well-typed [Verdict] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verdict(verdict: JsonField<Verdict>) = apply { this.verdict = verdict }

            /** Composite scores, each answering one question about the document */
            fun compositeScores(compositeScores: CompositeScores) =
                compositeScores(JsonField.of(compositeScores))

            /**
             * Sets [Builder.compositeScores] to an arbitrary JSON value.
             *
             * You should usually call [Builder.compositeScores] with a well-typed [CompositeScores]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun compositeScores(compositeScores: JsonField<CompositeScores>) = apply {
                this.compositeScores = compositeScores
            }

            /**
             * Confidence in the verdict (0 to 1): how firmly the detected signals support the
             * verdict bucket, independent of the doctoring likelihood itself
             */
            fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

            /** Error detail when the analysis could not complete */
            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            /** Number of analysed pages (1 for images/docx) */
            fun pageCount(pageCount: Long) = pageCount(JsonField.of(pageCount))

            /**
             * Sets [Builder.pageCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageCount(pageCount: JsonField<Long>) = apply { this.pageCount = pageCount }

            /** Rendered pixel size per page, so region bboxes can be scaled onto the page */
            fun pageDimensions(pageDimensions: List<PageDimension>) =
                pageDimensions(JsonField.of(pageDimensions))

            /**
             * Sets [Builder.pageDimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageDimensions] with a well-typed
             * `List<PageDimension>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun pageDimensions(pageDimensions: JsonField<List<PageDimension>>) = apply {
                this.pageDimensions = pageDimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [PageDimension] to [pageDimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPageDimension(pageDimension: PageDimension) = apply {
                pageDimensions =
                    (pageDimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pageDimensions", it).add(pageDimension)
                    }
            }

            /** Explanation of the verdict */
            fun reasoning(reasoning: String) = reasoning(JsonField.of(reasoning))

            /**
             * Sets [Builder.reasoning] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasoning] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reasoning(reasoning: JsonField<String>) = apply { this.reasoning = reasoning }

            /**
             * Regions that led to the suspected fraud, ranked most-suspect first, each with an
             * explanation of what makes it suspect
             */
            fun suspectRegions(suspectRegions: List<SuspectRegion>) =
                suspectRegions(JsonField.of(suspectRegions))

            /**
             * Sets [Builder.suspectRegions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suspectRegions] with a well-typed
             * `List<SuspectRegion>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun suspectRegions(suspectRegions: JsonField<List<SuspectRegion>>) = apply {
                this.suspectRegions = suspectRegions.map { it.toMutableList() }
            }

            /**
             * Adds a single [SuspectRegion] to [suspectRegions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSuspectRegion(suspectRegion: SuspectRegion) = apply {
                suspectRegions =
                    (suspectRegions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("suspectRegions", it).add(suspectRegion)
                    }
            }

            /**
             * Likelihood (0 to 1) that the document is wholly generated or fabricated rather than a
             * capture of a real document. Null for jobs completed before this score was introduced
             */
            fun syntheticScore(syntheticScore: Double?) =
                syntheticScore(JsonField.ofNullable(syntheticScore))

            /**
             * Alias for [Builder.syntheticScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun syntheticScore(syntheticScore: Double) = syntheticScore(syntheticScore as Double?)

            /** Alias for calling [Builder.syntheticScore] with `syntheticScore.orElse(null)`. */
            fun syntheticScore(syntheticScore: Optional<Double>) =
                syntheticScore(syntheticScore.getOrNull())

            /**
             * Sets [Builder.syntheticScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.syntheticScore] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun syntheticScore(syntheticScore: JsonField<Double>) = apply {
                this.syntheticScore = syntheticScore
            }

            /**
             * Likelihood (0 to 1) that a real captured document was locally edited — a genuine
             * capture with regions altered after the fact. Null for jobs completed before this
             * score was introduced
             */
            fun tamperingScore(tamperingScore: Double?) =
                tamperingScore(JsonField.ofNullable(tamperingScore))

            /**
             * Alias for [Builder.tamperingScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tamperingScore(tamperingScore: Double) = tamperingScore(tamperingScore as Double?)

            /** Alias for calling [Builder.tamperingScore] with `tamperingScore.orElse(null)`. */
            fun tamperingScore(tamperingScore: Optional<Double>) =
                tamperingScore(tamperingScore.getOrNull())

            /**
             * Sets [Builder.tamperingScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tamperingScore] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tamperingScore(tamperingScore: JsonField<Double>) = apply {
                this.tamperingScore = tamperingScore
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .detectorVersion()
             * .overallScore()
             * .verdict()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("detectorVersion", detectorVersion),
                    checkRequired("overallScore", overallScore),
                    checkRequired("verdict", verdict),
                    compositeScores,
                    confidence,
                    error,
                    pageCount,
                    (pageDimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    reasoning,
                    (suspectRegions ?: JsonMissing.of()).map { it.toImmutable() },
                    syntheticScore,
                    tamperingScore,
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
        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            detectorVersion()
            overallScore()
            verdict().validate()
            compositeScores().ifPresent { it.validate() }
            confidence()
            error()
            pageCount()
            pageDimensions().ifPresent { it.forEach { it.validate() } }
            reasoning()
            suspectRegions().ifPresent { it.forEach { it.validate() } }
            syntheticScore()
            tamperingScore()
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
            (if (detectorVersion.asKnown().isPresent) 1 else 0) +
                (if (overallScore.asKnown().isPresent) 1 else 0) +
                (verdict.asKnown().getOrNull()?.validity() ?: 0) +
                (compositeScores.asKnown().getOrNull()?.validity() ?: 0) +
                (if (confidence.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (if (pageCount.asKnown().isPresent) 1 else 0) +
                (pageDimensions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (reasoning.asKnown().isPresent) 1 else 0) +
                (suspectRegions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (syntheticScore.asKnown().isPresent) 1 else 0) +
                (if (tamperingScore.asKnown().isPresent) 1 else 0)

        /** Overall verdict for the document */
        class Verdict @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val AUTHENTIC = of("AUTHENTIC")

                @JvmField val DOCTORED = of("DOCTORED")

                @JvmField val LIKELY_DOCTORED = of("LIKELY_DOCTORED")

                @JvmField val NO_STRONG_SIGNAL = of("NO_STRONG_SIGNAL")

                @JvmField val SUSPICIOUS = of("SUSPICIOUS")

                @JvmStatic fun of(value: String) = Verdict(JsonField.of(value))
            }

            /** An enum containing [Verdict]'s known values. */
            enum class Known {
                AUTHENTIC,
                DOCTORED,
                LIKELY_DOCTORED,
                NO_STRONG_SIGNAL,
                SUSPICIOUS,
            }

            /**
             * An enum containing [Verdict]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Verdict] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTHENTIC,
                DOCTORED,
                LIKELY_DOCTORED,
                NO_STRONG_SIGNAL,
                SUSPICIOUS,
                /**
                 * An enum member indicating that [Verdict] was instantiated with an unknown value.
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
                    AUTHENTIC -> Value.AUTHENTIC
                    DOCTORED -> Value.DOCTORED
                    LIKELY_DOCTORED -> Value.LIKELY_DOCTORED
                    NO_STRONG_SIGNAL -> Value.NO_STRONG_SIGNAL
                    SUSPICIOUS -> Value.SUSPICIOUS
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
                    AUTHENTIC -> Known.AUTHENTIC
                    DOCTORED -> Known.DOCTORED
                    LIKELY_DOCTORED -> Known.LIKELY_DOCTORED
                    NO_STRONG_SIGNAL -> Known.NO_STRONG_SIGNAL
                    SUSPICIOUS -> Known.SUSPICIOUS
                    else -> throw LlamaCloudInvalidDataException("Unknown Verdict: $value")
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
            fun validate(): Verdict = apply {
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

                return other is Verdict && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Composite scores, each answering one question about the document */
        class CompositeScores
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val aiGenerated: JsonField<AiGenerated>,
            private val documentCoherence: JsonField<DocumentCoherence>,
            private val documentMetadata: JsonField<DocumentMetadata>,
            private val knownFraud: JsonField<KnownFraud>,
            private val manuallyEdited: JsonField<ManuallyEdited>,
            private val recapture: JsonField<Recapture>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ai_generated")
                @ExcludeMissing
                aiGenerated: JsonField<AiGenerated> = JsonMissing.of(),
                @JsonProperty("document_coherence")
                @ExcludeMissing
                documentCoherence: JsonField<DocumentCoherence> = JsonMissing.of(),
                @JsonProperty("document_metadata")
                @ExcludeMissing
                documentMetadata: JsonField<DocumentMetadata> = JsonMissing.of(),
                @JsonProperty("known_fraud")
                @ExcludeMissing
                knownFraud: JsonField<KnownFraud> = JsonMissing.of(),
                @JsonProperty("manually_edited")
                @ExcludeMissing
                manuallyEdited: JsonField<ManuallyEdited> = JsonMissing.of(),
                @JsonProperty("recapture")
                @ExcludeMissing
                recapture: JsonField<Recapture> = JsonMissing.of(),
            ) : this(
                aiGenerated,
                documentCoherence,
                documentMetadata,
                knownFraud,
                manuallyEdited,
                recapture,
                mutableMapOf(),
            )

            /**
             * Was this content synthesized by a generative model?
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun aiGenerated(): Optional<AiGenerated> = aiGenerated.getOptional("ai_generated")

            /**
             * Does the document's content agree with itself (checksums, arithmetic,
             * machine-readable zones)?
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun documentCoherence(): Optional<DocumentCoherence> =
                documentCoherence.getOptional("document_coherence")

            /**
             * Does the file's provenance / toolchain history look suspicious? Advisory:
             * individually weak workflow-hygiene signals
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun documentMetadata(): Optional<DocumentMetadata> =
                documentMetadata.getOptional("document_metadata")

            /**
             * Has this asset (or its template) been seen in fraud before?
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun knownFraud(): Optional<KnownFraud> = knownFraud.getOptional("known_fraud")

            /**
             * Was this document altered after creation (splice, retype, redact, inpaint)?
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun manuallyEdited(): Optional<ManuallyEdited> =
                manuallyEdited.getOptional("manually_edited")

            /**
             * Was the document captured through a channel that destroys forensic evidence (photo of
             * a screen, print-then-rescan)?
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun recapture(): Optional<Recapture> = recapture.getOptional("recapture")

            /**
             * Returns the raw JSON value of [aiGenerated].
             *
             * Unlike [aiGenerated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ai_generated")
            @ExcludeMissing
            fun _aiGenerated(): JsonField<AiGenerated> = aiGenerated

            /**
             * Returns the raw JSON value of [documentCoherence].
             *
             * Unlike [documentCoherence], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("document_coherence")
            @ExcludeMissing
            fun _documentCoherence(): JsonField<DocumentCoherence> = documentCoherence

            /**
             * Returns the raw JSON value of [documentMetadata].
             *
             * Unlike [documentMetadata], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("document_metadata")
            @ExcludeMissing
            fun _documentMetadata(): JsonField<DocumentMetadata> = documentMetadata

            /**
             * Returns the raw JSON value of [knownFraud].
             *
             * Unlike [knownFraud], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("known_fraud")
            @ExcludeMissing
            fun _knownFraud(): JsonField<KnownFraud> = knownFraud

            /**
             * Returns the raw JSON value of [manuallyEdited].
             *
             * Unlike [manuallyEdited], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("manually_edited")
            @ExcludeMissing
            fun _manuallyEdited(): JsonField<ManuallyEdited> = manuallyEdited

            /**
             * Returns the raw JSON value of [recapture].
             *
             * Unlike [recapture], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recapture")
            @ExcludeMissing
            fun _recapture(): JsonField<Recapture> = recapture

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

                /** Returns a mutable builder for constructing an instance of [CompositeScores]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CompositeScores]. */
            class Builder internal constructor() {

                private var aiGenerated: JsonField<AiGenerated> = JsonMissing.of()
                private var documentCoherence: JsonField<DocumentCoherence> = JsonMissing.of()
                private var documentMetadata: JsonField<DocumentMetadata> = JsonMissing.of()
                private var knownFraud: JsonField<KnownFraud> = JsonMissing.of()
                private var manuallyEdited: JsonField<ManuallyEdited> = JsonMissing.of()
                private var recapture: JsonField<Recapture> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(compositeScores: CompositeScores) = apply {
                    aiGenerated = compositeScores.aiGenerated
                    documentCoherence = compositeScores.documentCoherence
                    documentMetadata = compositeScores.documentMetadata
                    knownFraud = compositeScores.knownFraud
                    manuallyEdited = compositeScores.manuallyEdited
                    recapture = compositeScores.recapture
                    additionalProperties = compositeScores.additionalProperties.toMutableMap()
                }

                /** Was this content synthesized by a generative model? */
                fun aiGenerated(aiGenerated: AiGenerated) = aiGenerated(JsonField.of(aiGenerated))

                /**
                 * Sets [Builder.aiGenerated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aiGenerated] with a well-typed [AiGenerated]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun aiGenerated(aiGenerated: JsonField<AiGenerated>) = apply {
                    this.aiGenerated = aiGenerated
                }

                /**
                 * Does the document's content agree with itself (checksums, arithmetic,
                 * machine-readable zones)?
                 */
                fun documentCoherence(documentCoherence: DocumentCoherence) =
                    documentCoherence(JsonField.of(documentCoherence))

                /**
                 * Sets [Builder.documentCoherence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentCoherence] with a well-typed
                 * [DocumentCoherence] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun documentCoherence(documentCoherence: JsonField<DocumentCoherence>) = apply {
                    this.documentCoherence = documentCoherence
                }

                /**
                 * Does the file's provenance / toolchain history look suspicious? Advisory:
                 * individually weak workflow-hygiene signals
                 */
                fun documentMetadata(documentMetadata: DocumentMetadata) =
                    documentMetadata(JsonField.of(documentMetadata))

                /**
                 * Sets [Builder.documentMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentMetadata] with a well-typed
                 * [DocumentMetadata] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun documentMetadata(documentMetadata: JsonField<DocumentMetadata>) = apply {
                    this.documentMetadata = documentMetadata
                }

                /** Has this asset (or its template) been seen in fraud before? */
                fun knownFraud(knownFraud: KnownFraud) = knownFraud(JsonField.of(knownFraud))

                /**
                 * Sets [Builder.knownFraud] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.knownFraud] with a well-typed [KnownFraud] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun knownFraud(knownFraud: JsonField<KnownFraud>) = apply {
                    this.knownFraud = knownFraud
                }

                /** Was this document altered after creation (splice, retype, redact, inpaint)? */
                fun manuallyEdited(manuallyEdited: ManuallyEdited) =
                    manuallyEdited(JsonField.of(manuallyEdited))

                /**
                 * Sets [Builder.manuallyEdited] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.manuallyEdited] with a well-typed
                 * [ManuallyEdited] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun manuallyEdited(manuallyEdited: JsonField<ManuallyEdited>) = apply {
                    this.manuallyEdited = manuallyEdited
                }

                /**
                 * Was the document captured through a channel that destroys forensic evidence
                 * (photo of a screen, print-then-rescan)?
                 */
                fun recapture(recapture: Recapture) = recapture(JsonField.of(recapture))

                /**
                 * Sets [Builder.recapture] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recapture] with a well-typed [Recapture] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recapture(recapture: JsonField<Recapture>) = apply {
                    this.recapture = recapture
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
                 * Returns an immutable instance of [CompositeScores].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CompositeScores =
                    CompositeScores(
                        aiGenerated,
                        documentCoherence,
                        documentMetadata,
                        knownFraud,
                        manuallyEdited,
                        recapture,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): CompositeScores = apply {
                if (validated) {
                    return@apply
                }

                aiGenerated().ifPresent { it.validate() }
                documentCoherence().ifPresent { it.validate() }
                documentMetadata().ifPresent { it.validate() }
                knownFraud().ifPresent { it.validate() }
                manuallyEdited().ifPresent { it.validate() }
                recapture().ifPresent { it.validate() }
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
                (aiGenerated.asKnown().getOrNull()?.validity() ?: 0) +
                    (documentCoherence.asKnown().getOrNull()?.validity() ?: 0) +
                    (documentMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (knownFraud.asKnown().getOrNull()?.validity() ?: 0) +
                    (manuallyEdited.asKnown().getOrNull()?.validity() ?: 0) +
                    (recapture.asKnown().getOrNull()?.validity() ?: 0)

            /** Was this content synthesized by a generative model? */
            class AiGenerated
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val applicable: JsonField<Boolean>,
                private val score: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("applicable")
                    @ExcludeMissing
                    applicable: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("score")
                    @ExcludeMissing
                    score: JsonField<Double> = JsonMissing.of(),
                ) : this(applicable, score, mutableMapOf())

                /**
                 * Whether the checks feeding this composite ran on this document. When false the
                 * document was not checked for this — not cleared of it
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun applicable(): Optional<Boolean> = applicable.getOptional("applicable")

                /**
                 * Score (0 to 1); null when the composite was not applicable
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun score(): Optional<Double> = score.getOptional("score")

                /**
                 * Returns the raw JSON value of [applicable].
                 *
                 * Unlike [applicable], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applicable")
                @ExcludeMissing
                fun _applicable(): JsonField<Boolean> = applicable

                /**
                 * Returns the raw JSON value of [score].
                 *
                 * Unlike [score], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

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

                    /** Returns a mutable builder for constructing an instance of [AiGenerated]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AiGenerated]. */
                class Builder internal constructor() {

                    private var applicable: JsonField<Boolean> = JsonMissing.of()
                    private var score: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(aiGenerated: AiGenerated) = apply {
                        applicable = aiGenerated.applicable
                        score = aiGenerated.score
                        additionalProperties = aiGenerated.additionalProperties.toMutableMap()
                    }

                    /**
                     * Whether the checks feeding this composite ran on this document. When false
                     * the document was not checked for this — not cleared of it
                     */
                    fun applicable(applicable: Boolean) = applicable(JsonField.of(applicable))

                    /**
                     * Sets [Builder.applicable] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.applicable] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun applicable(applicable: JsonField<Boolean>) = apply {
                        this.applicable = applicable
                    }

                    /** Score (0 to 1); null when the composite was not applicable */
                    fun score(score: Double?) = score(JsonField.ofNullable(score))

                    /**
                     * Alias for [Builder.score].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun score(score: Double) = score(score as Double?)

                    /** Alias for calling [Builder.score] with `score.orElse(null)`. */
                    fun score(score: Optional<Double>) = score(score.getOrNull())

                    /**
                     * Sets [Builder.score] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.score] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun score(score: JsonField<Double>) = apply { this.score = score }

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
                     * Returns an immutable instance of [AiGenerated].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): AiGenerated =
                        AiGenerated(applicable, score, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AiGenerated = apply {
                    if (validated) {
                        return@apply
                    }

                    applicable()
                    score()
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
                    (if (applicable.asKnown().isPresent) 1 else 0) +
                        (if (score.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AiGenerated &&
                        applicable == other.applicable &&
                        score == other.score &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(applicable, score, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AiGenerated{applicable=$applicable, score=$score, additionalProperties=$additionalProperties}"
            }

            /**
             * Does the document's content agree with itself (checksums, arithmetic,
             * machine-readable zones)?
             */
            class DocumentCoherence
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val applicable: JsonField<Boolean>,
                private val score: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("applicable")
                    @ExcludeMissing
                    applicable: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("score")
                    @ExcludeMissing
                    score: JsonField<Double> = JsonMissing.of(),
                ) : this(applicable, score, mutableMapOf())

                /**
                 * Whether the checks feeding this composite ran on this document. When false the
                 * document was not checked for this — not cleared of it
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun applicable(): Optional<Boolean> = applicable.getOptional("applicable")

                /**
                 * Score (0 to 1); null when the composite was not applicable
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun score(): Optional<Double> = score.getOptional("score")

                /**
                 * Returns the raw JSON value of [applicable].
                 *
                 * Unlike [applicable], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applicable")
                @ExcludeMissing
                fun _applicable(): JsonField<Boolean> = applicable

                /**
                 * Returns the raw JSON value of [score].
                 *
                 * Unlike [score], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

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
                     * [DocumentCoherence].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DocumentCoherence]. */
                class Builder internal constructor() {

                    private var applicable: JsonField<Boolean> = JsonMissing.of()
                    private var score: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(documentCoherence: DocumentCoherence) = apply {
                        applicable = documentCoherence.applicable
                        score = documentCoherence.score
                        additionalProperties = documentCoherence.additionalProperties.toMutableMap()
                    }

                    /**
                     * Whether the checks feeding this composite ran on this document. When false
                     * the document was not checked for this — not cleared of it
                     */
                    fun applicable(applicable: Boolean) = applicable(JsonField.of(applicable))

                    /**
                     * Sets [Builder.applicable] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.applicable] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun applicable(applicable: JsonField<Boolean>) = apply {
                        this.applicable = applicable
                    }

                    /** Score (0 to 1); null when the composite was not applicable */
                    fun score(score: Double?) = score(JsonField.ofNullable(score))

                    /**
                     * Alias for [Builder.score].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun score(score: Double) = score(score as Double?)

                    /** Alias for calling [Builder.score] with `score.orElse(null)`. */
                    fun score(score: Optional<Double>) = score(score.getOrNull())

                    /**
                     * Sets [Builder.score] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.score] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun score(score: JsonField<Double>) = apply { this.score = score }

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
                     * Returns an immutable instance of [DocumentCoherence].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): DocumentCoherence =
                        DocumentCoherence(applicable, score, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): DocumentCoherence = apply {
                    if (validated) {
                        return@apply
                    }

                    applicable()
                    score()
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
                    (if (applicable.asKnown().isPresent) 1 else 0) +
                        (if (score.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DocumentCoherence &&
                        applicable == other.applicable &&
                        score == other.score &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(applicable, score, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DocumentCoherence{applicable=$applicable, score=$score, additionalProperties=$additionalProperties}"
            }

            /**
             * Does the file's provenance / toolchain history look suspicious? Advisory:
             * individually weak workflow-hygiene signals
             */
            class DocumentMetadata
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val applicable: JsonField<Boolean>,
                private val score: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("applicable")
                    @ExcludeMissing
                    applicable: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("score")
                    @ExcludeMissing
                    score: JsonField<Double> = JsonMissing.of(),
                ) : this(applicable, score, mutableMapOf())

                /**
                 * Whether the checks feeding this composite ran on this document. When false the
                 * document was not checked for this — not cleared of it
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun applicable(): Optional<Boolean> = applicable.getOptional("applicable")

                /**
                 * Score (0 to 1); null when the composite was not applicable
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun score(): Optional<Double> = score.getOptional("score")

                /**
                 * Returns the raw JSON value of [applicable].
                 *
                 * Unlike [applicable], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applicable")
                @ExcludeMissing
                fun _applicable(): JsonField<Boolean> = applicable

                /**
                 * Returns the raw JSON value of [score].
                 *
                 * Unlike [score], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

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
                     * Returns a mutable builder for constructing an instance of [DocumentMetadata].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DocumentMetadata]. */
                class Builder internal constructor() {

                    private var applicable: JsonField<Boolean> = JsonMissing.of()
                    private var score: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(documentMetadata: DocumentMetadata) = apply {
                        applicable = documentMetadata.applicable
                        score = documentMetadata.score
                        additionalProperties = documentMetadata.additionalProperties.toMutableMap()
                    }

                    /**
                     * Whether the checks feeding this composite ran on this document. When false
                     * the document was not checked for this — not cleared of it
                     */
                    fun applicable(applicable: Boolean) = applicable(JsonField.of(applicable))

                    /**
                     * Sets [Builder.applicable] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.applicable] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun applicable(applicable: JsonField<Boolean>) = apply {
                        this.applicable = applicable
                    }

                    /** Score (0 to 1); null when the composite was not applicable */
                    fun score(score: Double?) = score(JsonField.ofNullable(score))

                    /**
                     * Alias for [Builder.score].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun score(score: Double) = score(score as Double?)

                    /** Alias for calling [Builder.score] with `score.orElse(null)`. */
                    fun score(score: Optional<Double>) = score(score.getOrNull())

                    /**
                     * Sets [Builder.score] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.score] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun score(score: JsonField<Double>) = apply { this.score = score }

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
                     * Returns an immutable instance of [DocumentMetadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): DocumentMetadata =
                        DocumentMetadata(applicable, score, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): DocumentMetadata = apply {
                    if (validated) {
                        return@apply
                    }

                    applicable()
                    score()
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
                    (if (applicable.asKnown().isPresent) 1 else 0) +
                        (if (score.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DocumentMetadata &&
                        applicable == other.applicable &&
                        score == other.score &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(applicable, score, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DocumentMetadata{applicable=$applicable, score=$score, additionalProperties=$additionalProperties}"
            }

            /** Has this asset (or its template) been seen in fraud before? */
            class KnownFraud
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val applicable: JsonField<Boolean>,
                private val score: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("applicable")
                    @ExcludeMissing
                    applicable: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("score")
                    @ExcludeMissing
                    score: JsonField<Double> = JsonMissing.of(),
                ) : this(applicable, score, mutableMapOf())

                /**
                 * Whether the checks feeding this composite ran on this document. When false the
                 * document was not checked for this — not cleared of it
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun applicable(): Optional<Boolean> = applicable.getOptional("applicable")

                /**
                 * Score (0 to 1); null when the composite was not applicable
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun score(): Optional<Double> = score.getOptional("score")

                /**
                 * Returns the raw JSON value of [applicable].
                 *
                 * Unlike [applicable], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applicable")
                @ExcludeMissing
                fun _applicable(): JsonField<Boolean> = applicable

                /**
                 * Returns the raw JSON value of [score].
                 *
                 * Unlike [score], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

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

                    /** Returns a mutable builder for constructing an instance of [KnownFraud]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [KnownFraud]. */
                class Builder internal constructor() {

                    private var applicable: JsonField<Boolean> = JsonMissing.of()
                    private var score: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(knownFraud: KnownFraud) = apply {
                        applicable = knownFraud.applicable
                        score = knownFraud.score
                        additionalProperties = knownFraud.additionalProperties.toMutableMap()
                    }

                    /**
                     * Whether the checks feeding this composite ran on this document. When false
                     * the document was not checked for this — not cleared of it
                     */
                    fun applicable(applicable: Boolean) = applicable(JsonField.of(applicable))

                    /**
                     * Sets [Builder.applicable] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.applicable] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun applicable(applicable: JsonField<Boolean>) = apply {
                        this.applicable = applicable
                    }

                    /** Score (0 to 1); null when the composite was not applicable */
                    fun score(score: Double?) = score(JsonField.ofNullable(score))

                    /**
                     * Alias for [Builder.score].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun score(score: Double) = score(score as Double?)

                    /** Alias for calling [Builder.score] with `score.orElse(null)`. */
                    fun score(score: Optional<Double>) = score(score.getOrNull())

                    /**
                     * Sets [Builder.score] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.score] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun score(score: JsonField<Double>) = apply { this.score = score }

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
                     * Returns an immutable instance of [KnownFraud].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): KnownFraud =
                        KnownFraud(applicable, score, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): KnownFraud = apply {
                    if (validated) {
                        return@apply
                    }

                    applicable()
                    score()
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
                    (if (applicable.asKnown().isPresent) 1 else 0) +
                        (if (score.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is KnownFraud &&
                        applicable == other.applicable &&
                        score == other.score &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(applicable, score, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "KnownFraud{applicable=$applicable, score=$score, additionalProperties=$additionalProperties}"
            }

            /** Was this document altered after creation (splice, retype, redact, inpaint)? */
            class ManuallyEdited
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val applicable: JsonField<Boolean>,
                private val score: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("applicable")
                    @ExcludeMissing
                    applicable: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("score")
                    @ExcludeMissing
                    score: JsonField<Double> = JsonMissing.of(),
                ) : this(applicable, score, mutableMapOf())

                /**
                 * Whether the checks feeding this composite ran on this document. When false the
                 * document was not checked for this — not cleared of it
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun applicable(): Optional<Boolean> = applicable.getOptional("applicable")

                /**
                 * Score (0 to 1); null when the composite was not applicable
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun score(): Optional<Double> = score.getOptional("score")

                /**
                 * Returns the raw JSON value of [applicable].
                 *
                 * Unlike [applicable], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applicable")
                @ExcludeMissing
                fun _applicable(): JsonField<Boolean> = applicable

                /**
                 * Returns the raw JSON value of [score].
                 *
                 * Unlike [score], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

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
                     * Returns a mutable builder for constructing an instance of [ManuallyEdited].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ManuallyEdited]. */
                class Builder internal constructor() {

                    private var applicable: JsonField<Boolean> = JsonMissing.of()
                    private var score: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(manuallyEdited: ManuallyEdited) = apply {
                        applicable = manuallyEdited.applicable
                        score = manuallyEdited.score
                        additionalProperties = manuallyEdited.additionalProperties.toMutableMap()
                    }

                    /**
                     * Whether the checks feeding this composite ran on this document. When false
                     * the document was not checked for this — not cleared of it
                     */
                    fun applicable(applicable: Boolean) = applicable(JsonField.of(applicable))

                    /**
                     * Sets [Builder.applicable] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.applicable] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun applicable(applicable: JsonField<Boolean>) = apply {
                        this.applicable = applicable
                    }

                    /** Score (0 to 1); null when the composite was not applicable */
                    fun score(score: Double?) = score(JsonField.ofNullable(score))

                    /**
                     * Alias for [Builder.score].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun score(score: Double) = score(score as Double?)

                    /** Alias for calling [Builder.score] with `score.orElse(null)`. */
                    fun score(score: Optional<Double>) = score(score.getOrNull())

                    /**
                     * Sets [Builder.score] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.score] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun score(score: JsonField<Double>) = apply { this.score = score }

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
                     * Returns an immutable instance of [ManuallyEdited].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ManuallyEdited =
                        ManuallyEdited(applicable, score, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ManuallyEdited = apply {
                    if (validated) {
                        return@apply
                    }

                    applicable()
                    score()
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
                    (if (applicable.asKnown().isPresent) 1 else 0) +
                        (if (score.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ManuallyEdited &&
                        applicable == other.applicable &&
                        score == other.score &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(applicable, score, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ManuallyEdited{applicable=$applicable, score=$score, additionalProperties=$additionalProperties}"
            }

            /**
             * Was the document captured through a channel that destroys forensic evidence (photo of
             * a screen, print-then-rescan)?
             */
            class Recapture
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val applicable: JsonField<Boolean>,
                private val score: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("applicable")
                    @ExcludeMissing
                    applicable: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("score")
                    @ExcludeMissing
                    score: JsonField<Double> = JsonMissing.of(),
                ) : this(applicable, score, mutableMapOf())

                /**
                 * Whether the checks feeding this composite ran on this document. When false the
                 * document was not checked for this — not cleared of it
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun applicable(): Optional<Boolean> = applicable.getOptional("applicable")

                /**
                 * Score (0 to 1); null when the composite was not applicable
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun score(): Optional<Double> = score.getOptional("score")

                /**
                 * Returns the raw JSON value of [applicable].
                 *
                 * Unlike [applicable], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applicable")
                @ExcludeMissing
                fun _applicable(): JsonField<Boolean> = applicable

                /**
                 * Returns the raw JSON value of [score].
                 *
                 * Unlike [score], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

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

                    /** Returns a mutable builder for constructing an instance of [Recapture]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Recapture]. */
                class Builder internal constructor() {

                    private var applicable: JsonField<Boolean> = JsonMissing.of()
                    private var score: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recapture: Recapture) = apply {
                        applicable = recapture.applicable
                        score = recapture.score
                        additionalProperties = recapture.additionalProperties.toMutableMap()
                    }

                    /**
                     * Whether the checks feeding this composite ran on this document. When false
                     * the document was not checked for this — not cleared of it
                     */
                    fun applicable(applicable: Boolean) = applicable(JsonField.of(applicable))

                    /**
                     * Sets [Builder.applicable] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.applicable] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun applicable(applicable: JsonField<Boolean>) = apply {
                        this.applicable = applicable
                    }

                    /** Score (0 to 1); null when the composite was not applicable */
                    fun score(score: Double?) = score(JsonField.ofNullable(score))

                    /**
                     * Alias for [Builder.score].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun score(score: Double) = score(score as Double?)

                    /** Alias for calling [Builder.score] with `score.orElse(null)`. */
                    fun score(score: Optional<Double>) = score(score.getOrNull())

                    /**
                     * Sets [Builder.score] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.score] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun score(score: JsonField<Double>) = apply { this.score = score }

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
                     * Returns an immutable instance of [Recapture].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Recapture =
                        Recapture(applicable, score, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Recapture = apply {
                    if (validated) {
                        return@apply
                    }

                    applicable()
                    score()
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
                    (if (applicable.asKnown().isPresent) 1 else 0) +
                        (if (score.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Recapture &&
                        applicable == other.applicable &&
                        score == other.score &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(applicable, score, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Recapture{applicable=$applicable, score=$score, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CompositeScores &&
                    aiGenerated == other.aiGenerated &&
                    documentCoherence == other.documentCoherence &&
                    documentMetadata == other.documentMetadata &&
                    knownFraud == other.knownFraud &&
                    manuallyEdited == other.manuallyEdited &&
                    recapture == other.recapture &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    aiGenerated,
                    documentCoherence,
                    documentMetadata,
                    knownFraud,
                    manuallyEdited,
                    recapture,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CompositeScores{aiGenerated=$aiGenerated, documentCoherence=$documentCoherence, documentMetadata=$documentMetadata, knownFraud=$knownFraud, manuallyEdited=$manuallyEdited, recapture=$recapture, additionalProperties=$additionalProperties}"
        }

        /**
         * Rendered pixel size of a page — the coordinate space region bboxes use, so the UI can
         * scale the suspect-region overlay onto the displayed page.
         */
        class PageDimension
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val height: JsonField<Long>,
            private val page: JsonField<Long>,
            private val width: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("height") @ExcludeMissing height: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
            ) : this(height, page, width, mutableMapOf())

            /**
             * Rendered page height in pixels
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun height(): Long = height.getRequired("height")

            /**
             * 0-based page index (0 for standalone images)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun page(): Long = page.getRequired("page")

            /**
             * Rendered page width in pixels
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun width(): Long = width.getRequired("width")

            /**
             * Returns the raw JSON value of [height].
             *
             * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

            /**
             * Returns the raw JSON value of [page].
             *
             * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

            /**
             * Returns the raw JSON value of [width].
             *
             * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

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
                 * Returns a mutable builder for constructing an instance of [PageDimension].
                 *
                 * The following fields are required:
                 * ```java
                 * .height()
                 * .page()
                 * .width()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PageDimension]. */
            class Builder internal constructor() {

                private var height: JsonField<Long>? = null
                private var page: JsonField<Long>? = null
                private var width: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pageDimension: PageDimension) = apply {
                    height = pageDimension.height
                    page = pageDimension.page
                    width = pageDimension.width
                    additionalProperties = pageDimension.additionalProperties.toMutableMap()
                }

                /** Rendered page height in pixels */
                fun height(height: Long) = height(JsonField.of(height))

                /**
                 * Sets [Builder.height] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.height] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun height(height: JsonField<Long>) = apply { this.height = height }

                /** 0-based page index (0 for standalone images) */
                fun page(page: Long) = page(JsonField.of(page))

                /**
                 * Sets [Builder.page] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.page] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun page(page: JsonField<Long>) = apply { this.page = page }

                /** Rendered page width in pixels */
                fun width(width: Long) = width(JsonField.of(width))

                /**
                 * Sets [Builder.width] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.width] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun width(width: JsonField<Long>) = apply { this.width = width }

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
                 * Returns an immutable instance of [PageDimension].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .height()
                 * .page()
                 * .width()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PageDimension =
                    PageDimension(
                        checkRequired("height", height),
                        checkRequired("page", page),
                        checkRequired("width", width),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): PageDimension = apply {
                if (validated) {
                    return@apply
                }

                height()
                page()
                width()
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
                (if (height.asKnown().isPresent) 1 else 0) +
                    (if (page.asKnown().isPresent) 1 else 0) +
                    (if (width.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PageDimension &&
                    height == other.height &&
                    page == other.page &&
                    width == other.width &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(height, page, width, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PageDimension{height=$height, page=$page, width=$width, additionalProperties=$additionalProperties}"
        }

        /**
         * A region that led to the suspected fraud, with why it is suspect.
         *
         * A curated, high-signal subset of ``regions``: reviewer-dismissed candidates are dropped
         * and the remainder is ranked by suspicion, so consumers can act on ``verdict`` +
         * ``confidence`` + this list without reading the raw signals.
         */
        class SuspectRegion
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bbox: JsonField<List<Long>>,
            private val explanation: JsonField<String>,
            private val kind: JsonField<String>,
            private val page: JsonField<Long>,
            private val score: JsonField<Double>,
            private val source: JsonField<String>,
            private val primary: JsonField<Boolean>,
            private val review: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bbox")
                @ExcludeMissing
                bbox: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("explanation")
                @ExcludeMissing
                explanation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("kind") @ExcludeMissing kind: JsonField<String> = JsonMissing.of(),
                @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("source")
                @ExcludeMissing
                source: JsonField<String> = JsonMissing.of(),
                @JsonProperty("primary")
                @ExcludeMissing
                primary: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("review") @ExcludeMissing review: JsonField<String> = JsonMissing.of(),
            ) : this(bbox, explanation, kind, page, score, source, primary, review, mutableMapOf())

            /**
             * Region bounding box as [x, y, w, h] in page-render pixels
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bbox(): List<Long> = bbox.getRequired("bbox")

            /**
             * Human-readable explanation of what makes this region suspect
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun explanation(): String = explanation.getRequired("explanation")

            /**
             * Kind of anomaly detected in this region
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun kind(): String = kind.getRequired("kind")

            /**
             * 0-based page index (0 for standalone images)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun page(): Long = page.getRequired("page")

            /**
             * Suspicion score for this region (0 to 1)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun score(): Double = score.getRequired("score")

            /**
             * Detector that flagged this region
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun source(): String = source.getRequired("source")

            /**
             * Whether this region is part of the small set of decisive evidence behind the verdict
             * — the boxes a reviewer should look at first
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun primary(): Optional<Boolean> = primary.getOptional("primary")

            /**
             * Automated reviewer verdict for this region (confirmed, dismissed, unsure, or empty).
             * A dismissed region can still be surfaced when it is the only place to look; this
             * label says how to read it
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun review(): Optional<String> = review.getOptional("review")

            /**
             * Returns the raw JSON value of [bbox].
             *
             * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<List<Long>> = bbox

            /**
             * Returns the raw JSON value of [explanation].
             *
             * Unlike [explanation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("explanation")
            @ExcludeMissing
            fun _explanation(): JsonField<String> = explanation

            /**
             * Returns the raw JSON value of [kind].
             *
             * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<String> = kind

            /**
             * Returns the raw JSON value of [page].
             *
             * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

            /**
             * Returns the raw JSON value of [score].
             *
             * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

            /**
             * Returns the raw JSON value of [source].
             *
             * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

            /**
             * Returns the raw JSON value of [primary].
             *
             * Unlike [primary], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("primary") @ExcludeMissing fun _primary(): JsonField<Boolean> = primary

            /**
             * Returns the raw JSON value of [review].
             *
             * Unlike [review], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("review") @ExcludeMissing fun _review(): JsonField<String> = review

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
                 * Returns a mutable builder for constructing an instance of [SuspectRegion].
                 *
                 * The following fields are required:
                 * ```java
                 * .bbox()
                 * .explanation()
                 * .kind()
                 * .page()
                 * .score()
                 * .source()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SuspectRegion]. */
            class Builder internal constructor() {

                private var bbox: JsonField<MutableList<Long>>? = null
                private var explanation: JsonField<String>? = null
                private var kind: JsonField<String>? = null
                private var page: JsonField<Long>? = null
                private var score: JsonField<Double>? = null
                private var source: JsonField<String>? = null
                private var primary: JsonField<Boolean> = JsonMissing.of()
                private var review: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(suspectRegion: SuspectRegion) = apply {
                    bbox = suspectRegion.bbox.map { it.toMutableList() }
                    explanation = suspectRegion.explanation
                    kind = suspectRegion.kind
                    page = suspectRegion.page
                    score = suspectRegion.score
                    source = suspectRegion.source
                    primary = suspectRegion.primary
                    review = suspectRegion.review
                    additionalProperties = suspectRegion.additionalProperties.toMutableMap()
                }

                /** Region bounding box as [x, y, w, h] in page-render pixels */
                fun bbox(bbox: List<Long>) = bbox(JsonField.of(bbox))

                /**
                 * Sets [Builder.bbox] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bbox] with a well-typed `List<Long>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bbox(bbox: JsonField<List<Long>>) = apply {
                    this.bbox = bbox.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [Builder.bbox].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addBbox(bbox: Long) = apply {
                    this.bbox =
                        (this.bbox ?: JsonField.of(mutableListOf())).also {
                            checkKnown("bbox", it).add(bbox)
                        }
                }

                /** Human-readable explanation of what makes this region suspect */
                fun explanation(explanation: String) = explanation(JsonField.of(explanation))

                /**
                 * Sets [Builder.explanation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.explanation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun explanation(explanation: JsonField<String>) = apply {
                    this.explanation = explanation
                }

                /** Kind of anomaly detected in this region */
                fun kind(kind: String) = kind(JsonField.of(kind))

                /**
                 * Sets [Builder.kind] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kind] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonField<String>) = apply { this.kind = kind }

                /** 0-based page index (0 for standalone images) */
                fun page(page: Long) = page(JsonField.of(page))

                /**
                 * Sets [Builder.page] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.page] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun page(page: JsonField<Long>) = apply { this.page = page }

                /** Suspicion score for this region (0 to 1) */
                fun score(score: Double) = score(JsonField.of(score))

                /**
                 * Sets [Builder.score] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.score] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun score(score: JsonField<Double>) = apply { this.score = score }

                /** Detector that flagged this region */
                fun source(source: String) = source(JsonField.of(source))

                /**
                 * Sets [Builder.source] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.source] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun source(source: JsonField<String>) = apply { this.source = source }

                /**
                 * Whether this region is part of the small set of decisive evidence behind the
                 * verdict — the boxes a reviewer should look at first
                 */
                fun primary(primary: Boolean) = primary(JsonField.of(primary))

                /**
                 * Sets [Builder.primary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.primary] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun primary(primary: JsonField<Boolean>) = apply { this.primary = primary }

                /**
                 * Automated reviewer verdict for this region (confirmed, dismissed, unsure, or
                 * empty). A dismissed region can still be surfaced when it is the only place to
                 * look; this label says how to read it
                 */
                fun review(review: String) = review(JsonField.of(review))

                /**
                 * Sets [Builder.review] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.review] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun review(review: JsonField<String>) = apply { this.review = review }

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
                 * Returns an immutable instance of [SuspectRegion].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .bbox()
                 * .explanation()
                 * .kind()
                 * .page()
                 * .score()
                 * .source()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SuspectRegion =
                    SuspectRegion(
                        checkRequired("bbox", bbox).map { it.toImmutable() },
                        checkRequired("explanation", explanation),
                        checkRequired("kind", kind),
                        checkRequired("page", page),
                        checkRequired("score", score),
                        checkRequired("source", source),
                        primary,
                        review,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): SuspectRegion = apply {
                if (validated) {
                    return@apply
                }

                bbox()
                explanation()
                kind()
                page()
                score()
                source()
                primary()
                review()
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
                (bbox.asKnown().getOrNull()?.size ?: 0) +
                    (if (explanation.asKnown().isPresent) 1 else 0) +
                    (if (kind.asKnown().isPresent) 1 else 0) +
                    (if (page.asKnown().isPresent) 1 else 0) +
                    (if (score.asKnown().isPresent) 1 else 0) +
                    (if (source.asKnown().isPresent) 1 else 0) +
                    (if (primary.asKnown().isPresent) 1 else 0) +
                    (if (review.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SuspectRegion &&
                    bbox == other.bbox &&
                    explanation == other.explanation &&
                    kind == other.kind &&
                    page == other.page &&
                    score == other.score &&
                    source == other.source &&
                    primary == other.primary &&
                    review == other.review &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    bbox,
                    explanation,
                    kind,
                    page,
                    score,
                    source,
                    primary,
                    review,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SuspectRegion{bbox=$bbox, explanation=$explanation, kind=$kind, page=$page, score=$score, source=$source, primary=$primary, review=$review, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                detectorVersion == other.detectorVersion &&
                overallScore == other.overallScore &&
                verdict == other.verdict &&
                compositeScores == other.compositeScores &&
                confidence == other.confidence &&
                error == other.error &&
                pageCount == other.pageCount &&
                pageDimensions == other.pageDimensions &&
                reasoning == other.reasoning &&
                suspectRegions == other.suspectRegions &&
                syntheticScore == other.syntheticScore &&
                tamperingScore == other.tamperingScore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                detectorVersion,
                overallScore,
                verdict,
                compositeScores,
                confidence,
                error,
                pageCount,
                pageDimensions,
                reasoning,
                suspectRegions,
                syntheticScore,
                tamperingScore,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{detectorVersion=$detectorVersion, overallScore=$overallScore, verdict=$verdict, compositeScores=$compositeScores, confidence=$confidence, error=$error, pageCount=$pageCount, pageDimensions=$pageDimensions, reasoning=$reasoning, suspectRegions=$suspectRegions, syntheticScore=$syntheticScore, tamperingScore=$tamperingScore, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerifyGetResponse &&
            id == other.id &&
            configuration == other.configuration &&
            documentInputType == other.documentInputType &&
            fileInput == other.fileInput &&
            projectId == other.projectId &&
            status == other.status &&
            userId == other.userId &&
            createdAt == other.createdAt &&
            errorMessage == other.errorMessage &&
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
            createdAt,
            errorMessage,
            result,
            transactionId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerifyGetResponse{id=$id, configuration=$configuration, documentInputType=$documentInputType, fileInput=$fileInput, projectId=$projectId, status=$status, userId=$userId, createdAt=$createdAt, errorMessage=$errorMessage, result=$result, transactionId=$transactionId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
