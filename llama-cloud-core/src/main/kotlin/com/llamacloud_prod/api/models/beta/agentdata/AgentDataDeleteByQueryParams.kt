// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.agentdata

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Bulk delete agent data by query (deployment_name, collection, optional filters). */
class AgentDataDeleteByQueryParams
private constructor(
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * The agent deployment's name to delete data for
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deploymentName(): String = body.deploymentName()

    /**
     * The logical agent data collection to delete from
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun collection(): Optional<String> = body.collection()

    /**
     * Optional filters to select which items to delete
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<Filter> = body.filter()

    /**
     * Returns the raw JSON value of [deploymentName].
     *
     * Unlike [deploymentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deploymentName(): JsonField<String> = body._deploymentName()

    /**
     * Returns the raw JSON value of [collection].
     *
     * Unlike [collection], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _collection(): JsonField<String> = body._collection()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<Filter> = body._filter()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentDataDeleteByQueryParams].
         *
         * The following fields are required:
         * ```java
         * .deploymentName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentDataDeleteByQueryParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(agentDataDeleteByQueryParams: AgentDataDeleteByQueryParams) = apply {
            organizationId = agentDataDeleteByQueryParams.organizationId
            projectId = agentDataDeleteByQueryParams.projectId
            body = agentDataDeleteByQueryParams.body.toBuilder()
            additionalHeaders = agentDataDeleteByQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentDataDeleteByQueryParams.additionalQueryParams.toBuilder()
        }

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
         * - [deploymentName]
         * - [collection]
         * - [filter]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The agent deployment's name to delete data for */
        fun deploymentName(deploymentName: String) = apply { body.deploymentName(deploymentName) }

        /**
         * Sets [Builder.deploymentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deploymentName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deploymentName(deploymentName: JsonField<String>) = apply {
            body.deploymentName(deploymentName)
        }

        /** The logical agent data collection to delete from */
        fun collection(collection: String) = apply { body.collection(collection) }

        /**
         * Sets [Builder.collection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collection] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun collection(collection: JsonField<String>) = apply { body.collection(collection) }

        /** Optional filters to select which items to delete */
        fun filter(filter: Filter?) = apply { body.filter(filter) }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [Filter] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<Filter>) = apply { body.filter(filter) }

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
         * Returns an immutable instance of [AgentDataDeleteByQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .deploymentName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentDataDeleteByQueryParams =
            AgentDataDeleteByQueryParams(
                organizationId,
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** API request body for bulk deleting agent data by query */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deploymentName: JsonField<String>,
        private val collection: JsonField<String>,
        private val filter: JsonField<Filter>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("deployment_name")
            @ExcludeMissing
            deploymentName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("collection")
            @ExcludeMissing
            collection: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<Filter> = JsonMissing.of(),
        ) : this(deploymentName, collection, filter, mutableMapOf())

        /**
         * The agent deployment's name to delete data for
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deploymentName(): String = deploymentName.getRequired("deployment_name")

        /**
         * The logical agent data collection to delete from
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun collection(): Optional<String> = collection.getOptional("collection")

        /**
         * Optional filters to select which items to delete
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<Filter> = filter.getOptional("filter")

        /**
         * Returns the raw JSON value of [deploymentName].
         *
         * Unlike [deploymentName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("deployment_name")
        @ExcludeMissing
        fun _deploymentName(): JsonField<String> = deploymentName

        /**
         * Returns the raw JSON value of [collection].
         *
         * Unlike [collection], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("collection")
        @ExcludeMissing
        fun _collection(): JsonField<String> = collection

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<Filter> = filter

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
             * .deploymentName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var deploymentName: JsonField<String>? = null
            private var collection: JsonField<String> = JsonMissing.of()
            private var filter: JsonField<Filter> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                deploymentName = body.deploymentName
                collection = body.collection
                filter = body.filter
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The agent deployment's name to delete data for */
            fun deploymentName(deploymentName: String) =
                deploymentName(JsonField.of(deploymentName))

            /**
             * Sets [Builder.deploymentName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deploymentName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deploymentName(deploymentName: JsonField<String>) = apply {
                this.deploymentName = deploymentName
            }

            /** The logical agent data collection to delete from */
            fun collection(collection: String) = collection(JsonField.of(collection))

            /**
             * Sets [Builder.collection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collection] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collection(collection: JsonField<String>) = apply { this.collection = collection }

            /** Optional filters to select which items to delete */
            fun filter(filter: Filter?) = filter(JsonField.ofNullable(filter))

            /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
            fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [Filter] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<Filter>) = apply { this.filter = filter }

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
             * .deploymentName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("deploymentName", deploymentName),
                    collection,
                    filter,
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

            deploymentName()
            collection()
            filter().ifPresent { it.validate() }
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
            (if (deploymentName.asKnown().isPresent) 1 else 0) +
                (if (collection.asKnown().isPresent) 1 else 0) +
                (filter.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                deploymentName == other.deploymentName &&
                collection == other.collection &&
                filter == other.filter &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(deploymentName, collection, filter, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{deploymentName=$deploymentName, collection=$collection, filter=$filter, additionalProperties=$additionalProperties}"
    }

    /** Optional filters to select which items to delete */
    class Filter
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

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                additionalProperties = filter.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter = Filter(additionalProperties.toImmutable())
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
        fun validate(): Filter = apply {
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

            return other is Filter && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Filter{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentDataDeleteByQueryParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgentDataDeleteByQueryParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
