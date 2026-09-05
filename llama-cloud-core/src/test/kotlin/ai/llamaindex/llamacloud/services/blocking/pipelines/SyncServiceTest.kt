// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.models.pipelines.sync.SyncCancelParams
import ai.llamaindex.llamacloud.models.pipelines.sync.SyncCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SyncServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val syncService = client.pipelines().sync()

        val pipeline =
            syncService.create(
                SyncCreateParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val syncService = client.pipelines().sync()

        val pipeline =
            syncService.cancel(
                SyncCancelParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        pipeline.validate()
    }
}
