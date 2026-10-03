// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.classifier

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.classifier.jobs.ClassifyJob
import ai.llamaindex.llamacloud.models.classifier.jobs.JobCreateParams
import ai.llamaindex.llamacloud.models.classifier.jobs.JobGetParams
import ai.llamaindex.llamacloud.models.classifier.jobs.JobGetResultsParams
import ai.llamaindex.llamacloud.models.classifier.jobs.JobGetResultsResponse
import ai.llamaindex.llamacloud.models.classifier.jobs.JobListPageAsync
import ai.llamaindex.llamacloud.models.classifier.jobs.JobListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync

    /** Create a classify job. Experimental: not production-ready and subject to change. */
    @Deprecated("Please use `client.classify.create()`")
    fun create(params: JobCreateParams): CompletableFuture<ClassifyJob> =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("Please use `client.classify.create()`")
    fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClassifyJob>

    /** List classify jobs. Experimental: not production-ready and subject to change. */
    @Deprecated("Please use `client.classify.list()`")
    fun list(): CompletableFuture<JobListPageAsync> = list(JobListParams.none())

    /** @see list */
    @Deprecated("Please use `client.classify.list()`")
    fun list(
        params: JobListParams = JobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobListPageAsync>

    /** @see list */
    @Deprecated("Please use `client.classify.list()`")
    fun list(params: JobListParams = JobListParams.none()): CompletableFuture<JobListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("Please use `client.classify.list()`")
    fun list(requestOptions: RequestOptions): CompletableFuture<JobListPageAsync> =
        list(JobListParams.none(), requestOptions)

    /** Get a classify job. Experimental: not production-ready and subject to change. */
    @Deprecated("Please use `client.classify.get()`")
    fun get(classifyJobId: String): CompletableFuture<ClassifyJob> =
        get(classifyJobId, JobGetParams.none())

    /** @see get */
    @Deprecated("Please use `client.classify.get()`")
    fun get(
        classifyJobId: String,
        params: JobGetParams = JobGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClassifyJob> =
        get(params.toBuilder().classifyJobId(classifyJobId).build(), requestOptions)

    /** @see get */
    @Deprecated("Please use `client.classify.get()`")
    fun get(
        classifyJobId: String,
        params: JobGetParams = JobGetParams.none(),
    ): CompletableFuture<ClassifyJob> = get(classifyJobId, params, RequestOptions.none())

    /** @see get */
    @Deprecated("Please use `client.classify.get()`")
    fun get(
        params: JobGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClassifyJob>

    /** @see get */
    @Deprecated("Please use `client.classify.get()`")
    fun get(params: JobGetParams): CompletableFuture<ClassifyJob> =
        get(params, RequestOptions.none())

    /** @see get */
    @Deprecated("Please use `client.classify.get()`")
    fun get(classifyJobId: String, requestOptions: RequestOptions): CompletableFuture<ClassifyJob> =
        get(classifyJobId, JobGetParams.none(), requestOptions)

    /**
     * Get the results of a classify job. Experimental: not production-ready and subject to change.
     */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(classifyJobId: String): CompletableFuture<JobGetResultsResponse> =
        getResults(classifyJobId, JobGetResultsParams.none())

    /** @see getResults */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(
        classifyJobId: String,
        params: JobGetResultsParams = JobGetResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobGetResultsResponse> =
        getResults(params.toBuilder().classifyJobId(classifyJobId).build(), requestOptions)

    /** @see getResults */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(
        classifyJobId: String,
        params: JobGetResultsParams = JobGetResultsParams.none(),
    ): CompletableFuture<JobGetResultsResponse> =
        getResults(classifyJobId, params, RequestOptions.none())

    /** @see getResults */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(
        params: JobGetResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobGetResultsResponse>

    /** @see getResults */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(params: JobGetResultsParams): CompletableFuture<JobGetResultsResponse> =
        getResults(params, RequestOptions.none())

    /** @see getResults */
    @Deprecated("Please use `client.classify.get()`")
    fun getResults(
        classifyJobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobGetResultsResponse> =
        getResults(classifyJobId, JobGetResultsParams.none(), requestOptions)

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/classifier/jobs`, but is otherwise the same
         * as [JobServiceAsync.create].
         */
        @Deprecated("Please use `client.classify.create()`")
        fun create(params: JobCreateParams): CompletableFuture<HttpResponseFor<ClassifyJob>> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("Please use `client.classify.create()`")
        fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyJob>>

        /**
         * Returns a raw HTTP response for `get /api/v1/classifier/jobs`, but is otherwise the same
         * as [JobServiceAsync.list].
         */
        @Deprecated("Please use `client.classify.list()`")
        fun list(): CompletableFuture<HttpResponseFor<JobListPageAsync>> =
            list(JobListParams.none())

        /** @see list */
        @Deprecated("Please use `client.classify.list()`")
        fun list(
            params: JobListParams = JobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobListPageAsync>>

        /** @see list */
        @Deprecated("Please use `client.classify.list()`")
        fun list(
            params: JobListParams = JobListParams.none()
        ): CompletableFuture<HttpResponseFor<JobListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("Please use `client.classify.list()`")
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<JobListPageAsync>> =
            list(JobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/classifier/jobs/{classify_job_id}`, but is
         * otherwise the same as [JobServiceAsync.get].
         */
        @Deprecated("Please use `client.classify.get()`")
        fun get(classifyJobId: String): CompletableFuture<HttpResponseFor<ClassifyJob>> =
            get(classifyJobId, JobGetParams.none())

        /** @see get */
        @Deprecated("Please use `client.classify.get()`")
        fun get(
            classifyJobId: String,
            params: JobGetParams = JobGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyJob>> =
            get(params.toBuilder().classifyJobId(classifyJobId).build(), requestOptions)

        /** @see get */
        @Deprecated("Please use `client.classify.get()`")
        fun get(
            classifyJobId: String,
            params: JobGetParams = JobGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyJob>> =
            get(classifyJobId, params, RequestOptions.none())

        /** @see get */
        @Deprecated("Please use `client.classify.get()`")
        fun get(
            params: JobGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyJob>>

        /** @see get */
        @Deprecated("Please use `client.classify.get()`")
        fun get(params: JobGetParams): CompletableFuture<HttpResponseFor<ClassifyJob>> =
            get(params, RequestOptions.none())

        /** @see get */
        @Deprecated("Please use `client.classify.get()`")
        fun get(
            classifyJobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClassifyJob>> =
            get(classifyJobId, JobGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/classifier/jobs/{classify_job_id}/results`,
         * but is otherwise the same as [JobServiceAsync.getResults].
         */
        @Deprecated("Please use `client.classify.get()`")
        fun getResults(
            classifyJobId: String
        ): CompletableFuture<HttpResponseFor<JobGetResultsResponse>> =
            getResults(classifyJobId, JobGetResultsParams.none())

        /** @see getResults */
        @Deprecated("Please use `client.classify.get()`")
        fun getResults(
            classifyJobId: String,
            params: JobGetResultsParams = JobGetResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobGetResultsResponse>> =
            getResults(params.toBuilder().classifyJobId(classifyJobId).build(), requestOptions)

        /** @see getResults */
        @Deprecated("Please use `client.classify.get()`")
        fun getResults(
            classifyJobId: String,
            params: JobGetResultsParams = JobGetResultsParams.none(),
        ): CompletableFuture<HttpResponseFor<JobGetResultsResponse>> =
            getResults(classifyJobId, params, RequestOptions.none())

        /** @see getResults */
        @Deprecated("Please use `client.classify.get()`")
        fun getResults(
            params: JobGetResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobGetResultsResponse>>

        /** @see getResults */
        @Deprecated("Please use `client.classify.get()`")
        fun getResults(
            params: JobGetResultsParams
        ): CompletableFuture<HttpResponseFor<JobGetResultsResponse>> =
            getResults(params, RequestOptions.none())

        /** @see getResults */
        @Deprecated("Please use `client.classify.get()`")
        fun getResults(
            classifyJobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobGetResultsResponse>> =
            getResults(classifyJobId, JobGetResultsParams.none(), requestOptions)
    }
}
