// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Search for pipelines by name, type, or project. */
@Deprecated("deprecated")
class PipelineListParams
private constructor(
    private val organizationId: String?,
    private val pipelineName: String?,
    private val pipelineType: PipelineType?,
    private val projectId: String?,
    private val projectName: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun pipelineName(): Optional<String> = Optional.ofNullable(pipelineName)

    /** Enum for representing the type of a pipeline */
    fun pipelineType(): Optional<PipelineType> = Optional.ofNullable(pipelineType)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    fun projectName(): Optional<String> = Optional.ofNullable(projectName)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PipelineListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PipelineListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineListParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var pipelineName: String? = null
        private var pipelineType: PipelineType? = null
        private var projectId: String? = null
        private var projectName: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pipelineListParams: PipelineListParams) = apply {
            organizationId = pipelineListParams.organizationId
            pipelineName = pipelineListParams.pipelineName
            pipelineType = pipelineListParams.pipelineType
            projectId = pipelineListParams.projectId
            projectName = pipelineListParams.projectName
            additionalHeaders = pipelineListParams.additionalHeaders.toBuilder()
            additionalQueryParams = pipelineListParams.additionalQueryParams.toBuilder()
        }

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun pipelineName(pipelineName: String?) = apply { this.pipelineName = pipelineName }

        /** Alias for calling [Builder.pipelineName] with `pipelineName.orElse(null)`. */
        fun pipelineName(pipelineName: Optional<String>) = pipelineName(pipelineName.getOrNull())

        /** Enum for representing the type of a pipeline */
        fun pipelineType(pipelineType: PipelineType?) = apply { this.pipelineType = pipelineType }

        /** Alias for calling [Builder.pipelineType] with `pipelineType.orElse(null)`. */
        fun pipelineType(pipelineType: Optional<PipelineType>) =
            pipelineType(pipelineType.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        fun projectName(projectName: String?) = apply { this.projectName = projectName }

        /** Alias for calling [Builder.projectName] with `projectName.orElse(null)`. */
        fun projectName(projectName: Optional<String>) = projectName(projectName.getOrNull())

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
         * Returns an immutable instance of [PipelineListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PipelineListParams =
            PipelineListParams(
                organizationId,
                pipelineName,
                pipelineType,
                projectId,
                projectName,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                pipelineName?.let { put("pipeline_name", it) }
                pipelineType?.let { put("pipeline_type", it.toString()) }
                projectId?.let { put("project_id", it) }
                projectName?.let { put("project_name", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelineListParams &&
            organizationId == other.organizationId &&
            pipelineName == other.pipelineName &&
            pipelineType == other.pipelineType &&
            projectId == other.projectId &&
            projectName == other.projectName &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            organizationId,
            pipelineName,
            pipelineType,
            projectId,
            projectName,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PipelineListParams{organizationId=$organizationId, pipelineName=$pipelineName, pipelineType=$pipelineType, projectId=$projectId, projectName=$projectName, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
