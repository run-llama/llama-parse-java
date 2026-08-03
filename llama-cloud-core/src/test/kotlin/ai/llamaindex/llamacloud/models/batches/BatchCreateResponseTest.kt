// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.batches

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateResponseTest {

    @Test
    fun create() {
        val batchCreateResponse =
            BatchCreateResponse.builder()
                .id("id")
                .config(
                    BatchCreateResponse.Config.builder()
                        .job(
                            BatchCreateResponse.Config.Job.builder()
                                .configurationId("cfg-PARSE_AGENTIC")
                                .type(BatchCreateResponse.Config.Job.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .status(BatchCreateResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    BatchCreateResponse.Result.builder()
                        .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .errorMessage("error_message")
                        .jobReference(
                            BatchCreateResponse.Result.JobReference.builder()
                                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                .type(BatchCreateResponse.Result.JobReference.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchCreateResponse.id()).isEqualTo("id")
        assertThat(batchCreateResponse.config())
            .isEqualTo(
                BatchCreateResponse.Config.builder()
                    .job(
                        BatchCreateResponse.Config.Job.builder()
                            .configurationId("cfg-PARSE_AGENTIC")
                            .type(BatchCreateResponse.Config.Job.Type.PARSE_V2)
                            .build()
                    )
                    .build()
            )
        assertThat(batchCreateResponse.projectId()).isEqualTo("project_id")
        assertThat(batchCreateResponse.sourceDirectoryId()).isEqualTo("source_directory_id")
        assertThat(batchCreateResponse.status()).isEqualTo(BatchCreateResponse.Status.CANCELLED)
        assertThat(batchCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchCreateResponse.results().getOrNull())
            .containsExactly(
                BatchCreateResponse.Result.builder()
                    .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .errorMessage("error_message")
                    .jobReference(
                        BatchCreateResponse.Result.JobReference.builder()
                            .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                            .type(BatchCreateResponse.Result.JobReference.Type.PARSE_V2)
                            .build()
                    )
                    .build()
            )
        assertThat(batchCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCreateResponse =
            BatchCreateResponse.builder()
                .id("id")
                .config(
                    BatchCreateResponse.Config.builder()
                        .job(
                            BatchCreateResponse.Config.Job.builder()
                                .configurationId("cfg-PARSE_AGENTIC")
                                .type(BatchCreateResponse.Config.Job.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .status(BatchCreateResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    BatchCreateResponse.Result.builder()
                        .sourceDirectoryFileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .errorMessage("error_message")
                        .jobReference(
                            BatchCreateResponse.Result.JobReference.builder()
                                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                                .type(BatchCreateResponse.Result.JobReference.Type.PARSE_V2)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCreateResponse),
                jacksonTypeRef<BatchCreateResponse>(),
            )

        assertThat(roundtrippedBatchCreateResponse).isEqualTo(batchCreateResponse)
    }
}
