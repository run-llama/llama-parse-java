// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.datasources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.datasources.DataSourceReaderVersionMetadata
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineDataSourceTest {

    @Test
    fun create() {
        val pipelineDataSource =
            PipelineDataSource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .component(
                    PipelineDataSource.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastSyncedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceType(PipelineDataSource.SourceType.AZURE_STORAGE_BLOB)
                .brokeredConnectionId("brokered_connection_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customMetadata(
                    PipelineDataSource.CustomMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .status(PipelineDataSource.Status.CANCELLED)
                .statusUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .syncInterval(0.0)
                .syncScheduleSetBy("sync_schedule_set_by")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .versionMetadata(
                    DataSourceReaderVersionMetadata.builder()
                        .readerVersion(DataSourceReaderVersionMetadata.ReaderVersion._1_0)
                        .build()
                )
                .build()

        assertThat(pipelineDataSource.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pipelineDataSource.component())
            .isEqualTo(
                PipelineDataSource.Component.ofUnionMember0(
                    PipelineDataSource.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(pipelineDataSource.dataSourceId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pipelineDataSource.lastSyncedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineDataSource.name()).isEqualTo("name")
        assertThat(pipelineDataSource.pipelineId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pipelineDataSource.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pipelineDataSource.sourceType())
            .isEqualTo(PipelineDataSource.SourceType.AZURE_STORAGE_BLOB)
        assertThat(pipelineDataSource.brokeredConnectionId()).contains("brokered_connection_id")
        assertThat(pipelineDataSource.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineDataSource.customMetadata())
            .contains(
                PipelineDataSource.CustomMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(pipelineDataSource.status()).contains(PipelineDataSource.Status.CANCELLED)
        assertThat(pipelineDataSource.statusUpdatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineDataSource.syncInterval()).contains(0.0)
        assertThat(pipelineDataSource.syncScheduleSetBy()).contains("sync_schedule_set_by")
        assertThat(pipelineDataSource.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineDataSource.versionMetadata())
            .contains(
                DataSourceReaderVersionMetadata.builder()
                    .readerVersion(DataSourceReaderVersionMetadata.ReaderVersion._1_0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineDataSource =
            PipelineDataSource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .component(
                    PipelineDataSource.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastSyncedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceType(PipelineDataSource.SourceType.AZURE_STORAGE_BLOB)
                .brokeredConnectionId("brokered_connection_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customMetadata(
                    PipelineDataSource.CustomMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .status(PipelineDataSource.Status.CANCELLED)
                .statusUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .syncInterval(0.0)
                .syncScheduleSetBy("sync_schedule_set_by")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .versionMetadata(
                    DataSourceReaderVersionMetadata.builder()
                        .readerVersion(DataSourceReaderVersionMetadata.ReaderVersion._1_0)
                        .build()
                )
                .build()

        val roundtrippedPipelineDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineDataSource),
                jacksonTypeRef<PipelineDataSource>(),
            )

        assertThat(roundtrippedPipelineDataSource).isEqualTo(pipelineDataSource)
    }
}
