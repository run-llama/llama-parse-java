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

/** One labeled form entry: a text input, checkbox, select group, or signature line. */
class FormField
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val field: JsonField<Field>,
    private val id: JsonField<String>,
    private val bbox: JsonField<List<BBox>>,
    private val grounding: JsonField<Grounding>,
    private val isEmpty: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val type: JsonField<Type>,
    private val value: JsonField<Value>,
    private val valueItems: JsonField<List<ValueItem>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("field") @ExcludeMissing field: JsonField<Field> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<List<BBox>> = JsonMissing.of(),
        @JsonProperty("grounding")
        @ExcludeMissing
        grounding: JsonField<Grounding> = JsonMissing.of(),
        @JsonProperty("isEmpty") @ExcludeMissing isEmpty: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
        @JsonProperty("valueItems")
        @ExcludeMissing
        valueItems: JsonField<List<ValueItem>> = JsonMissing.of(),
    ) : this(field, id, bbox, grounding, isEmpty, label, type, value, valueItems, mutableMapOf())

    /**
     * Kind of entry: text (any free-text input), checkbox, single_select, multi_select, or
     * signature
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun field(): Field = field.getRequired("field")

    /**
     * Field number/letter printed on the form (e.g. '1a'), if any
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Bounding boxes of the field's fillable area on the page.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bbox(): Optional<List<BBox>> = bbox.getOptional("bbox")

    /**
     * Optional grounding for a field's printed text; boolean states have no text spans.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grounding(): Optional<Grounding> = grounding.getOptional("grounding")

    /**
     * True for a printed-but-blank text field (mutually exclusive with value)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isEmpty(): Optional<Boolean> = isEmpty.getOptional("isEmpty")

    /**
     * Printed field caption, if any
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Form field node
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Entered content: verbatim text for text fields, or a boolean for checkbox (checked) and
     * signature (signed). Absent on blank text fields and on select groups
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Value> = value.getOptional("value")

    /**
     * Options of a single_select/multi_select group (only on select fields)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valueItems(): Optional<List<ValueItem>> = valueItems.getOptional("valueItems")

    /**
     * Returns the raw JSON value of [field].
     *
     * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

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
     * Returns the raw JSON value of [grounding].
     *
     * Unlike [grounding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grounding") @ExcludeMissing fun _grounding(): JsonField<Grounding> = grounding

    /**
     * Returns the raw JSON value of [isEmpty].
     *
     * Unlike [isEmpty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isEmpty") @ExcludeMissing fun _isEmpty(): JsonField<Boolean> = isEmpty

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

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

    /**
     * Returns the raw JSON value of [valueItems].
     *
     * Unlike [valueItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valueItems")
    @ExcludeMissing
    fun _valueItems(): JsonField<List<ValueItem>> = valueItems

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
         * Returns a mutable builder for constructing an instance of [FormField].
         *
         * The following fields are required:
         * ```java
         * .field()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormField]. */
    class Builder internal constructor() {

        private var field: JsonField<Field>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var bbox: JsonField<MutableList<BBox>>? = null
        private var grounding: JsonField<Grounding> = JsonMissing.of()
        private var isEmpty: JsonField<Boolean> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var value: JsonField<Value> = JsonMissing.of()
        private var valueItems: JsonField<MutableList<ValueItem>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formField: FormField) = apply {
            field = formField.field
            id = formField.id
            bbox = formField.bbox.map { it.toMutableList() }
            grounding = formField.grounding
            isEmpty = formField.isEmpty
            label = formField.label
            type = formField.type
            value = formField.value
            valueItems = formField.valueItems.map { it.toMutableList() }
            additionalProperties = formField.additionalProperties.toMutableMap()
        }

        /**
         * Kind of entry: text (any free-text input), checkbox, single_select, multi_select, or
         * signature
         */
        fun field(field: Field) = field(JsonField.of(field))

        /**
         * Sets [Builder.field] to an arbitrary JSON value.
         *
         * You should usually call [Builder.field] with a well-typed [Field] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun field(field: JsonField<Field>) = apply { this.field = field }

        /** Field number/letter printed on the form (e.g. '1a'), if any */
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

        /** Bounding boxes of the field's fillable area on the page. */
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

        /** Optional grounding for a field's printed text; boolean states have no text spans. */
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

        /** True for a printed-but-blank text field (mutually exclusive with value) */
        fun isEmpty(isEmpty: Boolean?) = isEmpty(JsonField.ofNullable(isEmpty))

        /**
         * Alias for [Builder.isEmpty].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isEmpty(isEmpty: Boolean) = isEmpty(isEmpty as Boolean?)

        /** Alias for calling [Builder.isEmpty] with `isEmpty.orElse(null)`. */
        fun isEmpty(isEmpty: Optional<Boolean>) = isEmpty(isEmpty.getOrNull())

        /**
         * Sets [Builder.isEmpty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isEmpty] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isEmpty(isEmpty: JsonField<Boolean>) = apply { this.isEmpty = isEmpty }

        /** Printed field caption, if any */
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

        /** Form field node */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * Entered content: verbatim text for text fields, or a boolean for checkbox (checked) and
         * signature (signed). Absent on blank text fields and on select groups
         */
        fun value(value: Value?) = value(JsonField.ofNullable(value))

        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
        fun value(value: Optional<Value>) = value(value.getOrNull())

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Value] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Value>) = apply { this.value = value }

        /** Alias for calling [value] with `Value.ofString(string)`. */
        fun value(string: String) = value(Value.ofString(string))

        /** Alias for calling [value] with `Value.ofBool(bool)`. */
        fun value(bool: Boolean) = value(Value.ofBool(bool))

        /** Options of a single_select/multi_select group (only on select fields) */
        fun valueItems(valueItems: List<ValueItem>?) = valueItems(JsonField.ofNullable(valueItems))

        /** Alias for calling [Builder.valueItems] with `valueItems.orElse(null)`. */
        fun valueItems(valueItems: Optional<List<ValueItem>>) = valueItems(valueItems.getOrNull())

        /**
         * Sets [Builder.valueItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valueItems] with a well-typed `List<ValueItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun valueItems(valueItems: JsonField<List<ValueItem>>) = apply {
            this.valueItems = valueItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [ValueItem] to [valueItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValueItem(valueItem: ValueItem) = apply {
            valueItems =
                (valueItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("valueItems", it).add(valueItem)
                }
        }

        /** Alias for calling [addValueItem] with `ValueItem.ofField(field)`. */
        fun addValueItem(field: FormField) = addValueItem(ValueItem.ofField(field))

        /**
         * Alias for calling [addValueItem] with the following:
         * ```java
         * FormField.builder()
         *     .type(FormField.Type.FIELD)
         *     .field(field)
         *     .build()
         * ```
         */
        fun addFieldValueItem(field: Field) =
            addValueItem(FormField.builder().type(FormField.Type.FIELD).field(field).build())

        /** Alias for calling [addValueItem] with `ValueItem.ofSection(section)`. */
        fun addValueItem(section: FormSection) = addValueItem(ValueItem.ofSection(section))

        /**
         * Alias for calling [addValueItem] with the following:
         * ```java
         * FormSection.builder()
         *     .type(FormSection.Type.SECTION)
         *     .items(items)
         *     .build()
         * ```
         */
        fun addSectionValueItem(items: List<FormSection.Item>) =
            addValueItem(FormSection.builder().type(FormSection.Type.SECTION).items(items).build())

        /** Alias for calling [addValueItem] with `ValueItem.ofTable(table)`. */
        fun addValueItem(table: FormTable) = addValueItem(ValueItem.ofTable(table))

        /**
         * Alias for calling [addValueItem] with the following:
         * ```java
         * FormTable.builder()
         *     .type(FormTable.Type.TABLE)
         *     .rows(rows)
         *     .build()
         * ```
         */
        fun addTableValueItem(rows: List<List<FormTable.Row?>>) =
            addValueItem(FormTable.builder().type(FormTable.Type.TABLE).rows(rows).build())

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
         * Returns an immutable instance of [FormField].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .field()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormField =
            FormField(
                checkRequired("field", field),
                id,
                (bbox ?: JsonMissing.of()).map { it.toImmutable() },
                grounding,
                isEmpty,
                label,
                type,
                value,
                (valueItems ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): FormField = apply {
        if (validated) {
            return@apply
        }

        field().validate()
        id()
        bbox().ifPresent { it.forEach { it.validate() } }
        grounding().ifPresent { it.validate() }
        isEmpty()
        label()
        type().ifPresent { it.validate() }
        value().ifPresent { it.validate() }
        valueItems().ifPresent { it.forEach { it.validate() } }
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
        (field.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (bbox.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (grounding.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isEmpty.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (value.asKnown().getOrNull()?.validity() ?: 0) +
            (valueItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * Kind of entry: text (any free-text input), checkbox, single_select, multi_select, or
     * signature
     */
    class Field @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CHECKBOX = of("checkbox")

            @JvmField val MULTI_SELECT = of("multi_select")

            @JvmField val SIGNATURE = of("signature")

            @JvmField val SINGLE_SELECT = of("single_select")

            @JvmField val TEXT = of("text")

            @JvmStatic fun of(value: String) = Field(JsonField.of(value))
        }

        /** An enum containing [Field]'s known values. */
        enum class Known {
            CHECKBOX,
            MULTI_SELECT,
            SIGNATURE,
            SINGLE_SELECT,
            TEXT,
        }

        /**
         * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Field] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHECKBOX,
            MULTI_SELECT,
            SIGNATURE,
            SINGLE_SELECT,
            TEXT,
            /** An enum member indicating that [Field] was instantiated with an unknown value. */
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
                CHECKBOX -> Value.CHECKBOX
                MULTI_SELECT -> Value.MULTI_SELECT
                SIGNATURE -> Value.SIGNATURE
                SINGLE_SELECT -> Value.SINGLE_SELECT
                TEXT -> Value.TEXT
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
                CHECKBOX -> Known.CHECKBOX
                MULTI_SELECT -> Known.MULTI_SELECT
                SIGNATURE -> Known.SIGNATURE
                SINGLE_SELECT -> Known.SINGLE_SELECT
                TEXT -> Known.TEXT
                else -> throw LlamaCloudInvalidDataException("Unknown Field: $value")
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
        fun validate(): Field = apply {
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

            return other is Field && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Optional grounding for a field's printed text; boolean states have no text spans. */
    class Grounding
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Id>,
        private val label: JsonField<Label>,
        private val value: JsonField<Value>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Id> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<Label> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
        ) : this(id, label, value, mutableMapOf())

        /**
         * Supported text with half-open UTF-8 byte spans into the complete property string.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<Id> = id.getOptional("id")

        /**
         * Supported text with half-open UTF-8 byte spans into the complete property string.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun label(): Optional<Label> = label.getOptional("label")

        /**
         * Supported text with half-open UTF-8 byte spans into the complete property string.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<Value> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Id> = id

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<Label> = label

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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
            private var label: JsonField<Label> = JsonMissing.of()
            private var value: JsonField<Value> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(grounding: Grounding) = apply {
                id = grounding.id
                label = grounding.label
                value = grounding.value
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

            /** Supported text with half-open UTF-8 byte spans into the complete property string. */
            fun value(value: Value?) = value(JsonField.ofNullable(value))

            /** Alias for calling [Builder.value] with `value.orElse(null)`. */
            fun value(value: Optional<Value>) = value(value.getOrNull())

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Value] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Value>) = apply { this.value = value }

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
                Grounding(id, label, value, additionalProperties.toMutableMap())
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
            label().ifPresent { it.validate() }
            value().ifPresent { it.validate() }
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
                (label.asKnown().getOrNull()?.validity() ?: 0) +
                (value.asKnown().getOrNull()?.validity() ?: 0)

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
        class Value
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
                 * Returns a mutable builder for constructing an instance of [Value].
                 *
                 * The following fields are required:
                 * ```java
                 * .lines()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Value]. */
            class Builder internal constructor() {

                private var lines: JsonField<MutableList<Line>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(value: Value) = apply {
                    lines = value.lines.map { it.toMutableList() }
                    additionalProperties = value.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Value].
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
                fun build(): Value =
                    Value(
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
            fun validate(): Value = apply {
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

                return other is Value &&
                    lines == other.lines &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(lines, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Value{lines=$lines, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Grounding &&
                id == other.id &&
                label == other.label &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, label, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Grounding{id=$id, label=$label, value=$value, additionalProperties=$additionalProperties}"
    }

    /** Form field node */
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

            @JvmField val FIELD = of("field")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            FIELD
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
            FIELD,
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
                FIELD -> Value.FIELD
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
                FIELD -> Known.FIELD
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

    /**
     * Entered content: verbatim text for text fields, or a boolean for checkbox (checked) and
     * signature (signed). Absent on blank text fields and on select groups
     */
    @JsonDeserialize(using = Value.Deserializer::class)
    @JsonSerialize(using = Value.Serializer::class)
    class Value
    private constructor(
        private val string: String? = null,
        private val bool: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun isString(): Boolean = string != null

        fun isBool(): Boolean = bool != null

        fun asString(): String = string.getOrThrow("string")

        fun asBool(): Boolean = bool.getOrThrow("bool")

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
         * Optional<String> result = value.accept(new Value.Visitor<Optional<String>>() {
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
                bool != null -> visitor.visitBool(bool)
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
        fun validate(): Value = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitBool(bool: Boolean) {}
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

                    override fun visitBool(bool: Boolean) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Value && string == other.string && bool == other.bool
        }

        override fun hashCode(): Int = Objects.hash(string, bool)

        override fun toString(): String =
            when {
                string != null -> "Value{string=$string}"
                bool != null -> "Value{bool=$bool}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Value(string = string)

            @JvmStatic fun ofBool(bool: Boolean) = Value(bool = bool)
        }

        /** An interface that defines how to map each variant of [Value] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitBool(bool: Boolean): T

            /**
             * Maps an unknown variant of [Value] to a value of type [T].
             *
             * An instance of [Value] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
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
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                Value(bool = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from integer).
                    0 -> Value(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
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
                    value.string != null -> generator.writeObject(value.string)
                    value.bool != null -> generator.writeObject(value.bool)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Value")
                }
            }
        }
    }

    /** One labeled form entry: a text input, checkbox, select group, or signature line. */
    @JsonDeserialize(using = ValueItem.Deserializer::class)
    @JsonSerialize(using = ValueItem.Serializer::class)
    class ValueItem
    private constructor(
        private val field: FormField? = null,
        private val section: FormSection? = null,
        private val table: FormTable? = null,
        private val _json: JsonValue? = null,
    ) {

        /** One labeled form entry: a text input, checkbox, select group, or signature line. */
        fun field(): Optional<FormField> = Optional.ofNullable(field)

        /** A grouping of form content, in the form's reading order. */
        fun section(): Optional<FormSection> = Optional.ofNullable(section)

        /** A fillable grid printed on the form: repeating records or a row-by-column matrix. */
        fun table(): Optional<FormTable> = Optional.ofNullable(table)

        fun isField(): Boolean = field != null

        fun isSection(): Boolean = section != null

        fun isTable(): Boolean = table != null

        /** One labeled form entry: a text input, checkbox, select group, or signature line. */
        fun asField(): FormField = field.getOrThrow("field")

        /** A grouping of form content, in the form's reading order. */
        fun asSection(): FormSection = section.getOrThrow("section")

        /** A fillable grid printed on the form: repeating records or a row-by-column matrix. */
        fun asTable(): FormTable = table.getOrThrow("table")

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
         * Optional<String> result = valueItem.accept(new ValueItem.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitField(FormField field) {
         *         return Optional.of(field.toString());
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
                field != null -> visitor.visitField(field)
                section != null -> visitor.visitSection(section)
                table != null -> visitor.visitTable(table)
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
        fun validate(): ValueItem = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitField(field: FormField) {
                        field.validate()
                    }

                    override fun visitSection(section: FormSection) {
                        section.validate()
                    }

                    override fun visitTable(table: FormTable) {
                        table.validate()
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
                    override fun visitField(field: FormField) = field.validity()

                    override fun visitSection(section: FormSection) = section.validity()

                    override fun visitTable(table: FormTable) = table.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ValueItem &&
                field == other.field &&
                section == other.section &&
                table == other.table
        }

        override fun hashCode(): Int = Objects.hash(field, section, table)

        override fun toString(): String =
            when {
                field != null -> "ValueItem{field=$field}"
                section != null -> "ValueItem{section=$section}"
                table != null -> "ValueItem{table=$table}"
                _json != null -> "ValueItem{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ValueItem")
            }

        companion object {

            /** One labeled form entry: a text input, checkbox, select group, or signature line. */
            @JvmStatic fun ofField(field: FormField) = ValueItem(field = field)

            /** A grouping of form content, in the form's reading order. */
            @JvmStatic fun ofSection(section: FormSection) = ValueItem(section = section)

            /** A fillable grid printed on the form: repeating records or a row-by-column matrix. */
            @JvmStatic fun ofTable(table: FormTable) = ValueItem(table = table)
        }

        /**
         * An interface that defines how to map each variant of [ValueItem] to a value of type [T].
         */
        interface Visitor<out T> {

            /** One labeled form entry: a text input, checkbox, select group, or signature line. */
            fun visitField(field: FormField): T

            /** A grouping of form content, in the form's reading order. */
            fun visitSection(section: FormSection): T

            /** A fillable grid printed on the form: repeating records or a row-by-column matrix. */
            fun visitTable(table: FormTable): T

            /**
             * Maps an unknown variant of [ValueItem] to a value of type [T].
             *
             * An instance of [ValueItem] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown ValueItem: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ValueItem>(ValueItem::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ValueItem {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "field" -> {
                        return tryDeserialize(node, jacksonTypeRef<FormField>())?.let {
                            ValueItem(field = it, _json = json)
                        } ?: ValueItem(_json = json)
                    }
                    "section" -> {
                        return tryDeserialize(node, jacksonTypeRef<FormSection>())?.let {
                            ValueItem(section = it, _json = json)
                        } ?: ValueItem(_json = json)
                    }
                    "table" -> {
                        return tryDeserialize(node, jacksonTypeRef<FormTable>())?.let {
                            ValueItem(table = it, _json = json)
                        } ?: ValueItem(_json = json)
                    }
                }

                return ValueItem(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<ValueItem>(ValueItem::class) {

            override fun serialize(
                value: ValueItem,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.field != null -> generator.writeObject(value.field)
                    value.section != null -> generator.writeObject(value.section)
                    value.table != null -> generator.writeObject(value.table)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ValueItem")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormField &&
            field == other.field &&
            id == other.id &&
            bbox == other.bbox &&
            grounding == other.grounding &&
            isEmpty == other.isEmpty &&
            label == other.label &&
            type == other.type &&
            value == other.value &&
            valueItems == other.valueItems &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            field,
            id,
            bbox,
            grounding,
            isEmpty,
            label,
            type,
            value,
            valueItems,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormField{field=$field, id=$id, bbox=$bbox, grounding=$grounding, isEmpty=$isEmpty, label=$label, type=$type, value=$value, valueItems=$valueItems, additionalProperties=$additionalProperties}"
}
