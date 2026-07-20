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

class ImageItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val caption: JsonField<String>,
    private val md: JsonField<String>,
    private val url: JsonField<String>,
    private val bbox: JsonField<List<BBox>>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("caption") @ExcludeMissing caption: JsonField<String> = JsonMissing.of(),
        @JsonProperty("md") @ExcludeMissing md: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<List<BBox>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(caption, md, url, bbox, type, mutableMapOf())

    /**
     * Image caption
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun caption(): String = caption.getRequired("caption")

    /**
     * Markdown representation preserving formatting
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun md(): String = md.getRequired("md")

    /**
     * URL to the image
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * List of bounding boxes
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bbox(): Optional<List<BBox>> = bbox.getOptional("bbox")

    /**
     * Image item type
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [caption].
     *
     * Unlike [caption], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("caption") @ExcludeMissing fun _caption(): JsonField<String> = caption

    /**
     * Returns the raw JSON value of [md].
     *
     * Unlike [md], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("md") @ExcludeMissing fun _md(): JsonField<String> = md

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of [ImageItem].
         *
         * The following fields are required:
         * ```java
         * .caption()
         * .md()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ImageItem]. */
    class Builder internal constructor() {

        private var caption: JsonField<String>? = null
        private var md: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var bbox: JsonField<MutableList<BBox>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(imageItem: ImageItem) = apply {
            caption = imageItem.caption
            md = imageItem.md
            url = imageItem.url
            bbox = imageItem.bbox.map { it.toMutableList() }
            type = imageItem.type
            additionalProperties = imageItem.additionalProperties.toMutableMap()
        }

        /** Image caption */
        fun caption(caption: String) = caption(JsonField.of(caption))

        /**
         * Sets [Builder.caption] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caption] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun caption(caption: JsonField<String>) = apply { this.caption = caption }

        /** Markdown representation preserving formatting */
        fun md(md: String) = md(JsonField.of(md))

        /**
         * Sets [Builder.md] to an arbitrary JSON value.
         *
         * You should usually call [Builder.md] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun md(md: JsonField<String>) = apply { this.md = md }

        /** URL to the image */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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

        /** Image item type */
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
         * Returns an immutable instance of [ImageItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .caption()
         * .md()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ImageItem =
            ImageItem(
                checkRequired("caption", caption),
                checkRequired("md", md),
                checkRequired("url", url),
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
    fun validate(): ImageItem = apply {
        if (validated) {
            return@apply
        }

        caption()
        md()
        url()
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
        (if (caption.asKnown().isPresent) 1 else 0) +
            (if (md.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (bbox.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Image item type */
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

            @JvmField val IMAGE = of("image")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            IMAGE
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
            IMAGE,
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
                IMAGE -> Value.IMAGE
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
                IMAGE -> Known.IMAGE
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

        return other is ImageItem &&
            caption == other.caption &&
            md == other.md &&
            url == other.url &&
            bbox == other.bbox &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(caption, md, url, bbox, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ImageItem{caption=$caption, md=$md, url=$url, bbox=$bbox, type=$type, additionalProperties=$additionalProperties}"
}
