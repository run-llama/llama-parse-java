// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileQueryResponseTest {

    @Test
    fun create() {
        val fileQueryResponse =
            FileQueryResponse.builder()
                .addItem(
                    FileQueryResponse.Item.builder()
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

        assertThat(fileQueryResponse.items())
            .containsExactly(
                FileQueryResponse.Item.builder()
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
        assertThat(fileQueryResponse.nextPageToken()).contains("next_page_token")
        assertThat(fileQueryResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileQueryResponse =
            FileQueryResponse.builder()
                .addItem(
                    FileQueryResponse.Item.builder()
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

        val roundtrippedFileQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileQueryResponse),
                jacksonTypeRef<FileQueryResponse>(),
            )

        assertThat(roundtrippedFileQueryResponse).isEqualTo(fileQueryResponse)
    }
}
