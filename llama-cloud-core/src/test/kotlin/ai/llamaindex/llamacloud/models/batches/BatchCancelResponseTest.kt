// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.batches

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCancelResponseTest {

    @Test
    fun create() {
        val batchCancelResponse =
            BatchCancelResponse.builder()
                .id("id")
                .config(
                    BatchCancelResponse.Config.builder()
                        .job(
                            BatchCancelResponse.Config.Job.builder()
                                .configurationId("cfg-PARSE_AGENTIC")
                                .type(BatchCancelResponse.Config.Job.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .status(BatchCancelResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    BatchCancelResponse.Result.builder()
                        .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .errorMessage("error_message")
                        .jobReference(
                            BatchCancelResponse.Result.JobReference.builder()
                                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                .type(BatchCancelResponse.Result.JobReference.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchCancelResponse.id()).isEqualTo("id")
        assertThat(batchCancelResponse.config())
            .isEqualTo(
                BatchCancelResponse.Config.builder()
                    .job(
                        BatchCancelResponse.Config.Job.builder()
                            .configurationId("cfg-PARSE_AGENTIC")
                            .type(BatchCancelResponse.Config.Job.Type.PARSE_V2)
                            .build()
                    )
                    .build()
            )
        assertThat(batchCancelResponse.projectId()).isEqualTo("project_id")
        assertThat(batchCancelResponse.sourceDirectoryId()).isEqualTo("source_directory_id")
        assertThat(batchCancelResponse.status()).isEqualTo(BatchCancelResponse.Status.CANCELLED)
        assertThat(batchCancelResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchCancelResponse.results().getOrNull())
            .containsExactly(
                BatchCancelResponse.Result.builder()
                    .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .errorMessage("error_message")
                    .jobReference(
                        BatchCancelResponse.Result.JobReference.builder()
                            .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                            .type(BatchCancelResponse.Result.JobReference.Type.PARSE_V2)
                            .build()
                    )
                    .build()
            )
        assertThat(batchCancelResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCancelResponse =
            BatchCancelResponse.builder()
                .id("id")
                .config(
                    BatchCancelResponse.Config.builder()
                        .job(
                            BatchCancelResponse.Config.Job.builder()
                                .configurationId("cfg-PARSE_AGENTIC")
                                .type(BatchCancelResponse.Config.Job.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .status(BatchCancelResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    BatchCancelResponse.Result.builder()
                        .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .errorMessage("error_message")
                        .jobReference(
                            BatchCancelResponse.Result.JobReference.builder()
                                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                .type(BatchCancelResponse.Result.JobReference.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCancelResponse),
                jacksonTypeRef<BatchCancelResponse>(),
            )

        assertThat(roundtrippedBatchCancelResponse).isEqualTo(batchCancelResponse)
    }
}
