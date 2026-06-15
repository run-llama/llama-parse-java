// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.indexes.IndexCreateParams
import com.llamacloud_prod.api.models.beta.indexes.IndexCreateResponse
import com.llamacloud_prod.api.models.beta.indexes.IndexDeleteParams
import com.llamacloud_prod.api.models.beta.indexes.IndexGetParams
import com.llamacloud_prod.api.models.beta.indexes.IndexGetResponse
import com.llamacloud_prod.api.models.beta.indexes.IndexListPageAsync
import com.llamacloud_prod.api.models.beta.indexes.IndexListParams
import com.llamacloud_prod.api.models.beta.indexes.IndexSyncParams
import com.llamacloud_prod.api.models.beta.indexes.IndexSyncResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IndexServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndexServiceAsync

    /** Create a searchable index over a source directory. */
    fun create(params: IndexCreateParams): CompletableFuture<IndexCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IndexCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexCreateResponse>

    /** List indexes for the current project. */
    fun list(): CompletableFuture<IndexListPageAsync> = list(IndexListParams.none())

    /** @see list */
    fun list(
        params: IndexListParams = IndexListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexListPageAsync>

    /** @see list */
    fun list(
        params: IndexListParams = IndexListParams.none()
    ): CompletableFuture<IndexListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<IndexListPageAsync> =
        list(IndexListParams.none(), requestOptions)

    /** Delete an index. */
    fun delete(indexId: String): CompletableFuture<Void?> =
        delete(indexId, IndexDeleteParams.none())

    /** @see delete */
    fun delete(
        indexId: String,
        params: IndexDeleteParams = IndexDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().indexId(indexId).build(), requestOptions)

    /** @see delete */
    fun delete(
        indexId: String,
        params: IndexDeleteParams = IndexDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(indexId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IndexDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: IndexDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(indexId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(indexId, IndexDeleteParams.none(), requestOptions)

    /** Get an index by ID. */
    fun get(indexId: String): CompletableFuture<IndexGetResponse> =
        get(indexId, IndexGetParams.none())

    /** @see get */
    fun get(
        indexId: String,
        params: IndexGetParams = IndexGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexGetResponse> =
        get(params.toBuilder().indexId(indexId).build(), requestOptions)

    /** @see get */
    fun get(
        indexId: String,
        params: IndexGetParams = IndexGetParams.none(),
    ): CompletableFuture<IndexGetResponse> = get(indexId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: IndexGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexGetResponse>

    /** @see get */
    fun get(params: IndexGetParams): CompletableFuture<IndexGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(indexId: String, requestOptions: RequestOptions): CompletableFuture<IndexGetResponse> =
        get(indexId, IndexGetParams.none(), requestOptions)

    /**
     * Trigger a sync and export for an existing index, re-parsing changed files and exporting
     * updated chunks.
     */
    fun sync(indexId: String): CompletableFuture<IndexSyncResponse> =
        sync(indexId, IndexSyncParams.none())

    /** @see sync */
    fun sync(
        indexId: String,
        params: IndexSyncParams = IndexSyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexSyncResponse> =
        sync(params.toBuilder().indexId(indexId).build(), requestOptions)

    /** @see sync */
    fun sync(
        indexId: String,
        params: IndexSyncParams = IndexSyncParams.none(),
    ): CompletableFuture<IndexSyncResponse> = sync(indexId, params, RequestOptions.none())

    /** @see sync */
    fun sync(
        params: IndexSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexSyncResponse>

    /** @see sync */
    fun sync(params: IndexSyncParams): CompletableFuture<IndexSyncResponse> =
        sync(params, RequestOptions.none())

    /** @see sync */
    fun sync(
        indexId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexSyncResponse> = sync(indexId, IndexSyncParams.none(), requestOptions)

    /** A view of [IndexServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndexServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/indexes`, but is otherwise the same as
         * [IndexServiceAsync.create].
         */
        fun create(
            params: IndexCreateParams
        ): CompletableFuture<HttpResponseFor<IndexCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: IndexCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/indexes`, but is otherwise the same as
         * [IndexServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<IndexListPageAsync>> =
            list(IndexListParams.none())

        /** @see list */
        fun list(
            params: IndexListParams = IndexListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexListPageAsync>>

        /** @see list */
        fun list(
            params: IndexListParams = IndexListParams.none()
        ): CompletableFuture<HttpResponseFor<IndexListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IndexListPageAsync>> =
            list(IndexListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/indexes/{index_id}`, but is otherwise the
         * same as [IndexServiceAsync.delete].
         */
        fun delete(indexId: String): CompletableFuture<HttpResponse> =
            delete(indexId, IndexDeleteParams.none())

        /** @see delete */
        fun delete(
            indexId: String,
            params: IndexDeleteParams = IndexDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().indexId(indexId).build(), requestOptions)

        /** @see delete */
        fun delete(
            indexId: String,
            params: IndexDeleteParams = IndexDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(indexId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: IndexDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: IndexDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            indexId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(indexId, IndexDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/indexes/{index_id}`, but is otherwise the
         * same as [IndexServiceAsync.get].
         */
        fun get(indexId: String): CompletableFuture<HttpResponseFor<IndexGetResponse>> =
            get(indexId, IndexGetParams.none())

        /** @see get */
        fun get(
            indexId: String,
            params: IndexGetParams = IndexGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexGetResponse>> =
            get(params.toBuilder().indexId(indexId).build(), requestOptions)

        /** @see get */
        fun get(
            indexId: String,
            params: IndexGetParams = IndexGetParams.none(),
        ): CompletableFuture<HttpResponseFor<IndexGetResponse>> =
            get(indexId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: IndexGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexGetResponse>>

        /** @see get */
        fun get(params: IndexGetParams): CompletableFuture<HttpResponseFor<IndexGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            indexId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexGetResponse>> =
            get(indexId, IndexGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/indexes/{index_id}/sync`, but is otherwise
         * the same as [IndexServiceAsync.sync].
         */
        fun sync(indexId: String): CompletableFuture<HttpResponseFor<IndexSyncResponse>> =
            sync(indexId, IndexSyncParams.none())

        /** @see sync */
        fun sync(
            indexId: String,
            params: IndexSyncParams = IndexSyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexSyncResponse>> =
            sync(params.toBuilder().indexId(indexId).build(), requestOptions)

        /** @see sync */
        fun sync(
            indexId: String,
            params: IndexSyncParams = IndexSyncParams.none(),
        ): CompletableFuture<HttpResponseFor<IndexSyncResponse>> =
            sync(indexId, params, RequestOptions.none())

        /** @see sync */
        fun sync(
            params: IndexSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexSyncResponse>>

        /** @see sync */
        fun sync(params: IndexSyncParams): CompletableFuture<HttpResponseFor<IndexSyncResponse>> =
            sync(params, RequestOptions.none())

        /** @see sync */
        fun sync(
            indexId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexSyncResponse>> =
            sync(indexId, IndexSyncParams.none(), requestOptions)
    }
}
