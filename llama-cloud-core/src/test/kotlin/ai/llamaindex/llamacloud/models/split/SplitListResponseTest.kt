// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.split

import ai.llamaindex.llamacloud.core.jsonMapper
import ai.llamaindex.llamacloud.models.beta.split.SplitCategory
import ai.llamaindex.llamacloud.models.beta.split.SplitResultResponse
import ai.llamaindex.llamacloud.models.beta.split.SplitSegmentResponse
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
                .documentInputType(SplitListResponse.DocumentInputType.FILE_ID)
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
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
                .splittingStrategy(
                    SplitListResponse.SplittingStrategy.builder()
                        .allowUncategorized(
                            SplitListResponse.SplittingStrategy.AllowUncategorized.FORBID
                        )
                        .customInstructions("Start a new segment at every signature page.")
                        .minPagesPerSplit(1L)
                        .build()
                )
                .transactionId("transaction_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(splitListResponse.id()).isEqualTo("id")
        assertThat(splitListResponse.categories())
            .containsExactly(SplitCategory.builder().name("x").description("x").build())
        assertThat(splitListResponse.documentInputType())
            .isEqualTo(SplitListResponse.DocumentInputType.FILE_ID)
        assertThat(splitListResponse.fileInput())
            .isEqualTo("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
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
        assertThat(splitListResponse.splittingStrategy())
            .contains(
                SplitListResponse.SplittingStrategy.builder()
                    .allowUncategorized(
                        SplitListResponse.SplittingStrategy.AllowUncategorized.FORBID
                    )
                    .customInstructions("Start a new segment at every signature page.")
                    .minPagesPerSplit(1L)
                    .build()
            )
        assertThat(splitListResponse.transactionId()).contains("transaction_id")
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
                .documentInputType(SplitListResponse.DocumentInputType.FILE_ID)
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
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
                .splittingStrategy(
                    SplitListResponse.SplittingStrategy.builder()
                        .allowUncategorized(
                            SplitListResponse.SplittingStrategy.AllowUncategorized.FORBID
                        )
                        .customInstructions("Start a new segment at every signature page.")
                        .minPagesPerSplit(1L)
                        .build()
                )
                .transactionId("transaction_id")
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
