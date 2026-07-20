// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.directories.files

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import ai.llamaindex.llamacloud.models.files.PresignedUrl
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListPageResponseTest {

    @Test
    fun create() {
        val fileListPageResponse =
            FileListPageResponse.builder()
                .addItem(
                    FileListResponse.builder()
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
                            FileListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(fileListPageResponse.items())
            .containsExactly(
                FileListResponse.builder()
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
                        FileListResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(fileListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(fileListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileListPageResponse =
            FileListPageResponse.builder()
                .addItem(
                    FileListResponse.builder()
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
                            FileListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedFileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileListPageResponse),
                jacksonTypeRef<FileListPageResponse>(),
            )

        assertThat(roundtrippedFileListPageResponse).isEqualTo(fileListPageResponse)
    }
}
