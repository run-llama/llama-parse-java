// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.directories.files

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import ai.llamaindex.llamacloud.models.files.PresignedUrl
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileGetResponseTest {

    @Test
    fun create() {
        val fileGetResponse =
            FileGetResponse.builder()
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
                    FileGetResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(fileGetResponse.id()).isEqualTo("id")
        assertThat(fileGetResponse.directoryId()).isEqualTo("directory_id")
        assertThat(fileGetResponse.displayName()).isEqualTo("x")
        assertThat(fileGetResponse.projectId()).isEqualTo("project_id")
        assertThat(fileGetResponse.uniqueId()).isEqualTo("x")
        assertThat(fileGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileGetResponse.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileGetResponse.downloadUrl())
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
        assertThat(fileGetResponse.fileId()).contains("file_id")
        assertThat(fileGetResponse.metadata())
            .contains(
                FileGetResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(fileGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileGetResponse =
            FileGetResponse.builder()
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
                    FileGetResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedFileGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileGetResponse),
                jacksonTypeRef<FileGetResponse>(),
            )

        assertThat(roundtrippedFileGetResponse).isEqualTo(fileGetResponse)
    }
}
