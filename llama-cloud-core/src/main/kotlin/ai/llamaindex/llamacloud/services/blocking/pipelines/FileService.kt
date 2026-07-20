// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.pipelines.ManagedIngestionStatusResponse
import ai.llamaindex.llamacloud.models.pipelines.files.FileCreateParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileDeleteParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileGetStatusCountsParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileGetStatusCountsResponse
import ai.llamaindex.llamacloud.models.pipelines.files.FileGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileListPage
import ai.llamaindex.llamacloud.models.pipelines.files.FileListParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileUpdateParams
import ai.llamaindex.llamacloud.models.pipelines.files.PipelineFile
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService

    /** Add files to a pipeline. */
    @Deprecated("deprecated")
    fun create(pipelineId: String, params: FileCreateParams): List<PipelineFile> =
        create(pipelineId, params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        pipelineId: String,
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PipelineFile> =
        create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see create */
    @Deprecated("deprecated")
    fun create(params: FileCreateParams): List<PipelineFile> = create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PipelineFile>

    /** Update a file for a pipeline. */
    @Deprecated("deprecated")
    fun update(fileId: String, params: FileUpdateParams): PipelineFile =
        update(fileId, params, RequestOptions.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        fileId: String,
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineFile = update(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see update */
    @Deprecated("deprecated")
    fun update(params: FileUpdateParams): PipelineFile = update(params, RequestOptions.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineFile

    /** List files for a pipeline with optional filtering, sorting, and pagination. */
    @Deprecated("deprecated")
    fun list(pipelineId: String): FileListPage = list(pipelineId, FileListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        pipelineId: String,
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListPage = list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see list */
    @Deprecated("deprecated")
    fun list(pipelineId: String, params: FileListParams = FileListParams.none()): FileListPage =
        list(pipelineId, params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListPage

    /** @see list */
    @Deprecated("deprecated")
    fun list(params: FileListParams): FileListPage = list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(pipelineId: String, requestOptions: RequestOptions): FileListPage =
        list(pipelineId, FileListParams.none(), requestOptions)

    /** Delete a file from a pipeline. */
    @Deprecated("deprecated")
    fun delete(fileId: String, params: FileDeleteParams) =
        delete(fileId, params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        fileId: String,
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: FileDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: FileDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get status of a file for a pipeline. */
    @Deprecated("deprecated")
    fun getStatus(fileId: String, params: FileGetStatusParams): ManagedIngestionStatusResponse =
        getStatus(fileId, params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        fileId: String,
        params: FileGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse =
        getStatus(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(params: FileGetStatusParams): ManagedIngestionStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        params: FileGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse

    /** Get files for a pipeline. */
    @Deprecated("deprecated")
    fun getStatusCounts(pipelineId: String): FileGetStatusCountsResponse =
        getStatusCounts(pipelineId, FileGetStatusCountsParams.none())

    /** @see getStatusCounts */
    @Deprecated("deprecated")
    fun getStatusCounts(
        pipelineId: String,
        params: FileGetStatusCountsParams = FileGetStatusCountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileGetStatusCountsResponse =
        getStatusCounts(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see getStatusCounts */
    @Deprecated("deprecated")
    fun getStatusCounts(
        pipelineId: String,
        params: FileGetStatusCountsParams = FileGetStatusCountsParams.none(),
    ): FileGetStatusCountsResponse = getStatusCounts(pipelineId, params, RequestOptions.none())

    /** @see getStatusCounts */
    @Deprecated("deprecated")
    fun getStatusCounts(
        params: FileGetStatusCountsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileGetStatusCountsResponse

    /** @see getStatusCounts */
    @Deprecated("deprecated")
    fun getStatusCounts(params: FileGetStatusCountsParams): FileGetStatusCountsResponse =
        getStatusCounts(params, RequestOptions.none())

    /** @see getStatusCounts */
    @Deprecated("deprecated")
    fun getStatusCounts(
        pipelineId: String,
        requestOptions: RequestOptions,
    ): FileGetStatusCountsResponse =
        getStatusCounts(pipelineId, FileGetStatusCountsParams.none(), requestOptions)

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/files`, but is
         * otherwise the same as [FileService.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: FileCreateParams,
        ): HttpResponseFor<List<PipelineFile>> = create(pipelineId, params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            pipelineId: String,
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PipelineFile>> =
            create(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: FileCreateParams): HttpResponseFor<List<PipelineFile>> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PipelineFile>>

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/files/{file_id}`,
         * but is otherwise the same as [FileService.update].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(fileId: String, params: FileUpdateParams): HttpResponseFor<PipelineFile> =
            update(fileId, params, RequestOptions.none())

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(
            fileId: String,
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineFile> =
            update(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(params: FileUpdateParams): HttpResponseFor<PipelineFile> =
            update(params, RequestOptions.none())

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineFile>

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines/{pipeline_id}/files2`, but is
         * otherwise the same as [FileService.list].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(pipelineId: String): HttpResponseFor<FileListPage> =
            list(pipelineId, FileListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            pipelineId: String,
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListPage> =
            list(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            pipelineId: String,
            params: FileListParams = FileListParams.none(),
        ): HttpResponseFor<FileListPage> = list(pipelineId, params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListPage>

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(params: FileListParams): HttpResponseFor<FileListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileListPage> = list(pipelineId, FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/pipelines/{pipeline_id}/files/{file_id}`,
         * but is otherwise the same as [FileService.delete].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(fileId: String, params: FileDeleteParams): HttpResponse =
            delete(fileId, params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(params: FileDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        @MustBeClosed
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/files/{file_id}/status`, but is otherwise the same as
         * [FileService.getStatus].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            fileId: String,
            params: FileGetStatusParams,
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(fileId, params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            fileId: String,
            params: FileGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            params: FileGetStatusParams
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            params: FileGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/files/status-counts`, but is otherwise the same as
         * [FileService.getStatusCounts].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatusCounts(pipelineId: String): HttpResponseFor<FileGetStatusCountsResponse> =
            getStatusCounts(pipelineId, FileGetStatusCountsParams.none())

        /** @see getStatusCounts */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatusCounts(
            pipelineId: String,
            params: FileGetStatusCountsParams = FileGetStatusCountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileGetStatusCountsResponse> =
            getStatusCounts(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see getStatusCounts */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatusCounts(
            pipelineId: String,
            params: FileGetStatusCountsParams = FileGetStatusCountsParams.none(),
        ): HttpResponseFor<FileGetStatusCountsResponse> =
            getStatusCounts(pipelineId, params, RequestOptions.none())

        /** @see getStatusCounts */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatusCounts(
            params: FileGetStatusCountsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileGetStatusCountsResponse>

        /** @see getStatusCounts */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatusCounts(
            params: FileGetStatusCountsParams
        ): HttpResponseFor<FileGetStatusCountsResponse> =
            getStatusCounts(params, RequestOptions.none())

        /** @see getStatusCounts */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatusCounts(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileGetStatusCountsResponse> =
            getStatusCounts(pipelineId, FileGetStatusCountsParams.none(), requestOptions)
    }
}
