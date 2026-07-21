// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.files

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkRequired
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

/** An uploaded file. */
class FileCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val projectId: JsonField<String>,
    private val downloadUrl: JsonField<PresignedUrl>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val externalFileId: JsonField<String>,
    private val fileType: JsonField<String>,
    private val lastModifiedAt: JsonField<OffsetDateTime>,
    private val purpose: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("download_url")
        @ExcludeMissing
        downloadUrl: JsonField<PresignedUrl> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_file_id")
        @ExcludeMissing
        externalFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_type") @ExcludeMissing fileType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_modified_at")
        @ExcludeMissing
        lastModifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("purpose") @ExcludeMissing purpose: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        name,
        projectId,
        downloadUrl,
        expiresAt,
        externalFileId,
        fileType,
        lastModifiedAt,
        purpose,
        mutableMapOf(),
    )

    /**
     * Unique file identifier
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * File name including extension
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Project this file belongs to
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * Schema for a presigned URL.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downloadUrl(): Optional<PresignedUrl> = downloadUrl.getOptional("download_url")

    /**
     * When the file expires and may be automatically removed. Null means no expiration.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * Optional ID for correlating with an external system
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalFileId(): Optional<String> = externalFileId.getOptional("external_file_id")

    /**
     * File extension (pdf, docx, png, etc.)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileType(): Optional<String> = fileType.getOptional("file_type")

    /**
     * When the file was last modified (ISO 8601)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedAt(): Optional<OffsetDateTime> = lastModifiedAt.getOptional("last_modified_at")

    /**
     * How the file will be used: user_data, parse, extract, classify, split, sheet, or agent_app
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purpose(): Optional<String> = purpose.getOptional("purpose")

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
     * Returns the raw JSON value of [downloadUrl].
     *
     * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("download_url")
    @ExcludeMissing
    fun _downloadUrl(): JsonField<PresignedUrl> = downloadUrl

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
     * Returns the raw JSON value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

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
         * Returns a mutable builder for constructing an instance of [FileCreateResponse].
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

    /** A builder for [FileCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var downloadUrl: JsonField<PresignedUrl> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalFileId: JsonField<String> = JsonMissing.of()
        private var fileType: JsonField<String> = JsonMissing.of()
        private var lastModifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var purpose: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileCreateResponse: FileCreateResponse) = apply {
            id = fileCreateResponse.id
            name = fileCreateResponse.name
            projectId = fileCreateResponse.projectId
            downloadUrl = fileCreateResponse.downloadUrl
            expiresAt = fileCreateResponse.expiresAt
            externalFileId = fileCreateResponse.externalFileId
            fileType = fileCreateResponse.fileType
            lastModifiedAt = fileCreateResponse.lastModifiedAt
            purpose = fileCreateResponse.purpose
            additionalProperties = fileCreateResponse.additionalProperties.toMutableMap()
        }

        /** Unique file identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** File name including extension */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Project this file belongs to */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

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

        /** When the file expires and may be automatically removed. Null means no expiration. */
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

        /** Optional ID for correlating with an external system */
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

        /** File extension (pdf, docx, png, etc.) */
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

        /** When the file was last modified (ISO 8601) */
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

        /**
         * How the file will be used: user_data, parse, extract, classify, split, sheet, or
         * agent_app
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
         * Returns an immutable instance of [FileCreateResponse].
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
        fun build(): FileCreateResponse =
            FileCreateResponse(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("projectId", projectId),
                downloadUrl,
                expiresAt,
                externalFileId,
                fileType,
                lastModifiedAt,
                purpose,
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
    fun validate(): FileCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        projectId()
        downloadUrl().ifPresent { it.validate() }
        expiresAt()
        externalFileId()
        fileType()
        lastModifiedAt()
        purpose()
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
            (downloadUrl.asKnown().getOrNull()?.validity() ?: 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (externalFileId.asKnown().isPresent) 1 else 0) +
            (if (fileType.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedAt.asKnown().isPresent) 1 else 0) +
            (if (purpose.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileCreateResponse &&
            id == other.id &&
            name == other.name &&
            projectId == other.projectId &&
            downloadUrl == other.downloadUrl &&
            expiresAt == other.expiresAt &&
            externalFileId == other.externalFileId &&
            fileType == other.fileType &&
            lastModifiedAt == other.lastModifiedAt &&
            purpose == other.purpose &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            projectId,
            downloadUrl,
            expiresAt,
            externalFileId,
            fileType,
            lastModifiedAt,
            purpose,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileCreateResponse{id=$id, name=$name, projectId=$projectId, downloadUrl=$downloadUrl, expiresAt=$expiresAt, externalFileId=$externalFileId, fileType=$fileType, lastModifiedAt=$lastModifiedAt, purpose=$purpose, additionalProperties=$additionalProperties}"
}
