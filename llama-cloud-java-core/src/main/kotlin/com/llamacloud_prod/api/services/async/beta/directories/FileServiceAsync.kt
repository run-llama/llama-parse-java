// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta.directories

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.directories.files.FileAddParams
import com.llamacloud_prod.api.models.beta.directories.files.FileAddResponse
import com.llamacloud_prod.api.models.beta.directories.files.FileDeleteParams
import com.llamacloud_prod.api.models.beta.directories.files.FileGetParams
import com.llamacloud_prod.api.models.beta.directories.files.FileGetResponse
import com.llamacloud_prod.api.models.beta.directories.files.FileListPageAsync
import com.llamacloud_prod.api.models.beta.directories.files.FileListParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUpdateParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUpdateResponse
import com.llamacloud_prod.api.models.beta.directories.files.FileUploadParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUploadResponse
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
     * Update directory-file metadata by `directory_file_id`; set `directory_id` to move the file to
     * a different directory. To resolve from `unique_id`, list with a filter first.
     */
    fun update(
        directoryFileId: String,
        params: FileUpdateParams,
    ): CompletableFuture<FileUpdateResponse> =
        update(directoryFileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        directoryFileId: String,
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileUpdateResponse> =
        update(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

    /** @see update */
    fun update(params: FileUpdateParams): CompletableFuture<FileUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileUpdateResponse>

    /** List all files within the specified directory with optional filtering and pagination. */
    fun list(directoryId: String): CompletableFuture<FileListPageAsync> =
        list(directoryId, FileListParams.none())

    /** @see list */
    fun list(
        directoryId: String,
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListPageAsync> =
        list(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see list */
    fun list(
        directoryId: String,
        params: FileListParams = FileListParams.none(),
    ): CompletableFuture<FileListPageAsync> = list(directoryId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListPageAsync>

    /** @see list */
    fun list(params: FileListParams): CompletableFuture<FileListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        directoryId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileListPageAsync> =
        list(directoryId, FileListParams.none(), requestOptions)

    /**
     * Delete a directory file by `directory_file_id`; to resolve from `unique_id`, list with a
     * filter first.
     */
    fun delete(directoryFileId: String, params: FileDeleteParams): CompletableFuture<Void?> =
        delete(directoryFileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        directoryFileId: String,
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

    /** @see delete */
    fun delete(params: FileDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Create a new file within the specified directory; the directory must exist in the project and
     * `file_id` must reference an existing file.
     */
    fun add(directoryId: String, params: FileAddParams): CompletableFuture<FileAddResponse> =
        add(directoryId, params, RequestOptions.none())

    /** @see add */
    fun add(
        directoryId: String,
        params: FileAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileAddResponse> =
        add(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see add */
    fun add(params: FileAddParams): CompletableFuture<FileAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: FileAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileAddResponse>

    /**
     * Get a directory file by `directory_file_id`; to look up by `unique_id`, use the list endpoint
     * with a filter.
     */
    fun get(directoryFileId: String, params: FileGetParams): CompletableFuture<FileGetResponse> =
        get(directoryFileId, params, RequestOptions.none())

    /** @see get */
    fun get(
        directoryFileId: String,
        params: FileGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileGetResponse> =
        get(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

    /** @see get */
    fun get(params: FileGetParams): CompletableFuture<FileGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FileGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileGetResponse>

    /**
     * Upload a file and create its directory entry in one call; `unique_id` / `display_name`
     * default to values derived from file metadata.
     */
    fun upload(
        directoryId: String,
        params: FileUploadParams,
    ): CompletableFuture<FileUploadResponse> = upload(directoryId, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        directoryId: String,
        params: FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileUploadResponse> =
        upload(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see upload */
    fun upload(params: FileUploadParams): CompletableFuture<FileUploadResponse> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileUploadResponse>

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/beta/directories/{directory_id}/files/{directory_file_id}`, but is otherwise the
         * same as [FileServiceAsync.update].
         */
        fun update(
            directoryFileId: String,
            params: FileUpdateParams,
        ): CompletableFuture<HttpResponseFor<FileUpdateResponse>> =
            update(directoryFileId, params, RequestOptions.none())

        /** @see update */
        fun update(
            directoryFileId: String,
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileUpdateResponse>> =
            update(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

        /** @see update */
        fun update(
            params: FileUpdateParams
        ): CompletableFuture<HttpResponseFor<FileUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/directories/{directory_id}/files`, but
         * is otherwise the same as [FileServiceAsync.list].
         */
        fun list(directoryId: String): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(directoryId, FileListParams.none())

        /** @see list */
        fun list(
            directoryId: String,
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see list */
        fun list(
            directoryId: String,
            params: FileListParams = FileListParams.none(),
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(directoryId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>>

        /** @see list */
        fun list(params: FileListParams): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            directoryId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(directoryId, FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/beta/directories/{directory_id}/files/{directory_file_id}`, but is otherwise the
         * same as [FileServiceAsync.delete].
         */
        fun delete(
            directoryFileId: String,
            params: FileDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(directoryFileId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            directoryFileId: String,
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

        /** @see delete */
        fun delete(params: FileDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/directories/{directory_id}/files`, but
         * is otherwise the same as [FileServiceAsync.add].
         */
        fun add(
            directoryId: String,
            params: FileAddParams,
        ): CompletableFuture<HttpResponseFor<FileAddResponse>> =
            add(directoryId, params, RequestOptions.none())

        /** @see add */
        fun add(
            directoryId: String,
            params: FileAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileAddResponse>> =
            add(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see add */
        fun add(params: FileAddParams): CompletableFuture<HttpResponseFor<FileAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: FileAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileAddResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/beta/directories/{directory_id}/files/{directory_file_id}`, but is otherwise the
         * same as [FileServiceAsync.get].
         */
        fun get(
            directoryFileId: String,
            params: FileGetParams,
        ): CompletableFuture<HttpResponseFor<FileGetResponse>> =
            get(directoryFileId, params, RequestOptions.none())

        /** @see get */
        fun get(
            directoryFileId: String,
            params: FileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileGetResponse>> =
            get(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

        /** @see get */
        fun get(params: FileGetParams): CompletableFuture<HttpResponseFor<FileGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileGetResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/beta/directories/{directory_id}/files/upload`, but is otherwise the same as
         * [FileServiceAsync.upload].
         */
        fun upload(
            directoryId: String,
            params: FileUploadParams,
        ): CompletableFuture<HttpResponseFor<FileUploadResponse>> =
            upload(directoryId, params, RequestOptions.none())

        /** @see upload */
        fun upload(
            directoryId: String,
            params: FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileUploadResponse>> =
            upload(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see upload */
        fun upload(
            params: FileUploadParams
        ): CompletableFuture<HttpResponseFor<FileUploadResponse>> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileUploadResponse>>
    }
}
