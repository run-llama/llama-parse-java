// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.indexes.IndexCancelSyncParams
import ai.llamaindex.llamacloud.models.indexes.IndexCreateParams
import ai.llamaindex.llamacloud.models.indexes.IndexDeleteParams
import ai.llamaindex.llamacloud.models.indexes.IndexGetParams
import ai.llamaindex.llamacloud.models.indexes.IndexSyncParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IndexServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val indexServiceAsync = client.indexes()

        val indexFuture =
            indexServiceAsync.create(
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

        val index = indexFuture.get()
        index.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val indexServiceAsync = client.indexes()

        val pageFuture = indexServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val indexServiceAsync = client.indexes()

        val future =
            indexServiceAsync.delete(
                IndexDeleteParams.builder()
                    .indexId("index_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelSync() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val indexServiceAsync = client.indexes()

        val responseFuture =
            indexServiceAsync.cancelSync(
                IndexCancelSyncParams.builder()
                    .indexId("index_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val indexServiceAsync = client.indexes()

        val indexFuture =
            indexServiceAsync.get(
                IndexGetParams.builder()
                    .indexId("index_id")
                    .addExpand(IndexGetParams.Expand.SYNC_IN_PROGRESS)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val index = indexFuture.get()
        index.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sync() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val indexServiceAsync = client.indexes()

        val responseFuture =
            indexServiceAsync.sync(
                IndexSyncParams.builder()
                    .indexId("index_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
