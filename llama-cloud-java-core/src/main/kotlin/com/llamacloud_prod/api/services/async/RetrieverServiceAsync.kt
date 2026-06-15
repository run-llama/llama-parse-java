// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.retrievers.CompositeRetrievalResult
import com.llamacloud_prod.api.models.retrievers.Retriever
import com.llamacloud_prod.api.models.retrievers.RetrieverCreate
import com.llamacloud_prod.api.models.retrievers.RetrieverCreateParams
import com.llamacloud_prod.api.models.retrievers.RetrieverDeleteParams
import com.llamacloud_prod.api.models.retrievers.RetrieverGetParams
import com.llamacloud_prod.api.models.retrievers.RetrieverListParams
import com.llamacloud_prod.api.models.retrievers.RetrieverSearchParams
import com.llamacloud_prod.api.models.retrievers.RetrieverUpdateParams
import com.llamacloud_prod.api.models.retrievers.RetrieverUpsertParams
import com.llamacloud_prod.api.services.async.RetrieverServiceAsync
import com.llamacloud_prod.api.services.async.retrievers.RetrieverServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RetrieverServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrieverServiceAsync

    fun retriever(): RetrieverServiceAsync

    /** Create a new Retriever. */
    fun create(params: RetrieverCreateParams): CompletableFuture<Retriever> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RetrieverCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Retriever>

    /** @see create */
    fun create(
        retrieverCreate: RetrieverCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Retriever> =
        create(
            RetrieverCreateParams.builder().retrieverCreate(retrieverCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(retrieverCreate: RetrieverCreate): CompletableFuture<Retriever> =
        create(retrieverCreate, RequestOptions.none())

    /** Update an existing Retriever. */
    fun update(retrieverId: String, params: RetrieverUpdateParams): CompletableFuture<Retriever> =
        update(retrieverId, params, RequestOptions.none())

    /** @see update */
    fun update(
        retrieverId: String,
        params: RetrieverUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Retriever> =
        update(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

    /** @see update */
    fun update(params: RetrieverUpdateParams): CompletableFuture<Retriever> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RetrieverUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Retriever>

    /** List Retrievers for a project. */
    fun list(): CompletableFuture<List<Retriever>> = list(RetrieverListParams.none())

    /** @see list */
    fun list(
        params: RetrieverListParams = RetrieverListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Retriever>>

    /** @see list */
    fun list(
        params: RetrieverListParams = RetrieverListParams.none()
    ): CompletableFuture<List<Retriever>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<Retriever>> =
        list(RetrieverListParams.none(), requestOptions)

    /** Delete a Retriever by ID. */
    fun delete(retrieverId: String): CompletableFuture<Void?> =
        delete(retrieverId, RetrieverDeleteParams.none())

    /** @see delete */
    fun delete(
        retrieverId: String,
        params: RetrieverDeleteParams = RetrieverDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

    /** @see delete */
    fun delete(
        retrieverId: String,
        params: RetrieverDeleteParams = RetrieverDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(retrieverId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RetrieverDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RetrieverDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(retrieverId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(retrieverId, RetrieverDeleteParams.none(), requestOptions)

    /** Get a Retriever by ID. */
    fun get(retrieverId: String): CompletableFuture<Retriever> =
        get(retrieverId, RetrieverGetParams.none())

    /** @see get */
    fun get(
        retrieverId: String,
        params: RetrieverGetParams = RetrieverGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Retriever> =
        get(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

    /** @see get */
    fun get(
        retrieverId: String,
        params: RetrieverGetParams = RetrieverGetParams.none(),
    ): CompletableFuture<Retriever> = get(retrieverId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RetrieverGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Retriever>

    /** @see get */
    fun get(params: RetrieverGetParams): CompletableFuture<Retriever> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(retrieverId: String, requestOptions: RequestOptions): CompletableFuture<Retriever> =
        get(retrieverId, RetrieverGetParams.none(), requestOptions)

    /** Retrieve data using specified pipelines without creating a persistent retriever. */
    fun search(params: RetrieverSearchParams): CompletableFuture<CompositeRetrievalResult> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: RetrieverSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompositeRetrievalResult>

    /** Upsert a new Retriever. */
    fun upsert(params: RetrieverUpsertParams): CompletableFuture<Retriever> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: RetrieverUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Retriever>

    /** @see upsert */
    fun upsert(
        retrieverCreate: RetrieverCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Retriever> =
        upsert(
            RetrieverUpsertParams.builder().retrieverCreate(retrieverCreate).build(),
            requestOptions,
        )

    /** @see upsert */
    fun upsert(retrieverCreate: RetrieverCreate): CompletableFuture<Retriever> =
        upsert(retrieverCreate, RequestOptions.none())

    /**
     * A view of [RetrieverServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RetrieverServiceAsync.WithRawResponse

        fun retriever(): RetrieverServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/retrievers`, but is otherwise the same as
         * [RetrieverServiceAsync.create].
         */
        fun create(params: RetrieverCreateParams): CompletableFuture<HttpResponseFor<Retriever>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RetrieverCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Retriever>>

        /** @see create */
        fun create(
            retrieverCreate: RetrieverCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Retriever>> =
            create(
                RetrieverCreateParams.builder().retrieverCreate(retrieverCreate).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            retrieverCreate: RetrieverCreate
        ): CompletableFuture<HttpResponseFor<Retriever>> =
            create(retrieverCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /api/v1/retrievers/{retriever_id}`, but is otherwise
         * the same as [RetrieverServiceAsync.update].
         */
        fun update(
            retrieverId: String,
            params: RetrieverUpdateParams,
        ): CompletableFuture<HttpResponseFor<Retriever>> =
            update(retrieverId, params, RequestOptions.none())

        /** @see update */
        fun update(
            retrieverId: String,
            params: RetrieverUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Retriever>> =
            update(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

        /** @see update */
        fun update(params: RetrieverUpdateParams): CompletableFuture<HttpResponseFor<Retriever>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RetrieverUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Retriever>>

        /**
         * Returns a raw HTTP response for `get /api/v1/retrievers`, but is otherwise the same as
         * [RetrieverServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<Retriever>>> =
            list(RetrieverListParams.none())

        /** @see list */
        fun list(
            params: RetrieverListParams = RetrieverListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Retriever>>>

        /** @see list */
        fun list(
            params: RetrieverListParams = RetrieverListParams.none()
        ): CompletableFuture<HttpResponseFor<List<Retriever>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Retriever>>> =
            list(RetrieverListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/retrievers/{retriever_id}`, but is
         * otherwise the same as [RetrieverServiceAsync.delete].
         */
        fun delete(retrieverId: String): CompletableFuture<HttpResponse> =
            delete(retrieverId, RetrieverDeleteParams.none())

        /** @see delete */
        fun delete(
            retrieverId: String,
            params: RetrieverDeleteParams = RetrieverDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

        /** @see delete */
        fun delete(
            retrieverId: String,
            params: RetrieverDeleteParams = RetrieverDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(retrieverId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RetrieverDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RetrieverDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            retrieverId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(retrieverId, RetrieverDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/retrievers/{retriever_id}`, but is otherwise
         * the same as [RetrieverServiceAsync.get].
         */
        fun get(retrieverId: String): CompletableFuture<HttpResponseFor<Retriever>> =
            get(retrieverId, RetrieverGetParams.none())

        /** @see get */
        fun get(
            retrieverId: String,
            params: RetrieverGetParams = RetrieverGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Retriever>> =
            get(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

        /** @see get */
        fun get(
            retrieverId: String,
            params: RetrieverGetParams = RetrieverGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Retriever>> =
            get(retrieverId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: RetrieverGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Retriever>>

        /** @see get */
        fun get(params: RetrieverGetParams): CompletableFuture<HttpResponseFor<Retriever>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            retrieverId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Retriever>> =
            get(retrieverId, RetrieverGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/retrievers/retrieve`, but is otherwise the
         * same as [RetrieverServiceAsync.search].
         */
        fun search(
            params: RetrieverSearchParams
        ): CompletableFuture<HttpResponseFor<CompositeRetrievalResult>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: RetrieverSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompositeRetrievalResult>>

        /**
         * Returns a raw HTTP response for `put /api/v1/retrievers`, but is otherwise the same as
         * [RetrieverServiceAsync.upsert].
         */
        fun upsert(params: RetrieverUpsertParams): CompletableFuture<HttpResponseFor<Retriever>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: RetrieverUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Retriever>>

        /** @see upsert */
        fun upsert(
            retrieverCreate: RetrieverCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Retriever>> =
            upsert(
                RetrieverUpsertParams.builder().retrieverCreate(retrieverCreate).build(),
                requestOptions,
            )

        /** @see upsert */
        fun upsert(
            retrieverCreate: RetrieverCreate
        ): CompletableFuture<HttpResponseFor<Retriever>> =
            upsert(retrieverCreate, RequestOptions.none())
    }
}
