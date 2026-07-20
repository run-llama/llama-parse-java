// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.retrieval

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Read the parsed text content of a specific file. */
class RetrievalReadParams
private constructor(
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * ID of the file to read.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileId(): String = body.fileId()

    /**
     * ID of the index the file belongs to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun indexId(): String = body.indexId()

    /**
     * Maximum number of characters to read from the offset.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxLength(): Optional<Long> = body.maxLength()

    /**
     * Starting character offset.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = body.offset()

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fileId(): JsonField<String> = body._fileId()

    /**
     * Returns the raw JSON value of [indexId].
     *
     * Unlike [indexId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _indexId(): JsonField<String> = body._indexId()

    /**
     * Returns the raw JSON value of [maxLength].
     *
     * Unlike [maxLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxLength(): JsonField<Long> = body._maxLength()

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _offset(): JsonField<Long> = body._offset()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RetrievalReadParams].
         *
         * The following fields are required:
         * ```java
         * .fileId()
         * .indexId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrievalReadParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(retrievalReadParams: RetrievalReadParams) = apply {
            organizationId = retrievalReadParams.organizationId
            projectId = retrievalReadParams.projectId
            body = retrievalReadParams.body.toBuilder()
            additionalHeaders = retrievalReadParams.additionalHeaders.toBuilder()
            additionalQueryParams = retrievalReadParams.additionalQueryParams.toBuilder()
        }

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [fileId]
         * - [indexId]
         * - [maxLength]
         * - [offset]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ID of the file to read. */
        fun fileId(fileId: String) = apply { body.fileId(fileId) }

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { body.fileId(fileId) }

        /** ID of the index the file belongs to. */
        fun indexId(indexId: String) = apply { body.indexId(indexId) }

        /**
         * Sets [Builder.indexId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun indexId(indexId: JsonField<String>) = apply { body.indexId(indexId) }

        /** Maximum number of characters to read from the offset. */
        fun maxLength(maxLength: Long?) = apply { body.maxLength(maxLength) }

        /**
         * Alias for [Builder.maxLength].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxLength(maxLength: Long) = maxLength(maxLength as Long?)

        /** Alias for calling [Builder.maxLength] with `maxLength.orElse(null)`. */
        fun maxLength(maxLength: Optional<Long>) = maxLength(maxLength.getOrNull())

        /**
         * Sets [Builder.maxLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxLength] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxLength(maxLength: JsonField<Long>) = apply { body.maxLength(maxLength) }

        /** Starting character offset. */
        fun offset(offset: Long) = apply { body.offset(offset) }

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { body.offset(offset) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [RetrievalReadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fileId()
         * .indexId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetrievalReadParams =
            RetrievalReadParams(
                organizationId,
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Read parsed content of a specific file. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fileId: JsonField<String>,
        private val indexId: JsonField<String>,
        private val maxLength: JsonField<Long>,
        private val offset: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("index_id") @ExcludeMissing indexId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_length")
            @ExcludeMissing
            maxLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
        ) : this(fileId, indexId, maxLength, offset, mutableMapOf())

        /**
         * ID of the file to read.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileId(): String = fileId.getRequired("file_id")

        /**
         * ID of the index the file belongs to.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun indexId(): String = indexId.getRequired("index_id")

        /**
         * Maximum number of characters to read from the offset.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxLength(): Optional<Long> = maxLength.getOptional("max_length")

        /**
         * Starting character offset.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun offset(): Optional<Long> = offset.getOptional("offset")

        /**
         * Returns the raw JSON value of [fileId].
         *
         * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

        /**
         * Returns the raw JSON value of [indexId].
         *
         * Unlike [indexId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index_id") @ExcludeMissing fun _indexId(): JsonField<String> = indexId

        /**
         * Returns the raw JSON value of [maxLength].
         *
         * Unlike [maxLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_length") @ExcludeMissing fun _maxLength(): JsonField<Long> = maxLength

        /**
         * Returns the raw JSON value of [offset].
         *
         * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .fileId()
             * .indexId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var fileId: JsonField<String>? = null
            private var indexId: JsonField<String>? = null
            private var maxLength: JsonField<Long> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                fileId = body.fileId
                indexId = body.indexId
                maxLength = body.maxLength
                offset = body.offset
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the file to read. */
            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

            /**
             * Sets [Builder.fileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

            /** ID of the index the file belongs to. */
            fun indexId(indexId: String) = indexId(JsonField.of(indexId))

            /**
             * Sets [Builder.indexId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.indexId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun indexId(indexId: JsonField<String>) = apply { this.indexId = indexId }

            /** Maximum number of characters to read from the offset. */
            fun maxLength(maxLength: Long?) = maxLength(JsonField.ofNullable(maxLength))

            /**
             * Alias for [Builder.maxLength].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxLength(maxLength: Long) = maxLength(maxLength as Long?)

            /** Alias for calling [Builder.maxLength] with `maxLength.orElse(null)`. */
            fun maxLength(maxLength: Optional<Long>) = maxLength(maxLength.getOrNull())

            /**
             * Sets [Builder.maxLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxLength] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxLength(maxLength: JsonField<Long>) = apply { this.maxLength = maxLength }

            /** Starting character offset. */
            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fileId()
             * .indexId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("fileId", fileId),
                    checkRequired("indexId", indexId),
                    maxLength,
                    offset,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            fileId()
            indexId()
            maxLength()
            offset()
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
            (if (fileId.asKnown().isPresent) 1 else 0) +
                (if (indexId.asKnown().isPresent) 1 else 0) +
                (if (maxLength.asKnown().isPresent) 1 else 0) +
                (if (offset.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                fileId == other.fileId &&
                indexId == other.indexId &&
                maxLength == other.maxLength &&
                offset == other.offset &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(fileId, indexId, maxLength, offset, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{fileId=$fileId, indexId=$indexId, maxLength=$maxLength, offset=$offset, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrievalReadParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RetrievalReadParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
