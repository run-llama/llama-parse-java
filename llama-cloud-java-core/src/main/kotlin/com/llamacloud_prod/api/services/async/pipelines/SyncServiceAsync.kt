// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.pipelines

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.pipelines.Pipeline
import com.llamacloud_prod.api.models.pipelines.sync.SyncCancelParams
import com.llamacloud_prod.api.models.pipelines.sync.SyncCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SyncServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SyncServiceAsync

    /**
     * Trigger an incremental sync for a managed pipeline.
     *
     * Processes new and updated documents from data sources and files, then updates the index for
     * retrieval.
     */
    fun create(pipelineId: String): CompletableFuture<Pipeline> =
        create(pipelineId, SyncCreateParams.none())

    /** @see create */
    fun create(
        pipelineId: String,
        params: SyncCreateParams = SyncCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    fun create(
        pipelineId: String,
        params: SyncCreateParams = SyncCreateParams.none(),
    ): CompletableFuture<Pipeline> = create(pipelineId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SyncCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /** @see create */
    fun create(params: SyncCreateParams): CompletableFuture<Pipeline> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(pipelineId: String, requestOptions: RequestOptions): CompletableFuture<Pipeline> =
        create(pipelineId, SyncCreateParams.none(), requestOptions)

    /** Cancel all running sync jobs for a pipeline. */
    fun cancel(pipelineId: String): CompletableFuture<Pipeline> =
        cancel(pipelineId, SyncCancelParams.none())

    /** @see cancel */
    fun cancel(
        pipelineId: String,
        params: SyncCancelParams = SyncCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        cancel(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        pipelineId: String,
        params: SyncCancelParams = SyncCancelParams.none(),
    ): CompletableFuture<Pipeline> = cancel(pipelineId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: SyncCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /** @see cancel */
    fun cancel(params: SyncCancelParams): CompletableFuture<Pipeline> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(pipelineId: String, requestOptions: RequestOptions): CompletableFuture<Pipeline> =
        cancel(pipelineId, SyncCancelParams.none(), requestOptions)

    /** A view of [SyncServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SyncServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines/{pipeline_id}/sync`, but is
         * otherwise the same as [SyncServiceAsync.create].
         */
        fun create(pipelineId: String): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(pipelineId, SyncCreateParams.none())

        /** @see create */
        fun create(
            pipelineId: String,
            params: SyncCreateParams = SyncCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        fun create(
            pipelineId: String,
            params: SyncCreateParams = SyncCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(pipelineId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SyncCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /** @see create */
        fun create(params: SyncCreateParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(pipelineId, SyncCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines/{pipeline_id}/sync/cancel`, but
         * is otherwise the same as [SyncServiceAsync.cancel].
         */
        fun cancel(pipelineId: String): CompletableFuture<HttpResponseFor<Pipeline>> =
            cancel(pipelineId, SyncCancelParams.none())

        /** @see cancel */
        fun cancel(
            pipelineId: String,
            params: SyncCancelParams = SyncCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            cancel(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            pipelineId: String,
            params: SyncCancelParams = SyncCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            cancel(pipelineId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: SyncCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /** @see cancel */
        fun cancel(params: SyncCancelParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            cancel(pipelineId, SyncCancelParams.none(), requestOptions)
    }
}
