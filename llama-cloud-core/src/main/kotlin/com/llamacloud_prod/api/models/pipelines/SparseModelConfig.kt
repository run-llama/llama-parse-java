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

/**
 * Configuration for sparse embedding models used in hybrid search.
 *
 * This allows users to choose between Splade and BM25 models for sparse retrieval in managed data
 * sinks.
 */
class SparseModelConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val className: JsonField<String>,
    private val modelType: JsonField<ModelType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model_type")
        @ExcludeMissing
        modelType: JsonField<ModelType> = JsonMissing.of(),
    ) : this(className, modelType, mutableMapOf())

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The sparse model type to use. 'bm25' uses Qdrant's FastEmbed BM25 model (default for new
     * pipelines), 'splade' uses HuggingFace Splade model, 'auto' selects based on deployment mode
     * (BYOC uses term frequency, Cloud uses Splade).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelType(): Optional<ModelType> = modelType.getOptional("model_type")

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [modelType].
     *
     * Unlike [modelType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonField<ModelType> = modelType

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

        /** Returns a mutable builder for constructing an instance of [SparseModelConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SparseModelConfig]. */
    class Builder internal constructor() {

        private var className: JsonField<String> = JsonMissing.of()
        private var modelType: JsonField<ModelType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sparseModelConfig: SparseModelConfig) = apply {
            className = sparseModelConfig.className
            modelType = sparseModelConfig.modelType
            additionalProperties = sparseModelConfig.additionalProperties.toMutableMap()
        }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /**
         * The sparse model type to use. 'bm25' uses Qdrant's FastEmbed BM25 model (default for new
         * pipelines), 'splade' uses HuggingFace Splade model, 'auto' selects based on deployment
         * mode (BYOC uses term frequency, Cloud uses Splade).
         */
        fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

        /**
         * Sets [Builder.modelType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelType] with a well-typed [ModelType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

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
         * Returns an immutable instance of [SparseModelConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SparseModelConfig =
            SparseModelConfig(className, modelType, additionalProperties.toMutableMap())
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
    fun validate(): SparseModelConfig = apply {
        if (validated) {
            return@apply
        }

        className()
        modelType().ifPresent { it.validate() }
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
        (if (className.asKnown().isPresent) 1 else 0) +
            (modelType.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The sparse model type to use. 'bm25' uses Qdrant's FastEmbed BM25 model (default for new
     * pipelines), 'splade' uses HuggingFace Splade model, 'auto' selects based on deployment mode
     * (BYOC uses term frequency, Cloud uses Splade).
     */
    class ModelType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BM25 = of("bm25")

            @JvmField val SPLADE = of("splade")

            @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
        }

        /** An enum containing [ModelType]'s known values. */
        enum class Known {
            AUTO,
            BM25,
            SPLADE,
        }

        /**
         * An enum containing [ModelType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ModelType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            BM25,
            SPLADE,
            /**
             * An enum member indicating that [ModelType] was instantiated with an unknown value.
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
                AUTO -> Value.AUTO
                BM25 -> Value.BM25
                SPLADE -> Value.SPLADE
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
                BM25 -> Known.BM25
                SPLADE -> Known.SPLADE
                else -> throw LlamaCloudInvalidDataException("Unknown ModelType: $value")
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
        fun validate(): ModelType = apply {
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

            return other is ModelType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SparseModelConfig &&
            className == other.className &&
            modelType == other.modelType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(className, modelType, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SparseModelConfig{className=$className, modelType=$modelType, additionalProperties=$additionalProperties}"
}
