// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.files

import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List files with optional filtering and pagination.
 *
 * Filter by `file_name`, `file_ids`, or `external_file_id`. Supports cursor-based pagination and
 * custom ordering.
 */
class FileListParams
private constructor(
    private val expand: List<String>?,
    private val externalFileId: String?,
    private val fileIds: List<String>?,
    private val fileName: String?,
    private val orderBy: String?,
    private val organizationId: String?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val projectId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Fields to expand on each file. */
    fun expand(): Optional<List<String>> = Optional.ofNullable(expand)

    /** Filter by external file ID. */
    fun externalFileId(): Optional<String> = Optional.ofNullable(externalFileId)

    /** Filter by specific file IDs. */
    fun fileIds(): Optional<List<String>> = Optional.ofNullable(fileIds)

    /** Filter by file name (exact match). */
    fun fileName(): Optional<String> = Optional.ofNullable(fileName)

    /**
     * A comma-separated list of fields to order by, sorted in ascending order. Use 'field_name
     * desc' to specify descending order.
     */
    fun orderBy(): Optional<String> = Optional.ofNullable(orderBy)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    /** The maximum number of items to return. Defaults to 50, maximum is 1000. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * A page token received from a previous list call. Provide this to retrieve the subsequent
     * page.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FileListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FileListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileListParams]. */
    class Builder internal constructor() {

        private var expand: MutableList<String>? = null
        private var externalFileId: String? = null
        private var fileIds: MutableList<String>? = null
        private var fileName: String? = null
        private var orderBy: String? = null
        private var organizationId: String? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var projectId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileListParams: FileListParams) = apply {
            expand = fileListParams.expand?.toMutableList()
            externalFileId = fileListParams.externalFileId
            fileIds = fileListParams.fileIds?.toMutableList()
            fileName = fileListParams.fileName
            orderBy = fileListParams.orderBy
            organizationId = fileListParams.organizationId
            pageSize = fileListParams.pageSize
            pageToken = fileListParams.pageToken
            projectId = fileListParams.projectId
            additionalHeaders = fileListParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileListParams.additionalQueryParams.toBuilder()
        }

        /** Fields to expand on each file. */
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

        /** Filter by external file ID. */
        fun externalFileId(externalFileId: String?) = apply { this.externalFileId = externalFileId }

        /** Alias for calling [Builder.externalFileId] with `externalFileId.orElse(null)`. */
        fun externalFileId(externalFileId: Optional<String>) =
            externalFileId(externalFileId.getOrNull())

        /** Filter by specific file IDs. */
        fun fileIds(fileIds: List<String>?) = apply { this.fileIds = fileIds?.toMutableList() }

        /** Alias for calling [Builder.fileIds] with `fileIds.orElse(null)`. */
        fun fileIds(fileIds: Optional<List<String>>) = fileIds(fileIds.getOrNull())

        /**
         * Adds a single [String] to [fileIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFileId(fileId: String) = apply {
            fileIds = (fileIds ?: mutableListOf()).apply { add(fileId) }
        }

        /** Filter by file name (exact match). */
        fun fileName(fileName: String?) = apply { this.fileName = fileName }

        /** Alias for calling [Builder.fileName] with `fileName.orElse(null)`. */
        fun fileName(fileName: Optional<String>) = fileName(fileName.getOrNull())

        /**
         * A comma-separated list of fields to order by, sorted in ascending order. Use 'field_name
         * desc' to specify descending order.
         */
        fun orderBy(orderBy: String?) = apply { this.orderBy = orderBy }

        /** Alias for calling [Builder.orderBy] with `orderBy.orElse(null)`. */
        fun orderBy(orderBy: Optional<String>) = orderBy(orderBy.getOrNull())

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        /** The maximum number of items to return. Defaults to 50, maximum is 1000. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * A page token received from a previous list call. Provide this to retrieve the subsequent
         * page.
         */
        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

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
         * Returns an immutable instance of [FileListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileListParams =
            FileListParams(
                expand?.toImmutable(),
                externalFileId,
                fileIds?.toImmutable(),
                fileName,
                orderBy,
                organizationId,
                pageSize,
                pageToken,
                projectId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                expand?.forEach { put("expand", it) }
                externalFileId?.let { put("external_file_id", it) }
                fileIds?.forEach { put("file_ids", it) }
                fileName?.let { put("file_name", it) }
                orderBy?.let { put("order_by", it) }
                organizationId?.let { put("organization_id", it) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileListParams &&
            expand == other.expand &&
            externalFileId == other.externalFileId &&
            fileIds == other.fileIds &&
            fileName == other.fileName &&
            orderBy == other.orderBy &&
            organizationId == other.organizationId &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            projectId == other.projectId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            expand,
            externalFileId,
            fileIds,
            fileName,
            orderBy,
            organizationId,
            pageSize,
            pageToken,
            projectId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FileListParams{expand=$expand, externalFileId=$externalFileId, fileIds=$fileIds, fileName=$fileName, orderBy=$orderBy, organizationId=$organizationId, pageSize=$pageSize, pageToken=$pageToken, projectId=$projectId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
