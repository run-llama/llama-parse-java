// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Cloud Jira Data Source integrating JiraReader. */
class CloudJiraDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authenticationMechanism: JsonField<String>,
    private val query: JsonField<String>,
    private val apiToken: JsonField<String>,
    private val className: JsonField<String>,
    private val cloudId: JsonField<String>,
    private val email: JsonField<String>,
    private val serverUrl: JsonField<String>,
    private val supportsAccessControl: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authentication_mechanism")
        @ExcludeMissing
        authenticationMechanism: JsonField<String> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_token") @ExcludeMissing apiToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cloud_id") @ExcludeMissing cloudId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("server_url") @ExcludeMissing serverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        authenticationMechanism,
        query,
        apiToken,
        className,
        cloudId,
        email,
        serverUrl,
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
     * The API/ Access Token used for Basic, PAT and OAuth2 authentication.
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
     * The server url for Jira Cloud.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serverUrl(): Optional<String> = serverUrl.getOptional("server_url")

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
     * Returns the raw JSON value of [serverUrl].
     *
     * Unlike [serverUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("server_url") @ExcludeMissing fun _serverUrl(): JsonField<String> = serverUrl

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
         * Returns a mutable builder for constructing an instance of [CloudJiraDataSource].
         *
         * The following fields are required:
         * ```java
         * .authenticationMechanism()
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudJiraDataSource]. */
    class Builder internal constructor() {

        private var authenticationMechanism: JsonField<String>? = null
        private var query: JsonField<String>? = null
        private var apiToken: JsonField<String> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var cloudId: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var serverUrl: JsonField<String> = JsonMissing.of()
        private var supportsAccessControl: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudJiraDataSource: CloudJiraDataSource) = apply {
            authenticationMechanism = cloudJiraDataSource.authenticationMechanism
            query = cloudJiraDataSource.query
            apiToken = cloudJiraDataSource.apiToken
            className = cloudJiraDataSource.className
            cloudId = cloudJiraDataSource.cloudId
            email = cloudJiraDataSource.email
            serverUrl = cloudJiraDataSource.serverUrl
            supportsAccessControl = cloudJiraDataSource.supportsAccessControl
            additionalProperties = cloudJiraDataSource.additionalProperties.toMutableMap()
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

        /** The API/ Access Token used for Basic, PAT and OAuth2 authentication. */
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

        /** The server url for Jira Cloud. */
        fun serverUrl(serverUrl: String?) = serverUrl(JsonField.ofNullable(serverUrl))

        /** Alias for calling [Builder.serverUrl] with `serverUrl.orElse(null)`. */
        fun serverUrl(serverUrl: Optional<String>) = serverUrl(serverUrl.getOrNull())

        /**
         * Sets [Builder.serverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serverUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serverUrl(serverUrl: JsonField<String>) = apply { this.serverUrl = serverUrl }

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
         * Returns an immutable instance of [CloudJiraDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authenticationMechanism()
         * .query()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudJiraDataSource =
            CloudJiraDataSource(
                checkRequired("authenticationMechanism", authenticationMechanism),
                checkRequired("query", query),
                apiToken,
                className,
                cloudId,
                email,
                serverUrl,
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
    fun validate(): CloudJiraDataSource = apply {
        if (validated) {
            return@apply
        }

        authenticationMechanism()
        query()
        apiToken()
        className()
        cloudId()
        email()
        serverUrl()
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
            (if (apiToken.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (cloudId.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (serverUrl.asKnown().isPresent) 1 else 0) +
            (if (supportsAccessControl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudJiraDataSource &&
            authenticationMechanism == other.authenticationMechanism &&
            query == other.query &&
            apiToken == other.apiToken &&
            className == other.className &&
            cloudId == other.cloudId &&
            email == other.email &&
            serverUrl == other.serverUrl &&
            supportsAccessControl == other.supportsAccessControl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authenticationMechanism,
            query,
            apiToken,
            className,
            cloudId,
            email,
            serverUrl,
            supportsAccessControl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudJiraDataSource{authenticationMechanism=$authenticationMechanism, query=$query, apiToken=$apiToken, className=$className, cloudId=$cloudId, email=$email, serverUrl=$serverUrl, supportsAccessControl=$supportsAccessControl, additionalProperties=$additionalProperties}"
}
