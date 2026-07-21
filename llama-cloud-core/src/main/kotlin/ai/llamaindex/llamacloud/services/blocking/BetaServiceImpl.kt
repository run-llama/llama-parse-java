// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.services.blocking.beta.AgentDataService
import ai.llamaindex.llamacloud.services.blocking.beta.AgentDataServiceImpl
import ai.llamaindex.llamacloud.services.blocking.beta.BatchService
import ai.llamaindex.llamacloud.services.blocking.beta.BatchServiceImpl
import ai.llamaindex.llamacloud.services.blocking.beta.ChatService
import ai.llamaindex.llamacloud.services.blocking.beta.ChatServiceImpl
import ai.llamaindex.llamacloud.services.blocking.beta.DirectoryService
import ai.llamaindex.llamacloud.services.blocking.beta.DirectoryServiceImpl
import ai.llamaindex.llamacloud.services.blocking.beta.IndexService
import ai.llamaindex.llamacloud.services.blocking.beta.IndexServiceImpl
import ai.llamaindex.llamacloud.services.blocking.beta.RetrievalService
import ai.llamaindex.llamacloud.services.blocking.beta.RetrievalServiceImpl
import ai.llamaindex.llamacloud.services.blocking.beta.SheetService
import ai.llamaindex.llamacloud.services.blocking.beta.SheetServiceImpl
import ai.llamaindex.llamacloud.services.blocking.beta.SplitService
import ai.llamaindex.llamacloud.services.blocking.beta.SplitServiceImpl
import java.util.function.Consumer

class BetaServiceImpl internal constructor(private val clientOptions: ClientOptions) : BetaService {

    private val withRawResponse: BetaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val indexes: IndexService by lazy { IndexServiceImpl(clientOptions) }

    private val retrieval: RetrievalService by lazy { RetrievalServiceImpl(clientOptions) }

    private val chat: ChatService by lazy { ChatServiceImpl(clientOptions) }

    private val agentData: AgentDataService by lazy { AgentDataServiceImpl(clientOptions) }

    private val sheets: SheetService by lazy { SheetServiceImpl(clientOptions) }

    private val directories: DirectoryService by lazy { DirectoryServiceImpl(clientOptions) }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val split: SplitService by lazy { SplitServiceImpl(clientOptions) }

    override fun withRawResponse(): BetaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaService =
        BetaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun indexes(): IndexService = indexes

    override fun retrieval(): RetrievalService = retrieval

    override fun chat(): ChatService = chat

    override fun agentData(): AgentDataService = agentData

    override fun sheets(): SheetService = sheets

    override fun directories(): DirectoryService = directories

    override fun batch(): BatchService = batch

    override fun split(): SplitService = split

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BetaService.WithRawResponse {

        private val indexes: IndexService.WithRawResponse by lazy {
            IndexServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val retrieval: RetrievalService.WithRawResponse by lazy {
            RetrievalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatService.WithRawResponse by lazy {
            ChatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val agentData: AgentDataService.WithRawResponse by lazy {
            AgentDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sheets: SheetService.WithRawResponse by lazy {
            SheetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val directories: DirectoryService.WithRawResponse by lazy {
            DirectoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val split: SplitService.WithRawResponse by lazy {
            SplitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BetaService.WithRawResponse =
            BetaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun indexes(): IndexService.WithRawResponse = indexes

        override fun retrieval(): RetrievalService.WithRawResponse = retrieval

        override fun chat(): ChatService.WithRawResponse = chat

        override fun agentData(): AgentDataService.WithRawResponse = agentData

        override fun sheets(): SheetService.WithRawResponse = sheets

        override fun directories(): DirectoryService.WithRawResponse = directories

        override fun batch(): BatchService.WithRawResponse = batch

        override fun split(): SplitService.WithRawResponse = split
    }
}
