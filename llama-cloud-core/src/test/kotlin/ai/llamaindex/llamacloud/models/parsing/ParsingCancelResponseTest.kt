// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParsingCancelResponseTest {

    @Test
    fun create() {
        val parsingCancelResponse =
            ParsingCancelResponse.builder()
                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status(ParsingCancelResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .name("Q4 Financial Report")
                .tier("fast")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userMetadata(
                    ParsingCancelResponse.UserMetadata.builder()
                        .putAdditionalProperty("owner", JsonValue.from("jerry"))
                        .putAdditionalProperty("team", JsonValue.from("research"))
                        .build()
                )
                .build()

        assertThat(parsingCancelResponse.id()).isEqualTo("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(parsingCancelResponse.projectId())
            .isEqualTo("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(parsingCancelResponse.status()).isEqualTo(ParsingCancelResponse.Status.CANCELLED)
        assertThat(parsingCancelResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(parsingCancelResponse.errorMessage()).contains("error_message")
        assertThat(parsingCancelResponse.name()).contains("Q4 Financial Report")
        assertThat(parsingCancelResponse.tier()).contains("fast")
        assertThat(parsingCancelResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(parsingCancelResponse.userMetadata())
            .contains(
                ParsingCancelResponse.UserMetadata.builder()
                    .putAdditionalProperty("owner", JsonValue.from("jerry"))
                    .putAdditionalProperty("team", JsonValue.from("research"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parsingCancelResponse =
            ParsingCancelResponse.builder()
                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status(ParsingCancelResponse.Status.CANCELLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .name("Q4 Financial Report")
                .tier("fast")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userMetadata(
                    ParsingCancelResponse.UserMetadata.builder()
                        .putAdditionalProperty("owner", JsonValue.from("jerry"))
                        .putAdditionalProperty("team", JsonValue.from("research"))
                        .build()
                )
                .build()

        val roundtrippedParsingCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsingCancelResponse),
                jacksonTypeRef<ParsingCancelResponse>(),
            )

        assertThat(roundtrippedParsingCancelResponse).isEqualTo(parsingCancelResponse)
    }
}
