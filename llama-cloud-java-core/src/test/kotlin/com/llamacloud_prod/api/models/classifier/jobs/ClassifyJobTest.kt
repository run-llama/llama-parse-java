// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classifier.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.parsing.ParsingLanguages
import com.llamacloud_prod.api.models.parsing.StatusEnum
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyJobTest {

    @Test
    fun create() {
        val classifyJob =
            ClassifyJob.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addRule(
                    ClassifierRule.builder()
                        .description("contains invoice number, line items, and total amount")
                        .type("invoice")
                        .build()
                )
                .status(StatusEnum.CANCELLED)
                .userId("user_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .jobRecordId("job_record_id")
                .mode(ClassifyJob.Mode.FAST)
                .parsingConfiguration(
                    ClassifyParsingConfiguration.builder()
                        .lang(ParsingLanguages.ABQ)
                        .maxPages(0L)
                        .addTargetPage(0L)
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(classifyJob.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(classifyJob.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(classifyJob.rules())
            .containsExactly(
                ClassifierRule.builder()
                    .description("contains invoice number, line items, and total amount")
                    .type("invoice")
                    .build()
            )
        assertThat(classifyJob.status()).isEqualTo(StatusEnum.CANCELLED)
        assertThat(classifyJob.userId()).isEqualTo("user_id")
        assertThat(classifyJob.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(classifyJob.effectiveAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(classifyJob.errorMessage()).contains("error_message")
        assertThat(classifyJob.jobRecordId()).contains("job_record_id")
        assertThat(classifyJob.mode()).contains(ClassifyJob.Mode.FAST)
        assertThat(classifyJob.parsingConfiguration())
            .contains(
                ClassifyParsingConfiguration.builder()
                    .lang(ParsingLanguages.ABQ)
                    .maxPages(0L)
                    .addTargetPage(0L)
                    .build()
            )
        assertThat(classifyJob.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyJob =
            ClassifyJob.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addRule(
                    ClassifierRule.builder()
                        .description("contains invoice number, line items, and total amount")
                        .type("invoice")
                        .build()
                )
                .status(StatusEnum.CANCELLED)
                .userId("user_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .jobRecordId("job_record_id")
                .mode(ClassifyJob.Mode.FAST)
                .parsingConfiguration(
                    ClassifyParsingConfiguration.builder()
                        .lang(ParsingLanguages.ABQ)
                        .maxPages(0L)
                        .addTargetPage(0L)
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedClassifyJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyJob),
                jacksonTypeRef<ClassifyJob>(),
            )

        assertThat(roundtrippedClassifyJob).isEqualTo(classifyJob)
    }
}
