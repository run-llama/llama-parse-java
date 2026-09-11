// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.extractionagents.ExtractionAgentListPageAsync
import ai.llamaindex.llamacloud.models.extractionagents.ExtractionAgentListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExtractionAgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractionAgentServiceAsync

    /** List the extraction agents in a project, newest first. */
    fun list(): CompletableFuture<ExtractionAgentListPageAsync> =
        list(ExtractionAgentListParams.none())

    /** @see list */
    fun list(
        params: ExtractionAgentListParams = ExtractionAgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractionAgentListPageAsync>

    /** @see list */
    fun list(
        params: ExtractionAgentListParams = ExtractionAgentListParams.none()
    ): CompletableFuture<ExtractionAgentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExtractionAgentListPageAsync> =
        list(ExtractionAgentListParams.none(), requestOptions)

    /**
     * A view of [ExtractionAgentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtractionAgentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/extraction-agents`, but is otherwise
         * the same as [ExtractionAgentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ExtractionAgentListPageAsync>> =
            list(ExtractionAgentListParams.none())

        /** @see list */
        fun list(
            params: ExtractionAgentListParams = ExtractionAgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractionAgentListPageAsync>>

        /** @see list */
        fun list(
            params: ExtractionAgentListParams = ExtractionAgentListParams.none()
        ): CompletableFuture<HttpResponseFor<ExtractionAgentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExtractionAgentListPageAsync>> =
            list(ExtractionAgentListParams.none(), requestOptions)
    }
}
