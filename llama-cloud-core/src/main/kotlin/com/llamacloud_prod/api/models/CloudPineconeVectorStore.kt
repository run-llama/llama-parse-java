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
 * Cloud Pinecone Vector Store.
 *
 * This class is used to store the configuration for a Pinecone vector store, so that it can be
 * created and used in LlamaCloud.
 *
 * Args: api_key (str): API key for authenticating with Pinecone index_name (str): name of the
 * Pinecone index namespace (optional[str]): namespace to use in the Pinecone index insert_kwargs
 * (optional[dict]): additional kwargs to pass during insertion
 */
class CloudPineconeVectorStore
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKey: JsonField<String>,
    private val indexName: JsonField<String>,
    private val className: JsonField<String>,
    private val insertKwargs: JsonField<InsertKwargs>,
    private val namespace: JsonField<String>,
    private val supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("index_name") @ExcludeMissing indexName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("insert_kwargs")
        @ExcludeMissing
        insertKwargs: JsonField<InsertKwargs> = JsonMissing.of(),
        @JsonProperty("namespace") @ExcludeMissing namespace: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_nested_metadata_filters")
        @ExcludeMissing
        supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters> = JsonMissing.of(),
    ) : this(
        apiKey,
        indexName,
        className,
        insertKwargs,
        namespace,
        supportsNestedMetadataFilters,
        mutableMapOf(),
    )

    /**
     * The API key for authenticating with Pinecone
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiKey(): String = apiKey.getRequired("api_key")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun indexName(): String = indexName.getRequired("index_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun insertKwargs(): Optional<InsertKwargs> = insertKwargs.getOptional("insert_kwargs")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun namespace(): Optional<String> = namespace.getOptional("namespace")

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
     * Returns the raw JSON value of [indexName].
     *
     * Unlike [indexName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index_name") @ExcludeMissing fun _indexName(): JsonField<String> = indexName

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [insertKwargs].
     *
     * Unlike [insertKwargs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("insert_kwargs")
    @ExcludeMissing
    fun _insertKwargs(): JsonField<InsertKwargs> = insertKwargs

    /**
     * Returns the raw JSON value of [namespace].
     *
     * Unlike [namespace], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("namespace") @ExcludeMissing fun _namespace(): JsonField<String> = namespace

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
         * Returns a mutable builder for constructing an instance of [CloudPineconeVectorStore].
         *
         * The following fields are required:
         * ```java
         * .apiKey()
         * .indexName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudPineconeVectorStore]. */
    class Builder internal constructor() {

        private var apiKey: JsonField<String>? = null
        private var indexName: JsonField<String>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var insertKwargs: JsonField<InsertKwargs> = JsonMissing.of()
        private var namespace: JsonField<String> = JsonMissing.of()
        private var supportsNestedMetadataFilters: JsonField<SupportsNestedMetadataFilters> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudPineconeVectorStore: CloudPineconeVectorStore) = apply {
            apiKey = cloudPineconeVectorStore.apiKey
            indexName = cloudPineconeVectorStore.indexName
            className = cloudPineconeVectorStore.className
            insertKwargs = cloudPineconeVectorStore.insertKwargs
            namespace = cloudPineconeVectorStore.namespace
            supportsNestedMetadataFilters = cloudPineconeVectorStore.supportsNestedMetadataFilters
            additionalProperties = cloudPineconeVectorStore.additionalProperties.toMutableMap()
        }

        /** The API key for authenticating with Pinecone */
        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        fun indexName(indexName: String) = indexName(JsonField.of(indexName))

        /**
         * Sets [Builder.indexName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun indexName(indexName: JsonField<String>) = apply { this.indexName = indexName }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        fun insertKwargs(insertKwargs: InsertKwargs?) =
            insertKwargs(JsonField.ofNullable(insertKwargs))

        /** Alias for calling [Builder.insertKwargs] with `insertKwargs.orElse(null)`. */
        fun insertKwargs(insertKwargs: Optional<InsertKwargs>) =
            insertKwargs(insertKwargs.getOrNull())

        /**
         * Sets [Builder.insertKwargs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insertKwargs] with a well-typed [InsertKwargs] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun insertKwargs(insertKwargs: JsonField<InsertKwargs>) = apply {
            this.insertKwargs = insertKwargs
        }

        fun namespace(namespace: String?) = namespace(JsonField.ofNullable(namespace))

        /** Alias for calling [Builder.namespace] with `namespace.orElse(null)`. */
        fun namespace(namespace: Optional<String>) = namespace(namespace.getOrNull())

        /**
         * Sets [Builder.namespace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.namespace] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun namespace(namespace: JsonField<String>) = apply { this.namespace = namespace }

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
         * Returns an immutable instance of [CloudPineconeVectorStore].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .apiKey()
         * .indexName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudPineconeVectorStore =
            CloudPineconeVectorStore(
                checkRequired("apiKey", apiKey),
                checkRequired("indexName", indexName),
                className,
                insertKwargs,
                namespace,
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
    fun validate(): CloudPineconeVectorStore = apply {
        if (validated) {
            return@apply
        }

        apiKey()
        indexName()
        className()
        insertKwargs().ifPresent { it.validate() }
        namespace()
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
            (if (indexName.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (insertKwargs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (namespace.asKnown().isPresent) 1 else 0) +
            (supportsNestedMetadataFilters.asKnown().getOrNull()?.validity() ?: 0)

    class InsertKwargs
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

            /** Returns a mutable builder for constructing an instance of [InsertKwargs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InsertKwargs]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(insertKwargs: InsertKwargs) = apply {
                additionalProperties = insertKwargs.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [InsertKwargs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InsertKwargs = InsertKwargs(additionalProperties.toImmutable())
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
        fun validate(): InsertKwargs = apply {
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

            return other is InsertKwargs && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "InsertKwargs{additionalProperties=$additionalProperties}"
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

        return other is CloudPineconeVectorStore &&
            apiKey == other.apiKey &&
            indexName == other.indexName &&
            className == other.className &&
            insertKwargs == other.insertKwargs &&
            namespace == other.namespace &&
            supportsNestedMetadataFilters == other.supportsNestedMetadataFilters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKey,
            indexName,
            className,
            insertKwargs,
            namespace,
            supportsNestedMetadataFilters,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudPineconeVectorStore{apiKey=$apiKey, indexName=$indexName, className=$className, insertKwargs=$insertKwargs, namespace=$namespace, supportsNestedMetadataFilters=$supportsNestedMetadataFilters, additionalProperties=$additionalProperties}"
}
