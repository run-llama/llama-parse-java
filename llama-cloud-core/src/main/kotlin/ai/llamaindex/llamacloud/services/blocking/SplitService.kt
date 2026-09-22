// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

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
import ai.llamaindex.llamacloud.models.split.SplitListPage
import ai.llamaindex.llamacloud.models.split.SplitListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface SplitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitService

    /** Create a document split job. */
    fun create(params: SplitCreateParams): SplitCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SplitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitCreateResponse

    /** List document split jobs. */
    fun list(): SplitListPage = list(SplitListParams.none())

    /** @see list */
    fun list(
        params: SplitListParams = SplitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitListPage

    /** @see list */
    fun list(params: SplitListParams = SplitListParams.none()): SplitListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SplitListPage =
        list(SplitListParams.none(), requestOptions)

    /** Delete a split job and its results. */
    fun delete(splitJobId: String): SplitDeleteResponse =
        delete(splitJobId, SplitDeleteParams.none())

    /** @see delete */
    fun delete(
        splitJobId: String,
        params: SplitDeleteParams = SplitDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitDeleteResponse =
        delete(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

    /** @see delete */
    fun delete(
        splitJobId: String,
        params: SplitDeleteParams = SplitDeleteParams.none(),
    ): SplitDeleteResponse = delete(splitJobId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SplitDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitDeleteResponse

    /** @see delete */
    fun delete(params: SplitDeleteParams): SplitDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(splitJobId: String, requestOptions: RequestOptions): SplitDeleteResponse =
        delete(splitJobId, SplitDeleteParams.none(), requestOptions)

    /**
     * Cancel a running split job.
     *
     * Requests cancellation; the job transitions to CANCELLED asynchronously once processing stops.
     * Returns the job, which may still be in its current non-terminal state. Jobs already in a
     * terminal state (COMPLETED, FAILED, CANCELLED) cannot be cancelled.
     */
    fun cancel(splitJobId: String): SplitCancelResponse =
        cancel(splitJobId, SplitCancelParams.none())

    /** @see cancel */
    fun cancel(
        splitJobId: String,
        params: SplitCancelParams = SplitCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitCancelResponse =
        cancel(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        splitJobId: String,
        params: SplitCancelParams = SplitCancelParams.none(),
    ): SplitCancelResponse = cancel(splitJobId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: SplitCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitCancelResponse

    /** @see cancel */
    fun cancel(params: SplitCancelParams): SplitCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(splitJobId: String, requestOptions: RequestOptions): SplitCancelResponse =
        cancel(splitJobId, SplitCancelParams.none(), requestOptions)

    /** Get a document split job. */
    fun get(splitJobId: String): SplitGetResponse = get(splitJobId, SplitGetParams.none())

    /** @see get */
    fun get(
        splitJobId: String,
        params: SplitGetParams = SplitGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitGetResponse = get(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

    /** @see get */
    fun get(splitJobId: String, params: SplitGetParams = SplitGetParams.none()): SplitGetResponse =
        get(splitJobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SplitGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitGetResponse

    /** @see get */
    fun get(params: SplitGetParams): SplitGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(splitJobId: String, requestOptions: RequestOptions): SplitGetResponse =
        get(splitJobId, SplitGetParams.none(), requestOptions)

    /** A view of [SplitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/split/jobs`, but is otherwise the same as
         * [SplitService.create].
         */
        @MustBeClosed
        fun create(params: SplitCreateParams): HttpResponseFor<SplitCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SplitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/split/jobs`, but is otherwise the same as
         * [SplitService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SplitListPage> = list(SplitListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SplitListParams = SplitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SplitListParams = SplitListParams.none()): HttpResponseFor<SplitListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SplitListPage> =
            list(SplitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/split/jobs/{split_job_id}`, but is
         * otherwise the same as [SplitService.delete].
         */
        @MustBeClosed
        fun delete(splitJobId: String): HttpResponseFor<SplitDeleteResponse> =
            delete(splitJobId, SplitDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            splitJobId: String,
            params: SplitDeleteParams = SplitDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitDeleteResponse> =
            delete(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            splitJobId: String,
            params: SplitDeleteParams = SplitDeleteParams.none(),
        ): HttpResponseFor<SplitDeleteResponse> = delete(splitJobId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SplitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: SplitDeleteParams): HttpResponseFor<SplitDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            splitJobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SplitDeleteResponse> =
            delete(splitJobId, SplitDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/split/jobs/{split_job_id}/cancel`, but is
         * otherwise the same as [SplitService.cancel].
         */
        @MustBeClosed
        fun cancel(splitJobId: String): HttpResponseFor<SplitCancelResponse> =
            cancel(splitJobId, SplitCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            splitJobId: String,
            params: SplitCancelParams = SplitCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitCancelResponse> =
            cancel(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            splitJobId: String,
            params: SplitCancelParams = SplitCancelParams.none(),
        ): HttpResponseFor<SplitCancelResponse> = cancel(splitJobId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: SplitCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: SplitCancelParams): HttpResponseFor<SplitCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            splitJobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SplitCancelResponse> =
            cancel(splitJobId, SplitCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/split/jobs/{split_job_id}`, but is otherwise
         * the same as [SplitService.get].
         */
        @MustBeClosed
        fun get(splitJobId: String): HttpResponseFor<SplitGetResponse> =
            get(splitJobId, SplitGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            splitJobId: String,
            params: SplitGetParams = SplitGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitGetResponse> =
            get(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            splitJobId: String,
            params: SplitGetParams = SplitGetParams.none(),
        ): HttpResponseFor<SplitGetResponse> = get(splitJobId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SplitGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SplitGetParams): HttpResponseFor<SplitGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            splitJobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SplitGetResponse> =
            get(splitJobId, SplitGetParams.none(), requestOptions)
    }
}
