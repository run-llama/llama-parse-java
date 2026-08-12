// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.jobdatapoints.JobDataPointListPageAsync
import ai.llamaindex.llamacloud.models.jobdatapoints.JobDataPointListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JobDataPointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobDataPointServiceAsync

    /** Returns paginated job data points for the current project. */
    fun list(params: JobDataPointListParams): CompletableFuture<JobDataPointListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: JobDataPointListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobDataPointListPageAsync>

    /**
     * A view of [JobDataPointServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobDataPointServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/job-data-points`, but is otherwise the same
         * as [JobDataPointServiceAsync.list].
         */
        fun list(
            params: JobDataPointListParams
        ): CompletableFuture<HttpResponseFor<JobDataPointListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: JobDataPointListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobDataPointListPageAsync>>
    }
}
