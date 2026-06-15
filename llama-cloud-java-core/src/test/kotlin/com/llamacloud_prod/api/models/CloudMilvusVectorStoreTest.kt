// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudMilvusVectorStoreTest {

    @Test
    fun create() {
        val cloudMilvusVectorStore =
            CloudMilvusVectorStore.builder()
                .uri("uri")
                .token("token")
                .className("class_name")
                .collectionName("collection_name")
                .embeddingDimension(0L)
                .supportsNestedMetadataFilters(true)
                .build()

        assertThat(cloudMilvusVectorStore.uri()).isEqualTo("uri")
        assertThat(cloudMilvusVectorStore.token()).contains("token")
        assertThat(cloudMilvusVectorStore.className()).contains("class_name")
        assertThat(cloudMilvusVectorStore.collectionName()).contains("collection_name")
        assertThat(cloudMilvusVectorStore.embeddingDimension()).contains(0L)
        assertThat(cloudMilvusVectorStore.supportsNestedMetadataFilters()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudMilvusVectorStore =
            CloudMilvusVectorStore.builder()
                .uri("uri")
                .token("token")
                .className("class_name")
                .collectionName("collection_name")
                .embeddingDimension(0L)
                .supportsNestedMetadataFilters(true)
                .build()

        val roundtrippedCloudMilvusVectorStore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudMilvusVectorStore),
                jacksonTypeRef<CloudMilvusVectorStore>(),
            )

        assertThat(roundtrippedCloudMilvusVectorStore).isEqualTo(cloudMilvusVectorStore)
    }
}
