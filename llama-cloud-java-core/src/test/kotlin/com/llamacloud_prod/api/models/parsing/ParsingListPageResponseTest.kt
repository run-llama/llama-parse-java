// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParsingListPageResponseTest {

    @Test
    fun create() {
        val parsingListPageResponse =
            ParsingListPageResponse.builder()
                .addItem(
                    ParsingListResponse.builder()
                        .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .status(ParsingListResponse.Status.PENDING)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("error_message")
                        .name("Q4 Financial Report")
                        .tier("fast")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(parsingListPageResponse.items())
            .containsExactly(
                ParsingListResponse.builder()
                    .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .status(ParsingListResponse.Status.PENDING)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .errorMessage("error_message")
                    .name("Q4 Financial Report")
                    .tier("fast")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(parsingListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(parsingListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parsingListPageResponse =
            ParsingListPageResponse.builder()
                .addItem(
                    ParsingListResponse.builder()
                        .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .status(ParsingListResponse.Status.PENDING)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("error_message")
                        .name("Q4 Financial Report")
                        .tier("fast")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedParsingListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsingListPageResponse),
                jacksonTypeRef<ParsingListPageResponse>(),
            )

        assertThat(roundtrippedParsingListPageResponse).isEqualTo(parsingListPageResponse)
    }
}
