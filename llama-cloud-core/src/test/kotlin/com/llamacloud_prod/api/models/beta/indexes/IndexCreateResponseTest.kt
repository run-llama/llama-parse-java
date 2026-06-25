// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.indexes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexCreateResponseTest {

    @Test
    fun create() {
        val indexCreateResponse =
            IndexCreateResponse.builder()
                .id("id")
                .exportConfigId("export_config_id")
                .name("name")
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .syncConfigId("sync_config_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .lastExportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastSyncedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    IndexCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(indexCreateResponse.id()).isEqualTo("id")
        assertThat(indexCreateResponse.exportConfigId()).isEqualTo("export_config_id")
        assertThat(indexCreateResponse.name()).isEqualTo("name")
        assertThat(indexCreateResponse.projectId()).isEqualTo("project_id")
        assertThat(indexCreateResponse.sourceDirectoryId()).isEqualTo("source_directory_id")
        assertThat(indexCreateResponse.syncConfigId()).isEqualTo("sync_config_id")
        assertThat(indexCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexCreateResponse.description()).contains("description")
        assertThat(indexCreateResponse.lastExportedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexCreateResponse.lastSyncedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexCreateResponse.metadata())
            .contains(
                IndexCreateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(indexCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexCreateResponse =
            IndexCreateResponse.builder()
                .id("id")
                .exportConfigId("export_config_id")
                .name("name")
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .syncConfigId("sync_config_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .lastExportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastSyncedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    IndexCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedIndexCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexCreateResponse),
                jacksonTypeRef<IndexCreateResponse>(),
            )

        assertThat(roundtrippedIndexCreateResponse).isEqualTo(indexCreateResponse)
    }
}
