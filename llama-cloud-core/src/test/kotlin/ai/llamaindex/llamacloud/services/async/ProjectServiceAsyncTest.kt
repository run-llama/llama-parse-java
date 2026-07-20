// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.projects.ProjectGetParams
import ai.llamaindex.llamacloud.models.projects.ProjectListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProjectServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val projectServiceAsync = client.projects()

        val projectsFuture =
            projectServiceAsync.list(
                ProjectListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectName("project_name")
                    .build()
            )

        val projects = projectsFuture.get()
        projects.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val projectServiceAsync = client.projects()

        val projectFuture =
            projectServiceAsync.get(
                ProjectGetParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val project = projectFuture.get()
        project.validate()
    }
}
