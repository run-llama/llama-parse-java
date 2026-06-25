// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.images

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageListPageScreenshotsResponseTest {

    @Test
    fun create() {
        val imageListPageScreenshotsResponse =
            ImageListPageScreenshotsResponse.builder()
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .imageSize(0L)
                .pageIndex(0L)
                .metadata(
                    ImageListPageScreenshotsResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(imageListPageScreenshotsResponse.fileId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(imageListPageScreenshotsResponse.imageSize()).isEqualTo(0L)
        assertThat(imageListPageScreenshotsResponse.pageIndex()).isEqualTo(0L)
        assertThat(imageListPageScreenshotsResponse.metadata())
            .contains(
                ImageListPageScreenshotsResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val imageListPageScreenshotsResponse =
            ImageListPageScreenshotsResponse.builder()
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .imageSize(0L)
                .pageIndex(0L)
                .metadata(
                    ImageListPageScreenshotsResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedImageListPageScreenshotsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(imageListPageScreenshotsResponse),
                jacksonTypeRef<ImageListPageScreenshotsResponse>(),
            )

        assertThat(roundtrippedImageListPageScreenshotsResponse)
            .isEqualTo(imageListPageScreenshotsResponse)
    }
}
