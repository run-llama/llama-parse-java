// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.retrieval

import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalReadParamsTest {

    @Test
    fun create() {
        RetrievalReadParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fileId("file_id")
            .indexId("idx-abc123")
            .maxLength(0L)
            .offset(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RetrievalReadParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("file_id")
                .indexId("idx-abc123")
                .maxLength(0L)
                .offset(0L)
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
        val params = RetrievalReadParams.builder().fileId("file_id").indexId("idx-abc123").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RetrievalReadParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("file_id")
                .indexId("idx-abc123")
                .maxLength(0L)
                .offset(0L)
                .build()

        val body = params._body()

        assertThat(body.fileId()).isEqualTo("file_id")
        assertThat(body.indexId()).isEqualTo("idx-abc123")
        assertThat(body.maxLength()).contains(0L)
        assertThat(body.offset()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RetrievalReadParams.builder().fileId("file_id").indexId("idx-abc123").build()

        val body = params._body()

        assertThat(body.fileId()).isEqualTo("file_id")
        assertThat(body.indexId()).isEqualTo("idx-abc123")
    }
}
