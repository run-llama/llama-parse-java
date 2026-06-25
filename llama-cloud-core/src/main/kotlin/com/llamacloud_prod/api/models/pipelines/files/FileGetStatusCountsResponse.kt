// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.files

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FileGetStatusCountsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val counts: JsonField<Counts>,
    private val totalCount: JsonField<Long>,
    private val dataSourceId: JsonField<String>,
    private val onlyManuallyUploaded: JsonField<Boolean>,
    private val pipelineId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("counts") @ExcludeMissing counts: JsonField<Counts> = JsonMissing.of(),
        @JsonProperty("total_count") @ExcludeMissing totalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("data_source_id")
        @ExcludeMissing
        dataSourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("only_manually_uploaded")
        @ExcludeMissing
        onlyManuallyUploaded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("pipeline_id")
        @ExcludeMissing
        pipelineId: JsonField<String> = JsonMissing.of(),
    ) : this(counts, totalCount, dataSourceId, onlyManuallyUploaded, pipelineId, mutableMapOf())

    /**
     * The counts of files by status
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counts(): Counts = counts.getRequired("counts")

    /**
     * The total number of files
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalCount(): Long = totalCount.getRequired("total_count")

    /**
     * The ID of the data source that the files belong to
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSourceId(): Optional<String> = dataSourceId.getOptional("data_source_id")

    /**
     * Whether to only count manually uploaded files
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onlyManuallyUploaded(): Optional<Boolean> =
        onlyManuallyUploaded.getOptional("only_manually_uploaded")

    /**
     * The ID of the pipeline that the files belong to
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pipelineId(): Optional<String> = pipelineId.getOptional("pipeline_id")

    /**
     * Returns the raw JSON value of [counts].
     *
     * Unlike [counts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counts") @ExcludeMissing fun _counts(): JsonField<Counts> = counts

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
     * Returns the raw JSON value of [onlyManuallyUploaded].
     *
     * Unlike [onlyManuallyUploaded], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("only_manually_uploaded")
    @ExcludeMissing
    fun _onlyManuallyUploaded(): JsonField<Boolean> = onlyManuallyUploaded

    /**
     * Returns the raw JSON value of [pipelineId].
     *
     * Unlike [pipelineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pipeline_id") @ExcludeMissing fun _pipelineId(): JsonField<String> = pipelineId

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
         * Returns a mutable builder for constructing an instance of [FileGetStatusCountsResponse].
         *
         * The following fields are required:
         * ```java
         * .counts()
         * .totalCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileGetStatusCountsResponse]. */
    class Builder internal constructor() {

        private var counts: JsonField<Counts>? = null
        private var totalCount: JsonField<Long>? = null
        private var dataSourceId: JsonField<String> = JsonMissing.of()
        private var onlyManuallyUploaded: JsonField<Boolean> = JsonMissing.of()
        private var pipelineId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileGetStatusCountsResponse: FileGetStatusCountsResponse) = apply {
            counts = fileGetStatusCountsResponse.counts
            totalCount = fileGetStatusCountsResponse.totalCount
            dataSourceId = fileGetStatusCountsResponse.dataSourceId
            onlyManuallyUploaded = fileGetStatusCountsResponse.onlyManuallyUploaded
            pipelineId = fileGetStatusCountsResponse.pipelineId
            additionalProperties = fileGetStatusCountsResponse.additionalProperties.toMutableMap()
        }

        /** The counts of files by status */
        fun counts(counts: Counts) = counts(JsonField.of(counts))

        /**
         * Sets [Builder.counts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counts] with a well-typed [Counts] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun counts(counts: JsonField<Counts>) = apply { this.counts = counts }

        /** The total number of files */
        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

        /** The ID of the data source that the files belong to */
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

        /** Whether to only count manually uploaded files */
        fun onlyManuallyUploaded(onlyManuallyUploaded: Boolean) =
            onlyManuallyUploaded(JsonField.of(onlyManuallyUploaded))

        /**
         * Sets [Builder.onlyManuallyUploaded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onlyManuallyUploaded] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun onlyManuallyUploaded(onlyManuallyUploaded: JsonField<Boolean>) = apply {
            this.onlyManuallyUploaded = onlyManuallyUploaded
        }

        /** The ID of the pipeline that the files belong to */
        fun pipelineId(pipelineId: String?) = pipelineId(JsonField.ofNullable(pipelineId))

        /** Alias for calling [Builder.pipelineId] with `pipelineId.orElse(null)`. */
        fun pipelineId(pipelineId: Optional<String>) = pipelineId(pipelineId.getOrNull())

        /**
         * Sets [Builder.pipelineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pipelineId(pipelineId: JsonField<String>) = apply { this.pipelineId = pipelineId }

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
         * Returns an immutable instance of [FileGetStatusCountsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .counts()
         * .totalCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileGetStatusCountsResponse =
            FileGetStatusCountsResponse(
                checkRequired("counts", counts),
                checkRequired("totalCount", totalCount),
                dataSourceId,
                onlyManuallyUploaded,
                pipelineId,
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
    fun validate(): FileGetStatusCountsResponse = apply {
        if (validated) {
            return@apply
        }

        counts().validate()
        totalCount()
        dataSourceId()
        onlyManuallyUploaded()
        pipelineId()
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
            (if (totalCount.asKnown().isPresent) 1 else 0) +
            (if (dataSourceId.asKnown().isPresent) 1 else 0) +
            (if (onlyManuallyUploaded.asKnown().isPresent) 1 else 0) +
            (if (pipelineId.asKnown().isPresent) 1 else 0)

    /** The counts of files by status */
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

        return other is FileGetStatusCountsResponse &&
            counts == other.counts &&
            totalCount == other.totalCount &&
            dataSourceId == other.dataSourceId &&
            onlyManuallyUploaded == other.onlyManuallyUploaded &&
            pipelineId == other.pipelineId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            counts,
            totalCount,
            dataSourceId,
            onlyManuallyUploaded,
            pipelineId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileGetStatusCountsResponse{counts=$counts, totalCount=$totalCount, dataSourceId=$dataSourceId, onlyManuallyUploaded=$onlyManuallyUploaded, pipelineId=$pipelineId, additionalProperties=$additionalProperties}"
}
