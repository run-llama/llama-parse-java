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

class TableItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val csv: JsonField<String>,
    private val html: JsonField<String>,
    private val md: JsonField<String>,
    private val rows: JsonField<List<List<Row?>>>,
    private val bbox: JsonField<List<BBox>>,
    private val mergedFromPages: JsonField<List<Long>>,
    private val mergedIntoPage: JsonField<Long>,
    private val parseConcerns: JsonField<List<ParseConcern>>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("csv") @ExcludeMissing csv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("html") @ExcludeMissing html: JsonField<String> = JsonMissing.of(),
        @JsonProperty("md") @ExcludeMissing md: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rows") @ExcludeMissing rows: JsonField<List<List<Row?>>> = JsonMissing.of(),
        @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<List<BBox>> = JsonMissing.of(),
        @JsonProperty("merged_from_pages")
        @ExcludeMissing
        mergedFromPages: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("merged_into_page")
        @ExcludeMissing
        mergedIntoPage: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parse_concerns")
        @ExcludeMissing
        parseConcerns: JsonField<List<ParseConcern>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        csv,
        html,
        md,
        rows,
        bbox,
        mergedFromPages,
        mergedIntoPage,
        parseConcerns,
        type,
        mutableMapOf(),
    )

    /**
     * CSV representation of the table
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun csv(): String = csv.getRequired("csv")

    /**
     * HTML representation of the table
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun html(): String = html.getRequired("html")

    /**
     * Markdown representation preserving formatting
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun md(): String = md.getRequired("md")

    /**
     * Table data as array of arrays (string, number, or null)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rows(): List<List<Row?>> = rows.getRequired("rows")

    /**
     * List of bounding boxes
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bbox(): Optional<List<BBox>> = bbox.getOptional("bbox")

    /**
     * List of page numbers with tables that were merged into this table (e.g., [1, 2, 3, 4])
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mergedFromPages(): Optional<List<Long>> = mergedFromPages.getOptional("merged_from_pages")

    /**
     * Populated when merged into another table. Page number where the full merged table begins
     * (used on empty tables).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mergedIntoPage(): Optional<Long> = mergedIntoPage.getOptional("merged_into_page")

    /**
     * Quality concerns detected during table extraction, indicating the table may have issues
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parseConcerns(): Optional<List<ParseConcern>> = parseConcerns.getOptional("parse_concerns")

    /**
     * Table item type
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [csv].
     *
     * Unlike [csv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("csv") @ExcludeMissing fun _csv(): JsonField<String> = csv

    /**
     * Returns the raw JSON value of [html].
     *
     * Unlike [html], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html") @ExcludeMissing fun _html(): JsonField<String> = html

    /**
     * Returns the raw JSON value of [md].
     *
     * Unlike [md], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("md") @ExcludeMissing fun _md(): JsonField<String> = md

    /**
     * Returns the raw JSON value of [rows].
     *
     * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<List<Row?>>> = rows

    /**
     * Returns the raw JSON value of [bbox].
     *
     * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<List<BBox>> = bbox

    /**
     * Returns the raw JSON value of [mergedFromPages].
     *
     * Unlike [mergedFromPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merged_from_pages")
    @ExcludeMissing
    fun _mergedFromPages(): JsonField<List<Long>> = mergedFromPages

    /**
     * Returns the raw JSON value of [mergedIntoPage].
     *
     * Unlike [mergedIntoPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merged_into_page")
    @ExcludeMissing
    fun _mergedIntoPage(): JsonField<Long> = mergedIntoPage

    /**
     * Returns the raw JSON value of [parseConcerns].
     *
     * Unlike [parseConcerns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parse_concerns")
    @ExcludeMissing
    fun _parseConcerns(): JsonField<List<ParseConcern>> = parseConcerns

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
         * Returns a mutable builder for constructing an instance of [TableItem].
         *
         * The following fields are required:
         * ```java
         * .csv()
         * .html()
         * .md()
         * .rows()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TableItem]. */
    class Builder internal constructor() {

        private var csv: JsonField<String>? = null
        private var html: JsonField<String>? = null
        private var md: JsonField<String>? = null
        private var rows: JsonField<MutableList<List<Row?>>>? = null
        private var bbox: JsonField<MutableList<BBox>>? = null
        private var mergedFromPages: JsonField<MutableList<Long>>? = null
        private var mergedIntoPage: JsonField<Long> = JsonMissing.of()
        private var parseConcerns: JsonField<MutableList<ParseConcern>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tableItem: TableItem) = apply {
            csv = tableItem.csv
            html = tableItem.html
            md = tableItem.md
            rows = tableItem.rows.map { it.toMutableList() }
            bbox = tableItem.bbox.map { it.toMutableList() }
            mergedFromPages = tableItem.mergedFromPages.map { it.toMutableList() }
            mergedIntoPage = tableItem.mergedIntoPage
            parseConcerns = tableItem.parseConcerns.map { it.toMutableList() }
            type = tableItem.type
            additionalProperties = tableItem.additionalProperties.toMutableMap()
        }

        /** CSV representation of the table */
        fun csv(csv: String) = csv(JsonField.of(csv))

        /**
         * Sets [Builder.csv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.csv] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun csv(csv: JsonField<String>) = apply { this.csv = csv }

        /** HTML representation of the table */
        fun html(html: String) = html(JsonField.of(html))

        /**
         * Sets [Builder.html] to an arbitrary JSON value.
         *
         * You should usually call [Builder.html] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun html(html: JsonField<String>) = apply { this.html = html }

        /** Markdown representation preserving formatting */
        fun md(md: String) = md(JsonField.of(md))

        /**
         * Sets [Builder.md] to an arbitrary JSON value.
         *
         * You should usually call [Builder.md] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun md(md: JsonField<String>) = apply { this.md = md }

        /** Table data as array of arrays (string, number, or null) */
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

        /**
         * List of page numbers with tables that were merged into this table (e.g., [1, 2, 3, 4])
         */
        fun mergedFromPages(mergedFromPages: List<Long>?) =
            mergedFromPages(JsonField.ofNullable(mergedFromPages))

        /** Alias for calling [Builder.mergedFromPages] with `mergedFromPages.orElse(null)`. */
        fun mergedFromPages(mergedFromPages: Optional<List<Long>>) =
            mergedFromPages(mergedFromPages.getOrNull())

        /**
         * Sets [Builder.mergedFromPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mergedFromPages] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mergedFromPages(mergedFromPages: JsonField<List<Long>>) = apply {
            this.mergedFromPages = mergedFromPages.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [mergedFromPages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMergedFromPage(mergedFromPage: Long) = apply {
            mergedFromPages =
                (mergedFromPages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mergedFromPages", it).add(mergedFromPage)
                }
        }

        /**
         * Populated when merged into another table. Page number where the full merged table begins
         * (used on empty tables).
         */
        fun mergedIntoPage(mergedIntoPage: Long?) =
            mergedIntoPage(JsonField.ofNullable(mergedIntoPage))

        /**
         * Alias for [Builder.mergedIntoPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun mergedIntoPage(mergedIntoPage: Long) = mergedIntoPage(mergedIntoPage as Long?)

        /** Alias for calling [Builder.mergedIntoPage] with `mergedIntoPage.orElse(null)`. */
        fun mergedIntoPage(mergedIntoPage: Optional<Long>) =
            mergedIntoPage(mergedIntoPage.getOrNull())

        /**
         * Sets [Builder.mergedIntoPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mergedIntoPage] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mergedIntoPage(mergedIntoPage: JsonField<Long>) = apply {
            this.mergedIntoPage = mergedIntoPage
        }

        /**
         * Quality concerns detected during table extraction, indicating the table may have issues
         */
        fun parseConcerns(parseConcerns: List<ParseConcern>?) =
            parseConcerns(JsonField.ofNullable(parseConcerns))

        /** Alias for calling [Builder.parseConcerns] with `parseConcerns.orElse(null)`. */
        fun parseConcerns(parseConcerns: Optional<List<ParseConcern>>) =
            parseConcerns(parseConcerns.getOrNull())

        /**
         * Sets [Builder.parseConcerns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parseConcerns] with a well-typed `List<ParseConcern>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun parseConcerns(parseConcerns: JsonField<List<ParseConcern>>) = apply {
            this.parseConcerns = parseConcerns.map { it.toMutableList() }
        }

        /**
         * Adds a single [ParseConcern] to [parseConcerns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParseConcern(parseConcern: ParseConcern) = apply {
            parseConcerns =
                (parseConcerns ?: JsonField.of(mutableListOf())).also {
                    checkKnown("parseConcerns", it).add(parseConcern)
                }
        }

        /** Table item type */
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
         * Returns an immutable instance of [TableItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .csv()
         * .html()
         * .md()
         * .rows()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TableItem =
            TableItem(
                checkRequired("csv", csv),
                checkRequired("html", html),
                checkRequired("md", md),
                checkRequired("rows", rows).map { it.toImmutable() },
                (bbox ?: JsonMissing.of()).map { it.toImmutable() },
                (mergedFromPages ?: JsonMissing.of()).map { it.toImmutable() },
                mergedIntoPage,
                (parseConcerns ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): TableItem = apply {
        if (validated) {
            return@apply
        }

        csv()
        html()
        md()
        rows().forEach { it.forEach { it?.validate() } }
        bbox().ifPresent { it.forEach { it.validate() } }
        mergedFromPages()
        mergedIntoPage()
        parseConcerns().ifPresent { it.forEach { it.validate() } }
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
        (if (csv.asKnown().isPresent) 1 else 0) +
            (if (html.asKnown().isPresent) 1 else 0) +
            (if (md.asKnown().isPresent) 1 else 0) +
            (rows.asKnown().getOrNull()?.sumOf {
                it.sumOf { (it?.validity() ?: 0).toInt() }.toInt()
            } ?: 0) +
            (bbox.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (mergedFromPages.asKnown().getOrNull()?.size ?: 0) +
            (if (mergedIntoPage.asKnown().isPresent) 1 else 0) +
            (parseConcerns.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Row.Deserializer::class)
    @JsonSerialize(using = Row.Serializer::class)
    class Row
    private constructor(
        private val string: String? = null,
        private val number: Double? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun isString(): Boolean = string != null

        fun isNumber(): Boolean = number != null

        fun asString(): String = string.getOrThrow("string")

        fun asNumber(): Double = number.getOrThrow("number")

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
                number != null -> visitor.visitNumber(number)
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

                    override fun visitNumber(number: Double) {}
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

                    override fun visitNumber(number: Double) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Row && string == other.string && number == other.number
        }

        override fun hashCode(): Int = Objects.hash(string, number)

        override fun toString(): String =
            when {
                string != null -> "Row{string=$string}"
                number != null -> "Row{number=$number}"
                _json != null -> "Row{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Row")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Row(string = string)

            @JvmStatic fun ofNumber(number: Double) = Row(number = number)
        }

        /** An interface that defines how to map each variant of [Row] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitNumber(number: Double): T

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
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Row(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Row(number = it, _json = json)
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
                    value.number != null -> generator.writeObject(value.number)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Row")
                }
            }
        }
    }

    class ParseConcern
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val details: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("details") @ExcludeMissing details: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(details, type, mutableMapOf())

        /**
         * Human-readable details about the concern
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun details(): String = details.getRequired("details")

        /**
         * Type of parse concern (e.g. header_value_type_mismatch, inconsistent_row_cell_count)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Returns the raw JSON value of [details].
         *
         * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<String> = details

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
             * Returns a mutable builder for constructing an instance of [ParseConcern].
             *
             * The following fields are required:
             * ```java
             * .details()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ParseConcern]. */
        class Builder internal constructor() {

            private var details: JsonField<String>? = null
            private var type: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parseConcern: ParseConcern) = apply {
                details = parseConcern.details
                type = parseConcern.type
                additionalProperties = parseConcern.additionalProperties.toMutableMap()
            }

            /** Human-readable details about the concern */
            fun details(details: String) = details(JsonField.of(details))

            /**
             * Sets [Builder.details] to an arbitrary JSON value.
             *
             * You should usually call [Builder.details] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun details(details: JsonField<String>) = apply { this.details = details }

            /**
             * Type of parse concern (e.g. header_value_type_mismatch, inconsistent_row_cell_count)
             */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [ParseConcern].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .details()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ParseConcern =
                ParseConcern(
                    checkRequired("details", details),
                    checkRequired("type", type),
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
        fun validate(): ParseConcern = apply {
            if (validated) {
                return@apply
            }

            details()
            type()
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
            (if (details.asKnown().isPresent) 1 else 0) + (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ParseConcern &&
                details == other.details &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(details, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ParseConcern{details=$details, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Table item type */
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

        return other is TableItem &&
            csv == other.csv &&
            html == other.html &&
            md == other.md &&
            rows == other.rows &&
            bbox == other.bbox &&
            mergedFromPages == other.mergedFromPages &&
            mergedIntoPage == other.mergedIntoPage &&
            parseConcerns == other.parseConcerns &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            csv,
            html,
            md,
            rows,
            bbox,
            mergedFromPages,
            mergedIntoPage,
            parseConcerns,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TableItem{csv=$csv, html=$html, md=$md, rows=$rows, bbox=$bbox, mergedFromPages=$mergedFromPages, mergedIntoPage=$mergedIntoPage, parseConcerns=$parseConcerns, type=$type, additionalProperties=$additionalProperties}"
}
