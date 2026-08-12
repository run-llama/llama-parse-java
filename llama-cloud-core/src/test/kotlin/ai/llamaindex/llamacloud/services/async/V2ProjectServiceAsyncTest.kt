// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class V2ProjectServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val v2ProjectServiceAsync = client.v2Projects()

        val pageFuture = v2ProjectServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val v2ProjectServiceAsync = client.v2Projects()

        val v2ProjectFuture =
            v2ProjectServiceAsync.get(
                V2ProjectGetParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val v2Project = v2ProjectFuture.get()
        v2Project.validate()
    }
}
