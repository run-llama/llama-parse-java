// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.chat

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatRetrieveResponseTest {

    @Test
    fun create() {
        val chatRetrieveResponse =
            ChatRetrieveResponse.builder()
                .addEvent(
                    ChatRetrieveResponse.Event.Stop.builder()
                        .error("error")
                        .isError(true)
                        .usage(
                            ChatRetrieveResponse.Event.Stop.Usage.builder()
                                .durationMs(0.0)
                                .totalInputTokens(0L)
                                .totalOutputTokens(0L)
                                .turns(0L)
                                .build()
                        )
                        .type(ChatRetrieveResponse.Event.Stop.Type.STOP)
                        .build()
                )
                .lastUpdatedAt("2026-04-22T12:34:41.342245")
                .sessionId("ses-abc123")
                .generatedTitle("What were the main findings in Q3?...")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .jobMetadata(
                    ChatRetrieveResponse.JobMetadata.builder()
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

        assertThat(chatRetrieveResponse.events())
            .containsExactly(
                ChatRetrieveResponse.Event.ofStop(
                    ChatRetrieveResponse.Event.Stop.builder()
                        .error("error")
                        .isError(true)
                        .usage(
                            ChatRetrieveResponse.Event.Stop.Usage.builder()
                                .durationMs(0.0)
                                .totalInputTokens(0L)
                                .totalOutputTokens(0L)
                                .turns(0L)
                                .build()
                        )
                        .type(ChatRetrieveResponse.Event.Stop.Type.STOP)
                        .build()
                )
            )
        assertThat(chatRetrieveResponse.lastUpdatedAt()).isEqualTo("2026-04-22T12:34:41.342245")
        assertThat(chatRetrieveResponse.sessionId()).isEqualTo("ses-abc123")
        assertThat(chatRetrieveResponse.generatedTitle())
            .contains("What were the main findings in Q3?...")
        assertThat(chatRetrieveResponse.indexIds().getOrNull())
            .containsExactly("idx-abc123", "idx-def456")
        assertThat(chatRetrieveResponse.jobMetadata())
            .contains(
                ChatRetrieveResponse.JobMetadata.builder()
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
        val chatRetrieveResponse =
            ChatRetrieveResponse.builder()
                .addEvent(
                    ChatRetrieveResponse.Event.Stop.builder()
                        .error("error")
                        .isError(true)
                        .usage(
                            ChatRetrieveResponse.Event.Stop.Usage.builder()
                                .durationMs(0.0)
                                .totalInputTokens(0L)
                                .totalOutputTokens(0L)
                                .turns(0L)
                                .build()
                        )
                        .type(ChatRetrieveResponse.Event.Stop.Type.STOP)
                        .build()
                )
                .lastUpdatedAt("2026-04-22T12:34:41.342245")
                .sessionId("ses-abc123")
                .generatedTitle("What were the main findings in Q3?...")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .jobMetadata(
                    ChatRetrieveResponse.JobMetadata.builder()
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

        val roundtrippedChatRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatRetrieveResponse),
                jacksonTypeRef<ChatRetrieveResponse>(),
            )

        assertThat(roundtrippedChatRetrieveResponse).isEqualTo(chatRetrieveResponse)
    }
}
