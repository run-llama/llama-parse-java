// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalGrepResponseTest {

    @Test
    fun create() {
        val retrievalGrepResponse =
            RetrievalGrepResponse.builder().content("content").endChar(0L).startChar(0L).build()

        assertThat(retrievalGrepResponse.content()).isEqualTo("content")
        assertThat(retrievalGrepResponse.endChar()).isEqualTo(0L)
        assertThat(retrievalGrepResponse.startChar()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrievalGrepResponse =
            RetrievalGrepResponse.builder().content("content").endChar(0L).startChar(0L).build()

        val roundtrippedRetrievalGrepResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrievalGrepResponse),
                jacksonTypeRef<RetrievalGrepResponse>(),
            )

        assertThat(roundtrippedRetrievalGrepResponse).isEqualTo(retrievalGrepResponse)
    }
}
