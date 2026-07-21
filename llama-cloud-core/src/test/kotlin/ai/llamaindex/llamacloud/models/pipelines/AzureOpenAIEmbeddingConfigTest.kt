// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AzureOpenAIEmbeddingConfigTest {

    @Test
    fun create() {
        val azureOpenAIEmbeddingConfig =
            AzureOpenAIEmbeddingConfig.builder()
                .component(
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
                )
                .type(AzureOpenAIEmbeddingConfig.Type.AZURE_EMBEDDING)
                .build()

        assertThat(azureOpenAIEmbeddingConfig.component())
            .contains(
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
            )
        assertThat(azureOpenAIEmbeddingConfig.type())
            .contains(AzureOpenAIEmbeddingConfig.Type.AZURE_EMBEDDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val azureOpenAIEmbeddingConfig =
            AzureOpenAIEmbeddingConfig.builder()
                .component(
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
                )
                .type(AzureOpenAIEmbeddingConfig.Type.AZURE_EMBEDDING)
                .build()

        val roundtrippedAzureOpenAIEmbeddingConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(azureOpenAIEmbeddingConfig),
                jacksonTypeRef<AzureOpenAIEmbeddingConfig>(),
            )

        assertThat(roundtrippedAzureOpenAIEmbeddingConfig).isEqualTo(azureOpenAIEmbeddingConfig)
    }
}
