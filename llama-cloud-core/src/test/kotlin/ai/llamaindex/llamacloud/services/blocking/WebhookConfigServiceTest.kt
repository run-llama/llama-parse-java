// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigCreate
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigCreateParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigDeleteParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigListParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigRetrieveParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookConfigServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val webhookConfigService = client.webhookConfigs()

        val webhookConfigResponse =
            webhookConfigService.create(
                WebhookConfigCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .webhookConfigCreate(
                        WebhookConfigCreate.builder()
                            .webhookUrl("https://example.com/webhooks/llamacloud")
                            .addWebhookEvent(WebhookConfigCreate.WebhookEvent.PARSE_SUCCESS)
                            .addWebhookEvent(WebhookConfigCreate.WebhookEvent.PARSE_ERROR)
                            .webhookHeaders(
                                WebhookConfigCreate.WebhookHeaders.builder()
                                    .putAdditionalProperty(
                                        "Authorization",
                                        JsonValue.from("Bearer sk-..."),
                                    )
                                    .build()
                            )
                            .webhookOutputFormat(WebhookConfigCreate.WebhookOutputFormat.JSON)
                            .webhookSigningSecret("whsec_...")
                            .build()
                    )
                    .build()
            )

        webhookConfigResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val webhookConfigService = client.webhookConfigs()

        val webhookConfigResponse =
            webhookConfigService.retrieve(
                WebhookConfigRetrieveParams.builder()
                    .configId("config_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        webhookConfigResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val webhookConfigService = client.webhookConfigs()

        val webhookConfigResponse =
            webhookConfigService.update(
                WebhookConfigUpdateParams.builder()
                    .configId("config_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addWebhookEvent(WebhookConfigUpdateParams.WebhookEvent.BATCH_CANCELLED)
                    .webhookHeaders(
                        WebhookConfigUpdateParams.WebhookHeaders.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .webhookOutputFormat(WebhookConfigUpdateParams.WebhookOutputFormat.JSON)
                    .webhookSigningSecret("webhook_signing_secret")
                    .webhookUrl("webhook_url")
                    .build()
            )

        webhookConfigResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val webhookConfigService = client.webhookConfigs()

        val webhookConfigResponses =
            webhookConfigService.list(
                WebhookConfigListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        webhookConfigResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val webhookConfigService = client.webhookConfigs()

        webhookConfigService.delete(
            WebhookConfigDeleteParams.builder()
                .configId("config_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
