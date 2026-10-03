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

internal class SplitCancelResponseTest {

    @Test
    fun create() {
        val splitCancelResponse =
            SplitCancelResponse.builder()
                .id("id")
                .addCategory(SplitCategory.builder().name("x").description("x").build())
                .documentInputType(SplitCancelResponse.DocumentInputType.FILE_ID)
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
                    SplitCancelResponse.SplittingStrategy.builder()
                        .allowUncategorized(
                            SplitCancelResponse.SplittingStrategy.AllowUncategorized.FORBID
                        )
                        .build()
                )
                .transactionId("transaction_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(splitCancelResponse.id()).isEqualTo("id")
        assertThat(splitCancelResponse.categories())
            .containsExactly(SplitCategory.builder().name("x").description("x").build())
        assertThat(splitCancelResponse.documentInputType())
            .isEqualTo(SplitCancelResponse.DocumentInputType.FILE_ID)
        assertThat(splitCancelResponse.fileInput())
            .isEqualTo("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(splitCancelResponse.projectId()).isEqualTo("project_id")
        assertThat(splitCancelResponse.status()).isEqualTo("status")
        assertThat(splitCancelResponse.userId()).isEqualTo("user_id")
        assertThat(splitCancelResponse.configurationId()).contains("configuration_id")
        assertThat(splitCancelResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(splitCancelResponse.errorMessage()).contains("error_message")
        assertThat(splitCancelResponse.result())
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
        assertThat(splitCancelResponse.splittingStrategy())
            .contains(
                SplitCancelResponse.SplittingStrategy.builder()
                    .allowUncategorized(
                        SplitCancelResponse.SplittingStrategy.AllowUncategorized.FORBID
                    )
                    .build()
            )
        assertThat(splitCancelResponse.transactionId()).contains("transaction_id")
        assertThat(splitCancelResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitCancelResponse =
            SplitCancelResponse.builder()
                .id("id")
                .addCategory(SplitCategory.builder().name("x").description("x").build())
                .documentInputType(SplitCancelResponse.DocumentInputType.FILE_ID)
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
                    SplitCancelResponse.SplittingStrategy.builder()
                        .allowUncategorized(
                            SplitCancelResponse.SplittingStrategy.AllowUncategorized.FORBID
                        )
                        .build()
                )
                .transactionId("transaction_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSplitCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitCancelResponse),
                jacksonTypeRef<SplitCancelResponse>(),
            )

        assertThat(roundtrippedSplitCancelResponse).isEqualTo(splitCancelResponse)
    }
}
