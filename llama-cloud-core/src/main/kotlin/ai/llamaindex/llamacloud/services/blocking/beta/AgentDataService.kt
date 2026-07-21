// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentData
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataAggregatePage
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataAggregateParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataCreateParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataDeleteByQueryParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataDeleteByQueryResponse
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataDeleteParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataDeleteResponse
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataGetParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataSearchPage
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataSearchParams
import ai.llamaindex.llamacloud.models.beta.agentdata.AgentDataUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AgentDataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentDataService

    /** Create new agent data. */
    fun create(params: AgentDataCreateParams): AgentData = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentDataCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentData

    /** Update agent data by ID (overwrites). */
    fun update(itemId: String, params: AgentDataUpdateParams): AgentData =
        update(itemId, params, RequestOptions.none())

    /** @see update */
    fun update(
        itemId: String,
        params: AgentDataUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentData = update(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see update */
    fun update(params: AgentDataUpdateParams): AgentData = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentDataUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentData

    /** Delete agent data by ID. */
    fun delete(itemId: String): AgentDataDeleteResponse =
        delete(itemId, AgentDataDeleteParams.none())

    /** @see delete */
    fun delete(
        itemId: String,
        params: AgentDataDeleteParams = AgentDataDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentDataDeleteResponse = delete(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see delete */
    fun delete(
        itemId: String,
        params: AgentDataDeleteParams = AgentDataDeleteParams.none(),
    ): AgentDataDeleteResponse = delete(itemId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AgentDataDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentDataDeleteResponse

    /** @see delete */
    fun delete(params: AgentDataDeleteParams): AgentDataDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(itemId: String, requestOptions: RequestOptions): AgentDataDeleteResponse =
        delete(itemId, AgentDataDeleteParams.none(), requestOptions)

    /** Aggregate agent data with grouping and optional counting/first item retrieval. */
    fun aggregate(params: AgentDataAggregateParams): AgentDataAggregatePage =
        aggregate(params, RequestOptions.none())

    /** @see aggregate */
    fun aggregate(
        params: AgentDataAggregateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentDataAggregatePage

    /** Bulk delete agent data by query (deployment_name, collection, optional filters). */
    fun deleteByQuery(params: AgentDataDeleteByQueryParams): AgentDataDeleteByQueryResponse =
        deleteByQuery(params, RequestOptions.none())

    /** @see deleteByQuery */
    fun deleteByQuery(
        params: AgentDataDeleteByQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentDataDeleteByQueryResponse

    /** Get agent data by ID. */
    fun get(itemId: String): AgentData = get(itemId, AgentDataGetParams.none())

    /** @see get */
    fun get(
        itemId: String,
        params: AgentDataGetParams = AgentDataGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentData = get(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see get */
    fun get(itemId: String, params: AgentDataGetParams = AgentDataGetParams.none()): AgentData =
        get(itemId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AgentDataGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentData

    /** @see get */
    fun get(params: AgentDataGetParams): AgentData = get(params, RequestOptions.none())

    /** @see get */
    fun get(itemId: String, requestOptions: RequestOptions): AgentData =
        get(itemId, AgentDataGetParams.none(), requestOptions)

    /** Search agent data with filtering, sorting, and pagination. */
    fun search(params: AgentDataSearchParams): AgentDataSearchPage =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: AgentDataSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentDataSearchPage

    /** A view of [AgentDataService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentDataService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/agent-data`, but is otherwise the same
         * as [AgentDataService.create].
         */
        @MustBeClosed
        fun create(params: AgentDataCreateParams): HttpResponseFor<AgentData> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AgentDataCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentData>

        /**
         * Returns a raw HTTP response for `put /api/v1/beta/agent-data/{item_id}`, but is otherwise
         * the same as [AgentDataService.update].
         */
        @MustBeClosed
        fun update(itemId: String, params: AgentDataUpdateParams): HttpResponseFor<AgentData> =
            update(itemId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            itemId: String,
            params: AgentDataUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentData> =
            update(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AgentDataUpdateParams): HttpResponseFor<AgentData> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AgentDataUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentData>

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/agent-data/{item_id}`, but is
         * otherwise the same as [AgentDataService.delete].
         */
        @MustBeClosed
        fun delete(itemId: String): HttpResponseFor<AgentDataDeleteResponse> =
            delete(itemId, AgentDataDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            itemId: String,
            params: AgentDataDeleteParams = AgentDataDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentDataDeleteResponse> =
            delete(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            itemId: String,
            params: AgentDataDeleteParams = AgentDataDeleteParams.none(),
        ): HttpResponseFor<AgentDataDeleteResponse> = delete(itemId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AgentDataDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentDataDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AgentDataDeleteParams): HttpResponseFor<AgentDataDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            itemId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentDataDeleteResponse> =
            delete(itemId, AgentDataDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/agent-data/:aggregate`, but is
         * otherwise the same as [AgentDataService.aggregate].
         */
        @MustBeClosed
        fun aggregate(params: AgentDataAggregateParams): HttpResponseFor<AgentDataAggregatePage> =
            aggregate(params, RequestOptions.none())

        /** @see aggregate */
        @MustBeClosed
        fun aggregate(
            params: AgentDataAggregateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentDataAggregatePage>

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/agent-data/:delete`, but is otherwise
         * the same as [AgentDataService.deleteByQuery].
         */
        @MustBeClosed
        fun deleteByQuery(
            params: AgentDataDeleteByQueryParams
        ): HttpResponseFor<AgentDataDeleteByQueryResponse> =
            deleteByQuery(params, RequestOptions.none())

        /** @see deleteByQuery */
        @MustBeClosed
        fun deleteByQuery(
            params: AgentDataDeleteByQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentDataDeleteByQueryResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/agent-data/{item_id}`, but is otherwise
         * the same as [AgentDataService.get].
         */
        @MustBeClosed
        fun get(itemId: String): HttpResponseFor<AgentData> = get(itemId, AgentDataGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            itemId: String,
            params: AgentDataGetParams = AgentDataGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentData> =
            get(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            itemId: String,
            params: AgentDataGetParams = AgentDataGetParams.none(),
        ): HttpResponseFor<AgentData> = get(itemId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AgentDataGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentData>

        /** @see get */
        @MustBeClosed
        fun get(params: AgentDataGetParams): HttpResponseFor<AgentData> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(itemId: String, requestOptions: RequestOptions): HttpResponseFor<AgentData> =
            get(itemId, AgentDataGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/agent-data/:search`, but is otherwise
         * the same as [AgentDataService.search].
         */
        @MustBeClosed
        fun search(params: AgentDataSearchParams): HttpResponseFor<AgentDataSearchPage> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: AgentDataSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentDataSearchPage>
    }
}
