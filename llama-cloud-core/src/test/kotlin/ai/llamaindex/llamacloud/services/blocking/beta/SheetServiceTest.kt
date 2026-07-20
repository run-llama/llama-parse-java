// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.beta.sheets.SheetCreateParams
import ai.llamaindex.llamacloud.models.beta.sheets.SheetDeleteJobParams
import ai.llamaindex.llamacloud.models.beta.sheets.SheetGetParams
import ai.llamaindex.llamacloud.models.beta.sheets.SheetGetResultTableParams
import ai.llamaindex.llamacloud.models.beta.sheets.SheetsParsingConfig
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SheetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val sheetService = client.beta().sheets()

        val sheetsJob =
            sheetService.create(
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

        sheetsJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val sheetService = client.beta().sheets()

        val page = sheetService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteJob() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val sheetService = client.beta().sheets()

        val response =
            sheetService.deleteJob(
                SheetDeleteJobParams.builder()
                    .spreadsheetJobId("spreadsheet_job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val sheetService = client.beta().sheets()

        val sheetsJob =
            sheetService.get(
                SheetGetParams.builder()
                    .spreadsheetJobId("spreadsheet_job_id")
                    .addExpand("string")
                    .includeResults(true)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        sheetsJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getResultTable() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val sheetService = client.beta().sheets()

        val presignedUrl =
            sheetService.getResultTable(
                SheetGetResultTableParams.builder()
                    .spreadsheetJobId("spreadsheet_job_id")
                    .regionId("region_id")
                    .regionType(SheetGetResultTableParams.RegionType.CELL_METADATA)
                    .expiresAtSeconds(0L)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        presignedUrl.validate()
    }
}
