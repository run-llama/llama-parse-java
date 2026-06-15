// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories.files

import com.llamacloud_prod.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListParamsTest {

    @Test
    fun create() {
        FileListParams.builder()
            .directoryId("directory_id")
            .displayName("display_name")
            .displayNameContains("display_name_contains")
            .addExpand("string")
            .addExpand("string")
            .fileId("file_id")
            .includeDeleted(true)
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(0L)
            .pageToken("page_token")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .uniqueId("unique_id")
            .updatedAtOnOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedAtOnOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = FileListParams.builder().directoryId("directory_id").build()

        assertThat(params._pathParam(0)).isEqualTo("directory_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FileListParams.builder()
                .directoryId("directory_id")
                .displayName("display_name")
                .displayNameContains("display_name_contains")
                .addExpand("string")
                .addExpand("string")
                .fileId("file_id")
                .includeDeleted(true)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(0L)
                .pageToken("page_token")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uniqueId("unique_id")
                .updatedAtOnOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAtOnOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("display_name", "display_name")
                    .put("display_name_contains", "display_name_contains")
                    .put("expand", "string")
                    .put("expand", "string")
                    .put("file_id", "file_id")
                    .put("include_deleted", "true")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "0")
                    .put("page_token", "page_token")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("unique_id", "unique_id")
                    .put("updated_at_on_or_after", "2019-12-27T18:11:19.117Z")
                    .put("updated_at_on_or_before", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileListParams.builder().directoryId("directory_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
