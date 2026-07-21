// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.pipelines

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SyncServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val syncServiceAsync = client.pipelines().sync()

        val pipelineFuture = syncServiceAsync.create("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val syncServiceAsync = client.pipelines().sync()

        val pipelineFuture = syncServiceAsync.cancel("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }
}
