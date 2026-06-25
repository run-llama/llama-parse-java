// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.documents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Cloud document stored in S3. */
class CloudDocument
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val text: JsonField<String>,
    private val excludedEmbedMetadataKeys: JsonField<List<String>>,
    private val excludedLlmMetadataKeys: JsonField<List<String>>,
    private val pagePositions: JsonField<List<Long>>,
    private val statusMetadata: JsonField<StatusMetadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("excluded_embed_metadata_keys")
        @ExcludeMissing
        excludedEmbedMetadataKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("excluded_llm_metadata_keys")
        @ExcludeMissing
        excludedLlmMetadataKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("page_positions")
        @ExcludeMissing
        pagePositions: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("status_metadata")
        @ExcludeMissing
        statusMetadata: JsonField<StatusMetadata> = JsonMissing.of(),
    ) : this(
        id,
        metadata,
        text,
        excludedEmbedMetadataKeys,
        excludedLlmMetadataKeys,
        pagePositions,
        statusMetadata,
        mutableMapOf(),
    )

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludedEmbedMetadataKeys(): Optional<List<String>> =
        excludedEmbedMetadataKeys.getOptional("excluded_embed_metadata_keys")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludedLlmMetadataKeys(): Optional<List<String>> =
        excludedLlmMetadataKeys.getOptional("excluded_llm_metadata_keys")

    /**
     * indices in the CloudDocument.text where a new page begins. e.g. Second page starts at index
     * specified by page_positions[1].
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pagePositions(): Optional<List<Long>> = pagePositions.getOptional("page_positions")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusMetadata(): Optional<StatusMetadata> = statusMetadata.getOptional("status_metadata")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
     * Returns the raw JSON value of [pagePositions].
     *
     * Unlike [pagePositions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_positions")
    @ExcludeMissing
    fun _pagePositions(): JsonField<List<Long>> = pagePositions

    /**
     * Returns the raw JSON value of [statusMetadata].
     *
     * Unlike [statusMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_metadata")
    @ExcludeMissing
    fun _statusMetadata(): JsonField<StatusMetadata> = statusMetadata

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
         * Returns a mutable builder for constructing an instance of [CloudDocument].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .metadata()
         * .text()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudDocument]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var text: JsonField<String>? = null
        private var excludedEmbedMetadataKeys: JsonField<MutableList<String>>? = null
        private var excludedLlmMetadataKeys: JsonField<MutableList<String>>? = null
        private var pagePositions: JsonField<MutableList<Long>>? = null
        private var statusMetadata: JsonField<StatusMetadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudDocument: CloudDocument) = apply {
            id = cloudDocument.id
            metadata = cloudDocument.metadata
            text = cloudDocument.text
            excludedEmbedMetadataKeys =
                cloudDocument.excludedEmbedMetadataKeys.map { it.toMutableList() }
            excludedLlmMetadataKeys =
                cloudDocument.excludedLlmMetadataKeys.map { it.toMutableList() }
            pagePositions = cloudDocument.pagePositions.map { it.toMutableList() }
            statusMetadata = cloudDocument.statusMetadata
            additionalProperties = cloudDocument.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

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

        /**
         * indices in the CloudDocument.text where a new page begins. e.g. Second page starts at
         * index specified by page_positions[1].
         */
        fun pagePositions(pagePositions: List<Long>?) =
            pagePositions(JsonField.ofNullable(pagePositions))

        /** Alias for calling [Builder.pagePositions] with `pagePositions.orElse(null)`. */
        fun pagePositions(pagePositions: Optional<List<Long>>) =
            pagePositions(pagePositions.getOrNull())

        /**
         * Sets [Builder.pagePositions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pagePositions] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pagePositions(pagePositions: JsonField<List<Long>>) = apply {
            this.pagePositions = pagePositions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [pagePositions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPagePosition(pagePosition: Long) = apply {
            pagePositions =
                (pagePositions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pagePositions", it).add(pagePosition)
                }
        }

        fun statusMetadata(statusMetadata: StatusMetadata?) =
            statusMetadata(JsonField.ofNullable(statusMetadata))

        /** Alias for calling [Builder.statusMetadata] with `statusMetadata.orElse(null)`. */
        fun statusMetadata(statusMetadata: Optional<StatusMetadata>) =
            statusMetadata(statusMetadata.getOrNull())

        /**
         * Sets [Builder.statusMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusMetadata] with a well-typed [StatusMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusMetadata(statusMetadata: JsonField<StatusMetadata>) = apply {
            this.statusMetadata = statusMetadata
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
         * Returns an immutable instance of [CloudDocument].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .metadata()
         * .text()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudDocument =
            CloudDocument(
                checkRequired("id", id),
                checkRequired("metadata", metadata),
                checkRequired("text", text),
                (excludedEmbedMetadataKeys ?: JsonMissing.of()).map { it.toImmutable() },
                (excludedLlmMetadataKeys ?: JsonMissing.of()).map { it.toImmutable() },
                (pagePositions ?: JsonMissing.of()).map { it.toImmutable() },
                statusMetadata,
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
    fun validate(): CloudDocument = apply {
        if (validated) {
            return@apply
        }

        id()
        metadata().validate()
        text()
        excludedEmbedMetadataKeys()
        excludedLlmMetadataKeys()
        pagePositions()
        statusMetadata().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (excludedEmbedMetadataKeys.asKnown().getOrNull()?.size ?: 0) +
            (excludedLlmMetadataKeys.asKnown().getOrNull()?.size ?: 0) +
            (pagePositions.asKnown().getOrNull()?.size ?: 0) +
            (statusMetadata.asKnown().getOrNull()?.validity() ?: 0)

    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class StatusMetadata
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

            /** Returns a mutable builder for constructing an instance of [StatusMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StatusMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(statusMetadata: StatusMetadata) = apply {
                additionalProperties = statusMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [StatusMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StatusMetadata = StatusMetadata(additionalProperties.toImmutable())
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
        fun validate(): StatusMetadata = apply {
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

            return other is StatusMetadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "StatusMetadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudDocument &&
            id == other.id &&
            metadata == other.metadata &&
            text == other.text &&
            excludedEmbedMetadataKeys == other.excludedEmbedMetadataKeys &&
            excludedLlmMetadataKeys == other.excludedLlmMetadataKeys &&
            pagePositions == other.pagePositions &&
            statusMetadata == other.statusMetadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            metadata,
            text,
            excludedEmbedMetadataKeys,
            excludedLlmMetadataKeys,
            pagePositions,
            statusMetadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudDocument{id=$id, metadata=$metadata, text=$text, excludedEmbedMetadataKeys=$excludedEmbedMetadataKeys, excludedLlmMetadataKeys=$excludedLlmMetadataKeys, pagePositions=$pagePositions, statusMetadata=$statusMetadata, additionalProperties=$additionalProperties}"
}
