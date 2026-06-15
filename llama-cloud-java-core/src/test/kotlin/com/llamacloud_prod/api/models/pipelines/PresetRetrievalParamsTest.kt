// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PresetRetrievalParamsTest {

    @Test
    fun create() {
        val presetRetrievalParams =
            PresetRetrievalParams.builder()
                .alpha(0.0)
                .className("class_name")
                .denseSimilarityCutoff(0.0)
                .denseSimilarityTopK(1L)
                .enableReranking(true)
                .filesTopK(1L)
                .rerankTopN(1L)
                .retrievalMode(RetrievalMode.CHUNKS)
                .retrieveImageNodes(true)
                .retrievePageFigureNodes(true)
                .retrievePageScreenshotNodes(true)
                .searchFilters(
                    MetadataFilters.builder()
                        .addFilter(
                            MetadataFilters.Filter.MetadataFilter.builder()
                                .key("key")
                                .value(0.0)
                                .operator(MetadataFilters.Filter.MetadataFilter.Operator.EQUALS)
                                .build()
                        )
                        .condition(MetadataFilters.Condition.AND)
                        .build()
                )
                .searchFiltersInferenceSchema(
                    PresetRetrievalParams.SearchFiltersInferenceSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .sparseSimilarityTopK(1L)
                .build()

        assertThat(presetRetrievalParams.alpha()).contains(0.0)
        assertThat(presetRetrievalParams.className()).contains("class_name")
        assertThat(presetRetrievalParams.denseSimilarityCutoff()).contains(0.0)
        assertThat(presetRetrievalParams.denseSimilarityTopK()).contains(1L)
        assertThat(presetRetrievalParams.enableReranking()).contains(true)
        assertThat(presetRetrievalParams.filesTopK()).contains(1L)
        assertThat(presetRetrievalParams.rerankTopN()).contains(1L)
        assertThat(presetRetrievalParams.retrievalMode()).contains(RetrievalMode.CHUNKS)
        assertThat(presetRetrievalParams.retrieveImageNodes()).contains(true)
        assertThat(presetRetrievalParams.retrievePageFigureNodes()).contains(true)
        assertThat(presetRetrievalParams.retrievePageScreenshotNodes()).contains(true)
        assertThat(presetRetrievalParams.searchFilters())
            .contains(
                MetadataFilters.builder()
                    .addFilter(
                        MetadataFilters.Filter.MetadataFilter.builder()
                            .key("key")
                            .value(0.0)
                            .operator(MetadataFilters.Filter.MetadataFilter.Operator.EQUALS)
                            .build()
                    )
                    .condition(MetadataFilters.Condition.AND)
                    .build()
            )
        assertThat(presetRetrievalParams.searchFiltersInferenceSchema())
            .contains(
                PresetRetrievalParams.SearchFiltersInferenceSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(presetRetrievalParams.sparseSimilarityTopK()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val presetRetrievalParams =
            PresetRetrievalParams.builder()
                .alpha(0.0)
                .className("class_name")
                .denseSimilarityCutoff(0.0)
                .denseSimilarityTopK(1L)
                .enableReranking(true)
                .filesTopK(1L)
                .rerankTopN(1L)
                .retrievalMode(RetrievalMode.CHUNKS)
                .retrieveImageNodes(true)
                .retrievePageFigureNodes(true)
                .retrievePageScreenshotNodes(true)
                .searchFilters(
                    MetadataFilters.builder()
                        .addFilter(
                            MetadataFilters.Filter.MetadataFilter.builder()
                                .key("key")
                                .value(0.0)
                                .operator(MetadataFilters.Filter.MetadataFilter.Operator.EQUALS)
                                .build()
                        )
                        .condition(MetadataFilters.Condition.AND)
                        .build()
                )
                .searchFiltersInferenceSchema(
                    PresetRetrievalParams.SearchFiltersInferenceSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .sparseSimilarityTopK(1L)
                .build()

        val roundtrippedPresetRetrievalParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(presetRetrievalParams),
                jacksonTypeRef<PresetRetrievalParams>(),
            )

        assertThat(roundtrippedPresetRetrievalParams).isEqualTo(presetRetrievalParams)
    }
}
