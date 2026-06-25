// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.services.blocking.beta.AgentDataService
import com.llamacloud_prod.api.services.blocking.beta.AgentDataServiceImpl
import com.llamacloud_prod.api.services.blocking.beta.BatchService
import com.llamacloud_prod.api.services.blocking.beta.BatchServiceImpl
import com.llamacloud_prod.api.services.blocking.beta.ChatService
import com.llamacloud_prod.api.services.blocking.beta.ChatServiceImpl
import com.llamacloud_prod.api.services.blocking.beta.DirectoryService
import com.llamacloud_prod.api.services.blocking.beta.DirectoryServiceImpl
import com.llamacloud_prod.api.services.blocking.beta.IndexService
import com.llamacloud_prod.api.services.blocking.beta.IndexServiceImpl
import com.llamacloud_prod.api.services.blocking.beta.RetrievalService
import com.llamacloud_prod.api.services.blocking.beta.RetrievalServiceImpl
import com.llamacloud_prod.api.services.blocking.beta.SheetService
import com.llamacloud_prod.api.services.blocking.beta.SheetServiceImpl
import com.llamacloud_prod.api.services.blocking.beta.SplitService
import com.llamacloud_prod.api.services.blocking.beta.SplitServiceImpl
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
