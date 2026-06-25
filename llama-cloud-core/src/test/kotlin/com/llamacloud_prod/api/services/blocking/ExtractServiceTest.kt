// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.extract.ExtractConfiguration
import com.llamacloud_prod.api.models.extract.ExtractCreateParams
import com.llamacloud_prod.api.models.extract.ExtractDeleteParams
import com.llamacloud_prod.api.models.extract.ExtractGenerateSchemaParams
import com.llamacloud_prod.api.models.extract.ExtractGetParams
import com.llamacloud_prod.api.models.extract.ExtractV2JobCreate
import com.llamacloud_prod.api.models.extract.ExtractV2SchemaGenerateRequest
import com.llamacloud_prod.api.models.extract.ExtractV2SchemaValidateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExtractServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val extractService = client.extract()

        val extractV2Job =
            extractService.create(
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
                                                JsonValue.from(
                                                    listOf("total_amount", "vendor_name")
                                                ),
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
                                        ExtractV2JobCreate.WebhookConfiguration.WebhookEvent
                                            .PARSE_ERROR
                                    )
                                    .webhookHeaders(
                                        ExtractV2JobCreate.WebhookConfiguration.WebhookHeaders
                                            .builder()
                                            .putAdditionalProperty(
                                                "Authorization",
                                                JsonValue.from("Bearer sk-..."),
                                            )
                                            .build()
                                    )
                                    .webhookOutputFormat("json")
                                    .webhookUrl("https://example.com/webhooks/llamacloud")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        extractV2Job.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val extractService = client.extract()

        val page = extractService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val extractService = client.extract()

        val extract =
            extractService.delete(
                ExtractDeleteParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        extract.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateSchema() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val extractService = client.extract()

        val configurationCreate =
            extractService.generateSchema(
                ExtractGenerateSchemaParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .extractV2SchemaGenerateRequest(
                        ExtractV2SchemaGenerateRequest.builder()
                            .dataSchema(
                                ExtractV2SchemaGenerateRequest.DataSchema.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .fileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                            .name("invoice_extraction")
                            .prompt(
                                "Extract vendor name, invoice number, date, line items with descriptions and amounts, and total amount from invoices."
                            )
                            .build()
                    )
                    .build()
            )

        configurationCreate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val extractService = client.extract()

        val extractV2Job =
            extractService.get(
                ExtractGetParams.builder()
                    .jobId("job_id")
                    .addExpand("string")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        extractV2Job.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun validateSchema() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val extractService = client.extract()

        val extractV2SchemaValidateResponse =
            extractService.validateSchema(
                ExtractV2SchemaValidateRequest.builder()
                    .dataSchema(
                        ExtractV2SchemaValidateRequest.DataSchema.builder()
                            .putAdditionalProperty(
                                "properties",
                                JsonValue.from(
                                    mapOf(
                                        "invoice_number" to "bar",
                                        "line_items" to "bar",
                                        "total_amount" to "bar",
                                        "vendor_name" to "bar",
                                    )
                                ),
                            )
                            .putAdditionalProperty(
                                "required",
                                JsonValue.from(
                                    listOf("invoice_number", "total_amount", "vendor_name")
                                ),
                            )
                            .putAdditionalProperty("type", JsonValue.from("object"))
                            .build()
                    )
                    .build()
            )

        extractV2SchemaValidateResponse.validate()
    }
}
