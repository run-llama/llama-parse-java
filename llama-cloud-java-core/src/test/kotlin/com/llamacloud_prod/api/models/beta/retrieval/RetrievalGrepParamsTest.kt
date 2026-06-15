// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalGrepParamsTest {

    @Test
    fun create() {
        RetrievalGrepParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fileId("file_id")
            .indexId("idx-abc123")
            .pattern("revenue|profit")
            .contextChars(0L)
            .pageSize(0L)
            .pageToken("page_token")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RetrievalGrepParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("file_id")
                .indexId("idx-abc123")
                .pattern("revenue|profit")
                .contextChars(0L)
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
        val params =
            RetrievalGrepParams.builder()
                .fileId("file_id")
                .indexId("idx-abc123")
                .pattern("revenue|profit")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RetrievalGrepParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("file_id")
                .indexId("idx-abc123")
                .pattern("revenue|profit")
                .contextChars(0L)
                .pageSize(0L)
                .pageToken("page_token")
                .build()

        val body = params._body()

        assertThat(body.fileId()).isEqualTo("file_id")
        assertThat(body.indexId()).isEqualTo("idx-abc123")
        assertThat(body.pattern()).isEqualTo("revenue|profit")
        assertThat(body.contextChars()).contains(0L)
        assertThat(body.pageSize()).contains(0L)
        assertThat(body.pageToken()).contains("page_token")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RetrievalGrepParams.builder()
                .fileId("file_id")
                .indexId("idx-abc123")
                .pattern("revenue|profit")
                .build()

        val body = params._body()

        assertThat(body.fileId()).isEqualTo("file_id")
        assertThat(body.indexId()).isEqualTo("idx-abc123")
        assertThat(body.pattern()).isEqualTo("revenue|profit")
    }
}
