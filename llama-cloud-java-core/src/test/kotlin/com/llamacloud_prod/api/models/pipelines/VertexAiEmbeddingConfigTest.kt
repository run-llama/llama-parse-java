// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VertexAiEmbeddingConfigTest {

    @Test
    fun create() {
        val vertexAiEmbeddingConfig =
            VertexAiEmbeddingConfig.builder()
                .component(
                    VertexTextEmbedding.builder()
                        .clientEmail("client_email")
                        .location("location")
                        .privateKey("private_key")
                        .privateKeyId("private_key_id")
                        .project("project")
                        .tokenUri("token_uri")
                        .additionalKwargs(
                            VertexTextEmbedding.AdditionalKwargs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .className("class_name")
                        .embedBatchSize(1L)
                        .embedMode(VertexTextEmbedding.EmbedMode.DEFAULT)
                        .modelName("model_name")
                        .numWorkers(0L)
                        .build()
                )
                .type(VertexAiEmbeddingConfig.Type.VERTEXAI_EMBEDDING)
                .build()

        assertThat(vertexAiEmbeddingConfig.component())
            .contains(
                VertexTextEmbedding.builder()
                    .clientEmail("client_email")
                    .location("location")
                    .privateKey("private_key")
                    .privateKeyId("private_key_id")
                    .project("project")
                    .tokenUri("token_uri")
                    .additionalKwargs(
                        VertexTextEmbedding.AdditionalKwargs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .className("class_name")
                    .embedBatchSize(1L)
                    .embedMode(VertexTextEmbedding.EmbedMode.DEFAULT)
                    .modelName("model_name")
                    .numWorkers(0L)
                    .build()
            )
        assertThat(vertexAiEmbeddingConfig.type())
            .contains(VertexAiEmbeddingConfig.Type.VERTEXAI_EMBEDDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vertexAiEmbeddingConfig =
            VertexAiEmbeddingConfig.builder()
                .component(
                    VertexTextEmbedding.builder()
                        .clientEmail("client_email")
                        .location("location")
                        .privateKey("private_key")
                        .privateKeyId("private_key_id")
                        .project("project")
                        .tokenUri("token_uri")
                        .additionalKwargs(
                            VertexTextEmbedding.AdditionalKwargs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .className("class_name")
                        .embedBatchSize(1L)
                        .embedMode(VertexTextEmbedding.EmbedMode.DEFAULT)
                        .modelName("model_name")
                        .numWorkers(0L)
                        .build()
                )
                .type(VertexAiEmbeddingConfig.Type.VERTEXAI_EMBEDDING)
                .build()

        val roundtrippedVertexAiEmbeddingConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vertexAiEmbeddingConfig),
                jacksonTypeRef<VertexAiEmbeddingConfig>(),
            )

        assertThat(roundtrippedVertexAiEmbeddingConfig).isEqualTo(vertexAiEmbeddingConfig)
    }
}
