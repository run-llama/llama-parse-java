// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classify

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyCreateRequestTest {

    @Test
    fun create() {
        val classifyCreateRequest =
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
                            ClassifyCreateRequest.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
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

        assertThat(classifyCreateRequest.configuration())
            .contains(
                ClassifyConfiguration.builder()
                    .addRule(
                        ClassifyConfiguration.Rule.builder()
                            .description("contains invoice number, line items, and total amount")
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
        assertThat(classifyCreateRequest.configurationId())
            .contains("cfg-11111111-2222-3333-4444-555555555555")
        assertThat(classifyCreateRequest.fileId())
            .contains("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(classifyCreateRequest.fileInput())
            .contains("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(classifyCreateRequest.parseJobId())
            .contains("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(classifyCreateRequest.transactionId()).contains("tx-unique-idempotency-key")
        assertThat(classifyCreateRequest.webhookConfigurations().getOrNull())
            .containsExactly(
                ClassifyCreateRequest.WebhookConfiguration.builder()
                    .addWebhookEvent(
                        ClassifyCreateRequest.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                    )
                    .addWebhookEvent(
                        ClassifyCreateRequest.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                    )
                    .webhookHeaders(
                        ClassifyCreateRequest.WebhookConfiguration.WebhookHeaders.builder()
                            .putAdditionalProperty("Authorization", JsonValue.from("Bearer sk-..."))
                            .build()
                    )
                    .webhookOutputFormat("json")
                    .webhookSigningSecret("whsec_...")
                    .webhookUrl("https://example.com/webhooks/llamacloud")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyCreateRequest =
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
                            ClassifyCreateRequest.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
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

        val roundtrippedClassifyCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyCreateRequest),
                jacksonTypeRef<ClassifyCreateRequest>(),
            )

        assertThat(roundtrippedClassifyCreateRequest).isEqualTo(classifyCreateRequest)
    }
}
