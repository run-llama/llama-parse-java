// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.client

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.getPackageVersion
import ai.llamaindex.llamacloud.services.async.BatchServiceAsync
import ai.llamaindex.llamacloud.services.async.BatchServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.BetaServiceAsync
import ai.llamaindex.llamacloud.services.async.BetaServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.ClassifierServiceAsync
import ai.llamaindex.llamacloud.services.async.ClassifierServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.ClassifyServiceAsync
import ai.llamaindex.llamacloud.services.async.ClassifyServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.ConfigurationServiceAsync
import ai.llamaindex.llamacloud.services.async.ConfigurationServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.DataSinkServiceAsync
import ai.llamaindex.llamacloud.services.async.DataSinkServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.DataSourceServiceAsync
import ai.llamaindex.llamacloud.services.async.DataSourceServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.ExtractServiceAsync
import ai.llamaindex.llamacloud.services.async.ExtractServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.FileServiceAsync
import ai.llamaindex.llamacloud.services.async.FileServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.ParsingServiceAsync
import ai.llamaindex.llamacloud.services.async.ParsingServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.PipelineServiceAsync
import ai.llamaindex.llamacloud.services.async.PipelineServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.ProjectServiceAsync
import ai.llamaindex.llamacloud.services.async.ProjectServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.RetrieverServiceAsync
import ai.llamaindex.llamacloud.services.async.RetrieverServiceAsyncImpl
import ai.llamaindex.llamacloud.services.async.SheetServiceAsync
import ai.llamaindex.llamacloud.services.async.SheetServiceAsyncImpl
import java.util.function.Consumer

class LlamaCloudClientAsyncImpl(private val clientOptions: ClientOptions) : LlamaCloudClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: LlamaCloudClient by lazy { LlamaCloudClientImpl(clientOptions) }

    private val withRawResponse: LlamaCloudClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val sheets: SheetServiceAsync by lazy {
        SheetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val parsing: ParsingServiceAsync by lazy {
        ParsingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val extract: ExtractServiceAsync by lazy {
        ExtractServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val classifier: ClassifierServiceAsync by lazy {
        ClassifierServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batches: BatchServiceAsync by lazy {
        BatchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val classify: ClassifyServiceAsync by lazy {
        ClassifyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val configurations: ConfigurationServiceAsync by lazy {
        ConfigurationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val projects: ProjectServiceAsync by lazy {
        ProjectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dataSinks: DataSinkServiceAsync by lazy {
        DataSinkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dataSources: DataSourceServiceAsync by lazy {
        DataSourceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val pipelines: PipelineServiceAsync by lazy {
        PipelineServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val retrievers: RetrieverServiceAsync by lazy {
        RetrieverServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val beta: BetaServiceAsync by lazy { BetaServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): LlamaCloudClient = sync

    override fun withRawResponse(): LlamaCloudClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlamaCloudClientAsync =
        LlamaCloudClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun files(): FileServiceAsync = files

    override fun sheets(): SheetServiceAsync = sheets

    override fun parsing(): ParsingServiceAsync = parsing

    override fun extract(): ExtractServiceAsync = extract

    override fun classifier(): ClassifierServiceAsync = classifier

    override fun batches(): BatchServiceAsync = batches

    override fun classify(): ClassifyServiceAsync = classify

    override fun configurations(): ConfigurationServiceAsync = configurations

    override fun projects(): ProjectServiceAsync = projects

    override fun dataSinks(): DataSinkServiceAsync = dataSinks

    override fun dataSources(): DataSourceServiceAsync = dataSources

    override fun pipelines(): PipelineServiceAsync = pipelines

    override fun retrievers(): RetrieverServiceAsync = retrievers

    override fun beta(): BetaServiceAsync = beta

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LlamaCloudClientAsync.WithRawResponse {

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sheets: SheetServiceAsync.WithRawResponse by lazy {
            SheetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val parsing: ParsingServiceAsync.WithRawResponse by lazy {
            ParsingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val extract: ExtractServiceAsync.WithRawResponse by lazy {
            ExtractServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val classifier: ClassifierServiceAsync.WithRawResponse by lazy {
            ClassifierServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batches: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val classify: ClassifyServiceAsync.WithRawResponse by lazy {
            ClassifyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val configurations: ConfigurationServiceAsync.WithRawResponse by lazy {
            ConfigurationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val projects: ProjectServiceAsync.WithRawResponse by lazy {
            ProjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataSinks: DataSinkServiceAsync.WithRawResponse by lazy {
            DataSinkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataSources: DataSourceServiceAsync.WithRawResponse by lazy {
            DataSourceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pipelines: PipelineServiceAsync.WithRawResponse by lazy {
            PipelineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val retrievers: RetrieverServiceAsync.WithRawResponse by lazy {
            RetrieverServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val beta: BetaServiceAsync.WithRawResponse by lazy {
            BetaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LlamaCloudClientAsync.WithRawResponse =
            LlamaCloudClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun files(): FileServiceAsync.WithRawResponse = files

        override fun sheets(): SheetServiceAsync.WithRawResponse = sheets

        override fun parsing(): ParsingServiceAsync.WithRawResponse = parsing

        override fun extract(): ExtractServiceAsync.WithRawResponse = extract

        override fun classifier(): ClassifierServiceAsync.WithRawResponse = classifier

        override fun batches(): BatchServiceAsync.WithRawResponse = batches

        override fun classify(): ClassifyServiceAsync.WithRawResponse = classify

        override fun configurations(): ConfigurationServiceAsync.WithRawResponse = configurations

        override fun projects(): ProjectServiceAsync.WithRawResponse = projects

        override fun dataSinks(): DataSinkServiceAsync.WithRawResponse = dataSinks

        override fun dataSources(): DataSourceServiceAsync.WithRawResponse = dataSources

        override fun pipelines(): PipelineServiceAsync.WithRawResponse = pipelines

        override fun retrievers(): RetrieverServiceAsync.WithRawResponse = retrievers

        override fun beta(): BetaServiceAsync.WithRawResponse = beta
    }
}
