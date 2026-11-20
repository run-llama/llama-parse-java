// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.Enum
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

/**
 * Beta: answers 403 until extract review is enabled for the caller and their organization.
 *
 * Confirm, correct, clear, restore or undo fields of a completed job.
 *
 * The changes apply in order, in one write. A job without a review gets one with the default
 * settings, at revision 0. A path that is not a field of the job, or a value the field's schema
 * refuses, answers 400 and changes nothing. A job that has not completed answers 409 with `code:
 * job_not_reviewable`. A `revision` other than the review's latest answers 409 with `code:
 * stale_revision` and the latest `revision`.
 */
class ReviewChangeFieldsParams
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
     * Changes to apply, in order.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun changes(): List<Change> = body.changes()

    /**
     * The review's revision as the caller last read it.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun revision(): Long = body.revision()

    /**
     * Returns the raw JSON value of [changes].
     *
     * Unlike [changes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _changes(): JsonField<List<Change>> = body._changes()

    /**
     * Returns the raw JSON value of [revision].
     *
     * Unlike [revision], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _revision(): JsonField<Long> = body._revision()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReviewChangeFieldsParams].
         *
         * The following fields are required:
         * ```java
         * .changes()
         * .revision()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReviewChangeFieldsParams]. */
    class Builder internal constructor() {

        private var jobId: String? = null
        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(reviewChangeFieldsParams: ReviewChangeFieldsParams) = apply {
            jobId = reviewChangeFieldsParams.jobId
            organizationId = reviewChangeFieldsParams.organizationId
            projectId = reviewChangeFieldsParams.projectId
            body = reviewChangeFieldsParams.body.toBuilder()
            additionalHeaders = reviewChangeFieldsParams.additionalHeaders.toBuilder()
            additionalQueryParams = reviewChangeFieldsParams.additionalQueryParams.toBuilder()
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
         * - [changes]
         * - [revision]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Changes to apply, in order. */
        fun changes(changes: List<Change>) = apply { body.changes(changes) }

        /**
         * Sets [Builder.changes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changes] with a well-typed `List<Change>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun changes(changes: JsonField<List<Change>>) = apply { body.changes(changes) }

        /**
         * Adds a single [Change] to [changes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChange(change: Change) = apply { body.addChange(change) }

        /** The review's revision as the caller last read it. */
        fun revision(revision: Long) = apply { body.revision(revision) }

        /**
         * Sets [Builder.revision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revision] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revision(revision: JsonField<Long>) = apply { body.revision(revision) }

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
         * Returns an immutable instance of [ReviewChangeFieldsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .changes()
         * .revision()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReviewChangeFieldsParams =
            ReviewChangeFieldsParams(
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

    /**
     * Changes to a job's fields, applied in order. A job without a review gets one, at revision 0.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val changes: JsonField<List<Change>>,
        private val revision: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("changes")
            @ExcludeMissing
            changes: JsonField<List<Change>> = JsonMissing.of(),
            @JsonProperty("revision") @ExcludeMissing revision: JsonField<Long> = JsonMissing.of(),
        ) : this(changes, revision, mutableMapOf())

        /**
         * Changes to apply, in order.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun changes(): List<Change> = changes.getRequired("changes")

        /**
         * The review's revision as the caller last read it.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun revision(): Long = revision.getRequired("revision")

        /**
         * Returns the raw JSON value of [changes].
         *
         * Unlike [changes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("changes") @ExcludeMissing fun _changes(): JsonField<List<Change>> = changes

        /**
         * Returns the raw JSON value of [revision].
         *
         * Unlike [revision], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("revision") @ExcludeMissing fun _revision(): JsonField<Long> = revision

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
             * .changes()
             * .revision()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var changes: JsonField<MutableList<Change>>? = null
            private var revision: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                changes = body.changes.map { it.toMutableList() }
                revision = body.revision
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Changes to apply, in order. */
            fun changes(changes: List<Change>) = changes(JsonField.of(changes))

            /**
             * Sets [Builder.changes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.changes] with a well-typed `List<Change>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun changes(changes: JsonField<List<Change>>) = apply {
                this.changes = changes.map { it.toMutableList() }
            }

            /**
             * Adds a single [Change] to [changes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChange(change: Change) = apply {
                changes =
                    (changes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("changes", it).add(change)
                    }
            }

            /** The review's revision as the caller last read it. */
            fun revision(revision: Long) = revision(JsonField.of(revision))

            /**
             * Sets [Builder.revision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revision] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun revision(revision: JsonField<Long>) = apply { this.revision = revision }

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
             * .changes()
             * .revision()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("changes", changes).map { it.toImmutable() },
                    checkRequired("revision", revision),
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

            changes().forEach { it.validate() }
            revision()
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
            (changes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (revision.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                changes == other.changes &&
                revision == other.revision &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(changes, revision, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{changes=$changes, revision=$revision, additionalProperties=$additionalProperties}"
    }

    /** One change to one field. */
    class Change
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val change: JsonField<InnerChange>,
        private val path: JsonField<String>,
        private val value: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("change")
            @ExcludeMissing
            change: JsonField<InnerChange> = JsonMissing.of(),
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
        ) : this(change, path, value, mutableMapOf())

        /**
         * confirm, correct to `value`, clear, restore the model's value, or undo.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun change(): InnerChange = change.getRequired("change")

        /**
         * JSON Pointer of the field.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun path(): String = path.getRequired("path")

        /**
         * The corrected value, for `correct`.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = change.value().convert(MyClass.class);
         * ```
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

        /**
         * Returns the raw JSON value of [change].
         *
         * Unlike [change], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("change") @ExcludeMissing fun _change(): JsonField<InnerChange> = change

        /**
         * Returns the raw JSON value of [path].
         *
         * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

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
             * Returns a mutable builder for constructing an instance of [Change].
             *
             * The following fields are required:
             * ```java
             * .change()
             * .path()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Change]. */
        class Builder internal constructor() {

            private var change: JsonField<InnerChange>? = null
            private var path: JsonField<String>? = null
            private var value: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(change: Change) = apply {
                this.change = change.change
                path = change.path
                value = change.value
                additionalProperties = change.additionalProperties.toMutableMap()
            }

            /** confirm, correct to `value`, clear, restore the model's value, or undo. */
            fun change(change: InnerChange) = change(JsonField.of(change))

            /**
             * Sets [Builder.change] to an arbitrary JSON value.
             *
             * You should usually call [Builder.change] with a well-typed [InnerChange] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun change(change: JsonField<InnerChange>) = apply { this.change = change }

            /** JSON Pointer of the field. */
            fun path(path: String) = path(JsonField.of(path))

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            /** The corrected value, for `correct`. */
            fun value(value: JsonValue) = apply { this.value = value }

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
             * Returns an immutable instance of [Change].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .change()
             * .path()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Change =
                Change(
                    checkRequired("change", change),
                    checkRequired("path", path),
                    value,
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
        fun validate(): Change = apply {
            if (validated) {
                return@apply
            }

            change().validate()
            path()
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
            (change.asKnown().getOrNull()?.validity() ?: 0) +
                (if (path.asKnown().isPresent) 1 else 0)

        /** confirm, correct to `value`, clear, restore the model's value, or undo. */
        class InnerChange @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val CLEAR = of("clear")

                @JvmField val CONFIRM = of("confirm")

                @JvmField val CORRECT = of("correct")

                @JvmField val RESTORE = of("restore")

                @JvmField val UNDO = of("undo")

                @JvmStatic fun of(value: String) = InnerChange(JsonField.of(value))
            }

            /** An enum containing [InnerChange]'s known values. */
            enum class Known {
                CLEAR,
                CONFIRM,
                CORRECT,
                RESTORE,
                UNDO,
            }

            /**
             * An enum containing [InnerChange]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [InnerChange] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CLEAR,
                CONFIRM,
                CORRECT,
                RESTORE,
                UNDO,
                /**
                 * An enum member indicating that [InnerChange] was instantiated with an unknown
                 * value.
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
                    CLEAR -> Value.CLEAR
                    CONFIRM -> Value.CONFIRM
                    CORRECT -> Value.CORRECT
                    RESTORE -> Value.RESTORE
                    UNDO -> Value.UNDO
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
                    CLEAR -> Known.CLEAR
                    CONFIRM -> Known.CONFIRM
                    CORRECT -> Known.CORRECT
                    RESTORE -> Known.RESTORE
                    UNDO -> Known.UNDO
                    else -> throw LlamaCloudInvalidDataException("Unknown InnerChange: $value")
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
            fun validate(): InnerChange = apply {
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

                return other is InnerChange && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Change &&
                change == other.change &&
                path == other.path &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(change, path, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Change{change=$change, path=$path, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReviewChangeFieldsParams &&
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
        "ReviewChangeFieldsParams{jobId=$jobId, organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
