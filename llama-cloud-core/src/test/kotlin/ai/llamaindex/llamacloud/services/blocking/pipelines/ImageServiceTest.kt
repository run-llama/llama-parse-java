// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.models.pipelines.images.ImageGetPageFigureParams
import ai.llamaindex.llamacloud.models.pipelines.images.ImageGetPageScreenshotParams
import ai.llamaindex.llamacloud.models.pipelines.images.ImageListPageFiguresParams
import ai.llamaindex.llamacloud.models.pipelines.images.ImageListPageScreenshotsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ImageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPageFigure() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val imageService = client.pipelines().images()

        val response =
            imageService.getPageFigure(
                ImageGetPageFigureParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageIndex(0L)
                    .figureName("figure_name")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPageScreenshot() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val imageService = client.pipelines().images()

        val response =
            imageService.getPageScreenshot(
                ImageGetPageScreenshotParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageIndex(0L)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPageFigures() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val imageService = client.pipelines().images()

        val response =
            imageService.listPageFigures(
                ImageListPageFiguresParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPageScreenshots() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val imageService = client.pipelines().images()

        val response =
            imageService.listPageScreenshots(
                ImageListPageScreenshotsParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.forEach { it.validate() }
    }
}
