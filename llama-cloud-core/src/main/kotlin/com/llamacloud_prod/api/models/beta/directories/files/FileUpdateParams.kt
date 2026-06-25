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
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update directory-file metadata by `directory_file_id`; set `directory_id` to move the file to a
 * different directory. To resolve from `unique_id`, list with a filter first.
 */
class FileUpdateParams
private constructor(
    private val directoryId: String,
    private val directoryFileId: String?,
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun directoryId(): String = directoryId

    fun directoryFileId(): Optional<String> = Optional.ofNullable(directoryFileId)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * Updated display name.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = body.displayName()

    /**
     * User-defined metadata key-value pairs. Replaces the user metadata layer.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Move file to a different directory.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetDirectoryId(): Optional<String> = body.targetDirectoryId()

    /**
     * Updated unique identifier.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniqueId(): Optional<String> = body.uniqueId()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [targetDirectoryId].
     *
     * Unlike [targetDirectoryId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _targetDirectoryId(): JsonField<String> = body._targetDirectoryId()

    /**
     * Returns the raw JSON value of [uniqueId].
     *
     * Unlike [uniqueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _uniqueId(): JsonField<String> = body._uniqueId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .directoryId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileUpdateParams]. */
    class Builder internal constructor() {

        private var directoryId: String? = null
        private var directoryFileId: String? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileUpdateParams: FileUpdateParams) = apply {
            directoryId = fileUpdateParams.directoryId
            directoryFileId = fileUpdateParams.directoryFileId
            organizationId = fileUpdateParams.organizationId
            projectId = fileUpdateParams.projectId
            body = fileUpdateParams.body.toBuilder()
            additionalHeaders = fileUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileUpdateParams.additionalQueryParams.toBuilder()
        }

        fun directoryId(directoryId: String) = apply { this.directoryId = directoryId }

        fun directoryFileId(directoryFileId: String?) = apply {
            this.directoryFileId = directoryFileId
        }

        /** Alias for calling [Builder.directoryFileId] with `directoryFileId.orElse(null)`. */
        fun directoryFileId(directoryFileId: Optional<String>) =
            directoryFileId(directoryFileId.getOrNull())

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
         * - [displayName]
         * - [metadata]
         * - [targetDirectoryId]
         * - [uniqueId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Updated display name. */
        fun displayName(displayName: String?) = apply { body.displayName(displayName) }

        /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
        fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        /** User-defined metadata key-value pairs. Replaces the user metadata layer. */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Move file to a different directory. */
        fun targetDirectoryId(targetDirectoryId: String?) = apply {
            body.targetDirectoryId(targetDirectoryId)
        }

        /** Alias for calling [Builder.targetDirectoryId] with `targetDirectoryId.orElse(null)`. */
        fun targetDirectoryId(targetDirectoryId: Optional<String>) =
            targetDirectoryId(targetDirectoryId.getOrNull())

        /**
         * Sets [Builder.targetDirectoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetDirectoryId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetDirectoryId(targetDirectoryId: JsonField<String>) = apply {
            body.targetDirectoryId(targetDirectoryId)
        }

        /** Updated unique identifier. */
        fun uniqueId(uniqueId: String?) = apply { body.uniqueId(uniqueId) }

        /** Alias for calling [Builder.uniqueId] with `uniqueId.orElse(null)`. */
        fun uniqueId(uniqueId: Optional<String>) = uniqueId(uniqueId.getOrNull())

        /**
         * Sets [Builder.uniqueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniqueId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uniqueId(uniqueId: JsonField<String>) = apply { body.uniqueId(uniqueId) }

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
         * Returns an immutable instance of [FileUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .directoryId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileUpdateParams =
            FileUpdateParams(
                checkRequired("directoryId", directoryId),
                directoryFileId,
                organizationId,
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> directoryId
            1 -> directoryFileId ?: ""
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

    /** API request schema for updating a directory file. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val targetDirectoryId: JsonField<String>,
        private val uniqueId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("target_directory_id")
            @ExcludeMissing
            targetDirectoryId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unique_id")
            @ExcludeMissing
            uniqueId: JsonField<String> = JsonMissing.of(),
        ) : this(displayName, metadata, targetDirectoryId, uniqueId, mutableMapOf())

        /**
         * Updated display name.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("display_name")

        /**
         * User-defined metadata key-value pairs. Replaces the user metadata layer.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Move file to a different directory.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun targetDirectoryId(): Optional<String> =
            targetDirectoryId.getOptional("target_directory_id")

        /**
         * Updated unique identifier.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniqueId(): Optional<String> = uniqueId.getOptional("unique_id")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [targetDirectoryId].
         *
         * Unlike [targetDirectoryId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_directory_id")
        @ExcludeMissing
        fun _targetDirectoryId(): JsonField<String> = targetDirectoryId

        /**
         * Returns the raw JSON value of [uniqueId].
         *
         * Unlike [uniqueId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unique_id") @ExcludeMissing fun _uniqueId(): JsonField<String> = uniqueId

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var targetDirectoryId: JsonField<String> = JsonMissing.of()
            private var uniqueId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                displayName = body.displayName
                metadata = body.metadata
                targetDirectoryId = body.targetDirectoryId
                uniqueId = body.uniqueId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Updated display name. */
            fun displayName(displayName: String?) = displayName(JsonField.ofNullable(displayName))

            /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
            fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** User-defined metadata key-value pairs. Replaces the user metadata layer. */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Move file to a different directory. */
            fun targetDirectoryId(targetDirectoryId: String?) =
                targetDirectoryId(JsonField.ofNullable(targetDirectoryId))

            /**
             * Alias for calling [Builder.targetDirectoryId] with `targetDirectoryId.orElse(null)`.
             */
            fun targetDirectoryId(targetDirectoryId: Optional<String>) =
                targetDirectoryId(targetDirectoryId.getOrNull())

            /**
             * Sets [Builder.targetDirectoryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetDirectoryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetDirectoryId(targetDirectoryId: JsonField<String>) = apply {
                this.targetDirectoryId = targetDirectoryId
            }

            /** Updated unique identifier. */
            fun uniqueId(uniqueId: String?) = uniqueId(JsonField.ofNullable(uniqueId))

            /** Alias for calling [Builder.uniqueId] with `uniqueId.orElse(null)`. */
            fun uniqueId(uniqueId: Optional<String>) = uniqueId(uniqueId.getOrNull())

            /**
             * Sets [Builder.uniqueId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uniqueId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uniqueId(uniqueId: JsonField<String>) = apply { this.uniqueId = uniqueId }

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
             */
            fun build(): Body =
                Body(
                    displayName,
                    metadata,
                    targetDirectoryId,
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

            displayName()
            metadata().ifPresent { it.validate() }
            targetDirectoryId()
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

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (displayName.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (targetDirectoryId.asKnown().isPresent) 1 else 0) +
                (if (uniqueId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                displayName == other.displayName &&
                metadata == other.metadata &&
                targetDirectoryId == other.targetDirectoryId &&
                uniqueId == other.uniqueId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(displayName, metadata, targetDirectoryId, uniqueId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{displayName=$displayName, metadata=$metadata, targetDirectoryId=$targetDirectoryId, uniqueId=$uniqueId, additionalProperties=$additionalProperties}"
    }

    /** User-defined metadata key-value pairs. Replaces the user metadata layer. */
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

        return other is FileUpdateParams &&
            directoryId == other.directoryId &&
            directoryFileId == other.directoryFileId &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            directoryId,
            directoryFileId,
            organizationId,
            projectId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FileUpdateParams{directoryId=$directoryId, directoryFileId=$directoryFileId, organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
