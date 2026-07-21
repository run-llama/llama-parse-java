// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.pipelines.ManagedIngestionStatusResponse
import ai.llamaindex.llamacloud.models.pipelines.Pipeline
import ai.llamaindex.llamacloud.models.pipelines.PipelineCreate
import ai.llamaindex.llamacloud.models.pipelines.PipelineCreateParams
import ai.llamaindex.llamacloud.models.pipelines.PipelineDeleteParams
import ai.llamaindex.llamacloud.models.pipelines.PipelineGetParams
import ai.llamaindex.llamacloud.models.pipelines.PipelineGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.PipelineListParams
import ai.llamaindex.llamacloud.models.pipelines.PipelineRetrieveParams
import ai.llamaindex.llamacloud.models.pipelines.PipelineRetrieveResponse
import ai.llamaindex.llamacloud.models.pipelines.PipelineUpdateParams
import ai.llamaindex.llamacloud.models.pipelines.PipelineUpsertParams
import ai.llamaindex.llamacloud.services.blocking.pipelines.DataSourceService
import ai.llamaindex.llamacloud.services.blocking.pipelines.DocumentService
import ai.llamaindex.llamacloud.services.blocking.pipelines.FileService
import ai.llamaindex.llamacloud.services.blocking.pipelines.ImageService
import ai.llamaindex.llamacloud.services.blocking.pipelines.MetadataService
import ai.llamaindex.llamacloud.services.blocking.pipelines.SyncService
import com.google.errorprone.annotations.MustBeClosed
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
    @Deprecated("deprecated")
    fun create(params: PipelineCreateParams): Pipeline = create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        pipelineCreate: PipelineCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline =
        create(
            PipelineCreateParams.builder().pipelineCreate(pipelineCreate).build(),
            requestOptions,
        )

    /** @see create */
    @Deprecated("deprecated")
    fun create(pipelineCreate: PipelineCreate): Pipeline =
        create(pipelineCreate, RequestOptions.none())

    /**
     * Run a retrieval query against a managed pipeline.
     *
     * Searches the pipeline's vector store using the provided query and retrieval parameters.
     * Supports dense, sparse, and hybrid search modes with configurable top-k and reranking.
     */
    @Deprecated("deprecated")
    fun retrieve(pipelineId: String, params: PipelineRetrieveParams): PipelineRetrieveResponse =
        retrieve(pipelineId, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        pipelineId: String,
        params: PipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineRetrieveResponse =
        retrieve(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(params: PipelineRetrieveParams): PipelineRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: PipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineRetrieveResponse

    /** Update an existing pipeline's configuration. */
    @Deprecated("deprecated")
    fun update(pipelineId: String): Pipeline = update(pipelineId, PipelineUpdateParams.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        pipelineId: String,
        params: PipelineUpdateParams = PipelineUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        pipelineId: String,
        params: PipelineUpdateParams = PipelineUpdateParams.none(),
    ): Pipeline = update(pipelineId, params, RequestOptions.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** @see update */
    @Deprecated("deprecated")
    fun update(params: PipelineUpdateParams): Pipeline = update(params, RequestOptions.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(pipelineId: String, requestOptions: RequestOptions): Pipeline =
        update(pipelineId, PipelineUpdateParams.none(), requestOptions)

    /** Search for pipelines by name, type, or project. */
    @Deprecated("deprecated") fun list(): List<Pipeline> = list(PipelineListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: PipelineListParams = PipelineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Pipeline>

    /** @see list */
    @Deprecated("deprecated")
    fun list(params: PipelineListParams = PipelineListParams.none()): List<Pipeline> =
        list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(requestOptions: RequestOptions): List<Pipeline> =
        list(PipelineListParams.none(), requestOptions)

    /**
     * Delete a pipeline and all associated resources.
     *
     * Removes pipeline files, data sources, and vector store data. This operation is irreversible.
     */
    @Deprecated("deprecated")
    fun delete(pipelineId: String) = delete(pipelineId, PipelineDeleteParams.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        pipelineId: String,
        params: PipelineDeleteParams = PipelineDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(pipelineId: String, params: PipelineDeleteParams = PipelineDeleteParams.none()) =
        delete(pipelineId, params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: PipelineDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: PipelineDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(pipelineId: String, requestOptions: RequestOptions) =
        delete(pipelineId, PipelineDeleteParams.none(), requestOptions)

    /** Get a pipeline by ID. */
    @Deprecated("deprecated")
    fun get(pipelineId: String): Pipeline = get(pipelineId, PipelineGetParams.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        pipelineId: String,
        params: PipelineGetParams = PipelineGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see get */
    @Deprecated("deprecated")
    fun get(pipelineId: String, params: PipelineGetParams = PipelineGetParams.none()): Pipeline =
        get(pipelineId, params, RequestOptions.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** @see get */
    @Deprecated("deprecated")
    fun get(params: PipelineGetParams): Pipeline = get(params, RequestOptions.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(pipelineId: String, requestOptions: RequestOptions): Pipeline =
        get(pipelineId, PipelineGetParams.none(), requestOptions)

    /**
     * Get the ingestion status of a managed pipeline.
     *
     * Returns document counts, sync progress, and the last effective timestamp. Only available for
     * managed pipelines.
     */
    @Deprecated("deprecated")
    fun getStatus(pipelineId: String): ManagedIngestionStatusResponse =
        getStatus(pipelineId, PipelineGetStatusParams.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        pipelineId: String,
        params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse =
        getStatus(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        pipelineId: String,
        params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
    ): ManagedIngestionStatusResponse = getStatus(pipelineId, params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        params: PipelineGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(params: PipelineGetStatusParams): ManagedIngestionStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
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
    @Deprecated("deprecated")
    fun upsert(params: PipelineUpsertParams): Pipeline = upsert(params, RequestOptions.none())

    /** @see upsert */
    @Deprecated("deprecated")
    fun upsert(
        params: PipelineUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** @see upsert */
    @Deprecated("deprecated")
    fun upsert(
        pipelineCreate: PipelineCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline =
        upsert(
            PipelineUpsertParams.builder().pipelineCreate(pipelineCreate).build(),
            requestOptions,
        )

    /** @see upsert */
    @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: PipelineCreateParams): HttpResponseFor<Pipeline> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /** @see create */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(pipelineCreate: PipelineCreate): HttpResponseFor<Pipeline> =
            create(pipelineCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines/{pipeline_id}/retrieve`, but is
         * otherwise the same as [PipelineService.retrieve].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            pipelineId: String,
            params: PipelineRetrieveParams,
        ): HttpResponseFor<PipelineRetrieveResponse> =
            retrieve(pipelineId, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            pipelineId: String,
            params: PipelineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineRetrieveResponse> =
            retrieve(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(params: PipelineRetrieveParams): HttpResponseFor<PipelineRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            params: PipelineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}`, but is otherwise
         * the same as [PipelineService.update].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(pipelineId: String): HttpResponseFor<Pipeline> =
            update(pipelineId, PipelineUpdateParams.none())

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams = PipelineUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams = PipelineUpdateParams.none(),
        ): HttpResponseFor<Pipeline> = update(pipelineId, params, RequestOptions.none())

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(params: PipelineUpdateParams): HttpResponseFor<Pipeline> =
            update(params, RequestOptions.none())

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(pipelineId: String, requestOptions: RequestOptions): HttpResponseFor<Pipeline> =
            update(pipelineId, PipelineUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines`, but is otherwise the same as
         * [PipelineService.list].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(): HttpResponseFor<List<Pipeline>> = list(PipelineListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            params: PipelineListParams = PipelineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Pipeline>>

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            params: PipelineListParams = PipelineListParams.none()
        ): HttpResponseFor<List<Pipeline>> = list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Pipeline>> =
            list(PipelineListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/pipelines/{pipeline_id}`, but is
         * otherwise the same as [PipelineService.delete].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(pipelineId: String): HttpResponse =
            delete(pipelineId, PipelineDeleteParams.none())

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams = PipelineDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams = PipelineDeleteParams.none(),
        ): HttpResponse = delete(pipelineId, params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(params: PipelineDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(pipelineId: String, requestOptions: RequestOptions): HttpResponse =
            delete(pipelineId, PipelineDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines/{pipeline_id}`, but is otherwise
         * the same as [PipelineService.get].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(pipelineId: String): HttpResponseFor<Pipeline> =
            get(pipelineId, PipelineGetParams.none())

        /** @see get */
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(
            pipelineId: String,
            params: PipelineGetParams = PipelineGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see get */
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(
            pipelineId: String,
            params: PipelineGetParams = PipelineGetParams.none(),
        ): HttpResponseFor<Pipeline> = get(pipelineId, params, RequestOptions.none())

        /** @see get */
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /** @see get */
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(params: PipelineGetParams): HttpResponseFor<Pipeline> =
            get(params, RequestOptions.none())

        /** @see get */
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(pipelineId: String, requestOptions: RequestOptions): HttpResponseFor<Pipeline> =
            get(pipelineId, PipelineGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines/{pipeline_id}/status`, but is
         * otherwise the same as [PipelineService.getStatus].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(pipelineId: String): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(pipelineId, PipelineGetStatusParams.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            pipelineId: String,
            params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            pipelineId: String,
            params: PipelineGetStatusParams = PipelineGetStatusParams.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(pipelineId, params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            params: PipelineGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse>

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            params: PipelineGetStatusParams
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun upsert(params: PipelineUpsertParams): HttpResponseFor<Pipeline> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @Deprecated("deprecated")
        @MustBeClosed
        fun upsert(
            params: PipelineUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /** @see upsert */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun upsert(pipelineCreate: PipelineCreate): HttpResponseFor<Pipeline> =
            upsert(pipelineCreate, RequestOptions.none())
    }
}
