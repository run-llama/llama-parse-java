// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.batches

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BatchCreateParams.builder()
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.config())
            .isEqualTo(
                BatchCreateParams.Config.builder()
                    .job(
                        BatchCreateParams.Config.Job.builder()
                            .configurationId("cfg-PARSE_AGENTIC")
                            .type(BatchCreateParams.Config.Job.Type.PARSE_V2)
                            .build()
                    )
                    .build()
            )
        assertThat(body.sourceDirectoryId()).isEqualTo("dir-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchCreateParams.builder()
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

        val body = params._body()

        assertThat(body.config())
            .isEqualTo(
                BatchCreateParams.Config.builder()
                    .job(
                        BatchCreateParams.Config.Job.builder()
                            .configurationId("cfg-PARSE_AGENTIC")
                            .type(BatchCreateParams.Config.Job.Type.PARSE_V2)
                            .build()
                    )
                    .build()
            )
        assertThat(body.sourceDirectoryId()).isEqualTo("dir-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
    }
}
