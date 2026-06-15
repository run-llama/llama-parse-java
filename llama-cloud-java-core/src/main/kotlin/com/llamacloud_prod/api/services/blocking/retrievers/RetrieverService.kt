// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.retrievers

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.retrievers.CompositeRetrievalResult
import com.llamacloud_prod.api.models.retrievers.retriever.RetrieverSearchParams
import java.util.function.Consumer

interface RetrieverService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrieverService

    /** Retrieve data using a Retriever. */
    fun search(retrieverId: String, params: RetrieverSearchParams): CompositeRetrievalResult =
        search(retrieverId, params, RequestOptions.none())

    /** @see search */
    fun search(
        retrieverId: String,
        params: RetrieverSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompositeRetrievalResult =
        search(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

    /** @see search */
    fun search(params: RetrieverSearchParams): CompositeRetrievalResult =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: RetrieverSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompositeRetrievalResult

    /** A view of [RetrieverService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrieverService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/retrievers/{retriever_id}/retrieve`, but is
         * otherwise the same as [RetrieverService.search].
         */
        @MustBeClosed
        fun search(
            retrieverId: String,
            params: RetrieverSearchParams,
        ): HttpResponseFor<CompositeRetrievalResult> =
            search(retrieverId, params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            retrieverId: String,
            params: RetrieverSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompositeRetrievalResult> =
            search(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

        /** @see search */
        @MustBeClosed
        fun search(params: RetrieverSearchParams): HttpResponseFor<CompositeRetrievalResult> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: RetrieverSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompositeRetrievalResult>
    }
}
