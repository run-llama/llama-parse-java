// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.BaseDeserializer
import ai.llamaindex.llamacloud.core.BaseSerializer
import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.allMaxBy
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.getOrThrow
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A fillable grid printed on the form: repeating records or a row-by-column matrix. */
class FormTable
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val rows: JsonField<List<List<Row?>>>,
    private val id: JsonField<String>,
    private val bbox: JsonField<List<BBox>>,
    private val columns: JsonField<List<String>>,
    private val grounding: JsonField<Grounding>,
    private val label: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("rows") @ExcludeMissing rows: JsonField<List<List<Row?>>> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<List<BBox>> = JsonMissing.of(),
        @JsonProperty("columns")
        @ExcludeMissing
        columns: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("grounding")
        @ExcludeMissing
        grounding: JsonField<Grounding> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(rows, id, bbox, columns, grounding, label, type, mutableMapOf())

    /**
     * Table cells: a verbatim string, null for a printed-but-blank cell, or an object holding the
     * cell's own form nodes
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rows(): List<List<Row?>> = rows.getRequired("rows")

    /**
     * Identifier printed on the form, if any
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Bounding boxes of the table's fillable regions on the page.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bbox(): Optional<List<BBox>> = bbox.getOptional("bbox")

    /**
     * Printed column headers in order, if any
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun columns(): Optional<List<String>> = columns.getOptional("columns")

    /**
     * Scalar text grounding aligned with the table's columns and ragged rows.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grounding(): Optional<Grounding> = grounding.getOptional("grounding")

    /**
     * Printed table caption, if any
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Form table node
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [rows].
     *
     * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<List<Row?>>> = rows

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [bbox].
     *
     * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<List<BBox>> = bbox

    /**
     * Returns the raw JSON value of [columns].
     *
     * Unlike [columns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("columns") @ExcludeMissing fun _columns(): JsonField<List<String>> = columns

    /**
     * Returns the raw JSON value of [grounding].
     *
     * Unlike [grounding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grounding") @ExcludeMissing fun _grounding(): JsonField<Grounding> = grounding

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [FormTable].
         *
         * The following fields are required:
         * ```java
         * .rows()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormTable]. */
    class Builder internal constructor() {

        private var rows: JsonField<MutableList<List<Row?>>>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var bbox: JsonField<MutableList<BBox>>? = null
        private var columns: JsonField<MutableList<String>>? = null
        private var grounding: JsonField<Grounding> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formTable: FormTable) = apply {
            rows = formTable.rows.map { it.toMutableList() }
            id = formTable.id
            bbox = formTable.bbox.map { it.toMutableList() }
            columns = formTable.columns.map { it.toMutableList() }
            grounding = formTable.grounding
            label = formTable.label
            type = formTable.type
            additionalProperties = formTable.additionalProperties.toMutableMap()
        }

        /**
         * Table cells: a verbatim string, null for a printed-but-blank cell, or an object holding
         * the cell's own form nodes
         */
        fun rows(rows: List<List<Row?>>) = rows(JsonField.of(rows))

        /**
         * Sets [Builder.rows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rows] with a well-typed `List<List<Row?>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rows(rows: JsonField<List<List<Row?>>>) = apply {
            this.rows = rows.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<Row?>] to [rows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRow(row: List<Row?>) = apply {
            rows = (rows ?: JsonField.of(mutableListOf())).also { checkKnown("rows", it).add(row) }
        }

        /** Identifier printed on the form, if any */
        fun id(id: String?) = id(JsonField.ofNullable(id))

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Bounding boxes of the table's fillable regions on the page. */
        fun bbox(bbox: List<BBox>?) = bbox(JsonField.ofNullable(bbox))

        /** Alias for calling [Builder.bbox] with `bbox.orElse(null)`. */
        fun bbox(bbox: Optional<List<BBox>>) = bbox(bbox.getOrNull())

        /**
         * Sets [Builder.bbox] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bbox] with a well-typed `List<BBox>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bbox(bbox: JsonField<List<BBox>>) = apply {
            this.bbox = bbox.map { it.toMutableList() }
        }

        /**
         * Adds a single [BBox] to [Builder.bbox].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBbox(bbox: BBox) = apply {
            this.bbox =
                (this.bbox ?: JsonField.of(mutableListOf())).also {
                    checkKnown("bbox", it).add(bbox)
                }
        }

        /** Printed column headers in order, if any */
        fun columns(columns: List<String>?) = columns(JsonField.ofNullable(columns))

        /** Alias for calling [Builder.columns] with `columns.orElse(null)`. */
        fun columns(columns: Optional<List<String>>) = columns(columns.getOrNull())

        /**
         * Sets [Builder.columns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columns] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun columns(columns: JsonField<List<String>>) = apply {
            this.columns = columns.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [columns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColumn(column: String) = apply {
            columns =
                (columns ?: JsonField.of(mutableListOf())).also {
                    checkKnown("columns", it).add(column)
                }
        }

        /** Scalar text grounding aligned with the table's columns and ragged rows. */
        fun grounding(grounding: Grounding?) = grounding(JsonField.ofNullable(grounding))

        /** Alias for calling [Builder.grounding] with `grounding.orElse(null)`. */
        fun grounding(grounding: Optional<Grounding>) = grounding(grounding.getOrNull())

        /**
         * Sets [Builder.grounding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grounding] with a well-typed [Grounding] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun grounding(grounding: JsonField<Grounding>) = apply { this.grounding = grounding }

        /** Printed table caption, if any */
        fun label(label: String?) = label(JsonField.ofNullable(label))

        /** Alias for calling [Builder.label] with `label.orElse(null)`. */
        fun label(label: Optional<String>) = label(label.getOrNull())

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Form table node */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [FormTable].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .rows()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormTable =
            FormTable(
                checkRequired("rows", rows).map { it.toImmutable() },
                id,
                (bbox ?: JsonMissing.of()).map { it.toImmutable() },
                (columns ?: JsonMissing.of()).map { it.toImmutable() },
                grounding,
                label,
                type,
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
    fun validate(): FormTable = apply {
        if (validated) {
            return@apply
        }

        rows().forEach { it.forEach { it?.validate() } }
        id()
        bbox().ifPresent { it.forEach { it.validate() } }
        columns()
        grounding().ifPresent { it.validate() }
        label()
        type().ifPresent { it.validate() }
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
        (rows.asKnown().getOrNull()?.sumOf { it.sumOf { (it?.validity() ?: 0).toInt() }.toInt() }
            ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (bbox.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (columns.asKnown().getOrNull()?.size ?: 0) +
            (grounding.asKnown().getOrNull()?.validity() ?: 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** A table cell holding its own form nodes (e.g. a checkbox column). */
    @JsonDeserialize(using = Row.Deserializer::class)
    @JsonSerialize(using = Row.Serializer::class)
    class Row
    private constructor(
        private val string: String? = null,
        private val formTableCellItems: FormTableCellItems? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        /** A table cell holding its own form nodes (e.g. a checkbox column). */
        fun formTableCellItems(): Optional<FormTableCellItems> =
            Optional.ofNullable(formTableCellItems)

        fun isString(): Boolean = string != null

        fun isFormTableCellItems(): Boolean = formTableCellItems != null

        fun asString(): String = string.getOrThrow("string")

        /** A table cell holding its own form nodes (e.g. a checkbox column). */
        fun asFormTableCellItems(): FormTableCellItems =
            formTableCellItems.getOrThrow("formTableCellItems")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import ai.llamaindex.llamacloud.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = row.accept(new Row.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
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
                string != null -> visitor.visitString(string)
                formTableCellItems != null -> visitor.visitFormTableCellItems(formTableCellItems)
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
        fun validate(): Row = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitFormTableCellItems(formTableCellItems: FormTableCellItems) {
                        formTableCellItems.validate()
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
                    override fun visitString(string: String) = 1

                    override fun visitFormTableCellItems(formTableCellItems: FormTableCellItems) =
                        formTableCellItems.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Row &&
                string == other.string &&
                formTableCellItems == other.formTableCellItems
        }

        override fun hashCode(): Int = Objects.hash(string, formTableCellItems)

        override fun toString(): String =
            when {
                string != null -> "Row{string=$string}"
                formTableCellItems != null -> "Row{formTableCellItems=$formTableCellItems}"
                _json != null -> "Row{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Row")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Row(string = string)

            /** A table cell holding its own form nodes (e.g. a checkbox column). */
            @JvmStatic
            fun ofFormTableCellItems(formTableCellItems: FormTableCellItems) =
                Row(formTableCellItems = formTableCellItems)
        }

        /** An interface that defines how to map each variant of [Row] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            /** A table cell holding its own form nodes (e.g. a checkbox column). */
            fun visitFormTableCellItems(formTableCellItems: FormTableCellItems): T

            /**
             * Maps an unknown variant of [Row] to a value of type [T].
             *
             * An instance of [Row] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown Row: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Row>(Row::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Row {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<FormTableCellItems>())?.let {
                                Row(formTableCellItems = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Row(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Row(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Row>(Row::class) {

            override fun serialize(
                value: Row,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.formTableCellItems != null ->
                        generator.writeObject(value.formTableCellItems)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Row")
                }
            }
        }
    }

    /** Scalar text grounding aligned with the table's columns and ragged rows. */
    class Grounding
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Id>,
        private val columns: JsonField<List<Column>>,
        private val label: JsonField<Label>,
        private val rows: JsonField<List<List<FormTextGrounding>>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Id> = JsonMissing.of(),
            @JsonProperty("columns")
            @ExcludeMissing
            columns: JsonField<List<Column>> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<Label> = JsonMissing.of(),
            @JsonProperty("rows")
            @ExcludeMissing
            rows: JsonField<List<List<FormTextGrounding>>> = JsonMissing.of(),
        ) : this(id, columns, label, rows, mutableMapOf())

        /**
         * Supported text with half-open UTF-8 byte spans into the complete property string.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<Id> = id.getOptional("id")

        /**
         * Column text grounding in source order; blank slots have empty lines
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun columns(): Optional<List<Column>> = columns.getOptional("columns")

        /**
         * Supported text with half-open UTF-8 byte spans into the complete property string.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun label(): Optional<Label> = label.getOptional("label")

        /**
         * Scalar cell text grounding aligned with rows; blank and structured slots have empty
         * lines. Structured children carry their own grounding.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rows(): Optional<List<List<FormTextGrounding>>> = rows.getOptional("rows")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Id> = id

        /**
         * Returns the raw JSON value of [columns].
         *
         * Unlike [columns], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("columns") @ExcludeMissing fun _columns(): JsonField<List<Column>> = columns

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<Label> = label

        /**
         * Returns the raw JSON value of [rows].
         *
         * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rows")
        @ExcludeMissing
        fun _rows(): JsonField<List<List<FormTextGrounding>>> = rows

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

            /** Returns a mutable builder for constructing an instance of [Grounding]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Grounding]. */
        class Builder internal constructor() {

            private var id: JsonField<Id> = JsonMissing.of()
            private var columns: JsonField<MutableList<Column>>? = null
            private var label: JsonField<Label> = JsonMissing.of()
            private var rows: JsonField<MutableList<List<FormTextGrounding>>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(grounding: Grounding) = apply {
                id = grounding.id
                columns = grounding.columns.map { it.toMutableList() }
                label = grounding.label
                rows = grounding.rows.map { it.toMutableList() }
                additionalProperties = grounding.additionalProperties.toMutableMap()
            }

            /** Supported text with half-open UTF-8 byte spans into the complete property string. */
            fun id(id: Id?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<Id>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Id] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Id>) = apply { this.id = id }

            /** Column text grounding in source order; blank slots have empty lines */
            fun columns(columns: List<Column>?) = columns(JsonField.ofNullable(columns))

            /** Alias for calling [Builder.columns] with `columns.orElse(null)`. */
            fun columns(columns: Optional<List<Column>>) = columns(columns.getOrNull())

            /**
             * Sets [Builder.columns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.columns] with a well-typed `List<Column>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun columns(columns: JsonField<List<Column>>) = apply {
                this.columns = columns.map { it.toMutableList() }
            }

            /**
             * Adds a single [Column] to [columns].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addColumn(column: Column) = apply {
                columns =
                    (columns ?: JsonField.of(mutableListOf())).also {
                        checkKnown("columns", it).add(column)
                    }
            }

            /** Supported text with half-open UTF-8 byte spans into the complete property string. */
            fun label(label: Label?) = label(JsonField.ofNullable(label))

            /** Alias for calling [Builder.label] with `label.orElse(null)`. */
            fun label(label: Optional<Label>) = label(label.getOrNull())

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [Label] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun label(label: JsonField<Label>) = apply { this.label = label }

            /**
             * Scalar cell text grounding aligned with rows; blank and structured slots have empty
             * lines. Structured children carry their own grounding.
             */
            fun rows(rows: List<List<FormTextGrounding>>?) = rows(JsonField.ofNullable(rows))

            /** Alias for calling [Builder.rows] with `rows.orElse(null)`. */
            fun rows(rows: Optional<List<List<FormTextGrounding>>>) = rows(rows.getOrNull())

            /**
             * Sets [Builder.rows] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rows] with a well-typed
             * `List<List<FormTextGrounding>>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun rows(rows: JsonField<List<List<FormTextGrounding>>>) = apply {
                this.rows = rows.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<FormTextGrounding>] to [rows].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRow(row: List<FormTextGrounding>) = apply {
                rows =
                    (rows ?: JsonField.of(mutableListOf())).also { checkKnown("rows", it).add(row) }
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
             * Returns an immutable instance of [Grounding].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Grounding =
                Grounding(
                    id,
                    (columns ?: JsonMissing.of()).map { it.toImmutable() },
                    label,
                    (rows ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Grounding = apply {
            if (validated) {
                return@apply
            }

            id().ifPresent { it.validate() }
            columns().ifPresent { it.forEach { it.validate() } }
            label().ifPresent { it.validate() }
            rows().ifPresent { it.forEach { it.forEach { it.validate() } } }
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
            (id.asKnown().getOrNull()?.validity() ?: 0) +
                (columns.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (label.asKnown().getOrNull()?.validity() ?: 0) +
                (rows.asKnown().getOrNull()?.sumOf { it.sumOf { it.validity().toInt() }.toInt() }
                    ?: 0)

        /** Supported text with half-open UTF-8 byte spans into the complete property string. */
        class Id
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val lines: JsonField<List<Line>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lines")
                @ExcludeMissing
                lines: JsonField<List<Line>> = JsonMissing.of()
            ) : this(lines, mutableMapOf())

            /**
             * Supported lines. Word requests include supported words; gaps are valid. Boxes use
             * final page coordinates and optional local rotation r.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lines(): List<Line> = lines.getRequired("lines")

            /**
             * Returns the raw JSON value of [lines].
             *
             * Unlike [lines], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lines") @ExcludeMissing fun _lines(): JsonField<List<Line>> = lines

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
                 * Returns a mutable builder for constructing an instance of [Id].
                 *
                 * The following fields are required:
                 * ```java
                 * .lines()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Id]. */
            class Builder internal constructor() {

                private var lines: JsonField<MutableList<Line>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(id: Id) = apply {
                    lines = id.lines.map { it.toMutableList() }
                    additionalProperties = id.additionalProperties.toMutableMap()
                }

                /**
                 * Supported lines. Word requests include supported words; gaps are valid. Boxes use
                 * final page coordinates and optional local rotation r.
                 */
                fun lines(lines: List<Line>) = lines(JsonField.of(lines))

                /**
                 * Sets [Builder.lines] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lines] with a well-typed `List<Line>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lines(lines: JsonField<List<Line>>) = apply {
                    this.lines = lines.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Line] to [lines].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLine(line: Line) = apply {
                    lines =
                        (lines ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lines", it).add(line)
                        }
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
                 * Returns an immutable instance of [Id].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .lines()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Id =
                    Id(
                        checkRequired("lines", lines).map { it.toImmutable() },
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
            fun validate(): Id = apply {
                if (validated) {
                    return@apply
                }

                lines().forEach { it.validate() }
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
                (lines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** One grounded line of text with an optional per-word breakdown. */
            class Line
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bbox: JsonField<BBox>,
                private val span: JsonField<List<JsonValue>>,
                private val words: JsonField<List<Word>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<BBox> = JsonMissing.of(),
                    @JsonProperty("span")
                    @ExcludeMissing
                    span: JsonField<List<JsonValue>> = JsonMissing.of(),
                    @JsonProperty("words")
                    @ExcludeMissing
                    words: JsonField<List<Word>> = JsonMissing.of(),
                ) : this(bbox, span, words, mutableMapOf())

                /**
                 * Line bounding box
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bbox(): BBox = bbox.getRequired("bbox")

                /**
                 * `[start, end)` UTF-8 byte span in the complete source property string
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun span(): List<JsonValue> = span.getRequired("span")

                /**
                 * Per-word grounding within the line, when available
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun words(): Optional<List<Word>> = words.getOptional("words")

                /**
                 * Returns the raw JSON value of [bbox].
                 *
                 * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<BBox> = bbox

                /**
                 * Returns the raw JSON value of [span].
                 *
                 * Unlike [span], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("span") @ExcludeMissing fun _span(): JsonField<List<JsonValue>> = span

                /**
                 * Returns the raw JSON value of [words].
                 *
                 * Unlike [words], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("words") @ExcludeMissing fun _words(): JsonField<List<Word>> = words

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
                     * Returns a mutable builder for constructing an instance of [Line].
                     *
                     * The following fields are required:
                     * ```java
                     * .bbox()
                     * .span()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Line]. */
                class Builder internal constructor() {

                    private var bbox: JsonField<BBox>? = null
                    private var span: JsonField<MutableList<JsonValue>>? = null
                    private var words: JsonField<MutableList<Word>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(line: Line) = apply {
                        bbox = line.bbox
                        span = line.span.map { it.toMutableList() }
                        words = line.words.map { it.toMutableList() }
                        additionalProperties = line.additionalProperties.toMutableMap()
                    }

                    /** Line bounding box */
                    fun bbox(bbox: BBox) = bbox(JsonField.of(bbox))

                    /**
                     * Sets [Builder.bbox] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bbox] with a well-typed [BBox] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bbox(bbox: JsonField<BBox>) = apply { this.bbox = bbox }

                    /** `[start, end)` UTF-8 byte span in the complete source property string */
                    fun span(span: List<JsonValue>) = span(JsonField.of(span))

                    /**
                     * Sets [Builder.span] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.span] with a well-typed `List<JsonValue>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun span(span: JsonField<List<JsonValue>>) = apply {
                        this.span = span.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [JsonValue] to [Builder.span].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSpan(span: JsonValue) = apply {
                        this.span =
                            (this.span ?: JsonField.of(mutableListOf())).also {
                                checkKnown("span", it).add(span)
                            }
                    }

                    /** Per-word grounding within the line, when available */
                    fun words(words: List<Word>?) = words(JsonField.ofNullable(words))

                    /** Alias for calling [Builder.words] with `words.orElse(null)`. */
                    fun words(words: Optional<List<Word>>) = words(words.getOrNull())

                    /**
                     * Sets [Builder.words] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.words] with a well-typed `List<Word>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun words(words: JsonField<List<Word>>) = apply {
                        this.words = words.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Word] to [words].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addWord(word: Word) = apply {
                        words =
                            (words ?: JsonField.of(mutableListOf())).also {
                                checkKnown("words", it).add(word)
                            }
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
                     * Returns an immutable instance of [Line].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bbox()
                     * .span()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Line =
                        Line(
                            checkRequired("bbox", bbox),
                            checkRequired("span", span).map { it.toImmutable() },
                            (words ?: JsonMissing.of()).map { it.toImmutable() },
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Line = apply {
                    if (validated) {
                        return@apply
                    }

                    bbox().validate()
                    span()
                    words().ifPresent { it.forEach { it.validate() } }
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
                    (bbox.asKnown().getOrNull()?.validity() ?: 0) +
                        (span.asKnown().getOrNull()?.size ?: 0) +
                        (words.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                /** One grounded word: a `[start, end)` span in the source text and its bbox. */
                class Word
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bbox: JsonField<BBox>,
                    private val span: JsonField<List<JsonValue>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bbox")
                        @ExcludeMissing
                        bbox: JsonField<BBox> = JsonMissing.of(),
                        @JsonProperty("span")
                        @ExcludeMissing
                        span: JsonField<List<JsonValue>> = JsonMissing.of(),
                    ) : this(bbox, span, mutableMapOf())

                    /**
                     * Word bounding box
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun bbox(): BBox = bbox.getRequired("bbox")

                    /**
                     * `[start, end)` UTF-8 byte span in the complete source property string
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun span(): List<JsonValue> = span.getRequired("span")

                    /**
                     * Returns the raw JSON value of [bbox].
                     *
                     * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<BBox> = bbox

                    /**
                     * Returns the raw JSON value of [span].
                     *
                     * Unlike [span], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("span")
                    @ExcludeMissing
                    fun _span(): JsonField<List<JsonValue>> = span

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
                         * Returns a mutable builder for constructing an instance of [Word].
                         *
                         * The following fields are required:
                         * ```java
                         * .bbox()
                         * .span()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Word]. */
                    class Builder internal constructor() {

                        private var bbox: JsonField<BBox>? = null
                        private var span: JsonField<MutableList<JsonValue>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(word: Word) = apply {
                            bbox = word.bbox
                            span = word.span.map { it.toMutableList() }
                            additionalProperties = word.additionalProperties.toMutableMap()
                        }

                        /** Word bounding box */
                        fun bbox(bbox: BBox) = bbox(JsonField.of(bbox))

                        /**
                         * Sets [Builder.bbox] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bbox] with a well-typed [BBox] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bbox(bbox: JsonField<BBox>) = apply { this.bbox = bbox }

                        /** `[start, end)` UTF-8 byte span in the complete source property string */
                        fun span(span: List<JsonValue>) = span(JsonField.of(span))

                        /**
                         * Sets [Builder.span] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.span] with a well-typed
                         * `List<JsonValue>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun span(span: JsonField<List<JsonValue>>) = apply {
                            this.span = span.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [JsonValue] to [Builder.span].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addSpan(span: JsonValue) = apply {
                            this.span =
                                (this.span ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("span", it).add(span)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Word].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bbox()
                         * .span()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Word =
                            Word(
                                checkRequired("bbox", bbox),
                                checkRequired("span", span).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Word = apply {
                        if (validated) {
                            return@apply
                        }

                        bbox().validate()
                        span()
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
                        (bbox.asKnown().getOrNull()?.validity() ?: 0) +
                            (span.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Word &&
                            bbox == other.bbox &&
                            span == other.span &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(bbox, span, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Word{bbox=$bbox, span=$span, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Line &&
                        bbox == other.bbox &&
                        span == other.span &&
                        words == other.words &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bbox, span, words, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Line{bbox=$bbox, span=$span, words=$words, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Id &&
                    lines == other.lines &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(lines, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Id{lines=$lines, additionalProperties=$additionalProperties}"
        }

        /** Supported text with half-open UTF-8 byte spans into the complete property string. */
        class Column
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val lines: JsonField<List<Line>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lines")
                @ExcludeMissing
                lines: JsonField<List<Line>> = JsonMissing.of()
            ) : this(lines, mutableMapOf())

            /**
             * Supported lines. Word requests include supported words; gaps are valid. Boxes use
             * final page coordinates and optional local rotation r.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lines(): List<Line> = lines.getRequired("lines")

            /**
             * Returns the raw JSON value of [lines].
             *
             * Unlike [lines], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lines") @ExcludeMissing fun _lines(): JsonField<List<Line>> = lines

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
                 * Returns a mutable builder for constructing an instance of [Column].
                 *
                 * The following fields are required:
                 * ```java
                 * .lines()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Column]. */
            class Builder internal constructor() {

                private var lines: JsonField<MutableList<Line>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(column: Column) = apply {
                    lines = column.lines.map { it.toMutableList() }
                    additionalProperties = column.additionalProperties.toMutableMap()
                }

                /**
                 * Supported lines. Word requests include supported words; gaps are valid. Boxes use
                 * final page coordinates and optional local rotation r.
                 */
                fun lines(lines: List<Line>) = lines(JsonField.of(lines))

                /**
                 * Sets [Builder.lines] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lines] with a well-typed `List<Line>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lines(lines: JsonField<List<Line>>) = apply {
                    this.lines = lines.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Line] to [lines].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLine(line: Line) = apply {
                    lines =
                        (lines ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lines", it).add(line)
                        }
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
                 * Returns an immutable instance of [Column].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .lines()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Column =
                    Column(
                        checkRequired("lines", lines).map { it.toImmutable() },
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
            fun validate(): Column = apply {
                if (validated) {
                    return@apply
                }

                lines().forEach { it.validate() }
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
                (lines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** One grounded line of text with an optional per-word breakdown. */
            class Line
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bbox: JsonField<BBox>,
                private val span: JsonField<List<JsonValue>>,
                private val words: JsonField<List<Word>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<BBox> = JsonMissing.of(),
                    @JsonProperty("span")
                    @ExcludeMissing
                    span: JsonField<List<JsonValue>> = JsonMissing.of(),
                    @JsonProperty("words")
                    @ExcludeMissing
                    words: JsonField<List<Word>> = JsonMissing.of(),
                ) : this(bbox, span, words, mutableMapOf())

                /**
                 * Line bounding box
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bbox(): BBox = bbox.getRequired("bbox")

                /**
                 * `[start, end)` UTF-8 byte span in the complete source property string
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun span(): List<JsonValue> = span.getRequired("span")

                /**
                 * Per-word grounding within the line, when available
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun words(): Optional<List<Word>> = words.getOptional("words")

                /**
                 * Returns the raw JSON value of [bbox].
                 *
                 * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<BBox> = bbox

                /**
                 * Returns the raw JSON value of [span].
                 *
                 * Unlike [span], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("span") @ExcludeMissing fun _span(): JsonField<List<JsonValue>> = span

                /**
                 * Returns the raw JSON value of [words].
                 *
                 * Unlike [words], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("words") @ExcludeMissing fun _words(): JsonField<List<Word>> = words

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
                     * Returns a mutable builder for constructing an instance of [Line].
                     *
                     * The following fields are required:
                     * ```java
                     * .bbox()
                     * .span()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Line]. */
                class Builder internal constructor() {

                    private var bbox: JsonField<BBox>? = null
                    private var span: JsonField<MutableList<JsonValue>>? = null
                    private var words: JsonField<MutableList<Word>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(line: Line) = apply {
                        bbox = line.bbox
                        span = line.span.map { it.toMutableList() }
                        words = line.words.map { it.toMutableList() }
                        additionalProperties = line.additionalProperties.toMutableMap()
                    }

                    /** Line bounding box */
                    fun bbox(bbox: BBox) = bbox(JsonField.of(bbox))

                    /**
                     * Sets [Builder.bbox] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bbox] with a well-typed [BBox] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bbox(bbox: JsonField<BBox>) = apply { this.bbox = bbox }

                    /** `[start, end)` UTF-8 byte span in the complete source property string */
                    fun span(span: List<JsonValue>) = span(JsonField.of(span))

                    /**
                     * Sets [Builder.span] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.span] with a well-typed `List<JsonValue>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun span(span: JsonField<List<JsonValue>>) = apply {
                        this.span = span.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [JsonValue] to [Builder.span].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSpan(span: JsonValue) = apply {
                        this.span =
                            (this.span ?: JsonField.of(mutableListOf())).also {
                                checkKnown("span", it).add(span)
                            }
                    }

                    /** Per-word grounding within the line, when available */
                    fun words(words: List<Word>?) = words(JsonField.ofNullable(words))

                    /** Alias for calling [Builder.words] with `words.orElse(null)`. */
                    fun words(words: Optional<List<Word>>) = words(words.getOrNull())

                    /**
                     * Sets [Builder.words] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.words] with a well-typed `List<Word>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun words(words: JsonField<List<Word>>) = apply {
                        this.words = words.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Word] to [words].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addWord(word: Word) = apply {
                        words =
                            (words ?: JsonField.of(mutableListOf())).also {
                                checkKnown("words", it).add(word)
                            }
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
                     * Returns an immutable instance of [Line].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bbox()
                     * .span()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Line =
                        Line(
                            checkRequired("bbox", bbox),
                            checkRequired("span", span).map { it.toImmutable() },
                            (words ?: JsonMissing.of()).map { it.toImmutable() },
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Line = apply {
                    if (validated) {
                        return@apply
                    }

                    bbox().validate()
                    span()
                    words().ifPresent { it.forEach { it.validate() } }
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
                    (bbox.asKnown().getOrNull()?.validity() ?: 0) +
                        (span.asKnown().getOrNull()?.size ?: 0) +
                        (words.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                /** One grounded word: a `[start, end)` span in the source text and its bbox. */
                class Word
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bbox: JsonField<BBox>,
                    private val span: JsonField<List<JsonValue>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bbox")
                        @ExcludeMissing
                        bbox: JsonField<BBox> = JsonMissing.of(),
                        @JsonProperty("span")
                        @ExcludeMissing
                        span: JsonField<List<JsonValue>> = JsonMissing.of(),
                    ) : this(bbox, span, mutableMapOf())

                    /**
                     * Word bounding box
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun bbox(): BBox = bbox.getRequired("bbox")

                    /**
                     * `[start, end)` UTF-8 byte span in the complete source property string
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun span(): List<JsonValue> = span.getRequired("span")

                    /**
                     * Returns the raw JSON value of [bbox].
                     *
                     * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<BBox> = bbox

                    /**
                     * Returns the raw JSON value of [span].
                     *
                     * Unlike [span], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("span")
                    @ExcludeMissing
                    fun _span(): JsonField<List<JsonValue>> = span

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
                         * Returns a mutable builder for constructing an instance of [Word].
                         *
                         * The following fields are required:
                         * ```java
                         * .bbox()
                         * .span()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Word]. */
                    class Builder internal constructor() {

                        private var bbox: JsonField<BBox>? = null
                        private var span: JsonField<MutableList<JsonValue>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(word: Word) = apply {
                            bbox = word.bbox
                            span = word.span.map { it.toMutableList() }
                            additionalProperties = word.additionalProperties.toMutableMap()
                        }

                        /** Word bounding box */
                        fun bbox(bbox: BBox) = bbox(JsonField.of(bbox))

                        /**
                         * Sets [Builder.bbox] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bbox] with a well-typed [BBox] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bbox(bbox: JsonField<BBox>) = apply { this.bbox = bbox }

                        /** `[start, end)` UTF-8 byte span in the complete source property string */
                        fun span(span: List<JsonValue>) = span(JsonField.of(span))

                        /**
                         * Sets [Builder.span] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.span] with a well-typed
                         * `List<JsonValue>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun span(span: JsonField<List<JsonValue>>) = apply {
                            this.span = span.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [JsonValue] to [Builder.span].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addSpan(span: JsonValue) = apply {
                            this.span =
                                (this.span ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("span", it).add(span)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Word].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bbox()
                         * .span()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Word =
                            Word(
                                checkRequired("bbox", bbox),
                                checkRequired("span", span).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Word = apply {
                        if (validated) {
                            return@apply
                        }

                        bbox().validate()
                        span()
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
                        (bbox.asKnown().getOrNull()?.validity() ?: 0) +
                            (span.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Word &&
                            bbox == other.bbox &&
                            span == other.span &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(bbox, span, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Word{bbox=$bbox, span=$span, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Line &&
                        bbox == other.bbox &&
                        span == other.span &&
                        words == other.words &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bbox, span, words, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Line{bbox=$bbox, span=$span, words=$words, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Column &&
                    lines == other.lines &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(lines, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Column{lines=$lines, additionalProperties=$additionalProperties}"
        }

        /** Supported text with half-open UTF-8 byte spans into the complete property string. */
        class Label
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val lines: JsonField<List<Line>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lines")
                @ExcludeMissing
                lines: JsonField<List<Line>> = JsonMissing.of()
            ) : this(lines, mutableMapOf())

            /**
             * Supported lines. Word requests include supported words; gaps are valid. Boxes use
             * final page coordinates and optional local rotation r.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lines(): List<Line> = lines.getRequired("lines")

            /**
             * Returns the raw JSON value of [lines].
             *
             * Unlike [lines], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lines") @ExcludeMissing fun _lines(): JsonField<List<Line>> = lines

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
                 * Returns a mutable builder for constructing an instance of [Label].
                 *
                 * The following fields are required:
                 * ```java
                 * .lines()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Label]. */
            class Builder internal constructor() {

                private var lines: JsonField<MutableList<Line>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(label: Label) = apply {
                    lines = label.lines.map { it.toMutableList() }
                    additionalProperties = label.additionalProperties.toMutableMap()
                }

                /**
                 * Supported lines. Word requests include supported words; gaps are valid. Boxes use
                 * final page coordinates and optional local rotation r.
                 */
                fun lines(lines: List<Line>) = lines(JsonField.of(lines))

                /**
                 * Sets [Builder.lines] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lines] with a well-typed `List<Line>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lines(lines: JsonField<List<Line>>) = apply {
                    this.lines = lines.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Line] to [lines].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLine(line: Line) = apply {
                    lines =
                        (lines ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lines", it).add(line)
                        }
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
                 * Returns an immutable instance of [Label].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .lines()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Label =
                    Label(
                        checkRequired("lines", lines).map { it.toImmutable() },
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
            fun validate(): Label = apply {
                if (validated) {
                    return@apply
                }

                lines().forEach { it.validate() }
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
                (lines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** One grounded line of text with an optional per-word breakdown. */
            class Line
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bbox: JsonField<BBox>,
                private val span: JsonField<List<JsonValue>>,
                private val words: JsonField<List<Word>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<BBox> = JsonMissing.of(),
                    @JsonProperty("span")
                    @ExcludeMissing
                    span: JsonField<List<JsonValue>> = JsonMissing.of(),
                    @JsonProperty("words")
                    @ExcludeMissing
                    words: JsonField<List<Word>> = JsonMissing.of(),
                ) : this(bbox, span, words, mutableMapOf())

                /**
                 * Line bounding box
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bbox(): BBox = bbox.getRequired("bbox")

                /**
                 * `[start, end)` UTF-8 byte span in the complete source property string
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun span(): List<JsonValue> = span.getRequired("span")

                /**
                 * Per-word grounding within the line, when available
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun words(): Optional<List<Word>> = words.getOptional("words")

                /**
                 * Returns the raw JSON value of [bbox].
                 *
                 * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<BBox> = bbox

                /**
                 * Returns the raw JSON value of [span].
                 *
                 * Unlike [span], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("span") @ExcludeMissing fun _span(): JsonField<List<JsonValue>> = span

                /**
                 * Returns the raw JSON value of [words].
                 *
                 * Unlike [words], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("words") @ExcludeMissing fun _words(): JsonField<List<Word>> = words

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
                     * Returns a mutable builder for constructing an instance of [Line].
                     *
                     * The following fields are required:
                     * ```java
                     * .bbox()
                     * .span()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Line]. */
                class Builder internal constructor() {

                    private var bbox: JsonField<BBox>? = null
                    private var span: JsonField<MutableList<JsonValue>>? = null
                    private var words: JsonField<MutableList<Word>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(line: Line) = apply {
                        bbox = line.bbox
                        span = line.span.map { it.toMutableList() }
                        words = line.words.map { it.toMutableList() }
                        additionalProperties = line.additionalProperties.toMutableMap()
                    }

                    /** Line bounding box */
                    fun bbox(bbox: BBox) = bbox(JsonField.of(bbox))

                    /**
                     * Sets [Builder.bbox] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bbox] with a well-typed [BBox] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bbox(bbox: JsonField<BBox>) = apply { this.bbox = bbox }

                    /** `[start, end)` UTF-8 byte span in the complete source property string */
                    fun span(span: List<JsonValue>) = span(JsonField.of(span))

                    /**
                     * Sets [Builder.span] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.span] with a well-typed `List<JsonValue>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun span(span: JsonField<List<JsonValue>>) = apply {
                        this.span = span.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [JsonValue] to [Builder.span].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSpan(span: JsonValue) = apply {
                        this.span =
                            (this.span ?: JsonField.of(mutableListOf())).also {
                                checkKnown("span", it).add(span)
                            }
                    }

                    /** Per-word grounding within the line, when available */
                    fun words(words: List<Word>?) = words(JsonField.ofNullable(words))

                    /** Alias for calling [Builder.words] with `words.orElse(null)`. */
                    fun words(words: Optional<List<Word>>) = words(words.getOrNull())

                    /**
                     * Sets [Builder.words] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.words] with a well-typed `List<Word>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun words(words: JsonField<List<Word>>) = apply {
                        this.words = words.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Word] to [words].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addWord(word: Word) = apply {
                        words =
                            (words ?: JsonField.of(mutableListOf())).also {
                                checkKnown("words", it).add(word)
                            }
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
                     * Returns an immutable instance of [Line].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bbox()
                     * .span()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Line =
                        Line(
                            checkRequired("bbox", bbox),
                            checkRequired("span", span).map { it.toImmutable() },
                            (words ?: JsonMissing.of()).map { it.toImmutable() },
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Line = apply {
                    if (validated) {
                        return@apply
                    }

                    bbox().validate()
                    span()
                    words().ifPresent { it.forEach { it.validate() } }
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
                    (bbox.asKnown().getOrNull()?.validity() ?: 0) +
                        (span.asKnown().getOrNull()?.size ?: 0) +
                        (words.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                /** One grounded word: a `[start, end)` span in the source text and its bbox. */
                class Word
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bbox: JsonField<BBox>,
                    private val span: JsonField<List<JsonValue>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bbox")
                        @ExcludeMissing
                        bbox: JsonField<BBox> = JsonMissing.of(),
                        @JsonProperty("span")
                        @ExcludeMissing
                        span: JsonField<List<JsonValue>> = JsonMissing.of(),
                    ) : this(bbox, span, mutableMapOf())

                    /**
                     * Word bounding box
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun bbox(): BBox = bbox.getRequired("bbox")

                    /**
                     * `[start, end)` UTF-8 byte span in the complete source property string
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun span(): List<JsonValue> = span.getRequired("span")

                    /**
                     * Returns the raw JSON value of [bbox].
                     *
                     * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<BBox> = bbox

                    /**
                     * Returns the raw JSON value of [span].
                     *
                     * Unlike [span], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("span")
                    @ExcludeMissing
                    fun _span(): JsonField<List<JsonValue>> = span

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
                         * Returns a mutable builder for constructing an instance of [Word].
                         *
                         * The following fields are required:
                         * ```java
                         * .bbox()
                         * .span()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Word]. */
                    class Builder internal constructor() {

                        private var bbox: JsonField<BBox>? = null
                        private var span: JsonField<MutableList<JsonValue>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(word: Word) = apply {
                            bbox = word.bbox
                            span = word.span.map { it.toMutableList() }
                            additionalProperties = word.additionalProperties.toMutableMap()
                        }

                        /** Word bounding box */
                        fun bbox(bbox: BBox) = bbox(JsonField.of(bbox))

                        /**
                         * Sets [Builder.bbox] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bbox] with a well-typed [BBox] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bbox(bbox: JsonField<BBox>) = apply { this.bbox = bbox }

                        /** `[start, end)` UTF-8 byte span in the complete source property string */
                        fun span(span: List<JsonValue>) = span(JsonField.of(span))

                        /**
                         * Sets [Builder.span] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.span] with a well-typed
                         * `List<JsonValue>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun span(span: JsonField<List<JsonValue>>) = apply {
                            this.span = span.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [JsonValue] to [Builder.span].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addSpan(span: JsonValue) = apply {
                            this.span =
                                (this.span ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("span", it).add(span)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Word].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bbox()
                         * .span()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Word =
                            Word(
                                checkRequired("bbox", bbox),
                                checkRequired("span", span).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Word = apply {
                        if (validated) {
                            return@apply
                        }

                        bbox().validate()
                        span()
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
                        (bbox.asKnown().getOrNull()?.validity() ?: 0) +
                            (span.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Word &&
                            bbox == other.bbox &&
                            span == other.span &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(bbox, span, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Word{bbox=$bbox, span=$span, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Line &&
                        bbox == other.bbox &&
                        span == other.span &&
                        words == other.words &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bbox, span, words, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Line{bbox=$bbox, span=$span, words=$words, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Label &&
                    lines == other.lines &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(lines, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Label{lines=$lines, additionalProperties=$additionalProperties}"
        }

        /** Supported text with half-open UTF-8 byte spans into the complete property string. */
        class FormTextGrounding
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val lines: JsonField<List<Line>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lines")
                @ExcludeMissing
                lines: JsonField<List<Line>> = JsonMissing.of()
            ) : this(lines, mutableMapOf())

            /**
             * Supported lines. Word requests include supported words; gaps are valid. Boxes use
             * final page coordinates and optional local rotation r.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lines(): List<Line> = lines.getRequired("lines")

            /**
             * Returns the raw JSON value of [lines].
             *
             * Unlike [lines], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lines") @ExcludeMissing fun _lines(): JsonField<List<Line>> = lines

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
                 * Returns a mutable builder for constructing an instance of [FormTextGrounding].
                 *
                 * The following fields are required:
                 * ```java
                 * .lines()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FormTextGrounding]. */
            class Builder internal constructor() {

                private var lines: JsonField<MutableList<Line>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(formTextGrounding: FormTextGrounding) = apply {
                    lines = formTextGrounding.lines.map { it.toMutableList() }
                    additionalProperties = formTextGrounding.additionalProperties.toMutableMap()
                }

                /**
                 * Supported lines. Word requests include supported words; gaps are valid. Boxes use
                 * final page coordinates and optional local rotation r.
                 */
                fun lines(lines: List<Line>) = lines(JsonField.of(lines))

                /**
                 * Sets [Builder.lines] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lines] with a well-typed `List<Line>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lines(lines: JsonField<List<Line>>) = apply {
                    this.lines = lines.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Line] to [lines].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLine(line: Line) = apply {
                    lines =
                        (lines ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lines", it).add(line)
                        }
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
                 * Returns an immutable instance of [FormTextGrounding].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .lines()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FormTextGrounding =
                    FormTextGrounding(
                        checkRequired("lines", lines).map { it.toImmutable() },
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
            fun validate(): FormTextGrounding = apply {
                if (validated) {
                    return@apply
                }

                lines().forEach { it.validate() }
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
                (lines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** One grounded line of text with an optional per-word breakdown. */
            class Line
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bbox: JsonField<BBox>,
                private val span: JsonField<List<JsonValue>>,
                private val words: JsonField<List<Word>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<BBox> = JsonMissing.of(),
                    @JsonProperty("span")
                    @ExcludeMissing
                    span: JsonField<List<JsonValue>> = JsonMissing.of(),
                    @JsonProperty("words")
                    @ExcludeMissing
                    words: JsonField<List<Word>> = JsonMissing.of(),
                ) : this(bbox, span, words, mutableMapOf())

                /**
                 * Line bounding box
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bbox(): BBox = bbox.getRequired("bbox")

                /**
                 * `[start, end)` UTF-8 byte span in the complete source property string
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun span(): List<JsonValue> = span.getRequired("span")

                /**
                 * Per-word grounding within the line, when available
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun words(): Optional<List<Word>> = words.getOptional("words")

                /**
                 * Returns the raw JSON value of [bbox].
                 *
                 * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<BBox> = bbox

                /**
                 * Returns the raw JSON value of [span].
                 *
                 * Unlike [span], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("span") @ExcludeMissing fun _span(): JsonField<List<JsonValue>> = span

                /**
                 * Returns the raw JSON value of [words].
                 *
                 * Unlike [words], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("words") @ExcludeMissing fun _words(): JsonField<List<Word>> = words

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
                     * Returns a mutable builder for constructing an instance of [Line].
                     *
                     * The following fields are required:
                     * ```java
                     * .bbox()
                     * .span()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Line]. */
                class Builder internal constructor() {

                    private var bbox: JsonField<BBox>? = null
                    private var span: JsonField<MutableList<JsonValue>>? = null
                    private var words: JsonField<MutableList<Word>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(line: Line) = apply {
                        bbox = line.bbox
                        span = line.span.map { it.toMutableList() }
                        words = line.words.map { it.toMutableList() }
                        additionalProperties = line.additionalProperties.toMutableMap()
                    }

                    /** Line bounding box */
                    fun bbox(bbox: BBox) = bbox(JsonField.of(bbox))

                    /**
                     * Sets [Builder.bbox] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bbox] with a well-typed [BBox] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bbox(bbox: JsonField<BBox>) = apply { this.bbox = bbox }

                    /** `[start, end)` UTF-8 byte span in the complete source property string */
                    fun span(span: List<JsonValue>) = span(JsonField.of(span))

                    /**
                     * Sets [Builder.span] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.span] with a well-typed `List<JsonValue>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun span(span: JsonField<List<JsonValue>>) = apply {
                        this.span = span.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [JsonValue] to [Builder.span].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSpan(span: JsonValue) = apply {
                        this.span =
                            (this.span ?: JsonField.of(mutableListOf())).also {
                                checkKnown("span", it).add(span)
                            }
                    }

                    /** Per-word grounding within the line, when available */
                    fun words(words: List<Word>?) = words(JsonField.ofNullable(words))

                    /** Alias for calling [Builder.words] with `words.orElse(null)`. */
                    fun words(words: Optional<List<Word>>) = words(words.getOrNull())

                    /**
                     * Sets [Builder.words] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.words] with a well-typed `List<Word>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun words(words: JsonField<List<Word>>) = apply {
                        this.words = words.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Word] to [words].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addWord(word: Word) = apply {
                        words =
                            (words ?: JsonField.of(mutableListOf())).also {
                                checkKnown("words", it).add(word)
                            }
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
                     * Returns an immutable instance of [Line].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bbox()
                     * .span()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Line =
                        Line(
                            checkRequired("bbox", bbox),
                            checkRequired("span", span).map { it.toImmutable() },
                            (words ?: JsonMissing.of()).map { it.toImmutable() },
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Line = apply {
                    if (validated) {
                        return@apply
                    }

                    bbox().validate()
                    span()
                    words().ifPresent { it.forEach { it.validate() } }
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
                    (bbox.asKnown().getOrNull()?.validity() ?: 0) +
                        (span.asKnown().getOrNull()?.size ?: 0) +
                        (words.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                /** One grounded word: a `[start, end)` span in the source text and its bbox. */
                class Word
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bbox: JsonField<BBox>,
                    private val span: JsonField<List<JsonValue>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bbox")
                        @ExcludeMissing
                        bbox: JsonField<BBox> = JsonMissing.of(),
                        @JsonProperty("span")
                        @ExcludeMissing
                        span: JsonField<List<JsonValue>> = JsonMissing.of(),
                    ) : this(bbox, span, mutableMapOf())

                    /**
                     * Word bounding box
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun bbox(): BBox = bbox.getRequired("bbox")

                    /**
                     * `[start, end)` UTF-8 byte span in the complete source property string
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun span(): List<JsonValue> = span.getRequired("span")

                    /**
                     * Returns the raw JSON value of [bbox].
                     *
                     * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<BBox> = bbox

                    /**
                     * Returns the raw JSON value of [span].
                     *
                     * Unlike [span], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("span")
                    @ExcludeMissing
                    fun _span(): JsonField<List<JsonValue>> = span

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
                         * Returns a mutable builder for constructing an instance of [Word].
                         *
                         * The following fields are required:
                         * ```java
                         * .bbox()
                         * .span()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Word]. */
                    class Builder internal constructor() {

                        private var bbox: JsonField<BBox>? = null
                        private var span: JsonField<MutableList<JsonValue>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(word: Word) = apply {
                            bbox = word.bbox
                            span = word.span.map { it.toMutableList() }
                            additionalProperties = word.additionalProperties.toMutableMap()
                        }

                        /** Word bounding box */
                        fun bbox(bbox: BBox) = bbox(JsonField.of(bbox))

                        /**
                         * Sets [Builder.bbox] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bbox] with a well-typed [BBox] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bbox(bbox: JsonField<BBox>) = apply { this.bbox = bbox }

                        /** `[start, end)` UTF-8 byte span in the complete source property string */
                        fun span(span: List<JsonValue>) = span(JsonField.of(span))

                        /**
                         * Sets [Builder.span] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.span] with a well-typed
                         * `List<JsonValue>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun span(span: JsonField<List<JsonValue>>) = apply {
                            this.span = span.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [JsonValue] to [Builder.span].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addSpan(span: JsonValue) = apply {
                            this.span =
                                (this.span ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("span", it).add(span)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Word].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bbox()
                         * .span()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Word =
                            Word(
                                checkRequired("bbox", bbox),
                                checkRequired("span", span).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Word = apply {
                        if (validated) {
                            return@apply
                        }

                        bbox().validate()
                        span()
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
                        (bbox.asKnown().getOrNull()?.validity() ?: 0) +
                            (span.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Word &&
                            bbox == other.bbox &&
                            span == other.span &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(bbox, span, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Word{bbox=$bbox, span=$span, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Line &&
                        bbox == other.bbox &&
                        span == other.span &&
                        words == other.words &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bbox, span, words, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Line{bbox=$bbox, span=$span, words=$words, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FormTextGrounding &&
                    lines == other.lines &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(lines, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FormTextGrounding{lines=$lines, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Grounding &&
                id == other.id &&
                columns == other.columns &&
                label == other.label &&
                rows == other.rows &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, columns, label, rows, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Grounding{id=$id, columns=$columns, label=$label, rows=$rows, additionalProperties=$additionalProperties}"
    }

    /** Form table node */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TABLE = of("table")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            TABLE
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TABLE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                TABLE -> Value.TABLE
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
                TABLE -> Known.TABLE
                else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormTable &&
            rows == other.rows &&
            id == other.id &&
            bbox == other.bbox &&
            columns == other.columns &&
            grounding == other.grounding &&
            label == other.label &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(rows, id, bbox, columns, grounding, label, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormTable{rows=$rows, id=$id, bbox=$bbox, columns=$columns, grounding=$grounding, label=$label, type=$type, additionalProperties=$additionalProperties}"
}
