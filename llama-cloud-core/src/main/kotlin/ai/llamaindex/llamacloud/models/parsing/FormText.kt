// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Printed text that is not part of a field, section heading or table: a title, an instruction, a
 * note. With it the form JSON holds every printed word of its region.
 */
class FormText
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val value: JsonField<String>,
    private val bbox: JsonField<List<BBox>>,
    private val grounding: JsonField<Grounding>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<List<BBox>> = JsonMissing.of(),
        @JsonProperty("grounding")
        @ExcludeMissing
        grounding: JsonField<Grounding> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(value, bbox, grounding, type, mutableMapOf())

    /**
     * The printed text, verbatim
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * Bounding boxes of the text on the page, if attributed.
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
     * Form text node
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
         * Returns a mutable builder for constructing an instance of [FormText].
         *
         * The following fields are required:
         * ```java
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormText]. */
    class Builder internal constructor() {

        private var value: JsonField<String>? = null
        private var bbox: JsonField<MutableList<BBox>>? = null
        private var grounding: JsonField<Grounding> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(formText: FormText) = apply {
            value = formText.value
            bbox = formText.bbox.map { it.toMutableList() }
            grounding = formText.grounding
            type = formText.type
            additionalProperties = formText.additionalProperties.toMutableMap()
        }

        /** The printed text, verbatim */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        /** Bounding boxes of the text on the page, if attributed. */
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

        /** Form text node */
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
         * Returns an immutable instance of [FormText].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormText =
            FormText(
                checkRequired("value", value),
                (bbox ?: JsonMissing.of()).map { it.toImmutable() },
                grounding,
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
    fun validate(): FormText = apply {
        if (validated) {
            return@apply
        }

        value()
        bbox().ifPresent { it.forEach { it.validate() } }
        grounding().ifPresent { it.validate() }
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
        (if (value.asKnown().isPresent) 1 else 0) +
            (bbox.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (grounding.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

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

    /** Form text node */
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

            @JvmField val TEXT = of("text")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            TEXT
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
            TEXT,
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
                TEXT -> Known.TEXT
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

        return other is FormText &&
            value == other.value &&
            bbox == other.bbox &&
            grounding == other.grounding &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(value, bbox, grounding, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FormText{value=$value, bbox=$bbox, grounding=$grounding, type=$type, additionalProperties=$additionalProperties}"
}
