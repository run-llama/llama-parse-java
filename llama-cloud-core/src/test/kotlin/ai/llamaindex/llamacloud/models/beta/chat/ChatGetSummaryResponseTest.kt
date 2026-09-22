// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.chat

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatGetSummaryResponseTest {

    @Test
    fun create() {
        val chatGetSummaryResponse =
            ChatGetSummaryResponse.builder()
                .lastUpdatedAt("2026-04-22T12:34:41.342245")
                .sessionId("ses-abc123")
                .generatedTitle("What were the main findings in Q3?...")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .jobMetadata(
                    ChatGetSummaryResponse.JobMetadata.builder()
                        .durationMs(0.0)
                        .error("error")
                        .addExportConfigId("string")
                        .isError(true)
                        .totalInputTokens(0L)
                        .totalOutputTokens(0L)
                        .turns(0L)
                        .build()
                )
                .build()

        assertThat(chatGetSummaryResponse.lastUpdatedAt()).isEqualTo("2026-04-22T12:34:41.342245")
        assertThat(chatGetSummaryResponse.sessionId()).isEqualTo("ses-abc123")
        assertThat(chatGetSummaryResponse.generatedTitle())
            .contains("What were the main findings in Q3?...")
        assertThat(chatGetSummaryResponse.indexIds().getOrNull())
            .containsExactly("idx-abc123", "idx-def456")
        assertThat(chatGetSummaryResponse.jobMetadata())
            .contains(
                ChatGetSummaryResponse.JobMetadata.builder()
                    .durationMs(0.0)
                    .error("error")
                    .addExportConfigId("string")
                    .isError(true)
                    .totalInputTokens(0L)
                    .totalOutputTokens(0L)
                    .turns(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatGetSummaryResponse =
            ChatGetSummaryResponse.builder()
                .lastUpdatedAt("2026-04-22T12:34:41.342245")
                .sessionId("ses-abc123")
                .generatedTitle("What were the main findings in Q3?...")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .jobMetadata(
                    ChatGetSummaryResponse.JobMetadata.builder()
                        .durationMs(0.0)
                        .error("error")
                        .addExportConfigId("string")
                        .isError(true)
                        .totalInputTokens(0L)
                        .totalOutputTokens(0L)
                        .turns(0L)
                        .build()
                )
                .build()

        val roundtrippedChatGetSummaryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatGetSummaryResponse),
                jacksonTypeRef<ChatGetSummaryResponse>(),
            )

        assertThat(roundtrippedChatGetSummaryResponse).isEqualTo(chatGetSummaryResponse)
    }
}
