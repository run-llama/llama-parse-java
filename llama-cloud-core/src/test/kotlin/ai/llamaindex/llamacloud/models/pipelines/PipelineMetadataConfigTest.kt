// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineMetadataConfigTest {

    @Test
    fun create() {
        val pipelineMetadataConfig =
            PipelineMetadataConfig.builder()
                .addExcludedEmbedMetadataKey("string")
                .addExcludedLlmMetadataKey("string")
                .build()

        assertThat(pipelineMetadataConfig.excludedEmbedMetadataKeys().getOrNull())
            .containsExactly("string")
        assertThat(pipelineMetadataConfig.excludedLlmMetadataKeys().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineMetadataConfig =
            PipelineMetadataConfig.builder()
                .addExcludedEmbedMetadataKey("string")
                .addExcludedLlmMetadataKey("string")
                .build()

        val roundtrippedPipelineMetadataConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineMetadataConfig),
                jacksonTypeRef<PipelineMetadataConfig>(),
            )

        assertThat(roundtrippedPipelineMetadataConfig).isEqualTo(pipelineMetadataConfig)
    }
}
