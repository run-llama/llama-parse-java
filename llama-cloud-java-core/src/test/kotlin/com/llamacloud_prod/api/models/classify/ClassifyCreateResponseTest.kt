// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classify

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyCreateResponseTest {

    @Test
    fun create() {
        val classifyCreateResponse =
            ClassifyCreateResponse.builder()
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
                .documentInputType(ClassifyCreateResponse.DocumentInputType.URL)
                .fileInput("file_input")
                .projectId("project_id")
                .status(ClassifyCreateResponse.Status.PENDING)
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

        assertThat(classifyCreateResponse.id()).isEqualTo("id")
        assertThat(classifyCreateResponse.configuration())
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
        assertThat(classifyCreateResponse.documentInputType())
            .isEqualTo(ClassifyCreateResponse.DocumentInputType.URL)
        assertThat(classifyCreateResponse.fileInput()).isEqualTo("file_input")
        assertThat(classifyCreateResponse.projectId()).isEqualTo("project_id")
        assertThat(classifyCreateResponse.status()).isEqualTo(ClassifyCreateResponse.Status.PENDING)
        assertThat(classifyCreateResponse.userId()).isEqualTo("user_id")
        assertThat(classifyCreateResponse.configurationId()).contains("configuration_id")
        assertThat(classifyCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(classifyCreateResponse.errorMessage()).contains("error_message")
        assertThat(classifyCreateResponse.parseJobId()).contains("parse_job_id")
        assertThat(classifyCreateResponse.result())
            .contains(
                ClassifyResult.builder().confidence(0.0).reasoning("reasoning").type("type").build()
            )
        assertThat(classifyCreateResponse.transactionId()).contains("transaction_id")
        assertThat(classifyCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyCreateResponse =
            ClassifyCreateResponse.builder()
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
                .documentInputType(ClassifyCreateResponse.DocumentInputType.URL)
                .fileInput("file_input")
                .projectId("project_id")
                .status(ClassifyCreateResponse.Status.PENDING)
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

        val roundtrippedClassifyCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyCreateResponse),
                jacksonTypeRef<ClassifyCreateResponse>(),
            )

        assertThat(roundtrippedClassifyCreateResponse).isEqualTo(classifyCreateResponse)
    }
}
