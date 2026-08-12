// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.jobdatapoints.JobDataPointListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobDataPointServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobDataPointServiceAsync = client.jobDataPoints()

        val pageFuture =
            jobDataPointServiceAsync.list(
                JobDataPointListParams.builder()
                    .jobType(JobDataPointListParams.JobType.PARSE)
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
