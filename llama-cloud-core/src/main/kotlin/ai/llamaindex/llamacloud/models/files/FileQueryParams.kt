// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.files

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Query files with filtering and pagination. Deprecated: use `GET /files`. */
@Deprecated("Use the GET /files endpoint instead")
class FileQueryParams
private constructor(
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * Filter parameters for file queries.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<Filter> = body.filter()

    /**
     * A comma-separated list of fields to order by, sorted in ascending order. Use 'field_name
     * desc' to specify descending order.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orderBy(): Optional<String> = body.orderBy()

    /**
     * The maximum number of items to return. The service may return fewer than this value. If
     * unspecified, a default page size will be used. The maximum value is typically 1000; values
     * above this will be coerced to the maximum.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = body.pageSize()

    /**
     * A page token, received from a previous list call. Provide this to retrieve the subsequent
     * page.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageToken(): Optional<String> = body.pageToken()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<Filter> = body._filter()

    /**
     * Returns the raw JSON value of [orderBy].
     *
     * Unlike [orderBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orderBy(): JsonField<String> = body._orderBy()

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageSize(): JsonField<Long> = body._pageSize()

    /**
     * Returns the raw JSON value of [pageToken].
     *
     * Unlike [pageToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageToken(): JsonField<String> = body._pageToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FileQueryParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FileQueryParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileQueryParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileQueryParams: FileQueryParams) = apply {
            organizationId = fileQueryParams.organizationId
            projectId = fileQueryParams.projectId
            body = fileQueryParams.body.toBuilder()
            additionalHeaders = fileQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileQueryParams.additionalQueryParams.toBuilder()
        }

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [filter]
         * - [orderBy]
         * - [pageSize]
         * - [pageToken]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Filter parameters for file queries. */
        fun filter(filter: Filter?) = apply { body.filter(filter) }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [Filter] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<Filter>) = apply { body.filter(filter) }

        /**
         * A comma-separated list of fields to order by, sorted in ascending order. Use 'field_name
         * desc' to specify descending order.
         */
        fun orderBy(orderBy: String?) = apply { body.orderBy(orderBy) }

        /** Alias for calling [Builder.orderBy] with `orderBy.orElse(null)`. */
        fun orderBy(orderBy: Optional<String>) = orderBy(orderBy.getOrNull())

        /**
         * Sets [Builder.orderBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderBy] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orderBy(orderBy: JsonField<String>) = apply { body.orderBy(orderBy) }

        /**
         * The maximum number of items to return. The service may return fewer than this value. If
         * unspecified, a default page size will be used. The maximum value is typically 1000;
         * values above this will be coerced to the maximum.
         */
        fun pageSize(pageSize: Long?) = apply { body.pageSize(pageSize) }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { body.pageSize(pageSize) }

        /**
         * A page token, received from a previous list call. Provide this to retrieve the subsequent
         * page.
         */
        fun pageToken(pageToken: String?) = apply { body.pageToken(pageToken) }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        /**
         * Sets [Builder.pageToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pageToken(pageToken: JsonField<String>) = apply { body.pageToken(pageToken) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [FileQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileQueryParams =
            FileQueryParams(
                organizationId,
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Request schema for querying files with pagination and filtering. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val filter: JsonField<Filter>,
        private val orderBy: JsonField<String>,
        private val pageSize: JsonField<Long>,
        private val pageToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<Filter> = JsonMissing.of(),
            @JsonProperty("order_by") @ExcludeMissing orderBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_token")
            @ExcludeMissing
            pageToken: JsonField<String> = JsonMissing.of(),
        ) : this(filter, orderBy, pageSize, pageToken, mutableMapOf())

        /**
         * Filter parameters for file queries.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<Filter> = filter.getOptional("filter")

        /**
         * A comma-separated list of fields to order by, sorted in ascending order. Use 'field_name
         * desc' to specify descending order.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun orderBy(): Optional<String> = orderBy.getOptional("order_by")

        /**
         * The maximum number of items to return. The service may return fewer than this value. If
         * unspecified, a default page size will be used. The maximum value is typically 1000;
         * values above this will be coerced to the maximum.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * A page token, received from a previous list call. Provide this to retrieve the subsequent
         * page.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageToken(): Optional<String> = pageToken.getOptional("page_token")

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<Filter> = filter

        /**
         * Returns the raw JSON value of [orderBy].
         *
         * Unlike [orderBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order_by") @ExcludeMissing fun _orderBy(): JsonField<String> = orderBy

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [pageToken].
         *
         * Unlike [pageToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_token") @ExcludeMissing fun _pageToken(): JsonField<String> = pageToken

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var filter: JsonField<Filter> = JsonMissing.of()
            private var orderBy: JsonField<String> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var pageToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                filter = body.filter
                orderBy = body.orderBy
                pageSize = body.pageSize
                pageToken = body.pageToken
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Filter parameters for file queries. */
            fun filter(filter: Filter?) = filter(JsonField.ofNullable(filter))

            /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
            fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [Filter] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<Filter>) = apply { this.filter = filter }

            /**
             * A comma-separated list of fields to order by, sorted in ascending order. Use
             * 'field_name desc' to specify descending order.
             */
            fun orderBy(orderBy: String?) = orderBy(JsonField.ofNullable(orderBy))

            /** Alias for calling [Builder.orderBy] with `orderBy.orElse(null)`. */
            fun orderBy(orderBy: Optional<String>) = orderBy(orderBy.getOrNull())

            /**
             * Sets [Builder.orderBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orderBy(orderBy: JsonField<String>) = apply { this.orderBy = orderBy }

            /**
             * The maximum number of items to return. The service may return fewer than this value.
             * If unspecified, a default page size will be used. The maximum value is typically
             * 1000; values above this will be coerced to the maximum.
             */
            fun pageSize(pageSize: Long?) = pageSize(JsonField.ofNullable(pageSize))

            /**
             * Alias for [Builder.pageSize].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

            /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
            fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            /**
             * A page token, received from a previous list call. Provide this to retrieve the
             * subsequent page.
             */
            fun pageToken(pageToken: String?) = pageToken(JsonField.ofNullable(pageToken))

            /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
            fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

            /**
             * Sets [Builder.pageToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageToken] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageToken(pageToken: JsonField<String>) = apply { this.pageToken = pageToken }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(filter, orderBy, pageSize, pageToken, additionalProperties.toMutableMap())
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            filter().ifPresent { it.validate() }
            orderBy()
            pageSize()
            pageToken()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (filter.asKnown().getOrNull()?.validity() ?: 0) +
                (if (orderBy.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (pageToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                filter == other.filter &&
                orderBy == other.orderBy &&
                pageSize == other.pageSize &&
                pageToken == other.pageToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(filter, orderBy, pageSize, pageToken, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{filter=$filter, orderBy=$orderBy, pageSize=$pageSize, pageToken=$pageToken, additionalProperties=$additionalProperties}"
    }

    /** Filter parameters for file queries. */
    class Filter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dataSourceId: JsonField<String>,
        private val externalFileId: JsonField<String>,
        private val fileIds: JsonField<List<String>>,
        private val fileName: JsonField<String>,
        private val onlyManuallyUploaded: JsonField<Boolean>,
        private val projectId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data_source_id")
            @ExcludeMissing
            dataSourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_file_id")
            @ExcludeMissing
            externalFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_ids")
            @ExcludeMissing
            fileIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("file_name")
            @ExcludeMissing
            fileName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("only_manually_uploaded")
            @ExcludeMissing
            onlyManuallyUploaded: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
        ) : this(
            dataSourceId,
            externalFileId,
            fileIds,
            fileName,
            onlyManuallyUploaded,
            projectId,
            mutableMapOf(),
        )

        /**
         * Filter by data source ID
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dataSourceId(): Optional<String> = dataSourceId.getOptional("data_source_id")

        /**
         * Filter by external file ID
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalFileId(): Optional<String> = externalFileId.getOptional("external_file_id")

        /**
         * Filter by specific file IDs
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileIds(): Optional<List<String>> = fileIds.getOptional("file_ids")

        /**
         * Filter by file name
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileName(): Optional<String> = fileName.getOptional("file_name")

        /**
         * Filter only manually uploaded files (data_source_id is null)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun onlyManuallyUploaded(): Optional<Boolean> =
            onlyManuallyUploaded.getOptional("only_manually_uploaded")

        /**
         * Filter by project ID
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = projectId.getOptional("project_id")

        /**
         * Returns the raw JSON value of [dataSourceId].
         *
         * Unlike [dataSourceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("data_source_id")
        @ExcludeMissing
        fun _dataSourceId(): JsonField<String> = dataSourceId

        /**
         * Returns the raw JSON value of [externalFileId].
         *
         * Unlike [externalFileId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_file_id")
        @ExcludeMissing
        fun _externalFileId(): JsonField<String> = externalFileId

        /**
         * Returns the raw JSON value of [fileIds].
         *
         * Unlike [fileIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_ids") @ExcludeMissing fun _fileIds(): JsonField<List<String>> = fileIds

        /**
         * Returns the raw JSON value of [fileName].
         *
         * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_name") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

        /**
         * Returns the raw JSON value of [onlyManuallyUploaded].
         *
         * Unlike [onlyManuallyUploaded], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("only_manually_uploaded")
        @ExcludeMissing
        fun _onlyManuallyUploaded(): JsonField<Boolean> = onlyManuallyUploaded

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var dataSourceId: JsonField<String> = JsonMissing.of()
            private var externalFileId: JsonField<String> = JsonMissing.of()
            private var fileIds: JsonField<MutableList<String>>? = null
            private var fileName: JsonField<String> = JsonMissing.of()
            private var onlyManuallyUploaded: JsonField<Boolean> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                dataSourceId = filter.dataSourceId
                externalFileId = filter.externalFileId
                fileIds = filter.fileIds.map { it.toMutableList() }
                fileName = filter.fileName
                onlyManuallyUploaded = filter.onlyManuallyUploaded
                projectId = filter.projectId
                additionalProperties = filter.additionalProperties.toMutableMap()
            }

            /** Filter by data source ID */
            fun dataSourceId(dataSourceId: String?) =
                dataSourceId(JsonField.ofNullable(dataSourceId))

            /** Alias for calling [Builder.dataSourceId] with `dataSourceId.orElse(null)`. */
            fun dataSourceId(dataSourceId: Optional<String>) =
                dataSourceId(dataSourceId.getOrNull())

            /**
             * Sets [Builder.dataSourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataSourceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataSourceId(dataSourceId: JsonField<String>) = apply {
                this.dataSourceId = dataSourceId
            }

            /** Filter by external file ID */
            fun externalFileId(externalFileId: String?) =
                externalFileId(JsonField.ofNullable(externalFileId))

            /** Alias for calling [Builder.externalFileId] with `externalFileId.orElse(null)`. */
            fun externalFileId(externalFileId: Optional<String>) =
                externalFileId(externalFileId.getOrNull())

            /**
             * Sets [Builder.externalFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalFileId(externalFileId: JsonField<String>) = apply {
                this.externalFileId = externalFileId
            }

            /** Filter by specific file IDs */
            fun fileIds(fileIds: List<String>?) = fileIds(JsonField.ofNullable(fileIds))

            /** Alias for calling [Builder.fileIds] with `fileIds.orElse(null)`. */
            fun fileIds(fileIds: Optional<List<String>>) = fileIds(fileIds.getOrNull())

            /**
             * Sets [Builder.fileIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileIds(fileIds: JsonField<List<String>>) = apply {
                this.fileIds = fileIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [fileIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFileId(fileId: String) = apply {
                fileIds =
                    (fileIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fileIds", it).add(fileId)
                    }
            }

            /** Filter by file name */
            fun fileName(fileName: String?) = fileName(JsonField.ofNullable(fileName))

            /** Alias for calling [Builder.fileName] with `fileName.orElse(null)`. */
            fun fileName(fileName: Optional<String>) = fileName(fileName.getOrNull())

            /**
             * Sets [Builder.fileName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

            /** Filter only manually uploaded files (data_source_id is null) */
            fun onlyManuallyUploaded(onlyManuallyUploaded: Boolean?) =
                onlyManuallyUploaded(JsonField.ofNullable(onlyManuallyUploaded))

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

            /**
             * Sets [Builder.onlyManuallyUploaded] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onlyManuallyUploaded] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun onlyManuallyUploaded(onlyManuallyUploaded: JsonField<Boolean>) = apply {
                this.onlyManuallyUploaded = onlyManuallyUploaded
            }

            /** Filter by project ID */
            fun projectId(projectId: String?) = projectId(JsonField.ofNullable(projectId))

            /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
            fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter =
                Filter(
                    dataSourceId,
                    externalFileId,
                    (fileIds ?: JsonMissing.of()).map { it.toImmutable() },
                    fileName,
                    onlyManuallyUploaded,
                    projectId,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Filter = apply {
            if (validated) {
                return@apply
            }

            dataSourceId()
            externalFileId()
            fileIds()
            fileName()
            onlyManuallyUploaded()
            projectId()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (dataSourceId.asKnown().isPresent) 1 else 0) +
                (if (externalFileId.asKnown().isPresent) 1 else 0) +
                (fileIds.asKnown().getOrNull()?.size ?: 0) +
                (if (fileName.asKnown().isPresent) 1 else 0) +
                (if (onlyManuallyUploaded.asKnown().isPresent) 1 else 0) +
                (if (projectId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                dataSourceId == other.dataSourceId &&
                externalFileId == other.externalFileId &&
                fileIds == other.fileIds &&
                fileName == other.fileName &&
                onlyManuallyUploaded == other.onlyManuallyUploaded &&
                projectId == other.projectId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dataSourceId,
                externalFileId,
                fileIds,
                fileName,
                onlyManuallyUploaded,
                projectId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{dataSourceId=$dataSourceId, externalFileId=$externalFileId, fileIds=$fileIds, fileName=$fileName, onlyManuallyUploaded=$onlyManuallyUploaded, projectId=$projectId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileQueryParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FileQueryParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
