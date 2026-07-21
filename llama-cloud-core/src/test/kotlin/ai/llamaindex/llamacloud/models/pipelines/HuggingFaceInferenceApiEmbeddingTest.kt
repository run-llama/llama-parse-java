// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HuggingFaceInferenceApiEmbeddingTest {

    @Test
    fun create() {
        val huggingFaceInferenceApiEmbedding =
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

        assertThat(huggingFaceInferenceApiEmbedding.token())
            .contains(HuggingFaceInferenceApiEmbedding.Token.ofString("string"))
        assertThat(huggingFaceInferenceApiEmbedding.className()).contains("class_name")
        assertThat(huggingFaceInferenceApiEmbedding.cookies())
            .contains(
                HuggingFaceInferenceApiEmbedding.Cookies.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(huggingFaceInferenceApiEmbedding.embedBatchSize()).contains(1L)
        assertThat(huggingFaceInferenceApiEmbedding.headers())
            .contains(
                HuggingFaceInferenceApiEmbedding.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(huggingFaceInferenceApiEmbedding.modelName()).contains("model_name")
        assertThat(huggingFaceInferenceApiEmbedding.numWorkers()).contains(0L)
        assertThat(huggingFaceInferenceApiEmbedding.pooling())
            .contains(HuggingFaceInferenceApiEmbedding.Pooling.CLS)
        assertThat(huggingFaceInferenceApiEmbedding.queryInstruction())
            .contains("query_instruction")
        assertThat(huggingFaceInferenceApiEmbedding.task()).contains("task")
        assertThat(huggingFaceInferenceApiEmbedding.textInstruction()).contains("text_instruction")
        assertThat(huggingFaceInferenceApiEmbedding.timeout()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val huggingFaceInferenceApiEmbedding =
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

        val roundtrippedHuggingFaceInferenceApiEmbedding =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(huggingFaceInferenceApiEmbedding),
                jacksonTypeRef<HuggingFaceInferenceApiEmbedding>(),
            )

        assertThat(roundtrippedHuggingFaceInferenceApiEmbedding)
            .isEqualTo(huggingFaceInferenceApiEmbedding)
    }
}
