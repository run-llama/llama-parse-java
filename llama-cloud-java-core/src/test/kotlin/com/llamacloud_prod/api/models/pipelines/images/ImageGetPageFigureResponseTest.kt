// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.images

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
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
