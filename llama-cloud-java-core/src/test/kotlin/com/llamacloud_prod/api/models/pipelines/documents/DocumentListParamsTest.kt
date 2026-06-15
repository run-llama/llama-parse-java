// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.documents

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListParamsTest {

    @Test
    fun create() {
        DocumentListParams.builder()
            .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(0L)
            .onlyApiDataSourceDocuments(true)
            .onlyDirectUpload(true)
            .skip(0L)
            .statusRefreshPolicy(DocumentListParams.StatusRefreshPolicy.CACHED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentListParams.builder().pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DocumentListParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(0L)
                .onlyApiDataSourceDocuments(true)
                .onlyDirectUpload(true)
                .skip(0L)
                .statusRefreshPolicy(DocumentListParams.StatusRefreshPolicy.CACHED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("file_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("limit", "0")
                    .put("only_api_data_source_documents", "true")
                    .put("only_direct_upload", "true")
                    .put("skip", "0")
                    .put("status_refresh_policy", "cached")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DocumentListParams.builder().pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
