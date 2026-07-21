// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.pipelines.files.FileCreateParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileDeleteParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileGetStatusCountsParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.pipelines().files()

        val pipelineFiles =
            fileService.create(
                FileCreateParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBody(
                        FileCreateParams.Body.builder()
                            .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .customMetadata(
                                FileCreateParams.Body.CustomMetadata.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        pipelineFiles.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.pipelines().files()

        val pipelineFile =
            fileService.update(
                FileUpdateParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customMetadata(
                        FileUpdateParams.CustomMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .build()
            )

        pipelineFile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.pipelines().files()

        val page = fileService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.pipelines().files()

        fileService.delete(
            FileDeleteParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.pipelines().files()

        val managedIngestionStatusResponse =
            fileService.getStatus(
                FileGetStatusParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        managedIngestionStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatusCounts() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.pipelines().files()

        val response =
            fileService.getStatusCounts(
                FileGetStatusCountsParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .onlyManuallyUploaded(true)
                    .build()
            )

        response.validate()
    }
}
