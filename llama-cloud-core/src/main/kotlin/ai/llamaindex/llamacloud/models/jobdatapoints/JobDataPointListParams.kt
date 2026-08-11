// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.jobdatapoints

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns paginated job data points for the current project. */
class JobDataPointListParams
private constructor(
    private val jobType: JobType,
    private val createdAtOnOrAfter: OffsetDateTime?,
    private val createdAtOnOrBefore: OffsetDateTime?,
    private val hours: Long?,
    private val organizationId: String?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val projectId: String?,
    private val status: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Job type to query. */
    fun jobType(): JobType = jobType

    /** Include items created at or after this timestamp (inclusive) */
    fun createdAtOnOrAfter(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtOnOrAfter)

    /** Include items created at or before this timestamp (inclusive) */
    fun createdAtOnOrBefore(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtOnOrBefore)

    /** Hours of history to include. */
    fun hours(): Optional<Long> = Optional.ofNullable(hours)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    /** Number of items per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Cursor token for the next page. */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Filter by status. */
    fun status(): Optional<List<String>> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobDataPointListParams].
         *
         * The following fields are required:
         * ```java
         * .jobType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobDataPointListParams]. */
    class Builder internal constructor() {

        private var jobType: JobType? = null
        private var createdAtOnOrAfter: OffsetDateTime? = null
        private var createdAtOnOrBefore: OffsetDateTime? = null
        private var hours: Long? = null
        private var organizationId: String? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var projectId: String? = null
        private var status: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(jobDataPointListParams: JobDataPointListParams) = apply {
            jobType = jobDataPointListParams.jobType
            createdAtOnOrAfter = jobDataPointListParams.createdAtOnOrAfter
            createdAtOnOrBefore = jobDataPointListParams.createdAtOnOrBefore
            hours = jobDataPointListParams.hours
            organizationId = jobDataPointListParams.organizationId
            pageSize = jobDataPointListParams.pageSize
            pageToken = jobDataPointListParams.pageToken
            projectId = jobDataPointListParams.projectId
            status = jobDataPointListParams.status?.toMutableList()
            additionalHeaders = jobDataPointListParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobDataPointListParams.additionalQueryParams.toBuilder()
        }

        /** Job type to query. */
        fun jobType(jobType: JobType) = apply { this.jobType = jobType }

        /** Include items created at or after this timestamp (inclusive) */
        fun createdAtOnOrAfter(createdAtOnOrAfter: OffsetDateTime?) = apply {
            this.createdAtOnOrAfter = createdAtOnOrAfter
        }

        /**
         * Alias for calling [Builder.createdAtOnOrAfter] with `createdAtOnOrAfter.orElse(null)`.
         */
        fun createdAtOnOrAfter(createdAtOnOrAfter: Optional<OffsetDateTime>) =
            createdAtOnOrAfter(createdAtOnOrAfter.getOrNull())

        /** Include items created at or before this timestamp (inclusive) */
        fun createdAtOnOrBefore(createdAtOnOrBefore: OffsetDateTime?) = apply {
            this.createdAtOnOrBefore = createdAtOnOrBefore
        }

        /**
         * Alias for calling [Builder.createdAtOnOrBefore] with `createdAtOnOrBefore.orElse(null)`.
         */
        fun createdAtOnOrBefore(createdAtOnOrBefore: Optional<OffsetDateTime>) =
            createdAtOnOrBefore(createdAtOnOrBefore.getOrNull())

        /** Hours of history to include. */
        fun hours(hours: Long?) = apply { this.hours = hours }

        /**
         * Alias for [Builder.hours].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hours(hours: Long) = hours(hours as Long?)

        /** Alias for calling [Builder.hours] with `hours.orElse(null)`. */
        fun hours(hours: Optional<Long>) = hours(hours.getOrNull())

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        /** Number of items per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Cursor token for the next page. */
        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /** Filter by status. */
        fun status(status: List<String>?) = apply { this.status = status?.toMutableList() }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<List<String>>) = status(status.getOrNull())

        /**
         * Adds a single [String] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: String) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
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
         * Returns an immutable instance of [JobDataPointListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .jobType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobDataPointListParams =
            JobDataPointListParams(
                checkRequired("jobType", jobType),
                createdAtOnOrAfter,
                createdAtOnOrBefore,
                hours,
                organizationId,
                pageSize,
                pageToken,
                projectId,
                status?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("job_type", jobType.toString())
                createdAtOnOrAfter?.let {
                    put("created_at_on_or_after", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtOnOrBefore?.let {
                    put(
                        "created_at_on_or_before",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                hours?.let { put("hours", it.toString()) }
                organizationId?.let { put("organization_id", it) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                projectId?.let { put("project_id", it) }
                status?.forEach { put("status", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Job type to query. */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobDataPointListParams &&
            jobType == other.jobType &&
            createdAtOnOrAfter == other.createdAtOnOrAfter &&
            createdAtOnOrBefore == other.createdAtOnOrBefore &&
            hours == other.hours &&
            organizationId == other.organizationId &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            projectId == other.projectId &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            jobType,
            createdAtOnOrAfter,
            createdAtOnOrBefore,
            hours,
            organizationId,
            pageSize,
            pageToken,
            projectId,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "JobDataPointListParams{jobType=$jobType, createdAtOnOrAfter=$createdAtOnOrAfter, createdAtOnOrBefore=$createdAtOnOrBefore, hours=$hours, organizationId=$organizationId, pageSize=$pageSize, pageToken=$pageToken, projectId=$projectId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
