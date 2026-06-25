// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.services.blocking.beta.AgentDataService
import com.llamacloud_prod.api.services.blocking.beta.BatchService
import com.llamacloud_prod.api.services.blocking.beta.ChatService
import com.llamacloud_prod.api.services.blocking.beta.DirectoryService
import com.llamacloud_prod.api.services.blocking.beta.IndexService
import com.llamacloud_prod.api.services.blocking.beta.RetrievalService
import com.llamacloud_prod.api.services.blocking.beta.SheetService
import com.llamacloud_prod.api.services.blocking.beta.SplitService
import java.util.function.Consumer

interface BetaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaService

    fun indexes(): IndexService

    fun retrieval(): RetrievalService

    fun chat(): ChatService

    fun agentData(): AgentDataService

    fun sheets(): SheetService

    fun directories(): DirectoryService

    fun batch(): BatchService

    fun split(): SplitService

    /** A view of [BetaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaService.WithRawResponse

        fun indexes(): IndexService.WithRawResponse

        fun retrieval(): RetrievalService.WithRawResponse

        fun chat(): ChatService.WithRawResponse

        fun agentData(): AgentDataService.WithRawResponse

        fun sheets(): SheetService.WithRawResponse

        fun directories(): DirectoryService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun split(): SplitService.WithRawResponse
    }
}
