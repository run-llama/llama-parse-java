// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.models.configurations.ClassifyV2Parameters
import ai.llamaindex.llamacloud.models.configurations.ConfigurationCreate
import ai.llamaindex.llamacloud.models.configurations.ConfigurationCreateParams
import ai.llamaindex.llamacloud.models.configurations.ConfigurationDeleteParams
import ai.llamaindex.llamacloud.models.configurations.ConfigurationRetrieveParams
import ai.llamaindex.llamacloud.models.configurations.ConfigurationUpdateParams
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
