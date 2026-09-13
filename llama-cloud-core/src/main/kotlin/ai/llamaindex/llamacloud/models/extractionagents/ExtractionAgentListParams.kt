// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extractionagents

import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List the extraction agents in a project, newest first. */
class ExtractionAgentListParams
private constructor(
    private val includeDefault: Boolean?,
    private val organizationId: String?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val projectId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Whether to include default agents in the results */
    fun includeDefault(): Optional<Boolean> = Optional.ofNullable(includeDefault)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    /** Number of items per page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Cursor from the previous page's `next_page_token`. */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ExtractionAgentListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ExtractionAgentListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractionAgentListParams]. */
    class Builder internal constructor() {

        private var includeDefault: Boolean? = null
        private var organizationId: String? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var projectId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(extractionAgentListParams: ExtractionAgentListParams) = apply {
            includeDefault = extractionAgentListParams.includeDefault
            organizationId = extractionAgentListParams.organizationId
            pageSize = extractionAgentListParams.pageSize
            pageToken = extractionAgentListParams.pageToken
            projectId = extractionAgentListParams.projectId
            additionalHeaders = extractionAgentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = extractionAgentListParams.additionalQueryParams.toBuilder()
        }

        /** Whether to include default agents in the results */
        fun includeDefault(includeDefault: Boolean?) = apply {
            this.includeDefault = includeDefault
        }

        /**
         * Alias for [Builder.includeDefault].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeDefault(includeDefault: Boolean) = includeDefault(includeDefault as Boolean?)

        /** Alias for calling [Builder.includeDefault] with `includeDefault.orElse(null)`. */
        fun includeDefault(includeDefault: Optional<Boolean>) =
            includeDefault(includeDefault.getOrNull())

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        /** Number of items per page */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Cursor from the previous page's `next_page_token`. */
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
         * Returns an immutable instance of [ExtractionAgentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExtractionAgentListParams =
            ExtractionAgentListParams(
                includeDefault,
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
                includeDefault?.let { put("include_default", it.toString()) }
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

        return other is ExtractionAgentListParams &&
            includeDefault == other.includeDefault &&
            organizationId == other.organizationId &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            projectId == other.projectId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            includeDefault,
            organizationId,
            pageSize,
            pageToken,
            projectId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ExtractionAgentListParams{includeDefault=$includeDefault, organizationId=$organizationId, pageSize=$pageSize, pageToken=$pageToken, projectId=$projectId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
