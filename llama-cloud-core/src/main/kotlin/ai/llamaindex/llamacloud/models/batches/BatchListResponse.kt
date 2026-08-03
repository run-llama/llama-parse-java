// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.batches

import ai.llamaindex.llamacloud.core.Enum
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
 * A top-level batch.
 *
 * Example: { "id": "bat-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee", "project_id":
 * "prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee", "source_directory_id":
 * "dir-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee", "config": { "job": { "type": "parse_v2",
 * "configuration_id": "cfg-PARSE_AGENTIC" } }, "status": "COMPLETED", "results":
 * [ { "source_directory_file_id": "dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee", "job_reference": { "type": "parse_v2", "id": "pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee" }, "error_message": null } ]
 * }
 *
 * Batch-level ``FAILED`` means the orchestration failed and cannot provide a reliable per-file
 * result set. ``results`` is only populated when explicitly requested with ``expand=results`` and
 * may be ``null`` while a batch is still running.
 */
class BatchListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val config: JsonField<Config>,
    private val projectId: JsonField<String>,
    private val sourceDirectoryId: JsonField<String>,
    private val status: JsonField<Status>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val results: JsonField<List<Result>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_directory_id")
        @ExcludeMissing
        sourceDirectoryId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<Result>> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        config,
        projectId,
        sourceDirectoryId,
        status,
        createdAt,
        results,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Batch configuration snapshot.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun config(): Config = config.getRequired("config")

    /**
     * Project this batch belongs to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * Directory being processed.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceDirectoryId(): String = sourceDirectoryId.getRequired("source_directory_id")

    /**
     * Current batch status.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Expanded per-file result mappings. Null unless requested with expand=results, or while the
     * batch is still running.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun results(): Optional<List<Result>> = results.getOptional("results")

    /**
     * Update datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [sourceDirectoryId].
     *
     * Unlike [sourceDirectoryId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("source_directory_id")
    @ExcludeMissing
    fun _sourceDirectoryId(): JsonField<String> = sourceDirectoryId

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
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [BatchListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .config()
         * .projectId()
         * .sourceDirectoryId()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var config: JsonField<Config>? = null
        private var projectId: JsonField<String>? = null
        private var sourceDirectoryId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var results: JsonField<MutableList<Result>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(batchListResponse: BatchListResponse) = apply {
            id = batchListResponse.id
            config = batchListResponse.config
            projectId = batchListResponse.projectId
            sourceDirectoryId = batchListResponse.sourceDirectoryId
            status = batchListResponse.status
            createdAt = batchListResponse.createdAt
            results = batchListResponse.results.map { it.toMutableList() }
            updatedAt = batchListResponse.updatedAt
            additionalProperties = batchListResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Batch configuration snapshot. */
        fun config(config: Config) = config(JsonField.of(config))

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { this.config = config }

        /** Project this batch belongs to. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Directory being processed. */
        fun sourceDirectoryId(sourceDirectoryId: String) =
            sourceDirectoryId(JsonField.of(sourceDirectoryId))

        /**
         * Sets [Builder.sourceDirectoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceDirectoryId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceDirectoryId(sourceDirectoryId: JsonField<String>) = apply {
            this.sourceDirectoryId = sourceDirectoryId
        }

        /** Current batch status. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Expanded per-file result mappings. Null unless requested with expand=results, or while
         * the batch is still running.
         */
        fun results(results: List<Result>?) = results(JsonField.ofNullable(results))

        /** Alias for calling [Builder.results] with `results.orElse(null)`. */
        fun results(results: Optional<List<Result>>) = results(results.getOrNull())

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

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
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [BatchListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .config()
         * .projectId()
         * .sourceDirectoryId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchListResponse =
            BatchListResponse(
                checkRequired("id", id),
                checkRequired("config", config),
                checkRequired("projectId", projectId),
                checkRequired("sourceDirectoryId", sourceDirectoryId),
                checkRequired("status", status),
                createdAt,
                (results ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
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
    fun validate(): BatchListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        config().validate()
        projectId()
        sourceDirectoryId()
        status().validate()
        createdAt()
        results().ifPresent { it.forEach { it.validate() } }
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (config.asKnown().getOrNull()?.validity() ?: 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (sourceDirectoryId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Batch configuration snapshot. */
    class Config
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val job: JsonField<Job>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("job") @ExcludeMissing job: JsonField<Job> = JsonMissing.of()
        ) : this(job, mutableMapOf())

        /**
         * Job to create for each file in the source directory.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun job(): Job = job.getRequired("job")

        /**
         * Returns the raw JSON value of [job].
         *
         * Unlike [job], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("job") @ExcludeMissing fun _job(): JsonField<Job> = job

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
             * Returns a mutable builder for constructing an instance of [Config].
             *
             * The following fields are required:
             * ```java
             * .job()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Config]. */
        class Builder internal constructor() {

            private var job: JsonField<Job>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                job = config.job
                additionalProperties = config.additionalProperties.toMutableMap()
            }

            /** Job to create for each file in the source directory. */
            fun job(job: Job) = job(JsonField.of(job))

            /**
             * Sets [Builder.job] to an arbitrary JSON value.
             *
             * You should usually call [Builder.job] with a well-typed [Job] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun job(job: JsonField<Job>) = apply { this.job = job }

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
             * Returns an immutable instance of [Config].
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
            fun build(): Config =
                Config(checkRequired("job", job), additionalProperties.toMutableMap())
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
        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            job().validate()
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
        @JvmSynthetic internal fun validity(): Int = (job.asKnown().getOrNull()?.validity() ?: 0)

        /** Job to create for each file in the source directory. */
        class Job
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val configurationId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("configuration_id")
                @ExcludeMissing
                configurationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(configurationId, type, mutableMapOf())

            /**
             * Product configuration ID or built-in preset ID matching the job type.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun configurationId(): String = configurationId.getRequired("configuration_id")

            /**
             * Product job type to run for each source directory file.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [configurationId].
             *
             * Unlike [configurationId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("configuration_id")
            @ExcludeMissing
            fun _configurationId(): JsonField<String> = configurationId

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [Job].
                 *
                 * The following fields are required:
                 * ```java
                 * .configurationId()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Job]. */
            class Builder internal constructor() {

                private var configurationId: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(job: Job) = apply {
                    configurationId = job.configurationId
                    type = job.type
                    additionalProperties = job.additionalProperties.toMutableMap()
                }

                /** Product configuration ID or built-in preset ID matching the job type. */
                fun configurationId(configurationId: String) =
                    configurationId(JsonField.of(configurationId))

                /**
                 * Sets [Builder.configurationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.configurationId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun configurationId(configurationId: JsonField<String>) = apply {
                    this.configurationId = configurationId
                }

                /** Product job type to run for each source directory file. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Job].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .configurationId()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Job =
                    Job(
                        checkRequired("configurationId", configurationId),
                        checkRequired("type", type),
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
            fun validate(): Job = apply {
                if (validated) {
                    return@apply
                }

                configurationId()
                type().validate()
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
                (if (configurationId.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Product job type to run for each source directory file. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val PARSE_V2 = of("parse_v2")

                    @JvmField val EXTRACT_V2 = of("extract_v2")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PARSE_V2,
                    EXTRACT_V2,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PARSE_V2,
                    EXTRACT_V2,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PARSE_V2 -> Value.PARSE_V2
                        EXTRACT_V2 -> Value.EXTRACT_V2
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
                        PARSE_V2 -> Known.PARSE_V2
                        EXTRACT_V2 -> Known.EXTRACT_V2
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Job &&
                    configurationId == other.configurationId &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(configurationId, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Job{configurationId=$configurationId, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Config &&
                job == other.job &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(job, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Config{job=$job, additionalProperties=$additionalProperties}"
    }

    /** Current batch status. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmField val COMPLETED = of("COMPLETED")

            @JvmField val FAILED = of("FAILED")

            @JvmField val PENDING = of("PENDING")

            @JvmField val RUNNING = of("RUNNING")

            @JvmField val THROTTLED = of("THROTTLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            COMPLETED,
            FAILED,
            PENDING,
            RUNNING,
            THROTTLED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELLED,
            COMPLETED,
            FAILED,
            PENDING,
            RUNNING,
            THROTTLED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                PENDING -> Value.PENDING
                RUNNING -> Value.RUNNING
                THROTTLED -> Value.THROTTLED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                PENDING -> Known.PENDING
                RUNNING -> Known.RUNNING
                THROTTLED -> Known.THROTTLED
                else -> throw LlamaCloudInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
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

    /**
     * Result projection for one source directory file in a batch.
     *
     * Example: { "source_directory_file_id": "dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee",
     * "job_reference": { "type": "parse_v2", "id": "pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee" },
     * "error_message": null }
     *
     * This is a projection of directory-sync state, not a separate child resource that callers need
     * to create. The source directory file ID is the stable correlation key. Underlying job
     * progress and failures should be resolved through the referenced product job endpoint.
     */
    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val sourceDirectoryFileId: JsonField<String>,
        private val errorMessage: JsonField<String>,
        private val jobReference: JsonField<JobReference>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("source_directory_file_id")
            @ExcludeMissing
            sourceDirectoryFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error_message")
            @ExcludeMissing
            errorMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("job_reference")
            @ExcludeMissing
            jobReference: JsonField<JobReference> = JsonMissing.of(),
        ) : this(sourceDirectoryFileId, errorMessage, jobReference, mutableMapOf())

        /**
         * Source directory file processed by this batch.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceDirectoryFileId(): String =
            sourceDirectoryFileId.getRequired("source_directory_file_id")

        /**
         * Batch-level mapping error if the system could not create or associate a job for this
         * source file.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

        /**
         * Reference to a job produced by a batch.
         *
         * Example: { "type": "parse_v2", "id": "pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee" }
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun jobReference(): Optional<JobReference> = jobReference.getOptional("job_reference")

        /**
         * Returns the raw JSON value of [sourceDirectoryFileId].
         *
         * Unlike [sourceDirectoryFileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("source_directory_file_id")
        @ExcludeMissing
        fun _sourceDirectoryFileId(): JsonField<String> = sourceDirectoryFileId

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
         * Returns the raw JSON value of [jobReference].
         *
         * Unlike [jobReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("job_reference")
        @ExcludeMissing
        fun _jobReference(): JsonField<JobReference> = jobReference

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
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .sourceDirectoryFileId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var sourceDirectoryFileId: JsonField<String>? = null
            private var errorMessage: JsonField<String> = JsonMissing.of()
            private var jobReference: JsonField<JobReference> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                sourceDirectoryFileId = result.sourceDirectoryFileId
                errorMessage = result.errorMessage
                jobReference = result.jobReference
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** Source directory file processed by this batch. */
            fun sourceDirectoryFileId(sourceDirectoryFileId: String) =
                sourceDirectoryFileId(JsonField.of(sourceDirectoryFileId))

            /**
             * Sets [Builder.sourceDirectoryFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDirectoryFileId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sourceDirectoryFileId(sourceDirectoryFileId: JsonField<String>) = apply {
                this.sourceDirectoryFileId = sourceDirectoryFileId
            }

            /**
             * Batch-level mapping error if the system could not create or associate a job for this
             * source file.
             */
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

            /**
             * Reference to a job produced by a batch.
             *
             * Example: { "type": "parse_v2", "id": "pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee" }
             */
            fun jobReference(jobReference: JobReference?) =
                jobReference(JsonField.ofNullable(jobReference))

            /** Alias for calling [Builder.jobReference] with `jobReference.orElse(null)`. */
            fun jobReference(jobReference: Optional<JobReference>) =
                jobReference(jobReference.getOrNull())

            /**
             * Sets [Builder.jobReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobReference] with a well-typed [JobReference] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobReference(jobReference: JsonField<JobReference>) = apply {
                this.jobReference = jobReference
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .sourceDirectoryFileId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("sourceDirectoryFileId", sourceDirectoryFileId),
                    errorMessage,
                    jobReference,
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
        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            sourceDirectoryFileId()
            errorMessage()
            jobReference().ifPresent { it.validate() }
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
            (if (sourceDirectoryFileId.asKnown().isPresent) 1 else 0) +
                (if (errorMessage.asKnown().isPresent) 1 else 0) +
                (jobReference.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Reference to a job produced by a batch.
         *
         * Example: { "type": "parse_v2", "id": "pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee" }
         */
        class JobReference
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(id, type, mutableMapOf())

            /**
             * Job ID, such as a parse job ID.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Type of job produced for the file.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [JobReference].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [JobReference]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(jobReference: JobReference) = apply {
                    id = jobReference.id
                    type = jobReference.type
                    additionalProperties = jobReference.additionalProperties.toMutableMap()
                }

                /** Job ID, such as a parse job ID. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Type of job produced for the file. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [JobReference].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): JobReference =
                    JobReference(
                        checkRequired("id", id),
                        checkRequired("type", type),
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
            fun validate(): JobReference = apply {
                if (validated) {
                    return@apply
                }

                id()
                type().validate()
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
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Type of job produced for the file. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val PARSE_V2 = of("parse_v2")

                    @JvmField val EXTRACT_V2 = of("extract_v2")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PARSE_V2,
                    EXTRACT_V2,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PARSE_V2,
                    EXTRACT_V2,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PARSE_V2 -> Value.PARSE_V2
                        EXTRACT_V2 -> Value.EXTRACT_V2
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
                        PARSE_V2 -> Known.PARSE_V2
                        EXTRACT_V2 -> Known.EXTRACT_V2
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is JobReference &&
                    id == other.id &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "JobReference{id=$id, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                sourceDirectoryFileId == other.sourceDirectoryFileId &&
                errorMessage == other.errorMessage &&
                jobReference == other.jobReference &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(sourceDirectoryFileId, errorMessage, jobReference, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{sourceDirectoryFileId=$sourceDirectoryFileId, errorMessage=$errorMessage, jobReference=$jobReference, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchListResponse &&
            id == other.id &&
            config == other.config &&
            projectId == other.projectId &&
            sourceDirectoryId == other.sourceDirectoryId &&
            status == other.status &&
            createdAt == other.createdAt &&
            results == other.results &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            config,
            projectId,
            sourceDirectoryId,
            status,
            createdAt,
            results,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchListResponse{id=$id, config=$config, projectId=$projectId, sourceDirectoryId=$sourceDirectoryId, status=$status, createdAt=$createdAt, results=$results, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
