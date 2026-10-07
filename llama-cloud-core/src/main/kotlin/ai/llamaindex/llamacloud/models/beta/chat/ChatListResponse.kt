// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.chat

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

/** Summary of a chat session, including its title and last run metadata. */
class ChatListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lastUpdatedAt: JsonField<String>,
    private val sessionId: JsonField<String>,
    private val sharedAccess: JsonField<SharedAccess>,
    private val generatedTitle: JsonField<String>,
    private val indexIds: JsonField<List<String>>,
    private val jobMetadata: JsonField<JobMetadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("last_updated_at")
        @ExcludeMissing
        lastUpdatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shared_access")
        @ExcludeMissing
        sharedAccess: JsonField<SharedAccess> = JsonMissing.of(),
        @JsonProperty("generated_title")
        @ExcludeMissing
        generatedTitle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("index_ids")
        @ExcludeMissing
        indexIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("job_metadata")
        @ExcludeMissing
        jobMetadata: JsonField<JobMetadata> = JsonMissing.of(),
    ) : this(
        lastUpdatedAt,
        sessionId,
        sharedAccess,
        generatedTitle,
        indexIds,
        jobMetadata,
        mutableMapOf(),
    )

    /**
     * ISO-format timestamp showing when the session was last updated.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastUpdatedAt(): String = lastUpdatedAt.getRequired("last_updated_at")

    /**
     * Unique session identifier.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * What this chat's share link grants: read_only (transcript only) or query (viewers may ask new
     * questions).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sharedAccess(): SharedAccess = sharedAccess.getRequired("shared_access")

    /**
     * Auto-generated title derived from the first user message.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generatedTitle(): Optional<String> = generatedTitle.getOptional("generated_title")

    /**
     * Indexes this session is bound to. Null on unbound sessions.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indexIds(): Optional<List<String>> = indexIds.getOptional("index_ids")

    /**
     * Token usage and status from the most recent run. Null if the session has not been run yet.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobMetadata(): Optional<JobMetadata> = jobMetadata.getOptional("job_metadata")

    /**
     * Returns the raw JSON value of [lastUpdatedAt].
     *
     * Unlike [lastUpdatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_updated_at")
    @ExcludeMissing
    fun _lastUpdatedAt(): JsonField<String> = lastUpdatedAt

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [sharedAccess].
     *
     * Unlike [sharedAccess], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shared_access")
    @ExcludeMissing
    fun _sharedAccess(): JsonField<SharedAccess> = sharedAccess

    /**
     * Returns the raw JSON value of [generatedTitle].
     *
     * Unlike [generatedTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("generated_title")
    @ExcludeMissing
    fun _generatedTitle(): JsonField<String> = generatedTitle

    /**
     * Returns the raw JSON value of [indexIds].
     *
     * Unlike [indexIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index_ids") @ExcludeMissing fun _indexIds(): JsonField<List<String>> = indexIds

    /**
     * Returns the raw JSON value of [jobMetadata].
     *
     * Unlike [jobMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_metadata")
    @ExcludeMissing
    fun _jobMetadata(): JsonField<JobMetadata> = jobMetadata

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
         * Returns a mutable builder for constructing an instance of [ChatListResponse].
         *
         * The following fields are required:
         * ```java
         * .lastUpdatedAt()
         * .sessionId()
         * .sharedAccess()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatListResponse]. */
    class Builder internal constructor() {

        private var lastUpdatedAt: JsonField<String>? = null
        private var sessionId: JsonField<String>? = null
        private var sharedAccess: JsonField<SharedAccess>? = null
        private var generatedTitle: JsonField<String> = JsonMissing.of()
        private var indexIds: JsonField<MutableList<String>>? = null
        private var jobMetadata: JsonField<JobMetadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatListResponse: ChatListResponse) = apply {
            lastUpdatedAt = chatListResponse.lastUpdatedAt
            sessionId = chatListResponse.sessionId
            sharedAccess = chatListResponse.sharedAccess
            generatedTitle = chatListResponse.generatedTitle
            indexIds = chatListResponse.indexIds.map { it.toMutableList() }
            jobMetadata = chatListResponse.jobMetadata
            additionalProperties = chatListResponse.additionalProperties.toMutableMap()
        }

        /** ISO-format timestamp showing when the session was last updated. */
        fun lastUpdatedAt(lastUpdatedAt: String) = lastUpdatedAt(JsonField.of(lastUpdatedAt))

        /**
         * Sets [Builder.lastUpdatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastUpdatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastUpdatedAt(lastUpdatedAt: JsonField<String>) = apply {
            this.lastUpdatedAt = lastUpdatedAt
        }

        /** Unique session identifier. */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /**
         * What this chat's share link grants: read_only (transcript only) or query (viewers may ask
         * new questions).
         */
        fun sharedAccess(sharedAccess: SharedAccess) = sharedAccess(JsonField.of(sharedAccess))

        /**
         * Sets [Builder.sharedAccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sharedAccess] with a well-typed [SharedAccess] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sharedAccess(sharedAccess: JsonField<SharedAccess>) = apply {
            this.sharedAccess = sharedAccess
        }

        /** Auto-generated title derived from the first user message. */
        fun generatedTitle(generatedTitle: String?) =
            generatedTitle(JsonField.ofNullable(generatedTitle))

        /** Alias for calling [Builder.generatedTitle] with `generatedTitle.orElse(null)`. */
        fun generatedTitle(generatedTitle: Optional<String>) =
            generatedTitle(generatedTitle.getOrNull())

        /**
         * Sets [Builder.generatedTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generatedTitle] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun generatedTitle(generatedTitle: JsonField<String>) = apply {
            this.generatedTitle = generatedTitle
        }

        /** Indexes this session is bound to. Null on unbound sessions. */
        fun indexIds(indexIds: List<String>?) = indexIds(JsonField.ofNullable(indexIds))

        /** Alias for calling [Builder.indexIds] with `indexIds.orElse(null)`. */
        fun indexIds(indexIds: Optional<List<String>>) = indexIds(indexIds.getOrNull())

        /**
         * Sets [Builder.indexIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indexIds(indexIds: JsonField<List<String>>) = apply {
            this.indexIds = indexIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [indexIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndexId(indexId: String) = apply {
            indexIds =
                (indexIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("indexIds", it).add(indexId)
                }
        }

        /**
         * Token usage and status from the most recent run. Null if the session has not been run
         * yet.
         */
        fun jobMetadata(jobMetadata: JobMetadata?) = jobMetadata(JsonField.ofNullable(jobMetadata))

        /** Alias for calling [Builder.jobMetadata] with `jobMetadata.orElse(null)`. */
        fun jobMetadata(jobMetadata: Optional<JobMetadata>) = jobMetadata(jobMetadata.getOrNull())

        /**
         * Sets [Builder.jobMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobMetadata] with a well-typed [JobMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jobMetadata(jobMetadata: JsonField<JobMetadata>) = apply {
            this.jobMetadata = jobMetadata
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
         * Returns an immutable instance of [ChatListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lastUpdatedAt()
         * .sessionId()
         * .sharedAccess()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatListResponse =
            ChatListResponse(
                checkRequired("lastUpdatedAt", lastUpdatedAt),
                checkRequired("sessionId", sessionId),
                checkRequired("sharedAccess", sharedAccess),
                generatedTitle,
                (indexIds ?: JsonMissing.of()).map { it.toImmutable() },
                jobMetadata,
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
    fun validate(): ChatListResponse = apply {
        if (validated) {
            return@apply
        }

        lastUpdatedAt()
        sessionId()
        sharedAccess().validate()
        generatedTitle()
        indexIds()
        jobMetadata().ifPresent { it.validate() }
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
        (if (lastUpdatedAt.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (sharedAccess.asKnown().getOrNull()?.validity() ?: 0) +
            (if (generatedTitle.asKnown().isPresent) 1 else 0) +
            (indexIds.asKnown().getOrNull()?.size ?: 0) +
            (jobMetadata.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * What this chat's share link grants: read_only (transcript only) or query (viewers may ask new
     * questions).
     */
    class SharedAccess @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val QUERY = of("query")

            @JvmField val READ_ONLY = of("read_only")

            @JvmStatic fun of(value: String) = SharedAccess(JsonField.of(value))
        }

        /** An enum containing [SharedAccess]'s known values. */
        enum class Known {
            QUERY,
            READ_ONLY,
        }

        /**
         * An enum containing [SharedAccess]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SharedAccess] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUERY,
            READ_ONLY,
            /**
             * An enum member indicating that [SharedAccess] was instantiated with an unknown value.
             */
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
                QUERY -> Value.QUERY
                READ_ONLY -> Value.READ_ONLY
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
                QUERY -> Known.QUERY
                READ_ONLY -> Known.READ_ONLY
                else -> throw LlamaCloudInvalidDataException("Unknown SharedAccess: $value")
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
        fun validate(): SharedAccess = apply {
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

            return other is SharedAccess && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Token usage and status from the most recent run. Null if the session has not been run yet.
     */
    class JobMetadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val durationMs: JsonField<Double>,
        private val error: JsonField<String>,
        private val exportConfigIds: JsonField<List<String>>,
        private val isError: JsonField<Boolean>,
        private val totalInputTokens: JsonField<Long>,
        private val totalOutputTokens: JsonField<Long>,
        private val turns: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("duration_ms")
            @ExcludeMissing
            durationMs: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("export_config_ids")
            @ExcludeMissing
            exportConfigIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("is_error")
            @ExcludeMissing
            isError: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("total_input_tokens")
            @ExcludeMissing
            totalInputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_output_tokens")
            @ExcludeMissing
            totalOutputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("turns") @ExcludeMissing turns: JsonField<Long> = JsonMissing.of(),
        ) : this(
            durationMs,
            error,
            exportConfigIds,
            isError,
            totalInputTokens,
            totalOutputTokens,
            turns,
            mutableMapOf(),
        )

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun durationMs(): Optional<Double> = durationMs.getOptional("duration_ms")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exportConfigIds(): Optional<List<String>> =
            exportConfigIds.getOptional("export_config_ids")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isError(): Optional<Boolean> = isError.getOptional("is_error")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalInputTokens(): Optional<Long> = totalInputTokens.getOptional("total_input_tokens")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalOutputTokens(): Optional<Long> =
            totalOutputTokens.getOptional("total_output_tokens")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun turns(): Optional<Long> = turns.getOptional("turns")

        /**
         * Returns the raw JSON value of [durationMs].
         *
         * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration_ms")
        @ExcludeMissing
        fun _durationMs(): JsonField<Double> = durationMs

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [exportConfigIds].
         *
         * Unlike [exportConfigIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("export_config_ids")
        @ExcludeMissing
        fun _exportConfigIds(): JsonField<List<String>> = exportConfigIds

        /**
         * Returns the raw JSON value of [isError].
         *
         * Unlike [isError], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_error") @ExcludeMissing fun _isError(): JsonField<Boolean> = isError

        /**
         * Returns the raw JSON value of [totalInputTokens].
         *
         * Unlike [totalInputTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_input_tokens")
        @ExcludeMissing
        fun _totalInputTokens(): JsonField<Long> = totalInputTokens

        /**
         * Returns the raw JSON value of [totalOutputTokens].
         *
         * Unlike [totalOutputTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_output_tokens")
        @ExcludeMissing
        fun _totalOutputTokens(): JsonField<Long> = totalOutputTokens

        /**
         * Returns the raw JSON value of [turns].
         *
         * Unlike [turns], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("turns") @ExcludeMissing fun _turns(): JsonField<Long> = turns

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

            /** Returns a mutable builder for constructing an instance of [JobMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [JobMetadata]. */
        class Builder internal constructor() {

            private var durationMs: JsonField<Double> = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var exportConfigIds: JsonField<MutableList<String>>? = null
            private var isError: JsonField<Boolean> = JsonMissing.of()
            private var totalInputTokens: JsonField<Long> = JsonMissing.of()
            private var totalOutputTokens: JsonField<Long> = JsonMissing.of()
            private var turns: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(jobMetadata: JobMetadata) = apply {
                durationMs = jobMetadata.durationMs
                error = jobMetadata.error
                exportConfigIds = jobMetadata.exportConfigIds.map { it.toMutableList() }
                isError = jobMetadata.isError
                totalInputTokens = jobMetadata.totalInputTokens
                totalOutputTokens = jobMetadata.totalOutputTokens
                turns = jobMetadata.turns
                additionalProperties = jobMetadata.additionalProperties.toMutableMap()
            }

            fun durationMs(durationMs: Double) = durationMs(JsonField.of(durationMs))

            /**
             * Sets [Builder.durationMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationMs] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationMs(durationMs: JsonField<Double>) = apply { this.durationMs = durationMs }

            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            fun exportConfigIds(exportConfigIds: List<String>?) =
                exportConfigIds(JsonField.ofNullable(exportConfigIds))

            /** Alias for calling [Builder.exportConfigIds] with `exportConfigIds.orElse(null)`. */
            fun exportConfigIds(exportConfigIds: Optional<List<String>>) =
                exportConfigIds(exportConfigIds.getOrNull())

            /**
             * Sets [Builder.exportConfigIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exportConfigIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun exportConfigIds(exportConfigIds: JsonField<List<String>>) = apply {
                this.exportConfigIds = exportConfigIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [exportConfigIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExportConfigId(exportConfigId: String) = apply {
                exportConfigIds =
                    (exportConfigIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("exportConfigIds", it).add(exportConfigId)
                    }
            }

            fun isError(isError: Boolean) = isError(JsonField.of(isError))

            /**
             * Sets [Builder.isError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isError] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isError(isError: JsonField<Boolean>) = apply { this.isError = isError }

            fun totalInputTokens(totalInputTokens: Long?) =
                totalInputTokens(JsonField.ofNullable(totalInputTokens))

            /**
             * Alias for [Builder.totalInputTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalInputTokens(totalInputTokens: Long) =
                totalInputTokens(totalInputTokens as Long?)

            /**
             * Alias for calling [Builder.totalInputTokens] with `totalInputTokens.orElse(null)`.
             */
            fun totalInputTokens(totalInputTokens: Optional<Long>) =
                totalInputTokens(totalInputTokens.getOrNull())

            /**
             * Sets [Builder.totalInputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalInputTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalInputTokens(totalInputTokens: JsonField<Long>) = apply {
                this.totalInputTokens = totalInputTokens
            }

            fun totalOutputTokens(totalOutputTokens: Long?) =
                totalOutputTokens(JsonField.ofNullable(totalOutputTokens))

            /**
             * Alias for [Builder.totalOutputTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalOutputTokens(totalOutputTokens: Long) =
                totalOutputTokens(totalOutputTokens as Long?)

            /**
             * Alias for calling [Builder.totalOutputTokens] with `totalOutputTokens.orElse(null)`.
             */
            fun totalOutputTokens(totalOutputTokens: Optional<Long>) =
                totalOutputTokens(totalOutputTokens.getOrNull())

            /**
             * Sets [Builder.totalOutputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalOutputTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalOutputTokens(totalOutputTokens: JsonField<Long>) = apply {
                this.totalOutputTokens = totalOutputTokens
            }

            fun turns(turns: Long) = turns(JsonField.of(turns))

            /**
             * Sets [Builder.turns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.turns] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun turns(turns: JsonField<Long>) = apply { this.turns = turns }

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
             * Returns an immutable instance of [JobMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): JobMetadata =
                JobMetadata(
                    durationMs,
                    error,
                    (exportConfigIds ?: JsonMissing.of()).map { it.toImmutable() },
                    isError,
                    totalInputTokens,
                    totalOutputTokens,
                    turns,
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
        fun validate(): JobMetadata = apply {
            if (validated) {
                return@apply
            }

            durationMs()
            error()
            exportConfigIds()
            isError()
            totalInputTokens()
            totalOutputTokens()
            turns()
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
            (if (durationMs.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (exportConfigIds.asKnown().getOrNull()?.size ?: 0) +
                (if (isError.asKnown().isPresent) 1 else 0) +
                (if (totalInputTokens.asKnown().isPresent) 1 else 0) +
                (if (totalOutputTokens.asKnown().isPresent) 1 else 0) +
                (if (turns.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is JobMetadata &&
                durationMs == other.durationMs &&
                error == other.error &&
                exportConfigIds == other.exportConfigIds &&
                isError == other.isError &&
                totalInputTokens == other.totalInputTokens &&
                totalOutputTokens == other.totalOutputTokens &&
                turns == other.turns &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                durationMs,
                error,
                exportConfigIds,
                isError,
                totalInputTokens,
                totalOutputTokens,
                turns,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "JobMetadata{durationMs=$durationMs, error=$error, exportConfigIds=$exportConfigIds, isError=$isError, totalInputTokens=$totalInputTokens, totalOutputTokens=$totalOutputTokens, turns=$turns, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatListResponse &&
            lastUpdatedAt == other.lastUpdatedAt &&
            sessionId == other.sessionId &&
            sharedAccess == other.sharedAccess &&
            generatedTitle == other.generatedTitle &&
            indexIds == other.indexIds &&
            jobMetadata == other.jobMetadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            lastUpdatedAt,
            sessionId,
            sharedAccess,
            generatedTitle,
            indexIds,
            jobMetadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatListResponse{lastUpdatedAt=$lastUpdatedAt, sessionId=$sessionId, sharedAccess=$sharedAccess, generatedTitle=$generatedTitle, indexIds=$indexIds, jobMetadata=$jobMetadata, additionalProperties=$additionalProperties}"
}
