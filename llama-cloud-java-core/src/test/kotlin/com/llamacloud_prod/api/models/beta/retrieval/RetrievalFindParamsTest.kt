// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalFindParamsTest {

    @Test
    fun create() {
        RetrievalFindParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .indexId("idx-abc123")
            .fileName("file_name")
            .fileNameContains("file_name_contains")
            .pageSize(0L)
            .pageToken("page_token")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RetrievalFindParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .indexId("idx-abc123")
                .fileName("file_name")
                .fileNameContains("file_name_contains")
                .pageSize(0L)
                .pageToken("page_token")
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
        val params = RetrievalFindParams.builder().indexId("idx-abc123").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RetrievalFindParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .indexId("idx-abc123")
                .fileName("file_name")
                .fileNameContains("file_name_contains")
                .pageSize(0L)
                .pageToken("page_token")
                .build()

        val body = params._body()

        assertThat(body.indexId()).isEqualTo("idx-abc123")
        assertThat(body.fileName()).contains("file_name")
        assertThat(body.fileNameContains()).contains("file_name_contains")
        assertThat(body.pageSize()).contains(0L)
        assertThat(body.pageToken()).contains("page_token")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RetrievalFindParams.builder().indexId("idx-abc123").build()

        val body = params._body()

        assertThat(body.indexId()).isEqualTo("idx-abc123")
    }
}
