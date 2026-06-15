// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalGrepPageResponseTest {

    @Test
    fun create() {
        val retrievalGrepPageResponse =
            RetrievalGrepPageResponse.builder()
                .addItem(
                    RetrievalGrepResponse.builder()
                        .content("content")
                        .endChar(0L)
                        .startChar(0L)
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(retrievalGrepPageResponse.items())
            .containsExactly(
                RetrievalGrepResponse.builder().content("content").endChar(0L).startChar(0L).build()
            )
        assertThat(retrievalGrepPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(retrievalGrepPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrievalGrepPageResponse =
            RetrievalGrepPageResponse.builder()
                .addItem(
                    RetrievalGrepResponse.builder()
                        .content("content")
                        .endChar(0L)
                        .startChar(0L)
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedRetrievalGrepPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrievalGrepPageResponse),
                jacksonTypeRef<RetrievalGrepPageResponse>(),
            )

        assertThat(roundtrippedRetrievalGrepPageResponse).isEqualTo(retrievalGrepPageResponse)
    }
}
