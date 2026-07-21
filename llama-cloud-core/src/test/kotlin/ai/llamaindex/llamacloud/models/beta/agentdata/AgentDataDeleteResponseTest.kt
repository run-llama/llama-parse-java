// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.agentdata

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
