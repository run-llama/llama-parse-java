// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extractionagents

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractionAgentListPageResponseTest {

    @Test
    fun create() {
        val extractionAgentListPageResponse =
            ExtractionAgentListPageResponse.builder()
                .addItem(
                    ExtractAgent.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .config(
                            ExtractAgent.Config.builder()
                                .chunkMode(ExtractAgent.Config.ChunkMode.PAGE)
                                .citationBbox(true)
                                .citeSources(true)
                                .confidenceScores(true)
                                .extractModel(ExtractAgent.Config.ExtractModel.GEMINI_2_0_FLASH)
                                .extractionMode(ExtractAgent.Config.ExtractionMode.BALANCED)
                                .extractionTarget(ExtractAgent.Config.ExtractionTarget.PER_DOC)
                                .highResolutionMode(true)
                                .invalidateCache(true)
                                .multimodalFastMode(true)
                                .numPagesContext(1L)
                                .pageRange("page_range")
                                .parseModel(ExtractAgent.Config.ParseModel.ANTHROPIC_HAIKU_3_5)
                                .priority(ExtractAgent.Config.Priority.CRITICAL)
                                .systemPrompt("system_prompt")
                                .useReasoning(true)
                                .build()
                        )
                        .dataSchema(
                            ExtractAgent.DataSchema.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customConfiguration(ExtractAgent.CustomConfiguration.DEFAULT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(extractionAgentListPageResponse.items())
            .containsExactly(
                ExtractAgent.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .config(
                        ExtractAgent.Config.builder()
                            .chunkMode(ExtractAgent.Config.ChunkMode.PAGE)
                            .citationBbox(true)
                            .citeSources(true)
                            .confidenceScores(true)
                            .extractModel(ExtractAgent.Config.ExtractModel.GEMINI_2_0_FLASH)
                            .extractionMode(ExtractAgent.Config.ExtractionMode.BALANCED)
                            .extractionTarget(ExtractAgent.Config.ExtractionTarget.PER_DOC)
                            .highResolutionMode(true)
                            .invalidateCache(true)
                            .multimodalFastMode(true)
                            .numPagesContext(1L)
                            .pageRange("page_range")
                            .parseModel(ExtractAgent.Config.ParseModel.ANTHROPIC_HAIKU_3_5)
                            .priority(ExtractAgent.Config.Priority.CRITICAL)
                            .systemPrompt("system_prompt")
                            .useReasoning(true)
                            .build()
                    )
                    .dataSchema(
                        ExtractAgent.DataSchema.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customConfiguration(ExtractAgent.CustomConfiguration.DEFAULT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(extractionAgentListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(extractionAgentListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractionAgentListPageResponse =
            ExtractionAgentListPageResponse.builder()
                .addItem(
                    ExtractAgent.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .config(
                            ExtractAgent.Config.builder()
                                .chunkMode(ExtractAgent.Config.ChunkMode.PAGE)
                                .citationBbox(true)
                                .citeSources(true)
                                .confidenceScores(true)
                                .extractModel(ExtractAgent.Config.ExtractModel.GEMINI_2_0_FLASH)
                                .extractionMode(ExtractAgent.Config.ExtractionMode.BALANCED)
                                .extractionTarget(ExtractAgent.Config.ExtractionTarget.PER_DOC)
                                .highResolutionMode(true)
                                .invalidateCache(true)
                                .multimodalFastMode(true)
                                .numPagesContext(1L)
                                .pageRange("page_range")
                                .parseModel(ExtractAgent.Config.ParseModel.ANTHROPIC_HAIKU_3_5)
                                .priority(ExtractAgent.Config.Priority.CRITICAL)
                                .systemPrompt("system_prompt")
                                .useReasoning(true)
                                .build()
                        )
                        .dataSchema(
                            ExtractAgent.DataSchema.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customConfiguration(ExtractAgent.CustomConfiguration.DEFAULT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedExtractionAgentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractionAgentListPageResponse),
                jacksonTypeRef<ExtractionAgentListPageResponse>(),
            )

        assertThat(roundtrippedExtractionAgentListPageResponse)
            .isEqualTo(extractionAgentListPageResponse)
    }
}
