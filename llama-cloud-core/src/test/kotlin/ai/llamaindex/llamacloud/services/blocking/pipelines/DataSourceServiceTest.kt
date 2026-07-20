// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceSyncParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceUpdateDataSourcesParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DataSourceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSourceService = client.pipelines().dataSources()

        val pipelineDataSource =
            dataSourceService.update(
                DataSourceUpdateParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .syncInterval(0.0)
                    .build()
            )

        pipelineDataSource.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDataSources() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSourceService = client.pipelines().dataSources()

        val pipelineDataSources =
            dataSourceService.getDataSources("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        pipelineDataSources.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSourceService = client.pipelines().dataSources()

        val managedIngestionStatusResponse =
            dataSourceService.getStatus(
                DataSourceGetStatusParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        managedIngestionStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sync() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSourceService = client.pipelines().dataSources()

        val pipeline =
            dataSourceService.sync(
                DataSourceSyncParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPipelineFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateDataSources() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSourceService = client.pipelines().dataSources()

        val pipelineDataSources =
            dataSourceService.updateDataSources(
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

        pipelineDataSources.forEach { it.validate() }
    }
}
