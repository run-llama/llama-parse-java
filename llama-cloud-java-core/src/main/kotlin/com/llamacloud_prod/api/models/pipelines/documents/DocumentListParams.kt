// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.documents

import com.fasterxml.jackson.annotation.JsonCreator
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Return a list of documents for a pipeline. */
class DocumentListParams
private constructor(
    private val pipelineId: String?,
    private val fileId: String?,
    private val limit: Long?,
    private val onlyApiDataSourceDocuments: Boolean?,
    private val onlyDirectUpload: Boolean?,
    private val skip: Long?,
    private val statusRefreshPolicy: StatusRefreshPolicy?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pipelineId(): Optional<String> = Optional.ofNullable(pipelineId)

    fun fileId(): Optional<String> = Optional.ofNullable(fileId)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun onlyApiDataSourceDocuments(): Optional<Boolean> =
        Optional.ofNullable(onlyApiDataSourceDocuments)

    fun onlyDirectUpload(): Optional<Boolean> = Optional.ofNullable(onlyDirectUpload)

    fun skip(): Optional<Long> = Optional.ofNullable(skip)

    fun statusRefreshPolicy(): Optional<StatusRefreshPolicy> =
        Optional.ofNullable(statusRefreshPolicy)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DocumentListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DocumentListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentListParams]. */
    class Builder internal constructor() {

        private var pipelineId: String? = null
        private var fileId: String? = null
        private var limit: Long? = null
        private var onlyApiDataSourceDocuments: Boolean? = null
        private var onlyDirectUpload: Boolean? = null
        private var skip: Long? = null
        private var statusRefreshPolicy: StatusRefreshPolicy? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentListParams: DocumentListParams) = apply {
            pipelineId = documentListParams.pipelineId
            fileId = documentListParams.fileId
            limit = documentListParams.limit
            onlyApiDataSourceDocuments = documentListParams.onlyApiDataSourceDocuments
            onlyDirectUpload = documentListParams.onlyDirectUpload
            skip = documentListParams.skip
            statusRefreshPolicy = documentListParams.statusRefreshPolicy
            additionalHeaders = documentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentListParams.additionalQueryParams.toBuilder()
        }

        fun pipelineId(pipelineId: String?) = apply { this.pipelineId = pipelineId }

        /** Alias for calling [Builder.pipelineId] with `pipelineId.orElse(null)`. */
        fun pipelineId(pipelineId: Optional<String>) = pipelineId(pipelineId.getOrNull())

        fun fileId(fileId: String?) = apply { this.fileId = fileId }

        /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
        fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun onlyApiDataSourceDocuments(onlyApiDataSourceDocuments: Boolean?) = apply {
            this.onlyApiDataSourceDocuments = onlyApiDataSourceDocuments
        }

        /**
         * Alias for [Builder.onlyApiDataSourceDocuments].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun onlyApiDataSourceDocuments(onlyApiDataSourceDocuments: Boolean) =
            onlyApiDataSourceDocuments(onlyApiDataSourceDocuments as Boolean?)

        /**
         * Alias for calling [Builder.onlyApiDataSourceDocuments] with
         * `onlyApiDataSourceDocuments.orElse(null)`.
         */
        fun onlyApiDataSourceDocuments(onlyApiDataSourceDocuments: Optional<Boolean>) =
            onlyApiDataSourceDocuments(onlyApiDataSourceDocuments.getOrNull())

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

        fun skip(skip: Long?) = apply { this.skip = skip }

        /**
         * Alias for [Builder.skip].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun skip(skip: Long) = skip(skip as Long?)

        /** Alias for calling [Builder.skip] with `skip.orElse(null)`. */
        fun skip(skip: Optional<Long>) = skip(skip.getOrNull())

        fun statusRefreshPolicy(statusRefreshPolicy: StatusRefreshPolicy?) = apply {
            this.statusRefreshPolicy = statusRefreshPolicy
        }

        /**
         * Alias for calling [Builder.statusRefreshPolicy] with `statusRefreshPolicy.orElse(null)`.
         */
        fun statusRefreshPolicy(statusRefreshPolicy: Optional<StatusRefreshPolicy>) =
            statusRefreshPolicy(statusRefreshPolicy.getOrNull())

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
         * Returns an immutable instance of [DocumentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentListParams =
            DocumentListParams(
                pipelineId,
                fileId,
                limit,
                onlyApiDataSourceDocuments,
                onlyDirectUpload,
                skip,
                statusRefreshPolicy,
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
                fileId?.let { put("file_id", it) }
                limit?.let { put("limit", it.toString()) }
                onlyApiDataSourceDocuments?.let {
                    put("only_api_data_source_documents", it.toString())
                }
                onlyDirectUpload?.let { put("only_direct_upload", it.toString()) }
                skip?.let { put("skip", it.toString()) }
                statusRefreshPolicy?.let { put("status_refresh_policy", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class StatusRefreshPolicy
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CACHED = of("cached")

            @JvmField val TTL = of("ttl")

            @JvmStatic fun of(value: String) = StatusRefreshPolicy(JsonField.of(value))
        }

        /** An enum containing [StatusRefreshPolicy]'s known values. */
        enum class Known {
            CACHED,
            TTL,
        }

        /**
         * An enum containing [StatusRefreshPolicy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StatusRefreshPolicy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CACHED,
            TTL,
            /**
             * An enum member indicating that [StatusRefreshPolicy] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CACHED -> Value.CACHED
                TTL -> Value.TTL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CACHED -> Known.CACHED
                TTL -> Known.TTL
                else -> throw LlamaCloudInvalidDataException("Unknown StatusRefreshPolicy: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LlamaCloudInvalidDataException("Value is not a String")
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
        fun validate(): StatusRefreshPolicy = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StatusRefreshPolicy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentListParams &&
            pipelineId == other.pipelineId &&
            fileId == other.fileId &&
            limit == other.limit &&
            onlyApiDataSourceDocuments == other.onlyApiDataSourceDocuments &&
            onlyDirectUpload == other.onlyDirectUpload &&
            skip == other.skip &&
            statusRefreshPolicy == other.statusRefreshPolicy &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            pipelineId,
            fileId,
            limit,
            onlyApiDataSourceDocuments,
            onlyDirectUpload,
            skip,
            statusRefreshPolicy,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DocumentListParams{pipelineId=$pipelineId, fileId=$fileId, limit=$limit, onlyApiDataSourceDocuments=$onlyApiDataSourceDocuments, onlyDirectUpload=$onlyDirectUpload, skip=$skip, statusRefreshPolicy=$statusRefreshPolicy, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
