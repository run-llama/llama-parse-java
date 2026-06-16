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
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.getOrThrow
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Metadata filters for vector stores. */
class MetadataFilters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filters: JsonField<List<Filter>>,
    private val condition: JsonField<Condition>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<Filter>> = JsonMissing.of(),
        @JsonProperty("condition")
        @ExcludeMissing
        condition: JsonField<Condition> = JsonMissing.of(),
    ) : this(filters, condition, mutableMapOf())

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): List<Filter> = filters.getRequired("filters")

    /**
     * Vector store filter conditions to combine different filters.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun condition(): Optional<Condition> = condition.getOptional("condition")

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

    /**
     * Returns the raw JSON value of [condition].
     *
     * Unlike [condition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("condition") @ExcludeMissing fun _condition(): JsonField<Condition> = condition

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
         * Returns a mutable builder for constructing an instance of [MetadataFilters].
         *
         * The following fields are required:
         * ```java
         * .filters()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetadataFilters]. */
    class Builder internal constructor() {

        private var filters: JsonField<MutableList<Filter>>? = null
        private var condition: JsonField<Condition> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(metadataFilters: MetadataFilters) = apply {
            filters = metadataFilters.filters.map { it.toMutableList() }
            condition = metadataFilters.condition
            additionalProperties = metadataFilters.additionalProperties.toMutableMap()
        }

        fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<Filter>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filters(filters: JsonField<List<Filter>>) = apply {
            this.filters = filters.map { it.toMutableList() }
        }

        /**
         * Adds a single [Filter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: Filter) = apply {
            filters =
                (filters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filters", it).add(filter)
                }
        }

        /** Alias for calling [addFilter] with `Filter.ofMetadata(metadata)`. */
        fun addFilter(metadata: Filter.MetadataFilter) = addFilter(Filter.ofMetadata(metadata))

        /** Alias for calling [addFilter] with `Filter.ofMetadataFilters(metadataFilters)`. */
        fun addFilter(metadataFilters: MetadataFilters) =
            addFilter(Filter.ofMetadataFilters(metadataFilters))

        /** Vector store filter conditions to combine different filters. */
        fun condition(condition: Condition?) = condition(JsonField.ofNullable(condition))

        /** Alias for calling [Builder.condition] with `condition.orElse(null)`. */
        fun condition(condition: Optional<Condition>) = condition(condition.getOrNull())

        /**
         * Sets [Builder.condition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.condition] with a well-typed [Condition] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun condition(condition: JsonField<Condition>) = apply { this.condition = condition }

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
         * Returns an immutable instance of [MetadataFilters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filters()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MetadataFilters =
            MetadataFilters(
                checkRequired("filters", filters).map { it.toImmutable() },
                condition,
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
    fun validate(): MetadataFilters = apply {
        if (validated) {
            return@apply
        }

        filters().forEach { it.validate() }
        condition().ifPresent { it.validate() }
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
        (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (condition.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Comprehensive metadata filter for vector stores to support more operators.
     *
     * Value uses Strict types, as int, float and str are compatible types and were all converted to
     * string before.
     *
     * See: https://docs.pydantic.dev/latest/usage/types/#strict-types
     */
    @JsonDeserialize(using = Filter.Deserializer::class)
    @JsonSerialize(using = Filter.Serializer::class)
    class Filter
    private constructor(
        private val metadata: MetadataFilter? = null,
        private val metadataFilters: MetadataFilters? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Comprehensive metadata filter for vector stores to support more operators.
         *
         * Value uses Strict types, as int, float and str are compatible types and were all
         * converted to string before.
         *
         * See: https://docs.pydantic.dev/latest/usage/types/#strict-types
         */
        fun metadata(): Optional<MetadataFilter> = Optional.ofNullable(metadata)

        /** Metadata filters for vector stores. */
        fun metadataFilters(): Optional<MetadataFilters> = Optional.ofNullable(metadataFilters)

        fun isMetadata(): Boolean = metadata != null

        fun isMetadataFilters(): Boolean = metadataFilters != null

        /**
         * Comprehensive metadata filter for vector stores to support more operators.
         *
         * Value uses Strict types, as int, float and str are compatible types and were all
         * converted to string before.
         *
         * See: https://docs.pydantic.dev/latest/usage/types/#strict-types
         */
        fun asMetadata(): MetadataFilter = metadata.getOrThrow("metadata")

        /** Metadata filters for vector stores. */
        fun asMetadataFilters(): MetadataFilters = metadataFilters.getOrThrow("metadataFilters")

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
         * Optional<String> result = filter.accept(new Filter.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitMetadata(MetadataFilter metadata) {
         *         return Optional.of(metadata.toString());
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
                metadata != null -> visitor.visitMetadata(metadata)
                metadataFilters != null -> visitor.visitMetadataFilters(metadataFilters)
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
        fun validate(): Filter = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitMetadata(metadata: MetadataFilter) {
                        metadata.validate()
                    }

                    override fun visitMetadataFilters(metadataFilters: MetadataFilters) {
                        metadataFilters.validate()
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
                    override fun visitMetadata(metadata: MetadataFilter) = metadata.validity()

                    override fun visitMetadataFilters(metadataFilters: MetadataFilters) =
                        metadataFilters.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                metadata == other.metadata &&
                metadataFilters == other.metadataFilters
        }

        override fun hashCode(): Int = Objects.hash(metadata, metadataFilters)

        override fun toString(): String =
            when {
                metadata != null -> "Filter{metadata=$metadata}"
                metadataFilters != null -> "Filter{metadataFilters=$metadataFilters}"
                _json != null -> "Filter{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Filter")
            }

        companion object {

            /**
             * Comprehensive metadata filter for vector stores to support more operators.
             *
             * Value uses Strict types, as int, float and str are compatible types and were all
             * converted to string before.
             *
             * See: https://docs.pydantic.dev/latest/usage/types/#strict-types
             */
            @JvmStatic fun ofMetadata(metadata: MetadataFilter) = Filter(metadata = metadata)

            /** Metadata filters for vector stores. */
            @JvmStatic
            fun ofMetadataFilters(metadataFilters: MetadataFilters) =
                Filter(metadataFilters = metadataFilters)
        }

        /** An interface that defines how to map each variant of [Filter] to a value of type [T]. */
        interface Visitor<out T> {

            /**
             * Comprehensive metadata filter for vector stores to support more operators.
             *
             * Value uses Strict types, as int, float and str are compatible types and were all
             * converted to string before.
             *
             * See: https://docs.pydantic.dev/latest/usage/types/#strict-types
             */
            fun visitMetadata(metadata: MetadataFilter): T

            /** Metadata filters for vector stores. */
            fun visitMetadataFilters(metadataFilters: MetadataFilters): T

            /**
             * Maps an unknown variant of [Filter] to a value of type [T].
             *
             * An instance of [Filter] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown Filter: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Filter>(Filter::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Filter {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<MetadataFilter>())?.let {
                                Filter(metadata = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MetadataFilters>())?.let {
                                Filter(metadataFilters = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Filter(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Filter>(Filter::class) {

            override fun serialize(
                value: Filter,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.metadata != null -> generator.writeObject(value.metadata)
                    value.metadataFilters != null -> generator.writeObject(value.metadataFilters)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Filter")
                }
            }
        }

        /**
         * Comprehensive metadata filter for vector stores to support more operators.
         *
         * Value uses Strict types, as int, float and str are compatible types and were all
         * converted to string before.
         *
         * See: https://docs.pydantic.dev/latest/usage/types/#strict-types
         */
        class MetadataFilter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val key: JsonField<String>,
            private val value: JsonField<Value>,
            private val operator: JsonField<Operator>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
            ) : this(key, value, operator, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun key(): String = key.getRequired("key")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun value(): Optional<Value> = value.getOptional("value")

            /**
             * Vector store filter operator.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun operator(): Optional<Operator> = operator.getOptional("operator")

            /**
             * Returns the raw JSON value of [key].
             *
             * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

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
                 * Returns a mutable builder for constructing an instance of [MetadataFilter].
                 *
                 * The following fields are required:
                 * ```java
                 * .key()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MetadataFilter]. */
            class Builder internal constructor() {

                private var key: JsonField<String>? = null
                private var value: JsonField<Value>? = null
                private var operator: JsonField<Operator> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadataFilter: MetadataFilter) = apply {
                    key = metadataFilter.key
                    value = metadataFilter.value
                    operator = metadataFilter.operator
                    additionalProperties = metadataFilter.additionalProperties.toMutableMap()
                }

                fun key(key: String) = key(JsonField.of(key))

                /**
                 * Sets [Builder.key] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.key] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun key(key: JsonField<String>) = apply { this.key = key }

                fun value(value: Value?) = value(JsonField.ofNullable(value))

                /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                fun value(value: Optional<Value>) = value(value.getOrNull())

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Value] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Value>) = apply { this.value = value }

                /** Alias for calling [value] with `Value.ofNumber(number)`. */
                fun value(number: Double) = value(Value.ofNumber(number))

                /** Alias for calling [value] with `Value.ofString(string)`. */
                fun value(string: String) = value(Value.ofString(string))

                /** Alias for calling [value] with `Value.ofStringArray(stringArray)`. */
                fun valueOfStringArray(stringArray: List<String>) =
                    value(Value.ofStringArray(stringArray))

                /** Alias for calling [value] with `Value.ofNumberArray(numberArray)`. */
                fun valueOfNumberArray(numberArray: List<Double>) =
                    value(Value.ofNumberArray(numberArray))

                /** Alias for calling [value] with `Value.ofIntegerArray(integerArray)`. */
                fun valueOfIntegerArray(integerArray: List<Long>) =
                    value(Value.ofIntegerArray(integerArray))

                /** Vector store filter operator. */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

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
                 * Returns an immutable instance of [MetadataFilter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .key()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MetadataFilter =
                    MetadataFilter(
                        checkRequired("key", key),
                        checkRequired("value", value),
                        operator,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): MetadataFilter = apply {
                if (validated) {
                    return@apply
                }

                key()
                value().ifPresent { it.validate() }
                operator().ifPresent { it.validate() }
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
                (if (key.asKnown().isPresent) 1 else 0) +
                    (value.asKnown().getOrNull()?.validity() ?: 0) +
                    (operator.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Value.Deserializer::class)
            @JsonSerialize(using = Value.Serializer::class)
            class Value
            private constructor(
                private val number: Double? = null,
                private val string: String? = null,
                private val stringArray: List<String>? = null,
                private val numberArray: List<Double>? = null,
                private val integerArray: List<Long>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun number(): Optional<Double> = Optional.ofNullable(number)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun stringArray(): Optional<List<String>> = Optional.ofNullable(stringArray)

                fun numberArray(): Optional<List<Double>> = Optional.ofNullable(numberArray)

                fun integerArray(): Optional<List<Long>> = Optional.ofNullable(integerArray)

                fun isNumber(): Boolean = number != null

                fun isString(): Boolean = string != null

                fun isStringArray(): Boolean = stringArray != null

                fun isNumberArray(): Boolean = numberArray != null

                fun isIntegerArray(): Boolean = integerArray != null

                fun asNumber(): Double = number.getOrThrow("number")

                fun asString(): String = string.getOrThrow("string")

                fun asStringArray(): List<String> = stringArray.getOrThrow("stringArray")

                fun asNumberArray(): List<Double> = numberArray.getOrThrow("numberArray")

                fun asIntegerArray(): List<Long> = integerArray.getOrThrow("integerArray")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.llamacloud_prod.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = value.accept(new Value.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitNumber(Double number) {
                 *         return Optional.of(number.toString());
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
                        number != null -> visitor.visitNumber(number)
                        string != null -> visitor.visitString(string)
                        stringArray != null -> visitor.visitStringArray(stringArray)
                        numberArray != null -> visitor.visitNumberArray(numberArray)
                        integerArray != null -> visitor.visitIntegerArray(integerArray)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Value = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitNumber(number: Double) {}

                            override fun visitString(string: String) {}

                            override fun visitStringArray(stringArray: List<String>) {}

                            override fun visitNumberArray(numberArray: List<Double>) {}

                            override fun visitIntegerArray(integerArray: List<Long>) {}
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
                            override fun visitNumber(number: Double) = 1

                            override fun visitString(string: String) = 1

                            override fun visitStringArray(stringArray: List<String>) =
                                stringArray.size

                            override fun visitNumberArray(numberArray: List<Double>) =
                                numberArray.size

                            override fun visitIntegerArray(integerArray: List<Long>) =
                                integerArray.size

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Value &&
                        number == other.number &&
                        string == other.string &&
                        stringArray == other.stringArray &&
                        numberArray == other.numberArray &&
                        integerArray == other.integerArray
                }

                override fun hashCode(): Int =
                    Objects.hash(number, string, stringArray, numberArray, integerArray)

                override fun toString(): String =
                    when {
                        number != null -> "Value{number=$number}"
                        string != null -> "Value{string=$string}"
                        stringArray != null -> "Value{stringArray=$stringArray}"
                        numberArray != null -> "Value{numberArray=$numberArray}"
                        integerArray != null -> "Value{integerArray=$integerArray}"
                        _json != null -> "Value{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Value")
                    }

                companion object {

                    @JvmStatic fun ofNumber(number: Double) = Value(number = number)

                    @JvmStatic fun ofString(string: String) = Value(string = string)

                    @JvmStatic
                    fun ofStringArray(stringArray: List<String>) =
                        Value(stringArray = stringArray.toImmutable())

                    @JvmStatic
                    fun ofNumberArray(numberArray: List<Double>) =
                        Value(numberArray = numberArray.toImmutable())

                    @JvmStatic
                    fun ofIntegerArray(integerArray: List<Long>) =
                        Value(integerArray = integerArray.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [Value] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitNumber(number: Double): T

                    fun visitString(string: String): T

                    fun visitStringArray(stringArray: List<String>): T

                    fun visitNumberArray(numberArray: List<Double>): T

                    fun visitIntegerArray(integerArray: List<Long>): T

                    /**
                     * Maps an unknown variant of [Value] to a value of type [T].
                     *
                     * An instance of [Value] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws LlamaCloudInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LlamaCloudInvalidDataException("Unknown Value: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Value(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                        Value(number = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                        Value(stringArray = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<Double>>())?.let {
                                        Value(numberArray = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<Long>>())?.let {
                                        Value(integerArray = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Value(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Value>(Value::class) {

                    override fun serialize(
                        value: Value,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.number != null -> generator.writeObject(value.number)
                            value.string != null -> generator.writeObject(value.string)
                            value.stringArray != null -> generator.writeObject(value.stringArray)
                            value.numberArray != null -> generator.writeObject(value.numberArray)
                            value.integerArray != null -> generator.writeObject(value.integerArray)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }
                }
            }

            /** Vector store filter operator. */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EQUALS = of("==")

                    @JvmField val GREATER = of(">")

                    @JvmField val LESS = of("<")

                    @JvmField val NOT_EQUALS = of("!=")

                    @JvmField val GREATER_OR_EQUALS = of(">=")

                    @JvmField val LESS_OR_EQUALS = of("<=")

                    @JvmField val IN = of("in")

                    @JvmField val NIN = of("nin")

                    @JvmField val ANY = of("any")

                    @JvmField val ALL = of("all")

                    @JvmField val TEXT_MATCH = of("text_match")

                    @JvmField val TEXT_MATCH_INSENSITIVE = of("text_match_insensitive")

                    @JvmField val CONTAINS = of("contains")

                    @JvmField val IS_EMPTY = of("is_empty")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    EQUALS,
                    GREATER,
                    LESS,
                    NOT_EQUALS,
                    GREATER_OR_EQUALS,
                    LESS_OR_EQUALS,
                    IN,
                    NIN,
                    ANY,
                    ALL,
                    TEXT_MATCH,
                    TEXT_MATCH_INSENSITIVE,
                    CONTAINS,
                    IS_EMPTY,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EQUALS,
                    GREATER,
                    LESS,
                    NOT_EQUALS,
                    GREATER_OR_EQUALS,
                    LESS_OR_EQUALS,
                    IN,
                    NIN,
                    ANY,
                    ALL,
                    TEXT_MATCH,
                    TEXT_MATCH_INSENSITIVE,
                    CONTAINS,
                    IS_EMPTY,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EQUALS -> Value.EQUALS
                        GREATER -> Value.GREATER
                        LESS -> Value.LESS
                        NOT_EQUALS -> Value.NOT_EQUALS
                        GREATER_OR_EQUALS -> Value.GREATER_OR_EQUALS
                        LESS_OR_EQUALS -> Value.LESS_OR_EQUALS
                        IN -> Value.IN
                        NIN -> Value.NIN
                        ANY -> Value.ANY
                        ALL -> Value.ALL
                        TEXT_MATCH -> Value.TEXT_MATCH
                        TEXT_MATCH_INSENSITIVE -> Value.TEXT_MATCH_INSENSITIVE
                        CONTAINS -> Value.CONTAINS
                        IS_EMPTY -> Value.IS_EMPTY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        EQUALS -> Known.EQUALS
                        GREATER -> Known.GREATER
                        LESS -> Known.LESS
                        NOT_EQUALS -> Known.NOT_EQUALS
                        GREATER_OR_EQUALS -> Known.GREATER_OR_EQUALS
                        LESS_OR_EQUALS -> Known.LESS_OR_EQUALS
                        IN -> Known.IN
                        NIN -> Known.NIN
                        ANY -> Known.ANY
                        ALL -> Known.ALL
                        TEXT_MATCH -> Known.TEXT_MATCH
                        TEXT_MATCH_INSENSITIVE -> Known.TEXT_MATCH_INSENSITIVE
                        CONTAINS -> Known.CONTAINS
                        IS_EMPTY -> Known.IS_EMPTY
                        else -> throw LlamaCloudInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Operator = apply {
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

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MetadataFilter &&
                    key == other.key &&
                    value == other.value &&
                    operator == other.operator &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(key, value, operator, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MetadataFilter{key=$key, value=$value, operator=$operator, additionalProperties=$additionalProperties}"
        }
    }

    /** Vector store filter conditions to combine different filters. */
    class Condition @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AND = of("and")

            @JvmField val OR = of("or")

            @JvmField val NOT = of("not")

            @JvmStatic fun of(value: String) = Condition(JsonField.of(value))
        }

        /** An enum containing [Condition]'s known values. */
        enum class Known {
            AND,
            OR,
            NOT,
        }

        /**
         * An enum containing [Condition]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Condition] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AND,
            OR,
            NOT,
            /**
             * An enum member indicating that [Condition] was instantiated with an unknown value.
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
                AND -> Value.AND
                OR -> Value.OR
                NOT -> Value.NOT
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
                AND -> Known.AND
                OR -> Known.OR
                NOT -> Known.NOT
                else -> throw LlamaCloudInvalidDataException("Unknown Condition: $value")
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
        fun validate(): Condition = apply {
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

            return other is Condition && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetadataFilters &&
            filters == other.filters &&
            condition == other.condition &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(filters, condition, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MetadataFilters{filters=$filters, condition=$condition, additionalProperties=$additionalProperties}"
}
