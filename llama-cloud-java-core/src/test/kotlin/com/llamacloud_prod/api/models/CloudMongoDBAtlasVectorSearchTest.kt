// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudMongoDBAtlasVectorSearchTest {

    @Test
    fun create() {
        val cloudMongoDBAtlasVectorSearch =
            CloudMongoDBAtlasVectorSearch.builder()
                .collectionName("collection_name")
                .dbName("db_name")
                .mongoDBUri("mongodb_uri")
                .className("class_name")
                .embeddingDimension(0L)
                .fulltextIndexName("fulltext_index_name")
                .supportsNestedMetadataFilters(true)
                .vectorIndexName("vector_index_name")
                .build()

        assertThat(cloudMongoDBAtlasVectorSearch.collectionName()).isEqualTo("collection_name")
        assertThat(cloudMongoDBAtlasVectorSearch.dbName()).isEqualTo("db_name")
        assertThat(cloudMongoDBAtlasVectorSearch.mongoDBUri()).isEqualTo("mongodb_uri")
        assertThat(cloudMongoDBAtlasVectorSearch.className()).contains("class_name")
        assertThat(cloudMongoDBAtlasVectorSearch.embeddingDimension()).contains(0L)
        assertThat(cloudMongoDBAtlasVectorSearch.fulltextIndexName())
            .contains("fulltext_index_name")
        assertThat(cloudMongoDBAtlasVectorSearch.supportsNestedMetadataFilters()).contains(true)
        assertThat(cloudMongoDBAtlasVectorSearch.vectorIndexName()).contains("vector_index_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudMongoDBAtlasVectorSearch =
            CloudMongoDBAtlasVectorSearch.builder()
                .collectionName("collection_name")
                .dbName("db_name")
                .mongoDBUri("mongodb_uri")
                .className("class_name")
                .embeddingDimension(0L)
                .fulltextIndexName("fulltext_index_name")
                .supportsNestedMetadataFilters(true)
                .vectorIndexName("vector_index_name")
                .build()

        val roundtrippedCloudMongoDBAtlasVectorSearch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudMongoDBAtlasVectorSearch),
                jacksonTypeRef<CloudMongoDBAtlasVectorSearch>(),
            )

        assertThat(roundtrippedCloudMongoDBAtlasVectorSearch)
            .isEqualTo(cloudMongoDBAtlasVectorSearch)
    }
}
