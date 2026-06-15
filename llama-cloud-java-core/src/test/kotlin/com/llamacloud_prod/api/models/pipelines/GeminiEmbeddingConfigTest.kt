// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeminiEmbeddingConfigTest {

    @Test
    fun create() {
        val geminiEmbeddingConfig =
            GeminiEmbeddingConfig.builder()
                .component(
                    GeminiEmbedding.builder()
                        .apiBase("api_base")
                        .apiKey("api_key")
                        .className("class_name")
                        .embedBatchSize(1L)
                        .modelName("model_name")
                        .numWorkers(0L)
                        .outputDimensionality(0L)
                        .taskType("task_type")
                        .title("title")
                        .transport("transport")
                        .build()
                )
                .type(GeminiEmbeddingConfig.Type.GEMINI_EMBEDDING)
                .build()

        assertThat(geminiEmbeddingConfig.component())
            .contains(
                GeminiEmbedding.builder()
                    .apiBase("api_base")
                    .apiKey("api_key")
                    .className("class_name")
                    .embedBatchSize(1L)
                    .modelName("model_name")
                    .numWorkers(0L)
                    .outputDimensionality(0L)
                    .taskType("task_type")
                    .title("title")
                    .transport("transport")
                    .build()
            )
        assertThat(geminiEmbeddingConfig.type())
            .contains(GeminiEmbeddingConfig.Type.GEMINI_EMBEDDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geminiEmbeddingConfig =
            GeminiEmbeddingConfig.builder()
                .component(
                    GeminiEmbedding.builder()
                        .apiBase("api_base")
                        .apiKey("api_key")
                        .className("class_name")
                        .embedBatchSize(1L)
                        .modelName("model_name")
                        .numWorkers(0L)
                        .outputDimensionality(0L)
                        .taskType("task_type")
                        .title("title")
                        .transport("transport")
                        .build()
                )
                .type(GeminiEmbeddingConfig.Type.GEMINI_EMBEDDING)
                .build()

        val roundtrippedGeminiEmbeddingConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geminiEmbeddingConfig),
                jacksonTypeRef<GeminiEmbeddingConfig>(),
            )

        assertThat(roundtrippedGeminiEmbeddingConfig).isEqualTo(geminiEmbeddingConfig)
    }
}
