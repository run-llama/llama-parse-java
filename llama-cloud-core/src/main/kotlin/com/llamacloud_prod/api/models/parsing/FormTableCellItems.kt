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

/** A table cell holding its own form nodes (e.g. a checkbox column). */
class FormTableCellItems
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of()
    ) : this(items, mutableMapOf())

    /**
     * Form nodes inside the cell
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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
         * Returns a mutable builder for constructing an instance of [FormTableCellItems].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormTableCellItems]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formTableCellItems: FormTableCellItems) = apply {
            items = formTableCellItems.items.map { it.toMutableList() }
            additionalProperties = formTableCellItems.additionalProperties.toMutableMap()
        }

        /** Form nodes inside the cell */
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
        fun addSectionItem(items: List<FormSection.Item>) =
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
         * Returns an immutable instance of [FormTableCellItems].
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
        fun build(): FormTableCellItems =
            FormTableCellItems(
                checkRequired("items", items).map { it.toImmutable() },
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
    fun validate(): FormTableCellItems = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormTableCellItems &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormTableCellItems{items=$items, additionalProperties=$additionalProperties}"
}
