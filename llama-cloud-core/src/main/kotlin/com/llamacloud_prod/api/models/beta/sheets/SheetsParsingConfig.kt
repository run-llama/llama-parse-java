// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.sheets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Configuration for spreadsheet parsing and region extraction */
class SheetsParsingConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val extractionRange: JsonField<String>,
    private val flattenHierarchicalTables: JsonField<Boolean>,
    private val generateAdditionalMetadata: JsonField<Boolean>,
    private val includeHiddenCells: JsonField<Boolean>,
    private val sheetNames: JsonField<List<String>>,
    private val specialization: JsonField<String>,
    private val tableMergeSensitivity: JsonField<TableMergeSensitivity>,
    private val useExperimentalProcessing: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("extraction_range")
        @ExcludeMissing
        extractionRange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("flatten_hierarchical_tables")
        @ExcludeMissing
        flattenHierarchicalTables: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("generate_additional_metadata")
        @ExcludeMissing
        generateAdditionalMetadata: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_hidden_cells")
        @ExcludeMissing
        includeHiddenCells: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sheet_names")
        @ExcludeMissing
        sheetNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("specialization")
        @ExcludeMissing
        specialization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("table_merge_sensitivity")
        @ExcludeMissing
        tableMergeSensitivity: JsonField<TableMergeSensitivity> = JsonMissing.of(),
        @JsonProperty("use_experimental_processing")
        @ExcludeMissing
        useExperimentalProcessing: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        extractionRange,
        flattenHierarchicalTables,
        generateAdditionalMetadata,
        includeHiddenCells,
        sheetNames,
        specialization,
        tableMergeSensitivity,
        useExperimentalProcessing,
        mutableMapOf(),
    )

    /**
     * A1 notation of the range to extract a single region from. If None, the entire sheet is used.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extractionRange(): Optional<String> = extractionRange.getOptional("extraction_range")

    /**
     * Return a flattened dataframe when a detected table is recognized as hierarchical.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun flattenHierarchicalTables(): Optional<Boolean> =
        flattenHierarchicalTables.getOptional("flatten_hierarchical_tables")

    /**
     * Whether to generate additional metadata (title, description) for each extracted region.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generateAdditionalMetadata(): Optional<Boolean> =
        generateAdditionalMetadata.getOptional("generate_additional_metadata")

    /**
     * Whether to include hidden cells when extracting regions from the spreadsheet.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeHiddenCells(): Optional<Boolean> =
        includeHiddenCells.getOptional("include_hidden_cells")

    /**
     * The names of the sheets to extract regions from. If empty, all sheets will be processed.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sheetNames(): Optional<List<String>> = sheetNames.getOptional("sheet_names")

    /**
     * Optional specialization mode for domain-specific extraction. Supported values:
     * 'financial-standard', 'financial-enhanced', 'financial-precise'. Default None uses the
     * general-purpose pipeline.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun specialization(): Optional<String> = specialization.getOptional("specialization")

    /**
     * Influences how likely similar-looking regions are merged into a single table. Useful for
     * spreadsheets that either have sparse tables (strong merging) or many distinct tables close
     * together (weak merging).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tableMergeSensitivity(): Optional<TableMergeSensitivity> =
        tableMergeSensitivity.getOptional("table_merge_sensitivity")

    /**
     * Enables experimental processing. Accuracy may be impacted.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useExperimentalProcessing(): Optional<Boolean> =
        useExperimentalProcessing.getOptional("use_experimental_processing")

    /**
     * Returns the raw JSON value of [extractionRange].
     *
     * Unlike [extractionRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extraction_range")
    @ExcludeMissing
    fun _extractionRange(): JsonField<String> = extractionRange

    /**
     * Returns the raw JSON value of [flattenHierarchicalTables].
     *
     * Unlike [flattenHierarchicalTables], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("flatten_hierarchical_tables")
    @ExcludeMissing
    fun _flattenHierarchicalTables(): JsonField<Boolean> = flattenHierarchicalTables

    /**
     * Returns the raw JSON value of [generateAdditionalMetadata].
     *
     * Unlike [generateAdditionalMetadata], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("generate_additional_metadata")
    @ExcludeMissing
    fun _generateAdditionalMetadata(): JsonField<Boolean> = generateAdditionalMetadata

    /**
     * Returns the raw JSON value of [includeHiddenCells].
     *
     * Unlike [includeHiddenCells], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("include_hidden_cells")
    @ExcludeMissing
    fun _includeHiddenCells(): JsonField<Boolean> = includeHiddenCells

    /**
     * Returns the raw JSON value of [sheetNames].
     *
     * Unlike [sheetNames], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sheet_names")
    @ExcludeMissing
    fun _sheetNames(): JsonField<List<String>> = sheetNames

    /**
     * Returns the raw JSON value of [specialization].
     *
     * Unlike [specialization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("specialization")
    @ExcludeMissing
    fun _specialization(): JsonField<String> = specialization

    /**
     * Returns the raw JSON value of [tableMergeSensitivity].
     *
     * Unlike [tableMergeSensitivity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("table_merge_sensitivity")
    @ExcludeMissing
    fun _tableMergeSensitivity(): JsonField<TableMergeSensitivity> = tableMergeSensitivity

    /**
     * Returns the raw JSON value of [useExperimentalProcessing].
     *
     * Unlike [useExperimentalProcessing], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("use_experimental_processing")
    @ExcludeMissing
    fun _useExperimentalProcessing(): JsonField<Boolean> = useExperimentalProcessing

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

        /** Returns a mutable builder for constructing an instance of [SheetsParsingConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SheetsParsingConfig]. */
    class Builder internal constructor() {

        private var extractionRange: JsonField<String> = JsonMissing.of()
        private var flattenHierarchicalTables: JsonField<Boolean> = JsonMissing.of()
        private var generateAdditionalMetadata: JsonField<Boolean> = JsonMissing.of()
        private var includeHiddenCells: JsonField<Boolean> = JsonMissing.of()
        private var sheetNames: JsonField<MutableList<String>>? = null
        private var specialization: JsonField<String> = JsonMissing.of()
        private var tableMergeSensitivity: JsonField<TableMergeSensitivity> = JsonMissing.of()
        private var useExperimentalProcessing: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sheetsParsingConfig: SheetsParsingConfig) = apply {
            extractionRange = sheetsParsingConfig.extractionRange
            flattenHierarchicalTables = sheetsParsingConfig.flattenHierarchicalTables
            generateAdditionalMetadata = sheetsParsingConfig.generateAdditionalMetadata
            includeHiddenCells = sheetsParsingConfig.includeHiddenCells
            sheetNames = sheetsParsingConfig.sheetNames.map { it.toMutableList() }
            specialization = sheetsParsingConfig.specialization
            tableMergeSensitivity = sheetsParsingConfig.tableMergeSensitivity
            useExperimentalProcessing = sheetsParsingConfig.useExperimentalProcessing
            additionalProperties = sheetsParsingConfig.additionalProperties.toMutableMap()
        }

        /**
         * A1 notation of the range to extract a single region from. If None, the entire sheet is
         * used.
         */
        fun extractionRange(extractionRange: String?) =
            extractionRange(JsonField.ofNullable(extractionRange))

        /** Alias for calling [Builder.extractionRange] with `extractionRange.orElse(null)`. */
        fun extractionRange(extractionRange: Optional<String>) =
            extractionRange(extractionRange.getOrNull())

        /**
         * Sets [Builder.extractionRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extractionRange] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extractionRange(extractionRange: JsonField<String>) = apply {
            this.extractionRange = extractionRange
        }

        /** Return a flattened dataframe when a detected table is recognized as hierarchical. */
        fun flattenHierarchicalTables(flattenHierarchicalTables: Boolean) =
            flattenHierarchicalTables(JsonField.of(flattenHierarchicalTables))

        /**
         * Sets [Builder.flattenHierarchicalTables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flattenHierarchicalTables] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun flattenHierarchicalTables(flattenHierarchicalTables: JsonField<Boolean>) = apply {
            this.flattenHierarchicalTables = flattenHierarchicalTables
        }

        /**
         * Whether to generate additional metadata (title, description) for each extracted region.
         */
        fun generateAdditionalMetadata(generateAdditionalMetadata: Boolean) =
            generateAdditionalMetadata(JsonField.of(generateAdditionalMetadata))

        /**
         * Sets [Builder.generateAdditionalMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generateAdditionalMetadata] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun generateAdditionalMetadata(generateAdditionalMetadata: JsonField<Boolean>) = apply {
            this.generateAdditionalMetadata = generateAdditionalMetadata
        }

        /** Whether to include hidden cells when extracting regions from the spreadsheet. */
        fun includeHiddenCells(includeHiddenCells: Boolean) =
            includeHiddenCells(JsonField.of(includeHiddenCells))

        /**
         * Sets [Builder.includeHiddenCells] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeHiddenCells] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeHiddenCells(includeHiddenCells: JsonField<Boolean>) = apply {
            this.includeHiddenCells = includeHiddenCells
        }

        /**
         * The names of the sheets to extract regions from. If empty, all sheets will be processed.
         */
        fun sheetNames(sheetNames: List<String>?) = sheetNames(JsonField.ofNullable(sheetNames))

        /** Alias for calling [Builder.sheetNames] with `sheetNames.orElse(null)`. */
        fun sheetNames(sheetNames: Optional<List<String>>) = sheetNames(sheetNames.getOrNull())

        /**
         * Sets [Builder.sheetNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sheetNames] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sheetNames(sheetNames: JsonField<List<String>>) = apply {
            this.sheetNames = sheetNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [sheetNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSheetName(sheetName: String) = apply {
            sheetNames =
                (sheetNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sheetNames", it).add(sheetName)
                }
        }

        /**
         * Optional specialization mode for domain-specific extraction. Supported values:
         * 'financial-standard', 'financial-enhanced', 'financial-precise'. Default None uses the
         * general-purpose pipeline.
         */
        fun specialization(specialization: String?) =
            specialization(JsonField.ofNullable(specialization))

        /** Alias for calling [Builder.specialization] with `specialization.orElse(null)`. */
        fun specialization(specialization: Optional<String>) =
            specialization(specialization.getOrNull())

        /**
         * Sets [Builder.specialization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specialization] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun specialization(specialization: JsonField<String>) = apply {
            this.specialization = specialization
        }

        /**
         * Influences how likely similar-looking regions are merged into a single table. Useful for
         * spreadsheets that either have sparse tables (strong merging) or many distinct tables
         * close together (weak merging).
         */
        fun tableMergeSensitivity(tableMergeSensitivity: TableMergeSensitivity) =
            tableMergeSensitivity(JsonField.of(tableMergeSensitivity))

        /**
         * Sets [Builder.tableMergeSensitivity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tableMergeSensitivity] with a well-typed
         * [TableMergeSensitivity] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun tableMergeSensitivity(tableMergeSensitivity: JsonField<TableMergeSensitivity>) = apply {
            this.tableMergeSensitivity = tableMergeSensitivity
        }

        /** Enables experimental processing. Accuracy may be impacted. */
        fun useExperimentalProcessing(useExperimentalProcessing: Boolean) =
            useExperimentalProcessing(JsonField.of(useExperimentalProcessing))

        /**
         * Sets [Builder.useExperimentalProcessing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useExperimentalProcessing] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun useExperimentalProcessing(useExperimentalProcessing: JsonField<Boolean>) = apply {
            this.useExperimentalProcessing = useExperimentalProcessing
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
         * Returns an immutable instance of [SheetsParsingConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SheetsParsingConfig =
            SheetsParsingConfig(
                extractionRange,
                flattenHierarchicalTables,
                generateAdditionalMetadata,
                includeHiddenCells,
                (sheetNames ?: JsonMissing.of()).map { it.toImmutable() },
                specialization,
                tableMergeSensitivity,
                useExperimentalProcessing,
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
    fun validate(): SheetsParsingConfig = apply {
        if (validated) {
            return@apply
        }

        extractionRange()
        flattenHierarchicalTables()
        generateAdditionalMetadata()
        includeHiddenCells()
        sheetNames()
        specialization()
        tableMergeSensitivity().ifPresent { it.validate() }
        useExperimentalProcessing()
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
        (if (extractionRange.asKnown().isPresent) 1 else 0) +
            (if (flattenHierarchicalTables.asKnown().isPresent) 1 else 0) +
            (if (generateAdditionalMetadata.asKnown().isPresent) 1 else 0) +
            (if (includeHiddenCells.asKnown().isPresent) 1 else 0) +
            (sheetNames.asKnown().getOrNull()?.size ?: 0) +
            (if (specialization.asKnown().isPresent) 1 else 0) +
            (tableMergeSensitivity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (useExperimentalProcessing.asKnown().isPresent) 1 else 0)

    /**
     * Influences how likely similar-looking regions are merged into a single table. Useful for
     * spreadsheets that either have sparse tables (strong merging) or many distinct tables close
     * together (weak merging).
     */
    class TableMergeSensitivity
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val STRONG = of("strong")

            @JvmField val WEAK = of("weak")

            @JvmStatic fun of(value: String) = TableMergeSensitivity(JsonField.of(value))
        }

        /** An enum containing [TableMergeSensitivity]'s known values. */
        enum class Known {
            STRONG,
            WEAK,
        }

        /**
         * An enum containing [TableMergeSensitivity]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [TableMergeSensitivity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STRONG,
            WEAK,
            /**
             * An enum member indicating that [TableMergeSensitivity] was instantiated with an
             * unknown value.
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
                STRONG -> Value.STRONG
                WEAK -> Value.WEAK
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
                STRONG -> Known.STRONG
                WEAK -> Known.WEAK
                else ->
                    throw LlamaCloudInvalidDataException("Unknown TableMergeSensitivity: $value")
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
        fun validate(): TableMergeSensitivity = apply {
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

            return other is TableMergeSensitivity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SheetsParsingConfig &&
            extractionRange == other.extractionRange &&
            flattenHierarchicalTables == other.flattenHierarchicalTables &&
            generateAdditionalMetadata == other.generateAdditionalMetadata &&
            includeHiddenCells == other.includeHiddenCells &&
            sheetNames == other.sheetNames &&
            specialization == other.specialization &&
            tableMergeSensitivity == other.tableMergeSensitivity &&
            useExperimentalProcessing == other.useExperimentalProcessing &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            extractionRange,
            flattenHierarchicalTables,
            generateAdditionalMetadata,
            includeHiddenCells,
            sheetNames,
            specialization,
            tableMergeSensitivity,
            useExperimentalProcessing,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SheetsParsingConfig{extractionRange=$extractionRange, flattenHierarchicalTables=$flattenHierarchicalTables, generateAdditionalMetadata=$generateAdditionalMetadata, includeHiddenCells=$includeHiddenCells, sheetNames=$sheetNames, specialization=$specialization, tableMergeSensitivity=$tableMergeSensitivity, useExperimentalProcessing=$useExperimentalProcessing, additionalProperties=$additionalProperties}"
}
