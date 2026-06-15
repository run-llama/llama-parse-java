// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.split.SplitCreateParams
import com.llamacloud_prod.api.models.beta.split.SplitCreateResponse
import com.llamacloud_prod.api.models.beta.split.SplitGetParams
import com.llamacloud_prod.api.models.beta.split.SplitGetResponse
import com.llamacloud_prod.api.models.beta.split.SplitListPage
import com.llamacloud_prod.api.models.beta.split.SplitListParams
import java.util.function.Consumer

interface SplitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitService

    /** Create a document split job. */
    fun create(params: SplitCreateParams): SplitCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SplitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitCreateResponse

    /** List document split jobs. */
    fun list(): SplitListPage = list(SplitListParams.none())

    /** @see list */
    fun list(
        params: SplitListParams = SplitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitListPage

    /** @see list */
    fun list(params: SplitListParams = SplitListParams.none()): SplitListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SplitListPage =
        list(SplitListParams.none(), requestOptions)

    /** Get a document split job. */
    fun get(splitJobId: String): SplitGetResponse = get(splitJobId, SplitGetParams.none())

    /** @see get */
    fun get(
        splitJobId: String,
        params: SplitGetParams = SplitGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitGetResponse = get(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

    /** @see get */
    fun get(splitJobId: String, params: SplitGetParams = SplitGetParams.none()): SplitGetResponse =
        get(splitJobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SplitGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitGetResponse

    /** @see get */
    fun get(params: SplitGetParams): SplitGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(splitJobId: String, requestOptions: RequestOptions): SplitGetResponse =
        get(splitJobId, SplitGetParams.none(), requestOptions)

    /** A view of [SplitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/split/jobs`, but is otherwise the same
         * as [SplitService.create].
         */
        @MustBeClosed
        fun create(params: SplitCreateParams): HttpResponseFor<SplitCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SplitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/split/jobs`, but is otherwise the same
         * as [SplitService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SplitListPage> = list(SplitListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SplitListParams = SplitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SplitListParams = SplitListParams.none()): HttpResponseFor<SplitListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SplitListPage> =
            list(SplitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/split/jobs/{split_job_id}`, but is
         * otherwise the same as [SplitService.get].
         */
        @MustBeClosed
        fun get(splitJobId: String): HttpResponseFor<SplitGetResponse> =
            get(splitJobId, SplitGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            splitJobId: String,
            params: SplitGetParams = SplitGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitGetResponse> =
            get(params.toBuilder().splitJobId(splitJobId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            splitJobId: String,
            params: SplitGetParams = SplitGetParams.none(),
        ): HttpResponseFor<SplitGetResponse> = get(splitJobId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SplitGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SplitGetParams): HttpResponseFor<SplitGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            splitJobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SplitGetResponse> =
            get(splitJobId, SplitGetParams.none(), requestOptions)
    }
}
