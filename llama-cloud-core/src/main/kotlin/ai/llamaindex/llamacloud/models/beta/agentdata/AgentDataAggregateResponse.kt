// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.agentdata

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
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

/** API Result for a single group in the aggregate response */
class AgentDataAggregateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val groupKey: JsonField<GroupKey>,
    private val count: JsonField<Long>,
    private val firstItem: JsonField<FirstItem>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("group_key") @ExcludeMissing groupKey: JsonField<GroupKey> = JsonMissing.of(),
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("first_item")
        @ExcludeMissing
        firstItem: JsonField<FirstItem> = JsonMissing.of(),
    ) : this(groupKey, count, firstItem, mutableMapOf())

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupKey(): GroupKey = groupKey.getRequired("group_key")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Long> = count.getOptional("count")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstItem(): Optional<FirstItem> = firstItem.getOptional("first_item")

    /**
     * Returns the raw JSON value of [groupKey].
     *
     * Unlike [groupKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonField<GroupKey> = groupKey

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [firstItem].
     *
     * Unlike [firstItem], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_item") @ExcludeMissing fun _firstItem(): JsonField<FirstItem> = firstItem

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
         * Returns a mutable builder for constructing an instance of [AgentDataAggregateResponse].
         *
         * The following fields are required:
         * ```java
         * .groupKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentDataAggregateResponse]. */
    class Builder internal constructor() {

        private var groupKey: JsonField<GroupKey>? = null
        private var count: JsonField<Long> = JsonMissing.of()
        private var firstItem: JsonField<FirstItem> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentDataAggregateResponse: AgentDataAggregateResponse) = apply {
            groupKey = agentDataAggregateResponse.groupKey
            count = agentDataAggregateResponse.count
            firstItem = agentDataAggregateResponse.firstItem
            additionalProperties = agentDataAggregateResponse.additionalProperties.toMutableMap()
        }

        fun groupKey(groupKey: GroupKey) = groupKey(JsonField.of(groupKey))

        /**
         * Sets [Builder.groupKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupKey] with a well-typed [GroupKey] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupKey(groupKey: JsonField<GroupKey>) = apply { this.groupKey = groupKey }

        fun count(count: Long?) = count(JsonField.ofNullable(count))

        /**
         * Alias for [Builder.count].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun count(count: Long) = count(count as Long?)

        /** Alias for calling [Builder.count] with `count.orElse(null)`. */
        fun count(count: Optional<Long>) = count(count.getOrNull())

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        fun firstItem(firstItem: FirstItem?) = firstItem(JsonField.ofNullable(firstItem))

        /** Alias for calling [Builder.firstItem] with `firstItem.orElse(null)`. */
        fun firstItem(firstItem: Optional<FirstItem>) = firstItem(firstItem.getOrNull())

        /**
         * Sets [Builder.firstItem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstItem] with a well-typed [FirstItem] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstItem(firstItem: JsonField<FirstItem>) = apply { this.firstItem = firstItem }

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
         * Returns an immutable instance of [AgentDataAggregateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .groupKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentDataAggregateResponse =
            AgentDataAggregateResponse(
                checkRequired("groupKey", groupKey),
                count,
                firstItem,
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
    fun validate(): AgentDataAggregateResponse = apply {
        if (validated) {
            return@apply
        }

        groupKey().validate()
        count()
        firstItem().ifPresent { it.validate() }
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
        (groupKey.asKnown().getOrNull()?.validity() ?: 0) +
            (if (count.asKnown().isPresent) 1 else 0) +
            (firstItem.asKnown().getOrNull()?.validity() ?: 0)

    class GroupKey
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

            /** Returns a mutable builder for constructing an instance of [GroupKey]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GroupKey]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupKey: GroupKey) = apply {
                additionalProperties = groupKey.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [GroupKey].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): GroupKey = GroupKey(additionalProperties.toImmutable())
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
        fun validate(): GroupKey = apply {
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

            return other is GroupKey && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "GroupKey{additionalProperties=$additionalProperties}"
    }

    class FirstItem
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

            /** Returns a mutable builder for constructing an instance of [FirstItem]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FirstItem]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(firstItem: FirstItem) = apply {
                additionalProperties = firstItem.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [FirstItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FirstItem = FirstItem(additionalProperties.toImmutable())
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
        fun validate(): FirstItem = apply {
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

            return other is FirstItem && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FirstItem{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentDataAggregateResponse &&
            groupKey == other.groupKey &&
            count == other.count &&
            firstItem == other.firstItem &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(groupKey, count, firstItem, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentDataAggregateResponse{groupKey=$groupKey, count=$count, firstItem=$firstItem, additionalProperties=$additionalProperties}"
}
