// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryCreateParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryCreateResponse
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryDeleteParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryGetParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryGetResponse
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryListPage
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryListParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryUpdateParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryUpdateResponse
import ai.llamaindex.llamacloud.services.blocking.beta.directories.FileService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface DirectoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryService

    fun files(): FileService

    /** Create a new directory within the specified project. */
    fun create(params: DirectoryCreateParams): DirectoryCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DirectoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectoryCreateResponse

    /** Update directory metadata. */
    fun update(directoryId: String): DirectoryUpdateResponse =
        update(directoryId, DirectoryUpdateParams.none())

    /** @see update */
    fun update(
        directoryId: String,
        params: DirectoryUpdateParams = DirectoryUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectoryUpdateResponse =
        update(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see update */
    fun update(
        directoryId: String,
        params: DirectoryUpdateParams = DirectoryUpdateParams.none(),
    ): DirectoryUpdateResponse = update(directoryId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DirectoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectoryUpdateResponse

    /** @see update */
    fun update(params: DirectoryUpdateParams): DirectoryUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(directoryId: String, requestOptions: RequestOptions): DirectoryUpdateResponse =
        update(directoryId, DirectoryUpdateParams.none(), requestOptions)

    /** List Directories */
    fun list(): DirectoryListPage = list(DirectoryListParams.none())

    /** @see list */
    fun list(
        params: DirectoryListParams = DirectoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectoryListPage

    /** @see list */
    fun list(params: DirectoryListParams = DirectoryListParams.none()): DirectoryListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DirectoryListPage =
        list(DirectoryListParams.none(), requestOptions)

    /** Permanently delete a directory. */
    fun delete(directoryId: String) = delete(directoryId, DirectoryDeleteParams.none())

    /** @see delete */
    fun delete(
        directoryId: String,
        params: DirectoryDeleteParams = DirectoryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see delete */
    fun delete(directoryId: String, params: DirectoryDeleteParams = DirectoryDeleteParams.none()) =
        delete(directoryId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DirectoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: DirectoryDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(directoryId: String, requestOptions: RequestOptions) =
        delete(directoryId, DirectoryDeleteParams.none(), requestOptions)

    /** Retrieve a directory by its identifier. */
    fun get(directoryId: String): DirectoryGetResponse = get(directoryId, DirectoryGetParams.none())

    /** @see get */
    fun get(
        directoryId: String,
        params: DirectoryGetParams = DirectoryGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectoryGetResponse =
        get(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see get */
    fun get(
        directoryId: String,
        params: DirectoryGetParams = DirectoryGetParams.none(),
    ): DirectoryGetResponse = get(directoryId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DirectoryGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectoryGetResponse

    /** @see get */
    fun get(params: DirectoryGetParams): DirectoryGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(directoryId: String, requestOptions: RequestOptions): DirectoryGetResponse =
        get(directoryId, DirectoryGetParams.none(), requestOptions)

    /** A view of [DirectoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryService.WithRawResponse

        fun files(): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/directories`, but is otherwise the
         * same as [DirectoryService.create].
         */
        @MustBeClosed
        fun create(params: DirectoryCreateParams): HttpResponseFor<DirectoryCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DirectoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectoryCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/beta/directories/{directory_id}`, but is
         * otherwise the same as [DirectoryService.update].
         */
        @MustBeClosed
        fun update(directoryId: String): HttpResponseFor<DirectoryUpdateResponse> =
            update(directoryId, DirectoryUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            directoryId: String,
            params: DirectoryUpdateParams = DirectoryUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectoryUpdateResponse> =
            update(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            directoryId: String,
            params: DirectoryUpdateParams = DirectoryUpdateParams.none(),
        ): HttpResponseFor<DirectoryUpdateResponse> =
            update(directoryId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DirectoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectoryUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: DirectoryUpdateParams): HttpResponseFor<DirectoryUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            directoryId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirectoryUpdateResponse> =
            update(directoryId, DirectoryUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/directories`, but is otherwise the same
         * as [DirectoryService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DirectoryListPage> = list(DirectoryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DirectoryListParams = DirectoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectoryListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DirectoryListParams = DirectoryListParams.none()
        ): HttpResponseFor<DirectoryListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DirectoryListPage> =
            list(DirectoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/directories/{directory_id}`, but is
         * otherwise the same as [DirectoryService.delete].
         */
        @MustBeClosed
        fun delete(directoryId: String): HttpResponse =
            delete(directoryId, DirectoryDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            directoryId: String,
            params: DirectoryDeleteParams = DirectoryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            directoryId: String,
            params: DirectoryDeleteParams = DirectoryDeleteParams.none(),
        ): HttpResponse = delete(directoryId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DirectoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DirectoryDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(directoryId: String, requestOptions: RequestOptions): HttpResponse =
            delete(directoryId, DirectoryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/directories/{directory_id}`, but is
         * otherwise the same as [DirectoryService.get].
         */
        @MustBeClosed
        fun get(directoryId: String): HttpResponseFor<DirectoryGetResponse> =
            get(directoryId, DirectoryGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            directoryId: String,
            params: DirectoryGetParams = DirectoryGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectoryGetResponse> =
            get(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            directoryId: String,
            params: DirectoryGetParams = DirectoryGetParams.none(),
        ): HttpResponseFor<DirectoryGetResponse> = get(directoryId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DirectoryGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectoryGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: DirectoryGetParams): HttpResponseFor<DirectoryGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            directoryId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirectoryGetResponse> =
            get(directoryId, DirectoryGetParams.none(), requestOptions)
    }
}
