// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.images

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageGetPageFigureResponseTest {

    @Test
    fun create() {
        val imageGetPageFigureResponse = ImageGetPageFigureResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val imageGetPageFigureResponse = ImageGetPageFigureResponse.builder().build()

        val roundtrippedImageGetPageFigureResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(imageGetPageFigureResponse),
                jacksonTypeRef<ImageGetPageFigureResponse>(),
            )

        assertThat(roundtrippedImageGetPageFigureResponse).isEqualTo(imageGetPageFigureResponse)
    }
}
