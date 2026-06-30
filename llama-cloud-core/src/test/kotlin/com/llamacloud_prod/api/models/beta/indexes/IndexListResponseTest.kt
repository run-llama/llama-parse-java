// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.indexes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexListResponseTest {

    @Test
    fun create() {
        val indexListResponse =
            IndexListResponse.builder()
                .id("id")
                .exportConfigId("export_config_id")
                .name("name")
                .outputDirectoryId("output_directory_id")
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .syncConfigId("sync_config_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .lastExportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastSyncedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    IndexListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(indexListResponse.id()).isEqualTo("id")
        assertThat(indexListResponse.exportConfigId()).isEqualTo("export_config_id")
        assertThat(indexListResponse.name()).isEqualTo("name")
        assertThat(indexListResponse.outputDirectoryId()).isEqualTo("output_directory_id")
        assertThat(indexListResponse.projectId()).isEqualTo("project_id")
        assertThat(indexListResponse.sourceDirectoryId()).isEqualTo("source_directory_id")
        assertThat(indexListResponse.syncConfigId()).isEqualTo("sync_config_id")
        assertThat(indexListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexListResponse.description()).contains("description")
        assertThat(indexListResponse.lastExportedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexListResponse.lastSyncedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexListResponse.metadata())
            .contains(
                IndexListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(indexListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexListResponse =
            IndexListResponse.builder()
                .id("id")
                .exportConfigId("export_config_id")
                .name("name")
                .outputDirectoryId("output_directory_id")
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .syncConfigId("sync_config_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .lastExportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastSyncedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    IndexListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedIndexListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexListResponse),
                jacksonTypeRef<IndexListResponse>(),
            )

        assertThat(roundtrippedIndexListResponse).isEqualTo(indexListResponse)
    }
}
