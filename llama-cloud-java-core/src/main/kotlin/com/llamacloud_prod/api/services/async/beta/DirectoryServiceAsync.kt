// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.directories.DirectoryCreateParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryCreateResponse
import com.llamacloud_prod.api.models.beta.directories.DirectoryDeleteParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryGetParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryGetResponse
import com.llamacloud_prod.api.models.beta.directories.DirectoryListPageAsync
import com.llamacloud_prod.api.models.beta.directories.DirectoryListParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryUpdateParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryUpdateResponse
import com.llamacloud_prod.api.services.async.beta.directories.FileServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DirectoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryServiceAsync

    fun files(): FileServiceAsync

    /** Create a new directory within the specified project. */
    fun create(params: DirectoryCreateParams): CompletableFuture<DirectoryCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DirectoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectoryCreateResponse>

    /** Update directory metadata. */
    fun update(directoryId: String): CompletableFuture<DirectoryUpdateResponse> =
        update(directoryId, DirectoryUpdateParams.none())

    /** @see update */
    fun update(
        directoryId: String,
        params: DirectoryUpdateParams = DirectoryUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectoryUpdateResponse> =
        update(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see update */
    fun update(
        directoryId: String,
        params: DirectoryUpdateParams = DirectoryUpdateParams.none(),
    ): CompletableFuture<DirectoryUpdateResponse> =
        update(directoryId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DirectoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectoryUpdateResponse>

    /** @see update */
    fun update(params: DirectoryUpdateParams): CompletableFuture<DirectoryUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        directoryId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirectoryUpdateResponse> =
        update(directoryId, DirectoryUpdateParams.none(), requestOptions)

    /** List Directories */
    fun list(): CompletableFuture<DirectoryListPageAsync> = list(DirectoryListParams.none())

    /** @see list */
    fun list(
        params: DirectoryListParams = DirectoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectoryListPageAsync>

    /** @see list */
    fun list(
        params: DirectoryListParams = DirectoryListParams.none()
    ): CompletableFuture<DirectoryListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DirectoryListPageAsync> =
        list(DirectoryListParams.none(), requestOptions)

    /** Permanently delete a directory. */
    fun delete(directoryId: String): CompletableFuture<Void?> =
        delete(directoryId, DirectoryDeleteParams.none())

    /** @see delete */
    fun delete(
        directoryId: String,
        params: DirectoryDeleteParams = DirectoryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see delete */
    fun delete(
        directoryId: String,
        params: DirectoryDeleteParams = DirectoryDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(directoryId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DirectoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DirectoryDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(directoryId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(directoryId, DirectoryDeleteParams.none(), requestOptions)

    /** Retrieve a directory by its identifier. */
    fun get(directoryId: String): CompletableFuture<DirectoryGetResponse> =
        get(directoryId, DirectoryGetParams.none())

    /** @see get */
    fun get(
        directoryId: String,
        params: DirectoryGetParams = DirectoryGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectoryGetResponse> =
        get(params.toBuilder().directoryId(directoryId).build(), requestOptions)

    /** @see get */
    fun get(
        directoryId: String,
        params: DirectoryGetParams = DirectoryGetParams.none(),
    ): CompletableFuture<DirectoryGetResponse> = get(directoryId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DirectoryGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectoryGetResponse>

    /** @see get */
    fun get(params: DirectoryGetParams): CompletableFuture<DirectoryGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        directoryId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirectoryGetResponse> =
        get(directoryId, DirectoryGetParams.none(), requestOptions)

    /**
     * A view of [DirectoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirectoryServiceAsync.WithRawResponse

        fun files(): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/directories`, but is otherwise the
         * same as [DirectoryServiceAsync.create].
         */
        fun create(
            params: DirectoryCreateParams
        ): CompletableFuture<HttpResponseFor<DirectoryCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DirectoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/beta/directories/{directory_id}`, but is
         * otherwise the same as [DirectoryServiceAsync.update].
         */
        fun update(
            directoryId: String
        ): CompletableFuture<HttpResponseFor<DirectoryUpdateResponse>> =
            update(directoryId, DirectoryUpdateParams.none())

        /** @see update */
        fun update(
            directoryId: String,
            params: DirectoryUpdateParams = DirectoryUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryUpdateResponse>> =
            update(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see update */
        fun update(
            directoryId: String,
            params: DirectoryUpdateParams = DirectoryUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryUpdateResponse>> =
            update(directoryId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DirectoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryUpdateResponse>>

        /** @see update */
        fun update(
            params: DirectoryUpdateParams
        ): CompletableFuture<HttpResponseFor<DirectoryUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            directoryId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirectoryUpdateResponse>> =
            update(directoryId, DirectoryUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/directories`, but is otherwise the same
         * as [DirectoryServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DirectoryListPageAsync>> =
            list(DirectoryListParams.none())

        /** @see list */
        fun list(
            params: DirectoryListParams = DirectoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryListPageAsync>>

        /** @see list */
        fun list(
            params: DirectoryListParams = DirectoryListParams.none()
        ): CompletableFuture<HttpResponseFor<DirectoryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DirectoryListPageAsync>> =
            list(DirectoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/directories/{directory_id}`, but is
         * otherwise the same as [DirectoryServiceAsync.delete].
         */
        fun delete(directoryId: String): CompletableFuture<HttpResponse> =
            delete(directoryId, DirectoryDeleteParams.none())

        /** @see delete */
        fun delete(
            directoryId: String,
            params: DirectoryDeleteParams = DirectoryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see delete */
        fun delete(
            directoryId: String,
            params: DirectoryDeleteParams = DirectoryDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(directoryId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DirectoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DirectoryDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            directoryId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(directoryId, DirectoryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/directories/{directory_id}`, but is
         * otherwise the same as [DirectoryServiceAsync.get].
         */
        fun get(directoryId: String): CompletableFuture<HttpResponseFor<DirectoryGetResponse>> =
            get(directoryId, DirectoryGetParams.none())

        /** @see get */
        fun get(
            directoryId: String,
            params: DirectoryGetParams = DirectoryGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryGetResponse>> =
            get(params.toBuilder().directoryId(directoryId).build(), requestOptions)

        /** @see get */
        fun get(
            directoryId: String,
            params: DirectoryGetParams = DirectoryGetParams.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryGetResponse>> =
            get(directoryId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DirectoryGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryGetResponse>>

        /** @see get */
        fun get(
            params: DirectoryGetParams
        ): CompletableFuture<HttpResponseFor<DirectoryGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            directoryId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirectoryGetResponse>> =
            get(directoryId, DirectoryGetParams.none(), requestOptions)
    }
}
