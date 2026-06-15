// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListResponseTest {

    @Test
    fun create() {
        val fileListResponse =
            FileListResponse.builder()
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

        assertThat(fileListResponse.id()).isEqualTo("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(fileListResponse.name()).isEqualTo("invoice.pdf")
        assertThat(fileListResponse.projectId()).isEqualTo("123e4567-e89b-12d3-a456-426614174000")
        assertThat(fileListResponse.downloadUrl())
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
        assertThat(fileListResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileListResponse.externalFileId()).contains("ext-12345")
        assertThat(fileListResponse.fileType()).contains("pdf")
        assertThat(fileListResponse.lastModifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileListResponse.purpose()).contains("parse")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileListResponse =
            FileListResponse.builder()
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

        val roundtrippedFileListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileListResponse),
                jacksonTypeRef<FileListResponse>(),
            )

        assertThat(roundtrippedFileListResponse).isEqualTo(fileListResponse)
    }
}
