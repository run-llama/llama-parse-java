// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.classify

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyGetResponseTest {

    @Test
    fun create() {
        val classifyGetResponse =
            ClassifyGetResponse.builder()
                .id("id")
                .configuration(
                    ClassifyConfiguration.builder()
                        .addRule(
                            ClassifyConfiguration.Rule.builder()
                                .description(
                                    "contains invoice number, line items, and total amount"
                                )
                                .type("invoice")
                                .build()
                        )
                        .mode(ClassifyConfiguration.Mode.FAST)
                        .parsingConfiguration(
                            ClassifyConfiguration.ParsingConfiguration.builder()
                                .lang("en")
                                .maxPages(10L)
                                .targetPages("1,3,5-7")
                                .build()
                        )
                        .build()
                )
                .documentInputType(ClassifyGetResponse.DocumentInputType.FILE_ID)
                .fileInput("file_input")
                .projectId("project_id")
                .status(ClassifyGetResponse.Status.COMPLETED)
                .userId("user_id")
                .configurationId("configuration_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .parseJobId("parse_job_id")
                .result(
                    ClassifyResult.builder()
                        .confidence(0.0)
                        .reasoning("reasoning")
                        .type("type")
                        .build()
                )
                .transactionId("transaction_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(classifyGetResponse.id()).isEqualTo("id")
        assertThat(classifyGetResponse.configuration())
            .isEqualTo(
                ClassifyConfiguration.builder()
                    .addRule(
                        ClassifyConfiguration.Rule.builder()
                            .description("contains invoice number, line items, and total amount")
                            .type("invoice")
                            .build()
                    )
                    .mode(ClassifyConfiguration.Mode.FAST)
                    .parsingConfiguration(
                        ClassifyConfiguration.ParsingConfiguration.builder()
                            .lang("en")
                            .maxPages(10L)
                            .targetPages("1,3,5-7")
                            .build()
                    )
                    .build()
            )
        assertThat(classifyGetResponse.documentInputType())
            .isEqualTo(ClassifyGetResponse.DocumentInputType.FILE_ID)
        assertThat(classifyGetResponse.fileInput()).isEqualTo("file_input")
        assertThat(classifyGetResponse.projectId()).isEqualTo("project_id")
        assertThat(classifyGetResponse.status()).isEqualTo(ClassifyGetResponse.Status.COMPLETED)
        assertThat(classifyGetResponse.userId()).isEqualTo("user_id")
        assertThat(classifyGetResponse.configurationId()).contains("configuration_id")
        assertThat(classifyGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(classifyGetResponse.errorMessage()).contains("error_message")
        assertThat(classifyGetResponse.parseJobId()).contains("parse_job_id")
        assertThat(classifyGetResponse.result())
            .contains(
                ClassifyResult.builder().confidence(0.0).reasoning("reasoning").type("type").build()
            )
        assertThat(classifyGetResponse.transactionId()).contains("transaction_id")
        assertThat(classifyGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyGetResponse =
            ClassifyGetResponse.builder()
                .id("id")
                .configuration(
                    ClassifyConfiguration.builder()
                        .addRule(
                            ClassifyConfiguration.Rule.builder()
                                .description(
                                    "contains invoice number, line items, and total amount"
                                )
                                .type("invoice")
                                .build()
                        )
                        .mode(ClassifyConfiguration.Mode.FAST)
                        .parsingConfiguration(
                            ClassifyConfiguration.ParsingConfiguration.builder()
                                .lang("en")
                                .maxPages(10L)
                                .targetPages("1,3,5-7")
                                .build()
                        )
                        .build()
                )
                .documentInputType(ClassifyGetResponse.DocumentInputType.FILE_ID)
                .fileInput("file_input")
                .projectId("project_id")
                .status(ClassifyGetResponse.Status.COMPLETED)
                .userId("user_id")
                .configurationId("configuration_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .parseJobId("parse_job_id")
                .result(
                    ClassifyResult.builder()
                        .confidence(0.0)
                        .reasoning("reasoning")
                        .type("type")
                        .build()
                )
                .transactionId("transaction_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedClassifyGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyGetResponse),
                jacksonTypeRef<ClassifyGetResponse>(),
            )

        assertThat(roundtrippedClassifyGetResponse).isEqualTo(classifyGetResponse)
    }
}
