// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataAggregateParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataCreateParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataDeleteByQueryParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataDeleteParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataGetParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataSearchParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentDataServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentDataServiceAsync = client.beta().agentData()

        val agentDataFuture =
            agentDataServiceAsync.create(
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
            )

        val agentData = agentDataFuture.get()
        agentData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentDataServiceAsync = client.beta().agentData()

        val agentDataFuture =
            agentDataServiceAsync.update(
                AgentDataUpdateParams.builder()
                    .itemId("item_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .data(
                        AgentDataUpdateParams.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val agentData = agentDataFuture.get()
        agentData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentDataServiceAsync = client.beta().agentData()

        val agentDataFuture =
            agentDataServiceAsync.delete(
                AgentDataDeleteParams.builder()
                    .itemId("item_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val agentData = agentDataFuture.get()
        agentData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun aggregate() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentDataServiceAsync = client.beta().agentData()

        val pageFuture =
            agentDataServiceAsync.aggregate(
                AgentDataAggregateParams.builder().deploymentName("deployment_name").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByQuery() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentDataServiceAsync = client.beta().agentData()

        val responseFuture =
            agentDataServiceAsync.deleteByQuery(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentDataServiceAsync = client.beta().agentData()

        val agentDataFuture =
            agentDataServiceAsync.get(
                AgentDataGetParams.builder()
                    .itemId("item_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val agentData = agentDataFuture.get()
        agentData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentDataServiceAsync = client.beta().agentData()

        val pageFuture =
            agentDataServiceAsync.search(
                AgentDataSearchParams.builder().deploymentName("deployment_name").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
