// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.pipelines

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.pipelines.images.ImageGetPageFigureParams
import ai.llamaindex.llamacloud.models.pipelines.images.ImageGetPageScreenshotParams
import ai.llamaindex.llamacloud.models.pipelines.images.ImageListPageFiguresParams
import ai.llamaindex.llamacloud.models.pipelines.images.ImageListPageScreenshotsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ImageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPageFigure() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val imageServiceAsync = client.pipelines().images()

        val responseFuture =
            imageServiceAsync.getPageFigure(
                ImageGetPageFigureParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageIndex(0L)
                    .figureName("figure_name")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPageScreenshot() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val imageServiceAsync = client.pipelines().images()

        val responseFuture =
            imageServiceAsync.getPageScreenshot(
                ImageGetPageScreenshotParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageIndex(0L)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPageFigures() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val imageServiceAsync = client.pipelines().images()

        val responseFuture =
            imageServiceAsync.listPageFigures(
                ImageListPageFiguresParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPageScreenshots() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val imageServiceAsync = client.pipelines().images()

        val responseFuture =
            imageServiceAsync.listPageScreenshots(
                ImageListPageScreenshotsParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
