// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryUpdateResponseTest {

    @Test
    fun create() {
        val directoryUpdateResponse =
            DirectoryUpdateResponse.builder()
                .id("id")
                .name("x")
                .projectId("project_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .systemMetadata(
                    DirectoryUpdateResponse.SystemMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(DirectoryUpdateResponse.Type.EPHEMERAL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(directoryUpdateResponse.id()).isEqualTo("id")
        assertThat(directoryUpdateResponse.name()).isEqualTo("x")
        assertThat(directoryUpdateResponse.projectId()).isEqualTo("project_id")
        assertThat(directoryUpdateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryUpdateResponse.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryUpdateResponse.description()).contains("description")
        assertThat(directoryUpdateResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(directoryUpdateResponse.systemMetadata())
            .contains(
                DirectoryUpdateResponse.SystemMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(directoryUpdateResponse.type()).contains(DirectoryUpdateResponse.Type.EPHEMERAL)
        assertThat(directoryUpdateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val directoryUpdateResponse =
            DirectoryUpdateResponse.builder()
                .id("id")
                .name("x")
                .projectId("project_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .systemMetadata(
                    DirectoryUpdateResponse.SystemMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(DirectoryUpdateResponse.Type.EPHEMERAL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDirectoryUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directoryUpdateResponse),
                jacksonTypeRef<DirectoryUpdateResponse>(),
            )

        assertThat(roundtrippedDirectoryUpdateResponse).isEqualTo(directoryUpdateResponse)
    }
}
