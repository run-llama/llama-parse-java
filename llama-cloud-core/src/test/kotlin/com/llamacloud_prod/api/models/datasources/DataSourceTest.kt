// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.datasources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSourceTest {

    @Test
    fun create() {
        val dataSource =
            DataSource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .component(
                    DataSource.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceType(DataSource.SourceType.AZURE_STORAGE_BLOB)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customMetadata(
                    DataSource.CustomMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .versionMetadata(
                    DataSourceReaderVersionMetadata.builder()
                        .readerVersion(DataSourceReaderVersionMetadata.ReaderVersion._1_0)
                        .build()
                )
                .build()

        assertThat(dataSource.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dataSource.component())
            .isEqualTo(
                DataSource.Component.ofUnionMember0(
                    DataSource.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(dataSource.name()).isEqualTo("name")
        assertThat(dataSource.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dataSource.sourceType()).isEqualTo(DataSource.SourceType.AZURE_STORAGE_BLOB)
        assertThat(dataSource.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataSource.customMetadata())
            .contains(
                DataSource.CustomMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(dataSource.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataSource.versionMetadata())
            .contains(
                DataSourceReaderVersionMetadata.builder()
                    .readerVersion(DataSourceReaderVersionMetadata.ReaderVersion._1_0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataSource =
            DataSource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .component(
                    DataSource.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceType(DataSource.SourceType.AZURE_STORAGE_BLOB)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customMetadata(
                    DataSource.CustomMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .versionMetadata(
                    DataSourceReaderVersionMetadata.builder()
                        .readerVersion(DataSourceReaderVersionMetadata.ReaderVersion._1_0)
                        .build()
                )
                .build()

        val roundtrippedDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataSource),
                jacksonTypeRef<DataSource>(),
            )

        assertThat(roundtrippedDataSource).isEqualTo(dataSource)
    }
}
