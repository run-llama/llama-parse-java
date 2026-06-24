// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.retrievers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.pipelines.MetadataFilters
import com.llamacloud_prod.api.models.pipelines.PresetRetrievalParams
import com.llamacloud_prod.api.models.pipelines.RetrievalMode
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrieverTest {

    @Test
    fun create() {
        val retriever =
            Retriever.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addPipeline(
                    RetrieverPipeline.builder()
                        .description("description")
                        .name("x")
                        .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .presetRetrievalParameters(
                            PresetRetrievalParams.builder()
                                .alpha(0.0)
                                .className("class_name")
                                .denseSimilarityCutoff(0.0)
                                .denseSimilarityTopK(1L)
                                .enableReranking(true)
                                .filesTopK(1L)
                                .rerankTopN(1L)
                                .retrievalMode(RetrievalMode.AUTO_ROUTED)
                                .retrieveImageNodes(true)
                                .retrievePageFigureNodes(true)
                                .retrievePageScreenshotNodes(true)
                                .searchFilters(
                                    MetadataFilters.builder()
                                        .addFilter(
                                            MetadataFilters.Filter.MetadataFilter.builder()
                                                .key("key")
                                                .value(0.0)
                                                .operator(
                                                    MetadataFilters.Filter.MetadataFilter.Operator
                                                        .NOT_EQUALS
                                                )
                                                .build()
                                        )
                                        .condition(MetadataFilters.Condition.AND)
                                        .build()
                                )
                                .searchFiltersInferenceSchema(
                                    PresetRetrievalParams.SearchFiltersInferenceSchema.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .sparseSimilarityTopK(1L)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(retriever.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(retriever.name()).isEqualTo("x")
        assertThat(retriever.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(retriever.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(retriever.pipelines().getOrNull())
            .containsExactly(
                RetrieverPipeline.builder()
                    .description("description")
                    .name("x")
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .presetRetrievalParameters(
                        PresetRetrievalParams.builder()
                            .alpha(0.0)
                            .className("class_name")
                            .denseSimilarityCutoff(0.0)
                            .denseSimilarityTopK(1L)
                            .enableReranking(true)
                            .filesTopK(1L)
                            .rerankTopN(1L)
                            .retrievalMode(RetrievalMode.AUTO_ROUTED)
                            .retrieveImageNodes(true)
                            .retrievePageFigureNodes(true)
                            .retrievePageScreenshotNodes(true)
                            .searchFilters(
                                MetadataFilters.builder()
                                    .addFilter(
                                        MetadataFilters.Filter.MetadataFilter.builder()
                                            .key("key")
                                            .value(0.0)
                                            .operator(
                                                MetadataFilters.Filter.MetadataFilter.Operator
                                                    .NOT_EQUALS
                                            )
                                            .build()
                                    )
                                    .condition(MetadataFilters.Condition.AND)
                                    .build()
                            )
                            .searchFiltersInferenceSchema(
                                PresetRetrievalParams.SearchFiltersInferenceSchema.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .sparseSimilarityTopK(1L)
                            .build()
                    )
                    .build()
            )
        assertThat(retriever.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retriever =
            Retriever.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addPipeline(
                    RetrieverPipeline.builder()
                        .description("description")
                        .name("x")
                        .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .presetRetrievalParameters(
                            PresetRetrievalParams.builder()
                                .alpha(0.0)
                                .className("class_name")
                                .denseSimilarityCutoff(0.0)
                                .denseSimilarityTopK(1L)
                                .enableReranking(true)
                                .filesTopK(1L)
                                .rerankTopN(1L)
                                .retrievalMode(RetrievalMode.AUTO_ROUTED)
                                .retrieveImageNodes(true)
                                .retrievePageFigureNodes(true)
                                .retrievePageScreenshotNodes(true)
                                .searchFilters(
                                    MetadataFilters.builder()
                                        .addFilter(
                                            MetadataFilters.Filter.MetadataFilter.builder()
                                                .key("key")
                                                .value(0.0)
                                                .operator(
                                                    MetadataFilters.Filter.MetadataFilter.Operator
                                                        .NOT_EQUALS
                                                )
                                                .build()
                                        )
                                        .condition(MetadataFilters.Condition.AND)
                                        .build()
                                )
                                .searchFiltersInferenceSchema(
                                    PresetRetrievalParams.SearchFiltersInferenceSchema.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .sparseSimilarityTopK(1L)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRetriever =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retriever),
                jacksonTypeRef<Retriever>(),
            )

        assertThat(roundtrippedRetriever).isEqualTo(retriever)
    }
}
