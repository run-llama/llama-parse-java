// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.retrievers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RetrieverCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val pipelines: JsonField<List<RetrieverPipeline>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pipelines")
        @ExcludeMissing
        pipelines: JsonField<List<RetrieverPipeline>> = JsonMissing.of(),
    ) : this(name, pipelines, mutableMapOf())

    /**
     * A name for the retriever tool. Will default to the pipeline name if not provided.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The pipelines this retriever uses.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pipelines(): Optional<List<RetrieverPipeline>> = pipelines.getOptional("pipelines")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [pipelines].
     *
     * Unlike [pipelines], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pipelines")
    @ExcludeMissing
    fun _pipelines(): JsonField<List<RetrieverPipeline>> = pipelines

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
         * Returns a mutable builder for constructing an instance of [RetrieverCreate].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrieverCreate]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var pipelines: JsonField<MutableList<RetrieverPipeline>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(retrieverCreate: RetrieverCreate) = apply {
            name = retrieverCreate.name
            pipelines = retrieverCreate.pipelines.map { it.toMutableList() }
            additionalProperties = retrieverCreate.additionalProperties.toMutableMap()
        }

        /** A name for the retriever tool. Will default to the pipeline name if not provided. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The pipelines this retriever uses. */
        fun pipelines(pipelines: List<RetrieverPipeline>) = pipelines(JsonField.of(pipelines))

        /**
         * Sets [Builder.pipelines] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelines] with a well-typed `List<RetrieverPipeline>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pipelines(pipelines: JsonField<List<RetrieverPipeline>>) = apply {
            this.pipelines = pipelines.map { it.toMutableList() }
        }

        /**
         * Adds a single [RetrieverPipeline] to [pipelines].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPipeline(pipeline: RetrieverPipeline) = apply {
            pipelines =
                (pipelines ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pipelines", it).add(pipeline)
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
         * Returns an immutable instance of [RetrieverCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetrieverCreate =
            RetrieverCreate(
                checkRequired("name", name),
                (pipelines ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): RetrieverCreate = apply {
        if (validated) {
            return@apply
        }

        name()
        pipelines().ifPresent { it.forEach { it.validate() } }
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (pipelines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrieverCreate &&
            name == other.name &&
            pipelines == other.pipelines &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(name, pipelines, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RetrieverCreate{name=$name, pipelines=$pipelines, additionalProperties=$additionalProperties}"
}
