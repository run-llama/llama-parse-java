// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.retrievers

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.retrievers.CompositeRetrievalResult
import com.llamacloud_prod.api.models.retrievers.query.QuerySearchParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface QueryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueryServiceAsync

    /** Retrieve data using a Retriever. */
    fun search(
        retrieverId: String,
        params: QuerySearchParams,
    ): CompletableFuture<CompositeRetrievalResult> =
        search(retrieverId, params, RequestOptions.none())

    /** @see search */
    fun search(
        retrieverId: String,
        params: QuerySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompositeRetrievalResult> =
        search(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

    /** @see search */
    fun search(params: QuerySearchParams): CompletableFuture<CompositeRetrievalResult> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: QuerySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompositeRetrievalResult>

    /** A view of [QueryServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/retrievers/{retriever_id}/retrieve`, but is
         * otherwise the same as [QueryServiceAsync.search].
         */
        fun search(
            retrieverId: String,
            params: QuerySearchParams,
        ): CompletableFuture<HttpResponseFor<CompositeRetrievalResult>> =
            search(retrieverId, params, RequestOptions.none())

        /** @see search */
        fun search(
            retrieverId: String,
            params: QuerySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompositeRetrievalResult>> =
            search(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

        /** @see search */
        fun search(
            params: QuerySearchParams
        ): CompletableFuture<HttpResponseFor<CompositeRetrievalResult>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: QuerySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompositeRetrievalResult>>
    }
}
