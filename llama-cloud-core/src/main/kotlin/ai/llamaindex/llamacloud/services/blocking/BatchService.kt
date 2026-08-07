// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.batches.BatchCancelParams
import ai.llamaindex.llamacloud.models.batches.BatchCancelResponse
import ai.llamaindex.llamacloud.models.batches.BatchCreateParams
import ai.llamaindex.llamacloud.models.batches.BatchCreateResponse
import ai.llamaindex.llamacloud.models.batches.BatchGetParams
import ai.llamaindex.llamacloud.models.batches.BatchGetResponse
import ai.llamaindex.llamacloud.models.batches.BatchListPage
import ai.llamaindex.llamacloud.models.batches.BatchListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /**
     * Create a batch over a source directory and start processing asynchronously.
     *
     * To be notified as the batch progresses, pass `webhook_configurations` with inline endpoints
     * and/or `webhook_configuration_ids` referencing saved configurations. Batches emit
     * `batch.pending` on create, `batch.running` once processing starts, and a terminal
     * `batch.success` or `batch.error`.
     *
     * `batch.success` means the batch finished mapping every source file to a job — individual
     * files may still have failed, so read `results` (with `expand=results`) for per-file outcomes.
     *
     * Delivery order across events is not guaranteed; key on the `status` field in the payload
     * rather than arrival order.
     */
    fun create(params: BatchCreateParams): BatchCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCreateResponse

    /** List batches for the current project. */
    fun list(): BatchListPage = list(BatchListParams.none())

    /** @see list */
    fun list(
        params: BatchListParams = BatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchListPage

    /** @see list */
    fun list(params: BatchListParams = BatchListParams.none()): BatchListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BatchListPage =
        list(BatchListParams.none(), requestOptions)

    /**
     * Cancel a running batch.
     *
     * Returns immediately; the batch reaches `CANCELLED` once processing stops. Files that already
     * finished keep their results. A batch in a terminal status cannot be cancelled.
     */
    fun cancel(batchId: String): BatchCancelResponse = cancel(batchId, BatchCancelParams.none())

    /** @see cancel */
    fun cancel(
        batchId: String,
        params: BatchCancelParams = BatchCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCancelResponse = cancel(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        batchId: String,
        params: BatchCancelParams = BatchCancelParams.none(),
    ): BatchCancelResponse = cancel(batchId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: BatchCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCancelResponse

    /** @see cancel */
    fun cancel(params: BatchCancelParams): BatchCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(batchId: String, requestOptions: RequestOptions): BatchCancelResponse =
        cancel(batchId, BatchCancelParams.none(), requestOptions)

    /** Get a batch by ID. */
    fun get(batchId: String): BatchGetResponse = get(batchId, BatchGetParams.none())

    /** @see get */
    fun get(
        batchId: String,
        params: BatchGetParams = BatchGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchGetResponse = get(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see get */
    fun get(batchId: String, params: BatchGetParams = BatchGetParams.none()): BatchGetResponse =
        get(batchId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchGetResponse

    /** @see get */
    fun get(params: BatchGetParams): BatchGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(batchId: String, requestOptions: RequestOptions): BatchGetResponse =
        get(batchId, BatchGetParams.none(), requestOptions)

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/batches`, but is otherwise the same as
         * [BatchService.create].
         */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v2/batches`, but is otherwise the same as
         * [BatchService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BatchListPage> = list(BatchListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BatchListParams = BatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: BatchListParams = BatchListParams.none()): HttpResponseFor<BatchListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BatchListPage> =
            list(BatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/batches/{batch_id}/cancel`, but is
         * otherwise the same as [BatchService.cancel].
         */
        @MustBeClosed
        fun cancel(batchId: String): HttpResponseFor<BatchCancelResponse> =
            cancel(batchId, BatchCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            batchId: String,
            params: BatchCancelParams = BatchCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCancelResponse> =
            cancel(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            batchId: String,
            params: BatchCancelParams = BatchCancelParams.none(),
        ): HttpResponseFor<BatchCancelResponse> = cancel(batchId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: BatchCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: BatchCancelParams): HttpResponseFor<BatchCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            batchId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCancelResponse> =
            cancel(batchId, BatchCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/batches/{batch_id}`, but is otherwise the
         * same as [BatchService.get].
         */
        @MustBeClosed
        fun get(batchId: String): HttpResponseFor<BatchGetResponse> =
            get(batchId, BatchGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            batchId: String,
            params: BatchGetParams = BatchGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchGetResponse> =
            get(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            batchId: String,
            params: BatchGetParams = BatchGetParams.none(),
        ): HttpResponseFor<BatchGetResponse> = get(batchId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: BatchGetParams): HttpResponseFor<BatchGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            batchId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchGetResponse> = get(batchId, BatchGetParams.none(), requestOptions)
    }
}
