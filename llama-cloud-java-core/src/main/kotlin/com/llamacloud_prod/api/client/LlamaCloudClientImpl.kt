// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.client

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.getPackageVersion
import com.llamacloud_prod.api.services.blocking.BatchService
import com.llamacloud_prod.api.services.blocking.BatchServiceImpl
import com.llamacloud_prod.api.services.blocking.BetaService
import com.llamacloud_prod.api.services.blocking.BetaServiceImpl
import com.llamacloud_prod.api.services.blocking.ClassifierService
import com.llamacloud_prod.api.services.blocking.ClassifierServiceImpl
import com.llamacloud_prod.api.services.blocking.ClassifyService
import com.llamacloud_prod.api.services.blocking.ClassifyServiceImpl
import com.llamacloud_prod.api.services.blocking.ConfigurationService
import com.llamacloud_prod.api.services.blocking.ConfigurationServiceImpl
import com.llamacloud_prod.api.services.blocking.DataSinkService
import com.llamacloud_prod.api.services.blocking.DataSinkServiceImpl
import com.llamacloud_prod.api.services.blocking.DataSourceService
import com.llamacloud_prod.api.services.blocking.DataSourceServiceImpl
import com.llamacloud_prod.api.services.blocking.ExtractService
import com.llamacloud_prod.api.services.blocking.ExtractServiceImpl
import com.llamacloud_prod.api.services.blocking.FileService
import com.llamacloud_prod.api.services.blocking.FileServiceImpl
import com.llamacloud_prod.api.services.blocking.ParsingService
import com.llamacloud_prod.api.services.blocking.ParsingServiceImpl
import com.llamacloud_prod.api.services.blocking.PipelineService
import com.llamacloud_prod.api.services.blocking.PipelineServiceImpl
import com.llamacloud_prod.api.services.blocking.ProjectService
import com.llamacloud_prod.api.services.blocking.ProjectServiceImpl
import com.llamacloud_prod.api.services.blocking.RetrieverService
import com.llamacloud_prod.api.services.blocking.RetrieverServiceImpl
import java.util.function.Consumer

class LlamaCloudClientImpl(private val clientOptions: ClientOptions) : LlamaCloudClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: LlamaCloudClientAsync by lazy { LlamaCloudClientAsyncImpl(clientOptions) }

    private val withRawResponse: LlamaCloudClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileService by lazy { FileServiceImpl(clientOptionsWithUserAgent) }

    private val parsing: ParsingService by lazy { ParsingServiceImpl(clientOptionsWithUserAgent) }

    private val extract: ExtractService by lazy { ExtractServiceImpl(clientOptionsWithUserAgent) }

    private val classifier: ClassifierService by lazy {
        ClassifierServiceImpl(clientOptionsWithUserAgent)
    }

    private val batches: BatchService by lazy { BatchServiceImpl(clientOptionsWithUserAgent) }

    private val classify: ClassifyService by lazy {
        ClassifyServiceImpl(clientOptionsWithUserAgent)
    }

    private val configurations: ConfigurationService by lazy {
        ConfigurationServiceImpl(clientOptionsWithUserAgent)
    }

    private val projects: ProjectService by lazy { ProjectServiceImpl(clientOptionsWithUserAgent) }

    private val dataSinks: DataSinkService by lazy {
        DataSinkServiceImpl(clientOptionsWithUserAgent)
    }

    private val dataSources: DataSourceService by lazy {
        DataSourceServiceImpl(clientOptionsWithUserAgent)
    }

    private val pipelines: PipelineService by lazy {
        PipelineServiceImpl(clientOptionsWithUserAgent)
    }

    private val retrievers: RetrieverService by lazy {
        RetrieverServiceImpl(clientOptionsWithUserAgent)
    }

    private val beta: BetaService by lazy { BetaServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): LlamaCloudClientAsync = async

    override fun withRawResponse(): LlamaCloudClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlamaCloudClient =
        LlamaCloudClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun files(): FileService = files

    override fun parsing(): ParsingService = parsing

    override fun extract(): ExtractService = extract

    override fun classifier(): ClassifierService = classifier

    override fun batches(): BatchService = batches

    override fun classify(): ClassifyService = classify

    override fun configurations(): ConfigurationService = configurations

    override fun projects(): ProjectService = projects

    override fun dataSinks(): DataSinkService = dataSinks

    override fun dataSources(): DataSourceService = dataSources

    override fun pipelines(): PipelineService = pipelines

    override fun retrievers(): RetrieverService = retrievers

    override fun beta(): BetaService = beta

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LlamaCloudClient.WithRawResponse {

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val parsing: ParsingService.WithRawResponse by lazy {
            ParsingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val extract: ExtractService.WithRawResponse by lazy {
            ExtractServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val classifier: ClassifierService.WithRawResponse by lazy {
            ClassifierServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batches: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val classify: ClassifyService.WithRawResponse by lazy {
            ClassifyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val configurations: ConfigurationService.WithRawResponse by lazy {
            ConfigurationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val projects: ProjectService.WithRawResponse by lazy {
            ProjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataSinks: DataSinkService.WithRawResponse by lazy {
            DataSinkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataSources: DataSourceService.WithRawResponse by lazy {
            DataSourceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pipelines: PipelineService.WithRawResponse by lazy {
            PipelineServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val retrievers: RetrieverService.WithRawResponse by lazy {
            RetrieverServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val beta: BetaService.WithRawResponse by lazy {
            BetaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LlamaCloudClient.WithRawResponse =
            LlamaCloudClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun files(): FileService.WithRawResponse = files

        override fun parsing(): ParsingService.WithRawResponse = parsing

        override fun extract(): ExtractService.WithRawResponse = extract

        override fun classifier(): ClassifierService.WithRawResponse = classifier

        override fun batches(): BatchService.WithRawResponse = batches

        override fun classify(): ClassifyService.WithRawResponse = classify

        override fun configurations(): ConfigurationService.WithRawResponse = configurations

        override fun projects(): ProjectService.WithRawResponse = projects

        override fun dataSinks(): DataSinkService.WithRawResponse = dataSinks

        override fun dataSources(): DataSourceService.WithRawResponse = dataSources

        override fun pipelines(): PipelineService.WithRawResponse = pipelines

        override fun retrievers(): RetrieverService.WithRawResponse = retrievers

        override fun beta(): BetaService.WithRawResponse = beta
    }
}
