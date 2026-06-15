// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.classifier

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.classifier.jobs.ClassifyJob
import com.llamacloud_prod.api.models.classifier.jobs.JobCreateParams
import com.llamacloud_prod.api.models.classifier.jobs.JobGetParams
import com.llamacloud_prod.api.models.classifier.jobs.JobGetResultsParams
import com.llamacloud_prod.api.models.classifier.jobs.JobGetResultsResponse
import com.llamacloud_prod.api.models.classifier.jobs.JobListPage
import com.llamacloud_prod.api.models.classifier.jobs.JobListParams
import java.util.function.Consumer

interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService

    /** Create a classify job. Experimental: not production-ready and subject to change. */
    @Deprecated("Please use `client.classify.create()`")
    fun create(params: JobCreateParams): ClassifyJob = create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("Please use `client.classify.create()`")
    fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyJob

    /** List classify jobs. Experimental: not production-ready and subject to change. */
    @Deprecated("Please use `client.classify.list()`")
    fun list(): JobListPage = list(JobListParams.none())

    /** @see list */
    @Deprecated("Please use `client.classify.list()`")
    fun list(
        params: JobListParams = JobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobListPage

    /** @see list */
    @Deprecated("Please use `client.classify.list()`")
    fun list(params: JobListParams = JobListParams.none()): JobListPage =
        list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("Please use `client.classify.list()`")
    fun list(requestOptions: RequestOptions): JobListPage =
        list(JobListParams.none(), requestOptions)

    /** Get a classify job. Experimental: not production-ready and subject to change. */
    @Deprecated("Please use `client.classify.get()`")
    fun get(classifyJobId: String): ClassifyJob = get(classifyJobId, JobGetParams.none())

    /** @see get */
    @Deprecated("Please use `client.classify.get()`")
    fun get(
        classifyJobId: String,
        params: JobGetParams = JobGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyJob = get(params.toBuilder().classifyJobId(classifyJobId).build(), requestOptions)

    /** @see get */
    @Deprecated("Please use `client.classify.get()`")
    fun get(classifyJobId: String, params: JobGetParams = JobGetParams.none()): ClassifyJob =
        get(classifyJobId, params, RequestOptions.none())

    /** @see get */
    @Deprecated("Please use `client.classify.get()`")
    fun get(
        params: JobGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyJob

    /** @see get */
    @Deprecated("Please use `client.classify.get()`")
    fun get(params: JobGetParams): ClassifyJob = get(params, RequestOptions.none())

    /** @see get */
    @Deprecated("Please use `client.classify.get()`")
    fun get(classifyJobId: String, requestOptions: RequestOptions): ClassifyJob =
        get(classifyJobId, JobGetParams.none(), requestOptions)

    /**
     * Get the results of a classify job. Experimental: not production-ready and subject to change.
     */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(classifyJobId: String): JobGetResultsResponse =
        getResults(classifyJobId, JobGetResultsParams.none())

    /** @see getResults */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(
        classifyJobId: String,
        params: JobGetResultsParams = JobGetResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobGetResultsResponse =
        getResults(params.toBuilder().classifyJobId(classifyJobId).build(), requestOptions)

    /** @see getResults */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(
        classifyJobId: String,
        params: JobGetResultsParams = JobGetResultsParams.none(),
    ): JobGetResultsResponse = getResults(classifyJobId, params, RequestOptions.none())

    /** @see getResults */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(
        params: JobGetResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobGetResultsResponse

    /** @see getResults */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(params: JobGetResultsParams): JobGetResultsResponse =
        getResults(params, RequestOptions.none())

    /** @see getResults */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(classifyJobId: String, requestOptions: RequestOptions): JobGetResultsResponse =
        getResults(classifyJobId, JobGetResultsParams.none(), requestOptions)

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/classifier/jobs`, but is otherwise the same
         * as [JobService.create].
         */
        @Deprecated("Please use `client.classify.create()`")
        @MustBeClosed
        fun create(params: JobCreateParams): HttpResponseFor<ClassifyJob> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("Please use `client.classify.create()`")
        @MustBeClosed
        fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyJob>

        /**
         * Returns a raw HTTP response for `get /api/v1/classifier/jobs`, but is otherwise the same
         * as [JobService.list].
         */
        @Deprecated("Please use `client.classify.list()`")
        @MustBeClosed
        fun list(): HttpResponseFor<JobListPage> = list(JobListParams.none())

        /** @see list */
        @Deprecated("Please use `client.classify.list()`")
        @MustBeClosed
        fun list(
            params: JobListParams = JobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobListPage>

        /** @see list */
        @Deprecated("Please use `client.classify.list()`")
        @MustBeClosed
        fun list(params: JobListParams = JobListParams.none()): HttpResponseFor<JobListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("Please use `client.classify.list()`")
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<JobListPage> =
            list(JobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/classifier/jobs/{classify_job_id}`, but is
         * otherwise the same as [JobService.get].
         */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun get(classifyJobId: String): HttpResponseFor<ClassifyJob> =
            get(classifyJobId, JobGetParams.none())

        /** @see get */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun get(
            classifyJobId: String,
            params: JobGetParams = JobGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyJob> =
            get(params.toBuilder().classifyJobId(classifyJobId).build(), requestOptions)

        /** @see get */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun get(
            classifyJobId: String,
            params: JobGetParams = JobGetParams.none(),
        ): HttpResponseFor<ClassifyJob> = get(classifyJobId, params, RequestOptions.none())

        /** @see get */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun get(
            params: JobGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyJob>

        /** @see get */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun get(params: JobGetParams): HttpResponseFor<ClassifyJob> =
            get(params, RequestOptions.none())

        /** @see get */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun get(
            classifyJobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassifyJob> = get(classifyJobId, JobGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/classifier/jobs/{classify_job_id}/results`,
         * but is otherwise the same as [JobService.getResults].
         */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun getResults(classifyJobId: String): HttpResponseFor<JobGetResultsResponse> =
            getResults(classifyJobId, JobGetResultsParams.none())

        /** @see getResults */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun getResults(
            classifyJobId: String,
            params: JobGetResultsParams = JobGetResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobGetResultsResponse> =
            getResults(params.toBuilder().classifyJobId(classifyJobId).build(), requestOptions)

        /** @see getResults */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun getResults(
            classifyJobId: String,
            params: JobGetResultsParams = JobGetResultsParams.none(),
        ): HttpResponseFor<JobGetResultsResponse> =
            getResults(classifyJobId, params, RequestOptions.none())

        /** @see getResults */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun getResults(
            params: JobGetResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobGetResultsResponse>

        /** @see getResults */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun getResults(params: JobGetResultsParams): HttpResponseFor<JobGetResultsResponse> =
            getResults(params, RequestOptions.none())

        /** @see getResults */
        @Deprecated("Please use `client.classify.get()`")
        @MustBeClosed
        fun getResults(
            classifyJobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobGetResultsResponse> =
            getResults(classifyJobId, JobGetResultsParams.none(), requestOptions)
    }
}
