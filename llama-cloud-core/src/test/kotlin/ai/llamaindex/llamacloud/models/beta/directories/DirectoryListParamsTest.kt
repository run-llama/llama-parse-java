// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.directories

import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryListParamsTest {

    @Test
    fun create() {
        DirectoryListParams.builder()
            .includeDeleted(true)
            .name("name")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(0L)
            .pageToken("page_token")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(DirectoryListParams.Type.EPHEMERAL)
            .addType(DirectoryListParams.DirectoryTypesItem.EPHEMERAL)
            .addType(DirectoryListParams.DirectoryTypesItem.INDEX)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DirectoryListParams.builder()
                .includeDeleted(true)
                .name("name")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(0L)
                .pageToken("page_token")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(DirectoryListParams.Type.EPHEMERAL)
                .addType(DirectoryListParams.DirectoryTypesItem.EPHEMERAL)
                .addType(DirectoryListParams.DirectoryTypesItem.INDEX)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("include_deleted", "true")
                    .put("name", "name")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "0")
                    .put("page_token", "page_token")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("type", "ephemeral")
                    .put("types", "ephemeral")
                    .put("types", "index")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DirectoryListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
