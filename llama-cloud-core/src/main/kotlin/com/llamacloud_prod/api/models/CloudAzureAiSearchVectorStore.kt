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

/** Cloud Azure AI Search Vector Store. */
class CloudAzureAiSearchVectorStore
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val searchServiceApiKey: JsonField<String>,
    private val searchServiceEndpoint: JsonField<String>,
    private val className: JsonField<String>,
    private val clientId: JsonField<String>,
    private val clientSecret: JsonField<String>,
    private val embeddingDimension: JsonField<Long>,
    private val filterableMetadataFieldKeys: JsonField<FilterableMetadataFieldKeys>,
    private val indexName: JsonField<String>,
    private val searchServiceApiVersion: JsonField<String>,
    private val supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("search_service_api_key")
        @ExcludeMissing
        searchServiceApiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("search_service_endpoint")
        @ExcludeMissing
        searchServiceEndpoint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        embeddingDimension: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("filterable_metadata_field_keys")
        @ExcludeMissing
        filterableMetadataFieldKeys: JsonField<FilterableMetadataFieldKeys> = JsonMissing.of(),
        @JsonProperty("index_name") @ExcludeMissing indexName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("search_service_api_version")
        @ExcludeMissing
        searchServiceApiVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_nested_metadata_filters")
        @ExcludeMissing
        supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
    ) : this(
        searchServiceApiKey,
        searchServiceEndpoint,
        className,
        clientId,
        clientSecret,
        embeddingDimension,
        filterableMetadataFieldKeys,
        indexName,
        searchServiceApiVersion,
        supportsNestedMetadataFilters,
        tenantId,
        mutableMapOf(),
    )

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun searchServiceApiKey(): String = searchServiceApiKey.getRequired("search_service_api_key")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun searchServiceEndpoint(): String =
        searchServiceEndpoint.getRequired("search_service_endpoint")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientId(): Optional<String> = clientId.getOptional("client_id")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientSecret(): Optional<String> = clientSecret.getOptional("client_secret")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embeddingDimension(): Optional<Long> = embeddingDimension.getOptional("embedding_dimension")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filterableMetadataFieldKeys(): Optional<FilterableMetadataFieldKeys> =
        filterableMetadataFieldKeys.getOptional("filterable_metadata_field_keys")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indexName(): Optional<String> = indexName.getOptional("index_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchServiceApiVersion(): Optional<String> =
        searchServiceApiVersion.getOptional("search_service_api_version")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsNestedMetadataFilters(): Optional<SupportsNestedMetadataFilters> =
        supportsNestedMetadataFilters.getOptional("supports_nested_metadata_filters")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * Returns the raw JSON value of [searchServiceApiKey].
     *
     * Unlike [searchServiceApiKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("search_service_api_key")
    @ExcludeMissing
    fun _searchServiceApiKey(): JsonField<String> = searchServiceApiKey

    /**
     * Returns the raw JSON value of [searchServiceEndpoint].
     *
     * Unlike [searchServiceEndpoint], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("search_service_endpoint")
    @ExcludeMissing
    fun _searchServiceEndpoint(): JsonField<String> = searchServiceEndpoint

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [clientId].
     *
     * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

    /**
     * Returns the raw JSON value of [clientSecret].
     *
     * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_secret")
    @ExcludeMissing
    fun _clientSecret(): JsonField<String> = clientSecret

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
     * Returns the raw JSON value of [filterableMetadataFieldKeys].
     *
     * Unlike [filterableMetadataFieldKeys], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("filterable_metadata_field_keys")
    @ExcludeMissing
    fun _filterableMetadataFieldKeys(): JsonField<FilterableMetadataFieldKeys> =
        filterableMetadataFieldKeys

    /**
     * Returns the raw JSON value of [indexName].
     *
     * Unlike [indexName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index_name") @ExcludeMissing fun _indexName(): JsonField<String> = indexName

    /**
     * Returns the raw JSON value of [searchServiceApiVersion].
     *
     * Unlike [searchServiceApiVersion], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("search_service_api_version")
    @ExcludeMissing
    fun _searchServiceApiVersion(): JsonField<String> = searchServiceApiVersion

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

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

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
         * [CloudAzureAiSearchVectorStore].
         *
         * The following fields are required:
         * ```java
         * .searchServiceApiKey()
         * .searchServiceEndpoint()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudAzureAiSearchVectorStore]. */
    class Builder internal constructor() {

        private var searchServiceApiKey: JsonField<String>? = null
        private var searchServiceEndpoint: JsonField<String>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var clientId: JsonField<String> = JsonMissing.of()
        private var clientSecret: JsonField<String> = JsonMissing.of()
        private var embeddingDimension: JsonField<Long> = JsonMissing.of()
        private var filterableMetadataFieldKeys: JsonField<FilterableMetadataFieldKeys> =
            JsonMissing.of()
        private var indexName: JsonField<String> = JsonMissing.of()
        private var searchServiceApiVersion: JsonField<String> = JsonMissing.of()
        private var supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters> =
            JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudAzureAiSearchVectorStore: CloudAzureAiSearchVectorStore) = apply {
            searchServiceApiKey = cloudAzureAiSearchVectorStore.searchServiceApiKey
            searchServiceEndpoint = cloudAzureAiSearchVectorStore.searchServiceEndpoint
            className = cloudAzureAiSearchVectorStore.className
            clientId = cloudAzureAiSearchVectorStore.clientId
            clientSecret = cloudAzureAiSearchVectorStore.clientSecret
            embeddingDimension = cloudAzureAiSearchVectorStore.embeddingDimension
            filterableMetadataFieldKeys = cloudAzureAiSearchVectorStore.filterableMetadataFieldKeys
            indexName = cloudAzureAiSearchVectorStore.indexName
            searchServiceApiVersion = cloudAzureAiSearchVectorStore.searchServiceApiVersion
            supportsNestedMetadataFilters =
                cloudAzureAiSearchVectorStore.supportsNestedMetadataFilters
            tenantId = cloudAzureAiSearchVectorStore.tenantId
            additionalProperties = cloudAzureAiSearchVectorStore.additionalProperties.toMutableMap()
        }

        fun searchServiceApiKey(searchServiceApiKey: String) =
            searchServiceApiKey(JsonField.of(searchServiceApiKey))

        /**
         * Sets [Builder.searchServiceApiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchServiceApiKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun searchServiceApiKey(searchServiceApiKey: JsonField<String>) = apply {
            this.searchServiceApiKey = searchServiceApiKey
        }

        fun searchServiceEndpoint(searchServiceEndpoint: String) =
            searchServiceEndpoint(JsonField.of(searchServiceEndpoint))

        /**
         * Sets [Builder.searchServiceEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchServiceEndpoint] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun searchServiceEndpoint(searchServiceEndpoint: JsonField<String>) = apply {
            this.searchServiceEndpoint = searchServiceEndpoint
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

        fun clientId(clientId: String?) = clientId(JsonField.ofNullable(clientId))

        /** Alias for calling [Builder.clientId] with `clientId.orElse(null)`. */
        fun clientId(clientId: Optional<String>) = clientId(clientId.getOrNull())

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        fun clientSecret(clientSecret: String?) = clientSecret(JsonField.ofNullable(clientSecret))

        /** Alias for calling [Builder.clientSecret] with `clientSecret.orElse(null)`. */
        fun clientSecret(clientSecret: Optional<String>) = clientSecret(clientSecret.getOrNull())

        /**
         * Sets [Builder.clientSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientSecret(clientSecret: JsonField<String>) = apply {
            this.clientSecret = clientSecret
        }

        fun embeddingDimension(embeddingDimension: Long?) =
            embeddingDimension(JsonField.ofNullable(embeddingDimension))

        /**
         * Alias for [Builder.embeddingDimension].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun embeddingDimension(embeddingDimension: Long) =
            embeddingDimension(embeddingDimension as Long?)

        /**
         * Alias for calling [Builder.embeddingDimension] with `embeddingDimension.orElse(null)`.
         */
        fun embeddingDimension(embeddingDimension: Optional<Long>) =
            embeddingDimension(embeddingDimension.getOrNull())

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

        fun filterableMetadataFieldKeys(filterableMetadataFieldKeys: FilterableMetadataFieldKeys?) =
            filterableMetadataFieldKeys(JsonField.ofNullable(filterableMetadataFieldKeys))

        /**
         * Alias for calling [Builder.filterableMetadataFieldKeys] with
         * `filterableMetadataFieldKeys.orElse(null)`.
         */
        fun filterableMetadataFieldKeys(
            filterableMetadataFieldKeys: Optional<FilterableMetadataFieldKeys>
        ) = filterableMetadataFieldKeys(filterableMetadataFieldKeys.getOrNull())

        /**
         * Sets [Builder.filterableMetadataFieldKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterableMetadataFieldKeys] with a well-typed
         * [FilterableMetadataFieldKeys] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun filterableMetadataFieldKeys(
            filterableMetadataFieldKeys: JsonField<FilterableMetadataFieldKeys>
        ) = apply { this.filterableMetadataFieldKeys = filterableMetadataFieldKeys }

        fun indexName(indexName: String?) = indexName(JsonField.ofNullable(indexName))

        /** Alias for calling [Builder.indexName] with `indexName.orElse(null)`. */
        fun indexName(indexName: Optional<String>) = indexName(indexName.getOrNull())

        /**
         * Sets [Builder.indexName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun indexName(indexName: JsonField<String>) = apply { this.indexName = indexName }

        fun searchServiceApiVersion(searchServiceApiVersion: String?) =
            searchServiceApiVersion(JsonField.ofNullable(searchServiceApiVersion))

        /**
         * Alias for calling [Builder.searchServiceApiVersion] with
         * `searchServiceApiVersion.orElse(null)`.
         */
        fun searchServiceApiVersion(searchServiceApiVersion: Optional<String>) =
            searchServiceApiVersion(searchServiceApiVersion.getOrNull())

        /**
         * Sets [Builder.searchServiceApiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchServiceApiVersion] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun searchServiceApiVersion(searchServiceApiVersion: JsonField<String>) = apply {
            this.searchServiceApiVersion = searchServiceApiVersion
        }

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

        fun tenantId(tenantId: String?) = tenantId(JsonField.ofNullable(tenantId))

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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
         * Returns an immutable instance of [CloudAzureAiSearchVectorStore].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .searchServiceApiKey()
         * .searchServiceEndpoint()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudAzureAiSearchVectorStore =
            CloudAzureAiSearchVectorStore(
                checkRequired("searchServiceApiKey", searchServiceApiKey),
                checkRequired("searchServiceEndpoint", searchServiceEndpoint),
                className,
                clientId,
                clientSecret,
                embeddingDimension,
                filterableMetadataFieldKeys,
                indexName,
                searchServiceApiVersion,
                supportsNestedMetadataFilters,
                tenantId,
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
    fun validate(): CloudAzureAiSearchVectorStore = apply {
        if (validated) {
            return@apply
        }

        searchServiceApiKey()
        searchServiceEndpoint()
        className()
        clientId()
        clientSecret()
        embeddingDimension()
        filterableMetadataFieldKeys().ifPresent { it.validate() }
        indexName()
        searchServiceApiVersion()
        supportsNestedMetadataFilters().ifPresent { it.validate() }
        tenantId()
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
        (if (searchServiceApiKey.asKnown().isPresent) 1 else 0) +
            (if (searchServiceEndpoint.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (clientId.asKnown().isPresent) 1 else 0) +
            (if (clientSecret.asKnown().isPresent) 1 else 0) +
            (if (embeddingDimension.asKnown().isPresent) 1 else 0) +
            (filterableMetadataFieldKeys.asKnown().getOrNull()?.validity() ?: 0) +
            (if (indexName.asKnown().isPresent) 1 else 0) +
            (if (searchServiceApiVersion.asKnown().isPresent) 1 else 0) +
            (supportsNestedMetadataFilters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0)

    class FilterableMetadataFieldKeys
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
             * [FilterableMetadataFieldKeys].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FilterableMetadataFieldKeys]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filterableMetadataFieldKeys: FilterableMetadataFieldKeys) = apply {
                additionalProperties =
                    filterableMetadataFieldKeys.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [FilterableMetadataFieldKeys].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FilterableMetadataFieldKeys =
                FilterableMetadataFieldKeys(additionalProperties.toImmutable())
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
        fun validate(): FilterableMetadataFieldKeys = apply {
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

            return other is FilterableMetadataFieldKeys &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FilterableMetadataFieldKeys{additionalProperties=$additionalProperties}"
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

        return other is CloudAzureAiSearchVectorStore &&
            searchServiceApiKey == other.searchServiceApiKey &&
            searchServiceEndpoint == other.searchServiceEndpoint &&
            className == other.className &&
            clientId == other.clientId &&
            clientSecret == other.clientSecret &&
            embeddingDimension == other.embeddingDimension &&
            filterableMetadataFieldKeys == other.filterableMetadataFieldKeys &&
            indexName == other.indexName &&
            searchServiceApiVersion == other.searchServiceApiVersion &&
            supportsNestedMetadataFilters == other.supportsNestedMetadataFilters &&
            tenantId == other.tenantId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            searchServiceApiKey,
            searchServiceEndpoint,
            className,
            clientId,
            clientSecret,
            embeddingDimension,
            filterableMetadataFieldKeys,
            indexName,
            searchServiceApiVersion,
            supportsNestedMetadataFilters,
            tenantId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudAzureAiSearchVectorStore{searchServiceApiKey=$searchServiceApiKey, searchServiceEndpoint=$searchServiceEndpoint, className=$className, clientId=$clientId, clientSecret=$clientSecret, embeddingDimension=$embeddingDimension, filterableMetadataFieldKeys=$filterableMetadataFieldKeys, indexName=$indexName, searchServiceApiVersion=$searchServiceApiVersion, supportsNestedMetadataFilters=$supportsNestedMetadataFilters, tenantId=$tenantId, additionalProperties=$additionalProperties}"
}
