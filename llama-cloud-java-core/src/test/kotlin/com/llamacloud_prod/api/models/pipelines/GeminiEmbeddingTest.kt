// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeminiEmbeddingTest {

    @Test
    fun create() {
        val geminiEmbedding =
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

        assertThat(geminiEmbedding.apiBase()).contains("api_base")
        assertThat(geminiEmbedding.apiKey()).contains("api_key")
        assertThat(geminiEmbedding.className()).contains("class_name")
        assertThat(geminiEmbedding.embedBatchSize()).contains(1L)
        assertThat(geminiEmbedding.modelName()).contains("model_name")
        assertThat(geminiEmbedding.numWorkers()).contains(0L)
        assertThat(geminiEmbedding.outputDimensionality()).contains(0L)
        assertThat(geminiEmbedding.taskType()).contains("task_type")
        assertThat(geminiEmbedding.title()).contains("title")
        assertThat(geminiEmbedding.transport()).contains("transport")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geminiEmbedding =
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

        val roundtrippedGeminiEmbedding =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geminiEmbedding),
                jacksonTypeRef<GeminiEmbedding>(),
            )

        assertThat(roundtrippedGeminiEmbedding).isEqualTo(geminiEmbedding)
    }
}
