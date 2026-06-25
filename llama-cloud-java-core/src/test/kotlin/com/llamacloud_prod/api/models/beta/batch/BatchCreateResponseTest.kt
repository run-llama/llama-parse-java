// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateResponseTest {

    @Test
    fun create() {
        val batchCreateResponse =
            BatchCreateResponse.builder()
                .id("bjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .jobType(BatchCreateResponse.JobType.CLASSIFY)
                .projectId("proj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status(BatchCreateResponse.Status.CANCELLED)
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

        assertThat(batchCreateResponse.id()).isEqualTo("bjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(batchCreateResponse.jobType()).isEqualTo(BatchCreateResponse.JobType.CLASSIFY)
        assertThat(batchCreateResponse.projectId())
            .isEqualTo("proj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(batchCreateResponse.status()).isEqualTo(BatchCreateResponse.Status.CANCELLED)
        assertThat(batchCreateResponse.totalItems()).isEqualTo(0L)
        assertThat(batchCreateResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchCreateResponse.directoryId())
            .contains("dir-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(batchCreateResponse.effectiveAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchCreateResponse.errorMessage()).contains("error_message")
        assertThat(batchCreateResponse.failedItems()).contains(0L)
        assertThat(batchCreateResponse.jobRecordId()).contains("job_record_id")
        assertThat(batchCreateResponse.processedItems()).contains(0L)
        assertThat(batchCreateResponse.skippedItems()).contains(0L)
        assertThat(batchCreateResponse.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchCreateResponse.workflowId()).contains("workflow_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCreateResponse =
            BatchCreateResponse.builder()
                .id("bjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .jobType(BatchCreateResponse.JobType.CLASSIFY)
                .projectId("proj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status(BatchCreateResponse.Status.CANCELLED)
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

        val roundtrippedBatchCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCreateResponse),
                jacksonTypeRef<BatchCreateResponse>(),
            )

        assertThat(roundtrippedBatchCreateResponse).isEqualTo(batchCreateResponse)
    }
}
