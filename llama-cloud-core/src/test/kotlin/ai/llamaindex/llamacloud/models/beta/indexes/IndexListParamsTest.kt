// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.indexes

import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexListParamsTest {

    @Test
    fun create() {
        IndexListParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(0L)
            .pageToken("page_token")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sourceDirectoryId("source_directory_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IndexListParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(0L)
                .pageToken("page_token")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceDirectoryId("source_directory_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "0")
                    .put("page_token", "page_token")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("source_directory_id", "source_directory_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IndexListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
