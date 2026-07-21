// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.classify

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyCreateParamsTest {

    @Test
    fun create() {
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
                                ClassifyCreateRequest.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                            )
                            .webhookHeaders(
                                ClassifyCreateRequest.WebhookConfiguration.WebhookHeaders.builder()
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ClassifyCreateParams.builder()
                .classifyCreateRequest(ClassifyCreateRequest.builder().build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                                ClassifyCreateRequest.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                            )
                            .webhookHeaders(
                                ClassifyCreateRequest.WebhookConfiguration.WebhookHeaders.builder()
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ClassifyCreateParams.builder()
                .classifyCreateRequest(ClassifyCreateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ClassifyCreateRequest.builder().build())
    }
}
