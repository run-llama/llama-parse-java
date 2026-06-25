// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateResponseTest {

    @Test
    fun create() {
        val chatCreateResponse =
            ChatCreateResponse.builder()
                .lastUpdatedAt("2026-04-22T12:34:41.342245")
                .sessionId("ses-abc123")
                .generatedTitle("What were the main findings in Q3?...")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .jobMetadata(
                    ChatCreateResponse.JobMetadata.builder()
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

        assertThat(chatCreateResponse.lastUpdatedAt()).isEqualTo("2026-04-22T12:34:41.342245")
        assertThat(chatCreateResponse.sessionId()).isEqualTo("ses-abc123")
        assertThat(chatCreateResponse.generatedTitle())
            .contains("What were the main findings in Q3?...")
        assertThat(chatCreateResponse.indexIds().getOrNull())
            .containsExactly("idx-abc123", "idx-def456")
        assertThat(chatCreateResponse.jobMetadata())
            .contains(
                ChatCreateResponse.JobMetadata.builder()
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
        val chatCreateResponse =
            ChatCreateResponse.builder()
                .lastUpdatedAt("2026-04-22T12:34:41.342245")
                .sessionId("ses-abc123")
                .generatedTitle("What were the main findings in Q3?...")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .jobMetadata(
                    ChatCreateResponse.JobMetadata.builder()
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

        val roundtrippedChatCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCreateResponse),
                jacksonTypeRef<ChatCreateResponse>(),
            )

        assertThat(roundtrippedChatCreateResponse).isEqualTo(chatCreateResponse)
    }
}
