// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.jobdatapoints

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobDataPointTest {

    @Test
    fun create() {
        val jobDataPoint =
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

        assertThat(jobDataPoint.id()).isEqualTo("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(jobDataPoint.createdAt()).isEqualTo(OffsetDateTime.parse("2026-04-29T18:00:00Z"))
        assertThat(jobDataPoint.customTag()).isEqualTo("premium")
        assertThat(jobDataPoint.projectId()).isEqualTo("11111111-1111-1111-1111-111111111111")
        assertThat(jobDataPoint.status()).isEqualTo("completed")
        assertThat(jobDataPoint.updatedAt()).isEqualTo(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
        assertThat(jobDataPoint.errorMessage()).contains("Failed to process file.")
        assertThat(jobDataPoint.stateTransitions())
            .contains(
                JobDataPoint.StateTransitions.builder()
                    .cancelledAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                    .completedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                    .failedAt(OffsetDateTime.parse("2026-04-29T18:01:00Z"))
                    .pendingAt(OffsetDateTime.parse("2026-04-29T18:00:00Z"))
                    .runningAt(OffsetDateTime.parse("2026-04-29T18:00:05Z"))
                    .throttledAt(OffsetDateTime.parse("2026-04-29T18:00:02Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobDataPoint =
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

        val roundtrippedJobDataPoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobDataPoint),
                jacksonTypeRef<JobDataPoint>(),
            )

        assertThat(roundtrippedJobDataPoint).isEqualTo(jobDataPoint)
    }
}
