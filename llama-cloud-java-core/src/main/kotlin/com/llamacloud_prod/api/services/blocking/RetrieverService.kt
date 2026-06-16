// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.llamacloud_prod.api.services.blocking.retrievers.QueryService
import java.util.function.Consumer

interface RetrieverService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrieverService

    fun query(): QueryService

    /** Create a new Retriever. */
    fun create(params: RetrieverCreateParams): Retriever = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RetrieverCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Retriever

    /** @see create */
    fun create(
        retrieverCreate: RetrieverCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Retriever =
        create(
            RetrieverCreateParams.builder().retrieverCreate(retrieverCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(retrieverCreate: RetrieverCreate): Retriever =
        create(retrieverCreate, RequestOptions.none())

    /** Update an existing Retriever. */
    fun update(retrieverId: String, params: RetrieverUpdateParams): Retriever =
        update(retrieverId, params, RequestOptions.none())

    /** @see update */
    fun update(
        retrieverId: String,
        params: RetrieverUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Retriever = update(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

    /** @see update */
    fun update(params: RetrieverUpdateParams): Retriever = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RetrieverUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Retriever

    /** List Retrievers for a project. */
    fun list(): List<Retriever> = list(RetrieverListParams.none())

    /** @see list */
    fun list(
        params: RetrieverListParams = RetrieverListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Retriever>

    /** @see list */
    fun list(params: RetrieverListParams = RetrieverListParams.none()): List<Retriever> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Retriever> =
        list(RetrieverListParams.none(), requestOptions)

    /** Delete a Retriever by ID. */
    fun delete(retrieverId: String) = delete(retrieverId, RetrieverDeleteParams.none())

    /** @see delete */
    fun delete(
        retrieverId: String,
        params: RetrieverDeleteParams = RetrieverDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

    /** @see delete */
    fun delete(retrieverId: String, params: RetrieverDeleteParams = RetrieverDeleteParams.none()) =
        delete(retrieverId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RetrieverDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: RetrieverDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(retrieverId: String, requestOptions: RequestOptions) =
        delete(retrieverId, RetrieverDeleteParams.none(), requestOptions)

    /** Get a Retriever by ID. */
    fun get(retrieverId: String): Retriever = get(retrieverId, RetrieverGetParams.none())

    /** @see get */
    fun get(
        retrieverId: String,
        params: RetrieverGetParams = RetrieverGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Retriever = get(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

    /** @see get */
    fun get(
        retrieverId: String,
        params: RetrieverGetParams = RetrieverGetParams.none(),
    ): Retriever = get(retrieverId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RetrieverGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Retriever

    /** @see get */
    fun get(params: RetrieverGetParams): Retriever = get(params, RequestOptions.none())

    /** @see get */
    fun get(retrieverId: String, requestOptions: RequestOptions): Retriever =
        get(retrieverId, RetrieverGetParams.none(), requestOptions)

    /** Retrieve data using specified pipelines without creating a persistent retriever. */
    fun search(params: RetrieverSearchParams): CompositeRetrievalResult =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: RetrieverSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompositeRetrievalResult

    /** Upsert a new Retriever. */
    fun upsert(params: RetrieverUpsertParams): Retriever = upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: RetrieverUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Retriever

    /** @see upsert */
    fun upsert(
        retrieverCreate: RetrieverCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Retriever =
        upsert(
            RetrieverUpsertParams.builder().retrieverCreate(retrieverCreate).build(),
            requestOptions,
        )

    /** @see upsert */
    fun upsert(retrieverCreate: RetrieverCreate): Retriever =
        upsert(retrieverCreate, RequestOptions.none())

    /** A view of [RetrieverService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrieverService.WithRawResponse

        fun query(): QueryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/retrievers`, but is otherwise the same as
         * [RetrieverService.create].
         */
        @MustBeClosed
        fun create(params: RetrieverCreateParams): HttpResponseFor<Retriever> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RetrieverCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Retriever>

        /** @see create */
        @MustBeClosed
        fun create(
            retrieverCreate: RetrieverCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Retriever> =
            create(
                RetrieverCreateParams.builder().retrieverCreate(retrieverCreate).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(retrieverCreate: RetrieverCreate): HttpResponseFor<Retriever> =
            create(retrieverCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /api/v1/retrievers/{retriever_id}`, but is otherwise
         * the same as [RetrieverService.update].
         */
        @MustBeClosed
        fun update(retrieverId: String, params: RetrieverUpdateParams): HttpResponseFor<Retriever> =
            update(retrieverId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            retrieverId: String,
            params: RetrieverUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Retriever> =
            update(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RetrieverUpdateParams): HttpResponseFor<Retriever> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RetrieverUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Retriever>

        /**
         * Returns a raw HTTP response for `get /api/v1/retrievers`, but is otherwise the same as
         * [RetrieverService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<Retriever>> = list(RetrieverListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RetrieverListParams = RetrieverListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Retriever>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RetrieverListParams = RetrieverListParams.none()
        ): HttpResponseFor<List<Retriever>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Retriever>> =
            list(RetrieverListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/retrievers/{retriever_id}`, but is
         * otherwise the same as [RetrieverService.delete].
         */
        @MustBeClosed
        fun delete(retrieverId: String): HttpResponse =
            delete(retrieverId, RetrieverDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            retrieverId: String,
            params: RetrieverDeleteParams = RetrieverDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            retrieverId: String,
            params: RetrieverDeleteParams = RetrieverDeleteParams.none(),
        ): HttpResponse = delete(retrieverId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RetrieverDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RetrieverDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(retrieverId: String, requestOptions: RequestOptions): HttpResponse =
            delete(retrieverId, RetrieverDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/retrievers/{retriever_id}`, but is otherwise
         * the same as [RetrieverService.get].
         */
        @MustBeClosed
        fun get(retrieverId: String): HttpResponseFor<Retriever> =
            get(retrieverId, RetrieverGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            retrieverId: String,
            params: RetrieverGetParams = RetrieverGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Retriever> =
            get(params.toBuilder().retrieverId(retrieverId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            retrieverId: String,
            params: RetrieverGetParams = RetrieverGetParams.none(),
        ): HttpResponseFor<Retriever> = get(retrieverId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: RetrieverGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Retriever>

        /** @see get */
        @MustBeClosed
        fun get(params: RetrieverGetParams): HttpResponseFor<Retriever> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(retrieverId: String, requestOptions: RequestOptions): HttpResponseFor<Retriever> =
            get(retrieverId, RetrieverGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/retrievers/retrieve`, but is otherwise the
         * same as [RetrieverService.search].
         */
        @MustBeClosed
        fun search(params: RetrieverSearchParams): HttpResponseFor<CompositeRetrievalResult> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: RetrieverSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompositeRetrievalResult>

        /**
         * Returns a raw HTTP response for `put /api/v1/retrievers`, but is otherwise the same as
         * [RetrieverService.upsert].
         */
        @MustBeClosed
        fun upsert(params: RetrieverUpsertParams): HttpResponseFor<Retriever> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: RetrieverUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Retriever>

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            retrieverCreate: RetrieverCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Retriever> =
            upsert(
                RetrieverUpsertParams.builder().retrieverCreate(retrieverCreate).build(),
                requestOptions,
            )

        /** @see upsert */
        @MustBeClosed
        fun upsert(retrieverCreate: RetrieverCreate): HttpResponseFor<Retriever> =
            upsert(retrieverCreate, RequestOptions.none())
    }
}
