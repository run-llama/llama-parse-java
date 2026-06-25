// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta.batch

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.batch.jobitems.JobItemGetProcessingResultsParams
import com.llamacloud_prod.api.models.beta.batch.jobitems.JobItemGetProcessingResultsResponse
import com.llamacloud_prod.api.models.beta.batch.jobitems.JobItemListPage
import com.llamacloud_prod.api.models.beta.batch.jobitems.JobItemListParams
import java.util.function.Consumer

interface JobItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobItemService

    /**
     * List items in a batch job with optional status filtering.
     *
     * Useful for finding failed items, viewing completed items, or debugging processing issues.
     */
    fun list(jobId: String): JobItemListPage = list(jobId, JobItemListParams.none())

    /** @see list */
    fun list(
        jobId: String,
        params: JobItemListParams = JobItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobItemListPage = list(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see list */
    fun list(jobId: String, params: JobItemListParams = JobItemListParams.none()): JobItemListPage =
        list(jobId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: JobItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobItemListPage

    /** @see list */
    fun list(params: JobItemListParams): JobItemListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(jobId: String, requestOptions: RequestOptions): JobItemListPage =
        list(jobId, JobItemListParams.none(), requestOptions)

    /**
     * Get all processing results for a specific item.
     *
     * Returns the complete processing history for an item including what operations were performed,
     * parameters used, and where outputs are stored. Optionally filter by `job_type`.
     */
    fun getProcessingResults(itemId: String): JobItemGetProcessingResultsResponse =
        getProcessingResults(itemId, JobItemGetProcessingResultsParams.none())

    /** @see getProcessingResults */
    fun getProcessingResults(
        itemId: String,
        params: JobItemGetProcessingResultsParams = JobItemGetProcessingResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobItemGetProcessingResultsResponse =
        getProcessingResults(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see getProcessingResults */
    fun getProcessingResults(
        itemId: String,
        params: JobItemGetProcessingResultsParams = JobItemGetProcessingResultsParams.none(),
    ): JobItemGetProcessingResultsResponse =
        getProcessingResults(itemId, params, RequestOptions.none())

    /** @see getProcessingResults */
    fun getProcessingResults(
        params: JobItemGetProcessingResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobItemGetProcessingResultsResponse

    /** @see getProcessingResults */
    fun getProcessingResults(
        params: JobItemGetProcessingResultsParams
    ): JobItemGetProcessingResultsResponse = getProcessingResults(params, RequestOptions.none())

    /** @see getProcessingResults */
    fun getProcessingResults(
        itemId: String,
        requestOptions: RequestOptions,
    ): JobItemGetProcessingResultsResponse =
        getProcessingResults(itemId, JobItemGetProcessingResultsParams.none(), requestOptions)

    /** A view of [JobItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/batch-processing/{job_id}/items`, but
         * is otherwise the same as [JobItemService.list].
         */
        @MustBeClosed
        fun list(jobId: String): HttpResponseFor<JobItemListPage> =
            list(jobId, JobItemListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            jobId: String,
            params: JobItemListParams = JobItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobItemListPage> =
            list(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            jobId: String,
            params: JobItemListParams = JobItemListParams.none(),
        ): HttpResponseFor<JobItemListPage> = list(jobId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: JobItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobItemListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: JobItemListParams): HttpResponseFor<JobItemListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(jobId: String, requestOptions: RequestOptions): HttpResponseFor<JobItemListPage> =
            list(jobId, JobItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/beta/batch-processing/items/{item_id}/processing-results`, but is otherwise the
         * same as [JobItemService.getProcessingResults].
         */
        @MustBeClosed
        fun getProcessingResults(
            itemId: String
        ): HttpResponseFor<JobItemGetProcessingResultsResponse> =
            getProcessingResults(itemId, JobItemGetProcessingResultsParams.none())

        /** @see getProcessingResults */
        @MustBeClosed
        fun getProcessingResults(
            itemId: String,
            params: JobItemGetProcessingResultsParams = JobItemGetProcessingResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobItemGetProcessingResultsResponse> =
            getProcessingResults(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see getProcessingResults */
        @MustBeClosed
        fun getProcessingResults(
            itemId: String,
            params: JobItemGetProcessingResultsParams = JobItemGetProcessingResultsParams.none(),
        ): HttpResponseFor<JobItemGetProcessingResultsResponse> =
            getProcessingResults(itemId, params, RequestOptions.none())

        /** @see getProcessingResults */
        @MustBeClosed
        fun getProcessingResults(
            params: JobItemGetProcessingResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobItemGetProcessingResultsResponse>

        /** @see getProcessingResults */
        @MustBeClosed
        fun getProcessingResults(
            params: JobItemGetProcessingResultsParams
        ): HttpResponseFor<JobItemGetProcessingResultsResponse> =
            getProcessingResults(params, RequestOptions.none())

        /** @see getProcessingResults */
        @MustBeClosed
        fun getProcessingResults(
            itemId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobItemGetProcessingResultsResponse> =
            getProcessingResults(itemId, JobItemGetProcessingResultsParams.none(), requestOptions)
    }
}
