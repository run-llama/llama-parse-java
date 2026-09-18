// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.classify.ClassifyCancelParams
import ai.llamaindex.llamacloud.models.classify.ClassifyCancelResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateParams
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateRequest
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyDeleteParams
import ai.llamaindex.llamacloud.models.classify.ClassifyDeleteResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyGetParams
import ai.llamaindex.llamacloud.models.classify.ClassifyGetResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyListPage
import ai.llamaindex.llamacloud.models.classify.ClassifyListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ClassifyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClassifyService

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
    fun create(params: ClassifyCreateParams): ClassifyCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ClassifyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyCreateResponse

    /** @see create */
    fun create(
        classifyCreateRequest: ClassifyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyCreateResponse =
        create(
            ClassifyCreateParams.builder().classifyCreateRequest(classifyCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(classifyCreateRequest: ClassifyCreateRequest): ClassifyCreateResponse =
        create(classifyCreateRequest, RequestOptions.none())

    /**
     * List classify jobs with optional filtering and pagination.
     *
     * Filter by `status`, `configuration_id`, specific `job_ids`, or creation date range.
     */
    fun list(): ClassifyListPage = list(ClassifyListParams.none())

    /** @see list */
    fun list(
        params: ClassifyListParams = ClassifyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyListPage

    /** @see list */
    fun list(params: ClassifyListParams = ClassifyListParams.none()): ClassifyListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ClassifyListPage =
        list(ClassifyListParams.none(), requestOptions)

    /**
     * Delete a classify job and its result.
     *
     * The job must be in a terminal state (COMPLETED, FAILED, CANCELLED). Cancel a job that is
     * still running before deleting it.
     *
     * Returns the identifiers of the deleted job.
     */
    fun delete(jobId: String): ClassifyDeleteResponse = delete(jobId, ClassifyDeleteParams.none())

    /** @see delete */
    fun delete(
        jobId: String,
        params: ClassifyDeleteParams = ClassifyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyDeleteResponse = delete(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see delete */
    fun delete(
        jobId: String,
        params: ClassifyDeleteParams = ClassifyDeleteParams.none(),
    ): ClassifyDeleteResponse = delete(jobId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ClassifyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyDeleteResponse

    /** @see delete */
    fun delete(params: ClassifyDeleteParams): ClassifyDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(jobId: String, requestOptions: RequestOptions): ClassifyDeleteResponse =
        delete(jobId, ClassifyDeleteParams.none(), requestOptions)

    /**
     * Cancel a running classify job.
     *
     * Stops processing and marks the job as CANCELLED. Returns the updated job. Jobs already in a
     * terminal state (COMPLETED, FAILED, CANCELLED) cannot be cancelled.
     */
    fun cancel(jobId: String): ClassifyCancelResponse = cancel(jobId, ClassifyCancelParams.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: ClassifyCancelParams = ClassifyCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyCancelResponse = cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: ClassifyCancelParams = ClassifyCancelParams.none(),
    ): ClassifyCancelResponse = cancel(jobId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ClassifyCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyCancelResponse

    /** @see cancel */
    fun cancel(params: ClassifyCancelParams): ClassifyCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(jobId: String, requestOptions: RequestOptions): ClassifyCancelResponse =
        cancel(jobId, ClassifyCancelParams.none(), requestOptions)

    /**
     * Get a classify job by ID.
     *
     * Returns the job status, configuration, and classify result when complete. The result includes
     * the matched document type, confidence score, and reasoning.
     */
    fun get(jobId: String): ClassifyGetResponse = get(jobId, ClassifyGetParams.none())

    /** @see get */
    fun get(
        jobId: String,
        params: ClassifyGetParams = ClassifyGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyGetResponse = get(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see get */
    fun get(
        jobId: String,
        params: ClassifyGetParams = ClassifyGetParams.none(),
    ): ClassifyGetResponse = get(jobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ClassifyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassifyGetResponse

    /** @see get */
    fun get(params: ClassifyGetParams): ClassifyGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(jobId: String, requestOptions: RequestOptions): ClassifyGetResponse =
        get(jobId, ClassifyGetParams.none(), requestOptions)

    /** A view of [ClassifyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClassifyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/classify`, but is otherwise the same as
         * [ClassifyService.create].
         */
        @MustBeClosed
        fun create(params: ClassifyCreateParams): HttpResponseFor<ClassifyCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ClassifyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            classifyCreateRequest: ClassifyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyCreateResponse> =
            create(
                ClassifyCreateParams.builder().classifyCreateRequest(classifyCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            classifyCreateRequest: ClassifyCreateRequest
        ): HttpResponseFor<ClassifyCreateResponse> =
            create(classifyCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v2/classify`, but is otherwise the same as
         * [ClassifyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ClassifyListPage> = list(ClassifyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ClassifyListParams = ClassifyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ClassifyListParams = ClassifyListParams.none()
        ): HttpResponseFor<ClassifyListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ClassifyListPage> =
            list(ClassifyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/classify/{job_id}`, but is otherwise the
         * same as [ClassifyService.delete].
         */
        @MustBeClosed
        fun delete(jobId: String): HttpResponseFor<ClassifyDeleteResponse> =
            delete(jobId, ClassifyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            jobId: String,
            params: ClassifyDeleteParams = ClassifyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyDeleteResponse> =
            delete(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            jobId: String,
            params: ClassifyDeleteParams = ClassifyDeleteParams.none(),
        ): HttpResponseFor<ClassifyDeleteResponse> = delete(jobId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ClassifyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ClassifyDeleteParams): HttpResponseFor<ClassifyDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassifyDeleteResponse> =
            delete(jobId, ClassifyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/classify/{job_id}/cancel`, but is otherwise
         * the same as [ClassifyService.cancel].
         */
        @MustBeClosed
        fun cancel(jobId: String): HttpResponseFor<ClassifyCancelResponse> =
            cancel(jobId, ClassifyCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            params: ClassifyCancelParams = ClassifyCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyCancelResponse> =
            cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            params: ClassifyCancelParams = ClassifyCancelParams.none(),
        ): HttpResponseFor<ClassifyCancelResponse> = cancel(jobId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: ClassifyCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: ClassifyCancelParams): HttpResponseFor<ClassifyCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassifyCancelResponse> =
            cancel(jobId, ClassifyCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/classify/{job_id}`, but is otherwise the
         * same as [ClassifyService.get].
         */
        @MustBeClosed
        fun get(jobId: String): HttpResponseFor<ClassifyGetResponse> =
            get(jobId, ClassifyGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            params: ClassifyGetParams = ClassifyGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyGetResponse> =
            get(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            params: ClassifyGetParams = ClassifyGetParams.none(),
        ): HttpResponseFor<ClassifyGetResponse> = get(jobId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ClassifyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassifyGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ClassifyGetParams): HttpResponseFor<ClassifyGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassifyGetResponse> =
            get(jobId, ClassifyGetParams.none(), requestOptions)
    }
}
