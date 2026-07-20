// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.pipelines

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.pipelines.files.FileCreateParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileDeleteParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileGetStatusCountsParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.pipelines().files()

        val pipelineFilesFuture =
            fileServiceAsync.create(
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

        val pipelineFiles = pipelineFilesFuture.get()
        pipelineFiles.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.pipelines().files()

        val pipelineFileFuture =
            fileServiceAsync.update(
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

        val pipelineFile = pipelineFileFuture.get()
        pipelineFile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.pipelines().files()

        val pageFuture = fileServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.pipelines().files()

        val future =
            fileServiceAsync.delete(
                FileDeleteParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.pipelines().files()

        val managedIngestionStatusResponseFuture =
            fileServiceAsync.getStatus(
                FileGetStatusParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val managedIngestionStatusResponse = managedIngestionStatusResponseFuture.get()
        managedIngestionStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatusCounts() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.pipelines().files()

        val responseFuture =
            fileServiceAsync.getStatusCounts(
                FileGetStatusCountsParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .onlyManuallyUploaded(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
