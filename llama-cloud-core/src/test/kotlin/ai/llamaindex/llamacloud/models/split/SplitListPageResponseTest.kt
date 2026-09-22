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

internal class SplitListPageResponseTest {

    @Test
    fun create() {
        val splitListPageResponse =
            SplitListPageResponse.builder()
                .addItem(
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
                                .build()
                        )
                        .transactionId("transaction_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(splitListPageResponse.items())
            .containsExactly(
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
                            .build()
                    )
                    .transactionId("transaction_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(splitListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(splitListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitListPageResponse =
            SplitListPageResponse.builder()
                .addItem(
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
                                .build()
                        )
                        .transactionId("transaction_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedSplitListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitListPageResponse),
                jacksonTypeRef<SplitListPageResponse>(),
            )

        assertThat(roundtrippedSplitListPageResponse).isEqualTo(splitListPageResponse)
    }
}
