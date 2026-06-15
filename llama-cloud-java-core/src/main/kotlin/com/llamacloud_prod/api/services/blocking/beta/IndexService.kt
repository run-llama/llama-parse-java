// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.indexes.IndexCreateParams
import com.llamacloud_prod.api.models.beta.indexes.IndexCreateResponse
import com.llamacloud_prod.api.models.beta.indexes.IndexDeleteParams
import com.llamacloud_prod.api.models.beta.indexes.IndexGetParams
import com.llamacloud_prod.api.models.beta.indexes.IndexGetResponse
import com.llamacloud_prod.api.models.beta.indexes.IndexListPage
import com.llamacloud_prod.api.models.beta.indexes.IndexListParams
import com.llamacloud_prod.api.models.beta.indexes.IndexSyncParams
import com.llamacloud_prod.api.models.beta.indexes.IndexSyncResponse
import java.util.function.Consumer

interface IndexService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndexService

    /** Create a searchable index over a source directory. */
    fun create(params: IndexCreateParams): IndexCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IndexCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexCreateResponse

    /** List indexes for the current project. */
    fun list(): IndexListPage = list(IndexListParams.none())

    /** @see list */
    fun list(
        params: IndexListParams = IndexListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexListPage

    /** @see list */
    fun list(params: IndexListParams = IndexListParams.none()): IndexListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): IndexListPage =
        list(IndexListParams.none(), requestOptions)

    /** Delete an index. */
    fun delete(indexId: String) = delete(indexId, IndexDeleteParams.none())

    /** @see delete */
    fun delete(
        indexId: String,
        params: IndexDeleteParams = IndexDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().indexId(indexId).build(), requestOptions)

    /** @see delete */
    fun delete(indexId: String, params: IndexDeleteParams = IndexDeleteParams.none()) =
        delete(indexId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: IndexDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: IndexDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(indexId: String, requestOptions: RequestOptions) =
        delete(indexId, IndexDeleteParams.none(), requestOptions)

    /** Get an index by ID. */
    fun get(indexId: String): IndexGetResponse = get(indexId, IndexGetParams.none())

    /** @see get */
    fun get(
        indexId: String,
        params: IndexGetParams = IndexGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexGetResponse = get(params.toBuilder().indexId(indexId).build(), requestOptions)

    /** @see get */
    fun get(indexId: String, params: IndexGetParams = IndexGetParams.none()): IndexGetResponse =
        get(indexId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: IndexGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexGetResponse

    /** @see get */
    fun get(params: IndexGetParams): IndexGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(indexId: String, requestOptions: RequestOptions): IndexGetResponse =
        get(indexId, IndexGetParams.none(), requestOptions)

    /**
     * Trigger a sync and export for an existing index, re-parsing changed files and exporting
     * updated chunks.
     */
    fun sync(indexId: String): IndexSyncResponse = sync(indexId, IndexSyncParams.none())

    /** @see sync */
    fun sync(
        indexId: String,
        params: IndexSyncParams = IndexSyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexSyncResponse = sync(params.toBuilder().indexId(indexId).build(), requestOptions)

    /** @see sync */
    fun sync(indexId: String, params: IndexSyncParams = IndexSyncParams.none()): IndexSyncResponse =
        sync(indexId, params, RequestOptions.none())

    /** @see sync */
    fun sync(
        params: IndexSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexSyncResponse

    /** @see sync */
    fun sync(params: IndexSyncParams): IndexSyncResponse = sync(params, RequestOptions.none())

    /** @see sync */
    fun sync(indexId: String, requestOptions: RequestOptions): IndexSyncResponse =
        sync(indexId, IndexSyncParams.none(), requestOptions)

    /** A view of [IndexService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndexService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/indexes`, but is otherwise the same as
         * [IndexService.create].
         */
        @MustBeClosed
        fun create(params: IndexCreateParams): HttpResponseFor<IndexCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: IndexCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/indexes`, but is otherwise the same as
         * [IndexService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<IndexListPage> = list(IndexListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IndexListParams = IndexListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: IndexListParams = IndexListParams.none()): HttpResponseFor<IndexListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IndexListPage> =
            list(IndexListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/indexes/{index_id}`, but is otherwise the
         * same as [IndexService.delete].
         */
        @MustBeClosed
        fun delete(indexId: String): HttpResponse = delete(indexId, IndexDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            indexId: String,
            params: IndexDeleteParams = IndexDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().indexId(indexId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            indexId: String,
            params: IndexDeleteParams = IndexDeleteParams.none(),
        ): HttpResponse = delete(indexId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: IndexDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: IndexDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(indexId: String, requestOptions: RequestOptions): HttpResponse =
            delete(indexId, IndexDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/indexes/{index_id}`, but is otherwise the
         * same as [IndexService.get].
         */
        @MustBeClosed
        fun get(indexId: String): HttpResponseFor<IndexGetResponse> =
            get(indexId, IndexGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            indexId: String,
            params: IndexGetParams = IndexGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexGetResponse> =
            get(params.toBuilder().indexId(indexId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            indexId: String,
            params: IndexGetParams = IndexGetParams.none(),
        ): HttpResponseFor<IndexGetResponse> = get(indexId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: IndexGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: IndexGetParams): HttpResponseFor<IndexGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            indexId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexGetResponse> = get(indexId, IndexGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/indexes/{index_id}/sync`, but is otherwise
         * the same as [IndexService.sync].
         */
        @MustBeClosed
        fun sync(indexId: String): HttpResponseFor<IndexSyncResponse> =
            sync(indexId, IndexSyncParams.none())

        /** @see sync */
        @MustBeClosed
        fun sync(
            indexId: String,
            params: IndexSyncParams = IndexSyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexSyncResponse> =
            sync(params.toBuilder().indexId(indexId).build(), requestOptions)

        /** @see sync */
        @MustBeClosed
        fun sync(
            indexId: String,
            params: IndexSyncParams = IndexSyncParams.none(),
        ): HttpResponseFor<IndexSyncResponse> = sync(indexId, params, RequestOptions.none())

        /** @see sync */
        @MustBeClosed
        fun sync(
            params: IndexSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexSyncResponse>

        /** @see sync */
        @MustBeClosed
        fun sync(params: IndexSyncParams): HttpResponseFor<IndexSyncResponse> =
            sync(params, RequestOptions.none())

        /** @see sync */
        @MustBeClosed
        fun sync(
            indexId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexSyncResponse> =
            sync(indexId, IndexSyncParams.none(), requestOptions)
    }
}
