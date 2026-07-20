// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalFindPage
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalFindParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalGrepPage
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalGrepParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalReadParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalReadResponse
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalRetrieveParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface RetrievalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrievalService

    /**
     * Retrieve relevant chunks via hybrid search (vector + full-text), with filtering on built-in
     * or user-defined metadata.
     */
    fun retrieve(params: RetrievalRetrieveParams): RetrievalRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RetrievalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RetrievalRetrieveResponse

    /** Search for files by name. */
    fun find(params: RetrievalFindParams): RetrievalFindPage = find(params, RequestOptions.none())

    /** @see find */
    fun find(
        params: RetrievalFindParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RetrievalFindPage

    /** Grep within a file's parsed content using a regex pattern. */
    fun grep(params: RetrievalGrepParams): RetrievalGrepPage = grep(params, RequestOptions.none())

    /** @see grep */
    fun grep(
        params: RetrievalGrepParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RetrievalGrepPage

    /** Read the parsed text content of a specific file. */
    fun read(params: RetrievalReadParams): RetrievalReadResponse =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: RetrievalReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RetrievalReadResponse

    /** A view of [RetrievalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrievalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/retrieval/retrieve`, but is otherwise the
         * same as [RetrievalService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: RetrievalRetrieveParams): HttpResponseFor<RetrievalRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RetrievalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RetrievalRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/retrieval/files/find`, but is otherwise the
         * same as [RetrievalService.find].
         */
        @MustBeClosed
        fun find(params: RetrievalFindParams): HttpResponseFor<RetrievalFindPage> =
            find(params, RequestOptions.none())

        /** @see find */
        @MustBeClosed
        fun find(
            params: RetrievalFindParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RetrievalFindPage>

        /**
         * Returns a raw HTTP response for `post /api/v1/retrieval/files/grep`, but is otherwise the
         * same as [RetrievalService.grep].
         */
        @MustBeClosed
        fun grep(params: RetrievalGrepParams): HttpResponseFor<RetrievalGrepPage> =
            grep(params, RequestOptions.none())

        /** @see grep */
        @MustBeClosed
        fun grep(
            params: RetrievalGrepParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RetrievalGrepPage>

        /**
         * Returns a raw HTTP response for `post /api/v1/retrieval/files/read`, but is otherwise the
         * same as [RetrievalService.read].
         */
        @MustBeClosed
        fun read(params: RetrievalReadParams): HttpResponseFor<RetrievalReadResponse> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: RetrievalReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RetrievalReadResponse>
    }
}
