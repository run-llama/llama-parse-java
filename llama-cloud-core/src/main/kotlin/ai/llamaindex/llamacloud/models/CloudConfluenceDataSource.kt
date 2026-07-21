// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CloudConfluenceDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authenticationMechanism: JsonField<String>,
    private val serverUrl: JsonField<String>,
    private val apiToken: JsonField<String>,
    private val className: JsonField<String>,
    private val cql: JsonField<String>,
    private val failureHandling: JsonField<FailureHandlingConfig>,
    private val indexRestrictedPages: JsonField<Boolean>,
    private val keepMarkdownFormat: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val pageIds: JsonField<String>,
    private val spaceKey: JsonField<String>,
    private val supportsAccessControl: JsonField<Boolean>,
    private val syncPermissions: JsonField<Boolean>,
    private val userName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authentication_mechanism")
        @ExcludeMissing
        authenticationMechanism: JsonField<String> = JsonMissing.of(),
        @JsonProperty("server_url") @ExcludeMissing serverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_token") @ExcludeMissing apiToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cql") @ExcludeMissing cql: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failure_handling")
        @ExcludeMissing
        failureHandling: JsonField<FailureHandlingConfig> = JsonMissing.of(),
        @JsonProperty("index_restricted_pages")
        @ExcludeMissing
        indexRestrictedPages: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("keep_markdown_format")
        @ExcludeMissing
        keepMarkdownFormat: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("page_ids") @ExcludeMissing pageIds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("space_key") @ExcludeMissing spaceKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sync_permissions")
        @ExcludeMissing
        syncPermissions: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("user_name") @ExcludeMissing userName: JsonField<String> = JsonMissing.of(),
    ) : this(
        authenticationMechanism,
        serverUrl,
        apiToken,
        className,
        cql,
        failureHandling,
        indexRestrictedPages,
        keepMarkdownFormat,
        label,
        pageIds,
        spaceKey,
        supportsAccessControl,
        syncPermissions,
        userName,
        mutableMapOf(),
    )

    /**
     * Type of Authentication for connecting to Confluence APIs.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticationMechanism(): String =
        authenticationMechanism.getRequired("authentication_mechanism")

    /**
     * The server URL of the Confluence instance.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun serverUrl(): String = serverUrl.getRequired("server_url")

    /**
     * The API token to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiToken(): Optional<String> = apiToken.getOptional("api_token")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The CQL query to use for fetching pages.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cql(): Optional<String> = cql.getOptional("cql")

    /**
     * Configuration for handling failures during processing. Key-value object controlling failure
     * handling behaviors.
     *
     * Example: { "skip_list_failures": true }
     *
     * Currently supports:
     * - skip_list_failures: Skip failed batches/lists and continue processing
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureHandling(): Optional<FailureHandlingConfig> =
        failureHandling.getOptional("failure_handling")

    /**
     * Whether to index restricted pages.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indexRestrictedPages(): Optional<Boolean> =
        indexRestrictedPages.getOptional("index_restricted_pages")

    /**
     * Whether to keep the markdown format.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keepMarkdownFormat(): Optional<Boolean> =
        keepMarkdownFormat.getOptional("keep_markdown_format")

    /**
     * The label to use for fetching pages.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * The page IDs of the Confluence to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageIds(): Optional<String> = pageIds.getOptional("page_ids")

    /**
     * The space key to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spaceKey(): Optional<String> = spaceKey.getOptional("space_key")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsAccessControl(): Optional<Boolean> =
        supportsAccessControl.getOptional("supports_access_control")

    /**
     * Whether to fetch space-level permissions (allowed users/groups) and attach them to document
     * metadata for access control. Disable for Confluence Server/Data Center versions whose
     * permission APIs are unavailable (e.g. the JSON-RPC API removed in Data Center 9.2.6+), which
     * otherwise surface as 401 errors during sync.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun syncPermissions(): Optional<Boolean> = syncPermissions.getOptional("sync_permissions")

    /**
     * The username to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userName(): Optional<String> = userName.getOptional("user_name")

    /**
     * Returns the raw JSON value of [authenticationMechanism].
     *
     * Unlike [authenticationMechanism], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("authentication_mechanism")
    @ExcludeMissing
    fun _authenticationMechanism(): JsonField<String> = authenticationMechanism

    /**
     * Returns the raw JSON value of [serverUrl].
     *
     * Unlike [serverUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("server_url") @ExcludeMissing fun _serverUrl(): JsonField<String> = serverUrl

    /**
     * Returns the raw JSON value of [apiToken].
     *
     * Unlike [apiToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_token") @ExcludeMissing fun _apiToken(): JsonField<String> = apiToken

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [cql].
     *
     * Unlike [cql], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cql") @ExcludeMissing fun _cql(): JsonField<String> = cql

    /**
     * Returns the raw JSON value of [failureHandling].
     *
     * Unlike [failureHandling], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_handling")
    @ExcludeMissing
    fun _failureHandling(): JsonField<FailureHandlingConfig> = failureHandling

    /**
     * Returns the raw JSON value of [indexRestrictedPages].
     *
     * Unlike [indexRestrictedPages], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("index_restricted_pages")
    @ExcludeMissing
    fun _indexRestrictedPages(): JsonField<Boolean> = indexRestrictedPages

    /**
     * Returns the raw JSON value of [keepMarkdownFormat].
     *
     * Unlike [keepMarkdownFormat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("keep_markdown_format")
    @ExcludeMissing
    fun _keepMarkdownFormat(): JsonField<Boolean> = keepMarkdownFormat

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [pageIds].
     *
     * Unlike [pageIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_ids") @ExcludeMissing fun _pageIds(): JsonField<String> = pageIds

    /**
     * Returns the raw JSON value of [spaceKey].
     *
     * Unlike [spaceKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("space_key") @ExcludeMissing fun _spaceKey(): JsonField<String> = spaceKey

    /**
     * Returns the raw JSON value of [supportsAccessControl].
     *
     * Unlike [supportsAccessControl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supports_access_control")
    @ExcludeMissing
    fun _supportsAccessControl(): JsonField<Boolean> = supportsAccessControl

    /**
     * Returns the raw JSON value of [syncPermissions].
     *
     * Unlike [syncPermissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sync_permissions")
    @ExcludeMissing
    fun _syncPermissions(): JsonField<Boolean> = syncPermissions

    /**
     * Returns the raw JSON value of [userName].
     *
     * Unlike [userName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_name") @ExcludeMissing fun _userName(): JsonField<String> = userName

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
         * Returns a mutable builder for constructing an instance of [CloudConfluenceDataSource].
         *
         * The following fields are required:
         * ```java
         * .authenticationMechanism()
         * .serverUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudConfluenceDataSource]. */
    class Builder internal constructor() {

        private var authenticationMechanism: JsonField<String>? = null
        private var serverUrl: JsonField<String>? = null
        private var apiToken: JsonField<String> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var cql: JsonField<String> = JsonMissing.of()
        private var failureHandling: JsonField<FailureHandlingConfig> = JsonMissing.of()
        private var indexRestrictedPages: JsonField<Boolean> = JsonMissing.of()
        private var keepMarkdownFormat: JsonField<Boolean> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var pageIds: JsonField<String> = JsonMissing.of()
        private var spaceKey: JsonField<String> = JsonMissing.of()
        private var supportsAccessControl: JsonField<Boolean> = JsonMissing.of()
        private var syncPermissions: JsonField<Boolean> = JsonMissing.of()
        private var userName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudConfluenceDataSource: CloudConfluenceDataSource) = apply {
            authenticationMechanism = cloudConfluenceDataSource.authenticationMechanism
            serverUrl = cloudConfluenceDataSource.serverUrl
            apiToken = cloudConfluenceDataSource.apiToken
            className = cloudConfluenceDataSource.className
            cql = cloudConfluenceDataSource.cql
            failureHandling = cloudConfluenceDataSource.failureHandling
            indexRestrictedPages = cloudConfluenceDataSource.indexRestrictedPages
            keepMarkdownFormat = cloudConfluenceDataSource.keepMarkdownFormat
            label = cloudConfluenceDataSource.label
            pageIds = cloudConfluenceDataSource.pageIds
            spaceKey = cloudConfluenceDataSource.spaceKey
            supportsAccessControl = cloudConfluenceDataSource.supportsAccessControl
            syncPermissions = cloudConfluenceDataSource.syncPermissions
            userName = cloudConfluenceDataSource.userName
            additionalProperties = cloudConfluenceDataSource.additionalProperties.toMutableMap()
        }

        /** Type of Authentication for connecting to Confluence APIs. */
        fun authenticationMechanism(authenticationMechanism: String) =
            authenticationMechanism(JsonField.of(authenticationMechanism))

        /**
         * Sets [Builder.authenticationMechanism] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationMechanism] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun authenticationMechanism(authenticationMechanism: JsonField<String>) = apply {
            this.authenticationMechanism = authenticationMechanism
        }

        /** The server URL of the Confluence instance. */
        fun serverUrl(serverUrl: String) = serverUrl(JsonField.of(serverUrl))

        /**
         * Sets [Builder.serverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serverUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serverUrl(serverUrl: JsonField<String>) = apply { this.serverUrl = serverUrl }

        /** The API token to use for authentication. */
        fun apiToken(apiToken: String?) = apiToken(JsonField.ofNullable(apiToken))

        /** Alias for calling [Builder.apiToken] with `apiToken.orElse(null)`. */
        fun apiToken(apiToken: Optional<String>) = apiToken(apiToken.getOrNull())

        /**
         * Sets [Builder.apiToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiToken] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiToken(apiToken: JsonField<String>) = apply { this.apiToken = apiToken }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** The CQL query to use for fetching pages. */
        fun cql(cql: String?) = cql(JsonField.ofNullable(cql))

        /** Alias for calling [Builder.cql] with `cql.orElse(null)`. */
        fun cql(cql: Optional<String>) = cql(cql.getOrNull())

        /**
         * Sets [Builder.cql] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cql] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cql(cql: JsonField<String>) = apply { this.cql = cql }

        /**
         * Configuration for handling failures during processing. Key-value object controlling
         * failure handling behaviors.
         *
         * Example: { "skip_list_failures": true }
         *
         * Currently supports:
         * - skip_list_failures: Skip failed batches/lists and continue processing
         */
        fun failureHandling(failureHandling: FailureHandlingConfig) =
            failureHandling(JsonField.of(failureHandling))

        /**
         * Sets [Builder.failureHandling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureHandling] with a well-typed
         * [FailureHandlingConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun failureHandling(failureHandling: JsonField<FailureHandlingConfig>) = apply {
            this.failureHandling = failureHandling
        }

        /** Whether to index restricted pages. */
        fun indexRestrictedPages(indexRestrictedPages: Boolean) =
            indexRestrictedPages(JsonField.of(indexRestrictedPages))

        /**
         * Sets [Builder.indexRestrictedPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexRestrictedPages] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indexRestrictedPages(indexRestrictedPages: JsonField<Boolean>) = apply {
            this.indexRestrictedPages = indexRestrictedPages
        }

        /** Whether to keep the markdown format. */
        fun keepMarkdownFormat(keepMarkdownFormat: Boolean) =
            keepMarkdownFormat(JsonField.of(keepMarkdownFormat))

        /**
         * Sets [Builder.keepMarkdownFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keepMarkdownFormat] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun keepMarkdownFormat(keepMarkdownFormat: JsonField<Boolean>) = apply {
            this.keepMarkdownFormat = keepMarkdownFormat
        }

        /** The label to use for fetching pages. */
        fun label(label: String?) = label(JsonField.ofNullable(label))

        /** Alias for calling [Builder.label] with `label.orElse(null)`. */
        fun label(label: Optional<String>) = label(label.getOrNull())

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** The page IDs of the Confluence to read from. */
        fun pageIds(pageIds: String?) = pageIds(JsonField.ofNullable(pageIds))

        /** Alias for calling [Builder.pageIds] with `pageIds.orElse(null)`. */
        fun pageIds(pageIds: Optional<String>) = pageIds(pageIds.getOrNull())

        /**
         * Sets [Builder.pageIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageIds] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageIds(pageIds: JsonField<String>) = apply { this.pageIds = pageIds }

        /** The space key to read from. */
        fun spaceKey(spaceKey: String?) = spaceKey(JsonField.ofNullable(spaceKey))

        /** Alias for calling [Builder.spaceKey] with `spaceKey.orElse(null)`. */
        fun spaceKey(spaceKey: Optional<String>) = spaceKey(spaceKey.getOrNull())

        /**
         * Sets [Builder.spaceKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spaceKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spaceKey(spaceKey: JsonField<String>) = apply { this.spaceKey = spaceKey }

        fun supportsAccessControl(supportsAccessControl: Boolean) =
            supportsAccessControl(JsonField.of(supportsAccessControl))

        /**
         * Sets [Builder.supportsAccessControl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportsAccessControl] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun supportsAccessControl(supportsAccessControl: JsonField<Boolean>) = apply {
            this.supportsAccessControl = supportsAccessControl
        }

        /**
         * Whether to fetch space-level permissions (allowed users/groups) and attach them to
         * document metadata for access control. Disable for Confluence Server/Data Center versions
         * whose permission APIs are unavailable (e.g. the JSON-RPC API removed in Data Center
         * 9.2.6+), which otherwise surface as 401 errors during sync.
         */
        fun syncPermissions(syncPermissions: Boolean) =
            syncPermissions(JsonField.of(syncPermissions))

        /**
         * Sets [Builder.syncPermissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syncPermissions] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun syncPermissions(syncPermissions: JsonField<Boolean>) = apply {
            this.syncPermissions = syncPermissions
        }

        /** The username to use for authentication. */
        fun userName(userName: String?) = userName(JsonField.ofNullable(userName))

        /** Alias for calling [Builder.userName] with `userName.orElse(null)`. */
        fun userName(userName: Optional<String>) = userName(userName.getOrNull())

        /**
         * Sets [Builder.userName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userName(userName: JsonField<String>) = apply { this.userName = userName }

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
         * Returns an immutable instance of [CloudConfluenceDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authenticationMechanism()
         * .serverUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudConfluenceDataSource =
            CloudConfluenceDataSource(
                checkRequired("authenticationMechanism", authenticationMechanism),
                checkRequired("serverUrl", serverUrl),
                apiToken,
                className,
                cql,
                failureHandling,
                indexRestrictedPages,
                keepMarkdownFormat,
                label,
                pageIds,
                spaceKey,
                supportsAccessControl,
                syncPermissions,
                userName,
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
    fun validate(): CloudConfluenceDataSource = apply {
        if (validated) {
            return@apply
        }

        authenticationMechanism()
        serverUrl()
        apiToken()
        className()
        cql()
        failureHandling().ifPresent { it.validate() }
        indexRestrictedPages()
        keepMarkdownFormat()
        label()
        pageIds()
        spaceKey()
        supportsAccessControl()
        syncPermissions()
        userName()
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
        (if (authenticationMechanism.asKnown().isPresent) 1 else 0) +
            (if (serverUrl.asKnown().isPresent) 1 else 0) +
            (if (apiToken.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (cql.asKnown().isPresent) 1 else 0) +
            (failureHandling.asKnown().getOrNull()?.validity() ?: 0) +
            (if (indexRestrictedPages.asKnown().isPresent) 1 else 0) +
            (if (keepMarkdownFormat.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (pageIds.asKnown().isPresent) 1 else 0) +
            (if (spaceKey.asKnown().isPresent) 1 else 0) +
            (if (supportsAccessControl.asKnown().isPresent) 1 else 0) +
            (if (syncPermissions.asKnown().isPresent) 1 else 0) +
            (if (userName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudConfluenceDataSource &&
            authenticationMechanism == other.authenticationMechanism &&
            serverUrl == other.serverUrl &&
            apiToken == other.apiToken &&
            className == other.className &&
            cql == other.cql &&
            failureHandling == other.failureHandling &&
            indexRestrictedPages == other.indexRestrictedPages &&
            keepMarkdownFormat == other.keepMarkdownFormat &&
            label == other.label &&
            pageIds == other.pageIds &&
            spaceKey == other.spaceKey &&
            supportsAccessControl == other.supportsAccessControl &&
            syncPermissions == other.syncPermissions &&
            userName == other.userName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authenticationMechanism,
            serverUrl,
            apiToken,
            className,
            cql,
            failureHandling,
            indexRestrictedPages,
            keepMarkdownFormat,
            label,
            pageIds,
            spaceKey,
            supportsAccessControl,
            syncPermissions,
            userName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudConfluenceDataSource{authenticationMechanism=$authenticationMechanism, serverUrl=$serverUrl, apiToken=$apiToken, className=$className, cql=$cql, failureHandling=$failureHandling, indexRestrictedPages=$indexRestrictedPages, keepMarkdownFormat=$keepMarkdownFormat, label=$label, pageIds=$pageIds, spaceKey=$spaceKey, supportsAccessControl=$supportsAccessControl, syncPermissions=$syncPermissions, userName=$userName, additionalProperties=$additionalProperties}"
}
