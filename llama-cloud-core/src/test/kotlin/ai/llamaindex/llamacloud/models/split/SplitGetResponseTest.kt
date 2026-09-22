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

internal class SplitGetResponseTest {

    @Test
    fun create() {
        val splitGetResponse =
            SplitGetResponse.builder()
                .id("id")
                .addCategory(SplitCategory.builder().name("x").description("x").build())
                .documentInputType(SplitGetResponse.DocumentInputType.FILE_ID)
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
                    SplitGetResponse.SplittingStrategy.builder()
                        .allowUncategorized(
                            SplitGetResponse.SplittingStrategy.AllowUncategorized.FORBID
                        )
                        .build()
                )
                .transactionId("transaction_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(splitGetResponse.id()).isEqualTo("id")
        assertThat(splitGetResponse.categories())
            .containsExactly(SplitCategory.builder().name("x").description("x").build())
        assertThat(splitGetResponse.documentInputType())
            .isEqualTo(SplitGetResponse.DocumentInputType.FILE_ID)
        assertThat(splitGetResponse.fileInput())
            .isEqualTo("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(splitGetResponse.projectId()).isEqualTo("project_id")
        assertThat(splitGetResponse.status()).isEqualTo("status")
        assertThat(splitGetResponse.userId()).isEqualTo("user_id")
        assertThat(splitGetResponse.configurationId()).contains("configuration_id")
        assertThat(splitGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(splitGetResponse.errorMessage()).contains("error_message")
        assertThat(splitGetResponse.result())
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
        assertThat(splitGetResponse.splittingStrategy())
            .contains(
                SplitGetResponse.SplittingStrategy.builder()
                    .allowUncategorized(
                        SplitGetResponse.SplittingStrategy.AllowUncategorized.FORBID
                    )
                    .build()
            )
        assertThat(splitGetResponse.transactionId()).contains("transaction_id")
        assertThat(splitGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitGetResponse =
            SplitGetResponse.builder()
                .id("id")
                .addCategory(SplitCategory.builder().name("x").description("x").build())
                .documentInputType(SplitGetResponse.DocumentInputType.FILE_ID)
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
                    SplitGetResponse.SplittingStrategy.builder()
                        .allowUncategorized(
                            SplitGetResponse.SplittingStrategy.AllowUncategorized.FORBID
                        )
                        .build()
                )
                .transactionId("transaction_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSplitGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitGetResponse),
                jacksonTypeRef<SplitGetResponse>(),
            )

        assertThat(roundtrippedSplitGetResponse).isEqualTo(splitGetResponse)
    }
}
