// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AutoTransformConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chunkOverlap: JsonField<Long>,
    private val chunkSize: JsonField<Long>,
    private val mode: JsonField<Mode>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chunk_overlap")
        @ExcludeMissing
        chunkOverlap: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("chunk_size") @ExcludeMissing chunkSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
    ) : this(chunkOverlap, chunkSize, mode, mutableMapOf())

    /**
     * Chunk overlap for the transformation.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chunkOverlap(): Optional<Long> = chunkOverlap.getOptional("chunk_overlap")

    /**
     * Chunk size for the transformation.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chunkSize(): Optional<Long> = chunkSize.getOptional("chunk_size")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = mode.getOptional("mode")

    /**
     * Returns the raw JSON value of [chunkOverlap].
     *
     * Unlike [chunkOverlap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunk_overlap")
    @ExcludeMissing
    fun _chunkOverlap(): JsonField<Long> = chunkOverlap

    /**
     * Returns the raw JSON value of [chunkSize].
     *
     * Unlike [chunkSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunk_size") @ExcludeMissing fun _chunkSize(): JsonField<Long> = chunkSize

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

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

        /** Returns a mutable builder for constructing an instance of [AutoTransformConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AutoTransformConfig]. */
    class Builder internal constructor() {

        private var chunkOverlap: JsonField<Long> = JsonMissing.of()
        private var chunkSize: JsonField<Long> = JsonMissing.of()
        private var mode: JsonField<Mode> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(autoTransformConfig: AutoTransformConfig) = apply {
            chunkOverlap = autoTransformConfig.chunkOverlap
            chunkSize = autoTransformConfig.chunkSize
            mode = autoTransformConfig.mode
            additionalProperties = autoTransformConfig.additionalProperties.toMutableMap()
        }

        /** Chunk overlap for the transformation. */
        fun chunkOverlap(chunkOverlap: Long) = chunkOverlap(JsonField.of(chunkOverlap))

        /**
         * Sets [Builder.chunkOverlap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkOverlap] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chunkOverlap(chunkOverlap: JsonField<Long>) = apply { this.chunkOverlap = chunkOverlap }

        /** Chunk size for the transformation. */
        fun chunkSize(chunkSize: Long) = chunkSize(JsonField.of(chunkSize))

        /**
         * Sets [Builder.chunkSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chunkSize(chunkSize: JsonField<Long>) = apply { this.chunkSize = chunkSize }

        fun mode(mode: Mode) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

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
         * Returns an immutable instance of [AutoTransformConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AutoTransformConfig =
            AutoTransformConfig(chunkOverlap, chunkSize, mode, additionalProperties.toMutableMap())
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
    fun validate(): AutoTransformConfig = apply {
        if (validated) {
            return@apply
        }

        chunkOverlap()
        chunkSize()
        mode().ifPresent { it.validate() }
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
        (if (chunkOverlap.asKnown().isPresent) 1 else 0) +
            (if (chunkSize.asKnown().isPresent) 1 else 0) +
            (mode.asKnown().getOrNull()?.validity() ?: 0)

    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AUTO = of("auto")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            AUTO
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                AUTO -> Value.AUTO
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
                AUTO -> Known.AUTO
                else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
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
        fun validate(): Mode = apply {
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AutoTransformConfig &&
            chunkOverlap == other.chunkOverlap &&
            chunkSize == other.chunkSize &&
            mode == other.mode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chunkOverlap, chunkSize, mode, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutoTransformConfig{chunkOverlap=$chunkOverlap, chunkSize=$chunkSize, mode=$mode, additionalProperties=$additionalProperties}"
}
