// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.pipelines.documents.TextNode
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineRetrieveResponseTest {

    @Test
    fun create() {
        val pipelineRetrieveResponse =
            PipelineRetrieveResponse.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addRetrievalNode(
                    PipelineRetrieveResponse.RetrievalNode.builder()
                        .node(
                            TextNode.builder()
                                .className("class_name")
                                .addEmbedding(0.0)
                                .endCharIdx(0L)
                                .addExcludedEmbedMetadataKey("string")
                                .addExcludedLlmMetadataKey("string")
                                .extraInfo(
                                    TextNode.ExtraInfo.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .id("id_")
                                .metadataSeperator("metadata_seperator")
                                .metadataTemplate("metadata_template")
                                .mimetype("mimetype")
                                .relationships(
                                    TextNode.Relationships.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                mapOf(
                                                    "node_id" to "node_id",
                                                    "class_name" to "class_name",
                                                    "hash" to "hash",
                                                    "metadata" to mapOf("foo" to "bar"),
                                                    "node_type" to "1",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .startCharIdx(0L)
                                .text("text")
                                .textTemplate("text_template")
                                .build()
                        )
                        .className("class_name")
                        .score(0.0)
                        .build()
                )
                .className("class_name")
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
                .inferredSearchFilters(
                    MetadataFilters.builder()
                        .addFilter(
                            MetadataFilters.Filter.MetadataFilter.builder()
                                .key("key")
                                .value(0.0)
                                .operator(MetadataFilters.Filter.MetadataFilter.Operator.NOT_EQUALS)
                                .build()
                        )
                        .condition(MetadataFilters.Condition.AND)
                        .build()
                )
                .metadata(
                    PipelineRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
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
                .retrievalLatency(
                    PipelineRetrieveResponse.RetrievalLatency.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        assertThat(pipelineRetrieveResponse.pipelineId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pipelineRetrieveResponse.retrievalNodes())
            .containsExactly(
                PipelineRetrieveResponse.RetrievalNode.builder()
                    .node(
                        TextNode.builder()
                            .className("class_name")
                            .addEmbedding(0.0)
                            .endCharIdx(0L)
                            .addExcludedEmbedMetadataKey("string")
                            .addExcludedLlmMetadataKey("string")
                            .extraInfo(
                                TextNode.ExtraInfo.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .id("id_")
                            .metadataSeperator("metadata_seperator")
                            .metadataTemplate("metadata_template")
                            .mimetype("mimetype")
                            .relationships(
                                TextNode.Relationships.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "node_id" to "node_id",
                                                "class_name" to "class_name",
                                                "hash" to "hash",
                                                "metadata" to mapOf("foo" to "bar"),
                                                "node_type" to "1",
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .startCharIdx(0L)
                            .text("text")
                            .textTemplate("text_template")
                            .build()
                    )
                    .className("class_name")
                    .score(0.0)
                    .build()
            )
        assertThat(pipelineRetrieveResponse.className()).contains("class_name")
        assertThat(pipelineRetrieveResponse.imageNodes().getOrNull())
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
        assertThat(pipelineRetrieveResponse.inferredSearchFilters())
            .contains(
                MetadataFilters.builder()
                    .addFilter(
                        MetadataFilters.Filter.MetadataFilter.builder()
                            .key("key")
                            .value(0.0)
                            .operator(MetadataFilters.Filter.MetadataFilter.Operator.NOT_EQUALS)
                            .build()
                    )
                    .condition(MetadataFilters.Condition.AND)
                    .build()
            )
        assertThat(pipelineRetrieveResponse.metadata())
            .contains(
                PipelineRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(pipelineRetrieveResponse.pageFigureNodes().getOrNull())
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
        assertThat(pipelineRetrieveResponse.retrievalLatency())
            .contains(
                PipelineRetrieveResponse.RetrievalLatency.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineRetrieveResponse =
            PipelineRetrieveResponse.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addRetrievalNode(
                    PipelineRetrieveResponse.RetrievalNode.builder()
                        .node(
                            TextNode.builder()
                                .className("class_name")
                                .addEmbedding(0.0)
                                .endCharIdx(0L)
                                .addExcludedEmbedMetadataKey("string")
                                .addExcludedLlmMetadataKey("string")
                                .extraInfo(
                                    TextNode.ExtraInfo.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .id("id_")
                                .metadataSeperator("metadata_seperator")
                                .metadataTemplate("metadata_template")
                                .mimetype("mimetype")
                                .relationships(
                                    TextNode.Relationships.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                mapOf(
                                                    "node_id" to "node_id",
                                                    "class_name" to "class_name",
                                                    "hash" to "hash",
                                                    "metadata" to mapOf("foo" to "bar"),
                                                    "node_type" to "1",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .startCharIdx(0L)
                                .text("text")
                                .textTemplate("text_template")
                                .build()
                        )
                        .className("class_name")
                        .score(0.0)
                        .build()
                )
                .className("class_name")
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
                .inferredSearchFilters(
                    MetadataFilters.builder()
                        .addFilter(
                            MetadataFilters.Filter.MetadataFilter.builder()
                                .key("key")
                                .value(0.0)
                                .operator(MetadataFilters.Filter.MetadataFilter.Operator.NOT_EQUALS)
                                .build()
                        )
                        .condition(MetadataFilters.Condition.AND)
                        .build()
                )
                .metadata(
                    PipelineRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
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
                .retrievalLatency(
                    PipelineRetrieveResponse.RetrievalLatency.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        val roundtrippedPipelineRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineRetrieveResponse),
                jacksonTypeRef<PipelineRetrieveResponse>(),
            )

        assertThat(roundtrippedPipelineRetrieveResponse).isEqualTo(pipelineRetrieveResponse)
    }
}
