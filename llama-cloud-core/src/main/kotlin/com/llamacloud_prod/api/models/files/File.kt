// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.files

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema for a file. */
class File
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val projectId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dataSourceId: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val externalFileId: JsonField<String>,
    private val fileSize: JsonField<Long>,
    private val fileType: JsonField<String>,
    private val lastModifiedAt: JsonField<OffsetDateTime>,
    private val permissionInfo: JsonField<PermissionInfo>,
    private val purpose: JsonField<String>,
    private val resourceInfo: JsonField<ResourceInfo>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("data_source_id")
        @ExcludeMissing
        dataSourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_file_id")
        @ExcludeMissing
        externalFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_size") @ExcludeMissing fileSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("file_type") @ExcludeMissing fileType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_modified_at")
        @ExcludeMissing
        lastModifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("permission_info")
        @ExcludeMissing
        permissionInfo: JsonField<PermissionInfo> = JsonMissing.of(),
        @JsonProperty("purpose") @ExcludeMissing purpose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_info")
        @ExcludeMissing
        resourceInfo: JsonField<ResourceInfo> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        name,
        projectId,
        createdAt,
        dataSourceId,
        expiresAt,
        externalFileId,
        fileSize,
        fileType,
        lastModifiedAt,
        permissionInfo,
        purpose,
        resourceInfo,
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
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The ID of the project that the file belongs to
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The ID of the data source that the file belongs to
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSourceId(): Optional<String> = dataSourceId.getOptional("data_source_id")

    /**
     * The expiration date for the file. Files past this date can be deleted.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * The ID of the file in the external system
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalFileId(): Optional<String> = externalFileId.getOptional("external_file_id")

    /**
     * Size of the file in bytes
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileSize(): Optional<Long> = fileSize.getOptional("file_size")

    /**
     * File type (e.g. pdf, docx, etc.)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileType(): Optional<String> = fileType.getOptional("file_type")

    /**
     * The last modified time of the file
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedAt(): Optional<OffsetDateTime> = lastModifiedAt.getOptional("last_modified_at")

    /**
     * Permission information for the file
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissionInfo(): Optional<PermissionInfo> = permissionInfo.getOptional("permission_info")

    /**
     * The intended purpose of the file (e.g., 'user_data', 'parse', 'extract', 'split', 'classify')
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purpose(): Optional<String> = purpose.getOptional("purpose")

    /**
     * Resource information for the file
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceInfo(): Optional<ResourceInfo> = resourceInfo.getOptional("resource_info")

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [dataSourceId].
     *
     * Unlike [dataSourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_source_id")
    @ExcludeMissing
    fun _dataSourceId(): JsonField<String> = dataSourceId

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [externalFileId].
     *
     * Unlike [externalFileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_file_id")
    @ExcludeMissing
    fun _externalFileId(): JsonField<String> = externalFileId

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
     * Returns the raw JSON value of [lastModifiedAt].
     *
     * Unlike [lastModifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_modified_at")
    @ExcludeMissing
    fun _lastModifiedAt(): JsonField<OffsetDateTime> = lastModifiedAt

    /**
     * Returns the raw JSON value of [permissionInfo].
     *
     * Unlike [permissionInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permission_info")
    @ExcludeMissing
    fun _permissionInfo(): JsonField<PermissionInfo> = permissionInfo

    /**
     * Returns the raw JSON value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

    /**
     * Returns the raw JSON value of [resourceInfo].
     *
     * Unlike [resourceInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_info")
    @ExcludeMissing
    fun _resourceInfo(): JsonField<ResourceInfo> = resourceInfo

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
         * Returns a mutable builder for constructing an instance of [File].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .projectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [File]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dataSourceId: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalFileId: JsonField<String> = JsonMissing.of()
        private var fileSize: JsonField<Long> = JsonMissing.of()
        private var fileType: JsonField<String> = JsonMissing.of()
        private var lastModifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var permissionInfo: JsonField<PermissionInfo> = JsonMissing.of()
        private var purpose: JsonField<String> = JsonMissing.of()
        private var resourceInfo: JsonField<ResourceInfo> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(file: File) = apply {
            id = file.id
            name = file.name
            projectId = file.projectId
            createdAt = file.createdAt
            dataSourceId = file.dataSourceId
            expiresAt = file.expiresAt
            externalFileId = file.externalFileId
            fileSize = file.fileSize
            fileType = file.fileType
            lastModifiedAt = file.lastModifiedAt
            permissionInfo = file.permissionInfo
            purpose = file.purpose
            resourceInfo = file.resourceInfo
            updatedAt = file.updatedAt
            additionalProperties = file.additionalProperties.toMutableMap()
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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The ID of the project that the file belongs to */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

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

        /** The ID of the data source that the file belongs to */
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

        /** The expiration date for the file. Files past this date can be deleted. */
        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** The ID of the file in the external system */
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

        /** Size of the file in bytes */
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

        /** File type (e.g. pdf, docx, etc.) */
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

        /** The last modified time of the file */
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

        /** Permission information for the file */
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

        /**
         * The intended purpose of the file (e.g., 'user_data', 'parse', 'extract', 'split',
         * 'classify')
         */
        fun purpose(purpose: String?) = purpose(JsonField.ofNullable(purpose))

        /** Alias for calling [Builder.purpose] with `purpose.orElse(null)`. */
        fun purpose(purpose: Optional<String>) = purpose(purpose.getOrNull())

        /**
         * Sets [Builder.purpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purpose] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

        /** Resource information for the file */
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
         * Returns an immutable instance of [File].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .projectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): File =
            File(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("projectId", projectId),
                createdAt,
                dataSourceId,
                expiresAt,
                externalFileId,
                fileSize,
                fileType,
                lastModifiedAt,
                permissionInfo,
                purpose,
                resourceInfo,
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
    fun validate(): File = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        projectId()
        createdAt()
        dataSourceId()
        expiresAt()
        externalFileId()
        fileSize()
        fileType()
        lastModifiedAt()
        permissionInfo().ifPresent { it.validate() }
        purpose()
        resourceInfo().ifPresent { it.validate() }
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (dataSourceId.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (externalFileId.asKnown().isPresent) 1 else 0) +
            (if (fileSize.asKnown().isPresent) 1 else 0) +
            (if (fileType.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedAt.asKnown().isPresent) 1 else 0) +
            (permissionInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (purpose.asKnown().isPresent) 1 else 0) +
            (resourceInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Permission information for the file */
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

    /** Resource information for the file */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is File &&
            id == other.id &&
            name == other.name &&
            projectId == other.projectId &&
            createdAt == other.createdAt &&
            dataSourceId == other.dataSourceId &&
            expiresAt == other.expiresAt &&
            externalFileId == other.externalFileId &&
            fileSize == other.fileSize &&
            fileType == other.fileType &&
            lastModifiedAt == other.lastModifiedAt &&
            permissionInfo == other.permissionInfo &&
            purpose == other.purpose &&
            resourceInfo == other.resourceInfo &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            projectId,
            createdAt,
            dataSourceId,
            expiresAt,
            externalFileId,
            fileSize,
            fileType,
            lastModifiedAt,
            permissionInfo,
            purpose,
            resourceInfo,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "File{id=$id, name=$name, projectId=$projectId, createdAt=$createdAt, dataSourceId=$dataSourceId, expiresAt=$expiresAt, externalFileId=$externalFileId, fileSize=$fileSize, fileType=$fileType, lastModifiedAt=$lastModifiedAt, permissionInfo=$permissionInfo, purpose=$purpose, resourceInfo=$resourceInfo, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
