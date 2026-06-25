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

class FooterItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val md: JsonField<String>,
    private val bbox: JsonField<List<BBox>>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        @JsonProperty("md") @ExcludeMissing md: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<List<BBox>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(items, md, bbox, type, mutableMapOf())

    /**
     * List of items within the footer
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Markdown representation preserving formatting
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun md(): String = md.getRequired("md")

    /**
     * List of bounding boxes
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bbox(): Optional<List<BBox>> = bbox.getOptional("bbox")

    /**
     * Page footer container
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
     * Returns the raw JSON value of [bbox].
     *
     * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<List<BBox>> = bbox

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
         * Returns a mutable builder for constructing an instance of [FooterItem].
         *
         * The following fields are required:
         * ```java
         * .items()
         * .md()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FooterItem]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var md: JsonField<String>? = null
        private var bbox: JsonField<MutableList<BBox>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(footerItem: FooterItem) = apply {
            items = footerItem.items.map { it.toMutableList() }
            md = footerItem.md
            bbox = footerItem.bbox.map { it.toMutableList() }
            type = footerItem.type
            additionalProperties = footerItem.additionalProperties.toMutableMap()
        }

        /** List of items within the footer */
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

        /** Alias for calling [addItem] with `Item.ofCode(code)`. */
        fun addItem(code: CodeItem) = addItem(Item.ofCode(code))

        /** Alias for calling [addItem] with `Item.ofHeading(heading)`. */
        fun addItem(heading: HeadingItem) = addItem(Item.ofHeading(heading))

        /** Alias for calling [addItem] with `Item.ofImage(image)`. */
        fun addItem(image: ImageItem) = addItem(Item.ofImage(image))

        /** Alias for calling [addItem] with `Item.ofLink(link)`. */
        fun addItem(link: LinkItem) = addItem(Item.ofLink(link))

        /** Alias for calling [addItem] with `Item.ofList(list)`. */
        fun addItem(list: ListItem) = addItem(Item.ofList(list))

        /** Alias for calling [addItem] with `Item.ofTable(table)`. */
        fun addItem(table: TableItem) = addItem(Item.ofTable(table))

        /** Alias for calling [addItem] with `Item.ofText(text)`. */
        fun addItem(text: TextItem) = addItem(Item.ofText(text))

        /** Markdown representation preserving formatting */
        fun md(md: String) = md(JsonField.of(md))

        /**
         * Sets [Builder.md] to an arbitrary JSON value.
         *
         * You should usually call [Builder.md] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun md(md: JsonField<String>) = apply { this.md = md }

        /** List of bounding boxes */
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

        /** Page footer container */
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
         * Returns an immutable instance of [FooterItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * .md()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FooterItem =
            FooterItem(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("md", md),
                (bbox ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): FooterItem = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        md()
        bbox().ifPresent { it.forEach { it.validate() } }
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
            (bbox.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Item.Deserializer::class)
    @JsonSerialize(using = Item.Serializer::class)
    class Item
    private constructor(
        private val code: CodeItem? = null,
        private val heading: HeadingItem? = null,
        private val image: ImageItem? = null,
        private val link: LinkItem? = null,
        private val list: ListItem? = null,
        private val table: TableItem? = null,
        private val text: TextItem? = null,
        private val _json: JsonValue? = null,
    ) {

        fun code(): Optional<CodeItem> = Optional.ofNullable(code)

        fun heading(): Optional<HeadingItem> = Optional.ofNullable(heading)

        fun image(): Optional<ImageItem> = Optional.ofNullable(image)

        fun link(): Optional<LinkItem> = Optional.ofNullable(link)

        fun list(): Optional<ListItem> = Optional.ofNullable(list)

        fun table(): Optional<TableItem> = Optional.ofNullable(table)

        fun text(): Optional<TextItem> = Optional.ofNullable(text)

        fun isCode(): Boolean = code != null

        fun isHeading(): Boolean = heading != null

        fun isImage(): Boolean = image != null

        fun isLink(): Boolean = link != null

        fun isList(): Boolean = list != null

        fun isTable(): Boolean = table != null

        fun isText(): Boolean = text != null

        fun asCode(): CodeItem = code.getOrThrow("code")

        fun asHeading(): HeadingItem = heading.getOrThrow("heading")

        fun asImage(): ImageItem = image.getOrThrow("image")

        fun asLink(): LinkItem = link.getOrThrow("link")

        fun asList(): ListItem = list.getOrThrow("list")

        fun asTable(): TableItem = table.getOrThrow("table")

        fun asText(): TextItem = text.getOrThrow("text")

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
         *     public Optional<String> visitCode(CodeItem code) {
         *         return Optional.of(code.toString());
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
                code != null -> visitor.visitCode(code)
                heading != null -> visitor.visitHeading(heading)
                image != null -> visitor.visitImage(image)
                link != null -> visitor.visitLink(link)
                list != null -> visitor.visitList(list)
                table != null -> visitor.visitTable(table)
                text != null -> visitor.visitText(text)
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
                    override fun visitCode(code: CodeItem) {
                        code.validate()
                    }

                    override fun visitHeading(heading: HeadingItem) {
                        heading.validate()
                    }

                    override fun visitImage(image: ImageItem) {
                        image.validate()
                    }

                    override fun visitLink(link: LinkItem) {
                        link.validate()
                    }

                    override fun visitList(list: ListItem) {
                        list.validate()
                    }

                    override fun visitTable(table: TableItem) {
                        table.validate()
                    }

                    override fun visitText(text: TextItem) {
                        text.validate()
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
                    override fun visitCode(code: CodeItem) = code.validity()

                    override fun visitHeading(heading: HeadingItem) = heading.validity()

                    override fun visitImage(image: ImageItem) = image.validity()

                    override fun visitLink(link: LinkItem) = link.validity()

                    override fun visitList(list: ListItem) = list.validity()

                    override fun visitTable(table: TableItem) = table.validity()

                    override fun visitText(text: TextItem) = text.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                code == other.code &&
                heading == other.heading &&
                image == other.image &&
                link == other.link &&
                list == other.list &&
                table == other.table &&
                text == other.text
        }

        override fun hashCode(): Int = Objects.hash(code, heading, image, link, list, table, text)

        override fun toString(): String =
            when {
                code != null -> "Item{code=$code}"
                heading != null -> "Item{heading=$heading}"
                image != null -> "Item{image=$image}"
                link != null -> "Item{link=$link}"
                list != null -> "Item{list=$list}"
                table != null -> "Item{table=$table}"
                text != null -> "Item{text=$text}"
                _json != null -> "Item{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Item")
            }

        companion object {

            @JvmStatic fun ofCode(code: CodeItem) = Item(code = code)

            @JvmStatic fun ofHeading(heading: HeadingItem) = Item(heading = heading)

            @JvmStatic fun ofImage(image: ImageItem) = Item(image = image)

            @JvmStatic fun ofLink(link: LinkItem) = Item(link = link)

            @JvmStatic fun ofList(list: ListItem) = Item(list = list)

            @JvmStatic fun ofTable(table: TableItem) = Item(table = table)

            @JvmStatic fun ofText(text: TextItem) = Item(text = text)
        }

        /** An interface that defines how to map each variant of [Item] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitCode(code: CodeItem): T

            fun visitHeading(heading: HeadingItem): T

            fun visitImage(image: ImageItem): T

            fun visitLink(link: LinkItem): T

            fun visitList(list: ListItem): T

            fun visitTable(table: TableItem): T

            fun visitText(text: TextItem): T

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
                    "code" -> {
                        return tryDeserialize(node, jacksonTypeRef<CodeItem>())?.let {
                            Item(code = it, _json = json)
                        } ?: Item(_json = json)
                    }
                    "heading" -> {
                        return tryDeserialize(node, jacksonTypeRef<HeadingItem>())?.let {
                            Item(heading = it, _json = json)
                        } ?: Item(_json = json)
                    }
                    "image" -> {
                        return tryDeserialize(node, jacksonTypeRef<ImageItem>())?.let {
                            Item(image = it, _json = json)
                        } ?: Item(_json = json)
                    }
                    "link" -> {
                        return tryDeserialize(node, jacksonTypeRef<LinkItem>())?.let {
                            Item(link = it, _json = json)
                        } ?: Item(_json = json)
                    }
                    "list" -> {
                        return tryDeserialize(node, jacksonTypeRef<ListItem>())?.let {
                            Item(list = it, _json = json)
                        } ?: Item(_json = json)
                    }
                    "table" -> {
                        return tryDeserialize(node, jacksonTypeRef<TableItem>())?.let {
                            Item(table = it, _json = json)
                        } ?: Item(_json = json)
                    }
                    "text" -> {
                        return tryDeserialize(node, jacksonTypeRef<TextItem>())?.let {
                            Item(text = it, _json = json)
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
                    value.code != null -> generator.writeObject(value.code)
                    value.heading != null -> generator.writeObject(value.heading)
                    value.image != null -> generator.writeObject(value.image)
                    value.link != null -> generator.writeObject(value.link)
                    value.list != null -> generator.writeObject(value.list)
                    value.table != null -> generator.writeObject(value.table)
                    value.text != null -> generator.writeObject(value.text)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Item")
                }
            }
        }
    }

    /** Page footer container */
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

            @JvmField val FOOTER = of("footer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            FOOTER
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
            FOOTER,
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
                FOOTER -> Value.FOOTER
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
                FOOTER -> Known.FOOTER
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

        return other is FooterItem &&
            items == other.items &&
            md == other.md &&
            bbox == other.bbox &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, md, bbox, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FooterItem{items=$items, md=$md, bbox=$bbox, type=$type, additionalProperties=$additionalProperties}"
}
