// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.pipelines

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.models.pipelines.metadata.MetadataCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MetadataServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val metadataServiceAsync = client.pipelines().metadata()

        val metadataFuture =
            metadataServiceAsync.create(
                MetadataCreateParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .uploadFile("Example data".byteInputStream())
                    .build()
            )

        val metadata = metadataFuture.get()
        metadata.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val metadataServiceAsync = client.pipelines().metadata()

        val future = metadataServiceAsync.deleteAll("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
