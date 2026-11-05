// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.BaseDeserializer
import ai.llamaindex.llamacloud.core.BaseSerializer
import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.allMaxBy
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.getOrThrow
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** One entry in a review's history. */
class ExtractReviewEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val actorId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val kind: JsonField<Kind>,
    private val detail: JsonField<Detail>,
    private val path: JsonField<String>,
    private val valueAfter: JsonValue,
    private val valueBefore: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actor_id") @ExcludeMissing actorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("kind") @ExcludeMissing kind: JsonField<Kind> = JsonMissing.of(),
        @JsonProperty("detail") @ExcludeMissing detail: JsonField<Detail> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value_after") @ExcludeMissing valueAfter: JsonValue = JsonMissing.of(),
        @JsonProperty("value_before") @ExcludeMissing valueBefore: JsonValue = JsonMissing.of(),
    ) : this(id, actorId, createdAt, kind, detail, path, valueAfter, valueBefore, mutableMapOf())

    /**
     * Unique identifier of the entry.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * ID of the user who acted.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actorId(): String = actorId.getRequired("actor_id")

    /**
     * When it happened.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * What happened.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kind(): Kind = kind.getRequired("kind")

    /**
     * The settings for `created`, the reason for `rejected`, and the fields for `flags_signed_off`;
     * null for the rest.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detail(): Optional<Detail> = detail.getOptional("detail")

    /**
     * JSON Pointer of the field it changed.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun path(): Optional<String> = path.getOptional("path")

    /**
     * The field's value after the change.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = extractReviewEvent.valueAfter().convert(MyClass.class);
     * ```
     */
    @JsonProperty("value_after") @ExcludeMissing fun _valueAfter(): JsonValue = valueAfter

    /**
     * The field's value before the change.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = extractReviewEvent.valueBefore().convert(MyClass.class);
     * ```
     */
    @JsonProperty("value_before") @ExcludeMissing fun _valueBefore(): JsonValue = valueBefore

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [actorId].
     *
     * Unlike [actorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actor_id") @ExcludeMissing fun _actorId(): JsonField<String> = actorId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [kind].
     *
     * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

    /**
     * Returns the raw JSON value of [detail].
     *
     * Unlike [detail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detail") @ExcludeMissing fun _detail(): JsonField<Detail> = detail

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

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
         * Returns a mutable builder for constructing an instance of [ExtractReviewEvent].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actorId()
         * .createdAt()
         * .kind()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractReviewEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var actorId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var kind: JsonField<Kind>? = null
        private var detail: JsonField<Detail> = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var valueAfter: JsonValue = JsonMissing.of()
        private var valueBefore: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractReviewEvent: ExtractReviewEvent) = apply {
            id = extractReviewEvent.id
            actorId = extractReviewEvent.actorId
            createdAt = extractReviewEvent.createdAt
            kind = extractReviewEvent.kind
            detail = extractReviewEvent.detail
            path = extractReviewEvent.path
            valueAfter = extractReviewEvent.valueAfter
            valueBefore = extractReviewEvent.valueBefore
            additionalProperties = extractReviewEvent.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the entry. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ID of the user who acted. */
        fun actorId(actorId: String) = actorId(JsonField.of(actorId))

        /**
         * Sets [Builder.actorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actorId(actorId: JsonField<String>) = apply { this.actorId = actorId }

        /** When it happened. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** What happened. */
        fun kind(kind: Kind) = kind(JsonField.of(kind))

        /**
         * Sets [Builder.kind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kind] with a well-typed [Kind] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

        /**
         * The settings for `created`, the reason for `rejected`, and the fields for
         * `flags_signed_off`; null for the rest.
         */
        fun detail(detail: Detail?) = detail(JsonField.ofNullable(detail))

        /** Alias for calling [Builder.detail] with `detail.orElse(null)`. */
        fun detail(detail: Optional<Detail>) = detail(detail.getOrNull())

        /**
         * Sets [Builder.detail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detail] with a well-typed [Detail] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun detail(detail: JsonField<Detail>) = apply { this.detail = detail }

        /**
         * Alias for calling [detail] with `Detail.ofExtractReviewCreated(extractReviewCreated)`.
         */
        fun detail(extractReviewCreated: Detail.ExtractReviewCreatedDetail) =
            detail(Detail.ofExtractReviewCreated(extractReviewCreated))

        /**
         * Alias for calling [detail] with `Detail.ofExtractReviewRejected(extractReviewRejected)`.
         */
        fun detail(extractReviewRejected: Detail.ExtractReviewRejectedDetail) =
            detail(Detail.ofExtractReviewRejected(extractReviewRejected))

        /**
         * Alias for calling [detail] with
         * `Detail.ofExtractReviewSignedOff(extractReviewSignedOff)`.
         */
        fun detail(extractReviewSignedOff: Detail.ExtractReviewSignedOffDetail) =
            detail(Detail.ofExtractReviewSignedOff(extractReviewSignedOff))

        /** JSON Pointer of the field it changed. */
        fun path(path: String?) = path(JsonField.ofNullable(path))

        /** Alias for calling [Builder.path] with `path.orElse(null)`. */
        fun path(path: Optional<String>) = path(path.getOrNull())

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        /** The field's value after the change. */
        fun valueAfter(valueAfter: JsonValue) = apply { this.valueAfter = valueAfter }

        /** The field's value before the change. */
        fun valueBefore(valueBefore: JsonValue) = apply { this.valueBefore = valueBefore }

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
         * Returns an immutable instance of [ExtractReviewEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actorId()
         * .createdAt()
         * .kind()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExtractReviewEvent =
            ExtractReviewEvent(
                checkRequired("id", id),
                checkRequired("actorId", actorId),
                checkRequired("createdAt", createdAt),
                checkRequired("kind", kind),
                detail,
                path,
                valueAfter,
                valueBefore,
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
    fun validate(): ExtractReviewEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        actorId()
        createdAt()
        kind().validate()
        detail().ifPresent { it.validate() }
        path()
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
            (if (actorId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (kind.asKnown().getOrNull()?.validity() ?: 0) +
            (detail.asKnown().getOrNull()?.validity() ?: 0) +
            (if (path.asKnown().isPresent) 1 else 0)

    /** What happened. */
    class Kind @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val APPROVED = of("approved")

            @JvmField val CREATED = of("created")

            @JvmField val FIELD_CLEARED = of("field_cleared")

            @JvmField val FIELD_CONFIRMED = of("field_confirmed")

            @JvmField val FIELD_CORRECTED = of("field_corrected")

            @JvmField val FIELD_RESTORED = of("field_restored")

            @JvmField val FIELD_UNDONE = of("field_undone")

            @JvmField val FLAGS_SIGNED_OFF = of("flags_signed_off")

            @JvmField val REJECTED = of("rejected")

            @JvmField val REOPENED = of("reopened")

            @JvmStatic fun of(value: String) = Kind(JsonField.of(value))
        }

        /** An enum containing [Kind]'s known values. */
        enum class Known {
            APPROVED,
            CREATED,
            FIELD_CLEARED,
            FIELD_CONFIRMED,
            FIELD_CORRECTED,
            FIELD_RESTORED,
            FIELD_UNDONE,
            FLAGS_SIGNED_OFF,
            REJECTED,
            REOPENED,
        }

        /**
         * An enum containing [Kind]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Kind] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            CREATED,
            FIELD_CLEARED,
            FIELD_CONFIRMED,
            FIELD_CORRECTED,
            FIELD_RESTORED,
            FIELD_UNDONE,
            FLAGS_SIGNED_OFF,
            REJECTED,
            REOPENED,
            /** An enum member indicating that [Kind] was instantiated with an unknown value. */
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
                APPROVED -> Value.APPROVED
                CREATED -> Value.CREATED
                FIELD_CLEARED -> Value.FIELD_CLEARED
                FIELD_CONFIRMED -> Value.FIELD_CONFIRMED
                FIELD_CORRECTED -> Value.FIELD_CORRECTED
                FIELD_RESTORED -> Value.FIELD_RESTORED
                FIELD_UNDONE -> Value.FIELD_UNDONE
                FLAGS_SIGNED_OFF -> Value.FLAGS_SIGNED_OFF
                REJECTED -> Value.REJECTED
                REOPENED -> Value.REOPENED
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
                APPROVED -> Known.APPROVED
                CREATED -> Known.CREATED
                FIELD_CLEARED -> Known.FIELD_CLEARED
                FIELD_CONFIRMED -> Known.FIELD_CONFIRMED
                FIELD_CORRECTED -> Known.FIELD_CORRECTED
                FIELD_RESTORED -> Known.FIELD_RESTORED
                FIELD_UNDONE -> Known.FIELD_UNDONE
                FLAGS_SIGNED_OFF -> Known.FLAGS_SIGNED_OFF
                REJECTED -> Known.REJECTED
                REOPENED -> Known.REOPENED
                else -> throw LlamaCloudInvalidDataException("Unknown Kind: $value")
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
        fun validate(): Kind = apply {
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

            return other is Kind && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The settings for `created`, the reason for `rejected`, and the fields for `flags_signed_off`;
     * null for the rest.
     */
    @JsonDeserialize(using = Detail.Deserializer::class)
    @JsonSerialize(using = Detail.Serializer::class)
    class Detail
    private constructor(
        private val extractReviewCreated: ExtractReviewCreatedDetail? = null,
        private val extractReviewRejected: ExtractReviewRejectedDetail? = null,
        private val extractReviewSignedOff: ExtractReviewSignedOffDetail? = null,
        private val _json: JsonValue? = null,
    ) {

        /** What a `created` entry records: where review was turned on, and its settings. */
        fun extractReviewCreated(): Optional<ExtractReviewCreatedDetail> =
            Optional.ofNullable(extractReviewCreated)

        /** What a `rejected` entry records. */
        fun extractReviewRejected(): Optional<ExtractReviewRejectedDetail> =
            Optional.ofNullable(extractReviewRejected)

        /** What a `flags_signed_off` entry records. */
        fun extractReviewSignedOff(): Optional<ExtractReviewSignedOffDetail> =
            Optional.ofNullable(extractReviewSignedOff)

        fun isExtractReviewCreated(): Boolean = extractReviewCreated != null

        fun isExtractReviewRejected(): Boolean = extractReviewRejected != null

        fun isExtractReviewSignedOff(): Boolean = extractReviewSignedOff != null

        /** What a `created` entry records: where review was turned on, and its settings. */
        fun asExtractReviewCreated(): ExtractReviewCreatedDetail =
            extractReviewCreated.getOrThrow("extractReviewCreated")

        /** What a `rejected` entry records. */
        fun asExtractReviewRejected(): ExtractReviewRejectedDetail =
            extractReviewRejected.getOrThrow("extractReviewRejected")

        /** What a `flags_signed_off` entry records. */
        fun asExtractReviewSignedOff(): ExtractReviewSignedOffDetail =
            extractReviewSignedOff.getOrThrow("extractReviewSignedOff")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import ai.llamaindex.llamacloud.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = detail.accept(new Detail.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitExtractReviewCreated(ExtractReviewCreatedDetail extractReviewCreated) {
         *         return Optional.of(extractReviewCreated.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                extractReviewCreated != null ->
                    visitor.visitExtractReviewCreated(extractReviewCreated)
                extractReviewRejected != null ->
                    visitor.visitExtractReviewRejected(extractReviewRejected)
                extractReviewSignedOff != null ->
                    visitor.visitExtractReviewSignedOff(extractReviewSignedOff)
                else -> visitor.unknown(_json)
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
        fun validate(): Detail = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitExtractReviewCreated(
                        extractReviewCreated: ExtractReviewCreatedDetail
                    ) {
                        extractReviewCreated.validate()
                    }

                    override fun visitExtractReviewRejected(
                        extractReviewRejected: ExtractReviewRejectedDetail
                    ) {
                        extractReviewRejected.validate()
                    }

                    override fun visitExtractReviewSignedOff(
                        extractReviewSignedOff: ExtractReviewSignedOffDetail
                    ) {
                        extractReviewSignedOff.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitExtractReviewCreated(
                        extractReviewCreated: ExtractReviewCreatedDetail
                    ) = extractReviewCreated.validity()

                    override fun visitExtractReviewRejected(
                        extractReviewRejected: ExtractReviewRejectedDetail
                    ) = extractReviewRejected.validity()

                    override fun visitExtractReviewSignedOff(
                        extractReviewSignedOff: ExtractReviewSignedOffDetail
                    ) = extractReviewSignedOff.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Detail &&
                extractReviewCreated == other.extractReviewCreated &&
                extractReviewRejected == other.extractReviewRejected &&
                extractReviewSignedOff == other.extractReviewSignedOff
        }

        override fun hashCode(): Int =
            Objects.hash(extractReviewCreated, extractReviewRejected, extractReviewSignedOff)

        override fun toString(): String =
            when {
                extractReviewCreated != null -> "Detail{extractReviewCreated=$extractReviewCreated}"
                extractReviewRejected != null ->
                    "Detail{extractReviewRejected=$extractReviewRejected}"
                extractReviewSignedOff != null ->
                    "Detail{extractReviewSignedOff=$extractReviewSignedOff}"
                _json != null -> "Detail{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Detail")
            }

        companion object {

            /** What a `created` entry records: where review was turned on, and its settings. */
            @JvmStatic
            fun ofExtractReviewCreated(extractReviewCreated: ExtractReviewCreatedDetail) =
                Detail(extractReviewCreated = extractReviewCreated)

            /** What a `rejected` entry records. */
            @JvmStatic
            fun ofExtractReviewRejected(extractReviewRejected: ExtractReviewRejectedDetail) =
                Detail(extractReviewRejected = extractReviewRejected)

            /** What a `flags_signed_off` entry records. */
            @JvmStatic
            fun ofExtractReviewSignedOff(extractReviewSignedOff: ExtractReviewSignedOffDetail) =
                Detail(extractReviewSignedOff = extractReviewSignedOff)
        }

        /** An interface that defines how to map each variant of [Detail] to a value of type [T]. */
        interface Visitor<out T> {

            /** What a `created` entry records: where review was turned on, and its settings. */
            fun visitExtractReviewCreated(extractReviewCreated: ExtractReviewCreatedDetail): T

            /** What a `rejected` entry records. */
            fun visitExtractReviewRejected(extractReviewRejected: ExtractReviewRejectedDetail): T

            /** What a `flags_signed_off` entry records. */
            fun visitExtractReviewSignedOff(extractReviewSignedOff: ExtractReviewSignedOffDetail): T

            /**
             * Maps an unknown variant of [Detail] to a value of type [T].
             *
             * An instance of [Detail] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown Detail: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Detail>(Detail::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Detail {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ExtractReviewCreatedDetail>())
                                ?.let { Detail(extractReviewCreated = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ExtractReviewRejectedDetail>())
                                ?.let { Detail(extractReviewRejected = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ExtractReviewSignedOffDetail>())
                                ?.let { Detail(extractReviewSignedOff = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Detail(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Detail>(Detail::class) {

            override fun serialize(
                value: Detail,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.extractReviewCreated != null ->
                        generator.writeObject(value.extractReviewCreated)
                    value.extractReviewRejected != null ->
                        generator.writeObject(value.extractReviewRejected)
                    value.extractReviewSignedOff != null ->
                        generator.writeObject(value.extractReviewSignedOff)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Detail")
                }
            }
        }

        /** What a `created` entry records: where review was turned on, and its settings. */
        class ExtractReviewCreatedDetail
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val confidenceThreshold: JsonField<Double>,
            private val fieldsInScope: JsonField<List<String>>,
            private val origin: JsonField<Origin>,
            private val requiredFields: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("confidence_threshold")
                @ExcludeMissing
                confidenceThreshold: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fields_in_scope")
                @ExcludeMissing
                fieldsInScope: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("origin")
                @ExcludeMissing
                origin: JsonField<Origin> = JsonMissing.of(),
                @JsonProperty("required_fields")
                @ExcludeMissing
                requiredFields: JsonField<List<String>> = JsonMissing.of(),
            ) : this(confidenceThreshold, fieldsInScope, origin, requiredFields, mutableMapOf())

            /**
             * Fields read below this confidence are flagged.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun confidenceThreshold(): Double =
                confidenceThreshold.getRequired("confidence_threshold")

            /**
             * JSON Pointers of the fields the threshold applies to; empty means all.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fieldsInScope(): List<String> = fieldsInScope.getRequired("fields_in_scope")

            /**
             * Turned on as the job ran, from History, by a first edit, or by the API.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun origin(): Origin = origin.getRequired("origin")

            /**
             * JSON Pointers of fields flagged when empty.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requiredFields(): List<String> = requiredFields.getRequired("required_fields")

            /**
             * Returns the raw JSON value of [confidenceThreshold].
             *
             * Unlike [confidenceThreshold], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("confidence_threshold")
            @ExcludeMissing
            fun _confidenceThreshold(): JsonField<Double> = confidenceThreshold

            /**
             * Returns the raw JSON value of [fieldsInScope].
             *
             * Unlike [fieldsInScope], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fields_in_scope")
            @ExcludeMissing
            fun _fieldsInScope(): JsonField<List<String>> = fieldsInScope

            /**
             * Returns the raw JSON value of [origin].
             *
             * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<Origin> = origin

            /**
             * Returns the raw JSON value of [requiredFields].
             *
             * Unlike [requiredFields], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("required_fields")
            @ExcludeMissing
            fun _requiredFields(): JsonField<List<String>> = requiredFields

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
                 * Returns a mutable builder for constructing an instance of
                 * [ExtractReviewCreatedDetail].
                 *
                 * The following fields are required:
                 * ```java
                 * .confidenceThreshold()
                 * .fieldsInScope()
                 * .origin()
                 * .requiredFields()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ExtractReviewCreatedDetail]. */
            class Builder internal constructor() {

                private var confidenceThreshold: JsonField<Double>? = null
                private var fieldsInScope: JsonField<MutableList<String>>? = null
                private var origin: JsonField<Origin>? = null
                private var requiredFields: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(extractReviewCreatedDetail: ExtractReviewCreatedDetail) = apply {
                    confidenceThreshold = extractReviewCreatedDetail.confidenceThreshold
                    fieldsInScope =
                        extractReviewCreatedDetail.fieldsInScope.map { it.toMutableList() }
                    origin = extractReviewCreatedDetail.origin
                    requiredFields =
                        extractReviewCreatedDetail.requiredFields.map { it.toMutableList() }
                    additionalProperties =
                        extractReviewCreatedDetail.additionalProperties.toMutableMap()
                }

                /** Fields read below this confidence are flagged. */
                fun confidenceThreshold(confidenceThreshold: Double) =
                    confidenceThreshold(JsonField.of(confidenceThreshold))

                /**
                 * Sets [Builder.confidenceThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.confidenceThreshold] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun confidenceThreshold(confidenceThreshold: JsonField<Double>) = apply {
                    this.confidenceThreshold = confidenceThreshold
                }

                /** JSON Pointers of the fields the threshold applies to; empty means all. */
                fun fieldsInScope(fieldsInScope: List<String>) =
                    fieldsInScope(JsonField.of(fieldsInScope))

                /**
                 * Sets [Builder.fieldsInScope] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fieldsInScope] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fieldsInScope(fieldsInScope: JsonField<List<String>>) = apply {
                    this.fieldsInScope = fieldsInScope.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.fieldsInScope].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFieldsInScope(fieldsInScope: String) = apply {
                    this.fieldsInScope =
                        (this.fieldsInScope ?: JsonField.of(mutableListOf())).also {
                            checkKnown("fieldsInScope", it).add(fieldsInScope)
                        }
                }

                /** Turned on as the job ran, from History, by a first edit, or by the API. */
                fun origin(origin: Origin) = origin(JsonField.of(origin))

                /**
                 * Sets [Builder.origin] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.origin] with a well-typed [Origin] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun origin(origin: JsonField<Origin>) = apply { this.origin = origin }

                /** JSON Pointers of fields flagged when empty. */
                fun requiredFields(requiredFields: List<String>) =
                    requiredFields(JsonField.of(requiredFields))

                /**
                 * Sets [Builder.requiredFields] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requiredFields] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun requiredFields(requiredFields: JsonField<List<String>>) = apply {
                    this.requiredFields = requiredFields.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [requiredFields].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRequiredField(requiredField: String) = apply {
                    requiredFields =
                        (requiredFields ?: JsonField.of(mutableListOf())).also {
                            checkKnown("requiredFields", it).add(requiredField)
                        }
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
                 * Returns an immutable instance of [ExtractReviewCreatedDetail].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .confidenceThreshold()
                 * .fieldsInScope()
                 * .origin()
                 * .requiredFields()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ExtractReviewCreatedDetail =
                    ExtractReviewCreatedDetail(
                        checkRequired("confidenceThreshold", confidenceThreshold),
                        checkRequired("fieldsInScope", fieldsInScope).map { it.toImmutable() },
                        checkRequired("origin", origin),
                        checkRequired("requiredFields", requiredFields).map { it.toImmutable() },
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
            fun validate(): ExtractReviewCreatedDetail = apply {
                if (validated) {
                    return@apply
                }

                confidenceThreshold()
                fieldsInScope()
                origin().validate()
                requiredFields()
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
                (if (confidenceThreshold.asKnown().isPresent) 1 else 0) +
                    (fieldsInScope.asKnown().getOrNull()?.size ?: 0) +
                    (origin.asKnown().getOrNull()?.validity() ?: 0) +
                    (requiredFields.asKnown().getOrNull()?.size ?: 0)

            /** Turned on as the job ran, from History, by a first edit, or by the API. */
            class Origin @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val API = of("api")

                    @JvmField val EDIT = of("edit")

                    @JvmField val HISTORY = of("history")

                    @JvmField val RUN = of("run")

                    @JvmStatic fun of(value: String) = Origin(JsonField.of(value))
                }

                /** An enum containing [Origin]'s known values. */
                enum class Known {
                    API,
                    EDIT,
                    HISTORY,
                    RUN,
                }

                /**
                 * An enum containing [Origin]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Origin] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    API,
                    EDIT,
                    HISTORY,
                    RUN,
                    /**
                     * An enum member indicating that [Origin] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        API -> Value.API
                        EDIT -> Value.EDIT
                        HISTORY -> Value.HISTORY
                        RUN -> Value.RUN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        API -> Known.API
                        EDIT -> Known.EDIT
                        HISTORY -> Known.HISTORY
                        RUN -> Known.RUN
                        else -> throw LlamaCloudInvalidDataException("Unknown Origin: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Origin = apply {
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

                    return other is Origin && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExtractReviewCreatedDetail &&
                    confidenceThreshold == other.confidenceThreshold &&
                    fieldsInScope == other.fieldsInScope &&
                    origin == other.origin &&
                    requiredFields == other.requiredFields &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    confidenceThreshold,
                    fieldsInScope,
                    origin,
                    requiredFields,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExtractReviewCreatedDetail{confidenceThreshold=$confidenceThreshold, fieldsInScope=$fieldsInScope, origin=$origin, requiredFields=$requiredFields, additionalProperties=$additionalProperties}"
        }

        /** What a `rejected` entry records. */
        class ExtractReviewRejectedDetail
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of()
            ) : this(reason, mutableMapOf())

            /**
             * Why the result was rejected.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): String = reason.getRequired("reason")

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * Returns a mutable builder for constructing an instance of
                 * [ExtractReviewRejectedDetail].
                 *
                 * The following fields are required:
                 * ```java
                 * .reason()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ExtractReviewRejectedDetail]. */
            class Builder internal constructor() {

                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(extractReviewRejectedDetail: ExtractReviewRejectedDetail) =
                    apply {
                        reason = extractReviewRejectedDetail.reason
                        additionalProperties =
                            extractReviewRejectedDetail.additionalProperties.toMutableMap()
                    }

                /** Why the result was rejected. */
                fun reason(reason: String) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [ExtractReviewRejectedDetail].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ExtractReviewRejectedDetail =
                    ExtractReviewRejectedDetail(
                        checkRequired("reason", reason),
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
            fun validate(): ExtractReviewRejectedDetail = apply {
                if (validated) {
                    return@apply
                }

                reason()
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
            @JvmSynthetic internal fun validity(): Int = (if (reason.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExtractReviewRejectedDetail &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExtractReviewRejectedDetail{reason=$reason, additionalProperties=$additionalProperties}"
        }

        /** What a `flags_signed_off` entry records. */
        class ExtractReviewSignedOffDetail
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val paths: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("paths")
                @ExcludeMissing
                paths: JsonField<List<String>> = JsonMissing.of()
            ) : this(paths, mutableMapOf())

            /**
             * JSON Pointers of the flagged fields confirmed as part of approving.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paths(): List<String> = paths.getRequired("paths")

            /**
             * Returns the raw JSON value of [paths].
             *
             * Unlike [paths], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("paths") @ExcludeMissing fun _paths(): JsonField<List<String>> = paths

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
                 * Returns a mutable builder for constructing an instance of
                 * [ExtractReviewSignedOffDetail].
                 *
                 * The following fields are required:
                 * ```java
                 * .paths()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ExtractReviewSignedOffDetail]. */
            class Builder internal constructor() {

                private var paths: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(extractReviewSignedOffDetail: ExtractReviewSignedOffDetail) =
                    apply {
                        paths = extractReviewSignedOffDetail.paths.map { it.toMutableList() }
                        additionalProperties =
                            extractReviewSignedOffDetail.additionalProperties.toMutableMap()
                    }

                /** JSON Pointers of the flagged fields confirmed as part of approving. */
                fun paths(paths: List<String>) = paths(JsonField.of(paths))

                /**
                 * Sets [Builder.paths] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paths] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paths(paths: JsonField<List<String>>) = apply {
                    this.paths = paths.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [paths].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPath(path: String) = apply {
                    paths =
                        (paths ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paths", it).add(path)
                        }
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
                 * Returns an immutable instance of [ExtractReviewSignedOffDetail].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .paths()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ExtractReviewSignedOffDetail =
                    ExtractReviewSignedOffDetail(
                        checkRequired("paths", paths).map { it.toImmutable() },
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
            fun validate(): ExtractReviewSignedOffDetail = apply {
                if (validated) {
                    return@apply
                }

                paths()
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
            @JvmSynthetic internal fun validity(): Int = (paths.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExtractReviewSignedOffDetail &&
                    paths == other.paths &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(paths, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExtractReviewSignedOffDetail{paths=$paths, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractReviewEvent &&
            id == other.id &&
            actorId == other.actorId &&
            createdAt == other.createdAt &&
            kind == other.kind &&
            detail == other.detail &&
            path == other.path &&
            valueAfter == other.valueAfter &&
            valueBefore == other.valueBefore &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            actorId,
            createdAt,
            kind,
            detail,
            path,
            valueAfter,
            valueBefore,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractReviewEvent{id=$id, actorId=$actorId, createdAt=$createdAt, kind=$kind, detail=$detail, path=$path, valueAfter=$valueAfter, valueBefore=$valueBefore, additionalProperties=$additionalProperties}"
}
