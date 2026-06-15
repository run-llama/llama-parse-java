// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Cloud Jira Data Source integrating JiraReaderV2. */
class CloudJiraDataSourceV2
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authenticationMechanism: JsonField<String>,
    private val query: JsonField<String>,
    private val serverUrl: JsonField<String>,
    private val apiToken: JsonField<String>,
    private val apiVersion: JsonField<ApiVersion>,
    private val className: JsonField<String>,
    private val cloudId: JsonField<String>,
    private val email: JsonField<String>,
    private val expand: JsonField<String>,
    private val fields: JsonField<List<String>>,
    private val getPermissions: JsonField<Boolean>,
    private val requestsPerMinute: JsonField<Long>,
    private val supportsAccessControl: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authentication_mechanism")
        @ExcludeMissing
        authenticationMechanism: JsonField<String> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("server_url") @ExcludeMissing serverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_token") @ExcludeMissing apiToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_version")
        @ExcludeMissing
        apiVersion: JsonField<ApiVersion> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cloud_id") @ExcludeMissing cloudId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expand") @ExcludeMissing expand: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fields") @ExcludeMissing fields: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("get_permissions")
        @ExcludeMissing
        getPermissions: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("requests_per_minute")
        @ExcludeMissing
        requestsPerMinute: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        authenticationMechanism,
        query,
        serverUrl,
        apiToken,
        apiVersion,
        className,
        cloudId,
        email,
        expand,
        fields,
        getPermissions,
        requestsPerMinute,
        supportsAccessControl,
        mutableMapOf(),
    )

    /**
     * Type of Authentication for connecting to Jira APIs.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticationMechanism(): String =
        authenticationMechanism.getRequired("authentication_mechanism")

    /**
     * JQL (Jira Query Language) query to search.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = query.getRequired("query")

    /**
     * The server url for Jira Cloud.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun serverUrl(): String = serverUrl.getRequired("server_url")

    /**
     * The API Access Token used for Basic, PAT and OAuth2 authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiToken(): Optional<String> = apiToken.getOptional("api_token")

    /**
     * Jira REST API version to use (2 or 3). 3 supports Atlassian Document Format (ADF).
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiVersion(): Optional<ApiVersion> = apiVersion.getOptional("api_version")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The cloud ID, used in case of OAuth2.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cloudId(): Optional<String> = cloudId.getOptional("cloud_id")

    /**
     * The email address to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * Fields to expand in the response.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expand(): Optional<String> = expand.getOptional("expand")

    /**
     * List of fields to retrieve from Jira. If None, retrieves all fields.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fields(): Optional<List<String>> = fields.getOptional("fields")

    /**
     * Whether to fetch project role permissions and issue-level security
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun getPermissions(): Optional<Boolean> = getPermissions.getOptional("get_permissions")

    /**
     * Rate limit for Jira API requests per minute.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestsPerMinute(): Optional<Long> = requestsPerMinute.getOptional("requests_per_minute")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsAccessControl(): Optional<Boolean> =
        supportsAccessControl.getOptional("supports_access_control")

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
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

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
     * Returns the raw JSON value of [apiVersion].
     *
     * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_version")
    @ExcludeMissing
    fun _apiVersion(): JsonField<ApiVersion> = apiVersion

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [cloudId].
     *
     * Unlike [cloudId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cloud_id") @ExcludeMissing fun _cloudId(): JsonField<String> = cloudId

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [expand].
     *
     * Unlike [expand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expand") @ExcludeMissing fun _expand(): JsonField<String> = expand

    /**
     * Returns the raw JSON value of [fields].
     *
     * Unlike [fields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonField<List<String>> = fields

    /**
     * Returns the raw JSON value of [getPermissions].
     *
     * Unlike [getPermissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("get_permissions")
    @ExcludeMissing
    fun _getPermissions(): JsonField<Boolean> = getPermissions

    /**
     * Returns the raw JSON value of [requestsPerMinute].
     *
     * Unlike [requestsPerMinute], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requests_per_minute")
    @ExcludeMissing
    fun _requestsPerMinute(): JsonField<Long> = requestsPerMinute

    /**
     * Returns the raw JSON value of [supportsAccessControl].
     *
     * Unlike [supportsAccessControl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supports_access_control")
    @ExcludeMissing
    fun _supportsAccessControl(): JsonField<Boolean> = supportsAccessControl

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
         * Returns a mutable builder for constructing an instance of [CloudJiraDataSourceV2].
         *
         * The following fields are required:
         * ```java
         * .authenticationMechanism()
         * .query()
         * .serverUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudJiraDataSourceV2]. */
    class Builder internal constructor() {

        private var authenticationMechanism: JsonField<String>? = null
        private var query: JsonField<String>? = null
        private var serverUrl: JsonField<String>? = null
        private var apiToken: JsonField<String> = JsonMissing.of()
        private var apiVersion: JsonField<ApiVersion> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var cloudId: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var expand: JsonField<String> = JsonMissing.of()
        private var fields: JsonField<MutableList<String>>? = null
        private var getPermissions: JsonField<Boolean> = JsonMissing.of()
        private var requestsPerMinute: JsonField<Long> = JsonMissing.of()
        private var supportsAccessControl: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudJiraDataSourceV2: CloudJiraDataSourceV2) = apply {
            authenticationMechanism = cloudJiraDataSourceV2.authenticationMechanism
            query = cloudJiraDataSourceV2.query
            serverUrl = cloudJiraDataSourceV2.serverUrl
            apiToken = cloudJiraDataSourceV2.apiToken
            apiVersion = cloudJiraDataSourceV2.apiVersion
            className = cloudJiraDataSourceV2.className
            cloudId = cloudJiraDataSourceV2.cloudId
            email = cloudJiraDataSourceV2.email
            expand = cloudJiraDataSourceV2.expand
            fields = cloudJiraDataSourceV2.fields.map { it.toMutableList() }
            getPermissions = cloudJiraDataSourceV2.getPermissions
            requestsPerMinute = cloudJiraDataSourceV2.requestsPerMinute
            supportsAccessControl = cloudJiraDataSourceV2.supportsAccessControl
            additionalProperties = cloudJiraDataSourceV2.additionalProperties.toMutableMap()
        }

        /** Type of Authentication for connecting to Jira APIs. */
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

        /** JQL (Jira Query Language) query to search. */
        fun query(query: String) = query(JsonField.of(query))

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { this.query = query }

        /** The server url for Jira Cloud. */
        fun serverUrl(serverUrl: String) = serverUrl(JsonField.of(serverUrl))

        /**
         * Sets [Builder.serverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serverUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serverUrl(serverUrl: JsonField<String>) = apply { this.serverUrl = serverUrl }

        /** The API Access Token used for Basic, PAT and OAuth2 authentication. */
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

        /** Jira REST API version to use (2 or 3). 3 supports Atlassian Document Format (ADF). */
        fun apiVersion(apiVersion: ApiVersion) = apiVersion(JsonField.of(apiVersion))

        /**
         * Sets [Builder.apiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiVersion] with a well-typed [ApiVersion] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun apiVersion(apiVersion: JsonField<ApiVersion>) = apply { this.apiVersion = apiVersion }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** The cloud ID, used in case of OAuth2. */
        fun cloudId(cloudId: String?) = cloudId(JsonField.ofNullable(cloudId))

        /** Alias for calling [Builder.cloudId] with `cloudId.orElse(null)`. */
        fun cloudId(cloudId: Optional<String>) = cloudId(cloudId.getOrNull())

        /**
         * Sets [Builder.cloudId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cloudId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cloudId(cloudId: JsonField<String>) = apply { this.cloudId = cloudId }

        /** The email address to use for authentication. */
        fun email(email: String?) = email(JsonField.ofNullable(email))

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Fields to expand in the response. */
        fun expand(expand: String?) = expand(JsonField.ofNullable(expand))

        /** Alias for calling [Builder.expand] with `expand.orElse(null)`. */
        fun expand(expand: Optional<String>) = expand(expand.getOrNull())

        /**
         * Sets [Builder.expand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expand] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expand(expand: JsonField<String>) = apply { this.expand = expand }

        /** List of fields to retrieve from Jira. If None, retrieves all fields. */
        fun fields(fields: List<String>?) = fields(JsonField.ofNullable(fields))

        /** Alias for calling [Builder.fields] with `fields.orElse(null)`. */
        fun fields(fields: Optional<List<String>>) = fields(fields.getOrNull())

        /**
         * Sets [Builder.fields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fields] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fields(fields: JsonField<List<String>>) = apply {
            this.fields = fields.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [fields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addField(field: String) = apply {
            fields =
                (fields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fields", it).add(field)
                }
        }

        /** Whether to fetch project role permissions and issue-level security */
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

        /** Rate limit for Jira API requests per minute. */
        fun requestsPerMinute(requestsPerMinute: Long?) =
            requestsPerMinute(JsonField.ofNullable(requestsPerMinute))

        /**
         * Alias for [Builder.requestsPerMinute].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun requestsPerMinute(requestsPerMinute: Long) =
            requestsPerMinute(requestsPerMinute as Long?)

        /** Alias for calling [Builder.requestsPerMinute] with `requestsPerMinute.orElse(null)`. */
        fun requestsPerMinute(requestsPerMinute: Optional<Long>) =
            requestsPerMinute(requestsPerMinute.getOrNull())

        /**
         * Sets [Builder.requestsPerMinute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestsPerMinute] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestsPerMinute(requestsPerMinute: JsonField<Long>) = apply {
            this.requestsPerMinute = requestsPerMinute
        }

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
         * Returns an immutable instance of [CloudJiraDataSourceV2].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authenticationMechanism()
         * .query()
         * .serverUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudJiraDataSourceV2 =
            CloudJiraDataSourceV2(
                checkRequired("authenticationMechanism", authenticationMechanism),
                checkRequired("query", query),
                checkRequired("serverUrl", serverUrl),
                apiToken,
                apiVersion,
                className,
                cloudId,
                email,
                expand,
                (fields ?: JsonMissing.of()).map { it.toImmutable() },
                getPermissions,
                requestsPerMinute,
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
    fun validate(): CloudJiraDataSourceV2 = apply {
        if (validated) {
            return@apply
        }

        authenticationMechanism()
        query()
        serverUrl()
        apiToken()
        apiVersion().ifPresent { it.validate() }
        className()
        cloudId()
        email()
        expand()
        fields()
        getPermissions()
        requestsPerMinute()
        supportsAccessControl()
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
            (if (query.asKnown().isPresent) 1 else 0) +
            (if (serverUrl.asKnown().isPresent) 1 else 0) +
            (if (apiToken.asKnown().isPresent) 1 else 0) +
            (apiVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (cloudId.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (expand.asKnown().isPresent) 1 else 0) +
            (fields.asKnown().getOrNull()?.size ?: 0) +
            (if (getPermissions.asKnown().isPresent) 1 else 0) +
            (if (requestsPerMinute.asKnown().isPresent) 1 else 0) +
            (if (supportsAccessControl.asKnown().isPresent) 1 else 0)

    /** Jira REST API version to use (2 or 3). 3 supports Atlassian Document Format (ADF). */
    class ApiVersion @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val _2 = of("2")

            @JvmField val _3 = of("3")

            @JvmStatic fun of(value: String) = ApiVersion(JsonField.of(value))
        }

        /** An enum containing [ApiVersion]'s known values. */
        enum class Known {
            _2,
            _3,
        }

        /**
         * An enum containing [ApiVersion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ApiVersion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _2,
            _3,
            /**
             * An enum member indicating that [ApiVersion] was instantiated with an unknown value.
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
                _2 -> Value._2
                _3 -> Value._3
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
                _2 -> Known._2
                _3 -> Known._3
                else -> throw LlamaCloudInvalidDataException("Unknown ApiVersion: $value")
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
        fun validate(): ApiVersion = apply {
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

            return other is ApiVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudJiraDataSourceV2 &&
            authenticationMechanism == other.authenticationMechanism &&
            query == other.query &&
            serverUrl == other.serverUrl &&
            apiToken == other.apiToken &&
            apiVersion == other.apiVersion &&
            className == other.className &&
            cloudId == other.cloudId &&
            email == other.email &&
            expand == other.expand &&
            fields == other.fields &&
            getPermissions == other.getPermissions &&
            requestsPerMinute == other.requestsPerMinute &&
            supportsAccessControl == other.supportsAccessControl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authenticationMechanism,
            query,
            serverUrl,
            apiToken,
            apiVersion,
            className,
            cloudId,
            email,
            expand,
            fields,
            getPermissions,
            requestsPerMinute,
            supportsAccessControl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudJiraDataSourceV2{authenticationMechanism=$authenticationMechanism, query=$query, serverUrl=$serverUrl, apiToken=$apiToken, apiVersion=$apiVersion, className=$className, cloudId=$cloudId, email=$email, expand=$expand, fields=$fields, getPermissions=$getPermissions, requestsPerMinute=$requestsPerMinute, supportsAccessControl=$supportsAccessControl, additionalProperties=$additionalProperties}"
}
