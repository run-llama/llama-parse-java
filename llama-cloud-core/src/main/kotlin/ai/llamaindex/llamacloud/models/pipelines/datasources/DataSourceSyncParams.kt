// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.datasources

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

/** Run incremental ingestion: pull upstream changes from the data source into the data sink. */
@Deprecated("deprecated")
class DataSourceSyncParams
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
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pipelineFileIds(): Optional<List<String>> = body.pipelineFileIds()

    /**
     * Returns the raw JSON value of [pipelineFileIds].
     *
     * Unlike [pipelineFileIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pipelineFileIds(): JsonField<List<String>> = body._pipelineFileIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataSourceSyncParams].
         *
         * The following fields are required:
         * ```java
         * .pipelineId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataSourceSyncParams]. */
    class Builder internal constructor() {

        private var pipelineId: String? = null
        private var dataSourceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataSourceSyncParams: DataSourceSyncParams) = apply {
            pipelineId = dataSourceSyncParams.pipelineId
            dataSourceId = dataSourceSyncParams.dataSourceId
            body = dataSourceSyncParams.body.toBuilder()
            additionalHeaders = dataSourceSyncParams.additionalHeaders.toBuilder()
            additionalQueryParams = dataSourceSyncParams.additionalQueryParams.toBuilder()
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
         * - [pipelineFileIds]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun pipelineFileIds(pipelineFileIds: List<String>?) = apply {
            body.pipelineFileIds(pipelineFileIds)
        }

        /** Alias for calling [Builder.pipelineFileIds] with `pipelineFileIds.orElse(null)`. */
        fun pipelineFileIds(pipelineFileIds: Optional<List<String>>) =
            pipelineFileIds(pipelineFileIds.getOrNull())

        /**
         * Sets [Builder.pipelineFileIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineFileIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pipelineFileIds(pipelineFileIds: JsonField<List<String>>) = apply {
            body.pipelineFileIds(pipelineFileIds)
        }

        /**
         * Adds a single [String] to [pipelineFileIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPipelineFileId(pipelineFileId: String) = apply {
            body.addPipelineFileId(pipelineFileId)
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
         * Returns an immutable instance of [DataSourceSyncParams].
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
        fun build(): DataSourceSyncParams =
            DataSourceSyncParams(
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

    /**
     * Request model for syncing pipeline data sources.
     *
     * Notes:
     * - This endpoint pulls from the 3p data source and parses.
     * - We accept pipeline_file_ids for now because callers (e.g. add_files_to_pipeline) often have
     *   these IDs handy. Internally we map them to external IDs to filter the reader, which
     *   enumerates by external ID.
     * - Likely to evolve to take external IDs directly; keeping this for convenience.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pipelineFileIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pipeline_file_ids")
            @ExcludeMissing
            pipelineFileIds: JsonField<List<String>> = JsonMissing.of()
        ) : this(pipelineFileIds, mutableMapOf())

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pipelineFileIds(): Optional<List<String>> =
            pipelineFileIds.getOptional("pipeline_file_ids")

        /**
         * Returns the raw JSON value of [pipelineFileIds].
         *
         * Unlike [pipelineFileIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pipeline_file_ids")
        @ExcludeMissing
        fun _pipelineFileIds(): JsonField<List<String>> = pipelineFileIds

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

            private var pipelineFileIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                pipelineFileIds = body.pipelineFileIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun pipelineFileIds(pipelineFileIds: List<String>?) =
                pipelineFileIds(JsonField.ofNullable(pipelineFileIds))

            /** Alias for calling [Builder.pipelineFileIds] with `pipelineFileIds.orElse(null)`. */
            fun pipelineFileIds(pipelineFileIds: Optional<List<String>>) =
                pipelineFileIds(pipelineFileIds.getOrNull())

            /**
             * Sets [Builder.pipelineFileIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pipelineFileIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pipelineFileIds(pipelineFileIds: JsonField<List<String>>) = apply {
                this.pipelineFileIds = pipelineFileIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [pipelineFileIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPipelineFileId(pipelineFileId: String) = apply {
                pipelineFileIds =
                    (pipelineFileIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pipelineFileIds", it).add(pipelineFileId)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (pipelineFileIds ?: JsonMissing.of()).map { it.toImmutable() },
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

            pipelineFileIds()
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
        internal fun validity(): Int = (pipelineFileIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                pipelineFileIds == other.pipelineFileIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pipelineFileIds, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{pipelineFileIds=$pipelineFileIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataSourceSyncParams &&
            pipelineId == other.pipelineId &&
            dataSourceId == other.dataSourceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pipelineId, dataSourceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DataSourceSyncParams{pipelineId=$pipelineId, dataSourceId=$dataSourceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
