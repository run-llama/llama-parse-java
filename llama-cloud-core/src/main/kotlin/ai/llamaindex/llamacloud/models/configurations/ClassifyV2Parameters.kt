// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.configurations

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Typed parameters for a *classify v2* product configuration. */
class ClassifyV2Parameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val productType: JsonValue,
    private val rules: JsonField<List<Rule>>,
    private val mode: JsonField<Mode>,
    private val parsingConfiguration: JsonField<ParsingConfiguration>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("product_type") @ExcludeMissing productType: JsonValue = JsonMissing.of(),
        @JsonProperty("rules") @ExcludeMissing rules: JsonField<List<Rule>> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        @JsonProperty("parsing_configuration")
        @ExcludeMissing
        parsingConfiguration: JsonField<ParsingConfiguration> = JsonMissing.of(),
    ) : this(productType, rules, mode, parsingConfiguration, mutableMapOf())

    /**
     * Product type.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("classify_v2")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("product_type") @ExcludeMissing fun _productType(): JsonValue = productType

    /**
     * Classify rules to evaluate against the document (at least one required)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rules(): List<Rule> = rules.getRequired("rules")

    /**
     * Classify execution mode
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = mode.getOptional("mode")

    /**
     * Parsing configuration for classify jobs.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parsingConfiguration(): Optional<ParsingConfiguration> =
        parsingConfiguration.getOptional("parsing_configuration")

    /**
     * Returns the raw JSON value of [rules].
     *
     * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<Rule>> = rules

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

    /**
     * Returns the raw JSON value of [parsingConfiguration].
     *
     * Unlike [parsingConfiguration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parsing_configuration")
    @ExcludeMissing
    fun _parsingConfiguration(): JsonField<ParsingConfiguration> = parsingConfiguration

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
         * Returns a mutable builder for constructing an instance of [ClassifyV2Parameters].
         *
         * The following fields are required:
         * ```java
         * .rules()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClassifyV2Parameters]. */
    class Builder internal constructor() {

        private var productType: JsonValue = JsonValue.from("classify_v2")
        private var rules: JsonField<MutableList<Rule>>? = null
        private var mode: JsonField<Mode> = JsonMissing.of()
        private var parsingConfiguration: JsonField<ParsingConfiguration> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(classifyV2Parameters: ClassifyV2Parameters) = apply {
            productType = classifyV2Parameters.productType
            rules = classifyV2Parameters.rules.map { it.toMutableList() }
            mode = classifyV2Parameters.mode
            parsingConfiguration = classifyV2Parameters.parsingConfiguration
            additionalProperties = classifyV2Parameters.additionalProperties.toMutableMap()
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("classify_v2")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productType(productType: JsonValue) = apply { this.productType = productType }

        /** Classify rules to evaluate against the document (at least one required) */
        fun rules(rules: List<Rule>) = rules(JsonField.of(rules))

        /**
         * Sets [Builder.rules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rules] with a well-typed `List<Rule>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rules(rules: JsonField<List<Rule>>) = apply {
            this.rules = rules.map { it.toMutableList() }
        }

        /**
         * Adds a single [Rule] to [rules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRule(rule: Rule) = apply {
            rules =
                (rules ?: JsonField.of(mutableListOf())).also { checkKnown("rules", it).add(rule) }
        }

        /** Classify execution mode */
        fun mode(mode: Mode) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

        /** Parsing configuration for classify jobs. */
        fun parsingConfiguration(parsingConfiguration: ParsingConfiguration?) =
            parsingConfiguration(JsonField.ofNullable(parsingConfiguration))

        /**
         * Alias for calling [Builder.parsingConfiguration] with
         * `parsingConfiguration.orElse(null)`.
         */
        fun parsingConfiguration(parsingConfiguration: Optional<ParsingConfiguration>) =
            parsingConfiguration(parsingConfiguration.getOrNull())

        /**
         * Sets [Builder.parsingConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parsingConfiguration] with a well-typed
         * [ParsingConfiguration] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun parsingConfiguration(parsingConfiguration: JsonField<ParsingConfiguration>) = apply {
            this.parsingConfiguration = parsingConfiguration
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
         * Returns an immutable instance of [ClassifyV2Parameters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .rules()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClassifyV2Parameters =
            ClassifyV2Parameters(
                productType,
                checkRequired("rules", rules).map { it.toImmutable() },
                mode,
                parsingConfiguration,
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
    fun validate(): ClassifyV2Parameters = apply {
        if (validated) {
            return@apply
        }

        _productType().let {
            if (it != JsonValue.from("classify_v2")) {
                throw LlamaCloudInvalidDataException("'productType' is invalid, received $it")
            }
        }
        rules().forEach { it.validate() }
        mode().ifPresent { it.validate() }
        parsingConfiguration().ifPresent { it.validate() }
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
        productType.let { if (it == JsonValue.from("classify_v2")) 1 else 0 } +
            (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (mode.asKnown().getOrNull()?.validity() ?: 0) +
            (parsingConfiguration.asKnown().getOrNull()?.validity() ?: 0)

    /** A rule for classifying documents. */
    class Rule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(description, type, mutableMapOf())

        /**
         * Natural language criteria for matching this rule
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * Document type to assign when rule matches
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
             * Returns a mutable builder for constructing an instance of [Rule].
             *
             * The following fields are required:
             * ```java
             * .description()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rule]. */
        class Builder internal constructor() {

            private var description: JsonField<String>? = null
            private var type: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rule: Rule) = apply {
                description = rule.description
                type = rule.type
                additionalProperties = rule.additionalProperties.toMutableMap()
            }

            /** Natural language criteria for matching this rule */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Document type to assign when rule matches */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Rule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .description()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Rule =
                Rule(
                    checkRequired("description", description),
                    checkRequired("type", type),
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
        fun validate(): Rule = apply {
            if (validated) {
                return@apply
            }

            description()
            type()
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
            (if (description.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rule &&
                description == other.description &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(description, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rule{description=$description, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Classify execution mode */
    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FAST = of("FAST")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            FAST
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAST,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                FAST -> Value.FAST
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
                FAST -> Known.FAST
                else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
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
        fun validate(): Mode = apply {
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Parsing configuration for classify jobs. */
    class ParsingConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val lang: JsonField<String>,
        private val maxPages: JsonField<Long>,
        private val targetPages: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("lang") @ExcludeMissing lang: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_pages") @ExcludeMissing maxPages: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("target_pages")
            @ExcludeMissing
            targetPages: JsonField<String> = JsonMissing.of(),
        ) : this(lang, maxPages, targetPages, mutableMapOf())

        /**
         * ISO 639-1 language code for the document
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lang(): Optional<String> = lang.getOptional("lang")

        /**
         * Maximum number of pages to process. Omit for no limit.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxPages(): Optional<Long> = maxPages.getOptional("max_pages")

        /**
         * Comma-separated page numbers or ranges to process (1-based). Omit to process all pages.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun targetPages(): Optional<String> = targetPages.getOptional("target_pages")

        /**
         * Returns the raw JSON value of [lang].
         *
         * Unlike [lang], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lang") @ExcludeMissing fun _lang(): JsonField<String> = lang

        /**
         * Returns the raw JSON value of [maxPages].
         *
         * Unlike [maxPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_pages") @ExcludeMissing fun _maxPages(): JsonField<Long> = maxPages

        /**
         * Returns the raw JSON value of [targetPages].
         *
         * Unlike [targetPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target_pages")
        @ExcludeMissing
        fun _targetPages(): JsonField<String> = targetPages

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

            /** Returns a mutable builder for constructing an instance of [ParsingConfiguration]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ParsingConfiguration]. */
        class Builder internal constructor() {

            private var lang: JsonField<String> = JsonMissing.of()
            private var maxPages: JsonField<Long> = JsonMissing.of()
            private var targetPages: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parsingConfiguration: ParsingConfiguration) = apply {
                lang = parsingConfiguration.lang
                maxPages = parsingConfiguration.maxPages
                targetPages = parsingConfiguration.targetPages
                additionalProperties = parsingConfiguration.additionalProperties.toMutableMap()
            }

            /** ISO 639-1 language code for the document */
            fun lang(lang: String) = lang(JsonField.of(lang))

            /**
             * Sets [Builder.lang] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lang] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lang(lang: JsonField<String>) = apply { this.lang = lang }

            /** Maximum number of pages to process. Omit for no limit. */
            fun maxPages(maxPages: Long?) = maxPages(JsonField.ofNullable(maxPages))

            /**
             * Alias for [Builder.maxPages].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxPages(maxPages: Long) = maxPages(maxPages as Long?)

            /** Alias for calling [Builder.maxPages] with `maxPages.orElse(null)`. */
            fun maxPages(maxPages: Optional<Long>) = maxPages(maxPages.getOrNull())

            /**
             * Sets [Builder.maxPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxPages] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxPages(maxPages: JsonField<Long>) = apply { this.maxPages = maxPages }

            /**
             * Comma-separated page numbers or ranges to process (1-based). Omit to process all
             * pages.
             */
            fun targetPages(targetPages: String?) = targetPages(JsonField.ofNullable(targetPages))

            /** Alias for calling [Builder.targetPages] with `targetPages.orElse(null)`. */
            fun targetPages(targetPages: Optional<String>) = targetPages(targetPages.getOrNull())

            /**
             * Sets [Builder.targetPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetPages] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetPages(targetPages: JsonField<String>) = apply {
                this.targetPages = targetPages
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
             * Returns an immutable instance of [ParsingConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ParsingConfiguration =
                ParsingConfiguration(
                    lang,
                    maxPages,
                    targetPages,
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
        fun validate(): ParsingConfiguration = apply {
            if (validated) {
                return@apply
            }

            lang()
            maxPages()
            targetPages()
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
            (if (lang.asKnown().isPresent) 1 else 0) +
                (if (maxPages.asKnown().isPresent) 1 else 0) +
                (if (targetPages.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ParsingConfiguration &&
                lang == other.lang &&
                maxPages == other.maxPages &&
                targetPages == other.targetPages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(lang, maxPages, targetPages, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ParsingConfiguration{lang=$lang, maxPages=$maxPages, targetPages=$targetPages, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClassifyV2Parameters &&
            productType == other.productType &&
            rules == other.rules &&
            mode == other.mode &&
            parsingConfiguration == other.parsingConfiguration &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(productType, rules, mode, parsingConfiguration, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClassifyV2Parameters{productType=$productType, rules=$rules, mode=$mode, parsingConfiguration=$parsingConfiguration, additionalProperties=$additionalProperties}"
}
