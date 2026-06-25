// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.models.configurations.ClassifyV2Parameters
import com.llamacloud_prod.api.models.configurations.ConfigurationCreate
import com.llamacloud_prod.api.models.configurations.ConfigurationCreateParams
import com.llamacloud_prod.api.models.configurations.ConfigurationDeleteParams
import com.llamacloud_prod.api.models.configurations.ConfigurationRetrieveParams
import com.llamacloud_prod.api.models.configurations.ConfigurationUpdateParams
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
                                ClassifyV2Parameters.builder()
                                    .addRule(
                                        ClassifyV2Parameters.Rule.builder()
                                            .description(
                                                "contains invoice number, line items, and total amount"
                                            )
                                            .type("invoice")
                                            .build()
                                    )
                                    .mode(ClassifyV2Parameters.Mode.FAST)
                                    .parsingConfiguration(
                                        ClassifyV2Parameters.ParsingConfiguration.builder()
                                            .lang("en")
                                            .maxPages(10L)
                                            .targetPages("1,3,5-7")
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
                        ClassifyV2Parameters.builder()
                            .addRule(
                                ClassifyV2Parameters.Rule.builder()
                                    .description(
                                        "contains invoice number, line items, and total amount"
                                    )
                                    .type("invoice")
                                    .build()
                            )
                            .mode(ClassifyV2Parameters.Mode.FAST)
                            .parsingConfiguration(
                                ClassifyV2Parameters.ParsingConfiguration.builder()
                                    .lang("en")
                                    .maxPages(10L)
                                    .targetPages("1,3,5-7")
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
