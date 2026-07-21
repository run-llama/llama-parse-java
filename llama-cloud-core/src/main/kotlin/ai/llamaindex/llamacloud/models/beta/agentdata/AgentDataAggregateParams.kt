// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.agentdata

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
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

/** Aggregate agent data with grouping and optional counting/first item retrieval. */
class AgentDataAggregateParams
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
     * The agent deployment's name to aggregate data for
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deploymentName(): String = body.deploymentName()

    /**
     * The logical agent data collection to aggregate data for
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun collection(): Optional<String> = body.collection()

    /**
     * Whether to count the number of items in each group
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Boolean> = body.count()

    /**
     * A filter object or expression that filters resources listed in the response.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<Filter> = body.filter()

    /**
     * Whether to return the first item in each group (Sorted by created_at)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun first(): Optional<Boolean> = body.first()

    /**
     * The fields to group by. If empty, the entire dataset is grouped on. e.g. if left out, can be
     * used for simple count operations
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupBy(): Optional<List<String>> = body.groupBy()

    /**
     * The offset to start from. If not provided, the first page is returned
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = body.offset()

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
     * Returns the raw JSON value of [deploymentName].
     *
     * Unlike [deploymentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deploymentName(): JsonField<String> = body._deploymentName()

    /**
     * Returns the raw JSON value of [collection].
     *
     * Unlike [collection], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _collection(): JsonField<String> = body._collection()

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _count(): JsonField<Boolean> = body._count()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<Filter> = body._filter()

    /**
     * Returns the raw JSON value of [first].
     *
     * Unlike [first], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _first(): JsonField<Boolean> = body._first()

    /**
     * Returns the raw JSON value of [groupBy].
     *
     * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupBy(): JsonField<List<String>> = body._groupBy()

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _offset(): JsonField<Long> = body._offset()

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

        /**
         * Returns a mutable builder for constructing an instance of [AgentDataAggregateParams].
         *
         * The following fields are required:
         * ```java
         * .deploymentName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentDataAggregateParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(agentDataAggregateParams: AgentDataAggregateParams) = apply {
            organizationId = agentDataAggregateParams.organizationId
            projectId = agentDataAggregateParams.projectId
            body = agentDataAggregateParams.body.toBuilder()
            additionalHeaders = agentDataAggregateParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentDataAggregateParams.additionalQueryParams.toBuilder()
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
         * - [deploymentName]
         * - [collection]
         * - [count]
         * - [filter]
         * - [first]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The agent deployment's name to aggregate data for */
        fun deploymentName(deploymentName: String) = apply { body.deploymentName(deploymentName) }

        /**
         * Sets [Builder.deploymentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deploymentName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deploymentName(deploymentName: JsonField<String>) = apply {
            body.deploymentName(deploymentName)
        }

        /** The logical agent data collection to aggregate data for */
        fun collection(collection: String) = apply { body.collection(collection) }

        /**
         * Sets [Builder.collection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collection] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun collection(collection: JsonField<String>) = apply { body.collection(collection) }

        /** Whether to count the number of items in each group */
        fun count(count: Boolean?) = apply { body.count(count) }

        /**
         * Alias for [Builder.count].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun count(count: Boolean) = count(count as Boolean?)

        /** Alias for calling [Builder.count] with `count.orElse(null)`. */
        fun count(count: Optional<Boolean>) = count(count.getOrNull())

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Boolean>) = apply { body.count(count) }

        /** A filter object or expression that filters resources listed in the response. */
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

        /** Whether to return the first item in each group (Sorted by created_at) */
        fun first(first: Boolean?) = apply { body.first(first) }

        /**
         * Alias for [Builder.first].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun first(first: Boolean) = first(first as Boolean?)

        /** Alias for calling [Builder.first] with `first.orElse(null)`. */
        fun first(first: Optional<Boolean>) = first(first.getOrNull())

        /**
         * Sets [Builder.first] to an arbitrary JSON value.
         *
         * You should usually call [Builder.first] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun first(first: JsonField<Boolean>) = apply { body.first(first) }

        /**
         * The fields to group by. If empty, the entire dataset is grouped on. e.g. if left out, can
         * be used for simple count operations
         */
        fun groupBy(groupBy: List<String>?) = apply { body.groupBy(groupBy) }

        /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
        fun groupBy(groupBy: Optional<List<String>>) = groupBy(groupBy.getOrNull())

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupBy(groupBy: JsonField<List<String>>) = apply { body.groupBy(groupBy) }

        /**
         * Adds a single [String] to [Builder.groupBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupBy(groupBy: String) = apply { body.addGroupBy(groupBy) }

        /** The offset to start from. If not provided, the first page is returned */
        fun offset(offset: Long?) = apply { body.offset(offset) }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { body.offset(offset) }

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
         * Returns an immutable instance of [AgentDataAggregateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .deploymentName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentDataAggregateParams =
            AgentDataAggregateParams(
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

    /** API request body for aggregating agent data */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deploymentName: JsonField<String>,
        private val collection: JsonField<String>,
        private val count: JsonField<Boolean>,
        private val filter: JsonField<Filter>,
        private val first: JsonField<Boolean>,
        private val groupBy: JsonField<List<String>>,
        private val offset: JsonField<Long>,
        private val orderBy: JsonField<String>,
        private val pageSize: JsonField<Long>,
        private val pageToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("deployment_name")
            @ExcludeMissing
            deploymentName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("collection")
            @ExcludeMissing
            collection: JsonField<String> = JsonMissing.of(),
            @JsonProperty("count") @ExcludeMissing count: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<Filter> = JsonMissing.of(),
            @JsonProperty("first") @ExcludeMissing first: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("group_by")
            @ExcludeMissing
            groupBy: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("order_by") @ExcludeMissing orderBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_token")
            @ExcludeMissing
            pageToken: JsonField<String> = JsonMissing.of(),
        ) : this(
            deploymentName,
            collection,
            count,
            filter,
            first,
            groupBy,
            offset,
            orderBy,
            pageSize,
            pageToken,
            mutableMapOf(),
        )

        /**
         * The agent deployment's name to aggregate data for
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deploymentName(): String = deploymentName.getRequired("deployment_name")

        /**
         * The logical agent data collection to aggregate data for
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun collection(): Optional<String> = collection.getOptional("collection")

        /**
         * Whether to count the number of items in each group
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun count(): Optional<Boolean> = count.getOptional("count")

        /**
         * A filter object or expression that filters resources listed in the response.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<Filter> = filter.getOptional("filter")

        /**
         * Whether to return the first item in each group (Sorted by created_at)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun first(): Optional<Boolean> = first.getOptional("first")

        /**
         * The fields to group by. If empty, the entire dataset is grouped on. e.g. if left out, can
         * be used for simple count operations
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupBy(): Optional<List<String>> = groupBy.getOptional("group_by")

        /**
         * The offset to start from. If not provided, the first page is returned
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun offset(): Optional<Long> = offset.getOptional("offset")

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
         * Returns the raw JSON value of [deploymentName].
         *
         * Unlike [deploymentName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("deployment_name")
        @ExcludeMissing
        fun _deploymentName(): JsonField<String> = deploymentName

        /**
         * Returns the raw JSON value of [collection].
         *
         * Unlike [collection], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("collection")
        @ExcludeMissing
        fun _collection(): JsonField<String> = collection

        /**
         * Returns the raw JSON value of [count].
         *
         * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Boolean> = count

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<Filter> = filter

        /**
         * Returns the raw JSON value of [first].
         *
         * Unlike [first], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first") @ExcludeMissing fun _first(): JsonField<Boolean> = first

        /**
         * Returns the raw JSON value of [groupBy].
         *
         * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<List<String>> = groupBy

        /**
         * Returns the raw JSON value of [offset].
         *
         * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .deploymentName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var deploymentName: JsonField<String>? = null
            private var collection: JsonField<String> = JsonMissing.of()
            private var count: JsonField<Boolean> = JsonMissing.of()
            private var filter: JsonField<Filter> = JsonMissing.of()
            private var first: JsonField<Boolean> = JsonMissing.of()
            private var groupBy: JsonField<MutableList<String>>? = null
            private var offset: JsonField<Long> = JsonMissing.of()
            private var orderBy: JsonField<String> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var pageToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                deploymentName = body.deploymentName
                collection = body.collection
                count = body.count
                filter = body.filter
                first = body.first
                groupBy = body.groupBy.map { it.toMutableList() }
                offset = body.offset
                orderBy = body.orderBy
                pageSize = body.pageSize
                pageToken = body.pageToken
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The agent deployment's name to aggregate data for */
            fun deploymentName(deploymentName: String) =
                deploymentName(JsonField.of(deploymentName))

            /**
             * Sets [Builder.deploymentName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deploymentName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deploymentName(deploymentName: JsonField<String>) = apply {
                this.deploymentName = deploymentName
            }

            /** The logical agent data collection to aggregate data for */
            fun collection(collection: String) = collection(JsonField.of(collection))

            /**
             * Sets [Builder.collection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collection] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collection(collection: JsonField<String>) = apply { this.collection = collection }

            /** Whether to count the number of items in each group */
            fun count(count: Boolean?) = count(JsonField.ofNullable(count))

            /**
             * Alias for [Builder.count].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun count(count: Boolean) = count(count as Boolean?)

            /** Alias for calling [Builder.count] with `count.orElse(null)`. */
            fun count(count: Optional<Boolean>) = count(count.getOrNull())

            /**
             * Sets [Builder.count] to an arbitrary JSON value.
             *
             * You should usually call [Builder.count] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun count(count: JsonField<Boolean>) = apply { this.count = count }

            /** A filter object or expression that filters resources listed in the response. */
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

            /** Whether to return the first item in each group (Sorted by created_at) */
            fun first(first: Boolean?) = first(JsonField.ofNullable(first))

            /**
             * Alias for [Builder.first].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun first(first: Boolean) = first(first as Boolean?)

            /** Alias for calling [Builder.first] with `first.orElse(null)`. */
            fun first(first: Optional<Boolean>) = first(first.getOrNull())

            /**
             * Sets [Builder.first] to an arbitrary JSON value.
             *
             * You should usually call [Builder.first] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun first(first: JsonField<Boolean>) = apply { this.first = first }

            /**
             * The fields to group by. If empty, the entire dataset is grouped on. e.g. if left out,
             * can be used for simple count operations
             */
            fun groupBy(groupBy: List<String>?) = groupBy(JsonField.ofNullable(groupBy))

            /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
            fun groupBy(groupBy: Optional<List<String>>) = groupBy(groupBy.getOrNull())

            /**
             * Sets [Builder.groupBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupBy] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupBy(groupBy: JsonField<List<String>>) = apply {
                this.groupBy = groupBy.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.groupBy].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroupBy(groupBy: String) = apply {
                this.groupBy =
                    (this.groupBy ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupBy", it).add(groupBy)
                    }
            }

            /** The offset to start from. If not provided, the first page is returned */
            fun offset(offset: Long?) = offset(JsonField.ofNullable(offset))

            /**
             * Alias for [Builder.offset].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun offset(offset: Long) = offset(offset as Long?)

            /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
            fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

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
             *
             * The following fields are required:
             * ```java
             * .deploymentName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("deploymentName", deploymentName),
                    collection,
                    count,
                    filter,
                    first,
                    (groupBy ?: JsonMissing.of()).map { it.toImmutable() },
                    offset,
                    orderBy,
                    pageSize,
                    pageToken,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            deploymentName()
            collection()
            count()
            filter().ifPresent { it.validate() }
            first()
            groupBy()
            offset()
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
            (if (deploymentName.asKnown().isPresent) 1 else 0) +
                (if (collection.asKnown().isPresent) 1 else 0) +
                (if (count.asKnown().isPresent) 1 else 0) +
                (filter.asKnown().getOrNull()?.validity() ?: 0) +
                (if (first.asKnown().isPresent) 1 else 0) +
                (groupBy.asKnown().getOrNull()?.size ?: 0) +
                (if (offset.asKnown().isPresent) 1 else 0) +
                (if (orderBy.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (pageToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                deploymentName == other.deploymentName &&
                collection == other.collection &&
                count == other.count &&
                filter == other.filter &&
                first == other.first &&
                groupBy == other.groupBy &&
                offset == other.offset &&
                orderBy == other.orderBy &&
                pageSize == other.pageSize &&
                pageToken == other.pageToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                deploymentName,
                collection,
                count,
                filter,
                first,
                groupBy,
                offset,
                orderBy,
                pageSize,
                pageToken,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{deploymentName=$deploymentName, collection=$collection, count=$count, filter=$filter, first=$first, groupBy=$groupBy, offset=$offset, orderBy=$orderBy, pageSize=$pageSize, pageToken=$pageToken, additionalProperties=$additionalProperties}"
    }

    /** A filter object or expression that filters resources listed in the response. */
    class Filter
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                additionalProperties = filter.additionalProperties.toMutableMap()
            }

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
            fun build(): Filter = Filter(additionalProperties.toImmutable())
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Filter{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentDataAggregateParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgentDataAggregateParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
