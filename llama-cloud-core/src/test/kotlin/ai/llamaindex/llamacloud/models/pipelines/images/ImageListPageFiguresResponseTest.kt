// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.images

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageListPageFiguresResponseTest {

    @Test
    fun create() {
        val imageListPageFiguresResponse =
            ImageListPageFiguresResponse.builder()
                .confidence(0.0)
                .figureName("figure_name")
                .figureSize(0L)
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageIndex(0L)
                .isLikelyNoise(true)
                .metadata(
                    ImageListPageFiguresResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(imageListPageFiguresResponse.confidence()).isEqualTo(0.0)
        assertThat(imageListPageFiguresResponse.figureName()).isEqualTo("figure_name")
        assertThat(imageListPageFiguresResponse.figureSize()).isEqualTo(0L)
        assertThat(imageListPageFiguresResponse.fileId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(imageListPageFiguresResponse.pageIndex()).isEqualTo(0L)
        assertThat(imageListPageFiguresResponse.isLikelyNoise()).contains(true)
        assertThat(imageListPageFiguresResponse.metadata())
            .contains(
                ImageListPageFiguresResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val imageListPageFiguresResponse =
            ImageListPageFiguresResponse.builder()
                .confidence(0.0)
                .figureName("figure_name")
                .figureSize(0L)
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageIndex(0L)
                .isLikelyNoise(true)
                .metadata(
                    ImageListPageFiguresResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedImageListPageFiguresResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(imageListPageFiguresResponse),
                jacksonTypeRef<ImageListPageFiguresResponse>(),
            )

        assertThat(roundtrippedImageListPageFiguresResponse).isEqualTo(imageListPageFiguresResponse)
    }
}
