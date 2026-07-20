// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.pipelines.ManagedIngestionStatusResponse
import ai.llamaindex.llamacloud.models.pipelines.documents.CloudDocument
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentCreateParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentDeleteParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentGetChunksParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentGetParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentListPage
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentListParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentSyncParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentSyncResponse
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentUpsertParams
import ai.llamaindex.llamacloud.models.pipelines.documents.TextNode
import com.google.errorprone.annotations.MustBeClosed
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
    @Deprecated("deprecated")
    fun create(pipelineId: String, params: DocumentCreateParams): List<CloudDocument> =
        create(pipelineId, params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        pipelineId: String,
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CloudDocument> =
        create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    @Deprecated("deprecated")
    fun create(params: DocumentCreateParams): List<CloudDocument> =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CloudDocument>

    /** Return a list of documents for a pipeline. */
    @Deprecated("deprecated")
    fun list(pipelineId: String): DocumentListPage = list(pipelineId, DocumentListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        pipelineId: String,
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPage = list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        pipelineId: String,
        params: DocumentListParams = DocumentListParams.none(),
    ): DocumentListPage = list(pipelineId, params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPage

    /** @see list */
    @Deprecated("deprecated")
    fun list(params: DocumentListParams): DocumentListPage = list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(pipelineId: String, requestOptions: RequestOptions): DocumentListPage =
        list(pipelineId, DocumentListParams.none(), requestOptions)

    /** Delete a document from a pipeline; runs async (vectors first, then MongoDB record). */
    @Deprecated("deprecated")
    fun delete(documentId: String, params: DocumentDeleteParams) =
        delete(documentId, params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        documentId: String,
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: DocumentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: DocumentDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Return a single document for a pipeline. */
    @Deprecated("deprecated")
    fun get(documentId: String, params: DocumentGetParams): CloudDocument =
        get(documentId, params, RequestOptions.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        documentId: String,
        params: DocumentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudDocument = get(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see get */
    @Deprecated("deprecated")
    fun get(params: DocumentGetParams): CloudDocument = get(params, RequestOptions.none())

    /** @see get */
    @Deprecated("deprecated")
    fun get(
        params: DocumentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CloudDocument

    /** Return a list of chunks for a pipeline document. */
    @Deprecated("deprecated")
    fun getChunks(documentId: String, params: DocumentGetChunksParams): List<TextNode> =
        getChunks(documentId, params, RequestOptions.none())

    /** @see getChunks */
    @Deprecated("deprecated")
    fun getChunks(
        documentId: String,
        params: DocumentGetChunksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TextNode> = getChunks(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see getChunks */
    @Deprecated("deprecated")
    fun getChunks(params: DocumentGetChunksParams): List<TextNode> =
        getChunks(params, RequestOptions.none())

    /** @see getChunks */
    @Deprecated("deprecated")
    fun getChunks(
        params: DocumentGetChunksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TextNode>

    /** Return a single document for a pipeline. */
    @Deprecated("deprecated")
    fun getStatus(
        documentId: String,
        params: DocumentGetStatusParams,
    ): ManagedIngestionStatusResponse = getStatus(documentId, params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        documentId: String,
        params: DocumentGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse =
        getStatus(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(params: DocumentGetStatusParams): ManagedIngestionStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        params: DocumentGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse

    /** Sync a specific document for a pipeline. */
    @Deprecated("deprecated")
    fun sync(documentId: String, params: DocumentSyncParams): DocumentSyncResponse =
        sync(documentId, params, RequestOptions.none())

    /** @see sync */
    @Deprecated("deprecated")
    fun sync(
        documentId: String,
        params: DocumentSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentSyncResponse =
        sync(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see sync */
    @Deprecated("deprecated")
    fun sync(params: DocumentSyncParams): DocumentSyncResponse = sync(params, RequestOptions.none())

    /** @see sync */
    @Deprecated("deprecated")
    fun sync(
        params: DocumentSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentSyncResponse

    /** Batch create or update a document for a pipeline. */
    @Deprecated("deprecated")
    fun upsert(pipelineId: String, params: DocumentUpsertParams): List<CloudDocument> =
        upsert(pipelineId, params, RequestOptions.none())

    /** @see upsert */
    @Deprecated("deprecated")
    fun upsert(
        pipelineId: String,
        params: DocumentUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CloudDocument> =
        upsert(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see upsert */
    @Deprecated("deprecated")
    fun upsert(params: DocumentUpsertParams): List<CloudDocument> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: DocumentCreateParams,
        ): HttpResponseFor<List<CloudDocument>> = create(pipelineId, params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CloudDocument>> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: DocumentCreateParams): HttpResponseFor<List<CloudDocument>> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(pipelineId: String): HttpResponseFor<DocumentListPage> =
            list(pipelineId, DocumentListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            pipelineId: String,
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPage> =
            list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            pipelineId: String,
            params: DocumentListParams = DocumentListParams.none(),
        ): HttpResponseFor<DocumentListPage> = list(pipelineId, params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPage>

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(params: DocumentListParams): HttpResponseFor<DocumentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(documentId: String, params: DocumentDeleteParams): HttpResponse =
            delete(documentId, params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            documentId: String,
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(params: DocumentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(documentId: String, params: DocumentGetParams): HttpResponseFor<CloudDocument> =
            get(documentId, params, RequestOptions.none())

        /** @see get */
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(
            documentId: String,
            params: DocumentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CloudDocument> =
            get(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see get */
        @Deprecated("deprecated")
        @MustBeClosed
        fun get(params: DocumentGetParams): HttpResponseFor<CloudDocument> =
            get(params, RequestOptions.none())

        /** @see get */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun getChunks(
            documentId: String,
            params: DocumentGetChunksParams,
        ): HttpResponseFor<List<TextNode>> = getChunks(documentId, params, RequestOptions.none())

        /** @see getChunks */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getChunks(
            documentId: String,
            params: DocumentGetChunksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TextNode>> =
            getChunks(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see getChunks */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getChunks(params: DocumentGetChunksParams): HttpResponseFor<List<TextNode>> =
            getChunks(params, RequestOptions.none())

        /** @see getChunks */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            documentId: String,
            params: DocumentGetStatusParams,
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(documentId, params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            documentId: String,
            params: DocumentGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            params: DocumentGetStatusParams
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun sync(
            documentId: String,
            params: DocumentSyncParams,
        ): HttpResponseFor<DocumentSyncResponse> = sync(documentId, params, RequestOptions.none())

        /** @see sync */
        @Deprecated("deprecated")
        @MustBeClosed
        fun sync(
            documentId: String,
            params: DocumentSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentSyncResponse> =
            sync(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see sync */
        @Deprecated("deprecated")
        @MustBeClosed
        fun sync(params: DocumentSyncParams): HttpResponseFor<DocumentSyncResponse> =
            sync(params, RequestOptions.none())

        /** @see sync */
        @Deprecated("deprecated")
        @MustBeClosed
        fun sync(
            params: DocumentSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentSyncResponse>

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/documents`, but is
         * otherwise the same as [DocumentService.upsert].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun upsert(
            pipelineId: String,
            params: DocumentUpsertParams,
        ): HttpResponseFor<List<CloudDocument>> = upsert(pipelineId, params, RequestOptions.none())

        /** @see upsert */
        @Deprecated("deprecated")
        @MustBeClosed
        fun upsert(
            pipelineId: String,
            params: DocumentUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CloudDocument>> =
            upsert(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see upsert */
        @Deprecated("deprecated")
        @MustBeClosed
        fun upsert(params: DocumentUpsertParams): HttpResponseFor<List<CloudDocument>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @Deprecated("deprecated")
        @MustBeClosed
        fun upsert(
            params: DocumentUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CloudDocument>>
    }
}
