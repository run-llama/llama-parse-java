// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.retrieval

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalFindResponseTest {

    @Test
    fun create() {
        val retrievalFindResponse =
            RetrievalFindResponse.builder().fileId("file_id").fileName("file_name").build()

        assertThat(retrievalFindResponse.fileId()).isEqualTo("file_id")
        assertThat(retrievalFindResponse.fileName()).isEqualTo("file_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrievalFindResponse =
            RetrievalFindResponse.builder().fileId("file_id").fileName("file_name").build()

        val roundtrippedRetrievalFindResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrievalFindResponse),
                jacksonTypeRef<RetrievalFindResponse>(),
            )

        assertThat(roundtrippedRetrievalFindResponse).isEqualTo(retrievalFindResponse)
    }
}
