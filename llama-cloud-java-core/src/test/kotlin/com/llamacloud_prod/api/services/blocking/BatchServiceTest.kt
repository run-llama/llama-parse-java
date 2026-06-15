// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.models.batches.BatchCreateParams
import com.llamacloud_prod.api.models.batches.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val batchService = client.batches()

        val batch =
            batchService.create(
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

        batch.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val batchService = client.batches()

        val page = batchService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val batchService = client.batches()

        val batch =
            batchService.get(
                BatchGetParams.builder()
                    .batchId("batch_id")
                    .addExpand("string")
                    .addExpand("string")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        batch.validate()
    }
}
