// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

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

/** List product configurations for the current project. */
class ConfigurationListParams
private constructor(
    private val latestOnly: Boolean?,
    private val name: String?,
    private val organizationId: String?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val productType: List<ProductType>?,
    private val projectId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Return only the latest version per configuration name. */
    fun latestOnly(): Optional<Boolean> = Optional.ofNullable(latestOnly)

    /** Filter by configuration name. */
    fun name(): Optional<String> = Optional.ofNullable(name)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    /** Number of items per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Pagination token. */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** Filter by one or more product types. Repeat the parameter for multiple values. */
    fun productType(): Optional<List<ProductType>> = Optional.ofNullable(productType)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ConfigurationListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ConfigurationListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConfigurationListParams]. */
    class Builder internal constructor() {

        private var latestOnly: Boolean? = null
        private var name: String? = null
        private var organizationId: String? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var productType: MutableList<ProductType>? = null
        private var projectId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(configurationListParams: ConfigurationListParams) = apply {
            latestOnly = configurationListParams.latestOnly
            name = configurationListParams.name
            organizationId = configurationListParams.organizationId
            pageSize = configurationListParams.pageSize
            pageToken = configurationListParams.pageToken
            productType = configurationListParams.productType?.toMutableList()
            projectId = configurationListParams.projectId
            additionalHeaders = configurationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = configurationListParams.additionalQueryParams.toBuilder()
        }

        /** Return only the latest version per configuration name. */
        fun latestOnly(latestOnly: Boolean?) = apply { this.latestOnly = latestOnly }

        /**
         * Alias for [Builder.latestOnly].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latestOnly(latestOnly: Boolean) = latestOnly(latestOnly as Boolean?)

        /** Alias for calling [Builder.latestOnly] with `latestOnly.orElse(null)`. */
        fun latestOnly(latestOnly: Optional<Boolean>) = latestOnly(latestOnly.getOrNull())

        /** Filter by configuration name. */
        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

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

        /** Pagination token. */
        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        /** Filter by one or more product types. Repeat the parameter for multiple values. */
        fun productType(productType: List<ProductType>?) = apply {
            this.productType = productType?.toMutableList()
        }

        /** Alias for calling [Builder.productType] with `productType.orElse(null)`. */
        fun productType(productType: Optional<List<ProductType>>) =
            productType(productType.getOrNull())

        /**
         * Adds a single [ProductType] to [Builder.productType].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProductType(productType: ProductType) = apply {
            this.productType = (this.productType ?: mutableListOf()).apply { add(productType) }
        }

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
         * Returns an immutable instance of [ConfigurationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConfigurationListParams =
            ConfigurationListParams(
                latestOnly,
                name,
                organizationId,
                pageSize,
                pageToken,
                productType?.toImmutable(),
                projectId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                latestOnly?.let { put("latest_only", it.toString()) }
                name?.let { put("name", it) }
                organizationId?.let { put("organization_id", it) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                productType?.forEach { put("product_type", it.toString()) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class ProductType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CLASSIFY_V2 = of("classify_v2")

            @JvmField val EXTRACT_V2 = of("extract_v2")

            @JvmField val PARSE_V2 = of("parse_v2")

            @JvmField val SPLIT_V1 = of("split_v1")

            @JvmField val SPREADSHEET_V1 = of("spreadsheet_v1")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = ProductType(JsonField.of(value))
        }

        /** An enum containing [ProductType]'s known values. */
        enum class Known {
            CLASSIFY_V2,
            EXTRACT_V2,
            PARSE_V2,
            SPLIT_V1,
            SPREADSHEET_V1,
            UNKNOWN,
        }

        /**
         * An enum containing [ProductType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ProductType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CLASSIFY_V2,
            EXTRACT_V2,
            PARSE_V2,
            SPLIT_V1,
            SPREADSHEET_V1,
            UNKNOWN,
            /**
             * An enum member indicating that [ProductType] was instantiated with an unknown value.
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
                CLASSIFY_V2 -> Value.CLASSIFY_V2
                EXTRACT_V2 -> Value.EXTRACT_V2
                PARSE_V2 -> Value.PARSE_V2
                SPLIT_V1 -> Value.SPLIT_V1
                SPREADSHEET_V1 -> Value.SPREADSHEET_V1
                UNKNOWN -> Value.UNKNOWN
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
                CLASSIFY_V2 -> Known.CLASSIFY_V2
                EXTRACT_V2 -> Known.EXTRACT_V2
                PARSE_V2 -> Known.PARSE_V2
                SPLIT_V1 -> Known.SPLIT_V1
                SPREADSHEET_V1 -> Known.SPREADSHEET_V1
                UNKNOWN -> Known.UNKNOWN
                else -> throw LlamaCloudInvalidDataException("Unknown ProductType: $value")
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
        fun validate(): ProductType = apply {
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

            return other is ProductType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigurationListParams &&
            latestOnly == other.latestOnly &&
            name == other.name &&
            organizationId == other.organizationId &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            productType == other.productType &&
            projectId == other.projectId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            latestOnly,
            name,
            organizationId,
            pageSize,
            pageToken,
            productType,
            projectId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ConfigurationListParams{latestOnly=$latestOnly, name=$name, organizationId=$organizationId, pageSize=$pageSize, pageToken=$pageToken, productType=$productType, projectId=$projectId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
