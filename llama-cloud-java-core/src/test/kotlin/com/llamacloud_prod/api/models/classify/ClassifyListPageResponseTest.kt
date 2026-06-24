// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classify

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyListPageResponseTest {

    @Test
    fun create() {
        val classifyListPageResponse =
            ClassifyListPageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(classifyListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(classifyListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(classifyListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyListPageResponse =
            ClassifyListPageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedClassifyListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyListPageResponse),
                jacksonTypeRef<ClassifyListPageResponse>(),
            )

        assertThat(roundtrippedClassifyListPageResponse).isEqualTo(classifyListPageResponse)
    }
}
