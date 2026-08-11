// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.files

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileRetrieveResponseTest {

    @Test
    fun create() {
        val fileRetrieveResponse =
            FileRetrieveResponse.builder()
                .id("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .name("invoice.pdf")
                .projectId("123e4567-e89b-12d3-a456-426614174000")
                .downloadUrl(
                    PresignedUrl.builder()
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .url("https://example.com")
                        .formFields(
                            PresignedUrl.FormFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalFileId("ext-12345")
                .fileType("pdf")
                .lastModifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("parse")
                .build()

        assertThat(fileRetrieveResponse.id()).isEqualTo("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(fileRetrieveResponse.name()).isEqualTo("invoice.pdf")
        assertThat(fileRetrieveResponse.projectId())
            .isEqualTo("123e4567-e89b-12d3-a456-426614174000")
        assertThat(fileRetrieveResponse.downloadUrl())
            .contains(
                PresignedUrl.builder()
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .url("https://example.com")
                    .formFields(
                        PresignedUrl.FormFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(fileRetrieveResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileRetrieveResponse.externalFileId()).contains("ext-12345")
        assertThat(fileRetrieveResponse.fileType()).contains("pdf")
        assertThat(fileRetrieveResponse.lastModifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileRetrieveResponse.purpose()).contains("parse")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileRetrieveResponse =
            FileRetrieveResponse.builder()
                .id("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .name("invoice.pdf")
                .projectId("123e4567-e89b-12d3-a456-426614174000")
                .downloadUrl(
                    PresignedUrl.builder()
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .url("https://example.com")
                        .formFields(
                            PresignedUrl.FormFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalFileId("ext-12345")
                .fileType("pdf")
                .lastModifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("parse")
                .build()

        val roundtrippedFileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileRetrieveResponse),
                jacksonTypeRef<FileRetrieveResponse>(),
            )

        assertThat(roundtrippedFileRetrieveResponse).isEqualTo(fileRetrieveResponse)
    }
}
