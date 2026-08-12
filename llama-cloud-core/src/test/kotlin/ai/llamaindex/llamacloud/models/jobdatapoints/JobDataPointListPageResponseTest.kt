// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.jobdatapoints

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobDataPointListPageResponseTest {

    @Test
    fun create() {
        val jobDataPointListPageResponse =
            JobDataPointListPageResponse.builder()
                .addItem(
                    JobDataPoint.builder()
                        .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .createdAt(OffsetDateTime.parse("2026-04-29T18:00:00Z"))
                        .customTag("premium")
                        .projectId("11111111-1111-1111-1111-111111111111")
                        .status("completed")
                        .updatedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                        .errorMessage("Failed to process file.")
                        .stateTransitions(
                            JobDataPoint.StateTransitions.builder()
                                .cancelledAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                                .completedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                                .failedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                                .pendingAt(OffsetDateTime.parse("2026-04-29T18:00:00Z"))
                                .runningAt(OffsetDateTime.parse("2026-04-29T18:00:05Z"))
                                .throttledAt(OffsetDateTime.parse("2026-04-29T18:00:02Z"))
                                .build()
                        )
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(jobDataPointListPageResponse.items())
            .containsExactly(
                JobDataPoint.builder()
                    .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .createdAt(OffsetDateTime.parse("2026-04-29T18:00:00Z"))
                    .customTag("premium")
                    .projectId("11111111-1111-1111-1111-111111111111")
                    .status("completed")
                    .updatedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                    .errorMessage("Failed to process file.")
                    .stateTransitions(
                        JobDataPoint.StateTransitions.builder()
                            .cancelledAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                            .completedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                            .failedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                            .pendingAt(OffsetDateTime.parse("2026-04-29T18:00:00Z"))
                            .runningAt(OffsetDateTime.parse("2026-04-29T18:00:05Z"))
                            .throttledAt(OffsetDateTime.parse("2026-04-29T18:00:02Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(jobDataPointListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(jobDataPointListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobDataPointListPageResponse =
            JobDataPointListPageResponse.builder()
                .addItem(
                    JobDataPoint.builder()
                        .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .createdAt(OffsetDateTime.parse("2026-04-29T18:00:00Z"))
                        .customTag("premium")
                        .projectId("11111111-1111-1111-1111-111111111111")
                        .status("completed")
                        .updatedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                        .errorMessage("Failed to process file.")
                        .stateTransitions(
                            JobDataPoint.StateTransitions.builder()
                                .cancelledAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                                .completedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                                .failedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                                .pendingAt(OffsetDateTime.parse("2026-04-29T18:00:00Z"))
                                .runningAt(OffsetDateTime.parse("2026-04-29T18:00:05Z"))
                                .throttledAt(OffsetDateTime.parse("2026-04-29T18:00:02Z"))
                                .build()
                        )
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedJobDataPointListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobDataPointListPageResponse),
                jacksonTypeRef<JobDataPointListPageResponse>(),
            )

        assertThat(roundtrippedJobDataPointListPageResponse).isEqualTo(jobDataPointListPageResponse)
    }
}
