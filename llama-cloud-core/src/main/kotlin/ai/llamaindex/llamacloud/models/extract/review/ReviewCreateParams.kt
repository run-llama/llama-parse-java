// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.checkKnown
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

/**
 * Beta: answers 403 until extract review is enabled for the caller and their organization.
 *
 * Turn review on for an extract job.
 *
 * Fields read below `confidence_threshold`, and required fields left empty, are flagged for a
 * person to check. Every setting has a default, so the body can be left out. A job still running
 * can be named: it waits for review once it completes. A job that failed or was cancelled without a
 * review, or that cannot be reviewed, answers 409 with `code: job_not_reviewable`; a field in
 * `fields_in_scope` the job's schema does not have answers 400.
 *
 * Answers 201 with the new review, or 200 with the job's existing review, whose settings stay as
 * they are.
 */
class ReviewCreateParams
private constructor(
    private val jobId: String?,
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun jobId(): Optional<String> = Optional.ofNullable(jobId)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * Fields read below this confidence are flagged.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun confidenceThreshold(): Optional<Double> = body.confidenceThreshold()

    /**
     * JSON Pointers of the fields the threshold applies to; empty means all.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldsInScope(): Optional<List<String>> = body.fieldsInScope()

    /**
     * JSON Pointers of fields flagged when empty; defaults to the schema's required.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiredFields(): Optional<List<String>> = body.requiredFields()

    /**
     * Returns the raw JSON value of [confidenceThreshold].
     *
     * Unlike [confidenceThreshold], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _confidenceThreshold(): JsonField<Double> = body._confidenceThreshold()

    /**
     * Returns the raw JSON value of [fieldsInScope].
     *
     * Unlike [fieldsInScope], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fieldsInScope(): JsonField<List<String>> = body._fieldsInScope()

    /**
     * Returns the raw JSON value of [requiredFields].
     *
     * Unlike [requiredFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requiredFields(): JsonField<List<String>> = body._requiredFields()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ReviewCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ReviewCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReviewCreateParams]. */
    class Builder internal constructor() {

        private var jobId: String? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(reviewCreateParams: ReviewCreateParams) = apply {
            jobId = reviewCreateParams.jobId
            organizationId = reviewCreateParams.organizationId
            projectId = reviewCreateParams.projectId
            body = reviewCreateParams.body.toBuilder()
            additionalHeaders = reviewCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = reviewCreateParams.additionalQueryParams.toBuilder()
        }

        fun jobId(jobId: String?) = apply { this.jobId = jobId }

        /** Alias for calling [Builder.jobId] with `jobId.orElse(null)`. */
        fun jobId(jobId: Optional<String>) = jobId(jobId.getOrNull())

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
         * - [confidenceThreshold]
         * - [fieldsInScope]
         * - [requiredFields]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Fields read below this confidence are flagged. */
        fun confidenceThreshold(confidenceThreshold: Double) = apply {
            body.confidenceThreshold(confidenceThreshold)
        }

        /**
         * Sets [Builder.confidenceThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidenceThreshold] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun confidenceThreshold(confidenceThreshold: JsonField<Double>) = apply {
            body.confidenceThreshold(confidenceThreshold)
        }

        /** JSON Pointers of the fields the threshold applies to; empty means all. */
        fun fieldsInScope(fieldsInScope: List<String>) = apply { body.fieldsInScope(fieldsInScope) }

        /**
         * Sets [Builder.fieldsInScope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldsInScope] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fieldsInScope(fieldsInScope: JsonField<List<String>>) = apply {
            body.fieldsInScope(fieldsInScope)
        }

        /**
         * Adds a single [String] to [Builder.fieldsInScope].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFieldsInScope(fieldsInScope: String) = apply { body.addFieldsInScope(fieldsInScope) }

        /** JSON Pointers of fields flagged when empty; defaults to the schema's required. */
        fun requiredFields(requiredFields: List<String>?) = apply {
            body.requiredFields(requiredFields)
        }

        /** Alias for calling [Builder.requiredFields] with `requiredFields.orElse(null)`. */
        fun requiredFields(requiredFields: Optional<List<String>>) =
            requiredFields(requiredFields.getOrNull())

        /**
         * Sets [Builder.requiredFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredFields] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requiredFields(requiredFields: JsonField<List<String>>) = apply {
            body.requiredFields(requiredFields)
        }

        /**
         * Adds a single [String] to [requiredFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredField(requiredField: String) = apply { body.addRequiredField(requiredField) }

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
         * Returns an immutable instance of [ReviewCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReviewCreateParams =
            ReviewCreateParams(
                jobId,
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
            0 -> jobId ?: ""
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

    /** Turn review on for an extract job. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val confidenceThreshold: JsonField<Double>,
        private val fieldsInScope: JsonField<List<String>>,
        private val requiredFields: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("confidence_threshold")
            @ExcludeMissing
            confidenceThreshold: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fields_in_scope")
            @ExcludeMissing
            fieldsInScope: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("required_fields")
            @ExcludeMissing
            requiredFields: JsonField<List<String>> = JsonMissing.of(),
        ) : this(confidenceThreshold, fieldsInScope, requiredFields, mutableMapOf())

        /**
         * Fields read below this confidence are flagged.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun confidenceThreshold(): Optional<Double> =
            confidenceThreshold.getOptional("confidence_threshold")

        /**
         * JSON Pointers of the fields the threshold applies to; empty means all.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fieldsInScope(): Optional<List<String>> = fieldsInScope.getOptional("fields_in_scope")

        /**
         * JSON Pointers of fields flagged when empty; defaults to the schema's required.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requiredFields(): Optional<List<String>> = requiredFields.getOptional("required_fields")

        /**
         * Returns the raw JSON value of [confidenceThreshold].
         *
         * Unlike [confidenceThreshold], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("confidence_threshold")
        @ExcludeMissing
        fun _confidenceThreshold(): JsonField<Double> = confidenceThreshold

        /**
         * Returns the raw JSON value of [fieldsInScope].
         *
         * Unlike [fieldsInScope], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fields_in_scope")
        @ExcludeMissing
        fun _fieldsInScope(): JsonField<List<String>> = fieldsInScope

        /**
         * Returns the raw JSON value of [requiredFields].
         *
         * Unlike [requiredFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("required_fields")
        @ExcludeMissing
        fun _requiredFields(): JsonField<List<String>> = requiredFields

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

            private var confidenceThreshold: JsonField<Double> = JsonMissing.of()
            private var fieldsInScope: JsonField<MutableList<String>>? = null
            private var requiredFields: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                confidenceThreshold = body.confidenceThreshold
                fieldsInScope = body.fieldsInScope.map { it.toMutableList() }
                requiredFields = body.requiredFields.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Fields read below this confidence are flagged. */
            fun confidenceThreshold(confidenceThreshold: Double) =
                confidenceThreshold(JsonField.of(confidenceThreshold))

            /**
             * Sets [Builder.confidenceThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidenceThreshold] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun confidenceThreshold(confidenceThreshold: JsonField<Double>) = apply {
                this.confidenceThreshold = confidenceThreshold
            }

            /** JSON Pointers of the fields the threshold applies to; empty means all. */
            fun fieldsInScope(fieldsInScope: List<String>) =
                fieldsInScope(JsonField.of(fieldsInScope))

            /**
             * Sets [Builder.fieldsInScope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldsInScope] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fieldsInScope(fieldsInScope: JsonField<List<String>>) = apply {
                this.fieldsInScope = fieldsInScope.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.fieldsInScope].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFieldsInScope(fieldsInScope: String) = apply {
                this.fieldsInScope =
                    (this.fieldsInScope ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fieldsInScope", it).add(fieldsInScope)
                    }
            }

            /** JSON Pointers of fields flagged when empty; defaults to the schema's required. */
            fun requiredFields(requiredFields: List<String>?) =
                requiredFields(JsonField.ofNullable(requiredFields))

            /** Alias for calling [Builder.requiredFields] with `requiredFields.orElse(null)`. */
            fun requiredFields(requiredFields: Optional<List<String>>) =
                requiredFields(requiredFields.getOrNull())

            /**
             * Sets [Builder.requiredFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requiredFields] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requiredFields(requiredFields: JsonField<List<String>>) = apply {
                this.requiredFields = requiredFields.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [requiredFields].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequiredField(requiredField: String) = apply {
                requiredFields =
                    (requiredFields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("requiredFields", it).add(requiredField)
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
                    confidenceThreshold,
                    (fieldsInScope ?: JsonMissing.of()).map { it.toImmutable() },
                    (requiredFields ?: JsonMissing.of()).map { it.toImmutable() },
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

            confidenceThreshold()
            fieldsInScope()
            requiredFields()
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
            (if (confidenceThreshold.asKnown().isPresent) 1 else 0) +
                (fieldsInScope.asKnown().getOrNull()?.size ?: 0) +
                (requiredFields.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                confidenceThreshold == other.confidenceThreshold &&
                fieldsInScope == other.fieldsInScope &&
                requiredFields == other.requiredFields &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(confidenceThreshold, fieldsInScope, requiredFields, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{confidenceThreshold=$confidenceThreshold, fieldsInScope=$fieldsInScope, requiredFields=$requiredFields, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReviewCreateParams &&
            jobId == other.jobId &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            jobId,
            organizationId,
            projectId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ReviewCreateParams{jobId=$jobId, organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
