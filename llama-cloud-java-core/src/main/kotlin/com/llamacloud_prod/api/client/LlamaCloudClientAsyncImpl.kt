// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.client

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.getPackageVersion
import com.llamacloud_prod.api.services.async.BatchServiceAsync
import com.llamacloud_prod.api.services.async.BatchServiceAsyncImpl
import com.llamacloud_prod.api.services.async.BetaServiceAsync
import com.llamacloud_prod.api.services.async.BetaServiceAsyncImpl
import com.llamacloud_prod.api.services.async.ClassifierServiceAsync
import com.llamacloud_prod.api.services.async.ClassifierServiceAsyncImpl
import com.llamacloud_prod.api.services.async.ClassifyServiceAsync
import com.llamacloud_prod.api.services.async.ClassifyServiceAsyncImpl
import com.llamacloud_prod.api.services.async.ConfigurationServiceAsync
import com.llamacloud_prod.api.services.async.ConfigurationServiceAsyncImpl
import com.llamacloud_prod.api.services.async.DataSinkServiceAsync
import com.llamacloud_prod.api.services.async.DataSinkServiceAsyncImpl
import com.llamacloud_prod.api.services.async.DataSourceServiceAsync
import com.llamacloud_prod.api.services.async.DataSourceServiceAsyncImpl
import com.llamacloud_prod.api.services.async.ExtractServiceAsync
import com.llamacloud_prod.api.services.async.ExtractServiceAsyncImpl
import com.llamacloud_prod.api.services.async.FileServiceAsync
import com.llamacloud_prod.api.services.async.FileServiceAsyncImpl
import com.llamacloud_prod.api.services.async.ParsingServiceAsync
import com.llamacloud_prod.api.services.async.ParsingServiceAsyncImpl
import com.llamacloud_prod.api.services.async.PipelineServiceAsync
import com.llamacloud_prod.api.services.async.PipelineServiceAsyncImpl
import com.llamacloud_prod.api.services.async.ProjectServiceAsync
import com.llamacloud_prod.api.services.async.ProjectServiceAsyncImpl
import com.llamacloud_prod.api.services.async.RetrieverServiceAsync
import com.llamacloud_prod.api.services.async.RetrieverServiceAsyncImpl
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
