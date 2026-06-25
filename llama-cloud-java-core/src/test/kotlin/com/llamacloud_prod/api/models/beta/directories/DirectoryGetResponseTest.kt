// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryGetResponseTest {

    @Test
    fun create() {
        val directoryGetResponse =
            DirectoryGetResponse.builder()
                .id("id")
                .name("x")
                .projectId("project_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .systemMetadata(
                    DirectoryGetResponse.SystemMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(DirectoryGetResponse.Type.EPHEMERAL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(directoryGetResponse.id()).isEqualTo("id")
        assertThat(directoryGetResponse.name()).isEqualTo("x")
        assertThat(directoryGetResponse.projectId()).isEqualTo("project_id")
        assertThat(directoryGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryGetResponse.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryGetResponse.description()).contains("description")
        assertThat(directoryGetResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryGetResponse.systemMetadata())
            .contains(
                DirectoryGetResponse.SystemMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(directoryGetResponse.type()).contains(DirectoryGetResponse.Type.EPHEMERAL)
        assertThat(directoryGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val directoryGetResponse =
            DirectoryGetResponse.builder()
                .id("id")
                .name("x")
                .projectId("project_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .systemMetadata(
                    DirectoryGetResponse.SystemMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(DirectoryGetResponse.Type.EPHEMERAL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDirectoryGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directoryGetResponse),
                jacksonTypeRef<DirectoryGetResponse>(),
            )

        assertThat(roundtrippedDirectoryGetResponse).isEqualTo(directoryGetResponse)
    }
}
