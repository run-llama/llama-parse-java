// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.files.FileCreateParams
import com.llamacloud_prod.api.models.files.FileCreateResponse
import com.llamacloud_prod.api.models.files.FileDeleteParams
import com.llamacloud_prod.api.models.files.FileGetParams
import com.llamacloud_prod.api.models.files.FileListPageAsync
import com.llamacloud_prod.api.models.files.FileListParams
import com.llamacloud_prod.api.models.files.FileQueryParams
import com.llamacloud_prod.api.models.files.FileQueryResponse
import com.llamacloud_prod.api.models.files.PresignedUrl
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

    /**
     * Upload a file using multipart/form-data.
     *
     * Set `purpose` to indicate how the file will be used: `user_data`, `parse`, `extract`,
     * `classify`, `split`, `sheet`, or `agent_app`.
     *
     * Returns the created file metadata including its ID for use in subsequent parse, extract, or
     * classify operations.
     */
    fun create(params: FileCreateParams): CompletableFuture<FileCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileCreateResponse>

    /**
     * List files with optional filtering and pagination.
     *
     * Filter by `file_name`, `file_ids`, or `external_file_id`. Supports cursor-based pagination
     * and custom ordering.
     */
    fun list(): CompletableFuture<FileListPageAsync> = list(FileListParams.none())

    /** @see list */
    fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListPageAsync>

    /** @see list */
    fun list(params: FileListParams = FileListParams.none()): CompletableFuture<FileListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FileListPageAsync> =
        list(FileListParams.none(), requestOptions)

    /** Delete a file from the project. */
    fun delete(fileId: String): CompletableFuture<Void?> = delete(fileId, FileDeleteParams.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileDeleteParams = FileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileDeleteParams = FileDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FileDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(fileId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(fileId, FileDeleteParams.none(), requestOptions)

    /** Get a presigned URL to download the file content. */
    fun get(fileId: String): CompletableFuture<PresignedUrl> = get(fileId, FileGetParams.none())

    /** @see get */
    fun get(
        fileId: String,
        params: FileGetParams = FileGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PresignedUrl> =
        get(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see get */
    fun get(
        fileId: String,
        params: FileGetParams = FileGetParams.none(),
    ): CompletableFuture<PresignedUrl> = get(fileId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FileGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PresignedUrl>

    /** @see get */
    fun get(params: FileGetParams): CompletableFuture<PresignedUrl> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(fileId: String, requestOptions: RequestOptions): CompletableFuture<PresignedUrl> =
        get(fileId, FileGetParams.none(), requestOptions)

    /** Query files with filtering and pagination. Deprecated: use `GET /files`. */
    @Deprecated("Use the GET /files endpoint instead")
    fun query(): CompletableFuture<FileQueryResponse> = query(FileQueryParams.none())

    /** @see query */
    @Deprecated("Use the GET /files endpoint instead")
    fun query(
        params: FileQueryParams = FileQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileQueryResponse>

    /** @see query */
    @Deprecated("Use the GET /files endpoint instead")
    fun query(
        params: FileQueryParams = FileQueryParams.none()
    ): CompletableFuture<FileQueryResponse> = query(params, RequestOptions.none())

    /** @see query */
    @Deprecated("Use the GET /files endpoint instead")
    fun query(requestOptions: RequestOptions): CompletableFuture<FileQueryResponse> =
        query(FileQueryParams.none(), requestOptions)

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/files`, but is otherwise the same as
         * [FileServiceAsync.create].
         */
        fun create(
            params: FileCreateParams
        ): CompletableFuture<HttpResponseFor<FileCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/files`, but is otherwise the same as
         * [FileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(FileListParams.none())

        /** @see list */
        fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>>

        /** @see list */
        fun list(
            params: FileListParams = FileListParams.none()
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/files/{file_id}`, but is otherwise
         * the same as [FileServiceAsync.delete].
         */
        fun delete(fileId: String): CompletableFuture<HttpResponse> =
            delete(fileId, FileDeleteParams.none())

        /** @see delete */
        fun delete(
            fileId: String,
            params: FileDeleteParams = FileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        fun delete(
            fileId: String,
            params: FileDeleteParams = FileDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(fileId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FileDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(fileId, FileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/files/{file_id}/content`, but is
         * otherwise the same as [FileServiceAsync.get].
         */
        fun get(fileId: String): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            get(fileId, FileGetParams.none())

        /** @see get */
        fun get(
            fileId: String,
            params: FileGetParams = FileGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            get(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see get */
        fun get(
            fileId: String,
            params: FileGetParams = FileGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            get(fileId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PresignedUrl>>

        /** @see get */
        fun get(params: FileGetParams): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            get(fileId, FileGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/files/query`, but is otherwise the
         * same as [FileServiceAsync.query].
         */
        @Deprecated("Use the GET /files endpoint instead")
        fun query(): CompletableFuture<HttpResponseFor<FileQueryResponse>> =
            query(FileQueryParams.none())

        /** @see query */
        @Deprecated("Use the GET /files endpoint instead")
        fun query(
            params: FileQueryParams = FileQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileQueryResponse>>

        /** @see query */
        @Deprecated("Use the GET /files endpoint instead")
        fun query(
            params: FileQueryParams = FileQueryParams.none()
        ): CompletableFuture<HttpResponseFor<FileQueryResponse>> =
            query(params, RequestOptions.none())

        /** @see query */
        @Deprecated("Use the GET /files endpoint instead")
        fun query(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FileQueryResponse>> =
            query(FileQueryParams.none(), requestOptions)
    }
}
