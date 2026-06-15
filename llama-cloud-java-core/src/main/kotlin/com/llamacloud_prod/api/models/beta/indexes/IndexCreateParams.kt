// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.indexes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a searchable index over a source directory. */
class IndexCreateParams
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
     * ID of the source directory containing your documents.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceDirectoryId(): String = body.sourceDirectoryId()

    /**
     * Optional description of the index.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Optional display name for the index. If omitted, the index is named after the source
     * directory.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Product configurations for syncing. Omit to use a default parse configuration. Include an
     * explicit entry per product type (e.g. parse, extract) to override the default.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun products(): Optional<List<Product>> = body.products()

    /**
     * Attachment kinds to store alongside parsed output. Each entry must be one of: screenshots,
     * items. For example, ['screenshots'] renders and stores per-page screenshots; ['items'] stores
     * structured items with bounding boxes. Omit or pass an empty list to skip attachments.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun storeAttachments(): Optional<List<String>> = body.storeAttachments()

    /**
     * How often to re-run the sync. One of: manual, daily, on_source_change. Defaults to manual.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun syncFrequency(): Optional<String> = body.syncFrequency()

    /**
     * Vector export destination for the index. 'DEFAULT' exports to the managed vector DB
     * destination resolved from configuration. 'DISABLED' skips vector export — the export
     * destination falls back to 'Download'.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vectorTarget(): Optional<VectorTarget> = body.vectorTarget()

    /**
     * Returns the raw JSON value of [sourceDirectoryId].
     *
     * Unlike [sourceDirectoryId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sourceDirectoryId(): JsonField<String> = body._sourceDirectoryId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [products].
     *
     * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _products(): JsonField<List<Product>> = body._products()

    /**
     * Returns the raw JSON value of [storeAttachments].
     *
     * Unlike [storeAttachments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _storeAttachments(): JsonField<List<String>> = body._storeAttachments()

    /**
     * Returns the raw JSON value of [syncFrequency].
     *
     * Unlike [syncFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _syncFrequency(): JsonField<String> = body._syncFrequency()

    /**
     * Returns the raw JSON value of [vectorTarget].
     *
     * Unlike [vectorTarget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vectorTarget(): JsonField<VectorTarget> = body._vectorTarget()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IndexCreateParams].
         *
         * The following fields are required:
         * ```java
         * .sourceDirectoryId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IndexCreateParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(indexCreateParams: IndexCreateParams) = apply {
            organizationId = indexCreateParams.organizationId
            projectId = indexCreateParams.projectId
            body = indexCreateParams.body.toBuilder()
            additionalHeaders = indexCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = indexCreateParams.additionalQueryParams.toBuilder()
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
         * - [sourceDirectoryId]
         * - [description]
         * - [name]
         * - [products]
         * - [storeAttachments]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ID of the source directory containing your documents. */
        fun sourceDirectoryId(sourceDirectoryId: String) = apply {
            body.sourceDirectoryId(sourceDirectoryId)
        }

        /**
         * Sets [Builder.sourceDirectoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceDirectoryId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceDirectoryId(sourceDirectoryId: JsonField<String>) = apply {
            body.sourceDirectoryId(sourceDirectoryId)
        }

        /** Optional description of the index. */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Optional display name for the index. If omitted, the index is named after the source
         * directory.
         */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Product configurations for syncing. Omit to use a default parse configuration. Include an
         * explicit entry per product type (e.g. parse, extract) to override the default.
         */
        fun products(products: List<Product>?) = apply { body.products(products) }

        /** Alias for calling [Builder.products] with `products.orElse(null)`. */
        fun products(products: Optional<List<Product>>) = products(products.getOrNull())

        /**
         * Sets [Builder.products] to an arbitrary JSON value.
         *
         * You should usually call [Builder.products] with a well-typed `List<Product>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun products(products: JsonField<List<Product>>) = apply { body.products(products) }

        /**
         * Adds a single [Product] to [products].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProduct(product: Product) = apply { body.addProduct(product) }

        /**
         * Attachment kinds to store alongside parsed output. Each entry must be one of:
         * screenshots, items. For example, ['screenshots'] renders and stores per-page screenshots;
         * ['items'] stores structured items with bounding boxes. Omit or pass an empty list to skip
         * attachments.
         */
        fun storeAttachments(storeAttachments: List<String>?) = apply {
            body.storeAttachments(storeAttachments)
        }

        /** Alias for calling [Builder.storeAttachments] with `storeAttachments.orElse(null)`. */
        fun storeAttachments(storeAttachments: Optional<List<String>>) =
            storeAttachments(storeAttachments.getOrNull())

        /**
         * Sets [Builder.storeAttachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.storeAttachments] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun storeAttachments(storeAttachments: JsonField<List<String>>) = apply {
            body.storeAttachments(storeAttachments)
        }

        /**
         * Adds a single [String] to [storeAttachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStoreAttachment(storeAttachment: String) = apply {
            body.addStoreAttachment(storeAttachment)
        }

        /**
         * How often to re-run the sync. One of: manual, daily, on_source_change. Defaults to
         * manual.
         */
        fun syncFrequency(syncFrequency: String) = apply { body.syncFrequency(syncFrequency) }

        /**
         * Sets [Builder.syncFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syncFrequency] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun syncFrequency(syncFrequency: JsonField<String>) = apply {
            body.syncFrequency(syncFrequency)
        }

        /**
         * Vector export destination for the index. 'DEFAULT' exports to the managed vector DB
         * destination resolved from configuration. 'DISABLED' skips vector export — the export
         * destination falls back to 'Download'.
         */
        fun vectorTarget(vectorTarget: VectorTarget) = apply { body.vectorTarget(vectorTarget) }

        /**
         * Sets [Builder.vectorTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorTarget] with a well-typed [VectorTarget] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vectorTarget(vectorTarget: JsonField<VectorTarget>) = apply {
            body.vectorTarget(vectorTarget)
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
         * Returns an immutable instance of [IndexCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sourceDirectoryId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndexCreateParams =
            IndexCreateParams(
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
     * Create a searchable index over a source directory.
     *
     * Sets up the full pipeline — parsing, chunking, embedding, and vector store indexing — in a
     * single call. An initial sync is triggered automatically.
     *
     * Omit ``products`` to use a default parse configuration (cost-effective tier). Pass it
     * explicitly to control parsing or to include extraction.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val sourceDirectoryId: JsonField<String>,
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val products: JsonField<List<Product>>,
        private val storeAttachments: JsonField<List<String>>,
        private val syncFrequency: JsonField<String>,
        private val vectorTarget: JsonField<VectorTarget>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("source_directory_id")
            @ExcludeMissing
            sourceDirectoryId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("products")
            @ExcludeMissing
            products: JsonField<List<Product>> = JsonMissing.of(),
            @JsonProperty("store_attachments")
            @ExcludeMissing
            storeAttachments: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("sync_frequency")
            @ExcludeMissing
            syncFrequency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vector_target")
            @ExcludeMissing
            vectorTarget: JsonField<VectorTarget> = JsonMissing.of(),
        ) : this(
            sourceDirectoryId,
            description,
            name,
            products,
            storeAttachments,
            syncFrequency,
            vectorTarget,
            mutableMapOf(),
        )

        /**
         * ID of the source directory containing your documents.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceDirectoryId(): String = sourceDirectoryId.getRequired("source_directory_id")

        /**
         * Optional description of the index.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Optional display name for the index. If omitted, the index is named after the source
         * directory.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Product configurations for syncing. Omit to use a default parse configuration. Include an
         * explicit entry per product type (e.g. parse, extract) to override the default.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun products(): Optional<List<Product>> = products.getOptional("products")

        /**
         * Attachment kinds to store alongside parsed output. Each entry must be one of:
         * screenshots, items. For example, ['screenshots'] renders and stores per-page screenshots;
         * ['items'] stores structured items with bounding boxes. Omit or pass an empty list to skip
         * attachments.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun storeAttachments(): Optional<List<String>> =
            storeAttachments.getOptional("store_attachments")

        /**
         * How often to re-run the sync. One of: manual, daily, on_source_change. Defaults to
         * manual.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun syncFrequency(): Optional<String> = syncFrequency.getOptional("sync_frequency")

        /**
         * Vector export destination for the index. 'DEFAULT' exports to the managed vector DB
         * destination resolved from configuration. 'DISABLED' skips vector export — the export
         * destination falls back to 'Download'.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun vectorTarget(): Optional<VectorTarget> = vectorTarget.getOptional("vector_target")

        /**
         * Returns the raw JSON value of [sourceDirectoryId].
         *
         * Unlike [sourceDirectoryId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("source_directory_id")
        @ExcludeMissing
        fun _sourceDirectoryId(): JsonField<String> = sourceDirectoryId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [products].
         *
         * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<Product>> = products

        /**
         * Returns the raw JSON value of [storeAttachments].
         *
         * Unlike [storeAttachments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("store_attachments")
        @ExcludeMissing
        fun _storeAttachments(): JsonField<List<String>> = storeAttachments

        /**
         * Returns the raw JSON value of [syncFrequency].
         *
         * Unlike [syncFrequency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sync_frequency")
        @ExcludeMissing
        fun _syncFrequency(): JsonField<String> = syncFrequency

        /**
         * Returns the raw JSON value of [vectorTarget].
         *
         * Unlike [vectorTarget], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vector_target")
        @ExcludeMissing
        fun _vectorTarget(): JsonField<VectorTarget> = vectorTarget

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
             * .sourceDirectoryId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var sourceDirectoryId: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var products: JsonField<MutableList<Product>>? = null
            private var storeAttachments: JsonField<MutableList<String>>? = null
            private var syncFrequency: JsonField<String> = JsonMissing.of()
            private var vectorTarget: JsonField<VectorTarget> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                sourceDirectoryId = body.sourceDirectoryId
                description = body.description
                name = body.name
                products = body.products.map { it.toMutableList() }
                storeAttachments = body.storeAttachments.map { it.toMutableList() }
                syncFrequency = body.syncFrequency
                vectorTarget = body.vectorTarget
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the source directory containing your documents. */
            fun sourceDirectoryId(sourceDirectoryId: String) =
                sourceDirectoryId(JsonField.of(sourceDirectoryId))

            /**
             * Sets [Builder.sourceDirectoryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDirectoryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceDirectoryId(sourceDirectoryId: JsonField<String>) = apply {
                this.sourceDirectoryId = sourceDirectoryId
            }

            /** Optional description of the index. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Optional display name for the index. If omitted, the index is named after the source
             * directory.
             */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Product configurations for syncing. Omit to use a default parse configuration.
             * Include an explicit entry per product type (e.g. parse, extract) to override the
             * default.
             */
            fun products(products: List<Product>?) = products(JsonField.ofNullable(products))

            /** Alias for calling [Builder.products] with `products.orElse(null)`. */
            fun products(products: Optional<List<Product>>) = products(products.getOrNull())

            /**
             * Sets [Builder.products] to an arbitrary JSON value.
             *
             * You should usually call [Builder.products] with a well-typed `List<Product>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun products(products: JsonField<List<Product>>) = apply {
                this.products = products.map { it.toMutableList() }
            }

            /**
             * Adds a single [Product] to [products].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProduct(product: Product) = apply {
                products =
                    (products ?: JsonField.of(mutableListOf())).also {
                        checkKnown("products", it).add(product)
                    }
            }

            /**
             * Attachment kinds to store alongside parsed output. Each entry must be one of:
             * screenshots, items. For example, ['screenshots'] renders and stores per-page
             * screenshots; ['items'] stores structured items with bounding boxes. Omit or pass an
             * empty list to skip attachments.
             */
            fun storeAttachments(storeAttachments: List<String>?) =
                storeAttachments(JsonField.ofNullable(storeAttachments))

            /**
             * Alias for calling [Builder.storeAttachments] with `storeAttachments.orElse(null)`.
             */
            fun storeAttachments(storeAttachments: Optional<List<String>>) =
                storeAttachments(storeAttachments.getOrNull())

            /**
             * Sets [Builder.storeAttachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storeAttachments] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun storeAttachments(storeAttachments: JsonField<List<String>>) = apply {
                this.storeAttachments = storeAttachments.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [storeAttachments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStoreAttachment(storeAttachment: String) = apply {
                storeAttachments =
                    (storeAttachments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("storeAttachments", it).add(storeAttachment)
                    }
            }

            /**
             * How often to re-run the sync. One of: manual, daily, on_source_change. Defaults to
             * manual.
             */
            fun syncFrequency(syncFrequency: String) = syncFrequency(JsonField.of(syncFrequency))

            /**
             * Sets [Builder.syncFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.syncFrequency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun syncFrequency(syncFrequency: JsonField<String>) = apply {
                this.syncFrequency = syncFrequency
            }

            /**
             * Vector export destination for the index. 'DEFAULT' exports to the managed vector DB
             * destination resolved from configuration. 'DISABLED' skips vector export — the export
             * destination falls back to 'Download'.
             */
            fun vectorTarget(vectorTarget: VectorTarget) = vectorTarget(JsonField.of(vectorTarget))

            /**
             * Sets [Builder.vectorTarget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorTarget] with a well-typed [VectorTarget] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorTarget(vectorTarget: JsonField<VectorTarget>) = apply {
                this.vectorTarget = vectorTarget
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
             * .sourceDirectoryId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("sourceDirectoryId", sourceDirectoryId),
                    description,
                    name,
                    (products ?: JsonMissing.of()).map { it.toImmutable() },
                    (storeAttachments ?: JsonMissing.of()).map { it.toImmutable() },
                    syncFrequency,
                    vectorTarget,
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

            sourceDirectoryId()
            description()
            name()
            products().ifPresent { it.forEach { it.validate() } }
            storeAttachments()
            syncFrequency()
            vectorTarget().ifPresent { it.validate() }
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
            (if (sourceDirectoryId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (products.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (storeAttachments.asKnown().getOrNull()?.size ?: 0) +
                (if (syncFrequency.asKnown().isPresent) 1 else 0) +
                (vectorTarget.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                sourceDirectoryId == other.sourceDirectoryId &&
                description == other.description &&
                name == other.name &&
                products == other.products &&
                storeAttachments == other.storeAttachments &&
                syncFrequency == other.syncFrequency &&
                vectorTarget == other.vectorTarget &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                sourceDirectoryId,
                description,
                name,
                products,
                storeAttachments,
                syncFrequency,
                vectorTarget,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{sourceDirectoryId=$sourceDirectoryId, description=$description, name=$name, products=$products, storeAttachments=$storeAttachments, syncFrequency=$syncFrequency, vectorTarget=$vectorTarget, additionalProperties=$additionalProperties}"
    }

    /**
     * A product configuration to include in an index's sync.
     *
     * Structurally mirrors ``directory_sync.SyncProductEntryRequest`` but is a distinct class so
     * the Index API surface stays SDK-gen-isolated from directory-sync internals. Translation
     * between the two happens in ``index/api_utils.py``.
     */
    class Product
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val productConfigId: JsonField<String>,
        private val productType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_config_id")
            @ExcludeMissing
            productConfigId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_type")
            @ExcludeMissing
            productType: JsonField<String> = JsonMissing.of(),
        ) : this(productConfigId, productType, mutableMapOf())

        /**
         * ID of the product configuration.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productConfigId(): String = productConfigId.getRequired("product_config_id")

        /**
         * Product type. One of: parse, extract.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productType(): String = productType.getRequired("product_type")

        /**
         * Returns the raw JSON value of [productConfigId].
         *
         * Unlike [productConfigId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("product_config_id")
        @ExcludeMissing
        fun _productConfigId(): JsonField<String> = productConfigId

        /**
         * Returns the raw JSON value of [productType].
         *
         * Unlike [productType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_type")
        @ExcludeMissing
        fun _productType(): JsonField<String> = productType

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
             * Returns a mutable builder for constructing an instance of [Product].
             *
             * The following fields are required:
             * ```java
             * .productConfigId()
             * .productType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Product]. */
        class Builder internal constructor() {

            private var productConfigId: JsonField<String>? = null
            private var productType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(product: Product) = apply {
                productConfigId = product.productConfigId
                productType = product.productType
                additionalProperties = product.additionalProperties.toMutableMap()
            }

            /** ID of the product configuration. */
            fun productConfigId(productConfigId: String) =
                productConfigId(JsonField.of(productConfigId))

            /**
             * Sets [Builder.productConfigId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productConfigId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productConfigId(productConfigId: JsonField<String>) = apply {
                this.productConfigId = productConfigId
            }

            /** Product type. One of: parse, extract. */
            fun productType(productType: String) = productType(JsonField.of(productType))

            /**
             * Sets [Builder.productType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productType(productType: JsonField<String>) = apply {
                this.productType = productType
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
             * Returns an immutable instance of [Product].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .productConfigId()
             * .productType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Product =
                Product(
                    checkRequired("productConfigId", productConfigId),
                    checkRequired("productType", productType),
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
        fun validate(): Product = apply {
            if (validated) {
                return@apply
            }

            productConfigId()
            productType()
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
            (if (productConfigId.asKnown().isPresent) 1 else 0) +
                (if (productType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Product &&
                productConfigId == other.productConfigId &&
                productType == other.productType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(productConfigId, productType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Product{productConfigId=$productConfigId, productType=$productType, additionalProperties=$additionalProperties}"
    }

    /**
     * Vector export destination for the index. 'DEFAULT' exports to the managed vector DB
     * destination resolved from configuration. 'DISABLED' skips vector export — the export
     * destination falls back to 'Download'.
     */
    class VectorTarget @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val DEFAULT = of("DEFAULT")

            @JvmField val DISABLED = of("DISABLED")

            @JvmStatic fun of(value: String) = VectorTarget(JsonField.of(value))
        }

        /** An enum containing [VectorTarget]'s known values. */
        enum class Known {
            DEFAULT,
            DISABLED,
        }

        /**
         * An enum containing [VectorTarget]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VectorTarget] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEFAULT,
            DISABLED,
            /**
             * An enum member indicating that [VectorTarget] was instantiated with an unknown value.
             */
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
                DEFAULT -> Value.DEFAULT
                DISABLED -> Value.DISABLED
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
                DEFAULT -> Known.DEFAULT
                DISABLED -> Known.DISABLED
                else -> throw LlamaCloudInvalidDataException("Unknown VectorTarget: $value")
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
        fun validate(): VectorTarget = apply {
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

            return other is VectorTarget && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndexCreateParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IndexCreateParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
