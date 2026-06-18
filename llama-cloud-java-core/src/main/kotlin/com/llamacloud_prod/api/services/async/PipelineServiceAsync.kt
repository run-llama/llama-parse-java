// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

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
import com.llamacloud_prod.api.services.async.pipelines.DataSourceServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.DocumentServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.FileServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.ImageServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.MetadataServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.SyncServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PipelineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineServiceAsync

    fun sync(): SyncServiceAsync

    fun dataSources(): DataSourceServiceAsync

    fun images(): ImageServiceAsync

    fun files(): FileServiceAsync

    fun metadata(): MetadataServiceAsync

    fun documents(): DocumentServiceAsync

    /**
     * Create a new managed ingestion pipeline.
     *
     * A pipeline connects data sources to a vector store for RAG. After creation, call `POST
     * /pipelines/{id}/sync` to start ingesting documents.
     */
    @Deprecated("deprecated")
    fun create(params: PipelineCreateParams): CompletableFuture<Pipeline> =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        pipelineCreate: PipelineCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        create(
            PipelineCreateParams.builder().pipelineCreate(pipelineCreate).build(),
            requestOptions,
        )

    /** @see create */
    @Deprecated("deprecated")
    fun create(pipelineCreate: PipelineCreate): CompletableFuture<Pipeline> =
        create(pipelineCreate, RequestOptions.none())

    /**
     * Run a retrieval query against a managed pipeline.
     *
     * Searches the pipeline's vector store using the provided query and retrieval parameters.
     * Supports dense, sparse, and hybrid search modes with configurable top-k and reranking.
     */
    @Deprecated("deprecated")
    fun retrieve(
        pipelineId: String,
        params: PipelineRetrieveParams,
    ): CompletableFuture<PipelineRetrieveResponse> =
        retrieve(pipelineId, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        pipelineId: String,
        params: PipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineRetrieveResponse> =
        retrieve(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(params: PipelineRetrieveParams): CompletableFuture<PipelineRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: PipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineRetrieveResponse>

    /** Update an existing pipeline's configuration. */
    @Deprecated("deprecated")
    fun update(pipelineId: String): CompletableFuture<Pipeline> =
        update(pipelineId, PipelineUpdateParams.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        pipelineId: String,
        params: PipelineUpdateParams = PipelineUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        pipelineId: String,
        params: PipelineUpdateParams = PipelineUpdateParams.none(),
    ): CompletableFuture<Pipeline> = update(pipelineId, params, RequestOptions.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /** @see update */
    @Deprecated("deprecated")
    fun update(params: PipelineUpdateParams): CompletableFuture<Pipeline> =
        update(params, RequestOptions.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(pipelineId: String, requestOptions: RequestOptions): CompletableFuture<Pipeline> =
        update(pipelineId, PipelineUpdateParams.none(), requestOptions)

    /** Search for pipelines by name, type, or project. */
    @Deprecated("deprecated")
    fun list(): CompletableFuture<List<Pipeline>> = list(PipelineListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: PipelineListParams = PipelineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Pipeline>>

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: PipelineListParams = PipelineListParams.none()
    ): CompletableFuture<List<Pipeline>> = list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(requestOptions: RequestOptions): CompletableFuture<List<Pipeline>> =
        list(PipelineListParams.none(), requestOptions)

    /**
     * Delete a pipeline and all associated resources.
     *
     * Removes pipeline files, data sources, and vector store data. This operation is irreversible.
     */
    @Deprecated("deprecated")
    fun delete(pipelineId: String): CompletableFuture<Void?> =
        delete(pipelineId, PipelineDeleteParams.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        pipelineId: String,
        params: PipelineDeleteParams = PipelineDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        pipelineId: String,
        params: PipelineDeleteParams = PipelineDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(pipelineId, params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        params: PipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: PipelineDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(pipelineId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(pipelineId, PipelineDeleteParams.none(), requestOptions)

    /** Get a pipeline by ID. */
    @Deprecated("deprecated")
    fun get(pipelineId: String): CompletableFuture<Pipeline> =
        get(pipelineId, PipelineGetParams.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        pipelineId: String,
        params: PipelineGetParams = PipelineGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        pipelineId: String,
        params: PipelineGetParams = PipelineGetParams.none(),
    ): CompletableFuture<Pipeline> = get(pipelineId, params, RequestOptions.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /** @see get */
    @Deprecated("deprecated")
    fun get(params: PipelineGetParams): CompletableFuture<Pipeline> =
        get(params, RequestOptions.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(pipelineId: String, requestOptions: RequestOptions): CompletableFuture<Pipeline> =
        get(pipelineId, PipelineGetParams.none(), requestOptions)

    /**
     * Get the ingestion status of a managed pipeline.
     *
     * Returns document counts, sync progress, and the last effective timestamp. Only available for
     * managed pipelines.
     */
    @Deprecated("deprecated")
    fun getStatus(pipelineId: String): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(pipelineId, PipelineGetStatusParams.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        pipelineId: String,
        params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        pipelineId: String,
        params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(pipelineId, params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        params: PipelineGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedIngestionStatusResponse>

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        params: PipelineGetStatusParams
    ): CompletableFuture<ManagedIngestionStatusResponse> = getStatus(params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        pipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(pipelineId, PipelineGetStatusParams.none(), requestOptions)

    /**
     * Upsert a pipeline.
     *
     * Updates the pipeline if one with the same name and project already exists, otherwise creates
     * a new one.
     */
    @Deprecated("deprecated")
    fun upsert(params: PipelineUpsertParams): CompletableFuture<Pipeline> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    @Deprecated("deprecated")
    fun upsert(
        params: PipelineUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /** @see upsert */
    @Deprecated("deprecated")
    fun upsert(
        pipelineCreate: PipelineCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        upsert(
            PipelineUpsertParams.builder().pipelineCreate(pipelineCreate).build(),
            requestOptions,
        )

    /** @see upsert */
    @Deprecated("deprecated")
    fun upsert(pipelineCreate: PipelineCreate): CompletableFuture<Pipeline> =
        upsert(pipelineCreate, RequestOptions.none())

    /**
     * A view of [PipelineServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PipelineServiceAsync.WithRawResponse

        fun sync(): SyncServiceAsync.WithRawResponse

        fun dataSources(): DataSourceServiceAsync.WithRawResponse

        fun images(): ImageServiceAsync.WithRawResponse

        fun files(): FileServiceAsync.WithRawResponse

        fun metadata(): MetadataServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines`, but is otherwise the same as
         * [PipelineServiceAsync.create].
         */
        @Deprecated("deprecated")
        fun create(params: PipelineCreateParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            pipelineCreate: PipelineCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(
                PipelineCreateParams.builder().pipelineCreate(pipelineCreate).build(),
                requestOptions,
            )

        /** @see create */
        @Deprecated("deprecated")
        fun create(pipelineCreate: PipelineCreate): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(pipelineCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines/{pipeline_id}/retrieve`, but is
         * otherwise the same as [PipelineServiceAsync.retrieve].
         */
        @Deprecated("deprecated")
        fun retrieve(
            pipelineId: String,
            params: PipelineRetrieveParams,
        ): CompletableFuture<HttpResponseFor<PipelineRetrieveResponse>> =
            retrieve(pipelineId, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            pipelineId: String,
            params: PipelineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineRetrieveResponse>> =
            retrieve(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: PipelineRetrieveParams
        ): CompletableFuture<HttpResponseFor<PipelineRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: PipelineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}`, but is otherwise
         * the same as [PipelineServiceAsync.update].
         */
        @Deprecated("deprecated")
        fun update(pipelineId: String): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(pipelineId, PipelineUpdateParams.none())

        /** @see update */
        @Deprecated("deprecated")
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams = PipelineUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see update */
        @Deprecated("deprecated")
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams = PipelineUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(pipelineId, params, RequestOptions.none())

        /** @see update */
        @Deprecated("deprecated")
        fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /** @see update */
        @Deprecated("deprecated")
        fun update(params: PipelineUpdateParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(params, RequestOptions.none())

        /** @see update */
        @Deprecated("deprecated")
        fun update(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(pipelineId, PipelineUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines`, but is otherwise the same as
         * [PipelineServiceAsync.list].
         */
        @Deprecated("deprecated")
        fun list(): CompletableFuture<HttpResponseFor<List<Pipeline>>> =
            list(PipelineListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            params: PipelineListParams = PipelineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Pipeline>>>

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            params: PipelineListParams = PipelineListParams.none()
        ): CompletableFuture<HttpResponseFor<List<Pipeline>>> = list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Pipeline>>> =
            list(PipelineListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/pipelines/{pipeline_id}`, but is
         * otherwise the same as [PipelineServiceAsync.delete].
         */
        @Deprecated("deprecated")
        fun delete(pipelineId: String): CompletableFuture<HttpResponse> =
            delete(pipelineId, PipelineDeleteParams.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams = PipelineDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams = PipelineDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(pipelineId, params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(params: PipelineDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(pipelineId, PipelineDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines/{pipeline_id}`, but is otherwise
         * the same as [PipelineServiceAsync.get].
         */
        @Deprecated("deprecated")
        fun get(pipelineId: String): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(pipelineId, PipelineGetParams.none())

        /** @see get */
        @Deprecated("deprecated")
        fun get(
            pipelineId: String,
            params: PipelineGetParams = PipelineGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see get */
        @Deprecated("deprecated")
        fun get(
            pipelineId: String,
            params: PipelineGetParams = PipelineGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(pipelineId, params, RequestOptions.none())

        /** @see get */
        @Deprecated("deprecated")
        fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /** @see get */
        @Deprecated("deprecated")
        fun get(params: PipelineGetParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(params, RequestOptions.none())

        /** @see get */
        @Deprecated("deprecated")
        fun get(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(pipelineId, PipelineGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines/{pipeline_id}/status`, but is
         * otherwise the same as [PipelineServiceAsync.getStatus].
         */
        @Deprecated("deprecated")
        fun getStatus(
            pipelineId: String
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(pipelineId, PipelineGetStatusParams.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            pipelineId: String,
            params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            pipelineId: String,
            params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(pipelineId, params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            params: PipelineGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>>

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            params: PipelineGetStatusParams
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(pipelineId, PipelineGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines`, but is otherwise the same as
         * [PipelineServiceAsync.upsert].
         */
        @Deprecated("deprecated")
        fun upsert(params: PipelineUpsertParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @Deprecated("deprecated")
        fun upsert(
            params: PipelineUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /** @see upsert */
        @Deprecated("deprecated")
        fun upsert(
            pipelineCreate: PipelineCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            upsert(
                PipelineUpsertParams.builder().pipelineCreate(pipelineCreate).build(),
                requestOptions,
            )

        /** @see upsert */
        @Deprecated("deprecated")
        fun upsert(pipelineCreate: PipelineCreate): CompletableFuture<HttpResponseFor<Pipeline>> =
            upsert(pipelineCreate, RequestOptions.none())
    }
}
