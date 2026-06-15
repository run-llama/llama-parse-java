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
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class GeminiEmbedding
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiBase: JsonField<String>,
    private val apiKey: JsonField<String>,
    private val className: JsonField<String>,
    private val embedBatchSize: JsonField<Long>,
    private val modelName: JsonField<String>,
    private val numWorkers: JsonField<Long>,
    private val outputDimensionality: JsonField<Long>,
    private val taskType: JsonField<String>,
    private val title: JsonField<String>,
    private val transport: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_base") @ExcludeMissing apiBase: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embed_batch_size")
        @ExcludeMissing
        embedBatchSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model_name") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_workers") @ExcludeMissing numWorkers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("output_dimensionality")
        @ExcludeMissing
        outputDimensionality: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("task_type") @ExcludeMissing taskType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transport") @ExcludeMissing transport: JsonField<String> = JsonMissing.of(),
    ) : this(
        apiBase,
        apiKey,
        className,
        embedBatchSize,
        modelName,
        numWorkers,
        outputDimensionality,
        taskType,
        title,
        transport,
        mutableMapOf(),
    )

    /**
     * API base to access the model. Defaults to None.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiBase(): Optional<String> = apiBase.getOptional("api_base")

    /**
     * API key to access the model. Defaults to None.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The batch size for embedding calls.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embedBatchSize(): Optional<Long> = embedBatchSize.getOptional("embed_batch_size")

    /**
     * The modelId of the Gemini model to use.
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
     * Optional reduced dimension for output embeddings. Supported by models/text-embedding-004 and
     * newer (e.g. gemini-embedding-001). Not supported by models/embedding-001.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputDimensionality(): Optional<Long> =
        outputDimensionality.getOptional("output_dimensionality")

    /**
     * The task for embedding model.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taskType(): Optional<String> = taskType.getOptional("task_type")

    /**
     * Title is only applicable for retrieval_document tasks, and is used to represent a document
     * title. For other tasks, title is invalid.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Transport to access the model. Defaults to None.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transport(): Optional<String> = transport.getOptional("transport")

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
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [embedBatchSize].
     *
     * Unlike [embedBatchSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embed_batch_size")
    @ExcludeMissing
    fun _embedBatchSize(): JsonField<Long> = embedBatchSize

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
     * Returns the raw JSON value of [outputDimensionality].
     *
     * Unlike [outputDimensionality], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("output_dimensionality")
    @ExcludeMissing
    fun _outputDimensionality(): JsonField<Long> = outputDimensionality

    /**
     * Returns the raw JSON value of [taskType].
     *
     * Unlike [taskType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("task_type") @ExcludeMissing fun _taskType(): JsonField<String> = taskType

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [transport].
     *
     * Unlike [transport], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transport") @ExcludeMissing fun _transport(): JsonField<String> = transport

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

        /** Returns a mutable builder for constructing an instance of [GeminiEmbedding]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeminiEmbedding]. */
    class Builder internal constructor() {

        private var apiBase: JsonField<String> = JsonMissing.of()
        private var apiKey: JsonField<String> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var embedBatchSize: JsonField<Long> = JsonMissing.of()
        private var modelName: JsonField<String> = JsonMissing.of()
        private var numWorkers: JsonField<Long> = JsonMissing.of()
        private var outputDimensionality: JsonField<Long> = JsonMissing.of()
        private var taskType: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var transport: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(geminiEmbedding: GeminiEmbedding) = apply {
            apiBase = geminiEmbedding.apiBase
            apiKey = geminiEmbedding.apiKey
            className = geminiEmbedding.className
            embedBatchSize = geminiEmbedding.embedBatchSize
            modelName = geminiEmbedding.modelName
            numWorkers = geminiEmbedding.numWorkers
            outputDimensionality = geminiEmbedding.outputDimensionality
            taskType = geminiEmbedding.taskType
            title = geminiEmbedding.title
            transport = geminiEmbedding.transport
            additionalProperties = geminiEmbedding.additionalProperties.toMutableMap()
        }

        /** API base to access the model. Defaults to None. */
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

        /** API key to access the model. Defaults to None. */
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

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

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

        /** The modelId of the Gemini model to use. */
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
         * Optional reduced dimension for output embeddings. Supported by models/text-embedding-004
         * and newer (e.g. gemini-embedding-001). Not supported by models/embedding-001.
         */
        fun outputDimensionality(outputDimensionality: Long?) =
            outputDimensionality(JsonField.ofNullable(outputDimensionality))

        /**
         * Alias for [Builder.outputDimensionality].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun outputDimensionality(outputDimensionality: Long) =
            outputDimensionality(outputDimensionality as Long?)

        /**
         * Alias for calling [Builder.outputDimensionality] with
         * `outputDimensionality.orElse(null)`.
         */
        fun outputDimensionality(outputDimensionality: Optional<Long>) =
            outputDimensionality(outputDimensionality.getOrNull())

        /**
         * Sets [Builder.outputDimensionality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputDimensionality] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputDimensionality(outputDimensionality: JsonField<Long>) = apply {
            this.outputDimensionality = outputDimensionality
        }

        /** The task for embedding model. */
        fun taskType(taskType: String?) = taskType(JsonField.ofNullable(taskType))

        /** Alias for calling [Builder.taskType] with `taskType.orElse(null)`. */
        fun taskType(taskType: Optional<String>) = taskType(taskType.getOrNull())

        /**
         * Sets [Builder.taskType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taskType(taskType: JsonField<String>) = apply { this.taskType = taskType }

        /**
         * Title is only applicable for retrieval_document tasks, and is used to represent a
         * document title. For other tasks, title is invalid.
         */
        fun title(title: String?) = title(JsonField.ofNullable(title))

        /** Alias for calling [Builder.title] with `title.orElse(null)`. */
        fun title(title: Optional<String>) = title(title.getOrNull())

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** Transport to access the model. Defaults to None. */
        fun transport(transport: String?) = transport(JsonField.ofNullable(transport))

        /** Alias for calling [Builder.transport] with `transport.orElse(null)`. */
        fun transport(transport: Optional<String>) = transport(transport.getOrNull())

        /**
         * Sets [Builder.transport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transport] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transport(transport: JsonField<String>) = apply { this.transport = transport }

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
         * Returns an immutable instance of [GeminiEmbedding].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GeminiEmbedding =
            GeminiEmbedding(
                apiBase,
                apiKey,
                className,
                embedBatchSize,
                modelName,
                numWorkers,
                outputDimensionality,
                taskType,
                title,
                transport,
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
    fun validate(): GeminiEmbedding = apply {
        if (validated) {
            return@apply
        }

        apiBase()
        apiKey()
        className()
        embedBatchSize()
        modelName()
        numWorkers()
        outputDimensionality()
        taskType()
        title()
        transport()
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
        (if (apiBase.asKnown().isPresent) 1 else 0) +
            (if (apiKey.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (embedBatchSize.asKnown().isPresent) 1 else 0) +
            (if (modelName.asKnown().isPresent) 1 else 0) +
            (if (numWorkers.asKnown().isPresent) 1 else 0) +
            (if (outputDimensionality.asKnown().isPresent) 1 else 0) +
            (if (taskType.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (transport.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GeminiEmbedding &&
            apiBase == other.apiBase &&
            apiKey == other.apiKey &&
            className == other.className &&
            embedBatchSize == other.embedBatchSize &&
            modelName == other.modelName &&
            numWorkers == other.numWorkers &&
            outputDimensionality == other.outputDimensionality &&
            taskType == other.taskType &&
            title == other.title &&
            transport == other.transport &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiBase,
            apiKey,
            className,
            embedBatchSize,
            modelName,
            numWorkers,
            outputDimensionality,
            taskType,
            title,
            transport,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GeminiEmbedding{apiBase=$apiBase, apiKey=$apiKey, className=$className, embedBatchSize=$embedBatchSize, modelName=$modelName, numWorkers=$numWorkers, outputDimensionality=$outputDimensionality, taskType=$taskType, title=$title, transport=$transport, additionalProperties=$additionalProperties}"
}
