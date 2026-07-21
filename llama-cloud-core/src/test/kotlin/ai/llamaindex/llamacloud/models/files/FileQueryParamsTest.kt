// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.files

import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileQueryParamsTest {

    @Test
    fun create() {
        FileQueryParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filter(
                FileQueryParams.Filter.builder()
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .externalFileId("external_file_id")
                    .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileName("file_name")
                    .onlyManuallyUploaded(true)
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .orderBy("order_by")
            .pageSize(0L)
            .pageToken("page_token")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FileQueryParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filter(
                    FileQueryParams.Filter.builder()
                        .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .externalFileId("external_file_id")
                        .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .fileName("file_name")
                        .onlyManuallyUploaded(true)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .orderBy("order_by")
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
        val params = FileQueryParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            FileQueryParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filter(
                    FileQueryParams.Filter.builder()
                        .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .externalFileId("external_file_id")
                        .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .fileName("file_name")
                        .onlyManuallyUploaded(true)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .orderBy("order_by")
                .pageSize(0L)
                .pageToken("page_token")
                .build()

        val body = params._body()

        assertThat(body.filter())
            .contains(
                FileQueryParams.Filter.builder()
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .externalFileId("external_file_id")
                    .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileName("file_name")
                    .onlyManuallyUploaded(true)
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.orderBy()).contains("order_by")
        assertThat(body.pageSize()).contains(0L)
        assertThat(body.pageToken()).contains("page_token")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FileQueryParams.builder().build()

        val body = params._body()
    }
}
