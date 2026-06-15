// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VertexTextEmbedding
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientEmail: JsonField<String>,
    private val location: JsonField<String>,
    private val privateKey: JsonField<String>,
    private val privateKeyId: JsonField<String>,
    private val project: JsonField<String>,
    private val tokenUri: JsonField<String>,
    private val additionalKwargs: JsonField<AdditionalKwargs>,
    private val className: JsonField<String>,
    private val embedBatchSize: JsonField<Long>,
    private val embedMode: JsonField<EmbedMode>,
    private val modelName: JsonField<String>,
    private val numWorkers: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("client_email")
        @ExcludeMissing
        clientEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
        @JsonProperty("private_key")
        @ExcludeMissing
        privateKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("private_key_id")
        @ExcludeMissing
        privateKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project") @ExcludeMissing project: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_uri") @ExcludeMissing tokenUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("additional_kwargs")
        @ExcludeMissing
        additionalKwargs: JsonField<AdditionalKwargs> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embed_batch_size")
        @ExcludeMissing
        embedBatchSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("embed_mode")
        @ExcludeMissing
        embedMode: JsonField<EmbedMode> = JsonMissing.of(),
        @JsonProperty("model_name") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_workers") @ExcludeMissing numWorkers: JsonField<Long> = JsonMissing.of(),
    ) : this(
        clientEmail,
        location,
        privateKey,
        privateKeyId,
        project,
        tokenUri,
        additionalKwargs,
        className,
        embedBatchSize,
        embedMode,
        modelName,
        numWorkers,
        mutableMapOf(),
    )

    /**
     * The client email for the VertexAI credentials.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientEmail(): Optional<String> = clientEmail.getOptional("client_email")

    /**
     * The default location to use when making API calls.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun location(): String = location.getRequired("location")

    /**
     * The private key for the VertexAI credentials.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun privateKey(): Optional<String> = privateKey.getOptional("private_key")

    /**
     * The private key ID for the VertexAI credentials.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun privateKeyId(): Optional<String> = privateKeyId.getOptional("private_key_id")

    /**
     * The default GCP project to use when making Vertex API calls.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun project(): String = project.getRequired("project")

    /**
     * The token URI for the VertexAI credentials.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenUri(): Optional<String> = tokenUri.getOptional("token_uri")

    /**
     * Additional kwargs for the Vertex.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalKwargs(): Optional<AdditionalKwargs> =
        additionalKwargs.getOptional("additional_kwargs")

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
     * The embedding mode to use.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embedMode(): Optional<EmbedMode> = embedMode.getOptional("embed_mode")

    /**
     * The modelId of the VertexAI model to use.
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
     * Returns the raw JSON value of [clientEmail].
     *
     * Unlike [clientEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_email")
    @ExcludeMissing
    fun _clientEmail(): JsonField<String> = clientEmail

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

    /**
     * Returns the raw JSON value of [privateKey].
     *
     * Unlike [privateKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("private_key") @ExcludeMissing fun _privateKey(): JsonField<String> = privateKey

    /**
     * Returns the raw JSON value of [privateKeyId].
     *
     * Unlike [privateKeyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("private_key_id")
    @ExcludeMissing
    fun _privateKeyId(): JsonField<String> = privateKeyId

    /**
     * Returns the raw JSON value of [project].
     *
     * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<String> = project

    /**
     * Returns the raw JSON value of [tokenUri].
     *
     * Unlike [tokenUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_uri") @ExcludeMissing fun _tokenUri(): JsonField<String> = tokenUri

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
     * Returns the raw JSON value of [embedMode].
     *
     * Unlike [embedMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embed_mode") @ExcludeMissing fun _embedMode(): JsonField<EmbedMode> = embedMode

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
         * Returns a mutable builder for constructing an instance of [VertexTextEmbedding].
         *
         * The following fields are required:
         * ```java
         * .clientEmail()
         * .location()
         * .privateKey()
         * .privateKeyId()
         * .project()
         * .tokenUri()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VertexTextEmbedding]. */
    class Builder internal constructor() {

        private var clientEmail: JsonField<String>? = null
        private var location: JsonField<String>? = null
        private var privateKey: JsonField<String>? = null
        private var privateKeyId: JsonField<String>? = null
        private var project: JsonField<String>? = null
        private var tokenUri: JsonField<String>? = null
        private var additionalKwargs: JsonField<AdditionalKwargs> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var embedBatchSize: JsonField<Long> = JsonMissing.of()
        private var embedMode: JsonField<EmbedMode> = JsonMissing.of()
        private var modelName: JsonField<String> = JsonMissing.of()
        private var numWorkers: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vertexTextEmbedding: VertexTextEmbedding) = apply {
            clientEmail = vertexTextEmbedding.clientEmail
            location = vertexTextEmbedding.location
            privateKey = vertexTextEmbedding.privateKey
            privateKeyId = vertexTextEmbedding.privateKeyId
            project = vertexTextEmbedding.project
            tokenUri = vertexTextEmbedding.tokenUri
            additionalKwargs = vertexTextEmbedding.additionalKwargs
            className = vertexTextEmbedding.className
            embedBatchSize = vertexTextEmbedding.embedBatchSize
            embedMode = vertexTextEmbedding.embedMode
            modelName = vertexTextEmbedding.modelName
            numWorkers = vertexTextEmbedding.numWorkers
            additionalProperties = vertexTextEmbedding.additionalProperties.toMutableMap()
        }

        /** The client email for the VertexAI credentials. */
        fun clientEmail(clientEmail: String?) = clientEmail(JsonField.ofNullable(clientEmail))

        /** Alias for calling [Builder.clientEmail] with `clientEmail.orElse(null)`. */
        fun clientEmail(clientEmail: Optional<String>) = clientEmail(clientEmail.getOrNull())

        /**
         * Sets [Builder.clientEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientEmail(clientEmail: JsonField<String>) = apply { this.clientEmail = clientEmail }

        /** The default location to use when making API calls. */
        fun location(location: String) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { this.location = location }

        /** The private key for the VertexAI credentials. */
        fun privateKey(privateKey: String?) = privateKey(JsonField.ofNullable(privateKey))

        /** Alias for calling [Builder.privateKey] with `privateKey.orElse(null)`. */
        fun privateKey(privateKey: Optional<String>) = privateKey(privateKey.getOrNull())

        /**
         * Sets [Builder.privateKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privateKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun privateKey(privateKey: JsonField<String>) = apply { this.privateKey = privateKey }

        /** The private key ID for the VertexAI credentials. */
        fun privateKeyId(privateKeyId: String?) = privateKeyId(JsonField.ofNullable(privateKeyId))

        /** Alias for calling [Builder.privateKeyId] with `privateKeyId.orElse(null)`. */
        fun privateKeyId(privateKeyId: Optional<String>) = privateKeyId(privateKeyId.getOrNull())

        /**
         * Sets [Builder.privateKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privateKeyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun privateKeyId(privateKeyId: JsonField<String>) = apply {
            this.privateKeyId = privateKeyId
        }

        /** The default GCP project to use when making Vertex API calls. */
        fun project(project: String) = project(JsonField.of(project))

        /**
         * Sets [Builder.project] to an arbitrary JSON value.
         *
         * You should usually call [Builder.project] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun project(project: JsonField<String>) = apply { this.project = project }

        /** The token URI for the VertexAI credentials. */
        fun tokenUri(tokenUri: String?) = tokenUri(JsonField.ofNullable(tokenUri))

        /** Alias for calling [Builder.tokenUri] with `tokenUri.orElse(null)`. */
        fun tokenUri(tokenUri: Optional<String>) = tokenUri(tokenUri.getOrNull())

        /**
         * Sets [Builder.tokenUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenUri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tokenUri(tokenUri: JsonField<String>) = apply { this.tokenUri = tokenUri }

        /** Additional kwargs for the Vertex. */
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

        /** The embedding mode to use. */
        fun embedMode(embedMode: EmbedMode) = embedMode(JsonField.of(embedMode))

        /**
         * Sets [Builder.embedMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embedMode] with a well-typed [EmbedMode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun embedMode(embedMode: JsonField<EmbedMode>) = apply { this.embedMode = embedMode }

        /** The modelId of the VertexAI model to use. */
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
         * Returns an immutable instance of [VertexTextEmbedding].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clientEmail()
         * .location()
         * .privateKey()
         * .privateKeyId()
         * .project()
         * .tokenUri()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VertexTextEmbedding =
            VertexTextEmbedding(
                checkRequired("clientEmail", clientEmail),
                checkRequired("location", location),
                checkRequired("privateKey", privateKey),
                checkRequired("privateKeyId", privateKeyId),
                checkRequired("project", project),
                checkRequired("tokenUri", tokenUri),
                additionalKwargs,
                className,
                embedBatchSize,
                embedMode,
                modelName,
                numWorkers,
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
    fun validate(): VertexTextEmbedding = apply {
        if (validated) {
            return@apply
        }

        clientEmail()
        location()
        privateKey()
        privateKeyId()
        project()
        tokenUri()
        additionalKwargs().ifPresent { it.validate() }
        className()
        embedBatchSize()
        embedMode().ifPresent { it.validate() }
        modelName()
        numWorkers()
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
        (if (clientEmail.asKnown().isPresent) 1 else 0) +
            (if (location.asKnown().isPresent) 1 else 0) +
            (if (privateKey.asKnown().isPresent) 1 else 0) +
            (if (privateKeyId.asKnown().isPresent) 1 else 0) +
            (if (project.asKnown().isPresent) 1 else 0) +
            (if (tokenUri.asKnown().isPresent) 1 else 0) +
            (additionalKwargs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (embedBatchSize.asKnown().isPresent) 1 else 0) +
            (embedMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (modelName.asKnown().isPresent) 1 else 0) +
            (if (numWorkers.asKnown().isPresent) 1 else 0)

    /** Additional kwargs for the Vertex. */
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

    /** The embedding mode to use. */
    class EmbedMode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEFAULT = of("default")

            @JvmField val CLASSIFICATION = of("classification")

            @JvmField val CLUSTERING = of("clustering")

            @JvmField val SIMILARITY = of("similarity")

            @JvmField val RETRIEVAL = of("retrieval")

            @JvmStatic fun of(value: String) = EmbedMode(JsonField.of(value))
        }

        /** An enum containing [EmbedMode]'s known values. */
        enum class Known {
            DEFAULT,
            CLASSIFICATION,
            CLUSTERING,
            SIMILARITY,
            RETRIEVAL,
        }

        /**
         * An enum containing [EmbedMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EmbedMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEFAULT,
            CLASSIFICATION,
            CLUSTERING,
            SIMILARITY,
            RETRIEVAL,
            /**
             * An enum member indicating that [EmbedMode] was instantiated with an unknown value.
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
                CLASSIFICATION -> Value.CLASSIFICATION
                CLUSTERING -> Value.CLUSTERING
                SIMILARITY -> Value.SIMILARITY
                RETRIEVAL -> Value.RETRIEVAL
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
                CLASSIFICATION -> Known.CLASSIFICATION
                CLUSTERING -> Known.CLUSTERING
                SIMILARITY -> Known.SIMILARITY
                RETRIEVAL -> Known.RETRIEVAL
                else -> throw LlamaCloudInvalidDataException("Unknown EmbedMode: $value")
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
        fun validate(): EmbedMode = apply {
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

            return other is EmbedMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VertexTextEmbedding &&
            clientEmail == other.clientEmail &&
            location == other.location &&
            privateKey == other.privateKey &&
            privateKeyId == other.privateKeyId &&
            project == other.project &&
            tokenUri == other.tokenUri &&
            additionalKwargs == other.additionalKwargs &&
            className == other.className &&
            embedBatchSize == other.embedBatchSize &&
            embedMode == other.embedMode &&
            modelName == other.modelName &&
            numWorkers == other.numWorkers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clientEmail,
            location,
            privateKey,
            privateKeyId,
            project,
            tokenUri,
            additionalKwargs,
            className,
            embedBatchSize,
            embedMode,
            modelName,
            numWorkers,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VertexTextEmbedding{clientEmail=$clientEmail, location=$location, privateKey=$privateKey, privateKeyId=$privateKeyId, project=$project, tokenUri=$tokenUri, additionalKwargs=$additionalKwargs, className=$className, embedBatchSize=$embedBatchSize, embedMode=$embedMode, modelName=$modelName, numWorkers=$numWorkers, additionalProperties=$additionalProperties}"
}
