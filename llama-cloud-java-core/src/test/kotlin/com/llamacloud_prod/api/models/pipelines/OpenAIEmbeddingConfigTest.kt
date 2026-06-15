// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenAIEmbeddingConfigTest {

    @Test
    fun create() {
        val openaiEmbeddingConfig =
            OpenAIEmbeddingConfig.builder()
                .component(
                    OpenAIEmbedding.builder()
                        .additionalKwargs(
                            OpenAIEmbedding.AdditionalKwargs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .apiBase("api_base")
                        .apiKey("api_key")
                        .apiVersion("api_version")
                        .className("class_name")
                        .defaultHeaders(
                            OpenAIEmbedding.DefaultHeaders.builder()
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
                .type(OpenAIEmbeddingConfig.Type.OPENAI_EMBEDDING)
                .build()

        assertThat(openaiEmbeddingConfig.component())
            .contains(
                OpenAIEmbedding.builder()
                    .additionalKwargs(
                        OpenAIEmbedding.AdditionalKwargs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .apiBase("api_base")
                    .apiKey("api_key")
                    .apiVersion("api_version")
                    .className("class_name")
                    .defaultHeaders(
                        OpenAIEmbedding.DefaultHeaders.builder()
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
        assertThat(openaiEmbeddingConfig.type())
            .contains(OpenAIEmbeddingConfig.Type.OPENAI_EMBEDDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openaiEmbeddingConfig =
            OpenAIEmbeddingConfig.builder()
                .component(
                    OpenAIEmbedding.builder()
                        .additionalKwargs(
                            OpenAIEmbedding.AdditionalKwargs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .apiBase("api_base")
                        .apiKey("api_key")
                        .apiVersion("api_version")
                        .className("class_name")
                        .defaultHeaders(
                            OpenAIEmbedding.DefaultHeaders.builder()
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
                .type(OpenAIEmbeddingConfig.Type.OPENAI_EMBEDDING)
                .build()

        val roundtrippedOpenAIEmbeddingConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openaiEmbeddingConfig),
                jacksonTypeRef<OpenAIEmbeddingConfig>(),
            )

        assertThat(roundtrippedOpenAIEmbeddingConfig).isEqualTo(openaiEmbeddingConfig)
    }
}
