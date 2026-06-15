// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.models.beta.split.SplitCategory
import com.llamacloud_prod.api.models.beta.split.SplitCreateParams
import com.llamacloud_prod.api.models.beta.split.SplitDocumentInput
import com.llamacloud_prod.api.models.beta.split.SplitGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SplitServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val splitService = client.beta().split()

        val split =
            splitService.create(
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
                                            .INCLUDE
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .configurationId("configuration_id")
                    .build()
            )

        split.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val splitService = client.beta().split()

        val page = splitService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val splitService = client.beta().split()

        val split =
            splitService.get(
                SplitGetParams.builder()
                    .splitJobId("split_job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        split.validate()
    }
}
