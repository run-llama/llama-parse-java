// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryCreateResponseTest {

    @Test
    fun create() {
        val directoryCreateResponse =
            DirectoryCreateResponse.builder()
                .id("id")
                .name("x")
                .projectId("project_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .systemMetadata(
                    DirectoryCreateResponse.SystemMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(DirectoryCreateResponse.Type.EPHEMERAL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(directoryCreateResponse.id()).isEqualTo("id")
        assertThat(directoryCreateResponse.name()).isEqualTo("x")
        assertThat(directoryCreateResponse.projectId()).isEqualTo("project_id")
        assertThat(directoryCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryCreateResponse.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryCreateResponse.description()).contains("description")
        assertThat(directoryCreateResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryCreateResponse.systemMetadata())
            .contains(
                DirectoryCreateResponse.SystemMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(directoryCreateResponse.type()).contains(DirectoryCreateResponse.Type.EPHEMERAL)
        assertThat(directoryCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val directoryCreateResponse =
            DirectoryCreateResponse.builder()
                .id("id")
                .name("x")
                .projectId("project_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .systemMetadata(
                    DirectoryCreateResponse.SystemMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(DirectoryCreateResponse.Type.EPHEMERAL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDirectoryCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directoryCreateResponse),
                jacksonTypeRef<DirectoryCreateResponse>(),
            )

        assertThat(roundtrippedDirectoryCreateResponse).isEqualTo(directoryCreateResponse)
    }
}
