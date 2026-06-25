// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.files.PresignedUrl
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUploadResponseTest {

    @Test
    fun create() {
        val fileUploadResponse =
            FileUploadResponse.builder()
                .id("id")
                .directoryId("directory_id")
                .displayName("x")
                .projectId("project_id")
                .uniqueId("x")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .fileId("file_id")
                .metadata(
                    FileUploadResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(fileUploadResponse.id()).isEqualTo("id")
        assertThat(fileUploadResponse.directoryId()).isEqualTo("directory_id")
        assertThat(fileUploadResponse.displayName()).isEqualTo("x")
        assertThat(fileUploadResponse.projectId()).isEqualTo("project_id")
        assertThat(fileUploadResponse.uniqueId()).isEqualTo("x")
        assertThat(fileUploadResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileUploadResponse.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileUploadResponse.downloadUrl())
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
        assertThat(fileUploadResponse.fileId()).contains("file_id")
        assertThat(fileUploadResponse.metadata())
            .contains(
                FileUploadResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(fileUploadResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileUploadResponse =
            FileUploadResponse.builder()
                .id("id")
                .directoryId("directory_id")
                .displayName("x")
                .projectId("project_id")
                .uniqueId("x")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .fileId("file_id")
                .metadata(
                    FileUploadResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedFileUploadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileUploadResponse),
                jacksonTypeRef<FileUploadResponse>(),
            )

        assertThat(roundtrippedFileUploadResponse).isEqualTo(fileUploadResponse)
    }
}
