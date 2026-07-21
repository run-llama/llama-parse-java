// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.split

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitListResponseTest {

    @Test
    fun create() {
        val splitListResponse =
            SplitListResponse.builder()
                .id("id")
                .addCategory(SplitCategory.builder().name("x").description("x").build())
                .documentInput(SplitDocumentInput.builder().type("type").value("value").build())
                .projectId("project_id")
                .status("status")
                .userId("user_id")
                .configurationId("configuration_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .result(
                    SplitResultResponse.builder()
                        .addSegment(
                            SplitSegmentResponse.builder()
                                .category("category")
                                .confidenceCategory("confidence_category")
                                .addPage(0L)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(splitListResponse.id()).isEqualTo("id")
        assertThat(splitListResponse.categories())
            .containsExactly(SplitCategory.builder().name("x").description("x").build())
        assertThat(splitListResponse.documentInput())
            .isEqualTo(SplitDocumentInput.builder().type("type").value("value").build())
        assertThat(splitListResponse.projectId()).isEqualTo("project_id")
        assertThat(splitListResponse.status()).isEqualTo("status")
        assertThat(splitListResponse.userId()).isEqualTo("user_id")
        assertThat(splitListResponse.configurationId()).contains("configuration_id")
        assertThat(splitListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(splitListResponse.errorMessage()).contains("error_message")
        assertThat(splitListResponse.result())
            .contains(
                SplitResultResponse.builder()
                    .addSegment(
                        SplitSegmentResponse.builder()
                            .category("category")
                            .confidenceCategory("confidence_category")
                            .addPage(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(splitListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitListResponse =
            SplitListResponse.builder()
                .id("id")
                .addCategory(SplitCategory.builder().name("x").description("x").build())
                .documentInput(SplitDocumentInput.builder().type("type").value("value").build())
                .projectId("project_id")
                .status("status")
                .userId("user_id")
                .configurationId("configuration_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .result(
                    SplitResultResponse.builder()
                        .addSegment(
                            SplitSegmentResponse.builder()
                                .category("category")
                                .confidenceCategory("confidence_category")
                                .addPage(0L)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSplitListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitListResponse),
                jacksonTypeRef<SplitListResponse>(),
            )

        assertThat(roundtrippedSplitListResponse).isEqualTo(splitListResponse)
    }
}
