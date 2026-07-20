// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.BaseDeserializer
import ai.llamaindex.llamacloud.core.BaseSerializer
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

/** One form detected on a page, in two representations of the same content. */
class Form
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val json: JsonField<List<Json>>,
    private val list: JsonField<FormListItem>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("json") @ExcludeMissing json: JsonField<List<Json>> = JsonMissing.of(),
        @JsonProperty("list") @ExcludeMissing list: JsonField<FormListItem> = JsonMissing.of(),
    ) : this(json, list, mutableMapOf())

    /**
     * Structured representation: an ordered tree of sections, fields, and tables
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun json(): List<Json> = json.getRequired("json")

    /**
     * Flattened list representation of the same content
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun list(): FormListItem = list.getRequired("list")

    /**
     * Returns the raw JSON value of [json].
     *
     * Unlike [json], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("json") @ExcludeMissing fun _json(): JsonField<List<Json>> = json

    /**
     * Returns the raw JSON value of [list].
     *
     * Unlike [list], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("list") @ExcludeMissing fun _list(): JsonField<FormListItem> = list

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
         * Returns a mutable builder for constructing an instance of [Form].
         *
         * The following fields are required:
         * ```java
         * .json()
         * .list()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Form]. */
    class Builder internal constructor() {

        private var json: JsonField<MutableList<Json>>? = null
        private var list: JsonField<FormListItem>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(form: Form) = apply {
            json = form.json.map { it.toMutableList() }
            list = form.list
            additionalProperties = form.additionalProperties.toMutableMap()
        }

        /** Structured representation: an ordered tree of sections, fields, and tables */
        fun json(json: List<Json>) = json(JsonField.of(json))

        /**
         * Sets [Builder.json] to an arbitrary JSON value.
         *
         * You should usually call [Builder.json] with a well-typed `List<Json>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun json(json: JsonField<List<Json>>) = apply {
            this.json = json.map { it.toMutableList() }
        }

        /**
         * Adds a single [Json] to [Builder.json].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addJson(json: Json) = apply {
            this.json =
                (this.json ?: JsonField.of(mutableListOf())).also {
                    checkKnown("json", it).add(json)
                }
        }

        /** Alias for calling [addJson] with `Json.ofField(field)`. */
        fun addJson(field: FormField) = addJson(Json.ofField(field))

        /**
         * Alias for calling [addJson] with the following:
         * ```java
         * FormField.builder()
         *     .type(FormField.Type.FIELD)
         *     .field(field)
         *     .build()
         * ```
         */
        fun addFieldJson(field: FormField.Field) =
            addJson(FormField.builder().type(FormField.Type.FIELD).field(field).build())

        /** Alias for calling [addJson] with `Json.ofSection(section)`. */
        fun addJson(section: FormSection) = addJson(Json.ofSection(section))

        /**
         * Alias for calling [addJson] with the following:
         * ```java
         * FormSection.builder()
         *     .type(FormSection.Type.SECTION)
         *     .items(items)
         *     .build()
         * ```
         */
        fun addSectionJson(items: List<FormSection.Item>) =
            addJson(FormSection.builder().type(FormSection.Type.SECTION).items(items).build())

        /** Alias for calling [addJson] with `Json.ofTable(table)`. */
        fun addJson(table: FormTable) = addJson(Json.ofTable(table))

        /**
         * Alias for calling [addJson] with the following:
         * ```java
         * FormTable.builder()
         *     .type(FormTable.Type.TABLE)
         *     .rows(rows)
         *     .build()
         * ```
         */
        fun addTableJson(rows: List<List<FormTable.Row?>>) =
            addJson(FormTable.builder().type(FormTable.Type.TABLE).rows(rows).build())

        /** Flattened list representation of the same content */
        fun list(list: FormListItem) = list(JsonField.of(list))

        /**
         * Sets [Builder.list] to an arbitrary JSON value.
         *
         * You should usually call [Builder.list] with a well-typed [FormListItem] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun list(list: JsonField<FormListItem>) = apply { this.list = list }

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
         * Returns an immutable instance of [Form].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .json()
         * .list()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Form =
            Form(
                checkRequired("json", json).map { it.toImmutable() },
                checkRequired("list", list),
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
    fun validate(): Form = apply {
        if (validated) {
            return@apply
        }

        json().forEach { it.validate() }
        list().validate()
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
        (json.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (list.asKnown().getOrNull()?.validity() ?: 0)

    /** One labeled form entry: a text input, checkbox, select group, or signature line. */
    @JsonDeserialize(using = Json.Deserializer::class)
    @JsonSerialize(using = Json.Serializer::class)
    class Json
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
         * Optional<String> result = json.accept(new Json.Visitor<Optional<String>>() {
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
        fun validate(): Json = apply {
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

            return other is Json &&
                field == other.field &&
                section == other.section &&
                table == other.table
        }

        override fun hashCode(): Int = Objects.hash(field, section, table)

        override fun toString(): String =
            when {
                field != null -> "Json{field=$field}"
                section != null -> "Json{section=$section}"
                table != null -> "Json{table=$table}"
                _json != null -> "Json{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Json")
            }

        companion object {

            /** One labeled form entry: a text input, checkbox, select group, or signature line. */
            @JvmStatic fun ofField(field: FormField) = Json(field = field)

            /** A grouping of form content, in the form's reading order. */
            @JvmStatic fun ofSection(section: FormSection) = Json(section = section)

            /** A fillable grid printed on the form: repeating records or a row-by-column matrix. */
            @JvmStatic fun ofTable(table: FormTable) = Json(table = table)
        }

        /** An interface that defines how to map each variant of [Json] to a value of type [T]. */
        interface Visitor<out T> {

            /** One labeled form entry: a text input, checkbox, select group, or signature line. */
            fun visitField(field: FormField): T

            /** A grouping of form content, in the form's reading order. */
            fun visitSection(section: FormSection): T

            /** A fillable grid printed on the form: repeating records or a row-by-column matrix. */
            fun visitTable(table: FormTable): T

            /**
             * Maps an unknown variant of [Json] to a value of type [T].
             *
             * An instance of [Json] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown Json: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Json>(Json::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Json {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "field" -> {
                        return tryDeserialize(node, jacksonTypeRef<FormField>())?.let {
                            Json(field = it, _json = json)
                        } ?: Json(_json = json)
                    }
                    "section" -> {
                        return tryDeserialize(node, jacksonTypeRef<FormSection>())?.let {
                            Json(section = it, _json = json)
                        } ?: Json(_json = json)
                    }
                    "table" -> {
                        return tryDeserialize(node, jacksonTypeRef<FormTable>())?.let {
                            Json(table = it, _json = json)
                        } ?: Json(_json = json)
                    }
                }

                return Json(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Json>(Json::class) {

            override fun serialize(
                value: Json,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.field != null -> generator.writeObject(value.field)
                    value.section != null -> generator.writeObject(value.section)
                    value.table != null -> generator.writeObject(value.table)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Json")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Form &&
            json == other.json &&
            list == other.list &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(json, list, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Form{json=$json, list=$list, additionalProperties=$additionalProperties}"
}
