// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.retrievers

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import ai.llamaindex.llamacloud.models.pipelines.PresetRetrievalParams
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RetrieverPipeline
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val pipelineId: JsonField<String>,
    private val presetRetrievalParameters: JsonField<PresetRetrievalParams>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pipeline_id")
        @ExcludeMissing
        pipelineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preset_retrieval_parameters")
        @ExcludeMissing
        presetRetrievalParameters: JsonField<PresetRetrievalParams> = JsonMissing.of(),
    ) : this(description, name, pipelineId, presetRetrievalParameters, mutableMapOf())

    /**
     * A description of the retriever tool.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * A name for the retriever tool. Will default to the pipeline name if not provided.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The ID of the pipeline this tool uses.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pipelineId(): String = pipelineId.getRequired("pipeline_id")

    /**
     * Parameters for retrieval configuration.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presetRetrievalParameters(): Optional<PresetRetrievalParams> =
        presetRetrievalParameters.getOptional("preset_retrieval_parameters")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [pipelineId].
     *
     * Unlike [pipelineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pipeline_id") @ExcludeMissing fun _pipelineId(): JsonField<String> = pipelineId

    /**
     * Returns the raw JSON value of [presetRetrievalParameters].
     *
     * Unlike [presetRetrievalParameters], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("preset_retrieval_parameters")
    @ExcludeMissing
    fun _presetRetrievalParameters(): JsonField<PresetRetrievalParams> = presetRetrievalParameters

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
         * Returns a mutable builder for constructing an instance of [RetrieverPipeline].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .name()
         * .pipelineId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrieverPipeline]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var pipelineId: JsonField<String>? = null
        private var presetRetrievalParameters: JsonField<PresetRetrievalParams> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(retrieverPipeline: RetrieverPipeline) = apply {
            description = retrieverPipeline.description
            name = retrieverPipeline.name
            pipelineId = retrieverPipeline.pipelineId
            presetRetrievalParameters = retrieverPipeline.presetRetrievalParameters
            additionalProperties = retrieverPipeline.additionalProperties.toMutableMap()
        }

        /** A description of the retriever tool. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** A name for the retriever tool. Will default to the pipeline name if not provided. */
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

        /** The ID of the pipeline this tool uses. */
        fun pipelineId(pipelineId: String) = pipelineId(JsonField.of(pipelineId))

        /**
         * Sets [Builder.pipelineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pipelineId(pipelineId: JsonField<String>) = apply { this.pipelineId = pipelineId }

        /** Parameters for retrieval configuration. */
        fun presetRetrievalParameters(presetRetrievalParameters: PresetRetrievalParams) =
            presetRetrievalParameters(JsonField.of(presetRetrievalParameters))

        /**
         * Sets [Builder.presetRetrievalParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presetRetrievalParameters] with a well-typed
         * [PresetRetrievalParams] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun presetRetrievalParameters(presetRetrievalParameters: JsonField<PresetRetrievalParams>) =
            apply {
                this.presetRetrievalParameters = presetRetrievalParameters
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
         * Returns an immutable instance of [RetrieverPipeline].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .name()
         * .pipelineId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetrieverPipeline =
            RetrieverPipeline(
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("pipelineId", pipelineId),
                presetRetrievalParameters,
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
    fun validate(): RetrieverPipeline = apply {
        if (validated) {
            return@apply
        }

        description()
        name()
        pipelineId()
        presetRetrievalParameters().ifPresent { it.validate() }
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (pipelineId.asKnown().isPresent) 1 else 0) +
            (presetRetrievalParameters.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrieverPipeline &&
            description == other.description &&
            name == other.name &&
            pipelineId == other.pipelineId &&
            presetRetrievalParameters == other.presetRetrievalParameters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(description, name, pipelineId, presetRetrievalParameters, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RetrieverPipeline{description=$description, name=$name, pipelineId=$pipelineId, presetRetrievalParameters=$presetRetrievalParameters, additionalProperties=$additionalProperties}"
}
