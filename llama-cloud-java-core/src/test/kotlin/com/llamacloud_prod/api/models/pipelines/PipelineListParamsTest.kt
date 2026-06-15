// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineListParamsTest {

    @Test
    fun create() {
        PipelineListParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pipelineName("pipeline_name")
            .pipelineType(PipelineType.PLAYGROUND)
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectName("project_name")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PipelineListParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pipelineName("pipeline_name")
                .pipelineType(PipelineType.PLAYGROUND)
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectName("project_name")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("pipeline_name", "pipeline_name")
                    .put("pipeline_type", "PLAYGROUND")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_name", "project_name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PipelineListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
