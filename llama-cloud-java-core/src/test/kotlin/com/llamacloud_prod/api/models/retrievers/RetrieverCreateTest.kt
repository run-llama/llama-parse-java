// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.retrievers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.pipelines.MetadataFilters
import com.llamacloud_prod.api.models.pipelines.PresetRetrievalParams
import com.llamacloud_prod.api.models.pipelines.RetrievalMode
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrieverCreateTest {

    @Test
    fun create() {
        val retrieverCreate =
            RetrieverCreate.builder()
                .name("x")
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
                .build()

        assertThat(retrieverCreate.name()).isEqualTo("x")
        assertThat(retrieverCreate.pipelines().getOrNull())
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrieverCreate =
            RetrieverCreate.builder()
                .name("x")
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
                .build()

        val roundtrippedRetrieverCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrieverCreate),
                jacksonTypeRef<RetrieverCreate>(),
            )

        assertThat(roundtrippedRetrieverCreate).isEqualTo(retrieverCreate)
    }
}
