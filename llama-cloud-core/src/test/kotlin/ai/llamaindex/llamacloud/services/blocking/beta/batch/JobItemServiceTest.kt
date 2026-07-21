// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta.batch

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.models.beta.batch.jobitems.JobItemGetProcessingResultsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobItemServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val jobItemService = client.beta().batch().jobItems()

        val page = jobItemService.list("job_id")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getProcessingResults() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val jobItemService = client.beta().batch().jobItems()

        val response =
            jobItemService.getProcessingResults(
                JobItemGetProcessingResultsParams.builder()
                    .itemId("item_id")
                    .jobType(JobItemGetProcessingResultsParams.JobType.CLASSIFY)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
