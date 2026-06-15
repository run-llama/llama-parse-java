// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

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

/**
 * Cloud Qdrant Vector Store.
 *
 * This class is used to store the configuration for a Qdrant vector store, so that it can be
 * created and used in LlamaCloud.
 *
 * Args: collection_name (str): name of the Qdrant collection url (str): url of the Qdrant instance
 * api_key (str): API key for authenticating with Qdrant max_retries (int): maximum number of
 * retries in case of a failure. Defaults to 3 client_kwargs (dict): additional kwargs to pass to
 * the Qdrant client
 */
class CloudQdrantVectorStore
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKey: JsonField<String>,
    private val collectionName: JsonField<String>,
    private val url: JsonField<String>,
    private val className: JsonField<String>,
    private val clientKwargs: JsonField<ClientKwargs>,
    private val maxRetries: JsonField<Long>,
    private val supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collection_name")
        @ExcludeMissing
        collectionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_kwargs")
        @ExcludeMissing
        clientKwargs: JsonField<ClientKwargs> = JsonMissing.of(),
        @JsonProperty("max_retries") @ExcludeMissing maxRetries: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("supports_nested_metadata_filters")
        @ExcludeMissing
        supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters> = JsonMissing.of(),
    ) : this(
        apiKey,
        collectionName,
        url,
        className,
        clientKwargs,
        maxRetries,
        supportsNestedMetadataFilters,
        mutableMapOf(),
    )

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiKey(): String = apiKey.getRequired("api_key")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionName(): String = collectionName.getRequired("collection_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientKwargs(): Optional<ClientKwargs> = clientKwargs.getOptional("client_kwargs")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxRetries(): Optional<Long> = maxRetries.getOptional("max_retries")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsNestedMetadataFilters(): Optional<SupportsNestedMetadataFilters> =
        supportsNestedMetadataFilters.getOptional("supports_nested_metadata_filters")

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /**
     * Returns the raw JSON value of [collectionName].
     *
     * Unlike [collectionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collection_name")
    @ExcludeMissing
    fun _collectionName(): JsonField<String> = collectionName

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [clientKwargs].
     *
     * Unlike [clientKwargs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_kwargs")
    @ExcludeMissing
    fun _clientKwargs(): JsonField<ClientKwargs> = clientKwargs

    /**
     * Returns the raw JSON value of [maxRetries].
     *
     * Unlike [maxRetries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_retries") @ExcludeMissing fun _maxRetries(): JsonField<Long> = maxRetries

    /**
     * Returns the raw JSON value of [supportsNestedMetadataFilters].
     *
     * Unlike [supportsNestedMetadataFilters], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("supports_nested_metadata_filters")
    @ExcludeMissing
    fun _supportsNestedMetadataFilters(): JsonField<SupportsNestedMetadataFilters> =
        supportsNestedMetadataFilters

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
         * Returns a mutable builder for constructing an instance of [CloudQdrantVectorStore].
         *
         * The following fields are required:
         * ```java
         * .apiKey()
         * .collectionName()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudQdrantVectorStore]. */
    class Builder internal constructor() {

        private var apiKey: JsonField<String>? = null
        private var collectionName: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var clientKwargs: JsonField<ClientKwargs> = JsonMissing.of()
        private var maxRetries: JsonField<Long> = JsonMissing.of()
        private var supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudQdrantVectorStore: CloudQdrantVectorStore) = apply {
            apiKey = cloudQdrantVectorStore.apiKey
            collectionName = cloudQdrantVectorStore.collectionName
            url = cloudQdrantVectorStore.url
            className = cloudQdrantVectorStore.className
            clientKwargs = cloudQdrantVectorStore.clientKwargs
            maxRetries = cloudQdrantVectorStore.maxRetries
            supportsNestedMetadataFilters = cloudQdrantVectorStore.supportsNestedMetadataFilters
            additionalProperties = cloudQdrantVectorStore.additionalProperties.toMutableMap()
        }

        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        fun collectionName(collectionName: String) = collectionName(JsonField.of(collectionName))

        /**
         * Sets [Builder.collectionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collectionName(collectionName: JsonField<String>) = apply {
            this.collectionName = collectionName
        }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        fun clientKwargs(clientKwargs: ClientKwargs) = clientKwargs(JsonField.of(clientKwargs))

        /**
         * Sets [Builder.clientKwargs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientKwargs] with a well-typed [ClientKwargs] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientKwargs(clientKwargs: JsonField<ClientKwargs>) = apply {
            this.clientKwargs = clientKwargs
        }

        fun maxRetries(maxRetries: Long) = maxRetries(JsonField.of(maxRetries))

        /**
         * Sets [Builder.maxRetries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRetries] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxRetries(maxRetries: JsonField<Long>) = apply { this.maxRetries = maxRetries }

        fun supportsNestedMetadataFilters(
            supportsNestedMetadataFilters: SupportsNestedMetadataFilters
        ) = supportsNestedMetadataFilters(JsonField.of(supportsNestedMetadataFilters))

        /**
         * Sets [Builder.supportsNestedMetadataFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportsNestedMetadataFilters] with a well-typed
         * [SupportsNestedMetadataFilters] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun supportsNestedMetadataFilters(
            supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters>
        ) = apply { this.supportsNestedMetadataFilters = supportsNestedMetadataFilters }

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
         * Returns an immutable instance of [CloudQdrantVectorStore].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .apiKey()
         * .collectionName()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudQdrantVectorStore =
            CloudQdrantVectorStore(
                checkRequired("apiKey", apiKey),
                checkRequired("collectionName", collectionName),
                checkRequired("url", url),
                className,
                clientKwargs,
                maxRetries,
                supportsNestedMetadataFilters,
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
    fun validate(): CloudQdrantVectorStore = apply {
        if (validated) {
            return@apply
        }

        apiKey()
        collectionName()
        url()
        className()
        clientKwargs().ifPresent { it.validate() }
        maxRetries()
        supportsNestedMetadataFilters().ifPresent { it.validate() }
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
            (if (collectionName.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (clientKwargs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maxRetries.asKnown().isPresent) 1 else 0) +
            (supportsNestedMetadataFilters.asKnown().getOrNull()?.validity() ?: 0)

    class ClientKwargs
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

            /** Returns a mutable builder for constructing an instance of [ClientKwargs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ClientKwargs]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(clientKwargs: ClientKwargs) = apply {
                additionalProperties = clientKwargs.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ClientKwargs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ClientKwargs = ClientKwargs(additionalProperties.toImmutable())
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
        fun validate(): ClientKwargs = apply {
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

            return other is ClientKwargs && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ClientKwargs{additionalProperties=$additionalProperties}"
    }

    class SupportsNestedMetadataFilters
    @JsonCreator
    private constructor(private val value: JsonField<Boolean>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            @JvmField val TRUE = of(true)

            @JvmStatic fun of(value: Boolean) = SupportsNestedMetadataFilters(JsonField.of(value))
        }

        /** An enum containing [SupportsNestedMetadataFilters]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [SupportsNestedMetadataFilters]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [SupportsNestedMetadataFilters] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [SupportsNestedMetadataFilters] was instantiated with
             * an unknown value.
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
                TRUE -> Value.TRUE
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
                TRUE -> Known.TRUE
                else ->
                    throw LlamaCloudInvalidDataException(
                        "Unknown SupportsNestedMetadataFilters: $value"
                    )
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean().orElseThrow {
                LlamaCloudInvalidDataException("Value is not a Boolean")
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
        fun validate(): SupportsNestedMetadataFilters = apply {
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

            return other is SupportsNestedMetadataFilters && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudQdrantVectorStore &&
            apiKey == other.apiKey &&
            collectionName == other.collectionName &&
            url == other.url &&
            className == other.className &&
            clientKwargs == other.clientKwargs &&
            maxRetries == other.maxRetries &&
            supportsNestedMetadataFilters == other.supportsNestedMetadataFilters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKey,
            collectionName,
            url,
            className,
            clientKwargs,
            maxRetries,
            supportsNestedMetadataFilters,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudQdrantVectorStore{apiKey=$apiKey, collectionName=$collectionName, url=$url, className=$className, clientKwargs=$clientKwargs, maxRetries=$maxRetries, supportsNestedMetadataFilters=$supportsNestedMetadataFilters, additionalProperties=$additionalProperties}"
}
