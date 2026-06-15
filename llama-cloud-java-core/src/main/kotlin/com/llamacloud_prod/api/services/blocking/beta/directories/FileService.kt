// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta.directories

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.directories.files.FileAddParams
import com.llamacloud_prod.api.models.beta.directories.files.FileAddResponse
import com.llamacloud_prod.api.models.beta.directories.files.FileDeleteParams
import com.llamacloud_prod.api.models.beta.directories.files.FileGetParams
import com.llamacloud_prod.api.models.beta.directories.files.FileGetResponse
import com.llamacloud_prod.api.models.beta.directories.files.FileListPage
import com.llamacloud_prod.api.models.beta.directories.files.FileListParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUpdateParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUpdateResponse
import com.llamacloud_prod.api.models.beta.directories.files.FileUploadParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUploadResponse
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
     * Update directory-file metadata by `directory_file_id`; set `directory_id` to move the file to
     * a different directory. To resolve from `unique_id`, list with a filter first.
     */
    fun update(directoryFileId: String, params: FileUpdateParams): FileUpdateResponse =
        update(directoryFileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        directoryFileId: String,
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUpdateResponse =
        update(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

    /** @see update */
    fun update(params: FileUpdateParams): FileUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUpdateResponse

    /** List all files within the specified directory with optional filtering and pagination. */
    fun list(directoryId: String): FileListPage = list(directoryId, FileListParams.none())

    /** @see list */
    fun list(
        directoryId: String,
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListPage = list(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see list */
    fun list(directoryId: String, params: FileListParams = FileListParams.none()): FileListPage =
        list(directoryId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListPage

    /** @see list */
    fun list(params: FileListParams): FileListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(directoryId: String, requestOptions: RequestOptions): FileListPage =
        list(directoryId, FileListParams.none(), requestOptions)

    /**
     * Delete a directory file by `directory_file_id`; to resolve from `unique_id`, list with a
     * filter first.
     */
    fun delete(directoryFileId: String, params: FileDeleteParams) =
        delete(directoryFileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        directoryFileId: String,
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

    /** @see delete */
    fun delete(params: FileDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FileDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Create a new file within the specified directory; the directory must exist in the project and
     * `file_id` must reference an existing file.
     */
    fun add(directoryId: String, params: FileAddParams): FileAddResponse =
        add(directoryId, params, RequestOptions.none())

    /** @see add */
    fun add(
        directoryId: String,
        params: FileAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileAddResponse = add(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see add */
    fun add(params: FileAddParams): FileAddResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: FileAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileAddResponse

    /**
     * Get a directory file by `directory_file_id`; to look up by `unique_id`, use the list endpoint
     * with a filter.
     */
    fun get(directoryFileId: String, params: FileGetParams): FileGetResponse =
        get(directoryFileId, params, RequestOptions.none())

    /** @see get */
    fun get(
        directoryFileId: String,
        params: FileGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileGetResponse =
        get(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

    /** @see get */
    fun get(params: FileGetParams): FileGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FileGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileGetResponse

    /**
     * Upload a file and create its directory entry in one call; `unique_id` / `display_name`
     * default to values derived from file metadata.
     */
    fun upload(directoryId: String, params: FileUploadParams): FileUploadResponse =
        upload(directoryId, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        directoryId: String,
        params: FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUploadResponse =
        upload(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see upload */
    fun upload(params: FileUploadParams): FileUploadResponse = upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUploadResponse

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/beta/directories/{directory_id}/files/{directory_file_id}`, but is otherwise the
         * same as [FileService.update].
         */
        @MustBeClosed
        fun update(
            directoryFileId: String,
            params: FileUpdateParams,
        ): HttpResponseFor<FileUpdateResponse> =
            update(directoryFileId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            directoryFileId: String,
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUpdateResponse> =
            update(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FileUpdateParams): HttpResponseFor<FileUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/directories/{directory_id}/files`, but
         * is otherwise the same as [FileService.list].
         */
        @MustBeClosed
        fun list(directoryId: String): HttpResponseFor<FileListPage> =
            list(directoryId, FileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            directoryId: String,
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListPage> =
            list(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            directoryId: String,
            params: FileListParams = FileListParams.none(),
        ): HttpResponseFor<FileListPage> = list(directoryId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: FileListParams): HttpResponseFor<FileListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            directoryId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileListPage> = list(directoryId, FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/beta/directories/{directory_id}/files/{directory_file_id}`, but is otherwise the
         * same as [FileService.delete].
         */
        @MustBeClosed
        fun delete(directoryFileId: String, params: FileDeleteParams): HttpResponse =
            delete(directoryFileId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            directoryFileId: String,
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: FileDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/directories/{directory_id}/files`, but
         * is otherwise the same as [FileService.add].
         */
        @MustBeClosed
        fun add(directoryId: String, params: FileAddParams): HttpResponseFor<FileAddResponse> =
            add(directoryId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            directoryId: String,
            params: FileAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileAddResponse> =
            add(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: FileAddParams): HttpResponseFor<FileAddResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: FileAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileAddResponse>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/beta/directories/{directory_id}/files/{directory_file_id}`, but is otherwise the
         * same as [FileService.get].
         */
        @MustBeClosed
        fun get(directoryFileId: String, params: FileGetParams): HttpResponseFor<FileGetResponse> =
            get(directoryFileId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            directoryFileId: String,
            params: FileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileGetResponse> =
            get(params.toBuilder().directoryFileId(directoryFileId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: FileGetParams): HttpResponseFor<FileGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileGetResponse>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/beta/directories/{directory_id}/files/upload`, but is otherwise the same as
         * [FileService.upload].
         */
        @MustBeClosed
        fun upload(
            directoryId: String,
            params: FileUploadParams,
        ): HttpResponseFor<FileUploadResponse> = upload(directoryId, params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            directoryId: String,
            params: FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUploadResponse> =
            upload(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(params: FileUploadParams): HttpResponseFor<FileUploadResponse> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUploadResponse>
    }
}
