// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.sheets

import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get a spreadsheet parsing job. When `include_results=True` (default), embeds extracted regions
 * and results if complete, skipping the separate `/results` call.
 */
class SheetGetParams
private constructor(
    private val spreadsheetJobId: String?,
    private val expand: List<String>?,
    private val includeResults: Boolean?,
    private val organizationId: String?,
    private val projectId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun spreadsheetJobId(): Optional<String> = Optional.ofNullable(spreadsheetJobId)

    /** Optional fields to populate on the response. Valid values: metadata_state_transitions. */
    fun expand(): Optional<List<String>> = Optional.ofNullable(expand)

    fun includeResults(): Optional<Boolean> = Optional.ofNullable(includeResults)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SheetGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SheetGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SheetGetParams]. */
    class Builder internal constructor() {

        private var spreadsheetJobId: String? = null
        private var expand: MutableList<String>? = null
        private var includeResults: Boolean? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sheetGetParams: SheetGetParams) = apply {
            spreadsheetJobId = sheetGetParams.spreadsheetJobId
            expand = sheetGetParams.expand?.toMutableList()
            includeResults = sheetGetParams.includeResults
            organizationId = sheetGetParams.organizationId
            projectId = sheetGetParams.projectId
            additionalHeaders = sheetGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = sheetGetParams.additionalQueryParams.toBuilder()
        }

        fun spreadsheetJobId(spreadsheetJobId: String?) = apply {
            this.spreadsheetJobId = spreadsheetJobId
        }

        /** Alias for calling [Builder.spreadsheetJobId] with `spreadsheetJobId.orElse(null)`. */
        fun spreadsheetJobId(spreadsheetJobId: Optional<String>) =
            spreadsheetJobId(spreadsheetJobId.getOrNull())

        /**
         * Optional fields to populate on the response. Valid values: metadata_state_transitions.
         */
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

        fun includeResults(includeResults: Boolean?) = apply {
            this.includeResults = includeResults
        }

        /**
         * Alias for [Builder.includeResults].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeResults(includeResults: Boolean) = includeResults(includeResults as Boolean?)

        /** Alias for calling [Builder.includeResults] with `includeResults.orElse(null)`. */
        fun includeResults(includeResults: Optional<Boolean>) =
            includeResults(includeResults.getOrNull())

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
         * Returns an immutable instance of [SheetGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SheetGetParams =
            SheetGetParams(
                spreadsheetJobId,
                expand?.toImmutable(),
                includeResults,
                organizationId,
                projectId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> spreadsheetJobId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                expand?.forEach { put("expand", it) }
                includeResults?.let { put("include_results", it.toString()) }
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SheetGetParams &&
            spreadsheetJobId == other.spreadsheetJobId &&
            expand == other.expand &&
            includeResults == other.includeResults &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            spreadsheetJobId,
            expand,
            includeResults,
            organizationId,
            projectId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SheetGetParams{spreadsheetJobId=$spreadsheetJobId, expand=$expand, includeResults=$includeResults, organizationId=$organizationId, projectId=$projectId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
