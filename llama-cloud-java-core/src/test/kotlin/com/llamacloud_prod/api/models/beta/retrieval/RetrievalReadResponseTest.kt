// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalReadResponseTest {

    @Test
    fun create() {
        val retrievalReadResponse = RetrievalReadResponse.builder().content("content").build()

        assertThat(retrievalReadResponse.content()).isEqualTo("content")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrievalReadResponse = RetrievalReadResponse.builder().content("content").build()

        val roundtrippedRetrievalReadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrievalReadResponse),
                jacksonTypeRef<RetrievalReadResponse>(),
            )

        assertThat(roundtrippedRetrievalReadResponse).isEqualTo(retrievalReadResponse)
    }
}
