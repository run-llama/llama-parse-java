// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.retrievers

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.retrievers.CompositeRetrievalMode
import ai.llamaindex.llamacloud.models.retrievers.ReRankConfig
import ai.llamaindex.llamacloud.models.retrievers.query.QuerySearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QueryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queryServiceAsync = client.retrievers().query()

        val compositeRetrievalResultFuture =
            queryServiceAsync.search(
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
            )

        val compositeRetrievalResult = compositeRetrievalResultFuture.get()
        compositeRetrievalResult.validate()
    }
}
