// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CohereEmbeddingTest {

    @Test
    fun create() {
        val cohereEmbedding =
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

        assertThat(cohereEmbedding.apiKey()).contains("api_key")
        assertThat(cohereEmbedding.className()).contains("class_name")
        assertThat(cohereEmbedding.embedBatchSize()).contains(1L)
        assertThat(cohereEmbedding.embeddingType()).contains("embedding_type")
        assertThat(cohereEmbedding.inputType()).contains("input_type")
        assertThat(cohereEmbedding.modelName()).contains("model_name")
        assertThat(cohereEmbedding.numWorkers()).contains(0L)
        assertThat(cohereEmbedding.truncate()).contains("truncate")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cohereEmbedding =
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

        val roundtrippedCohereEmbedding =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cohereEmbedding),
                jacksonTypeRef<CohereEmbedding>(),
            )

        assertThat(roundtrippedCohereEmbedding).isEqualTo(cohereEmbedding)
    }
}
