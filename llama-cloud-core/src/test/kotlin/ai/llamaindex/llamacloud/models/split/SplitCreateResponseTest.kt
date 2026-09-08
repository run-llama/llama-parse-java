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

internal class SplitCreateResponseTest {

    @Test
    fun create() {
        val splitCreateResponse =
            SplitCreateResponse.builder()
                .id("id")
                .addCategory(SplitCategory.builder().name("x").description("x").build())
                .documentInputType(SplitCreateResponse.DocumentInputType.FILE_ID)
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
                    SplitCreateResponse.SplittingStrategy.builder()
                        .allowUncategorized(
                            SplitCreateResponse.SplittingStrategy.AllowUncategorized.FORBID
                        )
                        .customInstructions("Start a new segment at every signature page.")
                        .minPagesPerSplit(1L)
                        .build()
                )
                .transactionId("transaction_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(splitCreateResponse.id()).isEqualTo("id")
        assertThat(splitCreateResponse.categories())
            .containsExactly(SplitCategory.builder().name("x").description("x").build())
        assertThat(splitCreateResponse.documentInputType())
            .isEqualTo(SplitCreateResponse.DocumentInputType.FILE_ID)
        assertThat(splitCreateResponse.fileInput())
            .isEqualTo("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(splitCreateResponse.projectId()).isEqualTo("project_id")
        assertThat(splitCreateResponse.status()).isEqualTo("status")
        assertThat(splitCreateResponse.userId()).isEqualTo("user_id")
        assertThat(splitCreateResponse.configurationId()).contains("configuration_id")
        assertThat(splitCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(splitCreateResponse.errorMessage()).contains("error_message")
        assertThat(splitCreateResponse.result())
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
        assertThat(splitCreateResponse.splittingStrategy())
            .contains(
                SplitCreateResponse.SplittingStrategy.builder()
                    .allowUncategorized(
                        SplitCreateResponse.SplittingStrategy.AllowUncategorized.FORBID
                    )
                    .customInstructions("Start a new segment at every signature page.")
                    .minPagesPerSplit(1L)
                    .build()
            )
        assertThat(splitCreateResponse.transactionId()).contains("transaction_id")
        assertThat(splitCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitCreateResponse =
            SplitCreateResponse.builder()
                .id("id")
                .addCategory(SplitCategory.builder().name("x").description("x").build())
                .documentInputType(SplitCreateResponse.DocumentInputType.FILE_ID)
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
                    SplitCreateResponse.SplittingStrategy.builder()
                        .allowUncategorized(
                            SplitCreateResponse.SplittingStrategy.AllowUncategorized.FORBID
                        )
                        .customInstructions("Start a new segment at every signature page.")
                        .minPagesPerSplit(1L)
                        .build()
                )
                .transactionId("transaction_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSplitCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitCreateResponse),
                jacksonTypeRef<SplitCreateResponse>(),
            )

        assertThat(roundtrippedSplitCreateResponse).isEqualTo(splitCreateResponse)
    }
}
