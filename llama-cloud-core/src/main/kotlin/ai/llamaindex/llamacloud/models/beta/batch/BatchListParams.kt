// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.batch

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List batch processing jobs with optional filtering.
 *
 * Filter by `directory_id`, `job_type`, or `status`. Results are paginated with configurable
 * `limit` and `offset`.
 */
class BatchListParams
private constructor(
    private val directoryId: String?,
    private val jobType: JobType?,
    private val limit: Long?,
    private val offset: Long?,
    private val organizationId: String?,
    private val projectId: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by directory ID */
    fun directoryId(): Optional<String> = Optional.ofNullable(directoryId)

    /** Filter by job type (PARSE, EXTRACT, CLASSIFY) */
    fun jobType(): Optional<JobType> = Optional.ofNullable(jobType)

    /** Maximum number of jobs to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Number of jobs to skip for pagination */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Filter by job status (PENDING, RUNNING, COMPLETED, FAILED, CANCELLED) */
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

        private var directoryId: String? = null
        private var jobType: JobType? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchListParams: BatchListParams) = apply {
            directoryId = batchListParams.directoryId
            jobType = batchListParams.jobType
            limit = batchListParams.limit
            offset = batchListParams.offset
            organizationId = batchListParams.organizationId
            projectId = batchListParams.projectId
            status = batchListParams.status
            additionalHeaders = batchListParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by directory ID */
        fun directoryId(directoryId: String?) = apply { this.directoryId = directoryId }

        /** Alias for calling [Builder.directoryId] with `directoryId.orElse(null)`. */
        fun directoryId(directoryId: Optional<String>) = directoryId(directoryId.getOrNull())

        /** Filter by job type (PARSE, EXTRACT, CLASSIFY) */
        fun jobType(jobType: JobType?) = apply { this.jobType = jobType }

        /** Alias for calling [Builder.jobType] with `jobType.orElse(null)`. */
        fun jobType(jobType: Optional<JobType>) = jobType(jobType.getOrNull())

        /** Maximum number of jobs to return */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Number of jobs to skip for pagination */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /** Filter by job status (PENDING, RUNNING, COMPLETED, FAILED, CANCELLED) */
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
                directoryId,
                jobType,
                limit,
                offset,
                organizationId,
                projectId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                directoryId?.let { put("directory_id", it) }
                jobType?.let { put("job_type", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                status?.let { put("status", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by job type (PARSE, EXTRACT, CLASSIFY) */
    class JobType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CLASSIFY = of("classify")

            @JvmField val EXTRACT = of("extract")

            @JvmField val PARSE = of("parse")

            @JvmStatic fun of(value: String) = JobType(JsonField.of(value))
        }

        /** An enum containing [JobType]'s known values. */
        enum class Known {
            CLASSIFY,
            EXTRACT,
            PARSE,
        }

        /**
         * An enum containing [JobType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [JobType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CLASSIFY,
            EXTRACT,
            PARSE,
            /** An enum member indicating that [JobType] was instantiated with an unknown value. */
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
                CLASSIFY -> Value.CLASSIFY
                EXTRACT -> Value.EXTRACT
                PARSE -> Value.PARSE
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
                CLASSIFY -> Known.CLASSIFY
                EXTRACT -> Known.EXTRACT
                PARSE -> Known.PARSE
                else -> throw LlamaCloudInvalidDataException("Unknown JobType: $value")
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
        fun validate(): JobType = apply {
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

            return other is JobType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Filter by job status (PENDING, RUNNING, COMPLETED, FAILED, CANCELLED) */
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

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val COMPLETED = of("completed")

            @JvmField val DISPATCHED = of("dispatched")

            @JvmField val FAILED = of("failed")

            @JvmField val PENDING = of("pending")

            @JvmField val RUNNING = of("running")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            COMPLETED,
            DISPATCHED,
            FAILED,
            PENDING,
            RUNNING,
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
            COMPLETED,
            DISPATCHED,
            FAILED,
            PENDING,
            RUNNING,
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
                COMPLETED -> Value.COMPLETED
                DISPATCHED -> Value.DISPATCHED
                FAILED -> Value.FAILED
                PENDING -> Value.PENDING
                RUNNING -> Value.RUNNING
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
                COMPLETED -> Known.COMPLETED
                DISPATCHED -> Known.DISPATCHED
                FAILED -> Known.FAILED
                PENDING -> Known.PENDING
                RUNNING -> Known.RUNNING
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
            directoryId == other.directoryId &&
            jobType == other.jobType &&
            limit == other.limit &&
            offset == other.offset &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            directoryId,
            jobType,
            limit,
            offset,
            organizationId,
            projectId,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BatchListParams{directoryId=$directoryId, jobType=$jobType, limit=$limit, offset=$offset, organizationId=$organizationId, projectId=$projectId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
