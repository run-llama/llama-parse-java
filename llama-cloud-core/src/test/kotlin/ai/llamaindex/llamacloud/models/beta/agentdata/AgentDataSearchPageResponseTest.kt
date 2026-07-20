// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.agentdata

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDataSearchPageResponseTest {

    @Test
    fun create() {
        val agentDataSearchPageResponse =
            AgentDataSearchPageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(agentDataSearchPageResponse.items())
            .containsExactly(
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
            )
        assertThat(agentDataSearchPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(agentDataSearchPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentDataSearchPageResponse =
            AgentDataSearchPageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedAgentDataSearchPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentDataSearchPageResponse),
                jacksonTypeRef<AgentDataSearchPageResponse>(),
            )

        assertThat(roundtrippedAgentDataSearchPageResponse).isEqualTo(agentDataSearchPageResponse)
    }
}
