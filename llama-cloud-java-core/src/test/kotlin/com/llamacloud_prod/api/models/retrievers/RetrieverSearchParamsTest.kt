// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.retrievers

import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.models.pipelines.MetadataFilters
import com.llamacloud_prod.api.models.pipelines.PresetRetrievalParams
import com.llamacloud_prod.api.models.pipelines.RetrievalMode
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrieverSearchParamsTest {

    @Test
    fun create() {
        RetrieverSearchParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .query("x")
            .mode(CompositeRetrievalMode.FULL)
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
            .rerankConfig(ReRankConfig.builder().topN(1L).type(ReRankConfig.Type.BEDROCK).build())
            .rerankTopN(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RetrieverSearchParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
                .mode(CompositeRetrievalMode.FULL)
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
                .rerankConfig(
                    ReRankConfig.builder().topN(1L).type(ReRankConfig.Type.BEDROCK).build()
                )
                .rerankTopN(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RetrieverSearchParams.builder().query("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RetrieverSearchParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
                .mode(CompositeRetrievalMode.FULL)
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
                .rerankConfig(
                    ReRankConfig.builder().topN(1L).type(ReRankConfig.Type.BEDROCK).build()
                )
                .rerankTopN(0L)
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("x")
        assertThat(body.mode()).contains(CompositeRetrievalMode.FULL)
        assertThat(body.pipelines().getOrNull())
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
        assertThat(body.rerankConfig())
            .contains(ReRankConfig.builder().topN(1L).type(ReRankConfig.Type.BEDROCK).build())
        assertThat(body.rerankTopN()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RetrieverSearchParams.builder().query("x").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("x")
    }
}
