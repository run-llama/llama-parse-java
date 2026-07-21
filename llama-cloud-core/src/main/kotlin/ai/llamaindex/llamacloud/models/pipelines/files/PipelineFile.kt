// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.files

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
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

/** A file associated with a pipeline. */
class PipelineFile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val pipelineId: JsonField<String>,
    private val configHash: JsonField<ConfigHash>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customMetadata: JsonField<CustomMetadata>,
    private val dataSourceId: JsonField<String>,
    private val externalFileId: JsonField<String>,
    private val fileId: JsonField<String>,
    private val fileSize: JsonField<Long>,
    private val fileType: JsonField<String>,
    private val indexedPageCount: JsonField<Long>,
    private val lastModifiedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val permissionInfo: JsonField<PermissionInfo>,
    private val projectId: JsonField<String>,
    private val resourceInfo: JsonField<ResourceInfo>,
    private val status: JsonField<Status>,
    private val statusUpdatedAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pipeline_id")
        @ExcludeMissing
        pipelineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config_hash")
        @ExcludeMissing
        configHash: JsonField<ConfigHash> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_metadata")
        @ExcludeMissing
        customMetadata: JsonField<CustomMetadata> = JsonMissing.of(),
        @JsonProperty("data_source_id")
        @ExcludeMissing
        dataSourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_file_id")
        @ExcludeMissing
        externalFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_size") @ExcludeMissing fileSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("file_type") @ExcludeMissing fileType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("indexed_page_count")
        @ExcludeMissing
        indexedPageCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("last_modified_at")
        @ExcludeMissing
        lastModifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permission_info")
        @ExcludeMissing
        permissionInfo: JsonField<PermissionInfo> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_info")
        @ExcludeMissing
        resourceInfo: JsonField<ResourceInfo> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("status_updated_at")
        @ExcludeMissing
        statusUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        pipelineId,
        configHash,
        createdAt,
        customMetadata,
        dataSourceId,
        externalFileId,
        fileId,
        fileSize,
        fileType,
        indexedPageCount,
        lastModifiedAt,
        name,
        permissionInfo,
        projectId,
        resourceInfo,
        status,
        statusUpdatedAt,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the pipeline file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The ID of the pipeline that the file is associated with.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pipelineId(): String = pipelineId.getRequired("pipeline_id")

    /**
     * Hashes for the configuration of the pipeline.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configHash(): Optional<ConfigHash> = configHash.getOptional("config_hash")

    /**
     * When the pipeline file was created.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Custom metadata for the file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customMetadata(): Optional<CustomMetadata> = customMetadata.getOptional("custom_metadata")

    /**
     * The ID of the data source that the file belongs to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSourceId(): Optional<String> = dataSourceId.getOptional("data_source_id")

    /**
     * The ID of the file in the external system.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalFileId(): Optional<String> = externalFileId.getOptional("external_file_id")

    /**
     * The ID of the file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileId(): Optional<String> = fileId.getOptional("file_id")

    /**
     * Size of the file in bytes.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileSize(): Optional<Long> = fileSize.getOptional("file_size")

    /**
     * File type (e.g. pdf, docx, etc.).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileType(): Optional<String> = fileType.getOptional("file_type")

    /**
     * The number of pages that have been indexed for this file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indexedPageCount(): Optional<Long> = indexedPageCount.getOptional("indexed_page_count")

    /**
     * The last modified time of the file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedAt(): Optional<OffsetDateTime> = lastModifiedAt.getOptional("last_modified_at")

    /**
     * Name of the file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Permission information for the file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissionInfo(): Optional<PermissionInfo> = permissionInfo.getOptional("permission_info")

    /**
     * The ID of the project that the file belongs to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectId(): Optional<String> = projectId.getOptional("project_id")

    /**
     * Resource information for the file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceInfo(): Optional<ResourceInfo> = resourceInfo.getOptional("resource_info")

    /**
     * Status of the pipeline file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * The last time the status was updated.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusUpdatedAt(): Optional<OffsetDateTime> =
        statusUpdatedAt.getOptional("status_updated_at")

    /**
     * When the pipeline file was last updated.
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
     * Returns the raw JSON value of [pipelineId].
     *
     * Unlike [pipelineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pipeline_id") @ExcludeMissing fun _pipelineId(): JsonField<String> = pipelineId

    /**
     * Returns the raw JSON value of [configHash].
     *
     * Unlike [configHash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config_hash")
    @ExcludeMissing
    fun _configHash(): JsonField<ConfigHash> = configHash

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customMetadata].
     *
     * Unlike [customMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_metadata")
    @ExcludeMissing
    fun _customMetadata(): JsonField<CustomMetadata> = customMetadata

    /**
     * Returns the raw JSON value of [dataSourceId].
     *
     * Unlike [dataSourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_source_id")
    @ExcludeMissing
    fun _dataSourceId(): JsonField<String> = dataSourceId

    /**
     * Returns the raw JSON value of [externalFileId].
     *
     * Unlike [externalFileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_file_id")
    @ExcludeMissing
    fun _externalFileId(): JsonField<String> = externalFileId

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [fileSize].
     *
     * Unlike [fileSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_size") @ExcludeMissing fun _fileSize(): JsonField<Long> = fileSize

    /**
     * Returns the raw JSON value of [fileType].
     *
     * Unlike [fileType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_type") @ExcludeMissing fun _fileType(): JsonField<String> = fileType

    /**
     * Returns the raw JSON value of [indexedPageCount].
     *
     * Unlike [indexedPageCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("indexed_page_count")
    @ExcludeMissing
    fun _indexedPageCount(): JsonField<Long> = indexedPageCount

    /**
     * Returns the raw JSON value of [lastModifiedAt].
     *
     * Unlike [lastModifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_modified_at")
    @ExcludeMissing
    fun _lastModifiedAt(): JsonField<OffsetDateTime> = lastModifiedAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [permissionInfo].
     *
     * Unlike [permissionInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permission_info")
    @ExcludeMissing
    fun _permissionInfo(): JsonField<PermissionInfo> = permissionInfo

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [resourceInfo].
     *
     * Unlike [resourceInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_info")
    @ExcludeMissing
    fun _resourceInfo(): JsonField<ResourceInfo> = resourceInfo

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [statusUpdatedAt].
     *
     * Unlike [statusUpdatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_updated_at")
    @ExcludeMissing
    fun _statusUpdatedAt(): JsonField<OffsetDateTime> = statusUpdatedAt

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
         * Returns a mutable builder for constructing an instance of [PipelineFile].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .pipelineId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineFile]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var pipelineId: JsonField<String>? = null
        private var configHash: JsonField<ConfigHash> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customMetadata: JsonField<CustomMetadata> = JsonMissing.of()
        private var dataSourceId: JsonField<String> = JsonMissing.of()
        private var externalFileId: JsonField<String> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var fileSize: JsonField<Long> = JsonMissing.of()
        private var fileType: JsonField<String> = JsonMissing.of()
        private var indexedPageCount: JsonField<Long> = JsonMissing.of()
        private var lastModifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var permissionInfo: JsonField<PermissionInfo> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var resourceInfo: JsonField<ResourceInfo> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusUpdatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pipelineFile: PipelineFile) = apply {
            id = pipelineFile.id
            pipelineId = pipelineFile.pipelineId
            configHash = pipelineFile.configHash
            createdAt = pipelineFile.createdAt
            customMetadata = pipelineFile.customMetadata
            dataSourceId = pipelineFile.dataSourceId
            externalFileId = pipelineFile.externalFileId
            fileId = pipelineFile.fileId
            fileSize = pipelineFile.fileSize
            fileType = pipelineFile.fileType
            indexedPageCount = pipelineFile.indexedPageCount
            lastModifiedAt = pipelineFile.lastModifiedAt
            name = pipelineFile.name
            permissionInfo = pipelineFile.permissionInfo
            projectId = pipelineFile.projectId
            resourceInfo = pipelineFile.resourceInfo
            status = pipelineFile.status
            statusUpdatedAt = pipelineFile.statusUpdatedAt
            updatedAt = pipelineFile.updatedAt
            additionalProperties = pipelineFile.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the pipeline file. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The ID of the pipeline that the file is associated with. */
        fun pipelineId(pipelineId: String) = pipelineId(JsonField.of(pipelineId))

        /**
         * Sets [Builder.pipelineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pipelineId(pipelineId: JsonField<String>) = apply { this.pipelineId = pipelineId }

        /** Hashes for the configuration of the pipeline. */
        fun configHash(configHash: ConfigHash?) = configHash(JsonField.ofNullable(configHash))

        /** Alias for calling [Builder.configHash] with `configHash.orElse(null)`. */
        fun configHash(configHash: Optional<ConfigHash>) = configHash(configHash.getOrNull())

        /**
         * Sets [Builder.configHash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configHash] with a well-typed [ConfigHash] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configHash(configHash: JsonField<ConfigHash>) = apply { this.configHash = configHash }

        /** When the pipeline file was created. */
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

        /** Custom metadata for the file. */
        fun customMetadata(customMetadata: CustomMetadata?) =
            customMetadata(JsonField.ofNullable(customMetadata))

        /** Alias for calling [Builder.customMetadata] with `customMetadata.orElse(null)`. */
        fun customMetadata(customMetadata: Optional<CustomMetadata>) =
            customMetadata(customMetadata.getOrNull())

        /**
         * Sets [Builder.customMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customMetadata] with a well-typed [CustomMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customMetadata(customMetadata: JsonField<CustomMetadata>) = apply {
            this.customMetadata = customMetadata
        }

        /** The ID of the data source that the file belongs to. */
        fun dataSourceId(dataSourceId: String?) = dataSourceId(JsonField.ofNullable(dataSourceId))

        /** Alias for calling [Builder.dataSourceId] with `dataSourceId.orElse(null)`. */
        fun dataSourceId(dataSourceId: Optional<String>) = dataSourceId(dataSourceId.getOrNull())

        /**
         * Sets [Builder.dataSourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataSourceId(dataSourceId: JsonField<String>) = apply {
            this.dataSourceId = dataSourceId
        }

        /** The ID of the file in the external system. */
        fun externalFileId(externalFileId: String?) =
            externalFileId(JsonField.ofNullable(externalFileId))

        /** Alias for calling [Builder.externalFileId] with `externalFileId.orElse(null)`. */
        fun externalFileId(externalFileId: Optional<String>) =
            externalFileId(externalFileId.getOrNull())

        /**
         * Sets [Builder.externalFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalFileId(externalFileId: JsonField<String>) = apply {
            this.externalFileId = externalFileId
        }

        /** The ID of the file. */
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

        /** Size of the file in bytes. */
        fun fileSize(fileSize: Long?) = fileSize(JsonField.ofNullable(fileSize))

        /**
         * Alias for [Builder.fileSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fileSize(fileSize: Long) = fileSize(fileSize as Long?)

        /** Alias for calling [Builder.fileSize] with `fileSize.orElse(null)`. */
        fun fileSize(fileSize: Optional<Long>) = fileSize(fileSize.getOrNull())

        /**
         * Sets [Builder.fileSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileSize(fileSize: JsonField<Long>) = apply { this.fileSize = fileSize }

        /** File type (e.g. pdf, docx, etc.). */
        fun fileType(fileType: String?) = fileType(JsonField.ofNullable(fileType))

        /** Alias for calling [Builder.fileType] with `fileType.orElse(null)`. */
        fun fileType(fileType: Optional<String>) = fileType(fileType.getOrNull())

        /**
         * Sets [Builder.fileType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileType(fileType: JsonField<String>) = apply { this.fileType = fileType }

        /** The number of pages that have been indexed for this file. */
        fun indexedPageCount(indexedPageCount: Long?) =
            indexedPageCount(JsonField.ofNullable(indexedPageCount))

        /**
         * Alias for [Builder.indexedPageCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun indexedPageCount(indexedPageCount: Long) = indexedPageCount(indexedPageCount as Long?)

        /** Alias for calling [Builder.indexedPageCount] with `indexedPageCount.orElse(null)`. */
        fun indexedPageCount(indexedPageCount: Optional<Long>) =
            indexedPageCount(indexedPageCount.getOrNull())

        /**
         * Sets [Builder.indexedPageCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexedPageCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indexedPageCount(indexedPageCount: JsonField<Long>) = apply {
            this.indexedPageCount = indexedPageCount
        }

        /** The last modified time of the file. */
        fun lastModifiedAt(lastModifiedAt: OffsetDateTime?) =
            lastModifiedAt(JsonField.ofNullable(lastModifiedAt))

        /** Alias for calling [Builder.lastModifiedAt] with `lastModifiedAt.orElse(null)`. */
        fun lastModifiedAt(lastModifiedAt: Optional<OffsetDateTime>) =
            lastModifiedAt(lastModifiedAt.getOrNull())

        /**
         * Sets [Builder.lastModifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastModifiedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastModifiedAt(lastModifiedAt: JsonField<OffsetDateTime>) = apply {
            this.lastModifiedAt = lastModifiedAt
        }

        /** Name of the file. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Permission information for the file. */
        fun permissionInfo(permissionInfo: PermissionInfo?) =
            permissionInfo(JsonField.ofNullable(permissionInfo))

        /** Alias for calling [Builder.permissionInfo] with `permissionInfo.orElse(null)`. */
        fun permissionInfo(permissionInfo: Optional<PermissionInfo>) =
            permissionInfo(permissionInfo.getOrNull())

        /**
         * Sets [Builder.permissionInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissionInfo] with a well-typed [PermissionInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permissionInfo(permissionInfo: JsonField<PermissionInfo>) = apply {
            this.permissionInfo = permissionInfo
        }

        /** The ID of the project that the file belongs to. */
        fun projectId(projectId: String?) = projectId(JsonField.ofNullable(projectId))

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Resource information for the file. */
        fun resourceInfo(resourceInfo: ResourceInfo?) =
            resourceInfo(JsonField.ofNullable(resourceInfo))

        /** Alias for calling [Builder.resourceInfo] with `resourceInfo.orElse(null)`. */
        fun resourceInfo(resourceInfo: Optional<ResourceInfo>) =
            resourceInfo(resourceInfo.getOrNull())

        /**
         * Sets [Builder.resourceInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceInfo] with a well-typed [ResourceInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resourceInfo(resourceInfo: JsonField<ResourceInfo>) = apply {
            this.resourceInfo = resourceInfo
        }

        /** Status of the pipeline file. */
        fun status(status: Status?) = status(JsonField.ofNullable(status))

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The last time the status was updated. */
        fun statusUpdatedAt(statusUpdatedAt: OffsetDateTime?) =
            statusUpdatedAt(JsonField.ofNullable(statusUpdatedAt))

        /** Alias for calling [Builder.statusUpdatedAt] with `statusUpdatedAt.orElse(null)`. */
        fun statusUpdatedAt(statusUpdatedAt: Optional<OffsetDateTime>) =
            statusUpdatedAt(statusUpdatedAt.getOrNull())

        /**
         * Sets [Builder.statusUpdatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusUpdatedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun statusUpdatedAt(statusUpdatedAt: JsonField<OffsetDateTime>) = apply {
            this.statusUpdatedAt = statusUpdatedAt
        }

        /** When the pipeline file was last updated. */
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
         * Returns an immutable instance of [PipelineFile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .pipelineId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PipelineFile =
            PipelineFile(
                checkRequired("id", id),
                checkRequired("pipelineId", pipelineId),
                configHash,
                createdAt,
                customMetadata,
                dataSourceId,
                externalFileId,
                fileId,
                fileSize,
                fileType,
                indexedPageCount,
                lastModifiedAt,
                name,
                permissionInfo,
                projectId,
                resourceInfo,
                status,
                statusUpdatedAt,
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
    fun validate(): PipelineFile = apply {
        if (validated) {
            return@apply
        }

        id()
        pipelineId()
        configHash().ifPresent { it.validate() }
        createdAt()
        customMetadata().ifPresent { it.validate() }
        dataSourceId()
        externalFileId()
        fileId()
        fileSize()
        fileType()
        indexedPageCount()
        lastModifiedAt()
        name()
        permissionInfo().ifPresent { it.validate() }
        projectId()
        resourceInfo().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
        statusUpdatedAt()
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
            (if (pipelineId.asKnown().isPresent) 1 else 0) +
            (configHash.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (customMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dataSourceId.asKnown().isPresent) 1 else 0) +
            (if (externalFileId.asKnown().isPresent) 1 else 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (if (fileSize.asKnown().isPresent) 1 else 0) +
            (if (fileType.asKnown().isPresent) 1 else 0) +
            (if (indexedPageCount.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (permissionInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (resourceInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (statusUpdatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Hashes for the configuration of the pipeline. */
    class ConfigHash
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

            /** Returns a mutable builder for constructing an instance of [ConfigHash]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConfigHash]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configHash: ConfigHash) = apply {
                additionalProperties = configHash.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ConfigHash].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConfigHash = ConfigHash(additionalProperties.toImmutable())
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
        fun validate(): ConfigHash = apply {
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

            return other is ConfigHash && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ConfigHash{additionalProperties=$additionalProperties}"
    }

    /** Custom metadata for the file. */
    class CustomMetadata
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

            /** Returns a mutable builder for constructing an instance of [CustomMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customMetadata: CustomMetadata) = apply {
                additionalProperties = customMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomMetadata = CustomMetadata(additionalProperties.toImmutable())
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
        fun validate(): CustomMetadata = apply {
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

            return other is CustomMetadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomMetadata{additionalProperties=$additionalProperties}"
    }

    /** Permission information for the file. */
    class PermissionInfo
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

            /** Returns a mutable builder for constructing an instance of [PermissionInfo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PermissionInfo]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(permissionInfo: PermissionInfo) = apply {
                additionalProperties = permissionInfo.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PermissionInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PermissionInfo = PermissionInfo(additionalProperties.toImmutable())
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
        fun validate(): PermissionInfo = apply {
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

            return other is PermissionInfo && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PermissionInfo{additionalProperties=$additionalProperties}"
    }

    /** Resource information for the file. */
    class ResourceInfo
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

            /** Returns a mutable builder for constructing an instance of [ResourceInfo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResourceInfo]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resourceInfo: ResourceInfo) = apply {
                additionalProperties = resourceInfo.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ResourceInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ResourceInfo = ResourceInfo(additionalProperties.toImmutable())
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
        fun validate(): ResourceInfo = apply {
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

            return other is ResourceInfo && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ResourceInfo{additionalProperties=$additionalProperties}"
    }

    /** Status of the pipeline file. */
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

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            ERROR,
            IN_PROGRESS,
            NOT_STARTED,
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelineFile &&
            id == other.id &&
            pipelineId == other.pipelineId &&
            configHash == other.configHash &&
            createdAt == other.createdAt &&
            customMetadata == other.customMetadata &&
            dataSourceId == other.dataSourceId &&
            externalFileId == other.externalFileId &&
            fileId == other.fileId &&
            fileSize == other.fileSize &&
            fileType == other.fileType &&
            indexedPageCount == other.indexedPageCount &&
            lastModifiedAt == other.lastModifiedAt &&
            name == other.name &&
            permissionInfo == other.permissionInfo &&
            projectId == other.projectId &&
            resourceInfo == other.resourceInfo &&
            status == other.status &&
            statusUpdatedAt == other.statusUpdatedAt &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            pipelineId,
            configHash,
            createdAt,
            customMetadata,
            dataSourceId,
            externalFileId,
            fileId,
            fileSize,
            fileType,
            indexedPageCount,
            lastModifiedAt,
            name,
            permissionInfo,
            projectId,
            resourceInfo,
            status,
            statusUpdatedAt,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PipelineFile{id=$id, pipelineId=$pipelineId, configHash=$configHash, createdAt=$createdAt, customMetadata=$customMetadata, dataSourceId=$dataSourceId, externalFileId=$externalFileId, fileId=$fileId, fileSize=$fileSize, fileType=$fileType, indexedPageCount=$indexedPageCount, lastModifiedAt=$lastModifiedAt, name=$name, permissionInfo=$permissionInfo, projectId=$projectId, resourceInfo=$resourceInfo, status=$status, statusUpdatedAt=$statusUpdatedAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
