// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.batch

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
import com.llamacloud_prod.api.models.classifier.jobs.ClassifyJob
import com.llamacloud_prod.api.models.parsing.FailPageMode
import com.llamacloud_prod.api.models.parsing.ParsingLanguages
import com.llamacloud_prod.api.models.parsing.ParsingMode
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a batch processing job.
 *
 * Processes files from a directory or a specific list of item IDs. Supports batch parsing and
 * classification operations.
 *
 * Provide either `directory_id` to process all files in a directory, or `item_ids` for specific
 * items. The job runs asynchronously — poll `GET /batch/{job_id}` for progress.
 */
class BatchCreateParams
private constructor(
    private val organizationId: String?,
    private val projectId: String?,
    private val temporalNamespace: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    fun temporalNamespace(): Optional<String> = Optional.ofNullable(temporalNamespace)

    /**
     * Job configuration — either a parse or classify config
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jobConfig(): JobConfig = body.jobConfig()

    /**
     * Maximum files to process per execution cycle in directory mode. Defaults to page_size.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun continueAsNewThreshold(): Optional<Long> = body.continueAsNewThreshold()

    /**
     * ID of the directory containing files to process
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun directoryId(): Optional<String> = body.directoryId()

    /**
     * List of specific item IDs to process. Either this or directory_id must be provided.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun itemIds(): Optional<List<String>> = body.itemIds()

    /**
     * Number of files to process per batch when using directory mode
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = body.pageSize()

    /**
     * Returns the raw JSON value of [jobConfig].
     *
     * Unlike [jobConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _jobConfig(): JsonField<JobConfig> = body._jobConfig()

    /**
     * Returns the raw JSON value of [continueAsNewThreshold].
     *
     * Unlike [continueAsNewThreshold], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _continueAsNewThreshold(): JsonField<Long> = body._continueAsNewThreshold()

    /**
     * Returns the raw JSON value of [directoryId].
     *
     * Unlike [directoryId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _directoryId(): JsonField<String> = body._directoryId()

    /**
     * Returns the raw JSON value of [itemIds].
     *
     * Unlike [itemIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _itemIds(): JsonField<List<String>> = body._itemIds()

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageSize(): JsonField<Long> = body._pageSize()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatchCreateParams].
         *
         * The following fields are required:
         * ```java
         * .jobConfig()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchCreateParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var temporalNamespace: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchCreateParams: BatchCreateParams) = apply {
            organizationId = batchCreateParams.organizationId
            projectId = batchCreateParams.projectId
            temporalNamespace = batchCreateParams.temporalNamespace
            body = batchCreateParams.body.toBuilder()
            additionalHeaders = batchCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchCreateParams.additionalQueryParams.toBuilder()
        }

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        fun temporalNamespace(temporalNamespace: String?) = apply {
            this.temporalNamespace = temporalNamespace
        }

        /** Alias for calling [Builder.temporalNamespace] with `temporalNamespace.orElse(null)`. */
        fun temporalNamespace(temporalNamespace: Optional<String>) =
            temporalNamespace(temporalNamespace.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [jobConfig]
         * - [continueAsNewThreshold]
         * - [directoryId]
         * - [itemIds]
         * - [pageSize]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Job configuration — either a parse or classify config */
        fun jobConfig(jobConfig: JobConfig) = apply { body.jobConfig(jobConfig) }

        /**
         * Sets [Builder.jobConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobConfig] with a well-typed [JobConfig] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jobConfig(jobConfig: JsonField<JobConfig>) = apply { body.jobConfig(jobConfig) }

        /**
         * Alias for calling [jobConfig] with
         * `JobConfig.ofBatchParseJobRecordCreate(batchParseJobRecordCreate)`.
         */
        fun jobConfig(batchParseJobRecordCreate: JobConfig.BatchParseJobRecordCreate) = apply {
            body.jobConfig(batchParseJobRecordCreate)
        }

        /** Alias for calling [jobConfig] with `JobConfig.ofClassifyJob(classifyJob)`. */
        fun jobConfig(classifyJob: ClassifyJob) = apply { body.jobConfig(classifyJob) }

        /**
         * Maximum files to process per execution cycle in directory mode. Defaults to page_size.
         */
        fun continueAsNewThreshold(continueAsNewThreshold: Long?) = apply {
            body.continueAsNewThreshold(continueAsNewThreshold)
        }

        /**
         * Alias for [Builder.continueAsNewThreshold].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun continueAsNewThreshold(continueAsNewThreshold: Long) =
            continueAsNewThreshold(continueAsNewThreshold as Long?)

        /**
         * Alias for calling [Builder.continueAsNewThreshold] with
         * `continueAsNewThreshold.orElse(null)`.
         */
        fun continueAsNewThreshold(continueAsNewThreshold: Optional<Long>) =
            continueAsNewThreshold(continueAsNewThreshold.getOrNull())

        /**
         * Sets [Builder.continueAsNewThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.continueAsNewThreshold] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun continueAsNewThreshold(continueAsNewThreshold: JsonField<Long>) = apply {
            body.continueAsNewThreshold(continueAsNewThreshold)
        }

        /** ID of the directory containing files to process */
        fun directoryId(directoryId: String?) = apply { body.directoryId(directoryId) }

        /** Alias for calling [Builder.directoryId] with `directoryId.orElse(null)`. */
        fun directoryId(directoryId: Optional<String>) = directoryId(directoryId.getOrNull())

        /**
         * Sets [Builder.directoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.directoryId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun directoryId(directoryId: JsonField<String>) = apply { body.directoryId(directoryId) }

        /** List of specific item IDs to process. Either this or directory_id must be provided. */
        fun itemIds(itemIds: List<String>?) = apply { body.itemIds(itemIds) }

        /** Alias for calling [Builder.itemIds] with `itemIds.orElse(null)`. */
        fun itemIds(itemIds: Optional<List<String>>) = itemIds(itemIds.getOrNull())

        /**
         * Sets [Builder.itemIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun itemIds(itemIds: JsonField<List<String>>) = apply { body.itemIds(itemIds) }

        /**
         * Adds a single [String] to [itemIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItemId(itemId: String) = apply { body.addItemId(itemId) }

        /** Number of files to process per batch when using directory mode */
        fun pageSize(pageSize: Long) = apply { body.pageSize(pageSize) }

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { body.pageSize(pageSize) }

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
         * Returns an immutable instance of [BatchCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .jobConfig()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchCreateParams =
            BatchCreateParams(
                organizationId,
                projectId,
                temporalNamespace,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                temporalNamespace?.let { put("temporal-namespace", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Request to create a batch processing job.
     *
     * Supports two modes:
     * 1. Directory mode: Process all files in a directory (use directory_id)
     * 2. Item list mode: Process specific items (use item_ids). Project must be provided via
     *    validate_project dependency.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val jobConfig: JsonField<JobConfig>,
        private val continueAsNewThreshold: JsonField<Long>,
        private val directoryId: JsonField<String>,
        private val itemIds: JsonField<List<String>>,
        private val pageSize: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("job_config")
            @ExcludeMissing
            jobConfig: JsonField<JobConfig> = JsonMissing.of(),
            @JsonProperty("continue_as_new_threshold")
            @ExcludeMissing
            continueAsNewThreshold: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("directory_id")
            @ExcludeMissing
            directoryId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("item_ids")
            @ExcludeMissing
            itemIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
        ) : this(jobConfig, continueAsNewThreshold, directoryId, itemIds, pageSize, mutableMapOf())

        /**
         * Job configuration — either a parse or classify config
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun jobConfig(): JobConfig = jobConfig.getRequired("job_config")

        /**
         * Maximum files to process per execution cycle in directory mode. Defaults to page_size.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun continueAsNewThreshold(): Optional<Long> =
            continueAsNewThreshold.getOptional("continue_as_new_threshold")

        /**
         * ID of the directory containing files to process
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun directoryId(): Optional<String> = directoryId.getOptional("directory_id")

        /**
         * List of specific item IDs to process. Either this or directory_id must be provided.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun itemIds(): Optional<List<String>> = itemIds.getOptional("item_ids")

        /**
         * Number of files to process per batch when using directory mode
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * Returns the raw JSON value of [jobConfig].
         *
         * Unlike [jobConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("job_config")
        @ExcludeMissing
        fun _jobConfig(): JsonField<JobConfig> = jobConfig

        /**
         * Returns the raw JSON value of [continueAsNewThreshold].
         *
         * Unlike [continueAsNewThreshold], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("continue_as_new_threshold")
        @ExcludeMissing
        fun _continueAsNewThreshold(): JsonField<Long> = continueAsNewThreshold

        /**
         * Returns the raw JSON value of [directoryId].
         *
         * Unlike [directoryId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("directory_id")
        @ExcludeMissing
        fun _directoryId(): JsonField<String> = directoryId

        /**
         * Returns the raw JSON value of [itemIds].
         *
         * Unlike [itemIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_ids") @ExcludeMissing fun _itemIds(): JsonField<List<String>> = itemIds

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

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
             * .jobConfig()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var jobConfig: JsonField<JobConfig>? = null
            private var continueAsNewThreshold: JsonField<Long> = JsonMissing.of()
            private var directoryId: JsonField<String> = JsonMissing.of()
            private var itemIds: JsonField<MutableList<String>>? = null
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                jobConfig = body.jobConfig
                continueAsNewThreshold = body.continueAsNewThreshold
                directoryId = body.directoryId
                itemIds = body.itemIds.map { it.toMutableList() }
                pageSize = body.pageSize
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Job configuration — either a parse or classify config */
            fun jobConfig(jobConfig: JobConfig) = jobConfig(JsonField.of(jobConfig))

            /**
             * Sets [Builder.jobConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobConfig] with a well-typed [JobConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobConfig(jobConfig: JsonField<JobConfig>) = apply { this.jobConfig = jobConfig }

            /**
             * Alias for calling [jobConfig] with
             * `JobConfig.ofBatchParseJobRecordCreate(batchParseJobRecordCreate)`.
             */
            fun jobConfig(batchParseJobRecordCreate: JobConfig.BatchParseJobRecordCreate) =
                jobConfig(JobConfig.ofBatchParseJobRecordCreate(batchParseJobRecordCreate))

            /** Alias for calling [jobConfig] with `JobConfig.ofClassifyJob(classifyJob)`. */
            fun jobConfig(classifyJob: ClassifyJob) =
                jobConfig(JobConfig.ofClassifyJob(classifyJob))

            /**
             * Maximum files to process per execution cycle in directory mode. Defaults to
             * page_size.
             */
            fun continueAsNewThreshold(continueAsNewThreshold: Long?) =
                continueAsNewThreshold(JsonField.ofNullable(continueAsNewThreshold))

            /**
             * Alias for [Builder.continueAsNewThreshold].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun continueAsNewThreshold(continueAsNewThreshold: Long) =
                continueAsNewThreshold(continueAsNewThreshold as Long?)

            /**
             * Alias for calling [Builder.continueAsNewThreshold] with
             * `continueAsNewThreshold.orElse(null)`.
             */
            fun continueAsNewThreshold(continueAsNewThreshold: Optional<Long>) =
                continueAsNewThreshold(continueAsNewThreshold.getOrNull())

            /**
             * Sets [Builder.continueAsNewThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.continueAsNewThreshold] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun continueAsNewThreshold(continueAsNewThreshold: JsonField<Long>) = apply {
                this.continueAsNewThreshold = continueAsNewThreshold
            }

            /** ID of the directory containing files to process */
            fun directoryId(directoryId: String?) = directoryId(JsonField.ofNullable(directoryId))

            /** Alias for calling [Builder.directoryId] with `directoryId.orElse(null)`. */
            fun directoryId(directoryId: Optional<String>) = directoryId(directoryId.getOrNull())

            /**
             * Sets [Builder.directoryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.directoryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun directoryId(directoryId: JsonField<String>) = apply {
                this.directoryId = directoryId
            }

            /**
             * List of specific item IDs to process. Either this or directory_id must be provided.
             */
            fun itemIds(itemIds: List<String>?) = itemIds(JsonField.ofNullable(itemIds))

            /** Alias for calling [Builder.itemIds] with `itemIds.orElse(null)`. */
            fun itemIds(itemIds: Optional<List<String>>) = itemIds(itemIds.getOrNull())

            /**
             * Sets [Builder.itemIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemIds(itemIds: JsonField<List<String>>) = apply {
                this.itemIds = itemIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [itemIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItemId(itemId: String) = apply {
                itemIds =
                    (itemIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("itemIds", it).add(itemId)
                    }
            }

            /** Number of files to process per batch when using directory mode */
            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

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
             * .jobConfig()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("jobConfig", jobConfig),
                    continueAsNewThreshold,
                    directoryId,
                    (itemIds ?: JsonMissing.of()).map { it.toImmutable() },
                    pageSize,
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

            jobConfig().validate()
            continueAsNewThreshold()
            directoryId()
            itemIds()
            pageSize()
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
            (jobConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (continueAsNewThreshold.asKnown().isPresent) 1 else 0) +
                (if (directoryId.asKnown().isPresent) 1 else 0) +
                (itemIds.asKnown().getOrNull()?.size ?: 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                jobConfig == other.jobConfig &&
                continueAsNewThreshold == other.continueAsNewThreshold &&
                directoryId == other.directoryId &&
                itemIds == other.itemIds &&
                pageSize == other.pageSize &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                jobConfig,
                continueAsNewThreshold,
                directoryId,
                itemIds,
                pageSize,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{jobConfig=$jobConfig, continueAsNewThreshold=$continueAsNewThreshold, directoryId=$directoryId, itemIds=$itemIds, pageSize=$pageSize, additionalProperties=$additionalProperties}"
    }

    /** Job configuration — either a parse or classify config */
    @JsonDeserialize(using = JobConfig.Deserializer::class)
    @JsonSerialize(using = JobConfig.Serializer::class)
    class JobConfig
    private constructor(
        private val batchParseJobRecordCreate: BatchParseJobRecordCreate? = null,
        private val classifyJob: ClassifyJob? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Batch-specific parse job record for batch processing.
         *
         * This model contains the metadata and configuration for a batch parse job, but excludes
         * file-specific information. It's used as input to the batch parent workflow and combined
         * with DirectoryFile data to create full ParseJobRecordCreate instances for each file.
         *
         * Attributes: job_name: Must be PARSE_RAW_FILE partitions: Partitions for job output
         * location parameters: Generic parse configuration (BatchParseJobConfig) session_id:
         * Upstream request ID for tracking correlation_id: Correlation ID for cross-service
         * tracking parent_job_execution_id: Parent job execution ID if nested user_id: User who
         * created the job project_id: Project this job belongs to webhook_url: Optional webhook URL
         * for job completion notifications
         */
        fun batchParseJobRecordCreate(): Optional<BatchParseJobRecordCreate> =
            Optional.ofNullable(batchParseJobRecordCreate)

        /** A classify job. */
        fun classifyJob(): Optional<ClassifyJob> = Optional.ofNullable(classifyJob)

        fun isBatchParseJobRecordCreate(): Boolean = batchParseJobRecordCreate != null

        fun isClassifyJob(): Boolean = classifyJob != null

        /**
         * Batch-specific parse job record for batch processing.
         *
         * This model contains the metadata and configuration for a batch parse job, but excludes
         * file-specific information. It's used as input to the batch parent workflow and combined
         * with DirectoryFile data to create full ParseJobRecordCreate instances for each file.
         *
         * Attributes: job_name: Must be PARSE_RAW_FILE partitions: Partitions for job output
         * location parameters: Generic parse configuration (BatchParseJobConfig) session_id:
         * Upstream request ID for tracking correlation_id: Correlation ID for cross-service
         * tracking parent_job_execution_id: Parent job execution ID if nested user_id: User who
         * created the job project_id: Project this job belongs to webhook_url: Optional webhook URL
         * for job completion notifications
         */
        fun asBatchParseJobRecordCreate(): BatchParseJobRecordCreate =
            batchParseJobRecordCreate.getOrThrow("batchParseJobRecordCreate")

        /** A classify job. */
        fun asClassifyJob(): ClassifyJob = classifyJob.getOrThrow("classifyJob")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.llamacloud_prod.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = jobConfig.accept(new JobConfig.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitBatchParseJobRecordCreate(BatchParseJobRecordCreate batchParseJobRecordCreate) {
         *         return Optional.of(batchParseJobRecordCreate.toString());
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
                batchParseJobRecordCreate != null ->
                    visitor.visitBatchParseJobRecordCreate(batchParseJobRecordCreate)
                classifyJob != null -> visitor.visitClassifyJob(classifyJob)
                else -> visitor.unknown(_json)
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
        fun validate(): JobConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBatchParseJobRecordCreate(
                        batchParseJobRecordCreate: BatchParseJobRecordCreate
                    ) {
                        batchParseJobRecordCreate.validate()
                    }

                    override fun visitClassifyJob(classifyJob: ClassifyJob) {
                        classifyJob.validate()
                    }
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
                    override fun visitBatchParseJobRecordCreate(
                        batchParseJobRecordCreate: BatchParseJobRecordCreate
                    ) = batchParseJobRecordCreate.validity()

                    override fun visitClassifyJob(classifyJob: ClassifyJob) = classifyJob.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is JobConfig &&
                batchParseJobRecordCreate == other.batchParseJobRecordCreate &&
                classifyJob == other.classifyJob
        }

        override fun hashCode(): Int = Objects.hash(batchParseJobRecordCreate, classifyJob)

        override fun toString(): String =
            when {
                batchParseJobRecordCreate != null ->
                    "JobConfig{batchParseJobRecordCreate=$batchParseJobRecordCreate}"
                classifyJob != null -> "JobConfig{classifyJob=$classifyJob}"
                _json != null -> "JobConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid JobConfig")
            }

        companion object {

            /**
             * Batch-specific parse job record for batch processing.
             *
             * This model contains the metadata and configuration for a batch parse job, but
             * excludes file-specific information. It's used as input to the batch parent workflow
             * and combined with DirectoryFile data to create full ParseJobRecordCreate instances
             * for each file.
             *
             * Attributes: job_name: Must be PARSE_RAW_FILE partitions: Partitions for job output
             * location parameters: Generic parse configuration (BatchParseJobConfig) session_id:
             * Upstream request ID for tracking correlation_id: Correlation ID for cross-service
             * tracking parent_job_execution_id: Parent job execution ID if nested user_id: User who
             * created the job project_id: Project this job belongs to webhook_url: Optional webhook
             * URL for job completion notifications
             */
            @JvmStatic
            fun ofBatchParseJobRecordCreate(batchParseJobRecordCreate: BatchParseJobRecordCreate) =
                JobConfig(batchParseJobRecordCreate = batchParseJobRecordCreate)

            /** A classify job. */
            @JvmStatic
            fun ofClassifyJob(classifyJob: ClassifyJob) = JobConfig(classifyJob = classifyJob)
        }

        /**
         * An interface that defines how to map each variant of [JobConfig] to a value of type [T].
         */
        interface Visitor<out T> {

            /**
             * Batch-specific parse job record for batch processing.
             *
             * This model contains the metadata and configuration for a batch parse job, but
             * excludes file-specific information. It's used as input to the batch parent workflow
             * and combined with DirectoryFile data to create full ParseJobRecordCreate instances
             * for each file.
             *
             * Attributes: job_name: Must be PARSE_RAW_FILE partitions: Partitions for job output
             * location parameters: Generic parse configuration (BatchParseJobConfig) session_id:
             * Upstream request ID for tracking correlation_id: Correlation ID for cross-service
             * tracking parent_job_execution_id: Parent job execution ID if nested user_id: User who
             * created the job project_id: Project this job belongs to webhook_url: Optional webhook
             * URL for job completion notifications
             */
            fun visitBatchParseJobRecordCreate(
                batchParseJobRecordCreate: BatchParseJobRecordCreate
            ): T

            /** A classify job. */
            fun visitClassifyJob(classifyJob: ClassifyJob): T

            /**
             * Maps an unknown variant of [JobConfig] to a value of type [T].
             *
             * An instance of [JobConfig] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown JobConfig: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<JobConfig>(JobConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): JobConfig {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<BatchParseJobRecordCreate>())?.let {
                                JobConfig(batchParseJobRecordCreate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ClassifyJob>())?.let {
                                JobConfig(classifyJob = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> JobConfig(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<JobConfig>(JobConfig::class) {

            override fun serialize(
                value: JobConfig,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.batchParseJobRecordCreate != null ->
                        generator.writeObject(value.batchParseJobRecordCreate)
                    value.classifyJob != null -> generator.writeObject(value.classifyJob)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid JobConfig")
                }
            }
        }

        /**
         * Batch-specific parse job record for batch processing.
         *
         * This model contains the metadata and configuration for a batch parse job, but excludes
         * file-specific information. It's used as input to the batch parent workflow and combined
         * with DirectoryFile data to create full ParseJobRecordCreate instances for each file.
         *
         * Attributes: job_name: Must be PARSE_RAW_FILE partitions: Partitions for job output
         * location parameters: Generic parse configuration (BatchParseJobConfig) session_id:
         * Upstream request ID for tracking correlation_id: Correlation ID for cross-service
         * tracking parent_job_execution_id: Parent job execution ID if nested user_id: User who
         * created the job project_id: Project this job belongs to webhook_url: Optional webhook URL
         * for job completion notifications
         */
        class BatchParseJobRecordCreate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val correlationId: JsonField<String>,
            private val jobName: JsonField<JobName>,
            private val parameters: JsonField<Parameters>,
            private val parentJobExecutionId: JsonField<String>,
            private val partitions: JsonField<Partitions>,
            private val projectId: JsonField<String>,
            private val sessionId: JsonField<String>,
            private val userId: JsonField<String>,
            private val webhookUrl: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("correlation_id")
                @ExcludeMissing
                correlationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("job_name")
                @ExcludeMissing
                jobName: JsonField<JobName> = JsonMissing.of(),
                @JsonProperty("parameters")
                @ExcludeMissing
                parameters: JsonField<Parameters> = JsonMissing.of(),
                @JsonProperty("parent_job_execution_id")
                @ExcludeMissing
                parentJobExecutionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("partitions")
                @ExcludeMissing
                partitions: JsonField<Partitions> = JsonMissing.of(),
                @JsonProperty("project_id")
                @ExcludeMissing
                projectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("session_id")
                @ExcludeMissing
                sessionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("webhook_url")
                @ExcludeMissing
                webhookUrl: JsonField<String> = JsonMissing.of(),
            ) : this(
                correlationId,
                jobName,
                parameters,
                parentJobExecutionId,
                partitions,
                projectId,
                sessionId,
                userId,
                webhookUrl,
                mutableMapOf(),
            )

            /**
             * The correlation ID for this job. Used for tracking the job across services.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun correlationId(): Optional<String> = correlationId.getOptional("correlation_id")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun jobName(): Optional<JobName> = jobName.getOptional("job_name")

            /**
             * Generic parse job configuration for batch processing.
             *
             * This model contains the parsing configuration that applies to all files in a batch,
             * but excludes file-specific fields like file_name, file_id, etc. Those file-specific
             * fields are populated from DirectoryFile data when creating individual
             * ParseJobRecordCreate instances for each file.
             *
             * The fields in this model should be generic settings that apply uniformly to all files
             * being processed in the batch.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun parameters(): Optional<Parameters> = parameters.getOptional("parameters")

            /**
             * The ID of the parent job execution.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun parentJobExecutionId(): Optional<String> =
                parentJobExecutionId.getOptional("parent_job_execution_id")

            /**
             * The partitions for this execution. Used for determining where to save job output.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun partitions(): Optional<Partitions> = partitions.getOptional("partitions")

            /**
             * The ID of the project this job belongs to.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun projectId(): Optional<String> = projectId.getOptional("project_id")

            /**
             * The upstream request ID that created this job. Used for tracking the job across
             * services.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

            /**
             * The ID of the user that created this job
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun userId(): Optional<String> = userId.getOptional("user_id")

            /**
             * The URL that needs to be called at the end of the parsing job.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

            /**
             * Returns the raw JSON value of [correlationId].
             *
             * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("correlation_id")
            @ExcludeMissing
            fun _correlationId(): JsonField<String> = correlationId

            /**
             * Returns the raw JSON value of [jobName].
             *
             * Unlike [jobName], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("job_name") @ExcludeMissing fun _jobName(): JsonField<JobName> = jobName

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun _parameters(): JsonField<Parameters> = parameters

            /**
             * Returns the raw JSON value of [parentJobExecutionId].
             *
             * Unlike [parentJobExecutionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("parent_job_execution_id")
            @ExcludeMissing
            fun _parentJobExecutionId(): JsonField<String> = parentJobExecutionId

            /**
             * Returns the raw JSON value of [partitions].
             *
             * Unlike [partitions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("partitions")
            @ExcludeMissing
            fun _partitions(): JsonField<Partitions> = partitions

            /**
             * Returns the raw JSON value of [projectId].
             *
             * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_id")
            @ExcludeMissing
            fun _projectId(): JsonField<String> = projectId

            /**
             * Returns the raw JSON value of [sessionId].
             *
             * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("session_id")
            @ExcludeMissing
            fun _sessionId(): JsonField<String> = sessionId

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

            /**
             * Returns the raw JSON value of [webhookUrl].
             *
             * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [BatchParseJobRecordCreate].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BatchParseJobRecordCreate]. */
            class Builder internal constructor() {

                private var correlationId: JsonField<String> = JsonMissing.of()
                private var jobName: JsonField<JobName> = JsonMissing.of()
                private var parameters: JsonField<Parameters> = JsonMissing.of()
                private var parentJobExecutionId: JsonField<String> = JsonMissing.of()
                private var partitions: JsonField<Partitions> = JsonMissing.of()
                private var projectId: JsonField<String> = JsonMissing.of()
                private var sessionId: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var webhookUrl: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(batchParseJobRecordCreate: BatchParseJobRecordCreate) = apply {
                    correlationId = batchParseJobRecordCreate.correlationId
                    jobName = batchParseJobRecordCreate.jobName
                    parameters = batchParseJobRecordCreate.parameters
                    parentJobExecutionId = batchParseJobRecordCreate.parentJobExecutionId
                    partitions = batchParseJobRecordCreate.partitions
                    projectId = batchParseJobRecordCreate.projectId
                    sessionId = batchParseJobRecordCreate.sessionId
                    userId = batchParseJobRecordCreate.userId
                    webhookUrl = batchParseJobRecordCreate.webhookUrl
                    additionalProperties =
                        batchParseJobRecordCreate.additionalProperties.toMutableMap()
                }

                /** The correlation ID for this job. Used for tracking the job across services. */
                fun correlationId(correlationId: String?) =
                    correlationId(JsonField.ofNullable(correlationId))

                /** Alias for calling [Builder.correlationId] with `correlationId.orElse(null)`. */
                fun correlationId(correlationId: Optional<String>) =
                    correlationId(correlationId.getOrNull())

                /**
                 * Sets [Builder.correlationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.correlationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun correlationId(correlationId: JsonField<String>) = apply {
                    this.correlationId = correlationId
                }

                fun jobName(jobName: JobName) = jobName(JsonField.of(jobName))

                /**
                 * Sets [Builder.jobName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.jobName] with a well-typed [JobName] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun jobName(jobName: JsonField<JobName>) = apply { this.jobName = jobName }

                /**
                 * Generic parse job configuration for batch processing.
                 *
                 * This model contains the parsing configuration that applies to all files in a
                 * batch, but excludes file-specific fields like file_name, file_id, etc. Those
                 * file-specific fields are populated from DirectoryFile data when creating
                 * individual ParseJobRecordCreate instances for each file.
                 *
                 * The fields in this model should be generic settings that apply uniformly to all
                 * files being processed in the batch.
                 */
                fun parameters(parameters: Parameters?) =
                    parameters(JsonField.ofNullable(parameters))

                /** Alias for calling [Builder.parameters] with `parameters.orElse(null)`. */
                fun parameters(parameters: Optional<Parameters>) =
                    parameters(parameters.getOrNull())

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed [Parameters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parameters(parameters: JsonField<Parameters>) = apply {
                    this.parameters = parameters
                }

                /** The ID of the parent job execution. */
                fun parentJobExecutionId(parentJobExecutionId: String?) =
                    parentJobExecutionId(JsonField.ofNullable(parentJobExecutionId))

                /**
                 * Alias for calling [Builder.parentJobExecutionId] with
                 * `parentJobExecutionId.orElse(null)`.
                 */
                fun parentJobExecutionId(parentJobExecutionId: Optional<String>) =
                    parentJobExecutionId(parentJobExecutionId.getOrNull())

                /**
                 * Sets [Builder.parentJobExecutionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parentJobExecutionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun parentJobExecutionId(parentJobExecutionId: JsonField<String>) = apply {
                    this.parentJobExecutionId = parentJobExecutionId
                }

                /**
                 * The partitions for this execution. Used for determining where to save job output.
                 */
                fun partitions(partitions: Partitions) = partitions(JsonField.of(partitions))

                /**
                 * Sets [Builder.partitions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.partitions] with a well-typed [Partitions] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun partitions(partitions: JsonField<Partitions>) = apply {
                    this.partitions = partitions
                }

                /** The ID of the project this job belongs to. */
                fun projectId(projectId: String?) = projectId(JsonField.ofNullable(projectId))

                /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
                fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

                /**
                 * Sets [Builder.projectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

                /**
                 * The upstream request ID that created this job. Used for tracking the job across
                 * services.
                 */
                fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

                /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
                fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

                /**
                 * Sets [Builder.sessionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sessionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

                /** The ID of the user that created this job */
                fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

                /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
                fun userId(userId: Optional<String>) = userId(userId.getOrNull())

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                /** The URL that needs to be called at the end of the parsing job. */
                fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

                /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
                fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

                /**
                 * Sets [Builder.webhookUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webhookUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun webhookUrl(webhookUrl: JsonField<String>) = apply {
                    this.webhookUrl = webhookUrl
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
                 * Returns an immutable instance of [BatchParseJobRecordCreate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): BatchParseJobRecordCreate =
                    BatchParseJobRecordCreate(
                        correlationId,
                        jobName,
                        parameters,
                        parentJobExecutionId,
                        partitions,
                        projectId,
                        sessionId,
                        userId,
                        webhookUrl,
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
            fun validate(): BatchParseJobRecordCreate = apply {
                if (validated) {
                    return@apply
                }

                correlationId()
                jobName().ifPresent { it.validate() }
                parameters().ifPresent { it.validate() }
                parentJobExecutionId()
                partitions().ifPresent { it.validate() }
                projectId()
                sessionId()
                userId()
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
                (if (correlationId.asKnown().isPresent) 1 else 0) +
                    (jobName.asKnown().getOrNull()?.validity() ?: 0) +
                    (parameters.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (parentJobExecutionId.asKnown().isPresent) 1 else 0) +
                    (partitions.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (projectId.asKnown().isPresent) 1 else 0) +
                    (if (sessionId.asKnown().isPresent) 1 else 0) +
                    (if (userId.asKnown().isPresent) 1 else 0) +
                    (if (webhookUrl.asKnown().isPresent) 1 else 0)

            class JobName @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PARSE_RAW_FILE_JOB = of("parse_raw_file_job")

                    @JvmStatic fun of(value: String) = JobName(JsonField.of(value))
                }

                /** An enum containing [JobName]'s known values. */
                enum class Known {
                    PARSE_RAW_FILE_JOB
                }

                /**
                 * An enum containing [JobName]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [JobName] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PARSE_RAW_FILE_JOB,
                    /**
                     * An enum member indicating that [JobName] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PARSE_RAW_FILE_JOB -> Value.PARSE_RAW_FILE_JOB
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
                        PARSE_RAW_FILE_JOB -> Known.PARSE_RAW_FILE_JOB
                        else -> throw LlamaCloudInvalidDataException("Unknown JobName: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): JobName = apply {
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

                    return other is JobName && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Generic parse job configuration for batch processing.
             *
             * This model contains the parsing configuration that applies to all files in a batch,
             * but excludes file-specific fields like file_name, file_id, etc. Those file-specific
             * fields are populated from DirectoryFile data when creating individual
             * ParseJobRecordCreate instances for each file.
             *
             * The fields in this model should be generic settings that apply uniformly to all files
             * being processed in the batch.
             */
            class Parameters
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val adaptiveLongTable: JsonField<Boolean>,
                private val aggressiveTableExtraction: JsonField<Boolean>,
                private val annotateLinks: JsonField<Boolean>,
                private val autoMode: JsonField<Boolean>,
                private val autoModeConfigurationJson: JsonField<String>,
                private val autoModeTriggerOnImageInPage: JsonField<Boolean>,
                private val autoModeTriggerOnRegexpInPage: JsonField<String>,
                private val autoModeTriggerOnTableInPage: JsonField<Boolean>,
                private val autoModeTriggerOnTextInPage: JsonField<String>,
                private val azureOpenAIApiVersion: JsonField<String>,
                private val azureOpenAIDeploymentName: JsonField<String>,
                private val azureOpenAIEndpoint: JsonField<String>,
                private val azureOpenAIKey: JsonField<String>,
                private val bboxBottom: JsonField<Double>,
                private val bboxLeft: JsonField<Double>,
                private val bboxRight: JsonField<Double>,
                private val bboxTop: JsonField<Double>,
                private val boundingBox: JsonField<String>,
                private val compactMarkdownTable: JsonField<Boolean>,
                private val complementalFormattingInstruction: JsonField<String>,
                private val contentGuidelineInstruction: JsonField<String>,
                private val continuousMode: JsonField<Boolean>,
                private val customMetadata: JsonField<CustomMetadata>,
                private val disableImageExtraction: JsonField<Boolean>,
                private val disableOcr: JsonField<Boolean>,
                private val disableReconstruction: JsonField<Boolean>,
                private val doNotCache: JsonField<Boolean>,
                private val doNotUnrollColumns: JsonField<Boolean>,
                private val enableCostOptimizer: JsonField<Boolean>,
                private val extractCharts: JsonField<Boolean>,
                private val extractLayout: JsonField<Boolean>,
                private val extractPrintedPageNumber: JsonField<Boolean>,
                private val fastMode: JsonField<Boolean>,
                private val formattingInstruction: JsonField<String>,
                private val gpt4oApiKey: JsonField<String>,
                private val gpt4oMode: JsonField<Boolean>,
                private val guessXlsxSheetName: JsonField<Boolean>,
                private val hideFooters: JsonField<Boolean>,
                private val hideHeaders: JsonField<Boolean>,
                private val highResOcr: JsonField<Boolean>,
                private val htmlMakeAllElementsVisible: JsonField<Boolean>,
                private val htmlRemoveFixedElements: JsonField<Boolean>,
                private val htmlRemoveNavigationElements: JsonField<Boolean>,
                private val httpProxy: JsonField<String>,
                private val ignoreDocumentElementsForLayoutDetection: JsonField<Boolean>,
                private val imagesToSave: JsonField<List<ImagesToSave>>,
                private val inlineImagesInMarkdown: JsonField<Boolean>,
                private val inputS3Path: JsonField<String>,
                private val inputS3Region: JsonField<String>,
                private val inputUrl: JsonField<String>,
                private val internalIsScreenshotJob: JsonField<Boolean>,
                private val invalidateCache: JsonField<Boolean>,
                private val isFormattingInstruction: JsonField<Boolean>,
                private val jobTimeoutExtraTimePerPageInSeconds: JsonField<Double>,
                private val jobTimeoutInSeconds: JsonField<Double>,
                private val keepPageSeparatorWhenMergingTables: JsonField<Boolean>,
                private val lang: JsonField<String>,
                private val languages: JsonField<List<ParsingLanguages>>,
                private val layoutAware: JsonField<Boolean>,
                private val lineLevelBoundingBox: JsonField<Boolean>,
                private val markdownTableMultilineHeaderSeparator: JsonField<String>,
                private val maxPages: JsonField<Long>,
                private val maxPagesEnforced: JsonField<Long>,
                private val mergeTablesAcrossPagesInMarkdown: JsonField<Boolean>,
                private val model: JsonField<String>,
                private val outlinedTableExtraction: JsonField<Boolean>,
                private val outputPdfOfDocument: JsonField<Boolean>,
                private val outputS3PathPrefix: JsonField<String>,
                private val outputS3Region: JsonField<String>,
                private val outputTablesAsHtml: JsonField<Boolean>,
                private val outputBucket: JsonField<String>,
                private val pageErrorTolerance: JsonField<Double>,
                private val pageFooterPrefix: JsonField<String>,
                private val pageFooterSuffix: JsonField<String>,
                private val pageHeaderPrefix: JsonField<String>,
                private val pageHeaderSuffix: JsonField<String>,
                private val pagePrefix: JsonField<String>,
                private val pageSeparator: JsonField<String>,
                private val pageSuffix: JsonField<String>,
                private val parseMode: JsonField<ParsingMode>,
                private val parsingInstruction: JsonField<String>,
                private val pipelineId: JsonField<String>,
                private val preciseBoundingBox: JsonField<Boolean>,
                private val premiumMode: JsonField<Boolean>,
                private val presentationOutOfBoundsContent: JsonField<Boolean>,
                private val presentationSkipEmbeddedData: JsonField<Boolean>,
                private val preserveLayoutAlignmentAcrossPages: JsonField<Boolean>,
                private val preserveVerySmallText: JsonField<Boolean>,
                private val preset: JsonField<String>,
                private val priority: JsonField<Priority>,
                private val projectId: JsonField<String>,
                private val removeHiddenText: JsonField<Boolean>,
                private val replaceFailedPageMode: JsonField<FailPageMode>,
                private val replaceFailedPageWithErrorMessagePrefix: JsonField<String>,
                private val replaceFailedPageWithErrorMessageSuffix: JsonField<String>,
                private val resourceInfo: JsonField<ResourceInfo>,
                private val saveImages: JsonField<Boolean>,
                private val skipDiagonalText: JsonField<Boolean>,
                private val specializedChartParsingAgentic: JsonField<Boolean>,
                private val specializedChartParsingEfficient: JsonField<Boolean>,
                private val specializedChartParsingPlus: JsonField<Boolean>,
                private val specializedImageParsing: JsonField<Boolean>,
                private val spreadsheetExtractSubTables: JsonField<Boolean>,
                private val spreadsheetForceFormulaComputation: JsonField<Boolean>,
                private val spreadsheetIncludeHiddenSheets: JsonField<Boolean>,
                private val strictModeBuggyFont: JsonField<Boolean>,
                private val strictModeImageExtraction: JsonField<Boolean>,
                private val strictModeImageOcr: JsonField<Boolean>,
                private val strictModeReconstruction: JsonField<Boolean>,
                private val structuredOutput: JsonField<Boolean>,
                private val structuredOutputJsonSchema: JsonField<String>,
                private val structuredOutputJsonSchemaName: JsonField<String>,
                private val systemPrompt: JsonField<String>,
                private val systemPromptAppend: JsonField<String>,
                private val takeScreenshot: JsonField<Boolean>,
                private val targetPages: JsonField<String>,
                private val tier: JsonField<String>,
                private val type: JsonField<Type>,
                private val useVendorMultimodalModel: JsonField<Boolean>,
                private val userPrompt: JsonField<String>,
                private val vendorMultimodalApiKey: JsonField<String>,
                private val vendorMultimodalModelName: JsonField<String>,
                private val version: JsonField<String>,
                private val webhookConfigurations: JsonField<List<WebhookConfiguration>>,
                private val webhookUrl: JsonField<String>,
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
                    @JsonProperty("annotate_links")
                    @ExcludeMissing
                    annotateLinks: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("auto_mode")
                    @ExcludeMissing
                    autoMode: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("auto_mode_configuration_json")
                    @ExcludeMissing
                    autoModeConfigurationJson: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("auto_mode_trigger_on_image_in_page")
                    @ExcludeMissing
                    autoModeTriggerOnImageInPage: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("auto_mode_trigger_on_regexp_in_page")
                    @ExcludeMissing
                    autoModeTriggerOnRegexpInPage: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("auto_mode_trigger_on_table_in_page")
                    @ExcludeMissing
                    autoModeTriggerOnTableInPage: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("auto_mode_trigger_on_text_in_page")
                    @ExcludeMissing
                    autoModeTriggerOnTextInPage: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("azure_openai_api_version")
                    @ExcludeMissing
                    azureOpenAIApiVersion: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("azure_openai_deployment_name")
                    @ExcludeMissing
                    azureOpenAIDeploymentName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("azure_openai_endpoint")
                    @ExcludeMissing
                    azureOpenAIEndpoint: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("azure_openai_key")
                    @ExcludeMissing
                    azureOpenAIKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("bbox_bottom")
                    @ExcludeMissing
                    bboxBottom: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("bbox_left")
                    @ExcludeMissing
                    bboxLeft: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("bbox_right")
                    @ExcludeMissing
                    bboxRight: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("bbox_top")
                    @ExcludeMissing
                    bboxTop: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("bounding_box")
                    @ExcludeMissing
                    boundingBox: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("compact_markdown_table")
                    @ExcludeMissing
                    compactMarkdownTable: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("complemental_formatting_instruction")
                    @ExcludeMissing
                    complementalFormattingInstruction: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("content_guideline_instruction")
                    @ExcludeMissing
                    contentGuidelineInstruction: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("continuous_mode")
                    @ExcludeMissing
                    continuousMode: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("custom_metadata")
                    @ExcludeMissing
                    customMetadata: JsonField<CustomMetadata> = JsonMissing.of(),
                    @JsonProperty("disable_image_extraction")
                    @ExcludeMissing
                    disableImageExtraction: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("disable_ocr")
                    @ExcludeMissing
                    disableOcr: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("disable_reconstruction")
                    @ExcludeMissing
                    disableReconstruction: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("do_not_cache")
                    @ExcludeMissing
                    doNotCache: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("do_not_unroll_columns")
                    @ExcludeMissing
                    doNotUnrollColumns: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("enable_cost_optimizer")
                    @ExcludeMissing
                    enableCostOptimizer: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("extract_charts")
                    @ExcludeMissing
                    extractCharts: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("extract_layout")
                    @ExcludeMissing
                    extractLayout: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("extract_printed_page_number")
                    @ExcludeMissing
                    extractPrintedPageNumber: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("fast_mode")
                    @ExcludeMissing
                    fastMode: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("formatting_instruction")
                    @ExcludeMissing
                    formattingInstruction: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("gpt4o_api_key")
                    @ExcludeMissing
                    gpt4oApiKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("gpt4o_mode")
                    @ExcludeMissing
                    gpt4oMode: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("guess_xlsx_sheet_name")
                    @ExcludeMissing
                    guessXlsxSheetName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("hide_footers")
                    @ExcludeMissing
                    hideFooters: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("hide_headers")
                    @ExcludeMissing
                    hideHeaders: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("high_res_ocr")
                    @ExcludeMissing
                    highResOcr: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("html_make_all_elements_visible")
                    @ExcludeMissing
                    htmlMakeAllElementsVisible: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("html_remove_fixed_elements")
                    @ExcludeMissing
                    htmlRemoveFixedElements: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("html_remove_navigation_elements")
                    @ExcludeMissing
                    htmlRemoveNavigationElements: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("http_proxy")
                    @ExcludeMissing
                    httpProxy: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ignore_document_elements_for_layout_detection")
                    @ExcludeMissing
                    ignoreDocumentElementsForLayoutDetection: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("images_to_save")
                    @ExcludeMissing
                    imagesToSave: JsonField<List<ImagesToSave>> = JsonMissing.of(),
                    @JsonProperty("inline_images_in_markdown")
                    @ExcludeMissing
                    inlineImagesInMarkdown: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("input_s3_path")
                    @ExcludeMissing
                    inputS3Path: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("input_s3_region")
                    @ExcludeMissing
                    inputS3Region: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("input_url")
                    @ExcludeMissing
                    inputUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("internal_is_screenshot_job")
                    @ExcludeMissing
                    internalIsScreenshotJob: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("invalidate_cache")
                    @ExcludeMissing
                    invalidateCache: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("is_formatting_instruction")
                    @ExcludeMissing
                    isFormattingInstruction: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("job_timeout_extra_time_per_page_in_seconds")
                    @ExcludeMissing
                    jobTimeoutExtraTimePerPageInSeconds: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("job_timeout_in_seconds")
                    @ExcludeMissing
                    jobTimeoutInSeconds: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("keep_page_separator_when_merging_tables")
                    @ExcludeMissing
                    keepPageSeparatorWhenMergingTables: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("lang")
                    @ExcludeMissing
                    lang: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("languages")
                    @ExcludeMissing
                    languages: JsonField<List<ParsingLanguages>> = JsonMissing.of(),
                    @JsonProperty("layout_aware")
                    @ExcludeMissing
                    layoutAware: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("line_level_bounding_box")
                    @ExcludeMissing
                    lineLevelBoundingBox: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("markdown_table_multiline_header_separator")
                    @ExcludeMissing
                    markdownTableMultilineHeaderSeparator: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("max_pages")
                    @ExcludeMissing
                    maxPages: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("max_pages_enforced")
                    @ExcludeMissing
                    maxPagesEnforced: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("merge_tables_across_pages_in_markdown")
                    @ExcludeMissing
                    mergeTablesAcrossPagesInMarkdown: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("model")
                    @ExcludeMissing
                    model: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("outlined_table_extraction")
                    @ExcludeMissing
                    outlinedTableExtraction: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("output_pdf_of_document")
                    @ExcludeMissing
                    outputPdfOfDocument: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("output_s3_path_prefix")
                    @ExcludeMissing
                    outputS3PathPrefix: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("output_s3_region")
                    @ExcludeMissing
                    outputS3Region: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("output_tables_as_HTML")
                    @ExcludeMissing
                    outputTablesAsHtml: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("outputBucket")
                    @ExcludeMissing
                    outputBucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_error_tolerance")
                    @ExcludeMissing
                    pageErrorTolerance: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("page_footer_prefix")
                    @ExcludeMissing
                    pageFooterPrefix: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_footer_suffix")
                    @ExcludeMissing
                    pageFooterSuffix: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_header_prefix")
                    @ExcludeMissing
                    pageHeaderPrefix: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_header_suffix")
                    @ExcludeMissing
                    pageHeaderSuffix: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_prefix")
                    @ExcludeMissing
                    pagePrefix: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_separator")
                    @ExcludeMissing
                    pageSeparator: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_suffix")
                    @ExcludeMissing
                    pageSuffix: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("parse_mode")
                    @ExcludeMissing
                    parseMode: JsonField<ParsingMode> = JsonMissing.of(),
                    @JsonProperty("parsing_instruction")
                    @ExcludeMissing
                    parsingInstruction: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("pipeline_id")
                    @ExcludeMissing
                    pipelineId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("precise_bounding_box")
                    @ExcludeMissing
                    preciseBoundingBox: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("premium_mode")
                    @ExcludeMissing
                    premiumMode: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("presentation_out_of_bounds_content")
                    @ExcludeMissing
                    presentationOutOfBoundsContent: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("presentation_skip_embedded_data")
                    @ExcludeMissing
                    presentationSkipEmbeddedData: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("preserve_layout_alignment_across_pages")
                    @ExcludeMissing
                    preserveLayoutAlignmentAcrossPages: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("preserve_very_small_text")
                    @ExcludeMissing
                    preserveVerySmallText: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("preset")
                    @ExcludeMissing
                    preset: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("priority")
                    @ExcludeMissing
                    priority: JsonField<Priority> = JsonMissing.of(),
                    @JsonProperty("project_id")
                    @ExcludeMissing
                    projectId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("remove_hidden_text")
                    @ExcludeMissing
                    removeHiddenText: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("replace_failed_page_mode")
                    @ExcludeMissing
                    replaceFailedPageMode: JsonField<FailPageMode> = JsonMissing.of(),
                    @JsonProperty("replace_failed_page_with_error_message_prefix")
                    @ExcludeMissing
                    replaceFailedPageWithErrorMessagePrefix: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("replace_failed_page_with_error_message_suffix")
                    @ExcludeMissing
                    replaceFailedPageWithErrorMessageSuffix: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("resource_info")
                    @ExcludeMissing
                    resourceInfo: JsonField<ResourceInfo> = JsonMissing.of(),
                    @JsonProperty("save_images")
                    @ExcludeMissing
                    saveImages: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("skip_diagonal_text")
                    @ExcludeMissing
                    skipDiagonalText: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("specialized_chart_parsing_agentic")
                    @ExcludeMissing
                    specializedChartParsingAgentic: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("specialized_chart_parsing_efficient")
                    @ExcludeMissing
                    specializedChartParsingEfficient: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("specialized_chart_parsing_plus")
                    @ExcludeMissing
                    specializedChartParsingPlus: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("specialized_image_parsing")
                    @ExcludeMissing
                    specializedImageParsing: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("spreadsheet_extract_sub_tables")
                    @ExcludeMissing
                    spreadsheetExtractSubTables: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("spreadsheet_force_formula_computation")
                    @ExcludeMissing
                    spreadsheetForceFormulaComputation: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("spreadsheet_include_hidden_sheets")
                    @ExcludeMissing
                    spreadsheetIncludeHiddenSheets: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("strict_mode_buggy_font")
                    @ExcludeMissing
                    strictModeBuggyFont: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("strict_mode_image_extraction")
                    @ExcludeMissing
                    strictModeImageExtraction: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("strict_mode_image_ocr")
                    @ExcludeMissing
                    strictModeImageOcr: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("strict_mode_reconstruction")
                    @ExcludeMissing
                    strictModeReconstruction: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("structured_output")
                    @ExcludeMissing
                    structuredOutput: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("structured_output_json_schema")
                    @ExcludeMissing
                    structuredOutputJsonSchema: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("structured_output_json_schema_name")
                    @ExcludeMissing
                    structuredOutputJsonSchemaName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("system_prompt")
                    @ExcludeMissing
                    systemPrompt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("system_prompt_append")
                    @ExcludeMissing
                    systemPromptAppend: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("take_screenshot")
                    @ExcludeMissing
                    takeScreenshot: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("target_pages")
                    @ExcludeMissing
                    targetPages: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tier")
                    @ExcludeMissing
                    tier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("use_vendor_multimodal_model")
                    @ExcludeMissing
                    useVendorMultimodalModel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("user_prompt")
                    @ExcludeMissing
                    userPrompt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("vendor_multimodal_api_key")
                    @ExcludeMissing
                    vendorMultimodalApiKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("vendor_multimodal_model_name")
                    @ExcludeMissing
                    vendorMultimodalModelName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("version")
                    @ExcludeMissing
                    version: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("webhook_configurations")
                    @ExcludeMissing
                    webhookConfigurations: JsonField<List<WebhookConfiguration>> = JsonMissing.of(),
                    @JsonProperty("webhook_url")
                    @ExcludeMissing
                    webhookUrl: JsonField<String> = JsonMissing.of(),
                ) : this(
                    adaptiveLongTable,
                    aggressiveTableExtraction,
                    annotateLinks,
                    autoMode,
                    autoModeConfigurationJson,
                    autoModeTriggerOnImageInPage,
                    autoModeTriggerOnRegexpInPage,
                    autoModeTriggerOnTableInPage,
                    autoModeTriggerOnTextInPage,
                    azureOpenAIApiVersion,
                    azureOpenAIDeploymentName,
                    azureOpenAIEndpoint,
                    azureOpenAIKey,
                    bboxBottom,
                    bboxLeft,
                    bboxRight,
                    bboxTop,
                    boundingBox,
                    compactMarkdownTable,
                    complementalFormattingInstruction,
                    contentGuidelineInstruction,
                    continuousMode,
                    customMetadata,
                    disableImageExtraction,
                    disableOcr,
                    disableReconstruction,
                    doNotCache,
                    doNotUnrollColumns,
                    enableCostOptimizer,
                    extractCharts,
                    extractLayout,
                    extractPrintedPageNumber,
                    fastMode,
                    formattingInstruction,
                    gpt4oApiKey,
                    gpt4oMode,
                    guessXlsxSheetName,
                    hideFooters,
                    hideHeaders,
                    highResOcr,
                    htmlMakeAllElementsVisible,
                    htmlRemoveFixedElements,
                    htmlRemoveNavigationElements,
                    httpProxy,
                    ignoreDocumentElementsForLayoutDetection,
                    imagesToSave,
                    inlineImagesInMarkdown,
                    inputS3Path,
                    inputS3Region,
                    inputUrl,
                    internalIsScreenshotJob,
                    invalidateCache,
                    isFormattingInstruction,
                    jobTimeoutExtraTimePerPageInSeconds,
                    jobTimeoutInSeconds,
                    keepPageSeparatorWhenMergingTables,
                    lang,
                    languages,
                    layoutAware,
                    lineLevelBoundingBox,
                    markdownTableMultilineHeaderSeparator,
                    maxPages,
                    maxPagesEnforced,
                    mergeTablesAcrossPagesInMarkdown,
                    model,
                    outlinedTableExtraction,
                    outputPdfOfDocument,
                    outputS3PathPrefix,
                    outputS3Region,
                    outputTablesAsHtml,
                    outputBucket,
                    pageErrorTolerance,
                    pageFooterPrefix,
                    pageFooterSuffix,
                    pageHeaderPrefix,
                    pageHeaderSuffix,
                    pagePrefix,
                    pageSeparator,
                    pageSuffix,
                    parseMode,
                    parsingInstruction,
                    pipelineId,
                    preciseBoundingBox,
                    premiumMode,
                    presentationOutOfBoundsContent,
                    presentationSkipEmbeddedData,
                    preserveLayoutAlignmentAcrossPages,
                    preserveVerySmallText,
                    preset,
                    priority,
                    projectId,
                    removeHiddenText,
                    replaceFailedPageMode,
                    replaceFailedPageWithErrorMessagePrefix,
                    replaceFailedPageWithErrorMessageSuffix,
                    resourceInfo,
                    saveImages,
                    skipDiagonalText,
                    specializedChartParsingAgentic,
                    specializedChartParsingEfficient,
                    specializedChartParsingPlus,
                    specializedImageParsing,
                    spreadsheetExtractSubTables,
                    spreadsheetForceFormulaComputation,
                    spreadsheetIncludeHiddenSheets,
                    strictModeBuggyFont,
                    strictModeImageExtraction,
                    strictModeImageOcr,
                    strictModeReconstruction,
                    structuredOutput,
                    structuredOutputJsonSchema,
                    structuredOutputJsonSchemaName,
                    systemPrompt,
                    systemPromptAppend,
                    takeScreenshot,
                    targetPages,
                    tier,
                    type,
                    useVendorMultimodalModel,
                    userPrompt,
                    vendorMultimodalApiKey,
                    vendorMultimodalModelName,
                    version,
                    webhookConfigurations,
                    webhookUrl,
                    mutableMapOf(),
                )

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun adaptiveLongTable(): Optional<Boolean> =
                    adaptiveLongTable.getOptional("adaptive_long_table")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun aggressiveTableExtraction(): Optional<Boolean> =
                    aggressiveTableExtraction.getOptional("aggressive_table_extraction")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun annotateLinks(): Optional<Boolean> = annotateLinks.getOptional("annotate_links")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun autoMode(): Optional<Boolean> = autoMode.getOptional("auto_mode")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun autoModeConfigurationJson(): Optional<String> =
                    autoModeConfigurationJson.getOptional("auto_mode_configuration_json")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun autoModeTriggerOnImageInPage(): Optional<Boolean> =
                    autoModeTriggerOnImageInPage.getOptional("auto_mode_trigger_on_image_in_page")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun autoModeTriggerOnRegexpInPage(): Optional<String> =
                    autoModeTriggerOnRegexpInPage.getOptional("auto_mode_trigger_on_regexp_in_page")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun autoModeTriggerOnTableInPage(): Optional<Boolean> =
                    autoModeTriggerOnTableInPage.getOptional("auto_mode_trigger_on_table_in_page")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun autoModeTriggerOnTextInPage(): Optional<String> =
                    autoModeTriggerOnTextInPage.getOptional("auto_mode_trigger_on_text_in_page")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun azureOpenAIApiVersion(): Optional<String> =
                    azureOpenAIApiVersion.getOptional("azure_openai_api_version")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun azureOpenAIDeploymentName(): Optional<String> =
                    azureOpenAIDeploymentName.getOptional("azure_openai_deployment_name")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun azureOpenAIEndpoint(): Optional<String> =
                    azureOpenAIEndpoint.getOptional("azure_openai_endpoint")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun azureOpenAIKey(): Optional<String> =
                    azureOpenAIKey.getOptional("azure_openai_key")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun bboxBottom(): Optional<Double> = bboxBottom.getOptional("bbox_bottom")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun bboxLeft(): Optional<Double> = bboxLeft.getOptional("bbox_left")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun bboxRight(): Optional<Double> = bboxRight.getOptional("bbox_right")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun bboxTop(): Optional<Double> = bboxTop.getOptional("bbox_top")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun boundingBox(): Optional<String> = boundingBox.getOptional("bounding_box")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun compactMarkdownTable(): Optional<Boolean> =
                    compactMarkdownTable.getOptional("compact_markdown_table")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun complementalFormattingInstruction(): Optional<String> =
                    complementalFormattingInstruction.getOptional(
                        "complemental_formatting_instruction"
                    )

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun contentGuidelineInstruction(): Optional<String> =
                    contentGuidelineInstruction.getOptional("content_guideline_instruction")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun continuousMode(): Optional<Boolean> =
                    continuousMode.getOptional("continuous_mode")

                /**
                 * The custom metadata to attach to the documents.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun customMetadata(): Optional<CustomMetadata> =
                    customMetadata.getOptional("custom_metadata")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun disableImageExtraction(): Optional<Boolean> =
                    disableImageExtraction.getOptional("disable_image_extraction")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun disableOcr(): Optional<Boolean> = disableOcr.getOptional("disable_ocr")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun disableReconstruction(): Optional<Boolean> =
                    disableReconstruction.getOptional("disable_reconstruction")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun doNotCache(): Optional<Boolean> = doNotCache.getOptional("do_not_cache")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun doNotUnrollColumns(): Optional<Boolean> =
                    doNotUnrollColumns.getOptional("do_not_unroll_columns")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun enableCostOptimizer(): Optional<Boolean> =
                    enableCostOptimizer.getOptional("enable_cost_optimizer")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun extractCharts(): Optional<Boolean> = extractCharts.getOptional("extract_charts")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun extractLayout(): Optional<Boolean> = extractLayout.getOptional("extract_layout")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun extractPrintedPageNumber(): Optional<Boolean> =
                    extractPrintedPageNumber.getOptional("extract_printed_page_number")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun fastMode(): Optional<Boolean> = fastMode.getOptional("fast_mode")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun formattingInstruction(): Optional<String> =
                    formattingInstruction.getOptional("formatting_instruction")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun gpt4oApiKey(): Optional<String> = gpt4oApiKey.getOptional("gpt4o_api_key")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun gpt4oMode(): Optional<Boolean> = gpt4oMode.getOptional("gpt4o_mode")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun guessXlsxSheetName(): Optional<Boolean> =
                    guessXlsxSheetName.getOptional("guess_xlsx_sheet_name")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun hideFooters(): Optional<Boolean> = hideFooters.getOptional("hide_footers")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun hideHeaders(): Optional<Boolean> = hideHeaders.getOptional("hide_headers")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun highResOcr(): Optional<Boolean> = highResOcr.getOptional("high_res_ocr")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun htmlMakeAllElementsVisible(): Optional<Boolean> =
                    htmlMakeAllElementsVisible.getOptional("html_make_all_elements_visible")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun htmlRemoveFixedElements(): Optional<Boolean> =
                    htmlRemoveFixedElements.getOptional("html_remove_fixed_elements")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun htmlRemoveNavigationElements(): Optional<Boolean> =
                    htmlRemoveNavigationElements.getOptional("html_remove_navigation_elements")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun httpProxy(): Optional<String> = httpProxy.getOptional("http_proxy")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ignoreDocumentElementsForLayoutDetection(): Optional<Boolean> =
                    ignoreDocumentElementsForLayoutDetection.getOptional(
                        "ignore_document_elements_for_layout_detection"
                    )

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun imagesToSave(): Optional<List<ImagesToSave>> =
                    imagesToSave.getOptional("images_to_save")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inlineImagesInMarkdown(): Optional<Boolean> =
                    inlineImagesInMarkdown.getOptional("inline_images_in_markdown")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inputS3Path(): Optional<String> = inputS3Path.getOptional("input_s3_path")

                /**
                 * The region for the input S3 bucket.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inputS3Region(): Optional<String> = inputS3Region.getOptional("input_s3_region")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inputUrl(): Optional<String> = inputUrl.getOptional("input_url")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun internalIsScreenshotJob(): Optional<Boolean> =
                    internalIsScreenshotJob.getOptional("internal_is_screenshot_job")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun invalidateCache(): Optional<Boolean> =
                    invalidateCache.getOptional("invalidate_cache")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun isFormattingInstruction(): Optional<Boolean> =
                    isFormattingInstruction.getOptional("is_formatting_instruction")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun jobTimeoutExtraTimePerPageInSeconds(): Optional<Double> =
                    jobTimeoutExtraTimePerPageInSeconds.getOptional(
                        "job_timeout_extra_time_per_page_in_seconds"
                    )

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun jobTimeoutInSeconds(): Optional<Double> =
                    jobTimeoutInSeconds.getOptional("job_timeout_in_seconds")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun keepPageSeparatorWhenMergingTables(): Optional<Boolean> =
                    keepPageSeparatorWhenMergingTables.getOptional(
                        "keep_page_separator_when_merging_tables"
                    )

                /**
                 * The language.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun lang(): Optional<String> = lang.getOptional("lang")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun languages(): Optional<List<ParsingLanguages>> =
                    languages.getOptional("languages")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun layoutAware(): Optional<Boolean> = layoutAware.getOptional("layout_aware")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun lineLevelBoundingBox(): Optional<Boolean> =
                    lineLevelBoundingBox.getOptional("line_level_bounding_box")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun markdownTableMultilineHeaderSeparator(): Optional<String> =
                    markdownTableMultilineHeaderSeparator.getOptional(
                        "markdown_table_multiline_header_separator"
                    )

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun maxPages(): Optional<Long> = maxPages.getOptional("max_pages")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun maxPagesEnforced(): Optional<Long> =
                    maxPagesEnforced.getOptional("max_pages_enforced")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun mergeTablesAcrossPagesInMarkdown(): Optional<Boolean> =
                    mergeTablesAcrossPagesInMarkdown.getOptional(
                        "merge_tables_across_pages_in_markdown"
                    )

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun model(): Optional<String> = model.getOptional("model")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun outlinedTableExtraction(): Optional<Boolean> =
                    outlinedTableExtraction.getOptional("outlined_table_extraction")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun outputPdfOfDocument(): Optional<Boolean> =
                    outputPdfOfDocument.getOptional("output_pdf_of_document")

                /**
                 * If specified, llamaParse will save the output to the specified path. All output
                 * file will use this 'prefix' should be a valid s3:// url
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun outputS3PathPrefix(): Optional<String> =
                    outputS3PathPrefix.getOptional("output_s3_path_prefix")

                /**
                 * The region for the output S3 bucket.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun outputS3Region(): Optional<String> =
                    outputS3Region.getOptional("output_s3_region")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun outputTablesAsHtml(): Optional<Boolean> =
                    outputTablesAsHtml.getOptional("output_tables_as_HTML")

                /**
                 * The output bucket.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun outputBucket(): Optional<String> = outputBucket.getOptional("outputBucket")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pageErrorTolerance(): Optional<Double> =
                    pageErrorTolerance.getOptional("page_error_tolerance")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pageFooterPrefix(): Optional<String> =
                    pageFooterPrefix.getOptional("page_footer_prefix")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pageFooterSuffix(): Optional<String> =
                    pageFooterSuffix.getOptional("page_footer_suffix")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pageHeaderPrefix(): Optional<String> =
                    pageHeaderPrefix.getOptional("page_header_prefix")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pageHeaderSuffix(): Optional<String> =
                    pageHeaderSuffix.getOptional("page_header_suffix")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pagePrefix(): Optional<String> = pagePrefix.getOptional("page_prefix")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pageSeparator(): Optional<String> = pageSeparator.getOptional("page_separator")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pageSuffix(): Optional<String> = pageSuffix.getOptional("page_suffix")

                /**
                 * Enum for representing the mode of parsing to be used.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun parseMode(): Optional<ParsingMode> = parseMode.getOptional("parse_mode")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun parsingInstruction(): Optional<String> =
                    parsingInstruction.getOptional("parsing_instruction")

                /**
                 * The pipeline ID.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pipelineId(): Optional<String> = pipelineId.getOptional("pipeline_id")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun preciseBoundingBox(): Optional<Boolean> =
                    preciseBoundingBox.getOptional("precise_bounding_box")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun premiumMode(): Optional<Boolean> = premiumMode.getOptional("premium_mode")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun presentationOutOfBoundsContent(): Optional<Boolean> =
                    presentationOutOfBoundsContent.getOptional("presentation_out_of_bounds_content")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun presentationSkipEmbeddedData(): Optional<Boolean> =
                    presentationSkipEmbeddedData.getOptional("presentation_skip_embedded_data")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun preserveLayoutAlignmentAcrossPages(): Optional<Boolean> =
                    preserveLayoutAlignmentAcrossPages.getOptional(
                        "preserve_layout_alignment_across_pages"
                    )

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun preserveVerySmallText(): Optional<Boolean> =
                    preserveVerySmallText.getOptional("preserve_very_small_text")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun preset(): Optional<String> = preset.getOptional("preset")

                /**
                 * The priority for the request. This field may be ignored or overwritten depending
                 * on the organization tier.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun priority(): Optional<Priority> = priority.getOptional("priority")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun projectId(): Optional<String> = projectId.getOptional("project_id")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun removeHiddenText(): Optional<Boolean> =
                    removeHiddenText.getOptional("remove_hidden_text")

                /**
                 * Enum for representing the different available page error handling modes.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun replaceFailedPageMode(): Optional<FailPageMode> =
                    replaceFailedPageMode.getOptional("replace_failed_page_mode")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun replaceFailedPageWithErrorMessagePrefix(): Optional<String> =
                    replaceFailedPageWithErrorMessagePrefix.getOptional(
                        "replace_failed_page_with_error_message_prefix"
                    )

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun replaceFailedPageWithErrorMessageSuffix(): Optional<String> =
                    replaceFailedPageWithErrorMessageSuffix.getOptional(
                        "replace_failed_page_with_error_message_suffix"
                    )

                /**
                 * The resource info about the file
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun resourceInfo(): Optional<ResourceInfo> =
                    resourceInfo.getOptional("resource_info")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun saveImages(): Optional<Boolean> = saveImages.getOptional("save_images")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun skipDiagonalText(): Optional<Boolean> =
                    skipDiagonalText.getOptional("skip_diagonal_text")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun specializedChartParsingAgentic(): Optional<Boolean> =
                    specializedChartParsingAgentic.getOptional("specialized_chart_parsing_agentic")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun specializedChartParsingEfficient(): Optional<Boolean> =
                    specializedChartParsingEfficient.getOptional(
                        "specialized_chart_parsing_efficient"
                    )

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun specializedChartParsingPlus(): Optional<Boolean> =
                    specializedChartParsingPlus.getOptional("specialized_chart_parsing_plus")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun specializedImageParsing(): Optional<Boolean> =
                    specializedImageParsing.getOptional("specialized_image_parsing")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun spreadsheetExtractSubTables(): Optional<Boolean> =
                    spreadsheetExtractSubTables.getOptional("spreadsheet_extract_sub_tables")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun spreadsheetForceFormulaComputation(): Optional<Boolean> =
                    spreadsheetForceFormulaComputation.getOptional(
                        "spreadsheet_force_formula_computation"
                    )

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun spreadsheetIncludeHiddenSheets(): Optional<Boolean> =
                    spreadsheetIncludeHiddenSheets.getOptional("spreadsheet_include_hidden_sheets")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun strictModeBuggyFont(): Optional<Boolean> =
                    strictModeBuggyFont.getOptional("strict_mode_buggy_font")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun strictModeImageExtraction(): Optional<Boolean> =
                    strictModeImageExtraction.getOptional("strict_mode_image_extraction")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun strictModeImageOcr(): Optional<Boolean> =
                    strictModeImageOcr.getOptional("strict_mode_image_ocr")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun strictModeReconstruction(): Optional<Boolean> =
                    strictModeReconstruction.getOptional("strict_mode_reconstruction")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun structuredOutput(): Optional<Boolean> =
                    structuredOutput.getOptional("structured_output")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun structuredOutputJsonSchema(): Optional<String> =
                    structuredOutputJsonSchema.getOptional("structured_output_json_schema")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun structuredOutputJsonSchemaName(): Optional<String> =
                    structuredOutputJsonSchemaName.getOptional("structured_output_json_schema_name")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun systemPrompt(): Optional<String> = systemPrompt.getOptional("system_prompt")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun systemPromptAppend(): Optional<String> =
                    systemPromptAppend.getOptional("system_prompt_append")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun takeScreenshot(): Optional<Boolean> =
                    takeScreenshot.getOptional("take_screenshot")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun targetPages(): Optional<String> = targetPages.getOptional("target_pages")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tier(): Optional<String> = tier.getOptional("tier")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun useVendorMultimodalModel(): Optional<Boolean> =
                    useVendorMultimodalModel.getOptional("use_vendor_multimodal_model")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun userPrompt(): Optional<String> = userPrompt.getOptional("user_prompt")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun vendorMultimodalApiKey(): Optional<String> =
                    vendorMultimodalApiKey.getOptional("vendor_multimodal_api_key")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun vendorMultimodalModelName(): Optional<String> =
                    vendorMultimodalModelName.getOptional("vendor_multimodal_model_name")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun version(): Optional<String> = version.getOptional("version")

                /**
                 * Outbound webhook endpoints to notify on job status changes
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun webhookConfigurations(): Optional<List<WebhookConfiguration>> =
                    webhookConfigurations.getOptional("webhook_configurations")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

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
                 * Returns the raw JSON value of [annotateLinks].
                 *
                 * Unlike [annotateLinks], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("annotate_links")
                @ExcludeMissing
                fun _annotateLinks(): JsonField<Boolean> = annotateLinks

                /**
                 * Returns the raw JSON value of [autoMode].
                 *
                 * Unlike [autoMode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("auto_mode")
                @ExcludeMissing
                fun _autoMode(): JsonField<Boolean> = autoMode

                /**
                 * Returns the raw JSON value of [autoModeConfigurationJson].
                 *
                 * Unlike [autoModeConfigurationJson], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("auto_mode_configuration_json")
                @ExcludeMissing
                fun _autoModeConfigurationJson(): JsonField<String> = autoModeConfigurationJson

                /**
                 * Returns the raw JSON value of [autoModeTriggerOnImageInPage].
                 *
                 * Unlike [autoModeTriggerOnImageInPage], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("auto_mode_trigger_on_image_in_page")
                @ExcludeMissing
                fun _autoModeTriggerOnImageInPage(): JsonField<Boolean> =
                    autoModeTriggerOnImageInPage

                /**
                 * Returns the raw JSON value of [autoModeTriggerOnRegexpInPage].
                 *
                 * Unlike [autoModeTriggerOnRegexpInPage], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("auto_mode_trigger_on_regexp_in_page")
                @ExcludeMissing
                fun _autoModeTriggerOnRegexpInPage(): JsonField<String> =
                    autoModeTriggerOnRegexpInPage

                /**
                 * Returns the raw JSON value of [autoModeTriggerOnTableInPage].
                 *
                 * Unlike [autoModeTriggerOnTableInPage], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("auto_mode_trigger_on_table_in_page")
                @ExcludeMissing
                fun _autoModeTriggerOnTableInPage(): JsonField<Boolean> =
                    autoModeTriggerOnTableInPage

                /**
                 * Returns the raw JSON value of [autoModeTriggerOnTextInPage].
                 *
                 * Unlike [autoModeTriggerOnTextInPage], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("auto_mode_trigger_on_text_in_page")
                @ExcludeMissing
                fun _autoModeTriggerOnTextInPage(): JsonField<String> = autoModeTriggerOnTextInPage

                /**
                 * Returns the raw JSON value of [azureOpenAIApiVersion].
                 *
                 * Unlike [azureOpenAIApiVersion], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("azure_openai_api_version")
                @ExcludeMissing
                fun _azureOpenAIApiVersion(): JsonField<String> = azureOpenAIApiVersion

                /**
                 * Returns the raw JSON value of [azureOpenAIDeploymentName].
                 *
                 * Unlike [azureOpenAIDeploymentName], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("azure_openai_deployment_name")
                @ExcludeMissing
                fun _azureOpenAIDeploymentName(): JsonField<String> = azureOpenAIDeploymentName

                /**
                 * Returns the raw JSON value of [azureOpenAIEndpoint].
                 *
                 * Unlike [azureOpenAIEndpoint], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("azure_openai_endpoint")
                @ExcludeMissing
                fun _azureOpenAIEndpoint(): JsonField<String> = azureOpenAIEndpoint

                /**
                 * Returns the raw JSON value of [azureOpenAIKey].
                 *
                 * Unlike [azureOpenAIKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("azure_openai_key")
                @ExcludeMissing
                fun _azureOpenAIKey(): JsonField<String> = azureOpenAIKey

                /**
                 * Returns the raw JSON value of [bboxBottom].
                 *
                 * Unlike [bboxBottom], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("bbox_bottom")
                @ExcludeMissing
                fun _bboxBottom(): JsonField<Double> = bboxBottom

                /**
                 * Returns the raw JSON value of [bboxLeft].
                 *
                 * Unlike [bboxLeft], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bbox_left")
                @ExcludeMissing
                fun _bboxLeft(): JsonField<Double> = bboxLeft

                /**
                 * Returns the raw JSON value of [bboxRight].
                 *
                 * Unlike [bboxRight], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bbox_right")
                @ExcludeMissing
                fun _bboxRight(): JsonField<Double> = bboxRight

                /**
                 * Returns the raw JSON value of [bboxTop].
                 *
                 * Unlike [bboxTop], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bbox_top")
                @ExcludeMissing
                fun _bboxTop(): JsonField<Double> = bboxTop

                /**
                 * Returns the raw JSON value of [boundingBox].
                 *
                 * Unlike [boundingBox], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("bounding_box")
                @ExcludeMissing
                fun _boundingBox(): JsonField<String> = boundingBox

                /**
                 * Returns the raw JSON value of [compactMarkdownTable].
                 *
                 * Unlike [compactMarkdownTable], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("compact_markdown_table")
                @ExcludeMissing
                fun _compactMarkdownTable(): JsonField<Boolean> = compactMarkdownTable

                /**
                 * Returns the raw JSON value of [complementalFormattingInstruction].
                 *
                 * Unlike [complementalFormattingInstruction], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("complemental_formatting_instruction")
                @ExcludeMissing
                fun _complementalFormattingInstruction(): JsonField<String> =
                    complementalFormattingInstruction

                /**
                 * Returns the raw JSON value of [contentGuidelineInstruction].
                 *
                 * Unlike [contentGuidelineInstruction], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("content_guideline_instruction")
                @ExcludeMissing
                fun _contentGuidelineInstruction(): JsonField<String> = contentGuidelineInstruction

                /**
                 * Returns the raw JSON value of [continuousMode].
                 *
                 * Unlike [continuousMode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("continuous_mode")
                @ExcludeMissing
                fun _continuousMode(): JsonField<Boolean> = continuousMode

                /**
                 * Returns the raw JSON value of [customMetadata].
                 *
                 * Unlike [customMetadata], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("custom_metadata")
                @ExcludeMissing
                fun _customMetadata(): JsonField<CustomMetadata> = customMetadata

                /**
                 * Returns the raw JSON value of [disableImageExtraction].
                 *
                 * Unlike [disableImageExtraction], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("disable_image_extraction")
                @ExcludeMissing
                fun _disableImageExtraction(): JsonField<Boolean> = disableImageExtraction

                /**
                 * Returns the raw JSON value of [disableOcr].
                 *
                 * Unlike [disableOcr], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("disable_ocr")
                @ExcludeMissing
                fun _disableOcr(): JsonField<Boolean> = disableOcr

                /**
                 * Returns the raw JSON value of [disableReconstruction].
                 *
                 * Unlike [disableReconstruction], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("disable_reconstruction")
                @ExcludeMissing
                fun _disableReconstruction(): JsonField<Boolean> = disableReconstruction

                /**
                 * Returns the raw JSON value of [doNotCache].
                 *
                 * Unlike [doNotCache], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("do_not_cache")
                @ExcludeMissing
                fun _doNotCache(): JsonField<Boolean> = doNotCache

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
                 * Returns the raw JSON value of [enableCostOptimizer].
                 *
                 * Unlike [enableCostOptimizer], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("enable_cost_optimizer")
                @ExcludeMissing
                fun _enableCostOptimizer(): JsonField<Boolean> = enableCostOptimizer

                /**
                 * Returns the raw JSON value of [extractCharts].
                 *
                 * Unlike [extractCharts], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("extract_charts")
                @ExcludeMissing
                fun _extractCharts(): JsonField<Boolean> = extractCharts

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
                 * Returns the raw JSON value of [extractPrintedPageNumber].
                 *
                 * Unlike [extractPrintedPageNumber], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("extract_printed_page_number")
                @ExcludeMissing
                fun _extractPrintedPageNumber(): JsonField<Boolean> = extractPrintedPageNumber

                /**
                 * Returns the raw JSON value of [fastMode].
                 *
                 * Unlike [fastMode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fast_mode")
                @ExcludeMissing
                fun _fastMode(): JsonField<Boolean> = fastMode

                /**
                 * Returns the raw JSON value of [formattingInstruction].
                 *
                 * Unlike [formattingInstruction], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("formatting_instruction")
                @ExcludeMissing
                fun _formattingInstruction(): JsonField<String> = formattingInstruction

                /**
                 * Returns the raw JSON value of [gpt4oApiKey].
                 *
                 * Unlike [gpt4oApiKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("gpt4o_api_key")
                @ExcludeMissing
                fun _gpt4oApiKey(): JsonField<String> = gpt4oApiKey

                /**
                 * Returns the raw JSON value of [gpt4oMode].
                 *
                 * Unlike [gpt4oMode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("gpt4o_mode")
                @ExcludeMissing
                fun _gpt4oMode(): JsonField<Boolean> = gpt4oMode

                /**
                 * Returns the raw JSON value of [guessXlsxSheetName].
                 *
                 * Unlike [guessXlsxSheetName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("guess_xlsx_sheet_name")
                @ExcludeMissing
                fun _guessXlsxSheetName(): JsonField<Boolean> = guessXlsxSheetName

                /**
                 * Returns the raw JSON value of [hideFooters].
                 *
                 * Unlike [hideFooters], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("hide_footers")
                @ExcludeMissing
                fun _hideFooters(): JsonField<Boolean> = hideFooters

                /**
                 * Returns the raw JSON value of [hideHeaders].
                 *
                 * Unlike [hideHeaders], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("hide_headers")
                @ExcludeMissing
                fun _hideHeaders(): JsonField<Boolean> = hideHeaders

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
                 * Returns the raw JSON value of [htmlMakeAllElementsVisible].
                 *
                 * Unlike [htmlMakeAllElementsVisible], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("html_make_all_elements_visible")
                @ExcludeMissing
                fun _htmlMakeAllElementsVisible(): JsonField<Boolean> = htmlMakeAllElementsVisible

                /**
                 * Returns the raw JSON value of [htmlRemoveFixedElements].
                 *
                 * Unlike [htmlRemoveFixedElements], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("html_remove_fixed_elements")
                @ExcludeMissing
                fun _htmlRemoveFixedElements(): JsonField<Boolean> = htmlRemoveFixedElements

                /**
                 * Returns the raw JSON value of [htmlRemoveNavigationElements].
                 *
                 * Unlike [htmlRemoveNavigationElements], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("html_remove_navigation_elements")
                @ExcludeMissing
                fun _htmlRemoveNavigationElements(): JsonField<Boolean> =
                    htmlRemoveNavigationElements

                /**
                 * Returns the raw JSON value of [httpProxy].
                 *
                 * Unlike [httpProxy], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("http_proxy")
                @ExcludeMissing
                fun _httpProxy(): JsonField<String> = httpProxy

                /**
                 * Returns the raw JSON value of [ignoreDocumentElementsForLayoutDetection].
                 *
                 * Unlike [ignoreDocumentElementsForLayoutDetection], this method doesn't throw if
                 * the JSON field has an unexpected type.
                 */
                @JsonProperty("ignore_document_elements_for_layout_detection")
                @ExcludeMissing
                fun _ignoreDocumentElementsForLayoutDetection(): JsonField<Boolean> =
                    ignoreDocumentElementsForLayoutDetection

                /**
                 * Returns the raw JSON value of [imagesToSave].
                 *
                 * Unlike [imagesToSave], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("images_to_save")
                @ExcludeMissing
                fun _imagesToSave(): JsonField<List<ImagesToSave>> = imagesToSave

                /**
                 * Returns the raw JSON value of [inlineImagesInMarkdown].
                 *
                 * Unlike [inlineImagesInMarkdown], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("inline_images_in_markdown")
                @ExcludeMissing
                fun _inlineImagesInMarkdown(): JsonField<Boolean> = inlineImagesInMarkdown

                /**
                 * Returns the raw JSON value of [inputS3Path].
                 *
                 * Unlike [inputS3Path], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("input_s3_path")
                @ExcludeMissing
                fun _inputS3Path(): JsonField<String> = inputS3Path

                /**
                 * Returns the raw JSON value of [inputS3Region].
                 *
                 * Unlike [inputS3Region], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("input_s3_region")
                @ExcludeMissing
                fun _inputS3Region(): JsonField<String> = inputS3Region

                /**
                 * Returns the raw JSON value of [inputUrl].
                 *
                 * Unlike [inputUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("input_url")
                @ExcludeMissing
                fun _inputUrl(): JsonField<String> = inputUrl

                /**
                 * Returns the raw JSON value of [internalIsScreenshotJob].
                 *
                 * Unlike [internalIsScreenshotJob], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("internal_is_screenshot_job")
                @ExcludeMissing
                fun _internalIsScreenshotJob(): JsonField<Boolean> = internalIsScreenshotJob

                /**
                 * Returns the raw JSON value of [invalidateCache].
                 *
                 * Unlike [invalidateCache], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invalidate_cache")
                @ExcludeMissing
                fun _invalidateCache(): JsonField<Boolean> = invalidateCache

                /**
                 * Returns the raw JSON value of [isFormattingInstruction].
                 *
                 * Unlike [isFormattingInstruction], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("is_formatting_instruction")
                @ExcludeMissing
                fun _isFormattingInstruction(): JsonField<Boolean> = isFormattingInstruction

                /**
                 * Returns the raw JSON value of [jobTimeoutExtraTimePerPageInSeconds].
                 *
                 * Unlike [jobTimeoutExtraTimePerPageInSeconds], this method doesn't throw if the
                 * JSON field has an unexpected type.
                 */
                @JsonProperty("job_timeout_extra_time_per_page_in_seconds")
                @ExcludeMissing
                fun _jobTimeoutExtraTimePerPageInSeconds(): JsonField<Double> =
                    jobTimeoutExtraTimePerPageInSeconds

                /**
                 * Returns the raw JSON value of [jobTimeoutInSeconds].
                 *
                 * Unlike [jobTimeoutInSeconds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("job_timeout_in_seconds")
                @ExcludeMissing
                fun _jobTimeoutInSeconds(): JsonField<Double> = jobTimeoutInSeconds

                /**
                 * Returns the raw JSON value of [keepPageSeparatorWhenMergingTables].
                 *
                 * Unlike [keepPageSeparatorWhenMergingTables], this method doesn't throw if the
                 * JSON field has an unexpected type.
                 */
                @JsonProperty("keep_page_separator_when_merging_tables")
                @ExcludeMissing
                fun _keepPageSeparatorWhenMergingTables(): JsonField<Boolean> =
                    keepPageSeparatorWhenMergingTables

                /**
                 * Returns the raw JSON value of [lang].
                 *
                 * Unlike [lang], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("lang") @ExcludeMissing fun _lang(): JsonField<String> = lang

                /**
                 * Returns the raw JSON value of [languages].
                 *
                 * Unlike [languages], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("languages")
                @ExcludeMissing
                fun _languages(): JsonField<List<ParsingLanguages>> = languages

                /**
                 * Returns the raw JSON value of [layoutAware].
                 *
                 * Unlike [layoutAware], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("layout_aware")
                @ExcludeMissing
                fun _layoutAware(): JsonField<Boolean> = layoutAware

                /**
                 * Returns the raw JSON value of [lineLevelBoundingBox].
                 *
                 * Unlike [lineLevelBoundingBox], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("line_level_bounding_box")
                @ExcludeMissing
                fun _lineLevelBoundingBox(): JsonField<Boolean> = lineLevelBoundingBox

                /**
                 * Returns the raw JSON value of [markdownTableMultilineHeaderSeparator].
                 *
                 * Unlike [markdownTableMultilineHeaderSeparator], this method doesn't throw if the
                 * JSON field has an unexpected type.
                 */
                @JsonProperty("markdown_table_multiline_header_separator")
                @ExcludeMissing
                fun _markdownTableMultilineHeaderSeparator(): JsonField<String> =
                    markdownTableMultilineHeaderSeparator

                /**
                 * Returns the raw JSON value of [maxPages].
                 *
                 * Unlike [maxPages], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("max_pages")
                @ExcludeMissing
                fun _maxPages(): JsonField<Long> = maxPages

                /**
                 * Returns the raw JSON value of [maxPagesEnforced].
                 *
                 * Unlike [maxPagesEnforced], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("max_pages_enforced")
                @ExcludeMissing
                fun _maxPagesEnforced(): JsonField<Long> = maxPagesEnforced

                /**
                 * Returns the raw JSON value of [mergeTablesAcrossPagesInMarkdown].
                 *
                 * Unlike [mergeTablesAcrossPagesInMarkdown], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("merge_tables_across_pages_in_markdown")
                @ExcludeMissing
                fun _mergeTablesAcrossPagesInMarkdown(): JsonField<Boolean> =
                    mergeTablesAcrossPagesInMarkdown

                /**
                 * Returns the raw JSON value of [model].
                 *
                 * Unlike [model], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

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
                 * Returns the raw JSON value of [outputPdfOfDocument].
                 *
                 * Unlike [outputPdfOfDocument], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("output_pdf_of_document")
                @ExcludeMissing
                fun _outputPdfOfDocument(): JsonField<Boolean> = outputPdfOfDocument

                /**
                 * Returns the raw JSON value of [outputS3PathPrefix].
                 *
                 * Unlike [outputS3PathPrefix], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("output_s3_path_prefix")
                @ExcludeMissing
                fun _outputS3PathPrefix(): JsonField<String> = outputS3PathPrefix

                /**
                 * Returns the raw JSON value of [outputS3Region].
                 *
                 * Unlike [outputS3Region], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("output_s3_region")
                @ExcludeMissing
                fun _outputS3Region(): JsonField<String> = outputS3Region

                /**
                 * Returns the raw JSON value of [outputTablesAsHtml].
                 *
                 * Unlike [outputTablesAsHtml], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("output_tables_as_HTML")
                @ExcludeMissing
                fun _outputTablesAsHtml(): JsonField<Boolean> = outputTablesAsHtml

                /**
                 * Returns the raw JSON value of [outputBucket].
                 *
                 * Unlike [outputBucket], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("outputBucket")
                @ExcludeMissing
                fun _outputBucket(): JsonField<String> = outputBucket

                /**
                 * Returns the raw JSON value of [pageErrorTolerance].
                 *
                 * Unlike [pageErrorTolerance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_error_tolerance")
                @ExcludeMissing
                fun _pageErrorTolerance(): JsonField<Double> = pageErrorTolerance

                /**
                 * Returns the raw JSON value of [pageFooterPrefix].
                 *
                 * Unlike [pageFooterPrefix], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_footer_prefix")
                @ExcludeMissing
                fun _pageFooterPrefix(): JsonField<String> = pageFooterPrefix

                /**
                 * Returns the raw JSON value of [pageFooterSuffix].
                 *
                 * Unlike [pageFooterSuffix], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_footer_suffix")
                @ExcludeMissing
                fun _pageFooterSuffix(): JsonField<String> = pageFooterSuffix

                /**
                 * Returns the raw JSON value of [pageHeaderPrefix].
                 *
                 * Unlike [pageHeaderPrefix], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_header_prefix")
                @ExcludeMissing
                fun _pageHeaderPrefix(): JsonField<String> = pageHeaderPrefix

                /**
                 * Returns the raw JSON value of [pageHeaderSuffix].
                 *
                 * Unlike [pageHeaderSuffix], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_header_suffix")
                @ExcludeMissing
                fun _pageHeaderSuffix(): JsonField<String> = pageHeaderSuffix

                /**
                 * Returns the raw JSON value of [pagePrefix].
                 *
                 * Unlike [pagePrefix], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_prefix")
                @ExcludeMissing
                fun _pagePrefix(): JsonField<String> = pagePrefix

                /**
                 * Returns the raw JSON value of [pageSeparator].
                 *
                 * Unlike [pageSeparator], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_separator")
                @ExcludeMissing
                fun _pageSeparator(): JsonField<String> = pageSeparator

                /**
                 * Returns the raw JSON value of [pageSuffix].
                 *
                 * Unlike [pageSuffix], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_suffix")
                @ExcludeMissing
                fun _pageSuffix(): JsonField<String> = pageSuffix

                /**
                 * Returns the raw JSON value of [parseMode].
                 *
                 * Unlike [parseMode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("parse_mode")
                @ExcludeMissing
                fun _parseMode(): JsonField<ParsingMode> = parseMode

                /**
                 * Returns the raw JSON value of [parsingInstruction].
                 *
                 * Unlike [parsingInstruction], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("parsing_instruction")
                @ExcludeMissing
                fun _parsingInstruction(): JsonField<String> = parsingInstruction

                /**
                 * Returns the raw JSON value of [pipelineId].
                 *
                 * Unlike [pipelineId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("pipeline_id")
                @ExcludeMissing
                fun _pipelineId(): JsonField<String> = pipelineId

                /**
                 * Returns the raw JSON value of [preciseBoundingBox].
                 *
                 * Unlike [preciseBoundingBox], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("precise_bounding_box")
                @ExcludeMissing
                fun _preciseBoundingBox(): JsonField<Boolean> = preciseBoundingBox

                /**
                 * Returns the raw JSON value of [premiumMode].
                 *
                 * Unlike [premiumMode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("premium_mode")
                @ExcludeMissing
                fun _premiumMode(): JsonField<Boolean> = premiumMode

                /**
                 * Returns the raw JSON value of [presentationOutOfBoundsContent].
                 *
                 * Unlike [presentationOutOfBoundsContent], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("presentation_out_of_bounds_content")
                @ExcludeMissing
                fun _presentationOutOfBoundsContent(): JsonField<Boolean> =
                    presentationOutOfBoundsContent

                /**
                 * Returns the raw JSON value of [presentationSkipEmbeddedData].
                 *
                 * Unlike [presentationSkipEmbeddedData], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("presentation_skip_embedded_data")
                @ExcludeMissing
                fun _presentationSkipEmbeddedData(): JsonField<Boolean> =
                    presentationSkipEmbeddedData

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
                 * Unlike [preserveVerySmallText], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("preserve_very_small_text")
                @ExcludeMissing
                fun _preserveVerySmallText(): JsonField<Boolean> = preserveVerySmallText

                /**
                 * Returns the raw JSON value of [preset].
                 *
                 * Unlike [preset], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("preset") @ExcludeMissing fun _preset(): JsonField<String> = preset

                /**
                 * Returns the raw JSON value of [priority].
                 *
                 * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("priority")
                @ExcludeMissing
                fun _priority(): JsonField<Priority> = priority

                /**
                 * Returns the raw JSON value of [projectId].
                 *
                 * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("project_id")
                @ExcludeMissing
                fun _projectId(): JsonField<String> = projectId

                /**
                 * Returns the raw JSON value of [removeHiddenText].
                 *
                 * Unlike [removeHiddenText], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("remove_hidden_text")
                @ExcludeMissing
                fun _removeHiddenText(): JsonField<Boolean> = removeHiddenText

                /**
                 * Returns the raw JSON value of [replaceFailedPageMode].
                 *
                 * Unlike [replaceFailedPageMode], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("replace_failed_page_mode")
                @ExcludeMissing
                fun _replaceFailedPageMode(): JsonField<FailPageMode> = replaceFailedPageMode

                /**
                 * Returns the raw JSON value of [replaceFailedPageWithErrorMessagePrefix].
                 *
                 * Unlike [replaceFailedPageWithErrorMessagePrefix], this method doesn't throw if
                 * the JSON field has an unexpected type.
                 */
                @JsonProperty("replace_failed_page_with_error_message_prefix")
                @ExcludeMissing
                fun _replaceFailedPageWithErrorMessagePrefix(): JsonField<String> =
                    replaceFailedPageWithErrorMessagePrefix

                /**
                 * Returns the raw JSON value of [replaceFailedPageWithErrorMessageSuffix].
                 *
                 * Unlike [replaceFailedPageWithErrorMessageSuffix], this method doesn't throw if
                 * the JSON field has an unexpected type.
                 */
                @JsonProperty("replace_failed_page_with_error_message_suffix")
                @ExcludeMissing
                fun _replaceFailedPageWithErrorMessageSuffix(): JsonField<String> =
                    replaceFailedPageWithErrorMessageSuffix

                /**
                 * Returns the raw JSON value of [resourceInfo].
                 *
                 * Unlike [resourceInfo], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("resource_info")
                @ExcludeMissing
                fun _resourceInfo(): JsonField<ResourceInfo> = resourceInfo

                /**
                 * Returns the raw JSON value of [saveImages].
                 *
                 * Unlike [saveImages], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("save_images")
                @ExcludeMissing
                fun _saveImages(): JsonField<Boolean> = saveImages

                /**
                 * Returns the raw JSON value of [skipDiagonalText].
                 *
                 * Unlike [skipDiagonalText], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("skip_diagonal_text")
                @ExcludeMissing
                fun _skipDiagonalText(): JsonField<Boolean> = skipDiagonalText

                /**
                 * Returns the raw JSON value of [specializedChartParsingAgentic].
                 *
                 * Unlike [specializedChartParsingAgentic], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("specialized_chart_parsing_agentic")
                @ExcludeMissing
                fun _specializedChartParsingAgentic(): JsonField<Boolean> =
                    specializedChartParsingAgentic

                /**
                 * Returns the raw JSON value of [specializedChartParsingEfficient].
                 *
                 * Unlike [specializedChartParsingEfficient], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("specialized_chart_parsing_efficient")
                @ExcludeMissing
                fun _specializedChartParsingEfficient(): JsonField<Boolean> =
                    specializedChartParsingEfficient

                /**
                 * Returns the raw JSON value of [specializedChartParsingPlus].
                 *
                 * Unlike [specializedChartParsingPlus], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("specialized_chart_parsing_plus")
                @ExcludeMissing
                fun _specializedChartParsingPlus(): JsonField<Boolean> = specializedChartParsingPlus

                /**
                 * Returns the raw JSON value of [specializedImageParsing].
                 *
                 * Unlike [specializedImageParsing], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("specialized_image_parsing")
                @ExcludeMissing
                fun _specializedImageParsing(): JsonField<Boolean> = specializedImageParsing

                /**
                 * Returns the raw JSON value of [spreadsheetExtractSubTables].
                 *
                 * Unlike [spreadsheetExtractSubTables], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("spreadsheet_extract_sub_tables")
                @ExcludeMissing
                fun _spreadsheetExtractSubTables(): JsonField<Boolean> = spreadsheetExtractSubTables

                /**
                 * Returns the raw JSON value of [spreadsheetForceFormulaComputation].
                 *
                 * Unlike [spreadsheetForceFormulaComputation], this method doesn't throw if the
                 * JSON field has an unexpected type.
                 */
                @JsonProperty("spreadsheet_force_formula_computation")
                @ExcludeMissing
                fun _spreadsheetForceFormulaComputation(): JsonField<Boolean> =
                    spreadsheetForceFormulaComputation

                /**
                 * Returns the raw JSON value of [spreadsheetIncludeHiddenSheets].
                 *
                 * Unlike [spreadsheetIncludeHiddenSheets], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("spreadsheet_include_hidden_sheets")
                @ExcludeMissing
                fun _spreadsheetIncludeHiddenSheets(): JsonField<Boolean> =
                    spreadsheetIncludeHiddenSheets

                /**
                 * Returns the raw JSON value of [strictModeBuggyFont].
                 *
                 * Unlike [strictModeBuggyFont], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("strict_mode_buggy_font")
                @ExcludeMissing
                fun _strictModeBuggyFont(): JsonField<Boolean> = strictModeBuggyFont

                /**
                 * Returns the raw JSON value of [strictModeImageExtraction].
                 *
                 * Unlike [strictModeImageExtraction], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("strict_mode_image_extraction")
                @ExcludeMissing
                fun _strictModeImageExtraction(): JsonField<Boolean> = strictModeImageExtraction

                /**
                 * Returns the raw JSON value of [strictModeImageOcr].
                 *
                 * Unlike [strictModeImageOcr], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("strict_mode_image_ocr")
                @ExcludeMissing
                fun _strictModeImageOcr(): JsonField<Boolean> = strictModeImageOcr

                /**
                 * Returns the raw JSON value of [strictModeReconstruction].
                 *
                 * Unlike [strictModeReconstruction], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("strict_mode_reconstruction")
                @ExcludeMissing
                fun _strictModeReconstruction(): JsonField<Boolean> = strictModeReconstruction

                /**
                 * Returns the raw JSON value of [structuredOutput].
                 *
                 * Unlike [structuredOutput], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("structured_output")
                @ExcludeMissing
                fun _structuredOutput(): JsonField<Boolean> = structuredOutput

                /**
                 * Returns the raw JSON value of [structuredOutputJsonSchema].
                 *
                 * Unlike [structuredOutputJsonSchema], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("structured_output_json_schema")
                @ExcludeMissing
                fun _structuredOutputJsonSchema(): JsonField<String> = structuredOutputJsonSchema

                /**
                 * Returns the raw JSON value of [structuredOutputJsonSchemaName].
                 *
                 * Unlike [structuredOutputJsonSchemaName], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("structured_output_json_schema_name")
                @ExcludeMissing
                fun _structuredOutputJsonSchemaName(): JsonField<String> =
                    structuredOutputJsonSchemaName

                /**
                 * Returns the raw JSON value of [systemPrompt].
                 *
                 * Unlike [systemPrompt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("system_prompt")
                @ExcludeMissing
                fun _systemPrompt(): JsonField<String> = systemPrompt

                /**
                 * Returns the raw JSON value of [systemPromptAppend].
                 *
                 * Unlike [systemPromptAppend], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("system_prompt_append")
                @ExcludeMissing
                fun _systemPromptAppend(): JsonField<String> = systemPromptAppend

                /**
                 * Returns the raw JSON value of [takeScreenshot].
                 *
                 * Unlike [takeScreenshot], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("take_screenshot")
                @ExcludeMissing
                fun _takeScreenshot(): JsonField<Boolean> = takeScreenshot

                /**
                 * Returns the raw JSON value of [targetPages].
                 *
                 * Unlike [targetPages], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("target_pages")
                @ExcludeMissing
                fun _targetPages(): JsonField<String> = targetPages

                /**
                 * Returns the raw JSON value of [tier].
                 *
                 * Unlike [tier], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<String> = tier

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [useVendorMultimodalModel].
                 *
                 * Unlike [useVendorMultimodalModel], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("use_vendor_multimodal_model")
                @ExcludeMissing
                fun _useVendorMultimodalModel(): JsonField<Boolean> = useVendorMultimodalModel

                /**
                 * Returns the raw JSON value of [userPrompt].
                 *
                 * Unlike [userPrompt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("user_prompt")
                @ExcludeMissing
                fun _userPrompt(): JsonField<String> = userPrompt

                /**
                 * Returns the raw JSON value of [vendorMultimodalApiKey].
                 *
                 * Unlike [vendorMultimodalApiKey], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("vendor_multimodal_api_key")
                @ExcludeMissing
                fun _vendorMultimodalApiKey(): JsonField<String> = vendorMultimodalApiKey

                /**
                 * Returns the raw JSON value of [vendorMultimodalModelName].
                 *
                 * Unlike [vendorMultimodalModelName], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("vendor_multimodal_model_name")
                @ExcludeMissing
                fun _vendorMultimodalModelName(): JsonField<String> = vendorMultimodalModelName

                /**
                 * Returns the raw JSON value of [version].
                 *
                 * Unlike [version], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

                /**
                 * Returns the raw JSON value of [webhookConfigurations].
                 *
                 * Unlike [webhookConfigurations], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("webhook_configurations")
                @ExcludeMissing
                fun _webhookConfigurations(): JsonField<List<WebhookConfiguration>> =
                    webhookConfigurations

                /**
                 * Returns the raw JSON value of [webhookUrl].
                 *
                 * Unlike [webhookUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
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

                    /** Returns a mutable builder for constructing an instance of [Parameters]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Parameters]. */
                class Builder internal constructor() {

                    private var adaptiveLongTable: JsonField<Boolean> = JsonMissing.of()
                    private var aggressiveTableExtraction: JsonField<Boolean> = JsonMissing.of()
                    private var annotateLinks: JsonField<Boolean> = JsonMissing.of()
                    private var autoMode: JsonField<Boolean> = JsonMissing.of()
                    private var autoModeConfigurationJson: JsonField<String> = JsonMissing.of()
                    private var autoModeTriggerOnImageInPage: JsonField<Boolean> = JsonMissing.of()
                    private var autoModeTriggerOnRegexpInPage: JsonField<String> = JsonMissing.of()
                    private var autoModeTriggerOnTableInPage: JsonField<Boolean> = JsonMissing.of()
                    private var autoModeTriggerOnTextInPage: JsonField<String> = JsonMissing.of()
                    private var azureOpenAIApiVersion: JsonField<String> = JsonMissing.of()
                    private var azureOpenAIDeploymentName: JsonField<String> = JsonMissing.of()
                    private var azureOpenAIEndpoint: JsonField<String> = JsonMissing.of()
                    private var azureOpenAIKey: JsonField<String> = JsonMissing.of()
                    private var bboxBottom: JsonField<Double> = JsonMissing.of()
                    private var bboxLeft: JsonField<Double> = JsonMissing.of()
                    private var bboxRight: JsonField<Double> = JsonMissing.of()
                    private var bboxTop: JsonField<Double> = JsonMissing.of()
                    private var boundingBox: JsonField<String> = JsonMissing.of()
                    private var compactMarkdownTable: JsonField<Boolean> = JsonMissing.of()
                    private var complementalFormattingInstruction: JsonField<String> =
                        JsonMissing.of()
                    private var contentGuidelineInstruction: JsonField<String> = JsonMissing.of()
                    private var continuousMode: JsonField<Boolean> = JsonMissing.of()
                    private var customMetadata: JsonField<CustomMetadata> = JsonMissing.of()
                    private var disableImageExtraction: JsonField<Boolean> = JsonMissing.of()
                    private var disableOcr: JsonField<Boolean> = JsonMissing.of()
                    private var disableReconstruction: JsonField<Boolean> = JsonMissing.of()
                    private var doNotCache: JsonField<Boolean> = JsonMissing.of()
                    private var doNotUnrollColumns: JsonField<Boolean> = JsonMissing.of()
                    private var enableCostOptimizer: JsonField<Boolean> = JsonMissing.of()
                    private var extractCharts: JsonField<Boolean> = JsonMissing.of()
                    private var extractLayout: JsonField<Boolean> = JsonMissing.of()
                    private var extractPrintedPageNumber: JsonField<Boolean> = JsonMissing.of()
                    private var fastMode: JsonField<Boolean> = JsonMissing.of()
                    private var formattingInstruction: JsonField<String> = JsonMissing.of()
                    private var gpt4oApiKey: JsonField<String> = JsonMissing.of()
                    private var gpt4oMode: JsonField<Boolean> = JsonMissing.of()
                    private var guessXlsxSheetName: JsonField<Boolean> = JsonMissing.of()
                    private var hideFooters: JsonField<Boolean> = JsonMissing.of()
                    private var hideHeaders: JsonField<Boolean> = JsonMissing.of()
                    private var highResOcr: JsonField<Boolean> = JsonMissing.of()
                    private var htmlMakeAllElementsVisible: JsonField<Boolean> = JsonMissing.of()
                    private var htmlRemoveFixedElements: JsonField<Boolean> = JsonMissing.of()
                    private var htmlRemoveNavigationElements: JsonField<Boolean> = JsonMissing.of()
                    private var httpProxy: JsonField<String> = JsonMissing.of()
                    private var ignoreDocumentElementsForLayoutDetection: JsonField<Boolean> =
                        JsonMissing.of()
                    private var imagesToSave: JsonField<MutableList<ImagesToSave>>? = null
                    private var inlineImagesInMarkdown: JsonField<Boolean> = JsonMissing.of()
                    private var inputS3Path: JsonField<String> = JsonMissing.of()
                    private var inputS3Region: JsonField<String> = JsonMissing.of()
                    private var inputUrl: JsonField<String> = JsonMissing.of()
                    private var internalIsScreenshotJob: JsonField<Boolean> = JsonMissing.of()
                    private var invalidateCache: JsonField<Boolean> = JsonMissing.of()
                    private var isFormattingInstruction: JsonField<Boolean> = JsonMissing.of()
                    private var jobTimeoutExtraTimePerPageInSeconds: JsonField<Double> =
                        JsonMissing.of()
                    private var jobTimeoutInSeconds: JsonField<Double> = JsonMissing.of()
                    private var keepPageSeparatorWhenMergingTables: JsonField<Boolean> =
                        JsonMissing.of()
                    private var lang: JsonField<String> = JsonMissing.of()
                    private var languages: JsonField<MutableList<ParsingLanguages>>? = null
                    private var layoutAware: JsonField<Boolean> = JsonMissing.of()
                    private var lineLevelBoundingBox: JsonField<Boolean> = JsonMissing.of()
                    private var markdownTableMultilineHeaderSeparator: JsonField<String> =
                        JsonMissing.of()
                    private var maxPages: JsonField<Long> = JsonMissing.of()
                    private var maxPagesEnforced: JsonField<Long> = JsonMissing.of()
                    private var mergeTablesAcrossPagesInMarkdown: JsonField<Boolean> =
                        JsonMissing.of()
                    private var model: JsonField<String> = JsonMissing.of()
                    private var outlinedTableExtraction: JsonField<Boolean> = JsonMissing.of()
                    private var outputPdfOfDocument: JsonField<Boolean> = JsonMissing.of()
                    private var outputS3PathPrefix: JsonField<String> = JsonMissing.of()
                    private var outputS3Region: JsonField<String> = JsonMissing.of()
                    private var outputTablesAsHtml: JsonField<Boolean> = JsonMissing.of()
                    private var outputBucket: JsonField<String> = JsonMissing.of()
                    private var pageErrorTolerance: JsonField<Double> = JsonMissing.of()
                    private var pageFooterPrefix: JsonField<String> = JsonMissing.of()
                    private var pageFooterSuffix: JsonField<String> = JsonMissing.of()
                    private var pageHeaderPrefix: JsonField<String> = JsonMissing.of()
                    private var pageHeaderSuffix: JsonField<String> = JsonMissing.of()
                    private var pagePrefix: JsonField<String> = JsonMissing.of()
                    private var pageSeparator: JsonField<String> = JsonMissing.of()
                    private var pageSuffix: JsonField<String> = JsonMissing.of()
                    private var parseMode: JsonField<ParsingMode> = JsonMissing.of()
                    private var parsingInstruction: JsonField<String> = JsonMissing.of()
                    private var pipelineId: JsonField<String> = JsonMissing.of()
                    private var preciseBoundingBox: JsonField<Boolean> = JsonMissing.of()
                    private var premiumMode: JsonField<Boolean> = JsonMissing.of()
                    private var presentationOutOfBoundsContent: JsonField<Boolean> =
                        JsonMissing.of()
                    private var presentationSkipEmbeddedData: JsonField<Boolean> = JsonMissing.of()
                    private var preserveLayoutAlignmentAcrossPages: JsonField<Boolean> =
                        JsonMissing.of()
                    private var preserveVerySmallText: JsonField<Boolean> = JsonMissing.of()
                    private var preset: JsonField<String> = JsonMissing.of()
                    private var priority: JsonField<Priority> = JsonMissing.of()
                    private var projectId: JsonField<String> = JsonMissing.of()
                    private var removeHiddenText: JsonField<Boolean> = JsonMissing.of()
                    private var replaceFailedPageMode: JsonField<FailPageMode> = JsonMissing.of()
                    private var replaceFailedPageWithErrorMessagePrefix: JsonField<String> =
                        JsonMissing.of()
                    private var replaceFailedPageWithErrorMessageSuffix: JsonField<String> =
                        JsonMissing.of()
                    private var resourceInfo: JsonField<ResourceInfo> = JsonMissing.of()
                    private var saveImages: JsonField<Boolean> = JsonMissing.of()
                    private var skipDiagonalText: JsonField<Boolean> = JsonMissing.of()
                    private var specializedChartParsingAgentic: JsonField<Boolean> =
                        JsonMissing.of()
                    private var specializedChartParsingEfficient: JsonField<Boolean> =
                        JsonMissing.of()
                    private var specializedChartParsingPlus: JsonField<Boolean> = JsonMissing.of()
                    private var specializedImageParsing: JsonField<Boolean> = JsonMissing.of()
                    private var spreadsheetExtractSubTables: JsonField<Boolean> = JsonMissing.of()
                    private var spreadsheetForceFormulaComputation: JsonField<Boolean> =
                        JsonMissing.of()
                    private var spreadsheetIncludeHiddenSheets: JsonField<Boolean> =
                        JsonMissing.of()
                    private var strictModeBuggyFont: JsonField<Boolean> = JsonMissing.of()
                    private var strictModeImageExtraction: JsonField<Boolean> = JsonMissing.of()
                    private var strictModeImageOcr: JsonField<Boolean> = JsonMissing.of()
                    private var strictModeReconstruction: JsonField<Boolean> = JsonMissing.of()
                    private var structuredOutput: JsonField<Boolean> = JsonMissing.of()
                    private var structuredOutputJsonSchema: JsonField<String> = JsonMissing.of()
                    private var structuredOutputJsonSchemaName: JsonField<String> = JsonMissing.of()
                    private var systemPrompt: JsonField<String> = JsonMissing.of()
                    private var systemPromptAppend: JsonField<String> = JsonMissing.of()
                    private var takeScreenshot: JsonField<Boolean> = JsonMissing.of()
                    private var targetPages: JsonField<String> = JsonMissing.of()
                    private var tier: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var useVendorMultimodalModel: JsonField<Boolean> = JsonMissing.of()
                    private var userPrompt: JsonField<String> = JsonMissing.of()
                    private var vendorMultimodalApiKey: JsonField<String> = JsonMissing.of()
                    private var vendorMultimodalModelName: JsonField<String> = JsonMissing.of()
                    private var version: JsonField<String> = JsonMissing.of()
                    private var webhookConfigurations:
                        JsonField<MutableList<WebhookConfiguration>>? =
                        null
                    private var webhookUrl: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(parameters: Parameters) = apply {
                        adaptiveLongTable = parameters.adaptiveLongTable
                        aggressiveTableExtraction = parameters.aggressiveTableExtraction
                        annotateLinks = parameters.annotateLinks
                        autoMode = parameters.autoMode
                        autoModeConfigurationJson = parameters.autoModeConfigurationJson
                        autoModeTriggerOnImageInPage = parameters.autoModeTriggerOnImageInPage
                        autoModeTriggerOnRegexpInPage = parameters.autoModeTriggerOnRegexpInPage
                        autoModeTriggerOnTableInPage = parameters.autoModeTriggerOnTableInPage
                        autoModeTriggerOnTextInPage = parameters.autoModeTriggerOnTextInPage
                        azureOpenAIApiVersion = parameters.azureOpenAIApiVersion
                        azureOpenAIDeploymentName = parameters.azureOpenAIDeploymentName
                        azureOpenAIEndpoint = parameters.azureOpenAIEndpoint
                        azureOpenAIKey = parameters.azureOpenAIKey
                        bboxBottom = parameters.bboxBottom
                        bboxLeft = parameters.bboxLeft
                        bboxRight = parameters.bboxRight
                        bboxTop = parameters.bboxTop
                        boundingBox = parameters.boundingBox
                        compactMarkdownTable = parameters.compactMarkdownTable
                        complementalFormattingInstruction =
                            parameters.complementalFormattingInstruction
                        contentGuidelineInstruction = parameters.contentGuidelineInstruction
                        continuousMode = parameters.continuousMode
                        customMetadata = parameters.customMetadata
                        disableImageExtraction = parameters.disableImageExtraction
                        disableOcr = parameters.disableOcr
                        disableReconstruction = parameters.disableReconstruction
                        doNotCache = parameters.doNotCache
                        doNotUnrollColumns = parameters.doNotUnrollColumns
                        enableCostOptimizer = parameters.enableCostOptimizer
                        extractCharts = parameters.extractCharts
                        extractLayout = parameters.extractLayout
                        extractPrintedPageNumber = parameters.extractPrintedPageNumber
                        fastMode = parameters.fastMode
                        formattingInstruction = parameters.formattingInstruction
                        gpt4oApiKey = parameters.gpt4oApiKey
                        gpt4oMode = parameters.gpt4oMode
                        guessXlsxSheetName = parameters.guessXlsxSheetName
                        hideFooters = parameters.hideFooters
                        hideHeaders = parameters.hideHeaders
                        highResOcr = parameters.highResOcr
                        htmlMakeAllElementsVisible = parameters.htmlMakeAllElementsVisible
                        htmlRemoveFixedElements = parameters.htmlRemoveFixedElements
                        htmlRemoveNavigationElements = parameters.htmlRemoveNavigationElements
                        httpProxy = parameters.httpProxy
                        ignoreDocumentElementsForLayoutDetection =
                            parameters.ignoreDocumentElementsForLayoutDetection
                        imagesToSave = parameters.imagesToSave.map { it.toMutableList() }
                        inlineImagesInMarkdown = parameters.inlineImagesInMarkdown
                        inputS3Path = parameters.inputS3Path
                        inputS3Region = parameters.inputS3Region
                        inputUrl = parameters.inputUrl
                        internalIsScreenshotJob = parameters.internalIsScreenshotJob
                        invalidateCache = parameters.invalidateCache
                        isFormattingInstruction = parameters.isFormattingInstruction
                        jobTimeoutExtraTimePerPageInSeconds =
                            parameters.jobTimeoutExtraTimePerPageInSeconds
                        jobTimeoutInSeconds = parameters.jobTimeoutInSeconds
                        keepPageSeparatorWhenMergingTables =
                            parameters.keepPageSeparatorWhenMergingTables
                        lang = parameters.lang
                        languages = parameters.languages.map { it.toMutableList() }
                        layoutAware = parameters.layoutAware
                        lineLevelBoundingBox = parameters.lineLevelBoundingBox
                        markdownTableMultilineHeaderSeparator =
                            parameters.markdownTableMultilineHeaderSeparator
                        maxPages = parameters.maxPages
                        maxPagesEnforced = parameters.maxPagesEnforced
                        mergeTablesAcrossPagesInMarkdown =
                            parameters.mergeTablesAcrossPagesInMarkdown
                        model = parameters.model
                        outlinedTableExtraction = parameters.outlinedTableExtraction
                        outputPdfOfDocument = parameters.outputPdfOfDocument
                        outputS3PathPrefix = parameters.outputS3PathPrefix
                        outputS3Region = parameters.outputS3Region
                        outputTablesAsHtml = parameters.outputTablesAsHtml
                        outputBucket = parameters.outputBucket
                        pageErrorTolerance = parameters.pageErrorTolerance
                        pageFooterPrefix = parameters.pageFooterPrefix
                        pageFooterSuffix = parameters.pageFooterSuffix
                        pageHeaderPrefix = parameters.pageHeaderPrefix
                        pageHeaderSuffix = parameters.pageHeaderSuffix
                        pagePrefix = parameters.pagePrefix
                        pageSeparator = parameters.pageSeparator
                        pageSuffix = parameters.pageSuffix
                        parseMode = parameters.parseMode
                        parsingInstruction = parameters.parsingInstruction
                        pipelineId = parameters.pipelineId
                        preciseBoundingBox = parameters.preciseBoundingBox
                        premiumMode = parameters.premiumMode
                        presentationOutOfBoundsContent = parameters.presentationOutOfBoundsContent
                        presentationSkipEmbeddedData = parameters.presentationSkipEmbeddedData
                        preserveLayoutAlignmentAcrossPages =
                            parameters.preserveLayoutAlignmentAcrossPages
                        preserveVerySmallText = parameters.preserveVerySmallText
                        preset = parameters.preset
                        priority = parameters.priority
                        projectId = parameters.projectId
                        removeHiddenText = parameters.removeHiddenText
                        replaceFailedPageMode = parameters.replaceFailedPageMode
                        replaceFailedPageWithErrorMessagePrefix =
                            parameters.replaceFailedPageWithErrorMessagePrefix
                        replaceFailedPageWithErrorMessageSuffix =
                            parameters.replaceFailedPageWithErrorMessageSuffix
                        resourceInfo = parameters.resourceInfo
                        saveImages = parameters.saveImages
                        skipDiagonalText = parameters.skipDiagonalText
                        specializedChartParsingAgentic = parameters.specializedChartParsingAgentic
                        specializedChartParsingEfficient =
                            parameters.specializedChartParsingEfficient
                        specializedChartParsingPlus = parameters.specializedChartParsingPlus
                        specializedImageParsing = parameters.specializedImageParsing
                        spreadsheetExtractSubTables = parameters.spreadsheetExtractSubTables
                        spreadsheetForceFormulaComputation =
                            parameters.spreadsheetForceFormulaComputation
                        spreadsheetIncludeHiddenSheets = parameters.spreadsheetIncludeHiddenSheets
                        strictModeBuggyFont = parameters.strictModeBuggyFont
                        strictModeImageExtraction = parameters.strictModeImageExtraction
                        strictModeImageOcr = parameters.strictModeImageOcr
                        strictModeReconstruction = parameters.strictModeReconstruction
                        structuredOutput = parameters.structuredOutput
                        structuredOutputJsonSchema = parameters.structuredOutputJsonSchema
                        structuredOutputJsonSchemaName = parameters.structuredOutputJsonSchemaName
                        systemPrompt = parameters.systemPrompt
                        systemPromptAppend = parameters.systemPromptAppend
                        takeScreenshot = parameters.takeScreenshot
                        targetPages = parameters.targetPages
                        tier = parameters.tier
                        type = parameters.type
                        useVendorMultimodalModel = parameters.useVendorMultimodalModel
                        userPrompt = parameters.userPrompt
                        vendorMultimodalApiKey = parameters.vendorMultimodalApiKey
                        vendorMultimodalModelName = parameters.vendorMultimodalModelName
                        version = parameters.version
                        webhookConfigurations =
                            parameters.webhookConfigurations.map { it.toMutableList() }
                        webhookUrl = parameters.webhookUrl
                        additionalProperties = parameters.additionalProperties.toMutableMap()
                    }

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

                    fun annotateLinks(annotateLinks: Boolean?) =
                        annotateLinks(JsonField.ofNullable(annotateLinks))

                    /**
                     * Alias for [Builder.annotateLinks].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun annotateLinks(annotateLinks: Boolean) =
                        annotateLinks(annotateLinks as Boolean?)

                    /**
                     * Alias for calling [Builder.annotateLinks] with `annotateLinks.orElse(null)`.
                     */
                    fun annotateLinks(annotateLinks: Optional<Boolean>) =
                        annotateLinks(annotateLinks.getOrNull())

                    /**
                     * Sets [Builder.annotateLinks] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.annotateLinks] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun annotateLinks(annotateLinks: JsonField<Boolean>) = apply {
                        this.annotateLinks = annotateLinks
                    }

                    fun autoMode(autoMode: Boolean?) = autoMode(JsonField.ofNullable(autoMode))

                    /**
                     * Alias for [Builder.autoMode].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun autoMode(autoMode: Boolean) = autoMode(autoMode as Boolean?)

                    /** Alias for calling [Builder.autoMode] with `autoMode.orElse(null)`. */
                    fun autoMode(autoMode: Optional<Boolean>) = autoMode(autoMode.getOrNull())

                    /**
                     * Sets [Builder.autoMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.autoMode] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun autoMode(autoMode: JsonField<Boolean>) = apply { this.autoMode = autoMode }

                    fun autoModeConfigurationJson(autoModeConfigurationJson: String?) =
                        autoModeConfigurationJson(JsonField.ofNullable(autoModeConfigurationJson))

                    /**
                     * Alias for calling [Builder.autoModeConfigurationJson] with
                     * `autoModeConfigurationJson.orElse(null)`.
                     */
                    fun autoModeConfigurationJson(autoModeConfigurationJson: Optional<String>) =
                        autoModeConfigurationJson(autoModeConfigurationJson.getOrNull())

                    /**
                     * Sets [Builder.autoModeConfigurationJson] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.autoModeConfigurationJson] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun autoModeConfigurationJson(autoModeConfigurationJson: JsonField<String>) =
                        apply {
                            this.autoModeConfigurationJson = autoModeConfigurationJson
                        }

                    fun autoModeTriggerOnImageInPage(autoModeTriggerOnImageInPage: Boolean?) =
                        autoModeTriggerOnImageInPage(
                            JsonField.ofNullable(autoModeTriggerOnImageInPage)
                        )

                    /**
                     * Alias for [Builder.autoModeTriggerOnImageInPage].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun autoModeTriggerOnImageInPage(autoModeTriggerOnImageInPage: Boolean) =
                        autoModeTriggerOnImageInPage(autoModeTriggerOnImageInPage as Boolean?)

                    /**
                     * Alias for calling [Builder.autoModeTriggerOnImageInPage] with
                     * `autoModeTriggerOnImageInPage.orElse(null)`.
                     */
                    fun autoModeTriggerOnImageInPage(
                        autoModeTriggerOnImageInPage: Optional<Boolean>
                    ) = autoModeTriggerOnImageInPage(autoModeTriggerOnImageInPage.getOrNull())

                    /**
                     * Sets [Builder.autoModeTriggerOnImageInPage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.autoModeTriggerOnImageInPage] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun autoModeTriggerOnImageInPage(
                        autoModeTriggerOnImageInPage: JsonField<Boolean>
                    ) = apply { this.autoModeTriggerOnImageInPage = autoModeTriggerOnImageInPage }

                    fun autoModeTriggerOnRegexpInPage(autoModeTriggerOnRegexpInPage: String?) =
                        autoModeTriggerOnRegexpInPage(
                            JsonField.ofNullable(autoModeTriggerOnRegexpInPage)
                        )

                    /**
                     * Alias for calling [Builder.autoModeTriggerOnRegexpInPage] with
                     * `autoModeTriggerOnRegexpInPage.orElse(null)`.
                     */
                    fun autoModeTriggerOnRegexpInPage(
                        autoModeTriggerOnRegexpInPage: Optional<String>
                    ) = autoModeTriggerOnRegexpInPage(autoModeTriggerOnRegexpInPage.getOrNull())

                    /**
                     * Sets [Builder.autoModeTriggerOnRegexpInPage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.autoModeTriggerOnRegexpInPage] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun autoModeTriggerOnRegexpInPage(
                        autoModeTriggerOnRegexpInPage: JsonField<String>
                    ) = apply { this.autoModeTriggerOnRegexpInPage = autoModeTriggerOnRegexpInPage }

                    fun autoModeTriggerOnTableInPage(autoModeTriggerOnTableInPage: Boolean?) =
                        autoModeTriggerOnTableInPage(
                            JsonField.ofNullable(autoModeTriggerOnTableInPage)
                        )

                    /**
                     * Alias for [Builder.autoModeTriggerOnTableInPage].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun autoModeTriggerOnTableInPage(autoModeTriggerOnTableInPage: Boolean) =
                        autoModeTriggerOnTableInPage(autoModeTriggerOnTableInPage as Boolean?)

                    /**
                     * Alias for calling [Builder.autoModeTriggerOnTableInPage] with
                     * `autoModeTriggerOnTableInPage.orElse(null)`.
                     */
                    fun autoModeTriggerOnTableInPage(
                        autoModeTriggerOnTableInPage: Optional<Boolean>
                    ) = autoModeTriggerOnTableInPage(autoModeTriggerOnTableInPage.getOrNull())

                    /**
                     * Sets [Builder.autoModeTriggerOnTableInPage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.autoModeTriggerOnTableInPage] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun autoModeTriggerOnTableInPage(
                        autoModeTriggerOnTableInPage: JsonField<Boolean>
                    ) = apply { this.autoModeTriggerOnTableInPage = autoModeTriggerOnTableInPage }

                    fun autoModeTriggerOnTextInPage(autoModeTriggerOnTextInPage: String?) =
                        autoModeTriggerOnTextInPage(
                            JsonField.ofNullable(autoModeTriggerOnTextInPage)
                        )

                    /**
                     * Alias for calling [Builder.autoModeTriggerOnTextInPage] with
                     * `autoModeTriggerOnTextInPage.orElse(null)`.
                     */
                    fun autoModeTriggerOnTextInPage(autoModeTriggerOnTextInPage: Optional<String>) =
                        autoModeTriggerOnTextInPage(autoModeTriggerOnTextInPage.getOrNull())

                    /**
                     * Sets [Builder.autoModeTriggerOnTextInPage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.autoModeTriggerOnTextInPage] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun autoModeTriggerOnTextInPage(
                        autoModeTriggerOnTextInPage: JsonField<String>
                    ) = apply { this.autoModeTriggerOnTextInPage = autoModeTriggerOnTextInPage }

                    fun azureOpenAIApiVersion(azureOpenAIApiVersion: String?) =
                        azureOpenAIApiVersion(JsonField.ofNullable(azureOpenAIApiVersion))

                    /**
                     * Alias for calling [Builder.azureOpenAIApiVersion] with
                     * `azureOpenAIApiVersion.orElse(null)`.
                     */
                    fun azureOpenAIApiVersion(azureOpenAIApiVersion: Optional<String>) =
                        azureOpenAIApiVersion(azureOpenAIApiVersion.getOrNull())

                    /**
                     * Sets [Builder.azureOpenAIApiVersion] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.azureOpenAIApiVersion] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun azureOpenAIApiVersion(azureOpenAIApiVersion: JsonField<String>) = apply {
                        this.azureOpenAIApiVersion = azureOpenAIApiVersion
                    }

                    fun azureOpenAIDeploymentName(azureOpenAIDeploymentName: String?) =
                        azureOpenAIDeploymentName(JsonField.ofNullable(azureOpenAIDeploymentName))

                    /**
                     * Alias for calling [Builder.azureOpenAIDeploymentName] with
                     * `azureOpenAIDeploymentName.orElse(null)`.
                     */
                    fun azureOpenAIDeploymentName(azureOpenAIDeploymentName: Optional<String>) =
                        azureOpenAIDeploymentName(azureOpenAIDeploymentName.getOrNull())

                    /**
                     * Sets [Builder.azureOpenAIDeploymentName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.azureOpenAIDeploymentName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun azureOpenAIDeploymentName(azureOpenAIDeploymentName: JsonField<String>) =
                        apply {
                            this.azureOpenAIDeploymentName = azureOpenAIDeploymentName
                        }

                    fun azureOpenAIEndpoint(azureOpenAIEndpoint: String?) =
                        azureOpenAIEndpoint(JsonField.ofNullable(azureOpenAIEndpoint))

                    /**
                     * Alias for calling [Builder.azureOpenAIEndpoint] with
                     * `azureOpenAIEndpoint.orElse(null)`.
                     */
                    fun azureOpenAIEndpoint(azureOpenAIEndpoint: Optional<String>) =
                        azureOpenAIEndpoint(azureOpenAIEndpoint.getOrNull())

                    /**
                     * Sets [Builder.azureOpenAIEndpoint] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.azureOpenAIEndpoint] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun azureOpenAIEndpoint(azureOpenAIEndpoint: JsonField<String>) = apply {
                        this.azureOpenAIEndpoint = azureOpenAIEndpoint
                    }

                    fun azureOpenAIKey(azureOpenAIKey: String?) =
                        azureOpenAIKey(JsonField.ofNullable(azureOpenAIKey))

                    /**
                     * Alias for calling [Builder.azureOpenAIKey] with
                     * `azureOpenAIKey.orElse(null)`.
                     */
                    fun azureOpenAIKey(azureOpenAIKey: Optional<String>) =
                        azureOpenAIKey(azureOpenAIKey.getOrNull())

                    /**
                     * Sets [Builder.azureOpenAIKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.azureOpenAIKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun azureOpenAIKey(azureOpenAIKey: JsonField<String>) = apply {
                        this.azureOpenAIKey = azureOpenAIKey
                    }

                    fun bboxBottom(bboxBottom: Double?) =
                        bboxBottom(JsonField.ofNullable(bboxBottom))

                    /**
                     * Alias for [Builder.bboxBottom].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun bboxBottom(bboxBottom: Double) = bboxBottom(bboxBottom as Double?)

                    /** Alias for calling [Builder.bboxBottom] with `bboxBottom.orElse(null)`. */
                    fun bboxBottom(bboxBottom: Optional<Double>) =
                        bboxBottom(bboxBottom.getOrNull())

                    /**
                     * Sets [Builder.bboxBottom] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bboxBottom] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bboxBottom(bboxBottom: JsonField<Double>) = apply {
                        this.bboxBottom = bboxBottom
                    }

                    fun bboxLeft(bboxLeft: Double?) = bboxLeft(JsonField.ofNullable(bboxLeft))

                    /**
                     * Alias for [Builder.bboxLeft].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun bboxLeft(bboxLeft: Double) = bboxLeft(bboxLeft as Double?)

                    /** Alias for calling [Builder.bboxLeft] with `bboxLeft.orElse(null)`. */
                    fun bboxLeft(bboxLeft: Optional<Double>) = bboxLeft(bboxLeft.getOrNull())

                    /**
                     * Sets [Builder.bboxLeft] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bboxLeft] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bboxLeft(bboxLeft: JsonField<Double>) = apply { this.bboxLeft = bboxLeft }

                    fun bboxRight(bboxRight: Double?) = bboxRight(JsonField.ofNullable(bboxRight))

                    /**
                     * Alias for [Builder.bboxRight].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun bboxRight(bboxRight: Double) = bboxRight(bboxRight as Double?)

                    /** Alias for calling [Builder.bboxRight] with `bboxRight.orElse(null)`. */
                    fun bboxRight(bboxRight: Optional<Double>) = bboxRight(bboxRight.getOrNull())

                    /**
                     * Sets [Builder.bboxRight] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bboxRight] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bboxRight(bboxRight: JsonField<Double>) = apply {
                        this.bboxRight = bboxRight
                    }

                    fun bboxTop(bboxTop: Double?) = bboxTop(JsonField.ofNullable(bboxTop))

                    /**
                     * Alias for [Builder.bboxTop].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun bboxTop(bboxTop: Double) = bboxTop(bboxTop as Double?)

                    /** Alias for calling [Builder.bboxTop] with `bboxTop.orElse(null)`. */
                    fun bboxTop(bboxTop: Optional<Double>) = bboxTop(bboxTop.getOrNull())

                    /**
                     * Sets [Builder.bboxTop] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bboxTop] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bboxTop(bboxTop: JsonField<Double>) = apply { this.bboxTop = bboxTop }

                    fun boundingBox(boundingBox: String?) =
                        boundingBox(JsonField.ofNullable(boundingBox))

                    /** Alias for calling [Builder.boundingBox] with `boundingBox.orElse(null)`. */
                    fun boundingBox(boundingBox: Optional<String>) =
                        boundingBox(boundingBox.getOrNull())

                    /**
                     * Sets [Builder.boundingBox] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.boundingBox] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun boundingBox(boundingBox: JsonField<String>) = apply {
                        this.boundingBox = boundingBox
                    }

                    fun compactMarkdownTable(compactMarkdownTable: Boolean?) =
                        compactMarkdownTable(JsonField.ofNullable(compactMarkdownTable))

                    /**
                     * Alias for [Builder.compactMarkdownTable].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun compactMarkdownTable(compactMarkdownTable: Boolean) =
                        compactMarkdownTable(compactMarkdownTable as Boolean?)

                    /**
                     * Alias for calling [Builder.compactMarkdownTable] with
                     * `compactMarkdownTable.orElse(null)`.
                     */
                    fun compactMarkdownTable(compactMarkdownTable: Optional<Boolean>) =
                        compactMarkdownTable(compactMarkdownTable.getOrNull())

                    /**
                     * Sets [Builder.compactMarkdownTable] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.compactMarkdownTable] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun compactMarkdownTable(compactMarkdownTable: JsonField<Boolean>) = apply {
                        this.compactMarkdownTable = compactMarkdownTable
                    }

                    fun complementalFormattingInstruction(
                        complementalFormattingInstruction: String?
                    ) =
                        complementalFormattingInstruction(
                            JsonField.ofNullable(complementalFormattingInstruction)
                        )

                    /**
                     * Alias for calling [Builder.complementalFormattingInstruction] with
                     * `complementalFormattingInstruction.orElse(null)`.
                     */
                    fun complementalFormattingInstruction(
                        complementalFormattingInstruction: Optional<String>
                    ) =
                        complementalFormattingInstruction(
                            complementalFormattingInstruction.getOrNull()
                        )

                    /**
                     * Sets [Builder.complementalFormattingInstruction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.complementalFormattingInstruction] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun complementalFormattingInstruction(
                        complementalFormattingInstruction: JsonField<String>
                    ) = apply {
                        this.complementalFormattingInstruction = complementalFormattingInstruction
                    }

                    fun contentGuidelineInstruction(contentGuidelineInstruction: String?) =
                        contentGuidelineInstruction(
                            JsonField.ofNullable(contentGuidelineInstruction)
                        )

                    /**
                     * Alias for calling [Builder.contentGuidelineInstruction] with
                     * `contentGuidelineInstruction.orElse(null)`.
                     */
                    fun contentGuidelineInstruction(contentGuidelineInstruction: Optional<String>) =
                        contentGuidelineInstruction(contentGuidelineInstruction.getOrNull())

                    /**
                     * Sets [Builder.contentGuidelineInstruction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contentGuidelineInstruction] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun contentGuidelineInstruction(
                        contentGuidelineInstruction: JsonField<String>
                    ) = apply { this.contentGuidelineInstruction = contentGuidelineInstruction }

                    fun continuousMode(continuousMode: Boolean?) =
                        continuousMode(JsonField.ofNullable(continuousMode))

                    /**
                     * Alias for [Builder.continuousMode].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun continuousMode(continuousMode: Boolean) =
                        continuousMode(continuousMode as Boolean?)

                    /**
                     * Alias for calling [Builder.continuousMode] with
                     * `continuousMode.orElse(null)`.
                     */
                    fun continuousMode(continuousMode: Optional<Boolean>) =
                        continuousMode(continuousMode.getOrNull())

                    /**
                     * Sets [Builder.continuousMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.continuousMode] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun continuousMode(continuousMode: JsonField<Boolean>) = apply {
                        this.continuousMode = continuousMode
                    }

                    /** The custom metadata to attach to the documents. */
                    fun customMetadata(customMetadata: CustomMetadata?) =
                        customMetadata(JsonField.ofNullable(customMetadata))

                    /**
                     * Alias for calling [Builder.customMetadata] with
                     * `customMetadata.orElse(null)`.
                     */
                    fun customMetadata(customMetadata: Optional<CustomMetadata>) =
                        customMetadata(customMetadata.getOrNull())

                    /**
                     * Sets [Builder.customMetadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.customMetadata] with a well-typed
                     * [CustomMetadata] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun customMetadata(customMetadata: JsonField<CustomMetadata>) = apply {
                        this.customMetadata = customMetadata
                    }

                    fun disableImageExtraction(disableImageExtraction: Boolean?) =
                        disableImageExtraction(JsonField.ofNullable(disableImageExtraction))

                    /**
                     * Alias for [Builder.disableImageExtraction].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun disableImageExtraction(disableImageExtraction: Boolean) =
                        disableImageExtraction(disableImageExtraction as Boolean?)

                    /**
                     * Alias for calling [Builder.disableImageExtraction] with
                     * `disableImageExtraction.orElse(null)`.
                     */
                    fun disableImageExtraction(disableImageExtraction: Optional<Boolean>) =
                        disableImageExtraction(disableImageExtraction.getOrNull())

                    /**
                     * Sets [Builder.disableImageExtraction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.disableImageExtraction] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun disableImageExtraction(disableImageExtraction: JsonField<Boolean>) = apply {
                        this.disableImageExtraction = disableImageExtraction
                    }

                    fun disableOcr(disableOcr: Boolean?) =
                        disableOcr(JsonField.ofNullable(disableOcr))

                    /**
                     * Alias for [Builder.disableOcr].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun disableOcr(disableOcr: Boolean) = disableOcr(disableOcr as Boolean?)

                    /** Alias for calling [Builder.disableOcr] with `disableOcr.orElse(null)`. */
                    fun disableOcr(disableOcr: Optional<Boolean>) =
                        disableOcr(disableOcr.getOrNull())

                    /**
                     * Sets [Builder.disableOcr] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.disableOcr] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun disableOcr(disableOcr: JsonField<Boolean>) = apply {
                        this.disableOcr = disableOcr
                    }

                    fun disableReconstruction(disableReconstruction: Boolean?) =
                        disableReconstruction(JsonField.ofNullable(disableReconstruction))

                    /**
                     * Alias for [Builder.disableReconstruction].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun disableReconstruction(disableReconstruction: Boolean) =
                        disableReconstruction(disableReconstruction as Boolean?)

                    /**
                     * Alias for calling [Builder.disableReconstruction] with
                     * `disableReconstruction.orElse(null)`.
                     */
                    fun disableReconstruction(disableReconstruction: Optional<Boolean>) =
                        disableReconstruction(disableReconstruction.getOrNull())

                    /**
                     * Sets [Builder.disableReconstruction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.disableReconstruction] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun disableReconstruction(disableReconstruction: JsonField<Boolean>) = apply {
                        this.disableReconstruction = disableReconstruction
                    }

                    fun doNotCache(doNotCache: Boolean?) =
                        doNotCache(JsonField.ofNullable(doNotCache))

                    /**
                     * Alias for [Builder.doNotCache].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun doNotCache(doNotCache: Boolean) = doNotCache(doNotCache as Boolean?)

                    /** Alias for calling [Builder.doNotCache] with `doNotCache.orElse(null)`. */
                    fun doNotCache(doNotCache: Optional<Boolean>) =
                        doNotCache(doNotCache.getOrNull())

                    /**
                     * Sets [Builder.doNotCache] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.doNotCache] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun doNotCache(doNotCache: JsonField<Boolean>) = apply {
                        this.doNotCache = doNotCache
                    }

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
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun doNotUnrollColumns(doNotUnrollColumns: JsonField<Boolean>) = apply {
                        this.doNotUnrollColumns = doNotUnrollColumns
                    }

                    fun enableCostOptimizer(enableCostOptimizer: Boolean?) =
                        enableCostOptimizer(JsonField.ofNullable(enableCostOptimizer))

                    /**
                     * Alias for [Builder.enableCostOptimizer].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun enableCostOptimizer(enableCostOptimizer: Boolean) =
                        enableCostOptimizer(enableCostOptimizer as Boolean?)

                    /**
                     * Alias for calling [Builder.enableCostOptimizer] with
                     * `enableCostOptimizer.orElse(null)`.
                     */
                    fun enableCostOptimizer(enableCostOptimizer: Optional<Boolean>) =
                        enableCostOptimizer(enableCostOptimizer.getOrNull())

                    /**
                     * Sets [Builder.enableCostOptimizer] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.enableCostOptimizer] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun enableCostOptimizer(enableCostOptimizer: JsonField<Boolean>) = apply {
                        this.enableCostOptimizer = enableCostOptimizer
                    }

                    fun extractCharts(extractCharts: Boolean?) =
                        extractCharts(JsonField.ofNullable(extractCharts))

                    /**
                     * Alias for [Builder.extractCharts].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun extractCharts(extractCharts: Boolean) =
                        extractCharts(extractCharts as Boolean?)

                    /**
                     * Alias for calling [Builder.extractCharts] with `extractCharts.orElse(null)`.
                     */
                    fun extractCharts(extractCharts: Optional<Boolean>) =
                        extractCharts(extractCharts.getOrNull())

                    /**
                     * Sets [Builder.extractCharts] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.extractCharts] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun extractCharts(extractCharts: JsonField<Boolean>) = apply {
                        this.extractCharts = extractCharts
                    }

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
                    fun extractPrintedPageNumber(extractPrintedPageNumber: JsonField<Boolean>) =
                        apply {
                            this.extractPrintedPageNumber = extractPrintedPageNumber
                        }

                    fun fastMode(fastMode: Boolean?) = fastMode(JsonField.ofNullable(fastMode))

                    /**
                     * Alias for [Builder.fastMode].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fastMode(fastMode: Boolean) = fastMode(fastMode as Boolean?)

                    /** Alias for calling [Builder.fastMode] with `fastMode.orElse(null)`. */
                    fun fastMode(fastMode: Optional<Boolean>) = fastMode(fastMode.getOrNull())

                    /**
                     * Sets [Builder.fastMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fastMode] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fastMode(fastMode: JsonField<Boolean>) = apply { this.fastMode = fastMode }

                    fun formattingInstruction(formattingInstruction: String?) =
                        formattingInstruction(JsonField.ofNullable(formattingInstruction))

                    /**
                     * Alias for calling [Builder.formattingInstruction] with
                     * `formattingInstruction.orElse(null)`.
                     */
                    fun formattingInstruction(formattingInstruction: Optional<String>) =
                        formattingInstruction(formattingInstruction.getOrNull())

                    /**
                     * Sets [Builder.formattingInstruction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.formattingInstruction] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun formattingInstruction(formattingInstruction: JsonField<String>) = apply {
                        this.formattingInstruction = formattingInstruction
                    }

                    fun gpt4oApiKey(gpt4oApiKey: String?) =
                        gpt4oApiKey(JsonField.ofNullable(gpt4oApiKey))

                    /** Alias for calling [Builder.gpt4oApiKey] with `gpt4oApiKey.orElse(null)`. */
                    fun gpt4oApiKey(gpt4oApiKey: Optional<String>) =
                        gpt4oApiKey(gpt4oApiKey.getOrNull())

                    /**
                     * Sets [Builder.gpt4oApiKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gpt4oApiKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gpt4oApiKey(gpt4oApiKey: JsonField<String>) = apply {
                        this.gpt4oApiKey = gpt4oApiKey
                    }

                    fun gpt4oMode(gpt4oMode: Boolean?) = gpt4oMode(JsonField.ofNullable(gpt4oMode))

                    /**
                     * Alias for [Builder.gpt4oMode].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun gpt4oMode(gpt4oMode: Boolean) = gpt4oMode(gpt4oMode as Boolean?)

                    /** Alias for calling [Builder.gpt4oMode] with `gpt4oMode.orElse(null)`. */
                    fun gpt4oMode(gpt4oMode: Optional<Boolean>) = gpt4oMode(gpt4oMode.getOrNull())

                    /**
                     * Sets [Builder.gpt4oMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gpt4oMode] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun gpt4oMode(gpt4oMode: JsonField<Boolean>) = apply {
                        this.gpt4oMode = gpt4oMode
                    }

                    fun guessXlsxSheetName(guessXlsxSheetName: Boolean?) =
                        guessXlsxSheetName(JsonField.ofNullable(guessXlsxSheetName))

                    /**
                     * Alias for [Builder.guessXlsxSheetName].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun guessXlsxSheetName(guessXlsxSheetName: Boolean) =
                        guessXlsxSheetName(guessXlsxSheetName as Boolean?)

                    /**
                     * Alias for calling [Builder.guessXlsxSheetName] with
                     * `guessXlsxSheetName.orElse(null)`.
                     */
                    fun guessXlsxSheetName(guessXlsxSheetName: Optional<Boolean>) =
                        guessXlsxSheetName(guessXlsxSheetName.getOrNull())

                    /**
                     * Sets [Builder.guessXlsxSheetName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.guessXlsxSheetName] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun guessXlsxSheetName(guessXlsxSheetName: JsonField<Boolean>) = apply {
                        this.guessXlsxSheetName = guessXlsxSheetName
                    }

                    fun hideFooters(hideFooters: Boolean?) =
                        hideFooters(JsonField.ofNullable(hideFooters))

                    /**
                     * Alias for [Builder.hideFooters].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun hideFooters(hideFooters: Boolean) = hideFooters(hideFooters as Boolean?)

                    /** Alias for calling [Builder.hideFooters] with `hideFooters.orElse(null)`. */
                    fun hideFooters(hideFooters: Optional<Boolean>) =
                        hideFooters(hideFooters.getOrNull())

                    /**
                     * Sets [Builder.hideFooters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hideFooters] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun hideFooters(hideFooters: JsonField<Boolean>) = apply {
                        this.hideFooters = hideFooters
                    }

                    fun hideHeaders(hideHeaders: Boolean?) =
                        hideHeaders(JsonField.ofNullable(hideHeaders))

                    /**
                     * Alias for [Builder.hideHeaders].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun hideHeaders(hideHeaders: Boolean) = hideHeaders(hideHeaders as Boolean?)

                    /** Alias for calling [Builder.hideHeaders] with `hideHeaders.orElse(null)`. */
                    fun hideHeaders(hideHeaders: Optional<Boolean>) =
                        hideHeaders(hideHeaders.getOrNull())

                    /**
                     * Sets [Builder.hideHeaders] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hideHeaders] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun hideHeaders(hideHeaders: JsonField<Boolean>) = apply {
                        this.hideHeaders = hideHeaders
                    }

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

                    fun htmlMakeAllElementsVisible(htmlMakeAllElementsVisible: Boolean?) =
                        htmlMakeAllElementsVisible(JsonField.ofNullable(htmlMakeAllElementsVisible))

                    /**
                     * Alias for [Builder.htmlMakeAllElementsVisible].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun htmlMakeAllElementsVisible(htmlMakeAllElementsVisible: Boolean) =
                        htmlMakeAllElementsVisible(htmlMakeAllElementsVisible as Boolean?)

                    /**
                     * Alias for calling [Builder.htmlMakeAllElementsVisible] with
                     * `htmlMakeAllElementsVisible.orElse(null)`.
                     */
                    fun htmlMakeAllElementsVisible(htmlMakeAllElementsVisible: Optional<Boolean>) =
                        htmlMakeAllElementsVisible(htmlMakeAllElementsVisible.getOrNull())

                    /**
                     * Sets [Builder.htmlMakeAllElementsVisible] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.htmlMakeAllElementsVisible] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun htmlMakeAllElementsVisible(htmlMakeAllElementsVisible: JsonField<Boolean>) =
                        apply {
                            this.htmlMakeAllElementsVisible = htmlMakeAllElementsVisible
                        }

                    fun htmlRemoveFixedElements(htmlRemoveFixedElements: Boolean?) =
                        htmlRemoveFixedElements(JsonField.ofNullable(htmlRemoveFixedElements))

                    /**
                     * Alias for [Builder.htmlRemoveFixedElements].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun htmlRemoveFixedElements(htmlRemoveFixedElements: Boolean) =
                        htmlRemoveFixedElements(htmlRemoveFixedElements as Boolean?)

                    /**
                     * Alias for calling [Builder.htmlRemoveFixedElements] with
                     * `htmlRemoveFixedElements.orElse(null)`.
                     */
                    fun htmlRemoveFixedElements(htmlRemoveFixedElements: Optional<Boolean>) =
                        htmlRemoveFixedElements(htmlRemoveFixedElements.getOrNull())

                    /**
                     * Sets [Builder.htmlRemoveFixedElements] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.htmlRemoveFixedElements] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun htmlRemoveFixedElements(htmlRemoveFixedElements: JsonField<Boolean>) =
                        apply {
                            this.htmlRemoveFixedElements = htmlRemoveFixedElements
                        }

                    fun htmlRemoveNavigationElements(htmlRemoveNavigationElements: Boolean?) =
                        htmlRemoveNavigationElements(
                            JsonField.ofNullable(htmlRemoveNavigationElements)
                        )

                    /**
                     * Alias for [Builder.htmlRemoveNavigationElements].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun htmlRemoveNavigationElements(htmlRemoveNavigationElements: Boolean) =
                        htmlRemoveNavigationElements(htmlRemoveNavigationElements as Boolean?)

                    /**
                     * Alias for calling [Builder.htmlRemoveNavigationElements] with
                     * `htmlRemoveNavigationElements.orElse(null)`.
                     */
                    fun htmlRemoveNavigationElements(
                        htmlRemoveNavigationElements: Optional<Boolean>
                    ) = htmlRemoveNavigationElements(htmlRemoveNavigationElements.getOrNull())

                    /**
                     * Sets [Builder.htmlRemoveNavigationElements] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.htmlRemoveNavigationElements] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun htmlRemoveNavigationElements(
                        htmlRemoveNavigationElements: JsonField<Boolean>
                    ) = apply { this.htmlRemoveNavigationElements = htmlRemoveNavigationElements }

                    fun httpProxy(httpProxy: String?) = httpProxy(JsonField.ofNullable(httpProxy))

                    /** Alias for calling [Builder.httpProxy] with `httpProxy.orElse(null)`. */
                    fun httpProxy(httpProxy: Optional<String>) = httpProxy(httpProxy.getOrNull())

                    /**
                     * Sets [Builder.httpProxy] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.httpProxy] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun httpProxy(httpProxy: JsonField<String>) = apply {
                        this.httpProxy = httpProxy
                    }

                    fun ignoreDocumentElementsForLayoutDetection(
                        ignoreDocumentElementsForLayoutDetection: Boolean?
                    ) =
                        ignoreDocumentElementsForLayoutDetection(
                            JsonField.ofNullable(ignoreDocumentElementsForLayoutDetection)
                        )

                    /**
                     * Alias for [Builder.ignoreDocumentElementsForLayoutDetection].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun ignoreDocumentElementsForLayoutDetection(
                        ignoreDocumentElementsForLayoutDetection: Boolean
                    ) =
                        ignoreDocumentElementsForLayoutDetection(
                            ignoreDocumentElementsForLayoutDetection as Boolean?
                        )

                    /**
                     * Alias for calling [Builder.ignoreDocumentElementsForLayoutDetection] with
                     * `ignoreDocumentElementsForLayoutDetection.orElse(null)`.
                     */
                    fun ignoreDocumentElementsForLayoutDetection(
                        ignoreDocumentElementsForLayoutDetection: Optional<Boolean>
                    ) =
                        ignoreDocumentElementsForLayoutDetection(
                            ignoreDocumentElementsForLayoutDetection.getOrNull()
                        )

                    /**
                     * Sets [Builder.ignoreDocumentElementsForLayoutDetection] to an arbitrary JSON
                     * value.
                     *
                     * You should usually call [Builder.ignoreDocumentElementsForLayoutDetection]
                     * with a well-typed [Boolean] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun ignoreDocumentElementsForLayoutDetection(
                        ignoreDocumentElementsForLayoutDetection: JsonField<Boolean>
                    ) = apply {
                        this.ignoreDocumentElementsForLayoutDetection =
                            ignoreDocumentElementsForLayoutDetection
                    }

                    fun imagesToSave(imagesToSave: List<ImagesToSave>?) =
                        imagesToSave(JsonField.ofNullable(imagesToSave))

                    /**
                     * Alias for calling [Builder.imagesToSave] with `imagesToSave.orElse(null)`.
                     */
                    fun imagesToSave(imagesToSave: Optional<List<ImagesToSave>>) =
                        imagesToSave(imagesToSave.getOrNull())

                    /**
                     * Sets [Builder.imagesToSave] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.imagesToSave] with a well-typed
                     * `List<ImagesToSave>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
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

                    fun inlineImagesInMarkdown(inlineImagesInMarkdown: Boolean?) =
                        inlineImagesInMarkdown(JsonField.ofNullable(inlineImagesInMarkdown))

                    /**
                     * Alias for [Builder.inlineImagesInMarkdown].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun inlineImagesInMarkdown(inlineImagesInMarkdown: Boolean) =
                        inlineImagesInMarkdown(inlineImagesInMarkdown as Boolean?)

                    /**
                     * Alias for calling [Builder.inlineImagesInMarkdown] with
                     * `inlineImagesInMarkdown.orElse(null)`.
                     */
                    fun inlineImagesInMarkdown(inlineImagesInMarkdown: Optional<Boolean>) =
                        inlineImagesInMarkdown(inlineImagesInMarkdown.getOrNull())

                    /**
                     * Sets [Builder.inlineImagesInMarkdown] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inlineImagesInMarkdown] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inlineImagesInMarkdown(inlineImagesInMarkdown: JsonField<Boolean>) = apply {
                        this.inlineImagesInMarkdown = inlineImagesInMarkdown
                    }

                    fun inputS3Path(inputS3Path: String?) =
                        inputS3Path(JsonField.ofNullable(inputS3Path))

                    /** Alias for calling [Builder.inputS3Path] with `inputS3Path.orElse(null)`. */
                    fun inputS3Path(inputS3Path: Optional<String>) =
                        inputS3Path(inputS3Path.getOrNull())

                    /**
                     * Sets [Builder.inputS3Path] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inputS3Path] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inputS3Path(inputS3Path: JsonField<String>) = apply {
                        this.inputS3Path = inputS3Path
                    }

                    /** The region for the input S3 bucket. */
                    fun inputS3Region(inputS3Region: String?) =
                        inputS3Region(JsonField.ofNullable(inputS3Region))

                    /**
                     * Alias for calling [Builder.inputS3Region] with `inputS3Region.orElse(null)`.
                     */
                    fun inputS3Region(inputS3Region: Optional<String>) =
                        inputS3Region(inputS3Region.getOrNull())

                    /**
                     * Sets [Builder.inputS3Region] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inputS3Region] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inputS3Region(inputS3Region: JsonField<String>) = apply {
                        this.inputS3Region = inputS3Region
                    }

                    fun inputUrl(inputUrl: String?) = inputUrl(JsonField.ofNullable(inputUrl))

                    /** Alias for calling [Builder.inputUrl] with `inputUrl.orElse(null)`. */
                    fun inputUrl(inputUrl: Optional<String>) = inputUrl(inputUrl.getOrNull())

                    /**
                     * Sets [Builder.inputUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inputUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun inputUrl(inputUrl: JsonField<String>) = apply { this.inputUrl = inputUrl }

                    fun internalIsScreenshotJob(internalIsScreenshotJob: Boolean?) =
                        internalIsScreenshotJob(JsonField.ofNullable(internalIsScreenshotJob))

                    /**
                     * Alias for [Builder.internalIsScreenshotJob].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun internalIsScreenshotJob(internalIsScreenshotJob: Boolean) =
                        internalIsScreenshotJob(internalIsScreenshotJob as Boolean?)

                    /**
                     * Alias for calling [Builder.internalIsScreenshotJob] with
                     * `internalIsScreenshotJob.orElse(null)`.
                     */
                    fun internalIsScreenshotJob(internalIsScreenshotJob: Optional<Boolean>) =
                        internalIsScreenshotJob(internalIsScreenshotJob.getOrNull())

                    /**
                     * Sets [Builder.internalIsScreenshotJob] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.internalIsScreenshotJob] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun internalIsScreenshotJob(internalIsScreenshotJob: JsonField<Boolean>) =
                        apply {
                            this.internalIsScreenshotJob = internalIsScreenshotJob
                        }

                    fun invalidateCache(invalidateCache: Boolean?) =
                        invalidateCache(JsonField.ofNullable(invalidateCache))

                    /**
                     * Alias for [Builder.invalidateCache].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun invalidateCache(invalidateCache: Boolean) =
                        invalidateCache(invalidateCache as Boolean?)

                    /**
                     * Alias for calling [Builder.invalidateCache] with
                     * `invalidateCache.orElse(null)`.
                     */
                    fun invalidateCache(invalidateCache: Optional<Boolean>) =
                        invalidateCache(invalidateCache.getOrNull())

                    /**
                     * Sets [Builder.invalidateCache] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invalidateCache] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invalidateCache(invalidateCache: JsonField<Boolean>) = apply {
                        this.invalidateCache = invalidateCache
                    }

                    fun isFormattingInstruction(isFormattingInstruction: Boolean?) =
                        isFormattingInstruction(JsonField.ofNullable(isFormattingInstruction))

                    /**
                     * Alias for [Builder.isFormattingInstruction].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun isFormattingInstruction(isFormattingInstruction: Boolean) =
                        isFormattingInstruction(isFormattingInstruction as Boolean?)

                    /**
                     * Alias for calling [Builder.isFormattingInstruction] with
                     * `isFormattingInstruction.orElse(null)`.
                     */
                    fun isFormattingInstruction(isFormattingInstruction: Optional<Boolean>) =
                        isFormattingInstruction(isFormattingInstruction.getOrNull())

                    /**
                     * Sets [Builder.isFormattingInstruction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isFormattingInstruction] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun isFormattingInstruction(isFormattingInstruction: JsonField<Boolean>) =
                        apply {
                            this.isFormattingInstruction = isFormattingInstruction
                        }

                    fun jobTimeoutExtraTimePerPageInSeconds(
                        jobTimeoutExtraTimePerPageInSeconds: Double?
                    ) =
                        jobTimeoutExtraTimePerPageInSeconds(
                            JsonField.ofNullable(jobTimeoutExtraTimePerPageInSeconds)
                        )

                    /**
                     * Alias for [Builder.jobTimeoutExtraTimePerPageInSeconds].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun jobTimeoutExtraTimePerPageInSeconds(
                        jobTimeoutExtraTimePerPageInSeconds: Double
                    ) =
                        jobTimeoutExtraTimePerPageInSeconds(
                            jobTimeoutExtraTimePerPageInSeconds as Double?
                        )

                    /**
                     * Alias for calling [Builder.jobTimeoutExtraTimePerPageInSeconds] with
                     * `jobTimeoutExtraTimePerPageInSeconds.orElse(null)`.
                     */
                    fun jobTimeoutExtraTimePerPageInSeconds(
                        jobTimeoutExtraTimePerPageInSeconds: Optional<Double>
                    ) =
                        jobTimeoutExtraTimePerPageInSeconds(
                            jobTimeoutExtraTimePerPageInSeconds.getOrNull()
                        )

                    /**
                     * Sets [Builder.jobTimeoutExtraTimePerPageInSeconds] to an arbitrary JSON
                     * value.
                     *
                     * You should usually call [Builder.jobTimeoutExtraTimePerPageInSeconds] with a
                     * well-typed [Double] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun jobTimeoutExtraTimePerPageInSeconds(
                        jobTimeoutExtraTimePerPageInSeconds: JsonField<Double>
                    ) = apply {
                        this.jobTimeoutExtraTimePerPageInSeconds =
                            jobTimeoutExtraTimePerPageInSeconds
                    }

                    fun jobTimeoutInSeconds(jobTimeoutInSeconds: Double?) =
                        jobTimeoutInSeconds(JsonField.ofNullable(jobTimeoutInSeconds))

                    /**
                     * Alias for [Builder.jobTimeoutInSeconds].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun jobTimeoutInSeconds(jobTimeoutInSeconds: Double) =
                        jobTimeoutInSeconds(jobTimeoutInSeconds as Double?)

                    /**
                     * Alias for calling [Builder.jobTimeoutInSeconds] with
                     * `jobTimeoutInSeconds.orElse(null)`.
                     */
                    fun jobTimeoutInSeconds(jobTimeoutInSeconds: Optional<Double>) =
                        jobTimeoutInSeconds(jobTimeoutInSeconds.getOrNull())

                    /**
                     * Sets [Builder.jobTimeoutInSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.jobTimeoutInSeconds] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun jobTimeoutInSeconds(jobTimeoutInSeconds: JsonField<Double>) = apply {
                        this.jobTimeoutInSeconds = jobTimeoutInSeconds
                    }

                    fun keepPageSeparatorWhenMergingTables(
                        keepPageSeparatorWhenMergingTables: Boolean?
                    ) =
                        keepPageSeparatorWhenMergingTables(
                            JsonField.ofNullable(keepPageSeparatorWhenMergingTables)
                        )

                    /**
                     * Alias for [Builder.keepPageSeparatorWhenMergingTables].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun keepPageSeparatorWhenMergingTables(
                        keepPageSeparatorWhenMergingTables: Boolean
                    ) =
                        keepPageSeparatorWhenMergingTables(
                            keepPageSeparatorWhenMergingTables as Boolean?
                        )

                    /**
                     * Alias for calling [Builder.keepPageSeparatorWhenMergingTables] with
                     * `keepPageSeparatorWhenMergingTables.orElse(null)`.
                     */
                    fun keepPageSeparatorWhenMergingTables(
                        keepPageSeparatorWhenMergingTables: Optional<Boolean>
                    ) =
                        keepPageSeparatorWhenMergingTables(
                            keepPageSeparatorWhenMergingTables.getOrNull()
                        )

                    /**
                     * Sets [Builder.keepPageSeparatorWhenMergingTables] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.keepPageSeparatorWhenMergingTables] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun keepPageSeparatorWhenMergingTables(
                        keepPageSeparatorWhenMergingTables: JsonField<Boolean>
                    ) = apply {
                        this.keepPageSeparatorWhenMergingTables = keepPageSeparatorWhenMergingTables
                    }

                    /** The language. */
                    fun lang(lang: String) = lang(JsonField.of(lang))

                    /**
                     * Sets [Builder.lang] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lang] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                    fun languages(languages: List<ParsingLanguages>) =
                        languages(JsonField.of(languages))

                    /**
                     * Sets [Builder.languages] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.languages] with a well-typed
                     * `List<ParsingLanguages>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
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

                    fun layoutAware(layoutAware: Boolean?) =
                        layoutAware(JsonField.ofNullable(layoutAware))

                    /**
                     * Alias for [Builder.layoutAware].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun layoutAware(layoutAware: Boolean) = layoutAware(layoutAware as Boolean?)

                    /** Alias for calling [Builder.layoutAware] with `layoutAware.orElse(null)`. */
                    fun layoutAware(layoutAware: Optional<Boolean>) =
                        layoutAware(layoutAware.getOrNull())

                    /**
                     * Sets [Builder.layoutAware] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.layoutAware] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun layoutAware(layoutAware: JsonField<Boolean>) = apply {
                        this.layoutAware = layoutAware
                    }

                    fun lineLevelBoundingBox(lineLevelBoundingBox: Boolean?) =
                        lineLevelBoundingBox(JsonField.ofNullable(lineLevelBoundingBox))

                    /**
                     * Alias for [Builder.lineLevelBoundingBox].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun lineLevelBoundingBox(lineLevelBoundingBox: Boolean) =
                        lineLevelBoundingBox(lineLevelBoundingBox as Boolean?)

                    /**
                     * Alias for calling [Builder.lineLevelBoundingBox] with
                     * `lineLevelBoundingBox.orElse(null)`.
                     */
                    fun lineLevelBoundingBox(lineLevelBoundingBox: Optional<Boolean>) =
                        lineLevelBoundingBox(lineLevelBoundingBox.getOrNull())

                    /**
                     * Sets [Builder.lineLevelBoundingBox] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lineLevelBoundingBox] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun lineLevelBoundingBox(lineLevelBoundingBox: JsonField<Boolean>) = apply {
                        this.lineLevelBoundingBox = lineLevelBoundingBox
                    }

                    fun markdownTableMultilineHeaderSeparator(
                        markdownTableMultilineHeaderSeparator: String?
                    ) =
                        markdownTableMultilineHeaderSeparator(
                            JsonField.ofNullable(markdownTableMultilineHeaderSeparator)
                        )

                    /**
                     * Alias for calling [Builder.markdownTableMultilineHeaderSeparator] with
                     * `markdownTableMultilineHeaderSeparator.orElse(null)`.
                     */
                    fun markdownTableMultilineHeaderSeparator(
                        markdownTableMultilineHeaderSeparator: Optional<String>
                    ) =
                        markdownTableMultilineHeaderSeparator(
                            markdownTableMultilineHeaderSeparator.getOrNull()
                        )

                    /**
                     * Sets [Builder.markdownTableMultilineHeaderSeparator] to an arbitrary JSON
                     * value.
                     *
                     * You should usually call [Builder.markdownTableMultilineHeaderSeparator] with
                     * a well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun markdownTableMultilineHeaderSeparator(
                        markdownTableMultilineHeaderSeparator: JsonField<String>
                    ) = apply {
                        this.markdownTableMultilineHeaderSeparator =
                            markdownTableMultilineHeaderSeparator
                    }

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
                     * You should usually call [Builder.maxPages] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxPages(maxPages: JsonField<Long>) = apply { this.maxPages = maxPages }

                    fun maxPagesEnforced(maxPagesEnforced: Long?) =
                        maxPagesEnforced(JsonField.ofNullable(maxPagesEnforced))

                    /**
                     * Alias for [Builder.maxPagesEnforced].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun maxPagesEnforced(maxPagesEnforced: Long) =
                        maxPagesEnforced(maxPagesEnforced as Long?)

                    /**
                     * Alias for calling [Builder.maxPagesEnforced] with
                     * `maxPagesEnforced.orElse(null)`.
                     */
                    fun maxPagesEnforced(maxPagesEnforced: Optional<Long>) =
                        maxPagesEnforced(maxPagesEnforced.getOrNull())

                    /**
                     * Sets [Builder.maxPagesEnforced] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxPagesEnforced] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maxPagesEnforced(maxPagesEnforced: JsonField<Long>) = apply {
                        this.maxPagesEnforced = maxPagesEnforced
                    }

                    fun mergeTablesAcrossPagesInMarkdown(
                        mergeTablesAcrossPagesInMarkdown: Boolean?
                    ) =
                        mergeTablesAcrossPagesInMarkdown(
                            JsonField.ofNullable(mergeTablesAcrossPagesInMarkdown)
                        )

                    /**
                     * Alias for [Builder.mergeTablesAcrossPagesInMarkdown].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun mergeTablesAcrossPagesInMarkdown(
                        mergeTablesAcrossPagesInMarkdown: Boolean
                    ) =
                        mergeTablesAcrossPagesInMarkdown(
                            mergeTablesAcrossPagesInMarkdown as Boolean?
                        )

                    /**
                     * Alias for calling [Builder.mergeTablesAcrossPagesInMarkdown] with
                     * `mergeTablesAcrossPagesInMarkdown.orElse(null)`.
                     */
                    fun mergeTablesAcrossPagesInMarkdown(
                        mergeTablesAcrossPagesInMarkdown: Optional<Boolean>
                    ) =
                        mergeTablesAcrossPagesInMarkdown(
                            mergeTablesAcrossPagesInMarkdown.getOrNull()
                        )

                    /**
                     * Sets [Builder.mergeTablesAcrossPagesInMarkdown] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mergeTablesAcrossPagesInMarkdown] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun mergeTablesAcrossPagesInMarkdown(
                        mergeTablesAcrossPagesInMarkdown: JsonField<Boolean>
                    ) = apply {
                        this.mergeTablesAcrossPagesInMarkdown = mergeTablesAcrossPagesInMarkdown
                    }

                    fun model(model: String?) = model(JsonField.ofNullable(model))

                    /** Alias for calling [Builder.model] with `model.orElse(null)`. */
                    fun model(model: Optional<String>) = model(model.getOrNull())

                    /**
                     * Sets [Builder.model] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.model] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun model(model: JsonField<String>) = apply { this.model = model }

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

                    fun outputPdfOfDocument(outputPdfOfDocument: Boolean?) =
                        outputPdfOfDocument(JsonField.ofNullable(outputPdfOfDocument))

                    /**
                     * Alias for [Builder.outputPdfOfDocument].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun outputPdfOfDocument(outputPdfOfDocument: Boolean) =
                        outputPdfOfDocument(outputPdfOfDocument as Boolean?)

                    /**
                     * Alias for calling [Builder.outputPdfOfDocument] with
                     * `outputPdfOfDocument.orElse(null)`.
                     */
                    fun outputPdfOfDocument(outputPdfOfDocument: Optional<Boolean>) =
                        outputPdfOfDocument(outputPdfOfDocument.getOrNull())

                    /**
                     * Sets [Builder.outputPdfOfDocument] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outputPdfOfDocument] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun outputPdfOfDocument(outputPdfOfDocument: JsonField<Boolean>) = apply {
                        this.outputPdfOfDocument = outputPdfOfDocument
                    }

                    /**
                     * If specified, llamaParse will save the output to the specified path. All
                     * output file will use this 'prefix' should be a valid s3:// url
                     */
                    fun outputS3PathPrefix(outputS3PathPrefix: String?) =
                        outputS3PathPrefix(JsonField.ofNullable(outputS3PathPrefix))

                    /**
                     * Alias for calling [Builder.outputS3PathPrefix] with
                     * `outputS3PathPrefix.orElse(null)`.
                     */
                    fun outputS3PathPrefix(outputS3PathPrefix: Optional<String>) =
                        outputS3PathPrefix(outputS3PathPrefix.getOrNull())

                    /**
                     * Sets [Builder.outputS3PathPrefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outputS3PathPrefix] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun outputS3PathPrefix(outputS3PathPrefix: JsonField<String>) = apply {
                        this.outputS3PathPrefix = outputS3PathPrefix
                    }

                    /** The region for the output S3 bucket. */
                    fun outputS3Region(outputS3Region: String?) =
                        outputS3Region(JsonField.ofNullable(outputS3Region))

                    /**
                     * Alias for calling [Builder.outputS3Region] with
                     * `outputS3Region.orElse(null)`.
                     */
                    fun outputS3Region(outputS3Region: Optional<String>) =
                        outputS3Region(outputS3Region.getOrNull())

                    /**
                     * Sets [Builder.outputS3Region] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outputS3Region] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun outputS3Region(outputS3Region: JsonField<String>) = apply {
                        this.outputS3Region = outputS3Region
                    }

                    fun outputTablesAsHtml(outputTablesAsHtml: Boolean?) =
                        outputTablesAsHtml(JsonField.ofNullable(outputTablesAsHtml))

                    /**
                     * Alias for [Builder.outputTablesAsHtml].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun outputTablesAsHtml(outputTablesAsHtml: Boolean) =
                        outputTablesAsHtml(outputTablesAsHtml as Boolean?)

                    /**
                     * Alias for calling [Builder.outputTablesAsHtml] with
                     * `outputTablesAsHtml.orElse(null)`.
                     */
                    fun outputTablesAsHtml(outputTablesAsHtml: Optional<Boolean>) =
                        outputTablesAsHtml(outputTablesAsHtml.getOrNull())

                    /**
                     * Sets [Builder.outputTablesAsHtml] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outputTablesAsHtml] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun outputTablesAsHtml(outputTablesAsHtml: JsonField<Boolean>) = apply {
                        this.outputTablesAsHtml = outputTablesAsHtml
                    }

                    /** The output bucket. */
                    fun outputBucket(outputBucket: String?) =
                        outputBucket(JsonField.ofNullable(outputBucket))

                    /**
                     * Alias for calling [Builder.outputBucket] with `outputBucket.orElse(null)`.
                     */
                    fun outputBucket(outputBucket: Optional<String>) =
                        outputBucket(outputBucket.getOrNull())

                    /**
                     * Sets [Builder.outputBucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outputBucket] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun outputBucket(outputBucket: JsonField<String>) = apply {
                        this.outputBucket = outputBucket
                    }

                    fun pageErrorTolerance(pageErrorTolerance: Double?) =
                        pageErrorTolerance(JsonField.ofNullable(pageErrorTolerance))

                    /**
                     * Alias for [Builder.pageErrorTolerance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun pageErrorTolerance(pageErrorTolerance: Double) =
                        pageErrorTolerance(pageErrorTolerance as Double?)

                    /**
                     * Alias for calling [Builder.pageErrorTolerance] with
                     * `pageErrorTolerance.orElse(null)`.
                     */
                    fun pageErrorTolerance(pageErrorTolerance: Optional<Double>) =
                        pageErrorTolerance(pageErrorTolerance.getOrNull())

                    /**
                     * Sets [Builder.pageErrorTolerance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageErrorTolerance] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun pageErrorTolerance(pageErrorTolerance: JsonField<Double>) = apply {
                        this.pageErrorTolerance = pageErrorTolerance
                    }

                    fun pageFooterPrefix(pageFooterPrefix: String?) =
                        pageFooterPrefix(JsonField.ofNullable(pageFooterPrefix))

                    /**
                     * Alias for calling [Builder.pageFooterPrefix] with
                     * `pageFooterPrefix.orElse(null)`.
                     */
                    fun pageFooterPrefix(pageFooterPrefix: Optional<String>) =
                        pageFooterPrefix(pageFooterPrefix.getOrNull())

                    /**
                     * Sets [Builder.pageFooterPrefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageFooterPrefix] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun pageFooterPrefix(pageFooterPrefix: JsonField<String>) = apply {
                        this.pageFooterPrefix = pageFooterPrefix
                    }

                    fun pageFooterSuffix(pageFooterSuffix: String?) =
                        pageFooterSuffix(JsonField.ofNullable(pageFooterSuffix))

                    /**
                     * Alias for calling [Builder.pageFooterSuffix] with
                     * `pageFooterSuffix.orElse(null)`.
                     */
                    fun pageFooterSuffix(pageFooterSuffix: Optional<String>) =
                        pageFooterSuffix(pageFooterSuffix.getOrNull())

                    /**
                     * Sets [Builder.pageFooterSuffix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageFooterSuffix] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun pageFooterSuffix(pageFooterSuffix: JsonField<String>) = apply {
                        this.pageFooterSuffix = pageFooterSuffix
                    }

                    fun pageHeaderPrefix(pageHeaderPrefix: String?) =
                        pageHeaderPrefix(JsonField.ofNullable(pageHeaderPrefix))

                    /**
                     * Alias for calling [Builder.pageHeaderPrefix] with
                     * `pageHeaderPrefix.orElse(null)`.
                     */
                    fun pageHeaderPrefix(pageHeaderPrefix: Optional<String>) =
                        pageHeaderPrefix(pageHeaderPrefix.getOrNull())

                    /**
                     * Sets [Builder.pageHeaderPrefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageHeaderPrefix] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun pageHeaderPrefix(pageHeaderPrefix: JsonField<String>) = apply {
                        this.pageHeaderPrefix = pageHeaderPrefix
                    }

                    fun pageHeaderSuffix(pageHeaderSuffix: String?) =
                        pageHeaderSuffix(JsonField.ofNullable(pageHeaderSuffix))

                    /**
                     * Alias for calling [Builder.pageHeaderSuffix] with
                     * `pageHeaderSuffix.orElse(null)`.
                     */
                    fun pageHeaderSuffix(pageHeaderSuffix: Optional<String>) =
                        pageHeaderSuffix(pageHeaderSuffix.getOrNull())

                    /**
                     * Sets [Builder.pageHeaderSuffix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageHeaderSuffix] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun pageHeaderSuffix(pageHeaderSuffix: JsonField<String>) = apply {
                        this.pageHeaderSuffix = pageHeaderSuffix
                    }

                    fun pagePrefix(pagePrefix: String?) =
                        pagePrefix(JsonField.ofNullable(pagePrefix))

                    /** Alias for calling [Builder.pagePrefix] with `pagePrefix.orElse(null)`. */
                    fun pagePrefix(pagePrefix: Optional<String>) =
                        pagePrefix(pagePrefix.getOrNull())

                    /**
                     * Sets [Builder.pagePrefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pagePrefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pagePrefix(pagePrefix: JsonField<String>) = apply {
                        this.pagePrefix = pagePrefix
                    }

                    fun pageSeparator(pageSeparator: String?) =
                        pageSeparator(JsonField.ofNullable(pageSeparator))

                    /**
                     * Alias for calling [Builder.pageSeparator] with `pageSeparator.orElse(null)`.
                     */
                    fun pageSeparator(pageSeparator: Optional<String>) =
                        pageSeparator(pageSeparator.getOrNull())

                    /**
                     * Sets [Builder.pageSeparator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageSeparator] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun pageSeparator(pageSeparator: JsonField<String>) = apply {
                        this.pageSeparator = pageSeparator
                    }

                    fun pageSuffix(pageSuffix: String?) =
                        pageSuffix(JsonField.ofNullable(pageSuffix))

                    /** Alias for calling [Builder.pageSuffix] with `pageSuffix.orElse(null)`. */
                    fun pageSuffix(pageSuffix: Optional<String>) =
                        pageSuffix(pageSuffix.getOrNull())

                    /**
                     * Sets [Builder.pageSuffix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageSuffix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageSuffix(pageSuffix: JsonField<String>) = apply {
                        this.pageSuffix = pageSuffix
                    }

                    /** Enum for representing the mode of parsing to be used. */
                    fun parseMode(parseMode: ParsingMode?) =
                        parseMode(JsonField.ofNullable(parseMode))

                    /** Alias for calling [Builder.parseMode] with `parseMode.orElse(null)`. */
                    fun parseMode(parseMode: Optional<ParsingMode>) =
                        parseMode(parseMode.getOrNull())

                    /**
                     * Sets [Builder.parseMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parseMode] with a well-typed [ParsingMode]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun parseMode(parseMode: JsonField<ParsingMode>) = apply {
                        this.parseMode = parseMode
                    }

                    fun parsingInstruction(parsingInstruction: String?) =
                        parsingInstruction(JsonField.ofNullable(parsingInstruction))

                    /**
                     * Alias for calling [Builder.parsingInstruction] with
                     * `parsingInstruction.orElse(null)`.
                     */
                    fun parsingInstruction(parsingInstruction: Optional<String>) =
                        parsingInstruction(parsingInstruction.getOrNull())

                    /**
                     * Sets [Builder.parsingInstruction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parsingInstruction] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun parsingInstruction(parsingInstruction: JsonField<String>) = apply {
                        this.parsingInstruction = parsingInstruction
                    }

                    /** The pipeline ID. */
                    fun pipelineId(pipelineId: String?) =
                        pipelineId(JsonField.ofNullable(pipelineId))

                    /** Alias for calling [Builder.pipelineId] with `pipelineId.orElse(null)`. */
                    fun pipelineId(pipelineId: Optional<String>) =
                        pipelineId(pipelineId.getOrNull())

                    /**
                     * Sets [Builder.pipelineId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pipelineId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pipelineId(pipelineId: JsonField<String>) = apply {
                        this.pipelineId = pipelineId
                    }

                    fun preciseBoundingBox(preciseBoundingBox: Boolean?) =
                        preciseBoundingBox(JsonField.ofNullable(preciseBoundingBox))

                    /**
                     * Alias for [Builder.preciseBoundingBox].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun preciseBoundingBox(preciseBoundingBox: Boolean) =
                        preciseBoundingBox(preciseBoundingBox as Boolean?)

                    /**
                     * Alias for calling [Builder.preciseBoundingBox] with
                     * `preciseBoundingBox.orElse(null)`.
                     */
                    fun preciseBoundingBox(preciseBoundingBox: Optional<Boolean>) =
                        preciseBoundingBox(preciseBoundingBox.getOrNull())

                    /**
                     * Sets [Builder.preciseBoundingBox] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.preciseBoundingBox] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun preciseBoundingBox(preciseBoundingBox: JsonField<Boolean>) = apply {
                        this.preciseBoundingBox = preciseBoundingBox
                    }

                    fun premiumMode(premiumMode: Boolean?) =
                        premiumMode(JsonField.ofNullable(premiumMode))

                    /**
                     * Alias for [Builder.premiumMode].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun premiumMode(premiumMode: Boolean) = premiumMode(premiumMode as Boolean?)

                    /** Alias for calling [Builder.premiumMode] with `premiumMode.orElse(null)`. */
                    fun premiumMode(premiumMode: Optional<Boolean>) =
                        premiumMode(premiumMode.getOrNull())

                    /**
                     * Sets [Builder.premiumMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.premiumMode] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun premiumMode(premiumMode: JsonField<Boolean>) = apply {
                        this.premiumMode = premiumMode
                    }

                    fun presentationOutOfBoundsContent(presentationOutOfBoundsContent: Boolean?) =
                        presentationOutOfBoundsContent(
                            JsonField.ofNullable(presentationOutOfBoundsContent)
                        )

                    /**
                     * Alias for [Builder.presentationOutOfBoundsContent].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun presentationOutOfBoundsContent(presentationOutOfBoundsContent: Boolean) =
                        presentationOutOfBoundsContent(presentationOutOfBoundsContent as Boolean?)

                    /**
                     * Alias for calling [Builder.presentationOutOfBoundsContent] with
                     * `presentationOutOfBoundsContent.orElse(null)`.
                     */
                    fun presentationOutOfBoundsContent(
                        presentationOutOfBoundsContent: Optional<Boolean>
                    ) = presentationOutOfBoundsContent(presentationOutOfBoundsContent.getOrNull())

                    /**
                     * Sets [Builder.presentationOutOfBoundsContent] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.presentationOutOfBoundsContent] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun presentationOutOfBoundsContent(
                        presentationOutOfBoundsContent: JsonField<Boolean>
                    ) = apply {
                        this.presentationOutOfBoundsContent = presentationOutOfBoundsContent
                    }

                    fun presentationSkipEmbeddedData(presentationSkipEmbeddedData: Boolean?) =
                        presentationSkipEmbeddedData(
                            JsonField.ofNullable(presentationSkipEmbeddedData)
                        )

                    /**
                     * Alias for [Builder.presentationSkipEmbeddedData].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun presentationSkipEmbeddedData(presentationSkipEmbeddedData: Boolean) =
                        presentationSkipEmbeddedData(presentationSkipEmbeddedData as Boolean?)

                    /**
                     * Alias for calling [Builder.presentationSkipEmbeddedData] with
                     * `presentationSkipEmbeddedData.orElse(null)`.
                     */
                    fun presentationSkipEmbeddedData(
                        presentationSkipEmbeddedData: Optional<Boolean>
                    ) = presentationSkipEmbeddedData(presentationSkipEmbeddedData.getOrNull())

                    /**
                     * Sets [Builder.presentationSkipEmbeddedData] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.presentationSkipEmbeddedData] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun presentationSkipEmbeddedData(
                        presentationSkipEmbeddedData: JsonField<Boolean>
                    ) = apply { this.presentationSkipEmbeddedData = presentationSkipEmbeddedData }

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

                    fun preset(preset: String?) = preset(JsonField.ofNullable(preset))

                    /** Alias for calling [Builder.preset] with `preset.orElse(null)`. */
                    fun preset(preset: Optional<String>) = preset(preset.getOrNull())

                    /**
                     * Sets [Builder.preset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.preset] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun preset(preset: JsonField<String>) = apply { this.preset = preset }

                    /**
                     * The priority for the request. This field may be ignored or overwritten
                     * depending on the organization tier.
                     */
                    fun priority(priority: Priority?) = priority(JsonField.ofNullable(priority))

                    /** Alias for calling [Builder.priority] with `priority.orElse(null)`. */
                    fun priority(priority: Optional<Priority>) = priority(priority.getOrNull())

                    /**
                     * Sets [Builder.priority] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.priority] with a well-typed [Priority] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

                    fun projectId(projectId: String?) = projectId(JsonField.ofNullable(projectId))

                    /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
                    fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

                    /**
                     * Sets [Builder.projectId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.projectId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun projectId(projectId: JsonField<String>) = apply {
                        this.projectId = projectId
                    }

                    fun removeHiddenText(removeHiddenText: Boolean?) =
                        removeHiddenText(JsonField.ofNullable(removeHiddenText))

                    /**
                     * Alias for [Builder.removeHiddenText].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun removeHiddenText(removeHiddenText: Boolean) =
                        removeHiddenText(removeHiddenText as Boolean?)

                    /**
                     * Alias for calling [Builder.removeHiddenText] with
                     * `removeHiddenText.orElse(null)`.
                     */
                    fun removeHiddenText(removeHiddenText: Optional<Boolean>) =
                        removeHiddenText(removeHiddenText.getOrNull())

                    /**
                     * Sets [Builder.removeHiddenText] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.removeHiddenText] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun removeHiddenText(removeHiddenText: JsonField<Boolean>) = apply {
                        this.removeHiddenText = removeHiddenText
                    }

                    /** Enum for representing the different available page error handling modes. */
                    fun replaceFailedPageMode(replaceFailedPageMode: FailPageMode?) =
                        replaceFailedPageMode(JsonField.ofNullable(replaceFailedPageMode))

                    /**
                     * Alias for calling [Builder.replaceFailedPageMode] with
                     * `replaceFailedPageMode.orElse(null)`.
                     */
                    fun replaceFailedPageMode(replaceFailedPageMode: Optional<FailPageMode>) =
                        replaceFailedPageMode(replaceFailedPageMode.getOrNull())

                    /**
                     * Sets [Builder.replaceFailedPageMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.replaceFailedPageMode] with a well-typed
                     * [FailPageMode] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun replaceFailedPageMode(replaceFailedPageMode: JsonField<FailPageMode>) =
                        apply {
                            this.replaceFailedPageMode = replaceFailedPageMode
                        }

                    fun replaceFailedPageWithErrorMessagePrefix(
                        replaceFailedPageWithErrorMessagePrefix: String?
                    ) =
                        replaceFailedPageWithErrorMessagePrefix(
                            JsonField.ofNullable(replaceFailedPageWithErrorMessagePrefix)
                        )

                    /**
                     * Alias for calling [Builder.replaceFailedPageWithErrorMessagePrefix] with
                     * `replaceFailedPageWithErrorMessagePrefix.orElse(null)`.
                     */
                    fun replaceFailedPageWithErrorMessagePrefix(
                        replaceFailedPageWithErrorMessagePrefix: Optional<String>
                    ) =
                        replaceFailedPageWithErrorMessagePrefix(
                            replaceFailedPageWithErrorMessagePrefix.getOrNull()
                        )

                    /**
                     * Sets [Builder.replaceFailedPageWithErrorMessagePrefix] to an arbitrary JSON
                     * value.
                     *
                     * You should usually call [Builder.replaceFailedPageWithErrorMessagePrefix]
                     * with a well-typed [String] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun replaceFailedPageWithErrorMessagePrefix(
                        replaceFailedPageWithErrorMessagePrefix: JsonField<String>
                    ) = apply {
                        this.replaceFailedPageWithErrorMessagePrefix =
                            replaceFailedPageWithErrorMessagePrefix
                    }

                    fun replaceFailedPageWithErrorMessageSuffix(
                        replaceFailedPageWithErrorMessageSuffix: String?
                    ) =
                        replaceFailedPageWithErrorMessageSuffix(
                            JsonField.ofNullable(replaceFailedPageWithErrorMessageSuffix)
                        )

                    /**
                     * Alias for calling [Builder.replaceFailedPageWithErrorMessageSuffix] with
                     * `replaceFailedPageWithErrorMessageSuffix.orElse(null)`.
                     */
                    fun replaceFailedPageWithErrorMessageSuffix(
                        replaceFailedPageWithErrorMessageSuffix: Optional<String>
                    ) =
                        replaceFailedPageWithErrorMessageSuffix(
                            replaceFailedPageWithErrorMessageSuffix.getOrNull()
                        )

                    /**
                     * Sets [Builder.replaceFailedPageWithErrorMessageSuffix] to an arbitrary JSON
                     * value.
                     *
                     * You should usually call [Builder.replaceFailedPageWithErrorMessageSuffix]
                     * with a well-typed [String] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun replaceFailedPageWithErrorMessageSuffix(
                        replaceFailedPageWithErrorMessageSuffix: JsonField<String>
                    ) = apply {
                        this.replaceFailedPageWithErrorMessageSuffix =
                            replaceFailedPageWithErrorMessageSuffix
                    }

                    /** The resource info about the file */
                    fun resourceInfo(resourceInfo: ResourceInfo?) =
                        resourceInfo(JsonField.ofNullable(resourceInfo))

                    /**
                     * Alias for calling [Builder.resourceInfo] with `resourceInfo.orElse(null)`.
                     */
                    fun resourceInfo(resourceInfo: Optional<ResourceInfo>) =
                        resourceInfo(resourceInfo.getOrNull())

                    /**
                     * Sets [Builder.resourceInfo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.resourceInfo] with a well-typed
                     * [ResourceInfo] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun resourceInfo(resourceInfo: JsonField<ResourceInfo>) = apply {
                        this.resourceInfo = resourceInfo
                    }

                    fun saveImages(saveImages: Boolean?) =
                        saveImages(JsonField.ofNullable(saveImages))

                    /**
                     * Alias for [Builder.saveImages].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun saveImages(saveImages: Boolean) = saveImages(saveImages as Boolean?)

                    /** Alias for calling [Builder.saveImages] with `saveImages.orElse(null)`. */
                    fun saveImages(saveImages: Optional<Boolean>) =
                        saveImages(saveImages.getOrNull())

                    /**
                     * Sets [Builder.saveImages] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.saveImages] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun saveImages(saveImages: JsonField<Boolean>) = apply {
                        this.saveImages = saveImages
                    }

                    fun skipDiagonalText(skipDiagonalText: Boolean?) =
                        skipDiagonalText(JsonField.ofNullable(skipDiagonalText))

                    /**
                     * Alias for [Builder.skipDiagonalText].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun skipDiagonalText(skipDiagonalText: Boolean) =
                        skipDiagonalText(skipDiagonalText as Boolean?)

                    /**
                     * Alias for calling [Builder.skipDiagonalText] with
                     * `skipDiagonalText.orElse(null)`.
                     */
                    fun skipDiagonalText(skipDiagonalText: Optional<Boolean>) =
                        skipDiagonalText(skipDiagonalText.getOrNull())

                    /**
                     * Sets [Builder.skipDiagonalText] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.skipDiagonalText] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun skipDiagonalText(skipDiagonalText: JsonField<Boolean>) = apply {
                        this.skipDiagonalText = skipDiagonalText
                    }

                    fun specializedChartParsingAgentic(specializedChartParsingAgentic: Boolean?) =
                        specializedChartParsingAgentic(
                            JsonField.ofNullable(specializedChartParsingAgentic)
                        )

                    /**
                     * Alias for [Builder.specializedChartParsingAgentic].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun specializedChartParsingAgentic(specializedChartParsingAgentic: Boolean) =
                        specializedChartParsingAgentic(specializedChartParsingAgentic as Boolean?)

                    /**
                     * Alias for calling [Builder.specializedChartParsingAgentic] with
                     * `specializedChartParsingAgentic.orElse(null)`.
                     */
                    fun specializedChartParsingAgentic(
                        specializedChartParsingAgentic: Optional<Boolean>
                    ) = specializedChartParsingAgentic(specializedChartParsingAgentic.getOrNull())

                    /**
                     * Sets [Builder.specializedChartParsingAgentic] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.specializedChartParsingAgentic] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun specializedChartParsingAgentic(
                        specializedChartParsingAgentic: JsonField<Boolean>
                    ) = apply {
                        this.specializedChartParsingAgentic = specializedChartParsingAgentic
                    }

                    fun specializedChartParsingEfficient(
                        specializedChartParsingEfficient: Boolean?
                    ) =
                        specializedChartParsingEfficient(
                            JsonField.ofNullable(specializedChartParsingEfficient)
                        )

                    /**
                     * Alias for [Builder.specializedChartParsingEfficient].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun specializedChartParsingEfficient(
                        specializedChartParsingEfficient: Boolean
                    ) =
                        specializedChartParsingEfficient(
                            specializedChartParsingEfficient as Boolean?
                        )

                    /**
                     * Alias for calling [Builder.specializedChartParsingEfficient] with
                     * `specializedChartParsingEfficient.orElse(null)`.
                     */
                    fun specializedChartParsingEfficient(
                        specializedChartParsingEfficient: Optional<Boolean>
                    ) =
                        specializedChartParsingEfficient(
                            specializedChartParsingEfficient.getOrNull()
                        )

                    /**
                     * Sets [Builder.specializedChartParsingEfficient] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.specializedChartParsingEfficient] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun specializedChartParsingEfficient(
                        specializedChartParsingEfficient: JsonField<Boolean>
                    ) = apply {
                        this.specializedChartParsingEfficient = specializedChartParsingEfficient
                    }

                    fun specializedChartParsingPlus(specializedChartParsingPlus: Boolean?) =
                        specializedChartParsingPlus(
                            JsonField.ofNullable(specializedChartParsingPlus)
                        )

                    /**
                     * Alias for [Builder.specializedChartParsingPlus].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun specializedChartParsingPlus(specializedChartParsingPlus: Boolean) =
                        specializedChartParsingPlus(specializedChartParsingPlus as Boolean?)

                    /**
                     * Alias for calling [Builder.specializedChartParsingPlus] with
                     * `specializedChartParsingPlus.orElse(null)`.
                     */
                    fun specializedChartParsingPlus(
                        specializedChartParsingPlus: Optional<Boolean>
                    ) = specializedChartParsingPlus(specializedChartParsingPlus.getOrNull())

                    /**
                     * Sets [Builder.specializedChartParsingPlus] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.specializedChartParsingPlus] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun specializedChartParsingPlus(
                        specializedChartParsingPlus: JsonField<Boolean>
                    ) = apply { this.specializedChartParsingPlus = specializedChartParsingPlus }

                    fun specializedImageParsing(specializedImageParsing: Boolean?) =
                        specializedImageParsing(JsonField.ofNullable(specializedImageParsing))

                    /**
                     * Alias for [Builder.specializedImageParsing].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun specializedImageParsing(specializedImageParsing: Boolean) =
                        specializedImageParsing(specializedImageParsing as Boolean?)

                    /**
                     * Alias for calling [Builder.specializedImageParsing] with
                     * `specializedImageParsing.orElse(null)`.
                     */
                    fun specializedImageParsing(specializedImageParsing: Optional<Boolean>) =
                        specializedImageParsing(specializedImageParsing.getOrNull())

                    /**
                     * Sets [Builder.specializedImageParsing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.specializedImageParsing] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun specializedImageParsing(specializedImageParsing: JsonField<Boolean>) =
                        apply {
                            this.specializedImageParsing = specializedImageParsing
                        }

                    fun spreadsheetExtractSubTables(spreadsheetExtractSubTables: Boolean?) =
                        spreadsheetExtractSubTables(
                            JsonField.ofNullable(spreadsheetExtractSubTables)
                        )

                    /**
                     * Alias for [Builder.spreadsheetExtractSubTables].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun spreadsheetExtractSubTables(spreadsheetExtractSubTables: Boolean) =
                        spreadsheetExtractSubTables(spreadsheetExtractSubTables as Boolean?)

                    /**
                     * Alias for calling [Builder.spreadsheetExtractSubTables] with
                     * `spreadsheetExtractSubTables.orElse(null)`.
                     */
                    fun spreadsheetExtractSubTables(
                        spreadsheetExtractSubTables: Optional<Boolean>
                    ) = spreadsheetExtractSubTables(spreadsheetExtractSubTables.getOrNull())

                    /**
                     * Sets [Builder.spreadsheetExtractSubTables] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.spreadsheetExtractSubTables] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun spreadsheetExtractSubTables(
                        spreadsheetExtractSubTables: JsonField<Boolean>
                    ) = apply { this.spreadsheetExtractSubTables = spreadsheetExtractSubTables }

                    fun spreadsheetForceFormulaComputation(
                        spreadsheetForceFormulaComputation: Boolean?
                    ) =
                        spreadsheetForceFormulaComputation(
                            JsonField.ofNullable(spreadsheetForceFormulaComputation)
                        )

                    /**
                     * Alias for [Builder.spreadsheetForceFormulaComputation].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun spreadsheetForceFormulaComputation(
                        spreadsheetForceFormulaComputation: Boolean
                    ) =
                        spreadsheetForceFormulaComputation(
                            spreadsheetForceFormulaComputation as Boolean?
                        )

                    /**
                     * Alias for calling [Builder.spreadsheetForceFormulaComputation] with
                     * `spreadsheetForceFormulaComputation.orElse(null)`.
                     */
                    fun spreadsheetForceFormulaComputation(
                        spreadsheetForceFormulaComputation: Optional<Boolean>
                    ) =
                        spreadsheetForceFormulaComputation(
                            spreadsheetForceFormulaComputation.getOrNull()
                        )

                    /**
                     * Sets [Builder.spreadsheetForceFormulaComputation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.spreadsheetForceFormulaComputation] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun spreadsheetForceFormulaComputation(
                        spreadsheetForceFormulaComputation: JsonField<Boolean>
                    ) = apply {
                        this.spreadsheetForceFormulaComputation = spreadsheetForceFormulaComputation
                    }

                    fun spreadsheetIncludeHiddenSheets(spreadsheetIncludeHiddenSheets: Boolean?) =
                        spreadsheetIncludeHiddenSheets(
                            JsonField.ofNullable(spreadsheetIncludeHiddenSheets)
                        )

                    /**
                     * Alias for [Builder.spreadsheetIncludeHiddenSheets].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun spreadsheetIncludeHiddenSheets(spreadsheetIncludeHiddenSheets: Boolean) =
                        spreadsheetIncludeHiddenSheets(spreadsheetIncludeHiddenSheets as Boolean?)

                    /**
                     * Alias for calling [Builder.spreadsheetIncludeHiddenSheets] with
                     * `spreadsheetIncludeHiddenSheets.orElse(null)`.
                     */
                    fun spreadsheetIncludeHiddenSheets(
                        spreadsheetIncludeHiddenSheets: Optional<Boolean>
                    ) = spreadsheetIncludeHiddenSheets(spreadsheetIncludeHiddenSheets.getOrNull())

                    /**
                     * Sets [Builder.spreadsheetIncludeHiddenSheets] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.spreadsheetIncludeHiddenSheets] with a
                     * well-typed [Boolean] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun spreadsheetIncludeHiddenSheets(
                        spreadsheetIncludeHiddenSheets: JsonField<Boolean>
                    ) = apply {
                        this.spreadsheetIncludeHiddenSheets = spreadsheetIncludeHiddenSheets
                    }

                    fun strictModeBuggyFont(strictModeBuggyFont: Boolean?) =
                        strictModeBuggyFont(JsonField.ofNullable(strictModeBuggyFont))

                    /**
                     * Alias for [Builder.strictModeBuggyFont].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun strictModeBuggyFont(strictModeBuggyFont: Boolean) =
                        strictModeBuggyFont(strictModeBuggyFont as Boolean?)

                    /**
                     * Alias for calling [Builder.strictModeBuggyFont] with
                     * `strictModeBuggyFont.orElse(null)`.
                     */
                    fun strictModeBuggyFont(strictModeBuggyFont: Optional<Boolean>) =
                        strictModeBuggyFont(strictModeBuggyFont.getOrNull())

                    /**
                     * Sets [Builder.strictModeBuggyFont] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.strictModeBuggyFont] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun strictModeBuggyFont(strictModeBuggyFont: JsonField<Boolean>) = apply {
                        this.strictModeBuggyFont = strictModeBuggyFont
                    }

                    fun strictModeImageExtraction(strictModeImageExtraction: Boolean?) =
                        strictModeImageExtraction(JsonField.ofNullable(strictModeImageExtraction))

                    /**
                     * Alias for [Builder.strictModeImageExtraction].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun strictModeImageExtraction(strictModeImageExtraction: Boolean) =
                        strictModeImageExtraction(strictModeImageExtraction as Boolean?)

                    /**
                     * Alias for calling [Builder.strictModeImageExtraction] with
                     * `strictModeImageExtraction.orElse(null)`.
                     */
                    fun strictModeImageExtraction(strictModeImageExtraction: Optional<Boolean>) =
                        strictModeImageExtraction(strictModeImageExtraction.getOrNull())

                    /**
                     * Sets [Builder.strictModeImageExtraction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.strictModeImageExtraction] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun strictModeImageExtraction(strictModeImageExtraction: JsonField<Boolean>) =
                        apply {
                            this.strictModeImageExtraction = strictModeImageExtraction
                        }

                    fun strictModeImageOcr(strictModeImageOcr: Boolean?) =
                        strictModeImageOcr(JsonField.ofNullable(strictModeImageOcr))

                    /**
                     * Alias for [Builder.strictModeImageOcr].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun strictModeImageOcr(strictModeImageOcr: Boolean) =
                        strictModeImageOcr(strictModeImageOcr as Boolean?)

                    /**
                     * Alias for calling [Builder.strictModeImageOcr] with
                     * `strictModeImageOcr.orElse(null)`.
                     */
                    fun strictModeImageOcr(strictModeImageOcr: Optional<Boolean>) =
                        strictModeImageOcr(strictModeImageOcr.getOrNull())

                    /**
                     * Sets [Builder.strictModeImageOcr] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.strictModeImageOcr] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun strictModeImageOcr(strictModeImageOcr: JsonField<Boolean>) = apply {
                        this.strictModeImageOcr = strictModeImageOcr
                    }

                    fun strictModeReconstruction(strictModeReconstruction: Boolean?) =
                        strictModeReconstruction(JsonField.ofNullable(strictModeReconstruction))

                    /**
                     * Alias for [Builder.strictModeReconstruction].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun strictModeReconstruction(strictModeReconstruction: Boolean) =
                        strictModeReconstruction(strictModeReconstruction as Boolean?)

                    /**
                     * Alias for calling [Builder.strictModeReconstruction] with
                     * `strictModeReconstruction.orElse(null)`.
                     */
                    fun strictModeReconstruction(strictModeReconstruction: Optional<Boolean>) =
                        strictModeReconstruction(strictModeReconstruction.getOrNull())

                    /**
                     * Sets [Builder.strictModeReconstruction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.strictModeReconstruction] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun strictModeReconstruction(strictModeReconstruction: JsonField<Boolean>) =
                        apply {
                            this.strictModeReconstruction = strictModeReconstruction
                        }

                    fun structuredOutput(structuredOutput: Boolean?) =
                        structuredOutput(JsonField.ofNullable(structuredOutput))

                    /**
                     * Alias for [Builder.structuredOutput].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun structuredOutput(structuredOutput: Boolean) =
                        structuredOutput(structuredOutput as Boolean?)

                    /**
                     * Alias for calling [Builder.structuredOutput] with
                     * `structuredOutput.orElse(null)`.
                     */
                    fun structuredOutput(structuredOutput: Optional<Boolean>) =
                        structuredOutput(structuredOutput.getOrNull())

                    /**
                     * Sets [Builder.structuredOutput] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.structuredOutput] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun structuredOutput(structuredOutput: JsonField<Boolean>) = apply {
                        this.structuredOutput = structuredOutput
                    }

                    fun structuredOutputJsonSchema(structuredOutputJsonSchema: String?) =
                        structuredOutputJsonSchema(JsonField.ofNullable(structuredOutputJsonSchema))

                    /**
                     * Alias for calling [Builder.structuredOutputJsonSchema] with
                     * `structuredOutputJsonSchema.orElse(null)`.
                     */
                    fun structuredOutputJsonSchema(structuredOutputJsonSchema: Optional<String>) =
                        structuredOutputJsonSchema(structuredOutputJsonSchema.getOrNull())

                    /**
                     * Sets [Builder.structuredOutputJsonSchema] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.structuredOutputJsonSchema] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun structuredOutputJsonSchema(structuredOutputJsonSchema: JsonField<String>) =
                        apply {
                            this.structuredOutputJsonSchema = structuredOutputJsonSchema
                        }

                    fun structuredOutputJsonSchemaName(structuredOutputJsonSchemaName: String?) =
                        structuredOutputJsonSchemaName(
                            JsonField.ofNullable(structuredOutputJsonSchemaName)
                        )

                    /**
                     * Alias for calling [Builder.structuredOutputJsonSchemaName] with
                     * `structuredOutputJsonSchemaName.orElse(null)`.
                     */
                    fun structuredOutputJsonSchemaName(
                        structuredOutputJsonSchemaName: Optional<String>
                    ) = structuredOutputJsonSchemaName(structuredOutputJsonSchemaName.getOrNull())

                    /**
                     * Sets [Builder.structuredOutputJsonSchemaName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.structuredOutputJsonSchemaName] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun structuredOutputJsonSchemaName(
                        structuredOutputJsonSchemaName: JsonField<String>
                    ) = apply {
                        this.structuredOutputJsonSchemaName = structuredOutputJsonSchemaName
                    }

                    fun systemPrompt(systemPrompt: String?) =
                        systemPrompt(JsonField.ofNullable(systemPrompt))

                    /**
                     * Alias for calling [Builder.systemPrompt] with `systemPrompt.orElse(null)`.
                     */
                    fun systemPrompt(systemPrompt: Optional<String>) =
                        systemPrompt(systemPrompt.getOrNull())

                    /**
                     * Sets [Builder.systemPrompt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.systemPrompt] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun systemPrompt(systemPrompt: JsonField<String>) = apply {
                        this.systemPrompt = systemPrompt
                    }

                    fun systemPromptAppend(systemPromptAppend: String?) =
                        systemPromptAppend(JsonField.ofNullable(systemPromptAppend))

                    /**
                     * Alias for calling [Builder.systemPromptAppend] with
                     * `systemPromptAppend.orElse(null)`.
                     */
                    fun systemPromptAppend(systemPromptAppend: Optional<String>) =
                        systemPromptAppend(systemPromptAppend.getOrNull())

                    /**
                     * Sets [Builder.systemPromptAppend] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.systemPromptAppend] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun systemPromptAppend(systemPromptAppend: JsonField<String>) = apply {
                        this.systemPromptAppend = systemPromptAppend
                    }

                    fun takeScreenshot(takeScreenshot: Boolean?) =
                        takeScreenshot(JsonField.ofNullable(takeScreenshot))

                    /**
                     * Alias for [Builder.takeScreenshot].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun takeScreenshot(takeScreenshot: Boolean) =
                        takeScreenshot(takeScreenshot as Boolean?)

                    /**
                     * Alias for calling [Builder.takeScreenshot] with
                     * `takeScreenshot.orElse(null)`.
                     */
                    fun takeScreenshot(takeScreenshot: Optional<Boolean>) =
                        takeScreenshot(takeScreenshot.getOrNull())

                    /**
                     * Sets [Builder.takeScreenshot] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.takeScreenshot] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun takeScreenshot(takeScreenshot: JsonField<Boolean>) = apply {
                        this.takeScreenshot = takeScreenshot
                    }

                    fun targetPages(targetPages: String?) =
                        targetPages(JsonField.ofNullable(targetPages))

                    /** Alias for calling [Builder.targetPages] with `targetPages.orElse(null)`. */
                    fun targetPages(targetPages: Optional<String>) =
                        targetPages(targetPages.getOrNull())

                    /**
                     * Sets [Builder.targetPages] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.targetPages] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun targetPages(targetPages: JsonField<String>) = apply {
                        this.targetPages = targetPages
                    }

                    fun tier(tier: String?) = tier(JsonField.ofNullable(tier))

                    /** Alias for calling [Builder.tier] with `tier.orElse(null)`. */
                    fun tier(tier: Optional<String>) = tier(tier.getOrNull())

                    /**
                     * Sets [Builder.tier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tier] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tier(tier: JsonField<String>) = apply { this.tier = tier }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun useVendorMultimodalModel(useVendorMultimodalModel: Boolean?) =
                        useVendorMultimodalModel(JsonField.ofNullable(useVendorMultimodalModel))

                    /**
                     * Alias for [Builder.useVendorMultimodalModel].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun useVendorMultimodalModel(useVendorMultimodalModel: Boolean) =
                        useVendorMultimodalModel(useVendorMultimodalModel as Boolean?)

                    /**
                     * Alias for calling [Builder.useVendorMultimodalModel] with
                     * `useVendorMultimodalModel.orElse(null)`.
                     */
                    fun useVendorMultimodalModel(useVendorMultimodalModel: Optional<Boolean>) =
                        useVendorMultimodalModel(useVendorMultimodalModel.getOrNull())

                    /**
                     * Sets [Builder.useVendorMultimodalModel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.useVendorMultimodalModel] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun useVendorMultimodalModel(useVendorMultimodalModel: JsonField<Boolean>) =
                        apply {
                            this.useVendorMultimodalModel = useVendorMultimodalModel
                        }

                    fun userPrompt(userPrompt: String?) =
                        userPrompt(JsonField.ofNullable(userPrompt))

                    /** Alias for calling [Builder.userPrompt] with `userPrompt.orElse(null)`. */
                    fun userPrompt(userPrompt: Optional<String>) =
                        userPrompt(userPrompt.getOrNull())

                    /**
                     * Sets [Builder.userPrompt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.userPrompt] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun userPrompt(userPrompt: JsonField<String>) = apply {
                        this.userPrompt = userPrompt
                    }

                    fun vendorMultimodalApiKey(vendorMultimodalApiKey: String?) =
                        vendorMultimodalApiKey(JsonField.ofNullable(vendorMultimodalApiKey))

                    /**
                     * Alias for calling [Builder.vendorMultimodalApiKey] with
                     * `vendorMultimodalApiKey.orElse(null)`.
                     */
                    fun vendorMultimodalApiKey(vendorMultimodalApiKey: Optional<String>) =
                        vendorMultimodalApiKey(vendorMultimodalApiKey.getOrNull())

                    /**
                     * Sets [Builder.vendorMultimodalApiKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.vendorMultimodalApiKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun vendorMultimodalApiKey(vendorMultimodalApiKey: JsonField<String>) = apply {
                        this.vendorMultimodalApiKey = vendorMultimodalApiKey
                    }

                    fun vendorMultimodalModelName(vendorMultimodalModelName: String?) =
                        vendorMultimodalModelName(JsonField.ofNullable(vendorMultimodalModelName))

                    /**
                     * Alias for calling [Builder.vendorMultimodalModelName] with
                     * `vendorMultimodalModelName.orElse(null)`.
                     */
                    fun vendorMultimodalModelName(vendorMultimodalModelName: Optional<String>) =
                        vendorMultimodalModelName(vendorMultimodalModelName.getOrNull())

                    /**
                     * Sets [Builder.vendorMultimodalModelName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.vendorMultimodalModelName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun vendorMultimodalModelName(vendorMultimodalModelName: JsonField<String>) =
                        apply {
                            this.vendorMultimodalModelName = vendorMultimodalModelName
                        }

                    fun version(version: String?) = version(JsonField.ofNullable(version))

                    /** Alias for calling [Builder.version] with `version.orElse(null)`. */
                    fun version(version: Optional<String>) = version(version.getOrNull())

                    /**
                     * Sets [Builder.version] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.version] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun version(version: JsonField<String>) = apply { this.version = version }

                    /** Outbound webhook endpoints to notify on job status changes */
                    fun webhookConfigurations(webhookConfigurations: List<WebhookConfiguration>?) =
                        webhookConfigurations(JsonField.ofNullable(webhookConfigurations))

                    /**
                     * Alias for calling [Builder.webhookConfigurations] with
                     * `webhookConfigurations.orElse(null)`.
                     */
                    fun webhookConfigurations(
                        webhookConfigurations: Optional<List<WebhookConfiguration>>
                    ) = webhookConfigurations(webhookConfigurations.getOrNull())

                    /**
                     * Sets [Builder.webhookConfigurations] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.webhookConfigurations] with a well-typed
                     * `List<WebhookConfiguration>` value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun webhookConfigurations(
                        webhookConfigurations: JsonField<List<WebhookConfiguration>>
                    ) = apply {
                        this.webhookConfigurations =
                            webhookConfigurations.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [WebhookConfiguration] to [webhookConfigurations].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addWebhookConfiguration(webhookConfiguration: WebhookConfiguration) =
                        apply {
                            webhookConfigurations =
                                (webhookConfigurations ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("webhookConfigurations", it)
                                        .add(webhookConfiguration)
                                }
                        }

                    fun webhookUrl(webhookUrl: String?) =
                        webhookUrl(JsonField.ofNullable(webhookUrl))

                    /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
                    fun webhookUrl(webhookUrl: Optional<String>) =
                        webhookUrl(webhookUrl.getOrNull())

                    /**
                     * Sets [Builder.webhookUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.webhookUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun webhookUrl(webhookUrl: JsonField<String>) = apply {
                        this.webhookUrl = webhookUrl
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
                     * Returns an immutable instance of [Parameters].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Parameters =
                        Parameters(
                            adaptiveLongTable,
                            aggressiveTableExtraction,
                            annotateLinks,
                            autoMode,
                            autoModeConfigurationJson,
                            autoModeTriggerOnImageInPage,
                            autoModeTriggerOnRegexpInPage,
                            autoModeTriggerOnTableInPage,
                            autoModeTriggerOnTextInPage,
                            azureOpenAIApiVersion,
                            azureOpenAIDeploymentName,
                            azureOpenAIEndpoint,
                            azureOpenAIKey,
                            bboxBottom,
                            bboxLeft,
                            bboxRight,
                            bboxTop,
                            boundingBox,
                            compactMarkdownTable,
                            complementalFormattingInstruction,
                            contentGuidelineInstruction,
                            continuousMode,
                            customMetadata,
                            disableImageExtraction,
                            disableOcr,
                            disableReconstruction,
                            doNotCache,
                            doNotUnrollColumns,
                            enableCostOptimizer,
                            extractCharts,
                            extractLayout,
                            extractPrintedPageNumber,
                            fastMode,
                            formattingInstruction,
                            gpt4oApiKey,
                            gpt4oMode,
                            guessXlsxSheetName,
                            hideFooters,
                            hideHeaders,
                            highResOcr,
                            htmlMakeAllElementsVisible,
                            htmlRemoveFixedElements,
                            htmlRemoveNavigationElements,
                            httpProxy,
                            ignoreDocumentElementsForLayoutDetection,
                            (imagesToSave ?: JsonMissing.of()).map { it.toImmutable() },
                            inlineImagesInMarkdown,
                            inputS3Path,
                            inputS3Region,
                            inputUrl,
                            internalIsScreenshotJob,
                            invalidateCache,
                            isFormattingInstruction,
                            jobTimeoutExtraTimePerPageInSeconds,
                            jobTimeoutInSeconds,
                            keepPageSeparatorWhenMergingTables,
                            lang,
                            (languages ?: JsonMissing.of()).map { it.toImmutable() },
                            layoutAware,
                            lineLevelBoundingBox,
                            markdownTableMultilineHeaderSeparator,
                            maxPages,
                            maxPagesEnforced,
                            mergeTablesAcrossPagesInMarkdown,
                            model,
                            outlinedTableExtraction,
                            outputPdfOfDocument,
                            outputS3PathPrefix,
                            outputS3Region,
                            outputTablesAsHtml,
                            outputBucket,
                            pageErrorTolerance,
                            pageFooterPrefix,
                            pageFooterSuffix,
                            pageHeaderPrefix,
                            pageHeaderSuffix,
                            pagePrefix,
                            pageSeparator,
                            pageSuffix,
                            parseMode,
                            parsingInstruction,
                            pipelineId,
                            preciseBoundingBox,
                            premiumMode,
                            presentationOutOfBoundsContent,
                            presentationSkipEmbeddedData,
                            preserveLayoutAlignmentAcrossPages,
                            preserveVerySmallText,
                            preset,
                            priority,
                            projectId,
                            removeHiddenText,
                            replaceFailedPageMode,
                            replaceFailedPageWithErrorMessagePrefix,
                            replaceFailedPageWithErrorMessageSuffix,
                            resourceInfo,
                            saveImages,
                            skipDiagonalText,
                            specializedChartParsingAgentic,
                            specializedChartParsingEfficient,
                            specializedChartParsingPlus,
                            specializedImageParsing,
                            spreadsheetExtractSubTables,
                            spreadsheetForceFormulaComputation,
                            spreadsheetIncludeHiddenSheets,
                            strictModeBuggyFont,
                            strictModeImageExtraction,
                            strictModeImageOcr,
                            strictModeReconstruction,
                            structuredOutput,
                            structuredOutputJsonSchema,
                            structuredOutputJsonSchemaName,
                            systemPrompt,
                            systemPromptAppend,
                            takeScreenshot,
                            targetPages,
                            tier,
                            type,
                            useVendorMultimodalModel,
                            userPrompt,
                            vendorMultimodalApiKey,
                            vendorMultimodalModelName,
                            version,
                            (webhookConfigurations ?: JsonMissing.of()).map { it.toImmutable() },
                            webhookUrl,
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
                fun validate(): Parameters = apply {
                    if (validated) {
                        return@apply
                    }

                    adaptiveLongTable()
                    aggressiveTableExtraction()
                    annotateLinks()
                    autoMode()
                    autoModeConfigurationJson()
                    autoModeTriggerOnImageInPage()
                    autoModeTriggerOnRegexpInPage()
                    autoModeTriggerOnTableInPage()
                    autoModeTriggerOnTextInPage()
                    azureOpenAIApiVersion()
                    azureOpenAIDeploymentName()
                    azureOpenAIEndpoint()
                    azureOpenAIKey()
                    bboxBottom()
                    bboxLeft()
                    bboxRight()
                    bboxTop()
                    boundingBox()
                    compactMarkdownTable()
                    complementalFormattingInstruction()
                    contentGuidelineInstruction()
                    continuousMode()
                    customMetadata().ifPresent { it.validate() }
                    disableImageExtraction()
                    disableOcr()
                    disableReconstruction()
                    doNotCache()
                    doNotUnrollColumns()
                    enableCostOptimizer()
                    extractCharts()
                    extractLayout()
                    extractPrintedPageNumber()
                    fastMode()
                    formattingInstruction()
                    gpt4oApiKey()
                    gpt4oMode()
                    guessXlsxSheetName()
                    hideFooters()
                    hideHeaders()
                    highResOcr()
                    htmlMakeAllElementsVisible()
                    htmlRemoveFixedElements()
                    htmlRemoveNavigationElements()
                    httpProxy()
                    ignoreDocumentElementsForLayoutDetection()
                    imagesToSave().ifPresent { it.forEach { it.validate() } }
                    inlineImagesInMarkdown()
                    inputS3Path()
                    inputS3Region()
                    inputUrl()
                    internalIsScreenshotJob()
                    invalidateCache()
                    isFormattingInstruction()
                    jobTimeoutExtraTimePerPageInSeconds()
                    jobTimeoutInSeconds()
                    keepPageSeparatorWhenMergingTables()
                    lang()
                    languages().ifPresent { it.forEach { it.validate() } }
                    layoutAware()
                    lineLevelBoundingBox()
                    markdownTableMultilineHeaderSeparator()
                    maxPages()
                    maxPagesEnforced()
                    mergeTablesAcrossPagesInMarkdown()
                    model()
                    outlinedTableExtraction()
                    outputPdfOfDocument()
                    outputS3PathPrefix()
                    outputS3Region()
                    outputTablesAsHtml()
                    outputBucket()
                    pageErrorTolerance()
                    pageFooterPrefix()
                    pageFooterSuffix()
                    pageHeaderPrefix()
                    pageHeaderSuffix()
                    pagePrefix()
                    pageSeparator()
                    pageSuffix()
                    parseMode().ifPresent { it.validate() }
                    parsingInstruction()
                    pipelineId()
                    preciseBoundingBox()
                    premiumMode()
                    presentationOutOfBoundsContent()
                    presentationSkipEmbeddedData()
                    preserveLayoutAlignmentAcrossPages()
                    preserveVerySmallText()
                    preset()
                    priority().ifPresent { it.validate() }
                    projectId()
                    removeHiddenText()
                    replaceFailedPageMode().ifPresent { it.validate() }
                    replaceFailedPageWithErrorMessagePrefix()
                    replaceFailedPageWithErrorMessageSuffix()
                    resourceInfo().ifPresent { it.validate() }
                    saveImages()
                    skipDiagonalText()
                    specializedChartParsingAgentic()
                    specializedChartParsingEfficient()
                    specializedChartParsingPlus()
                    specializedImageParsing()
                    spreadsheetExtractSubTables()
                    spreadsheetForceFormulaComputation()
                    spreadsheetIncludeHiddenSheets()
                    strictModeBuggyFont()
                    strictModeImageExtraction()
                    strictModeImageOcr()
                    strictModeReconstruction()
                    structuredOutput()
                    structuredOutputJsonSchema()
                    structuredOutputJsonSchemaName()
                    systemPrompt()
                    systemPromptAppend()
                    takeScreenshot()
                    targetPages()
                    tier()
                    type().ifPresent { it.validate() }
                    useVendorMultimodalModel()
                    userPrompt()
                    vendorMultimodalApiKey()
                    vendorMultimodalModelName()
                    version()
                    webhookConfigurations().ifPresent { it.forEach { it.validate() } }
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
                    (if (adaptiveLongTable.asKnown().isPresent) 1 else 0) +
                        (if (aggressiveTableExtraction.asKnown().isPresent) 1 else 0) +
                        (if (annotateLinks.asKnown().isPresent) 1 else 0) +
                        (if (autoMode.asKnown().isPresent) 1 else 0) +
                        (if (autoModeConfigurationJson.asKnown().isPresent) 1 else 0) +
                        (if (autoModeTriggerOnImageInPage.asKnown().isPresent) 1 else 0) +
                        (if (autoModeTriggerOnRegexpInPage.asKnown().isPresent) 1 else 0) +
                        (if (autoModeTriggerOnTableInPage.asKnown().isPresent) 1 else 0) +
                        (if (autoModeTriggerOnTextInPage.asKnown().isPresent) 1 else 0) +
                        (if (azureOpenAIApiVersion.asKnown().isPresent) 1 else 0) +
                        (if (azureOpenAIDeploymentName.asKnown().isPresent) 1 else 0) +
                        (if (azureOpenAIEndpoint.asKnown().isPresent) 1 else 0) +
                        (if (azureOpenAIKey.asKnown().isPresent) 1 else 0) +
                        (if (bboxBottom.asKnown().isPresent) 1 else 0) +
                        (if (bboxLeft.asKnown().isPresent) 1 else 0) +
                        (if (bboxRight.asKnown().isPresent) 1 else 0) +
                        (if (bboxTop.asKnown().isPresent) 1 else 0) +
                        (if (boundingBox.asKnown().isPresent) 1 else 0) +
                        (if (compactMarkdownTable.asKnown().isPresent) 1 else 0) +
                        (if (complementalFormattingInstruction.asKnown().isPresent) 1 else 0) +
                        (if (contentGuidelineInstruction.asKnown().isPresent) 1 else 0) +
                        (if (continuousMode.asKnown().isPresent) 1 else 0) +
                        (customMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (disableImageExtraction.asKnown().isPresent) 1 else 0) +
                        (if (disableOcr.asKnown().isPresent) 1 else 0) +
                        (if (disableReconstruction.asKnown().isPresent) 1 else 0) +
                        (if (doNotCache.asKnown().isPresent) 1 else 0) +
                        (if (doNotUnrollColumns.asKnown().isPresent) 1 else 0) +
                        (if (enableCostOptimizer.asKnown().isPresent) 1 else 0) +
                        (if (extractCharts.asKnown().isPresent) 1 else 0) +
                        (if (extractLayout.asKnown().isPresent) 1 else 0) +
                        (if (extractPrintedPageNumber.asKnown().isPresent) 1 else 0) +
                        (if (fastMode.asKnown().isPresent) 1 else 0) +
                        (if (formattingInstruction.asKnown().isPresent) 1 else 0) +
                        (if (gpt4oApiKey.asKnown().isPresent) 1 else 0) +
                        (if (gpt4oMode.asKnown().isPresent) 1 else 0) +
                        (if (guessXlsxSheetName.asKnown().isPresent) 1 else 0) +
                        (if (hideFooters.asKnown().isPresent) 1 else 0) +
                        (if (hideHeaders.asKnown().isPresent) 1 else 0) +
                        (if (highResOcr.asKnown().isPresent) 1 else 0) +
                        (if (htmlMakeAllElementsVisible.asKnown().isPresent) 1 else 0) +
                        (if (htmlRemoveFixedElements.asKnown().isPresent) 1 else 0) +
                        (if (htmlRemoveNavigationElements.asKnown().isPresent) 1 else 0) +
                        (if (httpProxy.asKnown().isPresent) 1 else 0) +
                        (if (ignoreDocumentElementsForLayoutDetection.asKnown().isPresent) 1
                        else 0) +
                        (imagesToSave.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (inlineImagesInMarkdown.asKnown().isPresent) 1 else 0) +
                        (if (inputS3Path.asKnown().isPresent) 1 else 0) +
                        (if (inputS3Region.asKnown().isPresent) 1 else 0) +
                        (if (inputUrl.asKnown().isPresent) 1 else 0) +
                        (if (internalIsScreenshotJob.asKnown().isPresent) 1 else 0) +
                        (if (invalidateCache.asKnown().isPresent) 1 else 0) +
                        (if (isFormattingInstruction.asKnown().isPresent) 1 else 0) +
                        (if (jobTimeoutExtraTimePerPageInSeconds.asKnown().isPresent) 1 else 0) +
                        (if (jobTimeoutInSeconds.asKnown().isPresent) 1 else 0) +
                        (if (keepPageSeparatorWhenMergingTables.asKnown().isPresent) 1 else 0) +
                        (if (lang.asKnown().isPresent) 1 else 0) +
                        (languages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (layoutAware.asKnown().isPresent) 1 else 0) +
                        (if (lineLevelBoundingBox.asKnown().isPresent) 1 else 0) +
                        (if (markdownTableMultilineHeaderSeparator.asKnown().isPresent) 1 else 0) +
                        (if (maxPages.asKnown().isPresent) 1 else 0) +
                        (if (maxPagesEnforced.asKnown().isPresent) 1 else 0) +
                        (if (mergeTablesAcrossPagesInMarkdown.asKnown().isPresent) 1 else 0) +
                        (if (model.asKnown().isPresent) 1 else 0) +
                        (if (outlinedTableExtraction.asKnown().isPresent) 1 else 0) +
                        (if (outputPdfOfDocument.asKnown().isPresent) 1 else 0) +
                        (if (outputS3PathPrefix.asKnown().isPresent) 1 else 0) +
                        (if (outputS3Region.asKnown().isPresent) 1 else 0) +
                        (if (outputTablesAsHtml.asKnown().isPresent) 1 else 0) +
                        (if (outputBucket.asKnown().isPresent) 1 else 0) +
                        (if (pageErrorTolerance.asKnown().isPresent) 1 else 0) +
                        (if (pageFooterPrefix.asKnown().isPresent) 1 else 0) +
                        (if (pageFooterSuffix.asKnown().isPresent) 1 else 0) +
                        (if (pageHeaderPrefix.asKnown().isPresent) 1 else 0) +
                        (if (pageHeaderSuffix.asKnown().isPresent) 1 else 0) +
                        (if (pagePrefix.asKnown().isPresent) 1 else 0) +
                        (if (pageSeparator.asKnown().isPresent) 1 else 0) +
                        (if (pageSuffix.asKnown().isPresent) 1 else 0) +
                        (parseMode.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (parsingInstruction.asKnown().isPresent) 1 else 0) +
                        (if (pipelineId.asKnown().isPresent) 1 else 0) +
                        (if (preciseBoundingBox.asKnown().isPresent) 1 else 0) +
                        (if (premiumMode.asKnown().isPresent) 1 else 0) +
                        (if (presentationOutOfBoundsContent.asKnown().isPresent) 1 else 0) +
                        (if (presentationSkipEmbeddedData.asKnown().isPresent) 1 else 0) +
                        (if (preserveLayoutAlignmentAcrossPages.asKnown().isPresent) 1 else 0) +
                        (if (preserveVerySmallText.asKnown().isPresent) 1 else 0) +
                        (if (preset.asKnown().isPresent) 1 else 0) +
                        (priority.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (projectId.asKnown().isPresent) 1 else 0) +
                        (if (removeHiddenText.asKnown().isPresent) 1 else 0) +
                        (replaceFailedPageMode.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (replaceFailedPageWithErrorMessagePrefix.asKnown().isPresent) 1
                        else 0) +
                        (if (replaceFailedPageWithErrorMessageSuffix.asKnown().isPresent) 1
                        else 0) +
                        (resourceInfo.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (saveImages.asKnown().isPresent) 1 else 0) +
                        (if (skipDiagonalText.asKnown().isPresent) 1 else 0) +
                        (if (specializedChartParsingAgentic.asKnown().isPresent) 1 else 0) +
                        (if (specializedChartParsingEfficient.asKnown().isPresent) 1 else 0) +
                        (if (specializedChartParsingPlus.asKnown().isPresent) 1 else 0) +
                        (if (specializedImageParsing.asKnown().isPresent) 1 else 0) +
                        (if (spreadsheetExtractSubTables.asKnown().isPresent) 1 else 0) +
                        (if (spreadsheetForceFormulaComputation.asKnown().isPresent) 1 else 0) +
                        (if (spreadsheetIncludeHiddenSheets.asKnown().isPresent) 1 else 0) +
                        (if (strictModeBuggyFont.asKnown().isPresent) 1 else 0) +
                        (if (strictModeImageExtraction.asKnown().isPresent) 1 else 0) +
                        (if (strictModeImageOcr.asKnown().isPresent) 1 else 0) +
                        (if (strictModeReconstruction.asKnown().isPresent) 1 else 0) +
                        (if (structuredOutput.asKnown().isPresent) 1 else 0) +
                        (if (structuredOutputJsonSchema.asKnown().isPresent) 1 else 0) +
                        (if (structuredOutputJsonSchemaName.asKnown().isPresent) 1 else 0) +
                        (if (systemPrompt.asKnown().isPresent) 1 else 0) +
                        (if (systemPromptAppend.asKnown().isPresent) 1 else 0) +
                        (if (takeScreenshot.asKnown().isPresent) 1 else 0) +
                        (if (targetPages.asKnown().isPresent) 1 else 0) +
                        (if (tier.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (useVendorMultimodalModel.asKnown().isPresent) 1 else 0) +
                        (if (userPrompt.asKnown().isPresent) 1 else 0) +
                        (if (vendorMultimodalApiKey.asKnown().isPresent) 1 else 0) +
                        (if (vendorMultimodalModelName.asKnown().isPresent) 1 else 0) +
                        (if (version.asKnown().isPresent) 1 else 0) +
                        (webhookConfigurations.asKnown().getOrNull()?.sumOf {
                            it.validity().toInt()
                        } ?: 0) +
                        (if (webhookUrl.asKnown().isPresent) 1 else 0)

                /** The custom metadata to attach to the documents. */
                class CustomMetadata
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

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [CustomMetadata].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomMetadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(customMetadata: CustomMetadata) = apply {
                            additionalProperties =
                                customMetadata.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [CustomMetadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): CustomMetadata =
                            CustomMetadata(additionalProperties.toImmutable())
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
                    fun validate(): CustomMetadata = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomMetadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomMetadata{additionalProperties=$additionalProperties}"
                }

                class ImagesToSave
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
                     * An enum containing [ImagesToSave]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ImagesToSave] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SCREENSHOT,
                        EMBEDDED,
                        LAYOUT,
                        /**
                         * An enum member indicating that [ImagesToSave] was instantiated with an
                         * unknown value.
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
                            SCREENSHOT -> Value.SCREENSHOT
                            EMBEDDED -> Value.EMBEDDED
                            LAYOUT -> Value.LAYOUT
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
                            SCREENSHOT -> Known.SCREENSHOT
                            EMBEDDED -> Known.EMBEDDED
                            LAYOUT -> Known.LAYOUT
                            else ->
                                throw LlamaCloudInvalidDataException("Unknown ImagesToSave: $value")
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ImagesToSave && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * The priority for the request. This field may be ignored or overwritten depending
                 * on the organization tier.
                 */
                class Priority
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

                        @JvmField val LOW = of("low")

                        @JvmField val MEDIUM = of("medium")

                        @JvmField val HIGH = of("high")

                        @JvmField val CRITICAL = of("critical")

                        @JvmStatic fun of(value: String) = Priority(JsonField.of(value))
                    }

                    /** An enum containing [Priority]'s known values. */
                    enum class Known {
                        LOW,
                        MEDIUM,
                        HIGH,
                        CRITICAL,
                    }

                    /**
                     * An enum containing [Priority]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Priority] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        LOW,
                        MEDIUM,
                        HIGH,
                        CRITICAL,
                        /**
                         * An enum member indicating that [Priority] was instantiated with an
                         * unknown value.
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
                            LOW -> Value.LOW
                            MEDIUM -> Value.MEDIUM
                            HIGH -> Value.HIGH
                            CRITICAL -> Value.CRITICAL
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
                            LOW -> Known.LOW
                            MEDIUM -> Known.MEDIUM
                            HIGH -> Known.HIGH
                            CRITICAL -> Known.CRITICAL
                            else -> throw LlamaCloudInvalidDataException("Unknown Priority: $value")
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
                    fun validate(): Priority = apply {
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

                        return other is Priority && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** The resource info about the file */
                class ResourceInfo
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

                        /**
                         * Returns a mutable builder for constructing an instance of [ResourceInfo].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ResourceInfo]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(resourceInfo: ResourceInfo) = apply {
                            additionalProperties = resourceInfo.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [ResourceInfo].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ResourceInfo = ResourceInfo(additionalProperties.toImmutable())
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
                    fun validate(): ResourceInfo = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ResourceInfo &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ResourceInfo{additionalProperties=$additionalProperties}"
                }

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                        @JvmField val PARSE = of("parse")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PARSE
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PARSE,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
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
                            PARSE -> Value.PARSE
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
                            PARSE -> Known.PARSE
                            else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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
                    fun validate(): Type = apply {
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

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Configuration for a single outbound webhook endpoint. */
                class WebhookConfiguration
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val webhookEvents: JsonField<List<WebhookEvent>>,
                    private val webhookHeaders: JsonField<WebhookHeaders>,
                    private val webhookOutputFormat: JsonField<String>,
                    private val webhookUrl: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("webhook_events")
                        @ExcludeMissing
                        webhookEvents: JsonField<List<WebhookEvent>> = JsonMissing.of(),
                        @JsonProperty("webhook_headers")
                        @ExcludeMissing
                        webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of(),
                        @JsonProperty("webhook_output_format")
                        @ExcludeMissing
                        webhookOutputFormat: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("webhook_url")
                        @ExcludeMissing
                        webhookUrl: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        webhookEvents,
                        webhookHeaders,
                        webhookOutputFormat,
                        webhookUrl,
                        mutableMapOf(),
                    )

                    /**
                     * Events to subscribe to (e.g. 'parse.success', 'extract.error'). If null, all
                     * events are delivered.
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun webhookEvents(): Optional<List<WebhookEvent>> =
                        webhookEvents.getOptional("webhook_events")

                    /**
                     * Custom HTTP headers sent with each webhook request (e.g. auth tokens)
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun webhookHeaders(): Optional<WebhookHeaders> =
                        webhookHeaders.getOptional("webhook_headers")

                    /**
                     * Response format sent to the webhook: 'string' (default) or 'json'
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun webhookOutputFormat(): Optional<String> =
                        webhookOutputFormat.getOptional("webhook_output_format")

                    /**
                     * URL to receive webhook POST notifications
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

                    /**
                     * Returns the raw JSON value of [webhookEvents].
                     *
                     * Unlike [webhookEvents], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("webhook_events")
                    @ExcludeMissing
                    fun _webhookEvents(): JsonField<List<WebhookEvent>> = webhookEvents

                    /**
                     * Returns the raw JSON value of [webhookHeaders].
                     *
                     * Unlike [webhookHeaders], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("webhook_headers")
                    @ExcludeMissing
                    fun _webhookHeaders(): JsonField<WebhookHeaders> = webhookHeaders

                    /**
                     * Returns the raw JSON value of [webhookOutputFormat].
                     *
                     * Unlike [webhookOutputFormat], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("webhook_output_format")
                    @ExcludeMissing
                    fun _webhookOutputFormat(): JsonField<String> = webhookOutputFormat

                    /**
                     * Returns the raw JSON value of [webhookUrl].
                     *
                     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
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

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [WebhookConfiguration].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [WebhookConfiguration]. */
                    class Builder internal constructor() {

                        private var webhookEvents: JsonField<MutableList<WebhookEvent>>? = null
                        private var webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of()
                        private var webhookOutputFormat: JsonField<String> = JsonMissing.of()
                        private var webhookUrl: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(webhookConfiguration: WebhookConfiguration) = apply {
                            webhookEvents =
                                webhookConfiguration.webhookEvents.map { it.toMutableList() }
                            webhookHeaders = webhookConfiguration.webhookHeaders
                            webhookOutputFormat = webhookConfiguration.webhookOutputFormat
                            webhookUrl = webhookConfiguration.webhookUrl
                            additionalProperties =
                                webhookConfiguration.additionalProperties.toMutableMap()
                        }

                        /**
                         * Events to subscribe to (e.g. 'parse.success', 'extract.error'). If null,
                         * all events are delivered.
                         */
                        fun webhookEvents(webhookEvents: List<WebhookEvent>?) =
                            webhookEvents(JsonField.ofNullable(webhookEvents))

                        /**
                         * Alias for calling [Builder.webhookEvents] with
                         * `webhookEvents.orElse(null)`.
                         */
                        fun webhookEvents(webhookEvents: Optional<List<WebhookEvent>>) =
                            webhookEvents(webhookEvents.getOrNull())

                        /**
                         * Sets [Builder.webhookEvents] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.webhookEvents] with a well-typed
                         * `List<WebhookEvent>` value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun webhookEvents(webhookEvents: JsonField<List<WebhookEvent>>) = apply {
                            this.webhookEvents = webhookEvents.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [WebhookEvent] to [webhookEvents].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addWebhookEvent(webhookEvent: WebhookEvent) = apply {
                            webhookEvents =
                                (webhookEvents ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("webhookEvents", it).add(webhookEvent)
                                }
                        }

                        /** Custom HTTP headers sent with each webhook request (e.g. auth tokens) */
                        fun webhookHeaders(webhookHeaders: WebhookHeaders?) =
                            webhookHeaders(JsonField.ofNullable(webhookHeaders))

                        /**
                         * Alias for calling [Builder.webhookHeaders] with
                         * `webhookHeaders.orElse(null)`.
                         */
                        fun webhookHeaders(webhookHeaders: Optional<WebhookHeaders>) =
                            webhookHeaders(webhookHeaders.getOrNull())

                        /**
                         * Sets [Builder.webhookHeaders] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.webhookHeaders] with a well-typed
                         * [WebhookHeaders] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun webhookHeaders(webhookHeaders: JsonField<WebhookHeaders>) = apply {
                            this.webhookHeaders = webhookHeaders
                        }

                        /** Response format sent to the webhook: 'string' (default) or 'json' */
                        fun webhookOutputFormat(webhookOutputFormat: String?) =
                            webhookOutputFormat(JsonField.ofNullable(webhookOutputFormat))

                        /**
                         * Alias for calling [Builder.webhookOutputFormat] with
                         * `webhookOutputFormat.orElse(null)`.
                         */
                        fun webhookOutputFormat(webhookOutputFormat: Optional<String>) =
                            webhookOutputFormat(webhookOutputFormat.getOrNull())

                        /**
                         * Sets [Builder.webhookOutputFormat] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.webhookOutputFormat] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun webhookOutputFormat(webhookOutputFormat: JsonField<String>) = apply {
                            this.webhookOutputFormat = webhookOutputFormat
                        }

                        /** URL to receive webhook POST notifications */
                        fun webhookUrl(webhookUrl: String?) =
                            webhookUrl(JsonField.ofNullable(webhookUrl))

                        /**
                         * Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`.
                         */
                        fun webhookUrl(webhookUrl: Optional<String>) =
                            webhookUrl(webhookUrl.getOrNull())

                        /**
                         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.webhookUrl] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun webhookUrl(webhookUrl: JsonField<String>) = apply {
                            this.webhookUrl = webhookUrl
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
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): WebhookConfiguration = apply {
                        if (validated) {
                            return@apply
                        }

                        webhookEvents().ifPresent { it.forEach { it.validate() } }
                        webhookHeaders().ifPresent { it.validate() }
                        webhookOutputFormat()
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
                        (webhookEvents.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                            ?: 0) +
                            (webhookHeaders.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (webhookOutputFormat.asKnown().isPresent) 1 else 0) +
                            (if (webhookUrl.asKnown().isPresent) 1 else 0)

                    class WebhookEvent
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val EXTRACT_PENDING = of("extract.pending")

                            @JvmField val EXTRACT_SUCCESS = of("extract.success")

                            @JvmField val EXTRACT_ERROR = of("extract.error")

                            @JvmField val EXTRACT_PARTIAL_SUCCESS = of("extract.partial_success")

                            @JvmField val EXTRACT_CANCELLED = of("extract.cancelled")

                            @JvmField val PARSE_PENDING = of("parse.pending")

                            @JvmField val PARSE_RUNNING = of("parse.running")

                            @JvmField val PARSE_SUCCESS = of("parse.success")

                            @JvmField val PARSE_ERROR = of("parse.error")

                            @JvmField val PARSE_PARTIAL_SUCCESS = of("parse.partial_success")

                            @JvmField val PARSE_CANCELLED = of("parse.cancelled")

                            @JvmField val CLASSIFY_PENDING = of("classify.pending")

                            @JvmField val CLASSIFY_RUNNING = of("classify.running")

                            @JvmField val CLASSIFY_SUCCESS = of("classify.success")

                            @JvmField val CLASSIFY_ERROR = of("classify.error")

                            @JvmField val CLASSIFY_PARTIAL_SUCCESS = of("classify.partial_success")

                            @JvmField val CLASSIFY_CANCELLED = of("classify.cancelled")

                            @JvmField val SHEETS_PENDING = of("sheets.pending")

                            @JvmField val SHEETS_SUCCESS = of("sheets.success")

                            @JvmField val SHEETS_ERROR = of("sheets.error")

                            @JvmField val SHEETS_PARTIAL_SUCCESS = of("sheets.partial_success")

                            @JvmField val SHEETS_CANCELLED = of("sheets.cancelled")

                            @JvmField val SPLIT_PENDING = of("split.pending")

                            @JvmField val SPLIT_PROCESSING = of("split.processing")

                            @JvmField val SPLIT_SUCCESS = of("split.success")

                            @JvmField val SPLIT_ERROR = of("split.error")

                            @JvmField val SPLIT_CANCELLED = of("split.cancelled")

                            @JvmField val UNMAPPED_EVENT = of("unmapped_event")

                            @JvmStatic fun of(value: String) = WebhookEvent(JsonField.of(value))
                        }

                        /** An enum containing [WebhookEvent]'s known values. */
                        enum class Known {
                            EXTRACT_PENDING,
                            EXTRACT_SUCCESS,
                            EXTRACT_ERROR,
                            EXTRACT_PARTIAL_SUCCESS,
                            EXTRACT_CANCELLED,
                            PARSE_PENDING,
                            PARSE_RUNNING,
                            PARSE_SUCCESS,
                            PARSE_ERROR,
                            PARSE_PARTIAL_SUCCESS,
                            PARSE_CANCELLED,
                            CLASSIFY_PENDING,
                            CLASSIFY_RUNNING,
                            CLASSIFY_SUCCESS,
                            CLASSIFY_ERROR,
                            CLASSIFY_PARTIAL_SUCCESS,
                            CLASSIFY_CANCELLED,
                            SHEETS_PENDING,
                            SHEETS_SUCCESS,
                            SHEETS_ERROR,
                            SHEETS_PARTIAL_SUCCESS,
                            SHEETS_CANCELLED,
                            SPLIT_PENDING,
                            SPLIT_PROCESSING,
                            SPLIT_SUCCESS,
                            SPLIT_ERROR,
                            SPLIT_CANCELLED,
                            UNMAPPED_EVENT,
                        }

                        /**
                         * An enum containing [WebhookEvent]'s known values, as well as an
                         * [_UNKNOWN] member.
                         *
                         * An instance of [WebhookEvent] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            EXTRACT_PENDING,
                            EXTRACT_SUCCESS,
                            EXTRACT_ERROR,
                            EXTRACT_PARTIAL_SUCCESS,
                            EXTRACT_CANCELLED,
                            PARSE_PENDING,
                            PARSE_RUNNING,
                            PARSE_SUCCESS,
                            PARSE_ERROR,
                            PARSE_PARTIAL_SUCCESS,
                            PARSE_CANCELLED,
                            CLASSIFY_PENDING,
                            CLASSIFY_RUNNING,
                            CLASSIFY_SUCCESS,
                            CLASSIFY_ERROR,
                            CLASSIFY_PARTIAL_SUCCESS,
                            CLASSIFY_CANCELLED,
                            SHEETS_PENDING,
                            SHEETS_SUCCESS,
                            SHEETS_ERROR,
                            SHEETS_PARTIAL_SUCCESS,
                            SHEETS_CANCELLED,
                            SPLIT_PENDING,
                            SPLIT_PROCESSING,
                            SPLIT_SUCCESS,
                            SPLIT_ERROR,
                            SPLIT_CANCELLED,
                            UNMAPPED_EVENT,
                            /**
                             * An enum member indicating that [WebhookEvent] was instantiated with
                             * an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                EXTRACT_PENDING -> Value.EXTRACT_PENDING
                                EXTRACT_SUCCESS -> Value.EXTRACT_SUCCESS
                                EXTRACT_ERROR -> Value.EXTRACT_ERROR
                                EXTRACT_PARTIAL_SUCCESS -> Value.EXTRACT_PARTIAL_SUCCESS
                                EXTRACT_CANCELLED -> Value.EXTRACT_CANCELLED
                                PARSE_PENDING -> Value.PARSE_PENDING
                                PARSE_RUNNING -> Value.PARSE_RUNNING
                                PARSE_SUCCESS -> Value.PARSE_SUCCESS
                                PARSE_ERROR -> Value.PARSE_ERROR
                                PARSE_PARTIAL_SUCCESS -> Value.PARSE_PARTIAL_SUCCESS
                                PARSE_CANCELLED -> Value.PARSE_CANCELLED
                                CLASSIFY_PENDING -> Value.CLASSIFY_PENDING
                                CLASSIFY_RUNNING -> Value.CLASSIFY_RUNNING
                                CLASSIFY_SUCCESS -> Value.CLASSIFY_SUCCESS
                                CLASSIFY_ERROR -> Value.CLASSIFY_ERROR
                                CLASSIFY_PARTIAL_SUCCESS -> Value.CLASSIFY_PARTIAL_SUCCESS
                                CLASSIFY_CANCELLED -> Value.CLASSIFY_CANCELLED
                                SHEETS_PENDING -> Value.SHEETS_PENDING
                                SHEETS_SUCCESS -> Value.SHEETS_SUCCESS
                                SHEETS_ERROR -> Value.SHEETS_ERROR
                                SHEETS_PARTIAL_SUCCESS -> Value.SHEETS_PARTIAL_SUCCESS
                                SHEETS_CANCELLED -> Value.SHEETS_CANCELLED
                                SPLIT_PENDING -> Value.SPLIT_PENDING
                                SPLIT_PROCESSING -> Value.SPLIT_PROCESSING
                                SPLIT_SUCCESS -> Value.SPLIT_SUCCESS
                                SPLIT_ERROR -> Value.SPLIT_ERROR
                                SPLIT_CANCELLED -> Value.SPLIT_CANCELLED
                                UNMAPPED_EVENT -> Value.UNMAPPED_EVENT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LlamaCloudInvalidDataException if this class instance's value is
                         *   a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                EXTRACT_PENDING -> Known.EXTRACT_PENDING
                                EXTRACT_SUCCESS -> Known.EXTRACT_SUCCESS
                                EXTRACT_ERROR -> Known.EXTRACT_ERROR
                                EXTRACT_PARTIAL_SUCCESS -> Known.EXTRACT_PARTIAL_SUCCESS
                                EXTRACT_CANCELLED -> Known.EXTRACT_CANCELLED
                                PARSE_PENDING -> Known.PARSE_PENDING
                                PARSE_RUNNING -> Known.PARSE_RUNNING
                                PARSE_SUCCESS -> Known.PARSE_SUCCESS
                                PARSE_ERROR -> Known.PARSE_ERROR
                                PARSE_PARTIAL_SUCCESS -> Known.PARSE_PARTIAL_SUCCESS
                                PARSE_CANCELLED -> Known.PARSE_CANCELLED
                                CLASSIFY_PENDING -> Known.CLASSIFY_PENDING
                                CLASSIFY_RUNNING -> Known.CLASSIFY_RUNNING
                                CLASSIFY_SUCCESS -> Known.CLASSIFY_SUCCESS
                                CLASSIFY_ERROR -> Known.CLASSIFY_ERROR
                                CLASSIFY_PARTIAL_SUCCESS -> Known.CLASSIFY_PARTIAL_SUCCESS
                                CLASSIFY_CANCELLED -> Known.CLASSIFY_CANCELLED
                                SHEETS_PENDING -> Known.SHEETS_PENDING
                                SHEETS_SUCCESS -> Known.SHEETS_SUCCESS
                                SHEETS_ERROR -> Known.SHEETS_ERROR
                                SHEETS_PARTIAL_SUCCESS -> Known.SHEETS_PARTIAL_SUCCESS
                                SHEETS_CANCELLED -> Known.SHEETS_CANCELLED
                                SPLIT_PENDING -> Known.SPLIT_PENDING
                                SPLIT_PROCESSING -> Known.SPLIT_PROCESSING
                                SPLIT_SUCCESS -> Known.SPLIT_SUCCESS
                                SPLIT_ERROR -> Known.SPLIT_ERROR
                                SPLIT_CANCELLED -> Known.SPLIT_CANCELLED
                                UNMAPPED_EVENT -> Known.UNMAPPED_EVENT
                                else ->
                                    throw LlamaCloudInvalidDataException(
                                        "Unknown WebhookEvent: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LlamaCloudInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LlamaCloudInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LlamaCloudInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): WebhookEvent = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is WebhookEvent && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /** Custom HTTP headers sent with each webhook request (e.g. auth tokens) */
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

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [WebhookHeaders].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [WebhookHeaders]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(webhookHeaders: WebhookHeaders) = apply {
                                additionalProperties =
                                    webhookHeaders.additionalProperties.toMutableMap()
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
                             * Returns an immutable instance of [WebhookHeaders].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): WebhookHeaders =
                                WebhookHeaders(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LlamaCloudInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is WebhookHeaders &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "WebhookHeaders{additionalProperties=$additionalProperties}"
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

                    return other is Parameters &&
                        adaptiveLongTable == other.adaptiveLongTable &&
                        aggressiveTableExtraction == other.aggressiveTableExtraction &&
                        annotateLinks == other.annotateLinks &&
                        autoMode == other.autoMode &&
                        autoModeConfigurationJson == other.autoModeConfigurationJson &&
                        autoModeTriggerOnImageInPage == other.autoModeTriggerOnImageInPage &&
                        autoModeTriggerOnRegexpInPage == other.autoModeTriggerOnRegexpInPage &&
                        autoModeTriggerOnTableInPage == other.autoModeTriggerOnTableInPage &&
                        autoModeTriggerOnTextInPage == other.autoModeTriggerOnTextInPage &&
                        azureOpenAIApiVersion == other.azureOpenAIApiVersion &&
                        azureOpenAIDeploymentName == other.azureOpenAIDeploymentName &&
                        azureOpenAIEndpoint == other.azureOpenAIEndpoint &&
                        azureOpenAIKey == other.azureOpenAIKey &&
                        bboxBottom == other.bboxBottom &&
                        bboxLeft == other.bboxLeft &&
                        bboxRight == other.bboxRight &&
                        bboxTop == other.bboxTop &&
                        boundingBox == other.boundingBox &&
                        compactMarkdownTable == other.compactMarkdownTable &&
                        complementalFormattingInstruction ==
                            other.complementalFormattingInstruction &&
                        contentGuidelineInstruction == other.contentGuidelineInstruction &&
                        continuousMode == other.continuousMode &&
                        customMetadata == other.customMetadata &&
                        disableImageExtraction == other.disableImageExtraction &&
                        disableOcr == other.disableOcr &&
                        disableReconstruction == other.disableReconstruction &&
                        doNotCache == other.doNotCache &&
                        doNotUnrollColumns == other.doNotUnrollColumns &&
                        enableCostOptimizer == other.enableCostOptimizer &&
                        extractCharts == other.extractCharts &&
                        extractLayout == other.extractLayout &&
                        extractPrintedPageNumber == other.extractPrintedPageNumber &&
                        fastMode == other.fastMode &&
                        formattingInstruction == other.formattingInstruction &&
                        gpt4oApiKey == other.gpt4oApiKey &&
                        gpt4oMode == other.gpt4oMode &&
                        guessXlsxSheetName == other.guessXlsxSheetName &&
                        hideFooters == other.hideFooters &&
                        hideHeaders == other.hideHeaders &&
                        highResOcr == other.highResOcr &&
                        htmlMakeAllElementsVisible == other.htmlMakeAllElementsVisible &&
                        htmlRemoveFixedElements == other.htmlRemoveFixedElements &&
                        htmlRemoveNavigationElements == other.htmlRemoveNavigationElements &&
                        httpProxy == other.httpProxy &&
                        ignoreDocumentElementsForLayoutDetection ==
                            other.ignoreDocumentElementsForLayoutDetection &&
                        imagesToSave == other.imagesToSave &&
                        inlineImagesInMarkdown == other.inlineImagesInMarkdown &&
                        inputS3Path == other.inputS3Path &&
                        inputS3Region == other.inputS3Region &&
                        inputUrl == other.inputUrl &&
                        internalIsScreenshotJob == other.internalIsScreenshotJob &&
                        invalidateCache == other.invalidateCache &&
                        isFormattingInstruction == other.isFormattingInstruction &&
                        jobTimeoutExtraTimePerPageInSeconds ==
                            other.jobTimeoutExtraTimePerPageInSeconds &&
                        jobTimeoutInSeconds == other.jobTimeoutInSeconds &&
                        keepPageSeparatorWhenMergingTables ==
                            other.keepPageSeparatorWhenMergingTables &&
                        lang == other.lang &&
                        languages == other.languages &&
                        layoutAware == other.layoutAware &&
                        lineLevelBoundingBox == other.lineLevelBoundingBox &&
                        markdownTableMultilineHeaderSeparator ==
                            other.markdownTableMultilineHeaderSeparator &&
                        maxPages == other.maxPages &&
                        maxPagesEnforced == other.maxPagesEnforced &&
                        mergeTablesAcrossPagesInMarkdown ==
                            other.mergeTablesAcrossPagesInMarkdown &&
                        model == other.model &&
                        outlinedTableExtraction == other.outlinedTableExtraction &&
                        outputPdfOfDocument == other.outputPdfOfDocument &&
                        outputS3PathPrefix == other.outputS3PathPrefix &&
                        outputS3Region == other.outputS3Region &&
                        outputTablesAsHtml == other.outputTablesAsHtml &&
                        outputBucket == other.outputBucket &&
                        pageErrorTolerance == other.pageErrorTolerance &&
                        pageFooterPrefix == other.pageFooterPrefix &&
                        pageFooterSuffix == other.pageFooterSuffix &&
                        pageHeaderPrefix == other.pageHeaderPrefix &&
                        pageHeaderSuffix == other.pageHeaderSuffix &&
                        pagePrefix == other.pagePrefix &&
                        pageSeparator == other.pageSeparator &&
                        pageSuffix == other.pageSuffix &&
                        parseMode == other.parseMode &&
                        parsingInstruction == other.parsingInstruction &&
                        pipelineId == other.pipelineId &&
                        preciseBoundingBox == other.preciseBoundingBox &&
                        premiumMode == other.premiumMode &&
                        presentationOutOfBoundsContent == other.presentationOutOfBoundsContent &&
                        presentationSkipEmbeddedData == other.presentationSkipEmbeddedData &&
                        preserveLayoutAlignmentAcrossPages ==
                            other.preserveLayoutAlignmentAcrossPages &&
                        preserveVerySmallText == other.preserveVerySmallText &&
                        preset == other.preset &&
                        priority == other.priority &&
                        projectId == other.projectId &&
                        removeHiddenText == other.removeHiddenText &&
                        replaceFailedPageMode == other.replaceFailedPageMode &&
                        replaceFailedPageWithErrorMessagePrefix ==
                            other.replaceFailedPageWithErrorMessagePrefix &&
                        replaceFailedPageWithErrorMessageSuffix ==
                            other.replaceFailedPageWithErrorMessageSuffix &&
                        resourceInfo == other.resourceInfo &&
                        saveImages == other.saveImages &&
                        skipDiagonalText == other.skipDiagonalText &&
                        specializedChartParsingAgentic == other.specializedChartParsingAgentic &&
                        specializedChartParsingEfficient ==
                            other.specializedChartParsingEfficient &&
                        specializedChartParsingPlus == other.specializedChartParsingPlus &&
                        specializedImageParsing == other.specializedImageParsing &&
                        spreadsheetExtractSubTables == other.spreadsheetExtractSubTables &&
                        spreadsheetForceFormulaComputation ==
                            other.spreadsheetForceFormulaComputation &&
                        spreadsheetIncludeHiddenSheets == other.spreadsheetIncludeHiddenSheets &&
                        strictModeBuggyFont == other.strictModeBuggyFont &&
                        strictModeImageExtraction == other.strictModeImageExtraction &&
                        strictModeImageOcr == other.strictModeImageOcr &&
                        strictModeReconstruction == other.strictModeReconstruction &&
                        structuredOutput == other.structuredOutput &&
                        structuredOutputJsonSchema == other.structuredOutputJsonSchema &&
                        structuredOutputJsonSchemaName == other.structuredOutputJsonSchemaName &&
                        systemPrompt == other.systemPrompt &&
                        systemPromptAppend == other.systemPromptAppend &&
                        takeScreenshot == other.takeScreenshot &&
                        targetPages == other.targetPages &&
                        tier == other.tier &&
                        type == other.type &&
                        useVendorMultimodalModel == other.useVendorMultimodalModel &&
                        userPrompt == other.userPrompt &&
                        vendorMultimodalApiKey == other.vendorMultimodalApiKey &&
                        vendorMultimodalModelName == other.vendorMultimodalModelName &&
                        version == other.version &&
                        webhookConfigurations == other.webhookConfigurations &&
                        webhookUrl == other.webhookUrl &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        adaptiveLongTable,
                        aggressiveTableExtraction,
                        annotateLinks,
                        autoMode,
                        autoModeConfigurationJson,
                        autoModeTriggerOnImageInPage,
                        autoModeTriggerOnRegexpInPage,
                        autoModeTriggerOnTableInPage,
                        autoModeTriggerOnTextInPage,
                        azureOpenAIApiVersion,
                        azureOpenAIDeploymentName,
                        azureOpenAIEndpoint,
                        azureOpenAIKey,
                        bboxBottom,
                        bboxLeft,
                        bboxRight,
                        bboxTop,
                        boundingBox,
                        compactMarkdownTable,
                        complementalFormattingInstruction,
                        contentGuidelineInstruction,
                        continuousMode,
                        customMetadata,
                        disableImageExtraction,
                        disableOcr,
                        disableReconstruction,
                        doNotCache,
                        doNotUnrollColumns,
                        enableCostOptimizer,
                        extractCharts,
                        extractLayout,
                        extractPrintedPageNumber,
                        fastMode,
                        formattingInstruction,
                        gpt4oApiKey,
                        gpt4oMode,
                        guessXlsxSheetName,
                        hideFooters,
                        hideHeaders,
                        highResOcr,
                        htmlMakeAllElementsVisible,
                        htmlRemoveFixedElements,
                        htmlRemoveNavigationElements,
                        httpProxy,
                        ignoreDocumentElementsForLayoutDetection,
                        imagesToSave,
                        inlineImagesInMarkdown,
                        inputS3Path,
                        inputS3Region,
                        inputUrl,
                        internalIsScreenshotJob,
                        invalidateCache,
                        isFormattingInstruction,
                        jobTimeoutExtraTimePerPageInSeconds,
                        jobTimeoutInSeconds,
                        keepPageSeparatorWhenMergingTables,
                        lang,
                        languages,
                        layoutAware,
                        lineLevelBoundingBox,
                        markdownTableMultilineHeaderSeparator,
                        maxPages,
                        maxPagesEnforced,
                        mergeTablesAcrossPagesInMarkdown,
                        model,
                        outlinedTableExtraction,
                        outputPdfOfDocument,
                        outputS3PathPrefix,
                        outputS3Region,
                        outputTablesAsHtml,
                        outputBucket,
                        pageErrorTolerance,
                        pageFooterPrefix,
                        pageFooterSuffix,
                        pageHeaderPrefix,
                        pageHeaderSuffix,
                        pagePrefix,
                        pageSeparator,
                        pageSuffix,
                        parseMode,
                        parsingInstruction,
                        pipelineId,
                        preciseBoundingBox,
                        premiumMode,
                        presentationOutOfBoundsContent,
                        presentationSkipEmbeddedData,
                        preserveLayoutAlignmentAcrossPages,
                        preserveVerySmallText,
                        preset,
                        priority,
                        projectId,
                        removeHiddenText,
                        replaceFailedPageMode,
                        replaceFailedPageWithErrorMessagePrefix,
                        replaceFailedPageWithErrorMessageSuffix,
                        resourceInfo,
                        saveImages,
                        skipDiagonalText,
                        specializedChartParsingAgentic,
                        specializedChartParsingEfficient,
                        specializedChartParsingPlus,
                        specializedImageParsing,
                        spreadsheetExtractSubTables,
                        spreadsheetForceFormulaComputation,
                        spreadsheetIncludeHiddenSheets,
                        strictModeBuggyFont,
                        strictModeImageExtraction,
                        strictModeImageOcr,
                        strictModeReconstruction,
                        structuredOutput,
                        structuredOutputJsonSchema,
                        structuredOutputJsonSchemaName,
                        systemPrompt,
                        systemPromptAppend,
                        takeScreenshot,
                        targetPages,
                        tier,
                        type,
                        useVendorMultimodalModel,
                        userPrompt,
                        vendorMultimodalApiKey,
                        vendorMultimodalModelName,
                        version,
                        webhookConfigurations,
                        webhookUrl,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Parameters{adaptiveLongTable=$adaptiveLongTable, aggressiveTableExtraction=$aggressiveTableExtraction, annotateLinks=$annotateLinks, autoMode=$autoMode, autoModeConfigurationJson=$autoModeConfigurationJson, autoModeTriggerOnImageInPage=$autoModeTriggerOnImageInPage, autoModeTriggerOnRegexpInPage=$autoModeTriggerOnRegexpInPage, autoModeTriggerOnTableInPage=$autoModeTriggerOnTableInPage, autoModeTriggerOnTextInPage=$autoModeTriggerOnTextInPage, azureOpenAIApiVersion=$azureOpenAIApiVersion, azureOpenAIDeploymentName=$azureOpenAIDeploymentName, azureOpenAIEndpoint=$azureOpenAIEndpoint, azureOpenAIKey=$azureOpenAIKey, bboxBottom=$bboxBottom, bboxLeft=$bboxLeft, bboxRight=$bboxRight, bboxTop=$bboxTop, boundingBox=$boundingBox, compactMarkdownTable=$compactMarkdownTable, complementalFormattingInstruction=$complementalFormattingInstruction, contentGuidelineInstruction=$contentGuidelineInstruction, continuousMode=$continuousMode, customMetadata=$customMetadata, disableImageExtraction=$disableImageExtraction, disableOcr=$disableOcr, disableReconstruction=$disableReconstruction, doNotCache=$doNotCache, doNotUnrollColumns=$doNotUnrollColumns, enableCostOptimizer=$enableCostOptimizer, extractCharts=$extractCharts, extractLayout=$extractLayout, extractPrintedPageNumber=$extractPrintedPageNumber, fastMode=$fastMode, formattingInstruction=$formattingInstruction, gpt4oApiKey=$gpt4oApiKey, gpt4oMode=$gpt4oMode, guessXlsxSheetName=$guessXlsxSheetName, hideFooters=$hideFooters, hideHeaders=$hideHeaders, highResOcr=$highResOcr, htmlMakeAllElementsVisible=$htmlMakeAllElementsVisible, htmlRemoveFixedElements=$htmlRemoveFixedElements, htmlRemoveNavigationElements=$htmlRemoveNavigationElements, httpProxy=$httpProxy, ignoreDocumentElementsForLayoutDetection=$ignoreDocumentElementsForLayoutDetection, imagesToSave=$imagesToSave, inlineImagesInMarkdown=$inlineImagesInMarkdown, inputS3Path=$inputS3Path, inputS3Region=$inputS3Region, inputUrl=$inputUrl, internalIsScreenshotJob=$internalIsScreenshotJob, invalidateCache=$invalidateCache, isFormattingInstruction=$isFormattingInstruction, jobTimeoutExtraTimePerPageInSeconds=$jobTimeoutExtraTimePerPageInSeconds, jobTimeoutInSeconds=$jobTimeoutInSeconds, keepPageSeparatorWhenMergingTables=$keepPageSeparatorWhenMergingTables, lang=$lang, languages=$languages, layoutAware=$layoutAware, lineLevelBoundingBox=$lineLevelBoundingBox, markdownTableMultilineHeaderSeparator=$markdownTableMultilineHeaderSeparator, maxPages=$maxPages, maxPagesEnforced=$maxPagesEnforced, mergeTablesAcrossPagesInMarkdown=$mergeTablesAcrossPagesInMarkdown, model=$model, outlinedTableExtraction=$outlinedTableExtraction, outputPdfOfDocument=$outputPdfOfDocument, outputS3PathPrefix=$outputS3PathPrefix, outputS3Region=$outputS3Region, outputTablesAsHtml=$outputTablesAsHtml, outputBucket=$outputBucket, pageErrorTolerance=$pageErrorTolerance, pageFooterPrefix=$pageFooterPrefix, pageFooterSuffix=$pageFooterSuffix, pageHeaderPrefix=$pageHeaderPrefix, pageHeaderSuffix=$pageHeaderSuffix, pagePrefix=$pagePrefix, pageSeparator=$pageSeparator, pageSuffix=$pageSuffix, parseMode=$parseMode, parsingInstruction=$parsingInstruction, pipelineId=$pipelineId, preciseBoundingBox=$preciseBoundingBox, premiumMode=$premiumMode, presentationOutOfBoundsContent=$presentationOutOfBoundsContent, presentationSkipEmbeddedData=$presentationSkipEmbeddedData, preserveLayoutAlignmentAcrossPages=$preserveLayoutAlignmentAcrossPages, preserveVerySmallText=$preserveVerySmallText, preset=$preset, priority=$priority, projectId=$projectId, removeHiddenText=$removeHiddenText, replaceFailedPageMode=$replaceFailedPageMode, replaceFailedPageWithErrorMessagePrefix=$replaceFailedPageWithErrorMessagePrefix, replaceFailedPageWithErrorMessageSuffix=$replaceFailedPageWithErrorMessageSuffix, resourceInfo=$resourceInfo, saveImages=$saveImages, skipDiagonalText=$skipDiagonalText, specializedChartParsingAgentic=$specializedChartParsingAgentic, specializedChartParsingEfficient=$specializedChartParsingEfficient, specializedChartParsingPlus=$specializedChartParsingPlus, specializedImageParsing=$specializedImageParsing, spreadsheetExtractSubTables=$spreadsheetExtractSubTables, spreadsheetForceFormulaComputation=$spreadsheetForceFormulaComputation, spreadsheetIncludeHiddenSheets=$spreadsheetIncludeHiddenSheets, strictModeBuggyFont=$strictModeBuggyFont, strictModeImageExtraction=$strictModeImageExtraction, strictModeImageOcr=$strictModeImageOcr, strictModeReconstruction=$strictModeReconstruction, structuredOutput=$structuredOutput, structuredOutputJsonSchema=$structuredOutputJsonSchema, structuredOutputJsonSchemaName=$structuredOutputJsonSchemaName, systemPrompt=$systemPrompt, systemPromptAppend=$systemPromptAppend, takeScreenshot=$takeScreenshot, targetPages=$targetPages, tier=$tier, type=$type, useVendorMultimodalModel=$useVendorMultimodalModel, userPrompt=$userPrompt, vendorMultimodalApiKey=$vendorMultimodalApiKey, vendorMultimodalModelName=$vendorMultimodalModelName, version=$version, webhookConfigurations=$webhookConfigurations, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
            }

            /** The partitions for this execution. Used for determining where to save job output. */
            class Partitions
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

                    /** Returns a mutable builder for constructing an instance of [Partitions]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Partitions]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(partitions: Partitions) = apply {
                        additionalProperties = partitions.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Partitions].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Partitions = Partitions(additionalProperties.toImmutable())
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
                fun validate(): Partitions = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Partitions && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Partitions{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BatchParseJobRecordCreate &&
                    correlationId == other.correlationId &&
                    jobName == other.jobName &&
                    parameters == other.parameters &&
                    parentJobExecutionId == other.parentJobExecutionId &&
                    partitions == other.partitions &&
                    projectId == other.projectId &&
                    sessionId == other.sessionId &&
                    userId == other.userId &&
                    webhookUrl == other.webhookUrl &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    correlationId,
                    jobName,
                    parameters,
                    parentJobExecutionId,
                    partitions,
                    projectId,
                    sessionId,
                    userId,
                    webhookUrl,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BatchParseJobRecordCreate{correlationId=$correlationId, jobName=$jobName, parameters=$parameters, parentJobExecutionId=$parentJobExecutionId, partitions=$partitions, projectId=$projectId, sessionId=$sessionId, userId=$userId, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchCreateParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            temporalNamespace == other.temporalNamespace &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            organizationId,
            projectId,
            temporalNamespace,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BatchCreateParams{organizationId=$organizationId, projectId=$projectId, temporalNamespace=$temporalNamespace, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
