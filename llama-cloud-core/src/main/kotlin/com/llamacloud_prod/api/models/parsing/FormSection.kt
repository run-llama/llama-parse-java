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
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.getOrThrow
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A grouping of form content, in the form's reading order. */
class FormSection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val id: JsonField<String>,
    private val label: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(items, id, label, type, mutableMapOf())

    /**
     * Child form nodes in reading order
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Identifier printed on the form (e.g. 'Part III'), if any
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Printed section heading, if any
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Form section node
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns a mutable builder for constructing an instance of [FormSection].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormSection]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formSection: FormSection) = apply {
            items = formSection.items.map { it.toMutableList() }
            id = formSection.id
            label = formSection.label
            type = formSection.type
            additionalProperties = formSection.additionalProperties.toMutableMap()
        }

        /** Child form nodes in reading order */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /** Alias for calling [addItem] with `Item.ofField(field)`. */
        fun addItem(field: FormField) = addItem(Item.ofField(field))

        /**
         * Alias for calling [addItem] with the following:
         * ```java
         * FormField.builder()
         *     .type(FormField.Type.FIELD)
         *     .field(field)
         *     .build()
         * ```
         */
        fun addFieldItem(field: FormField.Field) =
            addItem(FormField.builder().type(FormField.Type.FIELD).field(field).build())

        /** Alias for calling [addItem] with `Item.ofSection(section)`. */
        fun addItem(section: FormSection) = addItem(Item.ofSection(section))

        /**
         * Alias for calling [addItem] with the following:
         * ```java
         * FormSection.builder()
         *     .type(FormSection.Type.SECTION)
         *     .items(items)
         *     .build()
         * ```
         */
        fun addSectionItem(items: List<Item>) =
            addItem(FormSection.builder().type(FormSection.Type.SECTION).items(items).build())

        /** Alias for calling [addItem] with `Item.ofTable(table)`. */
        fun addItem(table: FormTable) = addItem(Item.ofTable(table))

        /**
         * Alias for calling [addItem] with the following:
         * ```java
         * FormTable.builder()
         *     .type(FormTable.Type.TABLE)
         *     .rows(rows)
         *     .build()
         * ```
         */
        fun addTableItem(rows: List<List<FormTable.Row?>>) =
            addItem(FormTable.builder().type(FormTable.Type.TABLE).rows(rows).build())

        /** Identifier printed on the form (e.g. 'Part III'), if any */
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

        /** Printed section heading, if any */
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

        /** Form section node */
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
         * Returns an immutable instance of [FormSection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormSection =
            FormSection(
                checkRequired("items", items).map { it.toImmutable() },
                id,
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
    fun validate(): FormSection = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        id()
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** One labeled form entry: a text input, checkbox, select group, or signature line. */
    @JsonDeserialize(using = Item.Deserializer::class)
    @JsonSerialize(using = Item.Serializer::class)
    class Item
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
         * import com.llamacloud_prod.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = item.accept(new Item.Visitor<Optional<String>>() {
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
        fun validate(): Item = apply {
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

            return other is Item &&
                field == other.field &&
                section == other.section &&
                table == other.table
        }

        override fun hashCode(): Int = Objects.hash(field, section, table)

        override fun toString(): String =
            when {
                field != null -> "Item{field=$field}"
                section != null -> "Item{section=$section}"
                table != null -> "Item{table=$table}"
                _json != null -> "Item{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Item")
            }

        companion object {

            /** One labeled form entry: a text input, checkbox, select group, or signature line. */
            @JvmStatic fun ofField(field: FormField) = Item(field = field)

            /** A grouping of form content, in the form's reading order. */
            @JvmStatic fun ofSection(section: FormSection) = Item(section = section)

            /** A fillable grid printed on the form: repeating records or a row-by-column matrix. */
            @JvmStatic fun ofTable(table: FormTable) = Item(table = table)
        }

        /** An interface that defines how to map each variant of [Item] to a value of type [T]. */
        interface Visitor<out T> {

            /** One labeled form entry: a text input, checkbox, select group, or signature line. */
            fun visitField(field: FormField): T

            /** A grouping of form content, in the form's reading order. */
            fun visitSection(section: FormSection): T

            /** A fillable grid printed on the form: repeating records or a row-by-column matrix. */
            fun visitTable(table: FormTable): T

            /**
             * Maps an unknown variant of [Item] to a value of type [T].
             *
             * An instance of [Item] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown Item: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Item>(Item::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Item {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "field" -> {
                        return tryDeserialize(node, jacksonTypeRef<FormField>())?.let {
                            Item(field = it, _json = json)
                        } ?: Item(_json = json)
                    }
                    "section" -> {
                        return tryDeserialize(node, jacksonTypeRef<FormSection>())?.let {
                            Item(section = it, _json = json)
                        } ?: Item(_json = json)
                    }
                    "table" -> {
                        return tryDeserialize(node, jacksonTypeRef<FormTable>())?.let {
                            Item(table = it, _json = json)
                        } ?: Item(_json = json)
                    }
                }

                return Item(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Item>(Item::class) {

            override fun serialize(
                value: Item,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.field != null -> generator.writeObject(value.field)
                    value.section != null -> generator.writeObject(value.section)
                    value.table != null -> generator.writeObject(value.table)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Item")
                }
            }
        }
    }

    /** Form section node */
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

            @JvmField val SECTION = of("section")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SECTION
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
            SECTION,
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
                SECTION -> Value.SECTION
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
                SECTION -> Known.SECTION
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

        return other is FormSection &&
            items == other.items &&
            id == other.id &&
            label == other.label &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, id, label, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormSection{items=$items, id=$id, label=$label, type=$type, additionalProperties=$additionalProperties}"
}
