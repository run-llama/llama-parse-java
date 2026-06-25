// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.retrievers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.pipelines.PageFigureNodeWithScore
import com.llamacloud_prod.api.models.pipelines.PageScreenshotNodeWithScore
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompositeRetrievalResultTest {

    @Test
    fun create() {
        val compositeRetrievalResult =
            CompositeRetrievalResult.builder()
                .addImageNode(
                    PageScreenshotNodeWithScore.builder()
                        .node(
                            PageScreenshotNodeWithScore.Node.builder()
                                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .imageSize(0L)
                                .pageIndex(0L)
                                .metadata(
                                    PageScreenshotNodeWithScore.Node.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .score(0.0)
                        .className("class_name")
                        .build()
                )
                .addNode(
                    CompositeRetrievalResult.Node.builder()
                        .node(
                            CompositeRetrievalResult.Node.InnerNode.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .endCharIdx(0L)
                                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .retrieverPipelineName("retriever_pipeline_name")
                                .startCharIdx(0L)
                                .text("text")
                                .metadata(
                                    CompositeRetrievalResult.Node.InnerNode.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .className("class_name")
                        .score(0.0)
                        .build()
                )
                .addPageFigureNode(
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
                )
                .build()

        assertThat(compositeRetrievalResult.imageNodes().getOrNull())
            .containsExactly(
                PageScreenshotNodeWithScore.builder()
                    .node(
                        PageScreenshotNodeWithScore.Node.builder()
                            .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .imageSize(0L)
                            .pageIndex(0L)
                            .metadata(
                                PageScreenshotNodeWithScore.Node.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .score(0.0)
                    .className("class_name")
                    .build()
            )
        assertThat(compositeRetrievalResult.nodes().getOrNull())
            .containsExactly(
                CompositeRetrievalResult.Node.builder()
                    .node(
                        CompositeRetrievalResult.Node.InnerNode.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .endCharIdx(0L)
                            .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .retrieverPipelineName("retriever_pipeline_name")
                            .startCharIdx(0L)
                            .text("text")
                            .metadata(
                                CompositeRetrievalResult.Node.InnerNode.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .className("class_name")
                    .score(0.0)
                    .build()
            )
        assertThat(compositeRetrievalResult.pageFigureNodes().getOrNull())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val compositeRetrievalResult =
            CompositeRetrievalResult.builder()
                .addImageNode(
                    PageScreenshotNodeWithScore.builder()
                        .node(
                            PageScreenshotNodeWithScore.Node.builder()
                                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .imageSize(0L)
                                .pageIndex(0L)
                                .metadata(
                                    PageScreenshotNodeWithScore.Node.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .score(0.0)
                        .className("class_name")
                        .build()
                )
                .addNode(
                    CompositeRetrievalResult.Node.builder()
                        .node(
                            CompositeRetrievalResult.Node.InnerNode.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .endCharIdx(0L)
                                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .retrieverPipelineName("retriever_pipeline_name")
                                .startCharIdx(0L)
                                .text("text")
                                .metadata(
                                    CompositeRetrievalResult.Node.InnerNode.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .className("class_name")
                        .score(0.0)
                        .build()
                )
                .addPageFigureNode(
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
                )
                .build()

        val roundtrippedCompositeRetrievalResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(compositeRetrievalResult),
                jacksonTypeRef<CompositeRetrievalResult>(),
            )

        assertThat(roundtrippedCompositeRetrievalResult).isEqualTo(compositeRetrievalResult)
    }
}
