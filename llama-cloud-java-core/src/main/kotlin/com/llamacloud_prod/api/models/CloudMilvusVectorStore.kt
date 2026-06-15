// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/** Cloud Milvus Vector Store. */
class CloudMilvusVectorStore
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val uri: JsonField<String>,
    private val token: JsonField<String>,
    private val className: JsonField<String>,
    private val collectionName: JsonField<String>,
    private val embeddingDimension: JsonField<Long>,
    private val supportsNestedMetadataFilters: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collection_name")
        @ExcludeMissing
        collectionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        embeddingDimension: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("supports_nested_metadata_filters")
        @ExcludeMissing
        supportsNestedMetadataFilters: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        uri,
        token,
        className,
        collectionName,
        embeddingDimension,
        supportsNestedMetadataFilters,
        mutableMapOf(),
    )

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uri(): String = uri.getRequired("uri")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = token.getOptional("token")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun collectionName(): Optional<String> = collectionName.getOptional("collection_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embeddingDimension(): Optional<Long> = embeddingDimension.getOptional("embedding_dimension")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsNestedMetadataFilters(): Optional<Boolean> =
        supportsNestedMetadataFilters.getOptional("supports_nested_metadata_filters")

    /**
     * Returns the raw JSON value of [uri].
     *
     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

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
     * Returns the raw JSON value of [supportsNestedMetadataFilters].
     *
     * Unlike [supportsNestedMetadataFilters], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("supports_nested_metadata_filters")
    @ExcludeMissing
    fun _supportsNestedMetadataFilters(): JsonField<Boolean> = supportsNestedMetadataFilters

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
         * Returns a mutable builder for constructing an instance of [CloudMilvusVectorStore].
         *
         * The following fields are required:
         * ```java
         * .uri()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudMilvusVectorStore]. */
    class Builder internal constructor() {

        private var uri: JsonField<String>? = null
        private var token: JsonField<String> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var collectionName: JsonField<String> = JsonMissing.of()
        private var embeddingDimension: JsonField<Long> = JsonMissing.of()
        private var supportsNestedMetadataFilters: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudMilvusVectorStore: CloudMilvusVectorStore) = apply {
            uri = cloudMilvusVectorStore.uri
            token = cloudMilvusVectorStore.token
            className = cloudMilvusVectorStore.className
            collectionName = cloudMilvusVectorStore.collectionName
            embeddingDimension = cloudMilvusVectorStore.embeddingDimension
            supportsNestedMetadataFilters = cloudMilvusVectorStore.supportsNestedMetadataFilters
            additionalProperties = cloudMilvusVectorStore.additionalProperties.toMutableMap()
        }

        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

        fun token(token: String?) = token(JsonField.ofNullable(token))

        /** Alias for calling [Builder.token] with `token.orElse(null)`. */
        fun token(token: Optional<String>) = token(token.getOrNull())

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        fun collectionName(collectionName: String?) =
            collectionName(JsonField.ofNullable(collectionName))

        /** Alias for calling [Builder.collectionName] with `collectionName.orElse(null)`. */
        fun collectionName(collectionName: Optional<String>) =
            collectionName(collectionName.getOrNull())

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

        fun supportsNestedMetadataFilters(supportsNestedMetadataFilters: Boolean) =
            supportsNestedMetadataFilters(JsonField.of(supportsNestedMetadataFilters))

        /**
         * Sets [Builder.supportsNestedMetadataFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportsNestedMetadataFilters] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun supportsNestedMetadataFilters(supportsNestedMetadataFilters: JsonField<Boolean>) =
            apply {
                this.supportsNestedMetadataFilters = supportsNestedMetadataFilters
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
         * Returns an immutable instance of [CloudMilvusVectorStore].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .uri()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudMilvusVectorStore =
            CloudMilvusVectorStore(
                checkRequired("uri", uri),
                token,
                className,
                collectionName,
                embeddingDimension,
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
    fun validate(): CloudMilvusVectorStore = apply {
        if (validated) {
            return@apply
        }

        uri()
        token()
        className()
        collectionName()
        embeddingDimension()
        supportsNestedMetadataFilters()
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
        (if (uri.asKnown().isPresent) 1 else 0) +
            (if (token.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (collectionName.asKnown().isPresent) 1 else 0) +
            (if (embeddingDimension.asKnown().isPresent) 1 else 0) +
            (if (supportsNestedMetadataFilters.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudMilvusVectorStore &&
            uri == other.uri &&
            token == other.token &&
            className == other.className &&
            collectionName == other.collectionName &&
            embeddingDimension == other.embeddingDimension &&
            supportsNestedMetadataFilters == other.supportsNestedMetadataFilters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            uri,
            token,
            className,
            collectionName,
            embeddingDimension,
            supportsNestedMetadataFilters,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudMilvusVectorStore{uri=$uri, token=$token, className=$className, collectionName=$collectionName, embeddingDimension=$embeddingDimension, supportsNestedMetadataFilters=$supportsNestedMetadataFilters, additionalProperties=$additionalProperties}"
}
