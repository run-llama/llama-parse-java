// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.pipelines

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.pipelines.ManagedIngestionStatusResponse
import com.llamacloud_prod.api.models.pipelines.documents.CloudDocument
import com.llamacloud_prod.api.models.pipelines.documents.DocumentCreateParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentDeleteParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentGetChunksParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentGetParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentGetStatusParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentListPageAsync
import com.llamacloud_prod.api.models.pipelines.documents.DocumentListParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentSyncParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentSyncResponse
import com.llamacloud_prod.api.models.pipelines.documents.DocumentUpsertParams
import com.llamacloud_prod.api.models.pipelines.documents.TextNode
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync

    /** Batch create documents for a pipeline. */
    @Deprecated("deprecated")
    fun create(
        pipelineId: String,
        params: DocumentCreateParams,
    ): CompletableFuture<List<CloudDocument>> = create(pipelineId, params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        pipelineId: String,
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CloudDocument>> =
        create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    @Deprecated("deprecated")
    fun create(params: DocumentCreateParams): CompletableFuture<List<CloudDocument>> =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CloudDocument>>

    /** Return a list of documents for a pipeline. */
    @Deprecated("deprecated")
    fun list(pipelineId: String): CompletableFuture<DocumentListPageAsync> =
        list(pipelineId, DocumentListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        pipelineId: String,
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListPageAsync> =
        list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        pipelineId: String,
        params: DocumentListParams = DocumentListParams.none(),
    ): CompletableFuture<DocumentListPageAsync> = list(pipelineId, params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListPageAsync>

    /** @see list */
    @Deprecated("deprecated")
    fun list(params: DocumentListParams): CompletableFuture<DocumentListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        pipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentListPageAsync> =
        list(pipelineId, DocumentListParams.none(), requestOptions)

    /** Delete a document from a pipeline; runs async (vectors first, then MongoDB record). */
    @Deprecated("deprecated")
    fun delete(documentId: String, params: DocumentDeleteParams): CompletableFuture<Void?> =
        delete(documentId, params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        documentId: String,
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: DocumentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Return a single document for a pipeline. */
    @Deprecated("deprecated")
    fun get(documentId: String, params: DocumentGetParams): CompletableFuture<CloudDocument> =
        get(documentId, params, RequestOptions.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        documentId: String,
        params: DocumentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudDocument> =
        get(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see get */
    @Deprecated("deprecated")
    fun get(params: DocumentGetParams): CompletableFuture<CloudDocument> =
        get(params, RequestOptions.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        params: DocumentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CloudDocument>

    /** Return a list of chunks for a pipeline document. */
    @Deprecated("deprecated")
    fun getChunks(
        documentId: String,
        params: DocumentGetChunksParams,
    ): CompletableFuture<List<TextNode>> = getChunks(documentId, params, RequestOptions.none())

    /** @see getChunks */
    @Deprecated("deprecated")
    fun getChunks(
        documentId: String,
        params: DocumentGetChunksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TextNode>> =
        getChunks(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see getChunks */
    @Deprecated("deprecated")
    fun getChunks(params: DocumentGetChunksParams): CompletableFuture<List<TextNode>> =
        getChunks(params, RequestOptions.none())

    /** @see getChunks */
    @Deprecated("deprecated")
    fun getChunks(
        params: DocumentGetChunksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TextNode>>

    /** Return a single document for a pipeline. */
    @Deprecated("deprecated")
    fun getStatus(
        documentId: String,
        params: DocumentGetStatusParams,
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(documentId, params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        documentId: String,
        params: DocumentGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        params: DocumentGetStatusParams
    ): CompletableFuture<ManagedIngestionStatusResponse> = getStatus(params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        params: DocumentGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedIngestionStatusResponse>

    /** Sync a specific document for a pipeline. */
    @Deprecated("deprecated")
    fun sync(
        documentId: String,
        params: DocumentSyncParams,
    ): CompletableFuture<DocumentSyncResponse> = sync(documentId, params, RequestOptions.none())

    /** @see sync */
    @Deprecated("deprecated")
    fun sync(
        documentId: String,
        params: DocumentSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentSyncResponse> =
        sync(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see sync */
    @Deprecated("deprecated")
    fun sync(params: DocumentSyncParams): CompletableFuture<DocumentSyncResponse> =
        sync(params, RequestOptions.none())

    /** @see sync */
    @Deprecated("deprecated")
    fun sync(
        params: DocumentSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentSyncResponse>

    /** Batch create or update a document for a pipeline. */
    @Deprecated("deprecated")
    fun upsert(
        pipelineId: String,
        params: DocumentUpsertParams,
    ): CompletableFuture<List<CloudDocument>> = upsert(pipelineId, params, RequestOptions.none())

    /** @see upsert */
    @Deprecated("deprecated")
    fun upsert(
        pipelineId: String,
        params: DocumentUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CloudDocument>> =
        upsert(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see upsert */
    @Deprecated("deprecated")
    fun upsert(params: DocumentUpsertParams): CompletableFuture<List<CloudDocument>> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    @Deprecated("deprecated")
    fun upsert(
        params: DocumentUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CloudDocument>>

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines/{pipeline_id}/documents`, but is
         * otherwise the same as [DocumentServiceAsync.create].
         */
        @Deprecated("deprecated")
        fun create(
            pipelineId: String,
            params: DocumentCreateParams,
        ): CompletableFuture<HttpResponseFor<List<CloudDocument>>> =
            create(pipelineId, params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            pipelineId: String,
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CloudDocument>>> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            params: DocumentCreateParams
        ): CompletableFuture<HttpResponseFor<List<CloudDocument>>> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CloudDocument>>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/documents/paginated`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        @Deprecated("deprecated")
        fun list(pipelineId: String): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(pipelineId, DocumentListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            pipelineId: String,
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            pipelineId: String,
            params: DocumentListParams = DocumentListParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(pipelineId, params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>>

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            params: DocumentListParams
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(pipelineId, DocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/pipelines/{pipeline_id}/documents/{document_id}`, but is otherwise the same as
         * [DocumentServiceAsync.delete].
         */
        @Deprecated("deprecated")
        fun delete(
            documentId: String,
            params: DocumentDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(documentId, params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            documentId: String,
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(params: DocumentDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/documents/{document_id}`, but is otherwise the same as
         * [DocumentServiceAsync.get].
         */
        @Deprecated("deprecated")
        fun get(
            documentId: String,
            params: DocumentGetParams,
        ): CompletableFuture<HttpResponseFor<CloudDocument>> =
            get(documentId, params, RequestOptions.none())

        /** @see get */
        @Deprecated("deprecated")
        fun get(
            documentId: String,
            params: DocumentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudDocument>> =
            get(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see get */
        @Deprecated("deprecated")
        fun get(params: DocumentGetParams): CompletableFuture<HttpResponseFor<CloudDocument>> =
            get(params, RequestOptions.none())

        /** @see get */
        @Deprecated("deprecated")
        fun get(
            params: DocumentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CloudDocument>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/documents/{document_id}/chunks`, but is otherwise the
         * same as [DocumentServiceAsync.getChunks].
         */
        @Deprecated("deprecated")
        fun getChunks(
            documentId: String,
            params: DocumentGetChunksParams,
        ): CompletableFuture<HttpResponseFor<List<TextNode>>> =
            getChunks(documentId, params, RequestOptions.none())

        /** @see getChunks */
        @Deprecated("deprecated")
        fun getChunks(
            documentId: String,
            params: DocumentGetChunksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TextNode>>> =
            getChunks(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see getChunks */
        @Deprecated("deprecated")
        fun getChunks(
            params: DocumentGetChunksParams
        ): CompletableFuture<HttpResponseFor<List<TextNode>>> =
            getChunks(params, RequestOptions.none())

        /** @see getChunks */
        @Deprecated("deprecated")
        fun getChunks(
            params: DocumentGetChunksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TextNode>>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/documents/{document_id}/status`, but is otherwise the
         * same as [DocumentServiceAsync.getStatus].
         */
        @Deprecated("deprecated")
        fun getStatus(
            documentId: String,
            params: DocumentGetStatusParams,
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(documentId, params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            documentId: String,
            params: DocumentGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            params: DocumentGetStatusParams
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            params: DocumentGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/pipelines/{pipeline_id}/documents/{document_id}/sync`, but is otherwise the same
         * as [DocumentServiceAsync.sync].
         */
        @Deprecated("deprecated")
        fun sync(
            documentId: String,
            params: DocumentSyncParams,
        ): CompletableFuture<HttpResponseFor<DocumentSyncResponse>> =
            sync(documentId, params, RequestOptions.none())

        /** @see sync */
        @Deprecated("deprecated")
        fun sync(
            documentId: String,
            params: DocumentSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentSyncResponse>> =
            sync(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see sync */
        @Deprecated("deprecated")
        fun sync(
            params: DocumentSyncParams
        ): CompletableFuture<HttpResponseFor<DocumentSyncResponse>> =
            sync(params, RequestOptions.none())

        /** @see sync */
        @Deprecated("deprecated")
        fun sync(
            params: DocumentSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentSyncResponse>>

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/documents`, but is
         * otherwise the same as [DocumentServiceAsync.upsert].
         */
        @Deprecated("deprecated")
        fun upsert(
            pipelineId: String,
            params: DocumentUpsertParams,
        ): CompletableFuture<HttpResponseFor<List<CloudDocument>>> =
            upsert(pipelineId, params, RequestOptions.none())

        /** @see upsert */
        @Deprecated("deprecated")
        fun upsert(
            pipelineId: String,
            params: DocumentUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CloudDocument>>> =
            upsert(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see upsert */
        @Deprecated("deprecated")
        fun upsert(
            params: DocumentUpsertParams
        ): CompletableFuture<HttpResponseFor<List<CloudDocument>>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @Deprecated("deprecated")
        fun upsert(
            params: DocumentUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CloudDocument>>>
    }
}
