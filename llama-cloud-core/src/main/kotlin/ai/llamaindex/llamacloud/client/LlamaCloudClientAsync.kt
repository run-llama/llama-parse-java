// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.client

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.services.async.BatchServiceAsync
import ai.llamaindex.llamacloud.services.async.BetaServiceAsync
import ai.llamaindex.llamacloud.services.async.ClassifierServiceAsync
import ai.llamaindex.llamacloud.services.async.ClassifyServiceAsync
import ai.llamaindex.llamacloud.services.async.ConfigurationServiceAsync
import ai.llamaindex.llamacloud.services.async.DataSinkServiceAsync
import ai.llamaindex.llamacloud.services.async.DataSourceServiceAsync
import ai.llamaindex.llamacloud.services.async.ExtractServiceAsync
import ai.llamaindex.llamacloud.services.async.FileServiceAsync
import ai.llamaindex.llamacloud.services.async.ParsingServiceAsync
import ai.llamaindex.llamacloud.services.async.PipelineServiceAsync
import ai.llamaindex.llamacloud.services.async.ProjectServiceAsync
import ai.llamaindex.llamacloud.services.async.RetrieverServiceAsync
import ai.llamaindex.llamacloud.services.async.SheetServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Llama Cloud REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface LlamaCloudClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): LlamaCloudClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlamaCloudClientAsync

    fun files(): FileServiceAsync

    fun sheets(): SheetServiceAsync

    fun parsing(): ParsingServiceAsync

    fun extract(): ExtractServiceAsync

    fun classifier(): ClassifierServiceAsync

    fun batches(): BatchServiceAsync

    fun classify(): ClassifyServiceAsync

    fun configurations(): ConfigurationServiceAsync

    fun projects(): ProjectServiceAsync

    fun dataSinks(): DataSinkServiceAsync

    fun dataSources(): DataSourceServiceAsync

    fun pipelines(): PipelineServiceAsync

    fun retrievers(): RetrieverServiceAsync

    fun beta(): BetaServiceAsync

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

    /**
     * A view of [LlamaCloudClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LlamaCloudClientAsync.WithRawResponse

        fun files(): FileServiceAsync.WithRawResponse

        fun sheets(): SheetServiceAsync.WithRawResponse

        fun parsing(): ParsingServiceAsync.WithRawResponse

        fun extract(): ExtractServiceAsync.WithRawResponse

        fun classifier(): ClassifierServiceAsync.WithRawResponse

        fun batches(): BatchServiceAsync.WithRawResponse

        fun classify(): ClassifyServiceAsync.WithRawResponse

        fun configurations(): ConfigurationServiceAsync.WithRawResponse

        fun projects(): ProjectServiceAsync.WithRawResponse

        fun dataSinks(): DataSinkServiceAsync.WithRawResponse

        fun dataSources(): DataSourceServiceAsync.WithRawResponse

        fun pipelines(): PipelineServiceAsync.WithRawResponse

        fun retrievers(): RetrieverServiceAsync.WithRawResponse

        fun beta(): BetaServiceAsync.WithRawResponse
    }
}
