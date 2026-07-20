// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.agentdata

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDataDeleteByQueryResponseTest {

    @Test
    fun create() {
        val agentDataDeleteByQueryResponse =
            AgentDataDeleteByQueryResponse.builder().deletedCount(0L).build()

        assertThat(agentDataDeleteByQueryResponse.deletedCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentDataDeleteByQueryResponse =
            AgentDataDeleteByQueryResponse.builder().deletedCount(0L).build()

        val roundtrippedAgentDataDeleteByQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentDataDeleteByQueryResponse),
                jacksonTypeRef<AgentDataDeleteByQueryResponse>(),
            )

        assertThat(roundtrippedAgentDataDeleteByQueryResponse)
            .isEqualTo(agentDataDeleteByQueryResponse)
    }
}
