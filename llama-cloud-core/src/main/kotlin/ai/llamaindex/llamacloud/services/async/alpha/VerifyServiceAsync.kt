// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.alpha

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
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyListPageAsync
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VerifyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyServiceAsync

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
    fun create(): CompletableFuture<VerifyCreateResponse> = create(VerifyCreateParams.none())

    /** @see create */
    fun create(
        params: VerifyCreateParams = VerifyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyCreateResponse>

    /** @see create */
    fun create(
        params: VerifyCreateParams = VerifyCreateParams.none()
    ): CompletableFuture<VerifyCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<VerifyCreateResponse> =
        create(VerifyCreateParams.none(), requestOptions)

    /**
     * List Verify jobs with optional filtering and pagination.
     *
     * Filter by `status`, specific `job_ids`, or creation date range.
     */
    fun list(): CompletableFuture<VerifyListPageAsync> = list(VerifyListParams.none())

    /** @see list */
    fun list(
        params: VerifyListParams = VerifyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyListPageAsync>

    /** @see list */
    fun list(
        params: VerifyListParams = VerifyListParams.none()
    ): CompletableFuture<VerifyListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VerifyListPageAsync> =
        list(VerifyListParams.none(), requestOptions)

    /**
     * Cancel a running Verify job.
     *
     * Stops processing and marks the job as CANCELLED. Returns the updated job. Jobs already in a
     * terminal state (COMPLETED, FAILED, CANCELLED) cannot be cancelled.
     */
    fun cancel(jobId: String): CompletableFuture<VerifyCancelResponse> =
        cancel(jobId, VerifyCancelParams.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: VerifyCancelParams = VerifyCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyCancelResponse> =
        cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        jobId: String,
        params: VerifyCancelParams = VerifyCancelParams.none(),
    ): CompletableFuture<VerifyCancelResponse> = cancel(jobId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: VerifyCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyCancelResponse>

    /** @see cancel */
    fun cancel(params: VerifyCancelParams): CompletableFuture<VerifyCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyCancelResponse> =
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
    fun get(jobId: String): CompletableFuture<VerifyGetResponse> =
        get(jobId, VerifyGetParams.none())

    /** @see get */
    fun get(
        jobId: String,
        params: VerifyGetParams = VerifyGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyGetResponse> =
        get(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see get */
    fun get(
        jobId: String,
        params: VerifyGetParams = VerifyGetParams.none(),
    ): CompletableFuture<VerifyGetResponse> = get(jobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: VerifyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyGetResponse>

    /** @see get */
    fun get(params: VerifyGetParams): CompletableFuture<VerifyGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(jobId: String, requestOptions: RequestOptions): CompletableFuture<VerifyGetResponse> =
        get(jobId, VerifyGetParams.none(), requestOptions)

    /**
     * Get the raw per-signal detail for a completed Verify job.
     *
     * Forensic drill-down behind the simplified result: the full evidence list, per-family
     * sub-scores, raw localized regions, and per-page forensic heatmap overlays (presigned image
     * URLs).
     */
    fun getDetails(jobId: String): CompletableFuture<VerifyGetDetailsResponse> =
        getDetails(jobId, VerifyGetDetailsParams.none())

    /** @see getDetails */
    fun getDetails(
        jobId: String,
        params: VerifyGetDetailsParams = VerifyGetDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyGetDetailsResponse> =
        getDetails(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see getDetails */
    fun getDetails(
        jobId: String,
        params: VerifyGetDetailsParams = VerifyGetDetailsParams.none(),
    ): CompletableFuture<VerifyGetDetailsResponse> =
        getDetails(jobId, params, RequestOptions.none())

    /** @see getDetails */
    fun getDetails(
        params: VerifyGetDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyGetDetailsResponse>

    /** @see getDetails */
    fun getDetails(params: VerifyGetDetailsParams): CompletableFuture<VerifyGetDetailsResponse> =
        getDetails(params, RequestOptions.none())

    /** @see getDetails */
    fun getDetails(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyGetDetailsResponse> =
        getDetails(jobId, VerifyGetDetailsParams.none(), requestOptions)

    /**
     * A view of [VerifyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/alpha/verify`, but is otherwise the same as
         * [VerifyServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<VerifyCreateResponse>> =
            create(VerifyCreateParams.none())

        /** @see create */
        fun create(
            params: VerifyCreateParams = VerifyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyCreateResponse>>

        /** @see create */
        fun create(
            params: VerifyCreateParams = VerifyCreateParams.none()
        ): CompletableFuture<HttpResponseFor<VerifyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VerifyCreateResponse>> =
            create(VerifyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/alpha/verify`, but is otherwise the same as
         * [VerifyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VerifyListPageAsync>> =
            list(VerifyListParams.none())

        /** @see list */
        fun list(
            params: VerifyListParams = VerifyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyListPageAsync>>

        /** @see list */
        fun list(
            params: VerifyListParams = VerifyListParams.none()
        ): CompletableFuture<HttpResponseFor<VerifyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VerifyListPageAsync>> =
            list(VerifyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/alpha/verify/{job_id}/cancel`, but is
         * otherwise the same as [VerifyServiceAsync.cancel].
         */
        fun cancel(jobId: String): CompletableFuture<HttpResponseFor<VerifyCancelResponse>> =
            cancel(jobId, VerifyCancelParams.none())

        /** @see cancel */
        fun cancel(
            jobId: String,
            params: VerifyCancelParams = VerifyCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyCancelResponse>> =
            cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            jobId: String,
            params: VerifyCancelParams = VerifyCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifyCancelResponse>> =
            cancel(jobId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: VerifyCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: VerifyCancelParams
        ): CompletableFuture<HttpResponseFor<VerifyCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyCancelResponse>> =
            cancel(jobId, VerifyCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/alpha/verify/{job_id}`, but is otherwise the
         * same as [VerifyServiceAsync.get].
         */
        fun get(jobId: String): CompletableFuture<HttpResponseFor<VerifyGetResponse>> =
            get(jobId, VerifyGetParams.none())

        /** @see get */
        fun get(
            jobId: String,
            params: VerifyGetParams = VerifyGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyGetResponse>> =
            get(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see get */
        fun get(
            jobId: String,
            params: VerifyGetParams = VerifyGetParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifyGetResponse>> =
            get(jobId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: VerifyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyGetResponse>>

        /** @see get */
        fun get(params: VerifyGetParams): CompletableFuture<HttpResponseFor<VerifyGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyGetResponse>> =
            get(jobId, VerifyGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/alpha/verify/{job_id}/details`, but is
         * otherwise the same as [VerifyServiceAsync.getDetails].
         */
        fun getDetails(
            jobId: String
        ): CompletableFuture<HttpResponseFor<VerifyGetDetailsResponse>> =
            getDetails(jobId, VerifyGetDetailsParams.none())

        /** @see getDetails */
        fun getDetails(
            jobId: String,
            params: VerifyGetDetailsParams = VerifyGetDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyGetDetailsResponse>> =
            getDetails(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see getDetails */
        fun getDetails(
            jobId: String,
            params: VerifyGetDetailsParams = VerifyGetDetailsParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifyGetDetailsResponse>> =
            getDetails(jobId, params, RequestOptions.none())

        /** @see getDetails */
        fun getDetails(
            params: VerifyGetDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyGetDetailsResponse>>

        /** @see getDetails */
        fun getDetails(
            params: VerifyGetDetailsParams
        ): CompletableFuture<HttpResponseFor<VerifyGetDetailsResponse>> =
            getDetails(params, RequestOptions.none())

        /** @see getDetails */
        fun getDetails(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyGetDetailsResponse>> =
            getDetails(jobId, VerifyGetDetailsParams.none(), requestOptions)
    }
}
