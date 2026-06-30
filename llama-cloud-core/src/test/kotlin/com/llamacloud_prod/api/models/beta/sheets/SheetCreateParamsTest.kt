// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.sheets

import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SheetCreateParamsTest {

    @Test
    fun create() {
        SheetCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .config(
                SheetsParsingConfig.builder()
                    .extractionRange("extraction_range")
                    .flattenHierarchicalTables(true)
                    .generateAdditionalMetadata(true)
                    .includeHiddenCells(true)
                    .addSheetName("string")
                    .specialization("specialization")
                    .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                    .useExperimentalProcessing(true)
                    .build()
            )
            .configuration(
                SheetsParsingConfig.builder()
                    .extractionRange("extraction_range")
                    .flattenHierarchicalTables(true)
                    .generateAdditionalMetadata(true)
                    .includeHiddenCells(true)
                    .addSheetName("string")
                    .specialization("specialization")
                    .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                    .useExperimentalProcessing(true)
                    .build()
            )
            .configurationId("cfg-11111111-2222-3333-4444-555555555555")
            .addWebhookConfiguration(
                SheetCreateParams.WebhookConfiguration.builder()
                    .addWebhookEvent(
                        SheetCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                    )
                    .addWebhookEvent(
                        SheetCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                    )
                    .webhookHeaders(
                        SheetCreateParams.WebhookConfiguration.WebhookHeaders.builder()
                            .putAdditionalProperty("Authorization", JsonValue.from("Bearer sk-..."))
                            .build()
                    )
                    .webhookOutputFormat("json")
                    .webhookSigningSecret("whsec_...")
                    .webhookUrl("https://example.com/webhooks/llamacloud")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SheetCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    SheetsParsingConfig.builder()
                        .extractionRange("extraction_range")
                        .flattenHierarchicalTables(true)
                        .generateAdditionalMetadata(true)
                        .includeHiddenCells(true)
                        .addSheetName("string")
                        .specialization("specialization")
                        .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                        .useExperimentalProcessing(true)
                        .build()
                )
                .configuration(
                    SheetsParsingConfig.builder()
                        .extractionRange("extraction_range")
                        .flattenHierarchicalTables(true)
                        .generateAdditionalMetadata(true)
                        .includeHiddenCells(true)
                        .addSheetName("string")
                        .specialization("specialization")
                        .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                        .useExperimentalProcessing(true)
                        .build()
                )
                .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                .addWebhookConfiguration(
                    SheetCreateParams.WebhookConfiguration.builder()
                        .addWebhookEvent(
                            SheetCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                        )
                        .addWebhookEvent(
                            SheetCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                        )
                        .webhookHeaders(
                            SheetCreateParams.WebhookConfiguration.WebhookHeaders.builder()
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
            SheetCreateParams.builder().fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            SheetCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    SheetsParsingConfig.builder()
                        .extractionRange("extraction_range")
                        .flattenHierarchicalTables(true)
                        .generateAdditionalMetadata(true)
                        .includeHiddenCells(true)
                        .addSheetName("string")
                        .specialization("specialization")
                        .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                        .useExperimentalProcessing(true)
                        .build()
                )
                .configuration(
                    SheetsParsingConfig.builder()
                        .extractionRange("extraction_range")
                        .flattenHierarchicalTables(true)
                        .generateAdditionalMetadata(true)
                        .includeHiddenCells(true)
                        .addSheetName("string")
                        .specialization("specialization")
                        .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                        .useExperimentalProcessing(true)
                        .build()
                )
                .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                .addWebhookConfiguration(
                    SheetCreateParams.WebhookConfiguration.builder()
                        .addWebhookEvent(
                            SheetCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                        )
                        .addWebhookEvent(
                            SheetCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                        )
                        .webhookHeaders(
                            SheetCreateParams.WebhookConfiguration.WebhookHeaders.builder()
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

        val body = params._body()

        assertThat(body.fileId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.config())
            .contains(
                SheetsParsingConfig.builder()
                    .extractionRange("extraction_range")
                    .flattenHierarchicalTables(true)
                    .generateAdditionalMetadata(true)
                    .includeHiddenCells(true)
                    .addSheetName("string")
                    .specialization("specialization")
                    .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                    .useExperimentalProcessing(true)
                    .build()
            )
        assertThat(body.configuration())
            .contains(
                SheetsParsingConfig.builder()
                    .extractionRange("extraction_range")
                    .flattenHierarchicalTables(true)
                    .generateAdditionalMetadata(true)
                    .includeHiddenCells(true)
                    .addSheetName("string")
                    .specialization("specialization")
                    .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                    .useExperimentalProcessing(true)
                    .build()
            )
        assertThat(body.configurationId()).contains("cfg-11111111-2222-3333-4444-555555555555")
        assertThat(body.webhookConfigurations().getOrNull())
            .containsExactly(
                SheetCreateParams.WebhookConfiguration.builder()
                    .addWebhookEvent(
                        SheetCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                    )
                    .addWebhookEvent(
                        SheetCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                    )
                    .webhookHeaders(
                        SheetCreateParams.WebhookConfiguration.WebhookHeaders.builder()
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
    fun bodyWithoutOptionalFields() {
        val params =
            SheetCreateParams.builder().fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()

        assertThat(body.fileId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
