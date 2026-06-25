// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenAIEmbeddingTest {

    @Test
    fun create() {
        val openaiEmbedding =
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

        assertThat(openaiEmbedding.additionalKwargs())
            .contains(
                OpenAIEmbedding.AdditionalKwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(openaiEmbedding.apiBase()).contains("api_base")
        assertThat(openaiEmbedding.apiKey()).contains("api_key")
        assertThat(openaiEmbedding.apiVersion()).contains("api_version")
        assertThat(openaiEmbedding.className()).contains("class_name")
        assertThat(openaiEmbedding.defaultHeaders())
            .contains(
                OpenAIEmbedding.DefaultHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(openaiEmbedding.dimensions()).contains(0L)
        assertThat(openaiEmbedding.embedBatchSize()).contains(1L)
        assertThat(openaiEmbedding.maxRetries()).contains(0L)
        assertThat(openaiEmbedding.modelName()).contains("model_name")
        assertThat(openaiEmbedding.numWorkers()).contains(0L)
        assertThat(openaiEmbedding.reuseClient()).contains(true)
        assertThat(openaiEmbedding.timeout()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openaiEmbedding =
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

        val roundtrippedOpenAIEmbedding =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openaiEmbedding),
                jacksonTypeRef<OpenAIEmbedding>(),
            )

        assertThat(roundtrippedOpenAIEmbedding).isEqualTo(openaiEmbedding)
    }
}
