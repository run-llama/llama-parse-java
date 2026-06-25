// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParsingListResponseTest {

    @Test
    fun create() {
        val parsingListResponse =
            ParsingListResponse.builder()
                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status(ParsingListResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .name("Q4 Financial Report")
                .tier("fast")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(parsingListResponse.id()).isEqualTo("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(parsingListResponse.projectId())
            .isEqualTo("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(parsingListResponse.status()).isEqualTo(ParsingListResponse.Status.CANCELLED)
        assertThat(parsingListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(parsingListResponse.errorMessage()).contains("error_message")
        assertThat(parsingListResponse.name()).contains("Q4 Financial Report")
        assertThat(parsingListResponse.tier()).contains("fast")
        assertThat(parsingListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parsingListResponse =
            ParsingListResponse.builder()
                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status(ParsingListResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .name("Q4 Financial Report")
                .tier("fast")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedParsingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsingListResponse),
                jacksonTypeRef<ParsingListResponse>(),
            )

        assertThat(roundtrippedParsingListResponse).isEqualTo(parsingListResponse)
    }
}
