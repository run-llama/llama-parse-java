// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractCreateParamsTest {

    @Test
    fun create() {
        ExtractCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .extractV2JobCreate(
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
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExtractCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .extractV2JobCreate(
                    ExtractV2JobCreate.builder()
                        .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .configuration(
                            ExtractConfiguration.builder()
                                .dataSchema(
                                    ExtractConfiguration.DataSchema.builder()
                                        .putAdditionalProperty(
                                            "properties",
                                            JsonValue.from(
                                                mapOf(
                                                    "total_amount" to "bar",
                                                    "vendor_name" to "bar",
                                                )
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
                                    ExtractV2JobCreate.WebhookConfiguration.WebhookEvent
                                        .PARSE_SUCCESS
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
            ExtractCreateParams.builder()
                .extractV2JobCreate(
                    ExtractV2JobCreate.builder()
                        .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ExtractCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .extractV2JobCreate(
                    ExtractV2JobCreate.builder()
                        .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .configuration(
                            ExtractConfiguration.builder()
                                .dataSchema(
                                    ExtractConfiguration.DataSchema.builder()
                                        .putAdditionalProperty(
                                            "properties",
                                            JsonValue.from(
                                                mapOf(
                                                    "total_amount" to "bar",
                                                    "vendor_name" to "bar",
                                                )
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
                                    ExtractV2JobCreate.WebhookConfiguration.WebhookEvent
                                        .PARSE_SUCCESS
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExtractCreateParams.builder()
                .extractV2JobCreate(
                    ExtractV2JobCreate.builder()
                        .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExtractV2JobCreate.builder()
                    .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .build()
            )
    }
}
