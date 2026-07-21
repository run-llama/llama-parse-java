// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.sheets

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Generate a presigned URL to download a specific extracted region. */
@Deprecated("deprecated")
class SheetGetResultTableParams
private constructor(
    private val spreadsheetJobId: String,
    private val regionId: String,
    private val regionType: RegionType?,
    private val expiresAtSeconds: Long?,
    private val organizationId: String?,
    private val projectId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun spreadsheetJobId(): String = spreadsheetJobId

    fun regionId(): String = regionId

    fun regionType(): Optional<RegionType> = Optional.ofNullable(regionType)

    fun expiresAtSeconds(): Optional<Long> = Optional.ofNullable(expiresAtSeconds)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SheetGetResultTableParams].
         *
         * The following fields are required:
         * ```java
         * .spreadsheetJobId()
         * .regionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SheetGetResultTableParams]. */
    class Builder internal constructor() {

        private var spreadsheetJobId: String? = null
        private var regionId: String? = null
        private var regionType: RegionType? = null
        private var expiresAtSeconds: Long? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sheetGetResultTableParams: SheetGetResultTableParams) = apply {
            spreadsheetJobId = sheetGetResultTableParams.spreadsheetJobId
            regionId = sheetGetResultTableParams.regionId
            regionType = sheetGetResultTableParams.regionType
            expiresAtSeconds = sheetGetResultTableParams.expiresAtSeconds
            organizationId = sheetGetResultTableParams.organizationId
            projectId = sheetGetResultTableParams.projectId
            additionalHeaders = sheetGetResultTableParams.additionalHeaders.toBuilder()
            additionalQueryParams = sheetGetResultTableParams.additionalQueryParams.toBuilder()
        }

        fun spreadsheetJobId(spreadsheetJobId: String) = apply {
            this.spreadsheetJobId = spreadsheetJobId
        }

        fun regionId(regionId: String) = apply { this.regionId = regionId }

        fun regionType(regionType: RegionType?) = apply { this.regionType = regionType }

        /** Alias for calling [Builder.regionType] with `regionType.orElse(null)`. */
        fun regionType(regionType: Optional<RegionType>) = regionType(regionType.getOrNull())

        fun expiresAtSeconds(expiresAtSeconds: Long?) = apply {
            this.expiresAtSeconds = expiresAtSeconds
        }

        /**
         * Alias for [Builder.expiresAtSeconds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expiresAtSeconds(expiresAtSeconds: Long) = expiresAtSeconds(expiresAtSeconds as Long?)

        /** Alias for calling [Builder.expiresAtSeconds] with `expiresAtSeconds.orElse(null)`. */
        fun expiresAtSeconds(expiresAtSeconds: Optional<Long>) =
            expiresAtSeconds(expiresAtSeconds.getOrNull())

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
         * Returns an immutable instance of [SheetGetResultTableParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .spreadsheetJobId()
         * .regionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SheetGetResultTableParams =
            SheetGetResultTableParams(
                checkRequired("spreadsheetJobId", spreadsheetJobId),
                checkRequired("regionId", regionId),
                regionType,
                expiresAtSeconds,
                organizationId,
                projectId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> spreadsheetJobId
            1 -> regionId
            2 -> regionType?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                expiresAtSeconds?.let { put("expires_at_seconds", it.toString()) }
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class RegionType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CELL_METADATA = of("cell_metadata")

            @JvmField val EXTRA = of("extra")

            @JvmField val TABLE = of("table")

            @JvmStatic fun of(value: String) = RegionType(JsonField.of(value))
        }

        /** An enum containing [RegionType]'s known values. */
        enum class Known {
            CELL_METADATA,
            EXTRA,
            TABLE,
        }

        /**
         * An enum containing [RegionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RegionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CELL_METADATA,
            EXTRA,
            TABLE,
            /**
             * An enum member indicating that [RegionType] was instantiated with an unknown value.
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
                CELL_METADATA -> Value.CELL_METADATA
                EXTRA -> Value.EXTRA
                TABLE -> Value.TABLE
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
                CELL_METADATA -> Known.CELL_METADATA
                EXTRA -> Known.EXTRA
                TABLE -> Known.TABLE
                else -> throw LlamaCloudInvalidDataException("Unknown RegionType: $value")
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
        fun validate(): RegionType = apply {
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

            return other is RegionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SheetGetResultTableParams &&
            spreadsheetJobId == other.spreadsheetJobId &&
            regionId == other.regionId &&
            regionType == other.regionType &&
            expiresAtSeconds == other.expiresAtSeconds &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            spreadsheetJobId,
            regionId,
            regionType,
            expiresAtSeconds,
            organizationId,
            projectId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SheetGetResultTableParams{spreadsheetJobId=$spreadsheetJobId, regionId=$regionId, regionType=$regionType, expiresAtSeconds=$expiresAtSeconds, organizationId=$organizationId, projectId=$projectId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
