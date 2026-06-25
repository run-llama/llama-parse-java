// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.batch.BatchCancelParams
import com.llamacloud_prod.api.models.beta.batch.BatchCancelResponse
import com.llamacloud_prod.api.models.beta.batch.BatchCreateParams
import com.llamacloud_prod.api.models.beta.batch.BatchCreateResponse
import com.llamacloud_prod.api.models.beta.batch.BatchGetStatusParams
import com.llamacloud_prod.api.models.beta.batch.BatchGetStatusResponse
import com.llamacloud_prod.api.models.beta.batch.BatchListPageAsync
import com.llamacloud_prod.api.models.beta.batch.BatchListParams
import com.llamacloud_prod.api.services.async.beta.batch.JobItemServiceAsync
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

    fun jobItems(): JobItemServiceAsync

    /**
     * Create a batch processing job.
     *
     * Processes files from a directory or a specific list of item IDs. Supports batch parsing and
     * classification operations.
     *
     * Provide either `directory_id` to process all files in a directory, or `item_ids` for specific
     * items. The job runs asynchronously — poll `GET /batch/{job_id}` for progress.
     */
    fun create(params: BatchCreateParams): CompletableFuture<BatchCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCreateResponse>

    /**
     * List batch processing jobs with optional filtering.
     *
     * Filter by `directory_id`, `job_type`, or `status`. Results are paginated with configurable
     * `limit` and `offset`.
     */
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

    /**
     * Cancel a running batch processing job.
     *
     * Stops processing and marks pending items as cancelled. Items currently being processed may
     * still complete.
     */
    fun cancel(jobId: String): CompletableFuture<BatchCancelResponse> =
        cancel(jobId, BatchCancelParams.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: BatchCancelParams = BatchCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCancelResponse> =
        cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: BatchCancelParams = BatchCancelParams.none(),
    ): CompletableFuture<BatchCancelResponse> = cancel(jobId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: BatchCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCancelResponse>

    /** @see cancel */
    fun cancel(params: BatchCancelParams): CompletableFuture<BatchCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchCancelResponse> =
        cancel(jobId, BatchCancelParams.none(), requestOptions)

    /**
     * Get detailed status of a batch processing job.
     *
     * Returns current progress percentage, file counts (total, processed, failed, skipped), and
     * timestamps.
     */
    fun getStatus(jobId: String): CompletableFuture<BatchGetStatusResponse> =
        getStatus(jobId, BatchGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        jobId: String,
        params: BatchGetStatusParams = BatchGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchGetStatusResponse> =
        getStatus(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        jobId: String,
        params: BatchGetStatusParams = BatchGetStatusParams.none(),
    ): CompletableFuture<BatchGetStatusResponse> = getStatus(jobId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: BatchGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchGetStatusResponse>

    /** @see getStatus */
    fun getStatus(params: BatchGetStatusParams): CompletableFuture<BatchGetStatusResponse> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchGetStatusResponse> =
        getStatus(jobId, BatchGetStatusParams.none(), requestOptions)

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

        fun jobItems(): JobItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/batch-processing`, but is otherwise
         * the same as [BatchServiceAsync.create].
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
         * Returns a raw HTTP response for `get /api/v1/beta/batch-processing`, but is otherwise the
         * same as [BatchServiceAsync.list].
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
         * Returns a raw HTTP response for `post /api/v1/beta/batch-processing/{job_id}/cancel`, but
         * is otherwise the same as [BatchServiceAsync.cancel].
         */
        fun cancel(jobId: String): CompletableFuture<HttpResponseFor<BatchCancelResponse>> =
            cancel(jobId, BatchCancelParams.none())

        /** @see cancel */
        fun cancel(
            jobId: String,
            params: BatchCancelParams = BatchCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>> =
            cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            jobId: String,
            params: BatchCancelParams = BatchCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>> =
            cancel(jobId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: BatchCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: BatchCancelParams
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>> =
            cancel(jobId, BatchCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/batch-processing/{job_id}`, but is
         * otherwise the same as [BatchServiceAsync.getStatus].
         */
        fun getStatus(jobId: String): CompletableFuture<HttpResponseFor<BatchGetStatusResponse>> =
            getStatus(jobId, BatchGetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            jobId: String,
            params: BatchGetStatusParams = BatchGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchGetStatusResponse>> =
            getStatus(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            jobId: String,
            params: BatchGetStatusParams = BatchGetStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchGetStatusResponse>> =
            getStatus(jobId, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: BatchGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchGetStatusResponse>>

        /** @see getStatus */
        fun getStatus(
            params: BatchGetStatusParams
        ): CompletableFuture<HttpResponseFor<BatchGetStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchGetStatusResponse>> =
            getStatus(jobId, BatchGetStatusParams.none(), requestOptions)
    }
}
