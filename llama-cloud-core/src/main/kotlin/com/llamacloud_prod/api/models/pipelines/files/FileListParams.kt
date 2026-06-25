// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.files

import com.fasterxml.jackson.annotation.JsonCreator
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List files for a pipeline with optional filtering, sorting, and pagination. */
@Deprecated("deprecated")
class FileListParams
private constructor(
    private val pipelineId: String?,
    private val dataSourceId: String?,
    private val fileNameContains: String?,
    private val limit: Long?,
    private val offset: Long?,
    private val onlyManuallyUploaded: Boolean?,
    private val orderBy: String?,
    private val statuses: List<Status>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pipelineId(): Optional<String> = Optional.ofNullable(pipelineId)

    fun dataSourceId(): Optional<String> = Optional.ofNullable(dataSourceId)

    fun fileNameContains(): Optional<String> = Optional.ofNullable(fileNameContains)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun onlyManuallyUploaded(): Optional<Boolean> = Optional.ofNullable(onlyManuallyUploaded)

    fun orderBy(): Optional<String> = Optional.ofNullable(orderBy)

    /** Filter by file statuses */
    fun statuses(): Optional<List<Status>> = Optional.ofNullable(statuses)

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

        private var pipelineId: String? = null
        private var dataSourceId: String? = null
        private var fileNameContains: String? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var onlyManuallyUploaded: Boolean? = null
        private var orderBy: String? = null
        private var statuses: MutableList<Status>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileListParams: FileListParams) = apply {
            pipelineId = fileListParams.pipelineId
            dataSourceId = fileListParams.dataSourceId
            fileNameContains = fileListParams.fileNameContains
            limit = fileListParams.limit
            offset = fileListParams.offset
            onlyManuallyUploaded = fileListParams.onlyManuallyUploaded
            orderBy = fileListParams.orderBy
            statuses = fileListParams.statuses?.toMutableList()
            additionalHeaders = fileListParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileListParams.additionalQueryParams.toBuilder()
        }

        fun pipelineId(pipelineId: String?) = apply { this.pipelineId = pipelineId }

        /** Alias for calling [Builder.pipelineId] with `pipelineId.orElse(null)`. */
        fun pipelineId(pipelineId: Optional<String>) = pipelineId(pipelineId.getOrNull())

        fun dataSourceId(dataSourceId: String?) = apply { this.dataSourceId = dataSourceId }

        /** Alias for calling [Builder.dataSourceId] with `dataSourceId.orElse(null)`. */
        fun dataSourceId(dataSourceId: Optional<String>) = dataSourceId(dataSourceId.getOrNull())

        fun fileNameContains(fileNameContains: String?) = apply {
            this.fileNameContains = fileNameContains
        }

        /** Alias for calling [Builder.fileNameContains] with `fileNameContains.orElse(null)`. */
        fun fileNameContains(fileNameContains: Optional<String>) =
            fileNameContains(fileNameContains.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        fun onlyManuallyUploaded(onlyManuallyUploaded: Boolean?) = apply {
            this.onlyManuallyUploaded = onlyManuallyUploaded
        }

        /**
         * Alias for [Builder.onlyManuallyUploaded].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun onlyManuallyUploaded(onlyManuallyUploaded: Boolean) =
            onlyManuallyUploaded(onlyManuallyUploaded as Boolean?)

        /**
         * Alias for calling [Builder.onlyManuallyUploaded] with
         * `onlyManuallyUploaded.orElse(null)`.
         */
        fun onlyManuallyUploaded(onlyManuallyUploaded: Optional<Boolean>) =
            onlyManuallyUploaded(onlyManuallyUploaded.getOrNull())

        fun orderBy(orderBy: String?) = apply { this.orderBy = orderBy }

        /** Alias for calling [Builder.orderBy] with `orderBy.orElse(null)`. */
        fun orderBy(orderBy: Optional<String>) = orderBy(orderBy.getOrNull())

        /** Filter by file statuses */
        fun statuses(statuses: List<Status>?) = apply { this.statuses = statuses?.toMutableList() }

        /** Alias for calling [Builder.statuses] with `statuses.orElse(null)`. */
        fun statuses(statuses: Optional<List<Status>>) = statuses(statuses.getOrNull())

        /**
         * Adds a single [Status] to [statuses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: Status) = apply {
            statuses = (statuses ?: mutableListOf()).apply { add(status) }
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
         * Returns an immutable instance of [FileListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileListParams =
            FileListParams(
                pipelineId,
                dataSourceId,
                fileNameContains,
                limit,
                offset,
                onlyManuallyUploaded,
                orderBy,
                statuses?.toImmutable(),
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
                fileNameContains?.let { put("file_name_contains", it) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                onlyManuallyUploaded?.let { put("only_manually_uploaded", it.toString()) }
                orderBy?.let { put("order_by", it) }
                statuses?.forEach { put("statuses", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmField val ERROR = of("ERROR")

            @JvmField val IN_PROGRESS = of("IN_PROGRESS")

            @JvmField val NOT_STARTED = of("NOT_STARTED")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            ERROR,
            IN_PROGRESS,
            NOT_STARTED,
            SUCCESS,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELLED,
            ERROR,
            IN_PROGRESS,
            NOT_STARTED,
            SUCCESS,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                CANCELLED -> Value.CANCELLED
                ERROR -> Value.ERROR
                IN_PROGRESS -> Value.IN_PROGRESS
                NOT_STARTED -> Value.NOT_STARTED
                SUCCESS -> Value.SUCCESS
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
                CANCELLED -> Known.CANCELLED
                ERROR -> Known.ERROR
                IN_PROGRESS -> Known.IN_PROGRESS
                NOT_STARTED -> Known.NOT_STARTED
                SUCCESS -> Known.SUCCESS
                else -> throw LlamaCloudInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileListParams &&
            pipelineId == other.pipelineId &&
            dataSourceId == other.dataSourceId &&
            fileNameContains == other.fileNameContains &&
            limit == other.limit &&
            offset == other.offset &&
            onlyManuallyUploaded == other.onlyManuallyUploaded &&
            orderBy == other.orderBy &&
            statuses == other.statuses &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            pipelineId,
            dataSourceId,
            fileNameContains,
            limit,
            offset,
            onlyManuallyUploaded,
            orderBy,
            statuses,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FileListParams{pipelineId=$pipelineId, dataSourceId=$dataSourceId, fileNameContains=$fileNameContains, limit=$limit, offset=$offset, onlyManuallyUploaded=$onlyManuallyUploaded, orderBy=$orderBy, statuses=$statuses, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
