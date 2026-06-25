// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatListPageResponseTest {

    @Test
    fun create() {
        val chatListPageResponse =
            ChatListPageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .build()

        assertThat(chatListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(chatListPageResponse.nextPageToken()).contains("next_page_token")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatListPageResponse =
            ChatListPageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .build()

        val roundtrippedChatListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatListPageResponse),
                jacksonTypeRef<ChatListPageResponse>(),
            )

        assertThat(roundtrippedChatListPageResponse).isEqualTo(chatListPageResponse)
    }
}
