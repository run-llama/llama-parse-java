// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.models.beta.split.SplitCategory
import com.llamacloud_prod.api.models.configurations.ConfigurationCreate
import com.llamacloud_prod.api.models.configurations.ConfigurationCreateParams
import com.llamacloud_prod.api.models.configurations.ConfigurationDeleteParams
import com.llamacloud_prod.api.models.configurations.ConfigurationRetrieveParams
import com.llamacloud_prod.api.models.configurations.ConfigurationUpdateParams
import com.llamacloud_prod.api.models.configurations.SplitV1Parameters
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigurationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val configurationService = client.configurations()

        val configurationResponse =
            configurationService.create(
                ConfigurationCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .configurationCreate(
                        ConfigurationCreate.builder()
                            .name("x")
                            .parameters(
                                SplitV1Parameters.builder()
                                    .addCategory(
                                        SplitCategory.builder().name("x").description("x").build()
                                    )
                                    .splittingStrategy(
                                        SplitV1Parameters.SplittingStrategy.builder()
                                            .allowUncategorized(
                                                SplitV1Parameters.SplittingStrategy
                                                    .AllowUncategorized
                                                    .INCLUDE
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        configurationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val configurationService = client.configurations()

        val configurationResponse =
            configurationService.retrieve(
                ConfigurationRetrieveParams.builder()
                    .configId("config_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        configurationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val configurationService = client.configurations()

        val configurationResponse =
            configurationService.update(
                ConfigurationUpdateParams.builder()
                    .configId("config_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("x")
                    .parameters(
                        SplitV1Parameters.builder()
                            .addCategory(SplitCategory.builder().name("x").description("x").build())
                            .splittingStrategy(
                                SplitV1Parameters.SplittingStrategy.builder()
                                    .allowUncategorized(
                                        SplitV1Parameters.SplittingStrategy.AllowUncategorized
                                            .INCLUDE
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        configurationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val configurationService = client.configurations()

        val page = configurationService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val configurationService = client.configurations()

        configurationService.delete(
            ConfigurationDeleteParams.builder()
                .configId("config_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
