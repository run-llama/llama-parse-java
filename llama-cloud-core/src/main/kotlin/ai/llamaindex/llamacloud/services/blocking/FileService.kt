// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.files.FileCreateParams
import ai.llamaindex.llamacloud.models.files.FileCreateResponse
import ai.llamaindex.llamacloud.models.files.FileDeleteParams
import ai.llamaindex.llamacloud.models.files.FileGetParams
import ai.llamaindex.llamacloud.models.files.FileListPage
import ai.llamaindex.llamacloud.models.files.FileListParams
import ai.llamaindex.llamacloud.models.files.FileQueryParams
import ai.llamaindex.llamacloud.models.files.FileQueryResponse
import ai.llamaindex.llamacloud.models.files.PresignedUrl
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

    /**
     * Upload a file using multipart/form-data.
     *
     * Set `purpose` to indicate how the file will be used: `user_data`, `parse`, `extract`,
     * `classify`, `split`, `sheet`, or `agent_app`.
     *
     * Returns the created file metadata including its ID for use in subsequent parse, extract, or
     * classify operations.
     */
    fun create(params: FileCreateParams): FileCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileCreateResponse

    /**
     * List files with optional filtering and pagination.
     *
     * Filter by `file_name`, `file_ids`, or `external_file_id`. Supports cursor-based pagination
     * and custom ordering.
     */
    fun list(): FileListPage = list(FileListParams.none())

    /** @see list */
    fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListPage

    /** @see list */
    fun list(params: FileListParams = FileListParams.none()): FileListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FileListPage =
        list(FileListParams.none(), requestOptions)

    /** Delete a file from the project. */
    fun delete(fileId: String) = delete(fileId, FileDeleteParams.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileDeleteParams = FileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(fileId: String, params: FileDeleteParams = FileDeleteParams.none()) =
        delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FileDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: FileDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(fileId: String, requestOptions: RequestOptions) =
        delete(fileId, FileDeleteParams.none(), requestOptions)

    /** Get a presigned URL to download the file content. */
    fun get(fileId: String): PresignedUrl = get(fileId, FileGetParams.none())

    /** @see get */
    fun get(
        fileId: String,
        params: FileGetParams = FileGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PresignedUrl = get(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see get */
    fun get(fileId: String, params: FileGetParams = FileGetParams.none()): PresignedUrl =
        get(fileId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FileGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PresignedUrl

    /** @see get */
    fun get(params: FileGetParams): PresignedUrl = get(params, RequestOptions.none())

    /** @see get */
    fun get(fileId: String, requestOptions: RequestOptions): PresignedUrl =
        get(fileId, FileGetParams.none(), requestOptions)

    /** Query files with filtering and pagination. Deprecated: use `GET /files`. */
    @Deprecated("Use the GET /files endpoint instead")
    fun query(): FileQueryResponse = query(FileQueryParams.none())

    /** @see query */
    @Deprecated("Use the GET /files endpoint instead")
    fun query(
        params: FileQueryParams = FileQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileQueryResponse

    /** @see query */
    @Deprecated("Use the GET /files endpoint instead")
    fun query(params: FileQueryParams = FileQueryParams.none()): FileQueryResponse =
        query(params, RequestOptions.none())

    /** @see query */
    @Deprecated("Use the GET /files endpoint instead")
    fun query(requestOptions: RequestOptions): FileQueryResponse =
        query(FileQueryParams.none(), requestOptions)

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/files`, but is otherwise the same as
         * [FileService.create].
         */
        @MustBeClosed
        fun create(params: FileCreateParams): HttpResponseFor<FileCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/files`, but is otherwise the same as
         * [FileService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<FileListPage> = list(FileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: FileListParams = FileListParams.none()): HttpResponseFor<FileListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FileListPage> =
            list(FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/files/{file_id}`, but is otherwise
         * the same as [FileService.delete].
         */
        @MustBeClosed
        fun delete(fileId: String): HttpResponse = delete(fileId, FileDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileDeleteParams = FileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileDeleteParams = FileDeleteParams.none(),
        ): HttpResponse = delete(fileId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FileDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(fileId: String, requestOptions: RequestOptions): HttpResponse =
            delete(fileId, FileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/files/{file_id}/content`, but is
         * otherwise the same as [FileService.get].
         */
        @MustBeClosed
        fun get(fileId: String): HttpResponseFor<PresignedUrl> = get(fileId, FileGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            fileId: String,
            params: FileGetParams = FileGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PresignedUrl> =
            get(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            fileId: String,
            params: FileGetParams = FileGetParams.none(),
        ): HttpResponseFor<PresignedUrl> = get(fileId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PresignedUrl>

        /** @see get */
        @MustBeClosed
        fun get(params: FileGetParams): HttpResponseFor<PresignedUrl> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(fileId: String, requestOptions: RequestOptions): HttpResponseFor<PresignedUrl> =
            get(fileId, FileGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/files/query`, but is otherwise the
         * same as [FileService.query].
         */
        @Deprecated("Use the GET /files endpoint instead")
        @MustBeClosed
        fun query(): HttpResponseFor<FileQueryResponse> = query(FileQueryParams.none())

        /** @see query */
        @Deprecated("Use the GET /files endpoint instead")
        @MustBeClosed
        fun query(
            params: FileQueryParams = FileQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileQueryResponse>

        /** @see query */
        @Deprecated("Use the GET /files endpoint instead")
        @MustBeClosed
        fun query(
            params: FileQueryParams = FileQueryParams.none()
        ): HttpResponseFor<FileQueryResponse> = query(params, RequestOptions.none())

        /** @see query */
        @Deprecated("Use the GET /files endpoint instead")
        @MustBeClosed
        fun query(requestOptions: RequestOptions): HttpResponseFor<FileQueryResponse> =
            query(FileQueryParams.none(), requestOptions)
    }
}
