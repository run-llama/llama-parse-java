// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.classify.ClassifyConfiguration
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateParams
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateRequest
import ai.llamaindex.llamacloud.models.classify.ClassifyGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ClassifyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val classifyService = client.classify()

        val classify =
            classifyService.create(
                ClassifyCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classifyCreateRequest(
                        ClassifyCreateRequest.builder()
                            .configuration(
                                ClassifyConfiguration.builder()
                                    .addRule(
                                        ClassifyConfiguration.Rule.builder()
                                            .description(
                                                "contains invoice number, line items, and total amount"
                                            )
                                            .type("invoice")
                                            .build()
                                    )
                                    .mode(ClassifyConfiguration.Mode.FAST)
                                    .parsingConfiguration(
                                        ClassifyConfiguration.ParsingConfiguration.builder()
                                            .lang("en")
                                            .maxPages(10L)
                                            .targetPages("1,3,5-7")
                                            .build()
                                    )
                                    .build()
                            )
                            .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                            .fileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                            .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                            .parseJobId("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                            .transactionId("tx-unique-idempotency-key")
                            .addWebhookConfiguration(
                                ClassifyCreateRequest.WebhookConfiguration.builder()
                                    .addWebhookEvent(
                                        ClassifyCreateRequest.WebhookConfiguration.WebhookEvent
                                            .PARSE_SUCCESS
                                    )
                                    .addWebhookEvent(
                                        ClassifyCreateRequest.WebhookConfiguration.WebhookEvent
                                            .PARSE_ERROR
                                    )
                                    .webhookHeaders(
                                        ClassifyCreateRequest.WebhookConfiguration.WebhookHeaders
                                            .builder()
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
                    .build()
            )

        classify.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val classifyService = client.classify()

        val page = classifyService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val classifyService = client.classify()

        val classify =
            classifyService.get(
                ClassifyGetParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        classify.validate()
    }
}
