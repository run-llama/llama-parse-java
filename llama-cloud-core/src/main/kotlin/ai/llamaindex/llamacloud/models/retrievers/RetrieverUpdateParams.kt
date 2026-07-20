// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.retrievers

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
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

/** Update an existing Retriever. */
class RetrieverUpdateParams
private constructor(
    private val retrieverId: String?,
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun retrieverId(): Optional<String> = Optional.ofNullable(retrieverId)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * The pipelines this retriever uses.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pipelines(): Optional<List<RetrieverPipeline>> = body.pipelines()

    /**
     * A name for the retriever.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Returns the raw JSON value of [pipelines].
     *
     * Unlike [pipelines], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pipelines(): JsonField<List<RetrieverPipeline>> = body._pipelines()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RetrieverUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .pipelines()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrieverUpdateParams]. */
    class Builder internal constructor() {

        private var retrieverId: String? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(retrieverUpdateParams: RetrieverUpdateParams) = apply {
            retrieverId = retrieverUpdateParams.retrieverId
            organizationId = retrieverUpdateParams.organizationId
            projectId = retrieverUpdateParams.projectId
            body = retrieverUpdateParams.body.toBuilder()
            additionalHeaders = retrieverUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = retrieverUpdateParams.additionalQueryParams.toBuilder()
        }

        fun retrieverId(retrieverId: String?) = apply { this.retrieverId = retrieverId }

        /** Alias for calling [Builder.retrieverId] with `retrieverId.orElse(null)`. */
        fun retrieverId(retrieverId: Optional<String>) = retrieverId(retrieverId.getOrNull())

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [pipelines]
         * - [name]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The pipelines this retriever uses. */
        fun pipelines(pipelines: List<RetrieverPipeline>?) = apply { body.pipelines(pipelines) }

        /** Alias for calling [Builder.pipelines] with `pipelines.orElse(null)`. */
        fun pipelines(pipelines: Optional<List<RetrieverPipeline>>) =
            pipelines(pipelines.getOrNull())

        /**
         * Sets [Builder.pipelines] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelines] with a well-typed `List<RetrieverPipeline>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pipelines(pipelines: JsonField<List<RetrieverPipeline>>) = apply {
            body.pipelines(pipelines)
        }

        /**
         * Adds a single [RetrieverPipeline] to [pipelines].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPipeline(pipeline: RetrieverPipeline) = apply { body.addPipeline(pipeline) }

        /** A name for the retriever. */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [RetrieverUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pipelines()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetrieverUpdateParams =
            RetrieverUpdateParams(
                retrieverId,
                organizationId,
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> retrieverId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pipelines: JsonField<List<RetrieverPipeline>>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pipelines")
            @ExcludeMissing
            pipelines: JsonField<List<RetrieverPipeline>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(pipelines, name, mutableMapOf())

        /**
         * The pipelines this retriever uses.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pipelines(): Optional<List<RetrieverPipeline>> = pipelines.getOptional("pipelines")

        /**
         * A name for the retriever.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [pipelines].
         *
         * Unlike [pipelines], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pipelines")
        @ExcludeMissing
        fun _pipelines(): JsonField<List<RetrieverPipeline>> = pipelines

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .pipelines()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var pipelines: JsonField<MutableList<RetrieverPipeline>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                pipelines = body.pipelines.map { it.toMutableList() }
                name = body.name
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The pipelines this retriever uses. */
            fun pipelines(pipelines: List<RetrieverPipeline>?) =
                pipelines(JsonField.ofNullable(pipelines))

            /** Alias for calling [Builder.pipelines] with `pipelines.orElse(null)`. */
            fun pipelines(pipelines: Optional<List<RetrieverPipeline>>) =
                pipelines(pipelines.getOrNull())

            /**
             * Sets [Builder.pipelines] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pipelines] with a well-typed
             * `List<RetrieverPipeline>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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

            /** A name for the retriever. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .pipelines()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("pipelines", pipelines).map { it.toImmutable() },
                    name,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            pipelines().ifPresent { it.forEach { it.validate() } }
            name()
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
            (pipelines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                pipelines == other.pipelines &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pipelines, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{pipelines=$pipelines, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrieverUpdateParams &&
            retrieverId == other.retrieverId &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            retrieverId,
            organizationId,
            projectId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RetrieverUpdateParams{retrieverId=$retrieverId, organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
