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
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Cloud AstraDB Vector Store.
 *
 * This class is used to store the configuration for an AstraDB vector store, so that it can be
 * created and used in LlamaCloud.
 *
 * Args: token (str): The Astra DB Application Token to use. api_endpoint (str): The Astra DB JSON
 * API endpoint for your database. collection_name (str): Collection name to use. If not existing,
 * it will be created. embedding_dimension (int): Length of the embedding vectors in use. keyspace
 * (optional[str]): The keyspace to use. If not provided, 'default_keyspace'
 */
class CloudAstraDbVectorStore
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val apiEndpoint: JsonField<String>,
    private val collectionName: JsonField<String>,
    private val embeddingDimension: JsonField<Long>,
    private val className: JsonField<String>,
    private val keyspace: JsonField<String>,
    private val supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_endpoint")
        @ExcludeMissing
        apiEndpoint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collection_name")
        @ExcludeMissing
        collectionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        embeddingDimension: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("keyspace") @ExcludeMissing keyspace: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_nested_metadata_filters")
        @ExcludeMissing
        supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters> = JsonMissing.of(),
    ) : this(
        token,
        apiEndpoint,
        collectionName,
        embeddingDimension,
        className,
        keyspace,
        supportsNestedMetadataFilters,
        mutableMapOf(),
    )

    /**
     * The Astra DB Application Token to use
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * The Astra DB JSON API endpoint for your database
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiEndpoint(): String = apiEndpoint.getRequired("api_endpoint")

    /**
     * Collection name to use. If not existing, it will be created
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionName(): String = collectionName.getRequired("collection_name")

    /**
     * Length of the embedding vectors in use
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embeddingDimension(): Long = embeddingDimension.getRequired("embedding_dimension")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The keyspace to use. If not provided, 'default_keyspace'
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyspace(): Optional<String> = keyspace.getOptional("keyspace")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsNestedMetadataFilters(): Optional<SupportsNestedMetadataFilters> =
        supportsNestedMetadataFilters.getOptional("supports_nested_metadata_filters")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [apiEndpoint].
     *
     * Unlike [apiEndpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_endpoint")
    @ExcludeMissing
    fun _apiEndpoint(): JsonField<String> = apiEndpoint

    /**
     * Returns the raw JSON value of [collectionName].
     *
     * Unlike [collectionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collection_name")
    @ExcludeMissing
    fun _collectionName(): JsonField<String> = collectionName

    /**
     * Returns the raw JSON value of [embeddingDimension].
     *
     * Unlike [embeddingDimension], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("embedding_dimension")
    @ExcludeMissing
    fun _embeddingDimension(): JsonField<Long> = embeddingDimension

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [keyspace].
     *
     * Unlike [keyspace], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keyspace") @ExcludeMissing fun _keyspace(): JsonField<String> = keyspace

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
         * Returns a mutable builder for constructing an instance of [CloudAstraDbVectorStore].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .apiEndpoint()
         * .collectionName()
         * .embeddingDimension()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudAstraDbVectorStore]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var apiEndpoint: JsonField<String>? = null
        private var collectionName: JsonField<String>? = null
        private var embeddingDimension: JsonField<Long>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var keyspace: JsonField<String> = JsonMissing.of()
        private var supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudAstraDbVectorStore: CloudAstraDbVectorStore) = apply {
            token = cloudAstraDbVectorStore.token
            apiEndpoint = cloudAstraDbVectorStore.apiEndpoint
            collectionName = cloudAstraDbVectorStore.collectionName
            embeddingDimension = cloudAstraDbVectorStore.embeddingDimension
            className = cloudAstraDbVectorStore.className
            keyspace = cloudAstraDbVectorStore.keyspace
            supportsNestedMetadataFilters = cloudAstraDbVectorStore.supportsNestedMetadataFilters
            additionalProperties = cloudAstraDbVectorStore.additionalProperties.toMutableMap()
        }

        /** The Astra DB Application Token to use */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The Astra DB JSON API endpoint for your database */
        fun apiEndpoint(apiEndpoint: String) = apiEndpoint(JsonField.of(apiEndpoint))

        /**
         * Sets [Builder.apiEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiEndpoint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiEndpoint(apiEndpoint: JsonField<String>) = apply { this.apiEndpoint = apiEndpoint }

        /** Collection name to use. If not existing, it will be created */
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

        /** Length of the embedding vectors in use */
        fun embeddingDimension(embeddingDimension: Long) =
            embeddingDimension(JsonField.of(embeddingDimension))

        /**
         * Sets [Builder.embeddingDimension] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingDimension] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddingDimension(embeddingDimension: JsonField<Long>) = apply {
            this.embeddingDimension = embeddingDimension
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

        /** The keyspace to use. If not provided, 'default_keyspace' */
        fun keyspace(keyspace: String?) = keyspace(JsonField.ofNullable(keyspace))

        /** Alias for calling [Builder.keyspace] with `keyspace.orElse(null)`. */
        fun keyspace(keyspace: Optional<String>) = keyspace(keyspace.getOrNull())

        /**
         * Sets [Builder.keyspace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyspace] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keyspace(keyspace: JsonField<String>) = apply { this.keyspace = keyspace }

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
         * Returns an immutable instance of [CloudAstraDbVectorStore].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .apiEndpoint()
         * .collectionName()
         * .embeddingDimension()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudAstraDbVectorStore =
            CloudAstraDbVectorStore(
                checkRequired("token", token),
                checkRequired("apiEndpoint", apiEndpoint),
                checkRequired("collectionName", collectionName),
                checkRequired("embeddingDimension", embeddingDimension),
                className,
                keyspace,
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
    fun validate(): CloudAstraDbVectorStore = apply {
        if (validated) {
            return@apply
        }

        token()
        apiEndpoint()
        collectionName()
        embeddingDimension()
        className()
        keyspace()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (apiEndpoint.asKnown().isPresent) 1 else 0) +
            (if (collectionName.asKnown().isPresent) 1 else 0) +
            (if (embeddingDimension.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (keyspace.asKnown().isPresent) 1 else 0) +
            (supportsNestedMetadataFilters.asKnown().getOrNull()?.validity() ?: 0)

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

        return other is CloudAstraDbVectorStore &&
            token == other.token &&
            apiEndpoint == other.apiEndpoint &&
            collectionName == other.collectionName &&
            embeddingDimension == other.embeddingDimension &&
            className == other.className &&
            keyspace == other.keyspace &&
            supportsNestedMetadataFilters == other.supportsNestedMetadataFilters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            apiEndpoint,
            collectionName,
            embeddingDimension,
            className,
            keyspace,
            supportsNestedMetadataFilters,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudAstraDbVectorStore{token=$token, apiEndpoint=$apiEndpoint, collectionName=$collectionName, embeddingDimension=$embeddingDimension, className=$className, keyspace=$keyspace, supportsNestedMetadataFilters=$supportsNestedMetadataFilters, additionalProperties=$additionalProperties}"
}
