// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.agentdata

import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDataAggregateParamsTest {

    @Test
    fun create() {
        AgentDataAggregateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .deploymentName("deployment_name")
            .collection("collection")
            .count(true)
            .filter(
                AgentDataAggregateParams.Filter.builder()
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
            .first(true)
            .addGroupBy("string")
            .offset(0L)
            .orderBy("order_by")
            .pageSize(0L)
            .pageToken("page_token")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AgentDataAggregateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .deploymentName("deployment_name")
                .collection("collection")
                .count(true)
                .filter(
                    AgentDataAggregateParams.Filter.builder()
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
                .first(true)
                .addGroupBy("string")
                .offset(0L)
                .orderBy("order_by")
                .pageSize(0L)
                .pageToken("page_token")
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
        val params = AgentDataAggregateParams.builder().deploymentName("deployment_name").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            AgentDataAggregateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .deploymentName("deployment_name")
                .collection("collection")
                .count(true)
                .filter(
                    AgentDataAggregateParams.Filter.builder()
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
                .first(true)
                .addGroupBy("string")
                .offset(0L)
                .orderBy("order_by")
                .pageSize(0L)
                .pageToken("page_token")
                .build()

        val body = params._body()

        assertThat(body.deploymentName()).isEqualTo("deployment_name")
        assertThat(body.collection()).contains("collection")
        assertThat(body.count()).contains(true)
        assertThat(body.filter())
            .contains(
                AgentDataAggregateParams.Filter.builder()
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
        assertThat(body.first()).contains(true)
        assertThat(body.groupBy().getOrNull()).containsExactly("string")
        assertThat(body.offset()).contains(0L)
        assertThat(body.orderBy()).contains("order_by")
        assertThat(body.pageSize()).contains(0L)
        assertThat(body.pageToken()).contains("page_token")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentDataAggregateParams.builder().deploymentName("deployment_name").build()

        val body = params._body()

        assertThat(body.deploymentName()).isEqualTo("deployment_name")
    }
}
