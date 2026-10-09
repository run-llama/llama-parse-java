// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.alpha.verify

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.toImmutable
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Raw per-signal detail for a completed Verify job.
 *
 * Forensic drill-down behind the simplified result: the full evidence list, per-family sub-scores,
 * raw localized regions, and heatmap overlays.
 */
class VerifyGetDetailsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val jobId: JsonField<String>,
    private val degradedTools: JsonField<List<DegradedTool>>,
    private val evidence: JsonField<List<Evidence>>,
    private val heatmaps: JsonField<List<Heatmap>>,
    private val pageDimensions: JsonField<List<PageDimension>>,
    private val regions: JsonField<List<Region>>,
    private val subScores: JsonField<SubScores>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("job_id") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("degraded_tools")
        @ExcludeMissing
        degradedTools: JsonField<List<DegradedTool>> = JsonMissing.of(),
        @JsonProperty("evidence")
        @ExcludeMissing
        evidence: JsonField<List<Evidence>> = JsonMissing.of(),
        @JsonProperty("heatmaps")
        @ExcludeMissing
        heatmaps: JsonField<List<Heatmap>> = JsonMissing.of(),
        @JsonProperty("page_dimensions")
        @ExcludeMissing
        pageDimensions: JsonField<List<PageDimension>> = JsonMissing.of(),
        @JsonProperty("regions")
        @ExcludeMissing
        regions: JsonField<List<Region>> = JsonMissing.of(),
        @JsonProperty("sub_scores")
        @ExcludeMissing
        subScores: JsonField<SubScores> = JsonMissing.of(),
    ) : this(
        jobId,
        degradedTools,
        evidence,
        heatmaps,
        pageDimensions,
        regions,
        subScores,
        mutableMapOf(),
    )

    /**
     * ID of the Verify job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jobId(): String = jobId.getRequired("job_id")

    /**
     * Checks that could not run on this job (with the reason). A check listed here produced no
     * findings because it could not run, not because the document is clean
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun degradedTools(): Optional<List<DegradedTool>> = degradedTools.getOptional("degraded_tools")

    /**
     * Evidence items produced by detection tools
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evidence(): Optional<List<Evidence>> = evidence.getOptional("evidence")

    /**
     * Per-page forensic heatmap overlays as presigned image URLs
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun heatmaps(): Optional<List<Heatmap>> = heatmaps.getOptional("heatmaps")

    /**
     * Rendered pixel size per page, so region bboxes can be scaled onto the page
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageDimensions(): Optional<List<PageDimension>> =
        pageDimensions.getOptional("page_dimensions")

    /**
     * Suspicious regions localized on rendered pages
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regions(): Optional<List<Region>> = regions.getOptional("regions")

    /**
     * Per-family scores (metadata, ai_generation, splicing, copy_move, compression, noise,
     * coherence, pdf_structure)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subScores(): Optional<SubScores> = subScores.getOptional("sub_scores")

    /**
     * Returns the raw JSON value of [jobId].
     *
     * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    /**
     * Returns the raw JSON value of [degradedTools].
     *
     * Unlike [degradedTools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("degraded_tools")
    @ExcludeMissing
    fun _degradedTools(): JsonField<List<DegradedTool>> = degradedTools

    /**
     * Returns the raw JSON value of [evidence].
     *
     * Unlike [evidence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evidence") @ExcludeMissing fun _evidence(): JsonField<List<Evidence>> = evidence

    /**
     * Returns the raw JSON value of [heatmaps].
     *
     * Unlike [heatmaps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("heatmaps") @ExcludeMissing fun _heatmaps(): JsonField<List<Heatmap>> = heatmaps

    /**
     * Returns the raw JSON value of [pageDimensions].
     *
     * Unlike [pageDimensions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_dimensions")
    @ExcludeMissing
    fun _pageDimensions(): JsonField<List<PageDimension>> = pageDimensions

    /**
     * Returns the raw JSON value of [regions].
     *
     * Unlike [regions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regions") @ExcludeMissing fun _regions(): JsonField<List<Region>> = regions

    /**
     * Returns the raw JSON value of [subScores].
     *
     * Unlike [subScores], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sub_scores") @ExcludeMissing fun _subScores(): JsonField<SubScores> = subScores

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
         * Returns a mutable builder for constructing an instance of [VerifyGetDetailsResponse].
         *
         * The following fields are required:
         * ```java
         * .jobId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerifyGetDetailsResponse]. */
    class Builder internal constructor() {

        private var jobId: JsonField<String>? = null
        private var degradedTools: JsonField<MutableList<DegradedTool>>? = null
        private var evidence: JsonField<MutableList<Evidence>>? = null
        private var heatmaps: JsonField<MutableList<Heatmap>>? = null
        private var pageDimensions: JsonField<MutableList<PageDimension>>? = null
        private var regions: JsonField<MutableList<Region>>? = null
        private var subScores: JsonField<SubScores> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(verifyGetDetailsResponse: VerifyGetDetailsResponse) = apply {
            jobId = verifyGetDetailsResponse.jobId
            degradedTools = verifyGetDetailsResponse.degradedTools.map { it.toMutableList() }
            evidence = verifyGetDetailsResponse.evidence.map { it.toMutableList() }
            heatmaps = verifyGetDetailsResponse.heatmaps.map { it.toMutableList() }
            pageDimensions = verifyGetDetailsResponse.pageDimensions.map { it.toMutableList() }
            regions = verifyGetDetailsResponse.regions.map { it.toMutableList() }
            subScores = verifyGetDetailsResponse.subScores
            additionalProperties = verifyGetDetailsResponse.additionalProperties.toMutableMap()
        }

        /** ID of the Verify job */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /**
         * Sets [Builder.jobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /**
         * Checks that could not run on this job (with the reason). A check listed here produced no
         * findings because it could not run, not because the document is clean
         */
        fun degradedTools(degradedTools: List<DegradedTool>) =
            degradedTools(JsonField.of(degradedTools))

        /**
         * Sets [Builder.degradedTools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.degradedTools] with a well-typed `List<DegradedTool>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun degradedTools(degradedTools: JsonField<List<DegradedTool>>) = apply {
            this.degradedTools = degradedTools.map { it.toMutableList() }
        }

        /**
         * Adds a single [DegradedTool] to [degradedTools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDegradedTool(degradedTool: DegradedTool) = apply {
            degradedTools =
                (degradedTools ?: JsonField.of(mutableListOf())).also {
                    checkKnown("degradedTools", it).add(degradedTool)
                }
        }

        /** Evidence items produced by detection tools */
        fun evidence(evidence: List<Evidence>) = evidence(JsonField.of(evidence))

        /**
         * Sets [Builder.evidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evidence] with a well-typed `List<Evidence>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evidence(evidence: JsonField<List<Evidence>>) = apply {
            this.evidence = evidence.map { it.toMutableList() }
        }

        /**
         * Adds a single [Evidence] to [Builder.evidence].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvidence(evidence: Evidence) = apply {
            this.evidence =
                (this.evidence ?: JsonField.of(mutableListOf())).also {
                    checkKnown("evidence", it).add(evidence)
                }
        }

        /** Per-page forensic heatmap overlays as presigned image URLs */
        fun heatmaps(heatmaps: List<Heatmap>) = heatmaps(JsonField.of(heatmaps))

        /**
         * Sets [Builder.heatmaps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.heatmaps] with a well-typed `List<Heatmap>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun heatmaps(heatmaps: JsonField<List<Heatmap>>) = apply {
            this.heatmaps = heatmaps.map { it.toMutableList() }
        }

        /**
         * Adds a single [Heatmap] to [heatmaps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHeatmap(heatmap: Heatmap) = apply {
            heatmaps =
                (heatmaps ?: JsonField.of(mutableListOf())).also {
                    checkKnown("heatmaps", it).add(heatmap)
                }
        }

        /** Rendered pixel size per page, so region bboxes can be scaled onto the page */
        fun pageDimensions(pageDimensions: List<PageDimension>) =
            pageDimensions(JsonField.of(pageDimensions))

        /**
         * Sets [Builder.pageDimensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageDimensions] with a well-typed `List<PageDimension>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pageDimensions(pageDimensions: JsonField<List<PageDimension>>) = apply {
            this.pageDimensions = pageDimensions.map { it.toMutableList() }
        }

        /**
         * Adds a single [PageDimension] to [pageDimensions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPageDimension(pageDimension: PageDimension) = apply {
            pageDimensions =
                (pageDimensions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pageDimensions", it).add(pageDimension)
                }
        }

        /** Suspicious regions localized on rendered pages */
        fun regions(regions: List<Region>) = regions(JsonField.of(regions))

        /**
         * Sets [Builder.regions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regions] with a well-typed `List<Region>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regions(regions: JsonField<List<Region>>) = apply {
            this.regions = regions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Region] to [regions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegion(region: Region) = apply {
            regions =
                (regions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("regions", it).add(region)
                }
        }

        /**
         * Per-family scores (metadata, ai_generation, splicing, copy_move, compression, noise,
         * coherence, pdf_structure)
         */
        fun subScores(subScores: SubScores) = subScores(JsonField.of(subScores))

        /**
         * Sets [Builder.subScores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subScores] with a well-typed [SubScores] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subScores(subScores: JsonField<SubScores>) = apply { this.subScores = subScores }

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
         * Returns an immutable instance of [VerifyGetDetailsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .jobId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerifyGetDetailsResponse =
            VerifyGetDetailsResponse(
                checkRequired("jobId", jobId),
                (degradedTools ?: JsonMissing.of()).map { it.toImmutable() },
                (evidence ?: JsonMissing.of()).map { it.toImmutable() },
                (heatmaps ?: JsonMissing.of()).map { it.toImmutable() },
                (pageDimensions ?: JsonMissing.of()).map { it.toImmutable() },
                (regions ?: JsonMissing.of()).map { it.toImmutable() },
                subScores,
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
    fun validate(): VerifyGetDetailsResponse = apply {
        if (validated) {
            return@apply
        }

        jobId()
        degradedTools().ifPresent { it.forEach { it.validate() } }
        evidence().ifPresent { it.forEach { it.validate() } }
        heatmaps().ifPresent { it.forEach { it.validate() } }
        pageDimensions().ifPresent { it.forEach { it.validate() } }
        regions().ifPresent { it.forEach { it.validate() } }
        subScores().ifPresent { it.validate() }
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
        (if (jobId.asKnown().isPresent) 1 else 0) +
            (degradedTools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (evidence.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (heatmaps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pageDimensions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (regions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (subScores.asKnown().getOrNull()?.validity() ?: 0)

    /** A check that was attempted but could not run on this job. */
    class DegradedTool
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val tool: JsonField<String>,
        private val reason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("tool") @ExcludeMissing tool: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        ) : this(tool, reason, mutableMapOf())

        /**
         * Name of the check
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tool(): String = tool.getRequired("tool")

        /**
         * Why the check could not run
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * Returns the raw JSON value of [tool].
         *
         * Unlike [tool], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool") @ExcludeMissing fun _tool(): JsonField<String> = tool

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
             * Returns a mutable builder for constructing an instance of [DegradedTool].
             *
             * The following fields are required:
             * ```java
             * .tool()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DegradedTool]. */
        class Builder internal constructor() {

            private var tool: JsonField<String>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(degradedTool: DegradedTool) = apply {
                tool = degradedTool.tool
                reason = degradedTool.reason
                additionalProperties = degradedTool.additionalProperties.toMutableMap()
            }

            /** Name of the check */
            fun tool(tool: String) = tool(JsonField.of(tool))

            /**
             * Sets [Builder.tool] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tool] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tool(tool: JsonField<String>) = apply { this.tool = tool }

            /** Why the check could not run */
            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
             * Returns an immutable instance of [DegradedTool].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .tool()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DegradedTool =
                DegradedTool(
                    checkRequired("tool", tool),
                    reason,
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
        fun validate(): DegradedTool = apply {
            if (validated) {
                return@apply
            }

            tool()
            reason()
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
            (if (tool.asKnown().isPresent) 1 else 0) + (if (reason.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DegradedTool &&
                tool == other.tool &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(tool, reason, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DegradedTool{tool=$tool, reason=$reason, additionalProperties=$additionalProperties}"
    }

    /** A single piece of evidence produced by a detection tool. */
    class Evidence
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val detail: JsonField<String>,
        private val family: JsonField<String>,
        private val score: JsonField<Double>,
        private val tool: JsonField<String>,
        private val data: JsonField<Data>,
        private val hard: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("detail") @ExcludeMissing detail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("family") @ExcludeMissing family: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tool") @ExcludeMissing tool: JsonField<String> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("hard") @ExcludeMissing hard: JsonField<Boolean> = JsonMissing.of(),
        ) : this(code, detail, family, score, tool, data, hard, mutableMapOf())

        /**
         * Machine-readable evidence code
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * Human-readable evidence detail
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun detail(): String = detail.getRequired("detail")

        /**
         * Signal family (e.g. metadata, splicing, compression)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun family(): String = family.getRequired("family")

        /**
         * Evidence strength score
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun score(): Double = score.getRequired("score")

        /**
         * Tool that produced this evidence
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tool(): String = tool.getRequired("tool")

        /**
         * Tool-specific structured payload
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun data(): Optional<Data> = data.getOptional("data")

        /**
         * Whether this is hard (conclusive) evidence
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hard(): Optional<Boolean> = hard.getOptional("hard")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [detail].
         *
         * Unlike [detail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detail") @ExcludeMissing fun _detail(): JsonField<String> = detail

        /**
         * Returns the raw JSON value of [family].
         *
         * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<String> = family

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

        /**
         * Returns the raw JSON value of [tool].
         *
         * Unlike [tool], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool") @ExcludeMissing fun _tool(): JsonField<String> = tool

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /**
         * Returns the raw JSON value of [hard].
         *
         * Unlike [hard], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hard") @ExcludeMissing fun _hard(): JsonField<Boolean> = hard

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
             * Returns a mutable builder for constructing an instance of [Evidence].
             *
             * The following fields are required:
             * ```java
             * .code()
             * .detail()
             * .family()
             * .score()
             * .tool()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Evidence]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var detail: JsonField<String>? = null
            private var family: JsonField<String>? = null
            private var score: JsonField<Double>? = null
            private var tool: JsonField<String>? = null
            private var data: JsonField<Data> = JsonMissing.of()
            private var hard: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(evidence: Evidence) = apply {
                code = evidence.code
                detail = evidence.detail
                family = evidence.family
                score = evidence.score
                tool = evidence.tool
                data = evidence.data
                hard = evidence.hard
                additionalProperties = evidence.additionalProperties.toMutableMap()
            }

            /** Machine-readable evidence code */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Human-readable evidence detail */
            fun detail(detail: String) = detail(JsonField.of(detail))

            /**
             * Sets [Builder.detail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detail(detail: JsonField<String>) = apply { this.detail = detail }

            /** Signal family (e.g. metadata, splicing, compression) */
            fun family(family: String) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun family(family: JsonField<String>) = apply { this.family = family }

            /** Evidence strength score */
            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            /** Tool that produced this evidence */
            fun tool(tool: String) = tool(JsonField.of(tool))

            /**
             * Sets [Builder.tool] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tool] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tool(tool: JsonField<String>) = apply { this.tool = tool }

            /** Tool-specific structured payload */
            fun data(data: Data) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [Data] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<Data>) = apply { this.data = data }

            /** Whether this is hard (conclusive) evidence */
            fun hard(hard: Boolean) = hard(JsonField.of(hard))

            /**
             * Sets [Builder.hard] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hard] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hard(hard: JsonField<Boolean>) = apply { this.hard = hard }

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
             * Returns an immutable instance of [Evidence].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .code()
             * .detail()
             * .family()
             * .score()
             * .tool()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Evidence =
                Evidence(
                    checkRequired("code", code),
                    checkRequired("detail", detail),
                    checkRequired("family", family),
                    checkRequired("score", score),
                    checkRequired("tool", tool),
                    data,
                    hard,
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
        fun validate(): Evidence = apply {
            if (validated) {
                return@apply
            }

            code()
            detail()
            family()
            score()
            tool()
            data().ifPresent { it.validate() }
            hard()
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (if (detail.asKnown().isPresent) 1 else 0) +
                (if (family.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0) +
                (if (tool.asKnown().isPresent) 1 else 0) +
                (data.asKnown().getOrNull()?.validity() ?: 0) +
                (if (hard.asKnown().isPresent) 1 else 0)

        /** Tool-specific structured payload */
        class Data
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

                /** Returns a mutable builder for constructing an instance of [Data]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Data]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(data: Data) = apply {
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Data].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Data = Data(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Data = apply {
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

                return other is Data && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Data{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Evidence &&
                code == other.code &&
                detail == other.detail &&
                family == other.family &&
                score == other.score &&
                tool == other.tool &&
                data == other.data &&
                hard == other.hard &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(code, detail, family, score, tool, data, hard, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Evidence{code=$code, detail=$detail, family=$family, score=$score, tool=$tool, data=$data, hard=$hard, additionalProperties=$additionalProperties}"
    }

    /** A per-page forensic heatmap overlay, as a presigned image URL. */
    class Heatmap
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expiresAt: JsonField<OffsetDateTime>,
        private val kind: JsonField<String>,
        private val page: JsonField<Long>,
        private val url: JsonField<String>,
        private val score: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("kind") @ExcludeMissing kind: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
        ) : this(expiresAt, kind, page, url, score, mutableMapOf())

        /**
         * The time at which the presigned URL expires
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

        /**
         * Producing signal, e.g. double_compression, ela, noise
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun kind(): String = kind.getRequired("kind")

        /**
         * 0-based page index (0 for standalone images)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun page(): Long = page.getRequired("page")

        /**
         * Presigned URL to the heatmap PNG (page overlay)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Producing tool's max score (for ranking)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [kind].
         *
         * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<String> = kind

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

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
             * Returns a mutable builder for constructing an instance of [Heatmap].
             *
             * The following fields are required:
             * ```java
             * .expiresAt()
             * .kind()
             * .page()
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Heatmap]. */
        class Builder internal constructor() {

            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var kind: JsonField<String>? = null
            private var page: JsonField<Long>? = null
            private var url: JsonField<String>? = null
            private var score: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(heatmap: Heatmap) = apply {
                expiresAt = heatmap.expiresAt
                kind = heatmap.kind
                page = heatmap.page
                url = heatmap.url
                score = heatmap.score
                additionalProperties = heatmap.additionalProperties.toMutableMap()
            }

            /** The time at which the presigned URL expires */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /** Producing signal, e.g. double_compression, ela, noise */
            fun kind(kind: String) = kind(JsonField.of(kind))

            /**
             * Sets [Builder.kind] to an arbitrary JSON value.
             *
             * You should usually call [Builder.kind] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun kind(kind: JsonField<String>) = apply { this.kind = kind }

            /** 0-based page index (0 for standalone images) */
            fun page(page: Long) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<Long>) = apply { this.page = page }

            /** Presigned URL to the heatmap PNG (page overlay) */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Producing tool's max score (for ranking) */
            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

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
             * Returns an immutable instance of [Heatmap].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .expiresAt()
             * .kind()
             * .page()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Heatmap =
                Heatmap(
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("kind", kind),
                    checkRequired("page", page),
                    checkRequired("url", url),
                    score,
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
        fun validate(): Heatmap = apply {
            if (validated) {
                return@apply
            }

            expiresAt()
            kind()
            page()
            url()
            score()
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
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (kind.asKnown().isPresent) 1 else 0) +
                (if (page.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Heatmap &&
                expiresAt == other.expiresAt &&
                kind == other.kind &&
                page == other.page &&
                url == other.url &&
                score == other.score &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(expiresAt, kind, page, url, score, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Heatmap{expiresAt=$expiresAt, kind=$kind, page=$page, url=$url, score=$score, additionalProperties=$additionalProperties}"
    }

    /**
     * Rendered pixel size of a page — the coordinate space region bboxes use, so the UI can scale
     * the suspect-region overlay onto the displayed page.
     */
    class PageDimension
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val height: JsonField<Long>,
        private val page: JsonField<Long>,
        private val width: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("height") @ExcludeMissing height: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
        ) : this(height, page, width, mutableMapOf())

        /**
         * Rendered page height in pixels
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun height(): Long = height.getRequired("height")

        /**
         * 0-based page index (0 for standalone images)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun page(): Long = page.getRequired("page")

        /**
         * Rendered page width in pixels
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun width(): Long = width.getRequired("width")

        /**
         * Returns the raw JSON value of [height].
         *
         * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

        /**
         * Returns the raw JSON value of [width].
         *
         * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

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
             * Returns a mutable builder for constructing an instance of [PageDimension].
             *
             * The following fields are required:
             * ```java
             * .height()
             * .page()
             * .width()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PageDimension]. */
        class Builder internal constructor() {

            private var height: JsonField<Long>? = null
            private var page: JsonField<Long>? = null
            private var width: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pageDimension: PageDimension) = apply {
                height = pageDimension.height
                page = pageDimension.page
                width = pageDimension.width
                additionalProperties = pageDimension.additionalProperties.toMutableMap()
            }

            /** Rendered page height in pixels */
            fun height(height: Long) = height(JsonField.of(height))

            /**
             * Sets [Builder.height] to an arbitrary JSON value.
             *
             * You should usually call [Builder.height] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun height(height: JsonField<Long>) = apply { this.height = height }

            /** 0-based page index (0 for standalone images) */
            fun page(page: Long) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<Long>) = apply { this.page = page }

            /** Rendered page width in pixels */
            fun width(width: Long) = width(JsonField.of(width))

            /**
             * Sets [Builder.width] to an arbitrary JSON value.
             *
             * You should usually call [Builder.width] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun width(width: JsonField<Long>) = apply { this.width = width }

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
             * Returns an immutable instance of [PageDimension].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .height()
             * .page()
             * .width()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PageDimension =
                PageDimension(
                    checkRequired("height", height),
                    checkRequired("page", page),
                    checkRequired("width", width),
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
        fun validate(): PageDimension = apply {
            if (validated) {
                return@apply
            }

            height()
            page()
            width()
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
            (if (height.asKnown().isPresent) 1 else 0) +
                (if (page.asKnown().isPresent) 1 else 0) +
                (if (width.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PageDimension &&
                height == other.height &&
                page == other.page &&
                width == other.width &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(height, page, width, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PageDimension{height=$height, page=$page, width=$width, additionalProperties=$additionalProperties}"
    }

    /** A suspicious region localized on a rendered page. */
    class Region
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bbox: JsonField<List<Long>>,
        private val detail: JsonField<String>,
        private val kind: JsonField<String>,
        private val page: JsonField<Long>,
        private val score: JsonField<Double>,
        private val source: JsonField<String>,
        private val primary: JsonField<Boolean>,
        private val review: JsonField<String>,
        private val reviewNote: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("detail") @ExcludeMissing detail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("kind") @ExcludeMissing kind: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary") @ExcludeMissing primary: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("review") @ExcludeMissing review: JsonField<String> = JsonMissing.of(),
            @JsonProperty("review_note")
            @ExcludeMissing
            reviewNote: JsonField<String> = JsonMissing.of(),
        ) : this(
            bbox,
            detail,
            kind,
            page,
            score,
            source,
            primary,
            review,
            reviewNote,
            mutableMapOf(),
        )

        /**
         * Region bounding box as [x, y, w, h] in page-render pixels
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bbox(): List<Long> = bbox.getRequired("bbox")

        /**
         * Human-readable detail about the region
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun detail(): String = detail.getRequired("detail")

        /**
         * Kind of anomaly detected in this region
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun kind(): String = kind.getRequired("kind")

        /**
         * 0-based page index (0 for standalone images)
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun page(): Long = page.getRequired("page")

        /**
         * Region-level doctoring likelihood score
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun score(): Double = score.getRequired("score")

        /**
         * Detector/tool that produced this region
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Whether this region is part of the small set of decisive evidence behind the verdict —
         * the boxes a reviewer should look at first
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun primary(): Optional<Boolean> = primary.getOptional("primary")

        /**
         * Review status/verdict for this region
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun review(): Optional<String> = review.getOptional("review")

        /**
         * Free-form review note for this region
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reviewNote(): Optional<String> = reviewNote.getOptional("review_note")

        /**
         * Returns the raw JSON value of [bbox].
         *
         * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<List<Long>> = bbox

        /**
         * Returns the raw JSON value of [detail].
         *
         * Unlike [detail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detail") @ExcludeMissing fun _detail(): JsonField<String> = detail

        /**
         * Returns the raw JSON value of [kind].
         *
         * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<String> = kind

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [primary].
         *
         * Unlike [primary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("primary") @ExcludeMissing fun _primary(): JsonField<Boolean> = primary

        /**
         * Returns the raw JSON value of [review].
         *
         * Unlike [review], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("review") @ExcludeMissing fun _review(): JsonField<String> = review

        /**
         * Returns the raw JSON value of [reviewNote].
         *
         * Unlike [reviewNote], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("review_note")
        @ExcludeMissing
        fun _reviewNote(): JsonField<String> = reviewNote

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
             * Returns a mutable builder for constructing an instance of [Region].
             *
             * The following fields are required:
             * ```java
             * .bbox()
             * .detail()
             * .kind()
             * .page()
             * .score()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Region]. */
        class Builder internal constructor() {

            private var bbox: JsonField<MutableList<Long>>? = null
            private var detail: JsonField<String>? = null
            private var kind: JsonField<String>? = null
            private var page: JsonField<Long>? = null
            private var score: JsonField<Double>? = null
            private var source: JsonField<String>? = null
            private var primary: JsonField<Boolean> = JsonMissing.of()
            private var review: JsonField<String> = JsonMissing.of()
            private var reviewNote: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(region: Region) = apply {
                bbox = region.bbox.map { it.toMutableList() }
                detail = region.detail
                kind = region.kind
                page = region.page
                score = region.score
                source = region.source
                primary = region.primary
                review = region.review
                reviewNote = region.reviewNote
                additionalProperties = region.additionalProperties.toMutableMap()
            }

            /** Region bounding box as [x, y, w, h] in page-render pixels */
            fun bbox(bbox: List<Long>) = bbox(JsonField.of(bbox))

            /**
             * Sets [Builder.bbox] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bbox] with a well-typed `List<Long>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bbox(bbox: JsonField<List<Long>>) = apply {
                this.bbox = bbox.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [Builder.bbox].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBbox(bbox: Long) = apply {
                this.bbox =
                    (this.bbox ?: JsonField.of(mutableListOf())).also {
                        checkKnown("bbox", it).add(bbox)
                    }
            }

            /** Human-readable detail about the region */
            fun detail(detail: String) = detail(JsonField.of(detail))

            /**
             * Sets [Builder.detail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detail(detail: JsonField<String>) = apply { this.detail = detail }

            /** Kind of anomaly detected in this region */
            fun kind(kind: String) = kind(JsonField.of(kind))

            /**
             * Sets [Builder.kind] to an arbitrary JSON value.
             *
             * You should usually call [Builder.kind] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun kind(kind: JsonField<String>) = apply { this.kind = kind }

            /** 0-based page index (0 for standalone images) */
            fun page(page: Long) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<Long>) = apply { this.page = page }

            /** Region-level doctoring likelihood score */
            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            /** Detector/tool that produced this region */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /**
             * Whether this region is part of the small set of decisive evidence behind the verdict
             * — the boxes a reviewer should look at first
             */
            fun primary(primary: Boolean) = primary(JsonField.of(primary))

            /**
             * Sets [Builder.primary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primary] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primary(primary: JsonField<Boolean>) = apply { this.primary = primary }

            /** Review status/verdict for this region */
            fun review(review: String) = review(JsonField.of(review))

            /**
             * Sets [Builder.review] to an arbitrary JSON value.
             *
             * You should usually call [Builder.review] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun review(review: JsonField<String>) = apply { this.review = review }

            /** Free-form review note for this region */
            fun reviewNote(reviewNote: String) = reviewNote(JsonField.of(reviewNote))

            /**
             * Sets [Builder.reviewNote] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reviewNote] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reviewNote(reviewNote: JsonField<String>) = apply { this.reviewNote = reviewNote }

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
             * Returns an immutable instance of [Region].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .bbox()
             * .detail()
             * .kind()
             * .page()
             * .score()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Region =
                Region(
                    checkRequired("bbox", bbox).map { it.toImmutable() },
                    checkRequired("detail", detail),
                    checkRequired("kind", kind),
                    checkRequired("page", page),
                    checkRequired("score", score),
                    checkRequired("source", source),
                    primary,
                    review,
                    reviewNote,
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
        fun validate(): Region = apply {
            if (validated) {
                return@apply
            }

            bbox()
            detail()
            kind()
            page()
            score()
            source()
            primary()
            review()
            reviewNote()
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
            (bbox.asKnown().getOrNull()?.size ?: 0) +
                (if (detail.asKnown().isPresent) 1 else 0) +
                (if (kind.asKnown().isPresent) 1 else 0) +
                (if (page.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (primary.asKnown().isPresent) 1 else 0) +
                (if (review.asKnown().isPresent) 1 else 0) +
                (if (reviewNote.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Region &&
                bbox == other.bbox &&
                detail == other.detail &&
                kind == other.kind &&
                page == other.page &&
                score == other.score &&
                source == other.source &&
                primary == other.primary &&
                review == other.review &&
                reviewNote == other.reviewNote &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bbox,
                detail,
                kind,
                page,
                score,
                source,
                primary,
                review,
                reviewNote,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Region{bbox=$bbox, detail=$detail, kind=$kind, page=$page, score=$score, source=$source, primary=$primary, review=$review, reviewNote=$reviewNote, additionalProperties=$additionalProperties}"
    }

    /**
     * Per-family scores (metadata, ai_generation, splicing, copy_move, compression, noise,
     * coherence, pdf_structure)
     */
    class SubScores
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

            /** Returns a mutable builder for constructing an instance of [SubScores]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubScores]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subScores: SubScores) = apply {
                additionalProperties = subScores.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SubScores].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SubScores = SubScores(additionalProperties.toImmutable())
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
        fun validate(): SubScores = apply {
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

            return other is SubScores && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SubScores{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerifyGetDetailsResponse &&
            jobId == other.jobId &&
            degradedTools == other.degradedTools &&
            evidence == other.evidence &&
            heatmaps == other.heatmaps &&
            pageDimensions == other.pageDimensions &&
            regions == other.regions &&
            subScores == other.subScores &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            jobId,
            degradedTools,
            evidence,
            heatmaps,
            pageDimensions,
            regions,
            subScores,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerifyGetDetailsResponse{jobId=$jobId, degradedTools=$degradedTools, evidence=$evidence, heatmaps=$heatmaps, pageDimensions=$pageDimensions, regions=$regions, subScores=$subScores, additionalProperties=$additionalProperties}"
}
