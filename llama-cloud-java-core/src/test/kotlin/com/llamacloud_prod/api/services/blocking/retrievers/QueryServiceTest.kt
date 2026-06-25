// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.retrievers

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.models.retrievers.CompositeRetrievalMode
import com.llamacloud_prod.api.models.retrievers.ReRankConfig
import com.llamacloud_prod.api.models.retrievers.query.QuerySearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QueryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val queryService = client.retrievers().query()

        val compositeRetrievalResult =
            queryService.search(
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

        compositeRetrievalResult.validate()
    }
}
