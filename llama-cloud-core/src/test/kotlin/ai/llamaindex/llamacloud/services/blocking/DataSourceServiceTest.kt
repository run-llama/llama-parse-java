// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.datasources.DataSourceCreateParams
import ai.llamaindex.llamacloud.models.datasources.DataSourceListParams
import ai.llamaindex.llamacloud.models.datasources.DataSourceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DataSourceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSourceService = client.dataSources()

        val dataSource =
            dataSourceService.create(
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

        dataSource.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSourceService = client.dataSources()

        val dataSource =
            dataSourceService.update(
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

        dataSource.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSourceService = client.dataSources()

        val dataSources =
            dataSourceService.list(
                DataSourceListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        dataSources.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSourceService = client.dataSources()

        dataSourceService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSourceService = client.dataSources()

        val dataSource = dataSourceService.get("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dataSource.validate()
    }
}
