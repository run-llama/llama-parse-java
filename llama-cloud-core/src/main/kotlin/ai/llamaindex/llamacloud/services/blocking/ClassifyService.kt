// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateParams
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateRequest
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateResponse
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
