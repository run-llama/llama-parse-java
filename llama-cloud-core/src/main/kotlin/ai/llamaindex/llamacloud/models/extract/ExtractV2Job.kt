// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.BaseDeserializer
import ai.llamaindex.llamacloud.core.BaseSerializer
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.allMaxBy
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.getOrThrow
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An extraction job. */
class ExtractV2Job
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val fileInput: JsonField<String>,
    private val projectId: JsonField<String>,
    private val status: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val configuration: JsonField<ExtractConfiguration>,
    private val configurationId: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val extractMetadata: JsonField<ExtractJobMetadata>,
    private val extractResult: JsonField<ExtractResult>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("file_input") @ExcludeMissing fileInput: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        configuration: JsonField<ExtractConfiguration> = JsonMissing.of(),
        @JsonProperty("configuration_id")
        @ExcludeMissing
        configurationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extract_metadata")
        @ExcludeMissing
        extractMetadata: JsonField<ExtractJobMetadata> = JsonMissing.of(),
        @JsonProperty("extract_result")
        @ExcludeMissing
        extractResult: JsonField<ExtractResult> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        fileInput,
        projectId,
        status,
        updatedAt,
        configuration,
        configurationId,
        errorMessage,
        extractMetadata,
        extractResult,
        metadata,
        mutableMapOf(),
    )

    /**
     * Unique job identifier (job_id)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Creation timestamp
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * File ID or parse job ID that was extracted
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
     * Current job status.
     * - `PENDING` — queued, not yet started
     * - `RUNNING` — actively processing
     * - `COMPLETED` — finished successfully
     * - `FAILED` — terminated with an error
     * - `CANCELLED` — cancelled by user
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * Last update timestamp
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Extract configuration combining parse and extract settings.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configuration(): Optional<ExtractConfiguration> = configuration.getOptional("configuration")

    /**
     * Saved extract configuration ID used for this job, if any
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configurationId(): Optional<String> = configurationId.getOptional("configuration_id")

    /**
     * Error details when status is FAILED
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * Extraction metadata.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extractMetadata(): Optional<ExtractJobMetadata> =
        extractMetadata.getOptional("extract_metadata")

    /**
     * Extracted data conforming to the data_schema. Returns a single object for per_doc, or an
     * array for per_page / per_table_row.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extractResult(): Optional<ExtractResult> = extractResult.getOptional("extract_result")

    /**
     * Job-level metadata.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [configuration].
     *
     * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration")
    @ExcludeMissing
    fun _configuration(): JsonField<ExtractConfiguration> = configuration

    /**
     * Returns the raw JSON value of [configurationId].
     *
     * Unlike [configurationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration_id")
    @ExcludeMissing
    fun _configurationId(): JsonField<String> = configurationId

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [extractMetadata].
     *
     * Unlike [extractMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extract_metadata")
    @ExcludeMissing
    fun _extractMetadata(): JsonField<ExtractJobMetadata> = extractMetadata

    /**
     * Returns the raw JSON value of [extractResult].
     *
     * Unlike [extractResult], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extract_result")
    @ExcludeMissing
    fun _extractResult(): JsonField<ExtractResult> = extractResult

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
         * Returns a mutable builder for constructing an instance of [ExtractV2Job].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .fileInput()
         * .projectId()
         * .status()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractV2Job]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var fileInput: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var status: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var configuration: JsonField<ExtractConfiguration> = JsonMissing.of()
        private var configurationId: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var extractMetadata: JsonField<ExtractJobMetadata> = JsonMissing.of()
        private var extractResult: JsonField<ExtractResult> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractV2Job: ExtractV2Job) = apply {
            id = extractV2Job.id
            createdAt = extractV2Job.createdAt
            fileInput = extractV2Job.fileInput
            projectId = extractV2Job.projectId
            status = extractV2Job.status
            updatedAt = extractV2Job.updatedAt
            configuration = extractV2Job.configuration
            configurationId = extractV2Job.configurationId
            errorMessage = extractV2Job.errorMessage
            extractMetadata = extractV2Job.extractMetadata
            extractResult = extractV2Job.extractResult
            metadata = extractV2Job.metadata
            additionalProperties = extractV2Job.additionalProperties.toMutableMap()
        }

        /** Unique job identifier (job_id) */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Creation timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** File ID or parse job ID that was extracted */
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

        /**
         * Current job status.
         * - `PENDING` — queued, not yet started
         * - `RUNNING` — actively processing
         * - `COMPLETED` — finished successfully
         * - `FAILED` — terminated with an error
         * - `CANCELLED` — cancelled by user
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Last update timestamp */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Extract configuration combining parse and extract settings. */
        fun configuration(configuration: ExtractConfiguration?) =
            configuration(JsonField.ofNullable(configuration))

        /** Alias for calling [Builder.configuration] with `configuration.orElse(null)`. */
        fun configuration(configuration: Optional<ExtractConfiguration>) =
            configuration(configuration.getOrNull())

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed [ExtractConfiguration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun configuration(configuration: JsonField<ExtractConfiguration>) = apply {
            this.configuration = configuration
        }

        /** Saved extract configuration ID used for this job, if any */
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

        /** Error details when status is FAILED */
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

        /** Extraction metadata. */
        fun extractMetadata(extractMetadata: ExtractJobMetadata?) =
            extractMetadata(JsonField.ofNullable(extractMetadata))

        /** Alias for calling [Builder.extractMetadata] with `extractMetadata.orElse(null)`. */
        fun extractMetadata(extractMetadata: Optional<ExtractJobMetadata>) =
            extractMetadata(extractMetadata.getOrNull())

        /**
         * Sets [Builder.extractMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extractMetadata] with a well-typed [ExtractJobMetadata]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun extractMetadata(extractMetadata: JsonField<ExtractJobMetadata>) = apply {
            this.extractMetadata = extractMetadata
        }

        /**
         * Extracted data conforming to the data_schema. Returns a single object for per_doc, or an
         * array for per_page / per_table_row.
         */
        fun extractResult(extractResult: ExtractResult?) =
            extractResult(JsonField.ofNullable(extractResult))

        /** Alias for calling [Builder.extractResult] with `extractResult.orElse(null)`. */
        fun extractResult(extractResult: Optional<ExtractResult>) =
            extractResult(extractResult.getOrNull())

        /**
         * Sets [Builder.extractResult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extractResult] with a well-typed [ExtractResult] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extractResult(extractResult: JsonField<ExtractResult>) = apply {
            this.extractResult = extractResult
        }

        /** Alias for calling [extractResult] with `ExtractResult.ofUnionMember0(unionMember0)`. */
        fun extractResult(unionMember0: ExtractResult.UnionMember0) =
            extractResult(ExtractResult.ofUnionMember0(unionMember0))

        /**
         * Alias for calling [extractResult] with
         * `ExtractResult.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)`.
         */
        fun extractResultOfUnnamedSchemaWithArrayParent0s(
            unnamedSchemaWithArrayParent0s: List<ExtractResult.UnnamedSchemaWithArrayParent0>
        ) =
            extractResult(
                ExtractResult.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)
            )

        /** Job-level metadata. */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
         * Returns an immutable instance of [ExtractV2Job].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .fileInput()
         * .projectId()
         * .status()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExtractV2Job =
            ExtractV2Job(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("fileInput", fileInput),
                checkRequired("projectId", projectId),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                configuration,
                configurationId,
                errorMessage,
                extractMetadata,
                extractResult,
                metadata,
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
    fun validate(): ExtractV2Job = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        fileInput()
        projectId()
        status()
        updatedAt()
        configuration().ifPresent { it.validate() }
        configurationId()
        errorMessage()
        extractMetadata().ifPresent { it.validate() }
        extractResult().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
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
            (if (fileInput.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (configuration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (configurationId.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (extractMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (extractResult.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Extracted data conforming to the data_schema. Returns a single object for per_doc, or an
     * array for per_page / per_table_row.
     */
    @JsonDeserialize(using = ExtractResult.Deserializer::class)
    @JsonSerialize(using = ExtractResult.Serializer::class)
    class ExtractResult
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun unnamedSchemaWithArrayParent0s(): Optional<List<UnnamedSchemaWithArrayParent0>> =
            Optional.ofNullable(unnamedSchemaWithArrayParent0s)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnnamedSchemaWithArrayParent0s(): Boolean = unnamedSchemaWithArrayParent0s != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnnamedSchemaWithArrayParent0s(): List<UnnamedSchemaWithArrayParent0> =
            unnamedSchemaWithArrayParent0s.getOrThrow("unnamedSchemaWithArrayParent0s")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import ai.llamaindex.llamacloud.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = extractResult.accept(new ExtractResult.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitUnionMember0(UnionMember0 unionMember0) {
         *         return Optional.of(unionMember0.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unnamedSchemaWithArrayParent0s != null ->
                    visitor.visitUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)
                else -> visitor.unknown(_json)
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
        fun validate(): ExtractResult = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitUnnamedSchemaWithArrayParent0s(
                        unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                    ) {
                        unnamedSchemaWithArrayParent0s.forEach { it.validate() }
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitUnnamedSchemaWithArrayParent0s(
                        unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                    ) = unnamedSchemaWithArrayParent0s.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExtractResult &&
                unionMember0 == other.unionMember0 &&
                unnamedSchemaWithArrayParent0s == other.unnamedSchemaWithArrayParent0s
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, unnamedSchemaWithArrayParent0s)

        override fun toString(): String =
            when {
                unionMember0 != null -> "ExtractResult{unionMember0=$unionMember0}"
                unnamedSchemaWithArrayParent0s != null ->
                    "ExtractResult{unnamedSchemaWithArrayParent0s=$unnamedSchemaWithArrayParent0s}"
                _json != null -> "ExtractResult{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ExtractResult")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) =
                ExtractResult(unionMember0 = unionMember0)

            @JvmStatic
            fun ofUnnamedSchemaWithArrayParent0s(
                unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
            ) =
                ExtractResult(
                    unnamedSchemaWithArrayParent0s = unnamedSchemaWithArrayParent0s.toImmutable()
                )
        }

        /**
         * An interface that defines how to map each variant of [ExtractResult] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnnamedSchemaWithArrayParent0s(
                unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
            ): T

            /**
             * Maps an unknown variant of [ExtractResult] to a value of type [T].
             *
             * An instance of [ExtractResult] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown ExtractResult: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ExtractResult>(ExtractResult::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ExtractResult {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                ExtractResult(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<List<UnnamedSchemaWithArrayParent0>>(),
                                )
                                ?.let {
                                    ExtractResult(unnamedSchemaWithArrayParent0s = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ExtractResult(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ExtractResult>(ExtractResult::class) {

            override fun serialize(
                value: ExtractResult,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unnamedSchemaWithArrayParent0s != null ->
                        generator.writeObject(value.unnamedSchemaWithArrayParent0s)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ExtractResult")
                }
            }
        }

        class UnionMember0
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

                /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember0 = UnionMember0(additionalProperties.toImmutable())
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
            fun validate(): UnionMember0 = apply {
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

                return other is UnionMember0 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember0{additionalProperties=$additionalProperties}"
        }

        class UnnamedSchemaWithArrayParent0
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [UnnamedSchemaWithArrayParent0].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnnamedSchemaWithArrayParent0]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unnamedSchemaWithArrayParent0: UnnamedSchemaWithArrayParent0) =
                    apply {
                        additionalProperties =
                            unnamedSchemaWithArrayParent0.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UnnamedSchemaWithArrayParent0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnnamedSchemaWithArrayParent0 =
                    UnnamedSchemaWithArrayParent0(additionalProperties.toImmutable())
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
            fun validate(): UnnamedSchemaWithArrayParent0 = apply {
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

                return other is UnnamedSchemaWithArrayParent0 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnnamedSchemaWithArrayParent0{additionalProperties=$additionalProperties}"
        }
    }

    /** Job-level metadata. */
    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val usage: JsonField<ExtractJobUsage>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("usage")
            @ExcludeMissing
            usage: JsonField<ExtractJobUsage> = JsonMissing.of()
        ) : this(usage, mutableMapOf())

        /**
         * Extraction usage metrics.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun usage(): Optional<ExtractJobUsage> = usage.getOptional("usage")

        /**
         * Returns the raw JSON value of [usage].
         *
         * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<ExtractJobUsage> = usage

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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var usage: JsonField<ExtractJobUsage> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                usage = metadata.usage
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            /** Extraction usage metrics. */
            fun usage(usage: ExtractJobUsage?) = usage(JsonField.ofNullable(usage))

            /** Alias for calling [Builder.usage] with `usage.orElse(null)`. */
            fun usage(usage: Optional<ExtractJobUsage>) = usage(usage.getOrNull())

            /**
             * Sets [Builder.usage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usage] with a well-typed [ExtractJobUsage] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usage(usage: JsonField<ExtractJobUsage>) = apply { this.usage = usage }

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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(usage, additionalProperties.toMutableMap())
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
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            usage().ifPresent { it.validate() }
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
        @JvmSynthetic internal fun validity(): Int = (usage.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                usage == other.usage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(usage, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{usage=$usage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractV2Job &&
            id == other.id &&
            createdAt == other.createdAt &&
            fileInput == other.fileInput &&
            projectId == other.projectId &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            configuration == other.configuration &&
            configurationId == other.configurationId &&
            errorMessage == other.errorMessage &&
            extractMetadata == other.extractMetadata &&
            extractResult == other.extractResult &&
            metadata == other.metadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            fileInput,
            projectId,
            status,
            updatedAt,
            configuration,
            configurationId,
            errorMessage,
            extractMetadata,
            extractResult,
            metadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractV2Job{id=$id, createdAt=$createdAt, fileInput=$fileInput, projectId=$projectId, status=$status, updatedAt=$updatedAt, configuration=$configuration, configurationId=$configurationId, errorMessage=$errorMessage, extractMetadata=$extractMetadata, extractResult=$extractResult, metadata=$metadata, additionalProperties=$additionalProperties}"
}
