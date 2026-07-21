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

class CloudAzStorageBlobDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountUrl: JsonField<String>,
    private val containerName: JsonField<String>,
    private val accountKey: JsonField<String>,
    private val accountName: JsonField<String>,
    private val blob: JsonField<String>,
    private val className: JsonField<String>,
    private val clientId: JsonField<String>,
    private val clientSecret: JsonField<String>,
    private val prefix: JsonField<String>,
    private val supportsAccessControl: JsonField<Boolean>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_url")
        @ExcludeMissing
        accountUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("container_name")
        @ExcludeMissing
        containerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_key")
        @ExcludeMissing
        accountKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_name")
        @ExcludeMissing
        accountName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("blob") @ExcludeMissing blob: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountUrl,
        containerName,
        accountKey,
        accountName,
        blob,
        className,
        clientId,
        clientSecret,
        prefix,
        supportsAccessControl,
        tenantId,
        mutableMapOf(),
    )

    /**
     * The Azure Storage Blob account URL to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountUrl(): String = accountUrl.getRequired("account_url")

    /**
     * The name of the Azure Storage Blob container to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun containerName(): String = containerName.getRequired("container_name")

    /**
     * The Azure Storage Blob account key to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountKey(): Optional<String> = accountKey.getOptional("account_key")

    /**
     * The Azure Storage Blob account name to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountName(): Optional<String> = accountName.getOptional("account_name")

    /**
     * The blob name to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blob(): Optional<String> = blob.getOptional("blob")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The Azure AD client ID to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientId(): Optional<String> = clientId.getOptional("client_id")

    /**
     * The Azure AD client secret to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientSecret(): Optional<String> = clientSecret.getOptional("client_secret")

    /**
     * The prefix of the Azure Storage Blob objects to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prefix(): Optional<String> = prefix.getOptional("prefix")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsAccessControl(): Optional<Boolean> =
        supportsAccessControl.getOptional("supports_access_control")

    /**
     * The Azure AD tenant ID to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * Returns the raw JSON value of [accountUrl].
     *
     * Unlike [accountUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_url") @ExcludeMissing fun _accountUrl(): JsonField<String> = accountUrl

    /**
     * Returns the raw JSON value of [containerName].
     *
     * Unlike [containerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("container_name")
    @ExcludeMissing
    fun _containerName(): JsonField<String> = containerName

    /**
     * Returns the raw JSON value of [accountKey].
     *
     * Unlike [accountKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_key") @ExcludeMissing fun _accountKey(): JsonField<String> = accountKey

    /**
     * Returns the raw JSON value of [accountName].
     *
     * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_name")
    @ExcludeMissing
    fun _accountName(): JsonField<String> = accountName

    /**
     * Returns the raw JSON value of [blob].
     *
     * Unlike [blob], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blob") @ExcludeMissing fun _blob(): JsonField<String> = blob

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

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
     * Returns the raw JSON value of [prefix].
     *
     * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

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
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

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
         * Returns a mutable builder for constructing an instance of [CloudAzStorageBlobDataSource].
         *
         * The following fields are required:
         * ```java
         * .accountUrl()
         * .containerName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudAzStorageBlobDataSource]. */
    class Builder internal constructor() {

        private var accountUrl: JsonField<String>? = null
        private var containerName: JsonField<String>? = null
        private var accountKey: JsonField<String> = JsonMissing.of()
        private var accountName: JsonField<String> = JsonMissing.of()
        private var blob: JsonField<String> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var clientId: JsonField<String> = JsonMissing.of()
        private var clientSecret: JsonField<String> = JsonMissing.of()
        private var prefix: JsonField<String> = JsonMissing.of()
        private var supportsAccessControl: JsonField<Boolean> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudAzStorageBlobDataSource: CloudAzStorageBlobDataSource) = apply {
            accountUrl = cloudAzStorageBlobDataSource.accountUrl
            containerName = cloudAzStorageBlobDataSource.containerName
            accountKey = cloudAzStorageBlobDataSource.accountKey
            accountName = cloudAzStorageBlobDataSource.accountName
            blob = cloudAzStorageBlobDataSource.blob
            className = cloudAzStorageBlobDataSource.className
            clientId = cloudAzStorageBlobDataSource.clientId
            clientSecret = cloudAzStorageBlobDataSource.clientSecret
            prefix = cloudAzStorageBlobDataSource.prefix
            supportsAccessControl = cloudAzStorageBlobDataSource.supportsAccessControl
            tenantId = cloudAzStorageBlobDataSource.tenantId
            additionalProperties = cloudAzStorageBlobDataSource.additionalProperties.toMutableMap()
        }

        /** The Azure Storage Blob account URL to use for authentication. */
        fun accountUrl(accountUrl: String) = accountUrl(JsonField.of(accountUrl))

        /**
         * Sets [Builder.accountUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountUrl(accountUrl: JsonField<String>) = apply { this.accountUrl = accountUrl }

        /** The name of the Azure Storage Blob container to read from. */
        fun containerName(containerName: String) = containerName(JsonField.of(containerName))

        /**
         * Sets [Builder.containerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.containerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun containerName(containerName: JsonField<String>) = apply {
            this.containerName = containerName
        }

        /** The Azure Storage Blob account key to use for authentication. */
        fun accountKey(accountKey: String?) = accountKey(JsonField.ofNullable(accountKey))

        /** Alias for calling [Builder.accountKey] with `accountKey.orElse(null)`. */
        fun accountKey(accountKey: Optional<String>) = accountKey(accountKey.getOrNull())

        /**
         * Sets [Builder.accountKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountKey(accountKey: JsonField<String>) = apply { this.accountKey = accountKey }

        /** The Azure Storage Blob account name to use for authentication. */
        fun accountName(accountName: String?) = accountName(JsonField.ofNullable(accountName))

        /** Alias for calling [Builder.accountName] with `accountName.orElse(null)`. */
        fun accountName(accountName: Optional<String>) = accountName(accountName.getOrNull())

        /**
         * Sets [Builder.accountName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountName(accountName: JsonField<String>) = apply { this.accountName = accountName }

        /** The blob name to read from. */
        fun blob(blob: String?) = blob(JsonField.ofNullable(blob))

        /** Alias for calling [Builder.blob] with `blob.orElse(null)`. */
        fun blob(blob: Optional<String>) = blob(blob.getOrNull())

        /**
         * Sets [Builder.blob] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blob] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun blob(blob: JsonField<String>) = apply { this.blob = blob }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** The Azure AD client ID to use for authentication. */
        fun clientId(clientId: String?) = clientId(JsonField.ofNullable(clientId))

        /** Alias for calling [Builder.clientId] with `clientId.orElse(null)`. */
        fun clientId(clientId: Optional<String>) = clientId(clientId.getOrNull())

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        /** The Azure AD client secret to use for authentication. */
        fun clientSecret(clientSecret: String?) = clientSecret(JsonField.ofNullable(clientSecret))

        /** Alias for calling [Builder.clientSecret] with `clientSecret.orElse(null)`. */
        fun clientSecret(clientSecret: Optional<String>) = clientSecret(clientSecret.getOrNull())

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

        /** The prefix of the Azure Storage Blob objects to read from. */
        fun prefix(prefix: String?) = prefix(JsonField.ofNullable(prefix))

        /** Alias for calling [Builder.prefix] with `prefix.orElse(null)`. */
        fun prefix(prefix: Optional<String>) = prefix(prefix.getOrNull())

        /**
         * Sets [Builder.prefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prefix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

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

        /** The Azure AD tenant ID to use for authentication. */
        fun tenantId(tenantId: String?) = tenantId(JsonField.ofNullable(tenantId))

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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
         * Returns an immutable instance of [CloudAzStorageBlobDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountUrl()
         * .containerName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudAzStorageBlobDataSource =
            CloudAzStorageBlobDataSource(
                checkRequired("accountUrl", accountUrl),
                checkRequired("containerName", containerName),
                accountKey,
                accountName,
                blob,
                className,
                clientId,
                clientSecret,
                prefix,
                supportsAccessControl,
                tenantId,
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
    fun validate(): CloudAzStorageBlobDataSource = apply {
        if (validated) {
            return@apply
        }

        accountUrl()
        containerName()
        accountKey()
        accountName()
        blob()
        className()
        clientId()
        clientSecret()
        prefix()
        supportsAccessControl()
        tenantId()
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
        (if (accountUrl.asKnown().isPresent) 1 else 0) +
            (if (containerName.asKnown().isPresent) 1 else 0) +
            (if (accountKey.asKnown().isPresent) 1 else 0) +
            (if (accountName.asKnown().isPresent) 1 else 0) +
            (if (blob.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (clientId.asKnown().isPresent) 1 else 0) +
            (if (clientSecret.asKnown().isPresent) 1 else 0) +
            (if (prefix.asKnown().isPresent) 1 else 0) +
            (if (supportsAccessControl.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudAzStorageBlobDataSource &&
            accountUrl == other.accountUrl &&
            containerName == other.containerName &&
            accountKey == other.accountKey &&
            accountName == other.accountName &&
            blob == other.blob &&
            className == other.className &&
            clientId == other.clientId &&
            clientSecret == other.clientSecret &&
            prefix == other.prefix &&
            supportsAccessControl == other.supportsAccessControl &&
            tenantId == other.tenantId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountUrl,
            containerName,
            accountKey,
            accountName,
            blob,
            className,
            clientId,
            clientSecret,
            prefix,
            supportsAccessControl,
            tenantId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudAzStorageBlobDataSource{accountUrl=$accountUrl, containerName=$containerName, accountKey=$accountKey, accountName=$accountName, blob=$blob, className=$className, clientId=$clientId, clientSecret=$clientSecret, prefix=$prefix, supportsAccessControl=$supportsAccessControl, tenantId=$tenantId, additionalProperties=$additionalProperties}"
}
