// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.models.pipelines.metadata.MetadataCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MetadataServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val metadataService = client.pipelines().metadata()

        val metadata =
            metadataService.create(
                MetadataCreateParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .uploadFile("Example data".byteInputStream())
                    .build()
            )

        metadata.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val metadataService = client.pipelines().metadata()

        metadataService.deleteAll("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
