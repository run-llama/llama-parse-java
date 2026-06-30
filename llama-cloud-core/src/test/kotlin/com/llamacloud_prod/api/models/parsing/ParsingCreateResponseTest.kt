// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParsingCreateResponseTest {

    @Test
    fun create() {
        val parsingCreateResponse =
            ParsingCreateResponse.builder()
                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status(ParsingCreateResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .name("Q4 Financial Report")
                .tier("fast")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userMetadata(
                    ParsingCreateResponse.UserMetadata.builder()
                        .putAdditionalProperty("owner", JsonValue.from("jerry"))
                        .putAdditionalProperty("team", JsonValue.from("research"))
                        .build()
                )
                .build()

        assertThat(parsingCreateResponse.id()).isEqualTo("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(parsingCreateResponse.projectId())
            .isEqualTo("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(parsingCreateResponse.status()).isEqualTo(ParsingCreateResponse.Status.CANCELLED)
        assertThat(parsingCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(parsingCreateResponse.errorMessage()).contains("error_message")
        assertThat(parsingCreateResponse.name()).contains("Q4 Financial Report")
        assertThat(parsingCreateResponse.tier()).contains("fast")
        assertThat(parsingCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(parsingCreateResponse.userMetadata())
            .contains(
                ParsingCreateResponse.UserMetadata.builder()
                    .putAdditionalProperty("owner", JsonValue.from("jerry"))
                    .putAdditionalProperty("team", JsonValue.from("research"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parsingCreateResponse =
            ParsingCreateResponse.builder()
                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status(ParsingCreateResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .name("Q4 Financial Report")
                .tier("fast")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userMetadata(
                    ParsingCreateResponse.UserMetadata.builder()
                        .putAdditionalProperty("owner", JsonValue.from("jerry"))
                        .putAdditionalProperty("team", JsonValue.from("research"))
                        .build()
                )
                .build()

        val roundtrippedParsingCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsingCreateResponse),
                jacksonTypeRef<ParsingCreateResponse>(),
            )

        assertThat(roundtrippedParsingCreateResponse).isEqualTo(parsingCreateResponse)
    }
}
