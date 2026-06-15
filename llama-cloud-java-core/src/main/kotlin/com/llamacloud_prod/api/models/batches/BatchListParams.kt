// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.batches

import com.fasterxml.jackson.annotation.JsonCreator
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List batches for the current project. */
class BatchListParams
private constructor(
    private val createdAtOnOrAfter: OffsetDateTime?,
    private val createdAtOnOrBefore: OffsetDateTime?,
    private val organizationId: String?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val projectId: String?,
    private val sourceDirectoryId: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun createdAtOnOrAfter(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtOnOrAfter)

    fun createdAtOnOrBefore(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtOnOrBefore)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    fun sourceDirectoryId(): Optional<String> = Optional.ofNullable(sourceDirectoryId)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BatchListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BatchListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchListParams]. */
    class Builder internal constructor() {

        private var createdAtOnOrAfter: OffsetDateTime? = null
        private var createdAtOnOrBefore: OffsetDateTime? = null
        private var organizationId: String? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var projectId: String? = null
        private var sourceDirectoryId: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchListParams: BatchListParams) = apply {
            createdAtOnOrAfter = batchListParams.createdAtOnOrAfter
            createdAtOnOrBefore = batchListParams.createdAtOnOrBefore
            organizationId = batchListParams.organizationId
            pageSize = batchListParams.pageSize
            pageToken = batchListParams.pageToken
            projectId = batchListParams.projectId
            sourceDirectoryId = batchListParams.sourceDirectoryId
            status = batchListParams.status
            additionalHeaders = batchListParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchListParams.additionalQueryParams.toBuilder()
        }

        fun createdAtOnOrAfter(createdAtOnOrAfter: OffsetDateTime?) = apply {
            this.createdAtOnOrAfter = createdAtOnOrAfter
        }

        /**
         * Alias for calling [Builder.createdAtOnOrAfter] with `createdAtOnOrAfter.orElse(null)`.
         */
        fun createdAtOnOrAfter(createdAtOnOrAfter: Optional<OffsetDateTime>) =
            createdAtOnOrAfter(createdAtOnOrAfter.getOrNull())

        fun createdAtOnOrBefore(createdAtOnOrBefore: OffsetDateTime?) = apply {
            this.createdAtOnOrBefore = createdAtOnOrBefore
        }

        /**
         * Alias for calling [Builder.createdAtOnOrBefore] with `createdAtOnOrBefore.orElse(null)`.
         */
        fun createdAtOnOrBefore(createdAtOnOrBefore: Optional<OffsetDateTime>) =
            createdAtOnOrBefore(createdAtOnOrBefore.getOrNull())

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

        fun sourceDirectoryId(sourceDirectoryId: String?) = apply {
            this.sourceDirectoryId = sourceDirectoryId
        }

        /** Alias for calling [Builder.sourceDirectoryId] with `sourceDirectoryId.orElse(null)`. */
        fun sourceDirectoryId(sourceDirectoryId: Optional<String>) =
            sourceDirectoryId(sourceDirectoryId.getOrNull())

        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

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
         * Returns an immutable instance of [BatchListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BatchListParams =
            BatchListParams(
                createdAtOnOrAfter,
                createdAtOnOrBefore,
                organizationId,
                pageSize,
                pageToken,
                projectId,
                sourceDirectoryId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdAtOnOrAfter?.let {
                    put("created_at_on_or_after", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtOnOrBefore?.let {
                    put(
                        "created_at_on_or_before",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                organizationId?.let { put("organization_id", it) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                projectId?.let { put("project_id", it) }
                sourceDirectoryId?.let { put("source_directory_id", it) }
                status?.let { put("status", it.toString()) }
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

            @JvmField val PENDING = of("PENDING")

            @JvmField val THROTTLED = of("THROTTLED")

            @JvmField val RUNNING = of("RUNNING")

            @JvmField val COMPLETED = of("COMPLETED")

            @JvmField val FAILED = of("FAILED")

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            THROTTLED,
            RUNNING,
            COMPLETED,
            FAILED,
            CANCELLED,
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
            PENDING,
            THROTTLED,
            RUNNING,
            COMPLETED,
            FAILED,
            CANCELLED,
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
                PENDING -> Value.PENDING
                THROTTLED -> Value.THROTTLED
                RUNNING -> Value.RUNNING
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                CANCELLED -> Value.CANCELLED
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
                PENDING -> Known.PENDING
                THROTTLED -> Known.THROTTLED
                RUNNING -> Known.RUNNING
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                CANCELLED -> Known.CANCELLED
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

        return other is BatchListParams &&
            createdAtOnOrAfter == other.createdAtOnOrAfter &&
            createdAtOnOrBefore == other.createdAtOnOrBefore &&
            organizationId == other.organizationId &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            projectId == other.projectId &&
            sourceDirectoryId == other.sourceDirectoryId &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            createdAtOnOrAfter,
            createdAtOnOrBefore,
            organizationId,
            pageSize,
            pageToken,
            projectId,
            sourceDirectoryId,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BatchListParams{createdAtOnOrAfter=$createdAtOnOrAfter, createdAtOnOrBefore=$createdAtOnOrBefore, organizationId=$organizationId, pageSize=$pageSize, pageToken=$pageToken, projectId=$projectId, sourceDirectoryId=$sourceDirectoryId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
