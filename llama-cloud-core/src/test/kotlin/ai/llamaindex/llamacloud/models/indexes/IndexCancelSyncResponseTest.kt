// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.indexes

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexCancelSyncResponseTest {

    @Test
    fun create() {
        val indexCancelSyncResponse = IndexCancelSyncResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexCancelSyncResponse = IndexCancelSyncResponse.builder().build()

        val roundtrippedIndexCancelSyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexCancelSyncResponse),
                jacksonTypeRef<IndexCancelSyncResponse>(),
            )

        assertThat(roundtrippedIndexCancelSyncResponse).isEqualTo(indexCancelSyncResponse)
    }
}
