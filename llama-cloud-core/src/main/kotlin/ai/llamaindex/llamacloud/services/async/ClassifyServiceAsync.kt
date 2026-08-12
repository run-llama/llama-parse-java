// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.classify.ClassifyCancelParams
import ai.llamaindex.llamacloud.models.classify.ClassifyCancelResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateParams
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateRequest
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyGetParams
import ai.llamaindex.llamacloud.models.classify.ClassifyGetResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyListPageAsync
import ai.llamaindex.llamacloud.models.classify.ClassifyListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ClassifyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClassifyServiceAsync

    /**
     * Create a classify job.
     *
     * Classifies a document against a set of rules. Set `file_input` to a file ID (`dfl-...`) or
     * parse job ID (`pjb-...`), and provide either inline `configuration` with rules or a
     * `configuration_id` referencing a saved preset.
     *
     * Each rule has a `type` (the label to assign) and a `description` (natural language criteria).
     * The classifier returns the best matching rule with a confidence score.
     *
     * The job runs asynchronously. Poll `GET /classify/{job_id}` to check status and retrieve
     * results.
     */
    fun create(params: ClassifyCreateParams): CompletableFuture<ClassifyCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ClassifyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClassifyCreateResponse>

    /** @see create */
    fun create(
        classifyCreateRequest: ClassifyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClassifyCreateResponse> =
        create(
            ClassifyCreateParams.builder().classifyCreateRequest(classifyCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        classifyCreateRequest: ClassifyCreateRequest
    ): CompletableFuture<ClassifyCreateResponse> =
        create(classifyCreateRequest, RequestOptions.none())

    /**
     * List classify jobs with optional filtering and pagination.
     *
     * Filter by `status`, `configuration_id`, specific `job_ids`, or creation date range.
     */
    fun list(): CompletableFuture<ClassifyListPageAsync> = list(ClassifyListParams.none())

    /** @see list */
    fun list(
        params: ClassifyListParams = ClassifyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClassifyListPageAsync>

    /** @see list */
    fun list(
        params: ClassifyListParams = ClassifyListParams.none()
    ): CompletableFuture<ClassifyListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ClassifyListPageAsync> =
        list(ClassifyListParams.none(), requestOptions)

    /**
     * Cancel a running classify job.
     *
     * Stops processing and marks the job as CANCELLED. Returns the updated job. Jobs already in a
     * terminal state (COMPLETED, FAILED, CANCELLED) cannot be cancelled.
     */
    fun cancel(jobId: String): CompletableFuture<ClassifyCancelResponse> =
        cancel(jobId, ClassifyCancelParams.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: ClassifyCancelParams = ClassifyCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClassifyCancelResponse> =
        cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: ClassifyCancelParams = ClassifyCancelParams.none(),
    ): CompletableFuture<ClassifyCancelResponse> = cancel(jobId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ClassifyCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClassifyCancelResponse>

    /** @see cancel */
    fun cancel(params: ClassifyCancelParams): CompletableFuture<ClassifyCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClassifyCancelResponse> =
        cancel(jobId, ClassifyCancelParams.none(), requestOptions)

    /**
     * Get a classify job by ID.
     *
     * Returns the job status, configuration, and classify result when complete. The result includes
     * the matched document type, confidence score, and reasoning.
     */
    fun get(jobId: String): CompletableFuture<ClassifyGetResponse> =
        get(jobId, ClassifyGetParams.none())

    /** @see get */
    fun get(
        jobId: String,
        params: ClassifyGetParams = ClassifyGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClassifyGetResponse> =
        get(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see get */
    fun get(
        jobId: String,
        params: ClassifyGetParams = ClassifyGetParams.none(),
    ): CompletableFuture<ClassifyGetResponse> = get(jobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ClassifyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClassifyGetResponse>

    /** @see get */
    fun get(params: ClassifyGetParams): CompletableFuture<ClassifyGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(jobId: String, requestOptions: RequestOptions): CompletableFuture<ClassifyGetResponse> =
        get(jobId, ClassifyGetParams.none(), requestOptions)

    /**
     * A view of [ClassifyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClassifyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/classify`, but is otherwise the same as
         * [ClassifyServiceAsync.create].
         */
        fun create(
            params: ClassifyCreateParams
        ): CompletableFuture<HttpResponseFor<ClassifyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ClassifyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyCreateResponse>>

        /** @see create */
        fun create(
            classifyCreateRequest: ClassifyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyCreateResponse>> =
            create(
                ClassifyCreateParams.builder().classifyCreateRequest(classifyCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            classifyCreateRequest: ClassifyCreateRequest
        ): CompletableFuture<HttpResponseFor<ClassifyCreateResponse>> =
            create(classifyCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v2/classify`, but is otherwise the same as
         * [ClassifyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ClassifyListPageAsync>> =
            list(ClassifyListParams.none())

        /** @see list */
        fun list(
            params: ClassifyListParams = ClassifyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyListPageAsync>>

        /** @see list */
        fun list(
            params: ClassifyListParams = ClassifyListParams.none()
        ): CompletableFuture<HttpResponseFor<ClassifyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ClassifyListPageAsync>> =
            list(ClassifyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/classify/{job_id}/cancel`, but is otherwise
         * the same as [ClassifyServiceAsync.cancel].
         */
        fun cancel(jobId: String): CompletableFuture<HttpResponseFor<ClassifyCancelResponse>> =
            cancel(jobId, ClassifyCancelParams.none())

        /** @see cancel */
        fun cancel(
            jobId: String,
            params: ClassifyCancelParams = ClassifyCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyCancelResponse>> =
            cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            jobId: String,
            params: ClassifyCancelParams = ClassifyCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyCancelResponse>> =
            cancel(jobId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: ClassifyCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: ClassifyCancelParams
        ): CompletableFuture<HttpResponseFor<ClassifyCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClassifyCancelResponse>> =
            cancel(jobId, ClassifyCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/classify/{job_id}`, but is otherwise the
         * same as [ClassifyServiceAsync.get].
         */
        fun get(jobId: String): CompletableFuture<HttpResponseFor<ClassifyGetResponse>> =
            get(jobId, ClassifyGetParams.none())

        /** @see get */
        fun get(
            jobId: String,
            params: ClassifyGetParams = ClassifyGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyGetResponse>> =
            get(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see get */
        fun get(
            jobId: String,
            params: ClassifyGetParams = ClassifyGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyGetResponse>> =
            get(jobId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ClassifyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClassifyGetResponse>>

        /** @see get */
        fun get(
            params: ClassifyGetParams
        ): CompletableFuture<HttpResponseFor<ClassifyGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClassifyGetResponse>> =
            get(jobId, ClassifyGetParams.none(), requestOptions)
    }
}
