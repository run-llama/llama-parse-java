// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.chat

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
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

/** Create a chat session, optionally bound to indexes (locked after the first message). */
class ChatCreateParams
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
     * Indexes this session will retrieve from. Once set and the first message has been sent, the
     * source set is locked for the session's lifetime. Leave null to create an unbound session.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indexIds(): Optional<List<String>> = body.indexIds()

    /**
     * What this chat's share link grants: read_only (transcript only) or query (viewers may ask new
     * questions). Null follows the deployment default.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sharedAccess(): Optional<SharedAccess> = body.sharedAccess()

    /**
     * Returns the raw JSON value of [indexIds].
     *
     * Unlike [indexIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _indexIds(): JsonField<List<String>> = body._indexIds()

    /**
     * Returns the raw JSON value of [sharedAccess].
     *
     * Unlike [sharedAccess], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sharedAccess(): JsonField<SharedAccess> = body._sharedAccess()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ChatCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ChatCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatCreateParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(chatCreateParams: ChatCreateParams) = apply {
            organizationId = chatCreateParams.organizationId
            projectId = chatCreateParams.projectId
            body = chatCreateParams.body.toBuilder()
            additionalHeaders = chatCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = chatCreateParams.additionalQueryParams.toBuilder()
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
         * - [indexIds]
         * - [sharedAccess]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Indexes this session will retrieve from. Once set and the first message has been sent,
         * the source set is locked for the session's lifetime. Leave null to create an unbound
         * session.
         */
        fun indexIds(indexIds: List<String>?) = apply { body.indexIds(indexIds) }

        /** Alias for calling [Builder.indexIds] with `indexIds.orElse(null)`. */
        fun indexIds(indexIds: Optional<List<String>>) = indexIds(indexIds.getOrNull())

        /**
         * Sets [Builder.indexIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indexIds(indexIds: JsonField<List<String>>) = apply { body.indexIds(indexIds) }

        /**
         * Adds a single [String] to [indexIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndexId(indexId: String) = apply { body.addIndexId(indexId) }

        /**
         * What this chat's share link grants: read_only (transcript only) or query (viewers may ask
         * new questions). Null follows the deployment default.
         */
        fun sharedAccess(sharedAccess: SharedAccess?) = apply { body.sharedAccess(sharedAccess) }

        /** Alias for calling [Builder.sharedAccess] with `sharedAccess.orElse(null)`. */
        fun sharedAccess(sharedAccess: Optional<SharedAccess>) =
            sharedAccess(sharedAccess.getOrNull())

        /**
         * Sets [Builder.sharedAccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sharedAccess] with a well-typed [SharedAccess] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sharedAccess(sharedAccess: JsonField<SharedAccess>) = apply {
            body.sharedAccess(sharedAccess)
        }

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
         * Returns an immutable instance of [ChatCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChatCreateParams =
            ChatCreateParams(
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

    /** Request body for creating a chat session. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val indexIds: JsonField<List<String>>,
        private val sharedAccess: JsonField<SharedAccess>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("index_ids")
            @ExcludeMissing
            indexIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("shared_access")
            @ExcludeMissing
            sharedAccess: JsonField<SharedAccess> = JsonMissing.of(),
        ) : this(indexIds, sharedAccess, mutableMapOf())

        /**
         * Indexes this session will retrieve from. Once set and the first message has been sent,
         * the source set is locked for the session's lifetime. Leave null to create an unbound
         * session.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun indexIds(): Optional<List<String>> = indexIds.getOptional("index_ids")

        /**
         * What this chat's share link grants: read_only (transcript only) or query (viewers may ask
         * new questions). Null follows the deployment default.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sharedAccess(): Optional<SharedAccess> = sharedAccess.getOptional("shared_access")

        /**
         * Returns the raw JSON value of [indexIds].
         *
         * Unlike [indexIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index_ids")
        @ExcludeMissing
        fun _indexIds(): JsonField<List<String>> = indexIds

        /**
         * Returns the raw JSON value of [sharedAccess].
         *
         * Unlike [sharedAccess], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shared_access")
        @ExcludeMissing
        fun _sharedAccess(): JsonField<SharedAccess> = sharedAccess

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var indexIds: JsonField<MutableList<String>>? = null
            private var sharedAccess: JsonField<SharedAccess> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                indexIds = body.indexIds.map { it.toMutableList() }
                sharedAccess = body.sharedAccess
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Indexes this session will retrieve from. Once set and the first message has been
             * sent, the source set is locked for the session's lifetime. Leave null to create an
             * unbound session.
             */
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
             * What this chat's share link grants: read_only (transcript only) or query (viewers may
             * ask new questions). Null follows the deployment default.
             */
            fun sharedAccess(sharedAccess: SharedAccess?) =
                sharedAccess(JsonField.ofNullable(sharedAccess))

            /** Alias for calling [Builder.sharedAccess] with `sharedAccess.orElse(null)`. */
            fun sharedAccess(sharedAccess: Optional<SharedAccess>) =
                sharedAccess(sharedAccess.getOrNull())

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
             */
            fun build(): Body =
                Body(
                    (indexIds ?: JsonMissing.of()).map { it.toImmutable() },
                    sharedAccess,
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

            indexIds()
            sharedAccess().ifPresent { it.validate() }
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
            (indexIds.asKnown().getOrNull()?.size ?: 0) +
                (sharedAccess.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                indexIds == other.indexIds &&
                sharedAccess == other.sharedAccess &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(indexIds, sharedAccess, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{indexIds=$indexIds, sharedAccess=$sharedAccess, additionalProperties=$additionalProperties}"
    }

    /**
     * What this chat's share link grants: read_only (transcript only) or query (viewers may ask new
     * questions). Null follows the deployment default.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCreateParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ChatCreateParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
