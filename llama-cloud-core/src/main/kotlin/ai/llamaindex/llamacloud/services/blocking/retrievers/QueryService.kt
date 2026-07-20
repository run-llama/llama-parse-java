// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.retrievers

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.retrievers.CompositeRetrievalResult
import ai.llamaindex.llamacloud.models.retrievers.query.QuerySearchParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface QueryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueryService

    /** Retrieve data using a Retriever. */
    fun search(retrieverId: String, params: QuerySearchParams): CompositeRetrievalResult =
        search(retrieverId, params, RequestOptions.none())

    /** @see search */
    fun search(
        retrieverId: String,
        params: QuerySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompositeRetrievalResult =
        search(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

    /** @see search */
    fun search(params: QuerySearchParams): CompositeRetrievalResult =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: QuerySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompositeRetrievalResult

    /** A view of [QueryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/retrievers/{retriever_id}/retrieve`, but is
         * otherwise the same as [QueryService.search].
         */
        @MustBeClosed
        fun search(
            retrieverId: String,
            params: QuerySearchParams,
        ): HttpResponseFor<CompositeRetrievalResult> =
            search(retrieverId, params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            retrieverId: String,
            params: QuerySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompositeRetrievalResult> =
            search(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

        /** @see search */
        @MustBeClosed
        fun search(params: QuerySearchParams): HttpResponseFor<CompositeRetrievalResult> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: QuerySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompositeRetrievalResult>
    }
}
