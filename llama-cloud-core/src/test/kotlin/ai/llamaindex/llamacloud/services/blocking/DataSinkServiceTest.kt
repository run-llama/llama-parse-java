// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.datasinks.DataSinkCreateParams
import ai.llamaindex.llamacloud.models.datasinks.DataSinkListParams
import ai.llamaindex.llamacloud.models.datasinks.DataSinkUpdateParams
import ai.llamaindex.llamacloud.models.pipelines.DataSinkCreate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DataSinkServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSinkService = client.dataSinks()

        val dataSink =
            dataSinkService.create(
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

        dataSink.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSinkService = client.dataSinks()

        val dataSink =
            dataSinkService.update(
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

        dataSink.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSinkService = client.dataSinks()

        val dataSinks =
            dataSinkService.list(
                DataSinkListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        dataSinks.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSinkService = client.dataSinks()

        dataSinkService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val dataSinkService = client.dataSinks()

        val dataSink = dataSinkService.get("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dataSink.validate()
    }
}
