// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories.files

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileGetParamsTest {

    @Test
    fun create() {
        FileGetParams.builder()
            .directoryId("directory_id")
            .directoryFileId("directory_file_id")
            .addExpand("string")
            .addExpand("string")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FileGetParams.builder()
                .directoryId("directory_id")
                .directoryFileId("directory_file_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("directory_id")
        assertThat(params._pathParam(1)).isEqualTo("directory_file_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FileGetParams.builder()
                .directoryId("directory_id")
                .directoryFileId("directory_file_id")
                .addExpand("string")
                .addExpand("string")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("expand", "string")
                    .put("expand", "string")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            FileGetParams.builder()
                .directoryId("directory_id")
                .directoryFileId("directory_file_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
