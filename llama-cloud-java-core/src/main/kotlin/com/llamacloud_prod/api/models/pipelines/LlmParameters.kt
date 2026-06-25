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

class LlmParameters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val className: JsonField<String>,
    private val modelName: JsonField<ModelName>,
    private val systemPrompt: JsonField<String>,
    private val temperature: JsonField<Double>,
    private val useChainOfThoughtReasoning: JsonField<Boolean>,
    private val useCitation: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model_name")
        @ExcludeMissing
        modelName: JsonField<ModelName> = JsonMissing.of(),
        @JsonProperty("system_prompt")
        @ExcludeMissing
        systemPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("temperature")
        @ExcludeMissing
        temperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("use_chain_of_thought_reasoning")
        @ExcludeMissing
        useChainOfThoughtReasoning: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("use_citation")
        @ExcludeMissing
        useCitation: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        className,
        modelName,
        systemPrompt,
        temperature,
        useChainOfThoughtReasoning,
        useCitation,
        mutableMapOf(),
    )

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The name of the model to use for LLM completions.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelName(): Optional<ModelName> = modelName.getOptional("model_name")

    /**
     * The system prompt to use for the completion.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun systemPrompt(): Optional<String> = systemPrompt.getOptional("system_prompt")

    /**
     * The temperature value for the model.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Optional<Double> = temperature.getOptional("temperature")

    /**
     * Whether to use chain of thought reasoning.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useChainOfThoughtReasoning(): Optional<Boolean> =
        useChainOfThoughtReasoning.getOptional("use_chain_of_thought_reasoning")

    /**
     * Whether to show citations in the response.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useCitation(): Optional<Boolean> = useCitation.getOptional("use_citation")

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [modelName].
     *
     * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_name") @ExcludeMissing fun _modelName(): JsonField<ModelName> = modelName

    /**
     * Returns the raw JSON value of [systemPrompt].
     *
     * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("system_prompt")
    @ExcludeMissing
    fun _systemPrompt(): JsonField<String> = systemPrompt

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /**
     * Returns the raw JSON value of [useChainOfThoughtReasoning].
     *
     * Unlike [useChainOfThoughtReasoning], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("use_chain_of_thought_reasoning")
    @ExcludeMissing
    fun _useChainOfThoughtReasoning(): JsonField<Boolean> = useChainOfThoughtReasoning

    /**
     * Returns the raw JSON value of [useCitation].
     *
     * Unlike [useCitation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("use_citation")
    @ExcludeMissing
    fun _useCitation(): JsonField<Boolean> = useCitation

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

        /** Returns a mutable builder for constructing an instance of [LlmParameters]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LlmParameters]. */
    class Builder internal constructor() {

        private var className: JsonField<String> = JsonMissing.of()
        private var modelName: JsonField<ModelName> = JsonMissing.of()
        private var systemPrompt: JsonField<String> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var useChainOfThoughtReasoning: JsonField<Boolean> = JsonMissing.of()
        private var useCitation: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(llmParameters: LlmParameters) = apply {
            className = llmParameters.className
            modelName = llmParameters.modelName
            systemPrompt = llmParameters.systemPrompt
            temperature = llmParameters.temperature
            useChainOfThoughtReasoning = llmParameters.useChainOfThoughtReasoning
            useCitation = llmParameters.useCitation
            additionalProperties = llmParameters.additionalProperties.toMutableMap()
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

        /** The name of the model to use for LLM completions. */
        fun modelName(modelName: ModelName) = modelName(JsonField.of(modelName))

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [ModelName] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelName(modelName: JsonField<ModelName>) = apply { this.modelName = modelName }

        /** The system prompt to use for the completion. */
        fun systemPrompt(systemPrompt: String?) = systemPrompt(JsonField.ofNullable(systemPrompt))

        /** Alias for calling [Builder.systemPrompt] with `systemPrompt.orElse(null)`. */
        fun systemPrompt(systemPrompt: Optional<String>) = systemPrompt(systemPrompt.getOrNull())

        /**
         * Sets [Builder.systemPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun systemPrompt(systemPrompt: JsonField<String>) = apply {
            this.systemPrompt = systemPrompt
        }

        /** The temperature value for the model. */
        fun temperature(temperature: Double?) = temperature(JsonField.ofNullable(temperature))

        /**
         * Alias for [Builder.temperature].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun temperature(temperature: Double) = temperature(temperature as Double?)

        /** Alias for calling [Builder.temperature] with `temperature.orElse(null)`. */
        fun temperature(temperature: Optional<Double>) = temperature(temperature.getOrNull())

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        /** Whether to use chain of thought reasoning. */
        fun useChainOfThoughtReasoning(useChainOfThoughtReasoning: Boolean?) =
            useChainOfThoughtReasoning(JsonField.ofNullable(useChainOfThoughtReasoning))

        /**
         * Alias for [Builder.useChainOfThoughtReasoning].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun useChainOfThoughtReasoning(useChainOfThoughtReasoning: Boolean) =
            useChainOfThoughtReasoning(useChainOfThoughtReasoning as Boolean?)

        /**
         * Alias for calling [Builder.useChainOfThoughtReasoning] with
         * `useChainOfThoughtReasoning.orElse(null)`.
         */
        fun useChainOfThoughtReasoning(useChainOfThoughtReasoning: Optional<Boolean>) =
            useChainOfThoughtReasoning(useChainOfThoughtReasoning.getOrNull())

        /**
         * Sets [Builder.useChainOfThoughtReasoning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useChainOfThoughtReasoning] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun useChainOfThoughtReasoning(useChainOfThoughtReasoning: JsonField<Boolean>) = apply {
            this.useChainOfThoughtReasoning = useChainOfThoughtReasoning
        }

        /** Whether to show citations in the response. */
        fun useCitation(useCitation: Boolean?) = useCitation(JsonField.ofNullable(useCitation))

        /**
         * Alias for [Builder.useCitation].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun useCitation(useCitation: Boolean) = useCitation(useCitation as Boolean?)

        /** Alias for calling [Builder.useCitation] with `useCitation.orElse(null)`. */
        fun useCitation(useCitation: Optional<Boolean>) = useCitation(useCitation.getOrNull())

        /**
         * Sets [Builder.useCitation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCitation] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun useCitation(useCitation: JsonField<Boolean>) = apply { this.useCitation = useCitation }

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
         * Returns an immutable instance of [LlmParameters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LlmParameters =
            LlmParameters(
                className,
                modelName,
                systemPrompt,
                temperature,
                useChainOfThoughtReasoning,
                useCitation,
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
    fun validate(): LlmParameters = apply {
        if (validated) {
            return@apply
        }

        className()
        modelName().ifPresent { it.validate() }
        systemPrompt()
        temperature()
        useChainOfThoughtReasoning()
        useCitation()
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
            (modelName.asKnown().getOrNull()?.validity() ?: 0) +
            (if (systemPrompt.asKnown().isPresent) 1 else 0) +
            (if (temperature.asKnown().isPresent) 1 else 0) +
            (if (useChainOfThoughtReasoning.asKnown().isPresent) 1 else 0) +
            (if (useCitation.asKnown().isPresent) 1 else 0)

    /** The name of the model to use for LLM completions. */
    class ModelName @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AZURE_OPENAI_GPT_4_O = of("AZURE_OPENAI_GPT_4O")

            @JvmField val AZURE_OPENAI_GPT_4_O_MINI = of("AZURE_OPENAI_GPT_4O_MINI")

            @JvmField val AZURE_OPENAI_GPT_4_1 = of("AZURE_OPENAI_GPT_4_1")

            @JvmField val AZURE_OPENAI_GPT_4_1_MINI = of("AZURE_OPENAI_GPT_4_1_MINI")

            @JvmField val AZURE_OPENAI_GPT_4_1_NANO = of("AZURE_OPENAI_GPT_4_1_NANO")

            @JvmField val BEDROCK_CLAUDE_3_5_SONNET_V1 = of("BEDROCK_CLAUDE_3_5_SONNET_V1")

            @JvmField val BEDROCK_CLAUDE_3_5_SONNET_V2 = of("BEDROCK_CLAUDE_3_5_SONNET_V2")

            @JvmField val CLAUDE_4_5_SONNET = of("CLAUDE_4_5_SONNET")

            @JvmField val GPT_4_O = of("GPT_4O")

            @JvmField val GPT_4_O_MINI = of("GPT_4O_MINI")

            @JvmField val GPT_4_1 = of("GPT_4_1")

            @JvmField val GPT_4_1_MINI = of("GPT_4_1_MINI")

            @JvmField val GPT_4_1_NANO = of("GPT_4_1_NANO")

            @JvmStatic fun of(value: String) = ModelName(JsonField.of(value))
        }

        /** An enum containing [ModelName]'s known values. */
        enum class Known {
            AZURE_OPENAI_GPT_4_O,
            AZURE_OPENAI_GPT_4_O_MINI,
            AZURE_OPENAI_GPT_4_1,
            AZURE_OPENAI_GPT_4_1_MINI,
            AZURE_OPENAI_GPT_4_1_NANO,
            BEDROCK_CLAUDE_3_5_SONNET_V1,
            BEDROCK_CLAUDE_3_5_SONNET_V2,
            CLAUDE_4_5_SONNET,
            GPT_4_O,
            GPT_4_O_MINI,
            GPT_4_1,
            GPT_4_1_MINI,
            GPT_4_1_NANO,
        }

        /**
         * An enum containing [ModelName]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ModelName] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AZURE_OPENAI_GPT_4_O,
            AZURE_OPENAI_GPT_4_O_MINI,
            AZURE_OPENAI_GPT_4_1,
            AZURE_OPENAI_GPT_4_1_MINI,
            AZURE_OPENAI_GPT_4_1_NANO,
            BEDROCK_CLAUDE_3_5_SONNET_V1,
            BEDROCK_CLAUDE_3_5_SONNET_V2,
            CLAUDE_4_5_SONNET,
            GPT_4_O,
            GPT_4_O_MINI,
            GPT_4_1,
            GPT_4_1_MINI,
            GPT_4_1_NANO,
            /**
             * An enum member indicating that [ModelName] was instantiated with an unknown value.
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
                AZURE_OPENAI_GPT_4_O -> Value.AZURE_OPENAI_GPT_4_O
                AZURE_OPENAI_GPT_4_O_MINI -> Value.AZURE_OPENAI_GPT_4_O_MINI
                AZURE_OPENAI_GPT_4_1 -> Value.AZURE_OPENAI_GPT_4_1
                AZURE_OPENAI_GPT_4_1_MINI -> Value.AZURE_OPENAI_GPT_4_1_MINI
                AZURE_OPENAI_GPT_4_1_NANO -> Value.AZURE_OPENAI_GPT_4_1_NANO
                BEDROCK_CLAUDE_3_5_SONNET_V1 -> Value.BEDROCK_CLAUDE_3_5_SONNET_V1
                BEDROCK_CLAUDE_3_5_SONNET_V2 -> Value.BEDROCK_CLAUDE_3_5_SONNET_V2
                CLAUDE_4_5_SONNET -> Value.CLAUDE_4_5_SONNET
                GPT_4_O -> Value.GPT_4_O
                GPT_4_O_MINI -> Value.GPT_4_O_MINI
                GPT_4_1 -> Value.GPT_4_1
                GPT_4_1_MINI -> Value.GPT_4_1_MINI
                GPT_4_1_NANO -> Value.GPT_4_1_NANO
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
                AZURE_OPENAI_GPT_4_O -> Known.AZURE_OPENAI_GPT_4_O
                AZURE_OPENAI_GPT_4_O_MINI -> Known.AZURE_OPENAI_GPT_4_O_MINI
                AZURE_OPENAI_GPT_4_1 -> Known.AZURE_OPENAI_GPT_4_1
                AZURE_OPENAI_GPT_4_1_MINI -> Known.AZURE_OPENAI_GPT_4_1_MINI
                AZURE_OPENAI_GPT_4_1_NANO -> Known.AZURE_OPENAI_GPT_4_1_NANO
                BEDROCK_CLAUDE_3_5_SONNET_V1 -> Known.BEDROCK_CLAUDE_3_5_SONNET_V1
                BEDROCK_CLAUDE_3_5_SONNET_V2 -> Known.BEDROCK_CLAUDE_3_5_SONNET_V2
                CLAUDE_4_5_SONNET -> Known.CLAUDE_4_5_SONNET
                GPT_4_O -> Known.GPT_4_O
                GPT_4_O_MINI -> Known.GPT_4_O_MINI
                GPT_4_1 -> Known.GPT_4_1
                GPT_4_1_MINI -> Known.GPT_4_1_MINI
                GPT_4_1_NANO -> Known.GPT_4_1_NANO
                else -> throw LlamaCloudInvalidDataException("Unknown ModelName: $value")
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
        fun validate(): ModelName = apply {
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

            return other is ModelName && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LlmParameters &&
            className == other.className &&
            modelName == other.modelName &&
            systemPrompt == other.systemPrompt &&
            temperature == other.temperature &&
            useChainOfThoughtReasoning == other.useChainOfThoughtReasoning &&
            useCitation == other.useCitation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            className,
            modelName,
            systemPrompt,
            temperature,
            useChainOfThoughtReasoning,
            useCitation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LlmParameters{className=$className, modelName=$modelName, systemPrompt=$systemPrompt, temperature=$temperature, useChainOfThoughtReasoning=$useChainOfThoughtReasoning, useCitation=$useCitation, additionalProperties=$additionalProperties}"
}
