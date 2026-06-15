// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.pipelines.ManagedIngestionStatusResponse
import com.llamacloud_prod.api.models.pipelines.Pipeline
import com.llamacloud_prod.api.models.pipelines.PipelineCreate
import com.llamacloud_prod.api.models.pipelines.PipelineCreateParams
import com.llamacloud_prod.api.models.pipelines.PipelineDeleteParams
import com.llamacloud_prod.api.models.pipelines.PipelineGetParams
import com.llamacloud_prod.api.models.pipelines.PipelineGetStatusParams
import com.llamacloud_prod.api.models.pipelines.PipelineListParams
import com.llamacloud_prod.api.models.pipelines.PipelineRetrieveParams
import com.llamacloud_prod.api.models.pipelines.PipelineRetrieveResponse
import com.llamacloud_prod.api.models.pipelines.PipelineUpdateParams
import com.llamacloud_prod.api.models.pipelines.PipelineUpsertParams
import com.llamacloud_prod.api.services.blocking.pipelines.DataSourceService
import com.llamacloud_prod.api.services.blocking.pipelines.DocumentService
import com.llamacloud_prod.api.services.blocking.pipelines.FileService
import com.llamacloud_prod.api.services.blocking.pipelines.ImageService
import com.llamacloud_prod.api.services.blocking.pipelines.MetadataService
import com.llamacloud_prod.api.services.blocking.pipelines.SyncService
import java.util.function.Consumer

interface PipelineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineService

    fun sync(): SyncService

    fun dataSources(): DataSourceService

    fun images(): ImageService

    fun files(): FileService

    fun metadata(): MetadataService

    fun documents(): DocumentService

    /**
     * Create a new managed ingestion pipeline.
     *
     * A pipeline connects data sources to a vector store for RAG. After creation, call `POST
     * /pipelines/{id}/sync` to start ingesting documents.
     */
    fun create(params: PipelineCreateParams): Pipeline = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** @see create */
    fun create(
        pipelineCreate: PipelineCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline =
        create(
            PipelineCreateParams.builder().pipelineCreate(pipelineCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(pipelineCreate: PipelineCreate): Pipeline =
        create(pipelineCreate, RequestOptions.none())

    /**
     * Run a retrieval query against a managed pipeline.
     *
     * Searches the pipeline's vector store using the provided query and retrieval parameters.
     * Supports dense, sparse, and hybrid search modes with configurable top-k and reranking.
     */
    fun retrieve(pipelineId: String, params: PipelineRetrieveParams): PipelineRetrieveResponse =
        retrieve(pipelineId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        pipelineId: String,
        params: PipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineRetrieveResponse =
        retrieve(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: PipelineRetrieveParams): PipelineRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineRetrieveResponse

    /** Update an existing pipeline's configuration. */
    fun update(pipelineId: String): Pipeline = update(pipelineId, PipelineUpdateParams.none())

    /** @see update */
    fun update(
        pipelineId: String,
        params: PipelineUpdateParams = PipelineUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see update */
    fun update(
        pipelineId: String,
        params: PipelineUpdateParams = PipelineUpdateParams.none(),
    ): Pipeline = update(pipelineId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** @see update */
    fun update(params: PipelineUpdateParams): Pipeline = update(params, RequestOptions.none())

    /** @see update */
    fun update(pipelineId: String, requestOptions: RequestOptions): Pipeline =
        update(pipelineId, PipelineUpdateParams.none(), requestOptions)

    /** Search for pipelines by name, type, or project. */
    fun list(): List<Pipeline> = list(PipelineListParams.none())

    /** @see list */
    fun list(
        params: PipelineListParams = PipelineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Pipeline>

    /** @see list */
    fun list(params: PipelineListParams = PipelineListParams.none()): List<Pipeline> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Pipeline> =
        list(PipelineListParams.none(), requestOptions)

    /**
     * Delete a pipeline and all associated resources.
     *
     * Removes pipeline files, data sources, and vector store data. This operation is irreversible.
     */
    fun delete(pipelineId: String) = delete(pipelineId, PipelineDeleteParams.none())

    /** @see delete */
    fun delete(
        pipelineId: String,
        params: PipelineDeleteParams = PipelineDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see delete */
    fun delete(pipelineId: String, params: PipelineDeleteParams = PipelineDeleteParams.none()) =
        delete(pipelineId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: PipelineDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: PipelineDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(pipelineId: String, requestOptions: RequestOptions) =
        delete(pipelineId, PipelineDeleteParams.none(), requestOptions)

    /** Get a pipeline by ID. */
    fun get(pipelineId: String): Pipeline = get(pipelineId, PipelineGetParams.none())

    /** @see get */
    fun get(
        pipelineId: String,
        params: PipelineGetParams = PipelineGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see get */
    fun get(pipelineId: String, params: PipelineGetParams = PipelineGetParams.none()): Pipeline =
        get(pipelineId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** @see get */
    fun get(params: PipelineGetParams): Pipeline = get(params, RequestOptions.none())

    /** @see get */
    fun get(pipelineId: String, requestOptions: RequestOptions): Pipeline =
        get(pipelineId, PipelineGetParams.none(), requestOptions)

    /**
     * Get the ingestion status of a managed pipeline.
     *
     * Returns document counts, sync progress, and the last effective timestamp. Only available for
     * managed pipelines.
     */
    fun getStatus(pipelineId: String): ManagedIngestionStatusResponse =
        getStatus(pipelineId, PipelineGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        pipelineId: String,
        params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse =
        getStatus(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        pipelineId: String,
        params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
    ): ManagedIngestionStatusResponse = getStatus(pipelineId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: PipelineGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse

    /** @see getStatus */
    fun getStatus(params: PipelineGetStatusParams): ManagedIngestionStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        pipelineId: String,
        requestOptions: RequestOptions,
    ): ManagedIngestionStatusResponse =
        getStatus(pipelineId, PipelineGetStatusParams.none(), requestOptions)

    /**
     * Upsert a pipeline.
     *
     * Updates the pipeline if one with the same name and project already exists, otherwise creates
     * a new one.
     */
    fun upsert(params: PipelineUpsertParams): Pipeline = upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: PipelineUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** @see upsert */
    fun upsert(
        pipelineCreate: PipelineCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline =
        upsert(
            PipelineUpsertParams.builder().pipelineCreate(pipelineCreate).build(),
            requestOptions,
        )

    /** @see upsert */
    fun upsert(pipelineCreate: PipelineCreate): Pipeline =
        upsert(pipelineCreate, RequestOptions.none())

    /** A view of [PipelineService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineService.WithRawResponse

        fun sync(): SyncService.WithRawResponse

        fun dataSources(): DataSourceService.WithRawResponse

        fun images(): ImageService.WithRawResponse

        fun files(): FileService.WithRawResponse

        fun metadata(): MetadataService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines`, but is otherwise the same as
         * [PipelineService.create].
         */
        @MustBeClosed
        fun create(params: PipelineCreateParams): HttpResponseFor<Pipeline> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /** @see create */
        @MustBeClosed
        fun create(
            pipelineCreate: PipelineCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            create(
                PipelineCreateParams.builder().pipelineCreate(pipelineCreate).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(pipelineCreate: PipelineCreate): HttpResponseFor<Pipeline> =
            create(pipelineCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines/{pipeline_id}/retrieve`, but is
         * otherwise the same as [PipelineService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            pipelineId: String,
            params: PipelineRetrieveParams,
        ): HttpResponseFor<PipelineRetrieveResponse> =
            retrieve(pipelineId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            pipelineId: String,
            params: PipelineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineRetrieveResponse> =
            retrieve(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PipelineRetrieveParams): HttpResponseFor<PipelineRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PipelineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}`, but is otherwise
         * the same as [PipelineService.update].
         */
        @MustBeClosed
        fun update(pipelineId: String): HttpResponseFor<Pipeline> =
            update(pipelineId, PipelineUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams = PipelineUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams = PipelineUpdateParams.none(),
        ): HttpResponseFor<Pipeline> = update(pipelineId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /** @see update */
        @MustBeClosed
        fun update(params: PipelineUpdateParams): HttpResponseFor<Pipeline> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(pipelineId: String, requestOptions: RequestOptions): HttpResponseFor<Pipeline> =
            update(pipelineId, PipelineUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines`, but is otherwise the same as
         * [PipelineService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<List<Pipeline>> = list(PipelineListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PipelineListParams = PipelineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Pipeline>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PipelineListParams = PipelineListParams.none()
        ): HttpResponseFor<List<Pipeline>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Pipeline>> =
            list(PipelineListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/pipelines/{pipeline_id}`, but is
         * otherwise the same as [PipelineService.delete].
         */
        @MustBeClosed
        fun delete(pipelineId: String): HttpResponse =
            delete(pipelineId, PipelineDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams = PipelineDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams = PipelineDeleteParams.none(),
        ): HttpResponse = delete(pipelineId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PipelineDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(pipelineId: String, requestOptions: RequestOptions): HttpResponse =
            delete(pipelineId, PipelineDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines/{pipeline_id}`, but is otherwise
         * the same as [PipelineService.get].
         */
        @MustBeClosed
        fun get(pipelineId: String): HttpResponseFor<Pipeline> =
            get(pipelineId, PipelineGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            pipelineId: String,
            params: PipelineGetParams = PipelineGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            pipelineId: String,
            params: PipelineGetParams = PipelineGetParams.none(),
        ): HttpResponseFor<Pipeline> = get(pipelineId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /** @see get */
        @MustBeClosed
        fun get(params: PipelineGetParams): HttpResponseFor<Pipeline> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(pipelineId: String, requestOptions: RequestOptions): HttpResponseFor<Pipeline> =
            get(pipelineId, PipelineGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines/{pipeline_id}/status`, but is
         * otherwise the same as [PipelineService.getStatus].
         */
        @MustBeClosed
        fun getStatus(pipelineId: String): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(pipelineId, PipelineGetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            pipelineId: String,
            params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            pipelineId: String,
            params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(pipelineId, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: PipelineGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse>

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: PipelineGetStatusParams
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(pipelineId, PipelineGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines`, but is otherwise the same as
         * [PipelineService.upsert].
         */
        @MustBeClosed
        fun upsert(params: PipelineUpsertParams): HttpResponseFor<Pipeline> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: PipelineUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            pipelineCreate: PipelineCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            upsert(
                PipelineUpsertParams.builder().pipelineCreate(pipelineCreate).build(),
                requestOptions,
            )

        /** @see upsert */
        @MustBeClosed
        fun upsert(pipelineCreate: PipelineCreate): HttpResponseFor<Pipeline> =
            upsert(pipelineCreate, RequestOptions.none())
    }
}
