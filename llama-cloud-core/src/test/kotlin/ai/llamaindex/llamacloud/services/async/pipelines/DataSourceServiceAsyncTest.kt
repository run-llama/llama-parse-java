// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.pipelines

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceSyncParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceUpdateDataSourcesParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DataSourceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSourceServiceAsync = client.pipelines().dataSources()

        val pipelineDataSourceFuture =
            dataSourceServiceAsync.update(
                DataSourceUpdateParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .syncInterval(0.0)
                    .build()
            )

        val pipelineDataSource = pipelineDataSourceFuture.get()
        pipelineDataSource.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDataSources() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSourceServiceAsync = client.pipelines().dataSources()

        val pipelineDataSourcesFuture =
            dataSourceServiceAsync.getDataSources("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val pipelineDataSources = pipelineDataSourcesFuture.get()
        pipelineDataSources.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSourceServiceAsync = client.pipelines().dataSources()

        val managedIngestionStatusResponseFuture =
            dataSourceServiceAsync.getStatus(
                DataSourceGetStatusParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val managedIngestionStatusResponse = managedIngestionStatusResponseFuture.get()
        managedIngestionStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sync() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSourceServiceAsync = client.pipelines().dataSources()

        val pipelineFuture =
            dataSourceServiceAsync.sync(
                DataSourceSyncParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPipelineFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateDataSources() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dataSourceServiceAsync = client.pipelines().dataSources()

        val pipelineDataSourcesFuture =
            dataSourceServiceAsync.updateDataSources(
                DataSourceUpdateDataSourcesParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBody(
                        DataSourceUpdateDataSourcesParams.Body.builder()
                            .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .syncInterval(0.0)
                            .build()
                    )
                    .build()
            )

        val pipelineDataSources = pipelineDataSourcesFuture.get()
        pipelineDataSources.forEach { it.validate() }
    }
}
