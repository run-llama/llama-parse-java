// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.extractionagents.ExtractionAgentListPage
import ai.llamaindex.llamacloud.models.extractionagents.ExtractionAgentListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ExtractionAgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractionAgentService

    /** List the extraction agents in a project, newest first. */
    fun list(): ExtractionAgentListPage = list(ExtractionAgentListParams.none())

    /** @see list */
    fun list(
        params: ExtractionAgentListParams = ExtractionAgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractionAgentListPage

    /** @see list */
    fun list(
        params: ExtractionAgentListParams = ExtractionAgentListParams.none()
    ): ExtractionAgentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ExtractionAgentListPage =
        list(ExtractionAgentListParams.none(), requestOptions)

    /**
     * A view of [ExtractionAgentService] that provides access to raw HTTP responses for each
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
        ): ExtractionAgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/extraction-agents`, but is otherwise
         * the same as [ExtractionAgentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ExtractionAgentListPage> =
            list(ExtractionAgentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExtractionAgentListParams = ExtractionAgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractionAgentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExtractionAgentListParams = ExtractionAgentListParams.none()
        ): HttpResponseFor<ExtractionAgentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExtractionAgentListPage> =
            list(ExtractionAgentListParams.none(), requestOptions)
    }
}
