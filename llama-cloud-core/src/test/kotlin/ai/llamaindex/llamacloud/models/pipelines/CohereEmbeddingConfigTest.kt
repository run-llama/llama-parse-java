// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CohereEmbeddingConfigTest {

    @Test
    fun create() {
        val cohereEmbeddingConfig =
            CohereEmbeddingConfig.builder()
                .component(
                    CohereEmbedding.builder()
                        .apiKey("api_key")
                        .className("class_name")
                        .embedBatchSize(1L)
                        .embeddingType("embedding_type")
                        .inputType("input_type")
                        .modelName("model_name")
                        .numWorkers(0L)
                        .truncate("truncate")
                        .build()
                )
                .type(CohereEmbeddingConfig.Type.COHERE_EMBEDDING)
                .build()

        assertThat(cohereEmbeddingConfig.component())
            .contains(
                CohereEmbedding.builder()
                    .apiKey("api_key")
                    .className("class_name")
                    .embedBatchSize(1L)
                    .embeddingType("embedding_type")
                    .inputType("input_type")
                    .modelName("model_name")
                    .numWorkers(0L)
                    .truncate("truncate")
                    .build()
            )
        assertThat(cohereEmbeddingConfig.type())
            .contains(CohereEmbeddingConfig.Type.COHERE_EMBEDDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cohereEmbeddingConfig =
            CohereEmbeddingConfig.builder()
                .component(
                    CohereEmbedding.builder()
                        .apiKey("api_key")
                        .className("class_name")
                        .embedBatchSize(1L)
                        .embeddingType("embedding_type")
                        .inputType("input_type")
                        .modelName("model_name")
                        .numWorkers(0L)
                        .truncate("truncate")
                        .build()
                )
                .type(CohereEmbeddingConfig.Type.COHERE_EMBEDDING)
                .build()

        val roundtrippedCohereEmbeddingConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cohereEmbeddingConfig),
                jacksonTypeRef<CohereEmbeddingConfig>(),
            )

        assertThat(roundtrippedCohereEmbeddingConfig).isEqualTo(cohereEmbeddingConfig)
    }
}
