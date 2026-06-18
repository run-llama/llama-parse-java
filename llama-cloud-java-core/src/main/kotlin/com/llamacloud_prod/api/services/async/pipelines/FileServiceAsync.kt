// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.pipelines

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.pipelines.ManagedIngestionStatusResponse
import com.llamacloud_prod.api.models.pipelines.files.FileCreateParams
import com.llamacloud_prod.api.models.pipelines.files.FileDeleteParams
import com.llamacloud_prod.api.models.pipelines.files.FileGetStatusCountsParams
import com.llamacloud_prod.api.models.pipelines.files.FileGetStatusCountsResponse
import com.llamacloud_prod.api.models.pipelines.files.FileGetStatusParams
import com.llamacloud_prod.api.models.pipelines.files.FileListPageAsync
import com.llamacloud_prod.api.models.pipelines.files.FileListParams
import com.llamacloud_prod.api.models.pipelines.files.FileUpdateParams
import com.llamacloud_prod.api.models.pipelines.files.PipelineFile
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync

    /** Add files to a pipeline. */
    @Deprecated("deprecated")
    fun create(
        pipelineId: String,
        params: FileCreateParams,
    ): CompletableFuture<List<PipelineFile>> = create(pipelineId, params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        pipelineId: String,
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PipelineFile>> =
        create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    @Deprecated("deprecated")
    fun create(params: FileCreateParams): CompletableFuture<List<PipelineFile>> =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PipelineFile>>

    /** Update a file for a pipeline. */
    @Deprecated("deprecated")
    fun update(fileId: String, params: FileUpdateParams): CompletableFuture<PipelineFile> =
        update(fileId, params, RequestOptions.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        fileId: String,
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineFile> =
        update(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see update */
    @Deprecated("deprecated")
    fun update(params: FileUpdateParams): CompletableFuture<PipelineFile> =
        update(params, RequestOptions.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineFile>

    /** List files for a pipeline with optional filtering, sorting, and pagination. */
    @Deprecated("deprecated")
    fun list(pipelineId: String): CompletableFuture<FileListPageAsync> =
        list(pipelineId, FileListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        pipelineId: String,
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListPageAsync> =
        list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        pipelineId: String,
        params: FileListParams = FileListParams.none(),
    ): CompletableFuture<FileListPageAsync> = list(pipelineId, params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListPageAsync>

    /** @see list */
    @Deprecated("deprecated")
    fun list(params: FileListParams): CompletableFuture<FileListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        pipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileListPageAsync> =
        list(pipelineId, FileListParams.none(), requestOptions)

    /** Delete a file from a pipeline. */
    @Deprecated("deprecated")
    fun delete(fileId: String, params: FileDeleteParams): CompletableFuture<Void?> =
        delete(fileId, params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        fileId: String,
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: FileDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get status of a file for a pipeline. */
    @Deprecated("deprecated")
    fun getStatus(
        fileId: String,
        params: FileGetStatusParams,
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(fileId, params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        fileId: String,
        params: FileGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(params: FileGetStatusParams): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        params: FileGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedIngestionStatusResponse>

    /** Get files for a pipeline. */
    @Deprecated("deprecated")
    fun getStatusCounts(pipelineId: String): CompletableFuture<FileGetStatusCountsResponse> =
        getStatusCounts(pipelineId, FileGetStatusCountsParams.none())

    /** @see getStatusCounts */
    @Deprecated("deprecated")
    fun getStatusCounts(
        pipelineId: String,
        params: FileGetStatusCountsParams = FileGetStatusCountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileGetStatusCountsResponse> =
        getStatusCounts(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see getStatusCounts */
    @Deprecated("deprecated")
    fun getStatusCounts(
        pipelineId: String,
        params: FileGetStatusCountsParams = FileGetStatusCountsParams.none(),
    ): CompletableFuture<FileGetStatusCountsResponse> =
        getStatusCounts(pipelineId, params, RequestOptions.none())

    /** @see getStatusCounts */
    @Deprecated("deprecated")
    fun getStatusCounts(
        params: FileGetStatusCountsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileGetStatusCountsResponse>

    /** @see getStatusCounts */
    @Deprecated("deprecated")
    fun getStatusCounts(
        params: FileGetStatusCountsParams
    ): CompletableFuture<FileGetStatusCountsResponse> =
        getStatusCounts(params, RequestOptions.none())

    /** @see getStatusCounts */
    @Deprecated("deprecated")
    fun getStatusCounts(
        pipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileGetStatusCountsResponse> =
        getStatusCounts(pipelineId, FileGetStatusCountsParams.none(), requestOptions)

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/files`, but is
         * otherwise the same as [FileServiceAsync.create].
         */
        @Deprecated("deprecated")
        fun create(
            pipelineId: String,
            params: FileCreateParams,
        ): CompletableFuture<HttpResponseFor<List<PipelineFile>>> =
            create(pipelineId, params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            pipelineId: String,
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PipelineFile>>> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            params: FileCreateParams
        ): CompletableFuture<HttpResponseFor<List<PipelineFile>>> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PipelineFile>>>

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/files/{file_id}`,
         * but is otherwise the same as [FileServiceAsync.update].
         */
        @Deprecated("deprecated")
        fun update(
            fileId: String,
            params: FileUpdateParams,
        ): CompletableFuture<HttpResponseFor<PipelineFile>> =
            update(fileId, params, RequestOptions.none())

        /** @see update */
        @Deprecated("deprecated")
        fun update(
            fileId: String,
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineFile>> =
            update(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see update */
        @Deprecated("deprecated")
        fun update(params: FileUpdateParams): CompletableFuture<HttpResponseFor<PipelineFile>> =
            update(params, RequestOptions.none())

        /** @see update */
        @Deprecated("deprecated")
        fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineFile>>

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines/{pipeline_id}/files2`, but is
         * otherwise the same as [FileServiceAsync.list].
         */
        @Deprecated("deprecated")
        fun list(pipelineId: String): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(pipelineId, FileListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            pipelineId: String,
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            pipelineId: String,
            params: FileListParams = FileListParams.none(),
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(pipelineId, params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>>

        /** @see list */
        @Deprecated("deprecated")
        fun list(params: FileListParams): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(pipelineId, FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/pipelines/{pipeline_id}/files/{file_id}`,
         * but is otherwise the same as [FileServiceAsync.delete].
         */
        @Deprecated("deprecated")
        fun delete(fileId: String, params: FileDeleteParams): CompletableFuture<HttpResponse> =
            delete(fileId, params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            fileId: String,
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(params: FileDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/files/{file_id}/status`, but is otherwise the same as
         * [FileServiceAsync.getStatus].
         */
        @Deprecated("deprecated")
        fun getStatus(
            fileId: String,
            params: FileGetStatusParams,
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(fileId, params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            fileId: String,
            params: FileGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            params: FileGetStatusParams
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        fun getStatus(
            params: FileGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/files/status-counts`, but is otherwise the same as
         * [FileServiceAsync.getStatusCounts].
         */
        @Deprecated("deprecated")
        fun getStatusCounts(
            pipelineId: String
        ): CompletableFuture<HttpResponseFor<FileGetStatusCountsResponse>> =
            getStatusCounts(pipelineId, FileGetStatusCountsParams.none())

        /** @see getStatusCounts */
        @Deprecated("deprecated")
        fun getStatusCounts(
            pipelineId: String,
            params: FileGetStatusCountsParams = FileGetStatusCountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileGetStatusCountsResponse>> =
            getStatusCounts(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see getStatusCounts */
        @Deprecated("deprecated")
        fun getStatusCounts(
            pipelineId: String,
            params: FileGetStatusCountsParams = FileGetStatusCountsParams.none(),
        ): CompletableFuture<HttpResponseFor<FileGetStatusCountsResponse>> =
            getStatusCounts(pipelineId, params, RequestOptions.none())

        /** @see getStatusCounts */
        @Deprecated("deprecated")
        fun getStatusCounts(
            params: FileGetStatusCountsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileGetStatusCountsResponse>>

        /** @see getStatusCounts */
        @Deprecated("deprecated")
        fun getStatusCounts(
            params: FileGetStatusCountsParams
        ): CompletableFuture<HttpResponseFor<FileGetStatusCountsResponse>> =
            getStatusCounts(params, RequestOptions.none())

        /** @see getStatusCounts */
        @Deprecated("deprecated")
        fun getStatusCounts(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileGetStatusCountsResponse>> =
            getStatusCounts(pipelineId, FileGetStatusCountsParams.none(), requestOptions)
    }
}
