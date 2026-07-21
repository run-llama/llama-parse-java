// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineRetrieveParamsTest {

    @Test
    fun create() {
        PipelineRetrieveParams.builder()
            .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .query("x")
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
                            .operator(MetadataFilters.Filter.MetadataFilter.Operator.NOT_EQUALS)
                            .build()
                    )
                    .condition(MetadataFilters.Condition.AND)
                    .build()
            )
            .searchFiltersInferenceSchema(
                PipelineRetrieveParams.SearchFiltersInferenceSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
            .sparseSimilarityTopK(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PipelineRetrieveParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PipelineRetrieveParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
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
                                .operator(MetadataFilters.Filter.MetadataFilter.Operator.NOT_EQUALS)
                                .build()
                        )
                        .condition(MetadataFilters.Condition.AND)
                        .build()
                )
                .searchFiltersInferenceSchema(
                    PipelineRetrieveParams.SearchFiltersInferenceSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .sparseSimilarityTopK(1L)
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
            PipelineRetrieveParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            PipelineRetrieveParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
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
                                .operator(MetadataFilters.Filter.MetadataFilter.Operator.NOT_EQUALS)
                                .build()
                        )
                        .condition(MetadataFilters.Condition.AND)
                        .build()
                )
                .searchFiltersInferenceSchema(
                    PipelineRetrieveParams.SearchFiltersInferenceSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .sparseSimilarityTopK(1L)
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("x")
        assertThat(body.alpha()).contains(0.0)
        assertThat(body.className()).contains("class_name")
        assertThat(body.denseSimilarityCutoff()).contains(0.0)
        assertThat(body.denseSimilarityTopK()).contains(1L)
        assertThat(body.enableReranking()).contains(true)
        assertThat(body.filesTopK()).contains(1L)
        assertThat(body.rerankTopN()).contains(1L)
        assertThat(body.retrievalMode()).contains(RetrievalMode.AUTO_ROUTED)
        assertThat(body.retrieveImageNodes()).contains(true)
        assertThat(body.retrievePageFigureNodes()).contains(true)
        assertThat(body.retrievePageScreenshotNodes()).contains(true)
        assertThat(body.searchFilters())
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
        assertThat(body.searchFiltersInferenceSchema())
            .contains(
                PipelineRetrieveParams.SearchFiltersInferenceSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(body.sparseSimilarityTopK()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PipelineRetrieveParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("x")
    }
}
