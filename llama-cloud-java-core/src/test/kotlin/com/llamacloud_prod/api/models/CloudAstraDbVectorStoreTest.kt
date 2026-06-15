// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudAstraDbVectorStoreTest {

    @Test
    fun create() {
        val cloudAstraDbVectorStore =
            CloudAstraDbVectorStore.builder()
                .token("token")
                .apiEndpoint("api_endpoint")
                .collectionName("collection_name")
                .embeddingDimension(0L)
                .className("class_name")
                .keyspace("keyspace")
                .supportsNestedMetadataFilters(
                    CloudAstraDbVectorStore.SupportsNestedMetadataFilters.TRUE
                )
                .build()

        assertThat(cloudAstraDbVectorStore.token()).isEqualTo("token")
        assertThat(cloudAstraDbVectorStore.apiEndpoint()).isEqualTo("api_endpoint")
        assertThat(cloudAstraDbVectorStore.collectionName()).isEqualTo("collection_name")
        assertThat(cloudAstraDbVectorStore.embeddingDimension()).isEqualTo(0L)
        assertThat(cloudAstraDbVectorStore.className()).contains("class_name")
        assertThat(cloudAstraDbVectorStore.keyspace()).contains("keyspace")
        assertThat(cloudAstraDbVectorStore.supportsNestedMetadataFilters())
            .contains(CloudAstraDbVectorStore.SupportsNestedMetadataFilters.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudAstraDbVectorStore =
            CloudAstraDbVectorStore.builder()
                .token("token")
                .apiEndpoint("api_endpoint")
                .collectionName("collection_name")
                .embeddingDimension(0L)
                .className("class_name")
                .keyspace("keyspace")
                .supportsNestedMetadataFilters(
                    CloudAstraDbVectorStore.SupportsNestedMetadataFilters.TRUE
                )
                .build()

        val roundtrippedCloudAstraDbVectorStore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudAstraDbVectorStore),
                jacksonTypeRef<CloudAstraDbVectorStore>(),
            )

        assertThat(roundtrippedCloudAstraDbVectorStore).isEqualTo(cloudAstraDbVectorStore)
    }
}
