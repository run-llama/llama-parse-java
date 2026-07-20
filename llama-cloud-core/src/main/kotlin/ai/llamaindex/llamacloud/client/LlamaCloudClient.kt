// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.client

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.services.blocking.BatchService
import ai.llamaindex.llamacloud.services.blocking.BetaService
import ai.llamaindex.llamacloud.services.blocking.ClassifierService
import ai.llamaindex.llamacloud.services.blocking.ClassifyService
import ai.llamaindex.llamacloud.services.blocking.ConfigurationService
import ai.llamaindex.llamacloud.services.blocking.DataSinkService
import ai.llamaindex.llamacloud.services.blocking.DataSourceService
import ai.llamaindex.llamacloud.services.blocking.ExtractService
import ai.llamaindex.llamacloud.services.blocking.FileService
import ai.llamaindex.llamacloud.services.blocking.ParsingService
import ai.llamaindex.llamacloud.services.blocking.PipelineService
import ai.llamaindex.llamacloud.services.blocking.ProjectService
import ai.llamaindex.llamacloud.services.blocking.RetrieverService
import ai.llamaindex.llamacloud.services.blocking.SheetService
import java.util.function.Consumer

/**
 * A client for interacting with the Llama Cloud REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface LlamaCloudClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): LlamaCloudClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlamaCloudClient

    fun files(): FileService

    fun sheets(): SheetService

    fun parsing(): ParsingService

    fun extract(): ExtractService

    fun classifier(): ClassifierService

    fun batches(): BatchService

    fun classify(): ClassifyService

    fun configurations(): ConfigurationService

    fun projects(): ProjectService

    fun dataSinks(): DataSinkService

    fun dataSources(): DataSourceService

    fun pipelines(): PipelineService

    fun retrievers(): RetrieverService

    fun beta(): BetaService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [LlamaCloudClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlamaCloudClient.WithRawResponse

        fun files(): FileService.WithRawResponse

        fun sheets(): SheetService.WithRawResponse

        fun parsing(): ParsingService.WithRawResponse

        fun extract(): ExtractService.WithRawResponse

        fun classifier(): ClassifierService.WithRawResponse

        fun batches(): BatchService.WithRawResponse

        fun classify(): ClassifyService.WithRawResponse

        fun configurations(): ConfigurationService.WithRawResponse

        fun projects(): ProjectService.WithRawResponse

        fun dataSinks(): DataSinkService.WithRawResponse

        fun dataSources(): DataSourceService.WithRawResponse

        fun pipelines(): PipelineService.WithRawResponse

        fun retrievers(): RetrieverService.WithRawResponse

        fun beta(): BetaService.WithRawResponse
    }
}
