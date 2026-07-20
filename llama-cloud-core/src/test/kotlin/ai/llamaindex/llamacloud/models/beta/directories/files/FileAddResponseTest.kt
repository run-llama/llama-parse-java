// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.directories.files

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import ai.llamaindex.llamacloud.models.files.PresignedUrl
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileAddResponseTest {

    @Test
    fun create() {
        val fileAddResponse =
            FileAddResponse.builder()
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
                    FileAddResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(fileAddResponse.id()).isEqualTo("id")
        assertThat(fileAddResponse.directoryId()).isEqualTo("directory_id")
        assertThat(fileAddResponse.displayName()).isEqualTo("x")
        assertThat(fileAddResponse.projectId()).isEqualTo("project_id")
        assertThat(fileAddResponse.uniqueId()).isEqualTo("x")
        assertThat(fileAddResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileAddResponse.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileAddResponse.downloadUrl())
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
        assertThat(fileAddResponse.fileId()).contains("file_id")
        assertThat(fileAddResponse.metadata())
            .contains(
                FileAddResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(fileAddResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileAddResponse =
            FileAddResponse.builder()
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
                    FileAddResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedFileAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileAddResponse),
                jacksonTypeRef<FileAddResponse>(),
            )

        assertThat(roundtrippedFileAddResponse).isEqualTo(fileAddResponse)
    }
}
