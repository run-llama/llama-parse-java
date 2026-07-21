// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HuggingFaceInferenceApiEmbeddingConfigTest {

    @Test
    fun create() {
        val huggingFaceInferenceApiEmbeddingConfig =
            HuggingFaceInferenceApiEmbeddingConfig.builder()
                .component(
                    HuggingFaceInferenceApiEmbedding.builder()
                        .token("string")
                        .className("class_name")
                        .cookies(
                            HuggingFaceInferenceApiEmbedding.Cookies.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .embedBatchSize(1L)
                        .headers(
                            HuggingFaceInferenceApiEmbedding.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .modelName("model_name")
                        .numWorkers(0L)
                        .pooling(HuggingFaceInferenceApiEmbedding.Pooling.CLS)
                        .queryInstruction("query_instruction")
                        .task("task")
                        .textInstruction("text_instruction")
                        .timeout(0.0)
                        .build()
                )
                .type(HuggingFaceInferenceApiEmbeddingConfig.Type.HUGGINGFACE_API_EMBEDDING)
                .build()

        assertThat(huggingFaceInferenceApiEmbeddingConfig.component())
            .contains(
                HuggingFaceInferenceApiEmbedding.builder()
                    .token("string")
                    .className("class_name")
                    .cookies(
                        HuggingFaceInferenceApiEmbedding.Cookies.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .embedBatchSize(1L)
                    .headers(
                        HuggingFaceInferenceApiEmbedding.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .modelName("model_name")
                    .numWorkers(0L)
                    .pooling(HuggingFaceInferenceApiEmbedding.Pooling.CLS)
                    .queryInstruction("query_instruction")
                    .task("task")
                    .textInstruction("text_instruction")
                    .timeout(0.0)
                    .build()
            )
        assertThat(huggingFaceInferenceApiEmbeddingConfig.type())
            .contains(HuggingFaceInferenceApiEmbeddingConfig.Type.HUGGINGFACE_API_EMBEDDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val huggingFaceInferenceApiEmbeddingConfig =
            HuggingFaceInferenceApiEmbeddingConfig.builder()
                .component(
                    HuggingFaceInferenceApiEmbedding.builder()
                        .token("string")
                        .className("class_name")
                        .cookies(
                            HuggingFaceInferenceApiEmbedding.Cookies.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .embedBatchSize(1L)
                        .headers(
                            HuggingFaceInferenceApiEmbedding.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .modelName("model_name")
                        .numWorkers(0L)
                        .pooling(HuggingFaceInferenceApiEmbedding.Pooling.CLS)
                        .queryInstruction("query_instruction")
                        .task("task")
                        .textInstruction("text_instruction")
                        .timeout(0.0)
                        .build()
                )
                .type(HuggingFaceInferenceApiEmbeddingConfig.Type.HUGGINGFACE_API_EMBEDDING)
                .build()

        val roundtrippedHuggingFaceInferenceApiEmbeddingConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(huggingFaceInferenceApiEmbeddingConfig),
                jacksonTypeRef<HuggingFaceInferenceApiEmbeddingConfig>(),
            )

        assertThat(roundtrippedHuggingFaceInferenceApiEmbeddingConfig)
            .isEqualTo(huggingFaceInferenceApiEmbeddingConfig)
    }
}
