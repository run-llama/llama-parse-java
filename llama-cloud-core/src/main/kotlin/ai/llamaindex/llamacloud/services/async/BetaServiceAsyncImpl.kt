// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.services.async.beta.AgentDataServiceAsync
import ai.llamaindex.llamacloud.services.async.beta.AgentDataServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.beta.BatchServiceAsync
import ai.llamaindex.llamacloud.services.async.beta.BatchServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.beta.ChatServiceAsync
import ai.llamaindex.llamacloud.services.async.beta.ChatServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.beta.DirectoryServiceAsync
import ai.llamaindex.llamacloud.services.async.beta.DirectoryServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.beta.IndexServiceAsync
import ai.llamaindex.llamacloud.services.async.beta.IndexServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.beta.RetrievalServiceAsync
import ai.llamaindex.llamacloud.services.async.beta.RetrievalServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.beta.SheetServiceAsync
import ai.llamaindex.llamacloud.services.async.beta.SheetServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.beta.SplitServiceAsync
import ai.llamaindex.llamacloud.services.async.beta.SplitServiceAsyncImpl
import java.util.function.Consumer

class BetaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BetaServiceAsync {

    private val withRawResponse: BetaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val indexes: IndexServiceAsync by lazy { IndexServiceAsyncImpl(clientOptions) }

    private val retrieval: RetrievalServiceAsync by lazy {
        RetrievalServiceAsyncImpl(clientOptions)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    private val agentData: AgentDataServiceAsync by lazy {
        AgentDataServiceAsyncImpl(clientOptions)
    }

    private val sheets: SheetServiceAsync by lazy { SheetServiceAsyncImpl(clientOptions) }

    private val directories: DirectoryServiceAsync by lazy {
        DirectoryServiceAsyncImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    private val split: SplitServiceAsync by lazy { SplitServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BetaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaServiceAsync =
        BetaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun indexes(): IndexServiceAsync = indexes

    override fun retrieval(): RetrievalServiceAsync = retrieval

    override fun chat(): ChatServiceAsync = chat

    override fun agentData(): AgentDataServiceAsync = agentData

    override fun sheets(): SheetServiceAsync = sheets

    override fun directories(): DirectoryServiceAsync = directories

    override fun batch(): BatchServiceAsync = batch

    override fun split(): SplitServiceAsync = split

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BetaServiceAsync.WithRawResponse {

        private val indexes: IndexServiceAsync.WithRawResponse by lazy {
            IndexServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val retrieval: RetrievalServiceAsync.WithRawResponse by lazy {
            RetrievalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val agentData: AgentDataServiceAsync.WithRawResponse by lazy {
            AgentDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sheets: SheetServiceAsync.WithRawResponse by lazy {
            SheetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val directories: DirectoryServiceAsync.WithRawResponse by lazy {
            DirectoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val split: SplitServiceAsync.WithRawResponse by lazy {
            SplitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BetaServiceAsync.WithRawResponse =
            BetaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun indexes(): IndexServiceAsync.WithRawResponse = indexes

        override fun retrieval(): RetrievalServiceAsync.WithRawResponse = retrieval

        override fun chat(): ChatServiceAsync.WithRawResponse = chat

        override fun agentData(): AgentDataServiceAsync.WithRawResponse = agentData

        override fun sheets(): SheetServiceAsync.WithRawResponse = sheets

        override fun directories(): DirectoryServiceAsync.WithRawResponse = directories

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        override fun split(): SplitServiceAsync.WithRawResponse = split
    }
}
