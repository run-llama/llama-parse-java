// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.datasources

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

class DataSourceReaderVersionMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val readerVersion: JsonField<ReaderVersion>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("reader_version")
        @ExcludeMissing
        readerVersion: JsonField<ReaderVersion> = JsonMissing.of()
    ) : this(readerVersion, mutableMapOf())

    /**
     * The version of the reader to use for this data source.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readerVersion(): Optional<ReaderVersion> = readerVersion.getOptional("reader_version")

    /**
     * Returns the raw JSON value of [readerVersion].
     *
     * Unlike [readerVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reader_version")
    @ExcludeMissing
    fun _readerVersion(): JsonField<ReaderVersion> = readerVersion

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
         * [DataSourceReaderVersionMetadata].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataSourceReaderVersionMetadata]. */
    class Builder internal constructor() {

        private var readerVersion: JsonField<ReaderVersion> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataSourceReaderVersionMetadata: DataSourceReaderVersionMetadata) =
            apply {
                readerVersion = dataSourceReaderVersionMetadata.readerVersion
                additionalProperties =
                    dataSourceReaderVersionMetadata.additionalProperties.toMutableMap()
            }

        /** The version of the reader to use for this data source. */
        fun readerVersion(readerVersion: ReaderVersion?) =
            readerVersion(JsonField.ofNullable(readerVersion))

        /** Alias for calling [Builder.readerVersion] with `readerVersion.orElse(null)`. */
        fun readerVersion(readerVersion: Optional<ReaderVersion>) =
            readerVersion(readerVersion.getOrNull())

        /**
         * Sets [Builder.readerVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readerVersion] with a well-typed [ReaderVersion] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readerVersion(readerVersion: JsonField<ReaderVersion>) = apply {
            this.readerVersion = readerVersion
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
         * Returns an immutable instance of [DataSourceReaderVersionMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DataSourceReaderVersionMetadata =
            DataSourceReaderVersionMetadata(readerVersion, additionalProperties.toMutableMap())
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
    fun validate(): DataSourceReaderVersionMetadata = apply {
        if (validated) {
            return@apply
        }

        readerVersion().ifPresent { it.validate() }
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
    internal fun validity(): Int = (readerVersion.asKnown().getOrNull()?.validity() ?: 0)

    /** The version of the reader to use for this data source. */
    class ReaderVersion @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val _1_0 = of("1.0")

            @JvmField val _2_0 = of("2.0")

            @JvmField val _2_1 = of("2.1")

            @JvmStatic fun of(value: String) = ReaderVersion(JsonField.of(value))
        }

        /** An enum containing [ReaderVersion]'s known values. */
        enum class Known {
            _1_0,
            _2_0,
            _2_1,
        }

        /**
         * An enum containing [ReaderVersion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReaderVersion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _1_0,
            _2_0,
            _2_1,
            /**
             * An enum member indicating that [ReaderVersion] was instantiated with an unknown
             * value.
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
                _1_0 -> Value._1_0
                _2_0 -> Value._2_0
                _2_1 -> Value._2_1
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
                _1_0 -> Known._1_0
                _2_0 -> Known._2_0
                _2_1 -> Known._2_1
                else -> throw LlamaCloudInvalidDataException("Unknown ReaderVersion: $value")
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
        fun validate(): ReaderVersion = apply {
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

            return other is ReaderVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataSourceReaderVersionMetadata &&
            readerVersion == other.readerVersion &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(readerVersion, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataSourceReaderVersionMetadata{readerVersion=$readerVersion, additionalProperties=$additionalProperties}"
}
