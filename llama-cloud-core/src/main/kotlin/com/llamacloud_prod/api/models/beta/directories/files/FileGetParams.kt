// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories.files

import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get a directory file by `directory_file_id`; to look up by `unique_id`, use the list endpoint
 * with a filter.
 */
class FileGetParams
private constructor(
    private val directoryId: String,
    private val directoryFileId: String?,
    private val expand: List<String>?,
    private val organizationId: String?,
    private val projectId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun directoryId(): String = directoryId

    fun directoryFileId(): Optional<String> = Optional.ofNullable(directoryFileId)

    /** Fields to expand. */
    fun expand(): Optional<List<String>> = Optional.ofNullable(expand)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileGetParams].
         *
         * The following fields are required:
         * ```java
         * .directoryId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileGetParams]. */
    class Builder internal constructor() {

        private var directoryId: String? = null
        private var directoryFileId: String? = null
        private var expand: MutableList<String>? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileGetParams: FileGetParams) = apply {
            directoryId = fileGetParams.directoryId
            directoryFileId = fileGetParams.directoryFileId
            expand = fileGetParams.expand?.toMutableList()
            organizationId = fileGetParams.organizationId
            projectId = fileGetParams.projectId
            additionalHeaders = fileGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileGetParams.additionalQueryParams.toBuilder()
        }

        fun directoryId(directoryId: String) = apply { this.directoryId = directoryId }

        fun directoryFileId(directoryFileId: String?) = apply {
            this.directoryFileId = directoryFileId
        }

        /** Alias for calling [Builder.directoryFileId] with `directoryFileId.orElse(null)`. */
        fun directoryFileId(directoryFileId: Optional<String>) =
            directoryFileId(directoryFileId.getOrNull())

        /** Fields to expand. */
        fun expand(expand: List<String>?) = apply { this.expand = expand?.toMutableList() }

        /** Alias for calling [Builder.expand] with `expand.orElse(null)`. */
        fun expand(expand: Optional<List<String>>) = expand(expand.getOrNull())

        /**
         * Adds a single [String] to [Builder.expand].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExpand(expand: String) = apply {
            this.expand = (this.expand ?: mutableListOf()).apply { add(expand) }
        }

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

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
         * Returns an immutable instance of [FileGetParams].
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
        fun build(): FileGetParams =
            FileGetParams(
                checkRequired("directoryId", directoryId),
                directoryFileId,
                expand?.toImmutable(),
                organizationId,
                projectId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

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
                expand?.forEach { put("expand", it) }
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileGetParams &&
            directoryId == other.directoryId &&
            directoryFileId == other.directoryFileId &&
            expand == other.expand &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            directoryId,
            directoryFileId,
            expand,
            organizationId,
            projectId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FileGetParams{directoryId=$directoryId, directoryFileId=$directoryFileId, expand=$expand, organizationId=$organizationId, projectId=$projectId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
