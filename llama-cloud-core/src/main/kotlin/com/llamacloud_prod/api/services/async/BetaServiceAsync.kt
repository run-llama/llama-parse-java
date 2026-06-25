// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.services.async.beta.AgentDataServiceAsync
import com.llamacloud_prod.api.services.async.beta.BatchServiceAsync
import com.llamacloud_prod.api.services.async.beta.ChatServiceAsync
import com.llamacloud_prod.api.services.async.beta.DirectoryServiceAsync
import com.llamacloud_prod.api.services.async.beta.IndexServiceAsync
import com.llamacloud_prod.api.services.async.beta.RetrievalServiceAsync
import com.llamacloud_prod.api.services.async.beta.SheetServiceAsync
import com.llamacloud_prod.api.services.async.beta.SplitServiceAsync
import java.util.function.Consumer

interface BetaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaServiceAsync

    fun indexes(): IndexServiceAsync

    fun retrieval(): RetrievalServiceAsync

    fun chat(): ChatServiceAsync

    fun agentData(): AgentDataServiceAsync

    fun sheets(): SheetServiceAsync

    fun directories(): DirectoryServiceAsync

    fun batch(): BatchServiceAsync

    fun split(): SplitServiceAsync

    /** A view of [BetaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaServiceAsync.WithRawResponse

        fun indexes(): IndexServiceAsync.WithRawResponse

        fun retrieval(): RetrievalServiceAsync.WithRawResponse

        fun chat(): ChatServiceAsync.WithRawResponse

        fun agentData(): AgentDataServiceAsync.WithRawResponse

        fun sheets(): SheetServiceAsync.WithRawResponse

        fun directories(): DirectoryServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun split(): SplitServiceAsync.WithRawResponse
    }
}
