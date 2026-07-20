// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CloudSharepointDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientId: JsonField<String>,
    private val clientSecret: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val className: JsonField<String>,
    private val driveName: JsonField<String>,
    private val excludePathPatterns: JsonField<List<String>>,
    private val folderId: JsonField<String>,
    private val folderPath: JsonField<String>,
    private val getPermissions: JsonField<Boolean>,
    private val includePathPatterns: JsonField<List<String>>,
    private val requiredExts: JsonField<List<String>>,
    private val siteId: JsonField<String>,
    private val siteName: JsonField<String>,
    private val supportsAccessControl: JsonField<SupportsAccessControl>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("drive_name") @ExcludeMissing driveName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exclude_path_patterns")
        @ExcludeMissing
        excludePathPatterns: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("folder_id") @ExcludeMissing folderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("folder_path")
        @ExcludeMissing
        folderPath: JsonField<String> = JsonMissing.of(),
        @JsonProperty("get_permissions")
        @ExcludeMissing
        getPermissions: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("include_path_patterns")
        @ExcludeMissing
        includePathPatterns: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("required_exts")
        @ExcludeMissing
        requiredExts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("site_id") @ExcludeMissing siteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("site_name") @ExcludeMissing siteName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<SupportsAccessControl> = JsonMissing.of(),
    ) : this(
        clientId,
        clientSecret,
        tenantId,
        className,
        driveName,
        excludePathPatterns,
        folderId,
        folderPath,
        getPermissions,
        includePathPatterns,
        requiredExts,
        siteId,
        siteName,
        supportsAccessControl,
        mutableMapOf(),
    )

    /**
     * The client ID to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientId(): String = clientId.getRequired("client_id")

    /**
     * The client secret to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientSecret(): String = clientSecret.getRequired("client_secret")

    /**
     * The tenant ID to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The name of the Sharepoint drive to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun driveName(): Optional<String> = driveName.getOptional("drive_name")

    /**
     * List of regex patterns for file paths to exclude. Files whose paths (including filename)
     * match any pattern will be excluded. Example: ['/temp/', '/backup/', '\.git/', '\.tmp$', '^~']
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludePathPatterns(): Optional<List<String>> =
        excludePathPatterns.getOptional("exclude_path_patterns")

    /**
     * The ID of the Sharepoint folder to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderId(): Optional<String> = folderId.getOptional("folder_id")

    /**
     * The path of the Sharepoint folder to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderPath(): Optional<String> = folderPath.getOptional("folder_path")

    /**
     * Whether to get permissions for the sharepoint site.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun getPermissions(): Optional<Boolean> = getPermissions.getOptional("get_permissions")

    /**
     * List of regex patterns for file paths to include. Full paths (including filename) must match
     * at least one pattern to be included. Example:
     * ['/reports/', '/docs/.*\.pdf$', '^Report.*\.pdf$']
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includePathPatterns(): Optional<List<String>> =
        includePathPatterns.getOptional("include_path_patterns")

    /**
     * The list of required file extensions.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiredExts(): Optional<List<String>> = requiredExts.getOptional("required_exts")

    /**
     * The ID of the SharePoint site to download from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun siteId(): Optional<String> = siteId.getOptional("site_id")

    /**
     * The name of the SharePoint site to download from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun siteName(): Optional<String> = siteName.getOptional("site_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsAccessControl(): Optional<SupportsAccessControl> =
        supportsAccessControl.getOptional("supports_access_control")

    /**
     * Returns the raw JSON value of [clientId].
     *
     * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

    /**
     * Returns the raw JSON value of [clientSecret].
     *
     * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_secret")
    @ExcludeMissing
    fun _clientSecret(): JsonField<String> = clientSecret

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [driveName].
     *
     * Unlike [driveName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("drive_name") @ExcludeMissing fun _driveName(): JsonField<String> = driveName

    /**
     * Returns the raw JSON value of [excludePathPatterns].
     *
     * Unlike [excludePathPatterns], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("exclude_path_patterns")
    @ExcludeMissing
    fun _excludePathPatterns(): JsonField<List<String>> = excludePathPatterns

    /**
     * Returns the raw JSON value of [folderId].
     *
     * Unlike [folderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder_id") @ExcludeMissing fun _folderId(): JsonField<String> = folderId

    /**
     * Returns the raw JSON value of [folderPath].
     *
     * Unlike [folderPath], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder_path") @ExcludeMissing fun _folderPath(): JsonField<String> = folderPath

    /**
     * Returns the raw JSON value of [getPermissions].
     *
     * Unlike [getPermissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("get_permissions")
    @ExcludeMissing
    fun _getPermissions(): JsonField<Boolean> = getPermissions

    /**
     * Returns the raw JSON value of [includePathPatterns].
     *
     * Unlike [includePathPatterns], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("include_path_patterns")
    @ExcludeMissing
    fun _includePathPatterns(): JsonField<List<String>> = includePathPatterns

    /**
     * Returns the raw JSON value of [requiredExts].
     *
     * Unlike [requiredExts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required_exts")
    @ExcludeMissing
    fun _requiredExts(): JsonField<List<String>> = requiredExts

    /**
     * Returns the raw JSON value of [siteId].
     *
     * Unlike [siteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("site_id") @ExcludeMissing fun _siteId(): JsonField<String> = siteId

    /**
     * Returns the raw JSON value of [siteName].
     *
     * Unlike [siteName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("site_name") @ExcludeMissing fun _siteName(): JsonField<String> = siteName

    /**
     * Returns the raw JSON value of [supportsAccessControl].
     *
     * Unlike [supportsAccessControl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supports_access_control")
    @ExcludeMissing
    fun _supportsAccessControl(): JsonField<SupportsAccessControl> = supportsAccessControl

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
         * Returns a mutable builder for constructing an instance of [CloudSharepointDataSource].
         *
         * The following fields are required:
         * ```java
         * .clientId()
         * .clientSecret()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudSharepointDataSource]. */
    class Builder internal constructor() {

        private var clientId: JsonField<String>? = null
        private var clientSecret: JsonField<String>? = null
        private var tenantId: JsonField<String>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var driveName: JsonField<String> = JsonMissing.of()
        private var excludePathPatterns: JsonField<MutableList<String>>? = null
        private var folderId: JsonField<String> = JsonMissing.of()
        private var folderPath: JsonField<String> = JsonMissing.of()
        private var getPermissions: JsonField<Boolean> = JsonMissing.of()
        private var includePathPatterns: JsonField<MutableList<String>>? = null
        private var requiredExts: JsonField<MutableList<String>>? = null
        private var siteId: JsonField<String> = JsonMissing.of()
        private var siteName: JsonField<String> = JsonMissing.of()
        private var supportsAccessControl: JsonField<SupportsAccessControl> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudSharepointDataSource: CloudSharepointDataSource) = apply {
            clientId = cloudSharepointDataSource.clientId
            clientSecret = cloudSharepointDataSource.clientSecret
            tenantId = cloudSharepointDataSource.tenantId
            className = cloudSharepointDataSource.className
            driveName = cloudSharepointDataSource.driveName
            excludePathPatterns =
                cloudSharepointDataSource.excludePathPatterns.map { it.toMutableList() }
            folderId = cloudSharepointDataSource.folderId
            folderPath = cloudSharepointDataSource.folderPath
            getPermissions = cloudSharepointDataSource.getPermissions
            includePathPatterns =
                cloudSharepointDataSource.includePathPatterns.map { it.toMutableList() }
            requiredExts = cloudSharepointDataSource.requiredExts.map { it.toMutableList() }
            siteId = cloudSharepointDataSource.siteId
            siteName = cloudSharepointDataSource.siteName
            supportsAccessControl = cloudSharepointDataSource.supportsAccessControl
            additionalProperties = cloudSharepointDataSource.additionalProperties.toMutableMap()
        }

        /** The client ID to use for authentication. */
        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        /** The client secret to use for authentication. */
        fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

        /**
         * Sets [Builder.clientSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientSecret(clientSecret: JsonField<String>) = apply {
            this.clientSecret = clientSecret
        }

        /** The tenant ID to use for authentication. */
        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** The name of the Sharepoint drive to read from. */
        fun driveName(driveName: String?) = driveName(JsonField.ofNullable(driveName))

        /** Alias for calling [Builder.driveName] with `driveName.orElse(null)`. */
        fun driveName(driveName: Optional<String>) = driveName(driveName.getOrNull())

        /**
         * Sets [Builder.driveName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.driveName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun driveName(driveName: JsonField<String>) = apply { this.driveName = driveName }

        /**
         * List of regex patterns for file paths to exclude. Files whose paths (including filename)
         * match any pattern will be excluded. Example:
         * ['/temp/', '/backup/', '\.git/', '\.tmp$', '^~']
         */
        fun excludePathPatterns(excludePathPatterns: List<String>?) =
            excludePathPatterns(JsonField.ofNullable(excludePathPatterns))

        /**
         * Alias for calling [Builder.excludePathPatterns] with `excludePathPatterns.orElse(null)`.
         */
        fun excludePathPatterns(excludePathPatterns: Optional<List<String>>) =
            excludePathPatterns(excludePathPatterns.getOrNull())

        /**
         * Sets [Builder.excludePathPatterns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludePathPatterns] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun excludePathPatterns(excludePathPatterns: JsonField<List<String>>) = apply {
            this.excludePathPatterns = excludePathPatterns.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [excludePathPatterns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludePathPattern(excludePathPattern: String) = apply {
            excludePathPatterns =
                (excludePathPatterns ?: JsonField.of(mutableListOf())).also {
                    checkKnown("excludePathPatterns", it).add(excludePathPattern)
                }
        }

        /** The ID of the Sharepoint folder to read from. */
        fun folderId(folderId: String?) = folderId(JsonField.ofNullable(folderId))

        /** Alias for calling [Builder.folderId] with `folderId.orElse(null)`. */
        fun folderId(folderId: Optional<String>) = folderId(folderId.getOrNull())

        /**
         * Sets [Builder.folderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folderId(folderId: JsonField<String>) = apply { this.folderId = folderId }

        /** The path of the Sharepoint folder to read from. */
        fun folderPath(folderPath: String?) = folderPath(JsonField.ofNullable(folderPath))

        /** Alias for calling [Builder.folderPath] with `folderPath.orElse(null)`. */
        fun folderPath(folderPath: Optional<String>) = folderPath(folderPath.getOrNull())

        /**
         * Sets [Builder.folderPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderPath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun folderPath(folderPath: JsonField<String>) = apply { this.folderPath = folderPath }

        /** Whether to get permissions for the sharepoint site. */
        fun getPermissions(getPermissions: Boolean) = getPermissions(JsonField.of(getPermissions))

        /**
         * Sets [Builder.getPermissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.getPermissions] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun getPermissions(getPermissions: JsonField<Boolean>) = apply {
            this.getPermissions = getPermissions
        }

        /**
         * List of regex patterns for file paths to include. Full paths (including filename) must
         * match at least one pattern to be included. Example:
         * ['/reports/', '/docs/.*\.pdf$', '^Report.*\.pdf$']
         */
        fun includePathPatterns(includePathPatterns: List<String>?) =
            includePathPatterns(JsonField.ofNullable(includePathPatterns))

        /**
         * Alias for calling [Builder.includePathPatterns] with `includePathPatterns.orElse(null)`.
         */
        fun includePathPatterns(includePathPatterns: Optional<List<String>>) =
            includePathPatterns(includePathPatterns.getOrNull())

        /**
         * Sets [Builder.includePathPatterns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includePathPatterns] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun includePathPatterns(includePathPatterns: JsonField<List<String>>) = apply {
            this.includePathPatterns = includePathPatterns.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [includePathPatterns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludePathPattern(includePathPattern: String) = apply {
            includePathPatterns =
                (includePathPatterns ?: JsonField.of(mutableListOf())).also {
                    checkKnown("includePathPatterns", it).add(includePathPattern)
                }
        }

        /** The list of required file extensions. */
        fun requiredExts(requiredExts: List<String>?) =
            requiredExts(JsonField.ofNullable(requiredExts))

        /** Alias for calling [Builder.requiredExts] with `requiredExts.orElse(null)`. */
        fun requiredExts(requiredExts: Optional<List<String>>) =
            requiredExts(requiredExts.getOrNull())

        /**
         * Sets [Builder.requiredExts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredExts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requiredExts(requiredExts: JsonField<List<String>>) = apply {
            this.requiredExts = requiredExts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [requiredExts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredExt(requiredExt: String) = apply {
            requiredExts =
                (requiredExts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiredExts", it).add(requiredExt)
                }
        }

        /** The ID of the SharePoint site to download from. */
        fun siteId(siteId: String?) = siteId(JsonField.ofNullable(siteId))

        /** Alias for calling [Builder.siteId] with `siteId.orElse(null)`. */
        fun siteId(siteId: Optional<String>) = siteId(siteId.getOrNull())

        /**
         * Sets [Builder.siteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.siteId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun siteId(siteId: JsonField<String>) = apply { this.siteId = siteId }

        /** The name of the SharePoint site to download from. */
        fun siteName(siteName: String?) = siteName(JsonField.ofNullable(siteName))

        /** Alias for calling [Builder.siteName] with `siteName.orElse(null)`. */
        fun siteName(siteName: Optional<String>) = siteName(siteName.getOrNull())

        /**
         * Sets [Builder.siteName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.siteName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun siteName(siteName: JsonField<String>) = apply { this.siteName = siteName }

        fun supportsAccessControl(supportsAccessControl: SupportsAccessControl) =
            supportsAccessControl(JsonField.of(supportsAccessControl))

        /**
         * Sets [Builder.supportsAccessControl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportsAccessControl] with a well-typed
         * [SupportsAccessControl] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun supportsAccessControl(supportsAccessControl: JsonField<SupportsAccessControl>) = apply {
            this.supportsAccessControl = supportsAccessControl
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
         * Returns an immutable instance of [CloudSharepointDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clientId()
         * .clientSecret()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudSharepointDataSource =
            CloudSharepointDataSource(
                checkRequired("clientId", clientId),
                checkRequired("clientSecret", clientSecret),
                checkRequired("tenantId", tenantId),
                className,
                driveName,
                (excludePathPatterns ?: JsonMissing.of()).map { it.toImmutable() },
                folderId,
                folderPath,
                getPermissions,
                (includePathPatterns ?: JsonMissing.of()).map { it.toImmutable() },
                (requiredExts ?: JsonMissing.of()).map { it.toImmutable() },
                siteId,
                siteName,
                supportsAccessControl,
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
    fun validate(): CloudSharepointDataSource = apply {
        if (validated) {
            return@apply
        }

        clientId()
        clientSecret()
        tenantId()
        className()
        driveName()
        excludePathPatterns()
        folderId()
        folderPath()
        getPermissions()
        includePathPatterns()
        requiredExts()
        siteId()
        siteName()
        supportsAccessControl().ifPresent { it.validate() }
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
        (if (clientId.asKnown().isPresent) 1 else 0) +
            (if (clientSecret.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (driveName.asKnown().isPresent) 1 else 0) +
            (excludePathPatterns.asKnown().getOrNull()?.size ?: 0) +
            (if (folderId.asKnown().isPresent) 1 else 0) +
            (if (folderPath.asKnown().isPresent) 1 else 0) +
            (if (getPermissions.asKnown().isPresent) 1 else 0) +
            (includePathPatterns.asKnown().getOrNull()?.size ?: 0) +
            (requiredExts.asKnown().getOrNull()?.size ?: 0) +
            (if (siteId.asKnown().isPresent) 1 else 0) +
            (if (siteName.asKnown().isPresent) 1 else 0) +
            (supportsAccessControl.asKnown().getOrNull()?.validity() ?: 0)

    class SupportsAccessControl
    @JsonCreator
    private constructor(private val value: JsonField<Boolean>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            @JvmField val TRUE = of(true)

            @JvmStatic fun of(value: Boolean) = SupportsAccessControl(JsonField.of(value))
        }

        /** An enum containing [SupportsAccessControl]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [SupportsAccessControl]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SupportsAccessControl] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [SupportsAccessControl] was instantiated with an
             * unknown value.
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
                TRUE -> Value.TRUE
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
                TRUE -> Known.TRUE
                else ->
                    throw LlamaCloudInvalidDataException("Unknown SupportsAccessControl: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean().orElseThrow {
                LlamaCloudInvalidDataException("Value is not a Boolean")
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
        fun validate(): SupportsAccessControl = apply {
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

            return other is SupportsAccessControl && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudSharepointDataSource &&
            clientId == other.clientId &&
            clientSecret == other.clientSecret &&
            tenantId == other.tenantId &&
            className == other.className &&
            driveName == other.driveName &&
            excludePathPatterns == other.excludePathPatterns &&
            folderId == other.folderId &&
            folderPath == other.folderPath &&
            getPermissions == other.getPermissions &&
            includePathPatterns == other.includePathPatterns &&
            requiredExts == other.requiredExts &&
            siteId == other.siteId &&
            siteName == other.siteName &&
            supportsAccessControl == other.supportsAccessControl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clientId,
            clientSecret,
            tenantId,
            className,
            driveName,
            excludePathPatterns,
            folderId,
            folderPath,
            getPermissions,
            includePathPatterns,
            requiredExts,
            siteId,
            siteName,
            supportsAccessControl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudSharepointDataSource{clientId=$clientId, clientSecret=$clientSecret, tenantId=$tenantId, className=$className, driveName=$driveName, excludePathPatterns=$excludePathPatterns, folderId=$folderId, folderPath=$folderPath, getPermissions=$getPermissions, includePathPatterns=$includePathPatterns, requiredExts=$requiredExts, siteId=$siteId, siteName=$siteName, supportsAccessControl=$supportsAccessControl, additionalProperties=$additionalProperties}"
}
