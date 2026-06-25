// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.files

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListParamsTest {

    @Test
    fun create() {
        FileListParams.builder()
            .addExpand("string")
            .addExpand("string")
            .externalFileId("external_file_id")
            .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fileName("file_name")
            .orderBy("order_by")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(1L)
            .pageToken("page_token")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FileListParams.builder()
                .addExpand("string")
                .addExpand("string")
                .externalFileId("external_file_id")
                .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileName("file_name")
                .orderBy("order_by")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(1L)
                .pageToken("page_token")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("expand", "string")
                    .put("expand", "string")
                    .put("external_file_id", "external_file_id")
                    .put("file_ids", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("file_ids", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("file_name", "file_name")
                    .put("order_by", "order_by")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "1")
                    .put("page_token", "page_token")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
