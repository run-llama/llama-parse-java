// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

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

/** A fillable grid printed on the form: repeating records or a row-by-column matrix. */
class FormTable
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val rows: JsonField<List<List<Row?>>>,
    private val id: JsonField<String>,
    private val columns: JsonField<List<String>>,
    private val label: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("rows") @ExcludeMissing rows: JsonField<List<List<Row?>>> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("columns")
        @ExcludeMissing
        columns: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(rows, id, columns, label, type, mutableMapOf())

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
     * Printed column headers in order, if any
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun columns(): Optional<List<String>> = columns.getOptional("columns")

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
     * Returns the raw JSON value of [columns].
     *
     * Unlike [columns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("columns") @ExcludeMissing fun _columns(): JsonField<List<String>> = columns

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
        private var columns: JsonField<MutableList<String>>? = null
        private var label: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formTable: FormTable) = apply {
            rows = formTable.rows.map { it.toMutableList() }
            id = formTable.id
            columns = formTable.columns.map { it.toMutableList() }
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
                (columns ?: JsonMissing.of()).map { it.toImmutable() },
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
        columns()
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
            (columns.asKnown().getOrNull()?.size ?: 0) +
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
         * import com.llamacloud_prod.api.core.JsonValue;
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
            columns == other.columns &&
            label == other.label &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(rows, id, columns, label, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormTable{rows=$rows, id=$id, columns=$columns, label=$label, type=$type, additionalProperties=$additionalProperties}"
}
