// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

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
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.getOrThrow
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import com.llamacloud_prod.api.models.beta.split.SplitCategory
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Request body for creating a product configuration. */
class ConfigurationCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val parameters: JsonField<Parameters>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<Parameters> = JsonMissing.of(),
    ) : this(name, parameters, mutableMapOf())

    /**
     * Human-readable name for this configuration.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Product-specific configuration parameters.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameters(): Parameters = parameters.getRequired("parameters")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<Parameters> = parameters

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
         * Returns a mutable builder for constructing an instance of [ConfigurationCreate].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .parameters()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConfigurationCreate]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var parameters: JsonField<Parameters>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(configurationCreate: ConfigurationCreate) = apply {
            name = configurationCreate.name
            parameters = configurationCreate.parameters
            additionalProperties = configurationCreate.additionalProperties.toMutableMap()
        }

        /** Human-readable name for this configuration. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Product-specific configuration parameters. */
        fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { this.parameters = parameters }

        /** Alias for calling [parameters] with `Parameters.ofSplitV1(splitV1)`. */
        fun parameters(splitV1: SplitV1Parameters) = parameters(Parameters.ofSplitV1(splitV1))

        /**
         * Alias for calling [parameters] with the following:
         * ```java
         * SplitV1Parameters.builder()
         *     .categories(categories)
         *     .build()
         * ```
         */
        fun splitV1Parameters(categories: List<SplitCategory>) =
            parameters(SplitV1Parameters.builder().categories(categories).build())

        /** Alias for calling [parameters] with `Parameters.ofExtractV2(extractV2)`. */
        fun parameters(extractV2: ExtractV2Parameters) =
            parameters(Parameters.ofExtractV2(extractV2))

        /**
         * Alias for calling [parameters] with the following:
         * ```java
         * ExtractV2Parameters.builder()
         *     .dataSchema(dataSchema)
         *     .build()
         * ```
         */
        fun extractV2Parameters(dataSchema: ExtractV2Parameters.DataSchema) =
            parameters(ExtractV2Parameters.builder().dataSchema(dataSchema).build())

        /** Alias for calling [parameters] with `Parameters.ofClassifyV2(classifyV2)`. */
        fun parameters(classifyV2: ClassifyV2Parameters) =
            parameters(Parameters.ofClassifyV2(classifyV2))

        /**
         * Alias for calling [parameters] with the following:
         * ```java
         * ClassifyV2Parameters.builder()
         *     .rules(rules)
         *     .build()
         * ```
         */
        fun classifyV2Parameters(rules: List<ClassifyV2Parameters.Rule>) =
            parameters(ClassifyV2Parameters.builder().rules(rules).build())

        /** Alias for calling [parameters] with `Parameters.ofParseV2(parseV2)`. */
        fun parameters(parseV2: ParseV2Parameters) = parameters(Parameters.ofParseV2(parseV2))

        /** Alias for calling [parameters] with `Parameters.ofSpreadsheetV1(spreadsheetV1)`. */
        fun parameters(spreadsheetV1: Parameters.SpreadsheetV1) =
            parameters(Parameters.ofSpreadsheetV1(spreadsheetV1))

        /** Alias for calling [parameters] with `Parameters.ofUnknown(unknown)`. */
        fun parameters(unknown: UntypedParameters) = parameters(Parameters.ofUnknown(unknown))

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
         * Returns an immutable instance of [ConfigurationCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .parameters()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConfigurationCreate =
            ConfigurationCreate(
                checkRequired("name", name),
                checkRequired("parameters", parameters),
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
    fun validate(): ConfigurationCreate = apply {
        if (validated) {
            return@apply
        }

        name()
        parameters().validate()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (parameters.asKnown().getOrNull()?.validity() ?: 0)

    /** Product-specific configuration parameters. */
    @JsonDeserialize(using = Parameters.Deserializer::class)
    @JsonSerialize(using = Parameters.Serializer::class)
    class Parameters
    private constructor(
        private val splitV1: SplitV1Parameters? = null,
        private val extractV2: ExtractV2Parameters? = null,
        private val classifyV2: ClassifyV2Parameters? = null,
        private val parseV2: ParseV2Parameters? = null,
        private val spreadsheetV1: SpreadsheetV1? = null,
        private val unknown: UntypedParameters? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Typed parameters for a *split v1* product configuration. */
        fun splitV1(): Optional<SplitV1Parameters> = Optional.ofNullable(splitV1)

        /** Typed parameters for an *extract v2* product configuration. */
        fun extractV2(): Optional<ExtractV2Parameters> = Optional.ofNullable(extractV2)

        /** Typed parameters for a *classify v2* product configuration. */
        fun classifyV2(): Optional<ClassifyV2Parameters> = Optional.ofNullable(classifyV2)

        /**
         * Configuration for LlamaParse v2 document parsing.
         *
         * Includes tier selection, processing options, output formatting, page targeting, and
         * webhook delivery. Refer to the LlamaParse documentation for details on each field.
         */
        fun parseV2(): Optional<ParseV2Parameters> = Optional.ofNullable(parseV2)

        /** Typed parameters for a *spreadsheet v1* product configuration. */
        fun spreadsheetV1(): Optional<SpreadsheetV1> = Optional.ofNullable(spreadsheetV1)

        /**
         * Catch-all for configurations without a dedicated typed schema.
         *
         * Accepts arbitrary JSON fields alongside ``product_type``.
         */
        fun unknown(): Optional<UntypedParameters> = Optional.ofNullable(unknown)

        fun isSplitV1(): Boolean = splitV1 != null

        fun isExtractV2(): Boolean = extractV2 != null

        fun isClassifyV2(): Boolean = classifyV2 != null

        fun isParseV2(): Boolean = parseV2 != null

        fun isSpreadsheetV1(): Boolean = spreadsheetV1 != null

        fun isUnknown(): Boolean = unknown != null

        /** Typed parameters for a *split v1* product configuration. */
        fun asSplitV1(): SplitV1Parameters = splitV1.getOrThrow("splitV1")

        /** Typed parameters for an *extract v2* product configuration. */
        fun asExtractV2(): ExtractV2Parameters = extractV2.getOrThrow("extractV2")

        /** Typed parameters for a *classify v2* product configuration. */
        fun asClassifyV2(): ClassifyV2Parameters = classifyV2.getOrThrow("classifyV2")

        /**
         * Configuration for LlamaParse v2 document parsing.
         *
         * Includes tier selection, processing options, output formatting, page targeting, and
         * webhook delivery. Refer to the LlamaParse documentation for details on each field.
         */
        fun asParseV2(): ParseV2Parameters = parseV2.getOrThrow("parseV2")

        /** Typed parameters for a *spreadsheet v1* product configuration. */
        fun asSpreadsheetV1(): SpreadsheetV1 = spreadsheetV1.getOrThrow("spreadsheetV1")

        /**
         * Catch-all for configurations without a dedicated typed schema.
         *
         * Accepts arbitrary JSON fields alongside ``product_type``.
         */
        fun asUnknown(): UntypedParameters = unknown.getOrThrow("unknown")

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
         * Optional<String> result = parameters.accept(new Parameters.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitSplitV1(SplitV1Parameters splitV1) {
         *         return Optional.of(splitV1.toString());
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
                splitV1 != null -> visitor.visitSplitV1(splitV1)
                extractV2 != null -> visitor.visitExtractV2(extractV2)
                classifyV2 != null -> visitor.visitClassifyV2(classifyV2)
                parseV2 != null -> visitor.visitParseV2(parseV2)
                spreadsheetV1 != null -> visitor.visitSpreadsheetV1(spreadsheetV1)
                unknown != null -> visitor.visitUnknown(unknown)
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
        fun validate(): Parameters = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitSplitV1(splitV1: SplitV1Parameters) {
                        splitV1.validate()
                    }

                    override fun visitExtractV2(extractV2: ExtractV2Parameters) {
                        extractV2.validate()
                    }

                    override fun visitClassifyV2(classifyV2: ClassifyV2Parameters) {
                        classifyV2.validate()
                    }

                    override fun visitParseV2(parseV2: ParseV2Parameters) {
                        parseV2.validate()
                    }

                    override fun visitSpreadsheetV1(spreadsheetV1: SpreadsheetV1) {
                        spreadsheetV1.validate()
                    }

                    override fun visitUnknown(unknown: UntypedParameters) {
                        unknown.validate()
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
                    override fun visitSplitV1(splitV1: SplitV1Parameters) = splitV1.validity()

                    override fun visitExtractV2(extractV2: ExtractV2Parameters) =
                        extractV2.validity()

                    override fun visitClassifyV2(classifyV2: ClassifyV2Parameters) =
                        classifyV2.validity()

                    override fun visitParseV2(parseV2: ParseV2Parameters) = parseV2.validity()

                    override fun visitSpreadsheetV1(spreadsheetV1: SpreadsheetV1) =
                        spreadsheetV1.validity()

                    override fun visitUnknown(unknown: UntypedParameters) = unknown.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Parameters &&
                splitV1 == other.splitV1 &&
                extractV2 == other.extractV2 &&
                classifyV2 == other.classifyV2 &&
                parseV2 == other.parseV2 &&
                spreadsheetV1 == other.spreadsheetV1 &&
                unknown == other.unknown
        }

        override fun hashCode(): Int =
            Objects.hash(splitV1, extractV2, classifyV2, parseV2, spreadsheetV1, unknown)

        override fun toString(): String =
            when {
                splitV1 != null -> "Parameters{splitV1=$splitV1}"
                extractV2 != null -> "Parameters{extractV2=$extractV2}"
                classifyV2 != null -> "Parameters{classifyV2=$classifyV2}"
                parseV2 != null -> "Parameters{parseV2=$parseV2}"
                spreadsheetV1 != null -> "Parameters{spreadsheetV1=$spreadsheetV1}"
                unknown != null -> "Parameters{unknown=$unknown}"
                _json != null -> "Parameters{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Parameters")
            }

        companion object {

            /** Typed parameters for a *split v1* product configuration. */
            @JvmStatic fun ofSplitV1(splitV1: SplitV1Parameters) = Parameters(splitV1 = splitV1)

            /** Typed parameters for an *extract v2* product configuration. */
            @JvmStatic
            fun ofExtractV2(extractV2: ExtractV2Parameters) = Parameters(extractV2 = extractV2)

            /** Typed parameters for a *classify v2* product configuration. */
            @JvmStatic
            fun ofClassifyV2(classifyV2: ClassifyV2Parameters) = Parameters(classifyV2 = classifyV2)

            /**
             * Configuration for LlamaParse v2 document parsing.
             *
             * Includes tier selection, processing options, output formatting, page targeting, and
             * webhook delivery. Refer to the LlamaParse documentation for details on each field.
             */
            @JvmStatic fun ofParseV2(parseV2: ParseV2Parameters) = Parameters(parseV2 = parseV2)

            /** Typed parameters for a *spreadsheet v1* product configuration. */
            @JvmStatic
            fun ofSpreadsheetV1(spreadsheetV1: SpreadsheetV1) =
                Parameters(spreadsheetV1 = spreadsheetV1)

            /**
             * Catch-all for configurations without a dedicated typed schema.
             *
             * Accepts arbitrary JSON fields alongside ``product_type``.
             */
            @JvmStatic fun ofUnknown(unknown: UntypedParameters) = Parameters(unknown = unknown)
        }

        /**
         * An interface that defines how to map each variant of [Parameters] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Typed parameters for a *split v1* product configuration. */
            fun visitSplitV1(splitV1: SplitV1Parameters): T

            /** Typed parameters for an *extract v2* product configuration. */
            fun visitExtractV2(extractV2: ExtractV2Parameters): T

            /** Typed parameters for a *classify v2* product configuration. */
            fun visitClassifyV2(classifyV2: ClassifyV2Parameters): T

            /**
             * Configuration for LlamaParse v2 document parsing.
             *
             * Includes tier selection, processing options, output formatting, page targeting, and
             * webhook delivery. Refer to the LlamaParse documentation for details on each field.
             */
            fun visitParseV2(parseV2: ParseV2Parameters): T

            /** Typed parameters for a *spreadsheet v1* product configuration. */
            fun visitSpreadsheetV1(spreadsheetV1: SpreadsheetV1): T

            /**
             * Catch-all for configurations without a dedicated typed schema.
             *
             * Accepts arbitrary JSON fields alongside ``product_type``.
             */
            fun visitUnknown(unknown: UntypedParameters): T

            /**
             * Maps an unknown variant of [Parameters] to a value of type [T].
             *
             * An instance of [Parameters] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown Parameters: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                val json = JsonValue.fromJsonNode(node)
                val productType =
                    json.asObject().getOrNull()?.get("product_type")?.asString()?.getOrNull()

                when (productType) {
                    "split_v1" -> {
                        return tryDeserialize(node, jacksonTypeRef<SplitV1Parameters>())?.let {
                            Parameters(splitV1 = it, _json = json)
                        } ?: Parameters(_json = json)
                    }
                    "extract_v2" -> {
                        return tryDeserialize(node, jacksonTypeRef<ExtractV2Parameters>())?.let {
                            Parameters(extractV2 = it, _json = json)
                        } ?: Parameters(_json = json)
                    }
                    "classify_v2" -> {
                        return tryDeserialize(node, jacksonTypeRef<ClassifyV2Parameters>())?.let {
                            Parameters(classifyV2 = it, _json = json)
                        } ?: Parameters(_json = json)
                    }
                    "parse_v2" -> {
                        return tryDeserialize(node, jacksonTypeRef<ParseV2Parameters>())?.let {
                            Parameters(parseV2 = it, _json = json)
                        } ?: Parameters(_json = json)
                    }
                    "spreadsheet_v1" -> {
                        return tryDeserialize(node, jacksonTypeRef<SpreadsheetV1>())?.let {
                            Parameters(spreadsheetV1 = it, _json = json)
                        } ?: Parameters(_json = json)
                    }
                    "unknown" -> {
                        return tryDeserialize(node, jacksonTypeRef<UntypedParameters>())?.let {
                            Parameters(unknown = it, _json = json)
                        } ?: Parameters(_json = json)
                    }
                }

                return Parameters(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Parameters>(Parameters::class) {

            override fun serialize(
                value: Parameters,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.splitV1 != null -> generator.writeObject(value.splitV1)
                    value.extractV2 != null -> generator.writeObject(value.extractV2)
                    value.classifyV2 != null -> generator.writeObject(value.classifyV2)
                    value.parseV2 != null -> generator.writeObject(value.parseV2)
                    value.spreadsheetV1 != null -> generator.writeObject(value.spreadsheetV1)
                    value.unknown != null -> generator.writeObject(value.unknown)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Parameters")
                }
            }
        }

        /** Typed parameters for a *spreadsheet v1* product configuration. */
        class SpreadsheetV1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val productType: JsonValue,
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
                @JsonProperty("product_type")
                @ExcludeMissing
                productType: JsonValue = JsonMissing.of(),
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
                productType,
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
             * Product type.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("spreadsheet_v1")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("product_type")
            @ExcludeMissing
            fun _productType(): JsonValue = productType

            /**
             * A1 notation of the range to extract a single region from. If None, the entire sheet
             * is used.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun extractionRange(): Optional<String> =
                extractionRange.getOptional("extraction_range")

            /**
             * Return a flattened dataframe when a detected table is recognized as hierarchical.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun flattenHierarchicalTables(): Optional<Boolean> =
                flattenHierarchicalTables.getOptional("flatten_hierarchical_tables")

            /**
             * Whether to generate additional metadata (title, description) for each extracted
             * region.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun generateAdditionalMetadata(): Optional<Boolean> =
                generateAdditionalMetadata.getOptional("generate_additional_metadata")

            /**
             * Whether to include hidden cells when extracting regions from the spreadsheet.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun includeHiddenCells(): Optional<Boolean> =
                includeHiddenCells.getOptional("include_hidden_cells")

            /**
             * The names of the sheets to extract regions from. If empty, all sheets will be
             * processed.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun sheetNames(): Optional<List<String>> = sheetNames.getOptional("sheet_names")

            /**
             * Optional specialization mode for domain-specific extraction. Supported values:
             * 'financial-standard', 'financial-enhanced', 'financial-precise'. Default None uses
             * the general-purpose pipeline.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun specialization(): Optional<String> = specialization.getOptional("specialization")

            /**
             * Influences how likely similar-looking regions are merged into a single table. Useful
             * for spreadsheets that either have sparse tables (strong merging) or many distinct
             * tables close together (weak merging).
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tableMergeSensitivity(): Optional<TableMergeSensitivity> =
                tableMergeSensitivity.getOptional("table_merge_sensitivity")

            /**
             * Enables experimental processing. Accuracy may be impacted.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun useExperimentalProcessing(): Optional<Boolean> =
                useExperimentalProcessing.getOptional("use_experimental_processing")

            /**
             * Returns the raw JSON value of [extractionRange].
             *
             * Unlike [extractionRange], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("extraction_range")
            @ExcludeMissing
            fun _extractionRange(): JsonField<String> = extractionRange

            /**
             * Returns the raw JSON value of [flattenHierarchicalTables].
             *
             * Unlike [flattenHierarchicalTables], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("flatten_hierarchical_tables")
            @ExcludeMissing
            fun _flattenHierarchicalTables(): JsonField<Boolean> = flattenHierarchicalTables

            /**
             * Returns the raw JSON value of [generateAdditionalMetadata].
             *
             * Unlike [generateAdditionalMetadata], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("generate_additional_metadata")
            @ExcludeMissing
            fun _generateAdditionalMetadata(): JsonField<Boolean> = generateAdditionalMetadata

            /**
             * Returns the raw JSON value of [includeHiddenCells].
             *
             * Unlike [includeHiddenCells], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("include_hidden_cells")
            @ExcludeMissing
            fun _includeHiddenCells(): JsonField<Boolean> = includeHiddenCells

            /**
             * Returns the raw JSON value of [sheetNames].
             *
             * Unlike [sheetNames], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sheet_names")
            @ExcludeMissing
            fun _sheetNames(): JsonField<List<String>> = sheetNames

            /**
             * Returns the raw JSON value of [specialization].
             *
             * Unlike [specialization], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("specialization")
            @ExcludeMissing
            fun _specialization(): JsonField<String> = specialization

            /**
             * Returns the raw JSON value of [tableMergeSensitivity].
             *
             * Unlike [tableMergeSensitivity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("table_merge_sensitivity")
            @ExcludeMissing
            fun _tableMergeSensitivity(): JsonField<TableMergeSensitivity> = tableMergeSensitivity

            /**
             * Returns the raw JSON value of [useExperimentalProcessing].
             *
             * Unlike [useExperimentalProcessing], this method doesn't throw if the JSON field has
             * an unexpected type.
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

                /** Returns a mutable builder for constructing an instance of [SpreadsheetV1]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SpreadsheetV1]. */
            class Builder internal constructor() {

                private var productType: JsonValue = JsonValue.from("spreadsheet_v1")
                private var extractionRange: JsonField<String> = JsonMissing.of()
                private var flattenHierarchicalTables: JsonField<Boolean> = JsonMissing.of()
                private var generateAdditionalMetadata: JsonField<Boolean> = JsonMissing.of()
                private var includeHiddenCells: JsonField<Boolean> = JsonMissing.of()
                private var sheetNames: JsonField<MutableList<String>>? = null
                private var specialization: JsonField<String> = JsonMissing.of()
                private var tableMergeSensitivity: JsonField<TableMergeSensitivity> =
                    JsonMissing.of()
                private var useExperimentalProcessing: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spreadsheetV1: SpreadsheetV1) = apply {
                    productType = spreadsheetV1.productType
                    extractionRange = spreadsheetV1.extractionRange
                    flattenHierarchicalTables = spreadsheetV1.flattenHierarchicalTables
                    generateAdditionalMetadata = spreadsheetV1.generateAdditionalMetadata
                    includeHiddenCells = spreadsheetV1.includeHiddenCells
                    sheetNames = spreadsheetV1.sheetNames.map { it.toMutableList() }
                    specialization = spreadsheetV1.specialization
                    tableMergeSensitivity = spreadsheetV1.tableMergeSensitivity
                    useExperimentalProcessing = spreadsheetV1.useExperimentalProcessing
                    additionalProperties = spreadsheetV1.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("spreadsheet_v1")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun productType(productType: JsonValue) = apply { this.productType = productType }

                /**
                 * A1 notation of the range to extract a single region from. If None, the entire
                 * sheet is used.
                 */
                fun extractionRange(extractionRange: String?) =
                    extractionRange(JsonField.ofNullable(extractionRange))

                /**
                 * Alias for calling [Builder.extractionRange] with `extractionRange.orElse(null)`.
                 */
                fun extractionRange(extractionRange: Optional<String>) =
                    extractionRange(extractionRange.getOrNull())

                /**
                 * Sets [Builder.extractionRange] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extractionRange] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun extractionRange(extractionRange: JsonField<String>) = apply {
                    this.extractionRange = extractionRange
                }

                /**
                 * Return a flattened dataframe when a detected table is recognized as hierarchical.
                 */
                fun flattenHierarchicalTables(flattenHierarchicalTables: Boolean) =
                    flattenHierarchicalTables(JsonField.of(flattenHierarchicalTables))

                /**
                 * Sets [Builder.flattenHierarchicalTables] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.flattenHierarchicalTables] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun flattenHierarchicalTables(flattenHierarchicalTables: JsonField<Boolean>) =
                    apply {
                        this.flattenHierarchicalTables = flattenHierarchicalTables
                    }

                /**
                 * Whether to generate additional metadata (title, description) for each extracted
                 * region.
                 */
                fun generateAdditionalMetadata(generateAdditionalMetadata: Boolean) =
                    generateAdditionalMetadata(JsonField.of(generateAdditionalMetadata))

                /**
                 * Sets [Builder.generateAdditionalMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.generateAdditionalMetadata] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun generateAdditionalMetadata(generateAdditionalMetadata: JsonField<Boolean>) =
                    apply {
                        this.generateAdditionalMetadata = generateAdditionalMetadata
                    }

                /** Whether to include hidden cells when extracting regions from the spreadsheet. */
                fun includeHiddenCells(includeHiddenCells: Boolean) =
                    includeHiddenCells(JsonField.of(includeHiddenCells))

                /**
                 * Sets [Builder.includeHiddenCells] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includeHiddenCells] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun includeHiddenCells(includeHiddenCells: JsonField<Boolean>) = apply {
                    this.includeHiddenCells = includeHiddenCells
                }

                /**
                 * The names of the sheets to extract regions from. If empty, all sheets will be
                 * processed.
                 */
                fun sheetNames(sheetNames: List<String>?) =
                    sheetNames(JsonField.ofNullable(sheetNames))

                /** Alias for calling [Builder.sheetNames] with `sheetNames.orElse(null)`. */
                fun sheetNames(sheetNames: Optional<List<String>>) =
                    sheetNames(sheetNames.getOrNull())

                /**
                 * Sets [Builder.sheetNames] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sheetNames] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * 'financial-standard', 'financial-enhanced', 'financial-precise'. Default None
                 * uses the general-purpose pipeline.
                 */
                fun specialization(specialization: String?) =
                    specialization(JsonField.ofNullable(specialization))

                /**
                 * Alias for calling [Builder.specialization] with `specialization.orElse(null)`.
                 */
                fun specialization(specialization: Optional<String>) =
                    specialization(specialization.getOrNull())

                /**
                 * Sets [Builder.specialization] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.specialization] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun specialization(specialization: JsonField<String>) = apply {
                    this.specialization = specialization
                }

                /**
                 * Influences how likely similar-looking regions are merged into a single table.
                 * Useful for spreadsheets that either have sparse tables (strong merging) or many
                 * distinct tables close together (weak merging).
                 */
                fun tableMergeSensitivity(tableMergeSensitivity: TableMergeSensitivity) =
                    tableMergeSensitivity(JsonField.of(tableMergeSensitivity))

                /**
                 * Sets [Builder.tableMergeSensitivity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tableMergeSensitivity] with a well-typed
                 * [TableMergeSensitivity] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun tableMergeSensitivity(tableMergeSensitivity: JsonField<TableMergeSensitivity>) =
                    apply {
                        this.tableMergeSensitivity = tableMergeSensitivity
                    }

                /** Enables experimental processing. Accuracy may be impacted. */
                fun useExperimentalProcessing(useExperimentalProcessing: Boolean) =
                    useExperimentalProcessing(JsonField.of(useExperimentalProcessing))

                /**
                 * Sets [Builder.useExperimentalProcessing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.useExperimentalProcessing] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun useExperimentalProcessing(useExperimentalProcessing: JsonField<Boolean>) =
                    apply {
                        this.useExperimentalProcessing = useExperimentalProcessing
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
                 * Returns an immutable instance of [SpreadsheetV1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SpreadsheetV1 =
                    SpreadsheetV1(
                        productType,
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
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SpreadsheetV1 = apply {
                if (validated) {
                    return@apply
                }

                _productType().let {
                    if (it != JsonValue.from("spreadsheet_v1")) {
                        throw LlamaCloudInvalidDataException(
                            "'productType' is invalid, received $it"
                        )
                    }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                productType.let { if (it == JsonValue.from("spreadsheet_v1")) 1 else 0 } +
                    (if (extractionRange.asKnown().isPresent) 1 else 0) +
                    (if (flattenHierarchicalTables.asKnown().isPresent) 1 else 0) +
                    (if (generateAdditionalMetadata.asKnown().isPresent) 1 else 0) +
                    (if (includeHiddenCells.asKnown().isPresent) 1 else 0) +
                    (sheetNames.asKnown().getOrNull()?.size ?: 0) +
                    (if (specialization.asKnown().isPresent) 1 else 0) +
                    (tableMergeSensitivity.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (useExperimentalProcessing.asKnown().isPresent) 1 else 0)

            /**
             * Influences how likely similar-looking regions are merged into a single table. Useful
             * for spreadsheets that either have sparse tables (strong merging) or many distinct
             * tables close together (weak merging).
             */
            class TableMergeSensitivity
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * An enum containing [TableMergeSensitivity]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [TableMergeSensitivity] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    STRONG,
                    WEAK,
                    /**
                     * An enum member indicating that [TableMergeSensitivity] was instantiated with
                     * an unknown value.
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
                        STRONG -> Value.STRONG
                        WEAK -> Value.WEAK
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
                        STRONG -> Known.STRONG
                        WEAK -> Known.WEAK
                        else ->
                            throw LlamaCloudInvalidDataException(
                                "Unknown TableMergeSensitivity: $value"
                            )
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

                return other is SpreadsheetV1 &&
                    productType == other.productType &&
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
                    productType,
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
                "SpreadsheetV1{productType=$productType, extractionRange=$extractionRange, flattenHierarchicalTables=$flattenHierarchicalTables, generateAdditionalMetadata=$generateAdditionalMetadata, includeHiddenCells=$includeHiddenCells, sheetNames=$sheetNames, specialization=$specialization, tableMergeSensitivity=$tableMergeSensitivity, useExperimentalProcessing=$useExperimentalProcessing, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigurationCreate &&
            name == other.name &&
            parameters == other.parameters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(name, parameters, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfigurationCreate{name=$name, parameters=$parameters, additionalProperties=$additionalProperties}"
}
