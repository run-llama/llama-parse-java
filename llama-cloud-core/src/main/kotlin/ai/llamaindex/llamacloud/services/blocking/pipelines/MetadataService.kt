// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.pipelines.metadata.MetadataCreateParams
import ai.llamaindex.llamacloud.models.pipelines.metadata.MetadataCreateResponse
import ai.llamaindex.llamacloud.models.pipelines.metadata.MetadataDeleteAllParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface MetadataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetadataService

    /** Import metadata for a pipeline. */
    @Deprecated("deprecated")
    fun create(pipelineId: String, params: MetadataCreateParams): MetadataCreateResponse =
        create(pipelineId, params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        pipelineId: String,
        params: MetadataCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetadataCreateResponse =
        create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    @Deprecated("deprecated")
    fun create(params: MetadataCreateParams): MetadataCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: MetadataCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetadataCreateResponse

    /** Delete metadata for all files in a pipeline. */
    @Deprecated("deprecated")
    fun deleteAll(pipelineId: String) = deleteAll(pipelineId, MetadataDeleteAllParams.none())

    /** @see deleteAll */
    @Deprecated("deprecated")
    fun deleteAll(
        pipelineId: String,
        params: MetadataDeleteAllParams = MetadataDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteAll(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see deleteAll */
    @Deprecated("deprecated")
    fun deleteAll(
        pipelineId: String,
        params: MetadataDeleteAllParams = MetadataDeleteAllParams.none(),
    ) = deleteAll(pipelineId, params, RequestOptions.none())

    /** @see deleteAll */
    @Deprecated("deprecated")
    fun deleteAll(
        params: MetadataDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteAll */
    @Deprecated("deprecated")
    fun deleteAll(params: MetadataDeleteAllParams) = deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    @Deprecated("deprecated")
    fun deleteAll(pipelineId: String, requestOptions: RequestOptions) =
        deleteAll(pipelineId, MetadataDeleteAllParams.none(), requestOptions)

    /** A view of [MetadataService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetadataService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/metadata`, but is
         * otherwise the same as [MetadataService.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: MetadataCreateParams,
        ): HttpResponseFor<MetadataCreateResponse> =
            create(pipelineId, params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: MetadataCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetadataCreateResponse> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: MetadataCreateParams): HttpResponseFor<MetadataCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: MetadataCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetadataCreateResponse>

        /**
         * Returns a raw HTTP response for `delete /api/v1/pipelines/{pipeline_id}/metadata`, but is
         * otherwise the same as [MetadataService.deleteAll].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun deleteAll(pipelineId: String): HttpResponse =
            deleteAll(pipelineId, MetadataDeleteAllParams.none())

        /** @see deleteAll */
        @Deprecated("deprecated")
        @MustBeClosed
        fun deleteAll(
            pipelineId: String,
            params: MetadataDeleteAllParams = MetadataDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteAll(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see deleteAll */
        @Deprecated("deprecated")
        @MustBeClosed
        fun deleteAll(
            pipelineId: String,
            params: MetadataDeleteAllParams = MetadataDeleteAllParams.none(),
        ): HttpResponse = deleteAll(pipelineId, params, RequestOptions.none())

        /** @see deleteAll */
        @Deprecated("deprecated")
        @MustBeClosed
        fun deleteAll(
            params: MetadataDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteAll */
        @Deprecated("deprecated")
        @MustBeClosed
        fun deleteAll(params: MetadataDeleteAllParams): HttpResponse =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @Deprecated("deprecated")
        @MustBeClosed
        fun deleteAll(pipelineId: String, requestOptions: RequestOptions): HttpResponse =
            deleteAll(pipelineId, MetadataDeleteAllParams.none(), requestOptions)
    }
}
