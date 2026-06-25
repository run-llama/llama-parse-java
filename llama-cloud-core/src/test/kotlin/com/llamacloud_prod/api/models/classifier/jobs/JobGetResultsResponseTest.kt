// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classifier.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobGetResultsResponseTest {

    @Test
    fun create() {
        val jobGetResultsResponse =
            JobGetResultsResponse.builder()
                .addItem(
                    JobGetResultsResponse.Item.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classifyJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .result(
                            JobGetResultsResponse.Item.Result.builder()
                                .confidence(0.0)
                                .reasoning("reasoning")
                                .type("type")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(jobGetResultsResponse.items())
            .containsExactly(
                JobGetResultsResponse.Item.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classifyJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .result(
                        JobGetResultsResponse.Item.Result.builder()
                            .confidence(0.0)
                            .reasoning("reasoning")
                            .type("type")
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(jobGetResultsResponse.nextPageToken()).contains("next_page_token")
        assertThat(jobGetResultsResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobGetResultsResponse =
            JobGetResultsResponse.builder()
                .addItem(
                    JobGetResultsResponse.Item.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classifyJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .result(
                            JobGetResultsResponse.Item.Result.builder()
                                .confidence(0.0)
                                .reasoning("reasoning")
                                .type("type")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedJobGetResultsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobGetResultsResponse),
                jacksonTypeRef<JobGetResultsResponse>(),
            )

        assertThat(roundtrippedJobGetResultsResponse).isEqualTo(jobGetResultsResponse)
    }
}
