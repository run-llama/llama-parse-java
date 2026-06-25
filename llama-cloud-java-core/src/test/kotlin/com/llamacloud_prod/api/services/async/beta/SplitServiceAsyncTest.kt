// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.models.beta.split.SplitCategory
import com.llamacloud_prod.api.models.beta.split.SplitCreateParams
import com.llamacloud_prod.api.models.beta.split.SplitDocumentInput
import com.llamacloud_prod.api.models.beta.split.SplitGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SplitServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val splitServiceAsync = client.beta().split()

        val splitFuture =
            splitServiceAsync.create(
                SplitCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentInput(SplitDocumentInput.builder().type("type").value("value").build())
                    .configuration(
                        SplitCreateParams.Configuration.builder()
                            .addCategory(SplitCategory.builder().name("x").description("x").build())
                            .splittingStrategy(
                                SplitCreateParams.Configuration.SplittingStrategy.builder()
                                    .allowUncategorized(
                                        SplitCreateParams.Configuration.SplittingStrategy
                                            .AllowUncategorized
                                            .FORBID
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .configurationId("configuration_id")
                    .build()
            )

        val split = splitFuture.get()
        split.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val splitServiceAsync = client.beta().split()

        val pageFuture = splitServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val splitServiceAsync = client.beta().split()

        val splitFuture =
            splitServiceAsync.get(
                SplitGetParams.builder()
                    .splitJobId("split_job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val split = splitFuture.get()
        split.validate()
    }
}
