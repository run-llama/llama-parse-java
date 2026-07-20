// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.BaseDeserializer
import ai.llamaindex.llamacloud.core.BaseSerializer
import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.allMaxBy
import ai.llamaindex.llamacloud.core.getOrThrow
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class HuggingFaceInferenceApiEmbedding
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<Token>,
    private val className: JsonField<String>,
    private val cookies: JsonField<Cookies>,
    private val embedBatchSize: JsonField<Long>,
    private val headers: JsonField<Headers>,
    private val modelName: JsonField<String>,
    private val numWorkers: JsonField<Long>,
    private val pooling: JsonField<Pooling>,
    private val queryInstruction: JsonField<String>,
    private val task: JsonField<String>,
    private val textInstruction: JsonField<String>,
    private val timeout: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<Token> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cookies") @ExcludeMissing cookies: JsonField<Cookies> = JsonMissing.of(),
        @JsonProperty("embed_batch_size")
        @ExcludeMissing
        embedBatchSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("model_name") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_workers") @ExcludeMissing numWorkers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pooling") @ExcludeMissing pooling: JsonField<Pooling> = JsonMissing.of(),
        @JsonProperty("query_instruction")
        @ExcludeMissing
        queryInstruction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("task") @ExcludeMissing task: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_instruction")
        @ExcludeMissing
        textInstruction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Double> = JsonMissing.of(),
    ) : this(
        token,
        className,
        cookies,
        embedBatchSize,
        headers,
        modelName,
        numWorkers,
        pooling,
        queryInstruction,
        task,
        textInstruction,
        timeout,
        mutableMapOf(),
    )

    /**
     * Hugging Face token. Will default to the locally saved token. Pass token=False if you don’t
     * want to send your token to the server.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<Token> = token.getOptional("token")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * Additional cookies to send to the server.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cookies(): Optional<Cookies> = cookies.getOptional("cookies")

    /**
     * The batch size for embedding calls.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embedBatchSize(): Optional<Long> = embedBatchSize.getOptional("embed_batch_size")

    /**
     * Additional headers to send to the server. By default only the authorization and user-agent
     * headers are sent. Values in this dictionary will override the default values.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Optional<Headers> = headers.getOptional("headers")

    /**
     * Hugging Face model name. If None, the task will be used.
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
     * Enum of possible pooling choices with pooling behaviors.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pooling(): Optional<Pooling> = pooling.getOptional("pooling")

    /**
     * Instruction to prepend during query embedding.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun queryInstruction(): Optional<String> = queryInstruction.getOptional("query_instruction")

    /**
     * Optional task to pick Hugging Face's recommended model, used when model_name is left as
     * default of None.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun task(): Optional<String> = task.getOptional("task")

    /**
     * Instruction to prepend during text embedding.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textInstruction(): Optional<String> = textInstruction.getOptional("text_instruction")

    /**
     * The maximum number of seconds to wait for a response from the server. Loading a new model in
     * Inference API can take up to several minutes. Defaults to None, meaning it will loop until
     * the server is available.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeout(): Optional<Double> = timeout.getOptional("timeout")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<Token> = token

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [cookies].
     *
     * Unlike [cookies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cookies") @ExcludeMissing fun _cookies(): JsonField<Cookies> = cookies

    /**
     * Returns the raw JSON value of [embedBatchSize].
     *
     * Unlike [embedBatchSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embed_batch_size")
    @ExcludeMissing
    fun _embedBatchSize(): JsonField<Long> = embedBatchSize

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

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
     * Returns the raw JSON value of [pooling].
     *
     * Unlike [pooling], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pooling") @ExcludeMissing fun _pooling(): JsonField<Pooling> = pooling

    /**
     * Returns the raw JSON value of [queryInstruction].
     *
     * Unlike [queryInstruction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("query_instruction")
    @ExcludeMissing
    fun _queryInstruction(): JsonField<String> = queryInstruction

    /**
     * Returns the raw JSON value of [task].
     *
     * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("task") @ExcludeMissing fun _task(): JsonField<String> = task

    /**
     * Returns the raw JSON value of [textInstruction].
     *
     * Unlike [textInstruction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_instruction")
    @ExcludeMissing
    fun _textInstruction(): JsonField<String> = textInstruction

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [HuggingFaceInferenceApiEmbedding].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HuggingFaceInferenceApiEmbedding]. */
    class Builder internal constructor() {

        private var token: JsonField<Token> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var cookies: JsonField<Cookies> = JsonMissing.of()
        private var embedBatchSize: JsonField<Long> = JsonMissing.of()
        private var headers: JsonField<Headers> = JsonMissing.of()
        private var modelName: JsonField<String> = JsonMissing.of()
        private var numWorkers: JsonField<Long> = JsonMissing.of()
        private var pooling: JsonField<Pooling> = JsonMissing.of()
        private var queryInstruction: JsonField<String> = JsonMissing.of()
        private var task: JsonField<String> = JsonMissing.of()
        private var textInstruction: JsonField<String> = JsonMissing.of()
        private var timeout: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(huggingFaceInferenceApiEmbedding: HuggingFaceInferenceApiEmbedding) =
            apply {
                token = huggingFaceInferenceApiEmbedding.token
                className = huggingFaceInferenceApiEmbedding.className
                cookies = huggingFaceInferenceApiEmbedding.cookies
                embedBatchSize = huggingFaceInferenceApiEmbedding.embedBatchSize
                headers = huggingFaceInferenceApiEmbedding.headers
                modelName = huggingFaceInferenceApiEmbedding.modelName
                numWorkers = huggingFaceInferenceApiEmbedding.numWorkers
                pooling = huggingFaceInferenceApiEmbedding.pooling
                queryInstruction = huggingFaceInferenceApiEmbedding.queryInstruction
                task = huggingFaceInferenceApiEmbedding.task
                textInstruction = huggingFaceInferenceApiEmbedding.textInstruction
                timeout = huggingFaceInferenceApiEmbedding.timeout
                additionalProperties =
                    huggingFaceInferenceApiEmbedding.additionalProperties.toMutableMap()
            }

        /**
         * Hugging Face token. Will default to the locally saved token. Pass token=False if you
         * don’t want to send your token to the server.
         */
        fun token(token: Token?) = token(JsonField.ofNullable(token))

        /** Alias for calling [Builder.token] with `token.orElse(null)`. */
        fun token(token: Optional<Token>) = token(token.getOrNull())

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [Token] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<Token>) = apply { this.token = token }

        /** Alias for calling [token] with `Token.ofString(string)`. */
        fun token(string: String) = token(Token.ofString(string))

        /** Alias for calling [token] with `Token.ofBool(bool)`. */
        fun token(bool: Boolean) = token(Token.ofBool(bool))

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** Additional cookies to send to the server. */
        fun cookies(cookies: Cookies?) = cookies(JsonField.ofNullable(cookies))

        /** Alias for calling [Builder.cookies] with `cookies.orElse(null)`. */
        fun cookies(cookies: Optional<Cookies>) = cookies(cookies.getOrNull())

        /**
         * Sets [Builder.cookies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cookies] with a well-typed [Cookies] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cookies(cookies: JsonField<Cookies>) = apply { this.cookies = cookies }

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

        /**
         * Additional headers to send to the server. By default only the authorization and
         * user-agent headers are sent. Values in this dictionary will override the default values.
         */
        fun headers(headers: Headers?) = headers(JsonField.ofNullable(headers))

        /** Alias for calling [Builder.headers] with `headers.orElse(null)`. */
        fun headers(headers: Optional<Headers>) = headers(headers.getOrNull())

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

        /** Hugging Face model name. If None, the task will be used. */
        fun modelName(modelName: String?) = modelName(JsonField.ofNullable(modelName))

        /** Alias for calling [Builder.modelName] with `modelName.orElse(null)`. */
        fun modelName(modelName: Optional<String>) = modelName(modelName.getOrNull())

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

        /** Enum of possible pooling choices with pooling behaviors. */
        fun pooling(pooling: Pooling?) = pooling(JsonField.ofNullable(pooling))

        /** Alias for calling [Builder.pooling] with `pooling.orElse(null)`. */
        fun pooling(pooling: Optional<Pooling>) = pooling(pooling.getOrNull())

        /**
         * Sets [Builder.pooling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pooling] with a well-typed [Pooling] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pooling(pooling: JsonField<Pooling>) = apply { this.pooling = pooling }

        /** Instruction to prepend during query embedding. */
        fun queryInstruction(queryInstruction: String?) =
            queryInstruction(JsonField.ofNullable(queryInstruction))

        /** Alias for calling [Builder.queryInstruction] with `queryInstruction.orElse(null)`. */
        fun queryInstruction(queryInstruction: Optional<String>) =
            queryInstruction(queryInstruction.getOrNull())

        /**
         * Sets [Builder.queryInstruction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queryInstruction] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun queryInstruction(queryInstruction: JsonField<String>) = apply {
            this.queryInstruction = queryInstruction
        }

        /**
         * Optional task to pick Hugging Face's recommended model, used when model_name is left as
         * default of None.
         */
        fun task(task: String?) = task(JsonField.ofNullable(task))

        /** Alias for calling [Builder.task] with `task.orElse(null)`. */
        fun task(task: Optional<String>) = task(task.getOrNull())

        /**
         * Sets [Builder.task] to an arbitrary JSON value.
         *
         * You should usually call [Builder.task] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun task(task: JsonField<String>) = apply { this.task = task }

        /** Instruction to prepend during text embedding. */
        fun textInstruction(textInstruction: String?) =
            textInstruction(JsonField.ofNullable(textInstruction))

        /** Alias for calling [Builder.textInstruction] with `textInstruction.orElse(null)`. */
        fun textInstruction(textInstruction: Optional<String>) =
            textInstruction(textInstruction.getOrNull())

        /**
         * Sets [Builder.textInstruction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textInstruction] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun textInstruction(textInstruction: JsonField<String>) = apply {
            this.textInstruction = textInstruction
        }

        /**
         * The maximum number of seconds to wait for a response from the server. Loading a new model
         * in Inference API can take up to several minutes. Defaults to None, meaning it will loop
         * until the server is available.
         */
        fun timeout(timeout: Double?) = timeout(JsonField.ofNullable(timeout))

        /**
         * Alias for [Builder.timeout].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeout(timeout: Double) = timeout(timeout as Double?)

        /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
        fun timeout(timeout: Optional<Double>) = timeout(timeout.getOrNull())

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
         * Returns an immutable instance of [HuggingFaceInferenceApiEmbedding].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HuggingFaceInferenceApiEmbedding =
            HuggingFaceInferenceApiEmbedding(
                token,
                className,
                cookies,
                embedBatchSize,
                headers,
                modelName,
                numWorkers,
                pooling,
                queryInstruction,
                task,
                textInstruction,
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
    fun validate(): HuggingFaceInferenceApiEmbedding = apply {
        if (validated) {
            return@apply
        }

        token().ifPresent { it.validate() }
        className()
        cookies().ifPresent { it.validate() }
        embedBatchSize()
        headers().ifPresent { it.validate() }
        modelName()
        numWorkers()
        pooling().ifPresent { it.validate() }
        queryInstruction()
        task()
        textInstruction()
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
        (token.asKnown().getOrNull()?.validity() ?: 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (cookies.asKnown().getOrNull()?.validity() ?: 0) +
            (if (embedBatchSize.asKnown().isPresent) 1 else 0) +
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
            (if (modelName.asKnown().isPresent) 1 else 0) +
            (if (numWorkers.asKnown().isPresent) 1 else 0) +
            (pooling.asKnown().getOrNull()?.validity() ?: 0) +
            (if (queryInstruction.asKnown().isPresent) 1 else 0) +
            (if (task.asKnown().isPresent) 1 else 0) +
            (if (textInstruction.asKnown().isPresent) 1 else 0) +
            (if (timeout.asKnown().isPresent) 1 else 0)

    /**
     * Hugging Face token. Will default to the locally saved token. Pass token=False if you don’t
     * want to send your token to the server.
     */
    @JsonDeserialize(using = Token.Deserializer::class)
    @JsonSerialize(using = Token.Serializer::class)
    class Token
    private constructor(
        private val string: String? = null,
        private val bool: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun isString(): Boolean = string != null

        fun isBool(): Boolean = bool != null

        fun asString(): String = string.getOrThrow("string")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import ai.llamaindex.llamacloud.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = token.accept(new Token.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
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
                string != null -> visitor.visitString(string)
                bool != null -> visitor.visitBool(bool)
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
        fun validate(): Token = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitBool(bool: Boolean) {}
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
                    override fun visitString(string: String) = 1

                    override fun visitBool(bool: Boolean) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Token && string == other.string && bool == other.bool
        }

        override fun hashCode(): Int = Objects.hash(string, bool)

        override fun toString(): String =
            when {
                string != null -> "Token{string=$string}"
                bool != null -> "Token{bool=$bool}"
                _json != null -> "Token{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Token")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Token(string = string)

            @JvmStatic fun ofBool(bool: Boolean) = Token(bool = bool)
        }

        /** An interface that defines how to map each variant of [Token] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitBool(bool: Boolean): T

            /**
             * Maps an unknown variant of [Token] to a value of type [T].
             *
             * An instance of [Token] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown Token: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Token>(Token::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Token {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Token(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                Token(bool = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from integer).
                    0 -> Token(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Token>(Token::class) {

            override fun serialize(
                value: Token,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.bool != null -> generator.writeObject(value.bool)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Token")
                }
            }
        }
    }

    /** Additional cookies to send to the server. */
    class Cookies
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

            /** Returns a mutable builder for constructing an instance of [Cookies]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cookies]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cookies: Cookies) = apply {
                additionalProperties = cookies.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Cookies].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Cookies = Cookies(additionalProperties.toImmutable())
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
        fun validate(): Cookies = apply {
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

            return other is Cookies && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Cookies{additionalProperties=$additionalProperties}"
    }

    /**
     * Additional headers to send to the server. By default only the authorization and user-agent
     * headers are sent. Values in this dictionary will override the default values.
     */
    class Headers
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

            /** Returns a mutable builder for constructing an instance of [Headers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Headers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Headers = Headers(additionalProperties.toImmutable())
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
        fun validate(): Headers = apply {
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

            return other is Headers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    /** Enum of possible pooling choices with pooling behaviors. */
    class Pooling @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CLS = of("cls")

            @JvmField val LAST = of("last")

            @JvmField val MEAN = of("mean")

            @JvmStatic fun of(value: String) = Pooling(JsonField.of(value))
        }

        /** An enum containing [Pooling]'s known values. */
        enum class Known {
            CLS,
            LAST,
            MEAN,
        }

        /**
         * An enum containing [Pooling]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Pooling] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CLS,
            LAST,
            MEAN,
            /** An enum member indicating that [Pooling] was instantiated with an unknown value. */
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
                CLS -> Value.CLS
                LAST -> Value.LAST
                MEAN -> Value.MEAN
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
                CLS -> Known.CLS
                LAST -> Known.LAST
                MEAN -> Known.MEAN
                else -> throw LlamaCloudInvalidDataException("Unknown Pooling: $value")
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
        fun validate(): Pooling = apply {
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

            return other is Pooling && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HuggingFaceInferenceApiEmbedding &&
            token == other.token &&
            className == other.className &&
            cookies == other.cookies &&
            embedBatchSize == other.embedBatchSize &&
            headers == other.headers &&
            modelName == other.modelName &&
            numWorkers == other.numWorkers &&
            pooling == other.pooling &&
            queryInstruction == other.queryInstruction &&
            task == other.task &&
            textInstruction == other.textInstruction &&
            timeout == other.timeout &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            className,
            cookies,
            embedBatchSize,
            headers,
            modelName,
            numWorkers,
            pooling,
            queryInstruction,
            task,
            textInstruction,
            timeout,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HuggingFaceInferenceApiEmbedding{token=$token, className=$className, cookies=$cookies, embedBatchSize=$embedBatchSize, headers=$headers, modelName=$modelName, numWorkers=$numWorkers, pooling=$pooling, queryInstruction=$queryInstruction, task=$task, textInstruction=$textInstruction, timeout=$timeout, additionalProperties=$additionalProperties}"
}
