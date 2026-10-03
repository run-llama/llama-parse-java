// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.beta.split.SplitCategory
import ai.llamaindex.llamacloud.models.split.SplitCancelParams
import ai.llamaindex.llamacloud.models.split.SplitCreateParams
import ai.llamaindex.llamacloud.models.split.SplitDeleteParams
import ai.llamaindex.llamacloud.models.split.SplitGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SplitServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val splitServiceAsync = client.split()

        val splitFuture =
            splitServiceAsync.create(
                SplitCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
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
                    .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                    .transactionId("tx-unique-idempotency-key")
                    .addWebhookConfigurationId("whc-...")
                    .addWebhookConfigurationId("whc-...")
                    .addWebhookConfiguration(
                        SplitCreateParams.WebhookConfiguration.builder()
                            .addWebhookEvent(
                                SplitCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                            )
                            .addWebhookEvent(
                                SplitCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                            )
                            .webhookHeaders(
                                SplitCreateParams.WebhookConfiguration.WebhookHeaders.builder()
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

        val split = splitFuture.get()
        split.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val splitServiceAsync = client.split()

        val pageFuture = splitServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val splitServiceAsync = client.split()

        val splitFuture =
            splitServiceAsync.delete(
                SplitDeleteParams.builder()
                    .splitJobId("split_job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val split = splitFuture.get()
        split.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val splitServiceAsync = client.split()

        val responseFuture =
            splitServiceAsync.cancel(
                SplitCancelParams.builder()
                    .splitJobId("split_job_id")
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
        val splitServiceAsync = client.split()

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
