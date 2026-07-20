// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.pipelines.Pipeline
import ai.llamaindex.llamacloud.models.pipelines.sync.SyncCancelParams
import ai.llamaindex.llamacloud.models.pipelines.sync.SyncCreateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface SyncService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SyncService

    /**
     * Trigger an incremental sync for a managed pipeline.
     *
     * Processes new and updated documents from data sources and files, then updates the index for
     * retrieval.
     */
    @Deprecated("deprecated")
    fun create(pipelineId: String): Pipeline = create(pipelineId, SyncCreateParams.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        pipelineId: String,
        params: SyncCreateParams = SyncCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    @Deprecated("deprecated")
    fun create(pipelineId: String, params: SyncCreateParams = SyncCreateParams.none()): Pipeline =
        create(pipelineId, params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: SyncCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** @see create */
    @Deprecated("deprecated")
    fun create(params: SyncCreateParams): Pipeline = create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(pipelineId: String, requestOptions: RequestOptions): Pipeline =
        create(pipelineId, SyncCreateParams.none(), requestOptions)

    /** Cancel all running sync jobs for a pipeline. */
    @Deprecated("deprecated")
    fun cancel(pipelineId: String): Pipeline = cancel(pipelineId, SyncCancelParams.none())

    /** @see cancel */
    @Deprecated("deprecated")
    fun cancel(
        pipelineId: String,
        params: SyncCancelParams = SyncCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = cancel(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see cancel */
    @Deprecated("deprecated")
    fun cancel(pipelineId: String, params: SyncCancelParams = SyncCancelParams.none()): Pipeline =
        cancel(pipelineId, params, RequestOptions.none())

    /** @see cancel */
    @Deprecated("deprecated")
    fun cancel(
        params: SyncCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** @see cancel */
    @Deprecated("deprecated")
    fun cancel(params: SyncCancelParams): Pipeline = cancel(params, RequestOptions.none())

    /** @see cancel */
    @Deprecated("deprecated")
    fun cancel(pipelineId: String, requestOptions: RequestOptions): Pipeline =
        cancel(pipelineId, SyncCancelParams.none(), requestOptions)

    /** A view of [SyncService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SyncService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines/{pipeline_id}/sync`, but is
         * otherwise the same as [SyncService.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(pipelineId: String): HttpResponseFor<Pipeline> =
            create(pipelineId, SyncCreateParams.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: SyncCreateParams = SyncCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: SyncCreateParams = SyncCreateParams.none(),
        ): HttpResponseFor<Pipeline> = create(pipelineId, params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: SyncCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: SyncCreateParams): HttpResponseFor<Pipeline> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(pipelineId: String, requestOptions: RequestOptions): HttpResponseFor<Pipeline> =
            create(pipelineId, SyncCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines/{pipeline_id}/sync/cancel`, but
         * is otherwise the same as [SyncService.cancel].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun cancel(pipelineId: String): HttpResponseFor<Pipeline> =
            cancel(pipelineId, SyncCancelParams.none())

        /** @see cancel */
        @Deprecated("deprecated")
        @MustBeClosed
        fun cancel(
            pipelineId: String,
            params: SyncCancelParams = SyncCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            cancel(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see cancel */
        @Deprecated("deprecated")
        @MustBeClosed
        fun cancel(
            pipelineId: String,
            params: SyncCancelParams = SyncCancelParams.none(),
        ): HttpResponseFor<Pipeline> = cancel(pipelineId, params, RequestOptions.none())

        /** @see cancel */
        @Deprecated("deprecated")
        @MustBeClosed
        fun cancel(
            params: SyncCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /** @see cancel */
        @Deprecated("deprecated")
        @MustBeClosed
        fun cancel(params: SyncCancelParams): HttpResponseFor<Pipeline> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @Deprecated("deprecated")
        @MustBeClosed
        fun cancel(pipelineId: String, requestOptions: RequestOptions): HttpResponseFor<Pipeline> =
            cancel(pipelineId, SyncCancelParams.none(), requestOptions)
    }
}
