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

/**
 * Cloud MongoDB Atlas Vector Store.
 *
 * This class is used to store the configuration for a MongoDB Atlas vector store, so that it can be
 * created and used in LlamaCloud.
 *
 * Args: mongodb_uri (str): URI for connecting to MongoDB Atlas db_name (str): name of the MongoDB
 * database collection_name (str): name of the MongoDB collection vector_index_name (str): name of
 * the MongoDB Atlas vector index fulltext_index_name (str): name of the MongoDB Atlas full-text
 * index
 */
class CloudMongoDBAtlasVectorSearch
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val collectionName: JsonField<String>,
    private val dbName: JsonField<String>,
    private val mongoDBUri: JsonField<String>,
    private val className: JsonField<String>,
    private val embeddingDimension: JsonField<Long>,
    private val fulltextIndexName: JsonField<String>,
    private val supportsNestedMetadataFilters: JsonField<Boolean>,
    private val vectorIndexName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("collection_name")
        @ExcludeMissing
        collectionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("db_name") @ExcludeMissing dbName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mongodb_uri")
        @ExcludeMissing
        mongoDBUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        embeddingDimension: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fulltext_index_name")
        @ExcludeMissing
        fulltextIndexName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_nested_metadata_filters")
        @ExcludeMissing
        supportsNestedMetadataFilters: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("vector_index_name")
        @ExcludeMissing
        vectorIndexName: JsonField<String> = JsonMissing.of(),
    ) : this(
        collectionName,
        dbName,
        mongoDBUri,
        className,
        embeddingDimension,
        fulltextIndexName,
        supportsNestedMetadataFilters,
        vectorIndexName,
        mutableMapOf(),
    )

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionName(): String = collectionName.getRequired("collection_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dbName(): String = dbName.getRequired("db_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mongoDBUri(): String = mongoDBUri.getRequired("mongodb_uri")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embeddingDimension(): Optional<Long> = embeddingDimension.getOptional("embedding_dimension")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fulltextIndexName(): Optional<String> = fulltextIndexName.getOptional("fulltext_index_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsNestedMetadataFilters(): Optional<Boolean> =
        supportsNestedMetadataFilters.getOptional("supports_nested_metadata_filters")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vectorIndexName(): Optional<String> = vectorIndexName.getOptional("vector_index_name")

    /**
     * Returns the raw JSON value of [collectionName].
     *
     * Unlike [collectionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collection_name")
    @ExcludeMissing
    fun _collectionName(): JsonField<String> = collectionName

    /**
     * Returns the raw JSON value of [dbName].
     *
     * Unlike [dbName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("db_name") @ExcludeMissing fun _dbName(): JsonField<String> = dbName

    /**
     * Returns the raw JSON value of [mongoDBUri].
     *
     * Unlike [mongoDBUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mongodb_uri") @ExcludeMissing fun _mongoDBUri(): JsonField<String> = mongoDBUri

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

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
     * Returns the raw JSON value of [fulltextIndexName].
     *
     * Unlike [fulltextIndexName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fulltext_index_name")
    @ExcludeMissing
    fun _fulltextIndexName(): JsonField<String> = fulltextIndexName

    /**
     * Returns the raw JSON value of [supportsNestedMetadataFilters].
     *
     * Unlike [supportsNestedMetadataFilters], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("supports_nested_metadata_filters")
    @ExcludeMissing
    fun _supportsNestedMetadataFilters(): JsonField<Boolean> = supportsNestedMetadataFilters

    /**
     * Returns the raw JSON value of [vectorIndexName].
     *
     * Unlike [vectorIndexName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vector_index_name")
    @ExcludeMissing
    fun _vectorIndexName(): JsonField<String> = vectorIndexName

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
         * [CloudMongoDBAtlasVectorSearch].
         *
         * The following fields are required:
         * ```java
         * .collectionName()
         * .dbName()
         * .mongoDBUri()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudMongoDBAtlasVectorSearch]. */
    class Builder internal constructor() {

        private var collectionName: JsonField<String>? = null
        private var dbName: JsonField<String>? = null
        private var mongoDBUri: JsonField<String>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var embeddingDimension: JsonField<Long> = JsonMissing.of()
        private var fulltextIndexName: JsonField<String> = JsonMissing.of()
        private var supportsNestedMetadataFilters: JsonField<Boolean> = JsonMissing.of()
        private var vectorIndexName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudMongoDBAtlasVectorSearch: CloudMongoDBAtlasVectorSearch) = apply {
            collectionName = cloudMongoDBAtlasVectorSearch.collectionName
            dbName = cloudMongoDBAtlasVectorSearch.dbName
            mongoDBUri = cloudMongoDBAtlasVectorSearch.mongoDBUri
            className = cloudMongoDBAtlasVectorSearch.className
            embeddingDimension = cloudMongoDBAtlasVectorSearch.embeddingDimension
            fulltextIndexName = cloudMongoDBAtlasVectorSearch.fulltextIndexName
            supportsNestedMetadataFilters =
                cloudMongoDBAtlasVectorSearch.supportsNestedMetadataFilters
            vectorIndexName = cloudMongoDBAtlasVectorSearch.vectorIndexName
            additionalProperties = cloudMongoDBAtlasVectorSearch.additionalProperties.toMutableMap()
        }

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

        fun dbName(dbName: String) = dbName(JsonField.of(dbName))

        /**
         * Sets [Builder.dbName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dbName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dbName(dbName: JsonField<String>) = apply { this.dbName = dbName }

        fun mongoDBUri(mongoDBUri: String) = mongoDBUri(JsonField.of(mongoDBUri))

        /**
         * Sets [Builder.mongoDBUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mongoDBUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mongoDBUri(mongoDBUri: JsonField<String>) = apply { this.mongoDBUri = mongoDBUri }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

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

        fun fulltextIndexName(fulltextIndexName: String?) =
            fulltextIndexName(JsonField.ofNullable(fulltextIndexName))

        /** Alias for calling [Builder.fulltextIndexName] with `fulltextIndexName.orElse(null)`. */
        fun fulltextIndexName(fulltextIndexName: Optional<String>) =
            fulltextIndexName(fulltextIndexName.getOrNull())

        /**
         * Sets [Builder.fulltextIndexName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulltextIndexName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fulltextIndexName(fulltextIndexName: JsonField<String>) = apply {
            this.fulltextIndexName = fulltextIndexName
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

        fun vectorIndexName(vectorIndexName: String?) =
            vectorIndexName(JsonField.ofNullable(vectorIndexName))

        /** Alias for calling [Builder.vectorIndexName] with `vectorIndexName.orElse(null)`. */
        fun vectorIndexName(vectorIndexName: Optional<String>) =
            vectorIndexName(vectorIndexName.getOrNull())

        /**
         * Sets [Builder.vectorIndexName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorIndexName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vectorIndexName(vectorIndexName: JsonField<String>) = apply {
            this.vectorIndexName = vectorIndexName
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
         * Returns an immutable instance of [CloudMongoDBAtlasVectorSearch].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .collectionName()
         * .dbName()
         * .mongoDBUri()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudMongoDBAtlasVectorSearch =
            CloudMongoDBAtlasVectorSearch(
                checkRequired("collectionName", collectionName),
                checkRequired("dbName", dbName),
                checkRequired("mongoDBUri", mongoDBUri),
                className,
                embeddingDimension,
                fulltextIndexName,
                supportsNestedMetadataFilters,
                vectorIndexName,
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
    fun validate(): CloudMongoDBAtlasVectorSearch = apply {
        if (validated) {
            return@apply
        }

        collectionName()
        dbName()
        mongoDBUri()
        className()
        embeddingDimension()
        fulltextIndexName()
        supportsNestedMetadataFilters()
        vectorIndexName()
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
        (if (collectionName.asKnown().isPresent) 1 else 0) +
            (if (dbName.asKnown().isPresent) 1 else 0) +
            (if (mongoDBUri.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (embeddingDimension.asKnown().isPresent) 1 else 0) +
            (if (fulltextIndexName.asKnown().isPresent) 1 else 0) +
            (if (supportsNestedMetadataFilters.asKnown().isPresent) 1 else 0) +
            (if (vectorIndexName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudMongoDBAtlasVectorSearch &&
            collectionName == other.collectionName &&
            dbName == other.dbName &&
            mongoDBUri == other.mongoDBUri &&
            className == other.className &&
            embeddingDimension == other.embeddingDimension &&
            fulltextIndexName == other.fulltextIndexName &&
            supportsNestedMetadataFilters == other.supportsNestedMetadataFilters &&
            vectorIndexName == other.vectorIndexName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            collectionName,
            dbName,
            mongoDBUri,
            className,
            embeddingDimension,
            fulltextIndexName,
            supportsNestedMetadataFilters,
            vectorIndexName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudMongoDBAtlasVectorSearch{collectionName=$collectionName, dbName=$dbName, mongoDBUri=$mongoDBUri, className=$className, embeddingDimension=$embeddingDimension, fulltextIndexName=$fulltextIndexName, supportsNestedMetadataFilters=$supportsNestedMetadataFilters, vectorIndexName=$vectorIndexName, additionalProperties=$additionalProperties}"
}
