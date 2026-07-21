// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.retrievers

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.models.pipelines.MetadataFilters
import ai.llamaindex.llamacloud.models.pipelines.PresetRetrievalParams
import ai.llamaindex.llamacloud.models.pipelines.RetrievalMode
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrieverUpdateParamsTest {

    @Test
    fun create() {
        RetrieverUpdateParams.builder()
            .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RetrieverUpdateParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPipeline(
                    RetrieverPipeline.builder()
                        .description("description")
                        .name("x")
                        .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RetrieverUpdateParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .name("name")
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
        val params =
            RetrieverUpdateParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPipeline(
                    RetrieverPipeline.builder()
                        .description("description")
                        .name("x")
                        .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RetrieverUpdateParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .name("name")
                .build()

        val body = params._body()

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
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RetrieverUpdateParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPipeline(
                    RetrieverPipeline.builder()
                        .description("description")
                        .name("x")
                        .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.pipelines().getOrNull())
            .containsExactly(
                RetrieverPipeline.builder()
                    .description("description")
                    .name("x")
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
