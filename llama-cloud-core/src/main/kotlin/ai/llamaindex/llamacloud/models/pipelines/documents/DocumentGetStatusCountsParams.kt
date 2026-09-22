// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.documents

import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Count the documents in a pipeline, grouped by ingestion status.
 *
 * Counts reflect each document's last recorded status rather than a freshly computed one, so a
 * document that changed status in the last few moments may still be counted under its previous one.
 * Use `GET /pipelines/{pipeline_id}/documents/{document_id}/status` when a single document's status
 * has to be up to the moment.
 */
@Deprecated("deprecated")
class DocumentGetStatusCountsParams
private constructor(
    private val pipelineId: String?,
    private val dataSourceId: String?,
    private val fileId: String?,
    private val onlyDirectUpload: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pipelineId(): Optional<String> = Optional.ofNullable(pipelineId)

    fun dataSourceId(): Optional<String> = Optional.ofNullable(dataSourceId)

    fun fileId(): Optional<String> = Optional.ofNullable(fileId)

    fun onlyDirectUpload(): Optional<Boolean> = Optional.ofNullable(onlyDirectUpload)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DocumentGetStatusCountsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [DocumentGetStatusCountsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentGetStatusCountsParams]. */
    class Builder internal constructor() {

        private var pipelineId: String? = null
        private var dataSourceId: String? = null
        private var fileId: String? = null
        private var onlyDirectUpload: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentGetStatusCountsParams: DocumentGetStatusCountsParams) = apply {
            pipelineId = documentGetStatusCountsParams.pipelineId
            dataSourceId = documentGetStatusCountsParams.dataSourceId
            fileId = documentGetStatusCountsParams.fileId
            onlyDirectUpload = documentGetStatusCountsParams.onlyDirectUpload
            additionalHeaders = documentGetStatusCountsParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentGetStatusCountsParams.additionalQueryParams.toBuilder()
        }

        fun pipelineId(pipelineId: String?) = apply { this.pipelineId = pipelineId }

        /** Alias for calling [Builder.pipelineId] with `pipelineId.orElse(null)`. */
        fun pipelineId(pipelineId: Optional<String>) = pipelineId(pipelineId.getOrNull())

        fun dataSourceId(dataSourceId: String?) = apply { this.dataSourceId = dataSourceId }

        /** Alias for calling [Builder.dataSourceId] with `dataSourceId.orElse(null)`. */
        fun dataSourceId(dataSourceId: Optional<String>) = dataSourceId(dataSourceId.getOrNull())

        fun fileId(fileId: String?) = apply { this.fileId = fileId }

        /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
        fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

        fun onlyDirectUpload(onlyDirectUpload: Boolean?) = apply {
            this.onlyDirectUpload = onlyDirectUpload
        }

        /**
         * Alias for [Builder.onlyDirectUpload].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun onlyDirectUpload(onlyDirectUpload: Boolean) =
            onlyDirectUpload(onlyDirectUpload as Boolean?)

        /** Alias for calling [Builder.onlyDirectUpload] with `onlyDirectUpload.orElse(null)`. */
        fun onlyDirectUpload(onlyDirectUpload: Optional<Boolean>) =
            onlyDirectUpload(onlyDirectUpload.getOrNull())

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
         * Returns an immutable instance of [DocumentGetStatusCountsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentGetStatusCountsParams =
            DocumentGetStatusCountsParams(
                pipelineId,
                dataSourceId,
                fileId,
                onlyDirectUpload,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pipelineId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                dataSourceId?.let { put("data_source_id", it) }
                fileId?.let { put("file_id", it) }
                onlyDirectUpload?.let { put("only_direct_upload", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentGetStatusCountsParams &&
            pipelineId == other.pipelineId &&
            dataSourceId == other.dataSourceId &&
            fileId == other.fileId &&
            onlyDirectUpload == other.onlyDirectUpload &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            pipelineId,
            dataSourceId,
            fileId,
            onlyDirectUpload,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DocumentGetStatusCountsParams{pipelineId=$pipelineId, dataSourceId=$dataSourceId, fileId=$fileId, onlyDirectUpload=$onlyDirectUpload, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
