// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalFindParams
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalGrepParams
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalReadParams
import com.llamacloud_prod.api.models.beta.retrieval.RetrievalRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RetrievalServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrievalService = client.beta().retrieval()

        val retrieval =
            retrievalService.retrieve(
                RetrievalRetrieveParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .indexId("idx-abc123")
                    .query("What are the key findings?")
                    .customFilters(
                        RetrievalRetrieveParams.CustomFilters.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("operator" to "eq", "value" to "string")),
                            )
                            .build()
                    )
                    .fullTextPipelineWeight(0.0)
                    .numCandidates(0L)
                    .rerank(RetrievalRetrieveParams.Rerank.builder().enabled(true).topN(5L).build())
                    .scoreThreshold(0.0)
                    .staticFilters(
                        RetrievalRetrieveParams.StaticFilters.builder()
                            .parsedDirectoryFileId(
                                RetrievalRetrieveParams.StaticFilters.ParsedDirectoryFileId
                                    .builder()
                                    .operator(
                                        RetrievalRetrieveParams.StaticFilters.ParsedDirectoryFileId
                                            .Operator
                                            .EQ
                                    )
                                    .value("string")
                                    .build()
                            )
                            .build()
                    )
                    .topK(10L)
                    .vectorPipelineWeight(0.0)
                    .build()
            )

        retrieval.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun find() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrievalService = client.beta().retrieval()

        val page =
            retrievalService.find(RetrievalFindParams.builder().indexId("idx-abc123").build())

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun grep() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrievalService = client.beta().retrieval()

        val page =
            retrievalService.grep(
                RetrievalGrepParams.builder()
                    .fileId("file_id")
                    .indexId("idx-abc123")
                    .pattern("revenue|profit")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun read() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val retrievalService = client.beta().retrieval()

        val response =
            retrievalService.read(
                RetrievalReadParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileId("file_id")
                    .indexId("idx-abc123")
                    .maxLength(0L)
                    .offset(0L)
                    .build()
            )

        response.validate()
    }
}
