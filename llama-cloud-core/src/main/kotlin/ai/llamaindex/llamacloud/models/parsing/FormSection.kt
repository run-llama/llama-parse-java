// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.BaseDeserializer
import ai.llamaindex.llamacloud.core.BaseSerializer
import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
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

/** A grouping of form content, in the form's reading order. */
class FormSection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val id: JsonField<String>,
    private val grounding: JsonField<Grounding>,
    private val label: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grounding")
        @ExcludeMissing
        grounding: JsonField<Grounding> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(items, id, grounding, label, type, mutableMapOf())

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
     * Optional grounding for printed identifiers and headings.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grounding(): Optional<Grounding> = grounding.getOptional("grounding")

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
        private var grounding: JsonField<Grounding> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formSection: FormSection) = apply {
            items = formSection.items.map { it.toMutableList() }
            id = formSection.id
            grounding = formSection.grounding
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

        /** Optional grounding for printed identifiers and headings. */
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
    fun validate(): FormSection = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        id()
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (grounding.asKnown().getOrNull()?.validity() ?: 0) +
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
         * import ai.llamaindex.llamacloud.core.JsonValue;
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

    /** Optional grounding for printed identifiers and headings. */
    class Grounding
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Id>,
        private val label: JsonField<Label>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Id> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<Label> = JsonMissing.of(),
        ) : this(id, label, mutableMapOf())

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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(grounding: Grounding) = apply {
                id = grounding.id
                label = grounding.label
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
            fun build(): Grounding = Grounding(id, label, additionalProperties.toMutableMap())
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
                (label.asKnown().getOrNull()?.validity() ?: 0)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Grounding &&
                id == other.id &&
                label == other.label &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, label, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Grounding{id=$id, label=$label, additionalProperties=$additionalProperties}"
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
            grounding == other.grounding &&
            label == other.label &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(items, id, grounding, label, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormSection{items=$items, id=$id, grounding=$grounding, label=$label, type=$type, additionalProperties=$additionalProperties}"
}
