// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.BaseDeserializer
import com.llamacloud_prod.api.core.BaseSerializer
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.allMaxBy
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.getOrThrow
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Parse result response with job status and optional content or metadata.
 *
 * The job field is always included. Other fields are included based on expand parameters.
 */
class ParsingGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val job: JsonField<Job>,
    private val forms: JsonField<Forms>,
    private val imagesContentMetadata: JsonField<ImagesContentMetadata>,
    private val items: JsonField<Items>,
    private val jobMetadata: JsonField<JobMetadata>,
    private val markdown: JsonField<Markdown>,
    private val markdownFull: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val rawParameters: JsonField<RawParameters>,
    private val resultContentMetadata: JsonField<ResultContentMetadata>,
    private val text: JsonField<Text>,
    private val textFull: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("job") @ExcludeMissing job: JsonField<Job> = JsonMissing.of(),
        @JsonProperty("forms") @ExcludeMissing forms: JsonField<Forms> = JsonMissing.of(),
        @JsonProperty("images_content_metadata")
        @ExcludeMissing
        imagesContentMetadata: JsonField<ImagesContentMetadata> = JsonMissing.of(),
        @JsonProperty("items") @ExcludeMissing items: JsonField<Items> = JsonMissing.of(),
        @JsonProperty("job_metadata")
        @ExcludeMissing
        jobMetadata: JsonField<JobMetadata> = JsonMissing.of(),
        @JsonProperty("markdown") @ExcludeMissing markdown: JsonField<Markdown> = JsonMissing.of(),
        @JsonProperty("markdown_full")
        @ExcludeMissing
        markdownFull: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("raw_parameters")
        @ExcludeMissing
        rawParameters: JsonField<RawParameters> = JsonMissing.of(),
        @JsonProperty("result_content_metadata")
        @ExcludeMissing
        resultContentMetadata: JsonField<ResultContentMetadata> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<Text> = JsonMissing.of(),
        @JsonProperty("text_full") @ExcludeMissing textFull: JsonField<String> = JsonMissing.of(),
    ) : this(
        job,
        forms,
        imagesContentMetadata,
        items,
        jobMetadata,
        markdown,
        markdownFull,
        metadata,
        rawParameters,
        resultContentMetadata,
        text,
        textFull,
        mutableMapOf(),
    )

    /**
     * Parse job status and metadata
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun job(): Job = job.getRequired("job")

    /**
     * Per-page form analysis results (one entry per page).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun forms(): Optional<Forms> = forms.getOptional("forms")

    /**
     * Metadata for all extracted images.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun imagesContentMetadata(): Optional<ImagesContentMetadata> =
        imagesContentMetadata.getOptional("images_content_metadata")

    /**
     * Structured JSON result (if requested)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun items(): Optional<Items> = items.getOptional("items")

    /**
     * Job execution metadata (if requested)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobMetadata(): Optional<JobMetadata> = jobMetadata.getOptional("job_metadata")

    /**
     * Markdown result (if requested)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun markdown(): Optional<Markdown> = markdown.getOptional("markdown")

    /**
     * Full raw markdown content (if requested)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun markdownFull(): Optional<String> = markdownFull.getOptional("markdown_full")

    /**
     * Result containing metadata (page level and general) for the parsed document.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rawParameters(): Optional<RawParameters> = rawParameters.getOptional("raw_parameters")

    /**
     * Metadata including size, existence, and presigned URLs for result files
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resultContentMetadata(): Optional<ResultContentMetadata> =
        resultContentMetadata.getOptional("result_content_metadata")

    /**
     * Plain text result (if requested)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<Text> = text.getOptional("text")

    /**
     * Full raw text content (if requested)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textFull(): Optional<String> = textFull.getOptional("text_full")

    /**
     * Returns the raw JSON value of [job].
     *
     * Unlike [job], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job") @ExcludeMissing fun _job(): JsonField<Job> = job

    /**
     * Returns the raw JSON value of [forms].
     *
     * Unlike [forms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("forms") @ExcludeMissing fun _forms(): JsonField<Forms> = forms

    /**
     * Returns the raw JSON value of [imagesContentMetadata].
     *
     * Unlike [imagesContentMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("images_content_metadata")
    @ExcludeMissing
    fun _imagesContentMetadata(): JsonField<ImagesContentMetadata> = imagesContentMetadata

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<Items> = items

    /**
     * Returns the raw JSON value of [jobMetadata].
     *
     * Unlike [jobMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_metadata")
    @ExcludeMissing
    fun _jobMetadata(): JsonField<JobMetadata> = jobMetadata

    /**
     * Returns the raw JSON value of [markdown].
     *
     * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markdown") @ExcludeMissing fun _markdown(): JsonField<Markdown> = markdown

    /**
     * Returns the raw JSON value of [markdownFull].
     *
     * Unlike [markdownFull], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markdown_full")
    @ExcludeMissing
    fun _markdownFull(): JsonField<String> = markdownFull

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [rawParameters].
     *
     * Unlike [rawParameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raw_parameters")
    @ExcludeMissing
    fun _rawParameters(): JsonField<RawParameters> = rawParameters

    /**
     * Returns the raw JSON value of [resultContentMetadata].
     *
     * Unlike [resultContentMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("result_content_metadata")
    @ExcludeMissing
    fun _resultContentMetadata(): JsonField<ResultContentMetadata> = resultContentMetadata

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<Text> = text

    /**
     * Returns the raw JSON value of [textFull].
     *
     * Unlike [textFull], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_full") @ExcludeMissing fun _textFull(): JsonField<String> = textFull

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
         * Returns a mutable builder for constructing an instance of [ParsingGetResponse].
         *
         * The following fields are required:
         * ```java
         * .job()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParsingGetResponse]. */
    class Builder internal constructor() {

        private var job: JsonField<Job>? = null
        private var forms: JsonField<Forms> = JsonMissing.of()
        private var imagesContentMetadata: JsonField<ImagesContentMetadata> = JsonMissing.of()
        private var items: JsonField<Items> = JsonMissing.of()
        private var jobMetadata: JsonField<JobMetadata> = JsonMissing.of()
        private var markdown: JsonField<Markdown> = JsonMissing.of()
        private var markdownFull: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var rawParameters: JsonField<RawParameters> = JsonMissing.of()
        private var resultContentMetadata: JsonField<ResultContentMetadata> = JsonMissing.of()
        private var text: JsonField<Text> = JsonMissing.of()
        private var textFull: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(parsingGetResponse: ParsingGetResponse) = apply {
            job = parsingGetResponse.job
            forms = parsingGetResponse.forms
            imagesContentMetadata = parsingGetResponse.imagesContentMetadata
            items = parsingGetResponse.items
            jobMetadata = parsingGetResponse.jobMetadata
            markdown = parsingGetResponse.markdown
            markdownFull = parsingGetResponse.markdownFull
            metadata = parsingGetResponse.metadata
            rawParameters = parsingGetResponse.rawParameters
            resultContentMetadata = parsingGetResponse.resultContentMetadata
            text = parsingGetResponse.text
            textFull = parsingGetResponse.textFull
            additionalProperties = parsingGetResponse.additionalProperties.toMutableMap()
        }

        /** Parse job status and metadata */
        fun job(job: Job) = job(JsonField.of(job))

        /**
         * Sets [Builder.job] to an arbitrary JSON value.
         *
         * You should usually call [Builder.job] with a well-typed [Job] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun job(job: JsonField<Job>) = apply { this.job = job }

        /** Per-page form analysis results (one entry per page). */
        fun forms(forms: Forms?) = forms(JsonField.ofNullable(forms))

        /** Alias for calling [Builder.forms] with `forms.orElse(null)`. */
        fun forms(forms: Optional<Forms>) = forms(forms.getOrNull())

        /**
         * Sets [Builder.forms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forms] with a well-typed [Forms] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun forms(forms: JsonField<Forms>) = apply { this.forms = forms }

        /** Metadata for all extracted images. */
        fun imagesContentMetadata(imagesContentMetadata: ImagesContentMetadata?) =
            imagesContentMetadata(JsonField.ofNullable(imagesContentMetadata))

        /**
         * Alias for calling [Builder.imagesContentMetadata] with
         * `imagesContentMetadata.orElse(null)`.
         */
        fun imagesContentMetadata(imagesContentMetadata: Optional<ImagesContentMetadata>) =
            imagesContentMetadata(imagesContentMetadata.getOrNull())

        /**
         * Sets [Builder.imagesContentMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imagesContentMetadata] with a well-typed
         * [ImagesContentMetadata] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun imagesContentMetadata(imagesContentMetadata: JsonField<ImagesContentMetadata>) = apply {
            this.imagesContentMetadata = imagesContentMetadata
        }

        /** Structured JSON result (if requested) */
        fun items(items: Items?) = items(JsonField.ofNullable(items))

        /** Alias for calling [Builder.items] with `items.orElse(null)`. */
        fun items(items: Optional<Items>) = items(items.getOrNull())

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed [Items] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun items(items: JsonField<Items>) = apply { this.items = items }

        /** Job execution metadata (if requested) */
        fun jobMetadata(jobMetadata: JobMetadata?) = jobMetadata(JsonField.ofNullable(jobMetadata))

        /** Alias for calling [Builder.jobMetadata] with `jobMetadata.orElse(null)`. */
        fun jobMetadata(jobMetadata: Optional<JobMetadata>) = jobMetadata(jobMetadata.getOrNull())

        /**
         * Sets [Builder.jobMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobMetadata] with a well-typed [JobMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jobMetadata(jobMetadata: JsonField<JobMetadata>) = apply {
            this.jobMetadata = jobMetadata
        }

        /** Markdown result (if requested) */
        fun markdown(markdown: Markdown?) = markdown(JsonField.ofNullable(markdown))

        /** Alias for calling [Builder.markdown] with `markdown.orElse(null)`. */
        fun markdown(markdown: Optional<Markdown>) = markdown(markdown.getOrNull())

        /**
         * Sets [Builder.markdown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markdown] with a well-typed [Markdown] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun markdown(markdown: JsonField<Markdown>) = apply { this.markdown = markdown }

        /** Full raw markdown content (if requested) */
        fun markdownFull(markdownFull: String?) = markdownFull(JsonField.ofNullable(markdownFull))

        /** Alias for calling [Builder.markdownFull] with `markdownFull.orElse(null)`. */
        fun markdownFull(markdownFull: Optional<String>) = markdownFull(markdownFull.getOrNull())

        /**
         * Sets [Builder.markdownFull] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markdownFull] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun markdownFull(markdownFull: JsonField<String>) = apply {
            this.markdownFull = markdownFull
        }

        /** Result containing metadata (page level and general) for the parsed document. */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun rawParameters(rawParameters: RawParameters?) =
            rawParameters(JsonField.ofNullable(rawParameters))

        /** Alias for calling [Builder.rawParameters] with `rawParameters.orElse(null)`. */
        fun rawParameters(rawParameters: Optional<RawParameters>) =
            rawParameters(rawParameters.getOrNull())

        /**
         * Sets [Builder.rawParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawParameters] with a well-typed [RawParameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rawParameters(rawParameters: JsonField<RawParameters>) = apply {
            this.rawParameters = rawParameters
        }

        /** Metadata including size, existence, and presigned URLs for result files */
        fun resultContentMetadata(resultContentMetadata: ResultContentMetadata?) =
            resultContentMetadata(JsonField.ofNullable(resultContentMetadata))

        /**
         * Alias for calling [Builder.resultContentMetadata] with
         * `resultContentMetadata.orElse(null)`.
         */
        fun resultContentMetadata(resultContentMetadata: Optional<ResultContentMetadata>) =
            resultContentMetadata(resultContentMetadata.getOrNull())

        /**
         * Sets [Builder.resultContentMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resultContentMetadata] with a well-typed
         * [ResultContentMetadata] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun resultContentMetadata(resultContentMetadata: JsonField<ResultContentMetadata>) = apply {
            this.resultContentMetadata = resultContentMetadata
        }

        /** Plain text result (if requested) */
        fun text(text: Text?) = text(JsonField.ofNullable(text))

        /** Alias for calling [Builder.text] with `text.orElse(null)`. */
        fun text(text: Optional<Text>) = text(text.getOrNull())

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [Text] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<Text>) = apply { this.text = text }

        /** Full raw text content (if requested) */
        fun textFull(textFull: String?) = textFull(JsonField.ofNullable(textFull))

        /** Alias for calling [Builder.textFull] with `textFull.orElse(null)`. */
        fun textFull(textFull: Optional<String>) = textFull(textFull.getOrNull())

        /**
         * Sets [Builder.textFull] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textFull] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun textFull(textFull: JsonField<String>) = apply { this.textFull = textFull }

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
         * Returns an immutable instance of [ParsingGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .job()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParsingGetResponse =
            ParsingGetResponse(
                checkRequired("job", job),
                forms,
                imagesContentMetadata,
                items,
                jobMetadata,
                markdown,
                markdownFull,
                metadata,
                rawParameters,
                resultContentMetadata,
                text,
                textFull,
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
    fun validate(): ParsingGetResponse = apply {
        if (validated) {
            return@apply
        }

        job().validate()
        forms().ifPresent { it.validate() }
        imagesContentMetadata().ifPresent { it.validate() }
        items().ifPresent { it.validate() }
        jobMetadata().ifPresent { it.validate() }
        markdown().ifPresent { it.validate() }
        markdownFull()
        metadata().ifPresent { it.validate() }
        rawParameters().ifPresent { it.validate() }
        resultContentMetadata().ifPresent { it.validate() }
        text().ifPresent { it.validate() }
        textFull()
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
        (job.asKnown().getOrNull()?.validity() ?: 0) +
            (forms.asKnown().getOrNull()?.validity() ?: 0) +
            (imagesContentMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (items.asKnown().getOrNull()?.validity() ?: 0) +
            (jobMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (markdown.asKnown().getOrNull()?.validity() ?: 0) +
            (if (markdownFull.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (rawParameters.asKnown().getOrNull()?.validity() ?: 0) +
            (resultContentMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (text.asKnown().getOrNull()?.validity() ?: 0) +
            (if (textFull.asKnown().isPresent) 1 else 0)

    /** Parse job status and metadata */
    class Job
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val projectId: JsonField<String>,
        private val status: JsonField<Status>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val errorMessage: JsonField<String>,
        private val name: JsonField<String>,
        private val tier: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val userMetadata: JsonField<UserMetadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("error_message")
            @ExcludeMissing
            errorMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tier") @ExcludeMissing tier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("user_metadata")
            @ExcludeMissing
            userMetadata: JsonField<UserMetadata> = JsonMissing.of(),
        ) : this(
            id,
            projectId,
            status,
            createdAt,
            errorMessage,
            name,
            tier,
            updatedAt,
            userMetadata,
            mutableMapOf(),
        )

        /**
         * Unique parse job identifier
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Project this job belongs to
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectId(): String = projectId.getRequired("project_id")

        /**
         * Current job status: PENDING, RUNNING, COMPLETED, FAILED, or CANCELLED
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Creation datetime
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Error details when status is FAILED
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

        /**
         * Optional display name for this parse job
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Parsing tier used for this job
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tier(): Optional<String> = tier.getOptional("tier")

        /**
         * Update datetime
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Key/value tags associated with this job.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun userMetadata(): Optional<UserMetadata> = userMetadata.getOptional("user_metadata")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [errorMessage].
         *
         * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("error_message")
        @ExcludeMissing
        fun _errorMessage(): JsonField<String> = errorMessage

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [tier].
         *
         * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<String> = tier

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [userMetadata].
         *
         * Unlike [userMetadata], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("user_metadata")
        @ExcludeMissing
        fun _userMetadata(): JsonField<UserMetadata> = userMetadata

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
             * Returns a mutable builder for constructing an instance of [Job].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .projectId()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Job]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var projectId: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var errorMessage: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var tier: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var userMetadata: JsonField<UserMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(job: Job) = apply {
                id = job.id
                projectId = job.projectId
                status = job.status
                createdAt = job.createdAt
                errorMessage = job.errorMessage
                name = job.name
                tier = job.tier
                updatedAt = job.updatedAt
                userMetadata = job.userMetadata
                additionalProperties = job.additionalProperties.toMutableMap()
            }

            /** Unique parse job identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Project this job belongs to */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** Current job status: PENDING, RUNNING, COMPLETED, FAILED, or CANCELLED */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Creation datetime */
            fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Error details when status is FAILED */
            fun errorMessage(errorMessage: String?) =
                errorMessage(JsonField.ofNullable(errorMessage))

            /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
            fun errorMessage(errorMessage: Optional<String>) =
                errorMessage(errorMessage.getOrNull())

            /**
             * Sets [Builder.errorMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorMessage(errorMessage: JsonField<String>) = apply {
                this.errorMessage = errorMessage
            }

            /** Optional display name for this parse job */
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

            /** Parsing tier used for this job */
            fun tier(tier: String?) = tier(JsonField.ofNullable(tier))

            /** Alias for calling [Builder.tier] with `tier.orElse(null)`. */
            fun tier(tier: Optional<String>) = tier(tier.getOrNull())

            /**
             * Sets [Builder.tier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tier] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tier(tier: JsonField<String>) = apply { this.tier = tier }

            /** Update datetime */
            fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

            /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
            fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** Key/value tags associated with this job. */
            fun userMetadata(userMetadata: UserMetadata?) =
                userMetadata(JsonField.ofNullable(userMetadata))

            /** Alias for calling [Builder.userMetadata] with `userMetadata.orElse(null)`. */
            fun userMetadata(userMetadata: Optional<UserMetadata>) =
                userMetadata(userMetadata.getOrNull())

            /**
             * Sets [Builder.userMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userMetadata] with a well-typed [UserMetadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userMetadata(userMetadata: JsonField<UserMetadata>) = apply {
                this.userMetadata = userMetadata
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
             * Returns an immutable instance of [Job].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .projectId()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Job =
                Job(
                    checkRequired("id", id),
                    checkRequired("projectId", projectId),
                    checkRequired("status", status),
                    createdAt,
                    errorMessage,
                    name,
                    tier,
                    updatedAt,
                    userMetadata,
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
        fun validate(): Job = apply {
            if (validated) {
                return@apply
            }

            id()
            projectId()
            status().validate()
            createdAt()
            errorMessage()
            name()
            tier()
            updatedAt()
            userMetadata().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (projectId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (errorMessage.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (tier.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (userMetadata.asKnown().getOrNull()?.validity() ?: 0)

        /** Current job status: PENDING, RUNNING, COMPLETED, FAILED, or CANCELLED */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CANCELLED = of("CANCELLED")

                @JvmField val COMPLETED = of("COMPLETED")

                @JvmField val FAILED = of("FAILED")

                @JvmField val PENDING = of("PENDING")

                @JvmField val RUNNING = of("RUNNING")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                CANCELLED,
                COMPLETED,
                FAILED,
                PENDING,
                RUNNING,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CANCELLED,
                COMPLETED,
                FAILED,
                PENDING,
                RUNNING,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CANCELLED -> Value.CANCELLED
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
                    PENDING -> Value.PENDING
                    RUNNING -> Value.RUNNING
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    CANCELLED -> Known.CANCELLED
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    PENDING -> Known.PENDING
                    RUNNING -> Known.RUNNING
                    else -> throw LlamaCloudInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LlamaCloudInvalidDataException("Value is not a String")
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
            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Key/value tags associated with this job. */
        class UserMetadata
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

                /** Returns a mutable builder for constructing an instance of [UserMetadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UserMetadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(userMetadata: UserMetadata) = apply {
                    additionalProperties = userMetadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UserMetadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UserMetadata = UserMetadata(additionalProperties.toImmutable())
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
            fun validate(): UserMetadata = apply {
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

                return other is UserMetadata && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UserMetadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Job &&
                id == other.id &&
                projectId == other.projectId &&
                status == other.status &&
                createdAt == other.createdAt &&
                errorMessage == other.errorMessage &&
                name == other.name &&
                tier == other.tier &&
                updatedAt == other.updatedAt &&
                userMetadata == other.userMetadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                projectId,
                status,
                createdAt,
                errorMessage,
                name,
                tier,
                updatedAt,
                userMetadata,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Job{id=$id, projectId=$projectId, status=$status, createdAt=$createdAt, errorMessage=$errorMessage, name=$name, tier=$tier, updatedAt=$updatedAt, userMetadata=$userMetadata, additionalProperties=$additionalProperties}"
    }

    /** Per-page form analysis results (one entry per page). */
    class Forms
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pages: JsonField<List<Page>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of()
        ) : this(pages, mutableMapOf())

        /**
         * List of form pages or failed page entries
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pages(): List<Page> = pages.getRequired("pages")

        /**
         * Returns the raw JSON value of [pages].
         *
         * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

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
             * Returns a mutable builder for constructing an instance of [Forms].
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Forms]. */
        class Builder internal constructor() {

            private var pages: JsonField<MutableList<Page>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(forms: Forms) = apply {
                pages = forms.pages.map { it.toMutableList() }
                additionalProperties = forms.additionalProperties.toMutableMap()
            }

            /** List of form pages or failed page entries */
            fun pages(pages: List<Page>) = pages(JsonField.of(pages))

            /**
             * Sets [Builder.pages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pages] with a well-typed `List<Page>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pages(pages: JsonField<List<Page>>) = apply {
                this.pages = pages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Page] to [pages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPage(page: Page) = apply {
                pages =
                    (pages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pages", it).add(page)
                    }
            }

            /** Alias for calling [addPage] with `Page.ofFormsResult(formsResult)`. */
            fun addPage(formsResult: Page.FormsResultPage) =
                addPage(Page.ofFormsResult(formsResult))

            /** Alias for calling [addPage] with `Page.ofFailedForms(failedForms)`. */
            fun addPage(failedForms: Page.FailedFormsPage) =
                addPage(Page.ofFailedForms(failedForms))

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
             * Returns an immutable instance of [Forms].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Forms =
                Forms(
                    checkRequired("pages", pages).map { it.toImmutable() },
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
        fun validate(): Forms = apply {
            if (validated) {
                return@apply
            }

            pages().forEach { it.validate() }
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
            (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** Forms found on one page. Pages without form content have an empty forms list. */
        @JsonDeserialize(using = Page.Deserializer::class)
        @JsonSerialize(using = Page.Serializer::class)
        class Page
        private constructor(
            private val formsResult: FormsResultPage? = null,
            private val failedForms: FailedFormsPage? = null,
            private val _json: JsonValue? = null,
        ) {

            /** Forms found on one page. Pages without form content have an empty forms list. */
            fun formsResult(): Optional<FormsResultPage> = Optional.ofNullable(formsResult)

            /** A page whose processing failed. */
            fun failedForms(): Optional<FailedFormsPage> = Optional.ofNullable(failedForms)

            fun isFormsResult(): Boolean = formsResult != null

            fun isFailedForms(): Boolean = failedForms != null

            /** Forms found on one page. Pages without form content have an empty forms list. */
            fun asFormsResult(): FormsResultPage = formsResult.getOrThrow("formsResult")

            /** A page whose processing failed. */
            fun asFailedForms(): FailedFormsPage = failedForms.getOrThrow("failedForms")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.llamacloud_prod.api.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = page.accept(new Page.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitFormsResult(FormsResultPage formsResult) {
             *         return Optional.of(formsResult.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    formsResult != null -> visitor.visitFormsResult(formsResult)
                    failedForms != null -> visitor.visitFailedForms(failedForms)
                    else -> visitor.unknown(_json)
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
            fun validate(): Page = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitFormsResult(formsResult: FormsResultPage) {
                            formsResult.validate()
                        }

                        override fun visitFailedForms(failedForms: FailedFormsPage) {
                            failedForms.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitFormsResult(formsResult: FormsResultPage) =
                            formsResult.validity()

                        override fun visitFailedForms(failedForms: FailedFormsPage) =
                            failedForms.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Page &&
                    formsResult == other.formsResult &&
                    failedForms == other.failedForms
            }

            override fun hashCode(): Int = Objects.hash(formsResult, failedForms)

            override fun toString(): String =
                when {
                    formsResult != null -> "Page{formsResult=$formsResult}"
                    failedForms != null -> "Page{failedForms=$failedForms}"
                    _json != null -> "Page{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Page")
                }

            companion object {

                /** Forms found on one page. Pages without form content have an empty forms list. */
                @JvmStatic
                fun ofFormsResult(formsResult: FormsResultPage) = Page(formsResult = formsResult)

                /** A page whose processing failed. */
                @JvmStatic
                fun ofFailedForms(failedForms: FailedFormsPage) = Page(failedForms = failedForms)
            }

            /**
             * An interface that defines how to map each variant of [Page] to a value of type [T].
             */
            interface Visitor<out T> {

                /** Forms found on one page. Pages without form content have an empty forms list. */
                fun visitFormsResult(formsResult: FormsResultPage): T

                /** A page whose processing failed. */
                fun visitFailedForms(failedForms: FailedFormsPage): T

                /**
                 * Maps an unknown variant of [Page] to a value of type [T].
                 *
                 * An instance of [Page] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LlamaCloudInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LlamaCloudInvalidDataException("Unknown Page: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Page>(Page::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Page {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<FormsResultPage>())?.let {
                                    Page(formsResult = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<FailedFormsPage>())?.let {
                                    Page(failedForms = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Page(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Page>(Page::class) {

                override fun serialize(
                    value: Page,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.formsResult != null -> generator.writeObject(value.formsResult)
                        value.failedForms != null -> generator.writeObject(value.failedForms)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Page")
                    }
                }
            }

            /** Forms found on one page. Pages without form content have an empty forms list. */
            class FormsResultPage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val forms: JsonField<List<Form>>,
                private val pageNumber: JsonField<Long>,
                private val success: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("forms")
                    @ExcludeMissing
                    forms: JsonField<List<Form>> = JsonMissing.of(),
                    @JsonProperty("page_number")
                    @ExcludeMissing
                    pageNumber: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("success") @ExcludeMissing success: JsonValue = JsonMissing.of(),
                ) : this(forms, pageNumber, success, mutableMapOf())

                /**
                 * Forms detected on the page
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun forms(): List<Form> = forms.getRequired("forms")

                /**
                 * Page number of the document
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun pageNumber(): Long = pageNumber.getRequired("page_number")

                /**
                 * Success indicator
                 *
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from(true)
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("success") @ExcludeMissing fun _success(): JsonValue = success

                /**
                 * Returns the raw JSON value of [forms].
                 *
                 * Unlike [forms], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("forms") @ExcludeMissing fun _forms(): JsonField<List<Form>> = forms

                /**
                 * Returns the raw JSON value of [pageNumber].
                 *
                 * Unlike [pageNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_number")
                @ExcludeMissing
                fun _pageNumber(): JsonField<Long> = pageNumber

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
                     * Returns a mutable builder for constructing an instance of [FormsResultPage].
                     *
                     * The following fields are required:
                     * ```java
                     * .forms()
                     * .pageNumber()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [FormsResultPage]. */
                class Builder internal constructor() {

                    private var forms: JsonField<MutableList<Form>>? = null
                    private var pageNumber: JsonField<Long>? = null
                    private var success: JsonValue = JsonValue.from(true)
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(formsResultPage: FormsResultPage) = apply {
                        forms = formsResultPage.forms.map { it.toMutableList() }
                        pageNumber = formsResultPage.pageNumber
                        success = formsResultPage.success
                        additionalProperties = formsResultPage.additionalProperties.toMutableMap()
                    }

                    /** Forms detected on the page */
                    fun forms(forms: List<Form>) = forms(JsonField.of(forms))

                    /**
                     * Sets [Builder.forms] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.forms] with a well-typed `List<Form>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun forms(forms: JsonField<List<Form>>) = apply {
                        this.forms = forms.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Form] to [forms].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addForm(form: Form) = apply {
                        forms =
                            (forms ?: JsonField.of(mutableListOf())).also {
                                checkKnown("forms", it).add(form)
                            }
                    }

                    /** Page number of the document */
                    fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

                    /**
                     * Sets [Builder.pageNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageNumber] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageNumber(pageNumber: JsonField<Long>) = apply {
                        this.pageNumber = pageNumber
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from(true)
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun success(success: JsonValue) = apply { this.success = success }

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
                     * Returns an immutable instance of [FormsResultPage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .forms()
                     * .pageNumber()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FormsResultPage =
                        FormsResultPage(
                            checkRequired("forms", forms).map { it.toImmutable() },
                            checkRequired("pageNumber", pageNumber),
                            success,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): FormsResultPage = apply {
                    if (validated) {
                        return@apply
                    }

                    forms().forEach { it.validate() }
                    pageNumber()
                    _success().let {
                        if (it != JsonValue.from(true)) {
                            throw LlamaCloudInvalidDataException(
                                "'success' is invalid, received $it"
                            )
                        }
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
                    (forms.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (pageNumber.asKnown().isPresent) 1 else 0) +
                        success.let { if (it == JsonValue.from(true)) 1 else 0 }

                /** One form detected on a page, in two representations of the same content. */
                class Form
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val json: JsonField<List<Json>>,
                    private val list: JsonField<List>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("json")
                        @ExcludeMissing
                        json: JsonField<List<Json>> = JsonMissing.of(),
                        @JsonProperty("list")
                        @ExcludeMissing
                        list: JsonField<List> = JsonMissing.of(),
                    ) : this(json, list, mutableMapOf())

                    /**
                     * Structured representation: an ordered tree of sections, fields, and tables
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun json(): List<Json> = json.getRequired("json")

                    /**
                     * Flattened list representation of the same content
                     *
                     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun list(): List = list.getRequired("list")

                    /**
                     * Returns the raw JSON value of [json].
                     *
                     * Unlike [json], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("json") @ExcludeMissing fun _json(): JsonField<List<Json>> = json

                    /**
                     * Returns the raw JSON value of [list].
                     *
                     * Unlike [list], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("list") @ExcludeMissing fun _list(): JsonField<List> = list

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
                         * Returns a mutable builder for constructing an instance of [Form].
                         *
                         * The following fields are required:
                         * ```java
                         * .json()
                         * .list()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Form]. */
                    class Builder internal constructor() {

                        private var json: JsonField<MutableList<Json>>? = null
                        private var list: JsonField<List>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(form: Form) = apply {
                            json = form.json.map { it.toMutableList() }
                            list = form.list
                            additionalProperties = form.additionalProperties.toMutableMap()
                        }

                        /**
                         * Structured representation: an ordered tree of sections, fields, and
                         * tables
                         */
                        fun json(json: List<Json>) = json(JsonField.of(json))

                        /**
                         * Sets [Builder.json] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.json] with a well-typed `List<Json>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun json(json: JsonField<List<Json>>) = apply {
                            this.json = json.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Json] to [Builder.json].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addJson(json: Json) = apply {
                            this.json =
                                (this.json ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("json", it).add(json)
                                }
                        }

                        /** Alias for calling [addJson] with `Json.ofField(field)`. */
                        fun addJson(field: Json.Field) = addJson(Json.ofField(field))

                        /**
                         * Alias for calling [addJson] with the following:
                         * ```java
                         * Json.Field.builder()
                         *     .type(ParsingGetResponse.Forms.Page.FormsResultPage.Form.Json.Field.Type.FIELD)
                         *     .field(field)
                         *     .build()
                         * ```
                         */
                        fun addFieldJson(field: Json.Field.InnerField) =
                            addJson(
                                Json.Field.builder()
                                    .type(
                                        ParsingGetResponse.Forms.Page.FormsResultPage.Form.Json
                                            .Field
                                            .Type
                                            .FIELD
                                    )
                                    .field(field)
                                    .build()
                            )

                        /** Alias for calling [addJson] with `Json.ofSection(section)`. */
                        fun addJson(section: Json.Section) = addJson(Json.ofSection(section))

                        /**
                         * Alias for calling [addJson] with the following:
                         * ```java
                         * Json.Section.builder()
                         *     .type(ParsingGetResponse.Forms.Page.FormsResultPage.Form.Json.Section.Type.SECTION)
                         *     .items(items)
                         *     .build()
                         * ```
                         */
                        fun addSectionJson(items: List<JsonValue>) =
                            addJson(
                                Json.Section.builder()
                                    .type(
                                        ParsingGetResponse.Forms.Page.FormsResultPage.Form.Json
                                            .Section
                                            .Type
                                            .SECTION
                                    )
                                    .items(items)
                                    .build()
                            )

                        /** Alias for calling [addJson] with `Json.ofTable(table)`. */
                        fun addJson(table: Json.Table) = addJson(Json.ofTable(table))

                        /**
                         * Alias for calling [addJson] with the following:
                         * ```java
                         * Json.Table.builder()
                         *     .type(ParsingGetResponse.Forms.Page.FormsResultPage.Form.Json.Table.Type.TABLE)
                         *     .rows(rows)
                         *     .build()
                         * ```
                         */
                        fun addTableJson(rows: List<List<Json.Table.Row?>>) =
                            addJson(
                                Json.Table.builder()
                                    .type(
                                        ParsingGetResponse.Forms.Page.FormsResultPage.Form.Json
                                            .Table
                                            .Type
                                            .TABLE
                                    )
                                    .rows(rows)
                                    .build()
                            )

                        /** Flattened list representation of the same content */
                        fun list(list: List) = list(JsonField.of(list))

                        /**
                         * Sets [Builder.list] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.list] with a well-typed [List] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun list(list: JsonField<List>) = apply { this.list = list }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Form].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .json()
                         * .list()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Form =
                            Form(
                                checkRequired("json", json).map { it.toImmutable() },
                                checkRequired("list", list),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Form = apply {
                        if (validated) {
                            return@apply
                        }

                        json().forEach { it.validate() }
                        list().validate()
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
                        (json.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                            (list.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * One labeled form entry: a text input, checkbox, select group, or signature
                     * line.
                     */
                    @JsonDeserialize(using = Json.Deserializer::class)
                    @JsonSerialize(using = Json.Serializer::class)
                    class Json
                    private constructor(
                        private val field: Field? = null,
                        private val section: Section? = null,
                        private val table: Table? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        /**
                         * One labeled form entry: a text input, checkbox, select group, or
                         * signature line.
                         */
                        fun field(): Optional<Field> = Optional.ofNullable(field)

                        /** A grouping of form content, in the form's reading order. */
                        fun section(): Optional<Section> = Optional.ofNullable(section)

                        /**
                         * A fillable grid printed on the form: repeating records or a row-by-column
                         * matrix.
                         */
                        fun table(): Optional<Table> = Optional.ofNullable(table)

                        fun isField(): Boolean = field != null

                        fun isSection(): Boolean = section != null

                        fun isTable(): Boolean = table != null

                        /**
                         * One labeled form entry: a text input, checkbox, select group, or
                         * signature line.
                         */
                        fun asField(): Field = field.getOrThrow("field")

                        /** A grouping of form content, in the form's reading order. */
                        fun asSection(): Section = section.getOrThrow("section")

                        /**
                         * A fillable grid printed on the form: repeating records or a row-by-column
                         * matrix.
                         */
                        fun asTable(): Table = table.getOrThrow("table")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        /**
                         * Maps this instance's current variant to a value of type [T] using the
                         * given [visitor].
                         *
                         * Note that this method is _not_ forwards compatible with new variants from
                         * the API, unless [visitor] overrides [Visitor.unknown]. To handle variants
                         * not known to this version of the SDK gracefully, consider overriding
                         * [Visitor.unknown]:
                         * ```java
                         * import com.llamacloud_prod.api.core.JsonValue;
                         * import java.util.Optional;
                         *
                         * Optional<String> result = json.accept(new Json.Visitor<Optional<String>>() {
                         *     @Override
                         *     public Optional<String> visitField(Field field) {
                         *         return Optional.of(field.toString());
                         *     }
                         *
                         *     // ...
                         *
                         *     @Override
                         *     public Optional<String> unknown(JsonValue json) {
                         *         // Or inspect the `json`.
                         *         return Optional.empty();
                         *     }
                         * });
                         * ```
                         *
                         * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not
                         *   overridden in [visitor] and the current variant is unknown.
                         */
                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                field != null -> visitor.visitField(field)
                                section != null -> visitor.visitSection(section)
                                table != null -> visitor.visitTable(table)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LlamaCloudInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Json = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitField(field: Field) {
                                        field.validate()
                                    }

                                    override fun visitSection(section: Section) {
                                        section.validate()
                                    }

                                    override fun visitTable(table: Table) {
                                        table.validate()
                                    }
                                }
                            )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitField(field: Field) = field.validity()

                                    override fun visitSection(section: Section) = section.validity()

                                    override fun visitTable(table: Table) = table.validity()

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Json &&
                                field == other.field &&
                                section == other.section &&
                                table == other.table
                        }

                        override fun hashCode(): Int = Objects.hash(field, section, table)

                        override fun toString(): String =
                            when {
                                field != null -> "Json{field=$field}"
                                section != null -> "Json{section=$section}"
                                table != null -> "Json{table=$table}"
                                _json != null -> "Json{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Json")
                            }

                        companion object {

                            /**
                             * One labeled form entry: a text input, checkbox, select group, or
                             * signature line.
                             */
                            @JvmStatic fun ofField(field: Field) = Json(field = field)

                            /** A grouping of form content, in the form's reading order. */
                            @JvmStatic fun ofSection(section: Section) = Json(section = section)

                            /**
                             * A fillable grid printed on the form: repeating records or a
                             * row-by-column matrix.
                             */
                            @JvmStatic fun ofTable(table: Table) = Json(table = table)
                        }

                        /**
                         * An interface that defines how to map each variant of [Json] to a value of
                         * type [T].
                         */
                        interface Visitor<out T> {

                            /**
                             * One labeled form entry: a text input, checkbox, select group, or
                             * signature line.
                             */
                            fun visitField(field: Field): T

                            /** A grouping of form content, in the form's reading order. */
                            fun visitSection(section: Section): T

                            /**
                             * A fillable grid printed on the form: repeating records or a
                             * row-by-column matrix.
                             */
                            fun visitTable(table: Table): T

                            /**
                             * Maps an unknown variant of [Json] to a value of type [T].
                             *
                             * An instance of [Json] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws LlamaCloudInvalidDataException in the default implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw LlamaCloudInvalidDataException("Unknown Json: $json")
                            }
                        }

                        internal class Deserializer : BaseDeserializer<Json>(Json::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Json {
                                val json = JsonValue.fromJsonNode(node)
                                val type =
                                    json
                                        .asObject()
                                        .getOrNull()
                                        ?.get("type")
                                        ?.asString()
                                        ?.getOrNull()

                                when (type) {
                                    "field" -> {
                                        return tryDeserialize(node, jacksonTypeRef<Field>())?.let {
                                            Json(field = it, _json = json)
                                        } ?: Json(_json = json)
                                    }
                                    "section" -> {
                                        return tryDeserialize(node, jacksonTypeRef<Section>())
                                            ?.let { Json(section = it, _json = json) }
                                            ?: Json(_json = json)
                                    }
                                    "table" -> {
                                        return tryDeserialize(node, jacksonTypeRef<Table>())?.let {
                                            Json(table = it, _json = json)
                                        } ?: Json(_json = json)
                                    }
                                }

                                return Json(_json = json)
                            }
                        }

                        internal class Serializer : BaseSerializer<Json>(Json::class) {

                            override fun serialize(
                                value: Json,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.field != null -> generator.writeObject(value.field)
                                    value.section != null -> generator.writeObject(value.section)
                                    value.table != null -> generator.writeObject(value.table)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Json")
                                }
                            }
                        }

                        /**
                         * One labeled form entry: a text input, checkbox, select group, or
                         * signature line.
                         */
                        class Field
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val field: JsonField<InnerField>,
                            private val id: JsonField<String>,
                            private val isEmpty: JsonField<Boolean>,
                            private val label: JsonField<String>,
                            private val type: JsonField<Type>,
                            private val value: JsonField<Value>,
                            private val valueItems: JsonField<List<JsonValue>>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("field")
                                @ExcludeMissing
                                field: JsonField<InnerField> = JsonMissing.of(),
                                @JsonProperty("id")
                                @ExcludeMissing
                                id: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("isEmpty")
                                @ExcludeMissing
                                isEmpty: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("label")
                                @ExcludeMissing
                                label: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                                @JsonProperty("value")
                                @ExcludeMissing
                                value: JsonField<Value> = JsonMissing.of(),
                                @JsonProperty("valueItems")
                                @ExcludeMissing
                                valueItems: JsonField<List<JsonValue>> = JsonMissing.of(),
                            ) : this(
                                field,
                                id,
                                isEmpty,
                                label,
                                type,
                                value,
                                valueItems,
                                mutableMapOf(),
                            )

                            /**
                             * Kind of entry: text (any free-text input), checkbox, single_select,
                             * multi_select, or signature
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun field(): InnerField = field.getRequired("field")

                            /**
                             * Field number/letter printed on the form (e.g. '1a'), if any
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun id(): Optional<String> = id.getOptional("id")

                            /**
                             * True for a printed-but-blank text field (mutually exclusive with
                             * value)
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun isEmpty(): Optional<Boolean> = isEmpty.getOptional("isEmpty")

                            /**
                             * Printed field caption, if any
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun label(): Optional<String> = label.getOptional("label")

                            /**
                             * Form field node
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun type(): Optional<Type> = type.getOptional("type")

                            /**
                             * Entered content: verbatim text for text fields, or a boolean for
                             * checkbox (checked) and signature (signed). Absent on blank text
                             * fields and on select groups
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun value(): Optional<Value> = value.getOptional("value")

                            /**
                             * Options of a single_select/multi_select group (only on select fields)
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun valueItems(): Optional<List<JsonValue>> =
                                valueItems.getOptional("valueItems")

                            /**
                             * Returns the raw JSON value of [field].
                             *
                             * Unlike [field], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("field")
                            @ExcludeMissing
                            fun _field(): JsonField<InnerField> = field

                            /**
                             * Returns the raw JSON value of [id].
                             *
                             * Unlike [id], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                            /**
                             * Returns the raw JSON value of [isEmpty].
                             *
                             * Unlike [isEmpty], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("isEmpty")
                            @ExcludeMissing
                            fun _isEmpty(): JsonField<Boolean> = isEmpty

                            /**
                             * Returns the raw JSON value of [label].
                             *
                             * Unlike [label], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("label")
                            @ExcludeMissing
                            fun _label(): JsonField<String> = label

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

                            /**
                             * Returns the raw JSON value of [value].
                             *
                             * Unlike [value], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("value")
                            @ExcludeMissing
                            fun _value(): JsonField<Value> = value

                            /**
                             * Returns the raw JSON value of [valueItems].
                             *
                             * Unlike [valueItems], this method doesn't throw if the JSON field has
                             * an unexpected type.
                             */
                            @JsonProperty("valueItems")
                            @ExcludeMissing
                            fun _valueItems(): JsonField<List<JsonValue>> = valueItems

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
                                 * [Field].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .field()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [Field]. */
                            class Builder internal constructor() {

                                private var field: JsonField<InnerField>? = null
                                private var id: JsonField<String> = JsonMissing.of()
                                private var isEmpty: JsonField<Boolean> = JsonMissing.of()
                                private var label: JsonField<String> = JsonMissing.of()
                                private var type: JsonField<Type> = JsonMissing.of()
                                private var value: JsonField<Value> = JsonMissing.of()
                                private var valueItems: JsonField<MutableList<JsonValue>>? = null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(field: Field) = apply {
                                    this.field = field.field
                                    id = field.id
                                    isEmpty = field.isEmpty
                                    label = field.label
                                    type = field.type
                                    value = field.value
                                    valueItems = field.valueItems.map { it.toMutableList() }
                                    additionalProperties = field.additionalProperties.toMutableMap()
                                }

                                /**
                                 * Kind of entry: text (any free-text input), checkbox,
                                 * single_select, multi_select, or signature
                                 */
                                fun field(field: InnerField) = field(JsonField.of(field))

                                /**
                                 * Sets [Builder.field] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.field] with a well-typed
                                 * [InnerField] value instead. This method is primarily for setting
                                 * the field to an undocumented or not yet supported value.
                                 */
                                fun field(field: JsonField<InnerField>) = apply {
                                    this.field = field
                                }

                                /** Field number/letter printed on the form (e.g. '1a'), if any */
                                fun id(id: String?) = id(JsonField.ofNullable(id))

                                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                                fun id(id: Optional<String>) = id(id.getOrNull())

                                /**
                                 * Sets [Builder.id] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.id] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun id(id: JsonField<String>) = apply { this.id = id }

                                /**
                                 * True for a printed-but-blank text field (mutually exclusive with
                                 * value)
                                 */
                                fun isEmpty(isEmpty: Boolean?) =
                                    isEmpty(JsonField.ofNullable(isEmpty))

                                /**
                                 * Alias for [Builder.isEmpty].
                                 *
                                 * This unboxed primitive overload exists for backwards
                                 * compatibility.
                                 */
                                fun isEmpty(isEmpty: Boolean) = isEmpty(isEmpty as Boolean?)

                                /**
                                 * Alias for calling [Builder.isEmpty] with `isEmpty.orElse(null)`.
                                 */
                                fun isEmpty(isEmpty: Optional<Boolean>) =
                                    isEmpty(isEmpty.getOrNull())

                                /**
                                 * Sets [Builder.isEmpty] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.isEmpty] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun isEmpty(isEmpty: JsonField<Boolean>) = apply {
                                    this.isEmpty = isEmpty
                                }

                                /** Printed field caption, if any */
                                fun label(label: String?) = label(JsonField.ofNullable(label))

                                /** Alias for calling [Builder.label] with `label.orElse(null)`. */
                                fun label(label: Optional<String>) = label(label.getOrNull())

                                /**
                                 * Sets [Builder.label] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.label] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun label(label: JsonField<String>) = apply { this.label = label }

                                /** Form field node */
                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                /**
                                 * Entered content: verbatim text for text fields, or a boolean for
                                 * checkbox (checked) and signature (signed). Absent on blank text
                                 * fields and on select groups
                                 */
                                fun value(value: Value?) = value(JsonField.ofNullable(value))

                                /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                                fun value(value: Optional<Value>) = value(value.getOrNull())

                                /**
                                 * Sets [Builder.value] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.value] with a well-typed [Value]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun value(value: JsonField<Value>) = apply { this.value = value }

                                /** Alias for calling [value] with `Value.ofString(string)`. */
                                fun value(string: String) = value(Value.ofString(string))

                                /** Alias for calling [value] with `Value.ofBool(bool)`. */
                                fun value(bool: Boolean) = value(Value.ofBool(bool))

                                /**
                                 * Options of a single_select/multi_select group (only on select
                                 * fields)
                                 */
                                fun valueItems(valueItems: List<JsonValue>?) =
                                    valueItems(JsonField.ofNullable(valueItems))

                                /**
                                 * Alias for calling [Builder.valueItems] with
                                 * `valueItems.orElse(null)`.
                                 */
                                fun valueItems(valueItems: Optional<List<JsonValue>>) =
                                    valueItems(valueItems.getOrNull())

                                /**
                                 * Sets [Builder.valueItems] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.valueItems] with a well-typed
                                 * `List<JsonValue>` value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun valueItems(valueItems: JsonField<List<JsonValue>>) = apply {
                                    this.valueItems = valueItems.map { it.toMutableList() }
                                }

                                /**
                                 * Adds a single [JsonValue] to [valueItems].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addValueItem(valueItem: JsonValue) = apply {
                                    valueItems =
                                        (valueItems ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("valueItems", it).add(valueItem)
                                        }
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Field].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .field()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): Field =
                                    Field(
                                        checkRequired("field", field),
                                        id,
                                        isEmpty,
                                        label,
                                        type,
                                        value,
                                        (valueItems ?: JsonMissing.of()).map { it.toImmutable() },
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LlamaCloudInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): Field = apply {
                                if (validated) {
                                    return@apply
                                }

                                field().validate()
                                id()
                                isEmpty()
                                label()
                                type().ifPresent { it.validate() }
                                value().ifPresent { it.validate() }
                                valueItems()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (field.asKnown().getOrNull()?.validity() ?: 0) +
                                    (if (id.asKnown().isPresent) 1 else 0) +
                                    (if (isEmpty.asKnown().isPresent) 1 else 0) +
                                    (if (label.asKnown().isPresent) 1 else 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                                    (value.asKnown().getOrNull()?.validity() ?: 0) +
                                    (valueItems.asKnown().getOrNull()?.size ?: 0)

                            /**
                             * Kind of entry: text (any free-text input), checkbox, single_select,
                             * multi_select, or signature
                             */
                            class InnerField
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val CHECKBOX = of("checkbox")

                                    @JvmField val MULTI_SELECT = of("multi_select")

                                    @JvmField val SIGNATURE = of("signature")

                                    @JvmField val SINGLE_SELECT = of("single_select")

                                    @JvmField val TEXT = of("text")

                                    @JvmStatic
                                    fun of(value: String) = InnerField(JsonField.of(value))
                                }

                                /** An enum containing [InnerField]'s known values. */
                                enum class Known {
                                    CHECKBOX,
                                    MULTI_SELECT,
                                    SIGNATURE,
                                    SINGLE_SELECT,
                                    TEXT,
                                }

                                /**
                                 * An enum containing [InnerField]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [InnerField] can contain an unknown value in a
                                 * couple of cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    CHECKBOX,
                                    MULTI_SELECT,
                                    SIGNATURE,
                                    SINGLE_SELECT,
                                    TEXT,
                                    /**
                                     * An enum member indicating that [InnerField] was instantiated
                                     * with an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        CHECKBOX -> Value.CHECKBOX
                                        MULTI_SELECT -> Value.MULTI_SELECT
                                        SIGNATURE -> Value.SIGNATURE
                                        SINGLE_SELECT -> Value.SINGLE_SELECT
                                        TEXT -> Value.TEXT
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LlamaCloudInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        CHECKBOX -> Known.CHECKBOX
                                        MULTI_SELECT -> Known.MULTI_SELECT
                                        SIGNATURE -> Known.SIGNATURE
                                        SINGLE_SELECT -> Known.SINGLE_SELECT
                                        TEXT -> Known.TEXT
                                        else ->
                                            throw LlamaCloudInvalidDataException(
                                                "Unknown InnerField: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LlamaCloudInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LlamaCloudInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LlamaCloudInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): InnerField = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    known()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is InnerField && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            /** Form field node */
                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val FIELD = of("field")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    FIELD
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    FIELD,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        FIELD -> Value.FIELD
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LlamaCloudInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        FIELD -> Known.FIELD
                                        else ->
                                            throw LlamaCloudInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LlamaCloudInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LlamaCloudInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LlamaCloudInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    known()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            /**
                             * Entered content: verbatim text for text fields, or a boolean for
                             * checkbox (checked) and signature (signed). Absent on blank text
                             * fields and on select groups
                             */
                            @JsonDeserialize(using = Value.Deserializer::class)
                            @JsonSerialize(using = Value.Serializer::class)
                            class Value
                            private constructor(
                                private val string: String? = null,
                                private val bool: Boolean? = null,
                                private val _json: JsonValue? = null,
                            ) {

                                fun string(): Optional<String> = Optional.ofNullable(string)

                                fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

                                fun isString(): Boolean = string != null

                                fun isBool(): Boolean = bool != null

                                fun asString(): String = string.getOrThrow("string")

                                fun asBool(): Boolean = bool.getOrThrow("bool")

                                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                                /**
                                 * Maps this instance's current variant to a value of type [T] using
                                 * the given [visitor].
                                 *
                                 * Note that this method is _not_ forwards compatible with new
                                 * variants from the API, unless [visitor] overrides
                                 * [Visitor.unknown]. To handle variants not known to this version
                                 * of the SDK gracefully, consider overriding [Visitor.unknown]:
                                 * ```java
                                 * import com.llamacloud_prod.api.core.JsonValue;
                                 * import java.util.Optional;
                                 *
                                 * Optional<String> result = value.accept(new Value.Visitor<Optional<String>>() {
                                 *     @Override
                                 *     public Optional<String> visitString(String string) {
                                 *         return Optional.of(string.toString());
                                 *     }
                                 *
                                 *     // ...
                                 *
                                 *     @Override
                                 *     public Optional<String> unknown(JsonValue json) {
                                 *         // Or inspect the `json`.
                                 *         return Optional.empty();
                                 *     }
                                 * });
                                 * ```
                                 *
                                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is
                                 *   not overridden in [visitor] and the current variant is unknown.
                                 */
                                fun <T> accept(visitor: Visitor<T>): T =
                                    when {
                                        string != null -> visitor.visitString(string)
                                        bool != null -> visitor.visitBool(bool)
                                        else -> visitor.unknown(_json)
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LlamaCloudInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Value = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    accept(
                                        object : Visitor<Unit> {
                                            override fun visitString(string: String) {}

                                            override fun visitBool(bool: Boolean) {}
                                        }
                                    )
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    accept(
                                        object : Visitor<Int> {
                                            override fun visitString(string: String) = 1

                                            override fun visitBool(bool: Boolean) = 1

                                            override fun unknown(json: JsonValue?) = 0
                                        }
                                    )

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Value &&
                                        string == other.string &&
                                        bool == other.bool
                                }

                                override fun hashCode(): Int = Objects.hash(string, bool)

                                override fun toString(): String =
                                    when {
                                        string != null -> "Value{string=$string}"
                                        bool != null -> "Value{bool=$bool}"
                                        _json != null -> "Value{_unknown=$_json}"
                                        else -> throw IllegalStateException("Invalid Value")
                                    }

                                companion object {

                                    @JvmStatic fun ofString(string: String) = Value(string = string)

                                    @JvmStatic fun ofBool(bool: Boolean) = Value(bool = bool)
                                }

                                /**
                                 * An interface that defines how to map each variant of [Value] to a
                                 * value of type [T].
                                 */
                                interface Visitor<out T> {

                                    fun visitString(string: String): T

                                    fun visitBool(bool: Boolean): T

                                    /**
                                     * Maps an unknown variant of [Value] to a value of type [T].
                                     *
                                     * An instance of [Value] can contain an unknown variant if it
                                     * was deserialized from data that doesn't match any known
                                     * variant. For example, if the SDK is on an older version than
                                     * the API, then the API may respond with new variants that the
                                     * SDK is unaware of.
                                     *
                                     * @throws LlamaCloudInvalidDataException in the default
                                     *   implementation.
                                     */
                                    fun unknown(json: JsonValue?): T {
                                        throw LlamaCloudInvalidDataException("Unknown Value: $json")
                                    }
                                }

                                internal class Deserializer :
                                    BaseDeserializer<Value>(Value::class) {

                                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                                        val json = JsonValue.fromJsonNode(node)

                                        val bestMatches =
                                            sequenceOf(
                                                    tryDeserialize(node, jacksonTypeRef<String>())
                                                        ?.let { Value(string = it, _json = json) },
                                                    tryDeserialize(node, jacksonTypeRef<Boolean>())
                                                        ?.let { Value(bool = it, _json = json) },
                                                )
                                                .filterNotNull()
                                                .allMaxBy { it.validity() }
                                                .toList()
                                        return when (bestMatches.size) {
                                            // This can happen if what we're deserializing is
                                            // completely incompatible with all the possible
                                            // variants (e.g. deserializing from integer).
                                            0 -> Value(_json = json)
                                            1 -> bestMatches.single()
                                            // If there's more than one match with the highest
                                            // validity, then use the first completely valid match,
                                            // or simply the first match if none are completely
                                            // valid.
                                            else ->
                                                bestMatches.firstOrNull { it.isValid() }
                                                    ?: bestMatches.first()
                                        }
                                    }
                                }

                                internal class Serializer : BaseSerializer<Value>(Value::class) {

                                    override fun serialize(
                                        value: Value,
                                        generator: JsonGenerator,
                                        provider: SerializerProvider,
                                    ) {
                                        when {
                                            value.string != null ->
                                                generator.writeObject(value.string)
                                            value.bool != null -> generator.writeObject(value.bool)
                                            value._json != null ->
                                                generator.writeObject(value._json)
                                            else -> throw IllegalStateException("Invalid Value")
                                        }
                                    }
                                }
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Field &&
                                    field == other.field &&
                                    id == other.id &&
                                    isEmpty == other.isEmpty &&
                                    label == other.label &&
                                    type == other.type &&
                                    value == other.value &&
                                    valueItems == other.valueItems &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(
                                    field,
                                    id,
                                    isEmpty,
                                    label,
                                    type,
                                    value,
                                    valueItems,
                                    additionalProperties,
                                )
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Field{field=$field, id=$id, isEmpty=$isEmpty, label=$label, type=$type, value=$value, valueItems=$valueItems, additionalProperties=$additionalProperties}"
                        }

                        /** A grouping of form content, in the form's reading order. */
                        class Section
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val items: JsonField<List<JsonValue>>,
                            private val id: JsonField<String>,
                            private val label: JsonField<String>,
                            private val type: JsonField<Type>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("items")
                                @ExcludeMissing
                                items: JsonField<List<JsonValue>> = JsonMissing.of(),
                                @JsonProperty("id")
                                @ExcludeMissing
                                id: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("label")
                                @ExcludeMissing
                                label: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                            ) : this(items, id, label, type, mutableMapOf())

                            /**
                             * Child form nodes in reading order
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun items(): List<JsonValue> = items.getRequired("items")

                            /**
                             * Identifier printed on the form (e.g. 'Part III'), if any
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun id(): Optional<String> = id.getOptional("id")

                            /**
                             * Printed section heading, if any
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun label(): Optional<String> = label.getOptional("label")

                            /**
                             * Form section node
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun type(): Optional<Type> = type.getOptional("type")

                            /**
                             * Returns the raw JSON value of [items].
                             *
                             * Unlike [items], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("items")
                            @ExcludeMissing
                            fun _items(): JsonField<List<JsonValue>> = items

                            /**
                             * Returns the raw JSON value of [id].
                             *
                             * Unlike [id], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                            /**
                             * Returns the raw JSON value of [label].
                             *
                             * Unlike [label], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("label")
                            @ExcludeMissing
                            fun _label(): JsonField<String> = label

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

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
                                 * [Section].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .items()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [Section]. */
                            class Builder internal constructor() {

                                private var items: JsonField<MutableList<JsonValue>>? = null
                                private var id: JsonField<String> = JsonMissing.of()
                                private var label: JsonField<String> = JsonMissing.of()
                                private var type: JsonField<Type> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(section: Section) = apply {
                                    items = section.items.map { it.toMutableList() }
                                    id = section.id
                                    label = section.label
                                    type = section.type
                                    additionalProperties =
                                        section.additionalProperties.toMutableMap()
                                }

                                /** Child form nodes in reading order */
                                fun items(items: List<JsonValue>) = items(JsonField.of(items))

                                /**
                                 * Sets [Builder.items] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.items] with a well-typed
                                 * `List<JsonValue>` value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun items(items: JsonField<List<JsonValue>>) = apply {
                                    this.items = items.map { it.toMutableList() }
                                }

                                /**
                                 * Adds a single [JsonValue] to [items].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addItem(item: JsonValue) = apply {
                                    items =
                                        (items ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("items", it).add(item)
                                        }
                                }

                                /** Identifier printed on the form (e.g. 'Part III'), if any */
                                fun id(id: String?) = id(JsonField.ofNullable(id))

                                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                                fun id(id: Optional<String>) = id(id.getOrNull())

                                /**
                                 * Sets [Builder.id] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.id] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun id(id: JsonField<String>) = apply { this.id = id }

                                /** Printed section heading, if any */
                                fun label(label: String?) = label(JsonField.ofNullable(label))

                                /** Alias for calling [Builder.label] with `label.orElse(null)`. */
                                fun label(label: Optional<String>) = label(label.getOrNull())

                                /**
                                 * Sets [Builder.label] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.label] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun label(label: JsonField<String>) = apply { this.label = label }

                                /** Form section node */
                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Section].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .items()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): Section =
                                    Section(
                                        checkRequired("items", items).map { it.toImmutable() },
                                        id,
                                        label,
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LlamaCloudInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): Section = apply {
                                if (validated) {
                                    return@apply
                                }

                                items()
                                id()
                                label()
                                type().ifPresent { it.validate() }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (items.asKnown().getOrNull()?.size ?: 0) +
                                    (if (id.asKnown().isPresent) 1 else 0) +
                                    (if (label.asKnown().isPresent) 1 else 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0)

                            /** Form section node */
                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val SECTION = of("section")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    SECTION
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    SECTION,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        SECTION -> Value.SECTION
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LlamaCloudInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        SECTION -> Known.SECTION
                                        else ->
                                            throw LlamaCloudInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LlamaCloudInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LlamaCloudInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LlamaCloudInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    known()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Section &&
                                    items == other.items &&
                                    id == other.id &&
                                    label == other.label &&
                                    type == other.type &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(items, id, label, type, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Section{items=$items, id=$id, label=$label, type=$type, additionalProperties=$additionalProperties}"
                        }

                        /**
                         * A fillable grid printed on the form: repeating records or a row-by-column
                         * matrix.
                         */
                        class Table
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val rows: JsonField<List<List<Row?>>>,
                            private val id: JsonField<String>,
                            private val columns: JsonField<List<String>>,
                            private val label: JsonField<String>,
                            private val type: JsonField<Type>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("rows")
                                @ExcludeMissing
                                rows: JsonField<List<List<Row?>>> = JsonMissing.of(),
                                @JsonProperty("id")
                                @ExcludeMissing
                                id: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("columns")
                                @ExcludeMissing
                                columns: JsonField<List<String>> = JsonMissing.of(),
                                @JsonProperty("label")
                                @ExcludeMissing
                                label: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                            ) : this(rows, id, columns, label, type, mutableMapOf())

                            /**
                             * Table cells: a verbatim string, null for a printed-but-blank cell, or
                             * an object holding the cell's own form nodes
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun rows(): List<List<Row?>> = rows.getRequired("rows")

                            /**
                             * Identifier printed on the form, if any
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun id(): Optional<String> = id.getOptional("id")

                            /**
                             * Printed column headers in order, if any
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun columns(): Optional<List<String>> = columns.getOptional("columns")

                            /**
                             * Printed table caption, if any
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun label(): Optional<String> = label.getOptional("label")

                            /**
                             * Form table node
                             *
                             * @throws LlamaCloudInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun type(): Optional<Type> = type.getOptional("type")

                            /**
                             * Returns the raw JSON value of [rows].
                             *
                             * Unlike [rows], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("rows")
                            @ExcludeMissing
                            fun _rows(): JsonField<List<List<Row?>>> = rows

                            /**
                             * Returns the raw JSON value of [id].
                             *
                             * Unlike [id], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                            /**
                             * Returns the raw JSON value of [columns].
                             *
                             * Unlike [columns], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("columns")
                            @ExcludeMissing
                            fun _columns(): JsonField<List<String>> = columns

                            /**
                             * Returns the raw JSON value of [label].
                             *
                             * Unlike [label], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("label")
                            @ExcludeMissing
                            fun _label(): JsonField<String> = label

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

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
                                 * [Table].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .rows()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [Table]. */
                            class Builder internal constructor() {

                                private var rows: JsonField<MutableList<List<Row?>>>? = null
                                private var id: JsonField<String> = JsonMissing.of()
                                private var columns: JsonField<MutableList<String>>? = null
                                private var label: JsonField<String> = JsonMissing.of()
                                private var type: JsonField<Type> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(table: Table) = apply {
                                    rows = table.rows.map { it.toMutableList() }
                                    id = table.id
                                    columns = table.columns.map { it.toMutableList() }
                                    label = table.label
                                    type = table.type
                                    additionalProperties = table.additionalProperties.toMutableMap()
                                }

                                /**
                                 * Table cells: a verbatim string, null for a printed-but-blank
                                 * cell, or an object holding the cell's own form nodes
                                 */
                                fun rows(rows: List<List<Row?>>) = rows(JsonField.of(rows))

                                /**
                                 * Sets [Builder.rows] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.rows] with a well-typed
                                 * `List<List<Row?>>` value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun rows(rows: JsonField<List<List<Row?>>>) = apply {
                                    this.rows = rows.map { it.toMutableList() }
                                }

                                /**
                                 * Adds a single [List<Row?>] to [rows].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addRow(row: List<Row?>) = apply {
                                    rows =
                                        (rows ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("rows", it).add(row)
                                        }
                                }

                                /** Identifier printed on the form, if any */
                                fun id(id: String?) = id(JsonField.ofNullable(id))

                                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                                fun id(id: Optional<String>) = id(id.getOrNull())

                                /**
                                 * Sets [Builder.id] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.id] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun id(id: JsonField<String>) = apply { this.id = id }

                                /** Printed column headers in order, if any */
                                fun columns(columns: List<String>?) =
                                    columns(JsonField.ofNullable(columns))

                                /**
                                 * Alias for calling [Builder.columns] with `columns.orElse(null)`.
                                 */
                                fun columns(columns: Optional<List<String>>) =
                                    columns(columns.getOrNull())

                                /**
                                 * Sets [Builder.columns] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.columns] with a well-typed
                                 * `List<String>` value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun columns(columns: JsonField<List<String>>) = apply {
                                    this.columns = columns.map { it.toMutableList() }
                                }

                                /**
                                 * Adds a single [String] to [columns].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addColumn(column: String) = apply {
                                    columns =
                                        (columns ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("columns", it).add(column)
                                        }
                                }

                                /** Printed table caption, if any */
                                fun label(label: String?) = label(JsonField.ofNullable(label))

                                /** Alias for calling [Builder.label] with `label.orElse(null)`. */
                                fun label(label: Optional<String>) = label(label.getOrNull())

                                /**
                                 * Sets [Builder.label] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.label] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun label(label: JsonField<String>) = apply { this.label = label }

                                /** Form table node */
                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Table].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .rows()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): Table =
                                    Table(
                                        checkRequired("rows", rows).map { it.toImmutable() },
                                        id,
                                        (columns ?: JsonMissing.of()).map { it.toImmutable() },
                                        label,
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LlamaCloudInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): Table = apply {
                                if (validated) {
                                    return@apply
                                }

                                rows().forEach { it.forEach { it?.validate() } }
                                id()
                                columns()
                                label()
                                type().ifPresent { it.validate() }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (rows.asKnown().getOrNull()?.sumOf {
                                    it.sumOf { (it?.validity() ?: 0).toInt() }.toInt()
                                } ?: 0) +
                                    (if (id.asKnown().isPresent) 1 else 0) +
                                    (columns.asKnown().getOrNull()?.size ?: 0) +
                                    (if (label.asKnown().isPresent) 1 else 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0)

                            @JsonDeserialize(using = Row.Deserializer::class)
                            @JsonSerialize(using = Row.Serializer::class)
                            class Row
                            private constructor(
                                private val string: String? = null,
                                private val jsonValue: JsonValue? = null,
                                private val _json: JsonValue? = null,
                            ) {

                                fun string(): Optional<String> = Optional.ofNullable(string)

                                fun jsonValue(): Optional<JsonValue> =
                                    Optional.ofNullable(jsonValue)

                                fun isString(): Boolean = string != null

                                fun isJsonValue(): Boolean = jsonValue != null

                                fun asString(): String = string.getOrThrow("string")

                                fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                                /**
                                 * Maps this instance's current variant to a value of type [T] using
                                 * the given [visitor].
                                 *
                                 * Note that this method is _not_ forwards compatible with new
                                 * variants from the API, unless [visitor] overrides
                                 * [Visitor.unknown]. To handle variants not known to this version
                                 * of the SDK gracefully, consider overriding [Visitor.unknown]:
                                 * ```java
                                 * import com.llamacloud_prod.api.core.JsonValue;
                                 * import java.util.Optional;
                                 *
                                 * Optional<String> result = row.accept(new Row.Visitor<Optional<String>>() {
                                 *     @Override
                                 *     public Optional<String> visitString(String string) {
                                 *         return Optional.of(string.toString());
                                 *     }
                                 *
                                 *     // ...
                                 *
                                 *     @Override
                                 *     public Optional<String> unknown(JsonValue json) {
                                 *         // Or inspect the `json`.
                                 *         return Optional.empty();
                                 *     }
                                 * });
                                 * ```
                                 *
                                 * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is
                                 *   not overridden in [visitor] and the current variant is unknown.
                                 */
                                fun <T> accept(visitor: Visitor<T>): T =
                                    when {
                                        string != null -> visitor.visitString(string)
                                        jsonValue != null -> visitor.visitJsonValue(jsonValue)
                                        else -> visitor.unknown(_json)
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LlamaCloudInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Row = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    accept(
                                        object : Visitor<Unit> {
                                            override fun visitString(string: String) {}

                                            override fun visitJsonValue(jsonValue: JsonValue) {}
                                        }
                                    )
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    accept(
                                        object : Visitor<Int> {
                                            override fun visitString(string: String) = 1

                                            override fun visitJsonValue(jsonValue: JsonValue) = 1

                                            override fun unknown(json: JsonValue?) = 0
                                        }
                                    )

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Row &&
                                        string == other.string &&
                                        jsonValue == other.jsonValue
                                }

                                override fun hashCode(): Int = Objects.hash(string, jsonValue)

                                override fun toString(): String =
                                    when {
                                        string != null -> "Row{string=$string}"
                                        jsonValue != null -> "Row{jsonValue=$jsonValue}"
                                        _json != null -> "Row{_unknown=$_json}"
                                        else -> throw IllegalStateException("Invalid Row")
                                    }

                                companion object {

                                    @JvmStatic fun ofString(string: String) = Row(string = string)

                                    @JvmStatic
                                    fun ofJsonValue(jsonValue: JsonValue) =
                                        Row(jsonValue = jsonValue)
                                }

                                /**
                                 * An interface that defines how to map each variant of [Row] to a
                                 * value of type [T].
                                 */
                                interface Visitor<out T> {

                                    fun visitString(string: String): T

                                    fun visitJsonValue(jsonValue: JsonValue): T

                                    /**
                                     * Maps an unknown variant of [Row] to a value of type [T].
                                     *
                                     * An instance of [Row] can contain an unknown variant if it was
                                     * deserialized from data that doesn't match any known variant.
                                     * For example, if the SDK is on an older version than the API,
                                     * then the API may respond with new variants that the SDK is
                                     * unaware of.
                                     *
                                     * @throws LlamaCloudInvalidDataException in the default
                                     *   implementation.
                                     */
                                    fun unknown(json: JsonValue?): T {
                                        throw LlamaCloudInvalidDataException("Unknown Row: $json")
                                    }
                                }

                                internal class Deserializer : BaseDeserializer<Row>(Row::class) {

                                    override fun ObjectCodec.deserialize(node: JsonNode): Row {
                                        val json = JsonValue.fromJsonNode(node)

                                        val bestMatches =
                                            sequenceOf(
                                                    tryDeserialize(node, jacksonTypeRef<String>())
                                                        ?.let { Row(string = it, _json = json) },
                                                    tryDeserialize(
                                                            node,
                                                            jacksonTypeRef<JsonValue>(),
                                                        )
                                                        ?.let { Row(jsonValue = it, _json = json) },
                                                )
                                                .filterNotNull()
                                                .allMaxBy { it.validity() }
                                                .toList()
                                        return when (bestMatches.size) {
                                            // This can happen if what we're deserializing is
                                            // completely incompatible with all the possible
                                            // variants.
                                            0 -> Row(_json = json)
                                            1 -> bestMatches.single()
                                            // If there's more than one match with the highest
                                            // validity, then use the first completely valid match,
                                            // or simply the first match if none are completely
                                            // valid.
                                            else ->
                                                bestMatches.firstOrNull { it.isValid() }
                                                    ?: bestMatches.first()
                                        }
                                    }
                                }

                                internal class Serializer : BaseSerializer<Row>(Row::class) {

                                    override fun serialize(
                                        value: Row,
                                        generator: JsonGenerator,
                                        provider: SerializerProvider,
                                    ) {
                                        when {
                                            value.string != null ->
                                                generator.writeObject(value.string)
                                            value.jsonValue != null ->
                                                generator.writeObject(value.jsonValue)
                                            value._json != null ->
                                                generator.writeObject(value._json)
                                            else -> throw IllegalStateException("Invalid Row")
                                        }
                                    }
                                }
                            }

                            /** Form table node */
                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val TABLE = of("table")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    TABLE
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    TABLE,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        TABLE -> Value.TABLE
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LlamaCloudInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        TABLE -> Known.TABLE
                                        else ->
                                            throw LlamaCloudInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LlamaCloudInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LlamaCloudInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LlamaCloudInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    known()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Table &&
                                    rows == other.rows &&
                                    id == other.id &&
                                    columns == other.columns &&
                                    label == other.label &&
                                    type == other.type &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(rows, id, columns, label, type, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Table{rows=$rows, id=$id, columns=$columns, label=$label, type=$type, additionalProperties=$additionalProperties}"
                        }
                    }

                    /** Flattened list representation of the same content */
                    class List
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val items: JsonField<List<Item>>,
                        private val md: JsonField<String>,
                        private val ordered: JsonField<Boolean>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("items")
                            @ExcludeMissing
                            items: JsonField<List<Item>> = JsonMissing.of(),
                            @JsonProperty("md")
                            @ExcludeMissing
                            md: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("ordered")
                            @ExcludeMissing
                            ordered: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of(),
                        ) : this(items, md, ordered, type, mutableMapOf())

                        /**
                         * Nested lines and sub-lists, in the form's reading order
                         *
                         * @throws LlamaCloudInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun items(): List<Item> = items.getRequired("items")

                        /**
                         * Markdown representation of this list
                         *
                         * @throws LlamaCloudInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun md(): String = md.getRequired("md")

                        /**
                         * Whether the list is ordered
                         *
                         * @throws LlamaCloudInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun ordered(): Boolean = ordered.getRequired("ordered")

                        /**
                         * List node
                         *
                         * @throws LlamaCloudInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun type(): Optional<Type> = type.getOptional("type")

                        /**
                         * Returns the raw JSON value of [items].
                         *
                         * Unlike [items], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("items")
                        @ExcludeMissing
                        fun _items(): JsonField<List<Item>> = items

                        /**
                         * Returns the raw JSON value of [md].
                         *
                         * Unlike [md], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("md") @ExcludeMissing fun _md(): JsonField<String> = md

                        /**
                         * Returns the raw JSON value of [ordered].
                         *
                         * Unlike [ordered], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("ordered")
                        @ExcludeMissing
                        fun _ordered(): JsonField<Boolean> = ordered

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                             * Returns a mutable builder for constructing an instance of [List].
                             *
                             * The following fields are required:
                             * ```java
                             * .items()
                             * .md()
                             * .ordered()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [List]. */
                        class Builder internal constructor() {

                            private var items: JsonField<MutableList<Item>>? = null
                            private var md: JsonField<String>? = null
                            private var ordered: JsonField<Boolean>? = null
                            private var type: JsonField<Type> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(list: List) = apply {
                                items = list.items.map { it.toMutableList() }
                                md = list.md
                                ordered = list.ordered
                                type = list.type
                                additionalProperties = list.additionalProperties.toMutableMap()
                            }

                            /** Nested lines and sub-lists, in the form's reading order */
                            fun items(items: List<Item>) = items(JsonField.of(items))

                            /**
                             * Sets [Builder.items] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.items] with a well-typed
                             * `List<Item>` value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun items(items: JsonField<List<Item>>) = apply {
                                this.items = items.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [Item] to [items].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addItem(item: Item) = apply {
                                items =
                                    (items ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("items", it).add(item)
                                    }
                            }

                            /**
                             * Alias for calling [addItem] with `Item.ofFormListText(formListText)`.
                             */
                            fun addItem(formListText: Item.FormListTextItem) =
                                addItem(Item.ofFormListText(formListText))

                            /** Alias for calling [addItem] with `Item.ofJsonValue(jsonValue)`. */
                            fun addItem(jsonValue: JsonValue) = addItem(Item.ofJsonValue(jsonValue))

                            /** Markdown representation of this list */
                            fun md(md: String) = md(JsonField.of(md))

                            /**
                             * Sets [Builder.md] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.md] with a well-typed [String] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun md(md: JsonField<String>) = apply { this.md = md }

                            /** Whether the list is ordered */
                            fun ordered(ordered: Boolean) = ordered(JsonField.of(ordered))

                            /**
                             * Sets [Builder.ordered] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.ordered] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun ordered(ordered: JsonField<Boolean>) = apply {
                                this.ordered = ordered
                            }

                            /** List node */
                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [List].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .items()
                             * .md()
                             * .ordered()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): List =
                                List(
                                    checkRequired("items", items).map { it.toImmutable() },
                                    checkRequired("md", md),
                                    checkRequired("ordered", ordered),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LlamaCloudInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): List = apply {
                            if (validated) {
                                return@apply
                            }

                            items().forEach { it.validate() }
                            md()
                            ordered()
                            type().ifPresent { it.validate() }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                                (if (md.asKnown().isPresent) 1 else 0) +
                                (if (ordered.asKnown().isPresent) 1 else 0) +
                                (type.asKnown().getOrNull()?.validity() ?: 0)

                        /** One line of a form's list representation. */
                        @JsonDeserialize(using = Item.Deserializer::class)
                        @JsonSerialize(using = Item.Serializer::class)
                        class Item
                        private constructor(
                            private val formListText: FormListTextItem? = null,
                            private val jsonValue: JsonValue? = null,
                            private val _json: JsonValue? = null,
                        ) {

                            /** One line of a form's list representation. */
                            fun formListText(): Optional<FormListTextItem> =
                                Optional.ofNullable(formListText)

                            fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                            fun isFormListText(): Boolean = formListText != null

                            fun isJsonValue(): Boolean = jsonValue != null

                            /** One line of a form's list representation. */
                            fun asFormListText(): FormListTextItem =
                                formListText.getOrThrow("formListText")

                            fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                            /**
                             * Maps this instance's current variant to a value of type [T] using the
                             * given [visitor].
                             *
                             * Note that this method is _not_ forwards compatible with new variants
                             * from the API, unless [visitor] overrides [Visitor.unknown]. To handle
                             * variants not known to this version of the SDK gracefully, consider
                             * overriding [Visitor.unknown]:
                             * ```java
                             * import com.llamacloud_prod.api.core.JsonValue;
                             * import java.util.Optional;
                             *
                             * Optional<String> result = item.accept(new Item.Visitor<Optional<String>>() {
                             *     @Override
                             *     public Optional<String> visitFormListText(FormListTextItem formListText) {
                             *         return Optional.of(formListText.toString());
                             *     }
                             *
                             *     // ...
                             *
                             *     @Override
                             *     public Optional<String> unknown(JsonValue json) {
                             *         // Or inspect the `json`.
                             *         return Optional.empty();
                             *     }
                             * });
                             * ```
                             *
                             * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not
                             *   overridden in [visitor] and the current variant is unknown.
                             */
                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    formListText != null -> visitor.visitFormListText(formListText)
                                    jsonValue != null -> visitor.visitJsonValue(jsonValue)
                                    else -> visitor.unknown(_json)
                                }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LlamaCloudInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): Item = apply {
                                if (validated) {
                                    return@apply
                                }

                                accept(
                                    object : Visitor<Unit> {
                                        override fun visitFormListText(
                                            formListText: FormListTextItem
                                        ) {
                                            formListText.validate()
                                        }

                                        override fun visitJsonValue(jsonValue: JsonValue) {}
                                    }
                                )
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitFormListText(
                                            formListText: FormListTextItem
                                        ) = formListText.validity()

                                        override fun visitJsonValue(jsonValue: JsonValue) = 1

                                        override fun unknown(json: JsonValue?) = 0
                                    }
                                )

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Item &&
                                    formListText == other.formListText &&
                                    jsonValue == other.jsonValue
                            }

                            override fun hashCode(): Int = Objects.hash(formListText, jsonValue)

                            override fun toString(): String =
                                when {
                                    formListText != null -> "Item{formListText=$formListText}"
                                    jsonValue != null -> "Item{jsonValue=$jsonValue}"
                                    _json != null -> "Item{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid Item")
                                }

                            companion object {

                                /** One line of a form's list representation. */
                                @JvmStatic
                                fun ofFormListText(formListText: FormListTextItem) =
                                    Item(formListText = formListText)

                                @JvmStatic
                                fun ofJsonValue(jsonValue: JsonValue) = Item(jsonValue = jsonValue)
                            }

                            /**
                             * An interface that defines how to map each variant of [Item] to a
                             * value of type [T].
                             */
                            interface Visitor<out T> {

                                /** One line of a form's list representation. */
                                fun visitFormListText(formListText: FormListTextItem): T

                                fun visitJsonValue(jsonValue: JsonValue): T

                                /**
                                 * Maps an unknown variant of [Item] to a value of type [T].
                                 *
                                 * An instance of [Item] can contain an unknown variant if it was
                                 * deserialized from data that doesn't match any known variant. For
                                 * example, if the SDK is on an older version than the API, then the
                                 * API may respond with new variants that the SDK is unaware of.
                                 *
                                 * @throws LlamaCloudInvalidDataException in the default
                                 *   implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                    throw LlamaCloudInvalidDataException("Unknown Item: $json")
                                }
                            }

                            internal class Deserializer : BaseDeserializer<Item>(Item::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): Item {
                                    val json = JsonValue.fromJsonNode(node)

                                    val bestMatches =
                                        sequenceOf(
                                                tryDeserialize(
                                                        node,
                                                        jacksonTypeRef<FormListTextItem>(),
                                                    )
                                                    ?.let { Item(formListText = it, _json = json) },
                                                tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                                    ?.let { Item(jsonValue = it, _json = json) },
                                            )
                                            .filterNotNull()
                                            .allMaxBy { it.validity() }
                                            .toList()
                                    return when (bestMatches.size) {
                                        // This can happen if what we're deserializing is completely
                                        // incompatible with all the possible variants.
                                        0 -> Item(_json = json)
                                        1 -> bestMatches.single()
                                        // If there's more than one match with the highest validity,
                                        // then use the first completely valid match, or simply the
                                        // first match if none are completely valid.
                                        else ->
                                            bestMatches.firstOrNull { it.isValid() }
                                                ?: bestMatches.first()
                                    }
                                }
                            }

                            internal class Serializer : BaseSerializer<Item>(Item::class) {

                                override fun serialize(
                                    value: Item,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider,
                                ) {
                                    when {
                                        value.formListText != null ->
                                            generator.writeObject(value.formListText)
                                        value.jsonValue != null ->
                                            generator.writeObject(value.jsonValue)
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid Item")
                                    }
                                }
                            }

                            /** One line of a form's list representation. */
                            class FormListTextItem
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val md: JsonField<String>,
                                private val value: JsonField<String>,
                                private val type: JsonField<Type>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("md")
                                    @ExcludeMissing
                                    md: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("value")
                                    @ExcludeMissing
                                    value: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonField<Type> = JsonMissing.of(),
                                ) : this(md, value, type, mutableMapOf())

                                /**
                                 * Markdown representation of the line
                                 *
                                 * @throws LlamaCloudInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun md(): String = md.getRequired("md")

                                /**
                                 * Line content (e.g. '[1a] Wages: 29,513')
                                 *
                                 * @throws LlamaCloudInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun value(): String = value.getRequired("value")

                                /**
                                 * Text line
                                 *
                                 * @throws LlamaCloudInvalidDataException if the JSON field has an
                                 *   unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun type(): Optional<Type> = type.getOptional("type")

                                /**
                                 * Returns the raw JSON value of [md].
                                 *
                                 * Unlike [md], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("md")
                                @ExcludeMissing
                                fun _md(): JsonField<String> = md

                                /**
                                 * Returns the raw JSON value of [value].
                                 *
                                 * Unlike [value], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("value")
                                @ExcludeMissing
                                fun _value(): JsonField<String> = value

                                /**
                                 * Returns the raw JSON value of [type].
                                 *
                                 * Unlike [type], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("type")
                                @ExcludeMissing
                                fun _type(): JsonField<Type> = type

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
                                     * [FormListTextItem].
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .md()
                                     * .value()
                                     * ```
                                     */
                                    @JvmStatic fun builder() = Builder()
                                }

                                /** A builder for [FormListTextItem]. */
                                class Builder internal constructor() {

                                    private var md: JsonField<String>? = null
                                    private var value: JsonField<String>? = null
                                    private var type: JsonField<Type> = JsonMissing.of()
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(formListTextItem: FormListTextItem) = apply {
                                        md = formListTextItem.md
                                        value = formListTextItem.value
                                        type = formListTextItem.type
                                        additionalProperties =
                                            formListTextItem.additionalProperties.toMutableMap()
                                    }

                                    /** Markdown representation of the line */
                                    fun md(md: String) = md(JsonField.of(md))

                                    /**
                                     * Sets [Builder.md] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.md] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun md(md: JsonField<String>) = apply { this.md = md }

                                    /** Line content (e.g. '[1a] Wages: 29,513') */
                                    fun value(value: String) = value(JsonField.of(value))

                                    /**
                                     * Sets [Builder.value] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.value] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun value(value: JsonField<String>) = apply {
                                        this.value = value
                                    }

                                    /** Text line */
                                    fun type(type: Type) = type(JsonField.of(type))

                                    /**
                                     * Sets [Builder.type] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.type] with a well-typed
                                     * [Type] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonField<Type>) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [FormListTextItem].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .md()
                                     * .value()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): FormListTextItem =
                                        FormListTextItem(
                                            checkRequired("md", md),
                                            checkRequired("value", value),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LlamaCloudInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): FormListTextItem = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    md()
                                    value()
                                    type().ifPresent { it.validate() }
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    (if (md.asKnown().isPresent) 1 else 0) +
                                        (if (value.asKnown().isPresent) 1 else 0) +
                                        (type.asKnown().getOrNull()?.validity() ?: 0)

                                /** Text line */
                                class Type
                                @JsonCreator
                                private constructor(private val value: JsonField<String>) : Enum {

                                    /**
                                     * Returns this class instance's raw value.
                                     *
                                     * This is usually only useful if this instance was deserialized
                                     * from data that doesn't match any known member, and you want
                                     * to know that value. For example, if the SDK is on an older
                                     * version than the API, then the API may respond with new
                                     * members that the SDK is unaware of.
                                     */
                                    @com.fasterxml.jackson.annotation.JsonValue
                                    fun _value(): JsonField<String> = value

                                    companion object {

                                        @JvmField val TEXT = of("text")

                                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                    }

                                    /** An enum containing [Type]'s known values. */
                                    enum class Known {
                                        TEXT
                                    }

                                    /**
                                     * An enum containing [Type]'s known values, as well as an
                                     * [_UNKNOWN] member.
                                     *
                                     * An instance of [Type] can contain an unknown value in a
                                     * couple of cases:
                                     * - It was deserialized from data that doesn't match any known
                                     *   member. For example, if the SDK is on an older version than
                                     *   the API, then the API may respond with new members that the
                                     *   SDK is unaware of.
                                     * - It was constructed with an arbitrary value using the [of]
                                     *   method.
                                     */
                                    enum class Value {
                                        TEXT,
                                        /**
                                         * An enum member indicating that [Type] was instantiated
                                         * with an unknown value.
                                         */
                                        _UNKNOWN,
                                    }

                                    /**
                                     * Returns an enum member corresponding to this class instance's
                                     * value, or [Value._UNKNOWN] if the class was instantiated with
                                     * an unknown value.
                                     *
                                     * Use the [known] method instead if you're certain the value is
                                     * always known or if you want to throw for the unknown case.
                                     */
                                    fun value(): Value =
                                        when (this) {
                                            TEXT -> Value.TEXT
                                            else -> Value._UNKNOWN
                                        }

                                    /**
                                     * Returns an enum member corresponding to this class instance's
                                     * value.
                                     *
                                     * Use the [value] method instead if you're uncertain the value
                                     * is always known and don't want to throw for the unknown case.
                                     *
                                     * @throws LlamaCloudInvalidDataException if this class
                                     *   instance's value is a not a known member.
                                     */
                                    fun known(): Known =
                                        when (this) {
                                            TEXT -> Known.TEXT
                                            else ->
                                                throw LlamaCloudInvalidDataException(
                                                    "Unknown Type: $value"
                                                )
                                        }

                                    /**
                                     * Returns this class instance's primitive wire representation.
                                     *
                                     * This differs from the [toString] method because that method
                                     * is primarily for debugging and generally doesn't throw.
                                     *
                                     * @throws LlamaCloudInvalidDataException if this class
                                     *   instance's value does not have the expected primitive type.
                                     */
                                    fun asString(): String =
                                        _value().asString().orElseThrow {
                                            LlamaCloudInvalidDataException("Value is not a String")
                                        }

                                    private var validated: Boolean = false

                                    /**
                                     * Validates that the types of all values in this object match
                                     * their expected types recursively.
                                     *
                                     * This method is _not_ forwards compatible with new types from
                                     * the API for existing fields.
                                     *
                                     * @throws LlamaCloudInvalidDataException if any value type in
                                     *   this object doesn't match its expected type.
                                     */
                                    fun validate(): Type = apply {
                                        if (validated) {
                                            return@apply
                                        }

                                        known()
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
                                     * Returns a score indicating how many valid values are
                                     * contained in this object recursively.
                                     *
                                     * Used for best match union deserialization.
                                     */
                                    @JvmSynthetic
                                    internal fun validity(): Int =
                                        if (value() == Value._UNKNOWN) 0 else 1

                                    override fun equals(other: Any?): Boolean {
                                        if (this === other) {
                                            return true
                                        }

                                        return other is Type && value == other.value
                                    }

                                    override fun hashCode() = value.hashCode()

                                    override fun toString() = value.toString()
                                }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is FormListTextItem &&
                                        md == other.md &&
                                        value == other.value &&
                                        type == other.type &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(md, value, type, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "FormListTextItem{md=$md, value=$value, type=$type, additionalProperties=$additionalProperties}"
                            }
                        }

                        /** List node */
                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val LIST = of("list")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                LIST
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                LIST,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    LIST -> Value.LIST
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LlamaCloudInvalidDataException if this class instance's value
                             *   is a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    LIST -> Known.LIST
                                    else ->
                                        throw LlamaCloudInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LlamaCloudInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LlamaCloudInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LlamaCloudInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): Type = apply {
                                if (validated) {
                                    return@apply
                                }

                                known()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is List &&
                                items == other.items &&
                                md == other.md &&
                                ordered == other.ordered &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(items, md, ordered, type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "List{items=$items, md=$md, ordered=$ordered, type=$type, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Form &&
                            json == other.json &&
                            list == other.list &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(json, list, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Form{json=$json, list=$list, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FormsResultPage &&
                        forms == other.forms &&
                        pageNumber == other.pageNumber &&
                        success == other.success &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(forms, pageNumber, success, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FormsResultPage{forms=$forms, pageNumber=$pageNumber, success=$success, additionalProperties=$additionalProperties}"
            }

            /** A page whose processing failed. */
            class FailedFormsPage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val error: JsonField<String>,
                private val pageNumber: JsonField<Long>,
                private val success: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("error")
                    @ExcludeMissing
                    error: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_number")
                    @ExcludeMissing
                    pageNumber: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("success") @ExcludeMissing success: JsonValue = JsonMissing.of(),
                ) : this(error, pageNumber, success, mutableMapOf())

                /**
                 * Error message describing the failure
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun error(): String = error.getRequired("error")

                /**
                 * Page number of the document
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun pageNumber(): Long = pageNumber.getRequired("page_number")

                /**
                 * Failure indicator
                 *
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from(false)
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("success") @ExcludeMissing fun _success(): JsonValue = success

                /**
                 * Returns the raw JSON value of [error].
                 *
                 * Unlike [error], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

                /**
                 * Returns the raw JSON value of [pageNumber].
                 *
                 * Unlike [pageNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_number")
                @ExcludeMissing
                fun _pageNumber(): JsonField<Long> = pageNumber

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
                     * Returns a mutable builder for constructing an instance of [FailedFormsPage].
                     *
                     * The following fields are required:
                     * ```java
                     * .error()
                     * .pageNumber()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [FailedFormsPage]. */
                class Builder internal constructor() {

                    private var error: JsonField<String>? = null
                    private var pageNumber: JsonField<Long>? = null
                    private var success: JsonValue = JsonValue.from(false)
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(failedFormsPage: FailedFormsPage) = apply {
                        error = failedFormsPage.error
                        pageNumber = failedFormsPage.pageNumber
                        success = failedFormsPage.success
                        additionalProperties = failedFormsPage.additionalProperties.toMutableMap()
                    }

                    /** Error message describing the failure */
                    fun error(error: String) = error(JsonField.of(error))

                    /**
                     * Sets [Builder.error] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.error] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun error(error: JsonField<String>) = apply { this.error = error }

                    /** Page number of the document */
                    fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

                    /**
                     * Sets [Builder.pageNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageNumber] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageNumber(pageNumber: JsonField<Long>) = apply {
                        this.pageNumber = pageNumber
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from(false)
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun success(success: JsonValue) = apply { this.success = success }

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
                     * Returns an immutable instance of [FailedFormsPage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .error()
                     * .pageNumber()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FailedFormsPage =
                        FailedFormsPage(
                            checkRequired("error", error),
                            checkRequired("pageNumber", pageNumber),
                            success,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): FailedFormsPage = apply {
                    if (validated) {
                        return@apply
                    }

                    error()
                    pageNumber()
                    _success().let {
                        if (it != JsonValue.from(false)) {
                            throw LlamaCloudInvalidDataException(
                                "'success' is invalid, received $it"
                            )
                        }
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
                    (if (error.asKnown().isPresent) 1 else 0) +
                        (if (pageNumber.asKnown().isPresent) 1 else 0) +
                        success.let { if (it == JsonValue.from(false)) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FailedFormsPage &&
                        error == other.error &&
                        pageNumber == other.pageNumber &&
                        success == other.success &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(error, pageNumber, success, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FailedFormsPage{error=$error, pageNumber=$pageNumber, success=$success, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Forms &&
                pages == other.pages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pages, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Forms{pages=$pages, additionalProperties=$additionalProperties}"
    }

    /** Metadata for all extracted images. */
    class ImagesContentMetadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val images: JsonField<List<Image>>,
        private val totalCount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("images")
            @ExcludeMissing
            images: JsonField<List<Image>> = JsonMissing.of(),
            @JsonProperty("total_count")
            @ExcludeMissing
            totalCount: JsonField<Long> = JsonMissing.of(),
        ) : this(images, totalCount, mutableMapOf())

        /**
         * List of image metadata with presigned URLs
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun images(): List<Image> = images.getRequired("images")

        /**
         * Total number of extracted images
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalCount(): Long = totalCount.getRequired("total_count")

        /**
         * Returns the raw JSON value of [images].
         *
         * Unlike [images], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("images") @ExcludeMissing fun _images(): JsonField<List<Image>> = images

        /**
         * Returns the raw JSON value of [totalCount].
         *
         * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

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
             * Returns a mutable builder for constructing an instance of [ImagesContentMetadata].
             *
             * The following fields are required:
             * ```java
             * .images()
             * .totalCount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ImagesContentMetadata]. */
        class Builder internal constructor() {

            private var images: JsonField<MutableList<Image>>? = null
            private var totalCount: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(imagesContentMetadata: ImagesContentMetadata) = apply {
                images = imagesContentMetadata.images.map { it.toMutableList() }
                totalCount = imagesContentMetadata.totalCount
                additionalProperties = imagesContentMetadata.additionalProperties.toMutableMap()
            }

            /** List of image metadata with presigned URLs */
            fun images(images: List<Image>) = images(JsonField.of(images))

            /**
             * Sets [Builder.images] to an arbitrary JSON value.
             *
             * You should usually call [Builder.images] with a well-typed `List<Image>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun images(images: JsonField<List<Image>>) = apply {
                this.images = images.map { it.toMutableList() }
            }

            /**
             * Adds a single [Image] to [images].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addImage(image: Image) = apply {
                images =
                    (images ?: JsonField.of(mutableListOf())).also {
                        checkKnown("images", it).add(image)
                    }
            }

            /** Total number of extracted images */
            fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

            /**
             * Sets [Builder.totalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

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
             * Returns an immutable instance of [ImagesContentMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .images()
             * .totalCount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ImagesContentMetadata =
                ImagesContentMetadata(
                    checkRequired("images", images).map { it.toImmutable() },
                    checkRequired("totalCount", totalCount),
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
        fun validate(): ImagesContentMetadata = apply {
            if (validated) {
                return@apply
            }

            images().forEach { it.validate() }
            totalCount()
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
            (images.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (totalCount.asKnown().isPresent) 1 else 0)

        /** Metadata for a single extracted image. */
        class Image
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val filename: JsonField<String>,
            private val index: JsonField<Long>,
            private val bbox: JsonField<Bbox>,
            private val category: JsonField<Category>,
            private val contentType: JsonField<String>,
            private val presignedUrl: JsonField<String>,
            private val sizeBytes: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("filename")
                @ExcludeMissing
                filename: JsonField<String> = JsonMissing.of(),
                @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("bbox") @ExcludeMissing bbox: JsonField<Bbox> = JsonMissing.of(),
                @JsonProperty("category")
                @ExcludeMissing
                category: JsonField<Category> = JsonMissing.of(),
                @JsonProperty("content_type")
                @ExcludeMissing
                contentType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("presigned_url")
                @ExcludeMissing
                presignedUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("size_bytes")
                @ExcludeMissing
                sizeBytes: JsonField<Long> = JsonMissing.of(),
            ) : this(
                filename,
                index,
                bbox,
                category,
                contentType,
                presignedUrl,
                sizeBytes,
                mutableMapOf(),
            )

            /**
             * Image filename (e.g., 'image_0.png')
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun filename(): String = filename.getRequired("filename")

            /**
             * Index of the image in the extraction order
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun index(): Long = index.getRequired("index")

            /**
             * Bounding box for an image on its page.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun bbox(): Optional<Bbox> = bbox.getOptional("bbox")

            /**
             * Image category: 'screenshot' (full page), 'embedded' (images in document), or
             * 'layout' (cropped from layout detection)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun category(): Optional<Category> = category.getOptional("category")

            /**
             * MIME type of the image
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contentType(): Optional<String> = contentType.getOptional("content_type")

            /**
             * Presigned URL to download the image
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun presignedUrl(): Optional<String> = presignedUrl.getOptional("presigned_url")

            /**
             * Deprecated: always returns None. Will be removed in a future release.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            @Deprecated("deprecated")
            fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("size_bytes")

            /**
             * Returns the raw JSON value of [filename].
             *
             * Unlike [filename], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

            /**
             * Returns the raw JSON value of [index].
             *
             * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

            /**
             * Returns the raw JSON value of [bbox].
             *
             * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<Bbox> = bbox

            /**
             * Returns the raw JSON value of [category].
             *
             * Unlike [category], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("category")
            @ExcludeMissing
            fun _category(): JsonField<Category> = category

            /**
             * Returns the raw JSON value of [contentType].
             *
             * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("content_type")
            @ExcludeMissing
            fun _contentType(): JsonField<String> = contentType

            /**
             * Returns the raw JSON value of [presignedUrl].
             *
             * Unlike [presignedUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("presigned_url")
            @ExcludeMissing
            fun _presignedUrl(): JsonField<String> = presignedUrl

            /**
             * Returns the raw JSON value of [sizeBytes].
             *
             * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @Deprecated("deprecated")
            @JsonProperty("size_bytes")
            @ExcludeMissing
            fun _sizeBytes(): JsonField<Long> = sizeBytes

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
                 * Returns a mutable builder for constructing an instance of [Image].
                 *
                 * The following fields are required:
                 * ```java
                 * .filename()
                 * .index()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Image]. */
            class Builder internal constructor() {

                private var filename: JsonField<String>? = null
                private var index: JsonField<Long>? = null
                private var bbox: JsonField<Bbox> = JsonMissing.of()
                private var category: JsonField<Category> = JsonMissing.of()
                private var contentType: JsonField<String> = JsonMissing.of()
                private var presignedUrl: JsonField<String> = JsonMissing.of()
                private var sizeBytes: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(image: Image) = apply {
                    filename = image.filename
                    index = image.index
                    bbox = image.bbox
                    category = image.category
                    contentType = image.contentType
                    presignedUrl = image.presignedUrl
                    sizeBytes = image.sizeBytes
                    additionalProperties = image.additionalProperties.toMutableMap()
                }

                /** Image filename (e.g., 'image_0.png') */
                fun filename(filename: String) = filename(JsonField.of(filename))

                /**
                 * Sets [Builder.filename] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filename] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filename(filename: JsonField<String>) = apply { this.filename = filename }

                /** Index of the image in the extraction order */
                fun index(index: Long) = index(JsonField.of(index))

                /**
                 * Sets [Builder.index] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.index] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun index(index: JsonField<Long>) = apply { this.index = index }

                /** Bounding box for an image on its page. */
                fun bbox(bbox: Bbox?) = bbox(JsonField.ofNullable(bbox))

                /** Alias for calling [Builder.bbox] with `bbox.orElse(null)`. */
                fun bbox(bbox: Optional<Bbox>) = bbox(bbox.getOrNull())

                /**
                 * Sets [Builder.bbox] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bbox] with a well-typed [Bbox] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun bbox(bbox: JsonField<Bbox>) = apply { this.bbox = bbox }

                /**
                 * Image category: 'screenshot' (full page), 'embedded' (images in document), or
                 * 'layout' (cropped from layout detection)
                 */
                fun category(category: Category?) = category(JsonField.ofNullable(category))

                /** Alias for calling [Builder.category] with `category.orElse(null)`. */
                fun category(category: Optional<Category>) = category(category.getOrNull())

                /**
                 * Sets [Builder.category] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.category] with a well-typed [Category] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /** MIME type of the image */
                fun contentType(contentType: String?) =
                    contentType(JsonField.ofNullable(contentType))

                /** Alias for calling [Builder.contentType] with `contentType.orElse(null)`. */
                fun contentType(contentType: Optional<String>) =
                    contentType(contentType.getOrNull())

                /**
                 * Sets [Builder.contentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contentType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contentType(contentType: JsonField<String>) = apply {
                    this.contentType = contentType
                }

                /** Presigned URL to download the image */
                fun presignedUrl(presignedUrl: String?) =
                    presignedUrl(JsonField.ofNullable(presignedUrl))

                /** Alias for calling [Builder.presignedUrl] with `presignedUrl.orElse(null)`. */
                fun presignedUrl(presignedUrl: Optional<String>) =
                    presignedUrl(presignedUrl.getOrNull())

                /**
                 * Sets [Builder.presignedUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.presignedUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun presignedUrl(presignedUrl: JsonField<String>) = apply {
                    this.presignedUrl = presignedUrl
                }

                /** Deprecated: always returns None. Will be removed in a future release. */
                @Deprecated("deprecated")
                fun sizeBytes(sizeBytes: Long?) = sizeBytes(JsonField.ofNullable(sizeBytes))

                /**
                 * Alias for [Builder.sizeBytes].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                @Deprecated("deprecated")
                fun sizeBytes(sizeBytes: Long) = sizeBytes(sizeBytes as Long?)

                /** Alias for calling [Builder.sizeBytes] with `sizeBytes.orElse(null)`. */
                @Deprecated("deprecated")
                fun sizeBytes(sizeBytes: Optional<Long>) = sizeBytes(sizeBytes.getOrNull())

                /**
                 * Sets [Builder.sizeBytes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sizeBytes] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                @Deprecated("deprecated")
                fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

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
                 * Returns an immutable instance of [Image].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .filename()
                 * .index()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Image =
                    Image(
                        checkRequired("filename", filename),
                        checkRequired("index", index),
                        bbox,
                        category,
                        contentType,
                        presignedUrl,
                        sizeBytes,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Image = apply {
                if (validated) {
                    return@apply
                }

                filename()
                index()
                bbox().ifPresent { it.validate() }
                category().ifPresent { it.validate() }
                contentType()
                presignedUrl()
                sizeBytes()
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
                (if (filename.asKnown().isPresent) 1 else 0) +
                    (if (index.asKnown().isPresent) 1 else 0) +
                    (bbox.asKnown().getOrNull()?.validity() ?: 0) +
                    (category.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (contentType.asKnown().isPresent) 1 else 0) +
                    (if (presignedUrl.asKnown().isPresent) 1 else 0) +
                    (if (sizeBytes.asKnown().isPresent) 1 else 0)

            /** Bounding box for an image on its page. */
            class Bbox
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val h: JsonField<Long>,
                private val w: JsonField<Long>,
                private val x: JsonField<Long>,
                private val y: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("h") @ExcludeMissing h: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("w") @ExcludeMissing w: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("x") @ExcludeMissing x: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("y") @ExcludeMissing y: JsonField<Long> = JsonMissing.of(),
                ) : this(h, w, x, y, mutableMapOf())

                /**
                 * Height of the bounding box
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun h(): Long = h.getRequired("h")

                /**
                 * Width of the bounding box
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun w(): Long = w.getRequired("w")

                /**
                 * X coordinate of the bounding box
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun x(): Long = x.getRequired("x")

                /**
                 * Y coordinate of the bounding box
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun y(): Long = y.getRequired("y")

                /**
                 * Returns the raw JSON value of [h].
                 *
                 * Unlike [h], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("h") @ExcludeMissing fun _h(): JsonField<Long> = h

                /**
                 * Returns the raw JSON value of [w].
                 *
                 * Unlike [w], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("w") @ExcludeMissing fun _w(): JsonField<Long> = w

                /**
                 * Returns the raw JSON value of [x].
                 *
                 * Unlike [x], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<Long> = x

                /**
                 * Returns the raw JSON value of [y].
                 *
                 * Unlike [y], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("y") @ExcludeMissing fun _y(): JsonField<Long> = y

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
                     * Returns a mutable builder for constructing an instance of [Bbox].
                     *
                     * The following fields are required:
                     * ```java
                     * .h()
                     * .w()
                     * .x()
                     * .y()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Bbox]. */
                class Builder internal constructor() {

                    private var h: JsonField<Long>? = null
                    private var w: JsonField<Long>? = null
                    private var x: JsonField<Long>? = null
                    private var y: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(bbox: Bbox) = apply {
                        h = bbox.h
                        w = bbox.w
                        x = bbox.x
                        y = bbox.y
                        additionalProperties = bbox.additionalProperties.toMutableMap()
                    }

                    /** Height of the bounding box */
                    fun h(h: Long) = h(JsonField.of(h))

                    /**
                     * Sets [Builder.h] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.h] with a well-typed [Long] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun h(h: JsonField<Long>) = apply { this.h = h }

                    /** Width of the bounding box */
                    fun w(w: Long) = w(JsonField.of(w))

                    /**
                     * Sets [Builder.w] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.w] with a well-typed [Long] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun w(w: JsonField<Long>) = apply { this.w = w }

                    /** X coordinate of the bounding box */
                    fun x(x: Long) = x(JsonField.of(x))

                    /**
                     * Sets [Builder.x] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.x] with a well-typed [Long] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun x(x: JsonField<Long>) = apply { this.x = x }

                    /** Y coordinate of the bounding box */
                    fun y(y: Long) = y(JsonField.of(y))

                    /**
                     * Sets [Builder.y] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.y] with a well-typed [Long] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun y(y: JsonField<Long>) = apply { this.y = y }

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
                     * Returns an immutable instance of [Bbox].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .h()
                     * .w()
                     * .x()
                     * .y()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Bbox =
                        Bbox(
                            checkRequired("h", h),
                            checkRequired("w", w),
                            checkRequired("x", x),
                            checkRequired("y", y),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Bbox = apply {
                    if (validated) {
                        return@apply
                    }

                    h()
                    w()
                    x()
                    y()
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
                    (if (h.asKnown().isPresent) 1 else 0) +
                        (if (w.asKnown().isPresent) 1 else 0) +
                        (if (x.asKnown().isPresent) 1 else 0) +
                        (if (y.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Bbox &&
                        h == other.h &&
                        w == other.w &&
                        x == other.x &&
                        y == other.y &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(h, w, x, y, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Bbox{h=$h, w=$w, x=$x, y=$y, additionalProperties=$additionalProperties}"
            }

            /**
             * Image category: 'screenshot' (full page), 'embedded' (images in document), or
             * 'layout' (cropped from layout detection)
             */
            class Category @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EMBEDDED = of("embedded")

                    @JvmField val LAYOUT = of("layout")

                    @JvmField val SCREENSHOT = of("screenshot")

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                /** An enum containing [Category]'s known values. */
                enum class Known {
                    EMBEDDED,
                    LAYOUT,
                    SCREENSHOT,
                }

                /**
                 * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Category] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EMBEDDED,
                    LAYOUT,
                    SCREENSHOT,
                    /**
                     * An enum member indicating that [Category] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EMBEDDED -> Value.EMBEDDED
                        LAYOUT -> Value.LAYOUT
                        SCREENSHOT -> Value.SCREENSHOT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        EMBEDDED -> Known.EMBEDDED
                        LAYOUT -> Known.LAYOUT
                        SCREENSHOT -> Known.SCREENSHOT
                        else -> throw LlamaCloudInvalidDataException("Unknown Category: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LlamaCloudInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Category = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Category && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Image &&
                    filename == other.filename &&
                    index == other.index &&
                    bbox == other.bbox &&
                    category == other.category &&
                    contentType == other.contentType &&
                    presignedUrl == other.presignedUrl &&
                    sizeBytes == other.sizeBytes &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    filename,
                    index,
                    bbox,
                    category,
                    contentType,
                    presignedUrl,
                    sizeBytes,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Image{filename=$filename, index=$index, bbox=$bbox, category=$category, contentType=$contentType, presignedUrl=$presignedUrl, sizeBytes=$sizeBytes, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ImagesContentMetadata &&
                images == other.images &&
                totalCount == other.totalCount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(images, totalCount, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ImagesContentMetadata{images=$images, totalCount=$totalCount, additionalProperties=$additionalProperties}"
    }

    /** Structured JSON result (if requested) */
    class Items
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pages: JsonField<List<Page>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of()
        ) : this(pages, mutableMapOf())

        /**
         * List of structured pages or failed page entries
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pages(): List<Page> = pages.getRequired("pages")

        /**
         * Returns the raw JSON value of [pages].
         *
         * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

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
             * Returns a mutable builder for constructing an instance of [Items].
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Items]. */
        class Builder internal constructor() {

            private var pages: JsonField<MutableList<Page>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(items: Items) = apply {
                pages = items.pages.map { it.toMutableList() }
                additionalProperties = items.additionalProperties.toMutableMap()
            }

            /** List of structured pages or failed page entries */
            fun pages(pages: List<Page>) = pages(JsonField.of(pages))

            /**
             * Sets [Builder.pages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pages] with a well-typed `List<Page>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pages(pages: JsonField<List<Page>>) = apply {
                this.pages = pages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Page] to [pages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPage(page: Page) = apply {
                pages =
                    (pages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pages", it).add(page)
                    }
            }

            /** Alias for calling [addPage] with `Page.ofStructuredResult(structuredResult)`. */
            fun addPage(structuredResult: Page.StructuredResultPage) =
                addPage(Page.ofStructuredResult(structuredResult))

            /** Alias for calling [addPage] with `Page.ofFailedStructured(failedStructured)`. */
            fun addPage(failedStructured: Page.FailedStructuredPage) =
                addPage(Page.ofFailedStructured(failedStructured))

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
             * Returns an immutable instance of [Items].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Items =
                Items(
                    checkRequired("pages", pages).map { it.toImmutable() },
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
        fun validate(): Items = apply {
            if (validated) {
                return@apply
            }

            pages().forEach { it.validate() }
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
            (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        @JsonDeserialize(using = Page.Deserializer::class)
        @JsonSerialize(using = Page.Serializer::class)
        class Page
        private constructor(
            private val structuredResult: StructuredResultPage? = null,
            private val failedStructured: FailedStructuredPage? = null,
            private val _json: JsonValue? = null,
        ) {

            fun structuredResult(): Optional<StructuredResultPage> =
                Optional.ofNullable(structuredResult)

            fun failedStructured(): Optional<FailedStructuredPage> =
                Optional.ofNullable(failedStructured)

            fun isStructuredResult(): Boolean = structuredResult != null

            fun isFailedStructured(): Boolean = failedStructured != null

            fun asStructuredResult(): StructuredResultPage =
                structuredResult.getOrThrow("structuredResult")

            fun asFailedStructured(): FailedStructuredPage =
                failedStructured.getOrThrow("failedStructured")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.llamacloud_prod.api.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = page.accept(new Page.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitStructuredResult(StructuredResultPage structuredResult) {
             *         return Optional.of(structuredResult.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    structuredResult != null -> visitor.visitStructuredResult(structuredResult)
                    failedStructured != null -> visitor.visitFailedStructured(failedStructured)
                    else -> visitor.unknown(_json)
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
            fun validate(): Page = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitStructuredResult(structuredResult: StructuredResultPage) {
                            structuredResult.validate()
                        }

                        override fun visitFailedStructured(failedStructured: FailedStructuredPage) {
                            failedStructured.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitStructuredResult(structuredResult: StructuredResultPage) =
                            structuredResult.validity()

                        override fun visitFailedStructured(failedStructured: FailedStructuredPage) =
                            failedStructured.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Page &&
                    structuredResult == other.structuredResult &&
                    failedStructured == other.failedStructured
            }

            override fun hashCode(): Int = Objects.hash(structuredResult, failedStructured)

            override fun toString(): String =
                when {
                    structuredResult != null -> "Page{structuredResult=$structuredResult}"
                    failedStructured != null -> "Page{failedStructured=$failedStructured}"
                    _json != null -> "Page{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Page")
                }

            companion object {

                @JvmStatic
                fun ofStructuredResult(structuredResult: StructuredResultPage) =
                    Page(structuredResult = structuredResult)

                @JvmStatic
                fun ofFailedStructured(failedStructured: FailedStructuredPage) =
                    Page(failedStructured = failedStructured)
            }

            /**
             * An interface that defines how to map each variant of [Page] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitStructuredResult(structuredResult: StructuredResultPage): T

                fun visitFailedStructured(failedStructured: FailedStructuredPage): T

                /**
                 * Maps an unknown variant of [Page] to a value of type [T].
                 *
                 * An instance of [Page] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LlamaCloudInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LlamaCloudInvalidDataException("Unknown Page: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Page>(Page::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Page {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<StructuredResultPage>())?.let {
                                    Page(structuredResult = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<FailedStructuredPage>())?.let {
                                    Page(failedStructured = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Page(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Page>(Page::class) {

                override fun serialize(
                    value: Page,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.structuredResult != null ->
                            generator.writeObject(value.structuredResult)
                        value.failedStructured != null ->
                            generator.writeObject(value.failedStructured)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Page")
                    }
                }
            }

            class StructuredResultPage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val items: JsonField<List<Item>>,
                private val pageHeight: JsonField<Double>,
                private val pageNumber: JsonField<Long>,
                private val pageWidth: JsonField<Double>,
                private val success: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("items")
                    @ExcludeMissing
                    items: JsonField<List<Item>> = JsonMissing.of(),
                    @JsonProperty("page_height")
                    @ExcludeMissing
                    pageHeight: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("page_number")
                    @ExcludeMissing
                    pageNumber: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("page_width")
                    @ExcludeMissing
                    pageWidth: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("success") @ExcludeMissing success: JsonValue = JsonMissing.of(),
                ) : this(items, pageHeight, pageNumber, pageWidth, success, mutableMapOf())

                /**
                 * List of structured items on the page
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun items(): List<Item> = items.getRequired("items")

                /**
                 * Height of the page in points
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun pageHeight(): Double = pageHeight.getRequired("page_height")

                /**
                 * Page number of the document
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun pageNumber(): Long = pageNumber.getRequired("page_number")

                /**
                 * Width of the page in points
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun pageWidth(): Double = pageWidth.getRequired("page_width")

                /**
                 * Success indicator
                 *
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from(true)
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("success") @ExcludeMissing fun _success(): JsonValue = success

                /**
                 * Returns the raw JSON value of [items].
                 *
                 * Unlike [items], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

                /**
                 * Returns the raw JSON value of [pageHeight].
                 *
                 * Unlike [pageHeight], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_height")
                @ExcludeMissing
                fun _pageHeight(): JsonField<Double> = pageHeight

                /**
                 * Returns the raw JSON value of [pageNumber].
                 *
                 * Unlike [pageNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_number")
                @ExcludeMissing
                fun _pageNumber(): JsonField<Long> = pageNumber

                /**
                 * Returns the raw JSON value of [pageWidth].
                 *
                 * Unlike [pageWidth], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("page_width")
                @ExcludeMissing
                fun _pageWidth(): JsonField<Double> = pageWidth

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
                     * [StructuredResultPage].
                     *
                     * The following fields are required:
                     * ```java
                     * .items()
                     * .pageHeight()
                     * .pageNumber()
                     * .pageWidth()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StructuredResultPage]. */
                class Builder internal constructor() {

                    private var items: JsonField<MutableList<Item>>? = null
                    private var pageHeight: JsonField<Double>? = null
                    private var pageNumber: JsonField<Long>? = null
                    private var pageWidth: JsonField<Double>? = null
                    private var success: JsonValue = JsonValue.from(true)
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(structuredResultPage: StructuredResultPage) = apply {
                        items = structuredResultPage.items.map { it.toMutableList() }
                        pageHeight = structuredResultPage.pageHeight
                        pageNumber = structuredResultPage.pageNumber
                        pageWidth = structuredResultPage.pageWidth
                        success = structuredResultPage.success
                        additionalProperties =
                            structuredResultPage.additionalProperties.toMutableMap()
                    }

                    /** List of structured items on the page */
                    fun items(items: List<Item>) = items(JsonField.of(items))

                    /**
                     * Sets [Builder.items] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.items] with a well-typed `List<Item>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun items(items: JsonField<List<Item>>) = apply {
                        this.items = items.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Item] to [items].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addItem(item: Item) = apply {
                        items =
                            (items ?: JsonField.of(mutableListOf())).also {
                                checkKnown("items", it).add(item)
                            }
                    }

                    /** Alias for calling [addItem] with `Item.ofCode(code)`. */
                    fun addItem(code: CodeItem) = addItem(Item.ofCode(code))

                    /** Alias for calling [addItem] with `Item.ofFooter(footer)`. */
                    fun addItem(footer: FooterItem) = addItem(Item.ofFooter(footer))

                    /** Alias for calling [addItem] with `Item.ofHeader(header)`. */
                    fun addItem(header: HeaderItem) = addItem(Item.ofHeader(header))

                    /** Alias for calling [addItem] with `Item.ofHeading(heading)`. */
                    fun addItem(heading: HeadingItem) = addItem(Item.ofHeading(heading))

                    /** Alias for calling [addItem] with `Item.ofImage(image)`. */
                    fun addItem(image: ImageItem) = addItem(Item.ofImage(image))

                    /** Alias for calling [addItem] with `Item.ofLink(link)`. */
                    fun addItem(link: LinkItem) = addItem(Item.ofLink(link))

                    /** Alias for calling [addItem] with `Item.ofList(list)`. */
                    fun addItem(list: ListItem) = addItem(Item.ofList(list))

                    /** Alias for calling [addItem] with `Item.ofTable(table)`. */
                    fun addItem(table: TableItem) = addItem(Item.ofTable(table))

                    /** Alias for calling [addItem] with `Item.ofText(text)`. */
                    fun addItem(text: TextItem) = addItem(Item.ofText(text))

                    /** Height of the page in points */
                    fun pageHeight(pageHeight: Double) = pageHeight(JsonField.of(pageHeight))

                    /**
                     * Sets [Builder.pageHeight] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageHeight] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageHeight(pageHeight: JsonField<Double>) = apply {
                        this.pageHeight = pageHeight
                    }

                    /** Page number of the document */
                    fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

                    /**
                     * Sets [Builder.pageNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageNumber] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageNumber(pageNumber: JsonField<Long>) = apply {
                        this.pageNumber = pageNumber
                    }

                    /** Width of the page in points */
                    fun pageWidth(pageWidth: Double) = pageWidth(JsonField.of(pageWidth))

                    /**
                     * Sets [Builder.pageWidth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageWidth] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageWidth(pageWidth: JsonField<Double>) = apply {
                        this.pageWidth = pageWidth
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from(true)
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun success(success: JsonValue) = apply { this.success = success }

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
                     * Returns an immutable instance of [StructuredResultPage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .items()
                     * .pageHeight()
                     * .pageNumber()
                     * .pageWidth()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): StructuredResultPage =
                        StructuredResultPage(
                            checkRequired("items", items).map { it.toImmutable() },
                            checkRequired("pageHeight", pageHeight),
                            checkRequired("pageNumber", pageNumber),
                            checkRequired("pageWidth", pageWidth),
                            success,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): StructuredResultPage = apply {
                    if (validated) {
                        return@apply
                    }

                    items().forEach { it.validate() }
                    pageHeight()
                    pageNumber()
                    pageWidth()
                    _success().let {
                        if (it != JsonValue.from(true)) {
                            throw LlamaCloudInvalidDataException(
                                "'success' is invalid, received $it"
                            )
                        }
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
                    (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (pageHeight.asKnown().isPresent) 1 else 0) +
                        (if (pageNumber.asKnown().isPresent) 1 else 0) +
                        (if (pageWidth.asKnown().isPresent) 1 else 0) +
                        success.let { if (it == JsonValue.from(true)) 1 else 0 }

                @JsonDeserialize(using = Item.Deserializer::class)
                @JsonSerialize(using = Item.Serializer::class)
                class Item
                private constructor(
                    private val code: CodeItem? = null,
                    private val footer: FooterItem? = null,
                    private val header: HeaderItem? = null,
                    private val heading: HeadingItem? = null,
                    private val image: ImageItem? = null,
                    private val link: LinkItem? = null,
                    private val list: ListItem? = null,
                    private val table: TableItem? = null,
                    private val text: TextItem? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun code(): Optional<CodeItem> = Optional.ofNullable(code)

                    fun footer(): Optional<FooterItem> = Optional.ofNullable(footer)

                    fun header(): Optional<HeaderItem> = Optional.ofNullable(header)

                    fun heading(): Optional<HeadingItem> = Optional.ofNullable(heading)

                    fun image(): Optional<ImageItem> = Optional.ofNullable(image)

                    fun link(): Optional<LinkItem> = Optional.ofNullable(link)

                    fun list(): Optional<ListItem> = Optional.ofNullable(list)

                    fun table(): Optional<TableItem> = Optional.ofNullable(table)

                    fun text(): Optional<TextItem> = Optional.ofNullable(text)

                    fun isCode(): Boolean = code != null

                    fun isFooter(): Boolean = footer != null

                    fun isHeader(): Boolean = header != null

                    fun isHeading(): Boolean = heading != null

                    fun isImage(): Boolean = image != null

                    fun isLink(): Boolean = link != null

                    fun isList(): Boolean = list != null

                    fun isTable(): Boolean = table != null

                    fun isText(): Boolean = text != null

                    fun asCode(): CodeItem = code.getOrThrow("code")

                    fun asFooter(): FooterItem = footer.getOrThrow("footer")

                    fun asHeader(): HeaderItem = header.getOrThrow("header")

                    fun asHeading(): HeadingItem = heading.getOrThrow("heading")

                    fun asImage(): ImageItem = image.getOrThrow("image")

                    fun asLink(): LinkItem = link.getOrThrow("link")

                    fun asList(): ListItem = list.getOrThrow("list")

                    fun asTable(): TableItem = table.getOrThrow("table")

                    fun asText(): TextItem = text.getOrThrow("text")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    /**
                     * Maps this instance's current variant to a value of type [T] using the given
                     * [visitor].
                     *
                     * Note that this method is _not_ forwards compatible with new variants from the
                     * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not
                     * known to this version of the SDK gracefully, consider overriding
                     * [Visitor.unknown]:
                     * ```java
                     * import com.llamacloud_prod.api.core.JsonValue;
                     * import java.util.Optional;
                     *
                     * Optional<String> result = item.accept(new Item.Visitor<Optional<String>>() {
                     *     @Override
                     *     public Optional<String> visitCode(CodeItem code) {
                     *         return Optional.of(code.toString());
                     *     }
                     *
                     *     // ...
                     *
                     *     @Override
                     *     public Optional<String> unknown(JsonValue json) {
                     *         // Or inspect the `json`.
                     *         return Optional.empty();
                     *     }
                     * });
                     * ```
                     *
                     * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden
                     *   in [visitor] and the current variant is unknown.
                     */
                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            code != null -> visitor.visitCode(code)
                            footer != null -> visitor.visitFooter(footer)
                            header != null -> visitor.visitHeader(header)
                            heading != null -> visitor.visitHeading(heading)
                            image != null -> visitor.visitImage(image)
                            link != null -> visitor.visitLink(link)
                            list != null -> visitor.visitList(list)
                            table != null -> visitor.visitTable(table)
                            text != null -> visitor.visitText(text)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LlamaCloudInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Item = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitCode(code: CodeItem) {
                                    code.validate()
                                }

                                override fun visitFooter(footer: FooterItem) {
                                    footer.validate()
                                }

                                override fun visitHeader(header: HeaderItem) {
                                    header.validate()
                                }

                                override fun visitHeading(heading: HeadingItem) {
                                    heading.validate()
                                }

                                override fun visitImage(image: ImageItem) {
                                    image.validate()
                                }

                                override fun visitLink(link: LinkItem) {
                                    link.validate()
                                }

                                override fun visitList(list: ListItem) {
                                    list.validate()
                                }

                                override fun visitTable(table: TableItem) {
                                    table.validate()
                                }

                                override fun visitText(text: TextItem) {
                                    text.validate()
                                }
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitCode(code: CodeItem) = code.validity()

                                override fun visitFooter(footer: FooterItem) = footer.validity()

                                override fun visitHeader(header: HeaderItem) = header.validity()

                                override fun visitHeading(heading: HeadingItem) = heading.validity()

                                override fun visitImage(image: ImageItem) = image.validity()

                                override fun visitLink(link: LinkItem) = link.validity()

                                override fun visitList(list: ListItem) = list.validity()

                                override fun visitTable(table: TableItem) = table.validity()

                                override fun visitText(text: TextItem) = text.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Item &&
                            code == other.code &&
                            footer == other.footer &&
                            header == other.header &&
                            heading == other.heading &&
                            image == other.image &&
                            link == other.link &&
                            list == other.list &&
                            table == other.table &&
                            text == other.text
                    }

                    override fun hashCode(): Int =
                        Objects.hash(code, footer, header, heading, image, link, list, table, text)

                    override fun toString(): String =
                        when {
                            code != null -> "Item{code=$code}"
                            footer != null -> "Item{footer=$footer}"
                            header != null -> "Item{header=$header}"
                            heading != null -> "Item{heading=$heading}"
                            image != null -> "Item{image=$image}"
                            link != null -> "Item{link=$link}"
                            list != null -> "Item{list=$list}"
                            table != null -> "Item{table=$table}"
                            text != null -> "Item{text=$text}"
                            _json != null -> "Item{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Item")
                        }

                    companion object {

                        @JvmStatic fun ofCode(code: CodeItem) = Item(code = code)

                        @JvmStatic fun ofFooter(footer: FooterItem) = Item(footer = footer)

                        @JvmStatic fun ofHeader(header: HeaderItem) = Item(header = header)

                        @JvmStatic fun ofHeading(heading: HeadingItem) = Item(heading = heading)

                        @JvmStatic fun ofImage(image: ImageItem) = Item(image = image)

                        @JvmStatic fun ofLink(link: LinkItem) = Item(link = link)

                        @JvmStatic fun ofList(list: ListItem) = Item(list = list)

                        @JvmStatic fun ofTable(table: TableItem) = Item(table = table)

                        @JvmStatic fun ofText(text: TextItem) = Item(text = text)
                    }

                    /**
                     * An interface that defines how to map each variant of [Item] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        fun visitCode(code: CodeItem): T

                        fun visitFooter(footer: FooterItem): T

                        fun visitHeader(header: HeaderItem): T

                        fun visitHeading(heading: HeadingItem): T

                        fun visitImage(image: ImageItem): T

                        fun visitLink(link: LinkItem): T

                        fun visitList(list: ListItem): T

                        fun visitTable(table: TableItem): T

                        fun visitText(text: TextItem): T

                        /**
                         * Maps an unknown variant of [Item] to a value of type [T].
                         *
                         * An instance of [Item] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws LlamaCloudInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LlamaCloudInvalidDataException("Unknown Item: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<Item>(Item::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Item {
                            val json = JsonValue.fromJsonNode(node)
                            val type =
                                json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                            when (type) {
                                "code" -> {
                                    return tryDeserialize(node, jacksonTypeRef<CodeItem>())?.let {
                                        Item(code = it, _json = json)
                                    } ?: Item(_json = json)
                                }
                                "footer" -> {
                                    return tryDeserialize(node, jacksonTypeRef<FooterItem>())?.let {
                                        Item(footer = it, _json = json)
                                    } ?: Item(_json = json)
                                }
                                "header" -> {
                                    return tryDeserialize(node, jacksonTypeRef<HeaderItem>())?.let {
                                        Item(header = it, _json = json)
                                    } ?: Item(_json = json)
                                }
                                "heading" -> {
                                    return tryDeserialize(node, jacksonTypeRef<HeadingItem>())
                                        ?.let { Item(heading = it, _json = json) }
                                        ?: Item(_json = json)
                                }
                                "image" -> {
                                    return tryDeserialize(node, jacksonTypeRef<ImageItem>())?.let {
                                        Item(image = it, _json = json)
                                    } ?: Item(_json = json)
                                }
                                "link" -> {
                                    return tryDeserialize(node, jacksonTypeRef<LinkItem>())?.let {
                                        Item(link = it, _json = json)
                                    } ?: Item(_json = json)
                                }
                                "list" -> {
                                    return tryDeserialize(node, jacksonTypeRef<ListItem>())?.let {
                                        Item(list = it, _json = json)
                                    } ?: Item(_json = json)
                                }
                                "table" -> {
                                    return tryDeserialize(node, jacksonTypeRef<TableItem>())?.let {
                                        Item(table = it, _json = json)
                                    } ?: Item(_json = json)
                                }
                                "text" -> {
                                    return tryDeserialize(node, jacksonTypeRef<TextItem>())?.let {
                                        Item(text = it, _json = json)
                                    } ?: Item(_json = json)
                                }
                            }

                            return Item(_json = json)
                        }
                    }

                    internal class Serializer : BaseSerializer<Item>(Item::class) {

                        override fun serialize(
                            value: Item,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.code != null -> generator.writeObject(value.code)
                                value.footer != null -> generator.writeObject(value.footer)
                                value.header != null -> generator.writeObject(value.header)
                                value.heading != null -> generator.writeObject(value.heading)
                                value.image != null -> generator.writeObject(value.image)
                                value.link != null -> generator.writeObject(value.link)
                                value.list != null -> generator.writeObject(value.list)
                                value.table != null -> generator.writeObject(value.table)
                                value.text != null -> generator.writeObject(value.text)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Item")
                            }
                        }
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StructuredResultPage &&
                        items == other.items &&
                        pageHeight == other.pageHeight &&
                        pageNumber == other.pageNumber &&
                        pageWidth == other.pageWidth &&
                        success == other.success &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        items,
                        pageHeight,
                        pageNumber,
                        pageWidth,
                        success,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StructuredResultPage{items=$items, pageHeight=$pageHeight, pageNumber=$pageNumber, pageWidth=$pageWidth, success=$success, additionalProperties=$additionalProperties}"
            }

            class FailedStructuredPage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val error: JsonField<String>,
                private val pageNumber: JsonField<Long>,
                private val success: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("error")
                    @ExcludeMissing
                    error: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_number")
                    @ExcludeMissing
                    pageNumber: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("success") @ExcludeMissing success: JsonValue = JsonMissing.of(),
                ) : this(error, pageNumber, success, mutableMapOf())

                /**
                 * Error message describing the failure
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun error(): String = error.getRequired("error")

                /**
                 * Page number of the document
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun pageNumber(): Long = pageNumber.getRequired("page_number")

                /**
                 * Failure indicator
                 *
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from(false)
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("success") @ExcludeMissing fun _success(): JsonValue = success

                /**
                 * Returns the raw JSON value of [error].
                 *
                 * Unlike [error], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

                /**
                 * Returns the raw JSON value of [pageNumber].
                 *
                 * Unlike [pageNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_number")
                @ExcludeMissing
                fun _pageNumber(): JsonField<Long> = pageNumber

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
                     * [FailedStructuredPage].
                     *
                     * The following fields are required:
                     * ```java
                     * .error()
                     * .pageNumber()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [FailedStructuredPage]. */
                class Builder internal constructor() {

                    private var error: JsonField<String>? = null
                    private var pageNumber: JsonField<Long>? = null
                    private var success: JsonValue = JsonValue.from(false)
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(failedStructuredPage: FailedStructuredPage) = apply {
                        error = failedStructuredPage.error
                        pageNumber = failedStructuredPage.pageNumber
                        success = failedStructuredPage.success
                        additionalProperties =
                            failedStructuredPage.additionalProperties.toMutableMap()
                    }

                    /** Error message describing the failure */
                    fun error(error: String) = error(JsonField.of(error))

                    /**
                     * Sets [Builder.error] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.error] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun error(error: JsonField<String>) = apply { this.error = error }

                    /** Page number of the document */
                    fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

                    /**
                     * Sets [Builder.pageNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageNumber] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageNumber(pageNumber: JsonField<Long>) = apply {
                        this.pageNumber = pageNumber
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from(false)
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun success(success: JsonValue) = apply { this.success = success }

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
                     * Returns an immutable instance of [FailedStructuredPage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .error()
                     * .pageNumber()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FailedStructuredPage =
                        FailedStructuredPage(
                            checkRequired("error", error),
                            checkRequired("pageNumber", pageNumber),
                            success,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): FailedStructuredPage = apply {
                    if (validated) {
                        return@apply
                    }

                    error()
                    pageNumber()
                    _success().let {
                        if (it != JsonValue.from(false)) {
                            throw LlamaCloudInvalidDataException(
                                "'success' is invalid, received $it"
                            )
                        }
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
                    (if (error.asKnown().isPresent) 1 else 0) +
                        (if (pageNumber.asKnown().isPresent) 1 else 0) +
                        success.let { if (it == JsonValue.from(false)) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FailedStructuredPage &&
                        error == other.error &&
                        pageNumber == other.pageNumber &&
                        success == other.success &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(error, pageNumber, success, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FailedStructuredPage{error=$error, pageNumber=$pageNumber, success=$success, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Items &&
                pages == other.pages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pages, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Items{pages=$pages, additionalProperties=$additionalProperties}"
    }

    /** Job execution metadata (if requested) */
    class JobMetadata
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

            /** Returns a mutable builder for constructing an instance of [JobMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [JobMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(jobMetadata: JobMetadata) = apply {
                additionalProperties = jobMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [JobMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): JobMetadata = JobMetadata(additionalProperties.toImmutable())
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
        fun validate(): JobMetadata = apply {
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

            return other is JobMetadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "JobMetadata{additionalProperties=$additionalProperties}"
    }

    /** Markdown result (if requested) */
    class Markdown
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pages: JsonField<List<Page>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of()
        ) : this(pages, mutableMapOf())

        /**
         * List of markdown pages or failed page entries
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pages(): List<Page> = pages.getRequired("pages")

        /**
         * Returns the raw JSON value of [pages].
         *
         * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

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
             * Returns a mutable builder for constructing an instance of [Markdown].
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Markdown]. */
        class Builder internal constructor() {

            private var pages: JsonField<MutableList<Page>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(markdown: Markdown) = apply {
                pages = markdown.pages.map { it.toMutableList() }
                additionalProperties = markdown.additionalProperties.toMutableMap()
            }

            /** List of markdown pages or failed page entries */
            fun pages(pages: List<Page>) = pages(JsonField.of(pages))

            /**
             * Sets [Builder.pages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pages] with a well-typed `List<Page>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pages(pages: JsonField<List<Page>>) = apply {
                this.pages = pages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Page] to [pages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPage(page: Page) = apply {
                pages =
                    (pages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pages", it).add(page)
                    }
            }

            /** Alias for calling [addPage] with `Page.ofMarkdownResult(markdownResult)`. */
            fun addPage(markdownResult: Page.MarkdownResultPage) =
                addPage(Page.ofMarkdownResult(markdownResult))

            /** Alias for calling [addPage] with `Page.ofFailedMarkdown(failedMarkdown)`. */
            fun addPage(failedMarkdown: Page.FailedMarkdownPage) =
                addPage(Page.ofFailedMarkdown(failedMarkdown))

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
             * Returns an immutable instance of [Markdown].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Markdown =
                Markdown(
                    checkRequired("pages", pages).map { it.toImmutable() },
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
        fun validate(): Markdown = apply {
            if (validated) {
                return@apply
            }

            pages().forEach { it.validate() }
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
            (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        @JsonDeserialize(using = Page.Deserializer::class)
        @JsonSerialize(using = Page.Serializer::class)
        class Page
        private constructor(
            private val markdownResult: MarkdownResultPage? = null,
            private val failedMarkdown: FailedMarkdownPage? = null,
            private val _json: JsonValue? = null,
        ) {

            fun markdownResult(): Optional<MarkdownResultPage> = Optional.ofNullable(markdownResult)

            fun failedMarkdown(): Optional<FailedMarkdownPage> = Optional.ofNullable(failedMarkdown)

            fun isMarkdownResult(): Boolean = markdownResult != null

            fun isFailedMarkdown(): Boolean = failedMarkdown != null

            fun asMarkdownResult(): MarkdownResultPage = markdownResult.getOrThrow("markdownResult")

            fun asFailedMarkdown(): FailedMarkdownPage = failedMarkdown.getOrThrow("failedMarkdown")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.llamacloud_prod.api.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = page.accept(new Page.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitMarkdownResult(MarkdownResultPage markdownResult) {
             *         return Optional.of(markdownResult.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    markdownResult != null -> visitor.visitMarkdownResult(markdownResult)
                    failedMarkdown != null -> visitor.visitFailedMarkdown(failedMarkdown)
                    else -> visitor.unknown(_json)
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
            fun validate(): Page = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitMarkdownResult(markdownResult: MarkdownResultPage) {
                            markdownResult.validate()
                        }

                        override fun visitFailedMarkdown(failedMarkdown: FailedMarkdownPage) {
                            failedMarkdown.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitMarkdownResult(markdownResult: MarkdownResultPage) =
                            markdownResult.validity()

                        override fun visitFailedMarkdown(failedMarkdown: FailedMarkdownPage) =
                            failedMarkdown.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Page &&
                    markdownResult == other.markdownResult &&
                    failedMarkdown == other.failedMarkdown
            }

            override fun hashCode(): Int = Objects.hash(markdownResult, failedMarkdown)

            override fun toString(): String =
                when {
                    markdownResult != null -> "Page{markdownResult=$markdownResult}"
                    failedMarkdown != null -> "Page{failedMarkdown=$failedMarkdown}"
                    _json != null -> "Page{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Page")
                }

            companion object {

                @JvmStatic
                fun ofMarkdownResult(markdownResult: MarkdownResultPage) =
                    Page(markdownResult = markdownResult)

                @JvmStatic
                fun ofFailedMarkdown(failedMarkdown: FailedMarkdownPage) =
                    Page(failedMarkdown = failedMarkdown)
            }

            /**
             * An interface that defines how to map each variant of [Page] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitMarkdownResult(markdownResult: MarkdownResultPage): T

                fun visitFailedMarkdown(failedMarkdown: FailedMarkdownPage): T

                /**
                 * Maps an unknown variant of [Page] to a value of type [T].
                 *
                 * An instance of [Page] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LlamaCloudInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LlamaCloudInvalidDataException("Unknown Page: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Page>(Page::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Page {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<MarkdownResultPage>())?.let {
                                    Page(markdownResult = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<FailedMarkdownPage>())?.let {
                                    Page(failedMarkdown = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Page(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Page>(Page::class) {

                override fun serialize(
                    value: Page,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.markdownResult != null -> generator.writeObject(value.markdownResult)
                        value.failedMarkdown != null -> generator.writeObject(value.failedMarkdown)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Page")
                    }
                }
            }

            class MarkdownResultPage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val markdown: JsonField<String>,
                private val pageNumber: JsonField<Long>,
                private val success: JsonValue,
                private val footer: JsonField<String>,
                private val header: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("markdown")
                    @ExcludeMissing
                    markdown: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_number")
                    @ExcludeMissing
                    pageNumber: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("success") @ExcludeMissing success: JsonValue = JsonMissing.of(),
                    @JsonProperty("footer")
                    @ExcludeMissing
                    footer: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("header")
                    @ExcludeMissing
                    header: JsonField<String> = JsonMissing.of(),
                ) : this(markdown, pageNumber, success, footer, header, mutableMapOf())

                /**
                 * Markdown content of the page
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun markdown(): String = markdown.getRequired("markdown")

                /**
                 * Page number of the document
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun pageNumber(): Long = pageNumber.getRequired("page_number")

                /**
                 * Success indicator
                 *
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from(true)
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("success") @ExcludeMissing fun _success(): JsonValue = success

                /**
                 * Footer of the page in markdown
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun footer(): Optional<String> = footer.getOptional("footer")

                /**
                 * Header of the page in markdown
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun header(): Optional<String> = header.getOptional("header")

                /**
                 * Returns the raw JSON value of [markdown].
                 *
                 * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("markdown")
                @ExcludeMissing
                fun _markdown(): JsonField<String> = markdown

                /**
                 * Returns the raw JSON value of [pageNumber].
                 *
                 * Unlike [pageNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_number")
                @ExcludeMissing
                fun _pageNumber(): JsonField<Long> = pageNumber

                /**
                 * Returns the raw JSON value of [footer].
                 *
                 * Unlike [footer], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<String> = footer

                /**
                 * Returns the raw JSON value of [header].
                 *
                 * Unlike [header], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("header") @ExcludeMissing fun _header(): JsonField<String> = header

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
                     * [MarkdownResultPage].
                     *
                     * The following fields are required:
                     * ```java
                     * .markdown()
                     * .pageNumber()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MarkdownResultPage]. */
                class Builder internal constructor() {

                    private var markdown: JsonField<String>? = null
                    private var pageNumber: JsonField<Long>? = null
                    private var success: JsonValue = JsonValue.from(true)
                    private var footer: JsonField<String> = JsonMissing.of()
                    private var header: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(markdownResultPage: MarkdownResultPage) = apply {
                        markdown = markdownResultPage.markdown
                        pageNumber = markdownResultPage.pageNumber
                        success = markdownResultPage.success
                        footer = markdownResultPage.footer
                        header = markdownResultPage.header
                        additionalProperties =
                            markdownResultPage.additionalProperties.toMutableMap()
                    }

                    /** Markdown content of the page */
                    fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                    /**
                     * Sets [Builder.markdown] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.markdown] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun markdown(markdown: JsonField<String>) = apply { this.markdown = markdown }

                    /** Page number of the document */
                    fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

                    /**
                     * Sets [Builder.pageNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageNumber] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageNumber(pageNumber: JsonField<Long>) = apply {
                        this.pageNumber = pageNumber
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from(true)
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun success(success: JsonValue) = apply { this.success = success }

                    /** Footer of the page in markdown */
                    fun footer(footer: String?) = footer(JsonField.ofNullable(footer))

                    /** Alias for calling [Builder.footer] with `footer.orElse(null)`. */
                    fun footer(footer: Optional<String>) = footer(footer.getOrNull())

                    /**
                     * Sets [Builder.footer] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.footer] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun footer(footer: JsonField<String>) = apply { this.footer = footer }

                    /** Header of the page in markdown */
                    fun header(header: String?) = header(JsonField.ofNullable(header))

                    /** Alias for calling [Builder.header] with `header.orElse(null)`. */
                    fun header(header: Optional<String>) = header(header.getOrNull())

                    /**
                     * Sets [Builder.header] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.header] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun header(header: JsonField<String>) = apply { this.header = header }

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
                     * Returns an immutable instance of [MarkdownResultPage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .markdown()
                     * .pageNumber()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): MarkdownResultPage =
                        MarkdownResultPage(
                            checkRequired("markdown", markdown),
                            checkRequired("pageNumber", pageNumber),
                            success,
                            footer,
                            header,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): MarkdownResultPage = apply {
                    if (validated) {
                        return@apply
                    }

                    markdown()
                    pageNumber()
                    _success().let {
                        if (it != JsonValue.from(true)) {
                            throw LlamaCloudInvalidDataException(
                                "'success' is invalid, received $it"
                            )
                        }
                    }
                    footer()
                    header()
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
                    (if (markdown.asKnown().isPresent) 1 else 0) +
                        (if (pageNumber.asKnown().isPresent) 1 else 0) +
                        success.let { if (it == JsonValue.from(true)) 1 else 0 } +
                        (if (footer.asKnown().isPresent) 1 else 0) +
                        (if (header.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MarkdownResultPage &&
                        markdown == other.markdown &&
                        pageNumber == other.pageNumber &&
                        success == other.success &&
                        footer == other.footer &&
                        header == other.header &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        markdown,
                        pageNumber,
                        success,
                        footer,
                        header,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MarkdownResultPage{markdown=$markdown, pageNumber=$pageNumber, success=$success, footer=$footer, header=$header, additionalProperties=$additionalProperties}"
            }

            class FailedMarkdownPage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val error: JsonField<String>,
                private val pageNumber: JsonField<Long>,
                private val success: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("error")
                    @ExcludeMissing
                    error: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("page_number")
                    @ExcludeMissing
                    pageNumber: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("success") @ExcludeMissing success: JsonValue = JsonMissing.of(),
                ) : this(error, pageNumber, success, mutableMapOf())

                /**
                 * Error message describing the failure
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun error(): String = error.getRequired("error")

                /**
                 * Page number of the document
                 *
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun pageNumber(): Long = pageNumber.getRequired("page_number")

                /**
                 * Failure indicator
                 *
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from(false)
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("success") @ExcludeMissing fun _success(): JsonValue = success

                /**
                 * Returns the raw JSON value of [error].
                 *
                 * Unlike [error], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

                /**
                 * Returns the raw JSON value of [pageNumber].
                 *
                 * Unlike [pageNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("page_number")
                @ExcludeMissing
                fun _pageNumber(): JsonField<Long> = pageNumber

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
                     * [FailedMarkdownPage].
                     *
                     * The following fields are required:
                     * ```java
                     * .error()
                     * .pageNumber()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [FailedMarkdownPage]. */
                class Builder internal constructor() {

                    private var error: JsonField<String>? = null
                    private var pageNumber: JsonField<Long>? = null
                    private var success: JsonValue = JsonValue.from(false)
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(failedMarkdownPage: FailedMarkdownPage) = apply {
                        error = failedMarkdownPage.error
                        pageNumber = failedMarkdownPage.pageNumber
                        success = failedMarkdownPage.success
                        additionalProperties =
                            failedMarkdownPage.additionalProperties.toMutableMap()
                    }

                    /** Error message describing the failure */
                    fun error(error: String) = error(JsonField.of(error))

                    /**
                     * Sets [Builder.error] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.error] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun error(error: JsonField<String>) = apply { this.error = error }

                    /** Page number of the document */
                    fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

                    /**
                     * Sets [Builder.pageNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageNumber] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageNumber(pageNumber: JsonField<Long>) = apply {
                        this.pageNumber = pageNumber
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from(false)
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun success(success: JsonValue) = apply { this.success = success }

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
                     * Returns an immutable instance of [FailedMarkdownPage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .error()
                     * .pageNumber()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FailedMarkdownPage =
                        FailedMarkdownPage(
                            checkRequired("error", error),
                            checkRequired("pageNumber", pageNumber),
                            success,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): FailedMarkdownPage = apply {
                    if (validated) {
                        return@apply
                    }

                    error()
                    pageNumber()
                    _success().let {
                        if (it != JsonValue.from(false)) {
                            throw LlamaCloudInvalidDataException(
                                "'success' is invalid, received $it"
                            )
                        }
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
                    (if (error.asKnown().isPresent) 1 else 0) +
                        (if (pageNumber.asKnown().isPresent) 1 else 0) +
                        success.let { if (it == JsonValue.from(false)) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FailedMarkdownPage &&
                        error == other.error &&
                        pageNumber == other.pageNumber &&
                        success == other.success &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(error, pageNumber, success, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FailedMarkdownPage{error=$error, pageNumber=$pageNumber, success=$success, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Markdown &&
                pages == other.pages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pages, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Markdown{pages=$pages, additionalProperties=$additionalProperties}"
    }

    /** Result containing metadata (page level and general) for the parsed document. */
    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pages: JsonField<List<Page>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of()
        ) : this(pages, mutableMapOf())

        /**
         * List of page metadata entries
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pages(): List<Page> = pages.getRequired("pages")

        /**
         * Returns the raw JSON value of [pages].
         *
         * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

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
             * Returns a mutable builder for constructing an instance of [Metadata].
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var pages: JsonField<MutableList<Page>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                pages = metadata.pages.map { it.toMutableList() }
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            /** List of page metadata entries */
            fun pages(pages: List<Page>) = pages(JsonField.of(pages))

            /**
             * Sets [Builder.pages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pages] with a well-typed `List<Page>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pages(pages: JsonField<List<Page>>) = apply {
                this.pages = pages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Page] to [pages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPage(page: Page) = apply {
                pages =
                    (pages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pages", it).add(page)
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Metadata =
                Metadata(
                    checkRequired("pages", pages).map { it.toImmutable() },
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
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            pages().forEach { it.validate() }
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
            (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** Page-level metadata including confidence scores and presentation-specific data. */
        class Page
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val pageNumber: JsonField<Long>,
            private val confidence: JsonField<Double>,
            private val costOptimized: JsonField<Boolean>,
            private val originalOrientationAngle: JsonField<Long>,
            private val printedPageNumber: JsonField<String>,
            private val slideSectionName: JsonField<String>,
            private val speakerNotes: JsonField<String>,
            private val triggeredAutoMode: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("page_number")
                @ExcludeMissing
                pageNumber: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("confidence")
                @ExcludeMissing
                confidence: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cost_optimized")
                @ExcludeMissing
                costOptimized: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("original_orientation_angle")
                @ExcludeMissing
                originalOrientationAngle: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("printed_page_number")
                @ExcludeMissing
                printedPageNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("slide_section_name")
                @ExcludeMissing
                slideSectionName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("speaker_notes")
                @ExcludeMissing
                speakerNotes: JsonField<String> = JsonMissing.of(),
                @JsonProperty("triggered_auto_mode")
                @ExcludeMissing
                triggeredAutoMode: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                pageNumber,
                confidence,
                costOptimized,
                originalOrientationAngle,
                printedPageNumber,
                slideSectionName,
                speakerNotes,
                triggeredAutoMode,
                mutableMapOf(),
            )

            /**
             * Page number of the document
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pageNumber(): Long = pageNumber.getRequired("page_number")

            /**
             * Confidence score for the page parsing (0-1)
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun confidence(): Optional<Double> = confidence.getOptional("confidence")

            /**
             * Whether cost-optimized parsing was used for the page
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun costOptimized(): Optional<Boolean> = costOptimized.getOptional("cost_optimized")

            /**
             * Original orientation angle of the page in degrees
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun originalOrientationAngle(): Optional<Long> =
                originalOrientationAngle.getOptional("original_orientation_angle")

            /**
             * Printed page number as it appears in the document
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun printedPageNumber(): Optional<String> =
                printedPageNumber.getOptional("printed_page_number")

            /**
             * Section name from presentation slides
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun slideSectionName(): Optional<String> =
                slideSectionName.getOptional("slide_section_name")

            /**
             * Speaker notes from presentation slides
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun speakerNotes(): Optional<String> = speakerNotes.getOptional("speaker_notes")

            /**
             * Whether auto mode was triggered for the page
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun triggeredAutoMode(): Optional<Boolean> =
                triggeredAutoMode.getOptional("triggered_auto_mode")

            /**
             * Returns the raw JSON value of [pageNumber].
             *
             * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("page_number")
            @ExcludeMissing
            fun _pageNumber(): JsonField<Long> = pageNumber

            /**
             * Returns the raw JSON value of [confidence].
             *
             * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("confidence")
            @ExcludeMissing
            fun _confidence(): JsonField<Double> = confidence

            /**
             * Returns the raw JSON value of [costOptimized].
             *
             * Unlike [costOptimized], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cost_optimized")
            @ExcludeMissing
            fun _costOptimized(): JsonField<Boolean> = costOptimized

            /**
             * Returns the raw JSON value of [originalOrientationAngle].
             *
             * Unlike [originalOrientationAngle], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("original_orientation_angle")
            @ExcludeMissing
            fun _originalOrientationAngle(): JsonField<Long> = originalOrientationAngle

            /**
             * Returns the raw JSON value of [printedPageNumber].
             *
             * Unlike [printedPageNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("printed_page_number")
            @ExcludeMissing
            fun _printedPageNumber(): JsonField<String> = printedPageNumber

            /**
             * Returns the raw JSON value of [slideSectionName].
             *
             * Unlike [slideSectionName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("slide_section_name")
            @ExcludeMissing
            fun _slideSectionName(): JsonField<String> = slideSectionName

            /**
             * Returns the raw JSON value of [speakerNotes].
             *
             * Unlike [speakerNotes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("speaker_notes")
            @ExcludeMissing
            fun _speakerNotes(): JsonField<String> = speakerNotes

            /**
             * Returns the raw JSON value of [triggeredAutoMode].
             *
             * Unlike [triggeredAutoMode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("triggered_auto_mode")
            @ExcludeMissing
            fun _triggeredAutoMode(): JsonField<Boolean> = triggeredAutoMode

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
                 * Returns a mutable builder for constructing an instance of [Page].
                 *
                 * The following fields are required:
                 * ```java
                 * .pageNumber()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Page]. */
            class Builder internal constructor() {

                private var pageNumber: JsonField<Long>? = null
                private var confidence: JsonField<Double> = JsonMissing.of()
                private var costOptimized: JsonField<Boolean> = JsonMissing.of()
                private var originalOrientationAngle: JsonField<Long> = JsonMissing.of()
                private var printedPageNumber: JsonField<String> = JsonMissing.of()
                private var slideSectionName: JsonField<String> = JsonMissing.of()
                private var speakerNotes: JsonField<String> = JsonMissing.of()
                private var triggeredAutoMode: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(page: Page) = apply {
                    pageNumber = page.pageNumber
                    confidence = page.confidence
                    costOptimized = page.costOptimized
                    originalOrientationAngle = page.originalOrientationAngle
                    printedPageNumber = page.printedPageNumber
                    slideSectionName = page.slideSectionName
                    speakerNotes = page.speakerNotes
                    triggeredAutoMode = page.triggeredAutoMode
                    additionalProperties = page.additionalProperties.toMutableMap()
                }

                /** Page number of the document */
                fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

                /**
                 * Sets [Builder.pageNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageNumber] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pageNumber(pageNumber: JsonField<Long>) = apply { this.pageNumber = pageNumber }

                /** Confidence score for the page parsing (0-1) */
                fun confidence(confidence: Double?) = confidence(JsonField.ofNullable(confidence))

                /**
                 * Alias for [Builder.confidence].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun confidence(confidence: Double) = confidence(confidence as Double?)

                /** Alias for calling [Builder.confidence] with `confidence.orElse(null)`. */
                fun confidence(confidence: Optional<Double>) = confidence(confidence.getOrNull())

                /**
                 * Sets [Builder.confidence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.confidence] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun confidence(confidence: JsonField<Double>) = apply {
                    this.confidence = confidence
                }

                /** Whether cost-optimized parsing was used for the page */
                fun costOptimized(costOptimized: Boolean?) =
                    costOptimized(JsonField.ofNullable(costOptimized))

                /**
                 * Alias for [Builder.costOptimized].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun costOptimized(costOptimized: Boolean) = costOptimized(costOptimized as Boolean?)

                /** Alias for calling [Builder.costOptimized] with `costOptimized.orElse(null)`. */
                fun costOptimized(costOptimized: Optional<Boolean>) =
                    costOptimized(costOptimized.getOrNull())

                /**
                 * Sets [Builder.costOptimized] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.costOptimized] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun costOptimized(costOptimized: JsonField<Boolean>) = apply {
                    this.costOptimized = costOptimized
                }

                /** Original orientation angle of the page in degrees */
                fun originalOrientationAngle(originalOrientationAngle: Long?) =
                    originalOrientationAngle(JsonField.ofNullable(originalOrientationAngle))

                /**
                 * Alias for [Builder.originalOrientationAngle].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun originalOrientationAngle(originalOrientationAngle: Long) =
                    originalOrientationAngle(originalOrientationAngle as Long?)

                /**
                 * Alias for calling [Builder.originalOrientationAngle] with
                 * `originalOrientationAngle.orElse(null)`.
                 */
                fun originalOrientationAngle(originalOrientationAngle: Optional<Long>) =
                    originalOrientationAngle(originalOrientationAngle.getOrNull())

                /**
                 * Sets [Builder.originalOrientationAngle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originalOrientationAngle] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun originalOrientationAngle(originalOrientationAngle: JsonField<Long>) = apply {
                    this.originalOrientationAngle = originalOrientationAngle
                }

                /** Printed page number as it appears in the document */
                fun printedPageNumber(printedPageNumber: String?) =
                    printedPageNumber(JsonField.ofNullable(printedPageNumber))

                /**
                 * Alias for calling [Builder.printedPageNumber] with
                 * `printedPageNumber.orElse(null)`.
                 */
                fun printedPageNumber(printedPageNumber: Optional<String>) =
                    printedPageNumber(printedPageNumber.getOrNull())

                /**
                 * Sets [Builder.printedPageNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.printedPageNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun printedPageNumber(printedPageNumber: JsonField<String>) = apply {
                    this.printedPageNumber = printedPageNumber
                }

                /** Section name from presentation slides */
                fun slideSectionName(slideSectionName: String?) =
                    slideSectionName(JsonField.ofNullable(slideSectionName))

                /**
                 * Alias for calling [Builder.slideSectionName] with
                 * `slideSectionName.orElse(null)`.
                 */
                fun slideSectionName(slideSectionName: Optional<String>) =
                    slideSectionName(slideSectionName.getOrNull())

                /**
                 * Sets [Builder.slideSectionName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.slideSectionName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun slideSectionName(slideSectionName: JsonField<String>) = apply {
                    this.slideSectionName = slideSectionName
                }

                /** Speaker notes from presentation slides */
                fun speakerNotes(speakerNotes: String?) =
                    speakerNotes(JsonField.ofNullable(speakerNotes))

                /** Alias for calling [Builder.speakerNotes] with `speakerNotes.orElse(null)`. */
                fun speakerNotes(speakerNotes: Optional<String>) =
                    speakerNotes(speakerNotes.getOrNull())

                /**
                 * Sets [Builder.speakerNotes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.speakerNotes] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun speakerNotes(speakerNotes: JsonField<String>) = apply {
                    this.speakerNotes = speakerNotes
                }

                /** Whether auto mode was triggered for the page */
                fun triggeredAutoMode(triggeredAutoMode: Boolean?) =
                    triggeredAutoMode(JsonField.ofNullable(triggeredAutoMode))

                /**
                 * Alias for [Builder.triggeredAutoMode].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun triggeredAutoMode(triggeredAutoMode: Boolean) =
                    triggeredAutoMode(triggeredAutoMode as Boolean?)

                /**
                 * Alias for calling [Builder.triggeredAutoMode] with
                 * `triggeredAutoMode.orElse(null)`.
                 */
                fun triggeredAutoMode(triggeredAutoMode: Optional<Boolean>) =
                    triggeredAutoMode(triggeredAutoMode.getOrNull())

                /**
                 * Sets [Builder.triggeredAutoMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.triggeredAutoMode] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun triggeredAutoMode(triggeredAutoMode: JsonField<Boolean>) = apply {
                    this.triggeredAutoMode = triggeredAutoMode
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
                 * Returns an immutable instance of [Page].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .pageNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Page =
                    Page(
                        checkRequired("pageNumber", pageNumber),
                        confidence,
                        costOptimized,
                        originalOrientationAngle,
                        printedPageNumber,
                        slideSectionName,
                        speakerNotes,
                        triggeredAutoMode,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Page = apply {
                if (validated) {
                    return@apply
                }

                pageNumber()
                confidence()
                costOptimized()
                originalOrientationAngle()
                printedPageNumber()
                slideSectionName()
                speakerNotes()
                triggeredAutoMode()
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
                (if (pageNumber.asKnown().isPresent) 1 else 0) +
                    (if (confidence.asKnown().isPresent) 1 else 0) +
                    (if (costOptimized.asKnown().isPresent) 1 else 0) +
                    (if (originalOrientationAngle.asKnown().isPresent) 1 else 0) +
                    (if (printedPageNumber.asKnown().isPresent) 1 else 0) +
                    (if (slideSectionName.asKnown().isPresent) 1 else 0) +
                    (if (speakerNotes.asKnown().isPresent) 1 else 0) +
                    (if (triggeredAutoMode.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Page &&
                    pageNumber == other.pageNumber &&
                    confidence == other.confidence &&
                    costOptimized == other.costOptimized &&
                    originalOrientationAngle == other.originalOrientationAngle &&
                    printedPageNumber == other.printedPageNumber &&
                    slideSectionName == other.slideSectionName &&
                    speakerNotes == other.speakerNotes &&
                    triggeredAutoMode == other.triggeredAutoMode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    pageNumber,
                    confidence,
                    costOptimized,
                    originalOrientationAngle,
                    printedPageNumber,
                    slideSectionName,
                    speakerNotes,
                    triggeredAutoMode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Page{pageNumber=$pageNumber, confidence=$confidence, costOptimized=$costOptimized, originalOrientationAngle=$originalOrientationAngle, printedPageNumber=$printedPageNumber, slideSectionName=$slideSectionName, speakerNotes=$speakerNotes, triggeredAutoMode=$triggeredAutoMode, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                pages == other.pages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pages, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{pages=$pages, additionalProperties=$additionalProperties}"
    }

    class RawParameters
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

            /** Returns a mutable builder for constructing an instance of [RawParameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RawParameters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rawParameters: RawParameters) = apply {
                additionalProperties = rawParameters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RawParameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RawParameters = RawParameters(additionalProperties.toImmutable())
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
        fun validate(): RawParameters = apply {
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

            return other is RawParameters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RawParameters{additionalProperties=$additionalProperties}"
    }

    /** Metadata including size, existence, and presigned URLs for result files */
    class ResultContentMetadata
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

            /**
             * Returns a mutable builder for constructing an instance of [ResultContentMetadata].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResultContentMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resultContentMetadata: ResultContentMetadata) = apply {
                additionalProperties = resultContentMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ResultContentMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ResultContentMetadata =
                ResultContentMetadata(additionalProperties.toImmutable())
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
        fun validate(): ResultContentMetadata = apply {
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

            return other is ResultContentMetadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResultContentMetadata{additionalProperties=$additionalProperties}"
    }

    /** Plain text result (if requested) */
    class Text
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pages: JsonField<List<Page>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of()
        ) : this(pages, mutableMapOf())

        /**
         * List of text pages
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pages(): List<Page> = pages.getRequired("pages")

        /**
         * Returns the raw JSON value of [pages].
         *
         * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

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
             * Returns a mutable builder for constructing an instance of [Text].
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Text]. */
        class Builder internal constructor() {

            private var pages: JsonField<MutableList<Page>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(text: Text) = apply {
                pages = text.pages.map { it.toMutableList() }
                additionalProperties = text.additionalProperties.toMutableMap()
            }

            /** List of text pages */
            fun pages(pages: List<Page>) = pages(JsonField.of(pages))

            /**
             * Sets [Builder.pages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pages] with a well-typed `List<Page>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pages(pages: JsonField<List<Page>>) = apply {
                this.pages = pages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Page] to [pages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPage(page: Page) = apply {
                pages =
                    (pages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pages", it).add(page)
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
             * Returns an immutable instance of [Text].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Text =
                Text(
                    checkRequired("pages", pages).map { it.toImmutable() },
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
        fun validate(): Text = apply {
            if (validated) {
                return@apply
            }

            pages().forEach { it.validate() }
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
            (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Page
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val pageNumber: JsonField<Long>,
            private val text: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("page_number")
                @ExcludeMissing
                pageNumber: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            ) : this(pageNumber, text, mutableMapOf())

            /**
             * Page number of the document
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pageNumber(): Long = pageNumber.getRequired("page_number")

            /**
             * Plain text content of the page
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun text(): String = text.getRequired("text")

            /**
             * Returns the raw JSON value of [pageNumber].
             *
             * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("page_number")
            @ExcludeMissing
            fun _pageNumber(): JsonField<Long> = pageNumber

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
                 * Returns a mutable builder for constructing an instance of [Page].
                 *
                 * The following fields are required:
                 * ```java
                 * .pageNumber()
                 * .text()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Page]. */
            class Builder internal constructor() {

                private var pageNumber: JsonField<Long>? = null
                private var text: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(page: Page) = apply {
                    pageNumber = page.pageNumber
                    text = page.text
                    additionalProperties = page.additionalProperties.toMutableMap()
                }

                /** Page number of the document */
                fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

                /**
                 * Sets [Builder.pageNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageNumber] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pageNumber(pageNumber: JsonField<Long>) = apply { this.pageNumber = pageNumber }

                /** Plain text content of the page */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

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
                 * Returns an immutable instance of [Page].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .pageNumber()
                 * .text()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Page =
                    Page(
                        checkRequired("pageNumber", pageNumber),
                        checkRequired("text", text),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Page = apply {
                if (validated) {
                    return@apply
                }

                pageNumber()
                text()
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
                (if (pageNumber.asKnown().isPresent) 1 else 0) +
                    (if (text.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Page &&
                    pageNumber == other.pageNumber &&
                    text == other.text &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(pageNumber, text, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Page{pageNumber=$pageNumber, text=$text, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Text &&
                pages == other.pages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pages, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Text{pages=$pages, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParsingGetResponse &&
            job == other.job &&
            forms == other.forms &&
            imagesContentMetadata == other.imagesContentMetadata &&
            items == other.items &&
            jobMetadata == other.jobMetadata &&
            markdown == other.markdown &&
            markdownFull == other.markdownFull &&
            metadata == other.metadata &&
            rawParameters == other.rawParameters &&
            resultContentMetadata == other.resultContentMetadata &&
            text == other.text &&
            textFull == other.textFull &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            job,
            forms,
            imagesContentMetadata,
            items,
            jobMetadata,
            markdown,
            markdownFull,
            metadata,
            rawParameters,
            resultContentMetadata,
            text,
            textFull,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParsingGetResponse{job=$job, forms=$forms, imagesContentMetadata=$imagesContentMetadata, items=$items, jobMetadata=$jobMetadata, markdown=$markdown, markdownFull=$markdownFull, metadata=$metadata, rawParameters=$rawParameters, resultContentMetadata=$resultContentMetadata, text=$text, textFull=$textFull, additionalProperties=$additionalProperties}"
}
