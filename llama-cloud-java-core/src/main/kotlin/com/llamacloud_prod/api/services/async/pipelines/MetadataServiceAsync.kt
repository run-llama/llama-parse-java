// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.pipelines

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.pipelines.metadata.MetadataCreateParams
import com.llamacloud_prod.api.models.pipelines.metadata.MetadataCreateResponse
import com.llamacloud_prod.api.models.pipelines.metadata.MetadataDeleteAllParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MetadataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetadataServiceAsync

    /** Import metadata for a pipeline. */
    fun create(
        pipelineId: String,
        params: MetadataCreateParams,
    ): CompletableFuture<MetadataCreateResponse> = create(pipelineId, params, RequestOptions.none())

    /** @see create */
    fun create(
        pipelineId: String,
        params: MetadataCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetadataCreateResponse> =
        create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    fun create(params: MetadataCreateParams): CompletableFuture<MetadataCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MetadataCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetadataCreateResponse>

    /** Delete metadata for all files in a pipeline. */
    fun deleteAll(pipelineId: String): CompletableFuture<Void?> =
        deleteAll(pipelineId, MetadataDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        pipelineId: String,
        params: MetadataDeleteAllParams = MetadataDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteAll(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        pipelineId: String,
        params: MetadataDeleteAllParams = MetadataDeleteAllParams.none(),
    ): CompletableFuture<Void?> = deleteAll(pipelineId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: MetadataDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteAll */
    fun deleteAll(params: MetadataDeleteAllParams): CompletableFuture<Void?> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(pipelineId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteAll(pipelineId, MetadataDeleteAllParams.none(), requestOptions)

    /**
     * A view of [MetadataServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetadataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/metadata`, but is
         * otherwise the same as [MetadataServiceAsync.create].
         */
        fun create(
            pipelineId: String,
            params: MetadataCreateParams,
        ): CompletableFuture<HttpResponseFor<MetadataCreateResponse>> =
            create(pipelineId, params, RequestOptions.none())

        /** @see create */
        fun create(
            pipelineId: String,
            params: MetadataCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetadataCreateResponse>> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        fun create(
            params: MetadataCreateParams
        ): CompletableFuture<HttpResponseFor<MetadataCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MetadataCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetadataCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/pipelines/{pipeline_id}/metadata`, but is
         * otherwise the same as [MetadataServiceAsync.deleteAll].
         */
        fun deleteAll(pipelineId: String): CompletableFuture<HttpResponse> =
            deleteAll(pipelineId, MetadataDeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            pipelineId: String,
            params: MetadataDeleteAllParams = MetadataDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteAll(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            pipelineId: String,
            params: MetadataDeleteAllParams = MetadataDeleteAllParams.none(),
        ): CompletableFuture<HttpResponse> = deleteAll(pipelineId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: MetadataDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteAll */
        fun deleteAll(params: MetadataDeleteAllParams): CompletableFuture<HttpResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteAll(pipelineId, MetadataDeleteAllParams.none(), requestOptions)
    }
}
