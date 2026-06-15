// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LlmParametersTest {

    @Test
    fun create() {
        val llmParameters =
            LlmParameters.builder()
                .className("class_name")
                .modelName(LlmParameters.ModelName.GPT_4_O)
                .systemPrompt("system_prompt")
                .temperature(0.0)
                .useChainOfThoughtReasoning(true)
                .useCitation(true)
                .build()

        assertThat(llmParameters.className()).contains("class_name")
        assertThat(llmParameters.modelName()).contains(LlmParameters.ModelName.GPT_4_O)
        assertThat(llmParameters.systemPrompt()).contains("system_prompt")
        assertThat(llmParameters.temperature()).contains(0.0)
        assertThat(llmParameters.useChainOfThoughtReasoning()).contains(true)
        assertThat(llmParameters.useCitation()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val llmParameters =
            LlmParameters.builder()
                .className("class_name")
                .modelName(LlmParameters.ModelName.GPT_4_O)
                .systemPrompt("system_prompt")
                .temperature(0.0)
                .useChainOfThoughtReasoning(true)
                .useCitation(true)
                .build()

        val roundtrippedLlmParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(llmParameters),
                jacksonTypeRef<LlmParameters>(),
            )

        assertThat(roundtrippedLlmParameters).isEqualTo(llmParameters)
    }
}
