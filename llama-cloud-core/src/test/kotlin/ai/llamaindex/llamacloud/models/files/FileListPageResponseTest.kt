// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.files

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(fileListPageResponse.items())
            .containsExactly(
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
