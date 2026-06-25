// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryListResponseTest {

    @Test
    fun create() {
        val directoryListResponse =
            DirectoryListResponse.builder()
                .id("id")
                .name("x")
                .projectId("project_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .systemMetadata(
                    DirectoryListResponse.SystemMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(DirectoryListResponse.Type.EPHEMERAL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(directoryListResponse.id()).isEqualTo("id")
        assertThat(directoryListResponse.name()).isEqualTo("x")
        assertThat(directoryListResponse.projectId()).isEqualTo("project_id")
        assertThat(directoryListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryListResponse.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryListResponse.description()).contains("description")
        assertThat(directoryListResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryListResponse.systemMetadata())
            .contains(
                DirectoryListResponse.SystemMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(directoryListResponse.type()).contains(DirectoryListResponse.Type.EPHEMERAL)
        assertThat(directoryListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val directoryListResponse =
            DirectoryListResponse.builder()
                .id("id")
                .name("x")
                .projectId("project_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .systemMetadata(
                    DirectoryListResponse.SystemMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(DirectoryListResponse.Type.EPHEMERAL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDirectoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directoryListResponse),
                jacksonTypeRef<DirectoryListResponse>(),
            )

        assertThat(roundtrippedDirectoryListResponse).isEqualTo(directoryListResponse)
    }
}
