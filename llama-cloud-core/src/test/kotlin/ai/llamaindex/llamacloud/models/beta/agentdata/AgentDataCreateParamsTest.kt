// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.agentdata

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDataCreateParamsTest {

    @Test
    fun create() {
        AgentDataCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .data(
                AgentDataCreateParams.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .deploymentName("deployment_name")
            .collection("collection")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AgentDataCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .data(
                    AgentDataCreateParams.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .deploymentName("deployment_name")
                .collection("collection")
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
            AgentDataCreateParams.builder()
                .data(
                    AgentDataCreateParams.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .deploymentName("deployment_name")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            AgentDataCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .data(
                    AgentDataCreateParams.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .deploymentName("deployment_name")
                .collection("collection")
                .build()

        val body = params._body()

        assertThat(body.data())
            .isEqualTo(
                AgentDataCreateParams.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.deploymentName()).isEqualTo("deployment_name")
        assertThat(body.collection()).contains("collection")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentDataCreateParams.builder()
                .data(
                    AgentDataCreateParams.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .deploymentName("deployment_name")
                .build()

        val body = params._body()

        assertThat(body.data())
            .isEqualTo(
                AgentDataCreateParams.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.deploymentName()).isEqualTo("deployment_name")
    }
}
