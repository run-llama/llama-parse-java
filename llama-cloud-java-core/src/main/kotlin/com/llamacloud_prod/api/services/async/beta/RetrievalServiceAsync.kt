// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalFindPageAsync
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalFindParams
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalGrepPageAsync
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalGrepParams
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalReadParams
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalReadResponse
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalRetrieveParams
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RetrievalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrievalServiceAsync

    /**
     * Retrieve relevant chunks via hybrid search (vector + full-text), with filtering on built-in
     * or user-defined metadata.
     */
    fun retrieve(params: RetrievalRetrieveParams): CompletableFuture<RetrievalRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RetrievalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RetrievalRetrieveResponse>

    /** Search for files by name. */
    fun find(params: RetrievalFindParams): CompletableFuture<RetrievalFindPageAsync> =
        find(params, RequestOptions.none())

    /** @see find */
    fun find(
        params: RetrievalFindParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RetrievalFindPageAsync>

    /** Grep within a file's parsed content using a regex pattern. */
    fun grep(params: RetrievalGrepParams): CompletableFuture<RetrievalGrepPageAsync> =
        grep(params, RequestOptions.none())

    /** @see grep */
    fun grep(
        params: RetrievalGrepParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RetrievalGrepPageAsync>

    /** Read the parsed text content of a specific file. */
    fun read(params: RetrievalReadParams): CompletableFuture<RetrievalReadResponse> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: RetrievalReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RetrievalReadResponse>

    /**
     * A view of [RetrievalServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RetrievalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/retrieval/retrieve`, but is otherwise the
         * same as [RetrievalServiceAsync.retrieve].
         */
        fun retrieve(
            params: RetrievalRetrieveParams
        ): CompletableFuture<HttpResponseFor<RetrievalRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RetrievalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RetrievalRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/retrieval/files/find`, but is otherwise the
         * same as [RetrievalServiceAsync.find].
         */
        fun find(
            params: RetrievalFindParams
        ): CompletableFuture<HttpResponseFor<RetrievalFindPageAsync>> =
            find(params, RequestOptions.none())

        /** @see find */
        fun find(
            params: RetrievalFindParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RetrievalFindPageAsync>>

        /**
         * Returns a raw HTTP response for `post /api/v1/retrieval/files/grep`, but is otherwise the
         * same as [RetrievalServiceAsync.grep].
         */
        fun grep(
            params: RetrievalGrepParams
        ): CompletableFuture<HttpResponseFor<RetrievalGrepPageAsync>> =
            grep(params, RequestOptions.none())

        /** @see grep */
        fun grep(
            params: RetrievalGrepParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RetrievalGrepPageAsync>>

        /**
         * Returns a raw HTTP response for `post /api/v1/retrieval/files/read`, but is otherwise the
         * same as [RetrievalServiceAsync.read].
         */
        fun read(
            params: RetrievalReadParams
        ): CompletableFuture<HttpResponseFor<RetrievalReadResponse>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            params: RetrievalReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RetrievalReadResponse>>
    }
}
