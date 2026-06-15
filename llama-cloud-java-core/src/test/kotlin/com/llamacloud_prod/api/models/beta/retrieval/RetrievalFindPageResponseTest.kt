// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalFindPageResponseTest {

    @Test
    fun create() {
        val retrievalFindPageResponse =
            RetrievalFindPageResponse.builder()
                .addItem(
                    RetrievalFindResponse.builder().fileId("file_id").fileName("file_name").build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(retrievalFindPageResponse.items())
            .containsExactly(
                RetrievalFindResponse.builder().fileId("file_id").fileName("file_name").build()
            )
        assertThat(retrievalFindPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(retrievalFindPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrievalFindPageResponse =
            RetrievalFindPageResponse.builder()
                .addItem(
                    RetrievalFindResponse.builder().fileId("file_id").fileName("file_name").build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedRetrievalFindPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrievalFindPageResponse),
                jacksonTypeRef<RetrievalFindPageResponse>(),
            )

        assertThat(roundtrippedRetrievalFindPageResponse).isEqualTo(retrievalFindPageResponse)
    }
}
