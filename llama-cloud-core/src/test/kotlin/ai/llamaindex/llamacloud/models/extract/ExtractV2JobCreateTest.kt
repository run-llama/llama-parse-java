// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractV2JobCreateTest {

    @Test
    fun create() {
        val extractV2JobCreate =
            ExtractV2JobCreate.builder()
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .configuration(
                    ExtractConfiguration.builder()
                        .dataSchema(
                            ExtractConfiguration.DataSchema.builder()
                                .putAdditionalProperty(
                                    "properties",
                                    JsonValue.from(
                                        mapOf("total_amount" to "bar", "vendor_name" to "bar")
                                    ),
                                )
                                .putAdditionalProperty(
                                    "required",
                                    JsonValue.from(listOf("total_amount", "vendor_name")),
                                )
                                .putAdditionalProperty("type", JsonValue.from("object"))
                                .build()
                        )
                        .citeSources(true)
                        .confidenceScores(true)
                        .extractionTarget(ExtractConfiguration.ExtractionTarget.PER_DOC)
                        .maxPages(10L)
                        .parseConfigId("cfg-11111111-2222-3333-4444-555555555555")
                        .parseTier("fast")
                        .systemPrompt(
                            "Extract all monetary values in USD. If a currency is not specified, assume USD."
                        )
                        .targetPages("1,3,5-7")
                        .tier(ExtractConfiguration.Tier.COST_EFFECTIVE)
                        .version("latest")
                        .build()
                )
                .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                .addWebhookConfiguration(
                    ExtractV2JobCreate.WebhookConfiguration.builder()
                        .addWebhookEvent(
                            ExtractV2JobCreate.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                        )
                        .addWebhookEvent(
                            ExtractV2JobCreate.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                        )
                        .webhookHeaders(
                            ExtractV2JobCreate.WebhookConfiguration.WebhookHeaders.builder()
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

        assertThat(extractV2JobCreate.fileInput())
            .isEqualTo("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(extractV2JobCreate.configuration())
            .contains(
                ExtractConfiguration.builder()
                    .dataSchema(
                        ExtractConfiguration.DataSchema.builder()
                            .putAdditionalProperty(
                                "properties",
                                JsonValue.from(
                                    mapOf("total_amount" to "bar", "vendor_name" to "bar")
                                ),
                            )
                            .putAdditionalProperty(
                                "required",
                                JsonValue.from(listOf("total_amount", "vendor_name")),
                            )
                            .putAdditionalProperty("type", JsonValue.from("object"))
                            .build()
                    )
                    .citeSources(true)
                    .confidenceScores(true)
                    .extractionTarget(ExtractConfiguration.ExtractionTarget.PER_DOC)
                    .maxPages(10L)
                    .parseConfigId("cfg-11111111-2222-3333-4444-555555555555")
                    .parseTier("fast")
                    .systemPrompt(
                        "Extract all monetary values in USD. If a currency is not specified, assume USD."
                    )
                    .targetPages("1,3,5-7")
                    .tier(ExtractConfiguration.Tier.COST_EFFECTIVE)
                    .version("latest")
                    .build()
            )
        assertThat(extractV2JobCreate.configurationId())
            .contains("cfg-11111111-2222-3333-4444-555555555555")
        assertThat(extractV2JobCreate.webhookConfigurations().getOrNull())
            .containsExactly(
                ExtractV2JobCreate.WebhookConfiguration.builder()
                    .addWebhookEvent(
                        ExtractV2JobCreate.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                    )
                    .addWebhookEvent(
                        ExtractV2JobCreate.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                    )
                    .webhookHeaders(
                        ExtractV2JobCreate.WebhookConfiguration.WebhookHeaders.builder()
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
        val extractV2JobCreate =
            ExtractV2JobCreate.builder()
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .configuration(
                    ExtractConfiguration.builder()
                        .dataSchema(
                            ExtractConfiguration.DataSchema.builder()
                                .putAdditionalProperty(
                                    "properties",
                                    JsonValue.from(
                                        mapOf("total_amount" to "bar", "vendor_name" to "bar")
                                    ),
                                )
                                .putAdditionalProperty(
                                    "required",
                                    JsonValue.from(listOf("total_amount", "vendor_name")),
                                )
                                .putAdditionalProperty("type", JsonValue.from("object"))
                                .build()
                        )
                        .citeSources(true)
                        .confidenceScores(true)
                        .extractionTarget(ExtractConfiguration.ExtractionTarget.PER_DOC)
                        .maxPages(10L)
                        .parseConfigId("cfg-11111111-2222-3333-4444-555555555555")
                        .parseTier("fast")
                        .systemPrompt(
                            "Extract all monetary values in USD. If a currency is not specified, assume USD."
                        )
                        .targetPages("1,3,5-7")
                        .tier(ExtractConfiguration.Tier.COST_EFFECTIVE)
                        .version("latest")
                        .build()
                )
                .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                .addWebhookConfiguration(
                    ExtractV2JobCreate.WebhookConfiguration.builder()
                        .addWebhookEvent(
                            ExtractV2JobCreate.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                        )
                        .addWebhookEvent(
                            ExtractV2JobCreate.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                        )
                        .webhookHeaders(
                            ExtractV2JobCreate.WebhookConfiguration.WebhookHeaders.builder()
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

        val roundtrippedExtractV2JobCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractV2JobCreate),
                jacksonTypeRef<ExtractV2JobCreate>(),
            )

        assertThat(roundtrippedExtractV2JobCreate).isEqualTo(extractV2JobCreate)
    }
}
