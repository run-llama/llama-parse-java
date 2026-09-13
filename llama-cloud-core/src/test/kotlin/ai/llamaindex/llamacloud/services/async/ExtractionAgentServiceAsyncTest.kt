// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExtractionAgentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val extractionAgentServiceAsync = client.extractionAgents()

        val pageFuture = extractionAgentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
