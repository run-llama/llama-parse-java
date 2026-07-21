// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.agentdata

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDataTest {

    @Test
    fun create() {
        val agentData =
            AgentData.builder()
                .data(
                    AgentData.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .deploymentName("deployment_name")
                .id("id")
                .collection("collection")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .projectId("project_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(agentData.data())
            .isEqualTo(
                AgentData.Data.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(agentData.deploymentName()).isEqualTo("deployment_name")
        assertThat(agentData.id()).contains("id")
        assertThat(agentData.collection()).contains("collection")
        assertThat(agentData.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentData.projectId()).contains("project_id")
        assertThat(agentData.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentData =
            AgentData.builder()
                .data(
                    AgentData.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .deploymentName("deployment_name")
                .id("id")
                .collection("collection")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .projectId("project_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAgentData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentData),
                jacksonTypeRef<AgentData>(),
            )

        assertThat(roundtrippedAgentData).isEqualTo(agentData)
    }
}
