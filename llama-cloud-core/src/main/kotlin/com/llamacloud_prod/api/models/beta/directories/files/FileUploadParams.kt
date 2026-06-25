// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories.files

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.MultipartField
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name
import kotlin.jvm.optionals.getOrNull

/**
 * Upload a file and create its directory entry in one call; `unique_id` / `display_name` default to
 * values derived from file metadata.
 */
class FileUploadParams
private constructor(
    private val directoryId: String?,
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun directoryId(): Optional<String> = Optional.ofNullable(directoryId)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uploadFile(): InputStream = body.uploadFile()

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = body.displayName()

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalFileId(): Optional<String> = body.externalFileId()

    /**
     * User metadata as a JSON object string.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<String> = body.metadata()

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniqueId(): Optional<String> = body.uniqueId()

    /**
     * Returns the raw multipart value of [uploadFile].
     *
     * Unlike [uploadFile], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _uploadFile(): MultipartField<InputStream> = body._uploadFile()

    /**
     * Returns the raw multipart value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _displayName(): MultipartField<String> = body._displayName()

    /**
     * Returns the raw multipart value of [externalFileId].
     *
     * Unlike [externalFileId], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _externalFileId(): MultipartField<String> = body._externalFileId()

    /**
     * Returns the raw multipart value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _metadata(): MultipartField<String> = body._metadata()

    /**
     * Returns the raw multipart value of [uniqueId].
     *
     * Unlike [uniqueId], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _uniqueId(): MultipartField<String> = body._uniqueId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileUploadParams].
         *
         * The following fields are required:
         * ```java
         * .uploadFile()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileUploadParams]. */
    class Builder internal constructor() {

        private var directoryId: String? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileUploadParams: FileUploadParams) = apply {
            directoryId = fileUploadParams.directoryId
            organizationId = fileUploadParams.organizationId
            projectId = fileUploadParams.projectId
            body = fileUploadParams.body.toBuilder()
            additionalHeaders = fileUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileUploadParams.additionalQueryParams.toBuilder()
        }

        fun directoryId(directoryId: String?) = apply { this.directoryId = directoryId }

        /** Alias for calling [Builder.directoryId] with `directoryId.orElse(null)`. */
        fun directoryId(directoryId: Optional<String>) = directoryId(directoryId.getOrNull())

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [uploadFile]
         * - [displayName]
         * - [externalFileId]
         * - [metadata]
         * - [uniqueId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun uploadFile(uploadFile: InputStream) = apply { body.uploadFile(uploadFile) }

        /**
         * Sets [Builder.uploadFile] to an arbitrary multipart value.
         *
         * You should usually call [Builder.uploadFile] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun uploadFile(uploadFile: MultipartField<InputStream>) = apply {
            body.uploadFile(uploadFile)
        }

        fun uploadFile(uploadFile: ByteArray) = apply { body.uploadFile(uploadFile) }

        fun uploadFile(path: Path) = apply { body.uploadFile(path) }

        fun displayName(displayName: String?) = apply { body.displayName(displayName) }

        /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
        fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

        /**
         * Sets [Builder.displayName] to an arbitrary multipart value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: MultipartField<String>) = apply {
            body.displayName(displayName)
        }

        fun externalFileId(externalFileId: String?) = apply { body.externalFileId(externalFileId) }

        /** Alias for calling [Builder.externalFileId] with `externalFileId.orElse(null)`. */
        fun externalFileId(externalFileId: Optional<String>) =
            externalFileId(externalFileId.getOrNull())

        /**
         * Sets [Builder.externalFileId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.externalFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalFileId(externalFileId: MultipartField<String>) = apply {
            body.externalFileId(externalFileId)
        }

        /** User metadata as a JSON object string. */
        fun metadata(metadata: String?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<String>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary multipart value.
         *
         * You should usually call [Builder.metadata] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metadata(metadata: MultipartField<String>) = apply { body.metadata(metadata) }

        fun uniqueId(uniqueId: String?) = apply { body.uniqueId(uniqueId) }

        /** Alias for calling [Builder.uniqueId] with `uniqueId.orElse(null)`. */
        fun uniqueId(uniqueId: Optional<String>) = uniqueId(uniqueId.getOrNull())

        /**
         * Sets [Builder.uniqueId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.uniqueId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uniqueId(uniqueId: MultipartField<String>) = apply { body.uniqueId(uniqueId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [FileUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .uploadFile()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileUploadParams =
            FileUploadParams(
                directoryId,
                organizationId,
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "upload_file" to _uploadFile(),
                "display_name" to _displayName(),
                "external_file_id" to _externalFileId(),
                "metadata" to _metadata(),
                "unique_id" to _uniqueId(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> directoryId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val uploadFile: MultipartField<InputStream>,
        private val displayName: MultipartField<String>,
        private val externalFileId: MultipartField<String>,
        private val metadata: MultipartField<String>,
        private val uniqueId: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun uploadFile(): InputStream = uploadFile.value.getRequired("upload_file")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.value.getOptional("display_name")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalFileId(): Optional<String> =
            externalFileId.value.getOptional("external_file_id")

        /**
         * User metadata as a JSON object string.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<String> = metadata.value.getOptional("metadata")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniqueId(): Optional<String> = uniqueId.value.getOptional("unique_id")

        /**
         * Returns the raw multipart value of [uploadFile].
         *
         * Unlike [uploadFile], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("upload_file")
        @ExcludeMissing
        fun _uploadFile(): MultipartField<InputStream> = uploadFile

        /**
         * Returns the raw multipart value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): MultipartField<String> = displayName

        /**
         * Returns the raw multipart value of [externalFileId].
         *
         * Unlike [externalFileId], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("external_file_id")
        @ExcludeMissing
        fun _externalFileId(): MultipartField<String> = externalFileId

        /**
         * Returns the raw multipart value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): MultipartField<String> = metadata

        /**
         * Returns the raw multipart value of [uniqueId].
         *
         * Unlike [uniqueId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("unique_id")
        @ExcludeMissing
        fun _uniqueId(): MultipartField<String> = uniqueId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .uploadFile()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var uploadFile: MultipartField<InputStream>? = null
            private var displayName: MultipartField<String> = MultipartField.of(null)
            private var externalFileId: MultipartField<String> = MultipartField.of(null)
            private var metadata: MultipartField<String> = MultipartField.of(null)
            private var uniqueId: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                uploadFile = body.uploadFile
                displayName = body.displayName
                externalFileId = body.externalFileId
                metadata = body.metadata
                uniqueId = body.uniqueId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun uploadFile(uploadFile: InputStream) = uploadFile(MultipartField.of(uploadFile))

            /**
             * Sets [Builder.uploadFile] to an arbitrary multipart value.
             *
             * You should usually call [Builder.uploadFile] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uploadFile(uploadFile: MultipartField<InputStream>) = apply {
                this.uploadFile = uploadFile
            }

            fun uploadFile(uploadFile: ByteArray) = uploadFile(uploadFile.inputStream())

            fun uploadFile(path: Path) =
                uploadFile(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            fun displayName(displayName: String?) = displayName(MultipartField.of(displayName))

            /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
            fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

            /**
             * Sets [Builder.displayName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: MultipartField<String>) = apply {
                this.displayName = displayName
            }

            fun externalFileId(externalFileId: String?) =
                externalFileId(MultipartField.of(externalFileId))

            /** Alias for calling [Builder.externalFileId] with `externalFileId.orElse(null)`. */
            fun externalFileId(externalFileId: Optional<String>) =
                externalFileId(externalFileId.getOrNull())

            /**
             * Sets [Builder.externalFileId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.externalFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalFileId(externalFileId: MultipartField<String>) = apply {
                this.externalFileId = externalFileId
            }

            /** User metadata as a JSON object string. */
            fun metadata(metadata: String?) = metadata(MultipartField.of(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<String>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary multipart value.
             *
             * You should usually call [Builder.metadata] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: MultipartField<String>) = apply { this.metadata = metadata }

            fun uniqueId(uniqueId: String?) = uniqueId(MultipartField.of(uniqueId))

            /** Alias for calling [Builder.uniqueId] with `uniqueId.orElse(null)`. */
            fun uniqueId(uniqueId: Optional<String>) = uniqueId(uniqueId.getOrNull())

            /**
             * Sets [Builder.uniqueId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.uniqueId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uniqueId(uniqueId: MultipartField<String>) = apply { this.uniqueId = uniqueId }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .uploadFile()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("uploadFile", uploadFile),
                    displayName,
                    externalFileId,
                    metadata,
                    uniqueId,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            uploadFile()
            displayName()
            externalFileId()
            metadata()
            uniqueId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                uploadFile == other.uploadFile &&
                displayName == other.displayName &&
                externalFileId == other.externalFileId &&
                metadata == other.metadata &&
                uniqueId == other.uniqueId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                uploadFile,
                displayName,
                externalFileId,
                metadata,
                uniqueId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{uploadFile=$uploadFile, displayName=$displayName, externalFileId=$externalFileId, metadata=$metadata, uniqueId=$uniqueId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileUploadParams &&
            directoryId == other.directoryId &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            directoryId,
            organizationId,
            projectId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FileUploadParams{directoryId=$directoryId, organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
