// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineListPaginatedResponseTest {

    @Test
    fun create() {
        val pipelineListPaginatedResponse =
            PipelineListPaginatedResponse.builder()
                .id("id")
                .name("name")
                .pipelineType(PipelineListPaginatedResponse.PipelineType.MANAGED)
                .projectId("project_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(PipelineListPaginatedResponse.Status.CREATED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(pipelineListPaginatedResponse.id()).isEqualTo("id")
        assertThat(pipelineListPaginatedResponse.name()).isEqualTo("name")
        assertThat(pipelineListPaginatedResponse.pipelineType())
            .isEqualTo(PipelineListPaginatedResponse.PipelineType.MANAGED)
        assertThat(pipelineListPaginatedResponse.projectId()).isEqualTo("project_id")
        assertThat(pipelineListPaginatedResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineListPaginatedResponse.status())
            .contains(PipelineListPaginatedResponse.Status.CREATED)
        assertThat(pipelineListPaginatedResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineListPaginatedResponse =
            PipelineListPaginatedResponse.builder()
                .id("id")
                .name("name")
                .pipelineType(PipelineListPaginatedResponse.PipelineType.MANAGED)
                .projectId("project_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(PipelineListPaginatedResponse.Status.CREATED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPipelineListPaginatedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineListPaginatedResponse),
                jacksonTypeRef<PipelineListPaginatedResponse>(),
            )

        assertThat(roundtrippedPipelineListPaginatedResponse)
            .isEqualTo(pipelineListPaginatedResponse)
    }
}
