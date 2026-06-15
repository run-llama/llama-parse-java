// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.pipelines

import com.google.errorprone.annotations.MustBeClosed
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
import com.llamacloud_prod.api.models.pipelines.documents.DocumentListPage
import com.llamacloud_prod.api.models.pipelines.documents.DocumentListParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentSyncParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentSyncResponse
import com.llamacloud_prod.api.models.pipelines.documents.DocumentUpsertParams
import com.llamacloud_prod.api.models.pipelines.documents.TextNode
import java.util.function.Consumer

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService

    /** Batch create documents for a pipeline. */
    fun create(pipelineId: String, params: DocumentCreateParams): List<CloudDocument> =
        create(pipelineId, params, RequestOptions.none())

    /** @see create */
    fun create(
        pipelineId: String,
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CloudDocument> =
        create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    fun create(params: DocumentCreateParams): List<CloudDocument> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CloudDocument>

    /** Return a list of documents for a pipeline. */
    fun list(pipelineId: String): DocumentListPage = list(pipelineId, DocumentListParams.none())

    /** @see list */
    fun list(
        pipelineId: String,
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPage = list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see list */
    fun list(
        pipelineId: String,
        params: DocumentListParams = DocumentListParams.none(),
    ): DocumentListPage = list(pipelineId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPage

    /** @see list */
    fun list(params: DocumentListParams): DocumentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(pipelineId: String, requestOptions: RequestOptions): DocumentListPage =
        list(pipelineId, DocumentListParams.none(), requestOptions)

    /** Delete a document from a pipeline; runs async (vectors first, then MongoDB record). */
    fun delete(documentId: String, params: DocumentDeleteParams) =
        delete(documentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        documentId: String,
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see delete */
    fun delete(params: DocumentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: DocumentDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Return a single document for a pipeline. */
    fun get(documentId: String, params: DocumentGetParams): CloudDocument =
        get(documentId, params, RequestOptions.none())

    /** @see get */
    fun get(
        documentId: String,
        params: DocumentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudDocument = get(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see get */
    fun get(params: DocumentGetParams): CloudDocument = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DocumentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudDocument

    /** Return a list of chunks for a pipeline document. */
    fun getChunks(documentId: String, params: DocumentGetChunksParams): List<TextNode> =
        getChunks(documentId, params, RequestOptions.none())

    /** @see getChunks */
    fun getChunks(
        documentId: String,
        params: DocumentGetChunksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TextNode> = getChunks(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see getChunks */
    fun getChunks(params: DocumentGetChunksParams): List<TextNode> =
        getChunks(params, RequestOptions.none())

    /** @see getChunks */
    fun getChunks(
        params: DocumentGetChunksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TextNode>

    /** Return a single document for a pipeline. */
    fun getStatus(
        documentId: String,
        params: DocumentGetStatusParams,
    ): ManagedIngestionStatusResponse = getStatus(documentId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        documentId: String,
        params: DocumentGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse =
        getStatus(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(params: DocumentGetStatusParams): ManagedIngestionStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: DocumentGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse

    /** Sync a specific document for a pipeline. */
    fun sync(documentId: String, params: DocumentSyncParams): DocumentSyncResponse =
        sync(documentId, params, RequestOptions.none())

    /** @see sync */
    fun sync(
        documentId: String,
        params: DocumentSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentSyncResponse =
        sync(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see sync */
    fun sync(params: DocumentSyncParams): DocumentSyncResponse = sync(params, RequestOptions.none())

    /** @see sync */
    fun sync(
        params: DocumentSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentSyncResponse

    /** Batch create or update a document for a pipeline. */
    fun upsert(pipelineId: String, params: DocumentUpsertParams): List<CloudDocument> =
        upsert(pipelineId, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        pipelineId: String,
        params: DocumentUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CloudDocument> =
        upsert(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: DocumentUpsertParams): List<CloudDocument> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: DocumentUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CloudDocument>

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/pipelines/{pipeline_id}/documents`, but is
         * otherwise the same as [DocumentService.create].
         */
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: DocumentCreateParams,
        ): HttpResponseFor<List<CloudDocument>> = create(pipelineId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CloudDocument>> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: DocumentCreateParams): HttpResponseFor<List<CloudDocument>> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CloudDocument>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/documents/paginated`, but is otherwise the same as
         * [DocumentService.list].
         */
        @MustBeClosed
        fun list(pipelineId: String): HttpResponseFor<DocumentListPage> =
            list(pipelineId, DocumentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            pipelineId: String,
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPage> =
            list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            pipelineId: String,
            params: DocumentListParams = DocumentListParams.none(),
        ): HttpResponseFor<DocumentListPage> = list(pipelineId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: DocumentListParams): HttpResponseFor<DocumentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentListPage> =
            list(pipelineId, DocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/pipelines/{pipeline_id}/documents/{document_id}`, but is otherwise the same as
         * [DocumentService.delete].
         */
        @MustBeClosed
        fun delete(documentId: String, params: DocumentDeleteParams): HttpResponse =
            delete(documentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            documentId: String,
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: DocumentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/documents/{document_id}`, but is otherwise the same as
         * [DocumentService.get].
         */
        @MustBeClosed
        fun get(documentId: String, params: DocumentGetParams): HttpResponseFor<CloudDocument> =
            get(documentId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            documentId: String,
            params: DocumentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudDocument> =
            get(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: DocumentGetParams): HttpResponseFor<CloudDocument> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DocumentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudDocument>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/documents/{document_id}/chunks`, but is otherwise the
         * same as [DocumentService.getChunks].
         */
        @MustBeClosed
        fun getChunks(
            documentId: String,
            params: DocumentGetChunksParams,
        ): HttpResponseFor<List<TextNode>> = getChunks(documentId, params, RequestOptions.none())

        /** @see getChunks */
        @MustBeClosed
        fun getChunks(
            documentId: String,
            params: DocumentGetChunksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TextNode>> =
            getChunks(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see getChunks */
        @MustBeClosed
        fun getChunks(params: DocumentGetChunksParams): HttpResponseFor<List<TextNode>> =
            getChunks(params, RequestOptions.none())

        /** @see getChunks */
        @MustBeClosed
        fun getChunks(
            params: DocumentGetChunksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TextNode>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/documents/{document_id}/status`, but is otherwise the
         * same as [DocumentService.getStatus].
         */
        @MustBeClosed
        fun getStatus(
            documentId: String,
            params: DocumentGetStatusParams,
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(documentId, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            documentId: String,
            params: DocumentGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: DocumentGetStatusParams
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: DocumentGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/pipelines/{pipeline_id}/documents/{document_id}/sync`, but is otherwise the same
         * as [DocumentService.sync].
         */
        @MustBeClosed
        fun sync(
            documentId: String,
            params: DocumentSyncParams,
        ): HttpResponseFor<DocumentSyncResponse> = sync(documentId, params, RequestOptions.none())

        /** @see sync */
        @MustBeClosed
        fun sync(
            documentId: String,
            params: DocumentSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentSyncResponse> =
            sync(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see sync */
        @MustBeClosed
        fun sync(params: DocumentSyncParams): HttpResponseFor<DocumentSyncResponse> =
            sync(params, RequestOptions.none())

        /** @see sync */
        @MustBeClosed
        fun sync(
            params: DocumentSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentSyncResponse>

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/documents`, but is
         * otherwise the same as [DocumentService.upsert].
         */
        @MustBeClosed
        fun upsert(
            pipelineId: String,
            params: DocumentUpsertParams,
        ): HttpResponseFor<List<CloudDocument>> = upsert(pipelineId, params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            pipelineId: String,
            params: DocumentUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CloudDocument>> =
            upsert(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see upsert */
        @MustBeClosed
        fun upsert(params: DocumentUpsertParams): HttpResponseFor<List<CloudDocument>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: DocumentUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CloudDocument>>
    }
}
