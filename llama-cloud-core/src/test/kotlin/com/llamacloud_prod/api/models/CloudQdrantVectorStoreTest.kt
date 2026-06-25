// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudQdrantVectorStoreTest {

    @Test
    fun create() {
        val cloudQdrantVectorStore =
            CloudQdrantVectorStore.builder()
                .apiKey("api_key")
                .collectionName("collection_name")
                .url("url")
                .className("class_name")
                .clientKwargs(
                    CloudQdrantVectorStore.ClientKwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .maxRetries(0L)
                .supportsNestedMetadataFilters(
                    CloudQdrantVectorStore.SupportsNestedMetadataFilters.TRUE
                )
                .build()

        assertThat(cloudQdrantVectorStore.apiKey()).isEqualTo("api_key")
        assertThat(cloudQdrantVectorStore.collectionName()).isEqualTo("collection_name")
        assertThat(cloudQdrantVectorStore.url()).isEqualTo("url")
        assertThat(cloudQdrantVectorStore.className()).contains("class_name")
        assertThat(cloudQdrantVectorStore.clientKwargs())
            .contains(
                CloudQdrantVectorStore.ClientKwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(cloudQdrantVectorStore.maxRetries()).contains(0L)
        assertThat(cloudQdrantVectorStore.supportsNestedMetadataFilters())
            .contains(CloudQdrantVectorStore.SupportsNestedMetadataFilters.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudQdrantVectorStore =
            CloudQdrantVectorStore.builder()
                .apiKey("api_key")
                .collectionName("collection_name")
                .url("url")
                .className("class_name")
                .clientKwargs(
                    CloudQdrantVectorStore.ClientKwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .maxRetries(0L)
                .supportsNestedMetadataFilters(
                    CloudQdrantVectorStore.SupportsNestedMetadataFilters.TRUE
                )
                .build()

        val roundtrippedCloudQdrantVectorStore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudQdrantVectorStore),
                jacksonTypeRef<CloudQdrantVectorStore>(),
            )

        assertThat(roundtrippedCloudQdrantVectorStore).isEqualTo(cloudQdrantVectorStore)
    }
}
