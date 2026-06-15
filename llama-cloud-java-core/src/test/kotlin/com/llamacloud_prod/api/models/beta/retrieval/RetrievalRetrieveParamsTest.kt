// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalRetrieveParamsTest {

    @Test
    fun create() {
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
                        RetrievalRetrieveParams.StaticFilters.ParsedDirectoryFileId.builder()
                            .operator(
                                RetrievalRetrieveParams.StaticFilters.ParsedDirectoryFileId.Operator
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
    }

    @Test
    fun queryParams() {
        val params =
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
                            RetrievalRetrieveParams.StaticFilters.ParsedDirectoryFileId.builder()
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
            RetrievalRetrieveParams.builder()
                .indexId("idx-abc123")
                .query("What are the key findings?")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
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
                            RetrievalRetrieveParams.StaticFilters.ParsedDirectoryFileId.builder()
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

        val body = params._body()

        assertThat(body.indexId()).isEqualTo("idx-abc123")
        assertThat(body.query()).isEqualTo("What are the key findings?")
        assertThat(body.customFilters())
            .contains(
                RetrievalRetrieveParams.CustomFilters.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("operator" to "eq", "value" to "string")),
                    )
                    .build()
            )
        assertThat(body.fullTextPipelineWeight()).contains(0.0)
        assertThat(body.numCandidates()).contains(0L)
        assertThat(body.rerank())
            .contains(RetrievalRetrieveParams.Rerank.builder().enabled(true).topN(5L).build())
        assertThat(body.scoreThreshold()).contains(0.0)
        assertThat(body.staticFilters())
            .contains(
                RetrievalRetrieveParams.StaticFilters.builder()
                    .parsedDirectoryFileId(
                        RetrievalRetrieveParams.StaticFilters.ParsedDirectoryFileId.builder()
                            .operator(
                                RetrievalRetrieveParams.StaticFilters.ParsedDirectoryFileId.Operator
                                    .EQ
                            )
                            .value("string")
                            .build()
                    )
                    .build()
            )
        assertThat(body.topK()).contains(10L)
        assertThat(body.vectorPipelineWeight()).contains(0.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RetrievalRetrieveParams.builder()
                .indexId("idx-abc123")
                .query("What are the key findings?")
                .build()

        val body = params._body()

        assertThat(body.indexId()).isEqualTo("idx-abc123")
        assertThat(body.query()).isEqualTo("What are the key findings?")
    }
}
