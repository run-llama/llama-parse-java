// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.BaseDeserializer
import com.llamacloud_prod.api.core.BaseSerializer
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.allMaxBy
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.getOrThrow
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Parse a file by file ID or URL.
 *
 * Provide either `file_id` (a previously uploaded file) or `source_url` (a publicly accessible
 * URL). Configure parsing with options like `tier`, `target_pages`, and `lang`.
 *
 * ## Tiers
 * - `fast` — rule-based, cheapest, no AI
 * - `cost_effective` — balanced speed and quality
 * - `agentic` — full AI-powered parsing
 * - `agentic_plus` — premium AI with specialized features
 *
 * The job runs asynchronously. Poll `GET /parse/{job_id}` with `expand=text` or `expand=markdown`
 * to retrieve results.
 */
class ParsingCreateParams
private constructor(
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * Parsing tier: 'fast' (rule-based, cheapest), 'cost_effective' (balanced), 'agentic'
     * (AI-powered with custom prompts), or 'agentic_plus' (premium AI with highest accuracy)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tier(): Tier = body.tier()

    /**
     * Version for the selected tier. Use `latest`, or pin one of that tier's dated versions.
     *
     * Current `latest` by tier:
     * - `fast`: `2025-12-11`
     * - `cost_effective`: `2026-06-18`
     * - `agentic`: `2026-06-18`
     * - `agentic_plus`: `2026-06-18`
     *
     * Full list: `GET /api/v2/parse/versions`.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Version = body.version()

    /**
     * Options for AI-powered parsing tiers (cost_effective, agentic, agentic_plus).
     *
     * These options customize how the AI processes and interprets document content. Only applicable
     * when using non-fast tiers.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agenticOptions(): Optional<AgenticOptions> = body.agenticOptions()

    /**
     * Identifier for the client/application making the request. Used for analytics and debugging.
     * Example: 'my-app-v2'
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientName(): Optional<String> = body.clientName()

    /**
     * ID of a saved parse configuration. When set, `tier` and `version` default to the saved
     * configuration's values — omit them or pass `'configured'`.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configurationId(): Optional<String> = body.configurationId()

    /**
     * Crop boundaries to process only a portion of each page. Values are ratios 0-1 from page edges
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cropBox(): Optional<CropBox> = body.cropBox()

    /**
     * Bypass result caching and force re-parsing. Use when document content may have changed or you
     * need fresh results
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disableCache(): Optional<Boolean> = body.disableCache()

    /**
     * Options for fast tier parsing (rule-based, no AI).
     *
     * Fast tier uses deterministic algorithms for text extraction without AI enhancement. It's the
     * fastest and most cost-effective option, best suited for simple documents with standard
     * layouts. Currently has no configurable options but reserved for future expansion.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = parsingCreateParams.fastOptions().convert(MyClass.class);
     * ```
     */
    fun _fastOptions(): JsonValue = body._fastOptions()

    /**
     * ID of an existing file in the project to parse. Mutually exclusive with source_url
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileId(): Optional<String> = body.fileId()

    /**
     * HTTP/HTTPS proxy for fetching source_url. Ignored if using file_id
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun httpProxy(): Optional<String> = body.httpProxy()

    /**
     * Format-specific options (HTML, PDF, spreadsheet, presentation). Applied based on detected
     * input file type
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputOptions(): Optional<InputOptions> = body.inputOptions()

    /**
     * Output formatting options for markdown, text, and extracted images
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputOptions(): Optional<OutputOptions> = body.outputOptions()

    /**
     * Page selection: limit total pages or specify exact pages to process
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageRanges(): Optional<PageRanges> = body.pageRanges()

    /**
     * Job execution controls including timeouts and failure thresholds
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun processingControl(): Optional<ProcessingControl> = body.processingControl()

    /**
     * Document processing options including OCR, table extraction, and chart parsing
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun processingOptions(): Optional<ProcessingOptions> = body.processingOptions()

    /**
     * Public URL of the document to parse. Mutually exclusive with file_id
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceUrl(): Optional<String> = body.sourceUrl()

    /**
     * Webhook endpoints for job status notifications. Multiple webhooks can be configured for
     * different events or services
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookConfigurations(): Optional<List<WebhookConfiguration>> = body.webhookConfigurations()

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tier(): JsonField<Tier> = body._tier()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Version> = body._version()

    /**
     * Returns the raw JSON value of [agenticOptions].
     *
     * Unlike [agenticOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agenticOptions(): JsonField<AgenticOptions> = body._agenticOptions()

    /**
     * Returns the raw JSON value of [clientName].
     *
     * Unlike [clientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientName(): JsonField<String> = body._clientName()

    /**
     * Returns the raw JSON value of [configurationId].
     *
     * Unlike [configurationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _configurationId(): JsonField<String> = body._configurationId()

    /**
     * Returns the raw JSON value of [cropBox].
     *
     * Unlike [cropBox], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cropBox(): JsonField<CropBox> = body._cropBox()

    /**
     * Returns the raw JSON value of [disableCache].
     *
     * Unlike [disableCache], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _disableCache(): JsonField<Boolean> = body._disableCache()

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fileId(): JsonField<String> = body._fileId()

    /**
     * Returns the raw JSON value of [httpProxy].
     *
     * Unlike [httpProxy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _httpProxy(): JsonField<String> = body._httpProxy()

    /**
     * Returns the raw JSON value of [inputOptions].
     *
     * Unlike [inputOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inputOptions(): JsonField<InputOptions> = body._inputOptions()

    /**
     * Returns the raw JSON value of [outputOptions].
     *
     * Unlike [outputOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outputOptions(): JsonField<OutputOptions> = body._outputOptions()

    /**
     * Returns the raw JSON value of [pageRanges].
     *
     * Unlike [pageRanges], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageRanges(): JsonField<PageRanges> = body._pageRanges()

    /**
     * Returns the raw JSON value of [processingControl].
     *
     * Unlike [processingControl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _processingControl(): JsonField<ProcessingControl> = body._processingControl()

    /**
     * Returns the raw JSON value of [processingOptions].
     *
     * Unlike [processingOptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _processingOptions(): JsonField<ProcessingOptions> = body._processingOptions()

    /**
     * Returns the raw JSON value of [sourceUrl].
     *
     * Unlike [sourceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sourceUrl(): JsonField<String> = body._sourceUrl()

    /**
     * Returns the raw JSON value of [webhookConfigurations].
     *
     * Unlike [webhookConfigurations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookConfigurations(): JsonField<List<WebhookConfiguration>> =
        body._webhookConfigurations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ParsingCreateParams].
         *
         * The following fields are required:
         * ```java
         * .tier()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParsingCreateParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(parsingCreateParams: ParsingCreateParams) = apply {
            organizationId = parsingCreateParams.organizationId
            projectId = parsingCreateParams.projectId
            body = parsingCreateParams.body.toBuilder()
            additionalHeaders = parsingCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = parsingCreateParams.additionalQueryParams.toBuilder()
        }

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [tier]
         * - [version]
         * - [agenticOptions]
         * - [clientName]
         * - [configurationId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Parsing tier: 'fast' (rule-based, cheapest), 'cost_effective' (balanced), 'agentic'
         * (AI-powered with custom prompts), or 'agentic_plus' (premium AI with highest accuracy)
         */
        fun tier(tier: Tier) = apply { body.tier(tier) }

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [Tier] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tier(tier: JsonField<Tier>) = apply { body.tier(tier) }

        /**
         * Sets [tier] to an arbitrary [String].
         *
         * You should usually call [tier] with a well-typed [Tier] constant instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tier(value: String) = apply { body.tier(value) }

        /**
         * Version for the selected tier. Use `latest`, or pin one of that tier's dated versions.
         *
         * Current `latest` by tier:
         * - `fast`: `2025-12-11`
         * - `cost_effective`: `2026-06-18`
         * - `agentic`: `2026-06-18`
         * - `agentic_plus`: `2026-06-18`
         *
         * Full list: `GET /api/v2/parse/versions`.
         */
        fun version(version: Version) = apply { body.version(version) }

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Version] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Version>) = apply { body.version(version) }

        /**
         * Sets [version] to an arbitrary [String].
         *
         * You should usually call [version] with a well-typed [Version] constant instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(value: String) = apply { body.version(value) }

        /**
         * Options for AI-powered parsing tiers (cost_effective, agentic, agentic_plus).
         *
         * These options customize how the AI processes and interprets document content. Only
         * applicable when using non-fast tiers.
         */
        fun agenticOptions(agenticOptions: AgenticOptions?) = apply {
            body.agenticOptions(agenticOptions)
        }

        /** Alias for calling [Builder.agenticOptions] with `agenticOptions.orElse(null)`. */
        fun agenticOptions(agenticOptions: Optional<AgenticOptions>) =
            agenticOptions(agenticOptions.getOrNull())

        /**
         * Sets [Builder.agenticOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agenticOptions] with a well-typed [AgenticOptions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agenticOptions(agenticOptions: JsonField<AgenticOptions>) = apply {
            body.agenticOptions(agenticOptions)
        }

        /**
         * Identifier for the client/application making the request. Used for analytics and
         * debugging. Example: 'my-app-v2'
         */
        fun clientName(clientName: String?) = apply { body.clientName(clientName) }

        /** Alias for calling [Builder.clientName] with `clientName.orElse(null)`. */
        fun clientName(clientName: Optional<String>) = clientName(clientName.getOrNull())

        /**
         * Sets [Builder.clientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientName(clientName: JsonField<String>) = apply { body.clientName(clientName) }

        /**
         * ID of a saved parse configuration. When set, `tier` and `version` default to the saved
         * configuration's values — omit them or pass `'configured'`.
         */
        fun configurationId(configurationId: String?) = apply {
            body.configurationId(configurationId)
        }

        /** Alias for calling [Builder.configurationId] with `configurationId.orElse(null)`. */
        fun configurationId(configurationId: Optional<String>) =
            configurationId(configurationId.getOrNull())

        /**
         * Sets [Builder.configurationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configurationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configurationId(configurationId: JsonField<String>) = apply {
            body.configurationId(configurationId)
        }

        /**
         * Crop boundaries to process only a portion of each page. Values are ratios 0-1 from page
         * edges
         */
        fun cropBox(cropBox: CropBox) = apply { body.cropBox(cropBox) }

        /**
         * Sets [Builder.cropBox] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cropBox] with a well-typed [CropBox] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cropBox(cropBox: JsonField<CropBox>) = apply { body.cropBox(cropBox) }

        /**
         * Bypass result caching and force re-parsing. Use when document content may have changed or
         * you need fresh results
         */
        fun disableCache(disableCache: Boolean?) = apply { body.disableCache(disableCache) }

        /**
         * Alias for [Builder.disableCache].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun disableCache(disableCache: Boolean) = disableCache(disableCache as Boolean?)

        /** Alias for calling [Builder.disableCache] with `disableCache.orElse(null)`. */
        fun disableCache(disableCache: Optional<Boolean>) = disableCache(disableCache.getOrNull())

        /**
         * Sets [Builder.disableCache] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disableCache] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disableCache(disableCache: JsonField<Boolean>) = apply {
            body.disableCache(disableCache)
        }

        /**
         * Options for fast tier parsing (rule-based, no AI).
         *
         * Fast tier uses deterministic algorithms for text extraction without AI enhancement. It's
         * the fastest and most cost-effective option, best suited for simple documents with
         * standard layouts. Currently has no configurable options but reserved for future
         * expansion.
         */
        fun fastOptions(fastOptions: JsonValue) = apply { body.fastOptions(fastOptions) }

        /** ID of an existing file in the project to parse. Mutually exclusive with source_url */
        fun fileId(fileId: String?) = apply { body.fileId(fileId) }

        /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
        fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { body.fileId(fileId) }

        /** HTTP/HTTPS proxy for fetching source_url. Ignored if using file_id */
        fun httpProxy(httpProxy: String?) = apply { body.httpProxy(httpProxy) }

        /** Alias for calling [Builder.httpProxy] with `httpProxy.orElse(null)`. */
        fun httpProxy(httpProxy: Optional<String>) = httpProxy(httpProxy.getOrNull())

        /**
         * Sets [Builder.httpProxy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.httpProxy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun httpProxy(httpProxy: JsonField<String>) = apply { body.httpProxy(httpProxy) }

        /**
         * Format-specific options (HTML, PDF, spreadsheet, presentation). Applied based on detected
         * input file type
         */
        fun inputOptions(inputOptions: InputOptions) = apply { body.inputOptions(inputOptions) }

        /**
         * Sets [Builder.inputOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputOptions] with a well-typed [InputOptions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputOptions(inputOptions: JsonField<InputOptions>) = apply {
            body.inputOptions(inputOptions)
        }

        /** Output formatting options for markdown, text, and extracted images */
        fun outputOptions(outputOptions: OutputOptions) = apply {
            body.outputOptions(outputOptions)
        }

        /**
         * Sets [Builder.outputOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputOptions] with a well-typed [OutputOptions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputOptions(outputOptions: JsonField<OutputOptions>) = apply {
            body.outputOptions(outputOptions)
        }

        /** Page selection: limit total pages or specify exact pages to process */
        fun pageRanges(pageRanges: PageRanges) = apply { body.pageRanges(pageRanges) }

        /**
         * Sets [Builder.pageRanges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageRanges] with a well-typed [PageRanges] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pageRanges(pageRanges: JsonField<PageRanges>) = apply { body.pageRanges(pageRanges) }

        /** Job execution controls including timeouts and failure thresholds */
        fun processingControl(processingControl: ProcessingControl) = apply {
            body.processingControl(processingControl)
        }

        /**
         * Sets [Builder.processingControl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processingControl] with a well-typed [ProcessingControl]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun processingControl(processingControl: JsonField<ProcessingControl>) = apply {
            body.processingControl(processingControl)
        }

        /** Document processing options including OCR, table extraction, and chart parsing */
        fun processingOptions(processingOptions: ProcessingOptions) = apply {
            body.processingOptions(processingOptions)
        }

        /**
         * Sets [Builder.processingOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processingOptions] with a well-typed [ProcessingOptions]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun processingOptions(processingOptions: JsonField<ProcessingOptions>) = apply {
            body.processingOptions(processingOptions)
        }

        /** Public URL of the document to parse. Mutually exclusive with file_id */
        fun sourceUrl(sourceUrl: String?) = apply { body.sourceUrl(sourceUrl) }

        /** Alias for calling [Builder.sourceUrl] with `sourceUrl.orElse(null)`. */
        fun sourceUrl(sourceUrl: Optional<String>) = sourceUrl(sourceUrl.getOrNull())

        /**
         * Sets [Builder.sourceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceUrl(sourceUrl: JsonField<String>) = apply { body.sourceUrl(sourceUrl) }

        /**
         * Webhook endpoints for job status notifications. Multiple webhooks can be configured for
         * different events or services
         */
        fun webhookConfigurations(webhookConfigurations: List<WebhookConfiguration>) = apply {
            body.webhookConfigurations(webhookConfigurations)
        }

        /**
         * Sets [Builder.webhookConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookConfigurations] with a well-typed
         * `List<WebhookConfiguration>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun webhookConfigurations(webhookConfigurations: JsonField<List<WebhookConfiguration>>) =
            apply {
                body.webhookConfigurations(webhookConfigurations)
            }

        /**
         * Adds a single [WebhookConfiguration] to [webhookConfigurations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWebhookConfiguration(webhookConfiguration: WebhookConfiguration) = apply {
            body.addWebhookConfiguration(webhookConfiguration)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ParsingCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .tier()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParsingCreateParams =
            ParsingCreateParams(
                organizationId,
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Unified configuration for parsing with flexible input source.
     *
     * Specify exactly one input source: either an existing file by ID or a URL to fetch. This
     * endpoint consolidates file-based and URL-based parsing into a single interface.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val tier: JsonField<Tier>,
        private val version: JsonField<Version>,
        private val agenticOptions: JsonField<AgenticOptions>,
        private val clientName: JsonField<String>,
        private val configurationId: JsonField<String>,
        private val cropBox: JsonField<CropBox>,
        private val disableCache: JsonField<Boolean>,
        private val fastOptions: JsonValue,
        private val fileId: JsonField<String>,
        private val httpProxy: JsonField<String>,
        private val inputOptions: JsonField<InputOptions>,
        private val outputOptions: JsonField<OutputOptions>,
        private val pageRanges: JsonField<PageRanges>,
        private val processingControl: JsonField<ProcessingControl>,
        private val processingOptions: JsonField<ProcessingOptions>,
        private val sourceUrl: JsonField<String>,
        private val webhookConfigurations: JsonField<List<WebhookConfiguration>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("tier") @ExcludeMissing tier: JsonField<Tier> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Version> = JsonMissing.of(),
            @JsonProperty("agentic_options")
            @ExcludeMissing
            agenticOptions: JsonField<AgenticOptions> = JsonMissing.of(),
            @JsonProperty("client_name")
            @ExcludeMissing
            clientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("configuration_id")
            @ExcludeMissing
            configurationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("crop_box")
            @ExcludeMissing
            cropBox: JsonField<CropBox> = JsonMissing.of(),
            @JsonProperty("disable_cache")
            @ExcludeMissing
            disableCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("fast_options") @ExcludeMissing fastOptions: JsonValue = JsonMissing.of(),
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("http_proxy")
            @ExcludeMissing
            httpProxy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_options")
            @ExcludeMissing
            inputOptions: JsonField<InputOptions> = JsonMissing.of(),
            @JsonProperty("output_options")
            @ExcludeMissing
            outputOptions: JsonField<OutputOptions> = JsonMissing.of(),
            @JsonProperty("page_ranges")
            @ExcludeMissing
            pageRanges: JsonField<PageRanges> = JsonMissing.of(),
            @JsonProperty("processing_control")
            @ExcludeMissing
            processingControl: JsonField<ProcessingControl> = JsonMissing.of(),
            @JsonProperty("processing_options")
            @ExcludeMissing
            processingOptions: JsonField<ProcessingOptions> = JsonMissing.of(),
            @JsonProperty("source_url")
            @ExcludeMissing
            sourceUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_configurations")
            @ExcludeMissing
            webhookConfigurations: JsonField<List<WebhookConfiguration>> = JsonMissing.of(),
        ) : this(
            tier,
            version,
            agenticOptions,
            clientName,
            configurationId,
            cropBox,
            disableCache,
            fastOptions,
            fileId,
            httpProxy,
            inputOptions,
            outputOptions,
            pageRanges,
            processingControl,
            processingOptions,
            sourceUrl,
            webhookConfigurations,
            mutableMapOf(),
        )

        /**
         * Parsing tier: 'fast' (rule-based, cheapest), 'cost_effective' (balanced), 'agentic'
         * (AI-powered with custom prompts), or 'agentic_plus' (premium AI with highest accuracy)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tier(): Tier = tier.getRequired("tier")

        /**
         * Version for the selected tier. Use `latest`, or pin one of that tier's dated versions.
         *
         * Current `latest` by tier:
         * - `fast`: `2025-12-11`
         * - `cost_effective`: `2026-06-18`
         * - `agentic`: `2026-06-18`
         * - `agentic_plus`: `2026-06-18`
         *
         * Full list: `GET /api/v2/parse/versions`.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): Version = version.getRequired("version")

        /**
         * Options for AI-powered parsing tiers (cost_effective, agentic, agentic_plus).
         *
         * These options customize how the AI processes and interprets document content. Only
         * applicable when using non-fast tiers.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun agenticOptions(): Optional<AgenticOptions> =
            agenticOptions.getOptional("agentic_options")

        /**
         * Identifier for the client/application making the request. Used for analytics and
         * debugging. Example: 'my-app-v2'
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun clientName(): Optional<String> = clientName.getOptional("client_name")

        /**
         * ID of a saved parse configuration. When set, `tier` and `version` default to the saved
         * configuration's values — omit them or pass `'configured'`.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun configurationId(): Optional<String> = configurationId.getOptional("configuration_id")

        /**
         * Crop boundaries to process only a portion of each page. Values are ratios 0-1 from page
         * edges
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cropBox(): Optional<CropBox> = cropBox.getOptional("crop_box")

        /**
         * Bypass result caching and force re-parsing. Use when document content may have changed or
         * you need fresh results
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun disableCache(): Optional<Boolean> = disableCache.getOptional("disable_cache")

        /**
         * Options for fast tier parsing (rule-based, no AI).
         *
         * Fast tier uses deterministic algorithms for text extraction without AI enhancement. It's
         * the fastest and most cost-effective option, best suited for simple documents with
         * standard layouts. Currently has no configurable options but reserved for future
         * expansion.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = body.fastOptions().convert(MyClass.class);
         * ```
         */
        @JsonProperty("fast_options") @ExcludeMissing fun _fastOptions(): JsonValue = fastOptions

        /**
         * ID of an existing file in the project to parse. Mutually exclusive with source_url
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileId(): Optional<String> = fileId.getOptional("file_id")

        /**
         * HTTP/HTTPS proxy for fetching source_url. Ignored if using file_id
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun httpProxy(): Optional<String> = httpProxy.getOptional("http_proxy")

        /**
         * Format-specific options (HTML, PDF, spreadsheet, presentation). Applied based on detected
         * input file type
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputOptions(): Optional<InputOptions> = inputOptions.getOptional("input_options")

        /**
         * Output formatting options for markdown, text, and extracted images
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputOptions(): Optional<OutputOptions> = outputOptions.getOptional("output_options")

        /**
         * Page selection: limit total pages or specify exact pages to process
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageRanges(): Optional<PageRanges> = pageRanges.getOptional("page_ranges")

        /**
         * Job execution controls including timeouts and failure thresholds
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun processingControl(): Optional<ProcessingControl> =
            processingControl.getOptional("processing_control")

        /**
         * Document processing options including OCR, table extraction, and chart parsing
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun processingOptions(): Optional<ProcessingOptions> =
            processingOptions.getOptional("processing_options")

        /**
         * Public URL of the document to parse. Mutually exclusive with file_id
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sourceUrl(): Optional<String> = sourceUrl.getOptional("source_url")

        /**
         * Webhook endpoints for job status notifications. Multiple webhooks can be configured for
         * different events or services
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookConfigurations(): Optional<List<WebhookConfiguration>> =
            webhookConfigurations.getOptional("webhook_configurations")

        /**
         * Returns the raw JSON value of [tier].
         *
         * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Tier> = tier

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Version> = version

        /**
         * Returns the raw JSON value of [agenticOptions].
         *
         * Unlike [agenticOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("agentic_options")
        @ExcludeMissing
        fun _agenticOptions(): JsonField<AgenticOptions> = agenticOptions

        /**
         * Returns the raw JSON value of [clientName].
         *
         * Unlike [clientName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_name")
        @ExcludeMissing
        fun _clientName(): JsonField<String> = clientName

        /**
         * Returns the raw JSON value of [configurationId].
         *
         * Unlike [configurationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration_id")
        @ExcludeMissing
        fun _configurationId(): JsonField<String> = configurationId

        /**
         * Returns the raw JSON value of [cropBox].
         *
         * Unlike [cropBox], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("crop_box") @ExcludeMissing fun _cropBox(): JsonField<CropBox> = cropBox

        /**
         * Returns the raw JSON value of [disableCache].
         *
         * Unlike [disableCache], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("disable_cache")
        @ExcludeMissing
        fun _disableCache(): JsonField<Boolean> = disableCache

        /**
         * Returns the raw JSON value of [fileId].
         *
         * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

        /**
         * Returns the raw JSON value of [httpProxy].
         *
         * Unlike [httpProxy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("http_proxy") @ExcludeMissing fun _httpProxy(): JsonField<String> = httpProxy

        /**
         * Returns the raw JSON value of [inputOptions].
         *
         * Unlike [inputOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_options")
        @ExcludeMissing
        fun _inputOptions(): JsonField<InputOptions> = inputOptions

        /**
         * Returns the raw JSON value of [outputOptions].
         *
         * Unlike [outputOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("output_options")
        @ExcludeMissing
        fun _outputOptions(): JsonField<OutputOptions> = outputOptions

        /**
         * Returns the raw JSON value of [pageRanges].
         *
         * Unlike [pageRanges], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_ranges")
        @ExcludeMissing
        fun _pageRanges(): JsonField<PageRanges> = pageRanges

        /**
         * Returns the raw JSON value of [processingControl].
         *
         * Unlike [processingControl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("processing_control")
        @ExcludeMissing
        fun _processingControl(): JsonField<ProcessingControl> = processingControl

        /**
         * Returns the raw JSON value of [processingOptions].
         *
         * Unlike [processingOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("processing_options")
        @ExcludeMissing
        fun _processingOptions(): JsonField<ProcessingOptions> = processingOptions

        /**
         * Returns the raw JSON value of [sourceUrl].
         *
         * Unlike [sourceUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_url") @ExcludeMissing fun _sourceUrl(): JsonField<String> = sourceUrl

        /**
         * Returns the raw JSON value of [webhookConfigurations].
         *
         * Unlike [webhookConfigurations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_configurations")
        @ExcludeMissing
        fun _webhookConfigurations(): JsonField<List<WebhookConfiguration>> = webhookConfigurations

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .tier()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var tier: JsonField<Tier>? = null
            private var version: JsonField<Version>? = null
            private var agenticOptions: JsonField<AgenticOptions> = JsonMissing.of()
            private var clientName: JsonField<String> = JsonMissing.of()
            private var configurationId: JsonField<String> = JsonMissing.of()
            private var cropBox: JsonField<CropBox> = JsonMissing.of()
            private var disableCache: JsonField<Boolean> = JsonMissing.of()
            private var fastOptions: JsonValue = JsonMissing.of()
            private var fileId: JsonField<String> = JsonMissing.of()
            private var httpProxy: JsonField<String> = JsonMissing.of()
            private var inputOptions: JsonField<InputOptions> = JsonMissing.of()
            private var outputOptions: JsonField<OutputOptions> = JsonMissing.of()
            private var pageRanges: JsonField<PageRanges> = JsonMissing.of()
            private var processingControl: JsonField<ProcessingControl> = JsonMissing.of()
            private var processingOptions: JsonField<ProcessingOptions> = JsonMissing.of()
            private var sourceUrl: JsonField<String> = JsonMissing.of()
            private var webhookConfigurations: JsonField<MutableList<WebhookConfiguration>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                tier = body.tier
                version = body.version
                agenticOptions = body.agenticOptions
                clientName = body.clientName
                configurationId = body.configurationId
                cropBox = body.cropBox
                disableCache = body.disableCache
                fastOptions = body.fastOptions
                fileId = body.fileId
                httpProxy = body.httpProxy
                inputOptions = body.inputOptions
                outputOptions = body.outputOptions
                pageRanges = body.pageRanges
                processingControl = body.processingControl
                processingOptions = body.processingOptions
                sourceUrl = body.sourceUrl
                webhookConfigurations = body.webhookConfigurations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Parsing tier: 'fast' (rule-based, cheapest), 'cost_effective' (balanced), 'agentic'
             * (AI-powered with custom prompts), or 'agentic_plus' (premium AI with highest
             * accuracy)
             */
            fun tier(tier: Tier) = tier(JsonField.of(tier))

            /**
             * Sets [Builder.tier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tier] with a well-typed [Tier] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tier(tier: JsonField<Tier>) = apply { this.tier = tier }

            /**
             * Sets [tier] to an arbitrary [String].
             *
             * You should usually call [tier] with a well-typed [Tier] constant instead. This method
             * is primarily for setting the field to an undocumented or not yet supported value.
             */
            fun tier(value: String) = tier(Tier.of(value))

            /**
             * Version for the selected tier. Use `latest`, or pin one of that tier's dated
             * versions.
             *
             * Current `latest` by tier:
             * - `fast`: `2025-12-11`
             * - `cost_effective`: `2026-06-18`
             * - `agentic`: `2026-06-18`
             * - `agentic_plus`: `2026-06-18`
             *
             * Full list: `GET /api/v2/parse/versions`.
             */
            fun version(version: Version) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Version] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<Version>) = apply { this.version = version }

            /**
             * Sets [version] to an arbitrary [String].
             *
             * You should usually call [version] with a well-typed [Version] constant instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun version(value: String) = version(Version.of(value))

            /**
             * Options for AI-powered parsing tiers (cost_effective, agentic, agentic_plus).
             *
             * These options customize how the AI processes and interprets document content. Only
             * applicable when using non-fast tiers.
             */
            fun agenticOptions(agenticOptions: AgenticOptions?) =
                agenticOptions(JsonField.ofNullable(agenticOptions))

            /** Alias for calling [Builder.agenticOptions] with `agenticOptions.orElse(null)`. */
            fun agenticOptions(agenticOptions: Optional<AgenticOptions>) =
                agenticOptions(agenticOptions.getOrNull())

            /**
             * Sets [Builder.agenticOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agenticOptions] with a well-typed [AgenticOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun agenticOptions(agenticOptions: JsonField<AgenticOptions>) = apply {
                this.agenticOptions = agenticOptions
            }

            /**
             * Identifier for the client/application making the request. Used for analytics and
             * debugging. Example: 'my-app-v2'
             */
            fun clientName(clientName: String?) = clientName(JsonField.ofNullable(clientName))

            /** Alias for calling [Builder.clientName] with `clientName.orElse(null)`. */
            fun clientName(clientName: Optional<String>) = clientName(clientName.getOrNull())

            /**
             * Sets [Builder.clientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientName(clientName: JsonField<String>) = apply { this.clientName = clientName }

            /**
             * ID of a saved parse configuration. When set, `tier` and `version` default to the
             * saved configuration's values — omit them or pass `'configured'`.
             */
            fun configurationId(configurationId: String?) =
                configurationId(JsonField.ofNullable(configurationId))

            /** Alias for calling [Builder.configurationId] with `configurationId.orElse(null)`. */
            fun configurationId(configurationId: Optional<String>) =
                configurationId(configurationId.getOrNull())

            /**
             * Sets [Builder.configurationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configurationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun configurationId(configurationId: JsonField<String>) = apply {
                this.configurationId = configurationId
            }

            /**
             * Crop boundaries to process only a portion of each page. Values are ratios 0-1 from
             * page edges
             */
            fun cropBox(cropBox: CropBox) = cropBox(JsonField.of(cropBox))

            /**
             * Sets [Builder.cropBox] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cropBox] with a well-typed [CropBox] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cropBox(cropBox: JsonField<CropBox>) = apply { this.cropBox = cropBox }

            /**
             * Bypass result caching and force re-parsing. Use when document content may have
             * changed or you need fresh results
             */
            fun disableCache(disableCache: Boolean?) =
                disableCache(JsonField.ofNullable(disableCache))

            /**
             * Alias for [Builder.disableCache].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun disableCache(disableCache: Boolean) = disableCache(disableCache as Boolean?)

            /** Alias for calling [Builder.disableCache] with `disableCache.orElse(null)`. */
            fun disableCache(disableCache: Optional<Boolean>) =
                disableCache(disableCache.getOrNull())

            /**
             * Sets [Builder.disableCache] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disableCache] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun disableCache(disableCache: JsonField<Boolean>) = apply {
                this.disableCache = disableCache
            }

            /**
             * Options for fast tier parsing (rule-based, no AI).
             *
             * Fast tier uses deterministic algorithms for text extraction without AI enhancement.
             * It's the fastest and most cost-effective option, best suited for simple documents
             * with standard layouts. Currently has no configurable options but reserved for future
             * expansion.
             */
            fun fastOptions(fastOptions: JsonValue) = apply { this.fastOptions = fastOptions }

            /**
             * ID of an existing file in the project to parse. Mutually exclusive with source_url
             */
            fun fileId(fileId: String?) = fileId(JsonField.ofNullable(fileId))

            /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
            fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

            /**
             * Sets [Builder.fileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

            /** HTTP/HTTPS proxy for fetching source_url. Ignored if using file_id */
            fun httpProxy(httpProxy: String?) = httpProxy(JsonField.ofNullable(httpProxy))

            /** Alias for calling [Builder.httpProxy] with `httpProxy.orElse(null)`. */
            fun httpProxy(httpProxy: Optional<String>) = httpProxy(httpProxy.getOrNull())

            /**
             * Sets [Builder.httpProxy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.httpProxy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun httpProxy(httpProxy: JsonField<String>) = apply { this.httpProxy = httpProxy }

            /**
             * Format-specific options (HTML, PDF, spreadsheet, presentation). Applied based on
             * detected input file type
             */
            fun inputOptions(inputOptions: InputOptions) = inputOptions(JsonField.of(inputOptions))

            /**
             * Sets [Builder.inputOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputOptions] with a well-typed [InputOptions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputOptions(inputOptions: JsonField<InputOptions>) = apply {
                this.inputOptions = inputOptions
            }

            /** Output formatting options for markdown, text, and extracted images */
            fun outputOptions(outputOptions: OutputOptions) =
                outputOptions(JsonField.of(outputOptions))

            /**
             * Sets [Builder.outputOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputOptions] with a well-typed [OutputOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputOptions(outputOptions: JsonField<OutputOptions>) = apply {
                this.outputOptions = outputOptions
            }

            /** Page selection: limit total pages or specify exact pages to process */
            fun pageRanges(pageRanges: PageRanges) = pageRanges(JsonField.of(pageRanges))

            /**
             * Sets [Builder.pageRanges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageRanges] with a well-typed [PageRanges] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageRanges(pageRanges: JsonField<PageRanges>) = apply {
                this.pageRanges = pageRanges
            }

            /** Job execution controls including timeouts and failure thresholds */
            fun processingControl(processingControl: ProcessingControl) =
                processingControl(JsonField.of(processingControl))

            /**
             * Sets [Builder.processingControl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processingControl] with a well-typed
             * [ProcessingControl] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun processingControl(processingControl: JsonField<ProcessingControl>) = apply {
                this.processingControl = processingControl
            }

            /** Document processing options including OCR, table extraction, and chart parsing */
            fun processingOptions(processingOptions: ProcessingOptions) =
                processingOptions(JsonField.of(processingOptions))

            /**
             * Sets [Builder.processingOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processingOptions] with a well-typed
             * [ProcessingOptions] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun processingOptions(processingOptions: JsonField<ProcessingOptions>) = apply {
                this.processingOptions = processingOptions
            }

            /** Public URL of the document to parse. Mutually exclusive with file_id */
            fun sourceUrl(sourceUrl: String?) = sourceUrl(JsonField.ofNullable(sourceUrl))

            /** Alias for calling [Builder.sourceUrl] with `sourceUrl.orElse(null)`. */
            fun sourceUrl(sourceUrl: Optional<String>) = sourceUrl(sourceUrl.getOrNull())

            /**
             * Sets [Builder.sourceUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceUrl(sourceUrl: JsonField<String>) = apply { this.sourceUrl = sourceUrl }

            /**
             * Webhook endpoints for job status notifications. Multiple webhooks can be configured
             * for different events or services
             */
            fun webhookConfigurations(webhookConfigurations: List<WebhookConfiguration>) =
                webhookConfigurations(JsonField.of(webhookConfigurations))

            /**
             * Sets [Builder.webhookConfigurations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookConfigurations] with a well-typed
             * `List<WebhookConfiguration>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun webhookConfigurations(
                webhookConfigurations: JsonField<List<WebhookConfiguration>>
            ) = apply {
                this.webhookConfigurations = webhookConfigurations.map { it.toMutableList() }
            }

            /**
             * Adds a single [WebhookConfiguration] to [webhookConfigurations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWebhookConfiguration(webhookConfiguration: WebhookConfiguration) = apply {
                webhookConfigurations =
                    (webhookConfigurations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("webhookConfigurations", it).add(webhookConfiguration)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .tier()
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("tier", tier),
                    checkRequired("version", version),
                    agenticOptions,
                    clientName,
                    configurationId,
                    cropBox,
                    disableCache,
                    fastOptions,
                    fileId,
                    httpProxy,
                    inputOptions,
                    outputOptions,
                    pageRanges,
                    processingControl,
                    processingOptions,
                    sourceUrl,
                    (webhookConfigurations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            tier()
            version()
            agenticOptions().ifPresent { it.validate() }
            clientName()
            configurationId()
            cropBox().ifPresent { it.validate() }
            disableCache()
            fileId()
            httpProxy()
            inputOptions().ifPresent { it.validate() }
            outputOptions().ifPresent { it.validate() }
            pageRanges().ifPresent { it.validate() }
            processingControl().ifPresent { it.validate() }
            processingOptions().ifPresent { it.validate() }
            sourceUrl()
            webhookConfigurations().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (tier.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0) +
                (agenticOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (clientName.asKnown().isPresent) 1 else 0) +
                (if (configurationId.asKnown().isPresent) 1 else 0) +
                (cropBox.asKnown().getOrNull()?.validity() ?: 0) +
                (if (disableCache.asKnown().isPresent) 1 else 0) +
                (if (fileId.asKnown().isPresent) 1 else 0) +
                (if (httpProxy.asKnown().isPresent) 1 else 0) +
                (inputOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (outputOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (pageRanges.asKnown().getOrNull()?.validity() ?: 0) +
                (processingControl.asKnown().getOrNull()?.validity() ?: 0) +
                (processingOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sourceUrl.asKnown().isPresent) 1 else 0) +
                (webhookConfigurations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                tier == other.tier &&
                version == other.version &&
                agenticOptions == other.agenticOptions &&
                clientName == other.clientName &&
                configurationId == other.configurationId &&
                cropBox == other.cropBox &&
                disableCache == other.disableCache &&
                fastOptions == other.fastOptions &&
                fileId == other.fileId &&
                httpProxy == other.httpProxy &&
                inputOptions == other.inputOptions &&
                outputOptions == other.outputOptions &&
                pageRanges == other.pageRanges &&
                processingControl == other.processingControl &&
                processingOptions == other.processingOptions &&
                sourceUrl == other.sourceUrl &&
                webhookConfigurations == other.webhookConfigurations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                tier,
                version,
                agenticOptions,
                clientName,
                configurationId,
                cropBox,
                disableCache,
                fastOptions,
                fileId,
                httpProxy,
                inputOptions,
                outputOptions,
                pageRanges,
                processingControl,
                processingOptions,
                sourceUrl,
                webhookConfigurations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{tier=$tier, version=$version, agenticOptions=$agenticOptions, clientName=$clientName, configurationId=$configurationId, cropBox=$cropBox, disableCache=$disableCache, fastOptions=$fastOptions, fileId=$fileId, httpProxy=$httpProxy, inputOptions=$inputOptions, outputOptions=$outputOptions, pageRanges=$pageRanges, processingControl=$processingControl, processingOptions=$processingOptions, sourceUrl=$sourceUrl, webhookConfigurations=$webhookConfigurations, additionalProperties=$additionalProperties}"
    }

    /**
     * Parsing tier: 'fast' (rule-based, cheapest), 'cost_effective' (balanced), 'agentic'
     * (AI-powered with custom prompts), or 'agentic_plus' (premium AI with highest accuracy)
     */
    class Tier @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FAST = of("fast")

            @JvmField val COST_EFFECTIVE = of("cost_effective")

            @JvmField val AGENTIC = of("agentic")

            @JvmField val AGENTIC_PLUS = of("agentic_plus")

            @JvmStatic fun of(value: String) = Tier(JsonField.of(value))
        }

        /** An enum containing [Tier]'s known values. */
        enum class Known {
            FAST,
            COST_EFFECTIVE,
            AGENTIC,
            AGENTIC_PLUS,
        }

        /**
         * An enum containing [Tier]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Tier] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAST,
            COST_EFFECTIVE,
            AGENTIC,
            AGENTIC_PLUS,
            /** An enum member indicating that [Tier] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FAST -> Value.FAST
                COST_EFFECTIVE -> Value.COST_EFFECTIVE
                AGENTIC -> Value.AGENTIC
                AGENTIC_PLUS -> Value.AGENTIC_PLUS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                FAST -> Known.FAST
                COST_EFFECTIVE -> Known.COST_EFFECTIVE
                AGENTIC -> Known.AGENTIC
                AGENTIC_PLUS -> Known.AGENTIC_PLUS
                else -> throw LlamaCloudInvalidDataException("Unknown Tier: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LlamaCloudInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Tier = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Version for the selected tier. Use `latest`, or pin one of that tier's dated versions.
     *
     * Current `latest` by tier:
     * - `fast`: `2025-12-11`
     * - `cost_effective`: `2026-06-18`
     * - `agentic`: `2026-06-18`
     * - `agentic_plus`: `2026-06-18`
     *
     * Full list: `GET /api/v2/parse/versions`.
     */
    class Version @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LATEST = of("latest")

            @JvmField val _2026_06_18 = of("2026-06-18")

            @JvmField val _2025_12_11 = of("2025-12-11")

            @JvmStatic fun of(value: String) = Version(JsonField.of(value))
        }

        /** An enum containing [Version]'s known values. */
        enum class Known {
            LATEST,
            _2026_06_18,
            _2025_12_11,
        }

        /**
         * An enum containing [Version]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Version] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LATEST,
            _2026_06_18,
            _2025_12_11,
            /** An enum member indicating that [Version] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LATEST -> Value.LATEST
                _2026_06_18 -> Value._2026_06_18
                _2025_12_11 -> Value._2025_12_11
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LATEST -> Known.LATEST
                _2026_06_18 -> Known._2026_06_18
                _2025_12_11 -> Known._2025_12_11
                else -> throw LlamaCloudInvalidDataException("Unknown Version: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LlamaCloudInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Version = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Version && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Options for AI-powered parsing tiers (cost_effective, agentic, agentic_plus).
     *
     * These options customize how the AI processes and interprets document content. Only applicable
     * when using non-fast tiers.
     */
    class AgenticOptions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customPrompt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("custom_prompt")
            @ExcludeMissing
            customPrompt: JsonField<String> = JsonMissing.of()
        ) : this(customPrompt, mutableMapOf())

        /**
         * Custom instructions for the AI parser. Use to guide extraction behavior, specify output
         * formatting, or provide domain-specific context. Example: 'Extract financial tables with
         * currency symbols. Format dates as YYYY-MM-DD.'
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customPrompt(): Optional<String> = customPrompt.getOptional("custom_prompt")

        /**
         * Returns the raw JSON value of [customPrompt].
         *
         * Unlike [customPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_prompt")
        @ExcludeMissing
        fun _customPrompt(): JsonField<String> = customPrompt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [AgenticOptions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AgenticOptions]. */
        class Builder internal constructor() {

            private var customPrompt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(agenticOptions: AgenticOptions) = apply {
                customPrompt = agenticOptions.customPrompt
                additionalProperties = agenticOptions.additionalProperties.toMutableMap()
            }

            /**
             * Custom instructions for the AI parser. Use to guide extraction behavior, specify
             * output formatting, or provide domain-specific context. Example: 'Extract financial
             * tables with currency symbols. Format dates as YYYY-MM-DD.'
             */
            fun customPrompt(customPrompt: String?) =
                customPrompt(JsonField.ofNullable(customPrompt))

            /** Alias for calling [Builder.customPrompt] with `customPrompt.orElse(null)`. */
            fun customPrompt(customPrompt: Optional<String>) =
                customPrompt(customPrompt.getOrNull())

            /**
             * Sets [Builder.customPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customPrompt(customPrompt: JsonField<String>) = apply {
                this.customPrompt = customPrompt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [AgenticOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AgenticOptions =
                AgenticOptions(customPrompt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AgenticOptions = apply {
            if (validated) {
                return@apply
            }

            customPrompt()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = (if (customPrompt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AgenticOptions &&
                customPrompt == other.customPrompt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(customPrompt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgenticOptions{customPrompt=$customPrompt, additionalProperties=$additionalProperties}"
    }

    /**
     * Crop boundaries to process only a portion of each page. Values are ratios 0-1 from page edges
     */
    class CropBox
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bottom: JsonField<Double>,
        private val left: JsonField<Double>,
        private val right: JsonField<Double>,
        private val top: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bottom") @ExcludeMissing bottom: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("left") @ExcludeMissing left: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("right") @ExcludeMissing right: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("top") @ExcludeMissing top: JsonField<Double> = JsonMissing.of(),
        ) : this(bottom, left, right, top, mutableMapOf())

        /**
         * Bottom boundary as ratio (0-1). 0=top edge, 1=bottom edge. Content below this line is
         * excluded
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun bottom(): Optional<Double> = bottom.getOptional("bottom")

        /**
         * Left boundary as ratio (0-1). 0=left edge, 1=right edge. Content left of this line is
         * excluded
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun left(): Optional<Double> = left.getOptional("left")

        /**
         * Right boundary as ratio (0-1). 0=left edge, 1=right edge. Content right of this line is
         * excluded
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun right(): Optional<Double> = right.getOptional("right")

        /**
         * Top boundary as ratio (0-1). 0=top edge, 1=bottom edge. Content above this line is
         * excluded
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun top(): Optional<Double> = top.getOptional("top")

        /**
         * Returns the raw JSON value of [bottom].
         *
         * Unlike [bottom], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bottom") @ExcludeMissing fun _bottom(): JsonField<Double> = bottom

        /**
         * Returns the raw JSON value of [left].
         *
         * Unlike [left], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("left") @ExcludeMissing fun _left(): JsonField<Double> = left

        /**
         * Returns the raw JSON value of [right].
         *
         * Unlike [right], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("right") @ExcludeMissing fun _right(): JsonField<Double> = right

        /**
         * Returns the raw JSON value of [top].
         *
         * Unlike [top], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top") @ExcludeMissing fun _top(): JsonField<Double> = top

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CropBox]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CropBox]. */
        class Builder internal constructor() {

            private var bottom: JsonField<Double> = JsonMissing.of()
            private var left: JsonField<Double> = JsonMissing.of()
            private var right: JsonField<Double> = JsonMissing.of()
            private var top: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cropBox: CropBox) = apply {
                bottom = cropBox.bottom
                left = cropBox.left
                right = cropBox.right
                top = cropBox.top
                additionalProperties = cropBox.additionalProperties.toMutableMap()
            }

            /**
             * Bottom boundary as ratio (0-1). 0=top edge, 1=bottom edge. Content below this line is
             * excluded
             */
            fun bottom(bottom: Double?) = bottom(JsonField.ofNullable(bottom))

            /**
             * Alias for [Builder.bottom].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun bottom(bottom: Double) = bottom(bottom as Double?)

            /** Alias for calling [Builder.bottom] with `bottom.orElse(null)`. */
            fun bottom(bottom: Optional<Double>) = bottom(bottom.getOrNull())

            /**
             * Sets [Builder.bottom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bottom] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bottom(bottom: JsonField<Double>) = apply { this.bottom = bottom }

            /**
             * Left boundary as ratio (0-1). 0=left edge, 1=right edge. Content left of this line is
             * excluded
             */
            fun left(left: Double?) = left(JsonField.ofNullable(left))

            /**
             * Alias for [Builder.left].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun left(left: Double) = left(left as Double?)

            /** Alias for calling [Builder.left] with `left.orElse(null)`. */
            fun left(left: Optional<Double>) = left(left.getOrNull())

            /**
             * Sets [Builder.left] to an arbitrary JSON value.
             *
             * You should usually call [Builder.left] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun left(left: JsonField<Double>) = apply { this.left = left }

            /**
             * Right boundary as ratio (0-1). 0=left edge, 1=right edge. Content right of this line
             * is excluded
             */
            fun right(right: Double?) = right(JsonField.ofNullable(right))

            /**
             * Alias for [Builder.right].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun right(right: Double) = right(right as Double?)

            /** Alias for calling [Builder.right] with `right.orElse(null)`. */
            fun right(right: Optional<Double>) = right(right.getOrNull())

            /**
             * Sets [Builder.right] to an arbitrary JSON value.
             *
             * You should usually call [Builder.right] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun right(right: JsonField<Double>) = apply { this.right = right }

            /**
             * Top boundary as ratio (0-1). 0=top edge, 1=bottom edge. Content above this line is
             * excluded
             */
            fun top(top: Double?) = top(JsonField.ofNullable(top))

            /**
             * Alias for [Builder.top].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun top(top: Double) = top(top as Double?)

            /** Alias for calling [Builder.top] with `top.orElse(null)`. */
            fun top(top: Optional<Double>) = top(top.getOrNull())

            /**
             * Sets [Builder.top] to an arbitrary JSON value.
             *
             * You should usually call [Builder.top] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun top(top: JsonField<Double>) = apply { this.top = top }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [CropBox].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CropBox =
                CropBox(bottom, left, right, top, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CropBox = apply {
            if (validated) {
                return@apply
            }

            bottom()
            left()
            right()
            top()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (bottom.asKnown().isPresent) 1 else 0) +
                (if (left.asKnown().isPresent) 1 else 0) +
                (if (right.asKnown().isPresent) 1 else 0) +
                (if (top.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CropBox &&
                bottom == other.bottom &&
                left == other.left &&
                right == other.right &&
                top == other.top &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bottom, left, right, top, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CropBox{bottom=$bottom, left=$left, right=$right, top=$top, additionalProperties=$additionalProperties}"
    }

    /**
     * Format-specific options (HTML, PDF, spreadsheet, presentation). Applied based on detected
     * input file type
     */
    class InputOptions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val html: JsonField<Html>,
        private val image: JsonField<Image>,
        private val pdf: JsonValue,
        private val presentation: JsonField<Presentation>,
        private val spreadsheet: JsonField<Spreadsheet>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("html") @ExcludeMissing html: JsonField<Html> = JsonMissing.of(),
            @JsonProperty("image") @ExcludeMissing image: JsonField<Image> = JsonMissing.of(),
            @JsonProperty("pdf") @ExcludeMissing pdf: JsonValue = JsonMissing.of(),
            @JsonProperty("presentation")
            @ExcludeMissing
            presentation: JsonField<Presentation> = JsonMissing.of(),
            @JsonProperty("spreadsheet")
            @ExcludeMissing
            spreadsheet: JsonField<Spreadsheet> = JsonMissing.of(),
        ) : this(html, image, pdf, presentation, spreadsheet, mutableMapOf())

        /**
         * HTML/web page parsing options (applies to .html, .htm files)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun html(): Optional<Html> = html.getOptional("html")

        /**
         * Image parsing options (applies to .jpg, .jpeg, .png, .webp files)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun image(): Optional<Image> = image.getOptional("image")

        /**
         * PDF-specific parsing options (applies to .pdf files)
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = inputOptions.pdf().convert(MyClass.class);
         * ```
         */
        @JsonProperty("pdf") @ExcludeMissing fun _pdf(): JsonValue = pdf

        /**
         * Presentation parsing options (applies to .pptx, .ppt, .odp, .key files)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun presentation(): Optional<Presentation> = presentation.getOptional("presentation")

        /**
         * Spreadsheet parsing options (applies to .xlsx, .xls, .csv, .ods files)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun spreadsheet(): Optional<Spreadsheet> = spreadsheet.getOptional("spreadsheet")

        /**
         * Returns the raw JSON value of [html].
         *
         * Unlike [html], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("html") @ExcludeMissing fun _html(): JsonField<Html> = html

        /**
         * Returns the raw JSON value of [image].
         *
         * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<Image> = image

        /**
         * Returns the raw JSON value of [presentation].
         *
         * Unlike [presentation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("presentation")
        @ExcludeMissing
        fun _presentation(): JsonField<Presentation> = presentation

        /**
         * Returns the raw JSON value of [spreadsheet].
         *
         * Unlike [spreadsheet], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spreadsheet")
        @ExcludeMissing
        fun _spreadsheet(): JsonField<Spreadsheet> = spreadsheet

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [InputOptions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InputOptions]. */
        class Builder internal constructor() {

            private var html: JsonField<Html> = JsonMissing.of()
            private var image: JsonField<Image> = JsonMissing.of()
            private var pdf: JsonValue = JsonMissing.of()
            private var presentation: JsonField<Presentation> = JsonMissing.of()
            private var spreadsheet: JsonField<Spreadsheet> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inputOptions: InputOptions) = apply {
                html = inputOptions.html
                image = inputOptions.image
                pdf = inputOptions.pdf
                presentation = inputOptions.presentation
                spreadsheet = inputOptions.spreadsheet
                additionalProperties = inputOptions.additionalProperties.toMutableMap()
            }

            /** HTML/web page parsing options (applies to .html, .htm files) */
            fun html(html: Html) = html(JsonField.of(html))

            /**
             * Sets [Builder.html] to an arbitrary JSON value.
             *
             * You should usually call [Builder.html] with a well-typed [Html] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun html(html: JsonField<Html>) = apply { this.html = html }

            /** Image parsing options (applies to .jpg, .jpeg, .png, .webp files) */
            fun image(image: Image) = image(JsonField.of(image))

            /**
             * Sets [Builder.image] to an arbitrary JSON value.
             *
             * You should usually call [Builder.image] with a well-typed [Image] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun image(image: JsonField<Image>) = apply { this.image = image }

            /** PDF-specific parsing options (applies to .pdf files) */
            fun pdf(pdf: JsonValue) = apply { this.pdf = pdf }

            /** Presentation parsing options (applies to .pptx, .ppt, .odp, .key files) */
            fun presentation(presentation: Presentation) = presentation(JsonField.of(presentation))

            /**
             * Sets [Builder.presentation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presentation] with a well-typed [Presentation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun presentation(presentation: JsonField<Presentation>) = apply {
                this.presentation = presentation
            }

            /** Spreadsheet parsing options (applies to .xlsx, .xls, .csv, .ods files) */
            fun spreadsheet(spreadsheet: Spreadsheet) = spreadsheet(JsonField.of(spreadsheet))

            /**
             * Sets [Builder.spreadsheet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spreadsheet] with a well-typed [Spreadsheet] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spreadsheet(spreadsheet: JsonField<Spreadsheet>) = apply {
                this.spreadsheet = spreadsheet
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [InputOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InputOptions =
                InputOptions(
                    html,
                    image,
                    pdf,
                    presentation,
                    spreadsheet,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): InputOptions = apply {
            if (validated) {
                return@apply
            }

            html().ifPresent { it.validate() }
            image().ifPresent { it.validate() }
            presentation().ifPresent { it.validate() }
            spreadsheet().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (html.asKnown().getOrNull()?.validity() ?: 0) +
                (image.asKnown().getOrNull()?.validity() ?: 0) +
                (presentation.asKnown().getOrNull()?.validity() ?: 0) +
                (spreadsheet.asKnown().getOrNull()?.validity() ?: 0)

        /** HTML/web page parsing options (applies to .html, .htm files) */
        class Html
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val makeAllElementsVisible: JsonField<Boolean>,
            private val removeFixedElements: JsonField<Boolean>,
            private val removeNavigationElements: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("make_all_elements_visible")
                @ExcludeMissing
                makeAllElementsVisible: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("remove_fixed_elements")
                @ExcludeMissing
                removeFixedElements: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("remove_navigation_elements")
                @ExcludeMissing
                removeNavigationElements: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                makeAllElementsVisible,
                removeFixedElements,
                removeNavigationElements,
                mutableMapOf(),
            )

            /**
             * Force all HTML elements to be visible by overriding CSS display/visibility
             * properties. Useful for parsing pages with hidden content or collapsed sections
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun makeAllElementsVisible(): Optional<Boolean> =
                makeAllElementsVisible.getOptional("make_all_elements_visible")

            /**
             * Remove fixed-position elements (headers, footers, floating buttons) that appear on
             * every page render
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun removeFixedElements(): Optional<Boolean> =
                removeFixedElements.getOptional("remove_fixed_elements")

            /**
             * Remove navigation elements (nav bars, sidebars, menus) to focus on main content
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun removeNavigationElements(): Optional<Boolean> =
                removeNavigationElements.getOptional("remove_navigation_elements")

            /**
             * Returns the raw JSON value of [makeAllElementsVisible].
             *
             * Unlike [makeAllElementsVisible], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("make_all_elements_visible")
            @ExcludeMissing
            fun _makeAllElementsVisible(): JsonField<Boolean> = makeAllElementsVisible

            /**
             * Returns the raw JSON value of [removeFixedElements].
             *
             * Unlike [removeFixedElements], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("remove_fixed_elements")
            @ExcludeMissing
            fun _removeFixedElements(): JsonField<Boolean> = removeFixedElements

            /**
             * Returns the raw JSON value of [removeNavigationElements].
             *
             * Unlike [removeNavigationElements], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("remove_navigation_elements")
            @ExcludeMissing
            fun _removeNavigationElements(): JsonField<Boolean> = removeNavigationElements

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Html]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Html]. */
            class Builder internal constructor() {

                private var makeAllElementsVisible: JsonField<Boolean> = JsonMissing.of()
                private var removeFixedElements: JsonField<Boolean> = JsonMissing.of()
                private var removeNavigationElements: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(html: Html) = apply {
                    makeAllElementsVisible = html.makeAllElementsVisible
                    removeFixedElements = html.removeFixedElements
                    removeNavigationElements = html.removeNavigationElements
                    additionalProperties = html.additionalProperties.toMutableMap()
                }

                /**
                 * Force all HTML elements to be visible by overriding CSS display/visibility
                 * properties. Useful for parsing pages with hidden content or collapsed sections
                 */
                fun makeAllElementsVisible(makeAllElementsVisible: Boolean?) =
                    makeAllElementsVisible(JsonField.ofNullable(makeAllElementsVisible))

                /**
                 * Alias for [Builder.makeAllElementsVisible].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun makeAllElementsVisible(makeAllElementsVisible: Boolean) =
                    makeAllElementsVisible(makeAllElementsVisible as Boolean?)

                /**
                 * Alias for calling [Builder.makeAllElementsVisible] with
                 * `makeAllElementsVisible.orElse(null)`.
                 */
                fun makeAllElementsVisible(makeAllElementsVisible: Optional<Boolean>) =
                    makeAllElementsVisible(makeAllElementsVisible.getOrNull())

                /**
                 * Sets [Builder.makeAllElementsVisible] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.makeAllElementsVisible] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun makeAllElementsVisible(makeAllElementsVisible: JsonField<Boolean>) = apply {
                    this.makeAllElementsVisible = makeAllElementsVisible
                }

                /**
                 * Remove fixed-position elements (headers, footers, floating buttons) that appear
                 * on every page render
                 */
                fun removeFixedElements(removeFixedElements: Boolean?) =
                    removeFixedElements(JsonField.ofNullable(removeFixedElements))

                /**
                 * Alias for [Builder.removeFixedElements].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun removeFixedElements(removeFixedElements: Boolean) =
                    removeFixedElements(removeFixedElements as Boolean?)

                /**
                 * Alias for calling [Builder.removeFixedElements] with
                 * `removeFixedElements.orElse(null)`.
                 */
                fun removeFixedElements(removeFixedElements: Optional<Boolean>) =
                    removeFixedElements(removeFixedElements.getOrNull())

                /**
                 * Sets [Builder.removeFixedElements] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.removeFixedElements] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun removeFixedElements(removeFixedElements: JsonField<Boolean>) = apply {
                    this.removeFixedElements = removeFixedElements
                }

                /**
                 * Remove navigation elements (nav bars, sidebars, menus) to focus on main content
                 */
                fun removeNavigationElements(removeNavigationElements: Boolean?) =
                    removeNavigationElements(JsonField.ofNullable(removeNavigationElements))

                /**
                 * Alias for [Builder.removeNavigationElements].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun removeNavigationElements(removeNavigationElements: Boolean) =
                    removeNavigationElements(removeNavigationElements as Boolean?)

                /**
                 * Alias for calling [Builder.removeNavigationElements] with
                 * `removeNavigationElements.orElse(null)`.
                 */
                fun removeNavigationElements(removeNavigationElements: Optional<Boolean>) =
                    removeNavigationElements(removeNavigationElements.getOrNull())

                /**
                 * Sets [Builder.removeNavigationElements] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.removeNavigationElements] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun removeNavigationElements(removeNavigationElements: JsonField<Boolean>) = apply {
                    this.removeNavigationElements = removeNavigationElements
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Html].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Html =
                    Html(
                        makeAllElementsVisible,
                        removeFixedElements,
                        removeNavigationElements,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Html = apply {
                if (validated) {
                    return@apply
                }

                makeAllElementsVisible()
                removeFixedElements()
                removeNavigationElements()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (makeAllElementsVisible.asKnown().isPresent) 1 else 0) +
                    (if (removeFixedElements.asKnown().isPresent) 1 else 0) +
                    (if (removeNavigationElements.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Html &&
                    makeAllElementsVisible == other.makeAllElementsVisible &&
                    removeFixedElements == other.removeFixedElements &&
                    removeNavigationElements == other.removeNavigationElements &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    makeAllElementsVisible,
                    removeFixedElements,
                    removeNavigationElements,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Html{makeAllElementsVisible=$makeAllElementsVisible, removeFixedElements=$removeFixedElements, removeNavigationElements=$removeNavigationElements, additionalProperties=$additionalProperties}"
        }

        /** Image parsing options (applies to .jpg, .jpeg, .png, .webp files) */
        class Image
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cameraPhotoCorrection: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("camera_photo_correction")
                @ExcludeMissing
                cameraPhotoCorrection: JsonField<Boolean> = JsonMissing.of()
            ) : this(cameraPhotoCorrection, mutableMapOf())

            /**
             * Detect documents photographed with a camera (e.g. phone scans of receipts or forms),
             * then crop, perspective-correct, and flatten uneven lighting and shadows before
             * parsing. Supports JPEG, PNG, WebP, and HEIC/HEIF inputs. Improves results when the
             * document is tilted or surrounded by background. Images that already look like clean
             * scans are left untouched
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cameraPhotoCorrection(): Optional<Boolean> =
                cameraPhotoCorrection.getOptional("camera_photo_correction")

            /**
             * Returns the raw JSON value of [cameraPhotoCorrection].
             *
             * Unlike [cameraPhotoCorrection], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("camera_photo_correction")
            @ExcludeMissing
            fun _cameraPhotoCorrection(): JsonField<Boolean> = cameraPhotoCorrection

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Image]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Image]. */
            class Builder internal constructor() {

                private var cameraPhotoCorrection: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(image: Image) = apply {
                    cameraPhotoCorrection = image.cameraPhotoCorrection
                    additionalProperties = image.additionalProperties.toMutableMap()
                }

                /**
                 * Detect documents photographed with a camera (e.g. phone scans of receipts or
                 * forms), then crop, perspective-correct, and flatten uneven lighting and shadows
                 * before parsing. Supports JPEG, PNG, WebP, and HEIC/HEIF inputs. Improves results
                 * when the document is tilted or surrounded by background. Images that already look
                 * like clean scans are left untouched
                 */
                fun cameraPhotoCorrection(cameraPhotoCorrection: Boolean?) =
                    cameraPhotoCorrection(JsonField.ofNullable(cameraPhotoCorrection))

                /**
                 * Alias for [Builder.cameraPhotoCorrection].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun cameraPhotoCorrection(cameraPhotoCorrection: Boolean) =
                    cameraPhotoCorrection(cameraPhotoCorrection as Boolean?)

                /**
                 * Alias for calling [Builder.cameraPhotoCorrection] with
                 * `cameraPhotoCorrection.orElse(null)`.
                 */
                fun cameraPhotoCorrection(cameraPhotoCorrection: Optional<Boolean>) =
                    cameraPhotoCorrection(cameraPhotoCorrection.getOrNull())

                /**
                 * Sets [Builder.cameraPhotoCorrection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cameraPhotoCorrection] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun cameraPhotoCorrection(cameraPhotoCorrection: JsonField<Boolean>) = apply {
                    this.cameraPhotoCorrection = cameraPhotoCorrection
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Image].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Image =
                    Image(cameraPhotoCorrection, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Image = apply {
                if (validated) {
                    return@apply
                }

                cameraPhotoCorrection()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (if (cameraPhotoCorrection.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Image &&
                    cameraPhotoCorrection == other.cameraPhotoCorrection &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(cameraPhotoCorrection, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Image{cameraPhotoCorrection=$cameraPhotoCorrection, additionalProperties=$additionalProperties}"
        }

        /** Presentation parsing options (applies to .pptx, .ppt, .odp, .key files) */
        class Presentation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val outOfBoundsContent: JsonField<Boolean>,
            private val skipEmbeddedData: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("out_of_bounds_content")
                @ExcludeMissing
                outOfBoundsContent: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("skip_embedded_data")
                @ExcludeMissing
                skipEmbeddedData: JsonField<Boolean> = JsonMissing.of(),
            ) : this(outOfBoundsContent, skipEmbeddedData, mutableMapOf())

            /**
             * Extract content positioned outside the visible slide area. Some presentations have
             * hidden notes or content that extends beyond slide boundaries
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun outOfBoundsContent(): Optional<Boolean> =
                outOfBoundsContent.getOptional("out_of_bounds_content")

            /**
             * Skip extraction of embedded chart data tables. When true, only the visual
             * representation of charts is captured, not the underlying data
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun skipEmbeddedData(): Optional<Boolean> =
                skipEmbeddedData.getOptional("skip_embedded_data")

            /**
             * Returns the raw JSON value of [outOfBoundsContent].
             *
             * Unlike [outOfBoundsContent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("out_of_bounds_content")
            @ExcludeMissing
            fun _outOfBoundsContent(): JsonField<Boolean> = outOfBoundsContent

            /**
             * Returns the raw JSON value of [skipEmbeddedData].
             *
             * Unlike [skipEmbeddedData], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("skip_embedded_data")
            @ExcludeMissing
            fun _skipEmbeddedData(): JsonField<Boolean> = skipEmbeddedData

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Presentation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Presentation]. */
            class Builder internal constructor() {

                private var outOfBoundsContent: JsonField<Boolean> = JsonMissing.of()
                private var skipEmbeddedData: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(presentation: Presentation) = apply {
                    outOfBoundsContent = presentation.outOfBoundsContent
                    skipEmbeddedData = presentation.skipEmbeddedData
                    additionalProperties = presentation.additionalProperties.toMutableMap()
                }

                /**
                 * Extract content positioned outside the visible slide area. Some presentations
                 * have hidden notes or content that extends beyond slide boundaries
                 */
                fun outOfBoundsContent(outOfBoundsContent: Boolean?) =
                    outOfBoundsContent(JsonField.ofNullable(outOfBoundsContent))

                /**
                 * Alias for [Builder.outOfBoundsContent].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun outOfBoundsContent(outOfBoundsContent: Boolean) =
                    outOfBoundsContent(outOfBoundsContent as Boolean?)

                /**
                 * Alias for calling [Builder.outOfBoundsContent] with
                 * `outOfBoundsContent.orElse(null)`.
                 */
                fun outOfBoundsContent(outOfBoundsContent: Optional<Boolean>) =
                    outOfBoundsContent(outOfBoundsContent.getOrNull())

                /**
                 * Sets [Builder.outOfBoundsContent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outOfBoundsContent] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun outOfBoundsContent(outOfBoundsContent: JsonField<Boolean>) = apply {
                    this.outOfBoundsContent = outOfBoundsContent
                }

                /**
                 * Skip extraction of embedded chart data tables. When true, only the visual
                 * representation of charts is captured, not the underlying data
                 */
                fun skipEmbeddedData(skipEmbeddedData: Boolean?) =
                    skipEmbeddedData(JsonField.ofNullable(skipEmbeddedData))

                /**
                 * Alias for [Builder.skipEmbeddedData].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun skipEmbeddedData(skipEmbeddedData: Boolean) =
                    skipEmbeddedData(skipEmbeddedData as Boolean?)

                /**
                 * Alias for calling [Builder.skipEmbeddedData] with
                 * `skipEmbeddedData.orElse(null)`.
                 */
                fun skipEmbeddedData(skipEmbeddedData: Optional<Boolean>) =
                    skipEmbeddedData(skipEmbeddedData.getOrNull())

                /**
                 * Sets [Builder.skipEmbeddedData] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.skipEmbeddedData] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun skipEmbeddedData(skipEmbeddedData: JsonField<Boolean>) = apply {
                    this.skipEmbeddedData = skipEmbeddedData
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Presentation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Presentation =
                    Presentation(
                        outOfBoundsContent,
                        skipEmbeddedData,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Presentation = apply {
                if (validated) {
                    return@apply
                }

                outOfBoundsContent()
                skipEmbeddedData()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (outOfBoundsContent.asKnown().isPresent) 1 else 0) +
                    (if (skipEmbeddedData.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Presentation &&
                    outOfBoundsContent == other.outOfBoundsContent &&
                    skipEmbeddedData == other.skipEmbeddedData &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(outOfBoundsContent, skipEmbeddedData, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Presentation{outOfBoundsContent=$outOfBoundsContent, skipEmbeddedData=$skipEmbeddedData, additionalProperties=$additionalProperties}"
        }

        /** Spreadsheet parsing options (applies to .xlsx, .xls, .csv, .ods files) */
        class Spreadsheet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val detectSubTablesInSheets: JsonField<Boolean>,
            private val forceFormulaComputationInSheets: JsonField<Boolean>,
            private val includeHiddenSheets: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("detect_sub_tables_in_sheets")
                @ExcludeMissing
                detectSubTablesInSheets: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("force_formula_computation_in_sheets")
                @ExcludeMissing
                forceFormulaComputationInSheets: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("include_hidden_sheets")
                @ExcludeMissing
                includeHiddenSheets: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                detectSubTablesInSheets,
                forceFormulaComputationInSheets,
                includeHiddenSheets,
                mutableMapOf(),
            )

            /**
             * Detect and extract multiple tables within a single sheet. Useful when spreadsheets
             * contain several data regions separated by blank rows/columns
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun detectSubTablesInSheets(): Optional<Boolean> =
                detectSubTablesInSheets.getOptional("detect_sub_tables_in_sheets")

            /**
             * Compute formula results instead of extracting formula text. Use when you need
             * calculated values rather than formula definitions
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun forceFormulaComputationInSheets(): Optional<Boolean> =
                forceFormulaComputationInSheets.getOptional("force_formula_computation_in_sheets")

            /**
             * Parse hidden sheets in addition to visible ones. By default, hidden sheets are
             * skipped
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun includeHiddenSheets(): Optional<Boolean> =
                includeHiddenSheets.getOptional("include_hidden_sheets")

            /**
             * Returns the raw JSON value of [detectSubTablesInSheets].
             *
             * Unlike [detectSubTablesInSheets], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("detect_sub_tables_in_sheets")
            @ExcludeMissing
            fun _detectSubTablesInSheets(): JsonField<Boolean> = detectSubTablesInSheets

            /**
             * Returns the raw JSON value of [forceFormulaComputationInSheets].
             *
             * Unlike [forceFormulaComputationInSheets], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("force_formula_computation_in_sheets")
            @ExcludeMissing
            fun _forceFormulaComputationInSheets(): JsonField<Boolean> =
                forceFormulaComputationInSheets

            /**
             * Returns the raw JSON value of [includeHiddenSheets].
             *
             * Unlike [includeHiddenSheets], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("include_hidden_sheets")
            @ExcludeMissing
            fun _includeHiddenSheets(): JsonField<Boolean> = includeHiddenSheets

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Spreadsheet]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Spreadsheet]. */
            class Builder internal constructor() {

                private var detectSubTablesInSheets: JsonField<Boolean> = JsonMissing.of()
                private var forceFormulaComputationInSheets: JsonField<Boolean> = JsonMissing.of()
                private var includeHiddenSheets: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spreadsheet: Spreadsheet) = apply {
                    detectSubTablesInSheets = spreadsheet.detectSubTablesInSheets
                    forceFormulaComputationInSheets = spreadsheet.forceFormulaComputationInSheets
                    includeHiddenSheets = spreadsheet.includeHiddenSheets
                    additionalProperties = spreadsheet.additionalProperties.toMutableMap()
                }

                /**
                 * Detect and extract multiple tables within a single sheet. Useful when
                 * spreadsheets contain several data regions separated by blank rows/columns
                 */
                fun detectSubTablesInSheets(detectSubTablesInSheets: Boolean?) =
                    detectSubTablesInSheets(JsonField.ofNullable(detectSubTablesInSheets))

                /**
                 * Alias for [Builder.detectSubTablesInSheets].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun detectSubTablesInSheets(detectSubTablesInSheets: Boolean) =
                    detectSubTablesInSheets(detectSubTablesInSheets as Boolean?)

                /**
                 * Alias for calling [Builder.detectSubTablesInSheets] with
                 * `detectSubTablesInSheets.orElse(null)`.
                 */
                fun detectSubTablesInSheets(detectSubTablesInSheets: Optional<Boolean>) =
                    detectSubTablesInSheets(detectSubTablesInSheets.getOrNull())

                /**
                 * Sets [Builder.detectSubTablesInSheets] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detectSubTablesInSheets] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun detectSubTablesInSheets(detectSubTablesInSheets: JsonField<Boolean>) = apply {
                    this.detectSubTablesInSheets = detectSubTablesInSheets
                }

                /**
                 * Compute formula results instead of extracting formula text. Use when you need
                 * calculated values rather than formula definitions
                 */
                fun forceFormulaComputationInSheets(forceFormulaComputationInSheets: Boolean?) =
                    forceFormulaComputationInSheets(
                        JsonField.ofNullable(forceFormulaComputationInSheets)
                    )

                /**
                 * Alias for [Builder.forceFormulaComputationInSheets].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun forceFormulaComputationInSheets(forceFormulaComputationInSheets: Boolean) =
                    forceFormulaComputationInSheets(forceFormulaComputationInSheets as Boolean?)

                /**
                 * Alias for calling [Builder.forceFormulaComputationInSheets] with
                 * `forceFormulaComputationInSheets.orElse(null)`.
                 */
                fun forceFormulaComputationInSheets(
                    forceFormulaComputationInSheets: Optional<Boolean>
                ) = forceFormulaComputationInSheets(forceFormulaComputationInSheets.getOrNull())

                /**
                 * Sets [Builder.forceFormulaComputationInSheets] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.forceFormulaComputationInSheets] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun forceFormulaComputationInSheets(
                    forceFormulaComputationInSheets: JsonField<Boolean>
                ) = apply { this.forceFormulaComputationInSheets = forceFormulaComputationInSheets }

                /**
                 * Parse hidden sheets in addition to visible ones. By default, hidden sheets are
                 * skipped
                 */
                fun includeHiddenSheets(includeHiddenSheets: Boolean?) =
                    includeHiddenSheets(JsonField.ofNullable(includeHiddenSheets))

                /**
                 * Alias for [Builder.includeHiddenSheets].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun includeHiddenSheets(includeHiddenSheets: Boolean) =
                    includeHiddenSheets(includeHiddenSheets as Boolean?)

                /**
                 * Alias for calling [Builder.includeHiddenSheets] with
                 * `includeHiddenSheets.orElse(null)`.
                 */
                fun includeHiddenSheets(includeHiddenSheets: Optional<Boolean>) =
                    includeHiddenSheets(includeHiddenSheets.getOrNull())

                /**
                 * Sets [Builder.includeHiddenSheets] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includeHiddenSheets] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun includeHiddenSheets(includeHiddenSheets: JsonField<Boolean>) = apply {
                    this.includeHiddenSheets = includeHiddenSheets
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Spreadsheet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Spreadsheet =
                    Spreadsheet(
                        detectSubTablesInSheets,
                        forceFormulaComputationInSheets,
                        includeHiddenSheets,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Spreadsheet = apply {
                if (validated) {
                    return@apply
                }

                detectSubTablesInSheets()
                forceFormulaComputationInSheets()
                includeHiddenSheets()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (detectSubTablesInSheets.asKnown().isPresent) 1 else 0) +
                    (if (forceFormulaComputationInSheets.asKnown().isPresent) 1 else 0) +
                    (if (includeHiddenSheets.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Spreadsheet &&
                    detectSubTablesInSheets == other.detectSubTablesInSheets &&
                    forceFormulaComputationInSheets == other.forceFormulaComputationInSheets &&
                    includeHiddenSheets == other.includeHiddenSheets &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    detectSubTablesInSheets,
                    forceFormulaComputationInSheets,
                    includeHiddenSheets,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Spreadsheet{detectSubTablesInSheets=$detectSubTablesInSheets, forceFormulaComputationInSheets=$forceFormulaComputationInSheets, includeHiddenSheets=$includeHiddenSheets, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InputOptions &&
                html == other.html &&
                image == other.image &&
                pdf == other.pdf &&
                presentation == other.presentation &&
                spreadsheet == other.spreadsheet &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(html, image, pdf, presentation, spreadsheet, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InputOptions{html=$html, image=$image, pdf=$pdf, presentation=$presentation, spreadsheet=$spreadsheet, additionalProperties=$additionalProperties}"
    }

    /** Output formatting options for markdown, text, and extracted images */
    class OutputOptions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val additionalOutputs: JsonField<List<String>>,
        private val extractPrintedPageNumber: JsonField<Boolean>,
        private val granularBboxes: JsonField<List<GranularBbox>>,
        private val imagesToSave: JsonField<List<ImagesToSave>>,
        private val markdown: JsonField<Markdown>,
        private val spatialText: JsonField<SpatialText>,
        private val tablesAsSpreadsheet: JsonField<TablesAsSpreadsheet>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("additional_outputs")
            @ExcludeMissing
            additionalOutputs: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("extract_printed_page_number")
            @ExcludeMissing
            extractPrintedPageNumber: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("granular_bboxes")
            @ExcludeMissing
            granularBboxes: JsonField<List<GranularBbox>> = JsonMissing.of(),
            @JsonProperty("images_to_save")
            @ExcludeMissing
            imagesToSave: JsonField<List<ImagesToSave>> = JsonMissing.of(),
            @JsonProperty("markdown")
            @ExcludeMissing
            markdown: JsonField<Markdown> = JsonMissing.of(),
            @JsonProperty("spatial_text")
            @ExcludeMissing
            spatialText: JsonField<SpatialText> = JsonMissing.of(),
            @JsonProperty("tables_as_spreadsheet")
            @ExcludeMissing
            tablesAsSpreadsheet: JsonField<TablesAsSpreadsheet> = JsonMissing.of(),
        ) : this(
            additionalOutputs,
            extractPrintedPageNumber,
            granularBboxes,
            imagesToSave,
            markdown,
            spatialText,
            tablesAsSpreadsheet,
            mutableMapOf(),
        )

        /**
         * Optional additional output artifacts to save alongside the primary parse output. Each
         * value opts in to generating and persisting one extra file; the empty list (default) saves
         * none. The three accepted values are: 'stripped_md' — per-page markdown stripped of
         * formatting (links, bold/italic, images, HTML), saved as JSON for full-text-search
         * indexing; fetch via `expand=stripped_markdown_content_metadata`.
         * 'concatenated_stripped_txt' — all stripped pages concatenated into a single plain-text
         * file with `\n\n---\n\n` between pages, useful for feeding the document into search or
         * embedding pipelines as one blob; fetch via
         * `expand=concatenated_stripped_markdown_content_metadata`. 'word_bbox' — raw word-level
         * bounding boxes (one JSON object per word, with page number and x/y/w/h coordinates) saved
         * as JSONL, useful for highlighting or grounding extracted answers back to the source
         * document; fetch via `expand=raw_words_content_metadata`.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun additionalOutputs(): Optional<List<String>> =
            additionalOutputs.getOptional("additional_outputs")

        /**
         * Extract the printed page number as it appears in the document (e.g., 'Page 5 of 10', 'v',
         * 'A-3'). Useful for referencing original page numbers
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun extractPrintedPageNumber(): Optional<Boolean> =
            extractPrintedPageNumber.getOptional("extract_printed_page_number")

        /**
         * Bounding-box granularity levels to compute for the parse. 'word' computes one bounding
         * box per detected word; 'line' computes one per text line; 'cell' computes one per table
         * cell. Multiple levels can be requested. Empty list (default) disables granular bboxes —
         * only item-level layout boxes are returned on the result. When set, the computed boxes are
         * not inlined on the result items; they are written to a separate `grounded_items` sidecar
         * (JSONL, one row per page) and exposed as `result_content_metadata.grounded_items` (a
         * presigned download URL) on the parse result. Each row matches the `GroundedJsonItem`
         * shape.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun granularBboxes(): Optional<List<GranularBbox>> =
            granularBboxes.getOptional("granular_bboxes")

        /**
         * Image categories to extract and save. Options: 'screenshot' (full page renders useful for
         * visual QA), 'embedded' (images found within the document), 'layout' (cropped regions from
         * layout detection like figures and diagrams). Empty list saves no images
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun imagesToSave(): Optional<List<ImagesToSave>> =
            imagesToSave.getOptional("images_to_save")

        /**
         * Markdown formatting options including table styles and link annotations
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun markdown(): Optional<Markdown> = markdown.getOptional("markdown")

        /**
         * Spatial text output options for preserving document layout structure
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun spatialText(): Optional<SpatialText> = spatialText.getOptional("spatial_text")

        /**
         * Options for exporting tables as XLSX spreadsheets
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tablesAsSpreadsheet(): Optional<TablesAsSpreadsheet> =
            tablesAsSpreadsheet.getOptional("tables_as_spreadsheet")

        /**
         * Returns the raw JSON value of [additionalOutputs].
         *
         * Unlike [additionalOutputs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("additional_outputs")
        @ExcludeMissing
        fun _additionalOutputs(): JsonField<List<String>> = additionalOutputs

        /**
         * Returns the raw JSON value of [extractPrintedPageNumber].
         *
         * Unlike [extractPrintedPageNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("extract_printed_page_number")
        @ExcludeMissing
        fun _extractPrintedPageNumber(): JsonField<Boolean> = extractPrintedPageNumber

        /**
         * Returns the raw JSON value of [granularBboxes].
         *
         * Unlike [granularBboxes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("granular_bboxes")
        @ExcludeMissing
        fun _granularBboxes(): JsonField<List<GranularBbox>> = granularBboxes

        /**
         * Returns the raw JSON value of [imagesToSave].
         *
         * Unlike [imagesToSave], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("images_to_save")
        @ExcludeMissing
        fun _imagesToSave(): JsonField<List<ImagesToSave>> = imagesToSave

        /**
         * Returns the raw JSON value of [markdown].
         *
         * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("markdown") @ExcludeMissing fun _markdown(): JsonField<Markdown> = markdown

        /**
         * Returns the raw JSON value of [spatialText].
         *
         * Unlike [spatialText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spatial_text")
        @ExcludeMissing
        fun _spatialText(): JsonField<SpatialText> = spatialText

        /**
         * Returns the raw JSON value of [tablesAsSpreadsheet].
         *
         * Unlike [tablesAsSpreadsheet], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("tables_as_spreadsheet")
        @ExcludeMissing
        fun _tablesAsSpreadsheet(): JsonField<TablesAsSpreadsheet> = tablesAsSpreadsheet

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [OutputOptions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OutputOptions]. */
        class Builder internal constructor() {

            private var additionalOutputs: JsonField<MutableList<String>>? = null
            private var extractPrintedPageNumber: JsonField<Boolean> = JsonMissing.of()
            private var granularBboxes: JsonField<MutableList<GranularBbox>>? = null
            private var imagesToSave: JsonField<MutableList<ImagesToSave>>? = null
            private var markdown: JsonField<Markdown> = JsonMissing.of()
            private var spatialText: JsonField<SpatialText> = JsonMissing.of()
            private var tablesAsSpreadsheet: JsonField<TablesAsSpreadsheet> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outputOptions: OutputOptions) = apply {
                additionalOutputs = outputOptions.additionalOutputs.map { it.toMutableList() }
                extractPrintedPageNumber = outputOptions.extractPrintedPageNumber
                granularBboxes = outputOptions.granularBboxes.map { it.toMutableList() }
                imagesToSave = outputOptions.imagesToSave.map { it.toMutableList() }
                markdown = outputOptions.markdown
                spatialText = outputOptions.spatialText
                tablesAsSpreadsheet = outputOptions.tablesAsSpreadsheet
                additionalProperties = outputOptions.additionalProperties.toMutableMap()
            }

            /**
             * Optional additional output artifacts to save alongside the primary parse output. Each
             * value opts in to generating and persisting one extra file; the empty list (default)
             * saves none. The three accepted values are: 'stripped_md' — per-page markdown stripped
             * of formatting (links, bold/italic, images, HTML), saved as JSON for full-text-search
             * indexing; fetch via `expand=stripped_markdown_content_metadata`.
             * 'concatenated_stripped_txt' — all stripped pages concatenated into a single
             * plain-text file with `\n\n---\n\n` between pages, useful for feeding the document
             * into search or embedding pipelines as one blob; fetch via
             * `expand=concatenated_stripped_markdown_content_metadata`. 'word_bbox' — raw
             * word-level bounding boxes (one JSON object per word, with page number and x/y/w/h
             * coordinates) saved as JSONL, useful for highlighting or grounding extracted answers
             * back to the source document; fetch via `expand=raw_words_content_metadata`.
             */
            fun additionalOutputs(additionalOutputs: List<String>) =
                additionalOutputs(JsonField.of(additionalOutputs))

            /**
             * Sets [Builder.additionalOutputs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalOutputs] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun additionalOutputs(additionalOutputs: JsonField<List<String>>) = apply {
                this.additionalOutputs = additionalOutputs.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [additionalOutputs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdditionalOutput(additionalOutput: String) = apply {
                additionalOutputs =
                    (additionalOutputs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("additionalOutputs", it).add(additionalOutput)
                    }
            }

            /**
             * Extract the printed page number as it appears in the document (e.g., 'Page 5 of 10',
             * 'v', 'A-3'). Useful for referencing original page numbers
             */
            fun extractPrintedPageNumber(extractPrintedPageNumber: Boolean?) =
                extractPrintedPageNumber(JsonField.ofNullable(extractPrintedPageNumber))

            /**
             * Alias for [Builder.extractPrintedPageNumber].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun extractPrintedPageNumber(extractPrintedPageNumber: Boolean) =
                extractPrintedPageNumber(extractPrintedPageNumber as Boolean?)

            /**
             * Alias for calling [Builder.extractPrintedPageNumber] with
             * `extractPrintedPageNumber.orElse(null)`.
             */
            fun extractPrintedPageNumber(extractPrintedPageNumber: Optional<Boolean>) =
                extractPrintedPageNumber(extractPrintedPageNumber.getOrNull())

            /**
             * Sets [Builder.extractPrintedPageNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extractPrintedPageNumber] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun extractPrintedPageNumber(extractPrintedPageNumber: JsonField<Boolean>) = apply {
                this.extractPrintedPageNumber = extractPrintedPageNumber
            }

            /**
             * Bounding-box granularity levels to compute for the parse. 'word' computes one
             * bounding box per detected word; 'line' computes one per text line; 'cell' computes
             * one per table cell. Multiple levels can be requested. Empty list (default) disables
             * granular bboxes — only item-level layout boxes are returned on the result. When set,
             * the computed boxes are not inlined on the result items; they are written to a
             * separate `grounded_items` sidecar (JSONL, one row per page) and exposed as
             * `result_content_metadata.grounded_items` (a presigned download URL) on the parse
             * result. Each row matches the `GroundedJsonItem` shape.
             */
            fun granularBboxes(granularBboxes: List<GranularBbox>) =
                granularBboxes(JsonField.of(granularBboxes))

            /**
             * Sets [Builder.granularBboxes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.granularBboxes] with a well-typed
             * `List<GranularBbox>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun granularBboxes(granularBboxes: JsonField<List<GranularBbox>>) = apply {
                this.granularBboxes = granularBboxes.map { it.toMutableList() }
            }

            /**
             * Adds a single [GranularBbox] to [granularBboxes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGranularBbox(granularBbox: GranularBbox) = apply {
                granularBboxes =
                    (granularBboxes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("granularBboxes", it).add(granularBbox)
                    }
            }

            /**
             * Image categories to extract and save. Options: 'screenshot' (full page renders useful
             * for visual QA), 'embedded' (images found within the document), 'layout' (cropped
             * regions from layout detection like figures and diagrams). Empty list saves no images
             */
            fun imagesToSave(imagesToSave: List<ImagesToSave>) =
                imagesToSave(JsonField.of(imagesToSave))

            /**
             * Sets [Builder.imagesToSave] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imagesToSave] with a well-typed `List<ImagesToSave>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun imagesToSave(imagesToSave: JsonField<List<ImagesToSave>>) = apply {
                this.imagesToSave = imagesToSave.map { it.toMutableList() }
            }

            /**
             * Adds a single [ImagesToSave] to [Builder.imagesToSave].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addImagesToSave(imagesToSave: ImagesToSave) = apply {
                this.imagesToSave =
                    (this.imagesToSave ?: JsonField.of(mutableListOf())).also {
                        checkKnown("imagesToSave", it).add(imagesToSave)
                    }
            }

            /** Markdown formatting options including table styles and link annotations */
            fun markdown(markdown: Markdown) = markdown(JsonField.of(markdown))

            /**
             * Sets [Builder.markdown] to an arbitrary JSON value.
             *
             * You should usually call [Builder.markdown] with a well-typed [Markdown] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun markdown(markdown: JsonField<Markdown>) = apply { this.markdown = markdown }

            /** Spatial text output options for preserving document layout structure */
            fun spatialText(spatialText: SpatialText) = spatialText(JsonField.of(spatialText))

            /**
             * Sets [Builder.spatialText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spatialText] with a well-typed [SpatialText] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spatialText(spatialText: JsonField<SpatialText>) = apply {
                this.spatialText = spatialText
            }

            /** Options for exporting tables as XLSX spreadsheets */
            fun tablesAsSpreadsheet(tablesAsSpreadsheet: TablesAsSpreadsheet) =
                tablesAsSpreadsheet(JsonField.of(tablesAsSpreadsheet))

            /**
             * Sets [Builder.tablesAsSpreadsheet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tablesAsSpreadsheet] with a well-typed
             * [TablesAsSpreadsheet] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun tablesAsSpreadsheet(tablesAsSpreadsheet: JsonField<TablesAsSpreadsheet>) = apply {
                this.tablesAsSpreadsheet = tablesAsSpreadsheet
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [OutputOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OutputOptions =
                OutputOptions(
                    (additionalOutputs ?: JsonMissing.of()).map { it.toImmutable() },
                    extractPrintedPageNumber,
                    (granularBboxes ?: JsonMissing.of()).map { it.toImmutable() },
                    (imagesToSave ?: JsonMissing.of()).map { it.toImmutable() },
                    markdown,
                    spatialText,
                    tablesAsSpreadsheet,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): OutputOptions = apply {
            if (validated) {
                return@apply
            }

            additionalOutputs()
            extractPrintedPageNumber()
            granularBboxes().ifPresent { it.forEach { it.validate() } }
            imagesToSave().ifPresent { it.forEach { it.validate() } }
            markdown().ifPresent { it.validate() }
            spatialText().ifPresent { it.validate() }
            tablesAsSpreadsheet().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (additionalOutputs.asKnown().getOrNull()?.size ?: 0) +
                (if (extractPrintedPageNumber.asKnown().isPresent) 1 else 0) +
                (granularBboxes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (imagesToSave.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (markdown.asKnown().getOrNull()?.validity() ?: 0) +
                (spatialText.asKnown().getOrNull()?.validity() ?: 0) +
                (tablesAsSpreadsheet.asKnown().getOrNull()?.validity() ?: 0)

        class GranularBbox @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CELL = of("cell")

                @JvmField val LINE = of("line")

                @JvmField val WORD = of("word")

                @JvmStatic fun of(value: String) = GranularBbox(JsonField.of(value))
            }

            /** An enum containing [GranularBbox]'s known values. */
            enum class Known {
                CELL,
                LINE,
                WORD,
            }

            /**
             * An enum containing [GranularBbox]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [GranularBbox] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CELL,
                LINE,
                WORD,
                /**
                 * An enum member indicating that [GranularBbox] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CELL -> Value.CELL
                    LINE -> Value.LINE
                    WORD -> Value.WORD
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    CELL -> Known.CELL
                    LINE -> Known.LINE
                    WORD -> Known.WORD
                    else -> throw LlamaCloudInvalidDataException("Unknown GranularBbox: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LlamaCloudInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): GranularBbox = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GranularBbox && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ImagesToSave @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SCREENSHOT = of("screenshot")

                @JvmField val EMBEDDED = of("embedded")

                @JvmField val LAYOUT = of("layout")

                @JvmStatic fun of(value: String) = ImagesToSave(JsonField.of(value))
            }

            /** An enum containing [ImagesToSave]'s known values. */
            enum class Known {
                SCREENSHOT,
                EMBEDDED,
                LAYOUT,
            }

            /**
             * An enum containing [ImagesToSave]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ImagesToSave] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SCREENSHOT,
                EMBEDDED,
                LAYOUT,
                /**
                 * An enum member indicating that [ImagesToSave] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SCREENSHOT -> Value.SCREENSHOT
                    EMBEDDED -> Value.EMBEDDED
                    LAYOUT -> Value.LAYOUT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    SCREENSHOT -> Known.SCREENSHOT
                    EMBEDDED -> Known.EMBEDDED
                    LAYOUT -> Known.LAYOUT
                    else -> throw LlamaCloudInvalidDataException("Unknown ImagesToSave: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LlamaCloudInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ImagesToSave = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ImagesToSave && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Markdown formatting options including table styles and link annotations */
        class Markdown
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val annotateLinks: JsonField<Boolean>,
            private val inlineImages: JsonField<Boolean>,
            private val tables: JsonField<Tables>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("annotate_links")
                @ExcludeMissing
                annotateLinks: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("inline_images")
                @ExcludeMissing
                inlineImages: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("tables") @ExcludeMissing tables: JsonField<Tables> = JsonMissing.of(),
            ) : this(annotateLinks, inlineImages, tables, mutableMapOf())

            /**
             * Add link annotations to markdown output in the format [text](url). When false, only
             * the link text is included
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun annotateLinks(): Optional<Boolean> = annotateLinks.getOptional("annotate_links")

            /**
             * Embed images directly in markdown as base64 data URIs instead of extracting them as
             * separate files. Useful for self-contained markdown output
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun inlineImages(): Optional<Boolean> = inlineImages.getOptional("inline_images")

            /**
             * Table formatting options including markdown vs HTML format and merging behavior
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tables(): Optional<Tables> = tables.getOptional("tables")

            /**
             * Returns the raw JSON value of [annotateLinks].
             *
             * Unlike [annotateLinks], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("annotate_links")
            @ExcludeMissing
            fun _annotateLinks(): JsonField<Boolean> = annotateLinks

            /**
             * Returns the raw JSON value of [inlineImages].
             *
             * Unlike [inlineImages], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("inline_images")
            @ExcludeMissing
            fun _inlineImages(): JsonField<Boolean> = inlineImages

            /**
             * Returns the raw JSON value of [tables].
             *
             * Unlike [tables], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tables") @ExcludeMissing fun _tables(): JsonField<Tables> = tables

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Markdown]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Markdown]. */
            class Builder internal constructor() {

                private var annotateLinks: JsonField<Boolean> = JsonMissing.of()
                private var inlineImages: JsonField<Boolean> = JsonMissing.of()
                private var tables: JsonField<Tables> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(markdown: Markdown) = apply {
                    annotateLinks = markdown.annotateLinks
                    inlineImages = markdown.inlineImages
                    tables = markdown.tables
                    additionalProperties = markdown.additionalProperties.toMutableMap()
                }

                /**
                 * Add link annotations to markdown output in the format [text](url). When false,
                 * only the link text is included
                 */
                fun annotateLinks(annotateLinks: Boolean?) =
                    annotateLinks(JsonField.ofNullable(annotateLinks))

                /**
                 * Alias for [Builder.annotateLinks].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun annotateLinks(annotateLinks: Boolean) = annotateLinks(annotateLinks as Boolean?)

                /** Alias for calling [Builder.annotateLinks] with `annotateLinks.orElse(null)`. */
                fun annotateLinks(annotateLinks: Optional<Boolean>) =
                    annotateLinks(annotateLinks.getOrNull())

                /**
                 * Sets [Builder.annotateLinks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annotateLinks] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun annotateLinks(annotateLinks: JsonField<Boolean>) = apply {
                    this.annotateLinks = annotateLinks
                }

                /**
                 * Embed images directly in markdown as base64 data URIs instead of extracting them
                 * as separate files. Useful for self-contained markdown output
                 */
                fun inlineImages(inlineImages: Boolean?) =
                    inlineImages(JsonField.ofNullable(inlineImages))

                /**
                 * Alias for [Builder.inlineImages].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun inlineImages(inlineImages: Boolean) = inlineImages(inlineImages as Boolean?)

                /** Alias for calling [Builder.inlineImages] with `inlineImages.orElse(null)`. */
                fun inlineImages(inlineImages: Optional<Boolean>) =
                    inlineImages(inlineImages.getOrNull())

                /**
                 * Sets [Builder.inlineImages] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inlineImages] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inlineImages(inlineImages: JsonField<Boolean>) = apply {
                    this.inlineImages = inlineImages
                }

                /**
                 * Table formatting options including markdown vs HTML format and merging behavior
                 */
                fun tables(tables: Tables) = tables(JsonField.of(tables))

                /**
                 * Sets [Builder.tables] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tables] with a well-typed [Tables] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tables(tables: JsonField<Tables>) = apply { this.tables = tables }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Markdown].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Markdown =
                    Markdown(
                        annotateLinks,
                        inlineImages,
                        tables,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Markdown = apply {
                if (validated) {
                    return@apply
                }

                annotateLinks()
                inlineImages()
                tables().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (annotateLinks.asKnown().isPresent) 1 else 0) +
                    (if (inlineImages.asKnown().isPresent) 1 else 0) +
                    (tables.asKnown().getOrNull()?.validity() ?: 0)

            /** Table formatting options including markdown vs HTML format and merging behavior */
            class Tables
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val compactMarkdownTables: JsonField<Boolean>,
                private val markdownTableMultilineSeparator: JsonField<String>,
                private val mergeContinuedTables: JsonField<Boolean>,
                private val outputTablesAsMarkdown: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("compact_markdown_tables")
                    @ExcludeMissing
                    compactMarkdownTables: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("markdown_table_multiline_separator")
                    @ExcludeMissing
                    markdownTableMultilineSeparator: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("merge_continued_tables")
                    @ExcludeMissing
                    mergeContinuedTables: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("output_tables_as_markdown")
                    @ExcludeMissing
                    outputTablesAsMarkdown: JsonField<Boolean> = JsonMissing.of(),
                ) : this(
                    compactMarkdownTables,
                    markdownTableMultilineSeparator,
                    mergeContinuedTables,
                    outputTablesAsMarkdown,
                    mutableMapOf(),
                )

                /**
                 * Remove extra whitespace padding in markdown table cells for more compact output
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun compactMarkdownTables(): Optional<Boolean> =
                    compactMarkdownTables.getOptional("compact_markdown_tables")

                /**
                 * Separator string for multiline cell content in markdown tables. Example:
                 * '&lt;br&gt;' to preserve line breaks, ' ' to join with spaces
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun markdownTableMultilineSeparator(): Optional<String> =
                    markdownTableMultilineSeparator.getOptional(
                        "markdown_table_multiline_separator"
                    )

                /**
                 * Automatically merge tables that span multiple pages into a single table. The
                 * merged table appears on the first page with merged_from_pages metadata
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun mergeContinuedTables(): Optional<Boolean> =
                    mergeContinuedTables.getOptional("merge_continued_tables")

                /**
                 * Output tables as markdown pipe tables instead of HTML &lt;table&gt; tags.
                 * Markdown tables are simpler but cannot represent complex structures like merged
                 * cells
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun outputTablesAsMarkdown(): Optional<Boolean> =
                    outputTablesAsMarkdown.getOptional("output_tables_as_markdown")

                /**
                 * Returns the raw JSON value of [compactMarkdownTables].
                 *
                 * Unlike [compactMarkdownTables], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("compact_markdown_tables")
                @ExcludeMissing
                fun _compactMarkdownTables(): JsonField<Boolean> = compactMarkdownTables

                /**
                 * Returns the raw JSON value of [markdownTableMultilineSeparator].
                 *
                 * Unlike [markdownTableMultilineSeparator], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("markdown_table_multiline_separator")
                @ExcludeMissing
                fun _markdownTableMultilineSeparator(): JsonField<String> =
                    markdownTableMultilineSeparator

                /**
                 * Returns the raw JSON value of [mergeContinuedTables].
                 *
                 * Unlike [mergeContinuedTables], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("merge_continued_tables")
                @ExcludeMissing
                fun _mergeContinuedTables(): JsonField<Boolean> = mergeContinuedTables

                /**
                 * Returns the raw JSON value of [outputTablesAsMarkdown].
                 *
                 * Unlike [outputTablesAsMarkdown], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("output_tables_as_markdown")
                @ExcludeMissing
                fun _outputTablesAsMarkdown(): JsonField<Boolean> = outputTablesAsMarkdown

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Tables]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tables]. */
                class Builder internal constructor() {

                    private var compactMarkdownTables: JsonField<Boolean> = JsonMissing.of()
                    private var markdownTableMultilineSeparator: JsonField<String> =
                        JsonMissing.of()
                    private var mergeContinuedTables: JsonField<Boolean> = JsonMissing.of()
                    private var outputTablesAsMarkdown: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tables: Tables) = apply {
                        compactMarkdownTables = tables.compactMarkdownTables
                        markdownTableMultilineSeparator = tables.markdownTableMultilineSeparator
                        mergeContinuedTables = tables.mergeContinuedTables
                        outputTablesAsMarkdown = tables.outputTablesAsMarkdown
                        additionalProperties = tables.additionalProperties.toMutableMap()
                    }

                    /**
                     * Remove extra whitespace padding in markdown table cells for more compact
                     * output
                     */
                    fun compactMarkdownTables(compactMarkdownTables: Boolean?) =
                        compactMarkdownTables(JsonField.ofNullable(compactMarkdownTables))

                    /**
                     * Alias for [Builder.compactMarkdownTables].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun compactMarkdownTables(compactMarkdownTables: Boolean) =
                        compactMarkdownTables(compactMarkdownTables as Boolean?)

                    /**
                     * Alias for calling [Builder.compactMarkdownTables] with
                     * `compactMarkdownTables.orElse(null)`.
                     */
                    fun compactMarkdownTables(compactMarkdownTables: Optional<Boolean>) =
                        compactMarkdownTables(compactMarkdownTables.getOrNull())

                    /**
                     * Sets [Builder.compactMarkdownTables] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.compactMarkdownTables] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun compactMarkdownTables(compactMarkdownTables: JsonField<Boolean>) = apply {
                        this.compactMarkdownTables = compactMarkdownTables
                    }

                    /**
                     * Separator string for multiline cell content in markdown tables. Example:
                     * '&lt;br&gt;' to preserve line breaks, ' ' to join with spaces
                     */
                    fun markdownTableMultilineSeparator(markdownTableMultilineSeparator: String?) =
                        markdownTableMultilineSeparator(
                            JsonField.ofNullable(markdownTableMultilineSeparator)
                        )

                    /**
                     * Alias for calling [Builder.markdownTableMultilineSeparator] with
                     * `markdownTableMultilineSeparator.orElse(null)`.
                     */
                    fun markdownTableMultilineSeparator(
                        markdownTableMultilineSeparator: Optional<String>
                    ) = markdownTableMultilineSeparator(markdownTableMultilineSeparator.getOrNull())

                    /**
                     * Sets [Builder.markdownTableMultilineSeparator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.markdownTableMultilineSeparator] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun markdownTableMultilineSeparator(
                        markdownTableMultilineSeparator: JsonField<String>
                    ) = apply {
                        this.markdownTableMultilineSeparator = markdownTableMultilineSeparator
                    }

                    /**
                     * Automatically merge tables that span multiple pages into a single table. The
                     * merged table appears on the first page with merged_from_pages metadata
                     */
                    fun mergeContinuedTables(mergeContinuedTables: Boolean?) =
                        mergeContinuedTables(JsonField.ofNullable(mergeContinuedTables))

                    /**
                     * Alias for [Builder.mergeContinuedTables].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun mergeContinuedTables(mergeContinuedTables: Boolean) =
                        mergeContinuedTables(mergeContinuedTables as Boolean?)

                    /**
                     * Alias for calling [Builder.mergeContinuedTables] with
                     * `mergeContinuedTables.orElse(null)`.
                     */
                    fun mergeContinuedTables(mergeContinuedTables: Optional<Boolean>) =
                        mergeContinuedTables(mergeContinuedTables.getOrNull())

                    /**
                     * Sets [Builder.mergeContinuedTables] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mergeContinuedTables] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun mergeContinuedTables(mergeContinuedTables: JsonField<Boolean>) = apply {
                        this.mergeContinuedTables = mergeContinuedTables
                    }

                    /**
                     * Output tables as markdown pipe tables instead of HTML &lt;table&gt; tags.
                     * Markdown tables are simpler but cannot represent complex structures like
                     * merged cells
                     */
                    fun outputTablesAsMarkdown(outputTablesAsMarkdown: Boolean?) =
                        outputTablesAsMarkdown(JsonField.ofNullable(outputTablesAsMarkdown))

                    /**
                     * Alias for [Builder.outputTablesAsMarkdown].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun outputTablesAsMarkdown(outputTablesAsMarkdown: Boolean) =
                        outputTablesAsMarkdown(outputTablesAsMarkdown as Boolean?)

                    /**
                     * Alias for calling [Builder.outputTablesAsMarkdown] with
                     * `outputTablesAsMarkdown.orElse(null)`.
                     */
                    fun outputTablesAsMarkdown(outputTablesAsMarkdown: Optional<Boolean>) =
                        outputTablesAsMarkdown(outputTablesAsMarkdown.getOrNull())

                    /**
                     * Sets [Builder.outputTablesAsMarkdown] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outputTablesAsMarkdown] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun outputTablesAsMarkdown(outputTablesAsMarkdown: JsonField<Boolean>) = apply {
                        this.outputTablesAsMarkdown = outputTablesAsMarkdown
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Tables].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Tables =
                        Tables(
                            compactMarkdownTables,
                            markdownTableMultilineSeparator,
                            mergeContinuedTables,
                            outputTablesAsMarkdown,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Tables = apply {
                    if (validated) {
                        return@apply
                    }

                    compactMarkdownTables()
                    markdownTableMultilineSeparator()
                    mergeContinuedTables()
                    outputTablesAsMarkdown()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (compactMarkdownTables.asKnown().isPresent) 1 else 0) +
                        (if (markdownTableMultilineSeparator.asKnown().isPresent) 1 else 0) +
                        (if (mergeContinuedTables.asKnown().isPresent) 1 else 0) +
                        (if (outputTablesAsMarkdown.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tables &&
                        compactMarkdownTables == other.compactMarkdownTables &&
                        markdownTableMultilineSeparator == other.markdownTableMultilineSeparator &&
                        mergeContinuedTables == other.mergeContinuedTables &&
                        outputTablesAsMarkdown == other.outputTablesAsMarkdown &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        compactMarkdownTables,
                        markdownTableMultilineSeparator,
                        mergeContinuedTables,
                        outputTablesAsMarkdown,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tables{compactMarkdownTables=$compactMarkdownTables, markdownTableMultilineSeparator=$markdownTableMultilineSeparator, mergeContinuedTables=$mergeContinuedTables, outputTablesAsMarkdown=$outputTablesAsMarkdown, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Markdown &&
                    annotateLinks == other.annotateLinks &&
                    inlineImages == other.inlineImages &&
                    tables == other.tables &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(annotateLinks, inlineImages, tables, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Markdown{annotateLinks=$annotateLinks, inlineImages=$inlineImages, tables=$tables, additionalProperties=$additionalProperties}"
        }

        /** Spatial text output options for preserving document layout structure */
        class SpatialText
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val doNotUnrollColumns: JsonField<Boolean>,
            private val preserveLayoutAlignmentAcrossPages: JsonField<Boolean>,
            private val preserveVerySmallText: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("do_not_unroll_columns")
                @ExcludeMissing
                doNotUnrollColumns: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("preserve_layout_alignment_across_pages")
                @ExcludeMissing
                preserveLayoutAlignmentAcrossPages: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("preserve_very_small_text")
                @ExcludeMissing
                preserveVerySmallText: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                doNotUnrollColumns,
                preserveLayoutAlignmentAcrossPages,
                preserveVerySmallText,
                mutableMapOf(),
            )

            /**
             * Keep multi-column layouts intact instead of linearizing columns into sequential text.
             * Automatically enabled for non-fast tiers
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun doNotUnrollColumns(): Optional<Boolean> =
                doNotUnrollColumns.getOptional("do_not_unroll_columns")

            /**
             * Maintain consistent text column alignment across page boundaries. Automatically
             * enabled for document-level parsing modes
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun preserveLayoutAlignmentAcrossPages(): Optional<Boolean> =
                preserveLayoutAlignmentAcrossPages.getOptional(
                    "preserve_layout_alignment_across_pages"
                )

            /**
             * Include text below the normal size threshold. Useful for footnotes, watermarks, or
             * fine print that might otherwise be filtered out
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun preserveVerySmallText(): Optional<Boolean> =
                preserveVerySmallText.getOptional("preserve_very_small_text")

            /**
             * Returns the raw JSON value of [doNotUnrollColumns].
             *
             * Unlike [doNotUnrollColumns], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("do_not_unroll_columns")
            @ExcludeMissing
            fun _doNotUnrollColumns(): JsonField<Boolean> = doNotUnrollColumns

            /**
             * Returns the raw JSON value of [preserveLayoutAlignmentAcrossPages].
             *
             * Unlike [preserveLayoutAlignmentAcrossPages], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("preserve_layout_alignment_across_pages")
            @ExcludeMissing
            fun _preserveLayoutAlignmentAcrossPages(): JsonField<Boolean> =
                preserveLayoutAlignmentAcrossPages

            /**
             * Returns the raw JSON value of [preserveVerySmallText].
             *
             * Unlike [preserveVerySmallText], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("preserve_very_small_text")
            @ExcludeMissing
            fun _preserveVerySmallText(): JsonField<Boolean> = preserveVerySmallText

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [SpatialText]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SpatialText]. */
            class Builder internal constructor() {

                private var doNotUnrollColumns: JsonField<Boolean> = JsonMissing.of()
                private var preserveLayoutAlignmentAcrossPages: JsonField<Boolean> =
                    JsonMissing.of()
                private var preserveVerySmallText: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spatialText: SpatialText) = apply {
                    doNotUnrollColumns = spatialText.doNotUnrollColumns
                    preserveLayoutAlignmentAcrossPages =
                        spatialText.preserveLayoutAlignmentAcrossPages
                    preserveVerySmallText = spatialText.preserveVerySmallText
                    additionalProperties = spatialText.additionalProperties.toMutableMap()
                }

                /**
                 * Keep multi-column layouts intact instead of linearizing columns into sequential
                 * text. Automatically enabled for non-fast tiers
                 */
                fun doNotUnrollColumns(doNotUnrollColumns: Boolean?) =
                    doNotUnrollColumns(JsonField.ofNullable(doNotUnrollColumns))

                /**
                 * Alias for [Builder.doNotUnrollColumns].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun doNotUnrollColumns(doNotUnrollColumns: Boolean) =
                    doNotUnrollColumns(doNotUnrollColumns as Boolean?)

                /**
                 * Alias for calling [Builder.doNotUnrollColumns] with
                 * `doNotUnrollColumns.orElse(null)`.
                 */
                fun doNotUnrollColumns(doNotUnrollColumns: Optional<Boolean>) =
                    doNotUnrollColumns(doNotUnrollColumns.getOrNull())

                /**
                 * Sets [Builder.doNotUnrollColumns] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doNotUnrollColumns] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun doNotUnrollColumns(doNotUnrollColumns: JsonField<Boolean>) = apply {
                    this.doNotUnrollColumns = doNotUnrollColumns
                }

                /**
                 * Maintain consistent text column alignment across page boundaries. Automatically
                 * enabled for document-level parsing modes
                 */
                fun preserveLayoutAlignmentAcrossPages(
                    preserveLayoutAlignmentAcrossPages: Boolean?
                ) =
                    preserveLayoutAlignmentAcrossPages(
                        JsonField.ofNullable(preserveLayoutAlignmentAcrossPages)
                    )

                /**
                 * Alias for [Builder.preserveLayoutAlignmentAcrossPages].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun preserveLayoutAlignmentAcrossPages(
                    preserveLayoutAlignmentAcrossPages: Boolean
                ) =
                    preserveLayoutAlignmentAcrossPages(
                        preserveLayoutAlignmentAcrossPages as Boolean?
                    )

                /**
                 * Alias for calling [Builder.preserveLayoutAlignmentAcrossPages] with
                 * `preserveLayoutAlignmentAcrossPages.orElse(null)`.
                 */
                fun preserveLayoutAlignmentAcrossPages(
                    preserveLayoutAlignmentAcrossPages: Optional<Boolean>
                ) =
                    preserveLayoutAlignmentAcrossPages(
                        preserveLayoutAlignmentAcrossPages.getOrNull()
                    )

                /**
                 * Sets [Builder.preserveLayoutAlignmentAcrossPages] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preserveLayoutAlignmentAcrossPages] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun preserveLayoutAlignmentAcrossPages(
                    preserveLayoutAlignmentAcrossPages: JsonField<Boolean>
                ) = apply {
                    this.preserveLayoutAlignmentAcrossPages = preserveLayoutAlignmentAcrossPages
                }

                /**
                 * Include text below the normal size threshold. Useful for footnotes, watermarks,
                 * or fine print that might otherwise be filtered out
                 */
                fun preserveVerySmallText(preserveVerySmallText: Boolean?) =
                    preserveVerySmallText(JsonField.ofNullable(preserveVerySmallText))

                /**
                 * Alias for [Builder.preserveVerySmallText].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun preserveVerySmallText(preserveVerySmallText: Boolean) =
                    preserveVerySmallText(preserveVerySmallText as Boolean?)

                /**
                 * Alias for calling [Builder.preserveVerySmallText] with
                 * `preserveVerySmallText.orElse(null)`.
                 */
                fun preserveVerySmallText(preserveVerySmallText: Optional<Boolean>) =
                    preserveVerySmallText(preserveVerySmallText.getOrNull())

                /**
                 * Sets [Builder.preserveVerySmallText] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preserveVerySmallText] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun preserveVerySmallText(preserveVerySmallText: JsonField<Boolean>) = apply {
                    this.preserveVerySmallText = preserveVerySmallText
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SpatialText].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SpatialText =
                    SpatialText(
                        doNotUnrollColumns,
                        preserveLayoutAlignmentAcrossPages,
                        preserveVerySmallText,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SpatialText = apply {
                if (validated) {
                    return@apply
                }

                doNotUnrollColumns()
                preserveLayoutAlignmentAcrossPages()
                preserveVerySmallText()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (doNotUnrollColumns.asKnown().isPresent) 1 else 0) +
                    (if (preserveLayoutAlignmentAcrossPages.asKnown().isPresent) 1 else 0) +
                    (if (preserveVerySmallText.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SpatialText &&
                    doNotUnrollColumns == other.doNotUnrollColumns &&
                    preserveLayoutAlignmentAcrossPages ==
                        other.preserveLayoutAlignmentAcrossPages &&
                    preserveVerySmallText == other.preserveVerySmallText &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    doNotUnrollColumns,
                    preserveLayoutAlignmentAcrossPages,
                    preserveVerySmallText,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SpatialText{doNotUnrollColumns=$doNotUnrollColumns, preserveLayoutAlignmentAcrossPages=$preserveLayoutAlignmentAcrossPages, preserveVerySmallText=$preserveVerySmallText, additionalProperties=$additionalProperties}"
        }

        /** Options for exporting tables as XLSX spreadsheets */
        class TablesAsSpreadsheet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val enable: JsonField<Boolean>,
            private val guessSheetName: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("enable")
                @ExcludeMissing
                enable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("guess_sheet_name")
                @ExcludeMissing
                guessSheetName: JsonField<Boolean> = JsonMissing.of(),
            ) : this(enable, guessSheetName, mutableMapOf())

            /**
             * Whether this option is enabled
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun enable(): Optional<Boolean> = enable.getOptional("enable")

            /**
             * Automatically generate descriptive sheet names from table context (headers,
             * surrounding text) instead of using generic names like 'Table_1'
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun guessSheetName(): Optional<Boolean> = guessSheetName.getOptional("guess_sheet_name")

            /**
             * Returns the raw JSON value of [enable].
             *
             * Unlike [enable], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("enable") @ExcludeMissing fun _enable(): JsonField<Boolean> = enable

            /**
             * Returns the raw JSON value of [guessSheetName].
             *
             * Unlike [guessSheetName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("guess_sheet_name")
            @ExcludeMissing
            fun _guessSheetName(): JsonField<Boolean> = guessSheetName

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [TablesAsSpreadsheet].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TablesAsSpreadsheet]. */
            class Builder internal constructor() {

                private var enable: JsonField<Boolean> = JsonMissing.of()
                private var guessSheetName: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tablesAsSpreadsheet: TablesAsSpreadsheet) = apply {
                    enable = tablesAsSpreadsheet.enable
                    guessSheetName = tablesAsSpreadsheet.guessSheetName
                    additionalProperties = tablesAsSpreadsheet.additionalProperties.toMutableMap()
                }

                /** Whether this option is enabled */
                fun enable(enable: Boolean?) = enable(JsonField.ofNullable(enable))

                /**
                 * Alias for [Builder.enable].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun enable(enable: Boolean) = enable(enable as Boolean?)

                /** Alias for calling [Builder.enable] with `enable.orElse(null)`. */
                fun enable(enable: Optional<Boolean>) = enable(enable.getOrNull())

                /**
                 * Sets [Builder.enable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enable(enable: JsonField<Boolean>) = apply { this.enable = enable }

                /**
                 * Automatically generate descriptive sheet names from table context (headers,
                 * surrounding text) instead of using generic names like 'Table_1'
                 */
                fun guessSheetName(guessSheetName: Boolean) =
                    guessSheetName(JsonField.of(guessSheetName))

                /**
                 * Sets [Builder.guessSheetName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.guessSheetName] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun guessSheetName(guessSheetName: JsonField<Boolean>) = apply {
                    this.guessSheetName = guessSheetName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TablesAsSpreadsheet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TablesAsSpreadsheet =
                    TablesAsSpreadsheet(enable, guessSheetName, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): TablesAsSpreadsheet = apply {
                if (validated) {
                    return@apply
                }

                enable()
                guessSheetName()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (enable.asKnown().isPresent) 1 else 0) +
                    (if (guessSheetName.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TablesAsSpreadsheet &&
                    enable == other.enable &&
                    guessSheetName == other.guessSheetName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(enable, guessSheetName, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TablesAsSpreadsheet{enable=$enable, guessSheetName=$guessSheetName, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OutputOptions &&
                additionalOutputs == other.additionalOutputs &&
                extractPrintedPageNumber == other.extractPrintedPageNumber &&
                granularBboxes == other.granularBboxes &&
                imagesToSave == other.imagesToSave &&
                markdown == other.markdown &&
                spatialText == other.spatialText &&
                tablesAsSpreadsheet == other.tablesAsSpreadsheet &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                additionalOutputs,
                extractPrintedPageNumber,
                granularBboxes,
                imagesToSave,
                markdown,
                spatialText,
                tablesAsSpreadsheet,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OutputOptions{additionalOutputs=$additionalOutputs, extractPrintedPageNumber=$extractPrintedPageNumber, granularBboxes=$granularBboxes, imagesToSave=$imagesToSave, markdown=$markdown, spatialText=$spatialText, tablesAsSpreadsheet=$tablesAsSpreadsheet, additionalProperties=$additionalProperties}"
    }

    /** Page selection: limit total pages or specify exact pages to process */
    class PageRanges
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val maxPages: JsonField<Long>,
        private val targetPages: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("max_pages") @ExcludeMissing maxPages: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("target_pages")
            @ExcludeMissing
            targetPages: JsonField<String> = JsonMissing.of(),
        ) : this(maxPages, targetPages, mutableMapOf())

        /**
         * Maximum number of pages to process. Pages are processed in order starting from page 1. If
         * both max_pages and target_pages are set, target_pages takes precedence
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxPages(): Optional<Long> = maxPages.getOptional("max_pages")

        /**
         * Comma-separated list of specific pages to process using 1-based indexing. Supports
         * individual pages and ranges. Examples: '1,3,5' (pages 1, 3, 5), '1-5' (pages 1 through 5
         * inclusive), '1,3,5-8,10' (pages 1, 3, 5-8, and 10). Pages are sorted and deduplicated
         * automatically. Duplicate pages cause an error
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun targetPages(): Optional<String> = targetPages.getOptional("target_pages")

        /**
         * Returns the raw JSON value of [maxPages].
         *
         * Unlike [maxPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_pages") @ExcludeMissing fun _maxPages(): JsonField<Long> = maxPages

        /**
         * Returns the raw JSON value of [targetPages].
         *
         * Unlike [targetPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target_pages")
        @ExcludeMissing
        fun _targetPages(): JsonField<String> = targetPages

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PageRanges]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PageRanges]. */
        class Builder internal constructor() {

            private var maxPages: JsonField<Long> = JsonMissing.of()
            private var targetPages: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pageRanges: PageRanges) = apply {
                maxPages = pageRanges.maxPages
                targetPages = pageRanges.targetPages
                additionalProperties = pageRanges.additionalProperties.toMutableMap()
            }

            /**
             * Maximum number of pages to process. Pages are processed in order starting from
             * page 1. If both max_pages and target_pages are set, target_pages takes precedence
             */
            fun maxPages(maxPages: Long?) = maxPages(JsonField.ofNullable(maxPages))

            /**
             * Alias for [Builder.maxPages].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxPages(maxPages: Long) = maxPages(maxPages as Long?)

            /** Alias for calling [Builder.maxPages] with `maxPages.orElse(null)`. */
            fun maxPages(maxPages: Optional<Long>) = maxPages(maxPages.getOrNull())

            /**
             * Sets [Builder.maxPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxPages] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxPages(maxPages: JsonField<Long>) = apply { this.maxPages = maxPages }

            /**
             * Comma-separated list of specific pages to process using 1-based indexing. Supports
             * individual pages and ranges. Examples: '1,3,5' (pages 1, 3, 5), '1-5' (pages 1
             * through 5 inclusive), '1,3,5-8,10' (pages 1, 3, 5-8, and 10). Pages are sorted and
             * deduplicated automatically. Duplicate pages cause an error
             */
            fun targetPages(targetPages: String?) = targetPages(JsonField.ofNullable(targetPages))

            /** Alias for calling [Builder.targetPages] with `targetPages.orElse(null)`. */
            fun targetPages(targetPages: Optional<String>) = targetPages(targetPages.getOrNull())

            /**
             * Sets [Builder.targetPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetPages] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetPages(targetPages: JsonField<String>) = apply {
                this.targetPages = targetPages
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PageRanges].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PageRanges =
                PageRanges(maxPages, targetPages, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PageRanges = apply {
            if (validated) {
                return@apply
            }

            maxPages()
            targetPages()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (maxPages.asKnown().isPresent) 1 else 0) +
                (if (targetPages.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PageRanges &&
                maxPages == other.maxPages &&
                targetPages == other.targetPages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(maxPages, targetPages, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PageRanges{maxPages=$maxPages, targetPages=$targetPages, additionalProperties=$additionalProperties}"
    }

    /** Job execution controls including timeouts and failure thresholds */
    class ProcessingControl
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val jobFailureConditions: JsonField<JobFailureConditions>,
        private val timeouts: JsonField<Timeouts>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("job_failure_conditions")
            @ExcludeMissing
            jobFailureConditions: JsonField<JobFailureConditions> = JsonMissing.of(),
            @JsonProperty("timeouts")
            @ExcludeMissing
            timeouts: JsonField<Timeouts> = JsonMissing.of(),
        ) : this(jobFailureConditions, timeouts, mutableMapOf())

        /**
         * Quality thresholds that determine when a job should fail vs complete with partial results
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun jobFailureConditions(): Optional<JobFailureConditions> =
            jobFailureConditions.getOptional("job_failure_conditions")

        /**
         * Timeout settings for job execution. Increase for large or complex documents
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timeouts(): Optional<Timeouts> = timeouts.getOptional("timeouts")

        /**
         * Returns the raw JSON value of [jobFailureConditions].
         *
         * Unlike [jobFailureConditions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("job_failure_conditions")
        @ExcludeMissing
        fun _jobFailureConditions(): JsonField<JobFailureConditions> = jobFailureConditions

        /**
         * Returns the raw JSON value of [timeouts].
         *
         * Unlike [timeouts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeouts") @ExcludeMissing fun _timeouts(): JsonField<Timeouts> = timeouts

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ProcessingControl]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProcessingControl]. */
        class Builder internal constructor() {

            private var jobFailureConditions: JsonField<JobFailureConditions> = JsonMissing.of()
            private var timeouts: JsonField<Timeouts> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(processingControl: ProcessingControl) = apply {
                jobFailureConditions = processingControl.jobFailureConditions
                timeouts = processingControl.timeouts
                additionalProperties = processingControl.additionalProperties.toMutableMap()
            }

            /**
             * Quality thresholds that determine when a job should fail vs complete with partial
             * results
             */
            fun jobFailureConditions(jobFailureConditions: JobFailureConditions) =
                jobFailureConditions(JsonField.of(jobFailureConditions))

            /**
             * Sets [Builder.jobFailureConditions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobFailureConditions] with a well-typed
             * [JobFailureConditions] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun jobFailureConditions(jobFailureConditions: JsonField<JobFailureConditions>) =
                apply {
                    this.jobFailureConditions = jobFailureConditions
                }

            /** Timeout settings for job execution. Increase for large or complex documents */
            fun timeouts(timeouts: Timeouts) = timeouts(JsonField.of(timeouts))

            /**
             * Sets [Builder.timeouts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeouts] with a well-typed [Timeouts] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeouts(timeouts: JsonField<Timeouts>) = apply { this.timeouts = timeouts }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ProcessingControl].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ProcessingControl =
                ProcessingControl(
                    jobFailureConditions,
                    timeouts,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ProcessingControl = apply {
            if (validated) {
                return@apply
            }

            jobFailureConditions().ifPresent { it.validate() }
            timeouts().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (jobFailureConditions.asKnown().getOrNull()?.validity() ?: 0) +
                (timeouts.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Quality thresholds that determine when a job should fail vs complete with partial results
         */
        class JobFailureConditions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val allowedPageFailureRatio: JsonField<Double>,
            private val failOnBuggyFont: JsonField<Boolean>,
            private val failOnImageExtractionError: JsonField<Boolean>,
            private val failOnImageOcrError: JsonField<Boolean>,
            private val failOnMarkdownReconstructionError: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allowed_page_failure_ratio")
                @ExcludeMissing
                allowedPageFailureRatio: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fail_on_buggy_font")
                @ExcludeMissing
                failOnBuggyFont: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("fail_on_image_extraction_error")
                @ExcludeMissing
                failOnImageExtractionError: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("fail_on_image_ocr_error")
                @ExcludeMissing
                failOnImageOcrError: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("fail_on_markdown_reconstruction_error")
                @ExcludeMissing
                failOnMarkdownReconstructionError: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                allowedPageFailureRatio,
                failOnBuggyFont,
                failOnImageExtractionError,
                failOnImageOcrError,
                failOnMarkdownReconstructionError,
                mutableMapOf(),
            )

            /**
             * Maximum ratio of pages allowed to fail before the job fails (0-1). Example: 0.1 means
             * job fails if more than 10% of pages fail. Default is 0.05 (5%)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allowedPageFailureRatio(): Optional<Double> =
                allowedPageFailureRatio.getOptional("allowed_page_failure_ratio")

            /**
             * Fail the job if a problematic font is detected that may cause incorrect text
             * extraction. Buggy fonts can produce garbled or missing characters
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun failOnBuggyFont(): Optional<Boolean> =
                failOnBuggyFont.getOptional("fail_on_buggy_font")

            /**
             * Fail the entire job if any embedded image cannot be extracted. By default, image
             * extraction errors are logged but don't fail the job
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun failOnImageExtractionError(): Optional<Boolean> =
                failOnImageExtractionError.getOptional("fail_on_image_extraction_error")

            /**
             * Fail the entire job if OCR fails on any image. By default, OCR errors result in empty
             * text for that image
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun failOnImageOcrError(): Optional<Boolean> =
                failOnImageOcrError.getOptional("fail_on_image_ocr_error")

            /**
             * Fail the entire job if markdown cannot be reconstructed for any page. By default,
             * failed pages use fallback text extraction
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun failOnMarkdownReconstructionError(): Optional<Boolean> =
                failOnMarkdownReconstructionError.getOptional(
                    "fail_on_markdown_reconstruction_error"
                )

            /**
             * Returns the raw JSON value of [allowedPageFailureRatio].
             *
             * Unlike [allowedPageFailureRatio], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("allowed_page_failure_ratio")
            @ExcludeMissing
            fun _allowedPageFailureRatio(): JsonField<Double> = allowedPageFailureRatio

            /**
             * Returns the raw JSON value of [failOnBuggyFont].
             *
             * Unlike [failOnBuggyFont], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fail_on_buggy_font")
            @ExcludeMissing
            fun _failOnBuggyFont(): JsonField<Boolean> = failOnBuggyFont

            /**
             * Returns the raw JSON value of [failOnImageExtractionError].
             *
             * Unlike [failOnImageExtractionError], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("fail_on_image_extraction_error")
            @ExcludeMissing
            fun _failOnImageExtractionError(): JsonField<Boolean> = failOnImageExtractionError

            /**
             * Returns the raw JSON value of [failOnImageOcrError].
             *
             * Unlike [failOnImageOcrError], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fail_on_image_ocr_error")
            @ExcludeMissing
            fun _failOnImageOcrError(): JsonField<Boolean> = failOnImageOcrError

            /**
             * Returns the raw JSON value of [failOnMarkdownReconstructionError].
             *
             * Unlike [failOnMarkdownReconstructionError], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("fail_on_markdown_reconstruction_error")
            @ExcludeMissing
            fun _failOnMarkdownReconstructionError(): JsonField<Boolean> =
                failOnMarkdownReconstructionError

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [JobFailureConditions].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [JobFailureConditions]. */
            class Builder internal constructor() {

                private var allowedPageFailureRatio: JsonField<Double> = JsonMissing.of()
                private var failOnBuggyFont: JsonField<Boolean> = JsonMissing.of()
                private var failOnImageExtractionError: JsonField<Boolean> = JsonMissing.of()
                private var failOnImageOcrError: JsonField<Boolean> = JsonMissing.of()
                private var failOnMarkdownReconstructionError: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(jobFailureConditions: JobFailureConditions) = apply {
                    allowedPageFailureRatio = jobFailureConditions.allowedPageFailureRatio
                    failOnBuggyFont = jobFailureConditions.failOnBuggyFont
                    failOnImageExtractionError = jobFailureConditions.failOnImageExtractionError
                    failOnImageOcrError = jobFailureConditions.failOnImageOcrError
                    failOnMarkdownReconstructionError =
                        jobFailureConditions.failOnMarkdownReconstructionError
                    additionalProperties = jobFailureConditions.additionalProperties.toMutableMap()
                }

                /**
                 * Maximum ratio of pages allowed to fail before the job fails (0-1). Example: 0.1
                 * means job fails if more than 10% of pages fail. Default is 0.05 (5%)
                 */
                fun allowedPageFailureRatio(allowedPageFailureRatio: Double?) =
                    allowedPageFailureRatio(JsonField.ofNullable(allowedPageFailureRatio))

                /**
                 * Alias for [Builder.allowedPageFailureRatio].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun allowedPageFailureRatio(allowedPageFailureRatio: Double) =
                    allowedPageFailureRatio(allowedPageFailureRatio as Double?)

                /**
                 * Alias for calling [Builder.allowedPageFailureRatio] with
                 * `allowedPageFailureRatio.orElse(null)`.
                 */
                fun allowedPageFailureRatio(allowedPageFailureRatio: Optional<Double>) =
                    allowedPageFailureRatio(allowedPageFailureRatio.getOrNull())

                /**
                 * Sets [Builder.allowedPageFailureRatio] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedPageFailureRatio] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun allowedPageFailureRatio(allowedPageFailureRatio: JsonField<Double>) = apply {
                    this.allowedPageFailureRatio = allowedPageFailureRatio
                }

                /**
                 * Fail the job if a problematic font is detected that may cause incorrect text
                 * extraction. Buggy fonts can produce garbled or missing characters
                 */
                fun failOnBuggyFont(failOnBuggyFont: Boolean?) =
                    failOnBuggyFont(JsonField.ofNullable(failOnBuggyFont))

                /**
                 * Alias for [Builder.failOnBuggyFont].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun failOnBuggyFont(failOnBuggyFont: Boolean) =
                    failOnBuggyFont(failOnBuggyFont as Boolean?)

                /**
                 * Alias for calling [Builder.failOnBuggyFont] with `failOnBuggyFont.orElse(null)`.
                 */
                fun failOnBuggyFont(failOnBuggyFont: Optional<Boolean>) =
                    failOnBuggyFont(failOnBuggyFont.getOrNull())

                /**
                 * Sets [Builder.failOnBuggyFont] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failOnBuggyFont] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun failOnBuggyFont(failOnBuggyFont: JsonField<Boolean>) = apply {
                    this.failOnBuggyFont = failOnBuggyFont
                }

                /**
                 * Fail the entire job if any embedded image cannot be extracted. By default, image
                 * extraction errors are logged but don't fail the job
                 */
                fun failOnImageExtractionError(failOnImageExtractionError: Boolean?) =
                    failOnImageExtractionError(JsonField.ofNullable(failOnImageExtractionError))

                /**
                 * Alias for [Builder.failOnImageExtractionError].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun failOnImageExtractionError(failOnImageExtractionError: Boolean) =
                    failOnImageExtractionError(failOnImageExtractionError as Boolean?)

                /**
                 * Alias for calling [Builder.failOnImageExtractionError] with
                 * `failOnImageExtractionError.orElse(null)`.
                 */
                fun failOnImageExtractionError(failOnImageExtractionError: Optional<Boolean>) =
                    failOnImageExtractionError(failOnImageExtractionError.getOrNull())

                /**
                 * Sets [Builder.failOnImageExtractionError] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failOnImageExtractionError] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun failOnImageExtractionError(failOnImageExtractionError: JsonField<Boolean>) =
                    apply {
                        this.failOnImageExtractionError = failOnImageExtractionError
                    }

                /**
                 * Fail the entire job if OCR fails on any image. By default, OCR errors result in
                 * empty text for that image
                 */
                fun failOnImageOcrError(failOnImageOcrError: Boolean?) =
                    failOnImageOcrError(JsonField.ofNullable(failOnImageOcrError))

                /**
                 * Alias for [Builder.failOnImageOcrError].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun failOnImageOcrError(failOnImageOcrError: Boolean) =
                    failOnImageOcrError(failOnImageOcrError as Boolean?)

                /**
                 * Alias for calling [Builder.failOnImageOcrError] with
                 * `failOnImageOcrError.orElse(null)`.
                 */
                fun failOnImageOcrError(failOnImageOcrError: Optional<Boolean>) =
                    failOnImageOcrError(failOnImageOcrError.getOrNull())

                /**
                 * Sets [Builder.failOnImageOcrError] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failOnImageOcrError] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun failOnImageOcrError(failOnImageOcrError: JsonField<Boolean>) = apply {
                    this.failOnImageOcrError = failOnImageOcrError
                }

                /**
                 * Fail the entire job if markdown cannot be reconstructed for any page. By default,
                 * failed pages use fallback text extraction
                 */
                fun failOnMarkdownReconstructionError(failOnMarkdownReconstructionError: Boolean?) =
                    failOnMarkdownReconstructionError(
                        JsonField.ofNullable(failOnMarkdownReconstructionError)
                    )

                /**
                 * Alias for [Builder.failOnMarkdownReconstructionError].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun failOnMarkdownReconstructionError(failOnMarkdownReconstructionError: Boolean) =
                    failOnMarkdownReconstructionError(failOnMarkdownReconstructionError as Boolean?)

                /**
                 * Alias for calling [Builder.failOnMarkdownReconstructionError] with
                 * `failOnMarkdownReconstructionError.orElse(null)`.
                 */
                fun failOnMarkdownReconstructionError(
                    failOnMarkdownReconstructionError: Optional<Boolean>
                ) = failOnMarkdownReconstructionError(failOnMarkdownReconstructionError.getOrNull())

                /**
                 * Sets [Builder.failOnMarkdownReconstructionError] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failOnMarkdownReconstructionError] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun failOnMarkdownReconstructionError(
                    failOnMarkdownReconstructionError: JsonField<Boolean>
                ) = apply {
                    this.failOnMarkdownReconstructionError = failOnMarkdownReconstructionError
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [JobFailureConditions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): JobFailureConditions =
                    JobFailureConditions(
                        allowedPageFailureRatio,
                        failOnBuggyFont,
                        failOnImageExtractionError,
                        failOnImageOcrError,
                        failOnMarkdownReconstructionError,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): JobFailureConditions = apply {
                if (validated) {
                    return@apply
                }

                allowedPageFailureRatio()
                failOnBuggyFont()
                failOnImageExtractionError()
                failOnImageOcrError()
                failOnMarkdownReconstructionError()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (allowedPageFailureRatio.asKnown().isPresent) 1 else 0) +
                    (if (failOnBuggyFont.asKnown().isPresent) 1 else 0) +
                    (if (failOnImageExtractionError.asKnown().isPresent) 1 else 0) +
                    (if (failOnImageOcrError.asKnown().isPresent) 1 else 0) +
                    (if (failOnMarkdownReconstructionError.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is JobFailureConditions &&
                    allowedPageFailureRatio == other.allowedPageFailureRatio &&
                    failOnBuggyFont == other.failOnBuggyFont &&
                    failOnImageExtractionError == other.failOnImageExtractionError &&
                    failOnImageOcrError == other.failOnImageOcrError &&
                    failOnMarkdownReconstructionError == other.failOnMarkdownReconstructionError &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    allowedPageFailureRatio,
                    failOnBuggyFont,
                    failOnImageExtractionError,
                    failOnImageOcrError,
                    failOnMarkdownReconstructionError,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "JobFailureConditions{allowedPageFailureRatio=$allowedPageFailureRatio, failOnBuggyFont=$failOnBuggyFont, failOnImageExtractionError=$failOnImageExtractionError, failOnImageOcrError=$failOnImageOcrError, failOnMarkdownReconstructionError=$failOnMarkdownReconstructionError, additionalProperties=$additionalProperties}"
        }

        /** Timeout settings for job execution. Increase for large or complex documents */
        class Timeouts
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val baseInSeconds: JsonField<Long>,
            private val extraTimePerPageInSeconds: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("base_in_seconds")
                @ExcludeMissing
                baseInSeconds: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("extra_time_per_page_in_seconds")
                @ExcludeMissing
                extraTimePerPageInSeconds: JsonField<Long> = JsonMissing.of(),
            ) : this(baseInSeconds, extraTimePerPageInSeconds, mutableMapOf())

            /**
             * Base timeout for the job in seconds (max 7200 = 2 hours). This is the minimum time
             * allowed regardless of document size
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun baseInSeconds(): Optional<Long> = baseInSeconds.getOptional("base_in_seconds")

            /**
             * Additional timeout per page in seconds (max 300 = 5 minutes). Total timeout = base +
             * (this value × page count)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun extraTimePerPageInSeconds(): Optional<Long> =
                extraTimePerPageInSeconds.getOptional("extra_time_per_page_in_seconds")

            /**
             * Returns the raw JSON value of [baseInSeconds].
             *
             * Unlike [baseInSeconds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("base_in_seconds")
            @ExcludeMissing
            fun _baseInSeconds(): JsonField<Long> = baseInSeconds

            /**
             * Returns the raw JSON value of [extraTimePerPageInSeconds].
             *
             * Unlike [extraTimePerPageInSeconds], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("extra_time_per_page_in_seconds")
            @ExcludeMissing
            fun _extraTimePerPageInSeconds(): JsonField<Long> = extraTimePerPageInSeconds

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Timeouts]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Timeouts]. */
            class Builder internal constructor() {

                private var baseInSeconds: JsonField<Long> = JsonMissing.of()
                private var extraTimePerPageInSeconds: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(timeouts: Timeouts) = apply {
                    baseInSeconds = timeouts.baseInSeconds
                    extraTimePerPageInSeconds = timeouts.extraTimePerPageInSeconds
                    additionalProperties = timeouts.additionalProperties.toMutableMap()
                }

                /**
                 * Base timeout for the job in seconds (max 7200 = 2 hours). This is the minimum
                 * time allowed regardless of document size
                 */
                fun baseInSeconds(baseInSeconds: Long?) =
                    baseInSeconds(JsonField.ofNullable(baseInSeconds))

                /**
                 * Alias for [Builder.baseInSeconds].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun baseInSeconds(baseInSeconds: Long) = baseInSeconds(baseInSeconds as Long?)

                /** Alias for calling [Builder.baseInSeconds] with `baseInSeconds.orElse(null)`. */
                fun baseInSeconds(baseInSeconds: Optional<Long>) =
                    baseInSeconds(baseInSeconds.getOrNull())

                /**
                 * Sets [Builder.baseInSeconds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.baseInSeconds] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun baseInSeconds(baseInSeconds: JsonField<Long>) = apply {
                    this.baseInSeconds = baseInSeconds
                }

                /**
                 * Additional timeout per page in seconds (max 300 = 5 minutes). Total timeout =
                 * base + (this value × page count)
                 */
                fun extraTimePerPageInSeconds(extraTimePerPageInSeconds: Long?) =
                    extraTimePerPageInSeconds(JsonField.ofNullable(extraTimePerPageInSeconds))

                /**
                 * Alias for [Builder.extraTimePerPageInSeconds].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun extraTimePerPageInSeconds(extraTimePerPageInSeconds: Long) =
                    extraTimePerPageInSeconds(extraTimePerPageInSeconds as Long?)

                /**
                 * Alias for calling [Builder.extraTimePerPageInSeconds] with
                 * `extraTimePerPageInSeconds.orElse(null)`.
                 */
                fun extraTimePerPageInSeconds(extraTimePerPageInSeconds: Optional<Long>) =
                    extraTimePerPageInSeconds(extraTimePerPageInSeconds.getOrNull())

                /**
                 * Sets [Builder.extraTimePerPageInSeconds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extraTimePerPageInSeconds] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun extraTimePerPageInSeconds(extraTimePerPageInSeconds: JsonField<Long>) = apply {
                    this.extraTimePerPageInSeconds = extraTimePerPageInSeconds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Timeouts].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Timeouts =
                    Timeouts(
                        baseInSeconds,
                        extraTimePerPageInSeconds,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Timeouts = apply {
                if (validated) {
                    return@apply
                }

                baseInSeconds()
                extraTimePerPageInSeconds()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (baseInSeconds.asKnown().isPresent) 1 else 0) +
                    (if (extraTimePerPageInSeconds.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Timeouts &&
                    baseInSeconds == other.baseInSeconds &&
                    extraTimePerPageInSeconds == other.extraTimePerPageInSeconds &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(baseInSeconds, extraTimePerPageInSeconds, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Timeouts{baseInSeconds=$baseInSeconds, extraTimePerPageInSeconds=$extraTimePerPageInSeconds, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProcessingControl &&
                jobFailureConditions == other.jobFailureConditions &&
                timeouts == other.timeouts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(jobFailureConditions, timeouts, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProcessingControl{jobFailureConditions=$jobFailureConditions, timeouts=$timeouts, additionalProperties=$additionalProperties}"
    }

    /** Document processing options including OCR, table extraction, and chart parsing */
    class ProcessingOptions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val aggressiveTableExtraction: JsonField<Boolean>,
        private val autoModeConfiguration: JsonField<List<AutoModeConfiguration>>,
        private val costOptimizer: JsonField<CostOptimizer>,
        private val disableHeuristics: JsonField<Boolean>,
        private val ignore: JsonField<Ignore>,
        private val ocrParameters: JsonField<OcrParameters>,
        private val specializedChartParsing: JsonField<SpecializedChartParsing>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aggressive_table_extraction")
            @ExcludeMissing
            aggressiveTableExtraction: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("auto_mode_configuration")
            @ExcludeMissing
            autoModeConfiguration: JsonField<List<AutoModeConfiguration>> = JsonMissing.of(),
            @JsonProperty("cost_optimizer")
            @ExcludeMissing
            costOptimizer: JsonField<CostOptimizer> = JsonMissing.of(),
            @JsonProperty("disable_heuristics")
            @ExcludeMissing
            disableHeuristics: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("ignore") @ExcludeMissing ignore: JsonField<Ignore> = JsonMissing.of(),
            @JsonProperty("ocr_parameters")
            @ExcludeMissing
            ocrParameters: JsonField<OcrParameters> = JsonMissing.of(),
            @JsonProperty("specialized_chart_parsing")
            @ExcludeMissing
            specializedChartParsing: JsonField<SpecializedChartParsing> = JsonMissing.of(),
        ) : this(
            aggressiveTableExtraction,
            autoModeConfiguration,
            costOptimizer,
            disableHeuristics,
            ignore,
            ocrParameters,
            specializedChartParsing,
            mutableMapOf(),
        )

        /**
         * Use aggressive heuristics to detect table boundaries, even without visible borders.
         * Useful for documents with borderless or complex tables
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun aggressiveTableExtraction(): Optional<Boolean> =
            aggressiveTableExtraction.getOptional("aggressive_table_extraction")

        /**
         * Conditional processing rules that apply different parsing options based on page content,
         * document structure, or filename patterns. Each entry defines trigger conditions and the
         * parsing configuration to apply when triggered
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun autoModeConfiguration(): Optional<List<AutoModeConfiguration>> =
            autoModeConfiguration.getOptional("auto_mode_configuration")

        /**
         * Cost optimizer configuration for reducing parsing costs on simpler pages.
         *
         * When enabled, the parser analyzes each page and routes simpler pages to faster, cheaper
         * processing while preserving quality for complex pages. Only works with 'agentic' or
         * 'agentic_plus' tiers.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun costOptimizer(): Optional<CostOptimizer> = costOptimizer.getOptional("cost_optimizer")

        /**
         * Disable automatic heuristics including outlined table extraction and adaptive long table
         * handling. Use when heuristics produce incorrect results
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun disableHeuristics(): Optional<Boolean> =
            disableHeuristics.getOptional("disable_heuristics")

        /**
         * Options for ignoring specific text types (diagonal, hidden, text in images)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ignore(): Optional<Ignore> = ignore.getOptional("ignore")

        /**
         * OCR configuration including language detection settings
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ocrParameters(): Optional<OcrParameters> = ocrParameters.getOptional("ocr_parameters")

        /**
         * Enable AI-powered chart analysis. Modes: 'efficient' (fast, lower cost), 'agentic'
         * (balanced), 'agentic_plus' (highest accuracy). Automatically enables extract_layout and
         * precise_bounding_box when set
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specializedChartParsing(): Optional<SpecializedChartParsing> =
            specializedChartParsing.getOptional("specialized_chart_parsing")

        /**
         * Returns the raw JSON value of [aggressiveTableExtraction].
         *
         * Unlike [aggressiveTableExtraction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aggressive_table_extraction")
        @ExcludeMissing
        fun _aggressiveTableExtraction(): JsonField<Boolean> = aggressiveTableExtraction

        /**
         * Returns the raw JSON value of [autoModeConfiguration].
         *
         * Unlike [autoModeConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_mode_configuration")
        @ExcludeMissing
        fun _autoModeConfiguration(): JsonField<List<AutoModeConfiguration>> = autoModeConfiguration

        /**
         * Returns the raw JSON value of [costOptimizer].
         *
         * Unlike [costOptimizer], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cost_optimizer")
        @ExcludeMissing
        fun _costOptimizer(): JsonField<CostOptimizer> = costOptimizer

        /**
         * Returns the raw JSON value of [disableHeuristics].
         *
         * Unlike [disableHeuristics], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("disable_heuristics")
        @ExcludeMissing
        fun _disableHeuristics(): JsonField<Boolean> = disableHeuristics

        /**
         * Returns the raw JSON value of [ignore].
         *
         * Unlike [ignore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ignore") @ExcludeMissing fun _ignore(): JsonField<Ignore> = ignore

        /**
         * Returns the raw JSON value of [ocrParameters].
         *
         * Unlike [ocrParameters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ocr_parameters")
        @ExcludeMissing
        fun _ocrParameters(): JsonField<OcrParameters> = ocrParameters

        /**
         * Returns the raw JSON value of [specializedChartParsing].
         *
         * Unlike [specializedChartParsing], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("specialized_chart_parsing")
        @ExcludeMissing
        fun _specializedChartParsing(): JsonField<SpecializedChartParsing> = specializedChartParsing

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ProcessingOptions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProcessingOptions]. */
        class Builder internal constructor() {

            private var aggressiveTableExtraction: JsonField<Boolean> = JsonMissing.of()
            private var autoModeConfiguration: JsonField<MutableList<AutoModeConfiguration>>? = null
            private var costOptimizer: JsonField<CostOptimizer> = JsonMissing.of()
            private var disableHeuristics: JsonField<Boolean> = JsonMissing.of()
            private var ignore: JsonField<Ignore> = JsonMissing.of()
            private var ocrParameters: JsonField<OcrParameters> = JsonMissing.of()
            private var specializedChartParsing: JsonField<SpecializedChartParsing> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(processingOptions: ProcessingOptions) = apply {
                aggressiveTableExtraction = processingOptions.aggressiveTableExtraction
                autoModeConfiguration =
                    processingOptions.autoModeConfiguration.map { it.toMutableList() }
                costOptimizer = processingOptions.costOptimizer
                disableHeuristics = processingOptions.disableHeuristics
                ignore = processingOptions.ignore
                ocrParameters = processingOptions.ocrParameters
                specializedChartParsing = processingOptions.specializedChartParsing
                additionalProperties = processingOptions.additionalProperties.toMutableMap()
            }

            /**
             * Use aggressive heuristics to detect table boundaries, even without visible borders.
             * Useful for documents with borderless or complex tables
             */
            fun aggressiveTableExtraction(aggressiveTableExtraction: Boolean?) =
                aggressiveTableExtraction(JsonField.ofNullable(aggressiveTableExtraction))

            /**
             * Alias for [Builder.aggressiveTableExtraction].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun aggressiveTableExtraction(aggressiveTableExtraction: Boolean) =
                aggressiveTableExtraction(aggressiveTableExtraction as Boolean?)

            /**
             * Alias for calling [Builder.aggressiveTableExtraction] with
             * `aggressiveTableExtraction.orElse(null)`.
             */
            fun aggressiveTableExtraction(aggressiveTableExtraction: Optional<Boolean>) =
                aggressiveTableExtraction(aggressiveTableExtraction.getOrNull())

            /**
             * Sets [Builder.aggressiveTableExtraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggressiveTableExtraction] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun aggressiveTableExtraction(aggressiveTableExtraction: JsonField<Boolean>) = apply {
                this.aggressiveTableExtraction = aggressiveTableExtraction
            }

            /**
             * Conditional processing rules that apply different parsing options based on page
             * content, document structure, or filename patterns. Each entry defines trigger
             * conditions and the parsing configuration to apply when triggered
             */
            fun autoModeConfiguration(autoModeConfiguration: List<AutoModeConfiguration>?) =
                autoModeConfiguration(JsonField.ofNullable(autoModeConfiguration))

            /**
             * Alias for calling [Builder.autoModeConfiguration] with
             * `autoModeConfiguration.orElse(null)`.
             */
            fun autoModeConfiguration(
                autoModeConfiguration: Optional<List<AutoModeConfiguration>>
            ) = autoModeConfiguration(autoModeConfiguration.getOrNull())

            /**
             * Sets [Builder.autoModeConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoModeConfiguration] with a well-typed
             * `List<AutoModeConfiguration>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun autoModeConfiguration(
                autoModeConfiguration: JsonField<List<AutoModeConfiguration>>
            ) = apply {
                this.autoModeConfiguration = autoModeConfiguration.map { it.toMutableList() }
            }

            /**
             * Adds a single [AutoModeConfiguration] to [Builder.autoModeConfiguration].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAutoModeConfiguration(autoModeConfiguration: AutoModeConfiguration) = apply {
                this.autoModeConfiguration =
                    (this.autoModeConfiguration ?: JsonField.of(mutableListOf())).also {
                        checkKnown("autoModeConfiguration", it).add(autoModeConfiguration)
                    }
            }

            /**
             * Cost optimizer configuration for reducing parsing costs on simpler pages.
             *
             * When enabled, the parser analyzes each page and routes simpler pages to faster,
             * cheaper processing while preserving quality for complex pages. Only works with
             * 'agentic' or 'agentic_plus' tiers.
             */
            fun costOptimizer(costOptimizer: CostOptimizer?) =
                costOptimizer(JsonField.ofNullable(costOptimizer))

            /** Alias for calling [Builder.costOptimizer] with `costOptimizer.orElse(null)`. */
            fun costOptimizer(costOptimizer: Optional<CostOptimizer>) =
                costOptimizer(costOptimizer.getOrNull())

            /**
             * Sets [Builder.costOptimizer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costOptimizer] with a well-typed [CostOptimizer]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun costOptimizer(costOptimizer: JsonField<CostOptimizer>) = apply {
                this.costOptimizer = costOptimizer
            }

            /**
             * Disable automatic heuristics including outlined table extraction and adaptive long
             * table handling. Use when heuristics produce incorrect results
             */
            fun disableHeuristics(disableHeuristics: Boolean?) =
                disableHeuristics(JsonField.ofNullable(disableHeuristics))

            /**
             * Alias for [Builder.disableHeuristics].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun disableHeuristics(disableHeuristics: Boolean) =
                disableHeuristics(disableHeuristics as Boolean?)

            /**
             * Alias for calling [Builder.disableHeuristics] with `disableHeuristics.orElse(null)`.
             */
            fun disableHeuristics(disableHeuristics: Optional<Boolean>) =
                disableHeuristics(disableHeuristics.getOrNull())

            /**
             * Sets [Builder.disableHeuristics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disableHeuristics] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun disableHeuristics(disableHeuristics: JsonField<Boolean>) = apply {
                this.disableHeuristics = disableHeuristics
            }

            /** Options for ignoring specific text types (diagonal, hidden, text in images) */
            fun ignore(ignore: Ignore) = ignore(JsonField.of(ignore))

            /**
             * Sets [Builder.ignore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ignore] with a well-typed [Ignore] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ignore(ignore: JsonField<Ignore>) = apply { this.ignore = ignore }

            /** OCR configuration including language detection settings */
            fun ocrParameters(ocrParameters: OcrParameters) =
                ocrParameters(JsonField.of(ocrParameters))

            /**
             * Sets [Builder.ocrParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ocrParameters] with a well-typed [OcrParameters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ocrParameters(ocrParameters: JsonField<OcrParameters>) = apply {
                this.ocrParameters = ocrParameters
            }

            /**
             * Enable AI-powered chart analysis. Modes: 'efficient' (fast, lower cost), 'agentic'
             * (balanced), 'agentic_plus' (highest accuracy). Automatically enables extract_layout
             * and precise_bounding_box when set
             */
            fun specializedChartParsing(specializedChartParsing: SpecializedChartParsing?) =
                specializedChartParsing(JsonField.ofNullable(specializedChartParsing))

            /**
             * Alias for calling [Builder.specializedChartParsing] with
             * `specializedChartParsing.orElse(null)`.
             */
            fun specializedChartParsing(
                specializedChartParsing: Optional<SpecializedChartParsing>
            ) = specializedChartParsing(specializedChartParsing.getOrNull())

            /**
             * Sets [Builder.specializedChartParsing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specializedChartParsing] with a well-typed
             * [SpecializedChartParsing] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun specializedChartParsing(
                specializedChartParsing: JsonField<SpecializedChartParsing>
            ) = apply { this.specializedChartParsing = specializedChartParsing }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ProcessingOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ProcessingOptions =
                ProcessingOptions(
                    aggressiveTableExtraction,
                    (autoModeConfiguration ?: JsonMissing.of()).map { it.toImmutable() },
                    costOptimizer,
                    disableHeuristics,
                    ignore,
                    ocrParameters,
                    specializedChartParsing,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ProcessingOptions = apply {
            if (validated) {
                return@apply
            }

            aggressiveTableExtraction()
            autoModeConfiguration().ifPresent { it.forEach { it.validate() } }
            costOptimizer().ifPresent { it.validate() }
            disableHeuristics()
            ignore().ifPresent { it.validate() }
            ocrParameters().ifPresent { it.validate() }
            specializedChartParsing().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (aggressiveTableExtraction.asKnown().isPresent) 1 else 0) +
                (autoModeConfiguration.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (costOptimizer.asKnown().getOrNull()?.validity() ?: 0) +
                (if (disableHeuristics.asKnown().isPresent) 1 else 0) +
                (ignore.asKnown().getOrNull()?.validity() ?: 0) +
                (ocrParameters.asKnown().getOrNull()?.validity() ?: 0) +
                (specializedChartParsing.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * A single auto mode rule with trigger conditions and parsing configuration.
         *
         * Auto mode allows conditional parsing where different configurations are applied based on
         * page content, structure, or filename. When triggers match, the parsing_conf overrides
         * default settings for that page.
         */
        class AutoModeConfiguration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val parsingConf: JsonField<ParsingConf>,
            private val filenameMatchGlob: JsonField<String>,
            private val filenameMatchGlobList: JsonField<List<String>>,
            private val filenameRegexp: JsonField<String>,
            private val filenameRegexpMode: JsonField<String>,
            private val fullPageImageInPage: JsonField<Boolean>,
            private val fullPageImageInPageThreshold: JsonField<FullPageImageInPageThreshold>,
            private val imageInPage: JsonField<Boolean>,
            private val layoutElementInPage: JsonField<String>,
            private val layoutElementInPageConfidenceThreshold:
                JsonField<LayoutElementInPageConfidenceThreshold>,
            private val pageContainsAtLeastNCharts: JsonField<PageContainsAtLeastNCharts>,
            private val pageContainsAtLeastNImages: JsonField<PageContainsAtLeastNImages>,
            private val pageContainsAtLeastNLayoutElements:
                JsonField<PageContainsAtLeastNLayoutElements>,
            private val pageContainsAtLeastNLines: JsonField<PageContainsAtLeastNLines>,
            private val pageContainsAtLeastNLinks: JsonField<PageContainsAtLeastNLinks>,
            private val pageContainsAtLeastNNumbers: JsonField<PageContainsAtLeastNNumbers>,
            private val pageContainsAtLeastNPercentNumbers:
                JsonField<PageContainsAtLeastNPercentNumbers>,
            private val pageContainsAtLeastNTables: JsonField<PageContainsAtLeastNTables>,
            private val pageContainsAtLeastNWords: JsonField<PageContainsAtLeastNWords>,
            private val pageContainsAtMostNCharts: JsonField<PageContainsAtMostNCharts>,
            private val pageContainsAtMostNImages: JsonField<PageContainsAtMostNImages>,
            private val pageContainsAtMostNLayoutElements:
                JsonField<PageContainsAtMostNLayoutElements>,
            private val pageContainsAtMostNLines: JsonField<PageContainsAtMostNLines>,
            private val pageContainsAtMostNLinks: JsonField<PageContainsAtMostNLinks>,
            private val pageContainsAtMostNNumbers: JsonField<PageContainsAtMostNNumbers>,
            private val pageContainsAtMostNPercentNumbers:
                JsonField<PageContainsAtMostNPercentNumbers>,
            private val pageContainsAtMostNTables: JsonField<PageContainsAtMostNTables>,
            private val pageContainsAtMostNWords: JsonField<PageContainsAtMostNWords>,
            private val pageLongerThanNChars: JsonField<PageLongerThanNChars>,
            private val pageMdError: JsonField<Boolean>,
            private val pageShorterThanNChars: JsonField<PageShorterThanNChars>,
            private val regexpInPage: JsonField<String>,
            private val regexpInPageMode: JsonField<String>,
            private val tableInPage: JsonField<Boolean>,
            private val textInPage: JsonField<String>,
            private val triggerMode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("parsing_conf")
                @ExcludeMissing
                parsingConf: JsonField<ParsingConf> = JsonMissing.of(),
                @JsonProperty("filename_match_glob")
                @ExcludeMissing
                filenameMatchGlob: JsonField<String> = JsonMissing.of(),
                @JsonProperty("filename_match_glob_list")
                @ExcludeMissing
                filenameMatchGlobList: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("filename_regexp")
                @ExcludeMissing
                filenameRegexp: JsonField<String> = JsonMissing.of(),
                @JsonProperty("filename_regexp_mode")
                @ExcludeMissing
                filenameRegexpMode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("full_page_image_in_page")
                @ExcludeMissing
                fullPageImageInPage: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("full_page_image_in_page_threshold")
                @ExcludeMissing
                fullPageImageInPageThreshold: JsonField<FullPageImageInPageThreshold> =
                    JsonMissing.of(),
                @JsonProperty("image_in_page")
                @ExcludeMissing
                imageInPage: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("layout_element_in_page")
                @ExcludeMissing
                layoutElementInPage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("layout_element_in_page_confidence_threshold")
                @ExcludeMissing
                layoutElementInPageConfidenceThreshold:
                    JsonField<LayoutElementInPageConfidenceThreshold> =
                    JsonMissing.of(),
                @JsonProperty("page_contains_at_least_n_charts")
                @ExcludeMissing
                pageContainsAtLeastNCharts: JsonField<PageContainsAtLeastNCharts> =
                    JsonMissing.of(),
                @JsonProperty("page_contains_at_least_n_images")
                @ExcludeMissing
                pageContainsAtLeastNImages: JsonField<PageContainsAtLeastNImages> =
                    JsonMissing.of(),
                @JsonProperty("page_contains_at_least_n_layout_elements")
                @ExcludeMissing
                pageContainsAtLeastNLayoutElements: JsonField<PageContainsAtLeastNLayoutElements> =
                    JsonMissing.of(),
                @JsonProperty("page_contains_at_least_n_lines")
                @ExcludeMissing
                pageContainsAtLeastNLines: JsonField<PageContainsAtLeastNLines> = JsonMissing.of(),
                @JsonProperty("page_contains_at_least_n_links")
                @ExcludeMissing
                pageContainsAtLeastNLinks: JsonField<PageContainsAtLeastNLinks> = JsonMissing.of(),
                @JsonProperty("page_contains_at_least_n_numbers")
                @ExcludeMissing
                pageContainsAtLeastNNumbers: JsonField<PageContainsAtLeastNNumbers> =
                    JsonMissing.of(),
                @JsonProperty("page_contains_at_least_n_percent_numbers")
                @ExcludeMissing
                pageContainsAtLeastNPercentNumbers: JsonField<PageContainsAtLeastNPercentNumbers> =
                    JsonMissing.of(),
                @JsonProperty("page_contains_at_least_n_tables")
                @ExcludeMissing
                pageContainsAtLeastNTables: JsonField<PageContainsAtLeastNTables> =
                    JsonMissing.of(),
                @JsonProperty("page_contains_at_least_n_words")
                @ExcludeMissing
                pageContainsAtLeastNWords: JsonField<PageContainsAtLeastNWords> = JsonMissing.of(),
                @JsonProperty("page_contains_at_most_n_charts")
                @ExcludeMissing
                pageContainsAtMostNCharts: JsonField<PageContainsAtMostNCharts> = JsonMissing.of(),
                @JsonProperty("page_contains_at_most_n_images")
                @ExcludeMissing
                pageContainsAtMostNImages: JsonField<PageContainsAtMostNImages> = JsonMissing.of(),
                @JsonProperty("page_contains_at_most_n_layout_elements")
                @ExcludeMissing
                pageContainsAtMostNLayoutElements: JsonField<PageContainsAtMostNLayoutElements> =
                    JsonMissing.of(),
                @JsonProperty("page_contains_at_most_n_lines")
                @ExcludeMissing
                pageContainsAtMostNLines: JsonField<PageContainsAtMostNLines> = JsonMissing.of(),
                @JsonProperty("page_contains_at_most_n_links")
                @ExcludeMissing
                pageContainsAtMostNLinks: JsonField<PageContainsAtMostNLinks> = JsonMissing.of(),
                @JsonProperty("page_contains_at_most_n_numbers")
                @ExcludeMissing
                pageContainsAtMostNNumbers: JsonField<PageContainsAtMostNNumbers> =
                    JsonMissing.of(),
                @JsonProperty("page_contains_at_most_n_percent_numbers")
                @ExcludeMissing
                pageContainsAtMostNPercentNumbers: JsonField<PageContainsAtMostNPercentNumbers> =
                    JsonMissing.of(),
                @JsonProperty("page_contains_at_most_n_tables")
                @ExcludeMissing
                pageContainsAtMostNTables: JsonField<PageContainsAtMostNTables> = JsonMissing.of(),
                @JsonProperty("page_contains_at_most_n_words")
                @ExcludeMissing
                pageContainsAtMostNWords: JsonField<PageContainsAtMostNWords> = JsonMissing.of(),
                @JsonProperty("page_longer_than_n_chars")
                @ExcludeMissing
                pageLongerThanNChars: JsonField<PageLongerThanNChars> = JsonMissing.of(),
                @JsonProperty("page_md_error")
                @ExcludeMissing
                pageMdError: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("page_shorter_than_n_chars")
                @ExcludeMissing
                pageShorterThanNChars: JsonField<PageShorterThanNChars> = JsonMissing.of(),
                @JsonProperty("regexp_in_page")
                @ExcludeMissing
                regexpInPage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("regexp_in_page_mode")
                @ExcludeMissing
                regexpInPageMode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("table_in_page")
                @ExcludeMissing
                tableInPage: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("text_in_page")
                @ExcludeMissing
                textInPage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trigger_mode")
                @ExcludeMissing
                triggerMode: JsonField<String> = JsonMissing.of(),
            ) : this(
                parsingConf,
                filenameMatchGlob,
                filenameMatchGlobList,
                filenameRegexp,
                filenameRegexpMode,
                fullPageImageInPage,
                fullPageImageInPageThreshold,
                imageInPage,
                layoutElementInPage,
                layoutElementInPageConfidenceThreshold,
                pageContainsAtLeastNCharts,
                pageContainsAtLeastNImages,
                pageContainsAtLeastNLayoutElements,
                pageContainsAtLeastNLines,
                pageContainsAtLeastNLinks,
                pageContainsAtLeastNNumbers,
                pageContainsAtLeastNPercentNumbers,
                pageContainsAtLeastNTables,
                pageContainsAtLeastNWords,
                pageContainsAtMostNCharts,
                pageContainsAtMostNImages,
                pageContainsAtMostNLayoutElements,
                pageContainsAtMostNLines,
                pageContainsAtMostNLinks,
                pageContainsAtMostNNumbers,
                pageContainsAtMostNPercentNumbers,
                pageContainsAtMostNTables,
                pageContainsAtMostNWords,
                pageLongerThanNChars,
                pageMdError,
                pageShorterThanNChars,
                regexpInPage,
                regexpInPageMode,
                tableInPage,
                textInPage,
                triggerMode,
                mutableMapOf(),
            )

            /**
             * Parsing configuration to apply when trigger conditions are met
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun parsingConf(): ParsingConf = parsingConf.getRequired("parsing_conf")

            /**
             * Single glob pattern to match against filename
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filenameMatchGlob(): Optional<String> =
                filenameMatchGlob.getOptional("filename_match_glob")

            /**
             * List of glob patterns to match against filename
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filenameMatchGlobList(): Optional<List<String>> =
                filenameMatchGlobList.getOptional("filename_match_glob_list")

            /**
             * Regex pattern to match against filename
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filenameRegexp(): Optional<String> = filenameRegexp.getOptional("filename_regexp")

            /**
             * Regex mode flags (e.g., 'i' for case-insensitive)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filenameRegexpMode(): Optional<String> =
                filenameRegexpMode.getOptional("filename_regexp_mode")

            /**
             * Trigger if page contains a full-page image (scanned page detection)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun fullPageImageInPage(): Optional<Boolean> =
                fullPageImageInPage.getOptional("full_page_image_in_page")

            /**
             * Threshold for full page image detection (0.0-1.0, default 0.8)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun fullPageImageInPageThreshold(): Optional<FullPageImageInPageThreshold> =
                fullPageImageInPageThreshold.getOptional("full_page_image_in_page_threshold")

            /**
             * Trigger if page contains non-screenshot images
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun imageInPage(): Optional<Boolean> = imageInPage.getOptional("image_in_page")

            /**
             * Trigger if page contains this layout element type
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun layoutElementInPage(): Optional<String> =
                layoutElementInPage.getOptional("layout_element_in_page")

            /**
             * Confidence threshold for layout element detection
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun layoutElementInPageConfidenceThreshold():
                Optional<LayoutElementInPageConfidenceThreshold> =
                layoutElementInPageConfidenceThreshold.getOptional(
                    "layout_element_in_page_confidence_threshold"
                )

            /**
             * Trigger if page has more than N charts
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtLeastNCharts(): Optional<PageContainsAtLeastNCharts> =
                pageContainsAtLeastNCharts.getOptional("page_contains_at_least_n_charts")

            /**
             * Trigger if page has more than N images
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtLeastNImages(): Optional<PageContainsAtLeastNImages> =
                pageContainsAtLeastNImages.getOptional("page_contains_at_least_n_images")

            /**
             * Trigger if page has more than N layout elements
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtLeastNLayoutElements(): Optional<PageContainsAtLeastNLayoutElements> =
                pageContainsAtLeastNLayoutElements.getOptional(
                    "page_contains_at_least_n_layout_elements"
                )

            /**
             * Trigger if page has more than N lines
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtLeastNLines(): Optional<PageContainsAtLeastNLines> =
                pageContainsAtLeastNLines.getOptional("page_contains_at_least_n_lines")

            /**
             * Trigger if page has more than N links
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtLeastNLinks(): Optional<PageContainsAtLeastNLinks> =
                pageContainsAtLeastNLinks.getOptional("page_contains_at_least_n_links")

            /**
             * Trigger if page has more than N numeric words
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtLeastNNumbers(): Optional<PageContainsAtLeastNNumbers> =
                pageContainsAtLeastNNumbers.getOptional("page_contains_at_least_n_numbers")

            /**
             * Trigger if page has more than N% numeric words
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtLeastNPercentNumbers(): Optional<PageContainsAtLeastNPercentNumbers> =
                pageContainsAtLeastNPercentNumbers.getOptional(
                    "page_contains_at_least_n_percent_numbers"
                )

            /**
             * Trigger if page has more than N tables
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtLeastNTables(): Optional<PageContainsAtLeastNTables> =
                pageContainsAtLeastNTables.getOptional("page_contains_at_least_n_tables")

            /**
             * Trigger if page has more than N words
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtLeastNWords(): Optional<PageContainsAtLeastNWords> =
                pageContainsAtLeastNWords.getOptional("page_contains_at_least_n_words")

            /**
             * Trigger if page has fewer than N charts
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtMostNCharts(): Optional<PageContainsAtMostNCharts> =
                pageContainsAtMostNCharts.getOptional("page_contains_at_most_n_charts")

            /**
             * Trigger if page has fewer than N images
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtMostNImages(): Optional<PageContainsAtMostNImages> =
                pageContainsAtMostNImages.getOptional("page_contains_at_most_n_images")

            /**
             * Trigger if page has fewer than N layout elements
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtMostNLayoutElements(): Optional<PageContainsAtMostNLayoutElements> =
                pageContainsAtMostNLayoutElements.getOptional(
                    "page_contains_at_most_n_layout_elements"
                )

            /**
             * Trigger if page has fewer than N lines
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtMostNLines(): Optional<PageContainsAtMostNLines> =
                pageContainsAtMostNLines.getOptional("page_contains_at_most_n_lines")

            /**
             * Trigger if page has fewer than N links
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtMostNLinks(): Optional<PageContainsAtMostNLinks> =
                pageContainsAtMostNLinks.getOptional("page_contains_at_most_n_links")

            /**
             * Trigger if page has fewer than N numeric words
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtMostNNumbers(): Optional<PageContainsAtMostNNumbers> =
                pageContainsAtMostNNumbers.getOptional("page_contains_at_most_n_numbers")

            /**
             * Trigger if page has fewer than N% numeric words
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtMostNPercentNumbers(): Optional<PageContainsAtMostNPercentNumbers> =
                pageContainsAtMostNPercentNumbers.getOptional(
                    "page_contains_at_most_n_percent_numbers"
                )

            /**
             * Trigger if page has fewer than N tables
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtMostNTables(): Optional<PageContainsAtMostNTables> =
                pageContainsAtMostNTables.getOptional("page_contains_at_most_n_tables")

            /**
             * Trigger if page has fewer than N words
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageContainsAtMostNWords(): Optional<PageContainsAtMostNWords> =
                pageContainsAtMostNWords.getOptional("page_contains_at_most_n_words")

            /**
             * Trigger if page has more than N characters
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageLongerThanNChars(): Optional<PageLongerThanNChars> =
                pageLongerThanNChars.getOptional("page_longer_than_n_chars")

            /**
             * Trigger on pages with markdown extraction errors
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageMdError(): Optional<Boolean> = pageMdError.getOptional("page_md_error")

            /**
             * Trigger if page has fewer than N characters
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageShorterThanNChars(): Optional<PageShorterThanNChars> =
                pageShorterThanNChars.getOptional("page_shorter_than_n_chars")

            /**
             * Regex pattern to match in page content
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun regexpInPage(): Optional<String> = regexpInPage.getOptional("regexp_in_page")

            /**
             * Regex mode flags for regexp_in_page
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun regexpInPageMode(): Optional<String> =
                regexpInPageMode.getOptional("regexp_in_page_mode")

            /**
             * Trigger if page contains a table
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tableInPage(): Optional<Boolean> = tableInPage.getOptional("table_in_page")

            /**
             * Trigger if page text/markdown contains this string
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun textInPage(): Optional<String> = textInPage.getOptional("text_in_page")

            /**
             * How to combine multiple trigger conditions: 'and' (all conditions must match, this is
             * the default) or 'or' (any single condition can trigger)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun triggerMode(): Optional<String> = triggerMode.getOptional("trigger_mode")

            /**
             * Returns the raw JSON value of [parsingConf].
             *
             * Unlike [parsingConf], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parsing_conf")
            @ExcludeMissing
            fun _parsingConf(): JsonField<ParsingConf> = parsingConf

            /**
             * Returns the raw JSON value of [filenameMatchGlob].
             *
             * Unlike [filenameMatchGlob], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("filename_match_glob")
            @ExcludeMissing
            fun _filenameMatchGlob(): JsonField<String> = filenameMatchGlob

            /**
             * Returns the raw JSON value of [filenameMatchGlobList].
             *
             * Unlike [filenameMatchGlobList], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("filename_match_glob_list")
            @ExcludeMissing
            fun _filenameMatchGlobList(): JsonField<List<String>> = filenameMatchGlobList

            /**
             * Returns the raw JSON value of [filenameRegexp].
             *
             * Unlike [filenameRegexp], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("filename_regexp")
            @ExcludeMissing
            fun _filenameRegexp(): JsonField<String> = filenameRegexp

            /**
             * Returns the raw JSON value of [filenameRegexpMode].
             *
             * Unlike [filenameRegexpMode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("filename_regexp_mode")
            @ExcludeMissing
            fun _filenameRegexpMode(): JsonField<String> = filenameRegexpMode

            /**
             * Returns the raw JSON value of [fullPageImageInPage].
             *
             * Unlike [fullPageImageInPage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("full_page_image_in_page")
            @ExcludeMissing
            fun _fullPageImageInPage(): JsonField<Boolean> = fullPageImageInPage

            /**
             * Returns the raw JSON value of [fullPageImageInPageThreshold].
             *
             * Unlike [fullPageImageInPageThreshold], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("full_page_image_in_page_threshold")
            @ExcludeMissing
            fun _fullPageImageInPageThreshold(): JsonField<FullPageImageInPageThreshold> =
                fullPageImageInPageThreshold

            /**
             * Returns the raw JSON value of [imageInPage].
             *
             * Unlike [imageInPage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("image_in_page")
            @ExcludeMissing
            fun _imageInPage(): JsonField<Boolean> = imageInPage

            /**
             * Returns the raw JSON value of [layoutElementInPage].
             *
             * Unlike [layoutElementInPage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("layout_element_in_page")
            @ExcludeMissing
            fun _layoutElementInPage(): JsonField<String> = layoutElementInPage

            /**
             * Returns the raw JSON value of [layoutElementInPageConfidenceThreshold].
             *
             * Unlike [layoutElementInPageConfidenceThreshold], this method doesn't throw if the
             * JSON field has an unexpected type.
             */
            @JsonProperty("layout_element_in_page_confidence_threshold")
            @ExcludeMissing
            fun _layoutElementInPageConfidenceThreshold():
                JsonField<LayoutElementInPageConfidenceThreshold> =
                layoutElementInPageConfidenceThreshold

            /**
             * Returns the raw JSON value of [pageContainsAtLeastNCharts].
             *
             * Unlike [pageContainsAtLeastNCharts], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_least_n_charts")
            @ExcludeMissing
            fun _pageContainsAtLeastNCharts(): JsonField<PageContainsAtLeastNCharts> =
                pageContainsAtLeastNCharts

            /**
             * Returns the raw JSON value of [pageContainsAtLeastNImages].
             *
             * Unlike [pageContainsAtLeastNImages], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_least_n_images")
            @ExcludeMissing
            fun _pageContainsAtLeastNImages(): JsonField<PageContainsAtLeastNImages> =
                pageContainsAtLeastNImages

            /**
             * Returns the raw JSON value of [pageContainsAtLeastNLayoutElements].
             *
             * Unlike [pageContainsAtLeastNLayoutElements], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("page_contains_at_least_n_layout_elements")
            @ExcludeMissing
            fun _pageContainsAtLeastNLayoutElements():
                JsonField<PageContainsAtLeastNLayoutElements> = pageContainsAtLeastNLayoutElements

            /**
             * Returns the raw JSON value of [pageContainsAtLeastNLines].
             *
             * Unlike [pageContainsAtLeastNLines], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_least_n_lines")
            @ExcludeMissing
            fun _pageContainsAtLeastNLines(): JsonField<PageContainsAtLeastNLines> =
                pageContainsAtLeastNLines

            /**
             * Returns the raw JSON value of [pageContainsAtLeastNLinks].
             *
             * Unlike [pageContainsAtLeastNLinks], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_least_n_links")
            @ExcludeMissing
            fun _pageContainsAtLeastNLinks(): JsonField<PageContainsAtLeastNLinks> =
                pageContainsAtLeastNLinks

            /**
             * Returns the raw JSON value of [pageContainsAtLeastNNumbers].
             *
             * Unlike [pageContainsAtLeastNNumbers], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_least_n_numbers")
            @ExcludeMissing
            fun _pageContainsAtLeastNNumbers(): JsonField<PageContainsAtLeastNNumbers> =
                pageContainsAtLeastNNumbers

            /**
             * Returns the raw JSON value of [pageContainsAtLeastNPercentNumbers].
             *
             * Unlike [pageContainsAtLeastNPercentNumbers], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("page_contains_at_least_n_percent_numbers")
            @ExcludeMissing
            fun _pageContainsAtLeastNPercentNumbers():
                JsonField<PageContainsAtLeastNPercentNumbers> = pageContainsAtLeastNPercentNumbers

            /**
             * Returns the raw JSON value of [pageContainsAtLeastNTables].
             *
             * Unlike [pageContainsAtLeastNTables], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_least_n_tables")
            @ExcludeMissing
            fun _pageContainsAtLeastNTables(): JsonField<PageContainsAtLeastNTables> =
                pageContainsAtLeastNTables

            /**
             * Returns the raw JSON value of [pageContainsAtLeastNWords].
             *
             * Unlike [pageContainsAtLeastNWords], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_least_n_words")
            @ExcludeMissing
            fun _pageContainsAtLeastNWords(): JsonField<PageContainsAtLeastNWords> =
                pageContainsAtLeastNWords

            /**
             * Returns the raw JSON value of [pageContainsAtMostNCharts].
             *
             * Unlike [pageContainsAtMostNCharts], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_most_n_charts")
            @ExcludeMissing
            fun _pageContainsAtMostNCharts(): JsonField<PageContainsAtMostNCharts> =
                pageContainsAtMostNCharts

            /**
             * Returns the raw JSON value of [pageContainsAtMostNImages].
             *
             * Unlike [pageContainsAtMostNImages], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_most_n_images")
            @ExcludeMissing
            fun _pageContainsAtMostNImages(): JsonField<PageContainsAtMostNImages> =
                pageContainsAtMostNImages

            /**
             * Returns the raw JSON value of [pageContainsAtMostNLayoutElements].
             *
             * Unlike [pageContainsAtMostNLayoutElements], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("page_contains_at_most_n_layout_elements")
            @ExcludeMissing
            fun _pageContainsAtMostNLayoutElements(): JsonField<PageContainsAtMostNLayoutElements> =
                pageContainsAtMostNLayoutElements

            /**
             * Returns the raw JSON value of [pageContainsAtMostNLines].
             *
             * Unlike [pageContainsAtMostNLines], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("page_contains_at_most_n_lines")
            @ExcludeMissing
            fun _pageContainsAtMostNLines(): JsonField<PageContainsAtMostNLines> =
                pageContainsAtMostNLines

            /**
             * Returns the raw JSON value of [pageContainsAtMostNLinks].
             *
             * Unlike [pageContainsAtMostNLinks], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("page_contains_at_most_n_links")
            @ExcludeMissing
            fun _pageContainsAtMostNLinks(): JsonField<PageContainsAtMostNLinks> =
                pageContainsAtMostNLinks

            /**
             * Returns the raw JSON value of [pageContainsAtMostNNumbers].
             *
             * Unlike [pageContainsAtMostNNumbers], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_most_n_numbers")
            @ExcludeMissing
            fun _pageContainsAtMostNNumbers(): JsonField<PageContainsAtMostNNumbers> =
                pageContainsAtMostNNumbers

            /**
             * Returns the raw JSON value of [pageContainsAtMostNPercentNumbers].
             *
             * Unlike [pageContainsAtMostNPercentNumbers], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("page_contains_at_most_n_percent_numbers")
            @ExcludeMissing
            fun _pageContainsAtMostNPercentNumbers(): JsonField<PageContainsAtMostNPercentNumbers> =
                pageContainsAtMostNPercentNumbers

            /**
             * Returns the raw JSON value of [pageContainsAtMostNTables].
             *
             * Unlike [pageContainsAtMostNTables], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("page_contains_at_most_n_tables")
            @ExcludeMissing
            fun _pageContainsAtMostNTables(): JsonField<PageContainsAtMostNTables> =
                pageContainsAtMostNTables

            /**
             * Returns the raw JSON value of [pageContainsAtMostNWords].
             *
             * Unlike [pageContainsAtMostNWords], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("page_contains_at_most_n_words")
            @ExcludeMissing
            fun _pageContainsAtMostNWords(): JsonField<PageContainsAtMostNWords> =
                pageContainsAtMostNWords

            /**
             * Returns the raw JSON value of [pageLongerThanNChars].
             *
             * Unlike [pageLongerThanNChars], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("page_longer_than_n_chars")
            @ExcludeMissing
            fun _pageLongerThanNChars(): JsonField<PageLongerThanNChars> = pageLongerThanNChars

            /**
             * Returns the raw JSON value of [pageMdError].
             *
             * Unlike [pageMdError], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("page_md_error")
            @ExcludeMissing
            fun _pageMdError(): JsonField<Boolean> = pageMdError

            /**
             * Returns the raw JSON value of [pageShorterThanNChars].
             *
             * Unlike [pageShorterThanNChars], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("page_shorter_than_n_chars")
            @ExcludeMissing
            fun _pageShorterThanNChars(): JsonField<PageShorterThanNChars> = pageShorterThanNChars

            /**
             * Returns the raw JSON value of [regexpInPage].
             *
             * Unlike [regexpInPage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("regexp_in_page")
            @ExcludeMissing
            fun _regexpInPage(): JsonField<String> = regexpInPage

            /**
             * Returns the raw JSON value of [regexpInPageMode].
             *
             * Unlike [regexpInPageMode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("regexp_in_page_mode")
            @ExcludeMissing
            fun _regexpInPageMode(): JsonField<String> = regexpInPageMode

            /**
             * Returns the raw JSON value of [tableInPage].
             *
             * Unlike [tableInPage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("table_in_page")
            @ExcludeMissing
            fun _tableInPage(): JsonField<Boolean> = tableInPage

            /**
             * Returns the raw JSON value of [textInPage].
             *
             * Unlike [textInPage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("text_in_page")
            @ExcludeMissing
            fun _textInPage(): JsonField<String> = textInPage

            /**
             * Returns the raw JSON value of [triggerMode].
             *
             * Unlike [triggerMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trigger_mode")
            @ExcludeMissing
            fun _triggerMode(): JsonField<String> = triggerMode

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [AutoModeConfiguration].
                 *
                 * The following fields are required:
                 * ```java
                 * .parsingConf()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AutoModeConfiguration]. */
            class Builder internal constructor() {

                private var parsingConf: JsonField<ParsingConf>? = null
                private var filenameMatchGlob: JsonField<String> = JsonMissing.of()
                private var filenameMatchGlobList: JsonField<MutableList<String>>? = null
                private var filenameRegexp: JsonField<String> = JsonMissing.of()
                private var filenameRegexpMode: JsonField<String> = JsonMissing.of()
                private var fullPageImageInPage: JsonField<Boolean> = JsonMissing.of()
                private var fullPageImageInPageThreshold: JsonField<FullPageImageInPageThreshold> =
                    JsonMissing.of()
                private var imageInPage: JsonField<Boolean> = JsonMissing.of()
                private var layoutElementInPage: JsonField<String> = JsonMissing.of()
                private var layoutElementInPageConfidenceThreshold:
                    JsonField<LayoutElementInPageConfidenceThreshold> =
                    JsonMissing.of()
                private var pageContainsAtLeastNCharts: JsonField<PageContainsAtLeastNCharts> =
                    JsonMissing.of()
                private var pageContainsAtLeastNImages: JsonField<PageContainsAtLeastNImages> =
                    JsonMissing.of()
                private var pageContainsAtLeastNLayoutElements:
                    JsonField<PageContainsAtLeastNLayoutElements> =
                    JsonMissing.of()
                private var pageContainsAtLeastNLines: JsonField<PageContainsAtLeastNLines> =
                    JsonMissing.of()
                private var pageContainsAtLeastNLinks: JsonField<PageContainsAtLeastNLinks> =
                    JsonMissing.of()
                private var pageContainsAtLeastNNumbers: JsonField<PageContainsAtLeastNNumbers> =
                    JsonMissing.of()
                private var pageContainsAtLeastNPercentNumbers:
                    JsonField<PageContainsAtLeastNPercentNumbers> =
                    JsonMissing.of()
                private var pageContainsAtLeastNTables: JsonField<PageContainsAtLeastNTables> =
                    JsonMissing.of()
                private var pageContainsAtLeastNWords: JsonField<PageContainsAtLeastNWords> =
                    JsonMissing.of()
                private var pageContainsAtMostNCharts: JsonField<PageContainsAtMostNCharts> =
                    JsonMissing.of()
                private var pageContainsAtMostNImages: JsonField<PageContainsAtMostNImages> =
                    JsonMissing.of()
                private var pageContainsAtMostNLayoutElements:
                    JsonField<PageContainsAtMostNLayoutElements> =
                    JsonMissing.of()
                private var pageContainsAtMostNLines: JsonField<PageContainsAtMostNLines> =
                    JsonMissing.of()
                private var pageContainsAtMostNLinks: JsonField<PageContainsAtMostNLinks> =
                    JsonMissing.of()
                private var pageContainsAtMostNNumbers: JsonField<PageContainsAtMostNNumbers> =
                    JsonMissing.of()
                private var pageContainsAtMostNPercentNumbers:
                    JsonField<PageContainsAtMostNPercentNumbers> =
                    JsonMissing.of()
                private var pageContainsAtMostNTables: JsonField<PageContainsAtMostNTables> =
                    JsonMissing.of()
                private var pageContainsAtMostNWords: JsonField<PageContainsAtMostNWords> =
                    JsonMissing.of()
                private var pageLongerThanNChars: JsonField<PageLongerThanNChars> = JsonMissing.of()
                private var pageMdError: JsonField<Boolean> = JsonMissing.of()
                private var pageShorterThanNChars: JsonField<PageShorterThanNChars> =
                    JsonMissing.of()
                private var regexpInPage: JsonField<String> = JsonMissing.of()
                private var regexpInPageMode: JsonField<String> = JsonMissing.of()
                private var tableInPage: JsonField<Boolean> = JsonMissing.of()
                private var textInPage: JsonField<String> = JsonMissing.of()
                private var triggerMode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(autoModeConfiguration: AutoModeConfiguration) = apply {
                    parsingConf = autoModeConfiguration.parsingConf
                    filenameMatchGlob = autoModeConfiguration.filenameMatchGlob
                    filenameMatchGlobList =
                        autoModeConfiguration.filenameMatchGlobList.map { it.toMutableList() }
                    filenameRegexp = autoModeConfiguration.filenameRegexp
                    filenameRegexpMode = autoModeConfiguration.filenameRegexpMode
                    fullPageImageInPage = autoModeConfiguration.fullPageImageInPage
                    fullPageImageInPageThreshold =
                        autoModeConfiguration.fullPageImageInPageThreshold
                    imageInPage = autoModeConfiguration.imageInPage
                    layoutElementInPage = autoModeConfiguration.layoutElementInPage
                    layoutElementInPageConfidenceThreshold =
                        autoModeConfiguration.layoutElementInPageConfidenceThreshold
                    pageContainsAtLeastNCharts = autoModeConfiguration.pageContainsAtLeastNCharts
                    pageContainsAtLeastNImages = autoModeConfiguration.pageContainsAtLeastNImages
                    pageContainsAtLeastNLayoutElements =
                        autoModeConfiguration.pageContainsAtLeastNLayoutElements
                    pageContainsAtLeastNLines = autoModeConfiguration.pageContainsAtLeastNLines
                    pageContainsAtLeastNLinks = autoModeConfiguration.pageContainsAtLeastNLinks
                    pageContainsAtLeastNNumbers = autoModeConfiguration.pageContainsAtLeastNNumbers
                    pageContainsAtLeastNPercentNumbers =
                        autoModeConfiguration.pageContainsAtLeastNPercentNumbers
                    pageContainsAtLeastNTables = autoModeConfiguration.pageContainsAtLeastNTables
                    pageContainsAtLeastNWords = autoModeConfiguration.pageContainsAtLeastNWords
                    pageContainsAtMostNCharts = autoModeConfiguration.pageContainsAtMostNCharts
                    pageContainsAtMostNImages = autoModeConfiguration.pageContainsAtMostNImages
                    pageContainsAtMostNLayoutElements =
                        autoModeConfiguration.pageContainsAtMostNLayoutElements
                    pageContainsAtMostNLines = autoModeConfiguration.pageContainsAtMostNLines
                    pageContainsAtMostNLinks = autoModeConfiguration.pageContainsAtMostNLinks
                    pageContainsAtMostNNumbers = autoModeConfiguration.pageContainsAtMostNNumbers
                    pageContainsAtMostNPercentNumbers =
                        autoModeConfiguration.pageContainsAtMostNPercentNumbers
                    pageContainsAtMostNTables = autoModeConfiguration.pageContainsAtMostNTables
                    pageContainsAtMostNWords = autoModeConfiguration.pageContainsAtMostNWords
                    pageLongerThanNChars = autoModeConfiguration.pageLongerThanNChars
                    pageMdError = autoModeConfiguration.pageMdError
                    pageShorterThanNChars = autoModeConfiguration.pageShorterThanNChars
                    regexpInPage = autoModeConfiguration.regexpInPage
                    regexpInPageMode = autoModeConfiguration.regexpInPageMode
                    tableInPage = autoModeConfiguration.tableInPage
                    textInPage = autoModeConfiguration.textInPage
                    triggerMode = autoModeConfiguration.triggerMode
                    additionalProperties = autoModeConfiguration.additionalProperties.toMutableMap()
                }

                /** Parsing configuration to apply when trigger conditions are met */
                fun parsingConf(parsingConf: ParsingConf) = parsingConf(JsonField.of(parsingConf))

                /**
                 * Sets [Builder.parsingConf] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parsingConf] with a well-typed [ParsingConf]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun parsingConf(parsingConf: JsonField<ParsingConf>) = apply {
                    this.parsingConf = parsingConf
                }

                /** Single glob pattern to match against filename */
                fun filenameMatchGlob(filenameMatchGlob: String?) =
                    filenameMatchGlob(JsonField.ofNullable(filenameMatchGlob))

                /**
                 * Alias for calling [Builder.filenameMatchGlob] with
                 * `filenameMatchGlob.orElse(null)`.
                 */
                fun filenameMatchGlob(filenameMatchGlob: Optional<String>) =
                    filenameMatchGlob(filenameMatchGlob.getOrNull())

                /**
                 * Sets [Builder.filenameMatchGlob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filenameMatchGlob] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun filenameMatchGlob(filenameMatchGlob: JsonField<String>) = apply {
                    this.filenameMatchGlob = filenameMatchGlob
                }

                /** List of glob patterns to match against filename */
                fun filenameMatchGlobList(filenameMatchGlobList: List<String>?) =
                    filenameMatchGlobList(JsonField.ofNullable(filenameMatchGlobList))

                /**
                 * Alias for calling [Builder.filenameMatchGlobList] with
                 * `filenameMatchGlobList.orElse(null)`.
                 */
                fun filenameMatchGlobList(filenameMatchGlobList: Optional<List<String>>) =
                    filenameMatchGlobList(filenameMatchGlobList.getOrNull())

                /**
                 * Sets [Builder.filenameMatchGlobList] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filenameMatchGlobList] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun filenameMatchGlobList(filenameMatchGlobList: JsonField<List<String>>) = apply {
                    this.filenameMatchGlobList = filenameMatchGlobList.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.filenameMatchGlobList].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFilenameMatchGlobList(filenameMatchGlobList: String) = apply {
                    this.filenameMatchGlobList =
                        (this.filenameMatchGlobList ?: JsonField.of(mutableListOf())).also {
                            checkKnown("filenameMatchGlobList", it).add(filenameMatchGlobList)
                        }
                }

                /** Regex pattern to match against filename */
                fun filenameRegexp(filenameRegexp: String?) =
                    filenameRegexp(JsonField.ofNullable(filenameRegexp))

                /**
                 * Alias for calling [Builder.filenameRegexp] with `filenameRegexp.orElse(null)`.
                 */
                fun filenameRegexp(filenameRegexp: Optional<String>) =
                    filenameRegexp(filenameRegexp.getOrNull())

                /**
                 * Sets [Builder.filenameRegexp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filenameRegexp] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filenameRegexp(filenameRegexp: JsonField<String>) = apply {
                    this.filenameRegexp = filenameRegexp
                }

                /** Regex mode flags (e.g., 'i' for case-insensitive) */
                fun filenameRegexpMode(filenameRegexpMode: String?) =
                    filenameRegexpMode(JsonField.ofNullable(filenameRegexpMode))

                /**
                 * Alias for calling [Builder.filenameRegexpMode] with
                 * `filenameRegexpMode.orElse(null)`.
                 */
                fun filenameRegexpMode(filenameRegexpMode: Optional<String>) =
                    filenameRegexpMode(filenameRegexpMode.getOrNull())

                /**
                 * Sets [Builder.filenameRegexpMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filenameRegexpMode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun filenameRegexpMode(filenameRegexpMode: JsonField<String>) = apply {
                    this.filenameRegexpMode = filenameRegexpMode
                }

                /** Trigger if page contains a full-page image (scanned page detection) */
                fun fullPageImageInPage(fullPageImageInPage: Boolean?) =
                    fullPageImageInPage(JsonField.ofNullable(fullPageImageInPage))

                /**
                 * Alias for [Builder.fullPageImageInPage].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun fullPageImageInPage(fullPageImageInPage: Boolean) =
                    fullPageImageInPage(fullPageImageInPage as Boolean?)

                /**
                 * Alias for calling [Builder.fullPageImageInPage] with
                 * `fullPageImageInPage.orElse(null)`.
                 */
                fun fullPageImageInPage(fullPageImageInPage: Optional<Boolean>) =
                    fullPageImageInPage(fullPageImageInPage.getOrNull())

                /**
                 * Sets [Builder.fullPageImageInPage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullPageImageInPage] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fullPageImageInPage(fullPageImageInPage: JsonField<Boolean>) = apply {
                    this.fullPageImageInPage = fullPageImageInPage
                }

                /** Threshold for full page image detection (0.0-1.0, default 0.8) */
                fun fullPageImageInPageThreshold(
                    fullPageImageInPageThreshold: FullPageImageInPageThreshold?
                ) = fullPageImageInPageThreshold(JsonField.ofNullable(fullPageImageInPageThreshold))

                /**
                 * Alias for calling [Builder.fullPageImageInPageThreshold] with
                 * `fullPageImageInPageThreshold.orElse(null)`.
                 */
                fun fullPageImageInPageThreshold(
                    fullPageImageInPageThreshold: Optional<FullPageImageInPageThreshold>
                ) = fullPageImageInPageThreshold(fullPageImageInPageThreshold.getOrNull())

                /**
                 * Sets [Builder.fullPageImageInPageThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullPageImageInPageThreshold] with a well-typed
                 * [FullPageImageInPageThreshold] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun fullPageImageInPageThreshold(
                    fullPageImageInPageThreshold: JsonField<FullPageImageInPageThreshold>
                ) = apply { this.fullPageImageInPageThreshold = fullPageImageInPageThreshold }

                /**
                 * Alias for calling [fullPageImageInPageThreshold] with
                 * `FullPageImageInPageThreshold.ofNumber(number)`.
                 */
                fun fullPageImageInPageThreshold(number: Double) =
                    fullPageImageInPageThreshold(FullPageImageInPageThreshold.ofNumber(number))

                /**
                 * Alias for calling [fullPageImageInPageThreshold] with
                 * `FullPageImageInPageThreshold.ofString(string)`.
                 */
                fun fullPageImageInPageThreshold(string: String) =
                    fullPageImageInPageThreshold(FullPageImageInPageThreshold.ofString(string))

                /** Trigger if page contains non-screenshot images */
                fun imageInPage(imageInPage: Boolean?) =
                    imageInPage(JsonField.ofNullable(imageInPage))

                /**
                 * Alias for [Builder.imageInPage].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun imageInPage(imageInPage: Boolean) = imageInPage(imageInPage as Boolean?)

                /** Alias for calling [Builder.imageInPage] with `imageInPage.orElse(null)`. */
                fun imageInPage(imageInPage: Optional<Boolean>) =
                    imageInPage(imageInPage.getOrNull())

                /**
                 * Sets [Builder.imageInPage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.imageInPage] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun imageInPage(imageInPage: JsonField<Boolean>) = apply {
                    this.imageInPage = imageInPage
                }

                /** Trigger if page contains this layout element type */
                fun layoutElementInPage(layoutElementInPage: String?) =
                    layoutElementInPage(JsonField.ofNullable(layoutElementInPage))

                /**
                 * Alias for calling [Builder.layoutElementInPage] with
                 * `layoutElementInPage.orElse(null)`.
                 */
                fun layoutElementInPage(layoutElementInPage: Optional<String>) =
                    layoutElementInPage(layoutElementInPage.getOrNull())

                /**
                 * Sets [Builder.layoutElementInPage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.layoutElementInPage] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun layoutElementInPage(layoutElementInPage: JsonField<String>) = apply {
                    this.layoutElementInPage = layoutElementInPage
                }

                /** Confidence threshold for layout element detection */
                fun layoutElementInPageConfidenceThreshold(
                    layoutElementInPageConfidenceThreshold: LayoutElementInPageConfidenceThreshold?
                ) =
                    layoutElementInPageConfidenceThreshold(
                        JsonField.ofNullable(layoutElementInPageConfidenceThreshold)
                    )

                /**
                 * Alias for calling [Builder.layoutElementInPageConfidenceThreshold] with
                 * `layoutElementInPageConfidenceThreshold.orElse(null)`.
                 */
                fun layoutElementInPageConfidenceThreshold(
                    layoutElementInPageConfidenceThreshold:
                        Optional<LayoutElementInPageConfidenceThreshold>
                ) =
                    layoutElementInPageConfidenceThreshold(
                        layoutElementInPageConfidenceThreshold.getOrNull()
                    )

                /**
                 * Sets [Builder.layoutElementInPageConfidenceThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.layoutElementInPageConfidenceThreshold] with a
                 * well-typed [LayoutElementInPageConfidenceThreshold] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun layoutElementInPageConfidenceThreshold(
                    layoutElementInPageConfidenceThreshold:
                        JsonField<LayoutElementInPageConfidenceThreshold>
                ) = apply {
                    this.layoutElementInPageConfidenceThreshold =
                        layoutElementInPageConfidenceThreshold
                }

                /**
                 * Alias for calling [layoutElementInPageConfidenceThreshold] with
                 * `LayoutElementInPageConfidenceThreshold.ofNumber(number)`.
                 */
                fun layoutElementInPageConfidenceThreshold(number: Double) =
                    layoutElementInPageConfidenceThreshold(
                        LayoutElementInPageConfidenceThreshold.ofNumber(number)
                    )

                /**
                 * Alias for calling [layoutElementInPageConfidenceThreshold] with
                 * `LayoutElementInPageConfidenceThreshold.ofString(string)`.
                 */
                fun layoutElementInPageConfidenceThreshold(string: String) =
                    layoutElementInPageConfidenceThreshold(
                        LayoutElementInPageConfidenceThreshold.ofString(string)
                    )

                /** Trigger if page has more than N charts */
                fun pageContainsAtLeastNCharts(
                    pageContainsAtLeastNCharts: PageContainsAtLeastNCharts?
                ) = pageContainsAtLeastNCharts(JsonField.ofNullable(pageContainsAtLeastNCharts))

                /**
                 * Alias for calling [Builder.pageContainsAtLeastNCharts] with
                 * `pageContainsAtLeastNCharts.orElse(null)`.
                 */
                fun pageContainsAtLeastNCharts(
                    pageContainsAtLeastNCharts: Optional<PageContainsAtLeastNCharts>
                ) = pageContainsAtLeastNCharts(pageContainsAtLeastNCharts.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtLeastNCharts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtLeastNCharts] with a well-typed
                 * [PageContainsAtLeastNCharts] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtLeastNCharts(
                    pageContainsAtLeastNCharts: JsonField<PageContainsAtLeastNCharts>
                ) = apply { this.pageContainsAtLeastNCharts = pageContainsAtLeastNCharts }

                /**
                 * Alias for calling [pageContainsAtLeastNCharts] with
                 * `PageContainsAtLeastNCharts.ofInteger(integer)`.
                 */
                fun pageContainsAtLeastNCharts(integer: Long) =
                    pageContainsAtLeastNCharts(PageContainsAtLeastNCharts.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtLeastNCharts] with
                 * `PageContainsAtLeastNCharts.ofString(string)`.
                 */
                fun pageContainsAtLeastNCharts(string: String) =
                    pageContainsAtLeastNCharts(PageContainsAtLeastNCharts.ofString(string))

                /** Trigger if page has more than N images */
                fun pageContainsAtLeastNImages(
                    pageContainsAtLeastNImages: PageContainsAtLeastNImages?
                ) = pageContainsAtLeastNImages(JsonField.ofNullable(pageContainsAtLeastNImages))

                /**
                 * Alias for calling [Builder.pageContainsAtLeastNImages] with
                 * `pageContainsAtLeastNImages.orElse(null)`.
                 */
                fun pageContainsAtLeastNImages(
                    pageContainsAtLeastNImages: Optional<PageContainsAtLeastNImages>
                ) = pageContainsAtLeastNImages(pageContainsAtLeastNImages.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtLeastNImages] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtLeastNImages] with a well-typed
                 * [PageContainsAtLeastNImages] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtLeastNImages(
                    pageContainsAtLeastNImages: JsonField<PageContainsAtLeastNImages>
                ) = apply { this.pageContainsAtLeastNImages = pageContainsAtLeastNImages }

                /**
                 * Alias for calling [pageContainsAtLeastNImages] with
                 * `PageContainsAtLeastNImages.ofInteger(integer)`.
                 */
                fun pageContainsAtLeastNImages(integer: Long) =
                    pageContainsAtLeastNImages(PageContainsAtLeastNImages.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtLeastNImages] with
                 * `PageContainsAtLeastNImages.ofString(string)`.
                 */
                fun pageContainsAtLeastNImages(string: String) =
                    pageContainsAtLeastNImages(PageContainsAtLeastNImages.ofString(string))

                /** Trigger if page has more than N layout elements */
                fun pageContainsAtLeastNLayoutElements(
                    pageContainsAtLeastNLayoutElements: PageContainsAtLeastNLayoutElements?
                ) =
                    pageContainsAtLeastNLayoutElements(
                        JsonField.ofNullable(pageContainsAtLeastNLayoutElements)
                    )

                /**
                 * Alias for calling [Builder.pageContainsAtLeastNLayoutElements] with
                 * `pageContainsAtLeastNLayoutElements.orElse(null)`.
                 */
                fun pageContainsAtLeastNLayoutElements(
                    pageContainsAtLeastNLayoutElements: Optional<PageContainsAtLeastNLayoutElements>
                ) =
                    pageContainsAtLeastNLayoutElements(
                        pageContainsAtLeastNLayoutElements.getOrNull()
                    )

                /**
                 * Sets [Builder.pageContainsAtLeastNLayoutElements] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtLeastNLayoutElements] with a
                 * well-typed [PageContainsAtLeastNLayoutElements] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtLeastNLayoutElements(
                    pageContainsAtLeastNLayoutElements:
                        JsonField<PageContainsAtLeastNLayoutElements>
                ) = apply {
                    this.pageContainsAtLeastNLayoutElements = pageContainsAtLeastNLayoutElements
                }

                /**
                 * Alias for calling [pageContainsAtLeastNLayoutElements] with
                 * `PageContainsAtLeastNLayoutElements.ofInteger(integer)`.
                 */
                fun pageContainsAtLeastNLayoutElements(integer: Long) =
                    pageContainsAtLeastNLayoutElements(
                        PageContainsAtLeastNLayoutElements.ofInteger(integer)
                    )

                /**
                 * Alias for calling [pageContainsAtLeastNLayoutElements] with
                 * `PageContainsAtLeastNLayoutElements.ofString(string)`.
                 */
                fun pageContainsAtLeastNLayoutElements(string: String) =
                    pageContainsAtLeastNLayoutElements(
                        PageContainsAtLeastNLayoutElements.ofString(string)
                    )

                /** Trigger if page has more than N lines */
                fun pageContainsAtLeastNLines(
                    pageContainsAtLeastNLines: PageContainsAtLeastNLines?
                ) = pageContainsAtLeastNLines(JsonField.ofNullable(pageContainsAtLeastNLines))

                /**
                 * Alias for calling [Builder.pageContainsAtLeastNLines] with
                 * `pageContainsAtLeastNLines.orElse(null)`.
                 */
                fun pageContainsAtLeastNLines(
                    pageContainsAtLeastNLines: Optional<PageContainsAtLeastNLines>
                ) = pageContainsAtLeastNLines(pageContainsAtLeastNLines.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtLeastNLines] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtLeastNLines] with a well-typed
                 * [PageContainsAtLeastNLines] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtLeastNLines(
                    pageContainsAtLeastNLines: JsonField<PageContainsAtLeastNLines>
                ) = apply { this.pageContainsAtLeastNLines = pageContainsAtLeastNLines }

                /**
                 * Alias for calling [pageContainsAtLeastNLines] with
                 * `PageContainsAtLeastNLines.ofInteger(integer)`.
                 */
                fun pageContainsAtLeastNLines(integer: Long) =
                    pageContainsAtLeastNLines(PageContainsAtLeastNLines.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtLeastNLines] with
                 * `PageContainsAtLeastNLines.ofString(string)`.
                 */
                fun pageContainsAtLeastNLines(string: String) =
                    pageContainsAtLeastNLines(PageContainsAtLeastNLines.ofString(string))

                /** Trigger if page has more than N links */
                fun pageContainsAtLeastNLinks(
                    pageContainsAtLeastNLinks: PageContainsAtLeastNLinks?
                ) = pageContainsAtLeastNLinks(JsonField.ofNullable(pageContainsAtLeastNLinks))

                /**
                 * Alias for calling [Builder.pageContainsAtLeastNLinks] with
                 * `pageContainsAtLeastNLinks.orElse(null)`.
                 */
                fun pageContainsAtLeastNLinks(
                    pageContainsAtLeastNLinks: Optional<PageContainsAtLeastNLinks>
                ) = pageContainsAtLeastNLinks(pageContainsAtLeastNLinks.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtLeastNLinks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtLeastNLinks] with a well-typed
                 * [PageContainsAtLeastNLinks] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtLeastNLinks(
                    pageContainsAtLeastNLinks: JsonField<PageContainsAtLeastNLinks>
                ) = apply { this.pageContainsAtLeastNLinks = pageContainsAtLeastNLinks }

                /**
                 * Alias for calling [pageContainsAtLeastNLinks] with
                 * `PageContainsAtLeastNLinks.ofInteger(integer)`.
                 */
                fun pageContainsAtLeastNLinks(integer: Long) =
                    pageContainsAtLeastNLinks(PageContainsAtLeastNLinks.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtLeastNLinks] with
                 * `PageContainsAtLeastNLinks.ofString(string)`.
                 */
                fun pageContainsAtLeastNLinks(string: String) =
                    pageContainsAtLeastNLinks(PageContainsAtLeastNLinks.ofString(string))

                /** Trigger if page has more than N numeric words */
                fun pageContainsAtLeastNNumbers(
                    pageContainsAtLeastNNumbers: PageContainsAtLeastNNumbers?
                ) = pageContainsAtLeastNNumbers(JsonField.ofNullable(pageContainsAtLeastNNumbers))

                /**
                 * Alias for calling [Builder.pageContainsAtLeastNNumbers] with
                 * `pageContainsAtLeastNNumbers.orElse(null)`.
                 */
                fun pageContainsAtLeastNNumbers(
                    pageContainsAtLeastNNumbers: Optional<PageContainsAtLeastNNumbers>
                ) = pageContainsAtLeastNNumbers(pageContainsAtLeastNNumbers.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtLeastNNumbers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtLeastNNumbers] with a well-typed
                 * [PageContainsAtLeastNNumbers] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtLeastNNumbers(
                    pageContainsAtLeastNNumbers: JsonField<PageContainsAtLeastNNumbers>
                ) = apply { this.pageContainsAtLeastNNumbers = pageContainsAtLeastNNumbers }

                /**
                 * Alias for calling [pageContainsAtLeastNNumbers] with
                 * `PageContainsAtLeastNNumbers.ofInteger(integer)`.
                 */
                fun pageContainsAtLeastNNumbers(integer: Long) =
                    pageContainsAtLeastNNumbers(PageContainsAtLeastNNumbers.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtLeastNNumbers] with
                 * `PageContainsAtLeastNNumbers.ofString(string)`.
                 */
                fun pageContainsAtLeastNNumbers(string: String) =
                    pageContainsAtLeastNNumbers(PageContainsAtLeastNNumbers.ofString(string))

                /** Trigger if page has more than N% numeric words */
                fun pageContainsAtLeastNPercentNumbers(
                    pageContainsAtLeastNPercentNumbers: PageContainsAtLeastNPercentNumbers?
                ) =
                    pageContainsAtLeastNPercentNumbers(
                        JsonField.ofNullable(pageContainsAtLeastNPercentNumbers)
                    )

                /**
                 * Alias for calling [Builder.pageContainsAtLeastNPercentNumbers] with
                 * `pageContainsAtLeastNPercentNumbers.orElse(null)`.
                 */
                fun pageContainsAtLeastNPercentNumbers(
                    pageContainsAtLeastNPercentNumbers: Optional<PageContainsAtLeastNPercentNumbers>
                ) =
                    pageContainsAtLeastNPercentNumbers(
                        pageContainsAtLeastNPercentNumbers.getOrNull()
                    )

                /**
                 * Sets [Builder.pageContainsAtLeastNPercentNumbers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtLeastNPercentNumbers] with a
                 * well-typed [PageContainsAtLeastNPercentNumbers] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtLeastNPercentNumbers(
                    pageContainsAtLeastNPercentNumbers:
                        JsonField<PageContainsAtLeastNPercentNumbers>
                ) = apply {
                    this.pageContainsAtLeastNPercentNumbers = pageContainsAtLeastNPercentNumbers
                }

                /**
                 * Alias for calling [pageContainsAtLeastNPercentNumbers] with
                 * `PageContainsAtLeastNPercentNumbers.ofInteger(integer)`.
                 */
                fun pageContainsAtLeastNPercentNumbers(integer: Long) =
                    pageContainsAtLeastNPercentNumbers(
                        PageContainsAtLeastNPercentNumbers.ofInteger(integer)
                    )

                /**
                 * Alias for calling [pageContainsAtLeastNPercentNumbers] with
                 * `PageContainsAtLeastNPercentNumbers.ofString(string)`.
                 */
                fun pageContainsAtLeastNPercentNumbers(string: String) =
                    pageContainsAtLeastNPercentNumbers(
                        PageContainsAtLeastNPercentNumbers.ofString(string)
                    )

                /** Trigger if page has more than N tables */
                fun pageContainsAtLeastNTables(
                    pageContainsAtLeastNTables: PageContainsAtLeastNTables?
                ) = pageContainsAtLeastNTables(JsonField.ofNullable(pageContainsAtLeastNTables))

                /**
                 * Alias for calling [Builder.pageContainsAtLeastNTables] with
                 * `pageContainsAtLeastNTables.orElse(null)`.
                 */
                fun pageContainsAtLeastNTables(
                    pageContainsAtLeastNTables: Optional<PageContainsAtLeastNTables>
                ) = pageContainsAtLeastNTables(pageContainsAtLeastNTables.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtLeastNTables] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtLeastNTables] with a well-typed
                 * [PageContainsAtLeastNTables] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtLeastNTables(
                    pageContainsAtLeastNTables: JsonField<PageContainsAtLeastNTables>
                ) = apply { this.pageContainsAtLeastNTables = pageContainsAtLeastNTables }

                /**
                 * Alias for calling [pageContainsAtLeastNTables] with
                 * `PageContainsAtLeastNTables.ofInteger(integer)`.
                 */
                fun pageContainsAtLeastNTables(integer: Long) =
                    pageContainsAtLeastNTables(PageContainsAtLeastNTables.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtLeastNTables] with
                 * `PageContainsAtLeastNTables.ofString(string)`.
                 */
                fun pageContainsAtLeastNTables(string: String) =
                    pageContainsAtLeastNTables(PageContainsAtLeastNTables.ofString(string))

                /** Trigger if page has more than N words */
                fun pageContainsAtLeastNWords(
                    pageContainsAtLeastNWords: PageContainsAtLeastNWords?
                ) = pageContainsAtLeastNWords(JsonField.ofNullable(pageContainsAtLeastNWords))

                /**
                 * Alias for calling [Builder.pageContainsAtLeastNWords] with
                 * `pageContainsAtLeastNWords.orElse(null)`.
                 */
                fun pageContainsAtLeastNWords(
                    pageContainsAtLeastNWords: Optional<PageContainsAtLeastNWords>
                ) = pageContainsAtLeastNWords(pageContainsAtLeastNWords.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtLeastNWords] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtLeastNWords] with a well-typed
                 * [PageContainsAtLeastNWords] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtLeastNWords(
                    pageContainsAtLeastNWords: JsonField<PageContainsAtLeastNWords>
                ) = apply { this.pageContainsAtLeastNWords = pageContainsAtLeastNWords }

                /**
                 * Alias for calling [pageContainsAtLeastNWords] with
                 * `PageContainsAtLeastNWords.ofInteger(integer)`.
                 */
                fun pageContainsAtLeastNWords(integer: Long) =
                    pageContainsAtLeastNWords(PageContainsAtLeastNWords.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtLeastNWords] with
                 * `PageContainsAtLeastNWords.ofString(string)`.
                 */
                fun pageContainsAtLeastNWords(string: String) =
                    pageContainsAtLeastNWords(PageContainsAtLeastNWords.ofString(string))

                /** Trigger if page has fewer than N charts */
                fun pageContainsAtMostNCharts(
                    pageContainsAtMostNCharts: PageContainsAtMostNCharts?
                ) = pageContainsAtMostNCharts(JsonField.ofNullable(pageContainsAtMostNCharts))

                /**
                 * Alias for calling [Builder.pageContainsAtMostNCharts] with
                 * `pageContainsAtMostNCharts.orElse(null)`.
                 */
                fun pageContainsAtMostNCharts(
                    pageContainsAtMostNCharts: Optional<PageContainsAtMostNCharts>
                ) = pageContainsAtMostNCharts(pageContainsAtMostNCharts.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtMostNCharts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtMostNCharts] with a well-typed
                 * [PageContainsAtMostNCharts] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtMostNCharts(
                    pageContainsAtMostNCharts: JsonField<PageContainsAtMostNCharts>
                ) = apply { this.pageContainsAtMostNCharts = pageContainsAtMostNCharts }

                /**
                 * Alias for calling [pageContainsAtMostNCharts] with
                 * `PageContainsAtMostNCharts.ofInteger(integer)`.
                 */
                fun pageContainsAtMostNCharts(integer: Long) =
                    pageContainsAtMostNCharts(PageContainsAtMostNCharts.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtMostNCharts] with
                 * `PageContainsAtMostNCharts.ofString(string)`.
                 */
                fun pageContainsAtMostNCharts(string: String) =
                    pageContainsAtMostNCharts(PageContainsAtMostNCharts.ofString(string))

                /** Trigger if page has fewer than N images */
                fun pageContainsAtMostNImages(
                    pageContainsAtMostNImages: PageContainsAtMostNImages?
                ) = pageContainsAtMostNImages(JsonField.ofNullable(pageContainsAtMostNImages))

                /**
                 * Alias for calling [Builder.pageContainsAtMostNImages] with
                 * `pageContainsAtMostNImages.orElse(null)`.
                 */
                fun pageContainsAtMostNImages(
                    pageContainsAtMostNImages: Optional<PageContainsAtMostNImages>
                ) = pageContainsAtMostNImages(pageContainsAtMostNImages.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtMostNImages] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtMostNImages] with a well-typed
                 * [PageContainsAtMostNImages] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtMostNImages(
                    pageContainsAtMostNImages: JsonField<PageContainsAtMostNImages>
                ) = apply { this.pageContainsAtMostNImages = pageContainsAtMostNImages }

                /**
                 * Alias for calling [pageContainsAtMostNImages] with
                 * `PageContainsAtMostNImages.ofInteger(integer)`.
                 */
                fun pageContainsAtMostNImages(integer: Long) =
                    pageContainsAtMostNImages(PageContainsAtMostNImages.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtMostNImages] with
                 * `PageContainsAtMostNImages.ofString(string)`.
                 */
                fun pageContainsAtMostNImages(string: String) =
                    pageContainsAtMostNImages(PageContainsAtMostNImages.ofString(string))

                /** Trigger if page has fewer than N layout elements */
                fun pageContainsAtMostNLayoutElements(
                    pageContainsAtMostNLayoutElements: PageContainsAtMostNLayoutElements?
                ) =
                    pageContainsAtMostNLayoutElements(
                        JsonField.ofNullable(pageContainsAtMostNLayoutElements)
                    )

                /**
                 * Alias for calling [Builder.pageContainsAtMostNLayoutElements] with
                 * `pageContainsAtMostNLayoutElements.orElse(null)`.
                 */
                fun pageContainsAtMostNLayoutElements(
                    pageContainsAtMostNLayoutElements: Optional<PageContainsAtMostNLayoutElements>
                ) = pageContainsAtMostNLayoutElements(pageContainsAtMostNLayoutElements.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtMostNLayoutElements] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtMostNLayoutElements] with a
                 * well-typed [PageContainsAtMostNLayoutElements] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtMostNLayoutElements(
                    pageContainsAtMostNLayoutElements: JsonField<PageContainsAtMostNLayoutElements>
                ) = apply {
                    this.pageContainsAtMostNLayoutElements = pageContainsAtMostNLayoutElements
                }

                /**
                 * Alias for calling [pageContainsAtMostNLayoutElements] with
                 * `PageContainsAtMostNLayoutElements.ofInteger(integer)`.
                 */
                fun pageContainsAtMostNLayoutElements(integer: Long) =
                    pageContainsAtMostNLayoutElements(
                        PageContainsAtMostNLayoutElements.ofInteger(integer)
                    )

                /**
                 * Alias for calling [pageContainsAtMostNLayoutElements] with
                 * `PageContainsAtMostNLayoutElements.ofString(string)`.
                 */
                fun pageContainsAtMostNLayoutElements(string: String) =
                    pageContainsAtMostNLayoutElements(
                        PageContainsAtMostNLayoutElements.ofString(string)
                    )

                /** Trigger if page has fewer than N lines */
                fun pageContainsAtMostNLines(pageContainsAtMostNLines: PageContainsAtMostNLines?) =
                    pageContainsAtMostNLines(JsonField.ofNullable(pageContainsAtMostNLines))

                /**
                 * Alias for calling [Builder.pageContainsAtMostNLines] with
                 * `pageContainsAtMostNLines.orElse(null)`.
                 */
                fun pageContainsAtMostNLines(
                    pageContainsAtMostNLines: Optional<PageContainsAtMostNLines>
                ) = pageContainsAtMostNLines(pageContainsAtMostNLines.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtMostNLines] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtMostNLines] with a well-typed
                 * [PageContainsAtMostNLines] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtMostNLines(
                    pageContainsAtMostNLines: JsonField<PageContainsAtMostNLines>
                ) = apply { this.pageContainsAtMostNLines = pageContainsAtMostNLines }

                /**
                 * Alias for calling [pageContainsAtMostNLines] with
                 * `PageContainsAtMostNLines.ofInteger(integer)`.
                 */
                fun pageContainsAtMostNLines(integer: Long) =
                    pageContainsAtMostNLines(PageContainsAtMostNLines.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtMostNLines] with
                 * `PageContainsAtMostNLines.ofString(string)`.
                 */
                fun pageContainsAtMostNLines(string: String) =
                    pageContainsAtMostNLines(PageContainsAtMostNLines.ofString(string))

                /** Trigger if page has fewer than N links */
                fun pageContainsAtMostNLinks(pageContainsAtMostNLinks: PageContainsAtMostNLinks?) =
                    pageContainsAtMostNLinks(JsonField.ofNullable(pageContainsAtMostNLinks))

                /**
                 * Alias for calling [Builder.pageContainsAtMostNLinks] with
                 * `pageContainsAtMostNLinks.orElse(null)`.
                 */
                fun pageContainsAtMostNLinks(
                    pageContainsAtMostNLinks: Optional<PageContainsAtMostNLinks>
                ) = pageContainsAtMostNLinks(pageContainsAtMostNLinks.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtMostNLinks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtMostNLinks] with a well-typed
                 * [PageContainsAtMostNLinks] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtMostNLinks(
                    pageContainsAtMostNLinks: JsonField<PageContainsAtMostNLinks>
                ) = apply { this.pageContainsAtMostNLinks = pageContainsAtMostNLinks }

                /**
                 * Alias for calling [pageContainsAtMostNLinks] with
                 * `PageContainsAtMostNLinks.ofInteger(integer)`.
                 */
                fun pageContainsAtMostNLinks(integer: Long) =
                    pageContainsAtMostNLinks(PageContainsAtMostNLinks.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtMostNLinks] with
                 * `PageContainsAtMostNLinks.ofString(string)`.
                 */
                fun pageContainsAtMostNLinks(string: String) =
                    pageContainsAtMostNLinks(PageContainsAtMostNLinks.ofString(string))

                /** Trigger if page has fewer than N numeric words */
                fun pageContainsAtMostNNumbers(
                    pageContainsAtMostNNumbers: PageContainsAtMostNNumbers?
                ) = pageContainsAtMostNNumbers(JsonField.ofNullable(pageContainsAtMostNNumbers))

                /**
                 * Alias for calling [Builder.pageContainsAtMostNNumbers] with
                 * `pageContainsAtMostNNumbers.orElse(null)`.
                 */
                fun pageContainsAtMostNNumbers(
                    pageContainsAtMostNNumbers: Optional<PageContainsAtMostNNumbers>
                ) = pageContainsAtMostNNumbers(pageContainsAtMostNNumbers.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtMostNNumbers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtMostNNumbers] with a well-typed
                 * [PageContainsAtMostNNumbers] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtMostNNumbers(
                    pageContainsAtMostNNumbers: JsonField<PageContainsAtMostNNumbers>
                ) = apply { this.pageContainsAtMostNNumbers = pageContainsAtMostNNumbers }

                /**
                 * Alias for calling [pageContainsAtMostNNumbers] with
                 * `PageContainsAtMostNNumbers.ofInteger(integer)`.
                 */
                fun pageContainsAtMostNNumbers(integer: Long) =
                    pageContainsAtMostNNumbers(PageContainsAtMostNNumbers.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtMostNNumbers] with
                 * `PageContainsAtMostNNumbers.ofString(string)`.
                 */
                fun pageContainsAtMostNNumbers(string: String) =
                    pageContainsAtMostNNumbers(PageContainsAtMostNNumbers.ofString(string))

                /** Trigger if page has fewer than N% numeric words */
                fun pageContainsAtMostNPercentNumbers(
                    pageContainsAtMostNPercentNumbers: PageContainsAtMostNPercentNumbers?
                ) =
                    pageContainsAtMostNPercentNumbers(
                        JsonField.ofNullable(pageContainsAtMostNPercentNumbers)
                    )

                /**
                 * Alias for calling [Builder.pageContainsAtMostNPercentNumbers] with
                 * `pageContainsAtMostNPercentNumbers.orElse(null)`.
                 */
                fun pageContainsAtMostNPercentNumbers(
                    pageContainsAtMostNPercentNumbers: Optional<PageContainsAtMostNPercentNumbers>
                ) = pageContainsAtMostNPercentNumbers(pageContainsAtMostNPercentNumbers.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtMostNPercentNumbers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtMostNPercentNumbers] with a
                 * well-typed [PageContainsAtMostNPercentNumbers] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtMostNPercentNumbers(
                    pageContainsAtMostNPercentNumbers: JsonField<PageContainsAtMostNPercentNumbers>
                ) = apply {
                    this.pageContainsAtMostNPercentNumbers = pageContainsAtMostNPercentNumbers
                }

                /**
                 * Alias for calling [pageContainsAtMostNPercentNumbers] with
                 * `PageContainsAtMostNPercentNumbers.ofInteger(integer)`.
                 */
                fun pageContainsAtMostNPercentNumbers(integer: Long) =
                    pageContainsAtMostNPercentNumbers(
                        PageContainsAtMostNPercentNumbers.ofInteger(integer)
                    )

                /**
                 * Alias for calling [pageContainsAtMostNPercentNumbers] with
                 * `PageContainsAtMostNPercentNumbers.ofString(string)`.
                 */
                fun pageContainsAtMostNPercentNumbers(string: String) =
                    pageContainsAtMostNPercentNumbers(
                        PageContainsAtMostNPercentNumbers.ofString(string)
                    )

                /** Trigger if page has fewer than N tables */
                fun pageContainsAtMostNTables(
                    pageContainsAtMostNTables: PageContainsAtMostNTables?
                ) = pageContainsAtMostNTables(JsonField.ofNullable(pageContainsAtMostNTables))

                /**
                 * Alias for calling [Builder.pageContainsAtMostNTables] with
                 * `pageContainsAtMostNTables.orElse(null)`.
                 */
                fun pageContainsAtMostNTables(
                    pageContainsAtMostNTables: Optional<PageContainsAtMostNTables>
                ) = pageContainsAtMostNTables(pageContainsAtMostNTables.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtMostNTables] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtMostNTables] with a well-typed
                 * [PageContainsAtMostNTables] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtMostNTables(
                    pageContainsAtMostNTables: JsonField<PageContainsAtMostNTables>
                ) = apply { this.pageContainsAtMostNTables = pageContainsAtMostNTables }

                /**
                 * Alias for calling [pageContainsAtMostNTables] with
                 * `PageContainsAtMostNTables.ofInteger(integer)`.
                 */
                fun pageContainsAtMostNTables(integer: Long) =
                    pageContainsAtMostNTables(PageContainsAtMostNTables.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtMostNTables] with
                 * `PageContainsAtMostNTables.ofString(string)`.
                 */
                fun pageContainsAtMostNTables(string: String) =
                    pageContainsAtMostNTables(PageContainsAtMostNTables.ofString(string))

                /** Trigger if page has fewer than N words */
                fun pageContainsAtMostNWords(pageContainsAtMostNWords: PageContainsAtMostNWords?) =
                    pageContainsAtMostNWords(JsonField.ofNullable(pageContainsAtMostNWords))

                /**
                 * Alias for calling [Builder.pageContainsAtMostNWords] with
                 * `pageContainsAtMostNWords.orElse(null)`.
                 */
                fun pageContainsAtMostNWords(
                    pageContainsAtMostNWords: Optional<PageContainsAtMostNWords>
                ) = pageContainsAtMostNWords(pageContainsAtMostNWords.getOrNull())

                /**
                 * Sets [Builder.pageContainsAtMostNWords] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageContainsAtMostNWords] with a well-typed
                 * [PageContainsAtMostNWords] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun pageContainsAtMostNWords(
                    pageContainsAtMostNWords: JsonField<PageContainsAtMostNWords>
                ) = apply { this.pageContainsAtMostNWords = pageContainsAtMostNWords }

                /**
                 * Alias for calling [pageContainsAtMostNWords] with
                 * `PageContainsAtMostNWords.ofInteger(integer)`.
                 */
                fun pageContainsAtMostNWords(integer: Long) =
                    pageContainsAtMostNWords(PageContainsAtMostNWords.ofInteger(integer))

                /**
                 * Alias for calling [pageContainsAtMostNWords] with
                 * `PageContainsAtMostNWords.ofString(string)`.
                 */
                fun pageContainsAtMostNWords(string: String) =
                    pageContainsAtMostNWords(PageContainsAtMostNWords.ofString(string))

                /** Trigger if page has more than N characters */
                fun pageLongerThanNChars(pageLongerThanNChars: PageLongerThanNChars?) =
                    pageLongerThanNChars(JsonField.ofNullable(pageLongerThanNChars))

                /**
                 * Alias for calling [Builder.pageLongerThanNChars] with
                 * `pageLongerThanNChars.orElse(null)`.
                 */
                fun pageLongerThanNChars(pageLongerThanNChars: Optional<PageLongerThanNChars>) =
                    pageLongerThanNChars(pageLongerThanNChars.getOrNull())

                /**
                 * Sets [Builder.pageLongerThanNChars] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageLongerThanNChars] with a well-typed
                 * [PageLongerThanNChars] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun pageLongerThanNChars(pageLongerThanNChars: JsonField<PageLongerThanNChars>) =
                    apply {
                        this.pageLongerThanNChars = pageLongerThanNChars
                    }

                /**
                 * Alias for calling [pageLongerThanNChars] with
                 * `PageLongerThanNChars.ofInteger(integer)`.
                 */
                fun pageLongerThanNChars(integer: Long) =
                    pageLongerThanNChars(PageLongerThanNChars.ofInteger(integer))

                /**
                 * Alias for calling [pageLongerThanNChars] with
                 * `PageLongerThanNChars.ofString(string)`.
                 */
                fun pageLongerThanNChars(string: String) =
                    pageLongerThanNChars(PageLongerThanNChars.ofString(string))

                /** Trigger on pages with markdown extraction errors */
                fun pageMdError(pageMdError: Boolean?) =
                    pageMdError(JsonField.ofNullable(pageMdError))

                /**
                 * Alias for [Builder.pageMdError].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun pageMdError(pageMdError: Boolean) = pageMdError(pageMdError as Boolean?)

                /** Alias for calling [Builder.pageMdError] with `pageMdError.orElse(null)`. */
                fun pageMdError(pageMdError: Optional<Boolean>) =
                    pageMdError(pageMdError.getOrNull())

                /**
                 * Sets [Builder.pageMdError] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageMdError] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pageMdError(pageMdError: JsonField<Boolean>) = apply {
                    this.pageMdError = pageMdError
                }

                /** Trigger if page has fewer than N characters */
                fun pageShorterThanNChars(pageShorterThanNChars: PageShorterThanNChars?) =
                    pageShorterThanNChars(JsonField.ofNullable(pageShorterThanNChars))

                /**
                 * Alias for calling [Builder.pageShorterThanNChars] with
                 * `pageShorterThanNChars.orElse(null)`.
                 */
                fun pageShorterThanNChars(pageShorterThanNChars: Optional<PageShorterThanNChars>) =
                    pageShorterThanNChars(pageShorterThanNChars.getOrNull())

                /**
                 * Sets [Builder.pageShorterThanNChars] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageShorterThanNChars] with a well-typed
                 * [PageShorterThanNChars] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun pageShorterThanNChars(pageShorterThanNChars: JsonField<PageShorterThanNChars>) =
                    apply {
                        this.pageShorterThanNChars = pageShorterThanNChars
                    }

                /**
                 * Alias for calling [pageShorterThanNChars] with
                 * `PageShorterThanNChars.ofInteger(integer)`.
                 */
                fun pageShorterThanNChars(integer: Long) =
                    pageShorterThanNChars(PageShorterThanNChars.ofInteger(integer))

                /**
                 * Alias for calling [pageShorterThanNChars] with
                 * `PageShorterThanNChars.ofString(string)`.
                 */
                fun pageShorterThanNChars(string: String) =
                    pageShorterThanNChars(PageShorterThanNChars.ofString(string))

                /** Regex pattern to match in page content */
                fun regexpInPage(regexpInPage: String?) =
                    regexpInPage(JsonField.ofNullable(regexpInPage))

                /** Alias for calling [Builder.regexpInPage] with `regexpInPage.orElse(null)`. */
                fun regexpInPage(regexpInPage: Optional<String>) =
                    regexpInPage(regexpInPage.getOrNull())

                /**
                 * Sets [Builder.regexpInPage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.regexpInPage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun regexpInPage(regexpInPage: JsonField<String>) = apply {
                    this.regexpInPage = regexpInPage
                }

                /** Regex mode flags for regexp_in_page */
                fun regexpInPageMode(regexpInPageMode: String?) =
                    regexpInPageMode(JsonField.ofNullable(regexpInPageMode))

                /**
                 * Alias for calling [Builder.regexpInPageMode] with
                 * `regexpInPageMode.orElse(null)`.
                 */
                fun regexpInPageMode(regexpInPageMode: Optional<String>) =
                    regexpInPageMode(regexpInPageMode.getOrNull())

                /**
                 * Sets [Builder.regexpInPageMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.regexpInPageMode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun regexpInPageMode(regexpInPageMode: JsonField<String>) = apply {
                    this.regexpInPageMode = regexpInPageMode
                }

                /** Trigger if page contains a table */
                fun tableInPage(tableInPage: Boolean?) =
                    tableInPage(JsonField.ofNullable(tableInPage))

                /**
                 * Alias for [Builder.tableInPage].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun tableInPage(tableInPage: Boolean) = tableInPage(tableInPage as Boolean?)

                /** Alias for calling [Builder.tableInPage] with `tableInPage.orElse(null)`. */
                fun tableInPage(tableInPage: Optional<Boolean>) =
                    tableInPage(tableInPage.getOrNull())

                /**
                 * Sets [Builder.tableInPage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tableInPage] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tableInPage(tableInPage: JsonField<Boolean>) = apply {
                    this.tableInPage = tableInPage
                }

                /** Trigger if page text/markdown contains this string */
                fun textInPage(textInPage: String?) = textInPage(JsonField.ofNullable(textInPage))

                /** Alias for calling [Builder.textInPage] with `textInPage.orElse(null)`. */
                fun textInPage(textInPage: Optional<String>) = textInPage(textInPage.getOrNull())

                /**
                 * Sets [Builder.textInPage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.textInPage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun textInPage(textInPage: JsonField<String>) = apply {
                    this.textInPage = textInPage
                }

                /**
                 * How to combine multiple trigger conditions: 'and' (all conditions must match,
                 * this is the default) or 'or' (any single condition can trigger)
                 */
                fun triggerMode(triggerMode: String?) =
                    triggerMode(JsonField.ofNullable(triggerMode))

                /** Alias for calling [Builder.triggerMode] with `triggerMode.orElse(null)`. */
                fun triggerMode(triggerMode: Optional<String>) =
                    triggerMode(triggerMode.getOrNull())

                /**
                 * Sets [Builder.triggerMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.triggerMode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun triggerMode(triggerMode: JsonField<String>) = apply {
                    this.triggerMode = triggerMode
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AutoModeConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .parsingConf()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AutoModeConfiguration =
                    AutoModeConfiguration(
                        checkRequired("parsingConf", parsingConf),
                        filenameMatchGlob,
                        (filenameMatchGlobList ?: JsonMissing.of()).map { it.toImmutable() },
                        filenameRegexp,
                        filenameRegexpMode,
                        fullPageImageInPage,
                        fullPageImageInPageThreshold,
                        imageInPage,
                        layoutElementInPage,
                        layoutElementInPageConfidenceThreshold,
                        pageContainsAtLeastNCharts,
                        pageContainsAtLeastNImages,
                        pageContainsAtLeastNLayoutElements,
                        pageContainsAtLeastNLines,
                        pageContainsAtLeastNLinks,
                        pageContainsAtLeastNNumbers,
                        pageContainsAtLeastNPercentNumbers,
                        pageContainsAtLeastNTables,
                        pageContainsAtLeastNWords,
                        pageContainsAtMostNCharts,
                        pageContainsAtMostNImages,
                        pageContainsAtMostNLayoutElements,
                        pageContainsAtMostNLines,
                        pageContainsAtMostNLinks,
                        pageContainsAtMostNNumbers,
                        pageContainsAtMostNPercentNumbers,
                        pageContainsAtMostNTables,
                        pageContainsAtMostNWords,
                        pageLongerThanNChars,
                        pageMdError,
                        pageShorterThanNChars,
                        regexpInPage,
                        regexpInPageMode,
                        tableInPage,
                        textInPage,
                        triggerMode,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AutoModeConfiguration = apply {
                if (validated) {
                    return@apply
                }

                parsingConf().validate()
                filenameMatchGlob()
                filenameMatchGlobList()
                filenameRegexp()
                filenameRegexpMode()
                fullPageImageInPage()
                fullPageImageInPageThreshold().ifPresent { it.validate() }
                imageInPage()
                layoutElementInPage()
                layoutElementInPageConfidenceThreshold().ifPresent { it.validate() }
                pageContainsAtLeastNCharts().ifPresent { it.validate() }
                pageContainsAtLeastNImages().ifPresent { it.validate() }
                pageContainsAtLeastNLayoutElements().ifPresent { it.validate() }
                pageContainsAtLeastNLines().ifPresent { it.validate() }
                pageContainsAtLeastNLinks().ifPresent { it.validate() }
                pageContainsAtLeastNNumbers().ifPresent { it.validate() }
                pageContainsAtLeastNPercentNumbers().ifPresent { it.validate() }
                pageContainsAtLeastNTables().ifPresent { it.validate() }
                pageContainsAtLeastNWords().ifPresent { it.validate() }
                pageContainsAtMostNCharts().ifPresent { it.validate() }
                pageContainsAtMostNImages().ifPresent { it.validate() }
                pageContainsAtMostNLayoutElements().ifPresent { it.validate() }
                pageContainsAtMostNLines().ifPresent { it.validate() }
                pageContainsAtMostNLinks().ifPresent { it.validate() }
                pageContainsAtMostNNumbers().ifPresent { it.validate() }
                pageContainsAtMostNPercentNumbers().ifPresent { it.validate() }
                pageContainsAtMostNTables().ifPresent { it.validate() }
                pageContainsAtMostNWords().ifPresent { it.validate() }
                pageLongerThanNChars().ifPresent { it.validate() }
                pageMdError()
                pageShorterThanNChars().ifPresent { it.validate() }
                regexpInPage()
                regexpInPageMode()
                tableInPage()
                textInPage()
                triggerMode()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (parsingConf.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (filenameMatchGlob.asKnown().isPresent) 1 else 0) +
                    (filenameMatchGlobList.asKnown().getOrNull()?.size ?: 0) +
                    (if (filenameRegexp.asKnown().isPresent) 1 else 0) +
                    (if (filenameRegexpMode.asKnown().isPresent) 1 else 0) +
                    (if (fullPageImageInPage.asKnown().isPresent) 1 else 0) +
                    (fullPageImageInPageThreshold.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (imageInPage.asKnown().isPresent) 1 else 0) +
                    (if (layoutElementInPage.asKnown().isPresent) 1 else 0) +
                    (layoutElementInPageConfidenceThreshold.asKnown().getOrNull()?.validity()
                        ?: 0) +
                    (pageContainsAtLeastNCharts.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtLeastNImages.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtLeastNLayoutElements.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtLeastNLines.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtLeastNLinks.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtLeastNNumbers.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtLeastNPercentNumbers.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtLeastNTables.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtLeastNWords.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtMostNCharts.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtMostNImages.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtMostNLayoutElements.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtMostNLines.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtMostNLinks.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtMostNNumbers.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtMostNPercentNumbers.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtMostNTables.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageContainsAtMostNWords.asKnown().getOrNull()?.validity() ?: 0) +
                    (pageLongerThanNChars.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (pageMdError.asKnown().isPresent) 1 else 0) +
                    (pageShorterThanNChars.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (regexpInPage.asKnown().isPresent) 1 else 0) +
                    (if (regexpInPageMode.asKnown().isPresent) 1 else 0) +
                    (if (tableInPage.asKnown().isPresent) 1 else 0) +
                    (if (textInPage.asKnown().isPresent) 1 else 0) +
                    (if (triggerMode.asKnown().isPresent) 1 else 0)

            /** Parsing configuration to apply when trigger conditions are met */
            class ParsingConf
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val adaptiveLongTable: JsonField<Boolean>,
                private val aggressiveTableExtraction: JsonField<Boolean>,
                private val cropBox: JsonField<CropBox>,
                private val customPrompt: JsonField<String>,
                private val extractLayout: JsonField<Boolean>,
                private val highResOcr: JsonField<Boolean>,
                private val ignore: JsonField<Ignore>,
                private val language: JsonField<String>,
                private val outlinedTableExtraction: JsonField<Boolean>,
                private val presentation: JsonField<Presentation>,
                private val spatialText: JsonField<SpatialText>,
                private val specializedChartParsing: JsonField<SpecializedChartParsing>,
                private val tier: JsonField<Tier>,
                private val version: JsonField<Version>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("adaptive_long_table")
                    @ExcludeMissing
                    adaptiveLongTable: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("aggressive_table_extraction")
                    @ExcludeMissing
                    aggressiveTableExtraction: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("crop_box")
                    @ExcludeMissing
                    cropBox: JsonField<CropBox> = JsonMissing.of(),
                    @JsonProperty("custom_prompt")
                    @ExcludeMissing
                    customPrompt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("extract_layout")
                    @ExcludeMissing
                    extractLayout: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("high_res_ocr")
                    @ExcludeMissing
                    highResOcr: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("ignore")
                    @ExcludeMissing
                    ignore: JsonField<Ignore> = JsonMissing.of(),
                    @JsonProperty("language")
                    @ExcludeMissing
                    language: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("outlined_table_extraction")
                    @ExcludeMissing
                    outlinedTableExtraction: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("presentation")
                    @ExcludeMissing
                    presentation: JsonField<Presentation> = JsonMissing.of(),
                    @JsonProperty("spatial_text")
                    @ExcludeMissing
                    spatialText: JsonField<SpatialText> = JsonMissing.of(),
                    @JsonProperty("specialized_chart_parsing")
                    @ExcludeMissing
                    specializedChartParsing: JsonField<SpecializedChartParsing> = JsonMissing.of(),
                    @JsonProperty("tier") @ExcludeMissing tier: JsonField<Tier> = JsonMissing.of(),
                    @JsonProperty("version")
                    @ExcludeMissing
                    version: JsonField<Version> = JsonMissing.of(),
                ) : this(
                    adaptiveLongTable,
                    aggressiveTableExtraction,
                    cropBox,
                    customPrompt,
                    extractLayout,
                    highResOcr,
                    ignore,
                    language,
                    outlinedTableExtraction,
                    presentation,
                    spatialText,
                    specializedChartParsing,
                    tier,
                    version,
                    mutableMapOf(),
                )

                /**
                 * Whether to use adaptive long table handling
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun adaptiveLongTable(): Optional<Boolean> =
                    adaptiveLongTable.getOptional("adaptive_long_table")

                /**
                 * Whether to use aggressive table extraction
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun aggressiveTableExtraction(): Optional<Boolean> =
                    aggressiveTableExtraction.getOptional("aggressive_table_extraction")

                /**
                 * Crop box options for auto mode parsing configuration.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun cropBox(): Optional<CropBox> = cropBox.getOptional("crop_box")

                /**
                 * Custom AI instructions for matched pages. Overrides the base custom_prompt
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun customPrompt(): Optional<String> = customPrompt.getOptional("custom_prompt")

                /**
                 * Whether to extract layout information
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun extractLayout(): Optional<Boolean> = extractLayout.getOptional("extract_layout")

                /**
                 * Whether to use high resolution OCR
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun highResOcr(): Optional<Boolean> = highResOcr.getOptional("high_res_ocr")

                /**
                 * Ignore options for auto mode parsing configuration.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ignore(): Optional<Ignore> = ignore.getOptional("ignore")

                /**
                 * Primary language of the document
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun language(): Optional<String> = language.getOptional("language")

                /**
                 * Whether to use outlined table extraction
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun outlinedTableExtraction(): Optional<Boolean> =
                    outlinedTableExtraction.getOptional("outlined_table_extraction")

                /**
                 * Presentation-specific options for auto mode parsing configuration.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun presentation(): Optional<Presentation> =
                    presentation.getOptional("presentation")

                /**
                 * Spatial text options for auto mode parsing configuration.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun spatialText(): Optional<SpatialText> = spatialText.getOptional("spatial_text")

                /**
                 * Enable specialized chart parsing with the specified mode
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun specializedChartParsing(): Optional<SpecializedChartParsing> =
                    specializedChartParsing.getOptional("specialized_chart_parsing")

                /**
                 * Override the parsing tier for matched pages. Must be paired with version
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tier(): Optional<Tier> = tier.getOptional("tier")

                /**
                 * Version for the override tier. Required when `tier` is set. Use `latest`, or pin
                 * one of that tier's dated versions.
                 *
                 * Current `latest` by tier:
                 * - `fast`: `2025-12-11`
                 * - `cost_effective`: `2026-06-18`
                 * - `agentic`: `2026-06-18`
                 * - `agentic_plus`: `2026-06-18`
                 *
                 * Full list: `GET /api/v2/parse/versions`.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun version(): Optional<Version> = version.getOptional("version")

                /**
                 * Returns the raw JSON value of [adaptiveLongTable].
                 *
                 * Unlike [adaptiveLongTable], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("adaptive_long_table")
                @ExcludeMissing
                fun _adaptiveLongTable(): JsonField<Boolean> = adaptiveLongTable

                /**
                 * Returns the raw JSON value of [aggressiveTableExtraction].
                 *
                 * Unlike [aggressiveTableExtraction], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("aggressive_table_extraction")
                @ExcludeMissing
                fun _aggressiveTableExtraction(): JsonField<Boolean> = aggressiveTableExtraction

                /**
                 * Returns the raw JSON value of [cropBox].
                 *
                 * Unlike [cropBox], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("crop_box")
                @ExcludeMissing
                fun _cropBox(): JsonField<CropBox> = cropBox

                /**
                 * Returns the raw JSON value of [customPrompt].
                 *
                 * Unlike [customPrompt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("custom_prompt")
                @ExcludeMissing
                fun _customPrompt(): JsonField<String> = customPrompt

                /**
                 * Returns the raw JSON value of [extractLayout].
                 *
                 * Unlike [extractLayout], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("extract_layout")
                @ExcludeMissing
                fun _extractLayout(): JsonField<Boolean> = extractLayout

                /**
                 * Returns the raw JSON value of [highResOcr].
                 *
                 * Unlike [highResOcr], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("high_res_ocr")
                @ExcludeMissing
                fun _highResOcr(): JsonField<Boolean> = highResOcr

                /**
                 * Returns the raw JSON value of [ignore].
                 *
                 * Unlike [ignore], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("ignore") @ExcludeMissing fun _ignore(): JsonField<Ignore> = ignore

                /**
                 * Returns the raw JSON value of [language].
                 *
                 * Unlike [language], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("language")
                @ExcludeMissing
                fun _language(): JsonField<String> = language

                /**
                 * Returns the raw JSON value of [outlinedTableExtraction].
                 *
                 * Unlike [outlinedTableExtraction], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("outlined_table_extraction")
                @ExcludeMissing
                fun _outlinedTableExtraction(): JsonField<Boolean> = outlinedTableExtraction

                /**
                 * Returns the raw JSON value of [presentation].
                 *
                 * Unlike [presentation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("presentation")
                @ExcludeMissing
                fun _presentation(): JsonField<Presentation> = presentation

                /**
                 * Returns the raw JSON value of [spatialText].
                 *
                 * Unlike [spatialText], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("spatial_text")
                @ExcludeMissing
                fun _spatialText(): JsonField<SpatialText> = spatialText

                /**
                 * Returns the raw JSON value of [specializedChartParsing].
                 *
                 * Unlike [specializedChartParsing], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("specialized_chart_parsing")
                @ExcludeMissing
                fun _specializedChartParsing(): JsonField<SpecializedChartParsing> =
                    specializedChartParsing

                /**
                 * Returns the raw JSON value of [tier].
                 *
                 * Unlike [tier], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Tier> = tier

                /**
                 * Returns the raw JSON value of [version].
                 *
                 * Unlike [version], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("version")
                @ExcludeMissing
                fun _version(): JsonField<Version> = version

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [ParsingConf]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ParsingConf]. */
                class Builder internal constructor() {

                    private var adaptiveLongTable: JsonField<Boolean> = JsonMissing.of()
                    private var aggressiveTableExtraction: JsonField<Boolean> = JsonMissing.of()
                    private var cropBox: JsonField<CropBox> = JsonMissing.of()
                    private var customPrompt: JsonField<String> = JsonMissing.of()
                    private var extractLayout: JsonField<Boolean> = JsonMissing.of()
                    private var highResOcr: JsonField<Boolean> = JsonMissing.of()
                    private var ignore: JsonField<Ignore> = JsonMissing.of()
                    private var language: JsonField<String> = JsonMissing.of()
                    private var outlinedTableExtraction: JsonField<Boolean> = JsonMissing.of()
                    private var presentation: JsonField<Presentation> = JsonMissing.of()
                    private var spatialText: JsonField<SpatialText> = JsonMissing.of()
                    private var specializedChartParsing: JsonField<SpecializedChartParsing> =
                        JsonMissing.of()
                    private var tier: JsonField<Tier> = JsonMissing.of()
                    private var version: JsonField<Version> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(parsingConf: ParsingConf) = apply {
                        adaptiveLongTable = parsingConf.adaptiveLongTable
                        aggressiveTableExtraction = parsingConf.aggressiveTableExtraction
                        cropBox = parsingConf.cropBox
                        customPrompt = parsingConf.customPrompt
                        extractLayout = parsingConf.extractLayout
                        highResOcr = parsingConf.highResOcr
                        ignore = parsingConf.ignore
                        language = parsingConf.language
                        outlinedTableExtraction = parsingConf.outlinedTableExtraction
                        presentation = parsingConf.presentation
                        spatialText = parsingConf.spatialText
                        specializedChartParsing = parsingConf.specializedChartParsing
                        tier = parsingConf.tier
                        version = parsingConf.version
                        additionalProperties = parsingConf.additionalProperties.toMutableMap()
                    }

                    /** Whether to use adaptive long table handling */
                    fun adaptiveLongTable(adaptiveLongTable: Boolean?) =
                        adaptiveLongTable(JsonField.ofNullable(adaptiveLongTable))

                    /**
                     * Alias for [Builder.adaptiveLongTable].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun adaptiveLongTable(adaptiveLongTable: Boolean) =
                        adaptiveLongTable(adaptiveLongTable as Boolean?)

                    /**
                     * Alias for calling [Builder.adaptiveLongTable] with
                     * `adaptiveLongTable.orElse(null)`.
                     */
                    fun adaptiveLongTable(adaptiveLongTable: Optional<Boolean>) =
                        adaptiveLongTable(adaptiveLongTable.getOrNull())

                    /**
                     * Sets [Builder.adaptiveLongTable] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.adaptiveLongTable] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun adaptiveLongTable(adaptiveLongTable: JsonField<Boolean>) = apply {
                        this.adaptiveLongTable = adaptiveLongTable
                    }

                    /** Whether to use aggressive table extraction */
                    fun aggressiveTableExtraction(aggressiveTableExtraction: Boolean?) =
                        aggressiveTableExtraction(JsonField.ofNullable(aggressiveTableExtraction))

                    /**
                     * Alias for [Builder.aggressiveTableExtraction].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun aggressiveTableExtraction(aggressiveTableExtraction: Boolean) =
                        aggressiveTableExtraction(aggressiveTableExtraction as Boolean?)

                    /**
                     * Alias for calling [Builder.aggressiveTableExtraction] with
                     * `aggressiveTableExtraction.orElse(null)`.
                     */
                    fun aggressiveTableExtraction(aggressiveTableExtraction: Optional<Boolean>) =
                        aggressiveTableExtraction(aggressiveTableExtraction.getOrNull())

                    /**
                     * Sets [Builder.aggressiveTableExtraction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.aggressiveTableExtraction] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun aggressiveTableExtraction(aggressiveTableExtraction: JsonField<Boolean>) =
                        apply {
                            this.aggressiveTableExtraction = aggressiveTableExtraction
                        }

                    /** Crop box options for auto mode parsing configuration. */
                    fun cropBox(cropBox: CropBox?) = cropBox(JsonField.ofNullable(cropBox))

                    /** Alias for calling [Builder.cropBox] with `cropBox.orElse(null)`. */
                    fun cropBox(cropBox: Optional<CropBox>) = cropBox(cropBox.getOrNull())

                    /**
                     * Sets [Builder.cropBox] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cropBox] with a well-typed [CropBox] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cropBox(cropBox: JsonField<CropBox>) = apply { this.cropBox = cropBox }

                    /**
                     * Custom AI instructions for matched pages. Overrides the base custom_prompt
                     */
                    fun customPrompt(customPrompt: String?) =
                        customPrompt(JsonField.ofNullable(customPrompt))

                    /**
                     * Alias for calling [Builder.customPrompt] with `customPrompt.orElse(null)`.
                     */
                    fun customPrompt(customPrompt: Optional<String>) =
                        customPrompt(customPrompt.getOrNull())

                    /**
                     * Sets [Builder.customPrompt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.customPrompt] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun customPrompt(customPrompt: JsonField<String>) = apply {
                        this.customPrompt = customPrompt
                    }

                    /** Whether to extract layout information */
                    fun extractLayout(extractLayout: Boolean?) =
                        extractLayout(JsonField.ofNullable(extractLayout))

                    /**
                     * Alias for [Builder.extractLayout].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun extractLayout(extractLayout: Boolean) =
                        extractLayout(extractLayout as Boolean?)

                    /**
                     * Alias for calling [Builder.extractLayout] with `extractLayout.orElse(null)`.
                     */
                    fun extractLayout(extractLayout: Optional<Boolean>) =
                        extractLayout(extractLayout.getOrNull())

                    /**
                     * Sets [Builder.extractLayout] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.extractLayout] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun extractLayout(extractLayout: JsonField<Boolean>) = apply {
                        this.extractLayout = extractLayout
                    }

                    /** Whether to use high resolution OCR */
                    fun highResOcr(highResOcr: Boolean?) =
                        highResOcr(JsonField.ofNullable(highResOcr))

                    /**
                     * Alias for [Builder.highResOcr].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun highResOcr(highResOcr: Boolean) = highResOcr(highResOcr as Boolean?)

                    /** Alias for calling [Builder.highResOcr] with `highResOcr.orElse(null)`. */
                    fun highResOcr(highResOcr: Optional<Boolean>) =
                        highResOcr(highResOcr.getOrNull())

                    /**
                     * Sets [Builder.highResOcr] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.highResOcr] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun highResOcr(highResOcr: JsonField<Boolean>) = apply {
                        this.highResOcr = highResOcr
                    }

                    /** Ignore options for auto mode parsing configuration. */
                    fun ignore(ignore: Ignore?) = ignore(JsonField.ofNullable(ignore))

                    /** Alias for calling [Builder.ignore] with `ignore.orElse(null)`. */
                    fun ignore(ignore: Optional<Ignore>) = ignore(ignore.getOrNull())

                    /**
                     * Sets [Builder.ignore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ignore] with a well-typed [Ignore] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ignore(ignore: JsonField<Ignore>) = apply { this.ignore = ignore }

                    /** Primary language of the document */
                    fun language(language: String?) = language(JsonField.ofNullable(language))

                    /** Alias for calling [Builder.language] with `language.orElse(null)`. */
                    fun language(language: Optional<String>) = language(language.getOrNull())

                    /**
                     * Sets [Builder.language] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.language] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun language(language: JsonField<String>) = apply { this.language = language }

                    /** Whether to use outlined table extraction */
                    fun outlinedTableExtraction(outlinedTableExtraction: Boolean?) =
                        outlinedTableExtraction(JsonField.ofNullable(outlinedTableExtraction))

                    /**
                     * Alias for [Builder.outlinedTableExtraction].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun outlinedTableExtraction(outlinedTableExtraction: Boolean) =
                        outlinedTableExtraction(outlinedTableExtraction as Boolean?)

                    /**
                     * Alias for calling [Builder.outlinedTableExtraction] with
                     * `outlinedTableExtraction.orElse(null)`.
                     */
                    fun outlinedTableExtraction(outlinedTableExtraction: Optional<Boolean>) =
                        outlinedTableExtraction(outlinedTableExtraction.getOrNull())

                    /**
                     * Sets [Builder.outlinedTableExtraction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outlinedTableExtraction] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun outlinedTableExtraction(outlinedTableExtraction: JsonField<Boolean>) =
                        apply {
                            this.outlinedTableExtraction = outlinedTableExtraction
                        }

                    /** Presentation-specific options for auto mode parsing configuration. */
                    fun presentation(presentation: Presentation?) =
                        presentation(JsonField.ofNullable(presentation))

                    /**
                     * Alias for calling [Builder.presentation] with `presentation.orElse(null)`.
                     */
                    fun presentation(presentation: Optional<Presentation>) =
                        presentation(presentation.getOrNull())

                    /**
                     * Sets [Builder.presentation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.presentation] with a well-typed
                     * [Presentation] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun presentation(presentation: JsonField<Presentation>) = apply {
                        this.presentation = presentation
                    }

                    /** Spatial text options for auto mode parsing configuration. */
                    fun spatialText(spatialText: SpatialText?) =
                        spatialText(JsonField.ofNullable(spatialText))

                    /** Alias for calling [Builder.spatialText] with `spatialText.orElse(null)`. */
                    fun spatialText(spatialText: Optional<SpatialText>) =
                        spatialText(spatialText.getOrNull())

                    /**
                     * Sets [Builder.spatialText] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.spatialText] with a well-typed [SpatialText]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun spatialText(spatialText: JsonField<SpatialText>) = apply {
                        this.spatialText = spatialText
                    }

                    /** Enable specialized chart parsing with the specified mode */
                    fun specializedChartParsing(specializedChartParsing: SpecializedChartParsing?) =
                        specializedChartParsing(JsonField.ofNullable(specializedChartParsing))

                    /**
                     * Alias for calling [Builder.specializedChartParsing] with
                     * `specializedChartParsing.orElse(null)`.
                     */
                    fun specializedChartParsing(
                        specializedChartParsing: Optional<SpecializedChartParsing>
                    ) = specializedChartParsing(specializedChartParsing.getOrNull())

                    /**
                     * Sets [Builder.specializedChartParsing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.specializedChartParsing] with a well-typed
                     * [SpecializedChartParsing] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun specializedChartParsing(
                        specializedChartParsing: JsonField<SpecializedChartParsing>
                    ) = apply { this.specializedChartParsing = specializedChartParsing }

                    /** Override the parsing tier for matched pages. Must be paired with version */
                    fun tier(tier: Tier?) = tier(JsonField.ofNullable(tier))

                    /** Alias for calling [Builder.tier] with `tier.orElse(null)`. */
                    fun tier(tier: Optional<Tier>) = tier(tier.getOrNull())

                    /**
                     * Sets [Builder.tier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tier] with a well-typed [Tier] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tier(tier: JsonField<Tier>) = apply { this.tier = tier }

                    /**
                     * Version for the override tier. Required when `tier` is set. Use `latest`, or
                     * pin one of that tier's dated versions.
                     *
                     * Current `latest` by tier:
                     * - `fast`: `2025-12-11`
                     * - `cost_effective`: `2026-06-18`
                     * - `agentic`: `2026-06-18`
                     * - `agentic_plus`: `2026-06-18`
                     *
                     * Full list: `GET /api/v2/parse/versions`.
                     */
                    fun version(version: Version?) = version(JsonField.ofNullable(version))

                    /** Alias for calling [Builder.version] with `version.orElse(null)`. */
                    fun version(version: Optional<Version>) = version(version.getOrNull())

                    /**
                     * Sets [Builder.version] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.version] with a well-typed [Version] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun version(version: JsonField<Version>) = apply { this.version = version }

                    /**
                     * Sets [version] to an arbitrary [String].
                     *
                     * You should usually call [version] with a well-typed [Version] constant
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun version(value: String) = version(Version.of(value))

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ParsingConf].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ParsingConf =
                        ParsingConf(
                            adaptiveLongTable,
                            aggressiveTableExtraction,
                            cropBox,
                            customPrompt,
                            extractLayout,
                            highResOcr,
                            ignore,
                            language,
                            outlinedTableExtraction,
                            presentation,
                            spatialText,
                            specializedChartParsing,
                            tier,
                            version,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ParsingConf = apply {
                    if (validated) {
                        return@apply
                    }

                    adaptiveLongTable()
                    aggressiveTableExtraction()
                    cropBox().ifPresent { it.validate() }
                    customPrompt()
                    extractLayout()
                    highResOcr()
                    ignore().ifPresent { it.validate() }
                    language()
                    outlinedTableExtraction()
                    presentation().ifPresent { it.validate() }
                    spatialText().ifPresent { it.validate() }
                    specializedChartParsing().ifPresent { it.validate() }
                    tier().ifPresent { it.validate() }
                    version()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (adaptiveLongTable.asKnown().isPresent) 1 else 0) +
                        (if (aggressiveTableExtraction.asKnown().isPresent) 1 else 0) +
                        (cropBox.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (customPrompt.asKnown().isPresent) 1 else 0) +
                        (if (extractLayout.asKnown().isPresent) 1 else 0) +
                        (if (highResOcr.asKnown().isPresent) 1 else 0) +
                        (ignore.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (language.asKnown().isPresent) 1 else 0) +
                        (if (outlinedTableExtraction.asKnown().isPresent) 1 else 0) +
                        (presentation.asKnown().getOrNull()?.validity() ?: 0) +
                        (spatialText.asKnown().getOrNull()?.validity() ?: 0) +
                        (specializedChartParsing.asKnown().getOrNull()?.validity() ?: 0) +
                        (tier.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (version.asKnown().isPresent) 1 else 0)

                /** Crop box options for auto mode parsing configuration. */
                class CropBox
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bottom: JsonField<Double>,
                    private val left: JsonField<Double>,
                    private val right: JsonField<Double>,
                    private val top: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bottom")
                        @ExcludeMissing
                        bottom: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("left")
                        @ExcludeMissing
                        left: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("right")
                        @ExcludeMissing
                        right: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("top")
                        @ExcludeMissing
                        top: JsonField<Double> = JsonMissing.of(),
                    ) : this(bottom, left, right, top, mutableMapOf())

                    /**
                     * Bottom boundary of crop box as ratio (0-1)
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun bottom(): Optional<Double> = bottom.getOptional("bottom")

                    /**
                     * Left boundary of crop box as ratio (0-1)
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun left(): Optional<Double> = left.getOptional("left")

                    /**
                     * Right boundary of crop box as ratio (0-1)
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun right(): Optional<Double> = right.getOptional("right")

                    /**
                     * Top boundary of crop box as ratio (0-1)
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun top(): Optional<Double> = top.getOptional("top")

                    /**
                     * Returns the raw JSON value of [bottom].
                     *
                     * Unlike [bottom], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bottom")
                    @ExcludeMissing
                    fun _bottom(): JsonField<Double> = bottom

                    /**
                     * Returns the raw JSON value of [left].
                     *
                     * Unlike [left], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("left") @ExcludeMissing fun _left(): JsonField<Double> = left

                    /**
                     * Returns the raw JSON value of [right].
                     *
                     * Unlike [right], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("right") @ExcludeMissing fun _right(): JsonField<Double> = right

                    /**
                     * Returns the raw JSON value of [top].
                     *
                     * Unlike [top], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("top") @ExcludeMissing fun _top(): JsonField<Double> = top

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [CropBox]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CropBox]. */
                    class Builder internal constructor() {

                        private var bottom: JsonField<Double> = JsonMissing.of()
                        private var left: JsonField<Double> = JsonMissing.of()
                        private var right: JsonField<Double> = JsonMissing.of()
                        private var top: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(cropBox: CropBox) = apply {
                            bottom = cropBox.bottom
                            left = cropBox.left
                            right = cropBox.right
                            top = cropBox.top
                            additionalProperties = cropBox.additionalProperties.toMutableMap()
                        }

                        /** Bottom boundary of crop box as ratio (0-1) */
                        fun bottom(bottom: Double?) = bottom(JsonField.ofNullable(bottom))

                        /**
                         * Alias for [Builder.bottom].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun bottom(bottom: Double) = bottom(bottom as Double?)

                        /** Alias for calling [Builder.bottom] with `bottom.orElse(null)`. */
                        fun bottom(bottom: Optional<Double>) = bottom(bottom.getOrNull())

                        /**
                         * Sets [Builder.bottom] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bottom] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bottom(bottom: JsonField<Double>) = apply { this.bottom = bottom }

                        /** Left boundary of crop box as ratio (0-1) */
                        fun left(left: Double?) = left(JsonField.ofNullable(left))

                        /**
                         * Alias for [Builder.left].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun left(left: Double) = left(left as Double?)

                        /** Alias for calling [Builder.left] with `left.orElse(null)`. */
                        fun left(left: Optional<Double>) = left(left.getOrNull())

                        /**
                         * Sets [Builder.left] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.left] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun left(left: JsonField<Double>) = apply { this.left = left }

                        /** Right boundary of crop box as ratio (0-1) */
                        fun right(right: Double?) = right(JsonField.ofNullable(right))

                        /**
                         * Alias for [Builder.right].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun right(right: Double) = right(right as Double?)

                        /** Alias for calling [Builder.right] with `right.orElse(null)`. */
                        fun right(right: Optional<Double>) = right(right.getOrNull())

                        /**
                         * Sets [Builder.right] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.right] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun right(right: JsonField<Double>) = apply { this.right = right }

                        /** Top boundary of crop box as ratio (0-1) */
                        fun top(top: Double?) = top(JsonField.ofNullable(top))

                        /**
                         * Alias for [Builder.top].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun top(top: Double) = top(top as Double?)

                        /** Alias for calling [Builder.top] with `top.orElse(null)`. */
                        fun top(top: Optional<Double>) = top(top.getOrNull())

                        /**
                         * Sets [Builder.top] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.top] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun top(top: JsonField<Double>) = apply { this.top = top }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CropBox].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): CropBox =
                            CropBox(bottom, left, right, top, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CropBox = apply {
                        if (validated) {
                            return@apply
                        }

                        bottom()
                        left()
                        right()
                        top()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaCloudInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (bottom.asKnown().isPresent) 1 else 0) +
                            (if (left.asKnown().isPresent) 1 else 0) +
                            (if (right.asKnown().isPresent) 1 else 0) +
                            (if (top.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CropBox &&
                            bottom == other.bottom &&
                            left == other.left &&
                            right == other.right &&
                            top == other.top &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(bottom, left, right, top, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CropBox{bottom=$bottom, left=$left, right=$right, top=$top, additionalProperties=$additionalProperties}"
                }

                /** Ignore options for auto mode parsing configuration. */
                class Ignore
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val ignoreDiagonalText: JsonField<Boolean>,
                    private val ignoreHiddenText: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("ignore_diagonal_text")
                        @ExcludeMissing
                        ignoreDiagonalText: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("ignore_hidden_text")
                        @ExcludeMissing
                        ignoreHiddenText: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(ignoreDiagonalText, ignoreHiddenText, mutableMapOf())

                    /**
                     * Whether to ignore diagonal text in the document
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun ignoreDiagonalText(): Optional<Boolean> =
                        ignoreDiagonalText.getOptional("ignore_diagonal_text")

                    /**
                     * Whether to ignore hidden text in the document
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun ignoreHiddenText(): Optional<Boolean> =
                        ignoreHiddenText.getOptional("ignore_hidden_text")

                    /**
                     * Returns the raw JSON value of [ignoreDiagonalText].
                     *
                     * Unlike [ignoreDiagonalText], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("ignore_diagonal_text")
                    @ExcludeMissing
                    fun _ignoreDiagonalText(): JsonField<Boolean> = ignoreDiagonalText

                    /**
                     * Returns the raw JSON value of [ignoreHiddenText].
                     *
                     * Unlike [ignoreHiddenText], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("ignore_hidden_text")
                    @ExcludeMissing
                    fun _ignoreHiddenText(): JsonField<Boolean> = ignoreHiddenText

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Ignore]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Ignore]. */
                    class Builder internal constructor() {

                        private var ignoreDiagonalText: JsonField<Boolean> = JsonMissing.of()
                        private var ignoreHiddenText: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ignore: Ignore) = apply {
                            ignoreDiagonalText = ignore.ignoreDiagonalText
                            ignoreHiddenText = ignore.ignoreHiddenText
                            additionalProperties = ignore.additionalProperties.toMutableMap()
                        }

                        /** Whether to ignore diagonal text in the document */
                        fun ignoreDiagonalText(ignoreDiagonalText: Boolean?) =
                            ignoreDiagonalText(JsonField.ofNullable(ignoreDiagonalText))

                        /**
                         * Alias for [Builder.ignoreDiagonalText].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun ignoreDiagonalText(ignoreDiagonalText: Boolean) =
                            ignoreDiagonalText(ignoreDiagonalText as Boolean?)

                        /**
                         * Alias for calling [Builder.ignoreDiagonalText] with
                         * `ignoreDiagonalText.orElse(null)`.
                         */
                        fun ignoreDiagonalText(ignoreDiagonalText: Optional<Boolean>) =
                            ignoreDiagonalText(ignoreDiagonalText.getOrNull())

                        /**
                         * Sets [Builder.ignoreDiagonalText] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.ignoreDiagonalText] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun ignoreDiagonalText(ignoreDiagonalText: JsonField<Boolean>) = apply {
                            this.ignoreDiagonalText = ignoreDiagonalText
                        }

                        /** Whether to ignore hidden text in the document */
                        fun ignoreHiddenText(ignoreHiddenText: Boolean?) =
                            ignoreHiddenText(JsonField.ofNullable(ignoreHiddenText))

                        /**
                         * Alias for [Builder.ignoreHiddenText].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun ignoreHiddenText(ignoreHiddenText: Boolean) =
                            ignoreHiddenText(ignoreHiddenText as Boolean?)

                        /**
                         * Alias for calling [Builder.ignoreHiddenText] with
                         * `ignoreHiddenText.orElse(null)`.
                         */
                        fun ignoreHiddenText(ignoreHiddenText: Optional<Boolean>) =
                            ignoreHiddenText(ignoreHiddenText.getOrNull())

                        /**
                         * Sets [Builder.ignoreHiddenText] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.ignoreHiddenText] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun ignoreHiddenText(ignoreHiddenText: JsonField<Boolean>) = apply {
                            this.ignoreHiddenText = ignoreHiddenText
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Ignore].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Ignore =
                            Ignore(
                                ignoreDiagonalText,
                                ignoreHiddenText,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Ignore = apply {
                        if (validated) {
                            return@apply
                        }

                        ignoreDiagonalText()
                        ignoreHiddenText()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaCloudInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (ignoreDiagonalText.asKnown().isPresent) 1 else 0) +
                            (if (ignoreHiddenText.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Ignore &&
                            ignoreDiagonalText == other.ignoreDiagonalText &&
                            ignoreHiddenText == other.ignoreHiddenText &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(ignoreDiagonalText, ignoreHiddenText, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Ignore{ignoreDiagonalText=$ignoreDiagonalText, ignoreHiddenText=$ignoreHiddenText, additionalProperties=$additionalProperties}"
                }

                /** Presentation-specific options for auto mode parsing configuration. */
                class Presentation
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val outOfBoundsContent: JsonField<Boolean>,
                    private val skipEmbeddedData: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("out_of_bounds_content")
                        @ExcludeMissing
                        outOfBoundsContent: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("skip_embedded_data")
                        @ExcludeMissing
                        skipEmbeddedData: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(outOfBoundsContent, skipEmbeddedData, mutableMapOf())

                    /**
                     * Extract out of bounds content in presentation slides
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun outOfBoundsContent(): Optional<Boolean> =
                        outOfBoundsContent.getOptional("out_of_bounds_content")

                    /**
                     * Skip extraction of embedded data for charts in presentation slides
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun skipEmbeddedData(): Optional<Boolean> =
                        skipEmbeddedData.getOptional("skip_embedded_data")

                    /**
                     * Returns the raw JSON value of [outOfBoundsContent].
                     *
                     * Unlike [outOfBoundsContent], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("out_of_bounds_content")
                    @ExcludeMissing
                    fun _outOfBoundsContent(): JsonField<Boolean> = outOfBoundsContent

                    /**
                     * Returns the raw JSON value of [skipEmbeddedData].
                     *
                     * Unlike [skipEmbeddedData], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("skip_embedded_data")
                    @ExcludeMissing
                    fun _skipEmbeddedData(): JsonField<Boolean> = skipEmbeddedData

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Presentation].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Presentation]. */
                    class Builder internal constructor() {

                        private var outOfBoundsContent: JsonField<Boolean> = JsonMissing.of()
                        private var skipEmbeddedData: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(presentation: Presentation) = apply {
                            outOfBoundsContent = presentation.outOfBoundsContent
                            skipEmbeddedData = presentation.skipEmbeddedData
                            additionalProperties = presentation.additionalProperties.toMutableMap()
                        }

                        /** Extract out of bounds content in presentation slides */
                        fun outOfBoundsContent(outOfBoundsContent: Boolean?) =
                            outOfBoundsContent(JsonField.ofNullable(outOfBoundsContent))

                        /**
                         * Alias for [Builder.outOfBoundsContent].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun outOfBoundsContent(outOfBoundsContent: Boolean) =
                            outOfBoundsContent(outOfBoundsContent as Boolean?)

                        /**
                         * Alias for calling [Builder.outOfBoundsContent] with
                         * `outOfBoundsContent.orElse(null)`.
                         */
                        fun outOfBoundsContent(outOfBoundsContent: Optional<Boolean>) =
                            outOfBoundsContent(outOfBoundsContent.getOrNull())

                        /**
                         * Sets [Builder.outOfBoundsContent] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.outOfBoundsContent] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun outOfBoundsContent(outOfBoundsContent: JsonField<Boolean>) = apply {
                            this.outOfBoundsContent = outOfBoundsContent
                        }

                        /** Skip extraction of embedded data for charts in presentation slides */
                        fun skipEmbeddedData(skipEmbeddedData: Boolean?) =
                            skipEmbeddedData(JsonField.ofNullable(skipEmbeddedData))

                        /**
                         * Alias for [Builder.skipEmbeddedData].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun skipEmbeddedData(skipEmbeddedData: Boolean) =
                            skipEmbeddedData(skipEmbeddedData as Boolean?)

                        /**
                         * Alias for calling [Builder.skipEmbeddedData] with
                         * `skipEmbeddedData.orElse(null)`.
                         */
                        fun skipEmbeddedData(skipEmbeddedData: Optional<Boolean>) =
                            skipEmbeddedData(skipEmbeddedData.getOrNull())

                        /**
                         * Sets [Builder.skipEmbeddedData] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.skipEmbeddedData] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun skipEmbeddedData(skipEmbeddedData: JsonField<Boolean>) = apply {
                            this.skipEmbeddedData = skipEmbeddedData
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Presentation].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Presentation =
                            Presentation(
                                outOfBoundsContent,
                                skipEmbeddedData,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Presentation = apply {
                        if (validated) {
                            return@apply
                        }

                        outOfBoundsContent()
                        skipEmbeddedData()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaCloudInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (outOfBoundsContent.asKnown().isPresent) 1 else 0) +
                            (if (skipEmbeddedData.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Presentation &&
                            outOfBoundsContent == other.outOfBoundsContent &&
                            skipEmbeddedData == other.skipEmbeddedData &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(outOfBoundsContent, skipEmbeddedData, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Presentation{outOfBoundsContent=$outOfBoundsContent, skipEmbeddedData=$skipEmbeddedData, additionalProperties=$additionalProperties}"
                }

                /** Spatial text options for auto mode parsing configuration. */
                class SpatialText
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val doNotUnrollColumns: JsonField<Boolean>,
                    private val preserveLayoutAlignmentAcrossPages: JsonField<Boolean>,
                    private val preserveVerySmallText: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("do_not_unroll_columns")
                        @ExcludeMissing
                        doNotUnrollColumns: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("preserve_layout_alignment_across_pages")
                        @ExcludeMissing
                        preserveLayoutAlignmentAcrossPages: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("preserve_very_small_text")
                        @ExcludeMissing
                        preserveVerySmallText: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(
                        doNotUnrollColumns,
                        preserveLayoutAlignmentAcrossPages,
                        preserveVerySmallText,
                        mutableMapOf(),
                    )

                    /**
                     * Keep column structure intact without unrolling
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun doNotUnrollColumns(): Optional<Boolean> =
                        doNotUnrollColumns.getOptional("do_not_unroll_columns")

                    /**
                     * Preserve text alignment across page boundaries
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun preserveLayoutAlignmentAcrossPages(): Optional<Boolean> =
                        preserveLayoutAlignmentAcrossPages.getOptional(
                            "preserve_layout_alignment_across_pages"
                        )

                    /**
                     * Include very small text in spatial output
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun preserveVerySmallText(): Optional<Boolean> =
                        preserveVerySmallText.getOptional("preserve_very_small_text")

                    /**
                     * Returns the raw JSON value of [doNotUnrollColumns].
                     *
                     * Unlike [doNotUnrollColumns], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("do_not_unroll_columns")
                    @ExcludeMissing
                    fun _doNotUnrollColumns(): JsonField<Boolean> = doNotUnrollColumns

                    /**
                     * Returns the raw JSON value of [preserveLayoutAlignmentAcrossPages].
                     *
                     * Unlike [preserveLayoutAlignmentAcrossPages], this method doesn't throw if the
                     * JSON field has an unexpected type.
                     */
                    @JsonProperty("preserve_layout_alignment_across_pages")
                    @ExcludeMissing
                    fun _preserveLayoutAlignmentAcrossPages(): JsonField<Boolean> =
                        preserveLayoutAlignmentAcrossPages

                    /**
                     * Returns the raw JSON value of [preserveVerySmallText].
                     *
                     * Unlike [preserveVerySmallText], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("preserve_very_small_text")
                    @ExcludeMissing
                    fun _preserveVerySmallText(): JsonField<Boolean> = preserveVerySmallText

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [SpatialText].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SpatialText]. */
                    class Builder internal constructor() {

                        private var doNotUnrollColumns: JsonField<Boolean> = JsonMissing.of()
                        private var preserveLayoutAlignmentAcrossPages: JsonField<Boolean> =
                            JsonMissing.of()
                        private var preserveVerySmallText: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(spatialText: SpatialText) = apply {
                            doNotUnrollColumns = spatialText.doNotUnrollColumns
                            preserveLayoutAlignmentAcrossPages =
                                spatialText.preserveLayoutAlignmentAcrossPages
                            preserveVerySmallText = spatialText.preserveVerySmallText
                            additionalProperties = spatialText.additionalProperties.toMutableMap()
                        }

                        /** Keep column structure intact without unrolling */
                        fun doNotUnrollColumns(doNotUnrollColumns: Boolean?) =
                            doNotUnrollColumns(JsonField.ofNullable(doNotUnrollColumns))

                        /**
                         * Alias for [Builder.doNotUnrollColumns].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun doNotUnrollColumns(doNotUnrollColumns: Boolean) =
                            doNotUnrollColumns(doNotUnrollColumns as Boolean?)

                        /**
                         * Alias for calling [Builder.doNotUnrollColumns] with
                         * `doNotUnrollColumns.orElse(null)`.
                         */
                        fun doNotUnrollColumns(doNotUnrollColumns: Optional<Boolean>) =
                            doNotUnrollColumns(doNotUnrollColumns.getOrNull())

                        /**
                         * Sets [Builder.doNotUnrollColumns] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.doNotUnrollColumns] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun doNotUnrollColumns(doNotUnrollColumns: JsonField<Boolean>) = apply {
                            this.doNotUnrollColumns = doNotUnrollColumns
                        }

                        /** Preserve text alignment across page boundaries */
                        fun preserveLayoutAlignmentAcrossPages(
                            preserveLayoutAlignmentAcrossPages: Boolean?
                        ) =
                            preserveLayoutAlignmentAcrossPages(
                                JsonField.ofNullable(preserveLayoutAlignmentAcrossPages)
                            )

                        /**
                         * Alias for [Builder.preserveLayoutAlignmentAcrossPages].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun preserveLayoutAlignmentAcrossPages(
                            preserveLayoutAlignmentAcrossPages: Boolean
                        ) =
                            preserveLayoutAlignmentAcrossPages(
                                preserveLayoutAlignmentAcrossPages as Boolean?
                            )

                        /**
                         * Alias for calling [Builder.preserveLayoutAlignmentAcrossPages] with
                         * `preserveLayoutAlignmentAcrossPages.orElse(null)`.
                         */
                        fun preserveLayoutAlignmentAcrossPages(
                            preserveLayoutAlignmentAcrossPages: Optional<Boolean>
                        ) =
                            preserveLayoutAlignmentAcrossPages(
                                preserveLayoutAlignmentAcrossPages.getOrNull()
                            )

                        /**
                         * Sets [Builder.preserveLayoutAlignmentAcrossPages] to an arbitrary JSON
                         * value.
                         *
                         * You should usually call [Builder.preserveLayoutAlignmentAcrossPages] with
                         * a well-typed [Boolean] value instead. This method is primarily for
                         * setting the field to an undocumented or not yet supported value.
                         */
                        fun preserveLayoutAlignmentAcrossPages(
                            preserveLayoutAlignmentAcrossPages: JsonField<Boolean>
                        ) = apply {
                            this.preserveLayoutAlignmentAcrossPages =
                                preserveLayoutAlignmentAcrossPages
                        }

                        /** Include very small text in spatial output */
                        fun preserveVerySmallText(preserveVerySmallText: Boolean?) =
                            preserveVerySmallText(JsonField.ofNullable(preserveVerySmallText))

                        /**
                         * Alias for [Builder.preserveVerySmallText].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun preserveVerySmallText(preserveVerySmallText: Boolean) =
                            preserveVerySmallText(preserveVerySmallText as Boolean?)

                        /**
                         * Alias for calling [Builder.preserveVerySmallText] with
                         * `preserveVerySmallText.orElse(null)`.
                         */
                        fun preserveVerySmallText(preserveVerySmallText: Optional<Boolean>) =
                            preserveVerySmallText(preserveVerySmallText.getOrNull())

                        /**
                         * Sets [Builder.preserveVerySmallText] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.preserveVerySmallText] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun preserveVerySmallText(preserveVerySmallText: JsonField<Boolean>) =
                            apply {
                                this.preserveVerySmallText = preserveVerySmallText
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SpatialText].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): SpatialText =
                            SpatialText(
                                doNotUnrollColumns,
                                preserveLayoutAlignmentAcrossPages,
                                preserveVerySmallText,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): SpatialText = apply {
                        if (validated) {
                            return@apply
                        }

                        doNotUnrollColumns()
                        preserveLayoutAlignmentAcrossPages()
                        preserveVerySmallText()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaCloudInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (doNotUnrollColumns.asKnown().isPresent) 1 else 0) +
                            (if (preserveLayoutAlignmentAcrossPages.asKnown().isPresent) 1 else 0) +
                            (if (preserveVerySmallText.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SpatialText &&
                            doNotUnrollColumns == other.doNotUnrollColumns &&
                            preserveLayoutAlignmentAcrossPages ==
                                other.preserveLayoutAlignmentAcrossPages &&
                            preserveVerySmallText == other.preserveVerySmallText &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            doNotUnrollColumns,
                            preserveLayoutAlignmentAcrossPages,
                            preserveVerySmallText,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SpatialText{doNotUnrollColumns=$doNotUnrollColumns, preserveLayoutAlignmentAcrossPages=$preserveLayoutAlignmentAcrossPages, preserveVerySmallText=$preserveVerySmallText, additionalProperties=$additionalProperties}"
                }

                /** Enable specialized chart parsing with the specified mode */
                class SpecializedChartParsing
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val AGENTIC_PLUS = of("agentic_plus")

                        @JvmField val AGENTIC = of("agentic")

                        @JvmField val EFFICIENT = of("efficient")

                        @JvmStatic
                        fun of(value: String) = SpecializedChartParsing(JsonField.of(value))
                    }

                    /** An enum containing [SpecializedChartParsing]'s known values. */
                    enum class Known {
                        AGENTIC_PLUS,
                        AGENTIC,
                        EFFICIENT,
                    }

                    /**
                     * An enum containing [SpecializedChartParsing]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [SpecializedChartParsing] can contain an unknown value in a
                     * couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AGENTIC_PLUS,
                        AGENTIC,
                        EFFICIENT,
                        /**
                         * An enum member indicating that [SpecializedChartParsing] was instantiated
                         * with an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            AGENTIC_PLUS -> Value.AGENTIC_PLUS
                            AGENTIC -> Value.AGENTIC
                            EFFICIENT -> Value.EFFICIENT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LlamaCloudInvalidDataException if this class instance's value is a
                     *   not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            AGENTIC_PLUS -> Known.AGENTIC_PLUS
                            AGENTIC -> Known.AGENTIC
                            EFFICIENT -> Known.EFFICIENT
                            else ->
                                throw LlamaCloudInvalidDataException(
                                    "Unknown SpecializedChartParsing: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LlamaCloudInvalidDataException if this class instance's value does
                     *   not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LlamaCloudInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): SpecializedChartParsing = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaCloudInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SpecializedChartParsing && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Override the parsing tier for matched pages. Must be paired with version */
                class Tier @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val FAST = of("fast")

                        @JvmField val COST_EFFECTIVE = of("cost_effective")

                        @JvmField val AGENTIC = of("agentic")

                        @JvmField val AGENTIC_PLUS = of("agentic_plus")

                        @JvmStatic fun of(value: String) = Tier(JsonField.of(value))
                    }

                    /** An enum containing [Tier]'s known values. */
                    enum class Known {
                        FAST,
                        COST_EFFECTIVE,
                        AGENTIC,
                        AGENTIC_PLUS,
                    }

                    /**
                     * An enum containing [Tier]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Tier] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        FAST,
                        COST_EFFECTIVE,
                        AGENTIC,
                        AGENTIC_PLUS,
                        /**
                         * An enum member indicating that [Tier] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            FAST -> Value.FAST
                            COST_EFFECTIVE -> Value.COST_EFFECTIVE
                            AGENTIC -> Value.AGENTIC
                            AGENTIC_PLUS -> Value.AGENTIC_PLUS
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LlamaCloudInvalidDataException if this class instance's value is a
                     *   not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            FAST -> Known.FAST
                            COST_EFFECTIVE -> Known.COST_EFFECTIVE
                            AGENTIC -> Known.AGENTIC
                            AGENTIC_PLUS -> Known.AGENTIC_PLUS
                            else -> throw LlamaCloudInvalidDataException("Unknown Tier: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LlamaCloudInvalidDataException if this class instance's value does
                     *   not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LlamaCloudInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Tier = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaCloudInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Tier && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Version for the override tier. Required when `tier` is set. Use `latest`, or pin
                 * one of that tier's dated versions.
                 *
                 * Current `latest` by tier:
                 * - `fast`: `2025-12-11`
                 * - `cost_effective`: `2026-06-18`
                 * - `agentic`: `2026-06-18`
                 * - `agentic_plus`: `2026-06-18`
                 *
                 * Full list: `GET /api/v2/parse/versions`.
                 */
                class Version
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val LATEST = of("latest")

                        @JvmField val _2026_06_18 = of("2026-06-18")

                        @JvmField val _2025_12_11 = of("2025-12-11")

                        @JvmStatic fun of(value: String) = Version(JsonField.of(value))
                    }

                    /** An enum containing [Version]'s known values. */
                    enum class Known {
                        LATEST,
                        _2026_06_18,
                        _2025_12_11,
                    }

                    /**
                     * An enum containing [Version]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Version] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        LATEST,
                        _2026_06_18,
                        _2025_12_11,
                        /**
                         * An enum member indicating that [Version] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            LATEST -> Value.LATEST
                            _2026_06_18 -> Value._2026_06_18
                            _2025_12_11 -> Value._2025_12_11
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LlamaCloudInvalidDataException if this class instance's value is a
                     *   not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            LATEST -> Known.LATEST
                            _2026_06_18 -> Known._2026_06_18
                            _2025_12_11 -> Known._2025_12_11
                            else -> throw LlamaCloudInvalidDataException("Unknown Version: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LlamaCloudInvalidDataException if this class instance's value does
                     *   not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LlamaCloudInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Version = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LlamaCloudInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Version && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ParsingConf &&
                        adaptiveLongTable == other.adaptiveLongTable &&
                        aggressiveTableExtraction == other.aggressiveTableExtraction &&
                        cropBox == other.cropBox &&
                        customPrompt == other.customPrompt &&
                        extractLayout == other.extractLayout &&
                        highResOcr == other.highResOcr &&
                        ignore == other.ignore &&
                        language == other.language &&
                        outlinedTableExtraction == other.outlinedTableExtraction &&
                        presentation == other.presentation &&
                        spatialText == other.spatialText &&
                        specializedChartParsing == other.specializedChartParsing &&
                        tier == other.tier &&
                        version == other.version &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        adaptiveLongTable,
                        aggressiveTableExtraction,
                        cropBox,
                        customPrompt,
                        extractLayout,
                        highResOcr,
                        ignore,
                        language,
                        outlinedTableExtraction,
                        presentation,
                        spatialText,
                        specializedChartParsing,
                        tier,
                        version,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ParsingConf{adaptiveLongTable=$adaptiveLongTable, aggressiveTableExtraction=$aggressiveTableExtraction, cropBox=$cropBox, customPrompt=$customPrompt, extractLayout=$extractLayout, highResOcr=$highResOcr, ignore=$ignore, language=$language, outlinedTableExtraction=$outlinedTableExtraction, presentation=$presentation, spatialText=$spatialText, specializedChartParsing=$specializedChartParsing, tier=$tier, version=$version, additionalProperties=$additionalProperties}"
            }

            /** Threshold for full page image detection (0.0-1.0, default 0.8) */
            @JsonDeserialize(using = FullPageImageInPageThreshold.Deserializer::class)
            @JsonSerialize(using = FullPageImageInPageThreshold.Serializer::class)
            class FullPageImageInPageThreshold
            private constructor(
                private val number: Double? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun number(): Optional<Double> = Optional.ofNullable(number)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isNumber(): Boolean = number != null

                fun isString(): Boolean = string != null

                fun asNumber(): Double = number.getOrThrow("number")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = fullPageImageInPageThreshold.accept(new FullPageImageInPageThreshold.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitNumber(Double number) {
                 *         return Optional.of(number.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        number != null -> visitor.visitNumber(number)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): FullPageImageInPageThreshold = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitNumber(number: Double) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitNumber(number: Double) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FullPageImageInPageThreshold &&
                        number == other.number &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(number, string)

                override fun toString(): String =
                    when {
                        number != null -> "FullPageImageInPageThreshold{number=$number}"
                        string != null -> "FullPageImageInPageThreshold{string=$string}"
                        _json != null -> "FullPageImageInPageThreshold{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid FullPageImageInPageThreshold")
                    }

                companion object {

                    @JvmStatic
                    fun ofNumber(number: Double) = FullPageImageInPageThreshold(number = number)

                    @JvmStatic
                    fun ofString(string: String) = FullPageImageInPageThreshold(string = string)
                }

                /**
                 * An interface that defines how to map each variant of
                 * [FullPageImageInPageThreshold] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitNumber(number: Double): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [FullPageImageInPageThreshold] to a value of type
                     * [T].
                     *
                     * An instance of [FullPageImageInPageThreshold] can contain an unknown variant
                     * if it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown FullPageImageInPageThreshold: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<FullPageImageInPageThreshold>(
                        FullPageImageInPageThreshold::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): FullPageImageInPageThreshold {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        FullPageImageInPageThreshold(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                        FullPageImageInPageThreshold(number = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> FullPageImageInPageThreshold(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<FullPageImageInPageThreshold>(
                        FullPageImageInPageThreshold::class
                    ) {

                    override fun serialize(
                        value: FullPageImageInPageThreshold,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.number != null -> generator.writeObject(value.number)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException("Invalid FullPageImageInPageThreshold")
                        }
                    }
                }
            }

            /** Confidence threshold for layout element detection */
            @JsonDeserialize(using = LayoutElementInPageConfidenceThreshold.Deserializer::class)
            @JsonSerialize(using = LayoutElementInPageConfidenceThreshold.Serializer::class)
            class LayoutElementInPageConfidenceThreshold
            private constructor(
                private val number: Double? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun number(): Optional<Double> = Optional.ofNullable(number)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isNumber(): Boolean = number != null

                fun isString(): Boolean = string != null

                fun asNumber(): Double = number.getOrThrow("number")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = layoutElementInPageConfidenceThreshold.accept(new LayoutElementInPageConfidenceThreshold.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitNumber(Double number) {
                 *         return Optional.of(number.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        number != null -> visitor.visitNumber(number)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): LayoutElementInPageConfidenceThreshold = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitNumber(number: Double) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitNumber(number: Double) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LayoutElementInPageConfidenceThreshold &&
                        number == other.number &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(number, string)

                override fun toString(): String =
                    when {
                        number != null -> "LayoutElementInPageConfidenceThreshold{number=$number}"
                        string != null -> "LayoutElementInPageConfidenceThreshold{string=$string}"
                        _json != null -> "LayoutElementInPageConfidenceThreshold{_unknown=$_json}"
                        else ->
                            throw IllegalStateException(
                                "Invalid LayoutElementInPageConfidenceThreshold"
                            )
                    }

                companion object {

                    @JvmStatic
                    fun ofNumber(number: Double) =
                        LayoutElementInPageConfidenceThreshold(number = number)

                    @JvmStatic
                    fun ofString(string: String) =
                        LayoutElementInPageConfidenceThreshold(string = string)
                }

                /**
                 * An interface that defines how to map each variant of
                 * [LayoutElementInPageConfidenceThreshold] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitNumber(number: Double): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [LayoutElementInPageConfidenceThreshold] to a
                     * value of type [T].
                     *
                     * An instance of [LayoutElementInPageConfidenceThreshold] can contain an
                     * unknown variant if it was deserialized from data that doesn't match any known
                     * variant. For example, if the SDK is on an older version than the API, then
                     * the API may respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown LayoutElementInPageConfidenceThreshold: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<LayoutElementInPageConfidenceThreshold>(
                        LayoutElementInPageConfidenceThreshold::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): LayoutElementInPageConfidenceThreshold {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        LayoutElementInPageConfidenceThreshold(
                                            string = it,
                                            _json = json,
                                        )
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                        LayoutElementInPageConfidenceThreshold(
                                            number = it,
                                            _json = json,
                                        )
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> LayoutElementInPageConfidenceThreshold(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<LayoutElementInPageConfidenceThreshold>(
                        LayoutElementInPageConfidenceThreshold::class
                    ) {

                    override fun serialize(
                        value: LayoutElementInPageConfidenceThreshold,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.number != null -> generator.writeObject(value.number)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException(
                                    "Invalid LayoutElementInPageConfidenceThreshold"
                                )
                        }
                    }
                }
            }

            /** Trigger if page has more than N charts */
            @JsonDeserialize(using = PageContainsAtLeastNCharts.Deserializer::class)
            @JsonSerialize(using = PageContainsAtLeastNCharts.Serializer::class)
            class PageContainsAtLeastNCharts
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtLeastNCharts.accept(new PageContainsAtLeastNCharts.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtLeastNCharts = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtLeastNCharts &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtLeastNCharts{integer=$integer}"
                        string != null -> "PageContainsAtLeastNCharts{string=$string}"
                        _json != null -> "PageContainsAtLeastNCharts{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtLeastNCharts")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtLeastNCharts(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtLeastNCharts(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtLeastNCharts]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtLeastNCharts] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtLeastNCharts] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtLeastNCharts: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtLeastNCharts>(
                        PageContainsAtLeastNCharts::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtLeastNCharts {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtLeastNCharts(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtLeastNCharts(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtLeastNCharts(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtLeastNCharts>(PageContainsAtLeastNCharts::class) {

                    override fun serialize(
                        value: PageContainsAtLeastNCharts,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException("Invalid PageContainsAtLeastNCharts")
                        }
                    }
                }
            }

            /** Trigger if page has more than N images */
            @JsonDeserialize(using = PageContainsAtLeastNImages.Deserializer::class)
            @JsonSerialize(using = PageContainsAtLeastNImages.Serializer::class)
            class PageContainsAtLeastNImages
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtLeastNImages.accept(new PageContainsAtLeastNImages.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtLeastNImages = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtLeastNImages &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtLeastNImages{integer=$integer}"
                        string != null -> "PageContainsAtLeastNImages{string=$string}"
                        _json != null -> "PageContainsAtLeastNImages{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtLeastNImages")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtLeastNImages(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtLeastNImages(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtLeastNImages]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtLeastNImages] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtLeastNImages] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtLeastNImages: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtLeastNImages>(
                        PageContainsAtLeastNImages::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtLeastNImages {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtLeastNImages(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtLeastNImages(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtLeastNImages(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtLeastNImages>(PageContainsAtLeastNImages::class) {

                    override fun serialize(
                        value: PageContainsAtLeastNImages,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException("Invalid PageContainsAtLeastNImages")
                        }
                    }
                }
            }

            /** Trigger if page has more than N layout elements */
            @JsonDeserialize(using = PageContainsAtLeastNLayoutElements.Deserializer::class)
            @JsonSerialize(using = PageContainsAtLeastNLayoutElements.Serializer::class)
            class PageContainsAtLeastNLayoutElements
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtLeastNLayoutElements.accept(new PageContainsAtLeastNLayoutElements.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtLeastNLayoutElements = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtLeastNLayoutElements &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtLeastNLayoutElements{integer=$integer}"
                        string != null -> "PageContainsAtLeastNLayoutElements{string=$string}"
                        _json != null -> "PageContainsAtLeastNLayoutElements{_unknown=$_json}"
                        else ->
                            throw IllegalStateException(
                                "Invalid PageContainsAtLeastNLayoutElements"
                            )
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) =
                        PageContainsAtLeastNLayoutElements(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) =
                        PageContainsAtLeastNLayoutElements(string = string)
                }

                /**
                 * An interface that defines how to map each variant of
                 * [PageContainsAtLeastNLayoutElements] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtLeastNLayoutElements] to a value of
                     * type [T].
                     *
                     * An instance of [PageContainsAtLeastNLayoutElements] can contain an unknown
                     * variant if it was deserialized from data that doesn't match any known
                     * variant. For example, if the SDK is on an older version than the API, then
                     * the API may respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtLeastNLayoutElements: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtLeastNLayoutElements>(
                        PageContainsAtLeastNLayoutElements::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtLeastNLayoutElements {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtLeastNLayoutElements(
                                            string = it,
                                            _json = json,
                                        )
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtLeastNLayoutElements(
                                            integer = it,
                                            _json = json,
                                        )
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtLeastNLayoutElements(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtLeastNLayoutElements>(
                        PageContainsAtLeastNLayoutElements::class
                    ) {

                    override fun serialize(
                        value: PageContainsAtLeastNLayoutElements,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException(
                                    "Invalid PageContainsAtLeastNLayoutElements"
                                )
                        }
                    }
                }
            }

            /** Trigger if page has more than N lines */
            @JsonDeserialize(using = PageContainsAtLeastNLines.Deserializer::class)
            @JsonSerialize(using = PageContainsAtLeastNLines.Serializer::class)
            class PageContainsAtLeastNLines
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtLeastNLines.accept(new PageContainsAtLeastNLines.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtLeastNLines = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtLeastNLines &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtLeastNLines{integer=$integer}"
                        string != null -> "PageContainsAtLeastNLines{string=$string}"
                        _json != null -> "PageContainsAtLeastNLines{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtLeastNLines")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtLeastNLines(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtLeastNLines(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtLeastNLines]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtLeastNLines] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtLeastNLines] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtLeastNLines: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtLeastNLines>(PageContainsAtLeastNLines::class) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtLeastNLines {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtLeastNLines(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtLeastNLines(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtLeastNLines(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtLeastNLines>(PageContainsAtLeastNLines::class) {

                    override fun serialize(
                        value: PageContainsAtLeastNLines,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageContainsAtLeastNLines")
                        }
                    }
                }
            }

            /** Trigger if page has more than N links */
            @JsonDeserialize(using = PageContainsAtLeastNLinks.Deserializer::class)
            @JsonSerialize(using = PageContainsAtLeastNLinks.Serializer::class)
            class PageContainsAtLeastNLinks
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtLeastNLinks.accept(new PageContainsAtLeastNLinks.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtLeastNLinks = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtLeastNLinks &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtLeastNLinks{integer=$integer}"
                        string != null -> "PageContainsAtLeastNLinks{string=$string}"
                        _json != null -> "PageContainsAtLeastNLinks{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtLeastNLinks")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtLeastNLinks(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtLeastNLinks(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtLeastNLinks]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtLeastNLinks] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtLeastNLinks] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtLeastNLinks: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtLeastNLinks>(PageContainsAtLeastNLinks::class) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtLeastNLinks {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtLeastNLinks(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtLeastNLinks(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtLeastNLinks(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtLeastNLinks>(PageContainsAtLeastNLinks::class) {

                    override fun serialize(
                        value: PageContainsAtLeastNLinks,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageContainsAtLeastNLinks")
                        }
                    }
                }
            }

            /** Trigger if page has more than N numeric words */
            @JsonDeserialize(using = PageContainsAtLeastNNumbers.Deserializer::class)
            @JsonSerialize(using = PageContainsAtLeastNNumbers.Serializer::class)
            class PageContainsAtLeastNNumbers
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtLeastNNumbers.accept(new PageContainsAtLeastNNumbers.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtLeastNNumbers = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtLeastNNumbers &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtLeastNNumbers{integer=$integer}"
                        string != null -> "PageContainsAtLeastNNumbers{string=$string}"
                        _json != null -> "PageContainsAtLeastNNumbers{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtLeastNNumbers")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtLeastNNumbers(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtLeastNNumbers(string = string)
                }

                /**
                 * An interface that defines how to map each variant of
                 * [PageContainsAtLeastNNumbers] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtLeastNNumbers] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtLeastNNumbers] can contain an unknown variant
                     * if it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtLeastNNumbers: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtLeastNNumbers>(
                        PageContainsAtLeastNNumbers::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtLeastNNumbers {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtLeastNNumbers(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtLeastNNumbers(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtLeastNNumbers(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtLeastNNumbers>(
                        PageContainsAtLeastNNumbers::class
                    ) {

                    override fun serialize(
                        value: PageContainsAtLeastNNumbers,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException("Invalid PageContainsAtLeastNNumbers")
                        }
                    }
                }
            }

            /** Trigger if page has more than N% numeric words */
            @JsonDeserialize(using = PageContainsAtLeastNPercentNumbers.Deserializer::class)
            @JsonSerialize(using = PageContainsAtLeastNPercentNumbers.Serializer::class)
            class PageContainsAtLeastNPercentNumbers
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtLeastNPercentNumbers.accept(new PageContainsAtLeastNPercentNumbers.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtLeastNPercentNumbers = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtLeastNPercentNumbers &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtLeastNPercentNumbers{integer=$integer}"
                        string != null -> "PageContainsAtLeastNPercentNumbers{string=$string}"
                        _json != null -> "PageContainsAtLeastNPercentNumbers{_unknown=$_json}"
                        else ->
                            throw IllegalStateException(
                                "Invalid PageContainsAtLeastNPercentNumbers"
                            )
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) =
                        PageContainsAtLeastNPercentNumbers(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) =
                        PageContainsAtLeastNPercentNumbers(string = string)
                }

                /**
                 * An interface that defines how to map each variant of
                 * [PageContainsAtLeastNPercentNumbers] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtLeastNPercentNumbers] to a value of
                     * type [T].
                     *
                     * An instance of [PageContainsAtLeastNPercentNumbers] can contain an unknown
                     * variant if it was deserialized from data that doesn't match any known
                     * variant. For example, if the SDK is on an older version than the API, then
                     * the API may respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtLeastNPercentNumbers: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtLeastNPercentNumbers>(
                        PageContainsAtLeastNPercentNumbers::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtLeastNPercentNumbers {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtLeastNPercentNumbers(
                                            string = it,
                                            _json = json,
                                        )
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtLeastNPercentNumbers(
                                            integer = it,
                                            _json = json,
                                        )
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtLeastNPercentNumbers(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtLeastNPercentNumbers>(
                        PageContainsAtLeastNPercentNumbers::class
                    ) {

                    override fun serialize(
                        value: PageContainsAtLeastNPercentNumbers,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException(
                                    "Invalid PageContainsAtLeastNPercentNumbers"
                                )
                        }
                    }
                }
            }

            /** Trigger if page has more than N tables */
            @JsonDeserialize(using = PageContainsAtLeastNTables.Deserializer::class)
            @JsonSerialize(using = PageContainsAtLeastNTables.Serializer::class)
            class PageContainsAtLeastNTables
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtLeastNTables.accept(new PageContainsAtLeastNTables.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtLeastNTables = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtLeastNTables &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtLeastNTables{integer=$integer}"
                        string != null -> "PageContainsAtLeastNTables{string=$string}"
                        _json != null -> "PageContainsAtLeastNTables{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtLeastNTables")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtLeastNTables(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtLeastNTables(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtLeastNTables]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtLeastNTables] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtLeastNTables] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtLeastNTables: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtLeastNTables>(
                        PageContainsAtLeastNTables::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtLeastNTables {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtLeastNTables(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtLeastNTables(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtLeastNTables(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtLeastNTables>(PageContainsAtLeastNTables::class) {

                    override fun serialize(
                        value: PageContainsAtLeastNTables,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException("Invalid PageContainsAtLeastNTables")
                        }
                    }
                }
            }

            /** Trigger if page has more than N words */
            @JsonDeserialize(using = PageContainsAtLeastNWords.Deserializer::class)
            @JsonSerialize(using = PageContainsAtLeastNWords.Serializer::class)
            class PageContainsAtLeastNWords
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtLeastNWords.accept(new PageContainsAtLeastNWords.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtLeastNWords = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtLeastNWords &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtLeastNWords{integer=$integer}"
                        string != null -> "PageContainsAtLeastNWords{string=$string}"
                        _json != null -> "PageContainsAtLeastNWords{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtLeastNWords")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtLeastNWords(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtLeastNWords(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtLeastNWords]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtLeastNWords] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtLeastNWords] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtLeastNWords: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtLeastNWords>(PageContainsAtLeastNWords::class) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtLeastNWords {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtLeastNWords(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtLeastNWords(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtLeastNWords(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtLeastNWords>(PageContainsAtLeastNWords::class) {

                    override fun serialize(
                        value: PageContainsAtLeastNWords,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageContainsAtLeastNWords")
                        }
                    }
                }
            }

            /** Trigger if page has fewer than N charts */
            @JsonDeserialize(using = PageContainsAtMostNCharts.Deserializer::class)
            @JsonSerialize(using = PageContainsAtMostNCharts.Serializer::class)
            class PageContainsAtMostNCharts
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtMostNCharts.accept(new PageContainsAtMostNCharts.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtMostNCharts = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtMostNCharts &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtMostNCharts{integer=$integer}"
                        string != null -> "PageContainsAtMostNCharts{string=$string}"
                        _json != null -> "PageContainsAtMostNCharts{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtMostNCharts")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtMostNCharts(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtMostNCharts(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtMostNCharts]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtMostNCharts] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtMostNCharts] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtMostNCharts: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtMostNCharts>(PageContainsAtMostNCharts::class) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtMostNCharts {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtMostNCharts(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtMostNCharts(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtMostNCharts(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtMostNCharts>(PageContainsAtMostNCharts::class) {

                    override fun serialize(
                        value: PageContainsAtMostNCharts,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageContainsAtMostNCharts")
                        }
                    }
                }
            }

            /** Trigger if page has fewer than N images */
            @JsonDeserialize(using = PageContainsAtMostNImages.Deserializer::class)
            @JsonSerialize(using = PageContainsAtMostNImages.Serializer::class)
            class PageContainsAtMostNImages
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtMostNImages.accept(new PageContainsAtMostNImages.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtMostNImages = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtMostNImages &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtMostNImages{integer=$integer}"
                        string != null -> "PageContainsAtMostNImages{string=$string}"
                        _json != null -> "PageContainsAtMostNImages{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtMostNImages")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtMostNImages(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtMostNImages(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtMostNImages]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtMostNImages] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtMostNImages] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtMostNImages: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtMostNImages>(PageContainsAtMostNImages::class) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtMostNImages {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtMostNImages(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtMostNImages(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtMostNImages(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtMostNImages>(PageContainsAtMostNImages::class) {

                    override fun serialize(
                        value: PageContainsAtMostNImages,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageContainsAtMostNImages")
                        }
                    }
                }
            }

            /** Trigger if page has fewer than N layout elements */
            @JsonDeserialize(using = PageContainsAtMostNLayoutElements.Deserializer::class)
            @JsonSerialize(using = PageContainsAtMostNLayoutElements.Serializer::class)
            class PageContainsAtMostNLayoutElements
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtMostNLayoutElements.accept(new PageContainsAtMostNLayoutElements.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtMostNLayoutElements = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtMostNLayoutElements &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtMostNLayoutElements{integer=$integer}"
                        string != null -> "PageContainsAtMostNLayoutElements{string=$string}"
                        _json != null -> "PageContainsAtMostNLayoutElements{_unknown=$_json}"
                        else ->
                            throw IllegalStateException("Invalid PageContainsAtMostNLayoutElements")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) =
                        PageContainsAtMostNLayoutElements(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) =
                        PageContainsAtMostNLayoutElements(string = string)
                }

                /**
                 * An interface that defines how to map each variant of
                 * [PageContainsAtMostNLayoutElements] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtMostNLayoutElements] to a value of
                     * type [T].
                     *
                     * An instance of [PageContainsAtMostNLayoutElements] can contain an unknown
                     * variant if it was deserialized from data that doesn't match any known
                     * variant. For example, if the SDK is on an older version than the API, then
                     * the API may respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtMostNLayoutElements: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtMostNLayoutElements>(
                        PageContainsAtMostNLayoutElements::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtMostNLayoutElements {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtMostNLayoutElements(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtMostNLayoutElements(
                                            integer = it,
                                            _json = json,
                                        )
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtMostNLayoutElements(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtMostNLayoutElements>(
                        PageContainsAtMostNLayoutElements::class
                    ) {

                    override fun serialize(
                        value: PageContainsAtMostNLayoutElements,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException(
                                    "Invalid PageContainsAtMostNLayoutElements"
                                )
                        }
                    }
                }
            }

            /** Trigger if page has fewer than N lines */
            @JsonDeserialize(using = PageContainsAtMostNLines.Deserializer::class)
            @JsonSerialize(using = PageContainsAtMostNLines.Serializer::class)
            class PageContainsAtMostNLines
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtMostNLines.accept(new PageContainsAtMostNLines.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtMostNLines = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtMostNLines &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtMostNLines{integer=$integer}"
                        string != null -> "PageContainsAtMostNLines{string=$string}"
                        _json != null -> "PageContainsAtMostNLines{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtMostNLines")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtMostNLines(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtMostNLines(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtMostNLines]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtMostNLines] to a value of type [T].
                     *
                     * An instance of [PageContainsAtMostNLines] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtMostNLines: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtMostNLines>(PageContainsAtMostNLines::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): PageContainsAtMostNLines {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtMostNLines(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtMostNLines(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtMostNLines(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtMostNLines>(PageContainsAtMostNLines::class) {

                    override fun serialize(
                        value: PageContainsAtMostNLines,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageContainsAtMostNLines")
                        }
                    }
                }
            }

            /** Trigger if page has fewer than N links */
            @JsonDeserialize(using = PageContainsAtMostNLinks.Deserializer::class)
            @JsonSerialize(using = PageContainsAtMostNLinks.Serializer::class)
            class PageContainsAtMostNLinks
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtMostNLinks.accept(new PageContainsAtMostNLinks.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtMostNLinks = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtMostNLinks &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtMostNLinks{integer=$integer}"
                        string != null -> "PageContainsAtMostNLinks{string=$string}"
                        _json != null -> "PageContainsAtMostNLinks{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtMostNLinks")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtMostNLinks(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtMostNLinks(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtMostNLinks]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtMostNLinks] to a value of type [T].
                     *
                     * An instance of [PageContainsAtMostNLinks] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtMostNLinks: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtMostNLinks>(PageContainsAtMostNLinks::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): PageContainsAtMostNLinks {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtMostNLinks(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtMostNLinks(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtMostNLinks(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtMostNLinks>(PageContainsAtMostNLinks::class) {

                    override fun serialize(
                        value: PageContainsAtMostNLinks,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageContainsAtMostNLinks")
                        }
                    }
                }
            }

            /** Trigger if page has fewer than N numeric words */
            @JsonDeserialize(using = PageContainsAtMostNNumbers.Deserializer::class)
            @JsonSerialize(using = PageContainsAtMostNNumbers.Serializer::class)
            class PageContainsAtMostNNumbers
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtMostNNumbers.accept(new PageContainsAtMostNNumbers.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtMostNNumbers = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtMostNNumbers &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtMostNNumbers{integer=$integer}"
                        string != null -> "PageContainsAtMostNNumbers{string=$string}"
                        _json != null -> "PageContainsAtMostNNumbers{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtMostNNumbers")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtMostNNumbers(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtMostNNumbers(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtMostNNumbers]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtMostNNumbers] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtMostNNumbers] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtMostNNumbers: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtMostNNumbers>(
                        PageContainsAtMostNNumbers::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtMostNNumbers {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtMostNNumbers(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtMostNNumbers(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtMostNNumbers(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtMostNNumbers>(PageContainsAtMostNNumbers::class) {

                    override fun serialize(
                        value: PageContainsAtMostNNumbers,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException("Invalid PageContainsAtMostNNumbers")
                        }
                    }
                }
            }

            /** Trigger if page has fewer than N% numeric words */
            @JsonDeserialize(using = PageContainsAtMostNPercentNumbers.Deserializer::class)
            @JsonSerialize(using = PageContainsAtMostNPercentNumbers.Serializer::class)
            class PageContainsAtMostNPercentNumbers
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtMostNPercentNumbers.accept(new PageContainsAtMostNPercentNumbers.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtMostNPercentNumbers = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtMostNPercentNumbers &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtMostNPercentNumbers{integer=$integer}"
                        string != null -> "PageContainsAtMostNPercentNumbers{string=$string}"
                        _json != null -> "PageContainsAtMostNPercentNumbers{_unknown=$_json}"
                        else ->
                            throw IllegalStateException("Invalid PageContainsAtMostNPercentNumbers")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) =
                        PageContainsAtMostNPercentNumbers(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) =
                        PageContainsAtMostNPercentNumbers(string = string)
                }

                /**
                 * An interface that defines how to map each variant of
                 * [PageContainsAtMostNPercentNumbers] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtMostNPercentNumbers] to a value of
                     * type [T].
                     *
                     * An instance of [PageContainsAtMostNPercentNumbers] can contain an unknown
                     * variant if it was deserialized from data that doesn't match any known
                     * variant. For example, if the SDK is on an older version than the API, then
                     * the API may respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtMostNPercentNumbers: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtMostNPercentNumbers>(
                        PageContainsAtMostNPercentNumbers::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtMostNPercentNumbers {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtMostNPercentNumbers(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtMostNPercentNumbers(
                                            integer = it,
                                            _json = json,
                                        )
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtMostNPercentNumbers(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtMostNPercentNumbers>(
                        PageContainsAtMostNPercentNumbers::class
                    ) {

                    override fun serialize(
                        value: PageContainsAtMostNPercentNumbers,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException(
                                    "Invalid PageContainsAtMostNPercentNumbers"
                                )
                        }
                    }
                }
            }

            /** Trigger if page has fewer than N tables */
            @JsonDeserialize(using = PageContainsAtMostNTables.Deserializer::class)
            @JsonSerialize(using = PageContainsAtMostNTables.Serializer::class)
            class PageContainsAtMostNTables
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtMostNTables.accept(new PageContainsAtMostNTables.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtMostNTables = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtMostNTables &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtMostNTables{integer=$integer}"
                        string != null -> "PageContainsAtMostNTables{string=$string}"
                        _json != null -> "PageContainsAtMostNTables{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtMostNTables")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtMostNTables(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtMostNTables(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtMostNTables]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtMostNTables] to a value of type
                     * [T].
                     *
                     * An instance of [PageContainsAtMostNTables] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtMostNTables: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtMostNTables>(PageContainsAtMostNTables::class) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): PageContainsAtMostNTables {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtMostNTables(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtMostNTables(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtMostNTables(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtMostNTables>(PageContainsAtMostNTables::class) {

                    override fun serialize(
                        value: PageContainsAtMostNTables,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageContainsAtMostNTables")
                        }
                    }
                }
            }

            /** Trigger if page has fewer than N words */
            @JsonDeserialize(using = PageContainsAtMostNWords.Deserializer::class)
            @JsonSerialize(using = PageContainsAtMostNWords.Serializer::class)
            class PageContainsAtMostNWords
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageContainsAtMostNWords.accept(new PageContainsAtMostNWords.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageContainsAtMostNWords = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageContainsAtMostNWords &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageContainsAtMostNWords{integer=$integer}"
                        string != null -> "PageContainsAtMostNWords{string=$string}"
                        _json != null -> "PageContainsAtMostNWords{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageContainsAtMostNWords")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageContainsAtMostNWords(integer = integer)

                    @JvmStatic
                    fun ofString(string: String) = PageContainsAtMostNWords(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageContainsAtMostNWords]
                 * to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageContainsAtMostNWords] to a value of type [T].
                     *
                     * An instance of [PageContainsAtMostNWords] can contain an unknown variant if
                     * it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException(
                            "Unknown PageContainsAtMostNWords: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageContainsAtMostNWords>(PageContainsAtMostNWords::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): PageContainsAtMostNWords {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageContainsAtMostNWords(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageContainsAtMostNWords(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageContainsAtMostNWords(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageContainsAtMostNWords>(PageContainsAtMostNWords::class) {

                    override fun serialize(
                        value: PageContainsAtMostNWords,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageContainsAtMostNWords")
                        }
                    }
                }
            }

            /** Trigger if page has more than N characters */
            @JsonDeserialize(using = PageLongerThanNChars.Deserializer::class)
            @JsonSerialize(using = PageLongerThanNChars.Serializer::class)
            class PageLongerThanNChars
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageLongerThanNChars.accept(new PageLongerThanNChars.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageLongerThanNChars = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageLongerThanNChars &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageLongerThanNChars{integer=$integer}"
                        string != null -> "PageLongerThanNChars{string=$string}"
                        _json != null -> "PageLongerThanNChars{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageLongerThanNChars")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageLongerThanNChars(integer = integer)

                    @JvmStatic fun ofString(string: String) = PageLongerThanNChars(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageLongerThanNChars] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageLongerThanNChars] to a value of type [T].
                     *
                     * An instance of [PageLongerThanNChars] can contain an unknown variant if it
                     * was deserialized from data that doesn't match any known variant. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException("Unknown PageLongerThanNChars: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageLongerThanNChars>(PageLongerThanNChars::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): PageLongerThanNChars {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageLongerThanNChars(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageLongerThanNChars(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageLongerThanNChars(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageLongerThanNChars>(PageLongerThanNChars::class) {

                    override fun serialize(
                        value: PageLongerThanNChars,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageLongerThanNChars")
                        }
                    }
                }
            }

            /** Trigger if page has fewer than N characters */
            @JsonDeserialize(using = PageShorterThanNChars.Deserializer::class)
            @JsonSerialize(using = PageShorterThanNChars.Serializer::class)
            class PageShorterThanNChars
            private constructor(
                private val integer: Long? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun integer(): Optional<Long> = Optional.ofNullable(integer)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isInteger(): Boolean = integer != null

                fun isString(): Boolean = string != null

                fun asInteger(): Long = integer.getOrThrow("integer")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = pageShorterThanNChars.accept(new PageShorterThanNChars.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitInteger(Long integer) {
                 *         return Optional.of(integer.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        integer != null -> visitor.visitInteger(integer)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PageShorterThanNChars = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInteger(integer: Long) {}

                            override fun visitString(string: String) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaCloudInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInteger(integer: Long) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PageShorterThanNChars &&
                        integer == other.integer &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(integer, string)

                override fun toString(): String =
                    when {
                        integer != null -> "PageShorterThanNChars{integer=$integer}"
                        string != null -> "PageShorterThanNChars{string=$string}"
                        _json != null -> "PageShorterThanNChars{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid PageShorterThanNChars")
                    }

                companion object {

                    @JvmStatic
                    fun ofInteger(integer: Long) = PageShorterThanNChars(integer = integer)

                    @JvmStatic fun ofString(string: String) = PageShorterThanNChars(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [PageShorterThanNChars] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInteger(integer: Long): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [PageShorterThanNChars] to a value of type [T].
                     *
                     * An instance of [PageShorterThanNChars] can contain an unknown variant if it
                     * was deserialized from data that doesn't match any known variant. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException("Unknown PageShorterThanNChars: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<PageShorterThanNChars>(PageShorterThanNChars::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): PageShorterThanNChars {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        PageShorterThanNChars(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                        PageShorterThanNChars(integer = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> PageShorterThanNChars(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<PageShorterThanNChars>(PageShorterThanNChars::class) {

                    override fun serialize(
                        value: PageShorterThanNChars,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.integer != null -> generator.writeObject(value.integer)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid PageShorterThanNChars")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AutoModeConfiguration &&
                    parsingConf == other.parsingConf &&
                    filenameMatchGlob == other.filenameMatchGlob &&
                    filenameMatchGlobList == other.filenameMatchGlobList &&
                    filenameRegexp == other.filenameRegexp &&
                    filenameRegexpMode == other.filenameRegexpMode &&
                    fullPageImageInPage == other.fullPageImageInPage &&
                    fullPageImageInPageThreshold == other.fullPageImageInPageThreshold &&
                    imageInPage == other.imageInPage &&
                    layoutElementInPage == other.layoutElementInPage &&
                    layoutElementInPageConfidenceThreshold ==
                        other.layoutElementInPageConfidenceThreshold &&
                    pageContainsAtLeastNCharts == other.pageContainsAtLeastNCharts &&
                    pageContainsAtLeastNImages == other.pageContainsAtLeastNImages &&
                    pageContainsAtLeastNLayoutElements ==
                        other.pageContainsAtLeastNLayoutElements &&
                    pageContainsAtLeastNLines == other.pageContainsAtLeastNLines &&
                    pageContainsAtLeastNLinks == other.pageContainsAtLeastNLinks &&
                    pageContainsAtLeastNNumbers == other.pageContainsAtLeastNNumbers &&
                    pageContainsAtLeastNPercentNumbers ==
                        other.pageContainsAtLeastNPercentNumbers &&
                    pageContainsAtLeastNTables == other.pageContainsAtLeastNTables &&
                    pageContainsAtLeastNWords == other.pageContainsAtLeastNWords &&
                    pageContainsAtMostNCharts == other.pageContainsAtMostNCharts &&
                    pageContainsAtMostNImages == other.pageContainsAtMostNImages &&
                    pageContainsAtMostNLayoutElements == other.pageContainsAtMostNLayoutElements &&
                    pageContainsAtMostNLines == other.pageContainsAtMostNLines &&
                    pageContainsAtMostNLinks == other.pageContainsAtMostNLinks &&
                    pageContainsAtMostNNumbers == other.pageContainsAtMostNNumbers &&
                    pageContainsAtMostNPercentNumbers == other.pageContainsAtMostNPercentNumbers &&
                    pageContainsAtMostNTables == other.pageContainsAtMostNTables &&
                    pageContainsAtMostNWords == other.pageContainsAtMostNWords &&
                    pageLongerThanNChars == other.pageLongerThanNChars &&
                    pageMdError == other.pageMdError &&
                    pageShorterThanNChars == other.pageShorterThanNChars &&
                    regexpInPage == other.regexpInPage &&
                    regexpInPageMode == other.regexpInPageMode &&
                    tableInPage == other.tableInPage &&
                    textInPage == other.textInPage &&
                    triggerMode == other.triggerMode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    parsingConf,
                    filenameMatchGlob,
                    filenameMatchGlobList,
                    filenameRegexp,
                    filenameRegexpMode,
                    fullPageImageInPage,
                    fullPageImageInPageThreshold,
                    imageInPage,
                    layoutElementInPage,
                    layoutElementInPageConfidenceThreshold,
                    pageContainsAtLeastNCharts,
                    pageContainsAtLeastNImages,
                    pageContainsAtLeastNLayoutElements,
                    pageContainsAtLeastNLines,
                    pageContainsAtLeastNLinks,
                    pageContainsAtLeastNNumbers,
                    pageContainsAtLeastNPercentNumbers,
                    pageContainsAtLeastNTables,
                    pageContainsAtLeastNWords,
                    pageContainsAtMostNCharts,
                    pageContainsAtMostNImages,
                    pageContainsAtMostNLayoutElements,
                    pageContainsAtMostNLines,
                    pageContainsAtMostNLinks,
                    pageContainsAtMostNNumbers,
                    pageContainsAtMostNPercentNumbers,
                    pageContainsAtMostNTables,
                    pageContainsAtMostNWords,
                    pageLongerThanNChars,
                    pageMdError,
                    pageShorterThanNChars,
                    regexpInPage,
                    regexpInPageMode,
                    tableInPage,
                    textInPage,
                    triggerMode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AutoModeConfiguration{parsingConf=$parsingConf, filenameMatchGlob=$filenameMatchGlob, filenameMatchGlobList=$filenameMatchGlobList, filenameRegexp=$filenameRegexp, filenameRegexpMode=$filenameRegexpMode, fullPageImageInPage=$fullPageImageInPage, fullPageImageInPageThreshold=$fullPageImageInPageThreshold, imageInPage=$imageInPage, layoutElementInPage=$layoutElementInPage, layoutElementInPageConfidenceThreshold=$layoutElementInPageConfidenceThreshold, pageContainsAtLeastNCharts=$pageContainsAtLeastNCharts, pageContainsAtLeastNImages=$pageContainsAtLeastNImages, pageContainsAtLeastNLayoutElements=$pageContainsAtLeastNLayoutElements, pageContainsAtLeastNLines=$pageContainsAtLeastNLines, pageContainsAtLeastNLinks=$pageContainsAtLeastNLinks, pageContainsAtLeastNNumbers=$pageContainsAtLeastNNumbers, pageContainsAtLeastNPercentNumbers=$pageContainsAtLeastNPercentNumbers, pageContainsAtLeastNTables=$pageContainsAtLeastNTables, pageContainsAtLeastNWords=$pageContainsAtLeastNWords, pageContainsAtMostNCharts=$pageContainsAtMostNCharts, pageContainsAtMostNImages=$pageContainsAtMostNImages, pageContainsAtMostNLayoutElements=$pageContainsAtMostNLayoutElements, pageContainsAtMostNLines=$pageContainsAtMostNLines, pageContainsAtMostNLinks=$pageContainsAtMostNLinks, pageContainsAtMostNNumbers=$pageContainsAtMostNNumbers, pageContainsAtMostNPercentNumbers=$pageContainsAtMostNPercentNumbers, pageContainsAtMostNTables=$pageContainsAtMostNTables, pageContainsAtMostNWords=$pageContainsAtMostNWords, pageLongerThanNChars=$pageLongerThanNChars, pageMdError=$pageMdError, pageShorterThanNChars=$pageShorterThanNChars, regexpInPage=$regexpInPage, regexpInPageMode=$regexpInPageMode, tableInPage=$tableInPage, textInPage=$textInPage, triggerMode=$triggerMode, additionalProperties=$additionalProperties}"
        }

        /**
         * Cost optimizer configuration for reducing parsing costs on simpler pages.
         *
         * When enabled, the parser analyzes each page and routes simpler pages to faster, cheaper
         * processing while preserving quality for complex pages. Only works with 'agentic' or
         * 'agentic_plus' tiers.
         */
        class CostOptimizer
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val enable: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("enable")
                @ExcludeMissing
                enable: JsonField<Boolean> = JsonMissing.of()
            ) : this(enable, mutableMapOf())

            /**
             * Enable cost-optimized parsing. Routes simpler pages to faster processing while
             * complex pages use full AI analysis. May reduce speed on some documents. IMPORTANT:
             * Only available with 'agentic' or 'agentic_plus' tiers
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun enable(): Optional<Boolean> = enable.getOptional("enable")

            /**
             * Returns the raw JSON value of [enable].
             *
             * Unlike [enable], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("enable") @ExcludeMissing fun _enable(): JsonField<Boolean> = enable

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CostOptimizer]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CostOptimizer]. */
            class Builder internal constructor() {

                private var enable: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(costOptimizer: CostOptimizer) = apply {
                    enable = costOptimizer.enable
                    additionalProperties = costOptimizer.additionalProperties.toMutableMap()
                }

                /**
                 * Enable cost-optimized parsing. Routes simpler pages to faster processing while
                 * complex pages use full AI analysis. May reduce speed on some documents.
                 * IMPORTANT: Only available with 'agentic' or 'agentic_plus' tiers
                 */
                fun enable(enable: Boolean?) = enable(JsonField.ofNullable(enable))

                /**
                 * Alias for [Builder.enable].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun enable(enable: Boolean) = enable(enable as Boolean?)

                /** Alias for calling [Builder.enable] with `enable.orElse(null)`. */
                fun enable(enable: Optional<Boolean>) = enable(enable.getOrNull())

                /**
                 * Sets [Builder.enable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enable(enable: JsonField<Boolean>) = apply { this.enable = enable }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CostOptimizer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CostOptimizer =
                    CostOptimizer(enable, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CostOptimizer = apply {
                if (validated) {
                    return@apply
                }

                enable()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = (if (enable.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CostOptimizer &&
                    enable == other.enable &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(enable, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CostOptimizer{enable=$enable, additionalProperties=$additionalProperties}"
        }

        /** Options for ignoring specific text types (diagonal, hidden, text in images) */
        class Ignore
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val ignoreDiagonalText: JsonField<Boolean>,
            private val ignoreHiddenText: JsonField<Boolean>,
            private val ignoreTextInImage: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ignore_diagonal_text")
                @ExcludeMissing
                ignoreDiagonalText: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("ignore_hidden_text")
                @ExcludeMissing
                ignoreHiddenText: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("ignore_text_in_image")
                @ExcludeMissing
                ignoreTextInImage: JsonField<Boolean> = JsonMissing.of(),
            ) : this(ignoreDiagonalText, ignoreHiddenText, ignoreTextInImage, mutableMapOf())

            /**
             * Skip text rotated at an angle (not horizontal/vertical). Useful for ignoring
             * watermarks or decorative angled text
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun ignoreDiagonalText(): Optional<Boolean> =
                ignoreDiagonalText.getOptional("ignore_diagonal_text")

            /**
             * Skip text marked as hidden in the document structure. Some PDFs contain invisible
             * text layers used for accessibility or search indexing
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun ignoreHiddenText(): Optional<Boolean> =
                ignoreHiddenText.getOptional("ignore_hidden_text")

            /**
             * Skip OCR text extraction from embedded images. Use when images contain irrelevant
             * text (watermarks, logos) that shouldn't be in the output
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun ignoreTextInImage(): Optional<Boolean> =
                ignoreTextInImage.getOptional("ignore_text_in_image")

            /**
             * Returns the raw JSON value of [ignoreDiagonalText].
             *
             * Unlike [ignoreDiagonalText], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ignore_diagonal_text")
            @ExcludeMissing
            fun _ignoreDiagonalText(): JsonField<Boolean> = ignoreDiagonalText

            /**
             * Returns the raw JSON value of [ignoreHiddenText].
             *
             * Unlike [ignoreHiddenText], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ignore_hidden_text")
            @ExcludeMissing
            fun _ignoreHiddenText(): JsonField<Boolean> = ignoreHiddenText

            /**
             * Returns the raw JSON value of [ignoreTextInImage].
             *
             * Unlike [ignoreTextInImage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ignore_text_in_image")
            @ExcludeMissing
            fun _ignoreTextInImage(): JsonField<Boolean> = ignoreTextInImage

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Ignore]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Ignore]. */
            class Builder internal constructor() {

                private var ignoreDiagonalText: JsonField<Boolean> = JsonMissing.of()
                private var ignoreHiddenText: JsonField<Boolean> = JsonMissing.of()
                private var ignoreTextInImage: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ignore: Ignore) = apply {
                    ignoreDiagonalText = ignore.ignoreDiagonalText
                    ignoreHiddenText = ignore.ignoreHiddenText
                    ignoreTextInImage = ignore.ignoreTextInImage
                    additionalProperties = ignore.additionalProperties.toMutableMap()
                }

                /**
                 * Skip text rotated at an angle (not horizontal/vertical). Useful for ignoring
                 * watermarks or decorative angled text
                 */
                fun ignoreDiagonalText(ignoreDiagonalText: Boolean?) =
                    ignoreDiagonalText(JsonField.ofNullable(ignoreDiagonalText))

                /**
                 * Alias for [Builder.ignoreDiagonalText].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun ignoreDiagonalText(ignoreDiagonalText: Boolean) =
                    ignoreDiagonalText(ignoreDiagonalText as Boolean?)

                /**
                 * Alias for calling [Builder.ignoreDiagonalText] with
                 * `ignoreDiagonalText.orElse(null)`.
                 */
                fun ignoreDiagonalText(ignoreDiagonalText: Optional<Boolean>) =
                    ignoreDiagonalText(ignoreDiagonalText.getOrNull())

                /**
                 * Sets [Builder.ignoreDiagonalText] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ignoreDiagonalText] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ignoreDiagonalText(ignoreDiagonalText: JsonField<Boolean>) = apply {
                    this.ignoreDiagonalText = ignoreDiagonalText
                }

                /**
                 * Skip text marked as hidden in the document structure. Some PDFs contain invisible
                 * text layers used for accessibility or search indexing
                 */
                fun ignoreHiddenText(ignoreHiddenText: Boolean?) =
                    ignoreHiddenText(JsonField.ofNullable(ignoreHiddenText))

                /**
                 * Alias for [Builder.ignoreHiddenText].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun ignoreHiddenText(ignoreHiddenText: Boolean) =
                    ignoreHiddenText(ignoreHiddenText as Boolean?)

                /**
                 * Alias for calling [Builder.ignoreHiddenText] with
                 * `ignoreHiddenText.orElse(null)`.
                 */
                fun ignoreHiddenText(ignoreHiddenText: Optional<Boolean>) =
                    ignoreHiddenText(ignoreHiddenText.getOrNull())

                /**
                 * Sets [Builder.ignoreHiddenText] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ignoreHiddenText] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ignoreHiddenText(ignoreHiddenText: JsonField<Boolean>) = apply {
                    this.ignoreHiddenText = ignoreHiddenText
                }

                /**
                 * Skip OCR text extraction from embedded images. Use when images contain irrelevant
                 * text (watermarks, logos) that shouldn't be in the output
                 */
                fun ignoreTextInImage(ignoreTextInImage: Boolean?) =
                    ignoreTextInImage(JsonField.ofNullable(ignoreTextInImage))

                /**
                 * Alias for [Builder.ignoreTextInImage].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun ignoreTextInImage(ignoreTextInImage: Boolean) =
                    ignoreTextInImage(ignoreTextInImage as Boolean?)

                /**
                 * Alias for calling [Builder.ignoreTextInImage] with
                 * `ignoreTextInImage.orElse(null)`.
                 */
                fun ignoreTextInImage(ignoreTextInImage: Optional<Boolean>) =
                    ignoreTextInImage(ignoreTextInImage.getOrNull())

                /**
                 * Sets [Builder.ignoreTextInImage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ignoreTextInImage] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ignoreTextInImage(ignoreTextInImage: JsonField<Boolean>) = apply {
                    this.ignoreTextInImage = ignoreTextInImage
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Ignore].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Ignore =
                    Ignore(
                        ignoreDiagonalText,
                        ignoreHiddenText,
                        ignoreTextInImage,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Ignore = apply {
                if (validated) {
                    return@apply
                }

                ignoreDiagonalText()
                ignoreHiddenText()
                ignoreTextInImage()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (ignoreDiagonalText.asKnown().isPresent) 1 else 0) +
                    (if (ignoreHiddenText.asKnown().isPresent) 1 else 0) +
                    (if (ignoreTextInImage.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Ignore &&
                    ignoreDiagonalText == other.ignoreDiagonalText &&
                    ignoreHiddenText == other.ignoreHiddenText &&
                    ignoreTextInImage == other.ignoreTextInImage &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    ignoreDiagonalText,
                    ignoreHiddenText,
                    ignoreTextInImage,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Ignore{ignoreDiagonalText=$ignoreDiagonalText, ignoreHiddenText=$ignoreHiddenText, ignoreTextInImage=$ignoreTextInImage, additionalProperties=$additionalProperties}"
        }

        /** OCR configuration including language detection settings */
        class OcrParameters
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val languages: JsonField<List<ParsingLanguages>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("languages")
                @ExcludeMissing
                languages: JsonField<List<ParsingLanguages>> = JsonMissing.of()
            ) : this(languages, mutableMapOf())

            /**
             * Languages to use for OCR text recognition. Specify multiple languages if document
             * contains mixed-language content. Order matters - put primary language first. Example:
             * ['en', 'es'] for English with Spanish
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun languages(): Optional<List<ParsingLanguages>> = languages.getOptional("languages")

            /**
             * Returns the raw JSON value of [languages].
             *
             * Unlike [languages], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("languages")
            @ExcludeMissing
            fun _languages(): JsonField<List<ParsingLanguages>> = languages

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [OcrParameters]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OcrParameters]. */
            class Builder internal constructor() {

                private var languages: JsonField<MutableList<ParsingLanguages>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ocrParameters: OcrParameters) = apply {
                    languages = ocrParameters.languages.map { it.toMutableList() }
                    additionalProperties = ocrParameters.additionalProperties.toMutableMap()
                }

                /**
                 * Languages to use for OCR text recognition. Specify multiple languages if document
                 * contains mixed-language content. Order matters - put primary language first.
                 * Example: ['en', 'es'] for English with Spanish
                 */
                fun languages(languages: List<ParsingLanguages>?) =
                    languages(JsonField.ofNullable(languages))

                /** Alias for calling [Builder.languages] with `languages.orElse(null)`. */
                fun languages(languages: Optional<List<ParsingLanguages>>) =
                    languages(languages.getOrNull())

                /**
                 * Sets [Builder.languages] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.languages] with a well-typed
                 * `List<ParsingLanguages>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun languages(languages: JsonField<List<ParsingLanguages>>) = apply {
                    this.languages = languages.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ParsingLanguages] to [languages].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLanguage(language: ParsingLanguages) = apply {
                    languages =
                        (languages ?: JsonField.of(mutableListOf())).also {
                            checkKnown("languages", it).add(language)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [OcrParameters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OcrParameters =
                    OcrParameters(
                        (languages ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): OcrParameters = apply {
                if (validated) {
                    return@apply
                }

                languages().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (languages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OcrParameters &&
                    languages == other.languages &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(languages, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OcrParameters{languages=$languages, additionalProperties=$additionalProperties}"
        }

        /**
         * Enable AI-powered chart analysis. Modes: 'efficient' (fast, lower cost), 'agentic'
         * (balanced), 'agentic_plus' (highest accuracy). Automatically enables extract_layout and
         * precise_bounding_box when set
         */
        class SpecializedChartParsing
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AGENTIC_PLUS = of("agentic_plus")

                @JvmField val AGENTIC = of("agentic")

                @JvmField val EFFICIENT = of("efficient")

                @JvmStatic fun of(value: String) = SpecializedChartParsing(JsonField.of(value))
            }

            /** An enum containing [SpecializedChartParsing]'s known values. */
            enum class Known {
                AGENTIC_PLUS,
                AGENTIC,
                EFFICIENT,
            }

            /**
             * An enum containing [SpecializedChartParsing]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SpecializedChartParsing] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AGENTIC_PLUS,
                AGENTIC,
                EFFICIENT,
                /**
                 * An enum member indicating that [SpecializedChartParsing] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AGENTIC_PLUS -> Value.AGENTIC_PLUS
                    AGENTIC -> Value.AGENTIC
                    EFFICIENT -> Value.EFFICIENT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    AGENTIC_PLUS -> Known.AGENTIC_PLUS
                    AGENTIC -> Known.AGENTIC
                    EFFICIENT -> Known.EFFICIENT
                    else ->
                        throw LlamaCloudInvalidDataException(
                            "Unknown SpecializedChartParsing: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LlamaCloudInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SpecializedChartParsing = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SpecializedChartParsing && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProcessingOptions &&
                aggressiveTableExtraction == other.aggressiveTableExtraction &&
                autoModeConfiguration == other.autoModeConfiguration &&
                costOptimizer == other.costOptimizer &&
                disableHeuristics == other.disableHeuristics &&
                ignore == other.ignore &&
                ocrParameters == other.ocrParameters &&
                specializedChartParsing == other.specializedChartParsing &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                aggressiveTableExtraction,
                autoModeConfiguration,
                costOptimizer,
                disableHeuristics,
                ignore,
                ocrParameters,
                specializedChartParsing,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProcessingOptions{aggressiveTableExtraction=$aggressiveTableExtraction, autoModeConfiguration=$autoModeConfiguration, costOptimizer=$costOptimizer, disableHeuristics=$disableHeuristics, ignore=$ignore, ocrParameters=$ocrParameters, specializedChartParsing=$specializedChartParsing, additionalProperties=$additionalProperties}"
    }

    /**
     * Webhook configuration for receiving parsing job notifications.
     *
     * Webhooks are called when specified events occur during job processing. Configure multiple
     * webhook configurations to send to different endpoints.
     */
    class WebhookConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val webhookEvents: JsonField<List<String>>,
        private val webhookHeaders: JsonField<WebhookHeaders>,
        private val webhookOutputFormat: JsonField<WebhookOutputFormat>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("webhook_events")
            @ExcludeMissing
            webhookEvents: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("webhook_headers")
            @ExcludeMissing
            webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of(),
            @JsonProperty("webhook_output_format")
            @ExcludeMissing
            webhookOutputFormat: JsonField<WebhookOutputFormat> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(webhookEvents, webhookHeaders, webhookOutputFormat, webhookUrl, mutableMapOf())

        /**
         * Events that trigger this webhook. Options: 'parse.success' (job completed), 'parse.error'
         * (job failed), 'parse.partial_success' (some pages failed), 'parse.pending',
         * 'parse.running', 'parse.cancelled'. If not specified, webhook fires for all events
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookEvents(): Optional<List<String>> = webhookEvents.getOptional("webhook_events")

        /**
         * Custom HTTP headers to include in webhook requests. Use for authentication tokens or
         * custom routing. Example: {'Authorization': 'Bearer xyz'}
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookHeaders(): Optional<WebhookHeaders> =
            webhookHeaders.getOptional("webhook_headers")

        /**
         * Format of the webhook payload body. 'string' (default) sends the payload as a
         * JSON-encoded string; 'json' sends it as a JSON object.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookOutputFormat(): Optional<WebhookOutputFormat> =
            webhookOutputFormat.getOptional("webhook_output_format")

        /**
         * HTTPS URL to receive webhook POST requests. Must be publicly accessible
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [webhookEvents].
         *
         * Unlike [webhookEvents], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_events")
        @ExcludeMissing
        fun _webhookEvents(): JsonField<List<String>> = webhookEvents

        /**
         * Returns the raw JSON value of [webhookHeaders].
         *
         * Unlike [webhookHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_headers")
        @ExcludeMissing
        fun _webhookHeaders(): JsonField<WebhookHeaders> = webhookHeaders

        /**
         * Returns the raw JSON value of [webhookOutputFormat].
         *
         * Unlike [webhookOutputFormat], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_output_format")
        @ExcludeMissing
        fun _webhookOutputFormat(): JsonField<WebhookOutputFormat> = webhookOutputFormat

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [WebhookConfiguration]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookConfiguration]. */
        class Builder internal constructor() {

            private var webhookEvents: JsonField<MutableList<String>>? = null
            private var webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of()
            private var webhookOutputFormat: JsonField<WebhookOutputFormat> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookConfiguration: WebhookConfiguration) = apply {
                webhookEvents = webhookConfiguration.webhookEvents.map { it.toMutableList() }
                webhookHeaders = webhookConfiguration.webhookHeaders
                webhookOutputFormat = webhookConfiguration.webhookOutputFormat
                webhookUrl = webhookConfiguration.webhookUrl
                additionalProperties = webhookConfiguration.additionalProperties.toMutableMap()
            }

            /**
             * Events that trigger this webhook. Options: 'parse.success' (job completed),
             * 'parse.error' (job failed), 'parse.partial_success' (some pages failed),
             * 'parse.pending', 'parse.running', 'parse.cancelled'. If not specified, webhook fires
             * for all events
             */
            fun webhookEvents(webhookEvents: List<String>?) =
                webhookEvents(JsonField.ofNullable(webhookEvents))

            /** Alias for calling [Builder.webhookEvents] with `webhookEvents.orElse(null)`. */
            fun webhookEvents(webhookEvents: Optional<List<String>>) =
                webhookEvents(webhookEvents.getOrNull())

            /**
             * Sets [Builder.webhookEvents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookEvents] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun webhookEvents(webhookEvents: JsonField<List<String>>) = apply {
                this.webhookEvents = webhookEvents.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [webhookEvents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWebhookEvent(webhookEvent: String) = apply {
                webhookEvents =
                    (webhookEvents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("webhookEvents", it).add(webhookEvent)
                    }
            }

            /**
             * Custom HTTP headers to include in webhook requests. Use for authentication tokens or
             * custom routing. Example: {'Authorization': 'Bearer xyz'}
             */
            fun webhookHeaders(webhookHeaders: WebhookHeaders?) =
                webhookHeaders(JsonField.ofNullable(webhookHeaders))

            /** Alias for calling [Builder.webhookHeaders] with `webhookHeaders.orElse(null)`. */
            fun webhookHeaders(webhookHeaders: Optional<WebhookHeaders>) =
                webhookHeaders(webhookHeaders.getOrNull())

            /**
             * Sets [Builder.webhookHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookHeaders] with a well-typed [WebhookHeaders]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun webhookHeaders(webhookHeaders: JsonField<WebhookHeaders>) = apply {
                this.webhookHeaders = webhookHeaders
            }

            /**
             * Format of the webhook payload body. 'string' (default) sends the payload as a
             * JSON-encoded string; 'json' sends it as a JSON object.
             */
            fun webhookOutputFormat(webhookOutputFormat: WebhookOutputFormat?) =
                webhookOutputFormat(JsonField.ofNullable(webhookOutputFormat))

            /**
             * Alias for calling [Builder.webhookOutputFormat] with
             * `webhookOutputFormat.orElse(null)`.
             */
            fun webhookOutputFormat(webhookOutputFormat: Optional<WebhookOutputFormat>) =
                webhookOutputFormat(webhookOutputFormat.getOrNull())

            /**
             * Sets [Builder.webhookOutputFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookOutputFormat] with a well-typed
             * [WebhookOutputFormat] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun webhookOutputFormat(webhookOutputFormat: JsonField<WebhookOutputFormat>) = apply {
                this.webhookOutputFormat = webhookOutputFormat
            }

            /** HTTPS URL to receive webhook POST requests. Must be publicly accessible */
            fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

            /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
            fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [WebhookConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookConfiguration =
                WebhookConfiguration(
                    (webhookEvents ?: JsonMissing.of()).map { it.toImmutable() },
                    webhookHeaders,
                    webhookOutputFormat,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): WebhookConfiguration = apply {
            if (validated) {
                return@apply
            }

            webhookEvents()
            webhookHeaders().ifPresent { it.validate() }
            webhookOutputFormat().ifPresent { it.validate() }
            webhookUrl()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaCloudInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (webhookEvents.asKnown().getOrNull()?.size ?: 0) +
                (webhookHeaders.asKnown().getOrNull()?.validity() ?: 0) +
                (webhookOutputFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        /**
         * Custom HTTP headers to include in webhook requests. Use for authentication tokens or
         * custom routing. Example: {'Authorization': 'Bearer xyz'}
         */
        class WebhookHeaders
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [WebhookHeaders]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WebhookHeaders]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(webhookHeaders: WebhookHeaders) = apply {
                    additionalProperties = webhookHeaders.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [WebhookHeaders].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): WebhookHeaders = WebhookHeaders(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): WebhookHeaders = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WebhookHeaders && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "WebhookHeaders{additionalProperties=$additionalProperties}"
        }

        /**
         * Format of the webhook payload body. 'string' (default) sends the payload as a
         * JSON-encoded string; 'json' sends it as a JSON object.
         */
        class WebhookOutputFormat
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val STRING = of("string")

                @JvmField val JSON = of("json")

                @JvmStatic fun of(value: String) = WebhookOutputFormat(JsonField.of(value))
            }

            /** An enum containing [WebhookOutputFormat]'s known values. */
            enum class Known {
                STRING,
                JSON,
            }

            /**
             * An enum containing [WebhookOutputFormat]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [WebhookOutputFormat] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRING,
                JSON,
                /**
                 * An enum member indicating that [WebhookOutputFormat] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    STRING -> Value.STRING
                    JSON -> Value.JSON
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    STRING -> Known.STRING
                    JSON -> Known.JSON
                    else ->
                        throw LlamaCloudInvalidDataException("Unknown WebhookOutputFormat: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LlamaCloudInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): WebhookOutputFormat = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaCloudInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WebhookOutputFormat && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WebhookConfiguration &&
                webhookEvents == other.webhookEvents &&
                webhookHeaders == other.webhookHeaders &&
                webhookOutputFormat == other.webhookOutputFormat &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                webhookEvents,
                webhookHeaders,
                webhookOutputFormat,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WebhookConfiguration{webhookEvents=$webhookEvents, webhookHeaders=$webhookHeaders, webhookOutputFormat=$webhookOutputFormat, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParsingCreateParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ParsingCreateParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
