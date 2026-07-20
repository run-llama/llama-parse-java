// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.beta.batch.BatchCancelParams
import ai.llamaindex.llamacloud.models.beta.batch.BatchCancelResponse
import ai.llamaindex.llamacloud.models.beta.batch.BatchCreateParams
import ai.llamaindex.llamacloud.models.beta.batch.BatchCreateResponse
import ai.llamaindex.llamacloud.models.beta.batch.BatchGetStatusParams
import ai.llamaindex.llamacloud.models.beta.batch.BatchGetStatusResponse
import ai.llamaindex.llamacloud.models.beta.batch.BatchListPage
import ai.llamaindex.llamacloud.models.beta.batch.BatchListParams
import ai.llamaindex.llamacloud.services.blocking.beta.batch.JobItemService
import com.google.errorprone.annotations.MustBeClosed
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

    fun jobItems(): JobItemService

    /**
     * Create a batch processing job.
     *
     * Processes files from a directory or a specific list of item IDs. Supports batch parsing and
     * classification operations.
     *
     * Provide either `directory_id` to process all files in a directory, or `item_ids` for specific
     * items. The job runs asynchronously — poll `GET /batch/{job_id}` for progress.
     */
    fun create(params: BatchCreateParams): BatchCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCreateResponse

    /**
     * List batch processing jobs with optional filtering.
     *
     * Filter by `directory_id`, `job_type`, or `status`. Results are paginated with configurable
     * `limit` and `offset`.
     */
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

    /**
     * Cancel a running batch processing job.
     *
     * Stops processing and marks pending items as cancelled. Items currently being processed may
     * still complete.
     */
    fun cancel(jobId: String): BatchCancelResponse = cancel(jobId, BatchCancelParams.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: BatchCancelParams = BatchCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCancelResponse = cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: BatchCancelParams = BatchCancelParams.none(),
    ): BatchCancelResponse = cancel(jobId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: BatchCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCancelResponse

    /** @see cancel */
    fun cancel(params: BatchCancelParams): BatchCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(jobId: String, requestOptions: RequestOptions): BatchCancelResponse =
        cancel(jobId, BatchCancelParams.none(), requestOptions)

    /**
     * Get detailed status of a batch processing job.
     *
     * Returns current progress percentage, file counts (total, processed, failed, skipped), and
     * timestamps.
     */
    fun getStatus(jobId: String): BatchGetStatusResponse =
        getStatus(jobId, BatchGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        jobId: String,
        params: BatchGetStatusParams = BatchGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchGetStatusResponse = getStatus(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        jobId: String,
        params: BatchGetStatusParams = BatchGetStatusParams.none(),
    ): BatchGetStatusResponse = getStatus(jobId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: BatchGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchGetStatusResponse

    /** @see getStatus */
    fun getStatus(params: BatchGetStatusParams): BatchGetStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(jobId: String, requestOptions: RequestOptions): BatchGetStatusResponse =
        getStatus(jobId, BatchGetStatusParams.none(), requestOptions)

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        fun jobItems(): JobItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/batch-processing`, but is otherwise
         * the same as [BatchService.create].
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
         * Returns a raw HTTP response for `get /api/v1/beta/batch-processing`, but is otherwise the
         * same as [BatchService.list].
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
         * Returns a raw HTTP response for `post /api/v1/beta/batch-processing/{job_id}/cancel`, but
         * is otherwise the same as [BatchService.cancel].
         */
        @MustBeClosed
        fun cancel(jobId: String): HttpResponseFor<BatchCancelResponse> =
            cancel(jobId, BatchCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            params: BatchCancelParams = BatchCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCancelResponse> =
            cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            params: BatchCancelParams = BatchCancelParams.none(),
        ): HttpResponseFor<BatchCancelResponse> = cancel(jobId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: BatchCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: BatchCancelParams): HttpResponseFor<BatchCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCancelResponse> =
            cancel(jobId, BatchCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/batch-processing/{job_id}`, but is
         * otherwise the same as [BatchService.getStatus].
         */
        @MustBeClosed
        fun getStatus(jobId: String): HttpResponseFor<BatchGetStatusResponse> =
            getStatus(jobId, BatchGetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            jobId: String,
            params: BatchGetStatusParams = BatchGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchGetStatusResponse> =
            getStatus(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            jobId: String,
            params: BatchGetStatusParams = BatchGetStatusParams.none(),
        ): HttpResponseFor<BatchGetStatusResponse> = getStatus(jobId, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: BatchGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchGetStatusResponse>

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(params: BatchGetStatusParams): HttpResponseFor<BatchGetStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchGetStatusResponse> =
            getStatus(jobId, BatchGetStatusParams.none(), requestOptions)
    }
}
