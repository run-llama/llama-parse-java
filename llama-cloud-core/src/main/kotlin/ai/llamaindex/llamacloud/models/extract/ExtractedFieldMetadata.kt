// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

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

/** Metadata for extracted fields including document, page, and row level info. */
class ExtractedFieldMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val documentMetadata: JsonField<DocumentMetadata>,
    private val pageMetadata: JsonField<List<PageMetadata>>,
    private val rowMetadata: JsonField<List<RowMetadata>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("document_metadata")
        @ExcludeMissing
        documentMetadata: JsonField<DocumentMetadata> = JsonMissing.of(),
        @JsonProperty("page_metadata")
        @ExcludeMissing
        pageMetadata: JsonField<List<PageMetadata>> = JsonMissing.of(),
        @JsonProperty("row_metadata")
        @ExcludeMissing
        rowMetadata: JsonField<List<RowMetadata>> = JsonMissing.of(),
    ) : this(documentMetadata, pageMetadata, rowMetadata, mutableMapOf())

    /**
     * Per-field metadata keyed by field name from your schema. Scalar fields (e.g. `vendor`) map to
     * a FieldMetadataEntry with citation and confidence. Array fields (e.g. `items`) map to a list
     * where each element contains per-sub-field FieldMetadataEntry objects, indexed by array
     * position. Nested objects contain sub-field entries recursively.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentMetadata(): Optional<DocumentMetadata> =
        documentMetadata.getOptional("document_metadata")

    /**
     * Per-page metadata when extraction_target is per_page
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageMetadata(): Optional<List<PageMetadata>> = pageMetadata.getOptional("page_metadata")

    /**
     * Per-row metadata when extraction_target is per_table_row
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rowMetadata(): Optional<List<RowMetadata>> = rowMetadata.getOptional("row_metadata")

    /**
     * Returns the raw JSON value of [documentMetadata].
     *
     * Unlike [documentMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("document_metadata")
    @ExcludeMissing
    fun _documentMetadata(): JsonField<DocumentMetadata> = documentMetadata

    /**
     * Returns the raw JSON value of [pageMetadata].
     *
     * Unlike [pageMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_metadata")
    @ExcludeMissing
    fun _pageMetadata(): JsonField<List<PageMetadata>> = pageMetadata

    /**
     * Returns the raw JSON value of [rowMetadata].
     *
     * Unlike [rowMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("row_metadata")
    @ExcludeMissing
    fun _rowMetadata(): JsonField<List<RowMetadata>> = rowMetadata

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

        /** Returns a mutable builder for constructing an instance of [ExtractedFieldMetadata]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractedFieldMetadata]. */
    class Builder internal constructor() {

        private var documentMetadata: JsonField<DocumentMetadata> = JsonMissing.of()
        private var pageMetadata: JsonField<MutableList<PageMetadata>>? = null
        private var rowMetadata: JsonField<MutableList<RowMetadata>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractedFieldMetadata: ExtractedFieldMetadata) = apply {
            documentMetadata = extractedFieldMetadata.documentMetadata
            pageMetadata = extractedFieldMetadata.pageMetadata.map { it.toMutableList() }
            rowMetadata = extractedFieldMetadata.rowMetadata.map { it.toMutableList() }
            additionalProperties = extractedFieldMetadata.additionalProperties.toMutableMap()
        }

        /**
         * Per-field metadata keyed by field name from your schema. Scalar fields (e.g. `vendor`)
         * map to a FieldMetadataEntry with citation and confidence. Array fields (e.g. `items`) map
         * to a list where each element contains per-sub-field FieldMetadataEntry objects, indexed
         * by array position. Nested objects contain sub-field entries recursively.
         */
        fun documentMetadata(documentMetadata: DocumentMetadata?) =
            documentMetadata(JsonField.ofNullable(documentMetadata))

        /** Alias for calling [Builder.documentMetadata] with `documentMetadata.orElse(null)`. */
        fun documentMetadata(documentMetadata: Optional<DocumentMetadata>) =
            documentMetadata(documentMetadata.getOrNull())

        /**
         * Sets [Builder.documentMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentMetadata] with a well-typed [DocumentMetadata]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentMetadata(documentMetadata: JsonField<DocumentMetadata>) = apply {
            this.documentMetadata = documentMetadata
        }

        /** Per-page metadata when extraction_target is per_page */
        fun pageMetadata(pageMetadata: List<PageMetadata>?) =
            pageMetadata(JsonField.ofNullable(pageMetadata))

        /** Alias for calling [Builder.pageMetadata] with `pageMetadata.orElse(null)`. */
        fun pageMetadata(pageMetadata: Optional<List<PageMetadata>>) =
            pageMetadata(pageMetadata.getOrNull())

        /**
         * Sets [Builder.pageMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageMetadata] with a well-typed `List<PageMetadata>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pageMetadata(pageMetadata: JsonField<List<PageMetadata>>) = apply {
            this.pageMetadata = pageMetadata.map { it.toMutableList() }
        }

        /**
         * Adds a single [PageMetadata] to [Builder.pageMetadata].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPageMetadata(pageMetadata: PageMetadata) = apply {
            this.pageMetadata =
                (this.pageMetadata ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pageMetadata", it).add(pageMetadata)
                }
        }

        /** Per-row metadata when extraction_target is per_table_row */
        fun rowMetadata(rowMetadata: List<RowMetadata>?) =
            rowMetadata(JsonField.ofNullable(rowMetadata))

        /** Alias for calling [Builder.rowMetadata] with `rowMetadata.orElse(null)`. */
        fun rowMetadata(rowMetadata: Optional<List<RowMetadata>>) =
            rowMetadata(rowMetadata.getOrNull())

        /**
         * Sets [Builder.rowMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowMetadata] with a well-typed `List<RowMetadata>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rowMetadata(rowMetadata: JsonField<List<RowMetadata>>) = apply {
            this.rowMetadata = rowMetadata.map { it.toMutableList() }
        }

        /**
         * Adds a single [RowMetadata] to [Builder.rowMetadata].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRowMetadata(rowMetadata: RowMetadata) = apply {
            this.rowMetadata =
                (this.rowMetadata ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rowMetadata", it).add(rowMetadata)
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
         * Returns an immutable instance of [ExtractedFieldMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExtractedFieldMetadata =
            ExtractedFieldMetadata(
                documentMetadata,
                (pageMetadata ?: JsonMissing.of()).map { it.toImmutable() },
                (rowMetadata ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ExtractedFieldMetadata = apply {
        if (validated) {
            return@apply
        }

        documentMetadata().ifPresent { it.validate() }
        pageMetadata().ifPresent { it.forEach { it.validate() } }
        rowMetadata().ifPresent { it.forEach { it.validate() } }
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
        (documentMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (pageMetadata.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (rowMetadata.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * Per-field metadata keyed by field name from your schema. Scalar fields (e.g. `vendor`) map to
     * a FieldMetadataEntry with citation and confidence. Array fields (e.g. `items`) map to a list
     * where each element contains per-sub-field FieldMetadataEntry objects, indexed by array
     * position. Nested objects contain sub-field entries recursively.
     */
    class DocumentMetadata
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

            /** Returns a mutable builder for constructing an instance of [DocumentMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DocumentMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(documentMetadata: DocumentMetadata) = apply {
                additionalProperties = documentMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DocumentMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DocumentMetadata = DocumentMetadata(additionalProperties.toImmutable())
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
        fun validate(): DocumentMetadata = apply {
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

            return other is DocumentMetadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DocumentMetadata{additionalProperties=$additionalProperties}"
    }

    class PageMetadata
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

            /** Returns a mutable builder for constructing an instance of [PageMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PageMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pageMetadata: PageMetadata) = apply {
                additionalProperties = pageMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PageMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PageMetadata = PageMetadata(additionalProperties.toImmutable())
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
        fun validate(): PageMetadata = apply {
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

            return other is PageMetadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PageMetadata{additionalProperties=$additionalProperties}"
    }

    class RowMetadata
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

            /** Returns a mutable builder for constructing an instance of [RowMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RowMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rowMetadata: RowMetadata) = apply {
                additionalProperties = rowMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RowMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RowMetadata = RowMetadata(additionalProperties.toImmutable())
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
        fun validate(): RowMetadata = apply {
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

            return other is RowMetadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RowMetadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractedFieldMetadata &&
            documentMetadata == other.documentMetadata &&
            pageMetadata == other.pageMetadata &&
            rowMetadata == other.rowMetadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(documentMetadata, pageMetadata, rowMetadata, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractedFieldMetadata{documentMetadata=$documentMetadata, pageMetadata=$pageMetadata, rowMetadata=$rowMetadata, additionalProperties=$additionalProperties}"
}
