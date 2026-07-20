// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.agentdata

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDataDeleteByQueryParamsTest {

    @Test
    fun create() {
        AgentDataDeleteByQueryParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .deploymentName("deployment_name")
            .collection("collection")
            .filter(
                AgentDataDeleteByQueryParams.Filter.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "eq" to 0,
                                "excludes" to listOf(0),
                                "gt" to 0,
                                "gte" to 0,
                                "includes" to listOf(0),
                                "lt" to 0,
                                "lte" to 0,
                                "ne" to 0,
                            )
                        ),
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AgentDataDeleteByQueryParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .deploymentName("deployment_name")
                .collection("collection")
                .filter(
                    AgentDataDeleteByQueryParams.Filter.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "eq" to 0,
                                    "excludes" to listOf(0),
                                    "gt" to 0,
                                    "gte" to 0,
                                    "includes" to listOf(0),
                                    "lt" to 0,
                                    "lte" to 0,
                                    "ne" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AgentDataDeleteByQueryParams.builder().deploymentName("deployment_name").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            AgentDataDeleteByQueryParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .deploymentName("deployment_name")
                .collection("collection")
                .filter(
                    AgentDataDeleteByQueryParams.Filter.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "eq" to 0,
                                    "excludes" to listOf(0),
                                    "gt" to 0,
                                    "gte" to 0,
                                    "includes" to listOf(0),
                                    "lt" to 0,
                                    "lte" to 0,
                                    "ne" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.deploymentName()).isEqualTo("deployment_name")
        assertThat(body.collection()).contains("collection")
        assertThat(body.filter())
            .contains(
                AgentDataDeleteByQueryParams.Filter.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "eq" to 0,
                                "excludes" to listOf(0),
                                "gt" to 0,
                                "gte" to 0,
                                "includes" to listOf(0),
                                "lt" to 0,
                                "lte" to 0,
                                "ne" to 0,
                            )
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentDataDeleteByQueryParams.builder().deploymentName("deployment_name").build()

        val body = params._body()

        assertThat(body.deploymentName()).isEqualTo("deployment_name")
    }
}
