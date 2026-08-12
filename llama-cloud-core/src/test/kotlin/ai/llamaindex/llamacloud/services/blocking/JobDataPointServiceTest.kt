// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.models.jobdatapoints.JobDataPointListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobDataPointServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val jobDataPointService = client.jobDataPoints()

        val page =
            jobDataPointService.list(
                JobDataPointListParams.builder()
                    .jobType(JobDataPointListParams.JobType.PARSE)
                    .build()
            )

        page.response().validate()
    }
}
