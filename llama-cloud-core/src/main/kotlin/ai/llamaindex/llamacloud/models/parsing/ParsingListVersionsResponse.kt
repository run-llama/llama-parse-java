// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Versions accepted by the parse API, grouped by tier. */
class ParsingListVersionsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agentic: JsonField<List<Agentic>>,
    private val agenticPlus: JsonField<List<AgenticPlus>>,
    private val costEffective: JsonField<List<CostEffective>>,
    private val fast: JsonField<List<Fast>>,
    private val latest: JsonField<Latest>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agentic")
        @ExcludeMissing
        agentic: JsonField<List<Agentic>> = JsonMissing.of(),
        @JsonProperty("agentic_plus")
        @ExcludeMissing
        agenticPlus: JsonField<List<AgenticPlus>> = JsonMissing.of(),
        @JsonProperty("cost_effective")
        @ExcludeMissing
        costEffective: JsonField<List<CostEffective>> = JsonMissing.of(),
        @JsonProperty("fast") @ExcludeMissing fast: JsonField<List<Fast>> = JsonMissing.of(),
        @JsonProperty("latest") @ExcludeMissing latest: JsonField<Latest> = JsonMissing.of(),
    ) : this(agentic, agenticPlus, costEffective, fast, latest, mutableMapOf())

    /**
     * Versions for the agentic tier
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentic(): List<Agentic> = agentic.getRequired("agentic")

    /**
     * Versions for the agentic_plus tier
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agenticPlus(): List<AgenticPlus> = agenticPlus.getRequired("agentic_plus")

    /**
     * Versions for the cost_effective tier
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun costEffective(): List<CostEffective> = costEffective.getRequired("cost_effective")

    /**
     * Versions for the fast tier
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fast(): List<Fast> = fast.getRequired("fast")

    /**
     * Version `latest` currently resolves to, per tier
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun latest(): Latest = latest.getRequired("latest")

    /**
     * Returns the raw JSON value of [agentic].
     *
     * Unlike [agentic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agentic") @ExcludeMissing fun _agentic(): JsonField<List<Agentic>> = agentic

    /**
     * Returns the raw JSON value of [agenticPlus].
     *
     * Unlike [agenticPlus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agentic_plus")
    @ExcludeMissing
    fun _agenticPlus(): JsonField<List<AgenticPlus>> = agenticPlus

    /**
     * Returns the raw JSON value of [costEffective].
     *
     * Unlike [costEffective], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost_effective")
    @ExcludeMissing
    fun _costEffective(): JsonField<List<CostEffective>> = costEffective

    /**
     * Returns the raw JSON value of [fast].
     *
     * Unlike [fast], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fast") @ExcludeMissing fun _fast(): JsonField<List<Fast>> = fast

    /**
     * Returns the raw JSON value of [latest].
     *
     * Unlike [latest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latest") @ExcludeMissing fun _latest(): JsonField<Latest> = latest

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
         * Returns a mutable builder for constructing an instance of [ParsingListVersionsResponse].
         *
         * The following fields are required:
         * ```java
         * .agentic()
         * .agenticPlus()
         * .costEffective()
         * .fast()
         * .latest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParsingListVersionsResponse]. */
    class Builder internal constructor() {

        private var agentic: JsonField<MutableList<Agentic>>? = null
        private var agenticPlus: JsonField<MutableList<AgenticPlus>>? = null
        private var costEffective: JsonField<MutableList<CostEffective>>? = null
        private var fast: JsonField<MutableList<Fast>>? = null
        private var latest: JsonField<Latest>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(parsingListVersionsResponse: ParsingListVersionsResponse) = apply {
            agentic = parsingListVersionsResponse.agentic.map { it.toMutableList() }
            agenticPlus = parsingListVersionsResponse.agenticPlus.map { it.toMutableList() }
            costEffective = parsingListVersionsResponse.costEffective.map { it.toMutableList() }
            fast = parsingListVersionsResponse.fast.map { it.toMutableList() }
            latest = parsingListVersionsResponse.latest
            additionalProperties = parsingListVersionsResponse.additionalProperties.toMutableMap()
        }

        /** Versions for the agentic tier */
        fun agentic(agentic: List<Agentic>) = agentic(JsonField.of(agentic))

        /**
         * Sets [Builder.agentic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentic] with a well-typed `List<Agentic>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agentic(agentic: JsonField<List<Agentic>>) = apply {
            this.agentic = agentic.map { it.toMutableList() }
        }

        /**
         * Adds a single [Agentic] to [Builder.agentic].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgentic(agentic: Agentic) = apply {
            this.agentic =
                (this.agentic ?: JsonField.of(mutableListOf())).also {
                    checkKnown("agentic", it).add(agentic)
                }
        }

        /** Versions for the agentic_plus tier */
        fun agenticPlus(agenticPlus: List<AgenticPlus>) = agenticPlus(JsonField.of(agenticPlus))

        /**
         * Sets [Builder.agenticPlus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agenticPlus] with a well-typed `List<AgenticPlus>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agenticPlus(agenticPlus: JsonField<List<AgenticPlus>>) = apply {
            this.agenticPlus = agenticPlus.map { it.toMutableList() }
        }

        /**
         * Adds a single [AgenticPlus] to [Builder.agenticPlus].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgenticPlus(agenticPlus: AgenticPlus) = apply {
            this.agenticPlus =
                (this.agenticPlus ?: JsonField.of(mutableListOf())).also {
                    checkKnown("agenticPlus", it).add(agenticPlus)
                }
        }

        /** Versions for the cost_effective tier */
        fun costEffective(costEffective: List<CostEffective>) =
            costEffective(JsonField.of(costEffective))

        /**
         * Sets [Builder.costEffective] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costEffective] with a well-typed `List<CostEffective>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun costEffective(costEffective: JsonField<List<CostEffective>>) = apply {
            this.costEffective = costEffective.map { it.toMutableList() }
        }

        /**
         * Adds a single [CostEffective] to [Builder.costEffective].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCostEffective(costEffective: CostEffective) = apply {
            this.costEffective =
                (this.costEffective ?: JsonField.of(mutableListOf())).also {
                    checkKnown("costEffective", it).add(costEffective)
                }
        }

        /** Versions for the fast tier */
        fun fast(fast: List<Fast>) = fast(JsonField.of(fast))

        /**
         * Sets [Builder.fast] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fast] with a well-typed `List<Fast>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fast(fast: JsonField<List<Fast>>) = apply {
            this.fast = fast.map { it.toMutableList() }
        }

        /**
         * Adds a single [Fast] to [Builder.fast].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFast(fast: Fast) = apply {
            this.fast =
                (this.fast ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fast", it).add(fast)
                }
        }

        /** Version `latest` currently resolves to, per tier */
        fun latest(latest: Latest) = latest(JsonField.of(latest))

        /**
         * Sets [Builder.latest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latest] with a well-typed [Latest] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latest(latest: JsonField<Latest>) = apply { this.latest = latest }

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
         * Returns an immutable instance of [ParsingListVersionsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agentic()
         * .agenticPlus()
         * .costEffective()
         * .fast()
         * .latest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParsingListVersionsResponse =
            ParsingListVersionsResponse(
                checkRequired("agentic", agentic).map { it.toImmutable() },
                checkRequired("agenticPlus", agenticPlus).map { it.toImmutable() },
                checkRequired("costEffective", costEffective).map { it.toImmutable() },
                checkRequired("fast", fast).map { it.toImmutable() },
                checkRequired("latest", latest),
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
    fun validate(): ParsingListVersionsResponse = apply {
        if (validated) {
            return@apply
        }

        agentic().forEach { it.validate() }
        agenticPlus().forEach { it.validate() }
        costEffective().forEach { it.validate() }
        fast().forEach { it.validate() }
        latest().validate()
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
        (agentic.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (agenticPlus.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (costEffective.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (fast.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (latest.asKnown().getOrNull()?.validity() ?: 0)

    class Agentic @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val _2026_08_19 = of("2026-08-19")

            @JvmField val _2026_07_24 = of("2026-07-24")

            @JvmField val _2026_07_23 = of("2026-07-23")

            @JvmField val _2026_07_15 = of("2026-07-15")

            @JvmField val _2026_06_18 = of("2026-06-18")

            @JvmField val _2026_06_11 = of("2026-06-11")

            @JvmField val _2026_06_04 = of("2026-06-04")

            @JvmField val _2026_06_01 = of("2026-06-01")

            @JvmField val _2026_05_26 = of("2026-05-26")

            @JvmField val _2026_05_21 = of("2026-05-21")

            @JvmField val _2026_05_20 = of("2026-05-20")

            @JvmField val _2026_05_19 = of("2026-05-19")

            @JvmField val _2026_05_13 = of("2026-05-13")

            @JvmField val _2026_05_11 = of("2026-05-11")

            @JvmField val _2026_05_06 = of("2026-05-06")

            @JvmField val _2026_05_04 = of("2026-05-04")

            @JvmField val _2026_04_27 = of("2026-04-27")

            @JvmField val _2026_04_22 = of("2026-04-22")

            @JvmField val _2026_04_09 = of("2026-04-09")

            @JvmField val _2026_04_06 = of("2026-04-06")

            @JvmField val _2026_04_02 = of("2026-04-02")

            @JvmField val _2026_03_31 = of("2026-03-31")

            @JvmField val _2026_03_30 = of("2026-03-30")

            @JvmField val _2026_03_27 = of("2026-03-27")

            @JvmField val _2026_03_25 = of("2026-03-25")

            @JvmField val _2026_03_23 = of("2026-03-23")

            @JvmField val _2026_03_22 = of("2026-03-22")

            @JvmField val _2026_03_20 = of("2026-03-20")

            @JvmField val _2026_03_11 = of("2026-03-11")

            @JvmField val _2026_03_10 = of("2026-03-10")

            @JvmField val _2026_03_09 = of("2026-03-09")

            @JvmField val _2026_03_03 = of("2026-03-03")

            @JvmField val _2026_03_02 = of("2026-03-02")

            @JvmField val _2026_02_26 = of("2026-02-26")

            @JvmField val _2026_02_24 = of("2026-02-24")

            @JvmField val _2026_01_30 = of("2026-01-30")

            @JvmField val _2026_01_22 = of("2026-01-22")

            @JvmField val _2026_01_21 = of("2026-01-21")

            @JvmField val _2026_01_16 = of("2026-01-16")

            @JvmField val _2026_01_08 = of("2026-01-08")

            @JvmField val _2025_12_31 = of("2025-12-31")

            @JvmField val _2025_12_18 = of("2025-12-18")

            @JvmField val _2025_12_11 = of("2025-12-11")

            @JvmStatic fun of(value: String) = Agentic(JsonField.of(value))
        }

        /** An enum containing [Agentic]'s known values. */
        enum class Known {
            _2026_08_19,
            _2026_07_24,
            _2026_07_23,
            _2026_07_15,
            _2026_06_18,
            _2026_06_11,
            _2026_06_04,
            _2026_06_01,
            _2026_05_26,
            _2026_05_21,
            _2026_05_20,
            _2026_05_19,
            _2026_05_13,
            _2026_05_11,
            _2026_05_06,
            _2026_05_04,
            _2026_04_27,
            _2026_04_22,
            _2026_04_09,
            _2026_04_06,
            _2026_04_02,
            _2026_03_31,
            _2026_03_30,
            _2026_03_27,
            _2026_03_25,
            _2026_03_23,
            _2026_03_22,
            _2026_03_20,
            _2026_03_11,
            _2026_03_10,
            _2026_03_09,
            _2026_03_03,
            _2026_03_02,
            _2026_02_26,
            _2026_02_24,
            _2026_01_30,
            _2026_01_22,
            _2026_01_21,
            _2026_01_16,
            _2026_01_08,
            _2025_12_31,
            _2025_12_18,
            _2025_12_11,
        }

        /**
         * An enum containing [Agentic]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Agentic] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _2026_08_19,
            _2026_07_24,
            _2026_07_23,
            _2026_07_15,
            _2026_06_18,
            _2026_06_11,
            _2026_06_04,
            _2026_06_01,
            _2026_05_26,
            _2026_05_21,
            _2026_05_20,
            _2026_05_19,
            _2026_05_13,
            _2026_05_11,
            _2026_05_06,
            _2026_05_04,
            _2026_04_27,
            _2026_04_22,
            _2026_04_09,
            _2026_04_06,
            _2026_04_02,
            _2026_03_31,
            _2026_03_30,
            _2026_03_27,
            _2026_03_25,
            _2026_03_23,
            _2026_03_22,
            _2026_03_20,
            _2026_03_11,
            _2026_03_10,
            _2026_03_09,
            _2026_03_03,
            _2026_03_02,
            _2026_02_26,
            _2026_02_24,
            _2026_01_30,
            _2026_01_22,
            _2026_01_21,
            _2026_01_16,
            _2026_01_08,
            _2025_12_31,
            _2025_12_18,
            _2025_12_11,
            /** An enum member indicating that [Agentic] was instantiated with an unknown value. */
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
                _2026_08_19 -> Value._2026_08_19
                _2026_07_24 -> Value._2026_07_24
                _2026_07_23 -> Value._2026_07_23
                _2026_07_15 -> Value._2026_07_15
                _2026_06_18 -> Value._2026_06_18
                _2026_06_11 -> Value._2026_06_11
                _2026_06_04 -> Value._2026_06_04
                _2026_06_01 -> Value._2026_06_01
                _2026_05_26 -> Value._2026_05_26
                _2026_05_21 -> Value._2026_05_21
                _2026_05_20 -> Value._2026_05_20
                _2026_05_19 -> Value._2026_05_19
                _2026_05_13 -> Value._2026_05_13
                _2026_05_11 -> Value._2026_05_11
                _2026_05_06 -> Value._2026_05_06
                _2026_05_04 -> Value._2026_05_04
                _2026_04_27 -> Value._2026_04_27
                _2026_04_22 -> Value._2026_04_22
                _2026_04_09 -> Value._2026_04_09
                _2026_04_06 -> Value._2026_04_06
                _2026_04_02 -> Value._2026_04_02
                _2026_03_31 -> Value._2026_03_31
                _2026_03_30 -> Value._2026_03_30
                _2026_03_27 -> Value._2026_03_27
                _2026_03_25 -> Value._2026_03_25
                _2026_03_23 -> Value._2026_03_23
                _2026_03_22 -> Value._2026_03_22
                _2026_03_20 -> Value._2026_03_20
                _2026_03_11 -> Value._2026_03_11
                _2026_03_10 -> Value._2026_03_10
                _2026_03_09 -> Value._2026_03_09
                _2026_03_03 -> Value._2026_03_03
                _2026_03_02 -> Value._2026_03_02
                _2026_02_26 -> Value._2026_02_26
                _2026_02_24 -> Value._2026_02_24
                _2026_01_30 -> Value._2026_01_30
                _2026_01_22 -> Value._2026_01_22
                _2026_01_21 -> Value._2026_01_21
                _2026_01_16 -> Value._2026_01_16
                _2026_01_08 -> Value._2026_01_08
                _2025_12_31 -> Value._2025_12_31
                _2025_12_18 -> Value._2025_12_18
                _2025_12_11 -> Value._2025_12_11
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
                _2026_08_19 -> Known._2026_08_19
                _2026_07_24 -> Known._2026_07_24
                _2026_07_23 -> Known._2026_07_23
                _2026_07_15 -> Known._2026_07_15
                _2026_06_18 -> Known._2026_06_18
                _2026_06_11 -> Known._2026_06_11
                _2026_06_04 -> Known._2026_06_04
                _2026_06_01 -> Known._2026_06_01
                _2026_05_26 -> Known._2026_05_26
                _2026_05_21 -> Known._2026_05_21
                _2026_05_20 -> Known._2026_05_20
                _2026_05_19 -> Known._2026_05_19
                _2026_05_13 -> Known._2026_05_13
                _2026_05_11 -> Known._2026_05_11
                _2026_05_06 -> Known._2026_05_06
                _2026_05_04 -> Known._2026_05_04
                _2026_04_27 -> Known._2026_04_27
                _2026_04_22 -> Known._2026_04_22
                _2026_04_09 -> Known._2026_04_09
                _2026_04_06 -> Known._2026_04_06
                _2026_04_02 -> Known._2026_04_02
                _2026_03_31 -> Known._2026_03_31
                _2026_03_30 -> Known._2026_03_30
                _2026_03_27 -> Known._2026_03_27
                _2026_03_25 -> Known._2026_03_25
                _2026_03_23 -> Known._2026_03_23
                _2026_03_22 -> Known._2026_03_22
                _2026_03_20 -> Known._2026_03_20
                _2026_03_11 -> Known._2026_03_11
                _2026_03_10 -> Known._2026_03_10
                _2026_03_09 -> Known._2026_03_09
                _2026_03_03 -> Known._2026_03_03
                _2026_03_02 -> Known._2026_03_02
                _2026_02_26 -> Known._2026_02_26
                _2026_02_24 -> Known._2026_02_24
                _2026_01_30 -> Known._2026_01_30
                _2026_01_22 -> Known._2026_01_22
                _2026_01_21 -> Known._2026_01_21
                _2026_01_16 -> Known._2026_01_16
                _2026_01_08 -> Known._2026_01_08
                _2025_12_31 -> Known._2025_12_31
                _2025_12_18 -> Known._2025_12_18
                _2025_12_11 -> Known._2025_12_11
                else -> throw LlamaCloudInvalidDataException("Unknown Agentic: $value")
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
        fun validate(): Agentic = apply {
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

            return other is Agentic && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class AgenticPlus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val _2026_08_19 = of("2026-08-19")

            @JvmField val _2026_07_08 = of("2026-07-08")

            @JvmField val _2026_06_18 = of("2026-06-18")

            @JvmField val _2026_06_11 = of("2026-06-11")

            @JvmField val _2026_06_04 = of("2026-06-04")

            @JvmField val _2026_06_01 = of("2026-06-01")

            @JvmField val _2026_05_26 = of("2026-05-26")

            @JvmField val _2026_05_21 = of("2026-05-21")

            @JvmField val _2026_05_20 = of("2026-05-20")

            @JvmField val _2026_05_19 = of("2026-05-19")

            @JvmField val _2026_05_11 = of("2026-05-11")

            @JvmField val _2026_05_06 = of("2026-05-06")

            @JvmField val _2026_05_04 = of("2026-05-04")

            @JvmField val _2026_05_01 = of("2026-05-01")

            @JvmField val _2026_04_27 = of("2026-04-27")

            @JvmField val _2026_04_19 = of("2026-04-19")

            @JvmField val _2026_04_14 = of("2026-04-14")

            @JvmField val _2026_04_09 = of("2026-04-09")

            @JvmField val _2026_04_02 = of("2026-04-02")

            @JvmField val _2026_03_31 = of("2026-03-31")

            @JvmField val _2026_03_26 = of("2026-03-26")

            @JvmField val _2026_03_25 = of("2026-03-25")

            @JvmField val _2026_03_22 = of("2026-03-22")

            @JvmField val _2026_03_20 = of("2026-03-20")

            @JvmField val _2026_03_17 = of("2026-03-17")

            @JvmField val _2026_03_12 = of("2026-03-12")

            @JvmField val _2026_03_10 = of("2026-03-10")

            @JvmField val _2026_03_09 = of("2026-03-09")

            @JvmField val _2026_03_02 = of("2026-03-02")

            @JvmField val _2026_02_26 = of("2026-02-26")

            @JvmField val _2026_02_24 = of("2026-02-24")

            @JvmField val _2026_01_30 = of("2026-01-30")

            @JvmField val _2026_01_29 = of("2026-01-29")

            @JvmField val _2026_01_24 = of("2026-01-24")

            @JvmField val _2026_01_22 = of("2026-01-22")

            @JvmField val _2026_01_21 = of("2026-01-21")

            @JvmField val _2026_01_16 = of("2026-01-16")

            @JvmField val _2025_12_31 = of("2025-12-31")

            @JvmField val _2025_12_18 = of("2025-12-18")

            @JvmField val _2025_12_11 = of("2025-12-11")

            @JvmStatic fun of(value: String) = AgenticPlus(JsonField.of(value))
        }

        /** An enum containing [AgenticPlus]'s known values. */
        enum class Known {
            _2026_08_19,
            _2026_07_08,
            _2026_06_18,
            _2026_06_11,
            _2026_06_04,
            _2026_06_01,
            _2026_05_26,
            _2026_05_21,
            _2026_05_20,
            _2026_05_19,
            _2026_05_11,
            _2026_05_06,
            _2026_05_04,
            _2026_05_01,
            _2026_04_27,
            _2026_04_19,
            _2026_04_14,
            _2026_04_09,
            _2026_04_02,
            _2026_03_31,
            _2026_03_26,
            _2026_03_25,
            _2026_03_22,
            _2026_03_20,
            _2026_03_17,
            _2026_03_12,
            _2026_03_10,
            _2026_03_09,
            _2026_03_02,
            _2026_02_26,
            _2026_02_24,
            _2026_01_30,
            _2026_01_29,
            _2026_01_24,
            _2026_01_22,
            _2026_01_21,
            _2026_01_16,
            _2025_12_31,
            _2025_12_18,
            _2025_12_11,
        }

        /**
         * An enum containing [AgenticPlus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AgenticPlus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _2026_08_19,
            _2026_07_08,
            _2026_06_18,
            _2026_06_11,
            _2026_06_04,
            _2026_06_01,
            _2026_05_26,
            _2026_05_21,
            _2026_05_20,
            _2026_05_19,
            _2026_05_11,
            _2026_05_06,
            _2026_05_04,
            _2026_05_01,
            _2026_04_27,
            _2026_04_19,
            _2026_04_14,
            _2026_04_09,
            _2026_04_02,
            _2026_03_31,
            _2026_03_26,
            _2026_03_25,
            _2026_03_22,
            _2026_03_20,
            _2026_03_17,
            _2026_03_12,
            _2026_03_10,
            _2026_03_09,
            _2026_03_02,
            _2026_02_26,
            _2026_02_24,
            _2026_01_30,
            _2026_01_29,
            _2026_01_24,
            _2026_01_22,
            _2026_01_21,
            _2026_01_16,
            _2025_12_31,
            _2025_12_18,
            _2025_12_11,
            /**
             * An enum member indicating that [AgenticPlus] was instantiated with an unknown value.
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
                _2026_08_19 -> Value._2026_08_19
                _2026_07_08 -> Value._2026_07_08
                _2026_06_18 -> Value._2026_06_18
                _2026_06_11 -> Value._2026_06_11
                _2026_06_04 -> Value._2026_06_04
                _2026_06_01 -> Value._2026_06_01
                _2026_05_26 -> Value._2026_05_26
                _2026_05_21 -> Value._2026_05_21
                _2026_05_20 -> Value._2026_05_20
                _2026_05_19 -> Value._2026_05_19
                _2026_05_11 -> Value._2026_05_11
                _2026_05_06 -> Value._2026_05_06
                _2026_05_04 -> Value._2026_05_04
                _2026_05_01 -> Value._2026_05_01
                _2026_04_27 -> Value._2026_04_27
                _2026_04_19 -> Value._2026_04_19
                _2026_04_14 -> Value._2026_04_14
                _2026_04_09 -> Value._2026_04_09
                _2026_04_02 -> Value._2026_04_02
                _2026_03_31 -> Value._2026_03_31
                _2026_03_26 -> Value._2026_03_26
                _2026_03_25 -> Value._2026_03_25
                _2026_03_22 -> Value._2026_03_22
                _2026_03_20 -> Value._2026_03_20
                _2026_03_17 -> Value._2026_03_17
                _2026_03_12 -> Value._2026_03_12
                _2026_03_10 -> Value._2026_03_10
                _2026_03_09 -> Value._2026_03_09
                _2026_03_02 -> Value._2026_03_02
                _2026_02_26 -> Value._2026_02_26
                _2026_02_24 -> Value._2026_02_24
                _2026_01_30 -> Value._2026_01_30
                _2026_01_29 -> Value._2026_01_29
                _2026_01_24 -> Value._2026_01_24
                _2026_01_22 -> Value._2026_01_22
                _2026_01_21 -> Value._2026_01_21
                _2026_01_16 -> Value._2026_01_16
                _2025_12_31 -> Value._2025_12_31
                _2025_12_18 -> Value._2025_12_18
                _2025_12_11 -> Value._2025_12_11
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
                _2026_08_19 -> Known._2026_08_19
                _2026_07_08 -> Known._2026_07_08
                _2026_06_18 -> Known._2026_06_18
                _2026_06_11 -> Known._2026_06_11
                _2026_06_04 -> Known._2026_06_04
                _2026_06_01 -> Known._2026_06_01
                _2026_05_26 -> Known._2026_05_26
                _2026_05_21 -> Known._2026_05_21
                _2026_05_20 -> Known._2026_05_20
                _2026_05_19 -> Known._2026_05_19
                _2026_05_11 -> Known._2026_05_11
                _2026_05_06 -> Known._2026_05_06
                _2026_05_04 -> Known._2026_05_04
                _2026_05_01 -> Known._2026_05_01
                _2026_04_27 -> Known._2026_04_27
                _2026_04_19 -> Known._2026_04_19
                _2026_04_14 -> Known._2026_04_14
                _2026_04_09 -> Known._2026_04_09
                _2026_04_02 -> Known._2026_04_02
                _2026_03_31 -> Known._2026_03_31
                _2026_03_26 -> Known._2026_03_26
                _2026_03_25 -> Known._2026_03_25
                _2026_03_22 -> Known._2026_03_22
                _2026_03_20 -> Known._2026_03_20
                _2026_03_17 -> Known._2026_03_17
                _2026_03_12 -> Known._2026_03_12
                _2026_03_10 -> Known._2026_03_10
                _2026_03_09 -> Known._2026_03_09
                _2026_03_02 -> Known._2026_03_02
                _2026_02_26 -> Known._2026_02_26
                _2026_02_24 -> Known._2026_02_24
                _2026_01_30 -> Known._2026_01_30
                _2026_01_29 -> Known._2026_01_29
                _2026_01_24 -> Known._2026_01_24
                _2026_01_22 -> Known._2026_01_22
                _2026_01_21 -> Known._2026_01_21
                _2026_01_16 -> Known._2026_01_16
                _2025_12_31 -> Known._2025_12_31
                _2025_12_18 -> Known._2025_12_18
                _2025_12_11 -> Known._2025_12_11
                else -> throw LlamaCloudInvalidDataException("Unknown AgenticPlus: $value")
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
        fun validate(): AgenticPlus = apply {
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

            return other is AgenticPlus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class CostEffective @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val _2026_08_19 = of("2026-08-19")

            @JvmField val _2026_08_11 = of("2026-08-11")

            @JvmField val _2026_08_08 = of("2026-08-08")

            @JvmField val _2026_07_23 = of("2026-07-23")

            @JvmField val _2026_06_26 = of("2026-06-26")

            @JvmField val _2026_06_18 = of("2026-06-18")

            @JvmField val _2026_06_17 = of("2026-06-17")

            @JvmField val _2026_06_11 = of("2026-06-11")

            @JvmField val _2026_06_08 = of("2026-06-08")

            @JvmField val _2026_06_05 = of("2026-06-05")

            @JvmField val _2026_05_28 = of("2026-05-28")

            @JvmField val _2026_04_09 = of("2026-04-09")

            @JvmField val _2026_03_31 = of("2026-03-31")

            @JvmField val _2026_03_27 = of("2026-03-27")

            @JvmField val _2026_03_25 = of("2026-03-25")

            @JvmStatic fun of(value: String) = CostEffective(JsonField.of(value))
        }

        /** An enum containing [CostEffective]'s known values. */
        enum class Known {
            _2026_08_19,
            _2026_08_11,
            _2026_08_08,
            _2026_07_23,
            _2026_06_26,
            _2026_06_18,
            _2026_06_17,
            _2026_06_11,
            _2026_06_08,
            _2026_06_05,
            _2026_05_28,
            _2026_04_09,
            _2026_03_31,
            _2026_03_27,
            _2026_03_25,
        }

        /**
         * An enum containing [CostEffective]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CostEffective] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _2026_08_19,
            _2026_08_11,
            _2026_08_08,
            _2026_07_23,
            _2026_06_26,
            _2026_06_18,
            _2026_06_17,
            _2026_06_11,
            _2026_06_08,
            _2026_06_05,
            _2026_05_28,
            _2026_04_09,
            _2026_03_31,
            _2026_03_27,
            _2026_03_25,
            /**
             * An enum member indicating that [CostEffective] was instantiated with an unknown
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
                _2026_08_19 -> Value._2026_08_19
                _2026_08_11 -> Value._2026_08_11
                _2026_08_08 -> Value._2026_08_08
                _2026_07_23 -> Value._2026_07_23
                _2026_06_26 -> Value._2026_06_26
                _2026_06_18 -> Value._2026_06_18
                _2026_06_17 -> Value._2026_06_17
                _2026_06_11 -> Value._2026_06_11
                _2026_06_08 -> Value._2026_06_08
                _2026_06_05 -> Value._2026_06_05
                _2026_05_28 -> Value._2026_05_28
                _2026_04_09 -> Value._2026_04_09
                _2026_03_31 -> Value._2026_03_31
                _2026_03_27 -> Value._2026_03_27
                _2026_03_25 -> Value._2026_03_25
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
                _2026_08_19 -> Known._2026_08_19
                _2026_08_11 -> Known._2026_08_11
                _2026_08_08 -> Known._2026_08_08
                _2026_07_23 -> Known._2026_07_23
                _2026_06_26 -> Known._2026_06_26
                _2026_06_18 -> Known._2026_06_18
                _2026_06_17 -> Known._2026_06_17
                _2026_06_11 -> Known._2026_06_11
                _2026_06_08 -> Known._2026_06_08
                _2026_06_05 -> Known._2026_06_05
                _2026_05_28 -> Known._2026_05_28
                _2026_04_09 -> Known._2026_04_09
                _2026_03_31 -> Known._2026_03_31
                _2026_03_27 -> Known._2026_03_27
                _2026_03_25 -> Known._2026_03_25
                else -> throw LlamaCloudInvalidDataException("Unknown CostEffective: $value")
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
        fun validate(): CostEffective = apply {
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

            return other is CostEffective && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Fast @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val _2026_06_15 = of("2026-06-15")

            @JvmField val _2025_12_11 = of("2025-12-11")

            @JvmStatic fun of(value: String) = Fast(JsonField.of(value))
        }

        /** An enum containing [Fast]'s known values. */
        enum class Known {
            _2026_06_15,
            _2025_12_11,
        }

        /**
         * An enum containing [Fast]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Fast] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _2026_06_15,
            _2025_12_11,
            /** An enum member indicating that [Fast] was instantiated with an unknown value. */
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
                _2026_06_15 -> Value._2026_06_15
                _2025_12_11 -> Value._2025_12_11
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
                _2026_06_15 -> Known._2026_06_15
                _2025_12_11 -> Known._2025_12_11
                else -> throw LlamaCloudInvalidDataException("Unknown Fast: $value")
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
        fun validate(): Fast = apply {
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

            return other is Fast && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Version `latest` currently resolves to, per tier */
    class Latest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agentic: JsonField<String>,
        private val agenticPlus: JsonField<String>,
        private val costEffective: JsonField<String>,
        private val fast: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agentic") @ExcludeMissing agentic: JsonField<String> = JsonMissing.of(),
            @JsonProperty("agentic_plus")
            @ExcludeMissing
            agenticPlus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cost_effective")
            @ExcludeMissing
            costEffective: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fast") @ExcludeMissing fast: JsonField<String> = JsonMissing.of(),
        ) : this(agentic, agenticPlus, costEffective, fast, mutableMapOf())

        /**
         * Version `latest` resolves to for the agentic tier
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agentic(): String = agentic.getRequired("agentic")

        /**
         * Version `latest` resolves to for the agentic_plus tier
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agenticPlus(): String = agenticPlus.getRequired("agentic_plus")

        /**
         * Version `latest` resolves to for the cost_effective tier
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun costEffective(): String = costEffective.getRequired("cost_effective")

        /**
         * Version `latest` resolves to for the fast tier
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fast(): String = fast.getRequired("fast")

        /**
         * Returns the raw JSON value of [agentic].
         *
         * Unlike [agentic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agentic") @ExcludeMissing fun _agentic(): JsonField<String> = agentic

        /**
         * Returns the raw JSON value of [agenticPlus].
         *
         * Unlike [agenticPlus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agentic_plus")
        @ExcludeMissing
        fun _agenticPlus(): JsonField<String> = agenticPlus

        /**
         * Returns the raw JSON value of [costEffective].
         *
         * Unlike [costEffective], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cost_effective")
        @ExcludeMissing
        fun _costEffective(): JsonField<String> = costEffective

        /**
         * Returns the raw JSON value of [fast].
         *
         * Unlike [fast], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fast") @ExcludeMissing fun _fast(): JsonField<String> = fast

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
             * Returns a mutable builder for constructing an instance of [Latest].
             *
             * The following fields are required:
             * ```java
             * .agentic()
             * .agenticPlus()
             * .costEffective()
             * .fast()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Latest]. */
        class Builder internal constructor() {

            private var agentic: JsonField<String>? = null
            private var agenticPlus: JsonField<String>? = null
            private var costEffective: JsonField<String>? = null
            private var fast: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(latest: Latest) = apply {
                agentic = latest.agentic
                agenticPlus = latest.agenticPlus
                costEffective = latest.costEffective
                fast = latest.fast
                additionalProperties = latest.additionalProperties.toMutableMap()
            }

            /** Version `latest` resolves to for the agentic tier */
            fun agentic(agentic: String) = agentic(JsonField.of(agentic))

            /**
             * Sets [Builder.agentic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentic] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentic(agentic: JsonField<String>) = apply { this.agentic = agentic }

            /** Version `latest` resolves to for the agentic_plus tier */
            fun agenticPlus(agenticPlus: String) = agenticPlus(JsonField.of(agenticPlus))

            /**
             * Sets [Builder.agenticPlus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agenticPlus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agenticPlus(agenticPlus: JsonField<String>) = apply {
                this.agenticPlus = agenticPlus
            }

            /** Version `latest` resolves to for the cost_effective tier */
            fun costEffective(costEffective: String) = costEffective(JsonField.of(costEffective))

            /**
             * Sets [Builder.costEffective] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costEffective] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun costEffective(costEffective: JsonField<String>) = apply {
                this.costEffective = costEffective
            }

            /** Version `latest` resolves to for the fast tier */
            fun fast(fast: String) = fast(JsonField.of(fast))

            /**
             * Sets [Builder.fast] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fast] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fast(fast: JsonField<String>) = apply { this.fast = fast }

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
             * Returns an immutable instance of [Latest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .agentic()
             * .agenticPlus()
             * .costEffective()
             * .fast()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Latest =
                Latest(
                    checkRequired("agentic", agentic),
                    checkRequired("agenticPlus", agenticPlus),
                    checkRequired("costEffective", costEffective),
                    checkRequired("fast", fast),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Latest = apply {
            if (validated) {
                return@apply
            }

            agentic()
            agenticPlus()
            costEffective()
            fast()
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
            (if (agentic.asKnown().isPresent) 1 else 0) +
                (if (agenticPlus.asKnown().isPresent) 1 else 0) +
                (if (costEffective.asKnown().isPresent) 1 else 0) +
                (if (fast.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Latest &&
                agentic == other.agentic &&
                agenticPlus == other.agenticPlus &&
                costEffective == other.costEffective &&
                fast == other.fast &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(agentic, agenticPlus, costEffective, fast, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Latest{agentic=$agentic, agenticPlus=$agenticPlus, costEffective=$costEffective, fast=$fast, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParsingListVersionsResponse &&
            agentic == other.agentic &&
            agenticPlus == other.agenticPlus &&
            costEffective == other.costEffective &&
            fast == other.fast &&
            latest == other.latest &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(agentic, agenticPlus, costEffective, fast, latest, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParsingListVersionsResponse{agentic=$agentic, agenticPlus=$agenticPlus, costEffective=$costEffective, fast=$fast, latest=$latest, additionalProperties=$additionalProperties}"
}
