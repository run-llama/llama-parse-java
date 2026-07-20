// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.beta.batch

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.beta.batch.jobitems.JobItemGetProcessingResultsParams
import ai.llamaindex.llamacloud.models.beta.batch.jobitems.JobItemGetProcessingResultsResponse
import ai.llamaindex.llamacloud.models.beta.batch.jobitems.JobItemListPageAsync
import ai.llamaindex.llamacloud.models.beta.batch.jobitems.JobItemListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JobItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobItemServiceAsync

    /**
     * List items in a batch job with optional status filtering.
     *
     * Useful for finding failed items, viewing completed items, or debugging processing issues.
     */
    fun list(jobId: String): CompletableFuture<JobItemListPageAsync> =
        list(jobId, JobItemListParams.none())

    /** @see list */
    fun list(
        jobId: String,
        params: JobItemListParams = JobItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobItemListPageAsync> =
        list(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see list */
    fun list(
        jobId: String,
        params: JobItemListParams = JobItemListParams.none(),
    ): CompletableFuture<JobItemListPageAsync> = list(jobId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: JobItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobItemListPageAsync>

    /** @see list */
    fun list(params: JobItemListParams): CompletableFuture<JobItemListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobItemListPageAsync> =
        list(jobId, JobItemListParams.none(), requestOptions)

    /**
     * Get all processing results for a specific item.
     *
     * Returns the complete processing history for an item including what operations were performed,
     * parameters used, and where outputs are stored. Optionally filter by `job_type`.
     */
    fun getProcessingResults(
        itemId: String
    ): CompletableFuture<JobItemGetProcessingResultsResponse> =
        getProcessingResults(itemId, JobItemGetProcessingResultsParams.none())

    /** @see getProcessingResults */
    fun getProcessingResults(
        itemId: String,
        params: JobItemGetProcessingResultsParams = JobItemGetProcessingResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobItemGetProcessingResultsResponse> =
        getProcessingResults(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see getProcessingResults */
    fun getProcessingResults(
        itemId: String,
        params: JobItemGetProcessingResultsParams = JobItemGetProcessingResultsParams.none(),
    ): CompletableFuture<JobItemGetProcessingResultsResponse> =
        getProcessingResults(itemId, params, RequestOptions.none())

    /** @see getProcessingResults */
    fun getProcessingResults(
        params: JobItemGetProcessingResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobItemGetProcessingResultsResponse>

    /** @see getProcessingResults */
    fun getProcessingResults(
        params: JobItemGetProcessingResultsParams
    ): CompletableFuture<JobItemGetProcessingResultsResponse> =
        getProcessingResults(params, RequestOptions.none())

    /** @see getProcessingResults */
    fun getProcessingResults(
        itemId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobItemGetProcessingResultsResponse> =
        getProcessingResults(itemId, JobItemGetProcessingResultsParams.none(), requestOptions)

    /**
     * A view of [JobItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/batch-processing/{job_id}/items`, but
         * is otherwise the same as [JobItemServiceAsync.list].
         */
        fun list(jobId: String): CompletableFuture<HttpResponseFor<JobItemListPageAsync>> =
            list(jobId, JobItemListParams.none())

        /** @see list */
        fun list(
            jobId: String,
            params: JobItemListParams = JobItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobItemListPageAsync>> =
            list(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see list */
        fun list(
            jobId: String,
            params: JobItemListParams = JobItemListParams.none(),
        ): CompletableFuture<HttpResponseFor<JobItemListPageAsync>> =
            list(jobId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: JobItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobItemListPageAsync>>

        /** @see list */
        fun list(
            params: JobItemListParams
        ): CompletableFuture<HttpResponseFor<JobItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobItemListPageAsync>> =
            list(jobId, JobItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/beta/batch-processing/items/{item_id}/processing-results`, but is otherwise the
         * same as [JobItemServiceAsync.getProcessingResults].
         */
        fun getProcessingResults(
            itemId: String
        ): CompletableFuture<HttpResponseFor<JobItemGetProcessingResultsResponse>> =
            getProcessingResults(itemId, JobItemGetProcessingResultsParams.none())

        /** @see getProcessingResults */
        fun getProcessingResults(
            itemId: String,
            params: JobItemGetProcessingResultsParams = JobItemGetProcessingResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobItemGetProcessingResultsResponse>> =
            getProcessingResults(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see getProcessingResults */
        fun getProcessingResults(
            itemId: String,
            params: JobItemGetProcessingResultsParams = JobItemGetProcessingResultsParams.none(),
        ): CompletableFuture<HttpResponseFor<JobItemGetProcessingResultsResponse>> =
            getProcessingResults(itemId, params, RequestOptions.none())

        /** @see getProcessingResults */
        fun getProcessingResults(
            params: JobItemGetProcessingResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobItemGetProcessingResultsResponse>>

        /** @see getProcessingResults */
        fun getProcessingResults(
            params: JobItemGetProcessingResultsParams
        ): CompletableFuture<HttpResponseFor<JobItemGetProcessingResultsResponse>> =
            getProcessingResults(params, RequestOptions.none())

        /** @see getProcessingResults */
        fun getProcessingResults(
            itemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobItemGetProcessingResultsResponse>> =
            getProcessingResults(itemId, JobItemGetProcessingResultsParams.none(), requestOptions)
    }
}
