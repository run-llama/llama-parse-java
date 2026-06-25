// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories.files

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
import com.llamacloud_prod.api.models.files.PresignedUrl
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** API response schema for a directory file. */
class FileAddResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val directoryId: JsonField<String>,
    private val displayName: JsonField<String>,
    private val projectId: JsonField<String>,
    private val uniqueId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val downloadUrl: JsonField<PresignedUrl>,
    private val fileId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("directory_id")
        @ExcludeMissing
        directoryId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unique_id") @ExcludeMissing uniqueId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deleted_at")
        @ExcludeMissing
        deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("download_url")
        @ExcludeMissing
        downloadUrl: JsonField<PresignedUrl> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        directoryId,
        displayName,
        projectId,
        uniqueId,
        createdAt,
        deletedAt,
        downloadUrl,
        fileId,
        metadata,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the directory file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Directory the file belongs to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun directoryId(): String = directoryId.getRequired("directory_id")

    /**
     * Display name for the file.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("display_name")

    /**
     * Project the directory file belongs to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * Unique identifier for the file in the directory
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uniqueId(): String = uniqueId.getRequired("unique_id")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Soft delete marker when the file is removed upstream or by user action.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deletedAt(): Optional<OffsetDateTime> = deletedAt.getOptional("deleted_at")

    /**
     * Schema for a presigned URL.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downloadUrl(): Optional<PresignedUrl> = downloadUrl.getOptional("download_url")

    /**
     * File ID for the storage location.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileId(): Optional<String> = fileId.getOptional("file_id")

    /**
     * Merged metadata from all sources. Higher-priority sources override lower.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

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
     * Returns the raw JSON value of [directoryId].
     *
     * Unlike [directoryId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("directory_id")
    @ExcludeMissing
    fun _directoryId(): JsonField<String> = directoryId

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [uniqueId].
     *
     * Unlike [uniqueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unique_id") @ExcludeMissing fun _uniqueId(): JsonField<String> = uniqueId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [deletedAt].
     *
     * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /**
     * Returns the raw JSON value of [downloadUrl].
     *
     * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("download_url")
    @ExcludeMissing
    fun _downloadUrl(): JsonField<PresignedUrl> = downloadUrl

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
         * Returns a mutable builder for constructing an instance of [FileAddResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .directoryId()
         * .displayName()
         * .projectId()
         * .uniqueId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileAddResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var directoryId: JsonField<String>? = null
        private var displayName: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var uniqueId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var downloadUrl: JsonField<PresignedUrl> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileAddResponse: FileAddResponse) = apply {
            id = fileAddResponse.id
            directoryId = fileAddResponse.directoryId
            displayName = fileAddResponse.displayName
            projectId = fileAddResponse.projectId
            uniqueId = fileAddResponse.uniqueId
            createdAt = fileAddResponse.createdAt
            deletedAt = fileAddResponse.deletedAt
            downloadUrl = fileAddResponse.downloadUrl
            fileId = fileAddResponse.fileId
            metadata = fileAddResponse.metadata
            updatedAt = fileAddResponse.updatedAt
            additionalProperties = fileAddResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the directory file. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Directory the file belongs to. */
        fun directoryId(directoryId: String) = directoryId(JsonField.of(directoryId))

        /**
         * Sets [Builder.directoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.directoryId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun directoryId(directoryId: JsonField<String>) = apply { this.directoryId = directoryId }

        /** Display name for the file. */
        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /** Project the directory file belongs to. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Unique identifier for the file in the directory */
        fun uniqueId(uniqueId: String) = uniqueId(JsonField.of(uniqueId))

        /**
         * Sets [Builder.uniqueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniqueId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uniqueId(uniqueId: JsonField<String>) = apply { this.uniqueId = uniqueId }

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

        /** Soft delete marker when the file is removed upstream or by user action. */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /** Alias for calling [Builder.deletedAt] with `deletedAt.orElse(null)`. */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.getOrNull())

        /**
         * Sets [Builder.deletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Schema for a presigned URL. */
        fun downloadUrl(downloadUrl: PresignedUrl?) = downloadUrl(JsonField.ofNullable(downloadUrl))

        /** Alias for calling [Builder.downloadUrl] with `downloadUrl.orElse(null)`. */
        fun downloadUrl(downloadUrl: Optional<PresignedUrl>) = downloadUrl(downloadUrl.getOrNull())

        /**
         * Sets [Builder.downloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrl] with a well-typed [PresignedUrl] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun downloadUrl(downloadUrl: JsonField<PresignedUrl>) = apply {
            this.downloadUrl = downloadUrl
        }

        /** File ID for the storage location. */
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

        /** Merged metadata from all sources. Higher-priority sources override lower. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
         * Returns an immutable instance of [FileAddResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .directoryId()
         * .displayName()
         * .projectId()
         * .uniqueId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileAddResponse =
            FileAddResponse(
                checkRequired("id", id),
                checkRequired("directoryId", directoryId),
                checkRequired("displayName", displayName),
                checkRequired("projectId", projectId),
                checkRequired("uniqueId", uniqueId),
                createdAt,
                deletedAt,
                downloadUrl,
                fileId,
                metadata,
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
    fun validate(): FileAddResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        directoryId()
        displayName()
        projectId()
        uniqueId()
        createdAt()
        deletedAt()
        downloadUrl().ifPresent { it.validate() }
        fileId()
        metadata().ifPresent { it.validate() }
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
            (if (directoryId.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (uniqueId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (deletedAt.asKnown().isPresent) 1 else 0) +
            (downloadUrl.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Merged metadata from all sources. Higher-priority sources override lower. */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileAddResponse &&
            id == other.id &&
            directoryId == other.directoryId &&
            displayName == other.displayName &&
            projectId == other.projectId &&
            uniqueId == other.uniqueId &&
            createdAt == other.createdAt &&
            deletedAt == other.deletedAt &&
            downloadUrl == other.downloadUrl &&
            fileId == other.fileId &&
            metadata == other.metadata &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            directoryId,
            displayName,
            projectId,
            uniqueId,
            createdAt,
            deletedAt,
            downloadUrl,
            fileId,
            metadata,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileAddResponse{id=$id, directoryId=$directoryId, displayName=$displayName, projectId=$projectId, uniqueId=$uniqueId, createdAt=$createdAt, deletedAt=$deletedAt, downloadUrl=$downloadUrl, fileId=$fileId, metadata=$metadata, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
