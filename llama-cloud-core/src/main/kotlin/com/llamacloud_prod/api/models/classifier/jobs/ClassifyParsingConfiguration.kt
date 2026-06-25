// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classifier.jobs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import com.llamacloud_prod.api.models.parsing.ParsingLanguages
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Parsing configuration for a classify job. */
class ClassifyParsingConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lang: JsonField<ParsingLanguages>,
    private val maxPages: JsonField<Long>,
    private val targetPages: JsonField<List<Long>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lang") @ExcludeMissing lang: JsonField<ParsingLanguages> = JsonMissing.of(),
        @JsonProperty("max_pages") @ExcludeMissing maxPages: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("target_pages")
        @ExcludeMissing
        targetPages: JsonField<List<Long>> = JsonMissing.of(),
    ) : this(lang, maxPages, targetPages, mutableMapOf())

    /**
     * The language to parse the files in
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lang(): Optional<ParsingLanguages> = lang.getOptional("lang")

    /**
     * The maximum number of pages to parse
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxPages(): Optional<Long> = maxPages.getOptional("max_pages")

    /**
     * The pages to target for parsing (0-indexed, so first page is at 0)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetPages(): Optional<List<Long>> = targetPages.getOptional("target_pages")

    /**
     * Returns the raw JSON value of [lang].
     *
     * Unlike [lang], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lang") @ExcludeMissing fun _lang(): JsonField<ParsingLanguages> = lang

    /**
     * Returns the raw JSON value of [maxPages].
     *
     * Unlike [maxPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_pages") @ExcludeMissing fun _maxPages(): JsonField<Long> = maxPages

    /**
     * Returns the raw JSON value of [targetPages].
     *
     * Unlike [targetPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_pages")
    @ExcludeMissing
    fun _targetPages(): JsonField<List<Long>> = targetPages

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
         * Returns a mutable builder for constructing an instance of [ClassifyParsingConfiguration].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClassifyParsingConfiguration]. */
    class Builder internal constructor() {

        private var lang: JsonField<ParsingLanguages> = JsonMissing.of()
        private var maxPages: JsonField<Long> = JsonMissing.of()
        private var targetPages: JsonField<MutableList<Long>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(classifyParsingConfiguration: ClassifyParsingConfiguration) = apply {
            lang = classifyParsingConfiguration.lang
            maxPages = classifyParsingConfiguration.maxPages
            targetPages = classifyParsingConfiguration.targetPages.map { it.toMutableList() }
            additionalProperties = classifyParsingConfiguration.additionalProperties.toMutableMap()
        }

        /** The language to parse the files in */
        fun lang(lang: ParsingLanguages) = lang(JsonField.of(lang))

        /**
         * Sets [Builder.lang] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lang] with a well-typed [ParsingLanguages] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lang(lang: JsonField<ParsingLanguages>) = apply { this.lang = lang }

        /** The maximum number of pages to parse */
        fun maxPages(maxPages: Long?) = maxPages(JsonField.ofNullable(maxPages))

        /**
         * Alias for [Builder.maxPages].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxPages(maxPages: Long) = maxPages(maxPages as Long?)

        /** Alias for calling [Builder.maxPages] with `maxPages.orElse(null)`. */
        fun maxPages(maxPages: Optional<Long>) = maxPages(maxPages.getOrNull())

        /**
         * Sets [Builder.maxPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPages] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxPages(maxPages: JsonField<Long>) = apply { this.maxPages = maxPages }

        /** The pages to target for parsing (0-indexed, so first page is at 0) */
        fun targetPages(targetPages: List<Long>?) = targetPages(JsonField.ofNullable(targetPages))

        /** Alias for calling [Builder.targetPages] with `targetPages.orElse(null)`. */
        fun targetPages(targetPages: Optional<List<Long>>) = targetPages(targetPages.getOrNull())

        /**
         * Sets [Builder.targetPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetPages] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetPages(targetPages: JsonField<List<Long>>) = apply {
            this.targetPages = targetPages.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [targetPages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTargetPage(targetPage: Long) = apply {
            targetPages =
                (targetPages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("targetPages", it).add(targetPage)
                }
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
         * Returns an immutable instance of [ClassifyParsingConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ClassifyParsingConfiguration =
            ClassifyParsingConfiguration(
                lang,
                maxPages,
                (targetPages ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ClassifyParsingConfiguration = apply {
        if (validated) {
            return@apply
        }

        lang().ifPresent { it.validate() }
        maxPages()
        targetPages()
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
        (lang.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maxPages.asKnown().isPresent) 1 else 0) +
            (targetPages.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClassifyParsingConfiguration &&
            lang == other.lang &&
            maxPages == other.maxPages &&
            targetPages == other.targetPages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(lang, maxPages, targetPages, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClassifyParsingConfiguration{lang=$lang, maxPages=$maxPages, targetPages=$targetPages, additionalProperties=$additionalProperties}"
}
