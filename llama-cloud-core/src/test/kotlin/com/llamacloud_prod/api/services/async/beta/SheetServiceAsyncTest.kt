// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.beta.sheets.SheetCreateParams
import com.llamacloud_prod.api.models.beta.sheets.SheetDeleteJobParams
import com.llamacloud_prod.api.models.beta.sheets.SheetGetParams
import com.llamacloud_prod.api.models.beta.sheets.SheetGetResultTableParams
import com.llamacloud_prod.api.models.beta.sheets.SheetsParsingConfig
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SheetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sheetServiceAsync = client.beta().sheets()

        val sheetsJobFuture =
            sheetServiceAsync.create(
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
            )

        val sheetsJob = sheetsJobFuture.get()
        sheetsJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sheetServiceAsync = client.beta().sheets()

        val pageFuture = sheetServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteJob() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sheetServiceAsync = client.beta().sheets()

        val responseFuture =
            sheetServiceAsync.deleteJob(
                SheetDeleteJobParams.builder()
                    .spreadsheetJobId("spreadsheet_job_id")
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
        val sheetServiceAsync = client.beta().sheets()

        val sheetsJobFuture =
            sheetServiceAsync.get(
                SheetGetParams.builder()
                    .spreadsheetJobId("spreadsheet_job_id")
                    .addExpand("string")
                    .includeResults(true)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val sheetsJob = sheetsJobFuture.get()
        sheetsJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getResultTable() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sheetServiceAsync = client.beta().sheets()

        val presignedUrlFuture =
            sheetServiceAsync.getResultTable(
                SheetGetResultTableParams.builder()
                    .spreadsheetJobId("spreadsheet_job_id")
                    .regionId("region_id")
                    .regionType(SheetGetResultTableParams.RegionType.CELL_METADATA)
                    .expiresAtSeconds(0L)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val presignedUrl = presignedUrlFuture.get()
        presignedUrl.validate()
    }
}
