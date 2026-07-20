// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudAzureAiSearchVectorStoreTest {

    @Test
    fun create() {
        val cloudAzureAiSearchVectorStore =
            CloudAzureAiSearchVectorStore.builder()
                .searchServiceApiKey("search_service_api_key")
                .searchServiceEndpoint("search_service_endpoint")
                .className("class_name")
                .clientId("client_id")
                .clientSecret("client_secret")
                .embeddingDimension(0L)
                .filterableMetadataFieldKeys(
                    CloudAzureAiSearchVectorStore.FilterableMetadataFieldKeys.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .indexName("index_name")
                .searchServiceApiVersion("search_service_api_version")
                .supportsNestedMetadataFilters(
                    CloudAzureAiSearchVectorStore.SupportsNestedMetadataFilters.TRUE
                )
                .tenantId("tenant_id")
                .build()

        assertThat(cloudAzureAiSearchVectorStore.searchServiceApiKey())
            .isEqualTo("search_service_api_key")
        assertThat(cloudAzureAiSearchVectorStore.searchServiceEndpoint())
            .isEqualTo("search_service_endpoint")
        assertThat(cloudAzureAiSearchVectorStore.className()).contains("class_name")
        assertThat(cloudAzureAiSearchVectorStore.clientId()).contains("client_id")
        assertThat(cloudAzureAiSearchVectorStore.clientSecret()).contains("client_secret")
        assertThat(cloudAzureAiSearchVectorStore.embeddingDimension()).contains(0L)
        assertThat(cloudAzureAiSearchVectorStore.filterableMetadataFieldKeys())
            .contains(
                CloudAzureAiSearchVectorStore.FilterableMetadataFieldKeys.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(cloudAzureAiSearchVectorStore.indexName()).contains("index_name")
        assertThat(cloudAzureAiSearchVectorStore.searchServiceApiVersion())
            .contains("search_service_api_version")
        assertThat(cloudAzureAiSearchVectorStore.supportsNestedMetadataFilters())
            .contains(CloudAzureAiSearchVectorStore.SupportsNestedMetadataFilters.TRUE)
        assertThat(cloudAzureAiSearchVectorStore.tenantId()).contains("tenant_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudAzureAiSearchVectorStore =
            CloudAzureAiSearchVectorStore.builder()
                .searchServiceApiKey("search_service_api_key")
                .searchServiceEndpoint("search_service_endpoint")
                .className("class_name")
                .clientId("client_id")
                .clientSecret("client_secret")
                .embeddingDimension(0L)
                .filterableMetadataFieldKeys(
                    CloudAzureAiSearchVectorStore.FilterableMetadataFieldKeys.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .indexName("index_name")
                .searchServiceApiVersion("search_service_api_version")
                .supportsNestedMetadataFilters(
                    CloudAzureAiSearchVectorStore.SupportsNestedMetadataFilters.TRUE
                )
                .tenantId("tenant_id")
                .build()

        val roundtrippedCloudAzureAiSearchVectorStore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudAzureAiSearchVectorStore),
                jacksonTypeRef<CloudAzureAiSearchVectorStore>(),
            )

        assertThat(roundtrippedCloudAzureAiSearchVectorStore)
            .isEqualTo(cloudAzureAiSearchVectorStore)
    }
}
