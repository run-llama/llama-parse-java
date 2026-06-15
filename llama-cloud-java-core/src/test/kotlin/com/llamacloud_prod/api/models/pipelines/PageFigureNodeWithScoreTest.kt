// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PageFigureNodeWithScoreTest {

    @Test
    fun create() {
        val pageFigureNodeWithScore =
            PageFigureNodeWithScore.builder()
                .node(
                    PageFigureNodeWithScore.Node.builder()
                        .confidence(0.0)
                        .figureName("figure_name")
                        .figureSize(0L)
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pageIndex(0L)
                        .isLikelyNoise(true)
                        .metadata(
                            PageFigureNodeWithScore.Node.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .score(0.0)
                .className("class_name")
                .build()

        assertThat(pageFigureNodeWithScore.node())
            .isEqualTo(
                PageFigureNodeWithScore.Node.builder()
                    .confidence(0.0)
                    .figureName("figure_name")
                    .figureSize(0L)
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageIndex(0L)
                    .isLikelyNoise(true)
                    .metadata(
                        PageFigureNodeWithScore.Node.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(pageFigureNodeWithScore.score()).isEqualTo(0.0)
        assertThat(pageFigureNodeWithScore.className()).contains("class_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pageFigureNodeWithScore =
            PageFigureNodeWithScore.builder()
                .node(
                    PageFigureNodeWithScore.Node.builder()
                        .confidence(0.0)
                        .figureName("figure_name")
                        .figureSize(0L)
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pageIndex(0L)
                        .isLikelyNoise(true)
                        .metadata(
                            PageFigureNodeWithScore.Node.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .score(0.0)
                .className("class_name")
                .build()

        val roundtrippedPageFigureNodeWithScore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pageFigureNodeWithScore),
                jacksonTypeRef<PageFigureNodeWithScore>(),
            )

        assertThat(roundtrippedPageFigureNodeWithScore).isEqualTo(pageFigureNodeWithScore)
    }
}
