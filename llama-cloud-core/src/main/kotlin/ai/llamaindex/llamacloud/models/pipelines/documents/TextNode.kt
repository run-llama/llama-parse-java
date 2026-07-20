// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.documents

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkKnown
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

/** Provided for backward compatibility. */
class TextNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val className: JsonField<String>,
    private val embedding: JsonField<List<Double>>,
    private val endCharIdx: JsonField<Long>,
    private val excludedEmbedMetadataKeys: JsonField<List<String>>,
    private val excludedLlmMetadataKeys: JsonField<List<String>>,
    private val extraInfo: JsonField<ExtraInfo>,
    private val id: JsonField<String>,
    private val metadataSeperator: JsonField<String>,
    private val metadataTemplate: JsonField<String>,
    private val mimetype: JsonField<String>,
    private val relationships: JsonField<Relationships>,
    private val startCharIdx: JsonField<Long>,
    private val text: JsonField<String>,
    private val textTemplate: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embedding")
        @ExcludeMissing
        embedding: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("end_char_idx")
        @ExcludeMissing
        endCharIdx: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("excluded_embed_metadata_keys")
        @ExcludeMissing
        excludedEmbedMetadataKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("excluded_llm_metadata_keys")
        @ExcludeMissing
        excludedLlmMetadataKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("extra_info")
        @ExcludeMissing
        extraInfo: JsonField<ExtraInfo> = JsonMissing.of(),
        @JsonProperty("id_") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata_seperator")
        @ExcludeMissing
        metadataSeperator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata_template")
        @ExcludeMissing
        metadataTemplate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mimetype") @ExcludeMissing mimetype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("relationships")
        @ExcludeMissing
        relationships: JsonField<Relationships> = JsonMissing.of(),
        @JsonProperty("start_char_idx")
        @ExcludeMissing
        startCharIdx: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_template")
        @ExcludeMissing
        textTemplate: JsonField<String> = JsonMissing.of(),
    ) : this(
        className,
        embedding,
        endCharIdx,
        excludedEmbedMetadataKeys,
        excludedLlmMetadataKeys,
        extraInfo,
        id,
        metadataSeperator,
        metadataTemplate,
        mimetype,
        relationships,
        startCharIdx,
        text,
        textTemplate,
        mutableMapOf(),
    )

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * Embedding of the node.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embedding(): Optional<List<Double>> = embedding.getOptional("embedding")

    /**
     * End char index of the node.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endCharIdx(): Optional<Long> = endCharIdx.getOptional("end_char_idx")

    /**
     * Metadata keys that are excluded from text for the embed model.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludedEmbedMetadataKeys(): Optional<List<String>> =
        excludedEmbedMetadataKeys.getOptional("excluded_embed_metadata_keys")

    /**
     * Metadata keys that are excluded from text for the LLM.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludedLlmMetadataKeys(): Optional<List<String>> =
        excludedLlmMetadataKeys.getOptional("excluded_llm_metadata_keys")

    /**
     * A flat dictionary of metadata fields
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extraInfo(): Optional<ExtraInfo> = extraInfo.getOptional("extra_info")

    /**
     * Unique ID of the node.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id_")

    /**
     * Separator between metadata fields when converting to string.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadataSeperator(): Optional<String> = metadataSeperator.getOptional("metadata_seperator")

    /**
     * Template for how metadata is formatted, with {key} and {value} placeholders.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadataTemplate(): Optional<String> = metadataTemplate.getOptional("metadata_template")

    /**
     * MIME type of the node content.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mimetype(): Optional<String> = mimetype.getOptional("mimetype")

    /**
     * A mapping of relationships to other node information.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun relationships(): Optional<Relationships> = relationships.getOptional("relationships")

    /**
     * Start char index of the node.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startCharIdx(): Optional<Long> = startCharIdx.getOptional("start_char_idx")

    /**
     * Text content of the node.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * Template for how text is formatted, with {content} and {metadata_str} placeholders.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textTemplate(): Optional<String> = textTemplate.getOptional("text_template")

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [embedding].
     *
     * Unlike [embedding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embedding") @ExcludeMissing fun _embedding(): JsonField<List<Double>> = embedding

    /**
     * Returns the raw JSON value of [endCharIdx].
     *
     * Unlike [endCharIdx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_char_idx") @ExcludeMissing fun _endCharIdx(): JsonField<Long> = endCharIdx

    /**
     * Returns the raw JSON value of [excludedEmbedMetadataKeys].
     *
     * Unlike [excludedEmbedMetadataKeys], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("excluded_embed_metadata_keys")
    @ExcludeMissing
    fun _excludedEmbedMetadataKeys(): JsonField<List<String>> = excludedEmbedMetadataKeys

    /**
     * Returns the raw JSON value of [excludedLlmMetadataKeys].
     *
     * Unlike [excludedLlmMetadataKeys], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("excluded_llm_metadata_keys")
    @ExcludeMissing
    fun _excludedLlmMetadataKeys(): JsonField<List<String>> = excludedLlmMetadataKeys

    /**
     * Returns the raw JSON value of [extraInfo].
     *
     * Unlike [extraInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extra_info") @ExcludeMissing fun _extraInfo(): JsonField<ExtraInfo> = extraInfo

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id_") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [metadataSeperator].
     *
     * Unlike [metadataSeperator], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("metadata_seperator")
    @ExcludeMissing
    fun _metadataSeperator(): JsonField<String> = metadataSeperator

    /**
     * Returns the raw JSON value of [metadataTemplate].
     *
     * Unlike [metadataTemplate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("metadata_template")
    @ExcludeMissing
    fun _metadataTemplate(): JsonField<String> = metadataTemplate

    /**
     * Returns the raw JSON value of [mimetype].
     *
     * Unlike [mimetype], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mimetype") @ExcludeMissing fun _mimetype(): JsonField<String> = mimetype

    /**
     * Returns the raw JSON value of [relationships].
     *
     * Unlike [relationships], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relationships")
    @ExcludeMissing
    fun _relationships(): JsonField<Relationships> = relationships

    /**
     * Returns the raw JSON value of [startCharIdx].
     *
     * Unlike [startCharIdx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_char_idx")
    @ExcludeMissing
    fun _startCharIdx(): JsonField<Long> = startCharIdx

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [textTemplate].
     *
     * Unlike [textTemplate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_template")
    @ExcludeMissing
    fun _textTemplate(): JsonField<String> = textTemplate

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

        /** Returns a mutable builder for constructing an instance of [TextNode]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TextNode]. */
    class Builder internal constructor() {

        private var className: JsonField<String> = JsonMissing.of()
        private var embedding: JsonField<MutableList<Double>>? = null
        private var endCharIdx: JsonField<Long> = JsonMissing.of()
        private var excludedEmbedMetadataKeys: JsonField<MutableList<String>>? = null
        private var excludedLlmMetadataKeys: JsonField<MutableList<String>>? = null
        private var extraInfo: JsonField<ExtraInfo> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var metadataSeperator: JsonField<String> = JsonMissing.of()
        private var metadataTemplate: JsonField<String> = JsonMissing.of()
        private var mimetype: JsonField<String> = JsonMissing.of()
        private var relationships: JsonField<Relationships> = JsonMissing.of()
        private var startCharIdx: JsonField<Long> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var textTemplate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(textNode: TextNode) = apply {
            className = textNode.className
            embedding = textNode.embedding.map { it.toMutableList() }
            endCharIdx = textNode.endCharIdx
            excludedEmbedMetadataKeys =
                textNode.excludedEmbedMetadataKeys.map { it.toMutableList() }
            excludedLlmMetadataKeys = textNode.excludedLlmMetadataKeys.map { it.toMutableList() }
            extraInfo = textNode.extraInfo
            id = textNode.id
            metadataSeperator = textNode.metadataSeperator
            metadataTemplate = textNode.metadataTemplate
            mimetype = textNode.mimetype
            relationships = textNode.relationships
            startCharIdx = textNode.startCharIdx
            text = textNode.text
            textTemplate = textNode.textTemplate
            additionalProperties = textNode.additionalProperties.toMutableMap()
        }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** Embedding of the node. */
        fun embedding(embedding: List<Double>?) = embedding(JsonField.ofNullable(embedding))

        /** Alias for calling [Builder.embedding] with `embedding.orElse(null)`. */
        fun embedding(embedding: Optional<List<Double>>) = embedding(embedding.getOrNull())

        /**
         * Sets [Builder.embedding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embedding] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embedding(embedding: JsonField<List<Double>>) = apply {
            this.embedding = embedding.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.embedding].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmbedding(embedding: Double) = apply {
            this.embedding =
                (this.embedding ?: JsonField.of(mutableListOf())).also {
                    checkKnown("embedding", it).add(embedding)
                }
        }

        /** End char index of the node. */
        fun endCharIdx(endCharIdx: Long?) = endCharIdx(JsonField.ofNullable(endCharIdx))

        /**
         * Alias for [Builder.endCharIdx].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun endCharIdx(endCharIdx: Long) = endCharIdx(endCharIdx as Long?)

        /** Alias for calling [Builder.endCharIdx] with `endCharIdx.orElse(null)`. */
        fun endCharIdx(endCharIdx: Optional<Long>) = endCharIdx(endCharIdx.getOrNull())

        /**
         * Sets [Builder.endCharIdx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endCharIdx] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endCharIdx(endCharIdx: JsonField<Long>) = apply { this.endCharIdx = endCharIdx }

        /** Metadata keys that are excluded from text for the embed model. */
        fun excludedEmbedMetadataKeys(excludedEmbedMetadataKeys: List<String>) =
            excludedEmbedMetadataKeys(JsonField.of(excludedEmbedMetadataKeys))

        /**
         * Sets [Builder.excludedEmbedMetadataKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludedEmbedMetadataKeys] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun excludedEmbedMetadataKeys(excludedEmbedMetadataKeys: JsonField<List<String>>) = apply {
            this.excludedEmbedMetadataKeys = excludedEmbedMetadataKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [excludedEmbedMetadataKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludedEmbedMetadataKey(excludedEmbedMetadataKey: String) = apply {
            excludedEmbedMetadataKeys =
                (excludedEmbedMetadataKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("excludedEmbedMetadataKeys", it).add(excludedEmbedMetadataKey)
                }
        }

        /** Metadata keys that are excluded from text for the LLM. */
        fun excludedLlmMetadataKeys(excludedLlmMetadataKeys: List<String>) =
            excludedLlmMetadataKeys(JsonField.of(excludedLlmMetadataKeys))

        /**
         * Sets [Builder.excludedLlmMetadataKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludedLlmMetadataKeys] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun excludedLlmMetadataKeys(excludedLlmMetadataKeys: JsonField<List<String>>) = apply {
            this.excludedLlmMetadataKeys = excludedLlmMetadataKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [excludedLlmMetadataKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludedLlmMetadataKey(excludedLlmMetadataKey: String) = apply {
            excludedLlmMetadataKeys =
                (excludedLlmMetadataKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("excludedLlmMetadataKeys", it).add(excludedLlmMetadataKey)
                }
        }

        /** A flat dictionary of metadata fields */
        fun extraInfo(extraInfo: ExtraInfo) = extraInfo(JsonField.of(extraInfo))

        /**
         * Sets [Builder.extraInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extraInfo] with a well-typed [ExtraInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extraInfo(extraInfo: JsonField<ExtraInfo>) = apply { this.extraInfo = extraInfo }

        /** Unique ID of the node. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Separator between metadata fields when converting to string. */
        fun metadataSeperator(metadataSeperator: String) =
            metadataSeperator(JsonField.of(metadataSeperator))

        /**
         * Sets [Builder.metadataSeperator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataSeperator] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metadataSeperator(metadataSeperator: JsonField<String>) = apply {
            this.metadataSeperator = metadataSeperator
        }

        /** Template for how metadata is formatted, with {key} and {value} placeholders. */
        fun metadataTemplate(metadataTemplate: String) =
            metadataTemplate(JsonField.of(metadataTemplate))

        /**
         * Sets [Builder.metadataTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataTemplate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metadataTemplate(metadataTemplate: JsonField<String>) = apply {
            this.metadataTemplate = metadataTemplate
        }

        /** MIME type of the node content. */
        fun mimetype(mimetype: String) = mimetype(JsonField.of(mimetype))

        /**
         * Sets [Builder.mimetype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mimetype] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mimetype(mimetype: JsonField<String>) = apply { this.mimetype = mimetype }

        /** A mapping of relationships to other node information. */
        fun relationships(relationships: Relationships) = relationships(JsonField.of(relationships))

        /**
         * Sets [Builder.relationships] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relationships] with a well-typed [Relationships] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun relationships(relationships: JsonField<Relationships>) = apply {
            this.relationships = relationships
        }

        /** Start char index of the node. */
        fun startCharIdx(startCharIdx: Long?) = startCharIdx(JsonField.ofNullable(startCharIdx))

        /**
         * Alias for [Builder.startCharIdx].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun startCharIdx(startCharIdx: Long) = startCharIdx(startCharIdx as Long?)

        /** Alias for calling [Builder.startCharIdx] with `startCharIdx.orElse(null)`. */
        fun startCharIdx(startCharIdx: Optional<Long>) = startCharIdx(startCharIdx.getOrNull())

        /**
         * Sets [Builder.startCharIdx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startCharIdx] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startCharIdx(startCharIdx: JsonField<Long>) = apply { this.startCharIdx = startCharIdx }

        /** Text content of the node. */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        /** Template for how text is formatted, with {content} and {metadata_str} placeholders. */
        fun textTemplate(textTemplate: String) = textTemplate(JsonField.of(textTemplate))

        /**
         * Sets [Builder.textTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textTemplate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textTemplate(textTemplate: JsonField<String>) = apply {
            this.textTemplate = textTemplate
        }

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
         * Returns an immutable instance of [TextNode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TextNode =
            TextNode(
                className,
                (embedding ?: JsonMissing.of()).map { it.toImmutable() },
                endCharIdx,
                (excludedEmbedMetadataKeys ?: JsonMissing.of()).map { it.toImmutable() },
                (excludedLlmMetadataKeys ?: JsonMissing.of()).map { it.toImmutable() },
                extraInfo,
                id,
                metadataSeperator,
                metadataTemplate,
                mimetype,
                relationships,
                startCharIdx,
                text,
                textTemplate,
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
    fun validate(): TextNode = apply {
        if (validated) {
            return@apply
        }

        className()
        embedding()
        endCharIdx()
        excludedEmbedMetadataKeys()
        excludedLlmMetadataKeys()
        extraInfo().ifPresent { it.validate() }
        id()
        metadataSeperator()
        metadataTemplate()
        mimetype()
        relationships().ifPresent { it.validate() }
        startCharIdx()
        text()
        textTemplate()
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
        (if (className.asKnown().isPresent) 1 else 0) +
            (embedding.asKnown().getOrNull()?.size ?: 0) +
            (if (endCharIdx.asKnown().isPresent) 1 else 0) +
            (excludedEmbedMetadataKeys.asKnown().getOrNull()?.size ?: 0) +
            (excludedLlmMetadataKeys.asKnown().getOrNull()?.size ?: 0) +
            (extraInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (metadataSeperator.asKnown().isPresent) 1 else 0) +
            (if (metadataTemplate.asKnown().isPresent) 1 else 0) +
            (if (mimetype.asKnown().isPresent) 1 else 0) +
            (relationships.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startCharIdx.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (textTemplate.asKnown().isPresent) 1 else 0)

    /** A flat dictionary of metadata fields */
    class ExtraInfo
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ExtraInfo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExtraInfo]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(extraInfo: ExtraInfo) = apply {
                additionalProperties = extraInfo.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [ExtraInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExtraInfo = ExtraInfo(additionalProperties.toImmutable())
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
        fun validate(): ExtraInfo = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExtraInfo && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExtraInfo{additionalProperties=$additionalProperties}"
    }

    /** A mapping of relationships to other node information. */
    class Relationships
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Relationships]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Relationships]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(relationships: Relationships) = apply {
                additionalProperties = relationships.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Relationships].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Relationships = Relationships(additionalProperties.toImmutable())
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
        fun validate(): Relationships = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Relationships && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Relationships{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TextNode &&
            className == other.className &&
            embedding == other.embedding &&
            endCharIdx == other.endCharIdx &&
            excludedEmbedMetadataKeys == other.excludedEmbedMetadataKeys &&
            excludedLlmMetadataKeys == other.excludedLlmMetadataKeys &&
            extraInfo == other.extraInfo &&
            id == other.id &&
            metadataSeperator == other.metadataSeperator &&
            metadataTemplate == other.metadataTemplate &&
            mimetype == other.mimetype &&
            relationships == other.relationships &&
            startCharIdx == other.startCharIdx &&
            text == other.text &&
            textTemplate == other.textTemplate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            className,
            embedding,
            endCharIdx,
            excludedEmbedMetadataKeys,
            excludedLlmMetadataKeys,
            extraInfo,
            id,
            metadataSeperator,
            metadataTemplate,
            mimetype,
            relationships,
            startCharIdx,
            text,
            textTemplate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TextNode{className=$className, embedding=$embedding, endCharIdx=$endCharIdx, excludedEmbedMetadataKeys=$excludedEmbedMetadataKeys, excludedLlmMetadataKeys=$excludedLlmMetadataKeys, extraInfo=$extraInfo, id=$id, metadataSeperator=$metadataSeperator, metadataTemplate=$metadataTemplate, mimetype=$mimetype, relationships=$relationships, startCharIdx=$startCharIdx, text=$text, textTemplate=$textTemplate, additionalProperties=$additionalProperties}"
}
