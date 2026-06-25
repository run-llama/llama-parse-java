// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.agentdata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDataDeleteResponseTest {

    @Test
    fun create() {
        val agentDataDeleteResponse =
            AgentDataDeleteResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentDataDeleteResponse =
            AgentDataDeleteResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()

        val roundtrippedAgentDataDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentDataDeleteResponse),
                jacksonTypeRef<AgentDataDeleteResponse>(),
            )

        assertThat(roundtrippedAgentDataDeleteResponse).isEqualTo(agentDataDeleteResponse)
    }
}
