// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.datasources

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
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update the configuration of a data source in a pipeline. */
class DataSourceUpdateParams
private constructor(
    private val pipelineId: String,
    private val dataSourceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pipelineId(): String = pipelineId

    fun dataSourceId(): Optional<String> = Optional.ofNullable(dataSourceId)

    /**
     * The interval at which the data source should be synced.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun syncInterval(): Optional<Double> = body.syncInterval()

    /**
     * Returns the raw JSON value of [syncInterval].
     *
     * Unlike [syncInterval], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _syncInterval(): JsonField<Double> = body._syncInterval()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataSourceUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .pipelineId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataSourceUpdateParams]. */
    class Builder internal constructor() {

        private var pipelineId: String? = null
        private var dataSourceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataSourceUpdateParams: DataSourceUpdateParams) = apply {
            pipelineId = dataSourceUpdateParams.pipelineId
            dataSourceId = dataSourceUpdateParams.dataSourceId
            body = dataSourceUpdateParams.body.toBuilder()
            additionalHeaders = dataSourceUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = dataSourceUpdateParams.additionalQueryParams.toBuilder()
        }

        fun pipelineId(pipelineId: String) = apply { this.pipelineId = pipelineId }

        fun dataSourceId(dataSourceId: String?) = apply { this.dataSourceId = dataSourceId }

        /** Alias for calling [Builder.dataSourceId] with `dataSourceId.orElse(null)`. */
        fun dataSourceId(dataSourceId: Optional<String>) = dataSourceId(dataSourceId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [syncInterval]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The interval at which the data source should be synced. */
        fun syncInterval(syncInterval: Double?) = apply { body.syncInterval(syncInterval) }

        /**
         * Alias for [Builder.syncInterval].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun syncInterval(syncInterval: Double) = syncInterval(syncInterval as Double?)

        /** Alias for calling [Builder.syncInterval] with `syncInterval.orElse(null)`. */
        fun syncInterval(syncInterval: Optional<Double>) = syncInterval(syncInterval.getOrNull())

        /**
         * Sets [Builder.syncInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syncInterval] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun syncInterval(syncInterval: JsonField<Double>) = apply {
            body.syncInterval(syncInterval)
        }

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
         * Returns an immutable instance of [DataSourceUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pipelineId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataSourceUpdateParams =
            DataSourceUpdateParams(
                checkRequired("pipelineId", pipelineId),
                dataSourceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pipelineId
            1 -> dataSourceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Schema for updating an association between a data source and a pipeline. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val syncInterval: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sync_interval")
            @ExcludeMissing
            syncInterval: JsonField<Double> = JsonMissing.of()
        ) : this(syncInterval, mutableMapOf())

        /**
         * The interval at which the data source should be synced.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun syncInterval(): Optional<Double> = syncInterval.getOptional("sync_interval")

        /**
         * Returns the raw JSON value of [syncInterval].
         *
         * Unlike [syncInterval], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sync_interval")
        @ExcludeMissing
        fun _syncInterval(): JsonField<Double> = syncInterval

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var syncInterval: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                syncInterval = body.syncInterval
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The interval at which the data source should be synced. */
            fun syncInterval(syncInterval: Double?) =
                syncInterval(JsonField.ofNullable(syncInterval))

            /**
             * Alias for [Builder.syncInterval].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun syncInterval(syncInterval: Double) = syncInterval(syncInterval as Double?)

            /** Alias for calling [Builder.syncInterval] with `syncInterval.orElse(null)`. */
            fun syncInterval(syncInterval: Optional<Double>) =
                syncInterval(syncInterval.getOrNull())

            /**
             * Sets [Builder.syncInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.syncInterval] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun syncInterval(syncInterval: JsonField<Double>) = apply {
                this.syncInterval = syncInterval
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(syncInterval, additionalProperties.toMutableMap())
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

            syncInterval()
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
        internal fun validity(): Int = (if (syncInterval.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                syncInterval == other.syncInterval &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(syncInterval, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{syncInterval=$syncInterval, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataSourceUpdateParams &&
            pipelineId == other.pipelineId &&
            dataSourceId == other.dataSourceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pipelineId, dataSourceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DataSourceUpdateParams{pipelineId=$pipelineId, dataSourceId=$dataSourceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
