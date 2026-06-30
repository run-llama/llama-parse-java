// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.indexes

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A searchable index over a directory of documents. */
class IndexCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val exportConfigId: JsonField<String>,
    private val name: JsonField<String>,
    private val outputDirectoryId: JsonField<String>,
    private val projectId: JsonField<String>,
    private val sourceDirectoryId: JsonField<String>,
    private val syncConfigId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val lastExportedAt: JsonField<OffsetDateTime>,
    private val lastSyncedAt: JsonField<OffsetDateTime>,
    private val metadata: JsonField<Metadata>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("export_config_id")
        @ExcludeMissing
        exportConfigId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("output_directory_id")
        @ExcludeMissing
        outputDirectoryId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_directory_id")
        @ExcludeMissing
        sourceDirectoryId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sync_config_id")
        @ExcludeMissing
        syncConfigId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_exported_at")
        @ExcludeMissing
        lastExportedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_synced_at")
        @ExcludeMissing
        lastSyncedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        exportConfigId,
        name,
        outputDirectoryId,
        projectId,
        sourceDirectoryId,
        syncConfigId,
        createdAt,
        description,
        lastExportedAt,
        lastSyncedAt,
        metadata,
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
     * ID of the export configuration.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exportConfigId(): String = exportConfigId.getRequired("export_config_id")

    /**
     * Index name.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * ID of the output directory holding the indexed files.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputDirectoryId(): String = outputDirectoryId.getRequired("output_directory_id")

    /**
     * Project this index belongs to.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * ID of the source directory.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceDirectoryId(): String = sourceDirectoryId.getRequired("source_directory_id")

    /**
     * ID of the sync configuration.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun syncConfigId(): String = syncConfigId.getRequired("sync_config_id")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Index description.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Last export time.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastExportedAt(): Optional<OffsetDateTime> = lastExportedAt.getOptional("last_exported_at")

    /**
     * Last sync time.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastSyncedAt(): Optional<OffsetDateTime> = lastSyncedAt.getOptional("last_synced_at")

    /**
     * Build state and diagnostic info.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

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
     * Returns the raw JSON value of [exportConfigId].
     *
     * Unlike [exportConfigId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("export_config_id")
    @ExcludeMissing
    fun _exportConfigId(): JsonField<String> = exportConfigId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [outputDirectoryId].
     *
     * Unlike [outputDirectoryId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("output_directory_id")
    @ExcludeMissing
    fun _outputDirectoryId(): JsonField<String> = outputDirectoryId

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
     * Returns the raw JSON value of [syncConfigId].
     *
     * Unlike [syncConfigId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sync_config_id")
    @ExcludeMissing
    fun _syncConfigId(): JsonField<String> = syncConfigId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [lastExportedAt].
     *
     * Unlike [lastExportedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_exported_at")
    @ExcludeMissing
    fun _lastExportedAt(): JsonField<OffsetDateTime> = lastExportedAt

    /**
     * Returns the raw JSON value of [lastSyncedAt].
     *
     * Unlike [lastSyncedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_synced_at")
    @ExcludeMissing
    fun _lastSyncedAt(): JsonField<OffsetDateTime> = lastSyncedAt

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
         * Returns a mutable builder for constructing an instance of [IndexCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .exportConfigId()
         * .name()
         * .outputDirectoryId()
         * .projectId()
         * .sourceDirectoryId()
         * .syncConfigId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IndexCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var exportConfigId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var outputDirectoryId: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var sourceDirectoryId: JsonField<String>? = null
        private var syncConfigId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var lastExportedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastSyncedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(indexCreateResponse: IndexCreateResponse) = apply {
            id = indexCreateResponse.id
            exportConfigId = indexCreateResponse.exportConfigId
            name = indexCreateResponse.name
            outputDirectoryId = indexCreateResponse.outputDirectoryId
            projectId = indexCreateResponse.projectId
            sourceDirectoryId = indexCreateResponse.sourceDirectoryId
            syncConfigId = indexCreateResponse.syncConfigId
            createdAt = indexCreateResponse.createdAt
            description = indexCreateResponse.description
            lastExportedAt = indexCreateResponse.lastExportedAt
            lastSyncedAt = indexCreateResponse.lastSyncedAt
            metadata = indexCreateResponse.metadata
            updatedAt = indexCreateResponse.updatedAt
            additionalProperties = indexCreateResponse.additionalProperties.toMutableMap()
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

        /** ID of the export configuration. */
        fun exportConfigId(exportConfigId: String) = exportConfigId(JsonField.of(exportConfigId))

        /**
         * Sets [Builder.exportConfigId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exportConfigId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exportConfigId(exportConfigId: JsonField<String>) = apply {
            this.exportConfigId = exportConfigId
        }

        /** Index name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** ID of the output directory holding the indexed files. */
        fun outputDirectoryId(outputDirectoryId: String) =
            outputDirectoryId(JsonField.of(outputDirectoryId))

        /**
         * Sets [Builder.outputDirectoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputDirectoryId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputDirectoryId(outputDirectoryId: JsonField<String>) = apply {
            this.outputDirectoryId = outputDirectoryId
        }

        /** Project this index belongs to. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** ID of the source directory. */
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

        /** ID of the sync configuration. */
        fun syncConfigId(syncConfigId: String) = syncConfigId(JsonField.of(syncConfigId))

        /**
         * Sets [Builder.syncConfigId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syncConfigId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun syncConfigId(syncConfigId: JsonField<String>) = apply {
            this.syncConfigId = syncConfigId
        }

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

        /** Index description. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Last export time. */
        fun lastExportedAt(lastExportedAt: OffsetDateTime?) =
            lastExportedAt(JsonField.ofNullable(lastExportedAt))

        /** Alias for calling [Builder.lastExportedAt] with `lastExportedAt.orElse(null)`. */
        fun lastExportedAt(lastExportedAt: Optional<OffsetDateTime>) =
            lastExportedAt(lastExportedAt.getOrNull())

        /**
         * Sets [Builder.lastExportedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastExportedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastExportedAt(lastExportedAt: JsonField<OffsetDateTime>) = apply {
            this.lastExportedAt = lastExportedAt
        }

        /** Last sync time. */
        fun lastSyncedAt(lastSyncedAt: OffsetDateTime?) =
            lastSyncedAt(JsonField.ofNullable(lastSyncedAt))

        /** Alias for calling [Builder.lastSyncedAt] with `lastSyncedAt.orElse(null)`. */
        fun lastSyncedAt(lastSyncedAt: Optional<OffsetDateTime>) =
            lastSyncedAt(lastSyncedAt.getOrNull())

        /**
         * Sets [Builder.lastSyncedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastSyncedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastSyncedAt(lastSyncedAt: JsonField<OffsetDateTime>) = apply {
            this.lastSyncedAt = lastSyncedAt
        }

        /** Build state and diagnostic info. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
         * Returns an immutable instance of [IndexCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .exportConfigId()
         * .name()
         * .outputDirectoryId()
         * .projectId()
         * .sourceDirectoryId()
         * .syncConfigId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndexCreateResponse =
            IndexCreateResponse(
                checkRequired("id", id),
                checkRequired("exportConfigId", exportConfigId),
                checkRequired("name", name),
                checkRequired("outputDirectoryId", outputDirectoryId),
                checkRequired("projectId", projectId),
                checkRequired("sourceDirectoryId", sourceDirectoryId),
                checkRequired("syncConfigId", syncConfigId),
                createdAt,
                description,
                lastExportedAt,
                lastSyncedAt,
                metadata,
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
    fun validate(): IndexCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        exportConfigId()
        name()
        outputDirectoryId()
        projectId()
        sourceDirectoryId()
        syncConfigId()
        createdAt()
        description()
        lastExportedAt()
        lastSyncedAt()
        metadata().ifPresent { it.validate() }
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
            (if (exportConfigId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (outputDirectoryId.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (sourceDirectoryId.asKnown().isPresent) 1 else 0) +
            (if (syncConfigId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (lastExportedAt.asKnown().isPresent) 1 else 0) +
            (if (lastSyncedAt.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Build state and diagnostic info. */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndexCreateResponse &&
            id == other.id &&
            exportConfigId == other.exportConfigId &&
            name == other.name &&
            outputDirectoryId == other.outputDirectoryId &&
            projectId == other.projectId &&
            sourceDirectoryId == other.sourceDirectoryId &&
            syncConfigId == other.syncConfigId &&
            createdAt == other.createdAt &&
            description == other.description &&
            lastExportedAt == other.lastExportedAt &&
            lastSyncedAt == other.lastSyncedAt &&
            metadata == other.metadata &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            exportConfigId,
            name,
            outputDirectoryId,
            projectId,
            sourceDirectoryId,
            syncConfigId,
            createdAt,
            description,
            lastExportedAt,
            lastSyncedAt,
            metadata,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndexCreateResponse{id=$id, exportConfigId=$exportConfigId, name=$name, outputDirectoryId=$outputDirectoryId, projectId=$projectId, sourceDirectoryId=$sourceDirectoryId, syncConfigId=$syncConfigId, createdAt=$createdAt, description=$description, lastExportedAt=$lastExportedAt, lastSyncedAt=$lastSyncedAt, metadata=$metadata, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
