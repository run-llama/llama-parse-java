// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a parse job with optional expanded content.
 *
 * By default returns job metadata only. Use `expand` to include parsed content:
 * - `text` — plain text output
 * - `markdown` — markdown output
 * - `items` — structured page-by-page output
 * - `job_metadata` — usage and processing details
 *
 * Content metadata fields (e.g. `text_content_metadata`) return presigned URLs for downloading
 * large results.
 */
class ParsingGetParams
private constructor(
    private val jobId: String?,
    private val expand: List<String>?,
    private val imageFilenames: String?,
    private val organizationId: String?,
    private val projectId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun jobId(): Optional<String> = Optional.ofNullable(jobId)

    /**
     * Fields to include: text, markdown, items, metadata, forms, job_metadata,
     * text_content_metadata, markdown_content_metadata, items_content_metadata,
     * metadata_content_metadata, forms_content_metadata, raw_words_content_metadata,
     * xlsx_content_metadata, output_pdf_content_metadata, images_content_metadata. Metadata fields
     * include presigned URLs.
     */
    fun expand(): Optional<List<String>> = Optional.ofNullable(expand)

    /** Filter to specific image filenames (optional). Example: image_0.png,image_1.jpg */
    fun imageFilenames(): Optional<String> = Optional.ofNullable(imageFilenames)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ParsingGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ParsingGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParsingGetParams]. */
    class Builder internal constructor() {

        private var jobId: String? = null
        private var expand: MutableList<String>? = null
        private var imageFilenames: String? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(parsingGetParams: ParsingGetParams) = apply {
            jobId = parsingGetParams.jobId
            expand = parsingGetParams.expand?.toMutableList()
            imageFilenames = parsingGetParams.imageFilenames
            organizationId = parsingGetParams.organizationId
            projectId = parsingGetParams.projectId
            additionalHeaders = parsingGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = parsingGetParams.additionalQueryParams.toBuilder()
        }

        fun jobId(jobId: String?) = apply { this.jobId = jobId }

        /** Alias for calling [Builder.jobId] with `jobId.orElse(null)`. */
        fun jobId(jobId: Optional<String>) = jobId(jobId.getOrNull())

        /**
         * Fields to include: text, markdown, items, metadata, forms, job_metadata,
         * text_content_metadata, markdown_content_metadata, items_content_metadata,
         * metadata_content_metadata, forms_content_metadata, raw_words_content_metadata,
         * xlsx_content_metadata, output_pdf_content_metadata, images_content_metadata. Metadata
         * fields include presigned URLs.
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

        /** Filter to specific image filenames (optional). Example: image_0.png,image_1.jpg */
        fun imageFilenames(imageFilenames: String?) = apply { this.imageFilenames = imageFilenames }

        /** Alias for calling [Builder.imageFilenames] with `imageFilenames.orElse(null)`. */
        fun imageFilenames(imageFilenames: Optional<String>) =
            imageFilenames(imageFilenames.getOrNull())

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
         * Returns an immutable instance of [ParsingGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ParsingGetParams =
            ParsingGetParams(
                jobId,
                expand?.toImmutable(),
                imageFilenames,
                organizationId,
                projectId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> jobId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                expand?.forEach { put("expand", it) }
                imageFilenames?.let { put("image_filenames", it) }
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParsingGetParams &&
            jobId == other.jobId &&
            expand == other.expand &&
            imageFilenames == other.imageFilenames &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            jobId,
            expand,
            imageFilenames,
            organizationId,
            projectId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ParsingGetParams{jobId=$jobId, expand=$expand, imageFilenames=$imageFilenames, organizationId=$organizationId, projectId=$projectId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
