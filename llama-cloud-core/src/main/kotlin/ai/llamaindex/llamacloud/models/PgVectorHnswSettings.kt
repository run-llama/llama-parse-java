// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** HNSW settings for PGVector. */
class PgVectorHnswSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val distanceMethod: JsonField<DistanceMethod>,
    private val efConstruction: JsonField<Long>,
    private val efSearch: JsonField<Long>,
    private val m: JsonField<Long>,
    private val vectorType: JsonField<VectorType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("distance_method")
        @ExcludeMissing
        distanceMethod: JsonField<DistanceMethod> = JsonMissing.of(),
        @JsonProperty("ef_construction")
        @ExcludeMissing
        efConstruction: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ef_search") @ExcludeMissing efSearch: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("m") @ExcludeMissing m: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vector_type")
        @ExcludeMissing
        vectorType: JsonField<VectorType> = JsonMissing.of(),
    ) : this(distanceMethod, efConstruction, efSearch, m, vectorType, mutableMapOf())

    /**
     * The distance method to use.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun distanceMethod(): Optional<DistanceMethod> = distanceMethod.getOptional("distance_method")

    /**
     * The number of edges to use during the construction phase.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun efConstruction(): Optional<Long> = efConstruction.getOptional("ef_construction")

    /**
     * The number of edges to use during the search phase.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun efSearch(): Optional<Long> = efSearch.getOptional("ef_search")

    /**
     * The number of bi-directional links created for each new element.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun m(): Optional<Long> = m.getOptional("m")

    /**
     * The type of vector to use.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vectorType(): Optional<VectorType> = vectorType.getOptional("vector_type")

    /**
     * Returns the raw JSON value of [distanceMethod].
     *
     * Unlike [distanceMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("distance_method")
    @ExcludeMissing
    fun _distanceMethod(): JsonField<DistanceMethod> = distanceMethod

    /**
     * Returns the raw JSON value of [efConstruction].
     *
     * Unlike [efConstruction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ef_construction")
    @ExcludeMissing
    fun _efConstruction(): JsonField<Long> = efConstruction

    /**
     * Returns the raw JSON value of [efSearch].
     *
     * Unlike [efSearch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ef_search") @ExcludeMissing fun _efSearch(): JsonField<Long> = efSearch

    /**
     * Returns the raw JSON value of [m].
     *
     * Unlike [m], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m") @ExcludeMissing fun _m(): JsonField<Long> = m

    /**
     * Returns the raw JSON value of [vectorType].
     *
     * Unlike [vectorType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vector_type")
    @ExcludeMissing
    fun _vectorType(): JsonField<VectorType> = vectorType

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

        /** Returns a mutable builder for constructing an instance of [PgVectorHnswSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PgVectorHnswSettings]. */
    class Builder internal constructor() {

        private var distanceMethod: JsonField<DistanceMethod> = JsonMissing.of()
        private var efConstruction: JsonField<Long> = JsonMissing.of()
        private var efSearch: JsonField<Long> = JsonMissing.of()
        private var m: JsonField<Long> = JsonMissing.of()
        private var vectorType: JsonField<VectorType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pgVectorHnswSettings: PgVectorHnswSettings) = apply {
            distanceMethod = pgVectorHnswSettings.distanceMethod
            efConstruction = pgVectorHnswSettings.efConstruction
            efSearch = pgVectorHnswSettings.efSearch
            m = pgVectorHnswSettings.m
            vectorType = pgVectorHnswSettings.vectorType
            additionalProperties = pgVectorHnswSettings.additionalProperties.toMutableMap()
        }

        /** The distance method to use. */
        fun distanceMethod(distanceMethod: DistanceMethod) =
            distanceMethod(JsonField.of(distanceMethod))

        /**
         * Sets [Builder.distanceMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distanceMethod] with a well-typed [DistanceMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun distanceMethod(distanceMethod: JsonField<DistanceMethod>) = apply {
            this.distanceMethod = distanceMethod
        }

        /** The number of edges to use during the construction phase. */
        fun efConstruction(efConstruction: Long) = efConstruction(JsonField.of(efConstruction))

        /**
         * Sets [Builder.efConstruction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.efConstruction] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun efConstruction(efConstruction: JsonField<Long>) = apply {
            this.efConstruction = efConstruction
        }

        /** The number of edges to use during the search phase. */
        fun efSearch(efSearch: Long) = efSearch(JsonField.of(efSearch))

        /**
         * Sets [Builder.efSearch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.efSearch] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun efSearch(efSearch: JsonField<Long>) = apply { this.efSearch = efSearch }

        /** The number of bi-directional links created for each new element. */
        fun m(m: Long) = m(JsonField.of(m))

        /**
         * Sets [Builder.m] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m(m: JsonField<Long>) = apply { this.m = m }

        /** The type of vector to use. */
        fun vectorType(vectorType: VectorType) = vectorType(JsonField.of(vectorType))

        /**
         * Sets [Builder.vectorType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorType] with a well-typed [VectorType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vectorType(vectorType: JsonField<VectorType>) = apply { this.vectorType = vectorType }

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
         * Returns an immutable instance of [PgVectorHnswSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PgVectorHnswSettings =
            PgVectorHnswSettings(
                distanceMethod,
                efConstruction,
                efSearch,
                m,
                vectorType,
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
    fun validate(): PgVectorHnswSettings = apply {
        if (validated) {
            return@apply
        }

        distanceMethod().ifPresent { it.validate() }
        efConstruction()
        efSearch()
        m()
        vectorType().ifPresent { it.validate() }
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
        (distanceMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (efConstruction.asKnown().isPresent) 1 else 0) +
            (if (efSearch.asKnown().isPresent) 1 else 0) +
            (if (m.asKnown().isPresent) 1 else 0) +
            (vectorType.asKnown().getOrNull()?.validity() ?: 0)

    /** The distance method to use. */
    class DistanceMethod @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val COSINE = of("cosine")

            @JvmField val HAMMING = of("hamming")

            @JvmField val IP = of("ip")

            @JvmField val JACCARD = of("jaccard")

            @JvmField val L1 = of("l1")

            @JvmField val L2 = of("l2")

            @JvmStatic fun of(value: String) = DistanceMethod(JsonField.of(value))
        }

        /** An enum containing [DistanceMethod]'s known values. */
        enum class Known {
            COSINE,
            HAMMING,
            IP,
            JACCARD,
            L1,
            L2,
        }

        /**
         * An enum containing [DistanceMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DistanceMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COSINE,
            HAMMING,
            IP,
            JACCARD,
            L1,
            L2,
            /**
             * An enum member indicating that [DistanceMethod] was instantiated with an unknown
             * value.
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
                COSINE -> Value.COSINE
                HAMMING -> Value.HAMMING
                IP -> Value.IP
                JACCARD -> Value.JACCARD
                L1 -> Value.L1
                L2 -> Value.L2
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
                COSINE -> Known.COSINE
                HAMMING -> Known.HAMMING
                IP -> Known.IP
                JACCARD -> Known.JACCARD
                L1 -> Known.L1
                L2 -> Known.L2
                else -> throw LlamaCloudInvalidDataException("Unknown DistanceMethod: $value")
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
        fun validate(): DistanceMethod = apply {
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

            return other is DistanceMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of vector to use. */
    class VectorType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BIT = of("bit")

            @JvmField val HALF_VEC = of("half_vec")

            @JvmField val SPARSE_VEC = of("sparse_vec")

            @JvmField val VECTOR = of("vector")

            @JvmStatic fun of(value: String) = VectorType(JsonField.of(value))
        }

        /** An enum containing [VectorType]'s known values. */
        enum class Known {
            BIT,
            HALF_VEC,
            SPARSE_VEC,
            VECTOR,
        }

        /**
         * An enum containing [VectorType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VectorType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BIT,
            HALF_VEC,
            SPARSE_VEC,
            VECTOR,
            /**
             * An enum member indicating that [VectorType] was instantiated with an unknown value.
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
                BIT -> Value.BIT
                HALF_VEC -> Value.HALF_VEC
                SPARSE_VEC -> Value.SPARSE_VEC
                VECTOR -> Value.VECTOR
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
                BIT -> Known.BIT
                HALF_VEC -> Known.HALF_VEC
                SPARSE_VEC -> Known.SPARSE_VEC
                VECTOR -> Known.VECTOR
                else -> throw LlamaCloudInvalidDataException("Unknown VectorType: $value")
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
        fun validate(): VectorType = apply {
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

            return other is VectorType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PgVectorHnswSettings &&
            distanceMethod == other.distanceMethod &&
            efConstruction == other.efConstruction &&
            efSearch == other.efSearch &&
            m == other.m &&
            vectorType == other.vectorType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(distanceMethod, efConstruction, efSearch, m, vectorType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PgVectorHnswSettings{distanceMethod=$distanceMethod, efConstruction=$efConstruction, efSearch=$efSearch, m=$m, vectorType=$vectorType, additionalProperties=$additionalProperties}"
}
