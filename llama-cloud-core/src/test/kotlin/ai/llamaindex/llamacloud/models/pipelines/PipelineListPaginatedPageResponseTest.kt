// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineListPaginatedPageResponseTest {

    @Test
    fun create() {
        val pipelineListPaginatedPageResponse =
            PipelineListPaginatedPageResponse.builder()
                .addItem(
                    PipelineListPaginatedResponse.builder()
                        .id("id")
                        .name("name")
                        .pipelineType(PipelineListPaginatedResponse.PipelineType.MANAGED)
                        .projectId("project_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PipelineListPaginatedResponse.Status.CREATED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(pipelineListPaginatedPageResponse.items())
            .containsExactly(
                PipelineListPaginatedResponse.builder()
                    .id("id")
                    .name("name")
                    .pipelineType(PipelineListPaginatedResponse.PipelineType.MANAGED)
                    .projectId("project_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(PipelineListPaginatedResponse.Status.CREATED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(pipelineListPaginatedPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(pipelineListPaginatedPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineListPaginatedPageResponse =
            PipelineListPaginatedPageResponse.builder()
                .addItem(
                    PipelineListPaginatedResponse.builder()
                        .id("id")
                        .name("name")
                        .pipelineType(PipelineListPaginatedResponse.PipelineType.MANAGED)
                        .projectId("project_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PipelineListPaginatedResponse.Status.CREATED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedPipelineListPaginatedPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineListPaginatedPageResponse),
                jacksonTypeRef<PipelineListPaginatedPageResponse>(),
            )

        assertThat(roundtrippedPipelineListPaginatedPageResponse)
            .isEqualTo(pipelineListPaginatedPageResponse)
    }
}
