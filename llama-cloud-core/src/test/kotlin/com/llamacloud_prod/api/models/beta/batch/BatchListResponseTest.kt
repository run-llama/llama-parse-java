// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchListResponseTest {

    @Test
    fun create() {
        val batchListResponse =
            BatchListResponse.builder()
                .id("bjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .jobType(BatchListResponse.JobType.CLASSIFY)
                .projectId("proj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status(BatchListResponse.Status.CANCELLED)
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

        assertThat(batchListResponse.id()).isEqualTo("bjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(batchListResponse.jobType()).isEqualTo(BatchListResponse.JobType.CLASSIFY)
        assertThat(batchListResponse.projectId())
            .isEqualTo("proj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(batchListResponse.status()).isEqualTo(BatchListResponse.Status.CANCELLED)
        assertThat(batchListResponse.totalItems()).isEqualTo(0L)
        assertThat(batchListResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchListResponse.directoryId())
            .contains("dir-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(batchListResponse.effectiveAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchListResponse.errorMessage()).contains("error_message")
        assertThat(batchListResponse.failedItems()).contains(0L)
        assertThat(batchListResponse.jobRecordId()).contains("job_record_id")
        assertThat(batchListResponse.processedItems()).contains(0L)
        assertThat(batchListResponse.skippedItems()).contains(0L)
        assertThat(batchListResponse.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchListResponse.workflowId()).contains("workflow_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchListResponse =
            BatchListResponse.builder()
                .id("bjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .jobType(BatchListResponse.JobType.CLASSIFY)
                .projectId("proj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status(BatchListResponse.Status.CANCELLED)
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

        val roundtrippedBatchListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchListResponse),
                jacksonTypeRef<BatchListResponse>(),
            )

        assertThat(roundtrippedBatchListResponse).isEqualTo(batchListResponse)
    }
}
