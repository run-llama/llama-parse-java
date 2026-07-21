// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

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
import kotlin.jvm.optionals.getOrNull

/** Request schema for validating an extraction schema. */
class ExtractV2SchemaValidateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataSchema: JsonField<DataSchema>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data_schema")
        @ExcludeMissing
        dataSchema: JsonField<DataSchema> = JsonMissing.of()
    ) : this(dataSchema, mutableMapOf())

    /**
     * JSON Schema to validate for use with extract jobs
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataSchema(): DataSchema = dataSchema.getRequired("data_schema")

    /**
     * Returns the raw JSON value of [dataSchema].
     *
     * Unlike [dataSchema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_schema")
    @ExcludeMissing
    fun _dataSchema(): JsonField<DataSchema> = dataSchema

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
         * [ExtractV2SchemaValidateRequest].
         *
         * The following fields are required:
         * ```java
         * .dataSchema()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractV2SchemaValidateRequest]. */
    class Builder internal constructor() {

        private var dataSchema: JsonField<DataSchema>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractV2SchemaValidateRequest: ExtractV2SchemaValidateRequest) = apply {
            dataSchema = extractV2SchemaValidateRequest.dataSchema
            additionalProperties =
                extractV2SchemaValidateRequest.additionalProperties.toMutableMap()
        }

        /** JSON Schema to validate for use with extract jobs */
        fun dataSchema(dataSchema: DataSchema) = dataSchema(JsonField.of(dataSchema))

        /**
         * Sets [Builder.dataSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSchema] with a well-typed [DataSchema] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataSchema(dataSchema: JsonField<DataSchema>) = apply { this.dataSchema = dataSchema }

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
         * Returns an immutable instance of [ExtractV2SchemaValidateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dataSchema()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExtractV2SchemaValidateRequest =
            ExtractV2SchemaValidateRequest(
                checkRequired("dataSchema", dataSchema),
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
    fun validate(): ExtractV2SchemaValidateRequest = apply {
        if (validated) {
            return@apply
        }

        dataSchema().validate()
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
    @JvmSynthetic internal fun validity(): Int = (dataSchema.asKnown().getOrNull()?.validity() ?: 0)

    /** JSON Schema to validate for use with extract jobs */
    class DataSchema
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

            /** Returns a mutable builder for constructing an instance of [DataSchema]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DataSchema]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataSchema: DataSchema) = apply {
                additionalProperties = dataSchema.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DataSchema].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DataSchema = DataSchema(additionalProperties.toImmutable())
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
        fun validate(): DataSchema = apply {
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

            return other is DataSchema && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DataSchema{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractV2SchemaValidateRequest &&
            dataSchema == other.dataSchema &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(dataSchema, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractV2SchemaValidateRequest{dataSchema=$dataSchema, additionalProperties=$additionalProperties}"
}
