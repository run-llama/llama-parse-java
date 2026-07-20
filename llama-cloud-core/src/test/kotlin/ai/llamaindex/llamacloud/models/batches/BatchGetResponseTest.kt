// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.batches

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchGetResponseTest {

    @Test
    fun create() {
        val batchGetResponse =
            BatchGetResponse.builder()
                .id("id")
                .config(
                    BatchGetResponse.Config.builder()
                        .job(
                            BatchGetResponse.Config.Job.builder()
                                .configurationId("cfg-PARSE_AGENTIC")
                                .type(BatchGetResponse.Config.Job.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .status(BatchGetResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    BatchGetResponse.Result.builder()
                        .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .errorMessage("error_message")
                        .jobReference(
                            BatchGetResponse.Result.JobReference.builder()
                                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                .type(BatchGetResponse.Result.JobReference.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchGetResponse.id()).isEqualTo("id")
        assertThat(batchGetResponse.config())
            .isEqualTo(
                BatchGetResponse.Config.builder()
                    .job(
                        BatchGetResponse.Config.Job.builder()
                            .configurationId("cfg-PARSE_AGENTIC")
                            .type(BatchGetResponse.Config.Job.Type.PARSE_V2)
                            .build()
                    )
                    .build()
            )
        assertThat(batchGetResponse.projectId()).isEqualTo("project_id")
        assertThat(batchGetResponse.sourceDirectoryId()).isEqualTo("source_directory_id")
        assertThat(batchGetResponse.status()).isEqualTo(BatchGetResponse.Status.CANCELLED)
        assertThat(batchGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchGetResponse.results().getOrNull())
            .containsExactly(
                BatchGetResponse.Result.builder()
                    .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .errorMessage("error_message")
                    .jobReference(
                        BatchGetResponse.Result.JobReference.builder()
                            .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                            .type(BatchGetResponse.Result.JobReference.Type.PARSE_V2)
                            .build()
                    )
                    .build()
            )
        assertThat(batchGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchGetResponse =
            BatchGetResponse.builder()
                .id("id")
                .config(
                    BatchGetResponse.Config.builder()
                        .job(
                            BatchGetResponse.Config.Job.builder()
                                .configurationId("cfg-PARSE_AGENTIC")
                                .type(BatchGetResponse.Config.Job.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .status(BatchGetResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    BatchGetResponse.Result.builder()
                        .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .errorMessage("error_message")
                        .jobReference(
                            BatchGetResponse.Result.JobReference.builder()
                                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                .type(BatchGetResponse.Result.JobReference.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchGetResponse),
                jacksonTypeRef<BatchGetResponse>(),
            )

        assertThat(roundtrippedBatchGetResponse).isEqualTo(batchGetResponse)
    }
}
