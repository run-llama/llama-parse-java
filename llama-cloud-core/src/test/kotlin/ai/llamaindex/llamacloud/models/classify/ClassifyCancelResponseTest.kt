// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.classify

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyCancelResponseTest {

    @Test
    fun create() {
        val classifyCancelResponse =
            ClassifyCancelResponse.builder()
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
                .documentInputType(ClassifyCancelResponse.DocumentInputType.FILE_ID)
                .fileInput("file_input")
                .projectId("project_id")
                .status(ClassifyCancelResponse.Status.COMPLETED)
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

        assertThat(classifyCancelResponse.id()).isEqualTo("id")
        assertThat(classifyCancelResponse.configuration())
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
        assertThat(classifyCancelResponse.documentInputType())
            .isEqualTo(ClassifyCancelResponse.DocumentInputType.FILE_ID)
        assertThat(classifyCancelResponse.fileInput()).isEqualTo("file_input")
        assertThat(classifyCancelResponse.projectId()).isEqualTo("project_id")
        assertThat(classifyCancelResponse.status())
            .isEqualTo(ClassifyCancelResponse.Status.COMPLETED)
        assertThat(classifyCancelResponse.userId()).isEqualTo("user_id")
        assertThat(classifyCancelResponse.configurationId()).contains("configuration_id")
        assertThat(classifyCancelResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(classifyCancelResponse.errorMessage()).contains("error_message")
        assertThat(classifyCancelResponse.parseJobId()).contains("parse_job_id")
        assertThat(classifyCancelResponse.result())
            .contains(
                ClassifyResult.builder().confidence(0.0).reasoning("reasoning").type("type").build()
            )
        assertThat(classifyCancelResponse.transactionId()).contains("transaction_id")
        assertThat(classifyCancelResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyCancelResponse =
            ClassifyCancelResponse.builder()
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
                .documentInputType(ClassifyCancelResponse.DocumentInputType.FILE_ID)
                .fileInput("file_input")
                .projectId("project_id")
                .status(ClassifyCancelResponse.Status.COMPLETED)
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

        val roundtrippedClassifyCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyCancelResponse),
                jacksonTypeRef<ClassifyCancelResponse>(),
            )

        assertThat(roundtrippedClassifyCancelResponse).isEqualTo(classifyCancelResponse)
    }
}
