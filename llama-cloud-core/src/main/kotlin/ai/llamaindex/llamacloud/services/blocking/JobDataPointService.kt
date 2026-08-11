// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.jobdatapoints.JobDataPointListPage
import ai.llamaindex.llamacloud.models.jobdatapoints.JobDataPointListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface JobDataPointService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobDataPointService

    /** Returns paginated job data points for the current project. */
    fun list(params: JobDataPointListParams): JobDataPointListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: JobDataPointListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobDataPointListPage

    /**
     * A view of [JobDataPointService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobDataPointService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/job-data-points`, but is otherwise the same
         * as [JobDataPointService.list].
         */
        @MustBeClosed
        fun list(params: JobDataPointListParams): HttpResponseFor<JobDataPointListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: JobDataPointListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobDataPointListPage>
    }
}
