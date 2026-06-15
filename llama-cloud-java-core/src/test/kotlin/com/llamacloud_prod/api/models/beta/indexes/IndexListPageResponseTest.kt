// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.indexes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexListPageResponseTest {

    @Test
    fun create() {
        val indexListPageResponse =
            IndexListPageResponse.builder()
                .addItem(
                    IndexListResponse.builder()
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
                            IndexListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(indexListPageResponse.items())
            .containsExactly(
                IndexListResponse.builder()
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
                        IndexListResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(indexListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(indexListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexListPageResponse =
            IndexListPageResponse.builder()
                .addItem(
                    IndexListResponse.builder()
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
                            IndexListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedIndexListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexListPageResponse),
                jacksonTypeRef<IndexListPageResponse>(),
            )

        assertThat(roundtrippedIndexListPageResponse).isEqualTo(indexListPageResponse)
    }
}
