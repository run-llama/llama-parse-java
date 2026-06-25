// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Grep within a file's parsed content using a regex pattern. */
class RetrievalGrepParams
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
     * ID of the file to grep.
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
     * Regex pattern to search for.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pattern(): String = body.pattern()

    /**
     * Number of characters of context to include before and after the matched pattern in the
     * content field of the response
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contextChars(): Optional<Long> = body.contextChars()

    /**
     * The maximum number of items to return. The service may return fewer than this value. If
     * unspecified, a default page size will be used. The maximum value is typically 1000; values
     * above this will be coerced to the maximum.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = body.pageSize()

    /**
     * A page token, received from a previous list call. Provide this to retrieve the subsequent
     * page.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageToken(): Optional<String> = body.pageToken()

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
     * Returns the raw JSON value of [pattern].
     *
     * Unlike [pattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pattern(): JsonField<String> = body._pattern()

    /**
     * Returns the raw JSON value of [contextChars].
     *
     * Unlike [contextChars], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contextChars(): JsonField<Long> = body._contextChars()

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageSize(): JsonField<Long> = body._pageSize()

    /**
     * Returns the raw JSON value of [pageToken].
     *
     * Unlike [pageToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageToken(): JsonField<String> = body._pageToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RetrievalGrepParams].
         *
         * The following fields are required:
         * ```java
         * .fileId()
         * .indexId()
         * .pattern()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrievalGrepParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(retrievalGrepParams: RetrievalGrepParams) = apply {
            organizationId = retrievalGrepParams.organizationId
            projectId = retrievalGrepParams.projectId
            body = retrievalGrepParams.body.toBuilder()
            additionalHeaders = retrievalGrepParams.additionalHeaders.toBuilder()
            additionalQueryParams = retrievalGrepParams.additionalQueryParams.toBuilder()
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
         * - [pattern]
         * - [contextChars]
         * - [pageSize]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ID of the file to grep. */
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

        /** Regex pattern to search for. */
        fun pattern(pattern: String) = apply { body.pattern(pattern) }

        /**
         * Sets [Builder.pattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pattern] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pattern(pattern: JsonField<String>) = apply { body.pattern(pattern) }

        /**
         * Number of characters of context to include before and after the matched pattern in the
         * content field of the response
         */
        fun contextChars(contextChars: Long?) = apply { body.contextChars(contextChars) }

        /**
         * Alias for [Builder.contextChars].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun contextChars(contextChars: Long) = contextChars(contextChars as Long?)

        /** Alias for calling [Builder.contextChars] with `contextChars.orElse(null)`. */
        fun contextChars(contextChars: Optional<Long>) = contextChars(contextChars.getOrNull())

        /**
         * Sets [Builder.contextChars] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contextChars] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contextChars(contextChars: JsonField<Long>) = apply { body.contextChars(contextChars) }

        /**
         * The maximum number of items to return. The service may return fewer than this value. If
         * unspecified, a default page size will be used. The maximum value is typically 1000;
         * values above this will be coerced to the maximum.
         */
        fun pageSize(pageSize: Long?) = apply { body.pageSize(pageSize) }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { body.pageSize(pageSize) }

        /**
         * A page token, received from a previous list call. Provide this to retrieve the subsequent
         * page.
         */
        fun pageToken(pageToken: String?) = apply { body.pageToken(pageToken) }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        /**
         * Sets [Builder.pageToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pageToken(pageToken: JsonField<String>) = apply { body.pageToken(pageToken) }

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
         * Returns an immutable instance of [RetrievalGrepParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fileId()
         * .indexId()
         * .pattern()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetrievalGrepParams =
            RetrievalGrepParams(
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

    /** Grep within a specific file's parsed content. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fileId: JsonField<String>,
        private val indexId: JsonField<String>,
        private val pattern: JsonField<String>,
        private val contextChars: JsonField<Long>,
        private val pageSize: JsonField<Long>,
        private val pageToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("index_id") @ExcludeMissing indexId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pattern") @ExcludeMissing pattern: JsonField<String> = JsonMissing.of(),
            @JsonProperty("context_chars")
            @ExcludeMissing
            contextChars: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_token")
            @ExcludeMissing
            pageToken: JsonField<String> = JsonMissing.of(),
        ) : this(fileId, indexId, pattern, contextChars, pageSize, pageToken, mutableMapOf())

        /**
         * ID of the file to grep.
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
         * Regex pattern to search for.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pattern(): String = pattern.getRequired("pattern")

        /**
         * Number of characters of context to include before and after the matched pattern in the
         * content field of the response
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contextChars(): Optional<Long> = contextChars.getOptional("context_chars")

        /**
         * The maximum number of items to return. The service may return fewer than this value. If
         * unspecified, a default page size will be used. The maximum value is typically 1000;
         * values above this will be coerced to the maximum.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * A page token, received from a previous list call. Provide this to retrieve the subsequent
         * page.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageToken(): Optional<String> = pageToken.getOptional("page_token")

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
         * Returns the raw JSON value of [pattern].
         *
         * Unlike [pattern], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pattern") @ExcludeMissing fun _pattern(): JsonField<String> = pattern

        /**
         * Returns the raw JSON value of [contextChars].
         *
         * Unlike [contextChars], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("context_chars")
        @ExcludeMissing
        fun _contextChars(): JsonField<Long> = contextChars

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [pageToken].
         *
         * Unlike [pageToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_token") @ExcludeMissing fun _pageToken(): JsonField<String> = pageToken

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
             * .pattern()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var fileId: JsonField<String>? = null
            private var indexId: JsonField<String>? = null
            private var pattern: JsonField<String>? = null
            private var contextChars: JsonField<Long> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var pageToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                fileId = body.fileId
                indexId = body.indexId
                pattern = body.pattern
                contextChars = body.contextChars
                pageSize = body.pageSize
                pageToken = body.pageToken
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the file to grep. */
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

            /** Regex pattern to search for. */
            fun pattern(pattern: String) = pattern(JsonField.of(pattern))

            /**
             * Sets [Builder.pattern] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pattern] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pattern(pattern: JsonField<String>) = apply { this.pattern = pattern }

            /**
             * Number of characters of context to include before and after the matched pattern in
             * the content field of the response
             */
            fun contextChars(contextChars: Long?) = contextChars(JsonField.ofNullable(contextChars))

            /**
             * Alias for [Builder.contextChars].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun contextChars(contextChars: Long) = contextChars(contextChars as Long?)

            /** Alias for calling [Builder.contextChars] with `contextChars.orElse(null)`. */
            fun contextChars(contextChars: Optional<Long>) = contextChars(contextChars.getOrNull())

            /**
             * Sets [Builder.contextChars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contextChars] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contextChars(contextChars: JsonField<Long>) = apply {
                this.contextChars = contextChars
            }

            /**
             * The maximum number of items to return. The service may return fewer than this value.
             * If unspecified, a default page size will be used. The maximum value is typically
             * 1000; values above this will be coerced to the maximum.
             */
            fun pageSize(pageSize: Long?) = pageSize(JsonField.ofNullable(pageSize))

            /**
             * Alias for [Builder.pageSize].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

            /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
            fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            /**
             * A page token, received from a previous list call. Provide this to retrieve the
             * subsequent page.
             */
            fun pageToken(pageToken: String?) = pageToken(JsonField.ofNullable(pageToken))

            /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
            fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

            /**
             * Sets [Builder.pageToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageToken] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageToken(pageToken: JsonField<String>) = apply { this.pageToken = pageToken }

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
             * .pattern()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("fileId", fileId),
                    checkRequired("indexId", indexId),
                    checkRequired("pattern", pattern),
                    contextChars,
                    pageSize,
                    pageToken,
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
            pattern()
            contextChars()
            pageSize()
            pageToken()
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
                (if (pattern.asKnown().isPresent) 1 else 0) +
                (if (contextChars.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (pageToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                fileId == other.fileId &&
                indexId == other.indexId &&
                pattern == other.pattern &&
                contextChars == other.contextChars &&
                pageSize == other.pageSize &&
                pageToken == other.pageToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fileId,
                indexId,
                pattern,
                contextChars,
                pageSize,
                pageToken,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{fileId=$fileId, indexId=$indexId, pattern=$pattern, contextChars=$contextChars, pageSize=$pageSize, pageToken=$pageToken, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrievalGrepParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RetrievalGrepParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
