// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.files

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PresignedUrlTest {

    @Test
    fun create() {
        val presignedUrl =
            PresignedUrl.builder()
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("https://example.com")
                .formFields(
                    PresignedUrl.FormFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(presignedUrl.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(presignedUrl.url()).isEqualTo("https://example.com")
        assertThat(presignedUrl.formFields())
            .contains(
                PresignedUrl.FormFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val presignedUrl =
            PresignedUrl.builder()
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("https://example.com")
                .formFields(
                    PresignedUrl.FormFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedPresignedUrl =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(presignedUrl),
                jacksonTypeRef<PresignedUrl>(),
            )

        assertThat(roundtrippedPresignedUrl).isEqualTo(presignedUrl)
    }
}
