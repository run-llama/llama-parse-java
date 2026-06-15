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

class CloudOneDriveDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientId: JsonField<String>,
    private val clientSecret: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val userPrincipalName: JsonField<String>,
    private val className: JsonField<String>,
    private val folderId: JsonField<String>,
    private val folderPath: JsonField<String>,
    private val requiredExts: JsonField<List<String>>,
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
        @JsonProperty("user_principal_name")
        @ExcludeMissing
        userPrincipalName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("folder_id") @ExcludeMissing folderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("folder_path")
        @ExcludeMissing
        folderPath: JsonField<String> = JsonMissing.of(),
        @JsonProperty("required_exts")
        @ExcludeMissing
        requiredExts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<SupportsAccessControl> = JsonMissing.of(),
    ) : this(
        clientId,
        clientSecret,
        tenantId,
        userPrincipalName,
        className,
        folderId,
        folderPath,
        requiredExts,
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
     * The user principal name to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userPrincipalName(): String = userPrincipalName.getRequired("user_principal_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The ID of the OneDrive folder to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderId(): Optional<String> = folderId.getOptional("folder_id")

    /**
     * The path of the OneDrive folder to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderPath(): Optional<String> = folderPath.getOptional("folder_path")

    /**
     * The list of required file extensions.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiredExts(): Optional<List<String>> = requiredExts.getOptional("required_exts")

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
     * Returns the raw JSON value of [userPrincipalName].
     *
     * Unlike [userPrincipalName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("user_principal_name")
    @ExcludeMissing
    fun _userPrincipalName(): JsonField<String> = userPrincipalName

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

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
     * Returns the raw JSON value of [requiredExts].
     *
     * Unlike [requiredExts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required_exts")
    @ExcludeMissing
    fun _requiredExts(): JsonField<List<String>> = requiredExts

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
         * Returns a mutable builder for constructing an instance of [CloudOneDriveDataSource].
         *
         * The following fields are required:
         * ```java
         * .clientId()
         * .clientSecret()
         * .tenantId()
         * .userPrincipalName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudOneDriveDataSource]. */
    class Builder internal constructor() {

        private var clientId: JsonField<String>? = null
        private var clientSecret: JsonField<String>? = null
        private var tenantId: JsonField<String>? = null
        private var userPrincipalName: JsonField<String>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var folderId: JsonField<String> = JsonMissing.of()
        private var folderPath: JsonField<String> = JsonMissing.of()
        private var requiredExts: JsonField<MutableList<String>>? = null
        private var supportsAccessControl: JsonField<SupportsAccessControl> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudOneDriveDataSource: CloudOneDriveDataSource) = apply {
            clientId = cloudOneDriveDataSource.clientId
            clientSecret = cloudOneDriveDataSource.clientSecret
            tenantId = cloudOneDriveDataSource.tenantId
            userPrincipalName = cloudOneDriveDataSource.userPrincipalName
            className = cloudOneDriveDataSource.className
            folderId = cloudOneDriveDataSource.folderId
            folderPath = cloudOneDriveDataSource.folderPath
            requiredExts = cloudOneDriveDataSource.requiredExts.map { it.toMutableList() }
            supportsAccessControl = cloudOneDriveDataSource.supportsAccessControl
            additionalProperties = cloudOneDriveDataSource.additionalProperties.toMutableMap()
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

        /** The user principal name to use for authentication. */
        fun userPrincipalName(userPrincipalName: String) =
            userPrincipalName(JsonField.of(userPrincipalName))

        /**
         * Sets [Builder.userPrincipalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userPrincipalName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userPrincipalName(userPrincipalName: JsonField<String>) = apply {
            this.userPrincipalName = userPrincipalName
        }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** The ID of the OneDrive folder to read from. */
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

        /** The path of the OneDrive folder to read from. */
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
         * Returns an immutable instance of [CloudOneDriveDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clientId()
         * .clientSecret()
         * .tenantId()
         * .userPrincipalName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudOneDriveDataSource =
            CloudOneDriveDataSource(
                checkRequired("clientId", clientId),
                checkRequired("clientSecret", clientSecret),
                checkRequired("tenantId", tenantId),
                checkRequired("userPrincipalName", userPrincipalName),
                className,
                folderId,
                folderPath,
                (requiredExts ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): CloudOneDriveDataSource = apply {
        if (validated) {
            return@apply
        }

        clientId()
        clientSecret()
        tenantId()
        userPrincipalName()
        className()
        folderId()
        folderPath()
        requiredExts()
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
            (if (userPrincipalName.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (folderId.asKnown().isPresent) 1 else 0) +
            (if (folderPath.asKnown().isPresent) 1 else 0) +
            (requiredExts.asKnown().getOrNull()?.size ?: 0) +
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

        return other is CloudOneDriveDataSource &&
            clientId == other.clientId &&
            clientSecret == other.clientSecret &&
            tenantId == other.tenantId &&
            userPrincipalName == other.userPrincipalName &&
            className == other.className &&
            folderId == other.folderId &&
            folderPath == other.folderPath &&
            requiredExts == other.requiredExts &&
            supportsAccessControl == other.supportsAccessControl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clientId,
            clientSecret,
            tenantId,
            userPrincipalName,
            className,
            folderId,
            folderPath,
            requiredExts,
            supportsAccessControl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudOneDriveDataSource{clientId=$clientId, clientSecret=$clientSecret, tenantId=$tenantId, userPrincipalName=$userPrincipalName, className=$className, folderId=$folderId, folderPath=$folderPath, requiredExts=$requiredExts, supportsAccessControl=$supportsAccessControl, additionalProperties=$additionalProperties}"
}
