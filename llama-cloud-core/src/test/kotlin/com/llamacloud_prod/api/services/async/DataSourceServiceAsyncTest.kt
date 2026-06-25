// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.datasources.DataSourceCreateParams
import com.llamacloud_prod.api.models.datasources.DataSourceListParams
import com.llamacloud_prod.api.models.datasources.DataSourceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DataSourceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSourceServiceAsync = client.dataSources()

        val dataSourceFuture =
            dataSourceServiceAsync.create(
                DataSourceCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .component(
                        DataSourceCreateParams.Component.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .sourceType(DataSourceCreateParams.SourceType.AZURE_STORAGE_BLOB)
                    .customMetadata(
                        DataSourceCreateParams.CustomMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .build()
            )

        val dataSource = dataSourceFuture.get()
        dataSource.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSourceServiceAsync = client.dataSources()

        val dataSourceFuture =
            dataSourceServiceAsync.update(
                DataSourceUpdateParams.builder()
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sourceType(DataSourceUpdateParams.SourceType.AZURE_STORAGE_BLOB)
                    .component(
                        DataSourceUpdateParams.Component.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .customMetadata(
                        DataSourceUpdateParams.CustomMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val dataSource = dataSourceFuture.get()
        dataSource.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSourceServiceAsync = client.dataSources()

        val dataSourcesFuture =
            dataSourceServiceAsync.list(
                DataSourceListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val dataSources = dataSourcesFuture.get()
        dataSources.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSourceServiceAsync = client.dataSources()

        val future = dataSourceServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSourceServiceAsync = client.dataSources()

        val dataSourceFuture = dataSourceServiceAsync.get("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dataSource = dataSourceFuture.get()
        dataSource.validate()
    }
}
