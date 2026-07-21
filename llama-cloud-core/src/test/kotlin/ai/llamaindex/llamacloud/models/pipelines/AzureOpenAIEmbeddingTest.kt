// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AzureOpenAIEmbeddingTest {

    @Test
    fun create() {
        val azureOpenAIEmbedding =
            AzureOpenAIEmbedding.builder()
                .additionalKwargs(
                    AzureOpenAIEmbedding.AdditionalKwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .apiBase("api_base")
                .apiKey("api_key")
                .apiVersion("api_version")
                .azureDeployment("azure_deployment")
                .azureEndpoint("azure_endpoint")
                .className("class_name")
                .defaultHeaders(
                    AzureOpenAIEmbedding.DefaultHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dimensions(0L)
                .embedBatchSize(1L)
                .maxRetries(0L)
                .modelName("model_name")
                .numWorkers(0L)
                .reuseClient(true)
                .timeout(0.0)
                .build()

        assertThat(azureOpenAIEmbedding.additionalKwargs())
            .contains(
                AzureOpenAIEmbedding.AdditionalKwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(azureOpenAIEmbedding.apiBase()).contains("api_base")
        assertThat(azureOpenAIEmbedding.apiKey()).contains("api_key")
        assertThat(azureOpenAIEmbedding.apiVersion()).contains("api_version")
        assertThat(azureOpenAIEmbedding.azureDeployment()).contains("azure_deployment")
        assertThat(azureOpenAIEmbedding.azureEndpoint()).contains("azure_endpoint")
        assertThat(azureOpenAIEmbedding.className()).contains("class_name")
        assertThat(azureOpenAIEmbedding.defaultHeaders())
            .contains(
                AzureOpenAIEmbedding.DefaultHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(azureOpenAIEmbedding.dimensions()).contains(0L)
        assertThat(azureOpenAIEmbedding.embedBatchSize()).contains(1L)
        assertThat(azureOpenAIEmbedding.maxRetries()).contains(0L)
        assertThat(azureOpenAIEmbedding.modelName()).contains("model_name")
        assertThat(azureOpenAIEmbedding.numWorkers()).contains(0L)
        assertThat(azureOpenAIEmbedding.reuseClient()).contains(true)
        assertThat(azureOpenAIEmbedding.timeout()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val azureOpenAIEmbedding =
            AzureOpenAIEmbedding.builder()
                .additionalKwargs(
                    AzureOpenAIEmbedding.AdditionalKwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .apiBase("api_base")
                .apiKey("api_key")
                .apiVersion("api_version")
                .azureDeployment("azure_deployment")
                .azureEndpoint("azure_endpoint")
                .className("class_name")
                .defaultHeaders(
                    AzureOpenAIEmbedding.DefaultHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dimensions(0L)
                .embedBatchSize(1L)
                .maxRetries(0L)
                .modelName("model_name")
                .numWorkers(0L)
                .reuseClient(true)
                .timeout(0.0)
                .build()

        val roundtrippedAzureOpenAIEmbedding =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(azureOpenAIEmbedding),
                jacksonTypeRef<AzureOpenAIEmbedding>(),
            )

        assertThat(roundtrippedAzureOpenAIEmbedding).isEqualTo(azureOpenAIEmbedding)
    }
}
