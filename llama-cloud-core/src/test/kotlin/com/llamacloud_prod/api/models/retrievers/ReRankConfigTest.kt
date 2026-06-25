// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.retrievers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
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
