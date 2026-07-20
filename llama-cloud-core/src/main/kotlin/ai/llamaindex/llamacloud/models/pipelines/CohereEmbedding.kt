// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CohereEmbedding
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKey: JsonField<String>,
    private val className: JsonField<String>,
    private val embedBatchSize: JsonField<Long>,
    private val embeddingType: JsonField<String>,
    private val inputType: JsonField<String>,
    private val modelName: JsonField<String>,
    private val numWorkers: JsonField<Long>,
    private val truncate: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embed_batch_size")
        @ExcludeMissing
        embedBatchSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("embedding_type")
        @ExcludeMissing
        embeddingType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input_type") @ExcludeMissing inputType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model_name") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_workers") @ExcludeMissing numWorkers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("truncate") @ExcludeMissing truncate: JsonField<String> = JsonMissing.of(),
    ) : this(
        apiKey,
        className,
        embedBatchSize,
        embeddingType,
        inputType,
        modelName,
        numWorkers,
        truncate,
        mutableMapOf(),
    )

    /**
     * The Cohere API key.
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
     * Embedding type. If not provided float embedding_type is used when needed.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embeddingType(): Optional<String> = embeddingType.getOptional("embedding_type")

    /**
     * Model Input type. If not provided, search_document and search_query are used when needed.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputType(): Optional<String> = inputType.getOptional("input_type")

    /**
     * The modelId of the Cohere model to use.
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
     * Truncation type - START/ END/ NONE
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun truncate(): Optional<String> = truncate.getOptional("truncate")

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
     * Returns the raw JSON value of [embeddingType].
     *
     * Unlike [embeddingType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embedding_type")
    @ExcludeMissing
    fun _embeddingType(): JsonField<String> = embeddingType

    /**
     * Returns the raw JSON value of [inputType].
     *
     * Unlike [inputType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("input_type") @ExcludeMissing fun _inputType(): JsonField<String> = inputType

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
     * Returns the raw JSON value of [truncate].
     *
     * Unlike [truncate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("truncate") @ExcludeMissing fun _truncate(): JsonField<String> = truncate

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
         * Returns a mutable builder for constructing an instance of [CohereEmbedding].
         *
         * The following fields are required:
         * ```java
         * .apiKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CohereEmbedding]. */
    class Builder internal constructor() {

        private var apiKey: JsonField<String>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var embedBatchSize: JsonField<Long> = JsonMissing.of()
        private var embeddingType: JsonField<String> = JsonMissing.of()
        private var inputType: JsonField<String> = JsonMissing.of()
        private var modelName: JsonField<String> = JsonMissing.of()
        private var numWorkers: JsonField<Long> = JsonMissing.of()
        private var truncate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cohereEmbedding: CohereEmbedding) = apply {
            apiKey = cohereEmbedding.apiKey
            className = cohereEmbedding.className
            embedBatchSize = cohereEmbedding.embedBatchSize
            embeddingType = cohereEmbedding.embeddingType
            inputType = cohereEmbedding.inputType
            modelName = cohereEmbedding.modelName
            numWorkers = cohereEmbedding.numWorkers
            truncate = cohereEmbedding.truncate
            additionalProperties = cohereEmbedding.additionalProperties.toMutableMap()
        }

        /** The Cohere API key. */
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

        /** Embedding type. If not provided float embedding_type is used when needed. */
        fun embeddingType(embeddingType: String) = embeddingType(JsonField.of(embeddingType))

        /**
         * Sets [Builder.embeddingType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun embeddingType(embeddingType: JsonField<String>) = apply {
            this.embeddingType = embeddingType
        }

        /**
         * Model Input type. If not provided, search_document and search_query are used when needed.
         */
        fun inputType(inputType: String?) = inputType(JsonField.ofNullable(inputType))

        /** Alias for calling [Builder.inputType] with `inputType.orElse(null)`. */
        fun inputType(inputType: Optional<String>) = inputType(inputType.getOrNull())

        /**
         * Sets [Builder.inputType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputType(inputType: JsonField<String>) = apply { this.inputType = inputType }

        /** The modelId of the Cohere model to use. */
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

        /** Truncation type - START/ END/ NONE */
        fun truncate(truncate: String) = truncate(JsonField.of(truncate))

        /**
         * Sets [Builder.truncate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truncate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun truncate(truncate: JsonField<String>) = apply { this.truncate = truncate }

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
         * Returns an immutable instance of [CohereEmbedding].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .apiKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CohereEmbedding =
            CohereEmbedding(
                checkRequired("apiKey", apiKey),
                className,
                embedBatchSize,
                embeddingType,
                inputType,
                modelName,
                numWorkers,
                truncate,
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
    fun validate(): CohereEmbedding = apply {
        if (validated) {
            return@apply
        }

        apiKey()
        className()
        embedBatchSize()
        embeddingType()
        inputType()
        modelName()
        numWorkers()
        truncate()
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
        (if (apiKey.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (embedBatchSize.asKnown().isPresent) 1 else 0) +
            (if (embeddingType.asKnown().isPresent) 1 else 0) +
            (if (inputType.asKnown().isPresent) 1 else 0) +
            (if (modelName.asKnown().isPresent) 1 else 0) +
            (if (numWorkers.asKnown().isPresent) 1 else 0) +
            (if (truncate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CohereEmbedding &&
            apiKey == other.apiKey &&
            className == other.className &&
            embedBatchSize == other.embedBatchSize &&
            embeddingType == other.embeddingType &&
            inputType == other.inputType &&
            modelName == other.modelName &&
            numWorkers == other.numWorkers &&
            truncate == other.truncate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKey,
            className,
            embedBatchSize,
            embeddingType,
            inputType,
            modelName,
            numWorkers,
            truncate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CohereEmbedding{apiKey=$apiKey, className=$className, embedBatchSize=$embedBatchSize, embeddingType=$embeddingType, inputType=$inputType, modelName=$modelName, numWorkers=$numWorkers, truncate=$truncate, additionalProperties=$additionalProperties}"
}
