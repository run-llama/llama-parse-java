// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.split

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitDeleteResponseTest {

    @Test
    fun create() {
        val splitDeleteResponse = SplitDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitDeleteResponse = SplitDeleteResponse.builder().build()

        val roundtrippedSplitDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitDeleteResponse),
                jacksonTypeRef<SplitDeleteResponse>(),
            )

        assertThat(roundtrippedSplitDeleteResponse).isEqualTo(splitDeleteResponse)
    }
}
