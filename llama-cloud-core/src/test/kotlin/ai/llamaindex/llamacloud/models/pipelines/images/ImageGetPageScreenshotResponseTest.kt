// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.images

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageGetPageScreenshotResponseTest {

    @Test
    fun create() {
        val imageGetPageScreenshotResponse = ImageGetPageScreenshotResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val imageGetPageScreenshotResponse = ImageGetPageScreenshotResponse.builder().build()

        val roundtrippedImageGetPageScreenshotResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(imageGetPageScreenshotResponse),
                jacksonTypeRef<ImageGetPageScreenshotResponse>(),
            )

        assertThat(roundtrippedImageGetPageScreenshotResponse)
            .isEqualTo(imageGetPageScreenshotResponse)
    }
}
