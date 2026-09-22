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
import ai.llamaindex.llamacloud.models.beta.split.SplitCategory
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Typed parameters for a *split v1* product configuration. */
class SplitV1Parameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val categories: JsonField<List<SplitCategory>>,
    private val productType: JsonValue,
    private val parseConfigId: JsonField<String>,
    private val parseTier: JsonField<ParseTier>,
    private val splittingStrategy: JsonField<SplittingStrategy>,
    private val targetPages: JsonField<String>,
    private val version: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<List<SplitCategory>> = JsonMissing.of(),
        @JsonProperty("product_type") @ExcludeMissing productType: JsonValue = JsonMissing.of(),
        @JsonProperty("parse_config_id")
        @ExcludeMissing
        parseConfigId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parse_tier")
        @ExcludeMissing
        parseTier: JsonField<ParseTier> = JsonMissing.of(),
        @JsonProperty("splitting_strategy")
        @ExcludeMissing
        splittingStrategy: JsonField<SplittingStrategy> = JsonMissing.of(),
        @JsonProperty("target_pages")
        @ExcludeMissing
        targetPages: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
    ) : this(
        categories,
        productType,
        parseConfigId,
        parseTier,
        splittingStrategy,
        targetPages,
        version,
        mutableMapOf(),
    )

    /**
     * Categories to split documents into.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun categories(): List<SplitCategory> = categories.getRequired("categories")

    /**
     * Product type.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("split_v1")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("product_type") @ExcludeMissing fun _productType(): JsonValue = productType

    /**
     * Saved parse configuration ID to control how the document is parsed before splitting. Takes
     * precedence over parse_tier. Configurations that restrict pages (`target_pages` or `max_pages`
     * on the parse configuration) are rejected: split results number pages relative to the full
     * document. Ignored when a completed parse job is supplied as file_input.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parseConfigId(): Optional<String> = parseConfigId.getOptional("parse_config_id")

    /**
     * Parse tier used to read the document before splitting. Defaults to fast. Ignored when a
     * completed parse job is supplied as file_input.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parseTier(): Optional<ParseTier> = parseTier.getOptional("parse_tier")

    /**
     * Strategy for splitting documents.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun splittingStrategy(): Optional<SplittingStrategy> =
        splittingStrategy.getOptional("splitting_strategy")

    /**
     * Comma-separated page numbers or ranges to split (1-based). Omit to split all pages. Requires
     * a completed parse job as file_input.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetPages(): Optional<String> = targetPages.getOptional("target_pages")

    /**
     * Split version to run. Omit for the current release. Preview versions are selectable by name
     * and never resolved automatically.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<String> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<List<SplitCategory>> = categories

    /**
     * Returns the raw JSON value of [parseConfigId].
     *
     * Unlike [parseConfigId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parse_config_id")
    @ExcludeMissing
    fun _parseConfigId(): JsonField<String> = parseConfigId

    /**
     * Returns the raw JSON value of [parseTier].
     *
     * Unlike [parseTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parse_tier") @ExcludeMissing fun _parseTier(): JsonField<ParseTier> = parseTier

    /**
     * Returns the raw JSON value of [splittingStrategy].
     *
     * Unlike [splittingStrategy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("splitting_strategy")
    @ExcludeMissing
    fun _splittingStrategy(): JsonField<SplittingStrategy> = splittingStrategy

    /**
     * Returns the raw JSON value of [targetPages].
     *
     * Unlike [targetPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_pages")
    @ExcludeMissing
    fun _targetPages(): JsonField<String> = targetPages

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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
         * Returns a mutable builder for constructing an instance of [SplitV1Parameters].
         *
         * The following fields are required:
         * ```java
         * .categories()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SplitV1Parameters]. */
    class Builder internal constructor() {

        private var categories: JsonField<MutableList<SplitCategory>>? = null
        private var productType: JsonValue = JsonValue.from("split_v1")
        private var parseConfigId: JsonField<String> = JsonMissing.of()
        private var parseTier: JsonField<ParseTier> = JsonMissing.of()
        private var splittingStrategy: JsonField<SplittingStrategy> = JsonMissing.of()
        private var targetPages: JsonField<String> = JsonMissing.of()
        private var version: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(splitV1Parameters: SplitV1Parameters) = apply {
            categories = splitV1Parameters.categories.map { it.toMutableList() }
            productType = splitV1Parameters.productType
            parseConfigId = splitV1Parameters.parseConfigId
            parseTier = splitV1Parameters.parseTier
            splittingStrategy = splitV1Parameters.splittingStrategy
            targetPages = splitV1Parameters.targetPages
            version = splitV1Parameters.version
            additionalProperties = splitV1Parameters.additionalProperties.toMutableMap()
        }

        /** Categories to split documents into. */
        fun categories(categories: List<SplitCategory>) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed `List<SplitCategory>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun categories(categories: JsonField<List<SplitCategory>>) = apply {
            this.categories = categories.map { it.toMutableList() }
        }

        /**
         * Adds a single [SplitCategory] to [categories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: SplitCategory) = apply {
            categories =
                (categories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("categories", it).add(category)
                }
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("split_v1")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productType(productType: JsonValue) = apply { this.productType = productType }

        /**
         * Saved parse configuration ID to control how the document is parsed before splitting.
         * Takes precedence over parse_tier. Configurations that restrict pages (`target_pages` or
         * `max_pages` on the parse configuration) are rejected: split results number pages relative
         * to the full document. Ignored when a completed parse job is supplied as file_input.
         */
        fun parseConfigId(parseConfigId: String?) =
            parseConfigId(JsonField.ofNullable(parseConfigId))

        /** Alias for calling [Builder.parseConfigId] with `parseConfigId.orElse(null)`. */
        fun parseConfigId(parseConfigId: Optional<String>) =
            parseConfigId(parseConfigId.getOrNull())

        /**
         * Sets [Builder.parseConfigId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parseConfigId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parseConfigId(parseConfigId: JsonField<String>) = apply {
            this.parseConfigId = parseConfigId
        }

        /**
         * Parse tier used to read the document before splitting. Defaults to fast. Ignored when a
         * completed parse job is supplied as file_input.
         */
        fun parseTier(parseTier: ParseTier?) = parseTier(JsonField.ofNullable(parseTier))

        /** Alias for calling [Builder.parseTier] with `parseTier.orElse(null)`. */
        fun parseTier(parseTier: Optional<ParseTier>) = parseTier(parseTier.getOrNull())

        /**
         * Sets [Builder.parseTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parseTier] with a well-typed [ParseTier] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parseTier(parseTier: JsonField<ParseTier>) = apply { this.parseTier = parseTier }

        /** Strategy for splitting documents. */
        fun splittingStrategy(splittingStrategy: SplittingStrategy) =
            splittingStrategy(JsonField.of(splittingStrategy))

        /**
         * Sets [Builder.splittingStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.splittingStrategy] with a well-typed [SplittingStrategy]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun splittingStrategy(splittingStrategy: JsonField<SplittingStrategy>) = apply {
            this.splittingStrategy = splittingStrategy
        }

        /**
         * Comma-separated page numbers or ranges to split (1-based). Omit to split all pages.
         * Requires a completed parse job as file_input.
         */
        fun targetPages(targetPages: String?) = targetPages(JsonField.ofNullable(targetPages))

        /** Alias for calling [Builder.targetPages] with `targetPages.orElse(null)`. */
        fun targetPages(targetPages: Optional<String>) = targetPages(targetPages.getOrNull())

        /**
         * Sets [Builder.targetPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetPages] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetPages(targetPages: JsonField<String>) = apply { this.targetPages = targetPages }

        /**
         * Split version to run. Omit for the current release. Preview versions are selectable by
         * name and never resolved automatically.
         */
        fun version(version: String?) = version(JsonField.ofNullable(version))

        /** Alias for calling [Builder.version] with `version.orElse(null)`. */
        fun version(version: Optional<String>) = version(version.getOrNull())

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

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
         * Returns an immutable instance of [SplitV1Parameters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .categories()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SplitV1Parameters =
            SplitV1Parameters(
                checkRequired("categories", categories).map { it.toImmutable() },
                productType,
                parseConfigId,
                parseTier,
                splittingStrategy,
                targetPages,
                version,
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
    fun validate(): SplitV1Parameters = apply {
        if (validated) {
            return@apply
        }

        categories().forEach { it.validate() }
        _productType().let {
            if (it != JsonValue.from("split_v1")) {
                throw LlamaCloudInvalidDataException("'productType' is invalid, received $it")
            }
        }
        parseConfigId()
        parseTier().ifPresent { it.validate() }
        splittingStrategy().ifPresent { it.validate() }
        targetPages()
        version()
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
        (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            productType.let { if (it == JsonValue.from("split_v1")) 1 else 0 } +
            (if (parseConfigId.asKnown().isPresent) 1 else 0) +
            (parseTier.asKnown().getOrNull()?.validity() ?: 0) +
            (splittingStrategy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (targetPages.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /**
     * Parse tier used to read the document before splitting. Defaults to fast. Ignored when a
     * completed parse job is supplied as file_input.
     */
    class ParseTier @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AGENTIC = of("agentic")

            @JvmField val AGENTIC_PLUS = of("agentic_plus")

            @JvmField val COST_EFFECTIVE = of("cost_effective")

            @JvmField val FAST = of("fast")

            @JvmStatic fun of(value: String) = ParseTier(JsonField.of(value))
        }

        /** An enum containing [ParseTier]'s known values. */
        enum class Known {
            AGENTIC,
            AGENTIC_PLUS,
            COST_EFFECTIVE,
            FAST,
        }

        /**
         * An enum containing [ParseTier]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ParseTier] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AGENTIC,
            AGENTIC_PLUS,
            COST_EFFECTIVE,
            FAST,
            /**
             * An enum member indicating that [ParseTier] was instantiated with an unknown value.
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
                AGENTIC -> Value.AGENTIC
                AGENTIC_PLUS -> Value.AGENTIC_PLUS
                COST_EFFECTIVE -> Value.COST_EFFECTIVE
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
                AGENTIC -> Known.AGENTIC
                AGENTIC_PLUS -> Known.AGENTIC_PLUS
                COST_EFFECTIVE -> Known.COST_EFFECTIVE
                FAST -> Known.FAST
                else -> throw LlamaCloudInvalidDataException("Unknown ParseTier: $value")
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
        fun validate(): ParseTier = apply {
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

            return other is ParseTier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Strategy for splitting documents. */
    class SplittingStrategy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowUncategorized: JsonField<AllowUncategorized>,
        private val customInstructions: JsonField<String>,
        private val minPagesPerSplit: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allow_uncategorized")
            @ExcludeMissing
            allowUncategorized: JsonField<AllowUncategorized> = JsonMissing.of(),
            @JsonProperty("custom_instructions")
            @ExcludeMissing
            customInstructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("min_pages_per_split")
            @ExcludeMissing
            minPagesPerSplit: JsonField<Long> = JsonMissing.of(),
        ) : this(allowUncategorized, customInstructions, minPagesPerSplit, mutableMapOf())

        /**
         * Controls handling of pages that don't match any category. 'include': pages can be grouped
         * as 'uncategorized' and included in results. 'forbid': all pages must be assigned to a
         * defined category. 'omit': pages can be classified as 'uncategorized' but are excluded
         * from results.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun allowUncategorized(): Optional<AllowUncategorized> =
            allowUncategorized.getOptional("allow_uncategorized")

        /**
         * Free-form guidance for where segment boundaries are placed.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customInstructions(): Optional<String> =
            customInstructions.getOptional("custom_instructions")

        /**
         * Minimum pages per segment. Shorter segments are merged into an adjacent segment; 1
         * disables merging.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun minPagesPerSplit(): Optional<Long> = minPagesPerSplit.getOptional("min_pages_per_split")

        /**
         * Returns the raw JSON value of [allowUncategorized].
         *
         * Unlike [allowUncategorized], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_uncategorized")
        @ExcludeMissing
        fun _allowUncategorized(): JsonField<AllowUncategorized> = allowUncategorized

        /**
         * Returns the raw JSON value of [customInstructions].
         *
         * Unlike [customInstructions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("custom_instructions")
        @ExcludeMissing
        fun _customInstructions(): JsonField<String> = customInstructions

        /**
         * Returns the raw JSON value of [minPagesPerSplit].
         *
         * Unlike [minPagesPerSplit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("min_pages_per_split")
        @ExcludeMissing
        fun _minPagesPerSplit(): JsonField<Long> = minPagesPerSplit

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

            /** Returns a mutable builder for constructing an instance of [SplittingStrategy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SplittingStrategy]. */
        class Builder internal constructor() {

            private var allowUncategorized: JsonField<AllowUncategorized> = JsonMissing.of()
            private var customInstructions: JsonField<String> = JsonMissing.of()
            private var minPagesPerSplit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(splittingStrategy: SplittingStrategy) = apply {
                allowUncategorized = splittingStrategy.allowUncategorized
                customInstructions = splittingStrategy.customInstructions
                minPagesPerSplit = splittingStrategy.minPagesPerSplit
                additionalProperties = splittingStrategy.additionalProperties.toMutableMap()
            }

            /**
             * Controls handling of pages that don't match any category. 'include': pages can be
             * grouped as 'uncategorized' and included in results. 'forbid': all pages must be
             * assigned to a defined category. 'omit': pages can be classified as 'uncategorized'
             * but are excluded from results.
             */
            fun allowUncategorized(allowUncategorized: AllowUncategorized) =
                allowUncategorized(JsonField.of(allowUncategorized))

            /**
             * Sets [Builder.allowUncategorized] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowUncategorized] with a well-typed
             * [AllowUncategorized] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allowUncategorized(allowUncategorized: JsonField<AllowUncategorized>) = apply {
                this.allowUncategorized = allowUncategorized
            }

            /** Free-form guidance for where segment boundaries are placed. */
            fun customInstructions(customInstructions: String?) =
                customInstructions(JsonField.ofNullable(customInstructions))

            /**
             * Alias for calling [Builder.customInstructions] with
             * `customInstructions.orElse(null)`.
             */
            fun customInstructions(customInstructions: Optional<String>) =
                customInstructions(customInstructions.getOrNull())

            /**
             * Sets [Builder.customInstructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customInstructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customInstructions(customInstructions: JsonField<String>) = apply {
                this.customInstructions = customInstructions
            }

            /**
             * Minimum pages per segment. Shorter segments are merged into an adjacent segment; 1
             * disables merging.
             */
            fun minPagesPerSplit(minPagesPerSplit: Long) =
                minPagesPerSplit(JsonField.of(minPagesPerSplit))

            /**
             * Sets [Builder.minPagesPerSplit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minPagesPerSplit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minPagesPerSplit(minPagesPerSplit: JsonField<Long>) = apply {
                this.minPagesPerSplit = minPagesPerSplit
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
             * Returns an immutable instance of [SplittingStrategy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SplittingStrategy =
                SplittingStrategy(
                    allowUncategorized,
                    customInstructions,
                    minPagesPerSplit,
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
        fun validate(): SplittingStrategy = apply {
            if (validated) {
                return@apply
            }

            allowUncategorized().ifPresent { it.validate() }
            customInstructions()
            minPagesPerSplit()
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
            (allowUncategorized.asKnown().getOrNull()?.validity() ?: 0) +
                (if (customInstructions.asKnown().isPresent) 1 else 0) +
                (if (minPagesPerSplit.asKnown().isPresent) 1 else 0)

        /**
         * Controls handling of pages that don't match any category. 'include': pages can be grouped
         * as 'uncategorized' and included in results. 'forbid': all pages must be assigned to a
         * defined category. 'omit': pages can be classified as 'uncategorized' but are excluded
         * from results.
         */
        class AllowUncategorized
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FORBID = of("forbid")

                @JvmField val INCLUDE = of("include")

                @JvmField val OMIT = of("omit")

                @JvmStatic fun of(value: String) = AllowUncategorized(JsonField.of(value))
            }

            /** An enum containing [AllowUncategorized]'s known values. */
            enum class Known {
                FORBID,
                INCLUDE,
                OMIT,
            }

            /**
             * An enum containing [AllowUncategorized]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AllowUncategorized] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FORBID,
                INCLUDE,
                OMIT,
                /**
                 * An enum member indicating that [AllowUncategorized] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    FORBID -> Value.FORBID
                    INCLUDE -> Value.INCLUDE
                    OMIT -> Value.OMIT
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
                    FORBID -> Known.FORBID
                    INCLUDE -> Known.INCLUDE
                    OMIT -> Known.OMIT
                    else ->
                        throw LlamaCloudInvalidDataException("Unknown AllowUncategorized: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AllowUncategorized = apply {
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

                return other is AllowUncategorized && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SplittingStrategy &&
                allowUncategorized == other.allowUncategorized &&
                customInstructions == other.customInstructions &&
                minPagesPerSplit == other.minPagesPerSplit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowUncategorized,
                customInstructions,
                minPagesPerSplit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SplittingStrategy{allowUncategorized=$allowUncategorized, customInstructions=$customInstructions, minPagesPerSplit=$minPagesPerSplit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SplitV1Parameters &&
            categories == other.categories &&
            productType == other.productType &&
            parseConfigId == other.parseConfigId &&
            parseTier == other.parseTier &&
            splittingStrategy == other.splittingStrategy &&
            targetPages == other.targetPages &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            categories,
            productType,
            parseConfigId,
            parseTier,
            splittingStrategy,
            targetPages,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SplitV1Parameters{categories=$categories, productType=$productType, parseConfigId=$parseConfigId, parseTier=$parseTier, splittingStrategy=$splittingStrategy, targetPages=$targetPages, version=$version, additionalProperties=$additionalProperties}"
}
