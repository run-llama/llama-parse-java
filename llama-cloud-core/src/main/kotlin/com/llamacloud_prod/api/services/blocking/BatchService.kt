// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.batches.BatchCreateParams
import com.llamacloud_prod.api.models.batches.BatchCreateResponse
import com.llamacloud_prod.api.models.batches.BatchGetParams
import com.llamacloud_prod.api.models.batches.BatchGetResponse
import com.llamacloud_prod.api.models.batches.BatchListPage
import com.llamacloud_prod.api.models.batches.BatchListParams
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /** Create a batch over a source directory and start processing asynchronously. */
    fun create(params: BatchCreateParams): BatchCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCreateResponse

    /** List batches for the current project. */
    fun list(): BatchListPage = list(BatchListParams.none())

    /** @see list */
    fun list(
        params: BatchListParams = BatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchListPage

    /** @see list */
    fun list(params: BatchListParams = BatchListParams.none()): BatchListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BatchListPage =
        list(BatchListParams.none(), requestOptions)

    /** Get a batch by ID. */
    fun get(batchId: String): BatchGetResponse = get(batchId, BatchGetParams.none())

    /** @see get */
    fun get(
        batchId: String,
        params: BatchGetParams = BatchGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchGetResponse = get(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see get */
    fun get(batchId: String, params: BatchGetParams = BatchGetParams.none()): BatchGetResponse =
        get(batchId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchGetResponse

    /** @see get */
    fun get(params: BatchGetParams): BatchGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(batchId: String, requestOptions: RequestOptions): BatchGetResponse =
        get(batchId, BatchGetParams.none(), requestOptions)

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/batches`, but is otherwise the same as
         * [BatchService.create].
         */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v2/batches`, but is otherwise the same as
         * [BatchService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BatchListPage> = list(BatchListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BatchListParams = BatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: BatchListParams = BatchListParams.none()): HttpResponseFor<BatchListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BatchListPage> =
            list(BatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/batches/{batch_id}`, but is otherwise the
         * same as [BatchService.get].
         */
        @MustBeClosed
        fun get(batchId: String): HttpResponseFor<BatchGetResponse> =
            get(batchId, BatchGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            batchId: String,
            params: BatchGetParams = BatchGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchGetResponse> =
            get(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            batchId: String,
            params: BatchGetParams = BatchGetParams.none(),
        ): HttpResponseFor<BatchGetResponse> = get(batchId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: BatchGetParams): HttpResponseFor<BatchGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            batchId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchGetResponse> = get(batchId, BatchGetParams.none(), requestOptions)
    }
}
