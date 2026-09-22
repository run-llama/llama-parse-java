// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.classifier.jobs

import ai.llamaindex.llamacloud.core.jsonMapper
import ai.llamaindex.llamacloud.models.parsing.ParsingLanguages
import ai.llamaindex.llamacloud.models.parsing.StatusEnum
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobListPageResponseTest {

    @Test
    fun create() {
        val jobListPageResponse =
            JobListPageResponse.builder()
                .addItem(
                    ClassifyJob.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addRule(
                            ClassifierRule.builder()
                                .description(
                                    "contains invoice number, line items, and total amount"
                                )
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(jobListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(jobListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(jobListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobListPageResponse =
            JobListPageResponse.builder()
                .addItem(
                    ClassifyJob.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addRule(
                            ClassifierRule.builder()
                                .description(
                                    "contains invoice number, line items, and total amount"
                                )
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedJobListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobListPageResponse),
                jacksonTypeRef<JobListPageResponse>(),
            )

        assertThat(roundtrippedJobListPageResponse).isEqualTo(jobListPageResponse)
    }
}
