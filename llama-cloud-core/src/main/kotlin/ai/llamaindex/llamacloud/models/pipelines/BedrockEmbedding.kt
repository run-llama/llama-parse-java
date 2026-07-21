// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BedrockEmbedding
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val additionalKwargs: JsonField<AdditionalKwargs>,
    private val awsAccessKeyId: JsonField<String>,
    private val awsSecretAccessKey: JsonField<String>,
    private val awsSessionToken: JsonField<String>,
    private val className: JsonField<String>,
    private val embedBatchSize: JsonField<Long>,
    private val maxRetries: JsonField<Long>,
    private val modelName: JsonField<String>,
    private val numWorkers: JsonField<Long>,
    private val profileName: JsonField<String>,
    private val regionName: JsonField<String>,
    private val timeout: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("additional_kwargs")
        @ExcludeMissing
        additionalKwargs: JsonField<AdditionalKwargs> = JsonMissing.of(),
        @JsonProperty("aws_access_key_id")
        @ExcludeMissing
        awsAccessKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aws_secret_access_key")
        @ExcludeMissing
        awsSecretAccessKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aws_session_token")
        @ExcludeMissing
        awsSessionToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embed_batch_size")
        @ExcludeMissing
        embedBatchSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_retries") @ExcludeMissing maxRetries: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model_name") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_workers") @ExcludeMissing numWorkers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("profile_name")
        @ExcludeMissing
        profileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region_name")
        @ExcludeMissing
        regionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Double> = JsonMissing.of(),
    ) : this(
        additionalKwargs,
        awsAccessKeyId,
        awsSecretAccessKey,
        awsSessionToken,
        className,
        embedBatchSize,
        maxRetries,
        modelName,
        numWorkers,
        profileName,
        regionName,
        timeout,
        mutableMapOf(),
    )

    /**
     * Additional kwargs for the bedrock client.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalKwargs(): Optional<AdditionalKwargs> =
        additionalKwargs.getOptional("additional_kwargs")

    /**
     * AWS Access Key ID to use
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsAccessKeyId(): Optional<String> = awsAccessKeyId.getOptional("aws_access_key_id")

    /**
     * AWS Secret Access Key to use
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsSecretAccessKey(): Optional<String> =
        awsSecretAccessKey.getOptional("aws_secret_access_key")

    /**
     * AWS Session Token to use
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsSessionToken(): Optional<String> = awsSessionToken.getOptional("aws_session_token")

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
     * The maximum number of API retries.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxRetries(): Optional<Long> = maxRetries.getOptional("max_retries")

    /**
     * The modelId of the Bedrock model to use.
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
     * The name of aws profile to use. If not given, then the default profile is used.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profileName(): Optional<String> = profileName.getOptional("profile_name")

    /**
     * AWS region name to use. Uses region configured in AWS CLI if not passed
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionName(): Optional<String> = regionName.getOptional("region_name")

    /**
     * The timeout for the Bedrock API request in seconds. It will be used for both connect and read
     * timeouts.
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
     * Returns the raw JSON value of [awsAccessKeyId].
     *
     * Unlike [awsAccessKeyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aws_access_key_id")
    @ExcludeMissing
    fun _awsAccessKeyId(): JsonField<String> = awsAccessKeyId

    /**
     * Returns the raw JSON value of [awsSecretAccessKey].
     *
     * Unlike [awsSecretAccessKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("aws_secret_access_key")
    @ExcludeMissing
    fun _awsSecretAccessKey(): JsonField<String> = awsSecretAccessKey

    /**
     * Returns the raw JSON value of [awsSessionToken].
     *
     * Unlike [awsSessionToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aws_session_token")
    @ExcludeMissing
    fun _awsSessionToken(): JsonField<String> = awsSessionToken

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
     * Returns the raw JSON value of [profileName].
     *
     * Unlike [profileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profile_name")
    @ExcludeMissing
    fun _profileName(): JsonField<String> = profileName

    /**
     * Returns the raw JSON value of [regionName].
     *
     * Unlike [regionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region_name") @ExcludeMissing fun _regionName(): JsonField<String> = regionName

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

        /** Returns a mutable builder for constructing an instance of [BedrockEmbedding]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BedrockEmbedding]. */
    class Builder internal constructor() {

        private var additionalKwargs: JsonField<AdditionalKwargs> = JsonMissing.of()
        private var awsAccessKeyId: JsonField<String> = JsonMissing.of()
        private var awsSecretAccessKey: JsonField<String> = JsonMissing.of()
        private var awsSessionToken: JsonField<String> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var embedBatchSize: JsonField<Long> = JsonMissing.of()
        private var maxRetries: JsonField<Long> = JsonMissing.of()
        private var modelName: JsonField<String> = JsonMissing.of()
        private var numWorkers: JsonField<Long> = JsonMissing.of()
        private var profileName: JsonField<String> = JsonMissing.of()
        private var regionName: JsonField<String> = JsonMissing.of()
        private var timeout: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bedrockEmbedding: BedrockEmbedding) = apply {
            additionalKwargs = bedrockEmbedding.additionalKwargs
            awsAccessKeyId = bedrockEmbedding.awsAccessKeyId
            awsSecretAccessKey = bedrockEmbedding.awsSecretAccessKey
            awsSessionToken = bedrockEmbedding.awsSessionToken
            className = bedrockEmbedding.className
            embedBatchSize = bedrockEmbedding.embedBatchSize
            maxRetries = bedrockEmbedding.maxRetries
            modelName = bedrockEmbedding.modelName
            numWorkers = bedrockEmbedding.numWorkers
            profileName = bedrockEmbedding.profileName
            regionName = bedrockEmbedding.regionName
            timeout = bedrockEmbedding.timeout
            additionalProperties = bedrockEmbedding.additionalProperties.toMutableMap()
        }

        /** Additional kwargs for the bedrock client. */
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

        /** AWS Access Key ID to use */
        fun awsAccessKeyId(awsAccessKeyId: String?) =
            awsAccessKeyId(JsonField.ofNullable(awsAccessKeyId))

        /** Alias for calling [Builder.awsAccessKeyId] with `awsAccessKeyId.orElse(null)`. */
        fun awsAccessKeyId(awsAccessKeyId: Optional<String>) =
            awsAccessKeyId(awsAccessKeyId.getOrNull())

        /**
         * Sets [Builder.awsAccessKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsAccessKeyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun awsAccessKeyId(awsAccessKeyId: JsonField<String>) = apply {
            this.awsAccessKeyId = awsAccessKeyId
        }

        /** AWS Secret Access Key to use */
        fun awsSecretAccessKey(awsSecretAccessKey: String?) =
            awsSecretAccessKey(JsonField.ofNullable(awsSecretAccessKey))

        /**
         * Alias for calling [Builder.awsSecretAccessKey] with `awsSecretAccessKey.orElse(null)`.
         */
        fun awsSecretAccessKey(awsSecretAccessKey: Optional<String>) =
            awsSecretAccessKey(awsSecretAccessKey.getOrNull())

        /**
         * Sets [Builder.awsSecretAccessKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsSecretAccessKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun awsSecretAccessKey(awsSecretAccessKey: JsonField<String>) = apply {
            this.awsSecretAccessKey = awsSecretAccessKey
        }

        /** AWS Session Token to use */
        fun awsSessionToken(awsSessionToken: String?) =
            awsSessionToken(JsonField.ofNullable(awsSessionToken))

        /** Alias for calling [Builder.awsSessionToken] with `awsSessionToken.orElse(null)`. */
        fun awsSessionToken(awsSessionToken: Optional<String>) =
            awsSessionToken(awsSessionToken.getOrNull())

        /**
         * Sets [Builder.awsSessionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsSessionToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun awsSessionToken(awsSessionToken: JsonField<String>) = apply {
            this.awsSessionToken = awsSessionToken
        }

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

        /** The maximum number of API retries. */
        fun maxRetries(maxRetries: Long) = maxRetries(JsonField.of(maxRetries))

        /**
         * Sets [Builder.maxRetries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRetries] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxRetries(maxRetries: JsonField<Long>) = apply { this.maxRetries = maxRetries }

        /** The modelId of the Bedrock model to use. */
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

        /** The name of aws profile to use. If not given, then the default profile is used. */
        fun profileName(profileName: String?) = profileName(JsonField.ofNullable(profileName))

        /** Alias for calling [Builder.profileName] with `profileName.orElse(null)`. */
        fun profileName(profileName: Optional<String>) = profileName(profileName.getOrNull())

        /**
         * Sets [Builder.profileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profileName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun profileName(profileName: JsonField<String>) = apply { this.profileName = profileName }

        /** AWS region name to use. Uses region configured in AWS CLI if not passed */
        fun regionName(regionName: String?) = regionName(JsonField.ofNullable(regionName))

        /** Alias for calling [Builder.regionName] with `regionName.orElse(null)`. */
        fun regionName(regionName: Optional<String>) = regionName(regionName.getOrNull())

        /**
         * Sets [Builder.regionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionName(regionName: JsonField<String>) = apply { this.regionName = regionName }

        /**
         * The timeout for the Bedrock API request in seconds. It will be used for both connect and
         * read timeouts.
         */
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
         * Returns an immutable instance of [BedrockEmbedding].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BedrockEmbedding =
            BedrockEmbedding(
                additionalKwargs,
                awsAccessKeyId,
                awsSecretAccessKey,
                awsSessionToken,
                className,
                embedBatchSize,
                maxRetries,
                modelName,
                numWorkers,
                profileName,
                regionName,
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
    fun validate(): BedrockEmbedding = apply {
        if (validated) {
            return@apply
        }

        additionalKwargs().ifPresent { it.validate() }
        awsAccessKeyId()
        awsSecretAccessKey()
        awsSessionToken()
        className()
        embedBatchSize()
        maxRetries()
        modelName()
        numWorkers()
        profileName()
        regionName()
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
            (if (awsAccessKeyId.asKnown().isPresent) 1 else 0) +
            (if (awsSecretAccessKey.asKnown().isPresent) 1 else 0) +
            (if (awsSessionToken.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (embedBatchSize.asKnown().isPresent) 1 else 0) +
            (if (maxRetries.asKnown().isPresent) 1 else 0) +
            (if (modelName.asKnown().isPresent) 1 else 0) +
            (if (numWorkers.asKnown().isPresent) 1 else 0) +
            (if (profileName.asKnown().isPresent) 1 else 0) +
            (if (regionName.asKnown().isPresent) 1 else 0) +
            (if (timeout.asKnown().isPresent) 1 else 0)

    /** Additional kwargs for the bedrock client. */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BedrockEmbedding &&
            additionalKwargs == other.additionalKwargs &&
            awsAccessKeyId == other.awsAccessKeyId &&
            awsSecretAccessKey == other.awsSecretAccessKey &&
            awsSessionToken == other.awsSessionToken &&
            className == other.className &&
            embedBatchSize == other.embedBatchSize &&
            maxRetries == other.maxRetries &&
            modelName == other.modelName &&
            numWorkers == other.numWorkers &&
            profileName == other.profileName &&
            regionName == other.regionName &&
            timeout == other.timeout &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            additionalKwargs,
            awsAccessKeyId,
            awsSecretAccessKey,
            awsSessionToken,
            className,
            embedBatchSize,
            maxRetries,
            modelName,
            numWorkers,
            profileName,
            regionName,
            timeout,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BedrockEmbedding{additionalKwargs=$additionalKwargs, awsAccessKeyId=$awsAccessKeyId, awsSecretAccessKey=$awsSecretAccessKey, awsSessionToken=$awsSessionToken, className=$className, embedBatchSize=$embedBatchSize, maxRetries=$maxRetries, modelName=$modelName, numWorkers=$numWorkers, profileName=$profileName, regionName=$regionName, timeout=$timeout, additionalProperties=$additionalProperties}"
}
