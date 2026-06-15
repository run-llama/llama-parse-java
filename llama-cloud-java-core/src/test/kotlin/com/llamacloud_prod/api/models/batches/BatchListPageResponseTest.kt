// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.batches

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
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
                        .id("id")
                        .config(
                            BatchListResponse.Config.builder()
                                .job(
                                    BatchListResponse.Config.Job.builder()
                                        .configurationId("cfg-PARSE_AGENTIC")
                                        .type(BatchListResponse.Config.Job.Type.PARSE_V2)
                                        .build()
                                )
                                .build()
                        )
                        .projectId("project_id")
                        .sourceDirectoryId("source_directory_id")
                        .status(BatchListResponse.Status.PENDING)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addResult(
                            BatchListResponse.Result.builder()
                                .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                .errorMessage("error_message")
                                .jobReference(
                                    BatchListResponse.Result.JobReference.builder()
                                        .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                        .type(BatchListResponse.Result.JobReference.Type.PARSE_V2)
                                        .build()
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(batchListPageResponse.items())
            .containsExactly(
                BatchListResponse.builder()
                    .id("id")
                    .config(
                        BatchListResponse.Config.builder()
                            .job(
                                BatchListResponse.Config.Job.builder()
                                    .configurationId("cfg-PARSE_AGENTIC")
                                    .type(BatchListResponse.Config.Job.Type.PARSE_V2)
                                    .build()
                            )
                            .build()
                    )
                    .projectId("project_id")
                    .sourceDirectoryId("source_directory_id")
                    .status(BatchListResponse.Status.PENDING)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addResult(
                        BatchListResponse.Result.builder()
                            .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                            .errorMessage("error_message")
                            .jobReference(
                                BatchListResponse.Result.JobReference.builder()
                                    .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                    .type(BatchListResponse.Result.JobReference.Type.PARSE_V2)
                                    .build()
                            )
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .id("id")
                        .config(
                            BatchListResponse.Config.builder()
                                .job(
                                    BatchListResponse.Config.Job.builder()
                                        .configurationId("cfg-PARSE_AGENTIC")
                                        .type(BatchListResponse.Config.Job.Type.PARSE_V2)
                                        .build()
                                )
                                .build()
                        )
                        .projectId("project_id")
                        .sourceDirectoryId("source_directory_id")
                        .status(BatchListResponse.Status.PENDING)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addResult(
                            BatchListResponse.Result.builder()
                                .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                .errorMessage("error_message")
                                .jobReference(
                                    BatchListResponse.Result.JobReference.builder()
                                        .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                        .type(BatchListResponse.Result.JobReference.Type.PARSE_V2)
                                        .build()
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
