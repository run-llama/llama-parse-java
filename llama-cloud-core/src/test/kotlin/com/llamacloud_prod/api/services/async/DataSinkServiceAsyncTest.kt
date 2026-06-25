// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.datasinks.DataSinkCreateParams
import com.llamacloud_prod.api.models.datasinks.DataSinkListParams
import com.llamacloud_prod.api.models.datasinks.DataSinkUpdateParams
import com.llamacloud_prod.api.models.pipelines.DataSinkCreate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DataSinkServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSinkServiceAsync = client.dataSinks()

        val dataSinkFuture =
            dataSinkServiceAsync.create(
                DataSinkCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSinkCreate(
                        DataSinkCreate.builder()
                            .component(
                                DataSinkCreate.Component.UnionMember0.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .name("name")
                            .sinkType(DataSinkCreate.SinkType.ASTRA_DB)
                            .build()
                    )
                    .build()
            )

        val dataSink = dataSinkFuture.get()
        dataSink.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSinkServiceAsync = client.dataSinks()

        val dataSinkFuture =
            dataSinkServiceAsync.update(
                DataSinkUpdateParams.builder()
                    .dataSinkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sinkType(DataSinkUpdateParams.SinkType.ASTRA_DB)
                    .component(
                        DataSinkUpdateParams.Component.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val dataSink = dataSinkFuture.get()
        dataSink.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSinkServiceAsync = client.dataSinks()

        val dataSinksFuture =
            dataSinkServiceAsync.list(
                DataSinkListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val dataSinks = dataSinksFuture.get()
        dataSinks.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSinkServiceAsync = client.dataSinks()

        val future = dataSinkServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSinkServiceAsync = client.dataSinks()

        val dataSinkFuture = dataSinkServiceAsync.get("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dataSink = dataSinkFuture.get()
        dataSink.validate()
    }
}
