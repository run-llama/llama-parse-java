// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OpenAIEmbedding
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val additionalKwargs: JsonField<AdditionalKwargs>,
    private val apiBase: JsonField<String>,
    private val apiKey: JsonField<String>,
    private val apiVersion: JsonField<String>,
    private val className: JsonField<String>,
    private val defaultHeaders: JsonField<DefaultHeaders>,
    private val dimensions: JsonField<Long>,
    private val embedBatchSize: JsonField<Long>,
    private val maxRetries: JsonField<Long>,
    private val modelName: JsonField<String>,
    private val numWorkers: JsonField<Long>,
    private val reuseClient: JsonField<Boolean>,
    private val timeout: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("additional_kwargs")
        @ExcludeMissing
        additionalKwargs: JsonField<AdditionalKwargs> = JsonMissing.of(),
        @JsonProperty("api_base") @ExcludeMissing apiBase: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_version")
        @ExcludeMissing
        apiVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_headers")
        @ExcludeMissing
        defaultHeaders: JsonField<DefaultHeaders> = JsonMissing.of(),
        @JsonProperty("dimensions") @ExcludeMissing dimensions: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("embed_batch_size")
        @ExcludeMissing
        embedBatchSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_retries") @ExcludeMissing maxRetries: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model_name") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_workers") @ExcludeMissing numWorkers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reuse_client")
        @ExcludeMissing
        reuseClient: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Double> = JsonMissing.of(),
    ) : this(
        additionalKwargs,
        apiBase,
        apiKey,
        apiVersion,
        className,
        defaultHeaders,
        dimensions,
        embedBatchSize,
        maxRetries,
        modelName,
        numWorkers,
        reuseClient,
        timeout,
        mutableMapOf(),
    )

    /**
     * Additional kwargs for the OpenAI API.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalKwargs(): Optional<AdditionalKwargs> =
        additionalKwargs.getOptional("additional_kwargs")

    /**
     * The base URL for OpenAI API.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiBase(): Optional<String> = apiBase.getOptional("api_base")

    /**
     * The OpenAI API key.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

    /**
     * The version for OpenAI API.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiVersion(): Optional<String> = apiVersion.getOptional("api_version")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The default headers for API requests.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultHeaders(): Optional<DefaultHeaders> = defaultHeaders.getOptional("default_headers")

    /**
     * The number of dimensions on the output embedding vectors. Works only with v3 embedding
     * models.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dimensions(): Optional<Long> = dimensions.getOptional("dimensions")

    /**
     * The batch size for embedding calls.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embedBatchSize(): Optional<Long> = embedBatchSize.getOptional("embed_batch_size")

    /**
     * Maximum number of retries.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxRetries(): Optional<Long> = maxRetries.getOptional("max_retries")

    /**
     * The name of the OpenAI embedding model.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelName(): Optional<String> = modelName.getOptional("model_name")

    /**
     * The number of workers to use for async embedding calls.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numWorkers(): Optional<Long> = numWorkers.getOptional("num_workers")

    /**
     * Reuse the OpenAI client between requests. When doing anything with large volumes of async API
     * calls, setting this to false can improve stability.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reuseClient(): Optional<Boolean> = reuseClient.getOptional("reuse_client")

    /**
     * Timeout for each request.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeout(): Optional<Double> = timeout.getOptional("timeout")

    /**
     * Returns the raw JSON value of [additionalKwargs].
     *
     * Unlike [additionalKwargs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("additional_kwargs")
    @ExcludeMissing
    fun _additionalKwargs(): JsonField<AdditionalKwargs> = additionalKwargs

    /**
     * Returns the raw JSON value of [apiBase].
     *
     * Unlike [apiBase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_base") @ExcludeMissing fun _apiBase(): JsonField<String> = apiBase

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /**
     * Returns the raw JSON value of [apiVersion].
     *
     * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_version") @ExcludeMissing fun _apiVersion(): JsonField<String> = apiVersion

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [defaultHeaders].
     *
     * Unlike [defaultHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default_headers")
    @ExcludeMissing
    fun _defaultHeaders(): JsonField<DefaultHeaders> = defaultHeaders

    /**
     * Returns the raw JSON value of [dimensions].
     *
     * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dimensions") @ExcludeMissing fun _dimensions(): JsonField<Long> = dimensions

    /**
     * Returns the raw JSON value of [embedBatchSize].
     *
     * Unlike [embedBatchSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embed_batch_size")
    @ExcludeMissing
    fun _embedBatchSize(): JsonField<Long> = embedBatchSize

    /**
     * Returns the raw JSON value of [maxRetries].
     *
     * Unlike [maxRetries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_retries") @ExcludeMissing fun _maxRetries(): JsonField<Long> = maxRetries

    /**
     * Returns the raw JSON value of [modelName].
     *
     * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_name") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

    /**
     * Returns the raw JSON value of [numWorkers].
     *
     * Unlike [numWorkers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_workers") @ExcludeMissing fun _numWorkers(): JsonField<Long> = numWorkers

    /**
     * Returns the raw JSON value of [reuseClient].
     *
     * Unlike [reuseClient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reuse_client")
    @ExcludeMissing
    fun _reuseClient(): JsonField<Boolean> = reuseClient

    /**
     * Returns the raw JSON value of [timeout].
     *
     * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Double> = timeout

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

        /** Returns a mutable builder for constructing an instance of [OpenAIEmbedding]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OpenAIEmbedding]. */
    class Builder internal constructor() {

        private var additionalKwargs: JsonField<AdditionalKwargs> = JsonMissing.of()
        private var apiBase: JsonField<String> = JsonMissing.of()
        private var apiKey: JsonField<String> = JsonMissing.of()
        private var apiVersion: JsonField<String> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var defaultHeaders: JsonField<DefaultHeaders> = JsonMissing.of()
        private var dimensions: JsonField<Long> = JsonMissing.of()
        private var embedBatchSize: JsonField<Long> = JsonMissing.of()
        private var maxRetries: JsonField<Long> = JsonMissing.of()
        private var modelName: JsonField<String> = JsonMissing.of()
        private var numWorkers: JsonField<Long> = JsonMissing.of()
        private var reuseClient: JsonField<Boolean> = JsonMissing.of()
        private var timeout: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(openaiEmbedding: OpenAIEmbedding) = apply {
            additionalKwargs = openaiEmbedding.additionalKwargs
            apiBase = openaiEmbedding.apiBase
            apiKey = openaiEmbedding.apiKey
            apiVersion = openaiEmbedding.apiVersion
            className = openaiEmbedding.className
            defaultHeaders = openaiEmbedding.defaultHeaders
            dimensions = openaiEmbedding.dimensions
            embedBatchSize = openaiEmbedding.embedBatchSize
            maxRetries = openaiEmbedding.maxRetries
            modelName = openaiEmbedding.modelName
            numWorkers = openaiEmbedding.numWorkers
            reuseClient = openaiEmbedding.reuseClient
            timeout = openaiEmbedding.timeout
            additionalProperties = openaiEmbedding.additionalProperties.toMutableMap()
        }

        /** Additional kwargs for the OpenAI API. */
        fun additionalKwargs(additionalKwargs: AdditionalKwargs) =
            additionalKwargs(JsonField.of(additionalKwargs))

        /**
         * Sets [Builder.additionalKwargs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalKwargs] with a well-typed [AdditionalKwargs]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun additionalKwargs(additionalKwargs: JsonField<AdditionalKwargs>) = apply {
            this.additionalKwargs = additionalKwargs
        }

        /** The base URL for OpenAI API. */
        fun apiBase(apiBase: String?) = apiBase(JsonField.ofNullable(apiBase))

        /** Alias for calling [Builder.apiBase] with `apiBase.orElse(null)`. */
        fun apiBase(apiBase: Optional<String>) = apiBase(apiBase.getOrNull())

        /**
         * Sets [Builder.apiBase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiBase] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiBase(apiBase: JsonField<String>) = apply { this.apiBase = apiBase }

        /** The OpenAI API key. */
        fun apiKey(apiKey: String?) = apiKey(JsonField.ofNullable(apiKey))

        /** Alias for calling [Builder.apiKey] with `apiKey.orElse(null)`. */
        fun apiKey(apiKey: Optional<String>) = apiKey(apiKey.getOrNull())

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        /** The version for OpenAI API. */
        fun apiVersion(apiVersion: String?) = apiVersion(JsonField.ofNullable(apiVersion))

        /** Alias for calling [Builder.apiVersion] with `apiVersion.orElse(null)`. */
        fun apiVersion(apiVersion: Optional<String>) = apiVersion(apiVersion.getOrNull())

        /**
         * Sets [Builder.apiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiVersion(apiVersion: JsonField<String>) = apply { this.apiVersion = apiVersion }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** The default headers for API requests. */
        fun defaultHeaders(defaultHeaders: DefaultHeaders?) =
            defaultHeaders(JsonField.ofNullable(defaultHeaders))

        /** Alias for calling [Builder.defaultHeaders] with `defaultHeaders.orElse(null)`. */
        fun defaultHeaders(defaultHeaders: Optional<DefaultHeaders>) =
            defaultHeaders(defaultHeaders.getOrNull())

        /**
         * Sets [Builder.defaultHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultHeaders] with a well-typed [DefaultHeaders] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultHeaders(defaultHeaders: JsonField<DefaultHeaders>) = apply {
            this.defaultHeaders = defaultHeaders
        }

        /**
         * The number of dimensions on the output embedding vectors. Works only with v3 embedding
         * models.
         */
        fun dimensions(dimensions: Long?) = dimensions(JsonField.ofNullable(dimensions))

        /**
         * Alias for [Builder.dimensions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun dimensions(dimensions: Long) = dimensions(dimensions as Long?)

        /** Alias for calling [Builder.dimensions] with `dimensions.orElse(null)`. */
        fun dimensions(dimensions: Optional<Long>) = dimensions(dimensions.getOrNull())

        /**
         * Sets [Builder.dimensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensions] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dimensions(dimensions: JsonField<Long>) = apply { this.dimensions = dimensions }

        /** The batch size for embedding calls. */
        fun embedBatchSize(embedBatchSize: Long) = embedBatchSize(JsonField.of(embedBatchSize))

        /**
         * Sets [Builder.embedBatchSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embedBatchSize] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun embedBatchSize(embedBatchSize: JsonField<Long>) = apply {
            this.embedBatchSize = embedBatchSize
        }

        /** Maximum number of retries. */
        fun maxRetries(maxRetries: Long) = maxRetries(JsonField.of(maxRetries))

        /**
         * Sets [Builder.maxRetries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRetries] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxRetries(maxRetries: JsonField<Long>) = apply { this.maxRetries = maxRetries }

        /** The name of the OpenAI embedding model. */
        fun modelName(modelName: String) = modelName(JsonField.of(modelName))

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

        /** The number of workers to use for async embedding calls. */
        fun numWorkers(numWorkers: Long?) = numWorkers(JsonField.ofNullable(numWorkers))

        /**
         * Alias for [Builder.numWorkers].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numWorkers(numWorkers: Long) = numWorkers(numWorkers as Long?)

        /** Alias for calling [Builder.numWorkers] with `numWorkers.orElse(null)`. */
        fun numWorkers(numWorkers: Optional<Long>) = numWorkers(numWorkers.getOrNull())

        /**
         * Sets [Builder.numWorkers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numWorkers] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numWorkers(numWorkers: JsonField<Long>) = apply { this.numWorkers = numWorkers }

        /**
         * Reuse the OpenAI client between requests. When doing anything with large volumes of async
         * API calls, setting this to false can improve stability.
         */
        fun reuseClient(reuseClient: Boolean) = reuseClient(JsonField.of(reuseClient))

        /**
         * Sets [Builder.reuseClient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reuseClient] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reuseClient(reuseClient: JsonField<Boolean>) = apply { this.reuseClient = reuseClient }

        /** Timeout for each request. */
        fun timeout(timeout: Double) = timeout(JsonField.of(timeout))

        /**
         * Sets [Builder.timeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeout(timeout: JsonField<Double>) = apply { this.timeout = timeout }

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
         * Returns an immutable instance of [OpenAIEmbedding].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OpenAIEmbedding =
            OpenAIEmbedding(
                additionalKwargs,
                apiBase,
                apiKey,
                apiVersion,
                className,
                defaultHeaders,
                dimensions,
                embedBatchSize,
                maxRetries,
                modelName,
                numWorkers,
                reuseClient,
                timeout,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): OpenAIEmbedding = apply {
        if (validated) {
            return@apply
        }

        additionalKwargs().ifPresent { it.validate() }
        apiBase()
        apiKey()
        apiVersion()
        className()
        defaultHeaders().ifPresent { it.validate() }
        dimensions()
        embedBatchSize()
        maxRetries()
        modelName()
        numWorkers()
        reuseClient()
        timeout()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (additionalKwargs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (apiBase.asKnown().isPresent) 1 else 0) +
            (if (apiKey.asKnown().isPresent) 1 else 0) +
            (if (apiVersion.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (defaultHeaders.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dimensions.asKnown().isPresent) 1 else 0) +
            (if (embedBatchSize.asKnown().isPresent) 1 else 0) +
            (if (maxRetries.asKnown().isPresent) 1 else 0) +
            (if (modelName.asKnown().isPresent) 1 else 0) +
            (if (numWorkers.asKnown().isPresent) 1 else 0) +
            (if (reuseClient.asKnown().isPresent) 1 else 0) +
            (if (timeout.asKnown().isPresent) 1 else 0)

    /** Additional kwargs for the OpenAI API. */
    class AdditionalKwargs
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

            /** Returns a mutable builder for constructing an instance of [AdditionalKwargs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AdditionalKwargs]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(additionalKwargs: AdditionalKwargs) = apply {
                additionalProperties = additionalKwargs.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AdditionalKwargs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AdditionalKwargs = AdditionalKwargs(additionalProperties.toImmutable())
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
        fun validate(): AdditionalKwargs = apply {
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

            return other is AdditionalKwargs && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "AdditionalKwargs{additionalProperties=$additionalProperties}"
    }

    /** The default headers for API requests. */
    class DefaultHeaders
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

            /** Returns a mutable builder for constructing an instance of [DefaultHeaders]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DefaultHeaders]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(defaultHeaders: DefaultHeaders) = apply {
                additionalProperties = defaultHeaders.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DefaultHeaders].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DefaultHeaders = DefaultHeaders(additionalProperties.toImmutable())
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
        fun validate(): DefaultHeaders = apply {
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

            return other is DefaultHeaders && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DefaultHeaders{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OpenAIEmbedding &&
            additionalKwargs == other.additionalKwargs &&
            apiBase == other.apiBase &&
            apiKey == other.apiKey &&
            apiVersion == other.apiVersion &&
            className == other.className &&
            defaultHeaders == other.defaultHeaders &&
            dimensions == other.dimensions &&
            embedBatchSize == other.embedBatchSize &&
            maxRetries == other.maxRetries &&
            modelName == other.modelName &&
            numWorkers == other.numWorkers &&
            reuseClient == other.reuseClient &&
            timeout == other.timeout &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            additionalKwargs,
            apiBase,
            apiKey,
            apiVersion,
            className,
            defaultHeaders,
            dimensions,
            embedBatchSize,
            maxRetries,
            modelName,
            numWorkers,
            reuseClient,
            timeout,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OpenAIEmbedding{additionalKwargs=$additionalKwargs, apiBase=$apiBase, apiKey=$apiKey, apiVersion=$apiVersion, className=$className, defaultHeaders=$defaultHeaders, dimensions=$dimensions, embedBatchSize=$embedBatchSize, maxRetries=$maxRetries, modelName=$modelName, numWorkers=$numWorkers, reuseClient=$reuseClient, timeout=$timeout, additionalProperties=$additionalProperties}"
}
