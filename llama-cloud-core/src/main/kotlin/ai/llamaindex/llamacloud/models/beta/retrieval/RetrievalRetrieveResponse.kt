// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.retrieval

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

/** Response containing retrieval results. */
class RetrievalRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val results: JsonField<List<Result>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("results") @ExcludeMissing results: JsonField<List<Result>> = JsonMissing.of()
    ) : this(results, mutableMapOf())

    /**
     * Ordered list of retrieved chunks.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = results.getRequired("results")

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

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
         * Returns a mutable builder for constructing an instance of [RetrievalRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrievalRetrieveResponse]. */
    class Builder internal constructor() {

        private var results: JsonField<MutableList<Result>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(retrievalRetrieveResponse: RetrievalRetrieveResponse) = apply {
            results = retrievalRetrieveResponse.results.map { it.toMutableList() }
            additionalProperties = retrievalRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Ordered list of retrieved chunks. */
        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
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
         * Returns an immutable instance of [RetrievalRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetrievalRetrieveResponse =
            RetrievalRetrieveResponse(
                checkRequired("results", results).map { it.toImmutable() },
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
    fun validate(): RetrievalRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        results().forEach { it.validate() }
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
        (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** A single retrieval result. */
    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val content: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val rerankScore: JsonField<Double>,
        private val score: JsonField<Double>,
        private val staticFields: JsonField<StaticFields>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("rerank_score")
            @ExcludeMissing
            rerankScore: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("static_fields")
            @ExcludeMissing
            staticFields: JsonField<StaticFields> = JsonMissing.of(),
        ) : this(content, metadata, rerankScore, score, staticFields, mutableMapOf())

        /**
         * Text content of the retrieved chunk.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun content(): String = content.getRequired("content")

        /**
         * User-defined metadata associated with the chunk.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Relevance score from the reranker, if reranking was applied.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rerankScore(): Optional<Double> = rerankScore.getOptional("rerank_score")

        /**
         * Hybrid search relevance score.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * Built-in fields stored for every exported chunk.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun staticFields(): Optional<StaticFields> = staticFields.getOptional("static_fields")

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [rerankScore].
         *
         * Unlike [rerankScore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rerank_score")
        @ExcludeMissing
        fun _rerankScore(): JsonField<Double> = rerankScore

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

        /**
         * Returns the raw JSON value of [staticFields].
         *
         * Unlike [staticFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("static_fields")
        @ExcludeMissing
        fun _staticFields(): JsonField<StaticFields> = staticFields

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
             * .content()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var content: JsonField<String>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var rerankScore: JsonField<Double> = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var staticFields: JsonField<StaticFields> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                content = result.content
                metadata = result.metadata
                rerankScore = result.rerankScore
                score = result.score
                staticFields = result.staticFields
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** Text content of the retrieved chunk. */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /** User-defined metadata associated with the chunk. */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Relevance score from the reranker, if reranking was applied. */
            fun rerankScore(rerankScore: Double?) = rerankScore(JsonField.ofNullable(rerankScore))

            /**
             * Alias for [Builder.rerankScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rerankScore(rerankScore: Double) = rerankScore(rerankScore as Double?)

            /** Alias for calling [Builder.rerankScore] with `rerankScore.orElse(null)`. */
            fun rerankScore(rerankScore: Optional<Double>) = rerankScore(rerankScore.getOrNull())

            /**
             * Sets [Builder.rerankScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rerankScore] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rerankScore(rerankScore: JsonField<Double>) = apply {
                this.rerankScore = rerankScore
            }

            /** Hybrid search relevance score. */
            fun score(score: Double?) = score(JsonField.ofNullable(score))

            /**
             * Alias for [Builder.score].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun score(score: Double) = score(score as Double?)

            /** Alias for calling [Builder.score] with `score.orElse(null)`. */
            fun score(score: Optional<Double>) = score(score.getOrNull())

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            /** Built-in fields stored for every exported chunk. */
            fun staticFields(staticFields: StaticFields) = staticFields(JsonField.of(staticFields))

            /**
             * Sets [Builder.staticFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.staticFields] with a well-typed [StaticFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun staticFields(staticFields: JsonField<StaticFields>) = apply {
                this.staticFields = staticFields
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .content()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("content", content),
                    metadata,
                    rerankScore,
                    score,
                    staticFields,
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
        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            content()
            metadata().ifPresent { it.validate() }
            rerankScore()
            score()
            staticFields().ifPresent { it.validate() }
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
            (if (content.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rerankScore.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0) +
                (staticFields.asKnown().getOrNull()?.validity() ?: 0)

        /** User-defined metadata associated with the chunk. */
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        /** Built-in fields stored for every exported chunk. */
        class StaticFields
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val attachments: JsonField<List<Attachment>>,
            private val chunkEndChar: JsonField<Long>,
            private val chunkIndex: JsonField<Long>,
            private val chunkStartChar: JsonField<Long>,
            private val chunkTokenCount: JsonField<Long>,
            private val pageRangeEnd: JsonField<Long>,
            private val pageRangeStart: JsonField<Long>,
            private val parsedDirectoryFileId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("attachments")
                @ExcludeMissing
                attachments: JsonField<List<Attachment>> = JsonMissing.of(),
                @JsonProperty("chunk_end_char")
                @ExcludeMissing
                chunkEndChar: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("chunk_index")
                @ExcludeMissing
                chunkIndex: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("chunk_start_char")
                @ExcludeMissing
                chunkStartChar: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("chunk_token_count")
                @ExcludeMissing
                chunkTokenCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("page_range_end")
                @ExcludeMissing
                pageRangeEnd: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("page_range_start")
                @ExcludeMissing
                pageRangeStart: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("parsed_directory_file_id")
                @ExcludeMissing
                parsedDirectoryFileId: JsonField<String> = JsonMissing.of(),
            ) : this(
                attachments,
                chunkEndChar,
                chunkIndex,
                chunkStartChar,
                chunkTokenCount,
                pageRangeEnd,
                pageRangeStart,
                parsedDirectoryFileId,
                mutableMapOf(),
            )

            /**
             * Attachments associated with the chunk
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun attachments(): Optional<List<Attachment>> = attachments.getOptional("attachments")

            /**
             * End character offset of the chunk.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chunkEndChar(): Optional<Long> = chunkEndChar.getOptional("chunk_end_char")

            /**
             * Index of the chunk within the file.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chunkIndex(): Optional<Long> = chunkIndex.getOptional("chunk_index")

            /**
             * Start character offset of the chunk.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chunkStartChar(): Optional<Long> = chunkStartChar.getOptional("chunk_start_char")

            /**
             * Token count of the chunk.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chunkTokenCount(): Optional<Long> = chunkTokenCount.getOptional("chunk_token_count")

            /**
             * Last page number covered by this chunk.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageRangeEnd(): Optional<Long> = pageRangeEnd.getOptional("page_range_end")

            /**
             * First page number covered by this chunk.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageRangeStart(): Optional<Long> = pageRangeStart.getOptional("page_range_start")

            /**
             * ID of the parsed file.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun parsedDirectoryFileId(): Optional<String> =
                parsedDirectoryFileId.getOptional("parsed_directory_file_id")

            /**
             * Returns the raw JSON value of [attachments].
             *
             * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attachments")
            @ExcludeMissing
            fun _attachments(): JsonField<List<Attachment>> = attachments

            /**
             * Returns the raw JSON value of [chunkEndChar].
             *
             * Unlike [chunkEndChar], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chunk_end_char")
            @ExcludeMissing
            fun _chunkEndChar(): JsonField<Long> = chunkEndChar

            /**
             * Returns the raw JSON value of [chunkIndex].
             *
             * Unlike [chunkIndex], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chunk_index")
            @ExcludeMissing
            fun _chunkIndex(): JsonField<Long> = chunkIndex

            /**
             * Returns the raw JSON value of [chunkStartChar].
             *
             * Unlike [chunkStartChar], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("chunk_start_char")
            @ExcludeMissing
            fun _chunkStartChar(): JsonField<Long> = chunkStartChar

            /**
             * Returns the raw JSON value of [chunkTokenCount].
             *
             * Unlike [chunkTokenCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("chunk_token_count")
            @ExcludeMissing
            fun _chunkTokenCount(): JsonField<Long> = chunkTokenCount

            /**
             * Returns the raw JSON value of [pageRangeEnd].
             *
             * Unlike [pageRangeEnd], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("page_range_end")
            @ExcludeMissing
            fun _pageRangeEnd(): JsonField<Long> = pageRangeEnd

            /**
             * Returns the raw JSON value of [pageRangeStart].
             *
             * Unlike [pageRangeStart], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("page_range_start")
            @ExcludeMissing
            fun _pageRangeStart(): JsonField<Long> = pageRangeStart

            /**
             * Returns the raw JSON value of [parsedDirectoryFileId].
             *
             * Unlike [parsedDirectoryFileId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("parsed_directory_file_id")
            @ExcludeMissing
            fun _parsedDirectoryFileId(): JsonField<String> = parsedDirectoryFileId

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

                /** Returns a mutable builder for constructing an instance of [StaticFields]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StaticFields]. */
            class Builder internal constructor() {

                private var attachments: JsonField<MutableList<Attachment>>? = null
                private var chunkEndChar: JsonField<Long> = JsonMissing.of()
                private var chunkIndex: JsonField<Long> = JsonMissing.of()
                private var chunkStartChar: JsonField<Long> = JsonMissing.of()
                private var chunkTokenCount: JsonField<Long> = JsonMissing.of()
                private var pageRangeEnd: JsonField<Long> = JsonMissing.of()
                private var pageRangeStart: JsonField<Long> = JsonMissing.of()
                private var parsedDirectoryFileId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(staticFields: StaticFields) = apply {
                    attachments = staticFields.attachments.map { it.toMutableList() }
                    chunkEndChar = staticFields.chunkEndChar
                    chunkIndex = staticFields.chunkIndex
                    chunkStartChar = staticFields.chunkStartChar
                    chunkTokenCount = staticFields.chunkTokenCount
                    pageRangeEnd = staticFields.pageRangeEnd
                    pageRangeStart = staticFields.pageRangeStart
                    parsedDirectoryFileId = staticFields.parsedDirectoryFileId
                    additionalProperties = staticFields.additionalProperties.toMutableMap()
                }

                /** Attachments associated with the chunk */
                fun attachments(attachments: List<Attachment>) =
                    attachments(JsonField.of(attachments))

                /**
                 * Sets [Builder.attachments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attachments] with a well-typed
                 * `List<Attachment>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun attachments(attachments: JsonField<List<Attachment>>) = apply {
                    this.attachments = attachments.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Attachment] to [attachments].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAttachment(attachment: Attachment) = apply {
                    attachments =
                        (attachments ?: JsonField.of(mutableListOf())).also {
                            checkKnown("attachments", it).add(attachment)
                        }
                }

                /** End character offset of the chunk. */
                fun chunkEndChar(chunkEndChar: Long?) =
                    chunkEndChar(JsonField.ofNullable(chunkEndChar))

                /**
                 * Alias for [Builder.chunkEndChar].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun chunkEndChar(chunkEndChar: Long) = chunkEndChar(chunkEndChar as Long?)

                /** Alias for calling [Builder.chunkEndChar] with `chunkEndChar.orElse(null)`. */
                fun chunkEndChar(chunkEndChar: Optional<Long>) =
                    chunkEndChar(chunkEndChar.getOrNull())

                /**
                 * Sets [Builder.chunkEndChar] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkEndChar] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkEndChar(chunkEndChar: JsonField<Long>) = apply {
                    this.chunkEndChar = chunkEndChar
                }

                /** Index of the chunk within the file. */
                fun chunkIndex(chunkIndex: Long?) = chunkIndex(JsonField.ofNullable(chunkIndex))

                /**
                 * Alias for [Builder.chunkIndex].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun chunkIndex(chunkIndex: Long) = chunkIndex(chunkIndex as Long?)

                /** Alias for calling [Builder.chunkIndex] with `chunkIndex.orElse(null)`. */
                fun chunkIndex(chunkIndex: Optional<Long>) = chunkIndex(chunkIndex.getOrNull())

                /**
                 * Sets [Builder.chunkIndex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkIndex] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkIndex(chunkIndex: JsonField<Long>) = apply { this.chunkIndex = chunkIndex }

                /** Start character offset of the chunk. */
                fun chunkStartChar(chunkStartChar: Long?) =
                    chunkStartChar(JsonField.ofNullable(chunkStartChar))

                /**
                 * Alias for [Builder.chunkStartChar].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun chunkStartChar(chunkStartChar: Long) = chunkStartChar(chunkStartChar as Long?)

                /**
                 * Alias for calling [Builder.chunkStartChar] with `chunkStartChar.orElse(null)`.
                 */
                fun chunkStartChar(chunkStartChar: Optional<Long>) =
                    chunkStartChar(chunkStartChar.getOrNull())

                /**
                 * Sets [Builder.chunkStartChar] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkStartChar] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkStartChar(chunkStartChar: JsonField<Long>) = apply {
                    this.chunkStartChar = chunkStartChar
                }

                /** Token count of the chunk. */
                fun chunkTokenCount(chunkTokenCount: Long?) =
                    chunkTokenCount(JsonField.ofNullable(chunkTokenCount))

                /**
                 * Alias for [Builder.chunkTokenCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun chunkTokenCount(chunkTokenCount: Long) =
                    chunkTokenCount(chunkTokenCount as Long?)

                /**
                 * Alias for calling [Builder.chunkTokenCount] with `chunkTokenCount.orElse(null)`.
                 */
                fun chunkTokenCount(chunkTokenCount: Optional<Long>) =
                    chunkTokenCount(chunkTokenCount.getOrNull())

                /**
                 * Sets [Builder.chunkTokenCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkTokenCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkTokenCount(chunkTokenCount: JsonField<Long>) = apply {
                    this.chunkTokenCount = chunkTokenCount
                }

                /** Last page number covered by this chunk. */
                fun pageRangeEnd(pageRangeEnd: Long?) =
                    pageRangeEnd(JsonField.ofNullable(pageRangeEnd))

                /**
                 * Alias for [Builder.pageRangeEnd].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun pageRangeEnd(pageRangeEnd: Long) = pageRangeEnd(pageRangeEnd as Long?)

                /** Alias for calling [Builder.pageRangeEnd] with `pageRangeEnd.orElse(null)`. */
                fun pageRangeEnd(pageRangeEnd: Optional<Long>) =
                    pageRangeEnd(pageRangeEnd.getOrNull())

                /**
                 * Sets [Builder.pageRangeEnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageRangeEnd] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pageRangeEnd(pageRangeEnd: JsonField<Long>) = apply {
                    this.pageRangeEnd = pageRangeEnd
                }

                /** First page number covered by this chunk. */
                fun pageRangeStart(pageRangeStart: Long?) =
                    pageRangeStart(JsonField.ofNullable(pageRangeStart))

                /**
                 * Alias for [Builder.pageRangeStart].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun pageRangeStart(pageRangeStart: Long) = pageRangeStart(pageRangeStart as Long?)

                /**
                 * Alias for calling [Builder.pageRangeStart] with `pageRangeStart.orElse(null)`.
                 */
                fun pageRangeStart(pageRangeStart: Optional<Long>) =
                    pageRangeStart(pageRangeStart.getOrNull())

                /**
                 * Sets [Builder.pageRangeStart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageRangeStart] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pageRangeStart(pageRangeStart: JsonField<Long>) = apply {
                    this.pageRangeStart = pageRangeStart
                }

                /** ID of the parsed file. */
                fun parsedDirectoryFileId(parsedDirectoryFileId: String?) =
                    parsedDirectoryFileId(JsonField.ofNullable(parsedDirectoryFileId))

                /**
                 * Alias for calling [Builder.parsedDirectoryFileId] with
                 * `parsedDirectoryFileId.orElse(null)`.
                 */
                fun parsedDirectoryFileId(parsedDirectoryFileId: Optional<String>) =
                    parsedDirectoryFileId(parsedDirectoryFileId.getOrNull())

                /**
                 * Sets [Builder.parsedDirectoryFileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parsedDirectoryFileId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun parsedDirectoryFileId(parsedDirectoryFileId: JsonField<String>) = apply {
                    this.parsedDirectoryFileId = parsedDirectoryFileId
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
                 * Returns an immutable instance of [StaticFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): StaticFields =
                    StaticFields(
                        (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                        chunkEndChar,
                        chunkIndex,
                        chunkStartChar,
                        chunkTokenCount,
                        pageRangeEnd,
                        pageRangeStart,
                        parsedDirectoryFileId,
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
            fun validate(): StaticFields = apply {
                if (validated) {
                    return@apply
                }

                attachments().ifPresent { it.forEach { it.validate() } }
                chunkEndChar()
                chunkIndex()
                chunkStartChar()
                chunkTokenCount()
                pageRangeEnd()
                pageRangeStart()
                parsedDirectoryFileId()
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
                (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (chunkEndChar.asKnown().isPresent) 1 else 0) +
                    (if (chunkIndex.asKnown().isPresent) 1 else 0) +
                    (if (chunkStartChar.asKnown().isPresent) 1 else 0) +
                    (if (chunkTokenCount.asKnown().isPresent) 1 else 0) +
                    (if (pageRangeEnd.asKnown().isPresent) 1 else 0) +
                    (if (pageRangeStart.asKnown().isPresent) 1 else 0) +
                    (if (parsedDirectoryFileId.asKnown().isPresent) 1 else 0)

            /**
             * Reference to a file attachment, retrievable via ``GET
             * /api/v1/beta/attachments/{attachment_name}?source_id=...``.
             */
            class Attachment
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val attachmentName: JsonField<String>,
                private val sourceId: JsonField<String>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("attachment_name")
                    @ExcludeMissing
                    attachmentName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("source_id")
                    @ExcludeMissing
                    sourceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(attachmentName, sourceId, type, mutableMapOf())

                /**
                 * Attachment-relative path, e.g. 'screenshots/page_7.jpg'.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun attachmentName(): String = attachmentName.getRequired("attachment_name")

                /**
                 * File ID to pass as source_id when fetching the attachment.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun sourceId(): String = sourceId.getRequired("source_id")

                /**
                 * Attachment kind, e.g. 'screenshot', 'items'.
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): String = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [attachmentName].
                 *
                 * Unlike [attachmentName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("attachment_name")
                @ExcludeMissing
                fun _attachmentName(): JsonField<String> = attachmentName

                /**
                 * Returns the raw JSON value of [sourceId].
                 *
                 * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("source_id")
                @ExcludeMissing
                fun _sourceId(): JsonField<String> = sourceId

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [Attachment].
                     *
                     * The following fields are required:
                     * ```java
                     * .attachmentName()
                     * .sourceId()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Attachment]. */
                class Builder internal constructor() {

                    private var attachmentName: JsonField<String>? = null
                    private var sourceId: JsonField<String>? = null
                    private var type: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(attachment: Attachment) = apply {
                        attachmentName = attachment.attachmentName
                        sourceId = attachment.sourceId
                        type = attachment.type
                        additionalProperties = attachment.additionalProperties.toMutableMap()
                    }

                    /** Attachment-relative path, e.g. 'screenshots/page_7.jpg'. */
                    fun attachmentName(attachmentName: String) =
                        attachmentName(JsonField.of(attachmentName))

                    /**
                     * Sets [Builder.attachmentName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attachmentName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attachmentName(attachmentName: JsonField<String>) = apply {
                        this.attachmentName = attachmentName
                    }

                    /** File ID to pass as source_id when fetching the attachment. */
                    fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

                    /**
                     * Sets [Builder.sourceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sourceId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

                    /** Attachment kind, e.g. 'screenshot', 'items'. */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [Attachment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .attachmentName()
                     * .sourceId()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Attachment =
                        Attachment(
                            checkRequired("attachmentName", attachmentName),
                            checkRequired("sourceId", sourceId),
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Attachment = apply {
                    if (validated) {
                        return@apply
                    }

                    attachmentName()
                    sourceId()
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
                    (if (attachmentName.asKnown().isPresent) 1 else 0) +
                        (if (sourceId.asKnown().isPresent) 1 else 0) +
                        (if (type.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Attachment &&
                        attachmentName == other.attachmentName &&
                        sourceId == other.sourceId &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(attachmentName, sourceId, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Attachment{attachmentName=$attachmentName, sourceId=$sourceId, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StaticFields &&
                    attachments == other.attachments &&
                    chunkEndChar == other.chunkEndChar &&
                    chunkIndex == other.chunkIndex &&
                    chunkStartChar == other.chunkStartChar &&
                    chunkTokenCount == other.chunkTokenCount &&
                    pageRangeEnd == other.pageRangeEnd &&
                    pageRangeStart == other.pageRangeStart &&
                    parsedDirectoryFileId == other.parsedDirectoryFileId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    attachments,
                    chunkEndChar,
                    chunkIndex,
                    chunkStartChar,
                    chunkTokenCount,
                    pageRangeEnd,
                    pageRangeStart,
                    parsedDirectoryFileId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StaticFields{attachments=$attachments, chunkEndChar=$chunkEndChar, chunkIndex=$chunkIndex, chunkStartChar=$chunkStartChar, chunkTokenCount=$chunkTokenCount, pageRangeEnd=$pageRangeEnd, pageRangeStart=$pageRangeStart, parsedDirectoryFileId=$parsedDirectoryFileId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                content == other.content &&
                metadata == other.metadata &&
                rerankScore == other.rerankScore &&
                score == other.score &&
                staticFields == other.staticFields &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(content, metadata, rerankScore, score, staticFields, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{content=$content, metadata=$metadata, rerankScore=$rerankScore, score=$score, staticFields=$staticFields, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrievalRetrieveResponse &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(results, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RetrievalRetrieveResponse{results=$results, additionalProperties=$additionalProperties}"
}
