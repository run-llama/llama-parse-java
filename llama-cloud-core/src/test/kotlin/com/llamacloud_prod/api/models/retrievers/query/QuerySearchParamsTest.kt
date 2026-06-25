// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.retrievers.query

import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.models.retrievers.CompositeRetrievalMode
import com.llamacloud_prod.api.models.retrievers.ReRankConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuerySearchParamsTest {

    @Test
    fun create() {
        QuerySearchParams.builder()
            .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .query("x")
            .mode(CompositeRetrievalMode.FULL)
            .rerankConfig(ReRankConfig.builder().topN(1L).type(ReRankConfig.Type.BEDROCK).build())
            .rerankTopN(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            QuerySearchParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            QuerySearchParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
                .mode(CompositeRetrievalMode.FULL)
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
        val params =
            QuerySearchParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            QuerySearchParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
                .mode(CompositeRetrievalMode.FULL)
                .rerankConfig(
                    ReRankConfig.builder().topN(1L).type(ReRankConfig.Type.BEDROCK).build()
                )
                .rerankTopN(0L)
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("x")
        assertThat(body.mode()).contains(CompositeRetrievalMode.FULL)
        assertThat(body.rerankConfig())
            .contains(ReRankConfig.builder().topN(1L).type(ReRankConfig.Type.BEDROCK).build())
        assertThat(body.rerankTopN()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            QuerySearchParams.builder()
                .retrieverId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("x")
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("x")
    }
}
