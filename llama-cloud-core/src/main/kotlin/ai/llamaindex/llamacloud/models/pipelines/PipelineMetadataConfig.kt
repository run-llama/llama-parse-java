// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkKnown
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

class PipelineMetadataConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val excludedEmbedMetadataKeys: JsonField<List<String>>,
    private val excludedLlmMetadataKeys: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("excluded_embed_metadata_keys")
        @ExcludeMissing
        excludedEmbedMetadataKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("excluded_llm_metadata_keys")
        @ExcludeMissing
        excludedLlmMetadataKeys: JsonField<List<String>> = JsonMissing.of(),
    ) : this(excludedEmbedMetadataKeys, excludedLlmMetadataKeys, mutableMapOf())

    /**
     * List of metadata keys to exclude from embeddings
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludedEmbedMetadataKeys(): Optional<List<String>> =
        excludedEmbedMetadataKeys.getOptional("excluded_embed_metadata_keys")

    /**
     * List of metadata keys to exclude from LLM during retrieval
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludedLlmMetadataKeys(): Optional<List<String>> =
        excludedLlmMetadataKeys.getOptional("excluded_llm_metadata_keys")

    /**
     * Returns the raw JSON value of [excludedEmbedMetadataKeys].
     *
     * Unlike [excludedEmbedMetadataKeys], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("excluded_embed_metadata_keys")
    @ExcludeMissing
    fun _excludedEmbedMetadataKeys(): JsonField<List<String>> = excludedEmbedMetadataKeys

    /**
     * Returns the raw JSON value of [excludedLlmMetadataKeys].
     *
     * Unlike [excludedLlmMetadataKeys], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("excluded_llm_metadata_keys")
    @ExcludeMissing
    fun _excludedLlmMetadataKeys(): JsonField<List<String>> = excludedLlmMetadataKeys

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

        /** Returns a mutable builder for constructing an instance of [PipelineMetadataConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PipelineMetadataConfig]. */
    class Builder internal constructor() {

        private var excludedEmbedMetadataKeys: JsonField<MutableList<String>>? = null
        private var excludedLlmMetadataKeys: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pipelineMetadataConfig: PipelineMetadataConfig) = apply {
            excludedEmbedMetadataKeys =
                pipelineMetadataConfig.excludedEmbedMetadataKeys.map { it.toMutableList() }
            excludedLlmMetadataKeys =
                pipelineMetadataConfig.excludedLlmMetadataKeys.map { it.toMutableList() }
            additionalProperties = pipelineMetadataConfig.additionalProperties.toMutableMap()
        }

        /** List of metadata keys to exclude from embeddings */
        fun excludedEmbedMetadataKeys(excludedEmbedMetadataKeys: List<String>) =
            excludedEmbedMetadataKeys(JsonField.of(excludedEmbedMetadataKeys))

        /**
         * Sets [Builder.excludedEmbedMetadataKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludedEmbedMetadataKeys] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun excludedEmbedMetadataKeys(excludedEmbedMetadataKeys: JsonField<List<String>>) = apply {
            this.excludedEmbedMetadataKeys = excludedEmbedMetadataKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [excludedEmbedMetadataKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludedEmbedMetadataKey(excludedEmbedMetadataKey: String) = apply {
            excludedEmbedMetadataKeys =
                (excludedEmbedMetadataKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("excludedEmbedMetadataKeys", it).add(excludedEmbedMetadataKey)
                }
        }

        /** List of metadata keys to exclude from LLM during retrieval */
        fun excludedLlmMetadataKeys(excludedLlmMetadataKeys: List<String>) =
            excludedLlmMetadataKeys(JsonField.of(excludedLlmMetadataKeys))

        /**
         * Sets [Builder.excludedLlmMetadataKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludedLlmMetadataKeys] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun excludedLlmMetadataKeys(excludedLlmMetadataKeys: JsonField<List<String>>) = apply {
            this.excludedLlmMetadataKeys = excludedLlmMetadataKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [excludedLlmMetadataKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludedLlmMetadataKey(excludedLlmMetadataKey: String) = apply {
            excludedLlmMetadataKeys =
                (excludedLlmMetadataKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("excludedLlmMetadataKeys", it).add(excludedLlmMetadataKey)
                }
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
         * Returns an immutable instance of [PipelineMetadataConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PipelineMetadataConfig =
            PipelineMetadataConfig(
                (excludedEmbedMetadataKeys ?: JsonMissing.of()).map { it.toImmutable() },
                (excludedLlmMetadataKeys ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): PipelineMetadataConfig = apply {
        if (validated) {
            return@apply
        }

        excludedEmbedMetadataKeys()
        excludedLlmMetadataKeys()
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
        (excludedEmbedMetadataKeys.asKnown().getOrNull()?.size ?: 0) +
            (excludedLlmMetadataKeys.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelineMetadataConfig &&
            excludedEmbedMetadataKeys == other.excludedEmbedMetadataKeys &&
            excludedLlmMetadataKeys == other.excludedLlmMetadataKeys &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(excludedEmbedMetadataKeys, excludedLlmMetadataKeys, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PipelineMetadataConfig{excludedEmbedMetadataKeys=$excludedEmbedMetadataKeys, excludedLlmMetadataKeys=$excludedLlmMetadataKeys, additionalProperties=$additionalProperties}"
}
