// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.alpha

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCancelParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCancelResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCreateParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCreateResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetDetailsParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetDetailsResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyListPage
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface VerifyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyService

    /**
     * Create a Verify job.
     *
     * Analyzes a document for signs of doctoring (splicing, copy-move, AI generation, metadata
     * tampering, ...). Set `file_input` to a file ID (`dfl-...`). Optionally provide a
     * `configuration` object to control the semantic agent.
     *
     * The job runs asynchronously. Poll `GET /verify/{job_id}` with `expand=result` to check status
     * and retrieve results.
     */
    fun create(): VerifyCreateResponse = create(VerifyCreateParams.none())

    /** @see create */
    fun create(
        params: VerifyCreateParams = VerifyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyCreateResponse

    /** @see create */
    fun create(params: VerifyCreateParams = VerifyCreateParams.none()): VerifyCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): VerifyCreateResponse =
        create(VerifyCreateParams.none(), requestOptions)

    /**
     * List Verify jobs with optional filtering and pagination.
     *
     * Filter by `status`, specific `job_ids`, or creation date range.
     */
    fun list(): VerifyListPage = list(VerifyListParams.none())

    /** @see list */
    fun list(
        params: VerifyListParams = VerifyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyListPage

    /** @see list */
    fun list(params: VerifyListParams = VerifyListParams.none()): VerifyListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VerifyListPage =
        list(VerifyListParams.none(), requestOptions)

    /**
     * Cancel a running Verify job.
     *
     * Stops processing and marks the job as CANCELLED. Returns the updated job. Jobs already in a
     * terminal state (COMPLETED, FAILED, CANCELLED) cannot be cancelled.
     */
    fun cancel(jobId: String): VerifyCancelResponse = cancel(jobId, VerifyCancelParams.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: VerifyCancelParams = VerifyCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyCancelResponse = cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: VerifyCancelParams = VerifyCancelParams.none(),
    ): VerifyCancelResponse = cancel(jobId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: VerifyCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyCancelResponse

    /** @see cancel */
    fun cancel(params: VerifyCancelParams): VerifyCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(jobId: String, requestOptions: RequestOptions): VerifyCancelResponse =
        cancel(jobId, VerifyCancelParams.none(), requestOptions)

    /**
     * Get a Verify job by ID.
     *
     * Returns the job status and configuration. Pass `expand=result` to include the Verify result
     * (overall score, verdict, confidence, composite scores, and suspect regions) when the job is
     * complete.
     *
     * Raw per-signal detail is available via `GET /verify/{job_id}/details`.
     */
    fun get(jobId: String): VerifyGetResponse = get(jobId, VerifyGetParams.none())

    /** @see get */
    fun get(
        jobId: String,
        params: VerifyGetParams = VerifyGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyGetResponse = get(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see get */
    fun get(jobId: String, params: VerifyGetParams = VerifyGetParams.none()): VerifyGetResponse =
        get(jobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: VerifyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyGetResponse

    /** @see get */
    fun get(params: VerifyGetParams): VerifyGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(jobId: String, requestOptions: RequestOptions): VerifyGetResponse =
        get(jobId, VerifyGetParams.none(), requestOptions)

    /**
     * Get the raw per-signal detail for a completed Verify job.
     *
     * Forensic drill-down behind the simplified result: the full evidence list, per-family
     * sub-scores, raw localized regions, and per-page forensic heatmap overlays (presigned image
     * URLs).
     */
    fun getDetails(jobId: String): VerifyGetDetailsResponse =
        getDetails(jobId, VerifyGetDetailsParams.none())

    /** @see getDetails */
    fun getDetails(
        jobId: String,
        params: VerifyGetDetailsParams = VerifyGetDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyGetDetailsResponse =
        getDetails(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see getDetails */
    fun getDetails(
        jobId: String,
        params: VerifyGetDetailsParams = VerifyGetDetailsParams.none(),
    ): VerifyGetDetailsResponse = getDetails(jobId, params, RequestOptions.none())

    /** @see getDetails */
    fun getDetails(
        params: VerifyGetDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyGetDetailsResponse

    /** @see getDetails */
    fun getDetails(params: VerifyGetDetailsParams): VerifyGetDetailsResponse =
        getDetails(params, RequestOptions.none())

    /** @see getDetails */
    fun getDetails(jobId: String, requestOptions: RequestOptions): VerifyGetDetailsResponse =
        getDetails(jobId, VerifyGetDetailsParams.none(), requestOptions)

    /** A view of [VerifyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/alpha/verify`, but is otherwise the same as
         * [VerifyService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<VerifyCreateResponse> = create(VerifyCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VerifyCreateParams = VerifyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: VerifyCreateParams = VerifyCreateParams.none()
        ): HttpResponseFor<VerifyCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<VerifyCreateResponse> =
            create(VerifyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/alpha/verify`, but is otherwise the same as
         * [VerifyService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<VerifyListPage> = list(VerifyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VerifyListParams = VerifyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VerifyListParams = VerifyListParams.none()
        ): HttpResponseFor<VerifyListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VerifyListPage> =
            list(VerifyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/alpha/verify/{job_id}/cancel`, but is
         * otherwise the same as [VerifyService.cancel].
         */
        @MustBeClosed
        fun cancel(jobId: String): HttpResponseFor<VerifyCancelResponse> =
            cancel(jobId, VerifyCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            params: VerifyCancelParams = VerifyCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyCancelResponse> =
            cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            params: VerifyCancelParams = VerifyCancelParams.none(),
        ): HttpResponseFor<VerifyCancelResponse> = cancel(jobId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: VerifyCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: VerifyCancelParams): HttpResponseFor<VerifyCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyCancelResponse> =
            cancel(jobId, VerifyCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/alpha/verify/{job_id}`, but is otherwise the
         * same as [VerifyService.get].
         */
        @MustBeClosed
        fun get(jobId: String): HttpResponseFor<VerifyGetResponse> =
            get(jobId, VerifyGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            params: VerifyGetParams = VerifyGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyGetResponse> =
            get(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            params: VerifyGetParams = VerifyGetParams.none(),
        ): HttpResponseFor<VerifyGetResponse> = get(jobId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: VerifyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: VerifyGetParams): HttpResponseFor<VerifyGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(jobId: String, requestOptions: RequestOptions): HttpResponseFor<VerifyGetResponse> =
            get(jobId, VerifyGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/alpha/verify/{job_id}/details`, but is
         * otherwise the same as [VerifyService.getDetails].
         */
        @MustBeClosed
        fun getDetails(jobId: String): HttpResponseFor<VerifyGetDetailsResponse> =
            getDetails(jobId, VerifyGetDetailsParams.none())

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(
            jobId: String,
            params: VerifyGetDetailsParams = VerifyGetDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyGetDetailsResponse> =
            getDetails(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(
            jobId: String,
            params: VerifyGetDetailsParams = VerifyGetDetailsParams.none(),
        ): HttpResponseFor<VerifyGetDetailsResponse> =
            getDetails(jobId, params, RequestOptions.none())

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(
            params: VerifyGetDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyGetDetailsResponse>

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(params: VerifyGetDetailsParams): HttpResponseFor<VerifyGetDetailsResponse> =
            getDetails(params, RequestOptions.none())

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyGetDetailsResponse> =
            getDetails(jobId, VerifyGetDetailsParams.none(), requestOptions)
    }
}
