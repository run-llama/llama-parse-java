// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classify

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyListResponseTest {

    @Test
    fun create() {
        val classifyListResponse =
            ClassifyListResponse.builder()
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
                .documentInputType(ClassifyListResponse.DocumentInputType.FILE_ID)
                .fileInput("file_input")
                .projectId("project_id")
                .status(ClassifyListResponse.Status.COMPLETED)
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

        assertThat(classifyListResponse.id()).isEqualTo("id")
        assertThat(classifyListResponse.configuration())
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
        assertThat(classifyListResponse.documentInputType())
            .isEqualTo(ClassifyListResponse.DocumentInputType.FILE_ID)
        assertThat(classifyListResponse.fileInput()).isEqualTo("file_input")
        assertThat(classifyListResponse.projectId()).isEqualTo("project_id")
        assertThat(classifyListResponse.status()).isEqualTo(ClassifyListResponse.Status.COMPLETED)
        assertThat(classifyListResponse.userId()).isEqualTo("user_id")
        assertThat(classifyListResponse.configurationId()).contains("configuration_id")
        assertThat(classifyListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(classifyListResponse.errorMessage()).contains("error_message")
        assertThat(classifyListResponse.parseJobId()).contains("parse_job_id")
        assertThat(classifyListResponse.result())
            .contains(
                ClassifyResult.builder().confidence(0.0).reasoning("reasoning").type("type").build()
            )
        assertThat(classifyListResponse.transactionId()).contains("transaction_id")
        assertThat(classifyListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyListResponse =
            ClassifyListResponse.builder()
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
                .documentInputType(ClassifyListResponse.DocumentInputType.FILE_ID)
                .fileInput("file_input")
                .projectId("project_id")
                .status(ClassifyListResponse.Status.COMPLETED)
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

        val roundtrippedClassifyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyListResponse),
                jacksonTypeRef<ClassifyListResponse>(),
            )

        assertThat(roundtrippedClassifyListResponse).isEqualTo(classifyListResponse)
    }
}
