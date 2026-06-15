// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.agentdata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDataAggregatePageResponseTest {

    @Test
    fun create() {
        val agentDataAggregatePageResponse =
            AgentDataAggregatePageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(agentDataAggregatePageResponse.items())
            .containsExactly(
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
            )
        assertThat(agentDataAggregatePageResponse.nextPageToken()).contains("next_page_token")
        assertThat(agentDataAggregatePageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentDataAggregatePageResponse =
            AgentDataAggregatePageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedAgentDataAggregatePageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentDataAggregatePageResponse),
                jacksonTypeRef<AgentDataAggregatePageResponse>(),
            )

        assertThat(roundtrippedAgentDataAggregatePageResponse)
            .isEqualTo(agentDataAggregatePageResponse)
    }
}
