// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.alpha

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCancelParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCreateParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetDetailsParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerifyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyServiceAsync = client.alpha().verify()

        val verifyFuture =
            verifyServiceAsync.create(
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

        val verify = verifyFuture.get()
        verify.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyServiceAsync = client.alpha().verify()

        val pageFuture = verifyServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyServiceAsync = client.alpha().verify()

        val responseFuture =
            verifyServiceAsync.cancel(
                VerifyCancelParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyServiceAsync = client.alpha().verify()

        val verifyFuture =
            verifyServiceAsync.get(
                VerifyGetParams.builder()
                    .jobId("job_id")
                    .addExpand("string")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val verify = verifyFuture.get()
        verify.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDetails() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyServiceAsync = client.alpha().verify()

        val responseFuture =
            verifyServiceAsync.getDetails(
                VerifyGetDetailsParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
