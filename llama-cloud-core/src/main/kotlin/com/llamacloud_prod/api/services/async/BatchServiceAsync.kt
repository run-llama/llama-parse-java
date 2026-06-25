// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.batches.BatchCreateParams
import com.llamacloud_prod.api.models.batches.BatchCreateResponse
import com.llamacloud_prod.api.models.batches.BatchGetParams
import com.llamacloud_prod.api.models.batches.BatchGetResponse
import com.llamacloud_prod.api.models.batches.BatchListPageAsync
import com.llamacloud_prod.api.models.batches.BatchListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /** Create a batch over a source directory and start processing asynchronously. */
    fun create(params: BatchCreateParams): CompletableFuture<BatchCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCreateResponse>

    /** List batches for the current project. */
    fun list(): CompletableFuture<BatchListPageAsync> = list(BatchListParams.none())

    /** @see list */
    fun list(
        params: BatchListParams = BatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchListPageAsync>

    /** @see list */
    fun list(
        params: BatchListParams = BatchListParams.none()
    ): CompletableFuture<BatchListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BatchListPageAsync> =
        list(BatchListParams.none(), requestOptions)

    /** Get a batch by ID. */
    fun get(batchId: String): CompletableFuture<BatchGetResponse> =
        get(batchId, BatchGetParams.none())

    /** @see get */
    fun get(
        batchId: String,
        params: BatchGetParams = BatchGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchGetResponse> =
        get(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see get */
    fun get(
        batchId: String,
        params: BatchGetParams = BatchGetParams.none(),
    ): CompletableFuture<BatchGetResponse> = get(batchId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchGetResponse>

    /** @see get */
    fun get(params: BatchGetParams): CompletableFuture<BatchGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(batchId: String, requestOptions: RequestOptions): CompletableFuture<BatchGetResponse> =
        get(batchId, BatchGetParams.none(), requestOptions)

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/batches`, but is otherwise the same as
         * [BatchServiceAsync.create].
         */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v2/batches`, but is otherwise the same as
         * [BatchServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BatchListPageAsync>> =
            list(BatchListParams.none())

        /** @see list */
        fun list(
            params: BatchListParams = BatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchListPageAsync>>

        /** @see list */
        fun list(
            params: BatchListParams = BatchListParams.none()
        ): CompletableFuture<HttpResponseFor<BatchListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BatchListPageAsync>> =
            list(BatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/batches/{batch_id}`, but is otherwise the
         * same as [BatchServiceAsync.get].
         */
        fun get(batchId: String): CompletableFuture<HttpResponseFor<BatchGetResponse>> =
            get(batchId, BatchGetParams.none())

        /** @see get */
        fun get(
            batchId: String,
            params: BatchGetParams = BatchGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchGetResponse>> =
            get(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see get */
        fun get(
            batchId: String,
            params: BatchGetParams = BatchGetParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchGetResponse>> =
            get(batchId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchGetResponse>>

        /** @see get */
        fun get(params: BatchGetParams): CompletableFuture<HttpResponseFor<BatchGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            batchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchGetResponse>> =
            get(batchId, BatchGetParams.none(), requestOptions)
    }
}
