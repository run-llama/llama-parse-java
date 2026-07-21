// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Message role. */
class MessageRole @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ASSISTANT = of("assistant")

        @JvmField val CHATBOT = of("chatbot")

        @JvmField val DEVELOPER = of("developer")

        @JvmField val FUNCTION = of("function")

        @JvmField val MODEL = of("model")

        @JvmField val SYSTEM = of("system")

        @JvmField val TOOL = of("tool")

        @JvmField val USER = of("user")

        @JvmStatic fun of(value: String) = MessageRole(JsonField.of(value))
    }

    /** An enum containing [MessageRole]'s known values. */
    enum class Known {
        ASSISTANT,
        CHATBOT,
        DEVELOPER,
        FUNCTION,
        MODEL,
        SYSTEM,
        TOOL,
        USER,
    }

    /**
     * An enum containing [MessageRole]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [MessageRole] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ASSISTANT,
        CHATBOT,
        DEVELOPER,
        FUNCTION,
        MODEL,
        SYSTEM,
        TOOL,
        USER,
        /** An enum member indicating that [MessageRole] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            ASSISTANT -> Value.ASSISTANT
            CHATBOT -> Value.CHATBOT
            DEVELOPER -> Value.DEVELOPER
            FUNCTION -> Value.FUNCTION
            MODEL -> Value.MODEL
            SYSTEM -> Value.SYSTEM
            TOOL -> Value.TOOL
            USER -> Value.USER
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            ASSISTANT -> Known.ASSISTANT
            CHATBOT -> Known.CHATBOT
            DEVELOPER -> Known.DEVELOPER
            FUNCTION -> Known.FUNCTION
            MODEL -> Known.MODEL
            SYSTEM -> Known.SYSTEM
            TOOL -> Known.TOOL
            USER -> Known.USER
            else -> throw LlamaCloudInvalidDataException("Unknown MessageRole: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { LlamaCloudInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): MessageRole = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageRole && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
