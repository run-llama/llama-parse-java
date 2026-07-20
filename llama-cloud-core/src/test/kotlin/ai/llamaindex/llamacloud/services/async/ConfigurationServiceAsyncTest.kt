// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.configurations.ClassifyV2Parameters
import ai.llamaindex.llamacloud.models.configurations.ConfigurationCreate
import ai.llamaindex.llamacloud.models.configurations.ConfigurationCreateParams
import ai.llamaindex.llamacloud.models.configurations.ConfigurationDeleteParams
import ai.llamaindex.llamacloud.models.configurations.ConfigurationRetrieveParams
import ai.llamaindex.llamacloud.models.configurations.ConfigurationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigurationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val configurationServiceAsync = client.configurations()

        val configurationResponseFuture =
            configurationServiceAsync.create(
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

        val configurationResponse = configurationResponseFuture.get()
        configurationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val configurationServiceAsync = client.configurations()

        val configurationResponseFuture =
            configurationServiceAsync.retrieve(
                ConfigurationRetrieveParams.builder()
                    .configId("config_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val configurationResponse = configurationResponseFuture.get()
        configurationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val configurationServiceAsync = client.configurations()

        val configurationResponseFuture =
            configurationServiceAsync.update(
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

        val configurationResponse = configurationResponseFuture.get()
        configurationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val configurationServiceAsync = client.configurations()

        val pageFuture = configurationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val configurationServiceAsync = client.configurations()

        val future =
            configurationServiceAsync.delete(
                ConfigurationDeleteParams.builder()
                    .configId("config_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }
}
