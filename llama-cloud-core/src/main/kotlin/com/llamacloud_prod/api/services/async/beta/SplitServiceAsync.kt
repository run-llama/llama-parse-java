// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.split.SplitCreateParams
import com.llamacloud_prod.api.models.beta.split.SplitCreateResponse
import com.llamacloud_prod.api.models.beta.split.SplitGetParams
import com.llamacloud_prod.api.models.beta.split.SplitGetResponse
import com.llamacloud_prod.api.models.beta.split.SplitListPageAsync
import com.llamacloud_prod.api.models.beta.split.SplitListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SplitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitServiceAsync

    /** Create a document split job. */
    fun create(params: SplitCreateParams): CompletableFuture<SplitCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SplitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitCreateResponse>

    /** List document split jobs. */
    fun list(): CompletableFuture<SplitListPageAsync> = list(SplitListParams.none())

    /** @see list */
    fun list(
        params: SplitListParams = SplitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitListPageAsync>

    /** @see list */
    fun list(
        params: SplitListParams = SplitListParams.none()
    ): CompletableFuture<SplitListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SplitListPageAsync> =
        list(SplitListParams.none(), requestOptions)

    /** Get a document split job. */
    fun get(splitJobId: String): CompletableFuture<SplitGetResponse> =
        get(splitJobId, SplitGetParams.none())

    /** @see get */
    fun get(
        splitJobId: String,
        params: SplitGetParams = SplitGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitGetResponse> =
        get(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

    /** @see get */
    fun get(
        splitJobId: String,
        params: SplitGetParams = SplitGetParams.none(),
    ): CompletableFuture<SplitGetResponse> = get(splitJobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SplitGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitGetResponse>

    /** @see get */
    fun get(params: SplitGetParams): CompletableFuture<SplitGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        splitJobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SplitGetResponse> = get(splitJobId, SplitGetParams.none(), requestOptions)

    /** A view of [SplitServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SplitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/split/jobs`, but is otherwise the same
         * as [SplitServiceAsync.create].
         */
        fun create(
            params: SplitCreateParams
        ): CompletableFuture<HttpResponseFor<SplitCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SplitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/split/jobs`, but is otherwise the same
         * as [SplitServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SplitListPageAsync>> =
            list(SplitListParams.none())

        /** @see list */
        fun list(
            params: SplitListParams = SplitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitListPageAsync>>

        /** @see list */
        fun list(
            params: SplitListParams = SplitListParams.none()
        ): CompletableFuture<HttpResponseFor<SplitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SplitListPageAsync>> =
            list(SplitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/split/jobs/{split_job_id}`, but is
         * otherwise the same as [SplitServiceAsync.get].
         */
        fun get(splitJobId: String): CompletableFuture<HttpResponseFor<SplitGetResponse>> =
            get(splitJobId, SplitGetParams.none())

        /** @see get */
        fun get(
            splitJobId: String,
            params: SplitGetParams = SplitGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitGetResponse>> =
            get(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

        /** @see get */
        fun get(
            splitJobId: String,
            params: SplitGetParams = SplitGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SplitGetResponse>> =
            get(splitJobId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SplitGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitGetResponse>>

        /** @see get */
        fun get(params: SplitGetParams): CompletableFuture<HttpResponseFor<SplitGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            splitJobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SplitGetResponse>> =
            get(splitJobId, SplitGetParams.none(), requestOptions)
    }
}
