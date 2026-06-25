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
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response model for the classify endpoint following AIP-132 pagination standard. */
class JobGetResultsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val nextPageToken: JsonField<String>,
    private val totalSize: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        @JsonProperty("next_page_token")
        @ExcludeMissing
        nextPageToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_size") @ExcludeMissing totalSize: JsonField<Long> = JsonMissing.of(),
    ) : this(items, nextPageToken, totalSize, mutableMapOf())

    /**
     * The list of items.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * A token, which can be sent as page_token to retrieve the next page. If this field is omitted,
     * there are no subsequent pages.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPageToken(): Optional<String> = nextPageToken.getOptional("next_page_token")

    /**
     * The total number of items available. This is only populated when specifically requested. The
     * value may be an estimate and can be used for display purposes only.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalSize(): Optional<Long> = totalSize.getOptional("total_size")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

    /**
     * Returns the raw JSON value of [nextPageToken].
     *
     * Unlike [nextPageToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_page_token")
    @ExcludeMissing
    fun _nextPageToken(): JsonField<String> = nextPageToken

    /**
     * Returns the raw JSON value of [totalSize].
     *
     * Unlike [totalSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_size") @ExcludeMissing fun _totalSize(): JsonField<Long> = totalSize

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
         * Returns a mutable builder for constructing an instance of [JobGetResultsResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobGetResultsResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var nextPageToken: JsonField<String> = JsonMissing.of()
        private var totalSize: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(jobGetResultsResponse: JobGetResultsResponse) = apply {
            items = jobGetResultsResponse.items.map { it.toMutableList() }
            nextPageToken = jobGetResultsResponse.nextPageToken
            totalSize = jobGetResultsResponse.totalSize
            additionalProperties = jobGetResultsResponse.additionalProperties.toMutableMap()
        }

        /** The list of items. */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /**
         * A token, which can be sent as page_token to retrieve the next page. If this field is
         * omitted, there are no subsequent pages.
         */
        fun nextPageToken(nextPageToken: String?) =
            nextPageToken(JsonField.ofNullable(nextPageToken))

        /** Alias for calling [Builder.nextPageToken] with `nextPageToken.orElse(null)`. */
        fun nextPageToken(nextPageToken: Optional<String>) =
            nextPageToken(nextPageToken.getOrNull())

        /**
         * Sets [Builder.nextPageToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPageToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextPageToken(nextPageToken: JsonField<String>) = apply {
            this.nextPageToken = nextPageToken
        }

        /**
         * The total number of items available. This is only populated when specifically requested.
         * The value may be an estimate and can be used for display purposes only.
         */
        fun totalSize(totalSize: Long?) = totalSize(JsonField.ofNullable(totalSize))

        /**
         * Alias for [Builder.totalSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalSize(totalSize: Long) = totalSize(totalSize as Long?)

        /** Alias for calling [Builder.totalSize] with `totalSize.orElse(null)`. */
        fun totalSize(totalSize: Optional<Long>) = totalSize(totalSize.getOrNull())

        /**
         * Sets [Builder.totalSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalSize(totalSize: JsonField<Long>) = apply { this.totalSize = totalSize }

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
         * Returns an immutable instance of [JobGetResultsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobGetResultsResponse =
            JobGetResultsResponse(
                checkRequired("items", items).map { it.toImmutable() },
                nextPageToken,
                totalSize,
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
    fun validate(): JobGetResultsResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        nextPageToken()
        totalSize()
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextPageToken.asKnown().isPresent) 1 else 0) +
            (if (totalSize.asKnown().isPresent) 1 else 0)

    /** A file classification. */
    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val classifyJobId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val fileId: JsonField<String>,
        private val result: JsonField<Result>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("classify_job_id")
            @ExcludeMissing
            classifyJobId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, classifyJobId, createdAt, fileId, result, updatedAt, mutableMapOf())

        /**
         * Unique identifier
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The ID of the classify job
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun classifyJobId(): String = classifyJobId.getRequired("classify_job_id")

        /**
         * Creation datetime
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * The ID of the classified file
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileId(): Optional<String> = fileId.getOptional("file_id")

        /**
         * Result of classifying a single file.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun result(): Optional<Result> = result.getOptional("result")

        /**
         * Update datetime
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [classifyJobId].
         *
         * Unlike [classifyJobId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("classify_job_id")
        @ExcludeMissing
        fun _classifyJobId(): JsonField<String> = classifyJobId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [fileId].
         *
         * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .classifyJobId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var classifyJobId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var fileId: JsonField<String> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                id = item.id
                classifyJobId = item.classifyJobId
                createdAt = item.createdAt
                fileId = item.fileId
                result = item.result
                updatedAt = item.updatedAt
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** Unique identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The ID of the classify job */
            fun classifyJobId(classifyJobId: String) = classifyJobId(JsonField.of(classifyJobId))

            /**
             * Sets [Builder.classifyJobId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classifyJobId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classifyJobId(classifyJobId: JsonField<String>) = apply {
                this.classifyJobId = classifyJobId
            }

            /** Creation datetime */
            fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The ID of the classified file */
            fun fileId(fileId: String?) = fileId(JsonField.ofNullable(fileId))

            /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
            fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

            /**
             * Sets [Builder.fileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

            /** Result of classifying a single file. */
            fun result(result: Result?) = result(JsonField.ofNullable(result))

            /** Alias for calling [Builder.result] with `result.orElse(null)`. */
            fun result(result: Optional<Result>) = result(result.getOrNull())

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [Result] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Update datetime */
            fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

            /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
            fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .classifyJobId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("id", id),
                    checkRequired("classifyJobId", classifyJobId),
                    createdAt,
                    fileId,
                    result,
                    updatedAt,
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
        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            id()
            classifyJobId()
            createdAt()
            fileId()
            result().ifPresent { it.validate() }
            updatedAt()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (classifyJobId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (fileId.asKnown().isPresent) 1 else 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** Result of classifying a single file. */
        class Result
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val confidence: JsonField<Double>,
            private val reasoning: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("confidence")
                @ExcludeMissing
                confidence: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reasoning")
                @ExcludeMissing
                reasoning: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(confidence, reasoning, type, mutableMapOf())

            /**
             * Confidence score of the classification (0.0-1.0)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun confidence(): Double = confidence.getRequired("confidence")

            /**
             * Step-by-step explanation of why this classification was chosen and the confidence
             * score assigned
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reasoning(): String = reasoning.getRequired("reasoning")

            /**
             * The document type that best matches, or null if no match.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [confidence].
             *
             * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("confidence")
            @ExcludeMissing
            fun _confidence(): JsonField<Double> = confidence

            /**
             * Returns the raw JSON value of [reasoning].
             *
             * Unlike [reasoning], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reasoning")
            @ExcludeMissing
            fun _reasoning(): JsonField<String> = reasoning

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
                 * Returns a mutable builder for constructing an instance of [Result].
                 *
                 * The following fields are required:
                 * ```java
                 * .confidence()
                 * .reasoning()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Result]. */
            class Builder internal constructor() {

                private var confidence: JsonField<Double>? = null
                private var reasoning: JsonField<String>? = null
                private var type: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(result: Result) = apply {
                    confidence = result.confidence
                    reasoning = result.reasoning
                    type = result.type
                    additionalProperties = result.additionalProperties.toMutableMap()
                }

                /** Confidence score of the classification (0.0-1.0) */
                fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

                /**
                 * Sets [Builder.confidence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.confidence] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun confidence(confidence: JsonField<Double>) = apply {
                    this.confidence = confidence
                }

                /**
                 * Step-by-step explanation of why this classification was chosen and the confidence
                 * score assigned
                 */
                fun reasoning(reasoning: String) = reasoning(JsonField.of(reasoning))

                /**
                 * Sets [Builder.reasoning] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reasoning] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reasoning(reasoning: JsonField<String>) = apply { this.reasoning = reasoning }

                /** The document type that best matches, or null if no match. */
                fun type(type: String?) = type(JsonField.ofNullable(type))

                /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                fun type(type: Optional<String>) = type(type.getOrNull())

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Result].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .confidence()
                 * .reasoning()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Result =
                    Result(
                        checkRequired("confidence", confidence),
                        checkRequired("reasoning", reasoning),
                        checkRequired("type", type),
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
            fun validate(): Result = apply {
                if (validated) {
                    return@apply
                }

                confidence()
                reasoning()
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
                (if (confidence.asKnown().isPresent) 1 else 0) +
                    (if (reasoning.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result &&
                    confidence == other.confidence &&
                    reasoning == other.reasoning &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(confidence, reasoning, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Result{confidence=$confidence, reasoning=$reasoning, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                id == other.id &&
                classifyJobId == other.classifyJobId &&
                createdAt == other.createdAt &&
                fileId == other.fileId &&
                result == other.result &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                classifyJobId,
                createdAt,
                fileId,
                result,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, classifyJobId=$classifyJobId, createdAt=$createdAt, fileId=$fileId, result=$result, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobGetResultsResponse &&
            items == other.items &&
            nextPageToken == other.nextPageToken &&
            totalSize == other.totalSize &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(items, nextPageToken, totalSize, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JobGetResultsResponse{items=$items, nextPageToken=$nextPageToken, totalSize=$totalSize, additionalProperties=$additionalProperties}"
}
