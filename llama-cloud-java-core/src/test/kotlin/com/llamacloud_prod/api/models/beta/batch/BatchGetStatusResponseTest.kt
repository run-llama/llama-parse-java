// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchGetStatusResponseTest {

    @Test
    fun create() {
        val batchGetStatusResponse =
            BatchGetStatusResponse.builder()
                .job(
                    BatchGetStatusResponse.Job.builder()
                        .id("bjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .jobType(BatchGetStatusResponse.Job.JobType.CLASSIFY)
                        .projectId("proj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .status(BatchGetStatusResponse.Job.Status.CANCELLED)
                        .totalItems(0L)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .directoryId("dir-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("error_message")
                        .failedItems(0L)
                        .jobRecordId("job_record_id")
                        .processedItems(0L)
                        .skippedItems(0L)
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workflowId("workflow_id")
                        .build()
                )
                .progressPercentage(0.0)
                .build()

        assertThat(batchGetStatusResponse.job())
            .isEqualTo(
                BatchGetStatusResponse.Job.builder()
                    .id("bjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .jobType(BatchGetStatusResponse.Job.JobType.CLASSIFY)
                    .projectId("proj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .status(BatchGetStatusResponse.Job.Status.CANCELLED)
                    .totalItems(0L)
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .directoryId("dir-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .errorMessage("error_message")
                    .failedItems(0L)
                    .jobRecordId("job_record_id")
                    .processedItems(0L)
                    .skippedItems(0L)
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .workflowId("workflow_id")
                    .build()
            )
        assertThat(batchGetStatusResponse.progressPercentage()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchGetStatusResponse =
            BatchGetStatusResponse.builder()
                .job(
                    BatchGetStatusResponse.Job.builder()
                        .id("bjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .jobType(BatchGetStatusResponse.Job.JobType.CLASSIFY)
                        .projectId("proj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .status(BatchGetStatusResponse.Job.Status.CANCELLED)
                        .totalItems(0L)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .directoryId("dir-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("error_message")
                        .failedItems(0L)
                        .jobRecordId("job_record_id")
                        .processedItems(0L)
                        .skippedItems(0L)
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .workflowId("workflow_id")
                        .build()
                )
                .progressPercentage(0.0)
                .build()

        val roundtrippedBatchGetStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchGetStatusResponse),
                jacksonTypeRef<BatchGetStatusResponse>(),
            )

        assertThat(roundtrippedBatchGetStatusResponse).isEqualTo(batchGetStatusResponse)
    }
}
