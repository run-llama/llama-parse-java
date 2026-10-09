// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.alpha

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCancelParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCreateParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetDetailsParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerifyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val verifyService = client.alpha().verify()

        val verify =
            verifyService.create(
                VerifyCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .configuration(
                        VerifyCreateParams.Configuration.builder()
                            .targetPages("1,3,5-7")
                            .tier(VerifyCreateParams.Configuration.Tier.AGENTIC)
                            .build()
                    )
                    .fileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .transactionId("tx-unique-idempotency-key")
                    .addWebhookConfigurationId("whc-...")
                    .addWebhookConfigurationId("whc-...")
                    .addWebhookConfiguration(
                        VerifyCreateParams.WebhookConfiguration.builder()
                            .addWebhookEvent(
                                VerifyCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                            )
                            .addWebhookEvent(
                                VerifyCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                            )
                            .webhookHeaders(
                                VerifyCreateParams.WebhookConfiguration.WebhookHeaders.builder()
                                    .putAdditionalProperty(
                                        "Authorization",
                                        JsonValue.from("Bearer sk-..."),
                                    )
                                    .build()
                            )
                            .webhookOutputFormat("json")
                            .webhookSigningSecret("whsec_...")
                            .webhookUrl("https://example.com/webhooks/llamacloud")
                            .build()
                    )
                    .build()
            )

        verify.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val verifyService = client.alpha().verify()

        val page = verifyService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val verifyService = client.alpha().verify()

        val response =
            verifyService.cancel(
                VerifyCancelParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val verifyService = client.alpha().verify()

        val verify =
            verifyService.get(
                VerifyGetParams.builder()
                    .jobId("job_id")
                    .addExpand("string")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        verify.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDetails() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val verifyService = client.alpha().verify()

        val response =
            verifyService.getDetails(
                VerifyGetDetailsParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
