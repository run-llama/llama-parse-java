// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
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

/** Request schema for generating an extraction schema. */
class ExtractV2SchemaGenerateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataSchema: JsonField<DataSchema>,
    private val fileId: JsonField<String>,
    private val name: JsonField<String>,
    private val prompt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data_schema")
        @ExcludeMissing
        dataSchema: JsonField<DataSchema> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
    ) : this(dataSchema, fileId, name, prompt, mutableMapOf())

    /**
     * Optional schema to validate, refine, or extend
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSchema(): Optional<DataSchema> = dataSchema.getOptional("data_schema")

    /**
     * Optional file ID to analyze for schema generation
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileId(): Optional<String> = fileId.getOptional("file_id")

    /**
     * Name for the generated configuration (auto-generated if omitted)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Natural language description of the data structure to extract
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompt(): Optional<String> = prompt.getOptional("prompt")

    /**
     * Returns the raw JSON value of [dataSchema].
     *
     * Unlike [dataSchema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_schema")
    @ExcludeMissing
    fun _dataSchema(): JsonField<DataSchema> = dataSchema

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

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
         * [ExtractV2SchemaGenerateRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtractV2SchemaGenerateRequest]. */
    class Builder internal constructor() {

        private var dataSchema: JsonField<DataSchema> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var prompt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extractV2SchemaGenerateRequest: ExtractV2SchemaGenerateRequest) = apply {
            dataSchema = extractV2SchemaGenerateRequest.dataSchema
            fileId = extractV2SchemaGenerateRequest.fileId
            name = extractV2SchemaGenerateRequest.name
            prompt = extractV2SchemaGenerateRequest.prompt
            additionalProperties =
                extractV2SchemaGenerateRequest.additionalProperties.toMutableMap()
        }

        /** Optional schema to validate, refine, or extend */
        fun dataSchema(dataSchema: DataSchema?) = dataSchema(JsonField.ofNullable(dataSchema))

        /** Alias for calling [Builder.dataSchema] with `dataSchema.orElse(null)`. */
        fun dataSchema(dataSchema: Optional<DataSchema>) = dataSchema(dataSchema.getOrNull())

        /**
         * Sets [Builder.dataSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSchema] with a well-typed [DataSchema] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataSchema(dataSchema: JsonField<DataSchema>) = apply { this.dataSchema = dataSchema }

        /** Optional file ID to analyze for schema generation */
        fun fileId(fileId: String?) = fileId(JsonField.ofNullable(fileId))

        /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
        fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /** Name for the generated configuration (auto-generated if omitted) */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Natural language description of the data structure to extract */
        fun prompt(prompt: String?) = prompt(JsonField.ofNullable(prompt))

        /** Alias for calling [Builder.prompt] with `prompt.orElse(null)`. */
        fun prompt(prompt: Optional<String>) = prompt(prompt.getOrNull())

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

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
         * Returns an immutable instance of [ExtractV2SchemaGenerateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExtractV2SchemaGenerateRequest =
            ExtractV2SchemaGenerateRequest(
                dataSchema,
                fileId,
                name,
                prompt,
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
    fun validate(): ExtractV2SchemaGenerateRequest = apply {
        if (validated) {
            return@apply
        }

        dataSchema().ifPresent { it.validate() }
        fileId()
        name()
        prompt()
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
        (dataSchema.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (prompt.asKnown().isPresent) 1 else 0)

    /** Optional schema to validate, refine, or extend */
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

        return other is ExtractV2SchemaGenerateRequest &&
            dataSchema == other.dataSchema &&
            fileId == other.fileId &&
            name == other.name &&
            prompt == other.prompt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dataSchema, fileId, name, prompt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtractV2SchemaGenerateRequest{dataSchema=$dataSchema, fileId=$fileId, name=$name, prompt=$prompt, additionalProperties=$additionalProperties}"
}
