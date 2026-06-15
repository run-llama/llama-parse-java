// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatListResponseTest {

    @Test
    fun create() {
        val chatListResponse =
            ChatListResponse.builder()
                .lastUpdatedAt("2026-04-22T12:34:41.342245")
                .sessionId("ses-abc123")
                .generatedTitle("What were the main findings in Q3?...")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .jobMetadata(
                    ChatListResponse.JobMetadata.builder()
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

        assertThat(chatListResponse.lastUpdatedAt()).isEqualTo("2026-04-22T12:34:41.342245")
        assertThat(chatListResponse.sessionId()).isEqualTo("ses-abc123")
        assertThat(chatListResponse.generatedTitle())
            .contains("What were the main findings in Q3?...")
        assertThat(chatListResponse.indexIds().getOrNull())
            .containsExactly("idx-abc123", "idx-def456")
        assertThat(chatListResponse.jobMetadata())
            .contains(
                ChatListResponse.JobMetadata.builder()
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
        val chatListResponse =
            ChatListResponse.builder()
                .lastUpdatedAt("2026-04-22T12:34:41.342245")
                .sessionId("ses-abc123")
                .generatedTitle("What were the main findings in Q3?...")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .jobMetadata(
                    ChatListResponse.JobMetadata.builder()
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

        val roundtrippedChatListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatListResponse),
                jacksonTypeRef<ChatListResponse>(),
            )

        assertThat(roundtrippedChatListResponse).isEqualTo(chatListResponse)
    }
}
