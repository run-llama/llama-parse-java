// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.models.projects.ProjectGetParams
import com.llamacloud_prod.api.models.projects.ProjectListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProjectServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val projectService = client.projects()

        val projects =
            projectService.list(
                ProjectListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectName("project_name")
                    .build()
            )

        projects.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val projectService = client.projects()

        val project =
            projectService.get(
                ProjectGetParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        project.validate()
    }
}
