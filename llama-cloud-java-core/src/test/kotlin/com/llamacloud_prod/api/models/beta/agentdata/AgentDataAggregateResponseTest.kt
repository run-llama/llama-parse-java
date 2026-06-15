// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.agentdata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDataAggregateResponseTest {

    @Test
    fun create() {
        val agentDataAggregateResponse =
            AgentDataAggregateResponse.builder()
                .groupKey(
                    AgentDataAggregateResponse.GroupKey.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .count(0L)
                .firstItem(
                    AgentDataAggregateResponse.FirstItem.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(agentDataAggregateResponse.groupKey())
            .isEqualTo(
                AgentDataAggregateResponse.GroupKey.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(agentDataAggregateResponse.count()).contains(0L)
        assertThat(agentDataAggregateResponse.firstItem())
            .contains(
                AgentDataAggregateResponse.FirstItem.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentDataAggregateResponse =
            AgentDataAggregateResponse.builder()
                .groupKey(
                    AgentDataAggregateResponse.GroupKey.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .count(0L)
                .firstItem(
                    AgentDataAggregateResponse.FirstItem.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedAgentDataAggregateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentDataAggregateResponse),
                jacksonTypeRef<AgentDataAggregateResponse>(),
            )

        assertThat(roundtrippedAgentDataAggregateResponse).isEqualTo(agentDataAggregateResponse)
    }
}
