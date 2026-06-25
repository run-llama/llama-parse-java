// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudPineconeVectorStoreTest {

    @Test
    fun create() {
        val cloudPineconeVectorStore =
            CloudPineconeVectorStore.builder()
                .apiKey("api_key")
                .indexName("index_name")
                .className("class_name")
                .insertKwargs(
                    CloudPineconeVectorStore.InsertKwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .namespace("namespace")
                .supportsNestedMetadataFilters(
                    CloudPineconeVectorStore.SupportsNestedMetadataFilters.TRUE
                )
                .build()

        assertThat(cloudPineconeVectorStore.apiKey()).isEqualTo("api_key")
        assertThat(cloudPineconeVectorStore.indexName()).isEqualTo("index_name")
        assertThat(cloudPineconeVectorStore.className()).contains("class_name")
        assertThat(cloudPineconeVectorStore.insertKwargs())
            .contains(
                CloudPineconeVectorStore.InsertKwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(cloudPineconeVectorStore.namespace()).contains("namespace")
        assertThat(cloudPineconeVectorStore.supportsNestedMetadataFilters())
            .contains(CloudPineconeVectorStore.SupportsNestedMetadataFilters.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudPineconeVectorStore =
            CloudPineconeVectorStore.builder()
                .apiKey("api_key")
                .indexName("index_name")
                .className("class_name")
                .insertKwargs(
                    CloudPineconeVectorStore.InsertKwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .namespace("namespace")
                .supportsNestedMetadataFilters(
                    CloudPineconeVectorStore.SupportsNestedMetadataFilters.TRUE
                )
                .build()

        val roundtrippedCloudPineconeVectorStore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudPineconeVectorStore),
                jacksonTypeRef<CloudPineconeVectorStore>(),
            )

        assertThat(roundtrippedCloudPineconeVectorStore).isEqualTo(cloudPineconeVectorStore)
    }
}
