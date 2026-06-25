// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.models.beta.indexes.IndexCreateParams
import com.llamacloud_prod.api.models.beta.indexes.IndexDeleteParams
import com.llamacloud_prod.api.models.beta.indexes.IndexGetParams
import com.llamacloud_prod.api.models.beta.indexes.IndexSyncParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IndexServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val indexService = client.beta().indexes()

        val index =
            indexService.create(
                IndexCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sourceDirectoryId("dir-abc123")
                    .description("description")
                    .name("name")
                    .addProduct(
                        IndexCreateParams.Product.builder()
                            .productConfigId("cfg-abc123")
                            .productType("parse")
                            .build()
                    )
                    .addStoreAttachment("screenshots")
                    .syncFrequency("manual")
                    .vectorTarget(IndexCreateParams.VectorTarget.DEFAULT)
                    .build()
            )

        index.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val indexService = client.beta().indexes()

        val page = indexService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val indexService = client.beta().indexes()

        indexService.delete(
            IndexDeleteParams.builder()
                .indexId("index_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val indexService = client.beta().indexes()

        val index =
            indexService.get(
                IndexGetParams.builder()
                    .indexId("index_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        index.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sync() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val indexService = client.beta().indexes()

        val response =
            indexService.sync(
                IndexSyncParams.builder()
                    .indexId("index_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
