// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.pipelines.MetadataFilters
import ai.llamaindex.llamacloud.models.pipelines.PresetRetrievalParams
import ai.llamaindex.llamacloud.models.pipelines.RetrievalMode
import ai.llamaindex.llamacloud.models.retrievers.CompositeRetrievalMode
import ai.llamaindex.llamacloud.models.retrievers.ReRankConfig
import ai.llamaindex.llamacloud.models.retrievers.RetrieverCreate
import ai.llamaindex.llamacloud.models.retrievers.RetrieverCreateParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverDeleteParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverGetParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverListParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverPipeline
import ai.llamaindex.llamacloud.models.retrievers.RetrieverSearchParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverUpdateParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RetrieverServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrieverService = client.retrievers()

        val retriever =
            retrieverService.create(
                RetrieverCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .retrieverCreate(
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
                                                        MetadataFilters.Filter.MetadataFilter
                                                            .builder()
                                                            .key("key")
                                                            .value(0.0)
                                                            .operator(
                                                                MetadataFilters.Filter
                                                                    .MetadataFilter
                                                                    .Operator
                                                                    .NOT_EQUALS
                                                            )
                                                            .build()
                                                    )
                                                    .condition(MetadataFilters.Condition.AND)
                                                    .build()
                                            )
                                            .searchFiltersInferenceSchema(
                                                PresetRetrievalParams.SearchFiltersInferenceSchema
                                                    .builder()
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
                    )
                    .build()
            )

        retriever.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrieverService = client.retrievers()

        val retriever =
            retrieverService.update(
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
                                                        MetadataFilters.Filter.MetadataFilter
                                                            .Operator
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
            )

        retriever.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrieverService = client.retrievers()

        val retrievers =
            retrieverService.list(
                RetrieverListParams.builder()
                    .name("name")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        retrievers.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrieverService = client.retrievers()

        retrieverService.delete(
            RetrieverDeleteParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrieverService = client.retrievers()

        val retriever =
            retrieverService.get(
                RetrieverGetParams.builder()
                    .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        retriever.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrieverService = client.retrievers()

        val compositeRetrievalResult =
            retrieverService.search(
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
                                                        MetadataFilters.Filter.MetadataFilter
                                                            .Operator
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
            )

        compositeRetrievalResult.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrieverService = client.retrievers()

        val retriever =
            retrieverService.upsert(
                RetrieverUpsertParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .retrieverCreate(
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
                                                        MetadataFilters.Filter.MetadataFilter
                                                            .builder()
                                                            .key("key")
                                                            .value(0.0)
                                                            .operator(
                                                                MetadataFilters.Filter
                                                                    .MetadataFilter
                                                                    .Operator
                                                                    .NOT_EQUALS
                                                            )
                                                            .build()
                                                    )
                                                    .condition(MetadataFilters.Condition.AND)
                                                    .build()
                                            )
                                            .searchFiltersInferenceSchema(
                                                PresetRetrievalParams.SearchFiltersInferenceSchema
                                                    .builder()
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
                    )
                    .build()
            )

        retriever.validate()
    }
}
