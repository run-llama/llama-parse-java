// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudPostgresVectorStoreTest {

    @Test
    fun create() {
        val cloudPostgresVectorStore =
            CloudPostgresVectorStore.builder()
                .database("database")
                .embedDim(0L)
                .host("host")
                .password("password")
                .port(0L)
                .schemaName("schema_name")
                .tableName("table_name")
                .user("user")
                .className("class_name")
                .hnswSettings(
                    PgVectorHnswSettings.builder()
                        .distanceMethod(PgVectorHnswSettings.DistanceMethod.COSINE)
                        .efConstruction(1L)
                        .efSearch(1L)
                        .m(1L)
                        .vectorType(PgVectorHnswSettings.VectorType.BIT)
                        .build()
                )
                .hybridSearch(true)
                .performSetup(true)
                .supportsNestedMetadataFilters(true)
                .build()

        assertThat(cloudPostgresVectorStore.database()).isEqualTo("database")
        assertThat(cloudPostgresVectorStore.embedDim()).isEqualTo(0L)
        assertThat(cloudPostgresVectorStore.host()).isEqualTo("host")
        assertThat(cloudPostgresVectorStore.password()).isEqualTo("password")
        assertThat(cloudPostgresVectorStore.port()).isEqualTo(0L)
        assertThat(cloudPostgresVectorStore.schemaName()).isEqualTo("schema_name")
        assertThat(cloudPostgresVectorStore.tableName()).isEqualTo("table_name")
        assertThat(cloudPostgresVectorStore.user()).isEqualTo("user")
        assertThat(cloudPostgresVectorStore.className()).contains("class_name")
        assertThat(cloudPostgresVectorStore.hnswSettings())
            .contains(
                PgVectorHnswSettings.builder()
                    .distanceMethod(PgVectorHnswSettings.DistanceMethod.COSINE)
                    .efConstruction(1L)
                    .efSearch(1L)
                    .m(1L)
                    .vectorType(PgVectorHnswSettings.VectorType.BIT)
                    .build()
            )
        assertThat(cloudPostgresVectorStore.hybridSearch()).contains(true)
        assertThat(cloudPostgresVectorStore.performSetup()).contains(true)
        assertThat(cloudPostgresVectorStore.supportsNestedMetadataFilters()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudPostgresVectorStore =
            CloudPostgresVectorStore.builder()
                .database("database")
                .embedDim(0L)
                .host("host")
                .password("password")
                .port(0L)
                .schemaName("schema_name")
                .tableName("table_name")
                .user("user")
                .className("class_name")
                .hnswSettings(
                    PgVectorHnswSettings.builder()
                        .distanceMethod(PgVectorHnswSettings.DistanceMethod.COSINE)
                        .efConstruction(1L)
                        .efSearch(1L)
                        .m(1L)
                        .vectorType(PgVectorHnswSettings.VectorType.BIT)
                        .build()
                )
                .hybridSearch(true)
                .performSetup(true)
                .supportsNestedMetadataFilters(true)
                .build()

        val roundtrippedCloudPostgresVectorStore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudPostgresVectorStore),
                jacksonTypeRef<CloudPostgresVectorStore>(),
            )

        assertThat(roundtrippedCloudPostgresVectorStore).isEqualTo(cloudPostgresVectorStore)
    }
}
