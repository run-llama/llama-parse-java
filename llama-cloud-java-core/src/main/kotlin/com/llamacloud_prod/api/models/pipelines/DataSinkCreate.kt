// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

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
import com.llamacloud_prod.api.core.BaseDeserializer
import com.llamacloud_prod.api.core.BaseSerializer
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.allMaxBy
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.getOrThrow
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import com.llamacloud_prod.api.models.CloudAstraDbVectorStore
import com.llamacloud_prod.api.models.CloudAzureAiSearchVectorStore
import com.llamacloud_prod.api.models.CloudMilvusVectorStore
import com.llamacloud_prod.api.models.CloudMongoDBAtlasVectorSearch
import com.llamacloud_prod.api.models.CloudPineconeVectorStore
import com.llamacloud_prod.api.models.CloudPostgresVectorStore
import com.llamacloud_prod.api.models.CloudQdrantVectorStore
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema for creating a data sink. */
class DataSinkCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val component: JsonField<Component>,
    private val name: JsonField<String>,
    private val sinkType: JsonField<SinkType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("component")
        @ExcludeMissing
        component: JsonField<Component> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sink_type") @ExcludeMissing sinkType: JsonField<SinkType> = JsonMissing.of(),
    ) : this(component, name, sinkType, mutableMapOf())

    /**
     * Component that implements the data sink
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun component(): Component = component.getRequired("component")

    /**
     * The name of the data sink.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sinkType(): SinkType = sinkType.getRequired("sink_type")

    /**
     * Returns the raw JSON value of [component].
     *
     * Unlike [component], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("component") @ExcludeMissing fun _component(): JsonField<Component> = component

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [sinkType].
     *
     * Unlike [sinkType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sink_type") @ExcludeMissing fun _sinkType(): JsonField<SinkType> = sinkType

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
         * Returns a mutable builder for constructing an instance of [DataSinkCreate].
         *
         * The following fields are required:
         * ```java
         * .component()
         * .name()
         * .sinkType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataSinkCreate]. */
    class Builder internal constructor() {

        private var component: JsonField<Component>? = null
        private var name: JsonField<String>? = null
        private var sinkType: JsonField<SinkType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataSinkCreate: DataSinkCreate) = apply {
            component = dataSinkCreate.component
            name = dataSinkCreate.name
            sinkType = dataSinkCreate.sinkType
            additionalProperties = dataSinkCreate.additionalProperties.toMutableMap()
        }

        /** Component that implements the data sink */
        fun component(component: Component) = component(JsonField.of(component))

        /**
         * Sets [Builder.component] to an arbitrary JSON value.
         *
         * You should usually call [Builder.component] with a well-typed [Component] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun component(component: JsonField<Component>) = apply { this.component = component }

        /** Alias for calling [component] with `Component.ofUnionMember0(unionMember0)`. */
        fun component(unionMember0: Component.UnionMember0) =
            component(Component.ofUnionMember0(unionMember0))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudPineconeVectorStore(cloudPineconeVectorStore)`.
         */
        fun component(cloudPineconeVectorStore: CloudPineconeVectorStore) =
            component(Component.ofCloudPineconeVectorStore(cloudPineconeVectorStore))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudPostgresVectorStore(cloudPostgresVectorStore)`.
         */
        fun component(cloudPostgresVectorStore: CloudPostgresVectorStore) =
            component(Component.ofCloudPostgresVectorStore(cloudPostgresVectorStore))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudQdrantVectorStore(cloudQdrantVectorStore)`.
         */
        fun component(cloudQdrantVectorStore: CloudQdrantVectorStore) =
            component(Component.ofCloudQdrantVectorStore(cloudQdrantVectorStore))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudAzureAiSearchVectorStore(cloudAzureAiSearchVectorStore)`.
         */
        fun component(cloudAzureAiSearchVectorStore: CloudAzureAiSearchVectorStore) =
            component(Component.ofCloudAzureAiSearchVectorStore(cloudAzureAiSearchVectorStore))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudMongoDBAtlasVectorSearch(cloudMongoDBAtlasVectorSearch)`.
         */
        fun component(cloudMongoDBAtlasVectorSearch: CloudMongoDBAtlasVectorSearch) =
            component(Component.ofCloudMongoDBAtlasVectorSearch(cloudMongoDBAtlasVectorSearch))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudMilvusVectorStore(cloudMilvusVectorStore)`.
         */
        fun component(cloudMilvusVectorStore: CloudMilvusVectorStore) =
            component(Component.ofCloudMilvusVectorStore(cloudMilvusVectorStore))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudAstraDbVectorStore(cloudAstraDbVectorStore)`.
         */
        fun component(cloudAstraDbVectorStore: CloudAstraDbVectorStore) =
            component(Component.ofCloudAstraDbVectorStore(cloudAstraDbVectorStore))

        /** The name of the data sink. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun sinkType(sinkType: SinkType) = sinkType(JsonField.of(sinkType))

        /**
         * Sets [Builder.sinkType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sinkType] with a well-typed [SinkType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sinkType(sinkType: JsonField<SinkType>) = apply { this.sinkType = sinkType }

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
         * Returns an immutable instance of [DataSinkCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .component()
         * .name()
         * .sinkType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataSinkCreate =
            DataSinkCreate(
                checkRequired("component", component),
                checkRequired("name", name),
                checkRequired("sinkType", sinkType),
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
    fun validate(): DataSinkCreate = apply {
        if (validated) {
            return@apply
        }

        component().validate()
        name()
        sinkType().validate()
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
        (component.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (sinkType.asKnown().getOrNull()?.validity() ?: 0)

    /** Component that implements the data sink */
    @JsonDeserialize(using = Component.Deserializer::class)
    @JsonSerialize(using = Component.Serializer::class)
    class Component
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val cloudPineconeVectorStore: CloudPineconeVectorStore? = null,
        private val cloudPostgresVectorStore: CloudPostgresVectorStore? = null,
        private val cloudQdrantVectorStore: CloudQdrantVectorStore? = null,
        private val cloudAzureAiSearchVectorStore: CloudAzureAiSearchVectorStore? = null,
        private val cloudMongoDBAtlasVectorSearch: CloudMongoDBAtlasVectorSearch? = null,
        private val cloudMilvusVectorStore: CloudMilvusVectorStore? = null,
        private val cloudAstraDbVectorStore: CloudAstraDbVectorStore? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        /**
         * Cloud Pinecone Vector Store.
         *
         * This class is used to store the configuration for a Pinecone vector store, so that it can
         * be created and used in LlamaCloud.
         *
         * Args: api_key (str): API key for authenticating with Pinecone index_name (str): name of
         * the Pinecone index namespace (optional[str]): namespace to use in the Pinecone index
         * insert_kwargs (optional[dict]): additional kwargs to pass during insertion
         */
        fun cloudPineconeVectorStore(): Optional<CloudPineconeVectorStore> =
            Optional.ofNullable(cloudPineconeVectorStore)

        fun cloudPostgresVectorStore(): Optional<CloudPostgresVectorStore> =
            Optional.ofNullable(cloudPostgresVectorStore)

        /**
         * Cloud Qdrant Vector Store.
         *
         * This class is used to store the configuration for a Qdrant vector store, so that it can
         * be created and used in LlamaCloud.
         *
         * Args: collection_name (str): name of the Qdrant collection url (str): url of the Qdrant
         * instance api_key (str): API key for authenticating with Qdrant max_retries (int): maximum
         * number of retries in case of a failure. Defaults to 3 client_kwargs (dict): additional
         * kwargs to pass to the Qdrant client
         */
        fun cloudQdrantVectorStore(): Optional<CloudQdrantVectorStore> =
            Optional.ofNullable(cloudQdrantVectorStore)

        /** Cloud Azure AI Search Vector Store. */
        fun cloudAzureAiSearchVectorStore(): Optional<CloudAzureAiSearchVectorStore> =
            Optional.ofNullable(cloudAzureAiSearchVectorStore)

        /**
         * Cloud MongoDB Atlas Vector Store.
         *
         * This class is used to store the configuration for a MongoDB Atlas vector store, so that
         * it can be created and used in LlamaCloud.
         *
         * Args: mongodb_uri (str): URI for connecting to MongoDB Atlas db_name (str): name of the
         * MongoDB database collection_name (str): name of the MongoDB collection vector_index_name
         * (str): name of the MongoDB Atlas vector index fulltext_index_name (str): name of the
         * MongoDB Atlas full-text index
         */
        fun cloudMongoDBAtlasVectorSearch(): Optional<CloudMongoDBAtlasVectorSearch> =
            Optional.ofNullable(cloudMongoDBAtlasVectorSearch)

        /** Cloud Milvus Vector Store. */
        fun cloudMilvusVectorStore(): Optional<CloudMilvusVectorStore> =
            Optional.ofNullable(cloudMilvusVectorStore)

        /**
         * Cloud AstraDB Vector Store.
         *
         * This class is used to store the configuration for an AstraDB vector store, so that it can
         * be created and used in LlamaCloud.
         *
         * Args: token (str): The Astra DB Application Token to use. api_endpoint (str): The Astra
         * DB JSON API endpoint for your database. collection_name (str): Collection name to use. If
         * not existing, it will be created. embedding_dimension (int): Length of the embedding
         * vectors in use. keyspace (optional[str]): The keyspace to use. If not provided,
         * 'default_keyspace'
         */
        fun cloudAstraDbVectorStore(): Optional<CloudAstraDbVectorStore> =
            Optional.ofNullable(cloudAstraDbVectorStore)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isCloudPineconeVectorStore(): Boolean = cloudPineconeVectorStore != null

        fun isCloudPostgresVectorStore(): Boolean = cloudPostgresVectorStore != null

        fun isCloudQdrantVectorStore(): Boolean = cloudQdrantVectorStore != null

        fun isCloudAzureAiSearchVectorStore(): Boolean = cloudAzureAiSearchVectorStore != null

        fun isCloudMongoDBAtlasVectorSearch(): Boolean = cloudMongoDBAtlasVectorSearch != null

        fun isCloudMilvusVectorStore(): Boolean = cloudMilvusVectorStore != null

        fun isCloudAstraDbVectorStore(): Boolean = cloudAstraDbVectorStore != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        /**
         * Cloud Pinecone Vector Store.
         *
         * This class is used to store the configuration for a Pinecone vector store, so that it can
         * be created and used in LlamaCloud.
         *
         * Args: api_key (str): API key for authenticating with Pinecone index_name (str): name of
         * the Pinecone index namespace (optional[str]): namespace to use in the Pinecone index
         * insert_kwargs (optional[dict]): additional kwargs to pass during insertion
         */
        fun asCloudPineconeVectorStore(): CloudPineconeVectorStore =
            cloudPineconeVectorStore.getOrThrow("cloudPineconeVectorStore")

        fun asCloudPostgresVectorStore(): CloudPostgresVectorStore =
            cloudPostgresVectorStore.getOrThrow("cloudPostgresVectorStore")

        /**
         * Cloud Qdrant Vector Store.
         *
         * This class is used to store the configuration for a Qdrant vector store, so that it can
         * be created and used in LlamaCloud.
         *
         * Args: collection_name (str): name of the Qdrant collection url (str): url of the Qdrant
         * instance api_key (str): API key for authenticating with Qdrant max_retries (int): maximum
         * number of retries in case of a failure. Defaults to 3 client_kwargs (dict): additional
         * kwargs to pass to the Qdrant client
         */
        fun asCloudQdrantVectorStore(): CloudQdrantVectorStore =
            cloudQdrantVectorStore.getOrThrow("cloudQdrantVectorStore")

        /** Cloud Azure AI Search Vector Store. */
        fun asCloudAzureAiSearchVectorStore(): CloudAzureAiSearchVectorStore =
            cloudAzureAiSearchVectorStore.getOrThrow("cloudAzureAiSearchVectorStore")

        /**
         * Cloud MongoDB Atlas Vector Store.
         *
         * This class is used to store the configuration for a MongoDB Atlas vector store, so that
         * it can be created and used in LlamaCloud.
         *
         * Args: mongodb_uri (str): URI for connecting to MongoDB Atlas db_name (str): name of the
         * MongoDB database collection_name (str): name of the MongoDB collection vector_index_name
         * (str): name of the MongoDB Atlas vector index fulltext_index_name (str): name of the
         * MongoDB Atlas full-text index
         */
        fun asCloudMongoDBAtlasVectorSearch(): CloudMongoDBAtlasVectorSearch =
            cloudMongoDBAtlasVectorSearch.getOrThrow("cloudMongoDBAtlasVectorSearch")

        /** Cloud Milvus Vector Store. */
        fun asCloudMilvusVectorStore(): CloudMilvusVectorStore =
            cloudMilvusVectorStore.getOrThrow("cloudMilvusVectorStore")

        /**
         * Cloud AstraDB Vector Store.
         *
         * This class is used to store the configuration for an AstraDB vector store, so that it can
         * be created and used in LlamaCloud.
         *
         * Args: token (str): The Astra DB Application Token to use. api_endpoint (str): The Astra
         * DB JSON API endpoint for your database. collection_name (str): Collection name to use. If
         * not existing, it will be created. embedding_dimension (int): Length of the embedding
         * vectors in use. keyspace (optional[str]): The keyspace to use. If not provided,
         * 'default_keyspace'
         */
        fun asCloudAstraDbVectorStore(): CloudAstraDbVectorStore =
            cloudAstraDbVectorStore.getOrThrow("cloudAstraDbVectorStore")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.llamacloud_prod.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = component.accept(new Component.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitUnionMember0(UnionMember0 unionMember0) {
         *         return Optional.of(unionMember0.toString());
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
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                cloudPineconeVectorStore != null ->
                    visitor.visitCloudPineconeVectorStore(cloudPineconeVectorStore)
                cloudPostgresVectorStore != null ->
                    visitor.visitCloudPostgresVectorStore(cloudPostgresVectorStore)
                cloudQdrantVectorStore != null ->
                    visitor.visitCloudQdrantVectorStore(cloudQdrantVectorStore)
                cloudAzureAiSearchVectorStore != null ->
                    visitor.visitCloudAzureAiSearchVectorStore(cloudAzureAiSearchVectorStore)
                cloudMongoDBAtlasVectorSearch != null ->
                    visitor.visitCloudMongoDBAtlasVectorSearch(cloudMongoDBAtlasVectorSearch)
                cloudMilvusVectorStore != null ->
                    visitor.visitCloudMilvusVectorStore(cloudMilvusVectorStore)
                cloudAstraDbVectorStore != null ->
                    visitor.visitCloudAstraDbVectorStore(cloudAstraDbVectorStore)
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
        fun validate(): Component = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitCloudPineconeVectorStore(
                        cloudPineconeVectorStore: CloudPineconeVectorStore
                    ) {
                        cloudPineconeVectorStore.validate()
                    }

                    override fun visitCloudPostgresVectorStore(
                        cloudPostgresVectorStore: CloudPostgresVectorStore
                    ) {
                        cloudPostgresVectorStore.validate()
                    }

                    override fun visitCloudQdrantVectorStore(
                        cloudQdrantVectorStore: CloudQdrantVectorStore
                    ) {
                        cloudQdrantVectorStore.validate()
                    }

                    override fun visitCloudAzureAiSearchVectorStore(
                        cloudAzureAiSearchVectorStore: CloudAzureAiSearchVectorStore
                    ) {
                        cloudAzureAiSearchVectorStore.validate()
                    }

                    override fun visitCloudMongoDBAtlasVectorSearch(
                        cloudMongoDBAtlasVectorSearch: CloudMongoDBAtlasVectorSearch
                    ) {
                        cloudMongoDBAtlasVectorSearch.validate()
                    }

                    override fun visitCloudMilvusVectorStore(
                        cloudMilvusVectorStore: CloudMilvusVectorStore
                    ) {
                        cloudMilvusVectorStore.validate()
                    }

                    override fun visitCloudAstraDbVectorStore(
                        cloudAstraDbVectorStore: CloudAstraDbVectorStore
                    ) {
                        cloudAstraDbVectorStore.validate()
                    }
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
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitCloudPineconeVectorStore(
                        cloudPineconeVectorStore: CloudPineconeVectorStore
                    ) = cloudPineconeVectorStore.validity()

                    override fun visitCloudPostgresVectorStore(
                        cloudPostgresVectorStore: CloudPostgresVectorStore
                    ) = cloudPostgresVectorStore.validity()

                    override fun visitCloudQdrantVectorStore(
                        cloudQdrantVectorStore: CloudQdrantVectorStore
                    ) = cloudQdrantVectorStore.validity()

                    override fun visitCloudAzureAiSearchVectorStore(
                        cloudAzureAiSearchVectorStore: CloudAzureAiSearchVectorStore
                    ) = cloudAzureAiSearchVectorStore.validity()

                    override fun visitCloudMongoDBAtlasVectorSearch(
                        cloudMongoDBAtlasVectorSearch: CloudMongoDBAtlasVectorSearch
                    ) = cloudMongoDBAtlasVectorSearch.validity()

                    override fun visitCloudMilvusVectorStore(
                        cloudMilvusVectorStore: CloudMilvusVectorStore
                    ) = cloudMilvusVectorStore.validity()

                    override fun visitCloudAstraDbVectorStore(
                        cloudAstraDbVectorStore: CloudAstraDbVectorStore
                    ) = cloudAstraDbVectorStore.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Component &&
                unionMember0 == other.unionMember0 &&
                cloudPineconeVectorStore == other.cloudPineconeVectorStore &&
                cloudPostgresVectorStore == other.cloudPostgresVectorStore &&
                cloudQdrantVectorStore == other.cloudQdrantVectorStore &&
                cloudAzureAiSearchVectorStore == other.cloudAzureAiSearchVectorStore &&
                cloudMongoDBAtlasVectorSearch == other.cloudMongoDBAtlasVectorSearch &&
                cloudMilvusVectorStore == other.cloudMilvusVectorStore &&
                cloudAstraDbVectorStore == other.cloudAstraDbVectorStore
        }

        override fun hashCode(): Int =
            Objects.hash(
                unionMember0,
                cloudPineconeVectorStore,
                cloudPostgresVectorStore,
                cloudQdrantVectorStore,
                cloudAzureAiSearchVectorStore,
                cloudMongoDBAtlasVectorSearch,
                cloudMilvusVectorStore,
                cloudAstraDbVectorStore,
            )

        override fun toString(): String =
            when {
                unionMember0 != null -> "Component{unionMember0=$unionMember0}"
                cloudPineconeVectorStore != null ->
                    "Component{cloudPineconeVectorStore=$cloudPineconeVectorStore}"
                cloudPostgresVectorStore != null ->
                    "Component{cloudPostgresVectorStore=$cloudPostgresVectorStore}"
                cloudQdrantVectorStore != null ->
                    "Component{cloudQdrantVectorStore=$cloudQdrantVectorStore}"
                cloudAzureAiSearchVectorStore != null ->
                    "Component{cloudAzureAiSearchVectorStore=$cloudAzureAiSearchVectorStore}"
                cloudMongoDBAtlasVectorSearch != null ->
                    "Component{cloudMongoDBAtlasVectorSearch=$cloudMongoDBAtlasVectorSearch}"
                cloudMilvusVectorStore != null ->
                    "Component{cloudMilvusVectorStore=$cloudMilvusVectorStore}"
                cloudAstraDbVectorStore != null ->
                    "Component{cloudAstraDbVectorStore=$cloudAstraDbVectorStore}"
                _json != null -> "Component{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Component")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Component(unionMember0 = unionMember0)

            /**
             * Cloud Pinecone Vector Store.
             *
             * This class is used to store the configuration for a Pinecone vector store, so that it
             * can be created and used in LlamaCloud.
             *
             * Args: api_key (str): API key for authenticating with Pinecone index_name (str): name
             * of the Pinecone index namespace (optional[str]): namespace to use in the Pinecone
             * index insert_kwargs (optional[dict]): additional kwargs to pass during insertion
             */
            @JvmStatic
            fun ofCloudPineconeVectorStore(cloudPineconeVectorStore: CloudPineconeVectorStore) =
                Component(cloudPineconeVectorStore = cloudPineconeVectorStore)

            @JvmStatic
            fun ofCloudPostgresVectorStore(cloudPostgresVectorStore: CloudPostgresVectorStore) =
                Component(cloudPostgresVectorStore = cloudPostgresVectorStore)

            /**
             * Cloud Qdrant Vector Store.
             *
             * This class is used to store the configuration for a Qdrant vector store, so that it
             * can be created and used in LlamaCloud.
             *
             * Args: collection_name (str): name of the Qdrant collection url (str): url of the
             * Qdrant instance api_key (str): API key for authenticating with Qdrant max_retries
             * (int): maximum number of retries in case of a failure. Defaults to 3 client_kwargs
             * (dict): additional kwargs to pass to the Qdrant client
             */
            @JvmStatic
            fun ofCloudQdrantVectorStore(cloudQdrantVectorStore: CloudQdrantVectorStore) =
                Component(cloudQdrantVectorStore = cloudQdrantVectorStore)

            /** Cloud Azure AI Search Vector Store. */
            @JvmStatic
            fun ofCloudAzureAiSearchVectorStore(
                cloudAzureAiSearchVectorStore: CloudAzureAiSearchVectorStore
            ) = Component(cloudAzureAiSearchVectorStore = cloudAzureAiSearchVectorStore)

            /**
             * Cloud MongoDB Atlas Vector Store.
             *
             * This class is used to store the configuration for a MongoDB Atlas vector store, so
             * that it can be created and used in LlamaCloud.
             *
             * Args: mongodb_uri (str): URI for connecting to MongoDB Atlas db_name (str): name of
             * the MongoDB database collection_name (str): name of the MongoDB collection
             * vector_index_name (str): name of the MongoDB Atlas vector index fulltext_index_name
             * (str): name of the MongoDB Atlas full-text index
             */
            @JvmStatic
            fun ofCloudMongoDBAtlasVectorSearch(
                cloudMongoDBAtlasVectorSearch: CloudMongoDBAtlasVectorSearch
            ) = Component(cloudMongoDBAtlasVectorSearch = cloudMongoDBAtlasVectorSearch)

            /** Cloud Milvus Vector Store. */
            @JvmStatic
            fun ofCloudMilvusVectorStore(cloudMilvusVectorStore: CloudMilvusVectorStore) =
                Component(cloudMilvusVectorStore = cloudMilvusVectorStore)

            /**
             * Cloud AstraDB Vector Store.
             *
             * This class is used to store the configuration for an AstraDB vector store, so that it
             * can be created and used in LlamaCloud.
             *
             * Args: token (str): The Astra DB Application Token to use. api_endpoint (str): The
             * Astra DB JSON API endpoint for your database. collection_name (str): Collection name
             * to use. If not existing, it will be created. embedding_dimension (int): Length of the
             * embedding vectors in use. keyspace (optional[str]): The keyspace to use. If not
             * provided, 'default_keyspace'
             */
            @JvmStatic
            fun ofCloudAstraDbVectorStore(cloudAstraDbVectorStore: CloudAstraDbVectorStore) =
                Component(cloudAstraDbVectorStore = cloudAstraDbVectorStore)
        }

        /**
         * An interface that defines how to map each variant of [Component] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            /**
             * Cloud Pinecone Vector Store.
             *
             * This class is used to store the configuration for a Pinecone vector store, so that it
             * can be created and used in LlamaCloud.
             *
             * Args: api_key (str): API key for authenticating with Pinecone index_name (str): name
             * of the Pinecone index namespace (optional[str]): namespace to use in the Pinecone
             * index insert_kwargs (optional[dict]): additional kwargs to pass during insertion
             */
            fun visitCloudPineconeVectorStore(cloudPineconeVectorStore: CloudPineconeVectorStore): T

            fun visitCloudPostgresVectorStore(cloudPostgresVectorStore: CloudPostgresVectorStore): T

            /**
             * Cloud Qdrant Vector Store.
             *
             * This class is used to store the configuration for a Qdrant vector store, so that it
             * can be created and used in LlamaCloud.
             *
             * Args: collection_name (str): name of the Qdrant collection url (str): url of the
             * Qdrant instance api_key (str): API key for authenticating with Qdrant max_retries
             * (int): maximum number of retries in case of a failure. Defaults to 3 client_kwargs
             * (dict): additional kwargs to pass to the Qdrant client
             */
            fun visitCloudQdrantVectorStore(cloudQdrantVectorStore: CloudQdrantVectorStore): T

            /** Cloud Azure AI Search Vector Store. */
            fun visitCloudAzureAiSearchVectorStore(
                cloudAzureAiSearchVectorStore: CloudAzureAiSearchVectorStore
            ): T

            /**
             * Cloud MongoDB Atlas Vector Store.
             *
             * This class is used to store the configuration for a MongoDB Atlas vector store, so
             * that it can be created and used in LlamaCloud.
             *
             * Args: mongodb_uri (str): URI for connecting to MongoDB Atlas db_name (str): name of
             * the MongoDB database collection_name (str): name of the MongoDB collection
             * vector_index_name (str): name of the MongoDB Atlas vector index fulltext_index_name
             * (str): name of the MongoDB Atlas full-text index
             */
            fun visitCloudMongoDBAtlasVectorSearch(
                cloudMongoDBAtlasVectorSearch: CloudMongoDBAtlasVectorSearch
            ): T

            /** Cloud Milvus Vector Store. */
            fun visitCloudMilvusVectorStore(cloudMilvusVectorStore: CloudMilvusVectorStore): T

            /**
             * Cloud AstraDB Vector Store.
             *
             * This class is used to store the configuration for an AstraDB vector store, so that it
             * can be created and used in LlamaCloud.
             *
             * Args: token (str): The Astra DB Application Token to use. api_endpoint (str): The
             * Astra DB JSON API endpoint for your database. collection_name (str): Collection name
             * to use. If not existing, it will be created. embedding_dimension (int): Length of the
             * embedding vectors in use. keyspace (optional[str]): The keyspace to use. If not
             * provided, 'default_keyspace'
             */
            fun visitCloudAstraDbVectorStore(cloudAstraDbVectorStore: CloudAstraDbVectorStore): T

            /**
             * Maps an unknown variant of [Component] to a value of type [T].
             *
             * An instance of [Component] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown Component: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Component>(Component::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Component {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                Component(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudPineconeVectorStore>())?.let {
                                Component(cloudPineconeVectorStore = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudPostgresVectorStore>())?.let {
                                Component(cloudPostgresVectorStore = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudQdrantVectorStore>())?.let {
                                Component(cloudQdrantVectorStore = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudAzureAiSearchVectorStore>())
                                ?.let {
                                    Component(cloudAzureAiSearchVectorStore = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<CloudMongoDBAtlasVectorSearch>())
                                ?.let {
                                    Component(cloudMongoDBAtlasVectorSearch = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<CloudMilvusVectorStore>())?.let {
                                Component(cloudMilvusVectorStore = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudAstraDbVectorStore>())?.let {
                                Component(cloudAstraDbVectorStore = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Component(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Component>(Component::class) {

            override fun serialize(
                value: Component,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.cloudPineconeVectorStore != null ->
                        generator.writeObject(value.cloudPineconeVectorStore)
                    value.cloudPostgresVectorStore != null ->
                        generator.writeObject(value.cloudPostgresVectorStore)
                    value.cloudQdrantVectorStore != null ->
                        generator.writeObject(value.cloudQdrantVectorStore)
                    value.cloudAzureAiSearchVectorStore != null ->
                        generator.writeObject(value.cloudAzureAiSearchVectorStore)
                    value.cloudMongoDBAtlasVectorSearch != null ->
                        generator.writeObject(value.cloudMongoDBAtlasVectorSearch)
                    value.cloudMilvusVectorStore != null ->
                        generator.writeObject(value.cloudMilvusVectorStore)
                    value.cloudAstraDbVectorStore != null ->
                        generator.writeObject(value.cloudAstraDbVectorStore)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Component")
                }
            }
        }

        class UnionMember0
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

                /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember0 = UnionMember0(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): UnionMember0 = apply {
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

                return other is UnionMember0 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember0{additionalProperties=$additionalProperties}"
        }
    }

    class SinkType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PINECONE = of("PINECONE")

            @JvmField val POSTGRES = of("POSTGRES")

            @JvmField val QDRANT = of("QDRANT")

            @JvmField val AZUREAI_SEARCH = of("AZUREAI_SEARCH")

            @JvmField val MONGODB_ATLAS = of("MONGODB_ATLAS")

            @JvmField val MILVUS = of("MILVUS")

            @JvmField val ASTRA_DB = of("ASTRA_DB")

            @JvmStatic fun of(value: String) = SinkType(JsonField.of(value))
        }

        /** An enum containing [SinkType]'s known values. */
        enum class Known {
            PINECONE,
            POSTGRES,
            QDRANT,
            AZUREAI_SEARCH,
            MONGODB_ATLAS,
            MILVUS,
            ASTRA_DB,
        }

        /**
         * An enum containing [SinkType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SinkType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PINECONE,
            POSTGRES,
            QDRANT,
            AZUREAI_SEARCH,
            MONGODB_ATLAS,
            MILVUS,
            ASTRA_DB,
            /** An enum member indicating that [SinkType] was instantiated with an unknown value. */
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
                PINECONE -> Value.PINECONE
                POSTGRES -> Value.POSTGRES
                QDRANT -> Value.QDRANT
                AZUREAI_SEARCH -> Value.AZUREAI_SEARCH
                MONGODB_ATLAS -> Value.MONGODB_ATLAS
                MILVUS -> Value.MILVUS
                ASTRA_DB -> Value.ASTRA_DB
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
                PINECONE -> Known.PINECONE
                POSTGRES -> Known.POSTGRES
                QDRANT -> Known.QDRANT
                AZUREAI_SEARCH -> Known.AZUREAI_SEARCH
                MONGODB_ATLAS -> Known.MONGODB_ATLAS
                MILVUS -> Known.MILVUS
                ASTRA_DB -> Known.ASTRA_DB
                else -> throw LlamaCloudInvalidDataException("Unknown SinkType: $value")
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
        fun validate(): SinkType = apply {
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

            return other is SinkType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataSinkCreate &&
            component == other.component &&
            name == other.name &&
            sinkType == other.sinkType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(component, name, sinkType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataSinkCreate{component=$component, name=$name, sinkType=$sinkType, additionalProperties=$additionalProperties}"
}
