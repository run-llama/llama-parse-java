// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.documents

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

/** Counts of the documents in a pipeline, grouped by ingestion status. */
class DocumentGetStatusCountsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val counts: JsonField<Counts>,
    private val pipelineId: JsonField<String>,
    private val totalCount: JsonField<Long>,
    private val dataSourceId: JsonField<String>,
    private val fileId: JsonField<String>,
    private val onlyDirectUpload: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("counts") @ExcludeMissing counts: JsonField<Counts> = JsonMissing.of(),
        @JsonProperty("pipeline_id")
        @ExcludeMissing
        pipelineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_count") @ExcludeMissing totalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("data_source_id")
        @ExcludeMissing
        dataSourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("only_direct_upload")
        @ExcludeMissing
        onlyDirectUpload: JsonField<Boolean> = JsonMissing.of(),
    ) : this(counts, pipelineId, totalCount, dataSourceId, fileId, onlyDirectUpload, mutableMapOf())

    /**
     * Number of documents per ingestion status; every status is present.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counts(): Counts = counts.getRequired("counts")

    /**
     * ID of the pipeline the documents belong to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pipelineId(): String = pipelineId.getRequired("pipeline_id")

    /**
     * Total number of documents counted.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalCount(): Long = totalCount.getRequired("total_count")

    /**
     * Data source the counts were restricted to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSourceId(): Optional<String> = dataSourceId.getOptional("data_source_id")

    /**
     * File the counts were restricted to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileId(): Optional<String> = fileId.getOptional("file_id")

    /**
     * Whether only directly uploaded documents were counted.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onlyDirectUpload(): Optional<Boolean> = onlyDirectUpload.getOptional("only_direct_upload")

    /**
     * Returns the raw JSON value of [counts].
     *
     * Unlike [counts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counts") @ExcludeMissing fun _counts(): JsonField<Counts> = counts

    /**
     * Returns the raw JSON value of [pipelineId].
     *
     * Unlike [pipelineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pipeline_id") @ExcludeMissing fun _pipelineId(): JsonField<String> = pipelineId

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

    /**
     * Returns the raw JSON value of [dataSourceId].
     *
     * Unlike [dataSourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_source_id")
    @ExcludeMissing
    fun _dataSourceId(): JsonField<String> = dataSourceId

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [onlyDirectUpload].
     *
     * Unlike [onlyDirectUpload], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("only_direct_upload")
    @ExcludeMissing
    fun _onlyDirectUpload(): JsonField<Boolean> = onlyDirectUpload

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
         * [DocumentGetStatusCountsResponse].
         *
         * The following fields are required:
         * ```java
         * .counts()
         * .pipelineId()
         * .totalCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentGetStatusCountsResponse]. */
    class Builder internal constructor() {

        private var counts: JsonField<Counts>? = null
        private var pipelineId: JsonField<String>? = null
        private var totalCount: JsonField<Long>? = null
        private var dataSourceId: JsonField<String> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var onlyDirectUpload: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentGetStatusCountsResponse: DocumentGetStatusCountsResponse) =
            apply {
                counts = documentGetStatusCountsResponse.counts
                pipelineId = documentGetStatusCountsResponse.pipelineId
                totalCount = documentGetStatusCountsResponse.totalCount
                dataSourceId = documentGetStatusCountsResponse.dataSourceId
                fileId = documentGetStatusCountsResponse.fileId
                onlyDirectUpload = documentGetStatusCountsResponse.onlyDirectUpload
                additionalProperties =
                    documentGetStatusCountsResponse.additionalProperties.toMutableMap()
            }

        /** Number of documents per ingestion status; every status is present. */
        fun counts(counts: Counts) = counts(JsonField.of(counts))

        /**
         * Sets [Builder.counts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counts] with a well-typed [Counts] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun counts(counts: JsonField<Counts>) = apply { this.counts = counts }

        /** ID of the pipeline the documents belong to. */
        fun pipelineId(pipelineId: String) = pipelineId(JsonField.of(pipelineId))

        /**
         * Sets [Builder.pipelineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pipelineId(pipelineId: JsonField<String>) = apply { this.pipelineId = pipelineId }

        /** Total number of documents counted. */
        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

        /** Data source the counts were restricted to. */
        fun dataSourceId(dataSourceId: String?) = dataSourceId(JsonField.ofNullable(dataSourceId))

        /** Alias for calling [Builder.dataSourceId] with `dataSourceId.orElse(null)`. */
        fun dataSourceId(dataSourceId: Optional<String>) = dataSourceId(dataSourceId.getOrNull())

        /**
         * Sets [Builder.dataSourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataSourceId(dataSourceId: JsonField<String>) = apply {
            this.dataSourceId = dataSourceId
        }

        /** File the counts were restricted to. */
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

        /** Whether only directly uploaded documents were counted. */
        fun onlyDirectUpload(onlyDirectUpload: Boolean) =
            onlyDirectUpload(JsonField.of(onlyDirectUpload))

        /**
         * Sets [Builder.onlyDirectUpload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onlyDirectUpload] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun onlyDirectUpload(onlyDirectUpload: JsonField<Boolean>) = apply {
            this.onlyDirectUpload = onlyDirectUpload
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
         * Returns an immutable instance of [DocumentGetStatusCountsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .counts()
         * .pipelineId()
         * .totalCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentGetStatusCountsResponse =
            DocumentGetStatusCountsResponse(
                checkRequired("counts", counts),
                checkRequired("pipelineId", pipelineId),
                checkRequired("totalCount", totalCount),
                dataSourceId,
                fileId,
                onlyDirectUpload,
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
    fun validate(): DocumentGetStatusCountsResponse = apply {
        if (validated) {
            return@apply
        }

        counts().validate()
        pipelineId()
        totalCount()
        dataSourceId()
        fileId()
        onlyDirectUpload()
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
        (counts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (pipelineId.asKnown().isPresent) 1 else 0) +
            (if (totalCount.asKnown().isPresent) 1 else 0) +
            (if (dataSourceId.asKnown().isPresent) 1 else 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (if (onlyDirectUpload.asKnown().isPresent) 1 else 0)

    /** Number of documents per ingestion status; every status is present. */
    class Counts
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

            /** Returns a mutable builder for constructing an instance of [Counts]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Counts]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(counts: Counts) = apply {
                additionalProperties = counts.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Counts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Counts = Counts(additionalProperties.toImmutable())
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
        fun validate(): Counts = apply {
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

            return other is Counts && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Counts{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentGetStatusCountsResponse &&
            counts == other.counts &&
            pipelineId == other.pipelineId &&
            totalCount == other.totalCount &&
            dataSourceId == other.dataSourceId &&
            fileId == other.fileId &&
            onlyDirectUpload == other.onlyDirectUpload &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            counts,
            pipelineId,
            totalCount,
            dataSourceId,
            fileId,
            onlyDirectUpload,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentGetStatusCountsResponse{counts=$counts, pipelineId=$pipelineId, totalCount=$totalCount, dataSourceId=$dataSourceId, fileId=$fileId, onlyDirectUpload=$onlyDirectUpload, additionalProperties=$additionalProperties}"
}
