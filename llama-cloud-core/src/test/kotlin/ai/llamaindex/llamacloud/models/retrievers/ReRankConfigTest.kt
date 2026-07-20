// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.retrievers

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReRankConfigTest {

    @Test
    fun create() {
        val reRankConfig = ReRankConfig.builder().topN(1L).type(ReRankConfig.Type.BEDROCK).build()

        assertThat(reRankConfig.topN()).contains(1L)
        assertThat(reRankConfig.type()).contains(ReRankConfig.Type.BEDROCK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reRankConfig = ReRankConfig.builder().topN(1L).type(ReRankConfig.Type.BEDROCK).build()

        val roundtrippedReRankConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reRankConfig),
                jacksonTypeRef<ReRankConfig>(),
            )

        assertThat(roundtrippedReRankConfig).isEqualTo(reRankConfig)
    }
}
