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

/** The list representation of form content: nested lists of rendered field lines. */
class FormListItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val md: JsonField<String>,
    private val ordered: JsonField<Boolean>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        @JsonProperty("md") @ExcludeMissing md: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ordered") @ExcludeMissing ordered: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(items, md, ordered, type, mutableMapOf())

    /**
     * Nested lines and sub-lists, in the form's reading order
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Markdown representation of this list
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun md(): String = md.getRequired("md")

    /**
     * Whether the list is ordered
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ordered(): Boolean = ordered.getRequired("ordered")

    /**
     * List node
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
     * Returns the raw JSON value of [md].
     *
     * Unlike [md], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("md") @ExcludeMissing fun _md(): JsonField<String> = md

    /**
     * Returns the raw JSON value of [ordered].
     *
     * Unlike [ordered], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ordered") @ExcludeMissing fun _ordered(): JsonField<Boolean> = ordered

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
         * Returns a mutable builder for constructing an instance of [FormListItem].
         *
         * The following fields are required:
         * ```java
         * .items()
         * .md()
         * .ordered()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormListItem]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var md: JsonField<String>? = null
        private var ordered: JsonField<Boolean>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formListItem: FormListItem) = apply {
            items = formListItem.items.map { it.toMutableList() }
            md = formListItem.md
            ordered = formListItem.ordered
            type = formListItem.type
            additionalProperties = formListItem.additionalProperties.toMutableMap()
        }

        /** Nested lines and sub-lists, in the form's reading order */
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

        /** Alias for calling [addItem] with `Item.ofFormListText(formListText)`. */
        fun addItem(formListText: FormListTextItem) = addItem(Item.ofFormListText(formListText))

        /** Alias for calling [addItem] with `Item.ofFormList(formList)`. */
        fun addItem(formList: FormListItem) = addItem(Item.ofFormList(formList))

        /** Markdown representation of this list */
        fun md(md: String) = md(JsonField.of(md))

        /**
         * Sets [Builder.md] to an arbitrary JSON value.
         *
         * You should usually call [Builder.md] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun md(md: JsonField<String>) = apply { this.md = md }

        /** Whether the list is ordered */
        fun ordered(ordered: Boolean) = ordered(JsonField.of(ordered))

        /**
         * Sets [Builder.ordered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ordered] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ordered(ordered: JsonField<Boolean>) = apply { this.ordered = ordered }

        /** List node */
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
         * Returns an immutable instance of [FormListItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * .md()
         * .ordered()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormListItem =
            FormListItem(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("md", md),
                checkRequired("ordered", ordered),
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
    fun validate(): FormListItem = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        md()
        ordered()
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
            (if (md.asKnown().isPresent) 1 else 0) +
            (if (ordered.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** One line of a form's list representation. */
    @JsonDeserialize(using = Item.Deserializer::class)
    @JsonSerialize(using = Item.Serializer::class)
    class Item
    private constructor(
        private val formListText: FormListTextItem? = null,
        private val formList: FormListItem? = null,
        private val _json: JsonValue? = null,
    ) {

        /** One line of a form's list representation. */
        fun formListText(): Optional<FormListTextItem> = Optional.ofNullable(formListText)

        /** The list representation of form content: nested lists of rendered field lines. */
        fun formList(): Optional<FormListItem> = Optional.ofNullable(formList)

        fun isFormListText(): Boolean = formListText != null

        fun isFormList(): Boolean = formList != null

        /** One line of a form's list representation. */
        fun asFormListText(): FormListTextItem = formListText.getOrThrow("formListText")

        /** The list representation of form content: nested lists of rendered field lines. */
        fun asFormList(): FormListItem = formList.getOrThrow("formList")

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
         *     public Optional<String> visitFormListText(FormListTextItem formListText) {
         *         return Optional.of(formListText.toString());
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
                formListText != null -> visitor.visitFormListText(formListText)
                formList != null -> visitor.visitFormList(formList)
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
                    override fun visitFormListText(formListText: FormListTextItem) {
                        formListText.validate()
                    }

                    override fun visitFormList(formList: FormListItem) {
                        formList.validate()
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
                    override fun visitFormListText(formListText: FormListTextItem) =
                        formListText.validity()

                    override fun visitFormList(formList: FormListItem) = formList.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item && formListText == other.formListText && formList == other.formList
        }

        override fun hashCode(): Int = Objects.hash(formListText, formList)

        override fun toString(): String =
            when {
                formListText != null -> "Item{formListText=$formListText}"
                formList != null -> "Item{formList=$formList}"
                _json != null -> "Item{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Item")
            }

        companion object {

            /** One line of a form's list representation. */
            @JvmStatic
            fun ofFormListText(formListText: FormListTextItem) = Item(formListText = formListText)

            /** The list representation of form content: nested lists of rendered field lines. */
            @JvmStatic fun ofFormList(formList: FormListItem) = Item(formList = formList)
        }

        /** An interface that defines how to map each variant of [Item] to a value of type [T]. */
        interface Visitor<out T> {

            /** One line of a form's list representation. */
            fun visitFormListText(formListText: FormListTextItem): T

            /** The list representation of form content: nested lists of rendered field lines. */
            fun visitFormList(formList: FormListItem): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<FormListTextItem>())?.let {
                                Item(formListText = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormListItem>())?.let {
                                Item(formList = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Item(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Item>(Item::class) {

            override fun serialize(
                value: Item,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.formListText != null -> generator.writeObject(value.formListText)
                    value.formList != null -> generator.writeObject(value.formList)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Item")
                }
            }
        }
    }

    /** List node */
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

            @JvmField val LIST = of("list")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            LIST
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
            LIST,
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
                LIST -> Value.LIST
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
                LIST -> Known.LIST
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

        return other is FormListItem &&
            items == other.items &&
            md == other.md &&
            ordered == other.ordered &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(items, md, ordered, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormListItem{items=$items, md=$md, ordered=$ordered, type=$type, additionalProperties=$additionalProperties}"
}
