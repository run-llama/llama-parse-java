// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VertexTextEmbeddingTest {

    @Test
    fun create() {
        val vertexTextEmbedding =
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
                .embedMode(VertexTextEmbedding.EmbedMode.CLASSIFICATION)
                .modelName("model_name")
                .numWorkers(0L)
                .build()

        assertThat(vertexTextEmbedding.clientEmail()).contains("client_email")
        assertThat(vertexTextEmbedding.location()).isEqualTo("location")
        assertThat(vertexTextEmbedding.privateKey()).contains("private_key")
        assertThat(vertexTextEmbedding.privateKeyId()).contains("private_key_id")
        assertThat(vertexTextEmbedding.project()).isEqualTo("project")
        assertThat(vertexTextEmbedding.tokenUri()).contains("token_uri")
        assertThat(vertexTextEmbedding.additionalKwargs())
            .contains(
                VertexTextEmbedding.AdditionalKwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(vertexTextEmbedding.className()).contains("class_name")
        assertThat(vertexTextEmbedding.embedBatchSize()).contains(1L)
        assertThat(vertexTextEmbedding.embedMode())
            .contains(VertexTextEmbedding.EmbedMode.CLASSIFICATION)
        assertThat(vertexTextEmbedding.modelName()).contains("model_name")
        assertThat(vertexTextEmbedding.numWorkers()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vertexTextEmbedding =
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
                .embedMode(VertexTextEmbedding.EmbedMode.CLASSIFICATION)
                .modelName("model_name")
                .numWorkers(0L)
                .build()

        val roundtrippedVertexTextEmbedding =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vertexTextEmbedding),
                jacksonTypeRef<VertexTextEmbedding>(),
            )

        assertThat(roundtrippedVertexTextEmbedding).isEqualTo(vertexTextEmbedding)
    }
}
