// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentData
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataAggregatePageAsync
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataAggregateParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataCreateParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataDeleteByQueryParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataDeleteByQueryResponse
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataDeleteParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataDeleteResponse
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataGetParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataSearchPageAsync
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataSearchParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AgentDataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentDataServiceAsync

    /** Create new agent data. */
    fun create(params: AgentDataCreateParams): CompletableFuture<AgentData> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentDataCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentData>

    /** Update agent data by ID (overwrites). */
    fun update(itemId: String, params: AgentDataUpdateParams): CompletableFuture<AgentData> =
        update(itemId, params, RequestOptions.none())

    /** @see update */
    fun update(
        itemId: String,
        params: AgentDataUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentData> =
        update(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see update */
    fun update(params: AgentDataUpdateParams): CompletableFuture<AgentData> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentDataUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentData>

    /** Delete agent data by ID. */
    fun delete(itemId: String): CompletableFuture<AgentDataDeleteResponse> =
        delete(itemId, AgentDataDeleteParams.none())

    /** @see delete */
    fun delete(
        itemId: String,
        params: AgentDataDeleteParams = AgentDataDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentDataDeleteResponse> =
        delete(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see delete */
    fun delete(
        itemId: String,
        params: AgentDataDeleteParams = AgentDataDeleteParams.none(),
    ): CompletableFuture<AgentDataDeleteResponse> = delete(itemId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AgentDataDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentDataDeleteResponse>

    /** @see delete */
    fun delete(params: AgentDataDeleteParams): CompletableFuture<AgentDataDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        itemId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentDataDeleteResponse> =
        delete(itemId, AgentDataDeleteParams.none(), requestOptions)

    /** Aggregate agent data with grouping and optional counting/first item retrieval. */
    fun aggregate(
        params: AgentDataAggregateParams
    ): CompletableFuture<AgentDataAggregatePageAsync> = aggregate(params, RequestOptions.none())

    /** @see aggregate */
    fun aggregate(
        params: AgentDataAggregateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentDataAggregatePageAsync>

    /** Bulk delete agent data by query (deployment_name, collection, optional filters). */
    fun deleteByQuery(
        params: AgentDataDeleteByQueryParams
    ): CompletableFuture<AgentDataDeleteByQueryResponse> =
        deleteByQuery(params, RequestOptions.none())

    /** @see deleteByQuery */
    fun deleteByQuery(
        params: AgentDataDeleteByQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentDataDeleteByQueryResponse>

    /** Get agent data by ID. */
    fun get(itemId: String): CompletableFuture<AgentData> = get(itemId, AgentDataGetParams.none())

    /** @see get */
    fun get(
        itemId: String,
        params: AgentDataGetParams = AgentDataGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentData> = get(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see get */
    fun get(
        itemId: String,
        params: AgentDataGetParams = AgentDataGetParams.none(),
    ): CompletableFuture<AgentData> = get(itemId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AgentDataGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentData>

    /** @see get */
    fun get(params: AgentDataGetParams): CompletableFuture<AgentData> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(itemId: String, requestOptions: RequestOptions): CompletableFuture<AgentData> =
        get(itemId, AgentDataGetParams.none(), requestOptions)

    /** Search agent data with filtering, sorting, and pagination. */
    fun search(params: AgentDataSearchParams): CompletableFuture<AgentDataSearchPageAsync> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: AgentDataSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentDataSearchPageAsync>

    /**
     * A view of [AgentDataServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentDataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/agent-data`, but is otherwise the same
         * as [AgentDataServiceAsync.create].
         */
        fun create(params: AgentDataCreateParams): CompletableFuture<HttpResponseFor<AgentData>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AgentDataCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentData>>

        /**
         * Returns a raw HTTP response for `put /api/v1/beta/agent-data/{item_id}`, but is otherwise
         * the same as [AgentDataServiceAsync.update].
         */
        fun update(
            itemId: String,
            params: AgentDataUpdateParams,
        ): CompletableFuture<HttpResponseFor<AgentData>> =
            update(itemId, params, RequestOptions.none())

        /** @see update */
        fun update(
            itemId: String,
            params: AgentDataUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentData>> =
            update(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see update */
        fun update(params: AgentDataUpdateParams): CompletableFuture<HttpResponseFor<AgentData>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AgentDataUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentData>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/agent-data/{item_id}`, but is
         * otherwise the same as [AgentDataServiceAsync.delete].
         */
        fun delete(itemId: String): CompletableFuture<HttpResponseFor<AgentDataDeleteResponse>> =
            delete(itemId, AgentDataDeleteParams.none())

        /** @see delete */
        fun delete(
            itemId: String,
            params: AgentDataDeleteParams = AgentDataDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentDataDeleteResponse>> =
            delete(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see delete */
        fun delete(
            itemId: String,
            params: AgentDataDeleteParams = AgentDataDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentDataDeleteResponse>> =
            delete(itemId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AgentDataDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentDataDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AgentDataDeleteParams
        ): CompletableFuture<HttpResponseFor<AgentDataDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            itemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentDataDeleteResponse>> =
            delete(itemId, AgentDataDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/agent-data/:aggregate`, but is
         * otherwise the same as [AgentDataServiceAsync.aggregate].
         */
        fun aggregate(
            params: AgentDataAggregateParams
        ): CompletableFuture<HttpResponseFor<AgentDataAggregatePageAsync>> =
            aggregate(params, RequestOptions.none())

        /** @see aggregate */
        fun aggregate(
            params: AgentDataAggregateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentDataAggregatePageAsync>>

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/agent-data/:delete`, but is otherwise
         * the same as [AgentDataServiceAsync.deleteByQuery].
         */
        fun deleteByQuery(
            params: AgentDataDeleteByQueryParams
        ): CompletableFuture<HttpResponseFor<AgentDataDeleteByQueryResponse>> =
            deleteByQuery(params, RequestOptions.none())

        /** @see deleteByQuery */
        fun deleteByQuery(
            params: AgentDataDeleteByQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentDataDeleteByQueryResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/agent-data/{item_id}`, but is otherwise
         * the same as [AgentDataServiceAsync.get].
         */
        fun get(itemId: String): CompletableFuture<HttpResponseFor<AgentData>> =
            get(itemId, AgentDataGetParams.none())

        /** @see get */
        fun get(
            itemId: String,
            params: AgentDataGetParams = AgentDataGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentData>> =
            get(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see get */
        fun get(
            itemId: String,
            params: AgentDataGetParams = AgentDataGetParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentData>> =
            get(itemId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: AgentDataGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentData>>

        /** @see get */
        fun get(params: AgentDataGetParams): CompletableFuture<HttpResponseFor<AgentData>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            itemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentData>> =
            get(itemId, AgentDataGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/agent-data/:search`, but is otherwise
         * the same as [AgentDataServiceAsync.search].
         */
        fun search(
            params: AgentDataSearchParams
        ): CompletableFuture<HttpResponseFor<AgentDataSearchPageAsync>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: AgentDataSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentDataSearchPageAsync>>
    }
}
