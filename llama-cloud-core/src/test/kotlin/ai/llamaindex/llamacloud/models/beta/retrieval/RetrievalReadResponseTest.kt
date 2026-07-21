// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.retrieval

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
