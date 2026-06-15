// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.batches

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchListResponseTest {

    @Test
    fun create() {
        val batchListResponse =
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

        assertThat(batchListResponse.id()).isEqualTo("id")
        assertThat(batchListResponse.config())
            .isEqualTo(
                BatchListResponse.Config.builder()
                    .job(
                        BatchListResponse.Config.Job.builder()
                            .configurationId("cfg-PARSE_AGENTIC")
                            .type(BatchListResponse.Config.Job.Type.PARSE_V2)
                            .build()
                    )
                    .build()
            )
        assertThat(batchListResponse.projectId()).isEqualTo("project_id")
        assertThat(batchListResponse.sourceDirectoryId()).isEqualTo("source_directory_id")
        assertThat(batchListResponse.status()).isEqualTo(BatchListResponse.Status.PENDING)
        assertThat(batchListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchListResponse.results().getOrNull())
            .containsExactly(
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
        assertThat(batchListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchListResponse =
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

        val roundtrippedBatchListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchListResponse),
                jacksonTypeRef<BatchListResponse>(),
            )

        assertThat(roundtrippedBatchListResponse).isEqualTo(batchListResponse)
    }
}
