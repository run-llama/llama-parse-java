// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.documents

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentGetStatusCountsResponseTest {

    @Test
    fun create() {
        val documentGetStatusCountsResponse =
            DocumentGetStatusCountsResponse.builder()
                .counts(
                    DocumentGetStatusCountsResponse.Counts.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .totalCount(0L)
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .onlyDirectUpload(true)
                .build()

        assertThat(documentGetStatusCountsResponse.counts())
            .isEqualTo(
                DocumentGetStatusCountsResponse.Counts.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(documentGetStatusCountsResponse.pipelineId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(documentGetStatusCountsResponse.totalCount()).isEqualTo(0L)
        assertThat(documentGetStatusCountsResponse.dataSourceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(documentGetStatusCountsResponse.fileId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(documentGetStatusCountsResponse.onlyDirectUpload()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentGetStatusCountsResponse =
            DocumentGetStatusCountsResponse.builder()
                .counts(
                    DocumentGetStatusCountsResponse.Counts.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .totalCount(0L)
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .onlyDirectUpload(true)
                .build()

        val roundtrippedDocumentGetStatusCountsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentGetStatusCountsResponse),
                jacksonTypeRef<DocumentGetStatusCountsResponse>(),
            )

        assertThat(roundtrippedDocumentGetStatusCountsResponse)
            .isEqualTo(documentGetStatusCountsResponse)
    }
}
