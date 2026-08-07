// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.split.SplitCancelParams
import ai.llamaindex.llamacloud.models.split.SplitCancelResponse
import ai.llamaindex.llamacloud.models.split.SplitCreateParams
import ai.llamaindex.llamacloud.models.split.SplitCreateResponse
import ai.llamaindex.llamacloud.models.split.SplitDeleteParams
import ai.llamaindex.llamacloud.models.split.SplitDeleteResponse
import ai.llamaindex.llamacloud.models.split.SplitGetParams
import ai.llamaindex.llamacloud.models.split.SplitGetResponse
import ai.llamaindex.llamacloud.models.split.SplitListPageAsync
import ai.llamaindex.llamacloud.models.split.SplitListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SplitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitServiceAsync

    /** Create a document split job. */
    fun create(params: SplitCreateParams): CompletableFuture<SplitCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SplitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitCreateResponse>

    /** List document split jobs. */
    fun list(): CompletableFuture<SplitListPageAsync> = list(SplitListParams.none())

    /** @see list */
    fun list(
        params: SplitListParams = SplitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitListPageAsync>

    /** @see list */
    fun list(
        params: SplitListParams = SplitListParams.none()
    ): CompletableFuture<SplitListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SplitListPageAsync> =
        list(SplitListParams.none(), requestOptions)

    /** Delete a split job and its results. */
    fun delete(splitJobId: String): CompletableFuture<SplitDeleteResponse> =
        delete(splitJobId, SplitDeleteParams.none())

    /** @see delete */
    fun delete(
        splitJobId: String,
        params: SplitDeleteParams = SplitDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitDeleteResponse> =
        delete(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

    /** @see delete */
    fun delete(
        splitJobId: String,
        params: SplitDeleteParams = SplitDeleteParams.none(),
    ): CompletableFuture<SplitDeleteResponse> = delete(splitJobId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SplitDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitDeleteResponse>

    /** @see delete */
    fun delete(params: SplitDeleteParams): CompletableFuture<SplitDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        splitJobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SplitDeleteResponse> =
        delete(splitJobId, SplitDeleteParams.none(), requestOptions)

    /**
     * Cancel a running split job.
     *
     * Requests cancellation; the job transitions to CANCELLED asynchronously once processing stops.
     * Returns the job, which may still be in its current non-terminal state. Jobs already in a
     * terminal state (COMPLETED, FAILED, CANCELLED) cannot be cancelled.
     */
    fun cancel(splitJobId: String): CompletableFuture<SplitCancelResponse> =
        cancel(splitJobId, SplitCancelParams.none())

    /** @see cancel */
    fun cancel(
        splitJobId: String,
        params: SplitCancelParams = SplitCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitCancelResponse> =
        cancel(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        splitJobId: String,
        params: SplitCancelParams = SplitCancelParams.none(),
    ): CompletableFuture<SplitCancelResponse> = cancel(splitJobId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: SplitCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitCancelResponse>

    /** @see cancel */
    fun cancel(params: SplitCancelParams): CompletableFuture<SplitCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        splitJobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SplitCancelResponse> =
        cancel(splitJobId, SplitCancelParams.none(), requestOptions)

    /** Get a document split job. */
    fun get(splitJobId: String): CompletableFuture<SplitGetResponse> =
        get(splitJobId, SplitGetParams.none())

    /** @see get */
    fun get(
        splitJobId: String,
        params: SplitGetParams = SplitGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitGetResponse> =
        get(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

    /** @see get */
    fun get(
        splitJobId: String,
        params: SplitGetParams = SplitGetParams.none(),
    ): CompletableFuture<SplitGetResponse> = get(splitJobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SplitGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitGetResponse>

    /** @see get */
    fun get(params: SplitGetParams): CompletableFuture<SplitGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        splitJobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SplitGetResponse> = get(splitJobId, SplitGetParams.none(), requestOptions)

    /** A view of [SplitServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SplitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/split/jobs`, but is otherwise the same as
         * [SplitServiceAsync.create].
         */
        fun create(
            params: SplitCreateParams
        ): CompletableFuture<HttpResponseFor<SplitCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SplitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/split/jobs`, but is otherwise the same as
         * [SplitServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SplitListPageAsync>> =
            list(SplitListParams.none())

        /** @see list */
        fun list(
            params: SplitListParams = SplitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitListPageAsync>>

        /** @see list */
        fun list(
            params: SplitListParams = SplitListParams.none()
        ): CompletableFuture<HttpResponseFor<SplitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SplitListPageAsync>> =
            list(SplitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/split/jobs/{split_job_id}`, but is
         * otherwise the same as [SplitServiceAsync.delete].
         */
        fun delete(splitJobId: String): CompletableFuture<HttpResponseFor<SplitDeleteResponse>> =
            delete(splitJobId, SplitDeleteParams.none())

        /** @see delete */
        fun delete(
            splitJobId: String,
            params: SplitDeleteParams = SplitDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitDeleteResponse>> =
            delete(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

        /** @see delete */
        fun delete(
            splitJobId: String,
            params: SplitDeleteParams = SplitDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SplitDeleteResponse>> =
            delete(splitJobId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SplitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitDeleteResponse>>

        /** @see delete */
        fun delete(
            params: SplitDeleteParams
        ): CompletableFuture<HttpResponseFor<SplitDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            splitJobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SplitDeleteResponse>> =
            delete(splitJobId, SplitDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/split/jobs/{split_job_id}/cancel`, but is
         * otherwise the same as [SplitServiceAsync.cancel].
         */
        fun cancel(splitJobId: String): CompletableFuture<HttpResponseFor<SplitCancelResponse>> =
            cancel(splitJobId, SplitCancelParams.none())

        /** @see cancel */
        fun cancel(
            splitJobId: String,
            params: SplitCancelParams = SplitCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitCancelResponse>> =
            cancel(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            splitJobId: String,
            params: SplitCancelParams = SplitCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<SplitCancelResponse>> =
            cancel(splitJobId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: SplitCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: SplitCancelParams
        ): CompletableFuture<HttpResponseFor<SplitCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            splitJobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SplitCancelResponse>> =
            cancel(splitJobId, SplitCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/split/jobs/{split_job_id}`, but is otherwise
         * the same as [SplitServiceAsync.get].
         */
        fun get(splitJobId: String): CompletableFuture<HttpResponseFor<SplitGetResponse>> =
            get(splitJobId, SplitGetParams.none())

        /** @see get */
        fun get(
            splitJobId: String,
            params: SplitGetParams = SplitGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitGetResponse>> =
            get(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

        /** @see get */
        fun get(
            splitJobId: String,
            params: SplitGetParams = SplitGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SplitGetResponse>> =
            get(splitJobId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SplitGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitGetResponse>>

        /** @see get */
        fun get(params: SplitGetParams): CompletableFuture<HttpResponseFor<SplitGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            splitJobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SplitGetResponse>> =
            get(splitJobId, SplitGetParams.none(), requestOptions)
    }
}
