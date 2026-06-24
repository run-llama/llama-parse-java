// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta.batch

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.models.beta.batch.jobitems.JobItemGetProcessingResultsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobItemServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobItemServiceAsync = client.beta().batch().jobItems()

        val pageFuture = jobItemServiceAsync.list("job_id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getProcessingResults() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobItemServiceAsync = client.beta().batch().jobItems()

        val responseFuture =
            jobItemServiceAsync.getProcessingResults(
                JobItemGetProcessingResultsParams.builder()
                    .itemId("item_id")
                    .jobType(JobItemGetProcessingResultsParams.JobType.CLASSIFY)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
