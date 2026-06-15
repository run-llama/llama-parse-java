// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.pipelines

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SyncServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val syncService = client.pipelines().sync()

        val pipeline = syncService.create("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val syncService = client.pipelines().sync()

        val pipeline = syncService.cancel("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        pipeline.validate()
    }
}
