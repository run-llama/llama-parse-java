// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories.files

import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all files within the specified directory with optional filtering and pagination. */
class FileListParams
private constructor(
    private val directoryId: String?,
    private val displayName: String?,
    private val displayNameContains: String?,
    private val expand: List<String>?,
    private val fileId: String?,
    private val includeDeleted: Boolean?,
    private val organizationId: String?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val projectId: String?,
    private val uniqueId: String?,
    private val updatedAtOnOrAfter: OffsetDateTime?,
    private val updatedAtOnOrBefore: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun directoryId(): Optional<String> = Optional.ofNullable(directoryId)

    fun displayName(): Optional<String> = Optional.ofNullable(displayName)

    fun displayNameContains(): Optional<String> = Optional.ofNullable(displayNameContains)

    /** Fields to expand on each directory file. */
    fun expand(): Optional<List<String>> = Optional.ofNullable(expand)

    fun fileId(): Optional<String> = Optional.ofNullable(fileId)

    fun includeDeleted(): Optional<Boolean> = Optional.ofNullable(includeDeleted)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    fun uniqueId(): Optional<String> = Optional.ofNullable(uniqueId)

    /** Include items updated at or after this timestamp (inclusive) */
    fun updatedAtOnOrAfter(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAtOnOrAfter)

    /** Include items updated at or before this timestamp (inclusive) */
    fun updatedAtOnOrBefore(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAtOnOrBefore)

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

        private var directoryId: String? = null
        private var displayName: String? = null
        private var displayNameContains: String? = null
        private var expand: MutableList<String>? = null
        private var fileId: String? = null
        private var includeDeleted: Boolean? = null
        private var organizationId: String? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var projectId: String? = null
        private var uniqueId: String? = null
        private var updatedAtOnOrAfter: OffsetDateTime? = null
        private var updatedAtOnOrBefore: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileListParams: FileListParams) = apply {
            directoryId = fileListParams.directoryId
            displayName = fileListParams.displayName
            displayNameContains = fileListParams.displayNameContains
            expand = fileListParams.expand?.toMutableList()
            fileId = fileListParams.fileId
            includeDeleted = fileListParams.includeDeleted
            organizationId = fileListParams.organizationId
            pageSize = fileListParams.pageSize
            pageToken = fileListParams.pageToken
            projectId = fileListParams.projectId
            uniqueId = fileListParams.uniqueId
            updatedAtOnOrAfter = fileListParams.updatedAtOnOrAfter
            updatedAtOnOrBefore = fileListParams.updatedAtOnOrBefore
            additionalHeaders = fileListParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileListParams.additionalQueryParams.toBuilder()
        }

        fun directoryId(directoryId: String?) = apply { this.directoryId = directoryId }

        /** Alias for calling [Builder.directoryId] with `directoryId.orElse(null)`. */
        fun directoryId(directoryId: Optional<String>) = directoryId(directoryId.getOrNull())

        fun displayName(displayName: String?) = apply { this.displayName = displayName }

        /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
        fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

        fun displayNameContains(displayNameContains: String?) = apply {
            this.displayNameContains = displayNameContains
        }

        /**
         * Alias for calling [Builder.displayNameContains] with `displayNameContains.orElse(null)`.
         */
        fun displayNameContains(displayNameContains: Optional<String>) =
            displayNameContains(displayNameContains.getOrNull())

        /** Fields to expand on each directory file. */
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

        fun fileId(fileId: String?) = apply { this.fileId = fileId }

        /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
        fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

        fun includeDeleted(includeDeleted: Boolean?) = apply {
            this.includeDeleted = includeDeleted
        }

        /**
         * Alias for [Builder.includeDeleted].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeDeleted(includeDeleted: Boolean) = includeDeleted(includeDeleted as Boolean?)

        /** Alias for calling [Builder.includeDeleted] with `includeDeleted.orElse(null)`. */
        fun includeDeleted(includeDeleted: Optional<Boolean>) =
            includeDeleted(includeDeleted.getOrNull())

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        fun uniqueId(uniqueId: String?) = apply { this.uniqueId = uniqueId }

        /** Alias for calling [Builder.uniqueId] with `uniqueId.orElse(null)`. */
        fun uniqueId(uniqueId: Optional<String>) = uniqueId(uniqueId.getOrNull())

        /** Include items updated at or after this timestamp (inclusive) */
        fun updatedAtOnOrAfter(updatedAtOnOrAfter: OffsetDateTime?) = apply {
            this.updatedAtOnOrAfter = updatedAtOnOrAfter
        }

        /**
         * Alias for calling [Builder.updatedAtOnOrAfter] with `updatedAtOnOrAfter.orElse(null)`.
         */
        fun updatedAtOnOrAfter(updatedAtOnOrAfter: Optional<OffsetDateTime>) =
            updatedAtOnOrAfter(updatedAtOnOrAfter.getOrNull())

        /** Include items updated at or before this timestamp (inclusive) */
        fun updatedAtOnOrBefore(updatedAtOnOrBefore: OffsetDateTime?) = apply {
            this.updatedAtOnOrBefore = updatedAtOnOrBefore
        }

        /**
         * Alias for calling [Builder.updatedAtOnOrBefore] with `updatedAtOnOrBefore.orElse(null)`.
         */
        fun updatedAtOnOrBefore(updatedAtOnOrBefore: Optional<OffsetDateTime>) =
            updatedAtOnOrBefore(updatedAtOnOrBefore.getOrNull())

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
                directoryId,
                displayName,
                displayNameContains,
                expand?.toImmutable(),
                fileId,
                includeDeleted,
                organizationId,
                pageSize,
                pageToken,
                projectId,
                uniqueId,
                updatedAtOnOrAfter,
                updatedAtOnOrBefore,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> directoryId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                displayName?.let { put("display_name", it) }
                displayNameContains?.let { put("display_name_contains", it) }
                expand?.forEach { put("expand", it) }
                fileId?.let { put("file_id", it) }
                includeDeleted?.let { put("include_deleted", it.toString()) }
                organizationId?.let { put("organization_id", it) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                projectId?.let { put("project_id", it) }
                uniqueId?.let { put("unique_id", it) }
                updatedAtOnOrAfter?.let {
                    put("updated_at_on_or_after", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                updatedAtOnOrBefore?.let {
                    put(
                        "updated_at_on_or_before",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileListParams &&
            directoryId == other.directoryId &&
            displayName == other.displayName &&
            displayNameContains == other.displayNameContains &&
            expand == other.expand &&
            fileId == other.fileId &&
            includeDeleted == other.includeDeleted &&
            organizationId == other.organizationId &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            projectId == other.projectId &&
            uniqueId == other.uniqueId &&
            updatedAtOnOrAfter == other.updatedAtOnOrAfter &&
            updatedAtOnOrBefore == other.updatedAtOnOrBefore &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            directoryId,
            displayName,
            displayNameContains,
            expand,
            fileId,
            includeDeleted,
            organizationId,
            pageSize,
            pageToken,
            projectId,
            uniqueId,
            updatedAtOnOrAfter,
            updatedAtOnOrBefore,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FileListParams{directoryId=$directoryId, displayName=$displayName, displayNameContains=$displayNameContains, expand=$expand, fileId=$fileId, includeDeleted=$includeDeleted, organizationId=$organizationId, pageSize=$pageSize, pageToken=$pageToken, projectId=$projectId, uniqueId=$uniqueId, updatedAtOnOrAfter=$updatedAtOnOrAfter, updatedAtOnOrBefore=$updatedAtOnOrBefore, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
