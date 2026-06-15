// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.datasources

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
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.getOrThrow
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import com.llamacloud_prod.api.models.CloudAzStorageBlobDataSource
import com.llamacloud_prod.api.models.CloudBoxDataSource
import com.llamacloud_prod.api.models.CloudConfluenceDataSource
import com.llamacloud_prod.api.models.CloudGoogleDriveDataSource
import com.llamacloud_prod.api.models.CloudJiraDataSource
import com.llamacloud_prod.api.models.CloudJiraDataSourceV2
import com.llamacloud_prod.api.models.CloudNotionPageDataSource
import com.llamacloud_prod.api.models.CloudOneDriveDataSource
import com.llamacloud_prod.api.models.CloudS3DataSource
import com.llamacloud_prod.api.models.CloudSharepointDataSource
import com.llamacloud_prod.api.models.CloudSlackDataSource
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema for a data source. */
class DataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val component: JsonField<Component>,
    private val name: JsonField<String>,
    private val projectId: JsonField<String>,
    private val sourceType: JsonField<SourceType>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customMetadata: JsonField<CustomMetadata>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val versionMetadata: JsonField<DataSourceReaderVersionMetadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("component")
        @ExcludeMissing
        component: JsonField<Component> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_type")
        @ExcludeMissing
        sourceType: JsonField<SourceType> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_metadata")
        @ExcludeMissing
        customMetadata: JsonField<CustomMetadata> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("version_metadata")
        @ExcludeMissing
        versionMetadata: JsonField<DataSourceReaderVersionMetadata> = JsonMissing.of(),
    ) : this(
        id,
        component,
        name,
        projectId,
        sourceType,
        createdAt,
        customMetadata,
        updatedAt,
        versionMetadata,
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
     * Component that implements the data source
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun component(): Component = component.getRequired("component")

    /**
     * The name of the data source.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceType(): SourceType = sourceType.getRequired("source_type")

    /**
     * Creation datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Custom metadata that will be present on all data loaded from the data source
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customMetadata(): Optional<CustomMetadata> = customMetadata.getOptional("custom_metadata")

    /**
     * Update datetime
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Version metadata for the data source
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun versionMetadata(): Optional<DataSourceReaderVersionMetadata> =
        versionMetadata.getOptional("version_metadata")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [component].
     *
     * Unlike [component], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("component") @ExcludeMissing fun _component(): JsonField<Component> = component

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_type")
    @ExcludeMissing
    fun _sourceType(): JsonField<SourceType> = sourceType

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customMetadata].
     *
     * Unlike [customMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_metadata")
    @ExcludeMissing
    fun _customMetadata(): JsonField<CustomMetadata> = customMetadata

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [versionMetadata].
     *
     * Unlike [versionMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version_metadata")
    @ExcludeMissing
    fun _versionMetadata(): JsonField<DataSourceReaderVersionMetadata> = versionMetadata

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
         * Returns a mutable builder for constructing an instance of [DataSource].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .component()
         * .name()
         * .projectId()
         * .sourceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataSource]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var component: JsonField<Component>? = null
        private var name: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var sourceType: JsonField<SourceType>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customMetadata: JsonField<CustomMetadata> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var versionMetadata: JsonField<DataSourceReaderVersionMetadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataSource: DataSource) = apply {
            id = dataSource.id
            component = dataSource.component
            name = dataSource.name
            projectId = dataSource.projectId
            sourceType = dataSource.sourceType
            createdAt = dataSource.createdAt
            customMetadata = dataSource.customMetadata
            updatedAt = dataSource.updatedAt
            versionMetadata = dataSource.versionMetadata
            additionalProperties = dataSource.additionalProperties.toMutableMap()
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

        /** Component that implements the data source */
        fun component(component: Component) = component(JsonField.of(component))

        /**
         * Sets [Builder.component] to an arbitrary JSON value.
         *
         * You should usually call [Builder.component] with a well-typed [Component] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun component(component: JsonField<Component>) = apply { this.component = component }

        /** Alias for calling [component] with `Component.ofUnionMember0(unionMember0)`. */
        fun component(unionMember0: Component.UnionMember0) =
            component(Component.ofUnionMember0(unionMember0))

        /**
         * Alias for calling [component] with `Component.ofCloudS3DataSource(cloudS3DataSource)`.
         */
        fun component(cloudS3DataSource: CloudS3DataSource) =
            component(Component.ofCloudS3DataSource(cloudS3DataSource))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudAzStorageBlobDataSource(cloudAzStorageBlobDataSource)`.
         */
        fun component(cloudAzStorageBlobDataSource: CloudAzStorageBlobDataSource) =
            component(Component.ofCloudAzStorageBlobDataSource(cloudAzStorageBlobDataSource))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudGoogleDriveDataSource(cloudGoogleDriveDataSource)`.
         */
        fun component(cloudGoogleDriveDataSource: CloudGoogleDriveDataSource) =
            component(Component.ofCloudGoogleDriveDataSource(cloudGoogleDriveDataSource))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudOneDriveDataSource(cloudOneDriveDataSource)`.
         */
        fun component(cloudOneDriveDataSource: CloudOneDriveDataSource) =
            component(Component.ofCloudOneDriveDataSource(cloudOneDriveDataSource))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudSharepointDataSource(cloudSharepointDataSource)`.
         */
        fun component(cloudSharepointDataSource: CloudSharepointDataSource) =
            component(Component.ofCloudSharepointDataSource(cloudSharepointDataSource))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudSlackDataSource(cloudSlackDataSource)`.
         */
        fun component(cloudSlackDataSource: CloudSlackDataSource) =
            component(Component.ofCloudSlackDataSource(cloudSlackDataSource))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudNotionPageDataSource(cloudNotionPageDataSource)`.
         */
        fun component(cloudNotionPageDataSource: CloudNotionPageDataSource) =
            component(Component.ofCloudNotionPageDataSource(cloudNotionPageDataSource))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudConfluenceDataSource(cloudConfluenceDataSource)`.
         */
        fun component(cloudConfluenceDataSource: CloudConfluenceDataSource) =
            component(Component.ofCloudConfluenceDataSource(cloudConfluenceDataSource))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudJiraDataSource(cloudJiraDataSource)`.
         */
        fun component(cloudJiraDataSource: CloudJiraDataSource) =
            component(Component.ofCloudJiraDataSource(cloudJiraDataSource))

        /**
         * Alias for calling [component] with
         * `Component.ofCloudJiraDataSourceV2(cloudJiraDataSourceV2)`.
         */
        fun component(cloudJiraDataSourceV2: CloudJiraDataSourceV2) =
            component(Component.ofCloudJiraDataSourceV2(cloudJiraDataSourceV2))

        /**
         * Alias for calling [component] with `Component.ofCloudBoxDataSource(cloudBoxDataSource)`.
         */
        fun component(cloudBoxDataSource: CloudBoxDataSource) =
            component(Component.ofCloudBoxDataSource(cloudBoxDataSource))

        /** The name of the data source. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceType(sourceType: JsonField<SourceType>) = apply { this.sourceType = sourceType }

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

        /** Custom metadata that will be present on all data loaded from the data source */
        fun customMetadata(customMetadata: CustomMetadata?) =
            customMetadata(JsonField.ofNullable(customMetadata))

        /** Alias for calling [Builder.customMetadata] with `customMetadata.orElse(null)`. */
        fun customMetadata(customMetadata: Optional<CustomMetadata>) =
            customMetadata(customMetadata.getOrNull())

        /**
         * Sets [Builder.customMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customMetadata] with a well-typed [CustomMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customMetadata(customMetadata: JsonField<CustomMetadata>) = apply {
            this.customMetadata = customMetadata
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

        /** Version metadata for the data source */
        fun versionMetadata(versionMetadata: DataSourceReaderVersionMetadata?) =
            versionMetadata(JsonField.ofNullable(versionMetadata))

        /** Alias for calling [Builder.versionMetadata] with `versionMetadata.orElse(null)`. */
        fun versionMetadata(versionMetadata: Optional<DataSourceReaderVersionMetadata>) =
            versionMetadata(versionMetadata.getOrNull())

        /**
         * Sets [Builder.versionMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.versionMetadata] with a well-typed
         * [DataSourceReaderVersionMetadata] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun versionMetadata(versionMetadata: JsonField<DataSourceReaderVersionMetadata>) = apply {
            this.versionMetadata = versionMetadata
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
         * Returns an immutable instance of [DataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .component()
         * .name()
         * .projectId()
         * .sourceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataSource =
            DataSource(
                checkRequired("id", id),
                checkRequired("component", component),
                checkRequired("name", name),
                checkRequired("projectId", projectId),
                checkRequired("sourceType", sourceType),
                createdAt,
                customMetadata,
                updatedAt,
                versionMetadata,
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
    fun validate(): DataSource = apply {
        if (validated) {
            return@apply
        }

        id()
        component().validate()
        name()
        projectId()
        sourceType().validate()
        createdAt()
        customMetadata().ifPresent { it.validate() }
        updatedAt()
        versionMetadata().ifPresent { it.validate() }
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
            (component.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (sourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (customMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (versionMetadata.asKnown().getOrNull()?.validity() ?: 0)

    /** Component that implements the data source */
    @JsonDeserialize(using = Component.Deserializer::class)
    @JsonSerialize(using = Component.Serializer::class)
    class Component
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val cloudS3DataSource: CloudS3DataSource? = null,
        private val cloudAzStorageBlobDataSource: CloudAzStorageBlobDataSource? = null,
        private val cloudGoogleDriveDataSource: CloudGoogleDriveDataSource? = null,
        private val cloudOneDriveDataSource: CloudOneDriveDataSource? = null,
        private val cloudSharepointDataSource: CloudSharepointDataSource? = null,
        private val cloudSlackDataSource: CloudSlackDataSource? = null,
        private val cloudNotionPageDataSource: CloudNotionPageDataSource? = null,
        private val cloudConfluenceDataSource: CloudConfluenceDataSource? = null,
        private val cloudJiraDataSource: CloudJiraDataSource? = null,
        private val cloudJiraDataSourceV2: CloudJiraDataSourceV2? = null,
        private val cloudBoxDataSource: CloudBoxDataSource? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun cloudS3DataSource(): Optional<CloudS3DataSource> =
            Optional.ofNullable(cloudS3DataSource)

        fun cloudAzStorageBlobDataSource(): Optional<CloudAzStorageBlobDataSource> =
            Optional.ofNullable(cloudAzStorageBlobDataSource)

        fun cloudGoogleDriveDataSource(): Optional<CloudGoogleDriveDataSource> =
            Optional.ofNullable(cloudGoogleDriveDataSource)

        fun cloudOneDriveDataSource(): Optional<CloudOneDriveDataSource> =
            Optional.ofNullable(cloudOneDriveDataSource)

        fun cloudSharepointDataSource(): Optional<CloudSharepointDataSource> =
            Optional.ofNullable(cloudSharepointDataSource)

        fun cloudSlackDataSource(): Optional<CloudSlackDataSource> =
            Optional.ofNullable(cloudSlackDataSource)

        fun cloudNotionPageDataSource(): Optional<CloudNotionPageDataSource> =
            Optional.ofNullable(cloudNotionPageDataSource)

        fun cloudConfluenceDataSource(): Optional<CloudConfluenceDataSource> =
            Optional.ofNullable(cloudConfluenceDataSource)

        /** Cloud Jira Data Source integrating JiraReader. */
        fun cloudJiraDataSource(): Optional<CloudJiraDataSource> =
            Optional.ofNullable(cloudJiraDataSource)

        /** Cloud Jira Data Source integrating JiraReaderV2. */
        fun cloudJiraDataSourceV2(): Optional<CloudJiraDataSourceV2> =
            Optional.ofNullable(cloudJiraDataSourceV2)

        fun cloudBoxDataSource(): Optional<CloudBoxDataSource> =
            Optional.ofNullable(cloudBoxDataSource)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isCloudS3DataSource(): Boolean = cloudS3DataSource != null

        fun isCloudAzStorageBlobDataSource(): Boolean = cloudAzStorageBlobDataSource != null

        fun isCloudGoogleDriveDataSource(): Boolean = cloudGoogleDriveDataSource != null

        fun isCloudOneDriveDataSource(): Boolean = cloudOneDriveDataSource != null

        fun isCloudSharepointDataSource(): Boolean = cloudSharepointDataSource != null

        fun isCloudSlackDataSource(): Boolean = cloudSlackDataSource != null

        fun isCloudNotionPageDataSource(): Boolean = cloudNotionPageDataSource != null

        fun isCloudConfluenceDataSource(): Boolean = cloudConfluenceDataSource != null

        fun isCloudJiraDataSource(): Boolean = cloudJiraDataSource != null

        fun isCloudJiraDataSourceV2(): Boolean = cloudJiraDataSourceV2 != null

        fun isCloudBoxDataSource(): Boolean = cloudBoxDataSource != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asCloudS3DataSource(): CloudS3DataSource =
            cloudS3DataSource.getOrThrow("cloudS3DataSource")

        fun asCloudAzStorageBlobDataSource(): CloudAzStorageBlobDataSource =
            cloudAzStorageBlobDataSource.getOrThrow("cloudAzStorageBlobDataSource")

        fun asCloudGoogleDriveDataSource(): CloudGoogleDriveDataSource =
            cloudGoogleDriveDataSource.getOrThrow("cloudGoogleDriveDataSource")

        fun asCloudOneDriveDataSource(): CloudOneDriveDataSource =
            cloudOneDriveDataSource.getOrThrow("cloudOneDriveDataSource")

        fun asCloudSharepointDataSource(): CloudSharepointDataSource =
            cloudSharepointDataSource.getOrThrow("cloudSharepointDataSource")

        fun asCloudSlackDataSource(): CloudSlackDataSource =
            cloudSlackDataSource.getOrThrow("cloudSlackDataSource")

        fun asCloudNotionPageDataSource(): CloudNotionPageDataSource =
            cloudNotionPageDataSource.getOrThrow("cloudNotionPageDataSource")

        fun asCloudConfluenceDataSource(): CloudConfluenceDataSource =
            cloudConfluenceDataSource.getOrThrow("cloudConfluenceDataSource")

        /** Cloud Jira Data Source integrating JiraReader. */
        fun asCloudJiraDataSource(): CloudJiraDataSource =
            cloudJiraDataSource.getOrThrow("cloudJiraDataSource")

        /** Cloud Jira Data Source integrating JiraReaderV2. */
        fun asCloudJiraDataSourceV2(): CloudJiraDataSourceV2 =
            cloudJiraDataSourceV2.getOrThrow("cloudJiraDataSourceV2")

        fun asCloudBoxDataSource(): CloudBoxDataSource =
            cloudBoxDataSource.getOrThrow("cloudBoxDataSource")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.llamacloud_prod.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = component.accept(new Component.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitUnionMember0(UnionMember0 unionMember0) {
         *         return Optional.of(unionMember0.toString());
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
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                cloudS3DataSource != null -> visitor.visitCloudS3DataSource(cloudS3DataSource)
                cloudAzStorageBlobDataSource != null ->
                    visitor.visitCloudAzStorageBlobDataSource(cloudAzStorageBlobDataSource)
                cloudGoogleDriveDataSource != null ->
                    visitor.visitCloudGoogleDriveDataSource(cloudGoogleDriveDataSource)
                cloudOneDriveDataSource != null ->
                    visitor.visitCloudOneDriveDataSource(cloudOneDriveDataSource)
                cloudSharepointDataSource != null ->
                    visitor.visitCloudSharepointDataSource(cloudSharepointDataSource)
                cloudSlackDataSource != null ->
                    visitor.visitCloudSlackDataSource(cloudSlackDataSource)
                cloudNotionPageDataSource != null ->
                    visitor.visitCloudNotionPageDataSource(cloudNotionPageDataSource)
                cloudConfluenceDataSource != null ->
                    visitor.visitCloudConfluenceDataSource(cloudConfluenceDataSource)
                cloudJiraDataSource != null -> visitor.visitCloudJiraDataSource(cloudJiraDataSource)
                cloudJiraDataSourceV2 != null ->
                    visitor.visitCloudJiraDataSourceV2(cloudJiraDataSourceV2)
                cloudBoxDataSource != null -> visitor.visitCloudBoxDataSource(cloudBoxDataSource)
                else -> visitor.unknown(_json)
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
        fun validate(): Component = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitCloudS3DataSource(cloudS3DataSource: CloudS3DataSource) {
                        cloudS3DataSource.validate()
                    }

                    override fun visitCloudAzStorageBlobDataSource(
                        cloudAzStorageBlobDataSource: CloudAzStorageBlobDataSource
                    ) {
                        cloudAzStorageBlobDataSource.validate()
                    }

                    override fun visitCloudGoogleDriveDataSource(
                        cloudGoogleDriveDataSource: CloudGoogleDriveDataSource
                    ) {
                        cloudGoogleDriveDataSource.validate()
                    }

                    override fun visitCloudOneDriveDataSource(
                        cloudOneDriveDataSource: CloudOneDriveDataSource
                    ) {
                        cloudOneDriveDataSource.validate()
                    }

                    override fun visitCloudSharepointDataSource(
                        cloudSharepointDataSource: CloudSharepointDataSource
                    ) {
                        cloudSharepointDataSource.validate()
                    }

                    override fun visitCloudSlackDataSource(
                        cloudSlackDataSource: CloudSlackDataSource
                    ) {
                        cloudSlackDataSource.validate()
                    }

                    override fun visitCloudNotionPageDataSource(
                        cloudNotionPageDataSource: CloudNotionPageDataSource
                    ) {
                        cloudNotionPageDataSource.validate()
                    }

                    override fun visitCloudConfluenceDataSource(
                        cloudConfluenceDataSource: CloudConfluenceDataSource
                    ) {
                        cloudConfluenceDataSource.validate()
                    }

                    override fun visitCloudJiraDataSource(
                        cloudJiraDataSource: CloudJiraDataSource
                    ) {
                        cloudJiraDataSource.validate()
                    }

                    override fun visitCloudJiraDataSourceV2(
                        cloudJiraDataSourceV2: CloudJiraDataSourceV2
                    ) {
                        cloudJiraDataSourceV2.validate()
                    }

                    override fun visitCloudBoxDataSource(cloudBoxDataSource: CloudBoxDataSource) {
                        cloudBoxDataSource.validate()
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
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitCloudS3DataSource(cloudS3DataSource: CloudS3DataSource) =
                        cloudS3DataSource.validity()

                    override fun visitCloudAzStorageBlobDataSource(
                        cloudAzStorageBlobDataSource: CloudAzStorageBlobDataSource
                    ) = cloudAzStorageBlobDataSource.validity()

                    override fun visitCloudGoogleDriveDataSource(
                        cloudGoogleDriveDataSource: CloudGoogleDriveDataSource
                    ) = cloudGoogleDriveDataSource.validity()

                    override fun visitCloudOneDriveDataSource(
                        cloudOneDriveDataSource: CloudOneDriveDataSource
                    ) = cloudOneDriveDataSource.validity()

                    override fun visitCloudSharepointDataSource(
                        cloudSharepointDataSource: CloudSharepointDataSource
                    ) = cloudSharepointDataSource.validity()

                    override fun visitCloudSlackDataSource(
                        cloudSlackDataSource: CloudSlackDataSource
                    ) = cloudSlackDataSource.validity()

                    override fun visitCloudNotionPageDataSource(
                        cloudNotionPageDataSource: CloudNotionPageDataSource
                    ) = cloudNotionPageDataSource.validity()

                    override fun visitCloudConfluenceDataSource(
                        cloudConfluenceDataSource: CloudConfluenceDataSource
                    ) = cloudConfluenceDataSource.validity()

                    override fun visitCloudJiraDataSource(
                        cloudJiraDataSource: CloudJiraDataSource
                    ) = cloudJiraDataSource.validity()

                    override fun visitCloudJiraDataSourceV2(
                        cloudJiraDataSourceV2: CloudJiraDataSourceV2
                    ) = cloudJiraDataSourceV2.validity()

                    override fun visitCloudBoxDataSource(cloudBoxDataSource: CloudBoxDataSource) =
                        cloudBoxDataSource.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Component &&
                unionMember0 == other.unionMember0 &&
                cloudS3DataSource == other.cloudS3DataSource &&
                cloudAzStorageBlobDataSource == other.cloudAzStorageBlobDataSource &&
                cloudGoogleDriveDataSource == other.cloudGoogleDriveDataSource &&
                cloudOneDriveDataSource == other.cloudOneDriveDataSource &&
                cloudSharepointDataSource == other.cloudSharepointDataSource &&
                cloudSlackDataSource == other.cloudSlackDataSource &&
                cloudNotionPageDataSource == other.cloudNotionPageDataSource &&
                cloudConfluenceDataSource == other.cloudConfluenceDataSource &&
                cloudJiraDataSource == other.cloudJiraDataSource &&
                cloudJiraDataSourceV2 == other.cloudJiraDataSourceV2 &&
                cloudBoxDataSource == other.cloudBoxDataSource
        }

        override fun hashCode(): Int =
            Objects.hash(
                unionMember0,
                cloudS3DataSource,
                cloudAzStorageBlobDataSource,
                cloudGoogleDriveDataSource,
                cloudOneDriveDataSource,
                cloudSharepointDataSource,
                cloudSlackDataSource,
                cloudNotionPageDataSource,
                cloudConfluenceDataSource,
                cloudJiraDataSource,
                cloudJiraDataSourceV2,
                cloudBoxDataSource,
            )

        override fun toString(): String =
            when {
                unionMember0 != null -> "Component{unionMember0=$unionMember0}"
                cloudS3DataSource != null -> "Component{cloudS3DataSource=$cloudS3DataSource}"
                cloudAzStorageBlobDataSource != null ->
                    "Component{cloudAzStorageBlobDataSource=$cloudAzStorageBlobDataSource}"
                cloudGoogleDriveDataSource != null ->
                    "Component{cloudGoogleDriveDataSource=$cloudGoogleDriveDataSource}"
                cloudOneDriveDataSource != null ->
                    "Component{cloudOneDriveDataSource=$cloudOneDriveDataSource}"
                cloudSharepointDataSource != null ->
                    "Component{cloudSharepointDataSource=$cloudSharepointDataSource}"
                cloudSlackDataSource != null ->
                    "Component{cloudSlackDataSource=$cloudSlackDataSource}"
                cloudNotionPageDataSource != null ->
                    "Component{cloudNotionPageDataSource=$cloudNotionPageDataSource}"
                cloudConfluenceDataSource != null ->
                    "Component{cloudConfluenceDataSource=$cloudConfluenceDataSource}"
                cloudJiraDataSource != null -> "Component{cloudJiraDataSource=$cloudJiraDataSource}"
                cloudJiraDataSourceV2 != null ->
                    "Component{cloudJiraDataSourceV2=$cloudJiraDataSourceV2}"
                cloudBoxDataSource != null -> "Component{cloudBoxDataSource=$cloudBoxDataSource}"
                _json != null -> "Component{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Component")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Component(unionMember0 = unionMember0)

            @JvmStatic
            fun ofCloudS3DataSource(cloudS3DataSource: CloudS3DataSource) =
                Component(cloudS3DataSource = cloudS3DataSource)

            @JvmStatic
            fun ofCloudAzStorageBlobDataSource(
                cloudAzStorageBlobDataSource: CloudAzStorageBlobDataSource
            ) = Component(cloudAzStorageBlobDataSource = cloudAzStorageBlobDataSource)

            @JvmStatic
            fun ofCloudGoogleDriveDataSource(
                cloudGoogleDriveDataSource: CloudGoogleDriveDataSource
            ) = Component(cloudGoogleDriveDataSource = cloudGoogleDriveDataSource)

            @JvmStatic
            fun ofCloudOneDriveDataSource(cloudOneDriveDataSource: CloudOneDriveDataSource) =
                Component(cloudOneDriveDataSource = cloudOneDriveDataSource)

            @JvmStatic
            fun ofCloudSharepointDataSource(cloudSharepointDataSource: CloudSharepointDataSource) =
                Component(cloudSharepointDataSource = cloudSharepointDataSource)

            @JvmStatic
            fun ofCloudSlackDataSource(cloudSlackDataSource: CloudSlackDataSource) =
                Component(cloudSlackDataSource = cloudSlackDataSource)

            @JvmStatic
            fun ofCloudNotionPageDataSource(cloudNotionPageDataSource: CloudNotionPageDataSource) =
                Component(cloudNotionPageDataSource = cloudNotionPageDataSource)

            @JvmStatic
            fun ofCloudConfluenceDataSource(cloudConfluenceDataSource: CloudConfluenceDataSource) =
                Component(cloudConfluenceDataSource = cloudConfluenceDataSource)

            /** Cloud Jira Data Source integrating JiraReader. */
            @JvmStatic
            fun ofCloudJiraDataSource(cloudJiraDataSource: CloudJiraDataSource) =
                Component(cloudJiraDataSource = cloudJiraDataSource)

            /** Cloud Jira Data Source integrating JiraReaderV2. */
            @JvmStatic
            fun ofCloudJiraDataSourceV2(cloudJiraDataSourceV2: CloudJiraDataSourceV2) =
                Component(cloudJiraDataSourceV2 = cloudJiraDataSourceV2)

            @JvmStatic
            fun ofCloudBoxDataSource(cloudBoxDataSource: CloudBoxDataSource) =
                Component(cloudBoxDataSource = cloudBoxDataSource)
        }

        /**
         * An interface that defines how to map each variant of [Component] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitCloudS3DataSource(cloudS3DataSource: CloudS3DataSource): T

            fun visitCloudAzStorageBlobDataSource(
                cloudAzStorageBlobDataSource: CloudAzStorageBlobDataSource
            ): T

            fun visitCloudGoogleDriveDataSource(
                cloudGoogleDriveDataSource: CloudGoogleDriveDataSource
            ): T

            fun visitCloudOneDriveDataSource(cloudOneDriveDataSource: CloudOneDriveDataSource): T

            fun visitCloudSharepointDataSource(
                cloudSharepointDataSource: CloudSharepointDataSource
            ): T

            fun visitCloudSlackDataSource(cloudSlackDataSource: CloudSlackDataSource): T

            fun visitCloudNotionPageDataSource(
                cloudNotionPageDataSource: CloudNotionPageDataSource
            ): T

            fun visitCloudConfluenceDataSource(
                cloudConfluenceDataSource: CloudConfluenceDataSource
            ): T

            /** Cloud Jira Data Source integrating JiraReader. */
            fun visitCloudJiraDataSource(cloudJiraDataSource: CloudJiraDataSource): T

            /** Cloud Jira Data Source integrating JiraReaderV2. */
            fun visitCloudJiraDataSourceV2(cloudJiraDataSourceV2: CloudJiraDataSourceV2): T

            fun visitCloudBoxDataSource(cloudBoxDataSource: CloudBoxDataSource): T

            /**
             * Maps an unknown variant of [Component] to a value of type [T].
             *
             * An instance of [Component] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown Component: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Component>(Component::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Component {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                Component(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudS3DataSource>())?.let {
                                Component(cloudS3DataSource = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudAzStorageBlobDataSource>())
                                ?.let {
                                    Component(cloudAzStorageBlobDataSource = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<CloudGoogleDriveDataSource>())
                                ?.let { Component(cloudGoogleDriveDataSource = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<CloudOneDriveDataSource>())?.let {
                                Component(cloudOneDriveDataSource = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudSharepointDataSource>())?.let {
                                Component(cloudSharepointDataSource = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudSlackDataSource>())?.let {
                                Component(cloudSlackDataSource = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudNotionPageDataSource>())?.let {
                                Component(cloudNotionPageDataSource = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudConfluenceDataSource>())?.let {
                                Component(cloudConfluenceDataSource = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudJiraDataSource>())?.let {
                                Component(cloudJiraDataSource = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudJiraDataSourceV2>())?.let {
                                Component(cloudJiraDataSourceV2 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CloudBoxDataSource>())?.let {
                                Component(cloudBoxDataSource = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Component(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Component>(Component::class) {

            override fun serialize(
                value: Component,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.cloudS3DataSource != null ->
                        generator.writeObject(value.cloudS3DataSource)
                    value.cloudAzStorageBlobDataSource != null ->
                        generator.writeObject(value.cloudAzStorageBlobDataSource)
                    value.cloudGoogleDriveDataSource != null ->
                        generator.writeObject(value.cloudGoogleDriveDataSource)
                    value.cloudOneDriveDataSource != null ->
                        generator.writeObject(value.cloudOneDriveDataSource)
                    value.cloudSharepointDataSource != null ->
                        generator.writeObject(value.cloudSharepointDataSource)
                    value.cloudSlackDataSource != null ->
                        generator.writeObject(value.cloudSlackDataSource)
                    value.cloudNotionPageDataSource != null ->
                        generator.writeObject(value.cloudNotionPageDataSource)
                    value.cloudConfluenceDataSource != null ->
                        generator.writeObject(value.cloudConfluenceDataSource)
                    value.cloudJiraDataSource != null ->
                        generator.writeObject(value.cloudJiraDataSource)
                    value.cloudJiraDataSourceV2 != null ->
                        generator.writeObject(value.cloudJiraDataSourceV2)
                    value.cloudBoxDataSource != null ->
                        generator.writeObject(value.cloudBoxDataSource)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Component")
                }
            }
        }

        class UnionMember0
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

                /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember0 = UnionMember0(additionalProperties.toImmutable())
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
            fun validate(): UnionMember0 = apply {
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

                return other is UnionMember0 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember0{additionalProperties=$additionalProperties}"
        }
    }

    class SourceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val S3 = of("S3")

            @JvmField val AZURE_STORAGE_BLOB = of("AZURE_STORAGE_BLOB")

            @JvmField val GOOGLE_DRIVE = of("GOOGLE_DRIVE")

            @JvmField val MICROSOFT_ONEDRIVE = of("MICROSOFT_ONEDRIVE")

            @JvmField val MICROSOFT_SHAREPOINT = of("MICROSOFT_SHAREPOINT")

            @JvmField val SLACK = of("SLACK")

            @JvmField val NOTION_PAGE = of("NOTION_PAGE")

            @JvmField val CONFLUENCE = of("CONFLUENCE")

            @JvmField val JIRA = of("JIRA")

            @JvmField val JIRA_V2 = of("JIRA_V2")

            @JvmField val BOX = of("BOX")

            @JvmStatic fun of(value: String) = SourceType(JsonField.of(value))
        }

        /** An enum containing [SourceType]'s known values. */
        enum class Known {
            S3,
            AZURE_STORAGE_BLOB,
            GOOGLE_DRIVE,
            MICROSOFT_ONEDRIVE,
            MICROSOFT_SHAREPOINT,
            SLACK,
            NOTION_PAGE,
            CONFLUENCE,
            JIRA,
            JIRA_V2,
            BOX,
        }

        /**
         * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            S3,
            AZURE_STORAGE_BLOB,
            GOOGLE_DRIVE,
            MICROSOFT_ONEDRIVE,
            MICROSOFT_SHAREPOINT,
            SLACK,
            NOTION_PAGE,
            CONFLUENCE,
            JIRA,
            JIRA_V2,
            BOX,
            /**
             * An enum member indicating that [SourceType] was instantiated with an unknown value.
             */
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
                S3 -> Value.S3
                AZURE_STORAGE_BLOB -> Value.AZURE_STORAGE_BLOB
                GOOGLE_DRIVE -> Value.GOOGLE_DRIVE
                MICROSOFT_ONEDRIVE -> Value.MICROSOFT_ONEDRIVE
                MICROSOFT_SHAREPOINT -> Value.MICROSOFT_SHAREPOINT
                SLACK -> Value.SLACK
                NOTION_PAGE -> Value.NOTION_PAGE
                CONFLUENCE -> Value.CONFLUENCE
                JIRA -> Value.JIRA
                JIRA_V2 -> Value.JIRA_V2
                BOX -> Value.BOX
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
                S3 -> Known.S3
                AZURE_STORAGE_BLOB -> Known.AZURE_STORAGE_BLOB
                GOOGLE_DRIVE -> Known.GOOGLE_DRIVE
                MICROSOFT_ONEDRIVE -> Known.MICROSOFT_ONEDRIVE
                MICROSOFT_SHAREPOINT -> Known.MICROSOFT_SHAREPOINT
                SLACK -> Known.SLACK
                NOTION_PAGE -> Known.NOTION_PAGE
                CONFLUENCE -> Known.CONFLUENCE
                JIRA -> Known.JIRA
                JIRA_V2 -> Known.JIRA_V2
                BOX -> Known.BOX
                else -> throw LlamaCloudInvalidDataException("Unknown SourceType: $value")
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
        fun validate(): SourceType = apply {
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

            return other is SourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Custom metadata that will be present on all data loaded from the data source */
    class CustomMetadata
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

            /** Returns a mutable builder for constructing an instance of [CustomMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customMetadata: CustomMetadata) = apply {
                additionalProperties = customMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomMetadata = CustomMetadata(additionalProperties.toImmutable())
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
        fun validate(): CustomMetadata = apply {
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

            return other is CustomMetadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomMetadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataSource &&
            id == other.id &&
            component == other.component &&
            name == other.name &&
            projectId == other.projectId &&
            sourceType == other.sourceType &&
            createdAt == other.createdAt &&
            customMetadata == other.customMetadata &&
            updatedAt == other.updatedAt &&
            versionMetadata == other.versionMetadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            component,
            name,
            projectId,
            sourceType,
            createdAt,
            customMetadata,
            updatedAt,
            versionMetadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataSource{id=$id, component=$component, name=$name, projectId=$projectId, sourceType=$sourceType, createdAt=$createdAt, customMetadata=$customMetadata, updatedAt=$updatedAt, versionMetadata=$versionMetadata, additionalProperties=$additionalProperties}"
}
