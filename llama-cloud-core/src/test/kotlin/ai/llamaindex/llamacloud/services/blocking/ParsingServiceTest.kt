// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.parsing.ParsingCreateParams
import ai.llamaindex.llamacloud.models.parsing.ParsingGetParams
import ai.llamaindex.llamacloud.models.parsing.ParsingLanguages
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ParsingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val parsingService = client.parsing()

        val parsing =
            parsingService.create(
                ParsingCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tier(ParsingCreateParams.Tier.FAST)
                    .version(ParsingCreateParams.Version.LATEST)
                    .agenticOptions(
                        ParsingCreateParams.AgenticOptions.builder()
                            .customPrompt("custom_prompt")
                            .build()
                    )
                    .clientName("client_name")
                    .configurationId("configuration_id")
                    .cropBox(
                        ParsingCreateParams.CropBox.builder()
                            .bottom(0.0)
                            .left(0.0)
                            .right(0.0)
                            .top(0.0)
                            .build()
                    )
                    .disableCache(true)
                    .fastOptions(JsonValue.from(mapOf<String, Any>()))
                    .fileId("file_id")
                    .httpProxy("https:")
                    .inputOptions(
                        ParsingCreateParams.InputOptions.builder()
                            .html(
                                ParsingCreateParams.InputOptions.Html.builder()
                                    .makeAllElementsVisible(true)
                                    .removeFixedElements(true)
                                    .removeNavigationElements(true)
                                    .build()
                            )
                            .image(
                                ParsingCreateParams.InputOptions.Image.builder()
                                    .cameraPhotoCorrection(true)
                                    .build()
                            )
                            .pdf(JsonValue.from(mapOf<String, Any>()))
                            .presentation(
                                ParsingCreateParams.InputOptions.Presentation.builder()
                                    .outOfBoundsContent(true)
                                    .skipEmbeddedData(true)
                                    .build()
                            )
                            .spreadsheet(
                                ParsingCreateParams.InputOptions.Spreadsheet.builder()
                                    .detectSubTablesInSheets(true)
                                    .forceFormulaComputationInSheets(true)
                                    .includeHiddenSheets(true)
                                    .build()
                            )
                            .build()
                    )
                    .outputOptions(
                        ParsingCreateParams.OutputOptions.builder()
                            .additionalOutputs(
                                listOf("stripped_md", "concatenated_stripped_txt", "word_bbox")
                            )
                            .extractPrintedPageNumber(true)
                            .granularBboxes(
                                listOf(
                                    ParsingCreateParams.OutputOptions.GranularBbox.WORD,
                                    ParsingCreateParams.OutputOptions.GranularBbox.LINE,
                                    ParsingCreateParams.OutputOptions.GranularBbox.CELL,
                                )
                            )
                            .addImagesToSave(
                                ParsingCreateParams.OutputOptions.ImagesToSave.EMBEDDED
                            )
                            .markdown(
                                ParsingCreateParams.OutputOptions.Markdown.builder()
                                    .annotateLinks(true)
                                    .inlineImages(true)
                                    .tables(
                                        ParsingCreateParams.OutputOptions.Markdown.Tables.builder()
                                            .compactMarkdownTables(true)
                                            .markdownTableMultilineSeparator(
                                                "markdown_table_multiline_separator"
                                            )
                                            .mergeContinuedTables(true)
                                            .outputTablesAsMarkdown(true)
                                            .build()
                                    )
                                    .build()
                            )
                            .spatialText(
                                ParsingCreateParams.OutputOptions.SpatialText.builder()
                                    .doNotUnrollColumns(true)
                                    .preserveLayoutAlignmentAcrossPages(true)
                                    .preserveVerySmallText(true)
                                    .build()
                            )
                            .tablesAsSpreadsheet(
                                ParsingCreateParams.OutputOptions.TablesAsSpreadsheet.builder()
                                    .enable(true)
                                    .guessSheetName(true)
                                    .build()
                            )
                            .build()
                    )
                    .pageRanges(
                        ParsingCreateParams.PageRanges.builder()
                            .maxPages(1L)
                            .targetPages("target_pages")
                            .build()
                    )
                    .processingControl(
                        ParsingCreateParams.ProcessingControl.builder()
                            .jobFailureConditions(
                                ParsingCreateParams.ProcessingControl.JobFailureConditions.builder()
                                    .allowedPageFailureRatio(1.0)
                                    .failOnBuggyFont(true)
                                    .failOnImageExtractionError(true)
                                    .failOnImageOcrError(true)
                                    .failOnMarkdownReconstructionError(true)
                                    .build()
                            )
                            .timeouts(
                                ParsingCreateParams.ProcessingControl.Timeouts.builder()
                                    .baseInSeconds(1L)
                                    .extraTimePerPageInSeconds(1L)
                                    .build()
                            )
                            .build()
                    )
                    .processingOptions(
                        ParsingCreateParams.ProcessingOptions.builder()
                            .aggressiveTableExtraction(true)
                            .addAutoModeConfiguration(
                                ParsingCreateParams.ProcessingOptions.AutoModeConfiguration
                                    .builder()
                                    .parsingConf(
                                        ParsingCreateParams.ProcessingOptions.AutoModeConfiguration
                                            .ParsingConf
                                            .builder()
                                            .adaptiveLongTable(true)
                                            .aggressiveTableExtraction(true)
                                            .cropBox(
                                                ParsingCreateParams.ProcessingOptions
                                                    .AutoModeConfiguration
                                                    .ParsingConf
                                                    .CropBox
                                                    .builder()
                                                    .bottom(0.0)
                                                    .left(0.0)
                                                    .right(0.0)
                                                    .top(0.0)
                                                    .build()
                                            )
                                            .customPrompt("custom_prompt")
                                            .extractLayout(true)
                                            .highResOcr(true)
                                            .ignore(
                                                ParsingCreateParams.ProcessingOptions
                                                    .AutoModeConfiguration
                                                    .ParsingConf
                                                    .Ignore
                                                    .builder()
                                                    .ignoreDiagonalText(true)
                                                    .ignoreHiddenText(true)
                                                    .build()
                                            )
                                            .language("language")
                                            .outlinedTableExtraction(true)
                                            .presentation(
                                                ParsingCreateParams.ProcessingOptions
                                                    .AutoModeConfiguration
                                                    .ParsingConf
                                                    .Presentation
                                                    .builder()
                                                    .outOfBoundsContent(true)
                                                    .skipEmbeddedData(true)
                                                    .build()
                                            )
                                            .spatialText(
                                                ParsingCreateParams.ProcessingOptions
                                                    .AutoModeConfiguration
                                                    .ParsingConf
                                                    .SpatialText
                                                    .builder()
                                                    .doNotUnrollColumns(true)
                                                    .preserveLayoutAlignmentAcrossPages(true)
                                                    .preserveVerySmallText(true)
                                                    .build()
                                            )
                                            .specializedChartParsing(
                                                ParsingCreateParams.ProcessingOptions
                                                    .AutoModeConfiguration
                                                    .ParsingConf
                                                    .SpecializedChartParsing
                                                    .AGENTIC
                                            )
                                            .tier(
                                                ParsingCreateParams.ProcessingOptions
                                                    .AutoModeConfiguration
                                                    .ParsingConf
                                                    .Tier
                                                    .AGENTIC
                                            )
                                            .version(
                                                ParsingCreateParams.ProcessingOptions
                                                    .AutoModeConfiguration
                                                    .ParsingConf
                                                    .Version
                                                    .LATEST
                                            )
                                            .build()
                                    )
                                    .filenameMatchGlob("*.txt")
                                    .addFilenameMatchGlobList("string")
                                    .filenameRegexp("filename_regexp")
                                    .filenameRegexpMode("filename_regexp_mode")
                                    .fullPageImageInPage(true)
                                    .fullPageImageInPageThreshold(0.0)
                                    .imageInPage(true)
                                    .layoutElementInPage("layout_element_in_page")
                                    .layoutElementInPageConfidenceThreshold(0.0)
                                    .pageContainsAtLeastNCharts(0L)
                                    .pageContainsAtLeastNImages(0L)
                                    .pageContainsAtLeastNLayoutElements(0L)
                                    .pageContainsAtLeastNLines(0L)
                                    .pageContainsAtLeastNLinks(0L)
                                    .pageContainsAtLeastNNumbers(0L)
                                    .pageContainsAtLeastNPercentNumbers(0L)
                                    .pageContainsAtLeastNTables(0L)
                                    .pageContainsAtLeastNWords(0L)
                                    .pageContainsAtMostNCharts(0L)
                                    .pageContainsAtMostNImages(0L)
                                    .pageContainsAtMostNLayoutElements(0L)
                                    .pageContainsAtMostNLines(0L)
                                    .pageContainsAtMostNLinks(0L)
                                    .pageContainsAtMostNNumbers(0L)
                                    .pageContainsAtMostNPercentNumbers(0L)
                                    .pageContainsAtMostNTables(0L)
                                    .pageContainsAtMostNWords(0L)
                                    .pageLongerThanNChars(0L)
                                    .pageMdError(true)
                                    .pageShorterThanNChars(0L)
                                    .regexpInPage("regexp_in_page")
                                    .regexpInPageMode("regexp_in_page_mode")
                                    .tableInPage(true)
                                    .textInPage("text_in_page")
                                    .triggerMode("trigger_mode")
                                    .build()
                            )
                            .confidenceScoreEffort(
                                ParsingCreateParams.ProcessingOptions.ConfidenceScoreEffort.HIGH
                            )
                            .costOptimizer(
                                ParsingCreateParams.ProcessingOptions.CostOptimizer.builder()
                                    .enable(true)
                                    .build()
                            )
                            .disableHeuristics(true)
                            .forms(ParsingCreateParams.ProcessingOptions.Forms.ENRICH)
                            .ignore(
                                ParsingCreateParams.ProcessingOptions.Ignore.builder()
                                    .ignoreDiagonalText(true)
                                    .ignoreHiddenText(true)
                                    .ignoreTextInImage(true)
                                    .build()
                            )
                            .ocrParameters(
                                ParsingCreateParams.ProcessingOptions.OcrParameters.builder()
                                    .addLanguage(ParsingLanguages.ABQ)
                                    .build()
                            )
                            .specializedChartParsing(
                                ParsingCreateParams.ProcessingOptions.SpecializedChartParsing
                                    .AGENTIC
                            )
                            .build()
                    )
                    .sourceUrl("https:")
                    .userMetadata(
                        ParsingCreateParams.UserMetadata.builder()
                            .putAdditionalProperty("owner", JsonValue.from("jerry"))
                            .putAdditionalProperty("team", JsonValue.from("research"))
                            .build()
                    )
                    .addWebhookConfigurationId("whc-...")
                    .addWebhookConfigurationId("whc-...")
                    .addWebhookConfiguration(
                        ParsingCreateParams.WebhookConfiguration.builder()
                            .addWebhookEvent("parse.success")
                            .addWebhookEvent("parse.error")
                            .webhookHeaders(
                                ParsingCreateParams.WebhookConfiguration.WebhookHeaders.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .webhookOutputFormat(
                                ParsingCreateParams.WebhookConfiguration.WebhookOutputFormat.JSON
                            )
                            .webhookSigningSecret("webhook_signing_secret")
                            .webhookUrl("https:")
                            .build()
                    )
                    .build()
            )

        parsing.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val parsingService = client.parsing()

        val page = parsingService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val parsingService = client.parsing()

        val parsing =
            parsingService.get(
                ParsingGetParams.builder()
                    .jobId("job_id")
                    .addExpand("string")
                    .imageFilenames("image_filenames")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        parsing.validate()
    }
}
