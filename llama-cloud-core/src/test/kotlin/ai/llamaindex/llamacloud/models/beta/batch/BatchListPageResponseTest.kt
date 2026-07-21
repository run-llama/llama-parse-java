// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.batch

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchListPageResponseTest {

    @Test
    fun create() {
        val batchListPageResponse =
            BatchListPageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(batchListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(batchListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(batchListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchListPageResponse =
            BatchListPageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedBatchListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchListPageResponse),
                jacksonTypeRef<BatchListPageResponse>(),
            )

        assertThat(roundtrippedBatchListPageResponse).isEqualTo(batchListPageResponse)
    }
}
