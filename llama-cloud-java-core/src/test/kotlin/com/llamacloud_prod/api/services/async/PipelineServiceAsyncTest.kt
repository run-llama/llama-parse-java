// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.parsing.FailPageMode
import com.llamacloud_prod.api.models.parsing.ParsingLanguages
import com.llamacloud_prod.api.models.parsing.ParsingMode
import com.llamacloud_prod.api.models.pipelines.AutoTransformConfig
import com.llamacloud_prod.api.models.pipelines.AzureOpenAIEmbedding
import com.llamacloud_prod.api.models.pipelines.AzureOpenAIEmbeddingConfig
import com.llamacloud_prod.api.models.pipelines.DataSinkCreate
import com.llamacloud_prod.api.models.pipelines.LlamaParseParameters
import com.llamacloud_prod.api.models.pipelines.MetadataFilters
import com.llamacloud_prod.api.models.pipelines.PipelineCreate
import com.llamacloud_prod.api.models.pipelines.PipelineCreateParams
import com.llamacloud_prod.api.models.pipelines.PipelineGetStatusParams
import com.llamacloud_prod.api.models.pipelines.PipelineListParams
import com.llamacloud_prod.api.models.pipelines.PipelineMetadataConfig
import com.llamacloud_prod.api.models.pipelines.PipelineRetrieveParams
import com.llamacloud_prod.api.models.pipelines.PipelineType
import com.llamacloud_prod.api.models.pipelines.PipelineUpdateParams
import com.llamacloud_prod.api.models.pipelines.PipelineUpsertParams
import com.llamacloud_prod.api.models.pipelines.PresetRetrievalParams
import com.llamacloud_prod.api.models.pipelines.RetrievalMode
import com.llamacloud_prod.api.models.pipelines.SparseModelConfig
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PipelineServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pipelineServiceAsync = client.pipelines()

        val pipelineFuture =
            pipelineServiceAsync.create(
                PipelineCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pipelineCreate(
                        PipelineCreate.builder()
                            .name("x")
                            .dataSink(
                                DataSinkCreate.builder()
                                    .component(
                                        DataSinkCreate.Component.UnionMember0.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .name("name")
                                    .sinkType(DataSinkCreate.SinkType.PINECONE)
                                    .build()
                            )
                            .dataSinkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .embeddingConfig(
                                AzureOpenAIEmbeddingConfig.builder()
                                    .component(
                                        AzureOpenAIEmbedding.builder()
                                            .additionalKwargs(
                                                AzureOpenAIEmbedding.AdditionalKwargs.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .apiBase("api_base")
                                            .apiKey("api_key")
                                            .apiVersion("api_version")
                                            .azureDeployment("azure_deployment")
                                            .azureEndpoint("azure_endpoint")
                                            .className("class_name")
                                            .defaultHeaders(
                                                AzureOpenAIEmbedding.DefaultHeaders.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .dimensions(0L)
                                            .embedBatchSize(1L)
                                            .maxRetries(0L)
                                            .modelName("model_name")
                                            .numWorkers(0L)
                                            .reuseClient(true)
                                            .timeout(0.0)
                                            .build()
                                    )
                                    .type(AzureOpenAIEmbeddingConfig.Type.AZURE_EMBEDDING)
                                    .build()
                            )
                            .embeddingModelConfigId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .llamaParseParameters(
                                LlamaParseParameters.builder()
                                    .adaptiveLongTable(true)
                                    .aggressiveTableExtraction(true)
                                    .annotateLinks(true)
                                    .autoMode(true)
                                    .autoModeConfigurationJson("auto_mode_configuration_json")
                                    .autoModeTriggerOnImageInPage(true)
                                    .autoModeTriggerOnRegexpInPage(
                                        "auto_mode_trigger_on_regexp_in_page"
                                    )
                                    .autoModeTriggerOnTableInPage(true)
                                    .autoModeTriggerOnTextInPage(
                                        "auto_mode_trigger_on_text_in_page"
                                    )
                                    .azureOpenAIApiVersion("azure_openai_api_version")
                                    .azureOpenAIDeploymentName("azure_openai_deployment_name")
                                    .azureOpenAIEndpoint("azure_openai_endpoint")
                                    .azureOpenAIKey("azure_openai_key")
                                    .bboxBottom(0.0)
                                    .bboxLeft(0.0)
                                    .bboxRight(0.0)
                                    .bboxTop(0.0)
                                    .boundingBox("bounding_box")
                                    .compactMarkdownTable(true)
                                    .complementalFormattingInstruction(
                                        "complemental_formatting_instruction"
                                    )
                                    .contentGuidelineInstruction("content_guideline_instruction")
                                    .continuousMode(true)
                                    .disableImageExtraction(true)
                                    .disableOcr(true)
                                    .disableReconstruction(true)
                                    .doNotCache(true)
                                    .doNotUnrollColumns(true)
                                    .enableCostOptimizer(true)
                                    .extractCharts(true)
                                    .extractLayout(true)
                                    .extractPrintedPageNumber(true)
                                    .fastMode(true)
                                    .formattingInstruction("formatting_instruction")
                                    .gpt4oApiKey("gpt4o_api_key")
                                    .gpt4oMode(true)
                                    .guessXlsxSheetName(true)
                                    .hideFooters(true)
                                    .hideHeaders(true)
                                    .highResOcr(true)
                                    .htmlMakeAllElementsVisible(true)
                                    .htmlRemoveFixedElements(true)
                                    .htmlRemoveNavigationElements(true)
                                    .httpProxy("http_proxy")
                                    .ignoreDocumentElementsForLayoutDetection(true)
                                    .addImagesToSave(LlamaParseParameters.ImagesToSave.SCREENSHOT)
                                    .inlineImagesInMarkdown(true)
                                    .inputS3Path("input_s3_path")
                                    .inputS3Region("input_s3_region")
                                    .inputUrl("input_url")
                                    .internalIsScreenshotJob(true)
                                    .invalidateCache(true)
                                    .isFormattingInstruction(true)
                                    .jobTimeoutExtraTimePerPageInSeconds(0.0)
                                    .jobTimeoutInSeconds(0.0)
                                    .keepPageSeparatorWhenMergingTables(true)
                                    .addLanguage(ParsingLanguages.AF)
                                    .layoutAware(true)
                                    .lineLevelBoundingBox(true)
                                    .markdownTableMultilineHeaderSeparator(
                                        "markdown_table_multiline_header_separator"
                                    )
                                    .maxPages(0L)
                                    .maxPagesEnforced(0L)
                                    .mergeTablesAcrossPagesInMarkdown(true)
                                    .model("model")
                                    .outlinedTableExtraction(true)
                                    .outputPdfOfDocument(true)
                                    .outputS3PathPrefix("output_s3_path_prefix")
                                    .outputS3Region("output_s3_region")
                                    .outputTablesAsHtml(true)
                                    .pageErrorTolerance(0.0)
                                    .pageFooterPrefix("page_footer_prefix")
                                    .pageFooterSuffix("page_footer_suffix")
                                    .pageHeaderPrefix("page_header_prefix")
                                    .pageHeaderSuffix("page_header_suffix")
                                    .pagePrefix("page_prefix")
                                    .pageSeparator("page_separator")
                                    .pageSuffix("page_suffix")
                                    .parseMode(ParsingMode.PARSE_PAGE_WITHOUT_LLM)
                                    .parsingInstruction("parsing_instruction")
                                    .preciseBoundingBox(true)
                                    .premiumMode(true)
                                    .presentationOutOfBoundsContent(true)
                                    .presentationSkipEmbeddedData(true)
                                    .preserveLayoutAlignmentAcrossPages(true)
                                    .preserveVerySmallText(true)
                                    .preset("preset")
                                    .priority(LlamaParseParameters.Priority.LOW)
                                    .projectId("project_id")
                                    .removeHiddenText(true)
                                    .replaceFailedPageMode(FailPageMode.RAW_TEXT)
                                    .replaceFailedPageWithErrorMessagePrefix(
                                        "replace_failed_page_with_error_message_prefix"
                                    )
                                    .replaceFailedPageWithErrorMessageSuffix(
                                        "replace_failed_page_with_error_message_suffix"
                                    )
                                    .saveImages(true)
                                    .skipDiagonalText(true)
                                    .specializedChartParsingAgentic(true)
                                    .specializedChartParsingEfficient(true)
                                    .specializedChartParsingPlus(true)
                                    .specializedImageParsing(true)
                                    .spreadsheetExtractSubTables(true)
                                    .spreadsheetForceFormulaComputation(true)
                                    .spreadsheetIncludeHiddenSheets(true)
                                    .strictModeBuggyFont(true)
                                    .strictModeImageExtraction(true)
                                    .strictModeImageOcr(true)
                                    .strictModeReconstruction(true)
                                    .structuredOutput(true)
                                    .structuredOutputJsonSchema("structured_output_json_schema")
                                    .structuredOutputJsonSchemaName(
                                        "structured_output_json_schema_name"
                                    )
                                    .systemPrompt("system_prompt")
                                    .systemPromptAppend("system_prompt_append")
                                    .takeScreenshot(true)
                                    .targetPages("target_pages")
                                    .tier("tier")
                                    .useVendorMultimodalModel(true)
                                    .userPrompt("user_prompt")
                                    .vendorMultimodalApiKey("vendor_multimodal_api_key")
                                    .vendorMultimodalModelName("vendor_multimodal_model_name")
                                    .version("version")
                                    .addWebhookConfiguration(
                                        LlamaParseParameters.WebhookConfiguration.builder()
                                            .addWebhookEvent(
                                                LlamaParseParameters.WebhookConfiguration
                                                    .WebhookEvent
                                                    .PARSE_SUCCESS
                                            )
                                            .addWebhookEvent(
                                                LlamaParseParameters.WebhookConfiguration
                                                    .WebhookEvent
                                                    .PARSE_ERROR
                                            )
                                            .webhookHeaders(
                                                LlamaParseParameters.WebhookConfiguration
                                                    .WebhookHeaders
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
                                    .webhookUrl("webhook_url")
                                    .build()
                            )
                            .managedPipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .metadataConfig(
                                PipelineMetadataConfig.builder()
                                    .addExcludedEmbedMetadataKey("string")
                                    .addExcludedLlmMetadataKey("string")
                                    .build()
                            )
                            .pipelineType(PipelineType.PLAYGROUND)
                            .presetRetrievalParameters(
                                PresetRetrievalParams.builder()
                                    .alpha(0.0)
                                    .className("class_name")
                                    .denseSimilarityCutoff(0.0)
                                    .denseSimilarityTopK(1L)
                                    .enableReranking(true)
                                    .filesTopK(1L)
                                    .rerankTopN(1L)
                                    .retrievalMode(RetrievalMode.CHUNKS)
                                    .retrieveImageNodes(true)
                                    .retrievePageFigureNodes(true)
                                    .retrievePageScreenshotNodes(true)
                                    .searchFilters(
                                        MetadataFilters.builder()
                                            .addFilter(
                                                MetadataFilters.Filter.MetadataFilter.builder()
                                                    .key("key")
                                                    .value(0.0)
                                                    .operator(
                                                        MetadataFilters.Filter.MetadataFilter
                                                            .Operator
                                                            .EQUALS
                                                    )
                                                    .build()
                                            )
                                            .condition(MetadataFilters.Condition.AND)
                                            .build()
                                    )
                                    .searchFiltersInferenceSchema(
                                        PresetRetrievalParams.SearchFiltersInferenceSchema.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf("foo" to "bar")),
                                            )
                                            .build()
                                    )
                                    .sparseSimilarityTopK(1L)
                                    .build()
                            )
                            .sparseModelConfig(
                                SparseModelConfig.builder()
                                    .className("class_name")
                                    .modelType(SparseModelConfig.ModelType.SPLADE)
                                    .build()
                            )
                            .status("status")
                            .transformConfig(
                                AutoTransformConfig.builder()
                                    .chunkOverlap(0L)
                                    .chunkSize(1L)
                                    .mode(AutoTransformConfig.Mode.AUTO)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pipelineServiceAsync = client.pipelines()

        val pipelineFuture =
            pipelineServiceAsync.retrieve(
                PipelineRetrieveParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .query("x")
                    .alpha(0.0)
                    .className("class_name")
                    .denseSimilarityCutoff(0.0)
                    .denseSimilarityTopK(1L)
                    .enableReranking(true)
                    .filesTopK(1L)
                    .rerankTopN(1L)
                    .retrievalMode(RetrievalMode.CHUNKS)
                    .retrieveImageNodes(true)
                    .retrievePageFigureNodes(true)
                    .retrievePageScreenshotNodes(true)
                    .searchFilters(
                        MetadataFilters.builder()
                            .addFilter(
                                MetadataFilters.Filter.MetadataFilter.builder()
                                    .key("key")
                                    .value(0.0)
                                    .operator(MetadataFilters.Filter.MetadataFilter.Operator.EQUALS)
                                    .build()
                            )
                            .condition(MetadataFilters.Condition.AND)
                            .build()
                    )
                    .searchFiltersInferenceSchema(
                        PipelineRetrieveParams.SearchFiltersInferenceSchema.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .sparseSimilarityTopK(1L)
                    .build()
            )

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pipelineServiceAsync = client.pipelines()

        val pipelineFuture =
            pipelineServiceAsync.update(
                PipelineUpdateParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataSink(
                        DataSinkCreate.builder()
                            .component(
                                DataSinkCreate.Component.UnionMember0.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .name("name")
                            .sinkType(DataSinkCreate.SinkType.PINECONE)
                            .build()
                    )
                    .dataSinkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .embeddingConfig(
                        AzureOpenAIEmbeddingConfig.builder()
                            .component(
                                AzureOpenAIEmbedding.builder()
                                    .additionalKwargs(
                                        AzureOpenAIEmbedding.AdditionalKwargs.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .apiBase("api_base")
                                    .apiKey("api_key")
                                    .apiVersion("api_version")
                                    .azureDeployment("azure_deployment")
                                    .azureEndpoint("azure_endpoint")
                                    .className("class_name")
                                    .defaultHeaders(
                                        AzureOpenAIEmbedding.DefaultHeaders.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .dimensions(0L)
                                    .embedBatchSize(1L)
                                    .maxRetries(0L)
                                    .modelName("model_name")
                                    .numWorkers(0L)
                                    .reuseClient(true)
                                    .timeout(0.0)
                                    .build()
                            )
                            .type(AzureOpenAIEmbeddingConfig.Type.AZURE_EMBEDDING)
                            .build()
                    )
                    .embeddingModelConfigId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .llamaParseParameters(
                        LlamaParseParameters.builder()
                            .adaptiveLongTable(true)
                            .aggressiveTableExtraction(true)
                            .annotateLinks(true)
                            .autoMode(true)
                            .autoModeConfigurationJson("auto_mode_configuration_json")
                            .autoModeTriggerOnImageInPage(true)
                            .autoModeTriggerOnRegexpInPage("auto_mode_trigger_on_regexp_in_page")
                            .autoModeTriggerOnTableInPage(true)
                            .autoModeTriggerOnTextInPage("auto_mode_trigger_on_text_in_page")
                            .azureOpenAIApiVersion("azure_openai_api_version")
                            .azureOpenAIDeploymentName("azure_openai_deployment_name")
                            .azureOpenAIEndpoint("azure_openai_endpoint")
                            .azureOpenAIKey("azure_openai_key")
                            .bboxBottom(0.0)
                            .bboxLeft(0.0)
                            .bboxRight(0.0)
                            .bboxTop(0.0)
                            .boundingBox("bounding_box")
                            .compactMarkdownTable(true)
                            .complementalFormattingInstruction(
                                "complemental_formatting_instruction"
                            )
                            .contentGuidelineInstruction("content_guideline_instruction")
                            .continuousMode(true)
                            .disableImageExtraction(true)
                            .disableOcr(true)
                            .disableReconstruction(true)
                            .doNotCache(true)
                            .doNotUnrollColumns(true)
                            .enableCostOptimizer(true)
                            .extractCharts(true)
                            .extractLayout(true)
                            .extractPrintedPageNumber(true)
                            .fastMode(true)
                            .formattingInstruction("formatting_instruction")
                            .gpt4oApiKey("gpt4o_api_key")
                            .gpt4oMode(true)
                            .guessXlsxSheetName(true)
                            .hideFooters(true)
                            .hideHeaders(true)
                            .highResOcr(true)
                            .htmlMakeAllElementsVisible(true)
                            .htmlRemoveFixedElements(true)
                            .htmlRemoveNavigationElements(true)
                            .httpProxy("http_proxy")
                            .ignoreDocumentElementsForLayoutDetection(true)
                            .addImagesToSave(LlamaParseParameters.ImagesToSave.SCREENSHOT)
                            .inlineImagesInMarkdown(true)
                            .inputS3Path("input_s3_path")
                            .inputS3Region("input_s3_region")
                            .inputUrl("input_url")
                            .internalIsScreenshotJob(true)
                            .invalidateCache(true)
                            .isFormattingInstruction(true)
                            .jobTimeoutExtraTimePerPageInSeconds(0.0)
                            .jobTimeoutInSeconds(0.0)
                            .keepPageSeparatorWhenMergingTables(true)
                            .addLanguage(ParsingLanguages.AF)
                            .layoutAware(true)
                            .lineLevelBoundingBox(true)
                            .markdownTableMultilineHeaderSeparator(
                                "markdown_table_multiline_header_separator"
                            )
                            .maxPages(0L)
                            .maxPagesEnforced(0L)
                            .mergeTablesAcrossPagesInMarkdown(true)
                            .model("model")
                            .outlinedTableExtraction(true)
                            .outputPdfOfDocument(true)
                            .outputS3PathPrefix("output_s3_path_prefix")
                            .outputS3Region("output_s3_region")
                            .outputTablesAsHtml(true)
                            .pageErrorTolerance(0.0)
                            .pageFooterPrefix("page_footer_prefix")
                            .pageFooterSuffix("page_footer_suffix")
                            .pageHeaderPrefix("page_header_prefix")
                            .pageHeaderSuffix("page_header_suffix")
                            .pagePrefix("page_prefix")
                            .pageSeparator("page_separator")
                            .pageSuffix("page_suffix")
                            .parseMode(ParsingMode.PARSE_PAGE_WITHOUT_LLM)
                            .parsingInstruction("parsing_instruction")
                            .preciseBoundingBox(true)
                            .premiumMode(true)
                            .presentationOutOfBoundsContent(true)
                            .presentationSkipEmbeddedData(true)
                            .preserveLayoutAlignmentAcrossPages(true)
                            .preserveVerySmallText(true)
                            .preset("preset")
                            .priority(LlamaParseParameters.Priority.LOW)
                            .projectId("project_id")
                            .removeHiddenText(true)
                            .replaceFailedPageMode(FailPageMode.RAW_TEXT)
                            .replaceFailedPageWithErrorMessagePrefix(
                                "replace_failed_page_with_error_message_prefix"
                            )
                            .replaceFailedPageWithErrorMessageSuffix(
                                "replace_failed_page_with_error_message_suffix"
                            )
                            .saveImages(true)
                            .skipDiagonalText(true)
                            .specializedChartParsingAgentic(true)
                            .specializedChartParsingEfficient(true)
                            .specializedChartParsingPlus(true)
                            .specializedImageParsing(true)
                            .spreadsheetExtractSubTables(true)
                            .spreadsheetForceFormulaComputation(true)
                            .spreadsheetIncludeHiddenSheets(true)
                            .strictModeBuggyFont(true)
                            .strictModeImageExtraction(true)
                            .strictModeImageOcr(true)
                            .strictModeReconstruction(true)
                            .structuredOutput(true)
                            .structuredOutputJsonSchema("structured_output_json_schema")
                            .structuredOutputJsonSchemaName("structured_output_json_schema_name")
                            .systemPrompt("system_prompt")
                            .systemPromptAppend("system_prompt_append")
                            .takeScreenshot(true)
                            .targetPages("target_pages")
                            .tier("tier")
                            .useVendorMultimodalModel(true)
                            .userPrompt("user_prompt")
                            .vendorMultimodalApiKey("vendor_multimodal_api_key")
                            .vendorMultimodalModelName("vendor_multimodal_model_name")
                            .version("version")
                            .addWebhookConfiguration(
                                LlamaParseParameters.WebhookConfiguration.builder()
                                    .addWebhookEvent(
                                        LlamaParseParameters.WebhookConfiguration.WebhookEvent
                                            .PARSE_SUCCESS
                                    )
                                    .addWebhookEvent(
                                        LlamaParseParameters.WebhookConfiguration.WebhookEvent
                                            .PARSE_ERROR
                                    )
                                    .webhookHeaders(
                                        LlamaParseParameters.WebhookConfiguration.WebhookHeaders
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
                            .webhookUrl("webhook_url")
                            .build()
                    )
                    .managedPipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadataConfig(
                        PipelineMetadataConfig.builder()
                            .addExcludedEmbedMetadataKey("string")
                            .addExcludedLlmMetadataKey("string")
                            .build()
                    )
                    .name("name")
                    .presetRetrievalParameters(
                        PresetRetrievalParams.builder()
                            .alpha(0.0)
                            .className("class_name")
                            .denseSimilarityCutoff(0.0)
                            .denseSimilarityTopK(1L)
                            .enableReranking(true)
                            .filesTopK(1L)
                            .rerankTopN(1L)
                            .retrievalMode(RetrievalMode.CHUNKS)
                            .retrieveImageNodes(true)
                            .retrievePageFigureNodes(true)
                            .retrievePageScreenshotNodes(true)
                            .searchFilters(
                                MetadataFilters.builder()
                                    .addFilter(
                                        MetadataFilters.Filter.MetadataFilter.builder()
                                            .key("key")
                                            .value(0.0)
                                            .operator(
                                                MetadataFilters.Filter.MetadataFilter.Operator
                                                    .EQUALS
                                            )
                                            .build()
                                    )
                                    .condition(MetadataFilters.Condition.AND)
                                    .build()
                            )
                            .searchFiltersInferenceSchema(
                                PresetRetrievalParams.SearchFiltersInferenceSchema.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .sparseSimilarityTopK(1L)
                            .build()
                    )
                    .sparseModelConfig(
                        SparseModelConfig.builder()
                            .className("class_name")
                            .modelType(SparseModelConfig.ModelType.SPLADE)
                            .build()
                    )
                    .status("status")
                    .transformConfig(
                        AutoTransformConfig.builder()
                            .chunkOverlap(0L)
                            .chunkSize(1L)
                            .mode(AutoTransformConfig.Mode.AUTO)
                            .build()
                    )
                    .build()
            )

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pipelineServiceAsync = client.pipelines()

        val pipelinesFuture =
            pipelineServiceAsync.list(
                PipelineListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pipelineName("pipeline_name")
                    .pipelineType(PipelineType.PLAYGROUND)
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectName("project_name")
                    .build()
            )

        val pipelines = pipelinesFuture.get()
        pipelines.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pipelineServiceAsync = client.pipelines()

        val future = pipelineServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pipelineServiceAsync = client.pipelines()

        val pipelineFuture = pipelineServiceAsync.get("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pipelineServiceAsync = client.pipelines()

        val managedIngestionStatusResponseFuture =
            pipelineServiceAsync.getStatus(
                PipelineGetStatusParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fullDetails(true)
                    .build()
            )

        val managedIngestionStatusResponse = managedIngestionStatusResponseFuture.get()
        managedIngestionStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pipelineServiceAsync = client.pipelines()

        val pipelineFuture =
            pipelineServiceAsync.upsert(
                PipelineUpsertParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pipelineCreate(
                        PipelineCreate.builder()
                            .name("x")
                            .dataSink(
                                DataSinkCreate.builder()
                                    .component(
                                        DataSinkCreate.Component.UnionMember0.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .name("name")
                                    .sinkType(DataSinkCreate.SinkType.PINECONE)
                                    .build()
                            )
                            .dataSinkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .embeddingConfig(
                                AzureOpenAIEmbeddingConfig.builder()
                                    .component(
                                        AzureOpenAIEmbedding.builder()
                                            .additionalKwargs(
                                                AzureOpenAIEmbedding.AdditionalKwargs.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .apiBase("api_base")
                                            .apiKey("api_key")
                                            .apiVersion("api_version")
                                            .azureDeployment("azure_deployment")
                                            .azureEndpoint("azure_endpoint")
                                            .className("class_name")
                                            .defaultHeaders(
                                                AzureOpenAIEmbedding.DefaultHeaders.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .dimensions(0L)
                                            .embedBatchSize(1L)
                                            .maxRetries(0L)
                                            .modelName("model_name")
                                            .numWorkers(0L)
                                            .reuseClient(true)
                                            .timeout(0.0)
                                            .build()
                                    )
                                    .type(AzureOpenAIEmbeddingConfig.Type.AZURE_EMBEDDING)
                                    .build()
                            )
                            .embeddingModelConfigId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .llamaParseParameters(
                                LlamaParseParameters.builder()
                                    .adaptiveLongTable(true)
                                    .aggressiveTableExtraction(true)
                                    .annotateLinks(true)
                                    .autoMode(true)
                                    .autoModeConfigurationJson("auto_mode_configuration_json")
                                    .autoModeTriggerOnImageInPage(true)
                                    .autoModeTriggerOnRegexpInPage(
                                        "auto_mode_trigger_on_regexp_in_page"
                                    )
                                    .autoModeTriggerOnTableInPage(true)
                                    .autoModeTriggerOnTextInPage(
                                        "auto_mode_trigger_on_text_in_page"
                                    )
                                    .azureOpenAIApiVersion("azure_openai_api_version")
                                    .azureOpenAIDeploymentName("azure_openai_deployment_name")
                                    .azureOpenAIEndpoint("azure_openai_endpoint")
                                    .azureOpenAIKey("azure_openai_key")
                                    .bboxBottom(0.0)
                                    .bboxLeft(0.0)
                                    .bboxRight(0.0)
                                    .bboxTop(0.0)
                                    .boundingBox("bounding_box")
                                    .compactMarkdownTable(true)
                                    .complementalFormattingInstruction(
                                        "complemental_formatting_instruction"
                                    )
                                    .contentGuidelineInstruction("content_guideline_instruction")
                                    .continuousMode(true)
                                    .disableImageExtraction(true)
                                    .disableOcr(true)
                                    .disableReconstruction(true)
                                    .doNotCache(true)
                                    .doNotUnrollColumns(true)
                                    .enableCostOptimizer(true)
                                    .extractCharts(true)
                                    .extractLayout(true)
                                    .extractPrintedPageNumber(true)
                                    .fastMode(true)
                                    .formattingInstruction("formatting_instruction")
                                    .gpt4oApiKey("gpt4o_api_key")
                                    .gpt4oMode(true)
                                    .guessXlsxSheetName(true)
                                    .hideFooters(true)
                                    .hideHeaders(true)
                                    .highResOcr(true)
                                    .htmlMakeAllElementsVisible(true)
                                    .htmlRemoveFixedElements(true)
                                    .htmlRemoveNavigationElements(true)
                                    .httpProxy("http_proxy")
                                    .ignoreDocumentElementsForLayoutDetection(true)
                                    .addImagesToSave(LlamaParseParameters.ImagesToSave.SCREENSHOT)
                                    .inlineImagesInMarkdown(true)
                                    .inputS3Path("input_s3_path")
                                    .inputS3Region("input_s3_region")
                                    .inputUrl("input_url")
                                    .internalIsScreenshotJob(true)
                                    .invalidateCache(true)
                                    .isFormattingInstruction(true)
                                    .jobTimeoutExtraTimePerPageInSeconds(0.0)
                                    .jobTimeoutInSeconds(0.0)
                                    .keepPageSeparatorWhenMergingTables(true)
                                    .addLanguage(ParsingLanguages.AF)
                                    .layoutAware(true)
                                    .lineLevelBoundingBox(true)
                                    .markdownTableMultilineHeaderSeparator(
                                        "markdown_table_multiline_header_separator"
                                    )
                                    .maxPages(0L)
                                    .maxPagesEnforced(0L)
                                    .mergeTablesAcrossPagesInMarkdown(true)
                                    .model("model")
                                    .outlinedTableExtraction(true)
                                    .outputPdfOfDocument(true)
                                    .outputS3PathPrefix("output_s3_path_prefix")
                                    .outputS3Region("output_s3_region")
                                    .outputTablesAsHtml(true)
                                    .pageErrorTolerance(0.0)
                                    .pageFooterPrefix("page_footer_prefix")
                                    .pageFooterSuffix("page_footer_suffix")
                                    .pageHeaderPrefix("page_header_prefix")
                                    .pageHeaderSuffix("page_header_suffix")
                                    .pagePrefix("page_prefix")
                                    .pageSeparator("page_separator")
                                    .pageSuffix("page_suffix")
                                    .parseMode(ParsingMode.PARSE_PAGE_WITHOUT_LLM)
                                    .parsingInstruction("parsing_instruction")
                                    .preciseBoundingBox(true)
                                    .premiumMode(true)
                                    .presentationOutOfBoundsContent(true)
                                    .presentationSkipEmbeddedData(true)
                                    .preserveLayoutAlignmentAcrossPages(true)
                                    .preserveVerySmallText(true)
                                    .preset("preset")
                                    .priority(LlamaParseParameters.Priority.LOW)
                                    .projectId("project_id")
                                    .removeHiddenText(true)
                                    .replaceFailedPageMode(FailPageMode.RAW_TEXT)
                                    .replaceFailedPageWithErrorMessagePrefix(
                                        "replace_failed_page_with_error_message_prefix"
                                    )
                                    .replaceFailedPageWithErrorMessageSuffix(
                                        "replace_failed_page_with_error_message_suffix"
                                    )
                                    .saveImages(true)
                                    .skipDiagonalText(true)
                                    .specializedChartParsingAgentic(true)
                                    .specializedChartParsingEfficient(true)
                                    .specializedChartParsingPlus(true)
                                    .specializedImageParsing(true)
                                    .spreadsheetExtractSubTables(true)
                                    .spreadsheetForceFormulaComputation(true)
                                    .spreadsheetIncludeHiddenSheets(true)
                                    .strictModeBuggyFont(true)
                                    .strictModeImageExtraction(true)
                                    .strictModeImageOcr(true)
                                    .strictModeReconstruction(true)
                                    .structuredOutput(true)
                                    .structuredOutputJsonSchema("structured_output_json_schema")
                                    .structuredOutputJsonSchemaName(
                                        "structured_output_json_schema_name"
                                    )
                                    .systemPrompt("system_prompt")
                                    .systemPromptAppend("system_prompt_append")
                                    .takeScreenshot(true)
                                    .targetPages("target_pages")
                                    .tier("tier")
                                    .useVendorMultimodalModel(true)
                                    .userPrompt("user_prompt")
                                    .vendorMultimodalApiKey("vendor_multimodal_api_key")
                                    .vendorMultimodalModelName("vendor_multimodal_model_name")
                                    .version("version")
                                    .addWebhookConfiguration(
                                        LlamaParseParameters.WebhookConfiguration.builder()
                                            .addWebhookEvent(
                                                LlamaParseParameters.WebhookConfiguration
                                                    .WebhookEvent
                                                    .PARSE_SUCCESS
                                            )
                                            .addWebhookEvent(
                                                LlamaParseParameters.WebhookConfiguration
                                                    .WebhookEvent
                                                    .PARSE_ERROR
                                            )
                                            .webhookHeaders(
                                                LlamaParseParameters.WebhookConfiguration
                                                    .WebhookHeaders
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
                                    .webhookUrl("webhook_url")
                                    .build()
                            )
                            .managedPipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .metadataConfig(
                                PipelineMetadataConfig.builder()
                                    .addExcludedEmbedMetadataKey("string")
                                    .addExcludedLlmMetadataKey("string")
                                    .build()
                            )
                            .pipelineType(PipelineType.PLAYGROUND)
                            .presetRetrievalParameters(
                                PresetRetrievalParams.builder()
                                    .alpha(0.0)
                                    .className("class_name")
                                    .denseSimilarityCutoff(0.0)
                                    .denseSimilarityTopK(1L)
                                    .enableReranking(true)
                                    .filesTopK(1L)
                                    .rerankTopN(1L)
                                    .retrievalMode(RetrievalMode.CHUNKS)
                                    .retrieveImageNodes(true)
                                    .retrievePageFigureNodes(true)
                                    .retrievePageScreenshotNodes(true)
                                    .searchFilters(
                                        MetadataFilters.builder()
                                            .addFilter(
                                                MetadataFilters.Filter.MetadataFilter.builder()
                                                    .key("key")
                                                    .value(0.0)
                                                    .operator(
                                                        MetadataFilters.Filter.MetadataFilter
                                                            .Operator
                                                            .EQUALS
                                                    )
                                                    .build()
                                            )
                                            .condition(MetadataFilters.Condition.AND)
                                            .build()
                                    )
                                    .searchFiltersInferenceSchema(
                                        PresetRetrievalParams.SearchFiltersInferenceSchema.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf("foo" to "bar")),
                                            )
                                            .build()
                                    )
                                    .sparseSimilarityTopK(1L)
                                    .build()
                            )
                            .sparseModelConfig(
                                SparseModelConfig.builder()
                                    .className("class_name")
                                    .modelType(SparseModelConfig.ModelType.SPLADE)
                                    .build()
                            )
                            .status("status")
                            .transformConfig(
                                AutoTransformConfig.builder()
                                    .chunkOverlap(0L)
                                    .chunkSize(1L)
                                    .mode(AutoTransformConfig.Mode.AUTO)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val pipeline = pipelineFuture.get()
        pipeline.validate()
    }
}
