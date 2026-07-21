// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.batches.BatchCreateParams
import ai.llamaindex.llamacloud.models.batches.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val batchServiceAsync = client.batches()

        val batchFuture =
            batchServiceAsync.create(
                BatchCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .config(
                        BatchCreateParams.Config.builder()
                            .job(
                                BatchCreateParams.Config.Job.builder()
                                    .configurationId("cfg-PARSE_AGENTIC")
                                    .type(BatchCreateParams.Config.Job.Type.PARSE_V2)
                                    .build()
                            )
                            .build()
                    )
                    .sourceDirectoryId("dir-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val batchServiceAsync = client.batches()

        val pageFuture = batchServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val batchServiceAsync = client.batches()

        val batchFuture =
            batchServiceAsync.get(
                BatchGetParams.builder()
                    .batchId("batch_id")
                    .addExpand("string")
                    .addExpand("string")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }
}
