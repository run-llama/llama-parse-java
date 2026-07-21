// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.sheets

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import ai.llamaindex.llamacloud.models.files.File
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A spreadsheet parsing job. */
class SheetsJob
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val configuration: JsonField<SheetsParsingConfig>,
    private val createdAt: JsonField<String>,
    private val fileId: JsonField<String>,
    private val projectId: JsonField<String>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<String>,
    private val userId: JsonField<String>,
    private val config: JsonField<SheetsParsingConfig>,
    private val configurationId: JsonField<String>,
    private val errors: JsonField<List<String>>,
    private val file: JsonField<File>,
    private val metadataStateTransitions: JsonField<MetadataStateTransitions>,
    private val parameters: JsonField<Parameters>,
    private val regions: JsonField<List<Region>>,
    private val success: JsonField<Boolean>,
    private val worksheetMetadata: JsonField<List<WorksheetMetadata>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        configuration: JsonField<SheetsParsingConfig> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config")
        @ExcludeMissing
        config: JsonField<SheetsParsingConfig> = JsonMissing.of(),
        @JsonProperty("configuration_id")
        @ExcludeMissing
        configurationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("file") @ExcludeMissing file: JsonField<File> = JsonMissing.of(),
        @JsonProperty("metadata_state_transitions")
        @ExcludeMissing
        metadataStateTransitions: JsonField<MetadataStateTransitions> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonProperty("regions")
        @ExcludeMissing
        regions: JsonField<List<Region>> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("worksheet_metadata")
        @ExcludeMissing
        worksheetMetadata: JsonField<List<WorksheetMetadata>> = JsonMissing.of(),
    ) : this(
        id,
        configuration,
        createdAt,
        fileId,
        projectId,
        status,
        updatedAt,
        userId,
        config,
        configurationId,
        errors,
        file,
        metadataStateTransitions,
        parameters,
        regions,
        success,
        worksheetMetadata,
        mutableMapOf(),
    )

    /**
     * The ID of the job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Configuration applied to the parsing job (inline or resolved from a saved preset).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configuration(): SheetsParsingConfig = configuration.getRequired("configuration")

    /**
     * When the job was created
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): String = createdAt.getRequired("created_at")

    /**
     * The ID of the input file
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileId(): Optional<String> = fileId.getOptional("file_id")

    /**
     * The ID of the project
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * The status of the parsing job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * When the job was last updated
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): String = updatedAt.getRequired("updated_at")

    /**
     * The ID of the user
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * Configuration for spreadsheet parsing and region extraction
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun config(): Optional<SheetsParsingConfig> = config.getOptional("config")

    /**
     * The saved product configuration ID used at create time, if any.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configurationId(): Optional<String> = configurationId.getOptional("configuration_id")

    /**
     * Any errors encountered
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errors(): Optional<List<String>> = errors.getOptional("errors")

    /**
     * Schema for a file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun file(): Optional<File> = file.getOptional("file")

    /**
     * Per-status entry timestamps. Returned only when requested via
     * `?expand=metadata_state_transitions`.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadataStateTransitions(): Optional<MetadataStateTransitions> =
        metadataStateTransitions.getOptional("metadata_state_transitions")

    /**
     * Job-time parameters such as webhook configurations.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parameters(): Optional<Parameters> = parameters.getOptional("parameters")

    /**
     * All extracted regions (populated when job is complete)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regions(): Optional<List<Region>> = regions.getOptional("regions")

    /**
     * Whether the job completed successfully
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Metadata for each processed worksheet (populated when job is complete)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun worksheetMetadata(): Optional<List<WorksheetMetadata>> =
        worksheetMetadata.getOptional("worksheet_metadata")

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
    fun _configuration(): JsonField<SheetsParsingConfig> = configuration

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("config")
    @ExcludeMissing
    fun _config(): JsonField<SheetsParsingConfig> = config

    /**
     * Returns the raw JSON value of [configurationId].
     *
     * Unlike [configurationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration_id")
    @ExcludeMissing
    fun _configurationId(): JsonField<String> = configurationId

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<String>> = errors

    /**
     * Returns the raw JSON value of [file].
     *
     * Unlike [file], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("file")
    @ExcludeMissing
    fun _file(): JsonField<File> = file

    /**
     * Returns the raw JSON value of [metadataStateTransitions].
     *
     * Unlike [metadataStateTransitions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("metadata_state_transitions")
    @ExcludeMissing
    fun _metadataStateTransitions(): JsonField<MetadataStateTransitions> = metadataStateTransitions

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<Parameters> = parameters

    /**
     * Returns the raw JSON value of [regions].
     *
     * Unlike [regions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regions") @ExcludeMissing fun _regions(): JsonField<List<Region>> = regions

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [worksheetMetadata].
     *
     * Unlike [worksheetMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("worksheet_metadata")
    @ExcludeMissing
    fun _worksheetMetadata(): JsonField<List<WorksheetMetadata>> = worksheetMetadata

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
         * Returns a mutable builder for constructing an instance of [SheetsJob].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .configuration()
         * .createdAt()
         * .fileId()
         * .projectId()
         * .status()
         * .updatedAt()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SheetsJob]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var configuration: JsonField<SheetsParsingConfig>? = null
        private var createdAt: JsonField<String>? = null
        private var fileId: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<String>? = null
        private var userId: JsonField<String>? = null
        private var config: JsonField<SheetsParsingConfig> = JsonMissing.of()
        private var configurationId: JsonField<String> = JsonMissing.of()
        private var errors: JsonField<MutableList<String>>? = null
        private var file: JsonField<File> = JsonMissing.of()
        private var metadataStateTransitions: JsonField<MetadataStateTransitions> = JsonMissing.of()
        private var parameters: JsonField<Parameters> = JsonMissing.of()
        private var regions: JsonField<MutableList<Region>>? = null
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var worksheetMetadata: JsonField<MutableList<WorksheetMetadata>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sheetsJob: SheetsJob) = apply {
            id = sheetsJob.id
            configuration = sheetsJob.configuration
            createdAt = sheetsJob.createdAt
            fileId = sheetsJob.fileId
            projectId = sheetsJob.projectId
            status = sheetsJob.status
            updatedAt = sheetsJob.updatedAt
            userId = sheetsJob.userId
            config = sheetsJob.config
            configurationId = sheetsJob.configurationId
            errors = sheetsJob.errors.map { it.toMutableList() }
            file = sheetsJob.file
            metadataStateTransitions = sheetsJob.metadataStateTransitions
            parameters = sheetsJob.parameters
            regions = sheetsJob.regions.map { it.toMutableList() }
            success = sheetsJob.success
            worksheetMetadata = sheetsJob.worksheetMetadata.map { it.toMutableList() }
            additionalProperties = sheetsJob.additionalProperties.toMutableMap()
        }

        /** The ID of the job */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Configuration applied to the parsing job (inline or resolved from a saved preset). */
        fun configuration(configuration: SheetsParsingConfig) =
            configuration(JsonField.of(configuration))

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed [SheetsParsingConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun configuration(configuration: JsonField<SheetsParsingConfig>) = apply {
            this.configuration = configuration
        }

        /** When the job was created */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** The ID of the input file */
        fun fileId(fileId: String?) = fileId(JsonField.ofNullable(fileId))

        /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
        fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

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

        /** The status of the parsing job */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** When the job was last updated */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /** The ID of the user */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Configuration for spreadsheet parsing and region extraction */
        @Deprecated("deprecated")
        fun config(config: SheetsParsingConfig?) = config(JsonField.ofNullable(config))

        /** Alias for calling [Builder.config] with `config.orElse(null)`. */
        @Deprecated("deprecated")
        fun config(config: Optional<SheetsParsingConfig>) = config(config.getOrNull())

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [SheetsParsingConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun config(config: JsonField<SheetsParsingConfig>) = apply { this.config = config }

        /** The saved product configuration ID used at create time, if any. */
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

        /** Any errors encountered */
        fun errors(errors: List<String>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errors(errors: JsonField<List<String>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: String) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        /** Schema for a file. */
        @Deprecated("deprecated") fun file(file: File?) = file(JsonField.ofNullable(file))

        /** Alias for calling [Builder.file] with `file.orElse(null)`. */
        @Deprecated("deprecated") fun file(file: Optional<File>) = file(file.getOrNull())

        /**
         * Sets [Builder.file] to an arbitrary JSON value.
         *
         * You should usually call [Builder.file] with a well-typed [File] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated") fun file(file: JsonField<File>) = apply { this.file = file }

        /**
         * Per-status entry timestamps. Returned only when requested via
         * `?expand=metadata_state_transitions`.
         */
        fun metadataStateTransitions(metadataStateTransitions: MetadataStateTransitions?) =
            metadataStateTransitions(JsonField.ofNullable(metadataStateTransitions))

        /**
         * Alias for calling [Builder.metadataStateTransitions] with
         * `metadataStateTransitions.orElse(null)`.
         */
        fun metadataStateTransitions(metadataStateTransitions: Optional<MetadataStateTransitions>) =
            metadataStateTransitions(metadataStateTransitions.getOrNull())

        /**
         * Sets [Builder.metadataStateTransitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataStateTransitions] with a well-typed
         * [MetadataStateTransitions] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun metadataStateTransitions(
            metadataStateTransitions: JsonField<MetadataStateTransitions>
        ) = apply { this.metadataStateTransitions = metadataStateTransitions }

        /** Job-time parameters such as webhook configurations. */
        fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { this.parameters = parameters }

        /** All extracted regions (populated when job is complete) */
        fun regions(regions: List<Region>) = regions(JsonField.of(regions))

        /**
         * Sets [Builder.regions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regions] with a well-typed `List<Region>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regions(regions: JsonField<List<Region>>) = apply {
            this.regions = regions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Region] to [regions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegion(region: Region) = apply {
            regions =
                (regions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("regions", it).add(region)
                }
        }

        /** Whether the job completed successfully */
        fun success(success: Boolean?) = success(JsonField.ofNullable(success))

        /**
         * Alias for [Builder.success].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun success(success: Boolean) = success(success as Boolean?)

        /** Alias for calling [Builder.success] with `success.orElse(null)`. */
        fun success(success: Optional<Boolean>) = success(success.getOrNull())

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** Metadata for each processed worksheet (populated when job is complete) */
        fun worksheetMetadata(worksheetMetadata: List<WorksheetMetadata>) =
            worksheetMetadata(JsonField.of(worksheetMetadata))

        /**
         * Sets [Builder.worksheetMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.worksheetMetadata] with a well-typed
         * `List<WorksheetMetadata>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun worksheetMetadata(worksheetMetadata: JsonField<List<WorksheetMetadata>>) = apply {
            this.worksheetMetadata = worksheetMetadata.map { it.toMutableList() }
        }

        /**
         * Adds a single [WorksheetMetadata] to [Builder.worksheetMetadata].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWorksheetMetadata(worksheetMetadata: WorksheetMetadata) = apply {
            this.worksheetMetadata =
                (this.worksheetMetadata ?: JsonField.of(mutableListOf())).also {
                    checkKnown("worksheetMetadata", it).add(worksheetMetadata)
                }
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
         * Returns an immutable instance of [SheetsJob].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .configuration()
         * .createdAt()
         * .fileId()
         * .projectId()
         * .status()
         * .updatedAt()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SheetsJob =
            SheetsJob(
                checkRequired("id", id),
                checkRequired("configuration", configuration),
                checkRequired("createdAt", createdAt),
                checkRequired("fileId", fileId),
                checkRequired("projectId", projectId),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                checkRequired("userId", userId),
                config,
                configurationId,
                (errors ?: JsonMissing.of()).map { it.toImmutable() },
                file,
                metadataStateTransitions,
                parameters,
                (regions ?: JsonMissing.of()).map { it.toImmutable() },
                success,
                (worksheetMetadata ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): SheetsJob = apply {
        if (validated) {
            return@apply
        }

        id()
        configuration().validate()
        createdAt()
        fileId()
        projectId()
        status().validate()
        updatedAt()
        userId()
        config().ifPresent { it.validate() }
        configurationId()
        errors()
        file().ifPresent { it.validate() }
        metadataStateTransitions().ifPresent { it.validate() }
        parameters().ifPresent { it.validate() }
        regions().ifPresent { it.forEach { it.validate() } }
        success()
        worksheetMetadata().ifPresent { it.forEach { it.validate() } }
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (config.asKnown().getOrNull()?.validity() ?: 0) +
            (if (configurationId.asKnown().isPresent) 1 else 0) +
            (errors.asKnown().getOrNull()?.size ?: 0) +
            (file.asKnown().getOrNull()?.validity() ?: 0) +
            (metadataStateTransitions.asKnown().getOrNull()?.validity() ?: 0) +
            (parameters.asKnown().getOrNull()?.validity() ?: 0) +
            (regions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (worksheetMetadata.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** The status of the parsing job */
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

            @JvmField val PARTIAL_SUCCESS = of("PARTIAL_SUCCESS")

            @JvmField val PENDING = of("PENDING")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            ERROR,
            PARTIAL_SUCCESS,
            PENDING,
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
            PARTIAL_SUCCESS,
            PENDING,
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
                PARTIAL_SUCCESS -> Value.PARTIAL_SUCCESS
                PENDING -> Value.PENDING
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
                PARTIAL_SUCCESS -> Known.PARTIAL_SUCCESS
                PENDING -> Known.PENDING
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

    /**
     * Per-status entry timestamps. Returned only when requested via
     * `?expand=metadata_state_transitions`.
     */
    class MetadataStateTransitions
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
             * Returns a mutable builder for constructing an instance of [MetadataStateTransitions].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MetadataStateTransitions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadataStateTransitions: MetadataStateTransitions) = apply {
                additionalProperties = metadataStateTransitions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [MetadataStateTransitions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MetadataStateTransitions =
                MetadataStateTransitions(additionalProperties.toImmutable())
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
        fun validate(): MetadataStateTransitions = apply {
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

            return other is MetadataStateTransitions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MetadataStateTransitions{additionalProperties=$additionalProperties}"
    }

    /** Job-time parameters such as webhook configurations. */
    class Parameters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val webhookConfigurations: JsonField<List<WebhookConfiguration>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("webhook_configurations")
            @ExcludeMissing
            webhookConfigurations: JsonField<List<WebhookConfiguration>> = JsonMissing.of()
        ) : this(webhookConfigurations, mutableMapOf())

        /**
         * Webhook configurations for job status notifications.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookConfigurations(): Optional<List<WebhookConfiguration>> =
            webhookConfigurations.getOptional("webhook_configurations")

        /**
         * Returns the raw JSON value of [webhookConfigurations].
         *
         * Unlike [webhookConfigurations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_configurations")
        @ExcludeMissing
        fun _webhookConfigurations(): JsonField<List<WebhookConfiguration>> = webhookConfigurations

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

            /** Returns a mutable builder for constructing an instance of [Parameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Parameters]. */
        class Builder internal constructor() {

            private var webhookConfigurations: JsonField<MutableList<WebhookConfiguration>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parameters: Parameters) = apply {
                webhookConfigurations = parameters.webhookConfigurations.map { it.toMutableList() }
                additionalProperties = parameters.additionalProperties.toMutableMap()
            }

            /** Webhook configurations for job status notifications. */
            fun webhookConfigurations(webhookConfigurations: List<WebhookConfiguration>?) =
                webhookConfigurations(JsonField.ofNullable(webhookConfigurations))

            /**
             * Alias for calling [Builder.webhookConfigurations] with
             * `webhookConfigurations.orElse(null)`.
             */
            fun webhookConfigurations(webhookConfigurations: Optional<List<WebhookConfiguration>>) =
                webhookConfigurations(webhookConfigurations.getOrNull())

            /**
             * Sets [Builder.webhookConfigurations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookConfigurations] with a well-typed
             * `List<WebhookConfiguration>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun webhookConfigurations(
                webhookConfigurations: JsonField<List<WebhookConfiguration>>
            ) = apply {
                this.webhookConfigurations = webhookConfigurations.map { it.toMutableList() }
            }

            /**
             * Adds a single [WebhookConfiguration] to [webhookConfigurations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWebhookConfiguration(webhookConfiguration: WebhookConfiguration) = apply {
                webhookConfigurations =
                    (webhookConfigurations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("webhookConfigurations", it).add(webhookConfiguration)
                    }
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
             * Returns an immutable instance of [Parameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Parameters =
                Parameters(
                    (webhookConfigurations ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Parameters = apply {
            if (validated) {
                return@apply
            }

            webhookConfigurations().ifPresent { it.forEach { it.validate() } }
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
            (webhookConfigurations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** Configuration for a single outbound webhook endpoint. */
        class WebhookConfiguration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val webhookEvents: JsonField<List<WebhookEvent>>,
            private val webhookHeaders: JsonField<WebhookHeaders>,
            private val webhookOutputFormat: JsonField<String>,
            private val webhookSigningSecret: JsonField<String>,
            private val webhookUrl: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("webhook_events")
                @ExcludeMissing
                webhookEvents: JsonField<List<WebhookEvent>> = JsonMissing.of(),
                @JsonProperty("webhook_headers")
                @ExcludeMissing
                webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of(),
                @JsonProperty("webhook_output_format")
                @ExcludeMissing
                webhookOutputFormat: JsonField<String> = JsonMissing.of(),
                @JsonProperty("webhook_signing_secret")
                @ExcludeMissing
                webhookSigningSecret: JsonField<String> = JsonMissing.of(),
                @JsonProperty("webhook_url")
                @ExcludeMissing
                webhookUrl: JsonField<String> = JsonMissing.of(),
            ) : this(
                webhookEvents,
                webhookHeaders,
                webhookOutputFormat,
                webhookSigningSecret,
                webhookUrl,
                mutableMapOf(),
            )

            /**
             * Events to subscribe to (e.g. 'parse.success', 'extract.error'). If null, all events
             * are delivered.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun webhookEvents(): Optional<List<WebhookEvent>> =
                webhookEvents.getOptional("webhook_events")

            /**
             * Custom HTTP headers sent with each webhook request (e.g. auth tokens)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun webhookHeaders(): Optional<WebhookHeaders> =
                webhookHeaders.getOptional("webhook_headers")

            /**
             * Response format sent to the webhook: 'string' (default) or 'json'
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun webhookOutputFormat(): Optional<String> =
                webhookOutputFormat.getOptional("webhook_output_format")

            /**
             * Shared signing secret used to sign webhook deliveries. When set, each request
             * includes an HMAC-SHA256 signature of the request body in the 'LC-Signature' header
             * (value 'sha256=<hex>'). Recompute the HMAC over the raw request body with this secret
             * to verify the delivery is authentic.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun webhookSigningSecret(): Optional<String> =
                webhookSigningSecret.getOptional("webhook_signing_secret")

            /**
             * URL to receive webhook POST notifications
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

            /**
             * Returns the raw JSON value of [webhookEvents].
             *
             * Unlike [webhookEvents], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("webhook_events")
            @ExcludeMissing
            fun _webhookEvents(): JsonField<List<WebhookEvent>> = webhookEvents

            /**
             * Returns the raw JSON value of [webhookHeaders].
             *
             * Unlike [webhookHeaders], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("webhook_headers")
            @ExcludeMissing
            fun _webhookHeaders(): JsonField<WebhookHeaders> = webhookHeaders

            /**
             * Returns the raw JSON value of [webhookOutputFormat].
             *
             * Unlike [webhookOutputFormat], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("webhook_output_format")
            @ExcludeMissing
            fun _webhookOutputFormat(): JsonField<String> = webhookOutputFormat

            /**
             * Returns the raw JSON value of [webhookSigningSecret].
             *
             * Unlike [webhookSigningSecret], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("webhook_signing_secret")
            @ExcludeMissing
            fun _webhookSigningSecret(): JsonField<String> = webhookSigningSecret

            /**
             * Returns the raw JSON value of [webhookUrl].
             *
             * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("webhook_url")
            @ExcludeMissing
            fun _webhookUrl(): JsonField<String> = webhookUrl

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
                 * Returns a mutable builder for constructing an instance of [WebhookConfiguration].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WebhookConfiguration]. */
            class Builder internal constructor() {

                private var webhookEvents: JsonField<MutableList<WebhookEvent>>? = null
                private var webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of()
                private var webhookOutputFormat: JsonField<String> = JsonMissing.of()
                private var webhookSigningSecret: JsonField<String> = JsonMissing.of()
                private var webhookUrl: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(webhookConfiguration: WebhookConfiguration) = apply {
                    webhookEvents = webhookConfiguration.webhookEvents.map { it.toMutableList() }
                    webhookHeaders = webhookConfiguration.webhookHeaders
                    webhookOutputFormat = webhookConfiguration.webhookOutputFormat
                    webhookSigningSecret = webhookConfiguration.webhookSigningSecret
                    webhookUrl = webhookConfiguration.webhookUrl
                    additionalProperties = webhookConfiguration.additionalProperties.toMutableMap()
                }

                /**
                 * Events to subscribe to (e.g. 'parse.success', 'extract.error'). If null, all
                 * events are delivered.
                 */
                fun webhookEvents(webhookEvents: List<WebhookEvent>?) =
                    webhookEvents(JsonField.ofNullable(webhookEvents))

                /** Alias for calling [Builder.webhookEvents] with `webhookEvents.orElse(null)`. */
                fun webhookEvents(webhookEvents: Optional<List<WebhookEvent>>) =
                    webhookEvents(webhookEvents.getOrNull())

                /**
                 * Sets [Builder.webhookEvents] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webhookEvents] with a well-typed
                 * `List<WebhookEvent>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun webhookEvents(webhookEvents: JsonField<List<WebhookEvent>>) = apply {
                    this.webhookEvents = webhookEvents.map { it.toMutableList() }
                }

                /**
                 * Adds a single [WebhookEvent] to [webhookEvents].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addWebhookEvent(webhookEvent: WebhookEvent) = apply {
                    webhookEvents =
                        (webhookEvents ?: JsonField.of(mutableListOf())).also {
                            checkKnown("webhookEvents", it).add(webhookEvent)
                        }
                }

                /** Custom HTTP headers sent with each webhook request (e.g. auth tokens) */
                fun webhookHeaders(webhookHeaders: WebhookHeaders?) =
                    webhookHeaders(JsonField.ofNullable(webhookHeaders))

                /**
                 * Alias for calling [Builder.webhookHeaders] with `webhookHeaders.orElse(null)`.
                 */
                fun webhookHeaders(webhookHeaders: Optional<WebhookHeaders>) =
                    webhookHeaders(webhookHeaders.getOrNull())

                /**
                 * Sets [Builder.webhookHeaders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webhookHeaders] with a well-typed
                 * [WebhookHeaders] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun webhookHeaders(webhookHeaders: JsonField<WebhookHeaders>) = apply {
                    this.webhookHeaders = webhookHeaders
                }

                /** Response format sent to the webhook: 'string' (default) or 'json' */
                fun webhookOutputFormat(webhookOutputFormat: String?) =
                    webhookOutputFormat(JsonField.ofNullable(webhookOutputFormat))

                /**
                 * Alias for calling [Builder.webhookOutputFormat] with
                 * `webhookOutputFormat.orElse(null)`.
                 */
                fun webhookOutputFormat(webhookOutputFormat: Optional<String>) =
                    webhookOutputFormat(webhookOutputFormat.getOrNull())

                /**
                 * Sets [Builder.webhookOutputFormat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webhookOutputFormat] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun webhookOutputFormat(webhookOutputFormat: JsonField<String>) = apply {
                    this.webhookOutputFormat = webhookOutputFormat
                }

                /**
                 * Shared signing secret used to sign webhook deliveries. When set, each request
                 * includes an HMAC-SHA256 signature of the request body in the 'LC-Signature'
                 * header (value 'sha256=<hex>'). Recompute the HMAC over the raw request body with
                 * this secret to verify the delivery is authentic.
                 */
                fun webhookSigningSecret(webhookSigningSecret: String?) =
                    webhookSigningSecret(JsonField.ofNullable(webhookSigningSecret))

                /**
                 * Alias for calling [Builder.webhookSigningSecret] with
                 * `webhookSigningSecret.orElse(null)`.
                 */
                fun webhookSigningSecret(webhookSigningSecret: Optional<String>) =
                    webhookSigningSecret(webhookSigningSecret.getOrNull())

                /**
                 * Sets [Builder.webhookSigningSecret] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webhookSigningSecret] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun webhookSigningSecret(webhookSigningSecret: JsonField<String>) = apply {
                    this.webhookSigningSecret = webhookSigningSecret
                }

                /** URL to receive webhook POST notifications */
                fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

                /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
                fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

                /**
                 * Sets [Builder.webhookUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webhookUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun webhookUrl(webhookUrl: JsonField<String>) = apply {
                    this.webhookUrl = webhookUrl
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
                 * Returns an immutable instance of [WebhookConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): WebhookConfiguration =
                    WebhookConfiguration(
                        (webhookEvents ?: JsonMissing.of()).map { it.toImmutable() },
                        webhookHeaders,
                        webhookOutputFormat,
                        webhookSigningSecret,
                        webhookUrl,
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
            fun validate(): WebhookConfiguration = apply {
                if (validated) {
                    return@apply
                }

                webhookEvents().ifPresent { it.forEach { it.validate() } }
                webhookHeaders().ifPresent { it.validate() }
                webhookOutputFormat()
                webhookSigningSecret()
                webhookUrl()
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
                (webhookEvents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (webhookHeaders.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (webhookOutputFormat.asKnown().isPresent) 1 else 0) +
                    (if (webhookSigningSecret.asKnown().isPresent) 1 else 0) +
                    (if (webhookUrl.asKnown().isPresent) 1 else 0)

            class WebhookEvent
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CLASSIFY_CANCELLED = of("classify.cancelled")

                    @JvmField val CLASSIFY_ERROR = of("classify.error")

                    @JvmField val CLASSIFY_PARTIAL_SUCCESS = of("classify.partial_success")

                    @JvmField val CLASSIFY_PENDING = of("classify.pending")

                    @JvmField val CLASSIFY_RUNNING = of("classify.running")

                    @JvmField val CLASSIFY_SUCCESS = of("classify.success")

                    @JvmField val EXTRACT_CANCELLED = of("extract.cancelled")

                    @JvmField val EXTRACT_ERROR = of("extract.error")

                    @JvmField val EXTRACT_PARTIAL_SUCCESS = of("extract.partial_success")

                    @JvmField val EXTRACT_PENDING = of("extract.pending")

                    @JvmField val EXTRACT_SUCCESS = of("extract.success")

                    @JvmField val PARSE_CANCELLED = of("parse.cancelled")

                    @JvmField val PARSE_ERROR = of("parse.error")

                    @JvmField val PARSE_PARTIAL_SUCCESS = of("parse.partial_success")

                    @JvmField val PARSE_PENDING = of("parse.pending")

                    @JvmField val PARSE_RUNNING = of("parse.running")

                    @JvmField val PARSE_SUCCESS = of("parse.success")

                    @JvmField val SHEETS_CANCELLED = of("sheets.cancelled")

                    @JvmField val SHEETS_ERROR = of("sheets.error")

                    @JvmField val SHEETS_PARTIAL_SUCCESS = of("sheets.partial_success")

                    @JvmField val SHEETS_PENDING = of("sheets.pending")

                    @JvmField val SHEETS_SUCCESS = of("sheets.success")

                    @JvmField val SPLIT_CANCELLED = of("split.cancelled")

                    @JvmField val SPLIT_ERROR = of("split.error")

                    @JvmField val SPLIT_PENDING = of("split.pending")

                    @JvmField val SPLIT_PROCESSING = of("split.processing")

                    @JvmField val SPLIT_SUCCESS = of("split.success")

                    @JvmField val UNMAPPED_EVENT = of("unmapped_event")

                    @JvmStatic fun of(value: String) = WebhookEvent(JsonField.of(value))
                }

                /** An enum containing [WebhookEvent]'s known values. */
                enum class Known {
                    CLASSIFY_CANCELLED,
                    CLASSIFY_ERROR,
                    CLASSIFY_PARTIAL_SUCCESS,
                    CLASSIFY_PENDING,
                    CLASSIFY_RUNNING,
                    CLASSIFY_SUCCESS,
                    EXTRACT_CANCELLED,
                    EXTRACT_ERROR,
                    EXTRACT_PARTIAL_SUCCESS,
                    EXTRACT_PENDING,
                    EXTRACT_SUCCESS,
                    PARSE_CANCELLED,
                    PARSE_ERROR,
                    PARSE_PARTIAL_SUCCESS,
                    PARSE_PENDING,
                    PARSE_RUNNING,
                    PARSE_SUCCESS,
                    SHEETS_CANCELLED,
                    SHEETS_ERROR,
                    SHEETS_PARTIAL_SUCCESS,
                    SHEETS_PENDING,
                    SHEETS_SUCCESS,
                    SPLIT_CANCELLED,
                    SPLIT_ERROR,
                    SPLIT_PENDING,
                    SPLIT_PROCESSING,
                    SPLIT_SUCCESS,
                    UNMAPPED_EVENT,
                }

                /**
                 * An enum containing [WebhookEvent]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [WebhookEvent] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CLASSIFY_CANCELLED,
                    CLASSIFY_ERROR,
                    CLASSIFY_PARTIAL_SUCCESS,
                    CLASSIFY_PENDING,
                    CLASSIFY_RUNNING,
                    CLASSIFY_SUCCESS,
                    EXTRACT_CANCELLED,
                    EXTRACT_ERROR,
                    EXTRACT_PARTIAL_SUCCESS,
                    EXTRACT_PENDING,
                    EXTRACT_SUCCESS,
                    PARSE_CANCELLED,
                    PARSE_ERROR,
                    PARSE_PARTIAL_SUCCESS,
                    PARSE_PENDING,
                    PARSE_RUNNING,
                    PARSE_SUCCESS,
                    SHEETS_CANCELLED,
                    SHEETS_ERROR,
                    SHEETS_PARTIAL_SUCCESS,
                    SHEETS_PENDING,
                    SHEETS_SUCCESS,
                    SPLIT_CANCELLED,
                    SPLIT_ERROR,
                    SPLIT_PENDING,
                    SPLIT_PROCESSING,
                    SPLIT_SUCCESS,
                    UNMAPPED_EVENT,
                    /**
                     * An enum member indicating that [WebhookEvent] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CLASSIFY_CANCELLED -> Value.CLASSIFY_CANCELLED
                        CLASSIFY_ERROR -> Value.CLASSIFY_ERROR
                        CLASSIFY_PARTIAL_SUCCESS -> Value.CLASSIFY_PARTIAL_SUCCESS
                        CLASSIFY_PENDING -> Value.CLASSIFY_PENDING
                        CLASSIFY_RUNNING -> Value.CLASSIFY_RUNNING
                        CLASSIFY_SUCCESS -> Value.CLASSIFY_SUCCESS
                        EXTRACT_CANCELLED -> Value.EXTRACT_CANCELLED
                        EXTRACT_ERROR -> Value.EXTRACT_ERROR
                        EXTRACT_PARTIAL_SUCCESS -> Value.EXTRACT_PARTIAL_SUCCESS
                        EXTRACT_PENDING -> Value.EXTRACT_PENDING
                        EXTRACT_SUCCESS -> Value.EXTRACT_SUCCESS
                        PARSE_CANCELLED -> Value.PARSE_CANCELLED
                        PARSE_ERROR -> Value.PARSE_ERROR
                        PARSE_PARTIAL_SUCCESS -> Value.PARSE_PARTIAL_SUCCESS
                        PARSE_PENDING -> Value.PARSE_PENDING
                        PARSE_RUNNING -> Value.PARSE_RUNNING
                        PARSE_SUCCESS -> Value.PARSE_SUCCESS
                        SHEETS_CANCELLED -> Value.SHEETS_CANCELLED
                        SHEETS_ERROR -> Value.SHEETS_ERROR
                        SHEETS_PARTIAL_SUCCESS -> Value.SHEETS_PARTIAL_SUCCESS
                        SHEETS_PENDING -> Value.SHEETS_PENDING
                        SHEETS_SUCCESS -> Value.SHEETS_SUCCESS
                        SPLIT_CANCELLED -> Value.SPLIT_CANCELLED
                        SPLIT_ERROR -> Value.SPLIT_ERROR
                        SPLIT_PENDING -> Value.SPLIT_PENDING
                        SPLIT_PROCESSING -> Value.SPLIT_PROCESSING
                        SPLIT_SUCCESS -> Value.SPLIT_SUCCESS
                        UNMAPPED_EVENT -> Value.UNMAPPED_EVENT
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
                        CLASSIFY_CANCELLED -> Known.CLASSIFY_CANCELLED
                        CLASSIFY_ERROR -> Known.CLASSIFY_ERROR
                        CLASSIFY_PARTIAL_SUCCESS -> Known.CLASSIFY_PARTIAL_SUCCESS
                        CLASSIFY_PENDING -> Known.CLASSIFY_PENDING
                        CLASSIFY_RUNNING -> Known.CLASSIFY_RUNNING
                        CLASSIFY_SUCCESS -> Known.CLASSIFY_SUCCESS
                        EXTRACT_CANCELLED -> Known.EXTRACT_CANCELLED
                        EXTRACT_ERROR -> Known.EXTRACT_ERROR
                        EXTRACT_PARTIAL_SUCCESS -> Known.EXTRACT_PARTIAL_SUCCESS
                        EXTRACT_PENDING -> Known.EXTRACT_PENDING
                        EXTRACT_SUCCESS -> Known.EXTRACT_SUCCESS
                        PARSE_CANCELLED -> Known.PARSE_CANCELLED
                        PARSE_ERROR -> Known.PARSE_ERROR
                        PARSE_PARTIAL_SUCCESS -> Known.PARSE_PARTIAL_SUCCESS
                        PARSE_PENDING -> Known.PARSE_PENDING
                        PARSE_RUNNING -> Known.PARSE_RUNNING
                        PARSE_SUCCESS -> Known.PARSE_SUCCESS
                        SHEETS_CANCELLED -> Known.SHEETS_CANCELLED
                        SHEETS_ERROR -> Known.SHEETS_ERROR
                        SHEETS_PARTIAL_SUCCESS -> Known.SHEETS_PARTIAL_SUCCESS
                        SHEETS_PENDING -> Known.SHEETS_PENDING
                        SHEETS_SUCCESS -> Known.SHEETS_SUCCESS
                        SPLIT_CANCELLED -> Known.SPLIT_CANCELLED
                        SPLIT_ERROR -> Known.SPLIT_ERROR
                        SPLIT_PENDING -> Known.SPLIT_PENDING
                        SPLIT_PROCESSING -> Known.SPLIT_PROCESSING
                        SPLIT_SUCCESS -> Known.SPLIT_SUCCESS
                        UNMAPPED_EVENT -> Known.UNMAPPED_EVENT
                        else -> throw LlamaCloudInvalidDataException("Unknown WebhookEvent: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): WebhookEvent = apply {
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

                    return other is WebhookEvent && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Custom HTTP headers sent with each webhook request (e.g. auth tokens) */
            class WebhookHeaders
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
                     * Returns a mutable builder for constructing an instance of [WebhookHeaders].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WebhookHeaders]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(webhookHeaders: WebhookHeaders) = apply {
                        additionalProperties = webhookHeaders.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [WebhookHeaders].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): WebhookHeaders = WebhookHeaders(additionalProperties.toImmutable())
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
                fun validate(): WebhookHeaders = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WebhookHeaders &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WebhookHeaders{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WebhookConfiguration &&
                    webhookEvents == other.webhookEvents &&
                    webhookHeaders == other.webhookHeaders &&
                    webhookOutputFormat == other.webhookOutputFormat &&
                    webhookSigningSecret == other.webhookSigningSecret &&
                    webhookUrl == other.webhookUrl &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    webhookEvents,
                    webhookHeaders,
                    webhookOutputFormat,
                    webhookSigningSecret,
                    webhookUrl,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WebhookConfiguration{webhookEvents=$webhookEvents, webhookHeaders=$webhookHeaders, webhookOutputFormat=$webhookOutputFormat, webhookSigningSecret=$webhookSigningSecret, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Parameters &&
                webhookConfigurations == other.webhookConfigurations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(webhookConfigurations, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Parameters{webhookConfigurations=$webhookConfigurations, additionalProperties=$additionalProperties}"
    }

    /** A summary of a single extracted region from a spreadsheet */
    class Region
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val location: JsonField<String>,
        private val regionType: JsonField<String>,
        private val sheetName: JsonField<String>,
        private val description: JsonField<String>,
        private val regionId: JsonField<String>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region_type")
            @ExcludeMissing
            regionType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sheet_name")
            @ExcludeMissing
            sheetName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region_id")
            @ExcludeMissing
            regionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(location, regionType, sheetName, description, regionId, title, mutableMapOf())

        /**
         * Location of the region in the spreadsheet
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun location(): String = location.getRequired("location")

        /**
         * Type of the extracted region
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun regionType(): String = regionType.getRequired("region_type")

        /**
         * Worksheet name where region was found
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sheetName(): String = sheetName.getRequired("sheet_name")

        /**
         * Generated description for the region
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Unique identifier for this region within the file
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun regionId(): Optional<String> = regionId.getOptional("region_id")

        /**
         * Generated title for the region
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

        /**
         * Returns the raw JSON value of [regionType].
         *
         * Unlike [regionType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region_type")
        @ExcludeMissing
        fun _regionType(): JsonField<String> = regionType

        /**
         * Returns the raw JSON value of [sheetName].
         *
         * Unlike [sheetName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sheet_name") @ExcludeMissing fun _sheetName(): JsonField<String> = sheetName

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [regionId].
         *
         * Unlike [regionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region_id") @ExcludeMissing fun _regionId(): JsonField<String> = regionId

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
             * Returns a mutable builder for constructing an instance of [Region].
             *
             * The following fields are required:
             * ```java
             * .location()
             * .regionType()
             * .sheetName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Region]. */
        class Builder internal constructor() {

            private var location: JsonField<String>? = null
            private var regionType: JsonField<String>? = null
            private var sheetName: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var regionId: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(region: Region) = apply {
                location = region.location
                regionType = region.regionType
                sheetName = region.sheetName
                description = region.description
                regionId = region.regionId
                title = region.title
                additionalProperties = region.additionalProperties.toMutableMap()
            }

            /** Location of the region in the spreadsheet */
            fun location(location: String) = location(JsonField.of(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<String>) = apply { this.location = location }

            /** Type of the extracted region */
            fun regionType(regionType: String) = regionType(JsonField.of(regionType))

            /**
             * Sets [Builder.regionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun regionType(regionType: JsonField<String>) = apply { this.regionType = regionType }

            /** Worksheet name where region was found */
            fun sheetName(sheetName: String) = sheetName(JsonField.of(sheetName))

            /**
             * Sets [Builder.sheetName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sheetName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sheetName(sheetName: JsonField<String>) = apply { this.sheetName = sheetName }

            /** Generated description for the region */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Unique identifier for this region within the file */
            fun regionId(regionId: String) = regionId(JsonField.of(regionId))

            /**
             * Sets [Builder.regionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun regionId(regionId: JsonField<String>) = apply { this.regionId = regionId }

            /** Generated title for the region */
            fun title(title: String?) = title(JsonField.ofNullable(title))

            /** Alias for calling [Builder.title] with `title.orElse(null)`. */
            fun title(title: Optional<String>) = title(title.getOrNull())

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [Region].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .location()
             * .regionType()
             * .sheetName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Region =
                Region(
                    checkRequired("location", location),
                    checkRequired("regionType", regionType),
                    checkRequired("sheetName", sheetName),
                    description,
                    regionId,
                    title,
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
        fun validate(): Region = apply {
            if (validated) {
                return@apply
            }

            location()
            regionType()
            sheetName()
            description()
            regionId()
            title()
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
            (if (location.asKnown().isPresent) 1 else 0) +
                (if (regionType.asKnown().isPresent) 1 else 0) +
                (if (sheetName.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (regionId.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Region &&
                location == other.location &&
                regionType == other.regionType &&
                sheetName == other.sheetName &&
                description == other.description &&
                regionId == other.regionId &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                location,
                regionType,
                sheetName,
                description,
                regionId,
                title,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Region{location=$location, regionType=$regionType, sheetName=$sheetName, description=$description, regionId=$regionId, title=$title, additionalProperties=$additionalProperties}"
    }

    /** Metadata about a worksheet in a spreadsheet */
    class WorksheetMetadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val sheetName: JsonField<String>,
        private val description: JsonField<String>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sheet_name")
            @ExcludeMissing
            sheetName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(sheetName, description, title, mutableMapOf())

        /**
         * Name of the worksheet
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sheetName(): String = sheetName.getRequired("sheet_name")

        /**
         * Generated description of the worksheet
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Generated title for the worksheet
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [sheetName].
         *
         * Unlike [sheetName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sheet_name") @ExcludeMissing fun _sheetName(): JsonField<String> = sheetName

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
             * Returns a mutable builder for constructing an instance of [WorksheetMetadata].
             *
             * The following fields are required:
             * ```java
             * .sheetName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WorksheetMetadata]. */
        class Builder internal constructor() {

            private var sheetName: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(worksheetMetadata: WorksheetMetadata) = apply {
                sheetName = worksheetMetadata.sheetName
                description = worksheetMetadata.description
                title = worksheetMetadata.title
                additionalProperties = worksheetMetadata.additionalProperties.toMutableMap()
            }

            /** Name of the worksheet */
            fun sheetName(sheetName: String) = sheetName(JsonField.of(sheetName))

            /**
             * Sets [Builder.sheetName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sheetName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sheetName(sheetName: JsonField<String>) = apply { this.sheetName = sheetName }

            /** Generated description of the worksheet */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Generated title for the worksheet */
            fun title(title: String?) = title(JsonField.ofNullable(title))

            /** Alias for calling [Builder.title] with `title.orElse(null)`. */
            fun title(title: Optional<String>) = title(title.getOrNull())

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [WorksheetMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .sheetName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): WorksheetMetadata =
                WorksheetMetadata(
                    checkRequired("sheetName", sheetName),
                    description,
                    title,
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
        fun validate(): WorksheetMetadata = apply {
            if (validated) {
                return@apply
            }

            sheetName()
            description()
            title()
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
            (if (sheetName.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WorksheetMetadata &&
                sheetName == other.sheetName &&
                description == other.description &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(sheetName, description, title, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WorksheetMetadata{sheetName=$sheetName, description=$description, title=$title, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SheetsJob &&
            id == other.id &&
            configuration == other.configuration &&
            createdAt == other.createdAt &&
            fileId == other.fileId &&
            projectId == other.projectId &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            userId == other.userId &&
            config == other.config &&
            configurationId == other.configurationId &&
            errors == other.errors &&
            file == other.file &&
            metadataStateTransitions == other.metadataStateTransitions &&
            parameters == other.parameters &&
            regions == other.regions &&
            success == other.success &&
            worksheetMetadata == other.worksheetMetadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            configuration,
            createdAt,
            fileId,
            projectId,
            status,
            updatedAt,
            userId,
            config,
            configurationId,
            errors,
            file,
            metadataStateTransitions,
            parameters,
            regions,
            success,
            worksheetMetadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SheetsJob{id=$id, configuration=$configuration, createdAt=$createdAt, fileId=$fileId, projectId=$projectId, status=$status, updatedAt=$updatedAt, userId=$userId, config=$config, configurationId=$configurationId, errors=$errors, file=$file, metadataStateTransitions=$metadataStateTransitions, parameters=$parameters, regions=$regions, success=$success, worksheetMetadata=$worksheetMetadata, additionalProperties=$additionalProperties}"
}
