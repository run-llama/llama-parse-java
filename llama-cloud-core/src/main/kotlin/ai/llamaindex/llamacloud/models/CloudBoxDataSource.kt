// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

import ai.llamaindex.llamacloud.core.Enum
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

class CloudBoxDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authenticationMechanism: JsonField<AuthenticationMechanism>,
    private val className: JsonField<String>,
    private val clientId: JsonField<String>,
    private val clientSecret: JsonField<String>,
    private val developerToken: JsonField<String>,
    private val enterpriseId: JsonField<String>,
    private val folderId: JsonField<String>,
    private val supportsAccessControl: JsonField<Boolean>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authentication_mechanism")
        @ExcludeMissing
        authenticationMechanism: JsonField<AuthenticationMechanism> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("developer_token")
        @ExcludeMissing
        developerToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enterprise_id")
        @ExcludeMissing
        enterpriseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("folder_id") @ExcludeMissing folderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(
        authenticationMechanism,
        className,
        clientId,
        clientSecret,
        developerToken,
        enterpriseId,
        folderId,
        supportsAccessControl,
        userId,
        mutableMapOf(),
    )

    /**
     * The type of authentication to use (Developer Token or CCG)
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticationMechanism(): AuthenticationMechanism =
        authenticationMechanism.getRequired("authentication_mechanism")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * Box API key used for identifying the application the user is authenticating with
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientId(): Optional<String> = clientId.getOptional("client_id")

    /**
     * Box API secret used for making auth requests.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientSecret(): Optional<String> = clientSecret.getOptional("client_secret")

    /**
     * Developer token for authentication if authentication_mechanism is 'developer_token'.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun developerToken(): Optional<String> = developerToken.getOptional("developer_token")

    /**
     * Box Enterprise ID, if provided authenticates as service.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enterpriseId(): Optional<String> = enterpriseId.getOptional("enterprise_id")

    /**
     * The ID of the Box folder to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderId(): Optional<String> = folderId.getOptional("folder_id")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsAccessControl(): Optional<Boolean> =
        supportsAccessControl.getOptional("supports_access_control")

    /**
     * Box User ID, if provided authenticates as user.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [authenticationMechanism].
     *
     * Unlike [authenticationMechanism], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("authentication_mechanism")
    @ExcludeMissing
    fun _authenticationMechanism(): JsonField<AuthenticationMechanism> = authenticationMechanism

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
     * Returns the raw JSON value of [developerToken].
     *
     * Unlike [developerToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("developer_token")
    @ExcludeMissing
    fun _developerToken(): JsonField<String> = developerToken

    /**
     * Returns the raw JSON value of [enterpriseId].
     *
     * Unlike [enterpriseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enterprise_id")
    @ExcludeMissing
    fun _enterpriseId(): JsonField<String> = enterpriseId

    /**
     * Returns the raw JSON value of [folderId].
     *
     * Unlike [folderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder_id") @ExcludeMissing fun _folderId(): JsonField<String> = folderId

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
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
         * Returns a mutable builder for constructing an instance of [CloudBoxDataSource].
         *
         * The following fields are required:
         * ```java
         * .authenticationMechanism()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudBoxDataSource]. */
    class Builder internal constructor() {

        private var authenticationMechanism: JsonField<AuthenticationMechanism>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var clientId: JsonField<String> = JsonMissing.of()
        private var clientSecret: JsonField<String> = JsonMissing.of()
        private var developerToken: JsonField<String> = JsonMissing.of()
        private var enterpriseId: JsonField<String> = JsonMissing.of()
        private var folderId: JsonField<String> = JsonMissing.of()
        private var supportsAccessControl: JsonField<Boolean> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudBoxDataSource: CloudBoxDataSource) = apply {
            authenticationMechanism = cloudBoxDataSource.authenticationMechanism
            className = cloudBoxDataSource.className
            clientId = cloudBoxDataSource.clientId
            clientSecret = cloudBoxDataSource.clientSecret
            developerToken = cloudBoxDataSource.developerToken
            enterpriseId = cloudBoxDataSource.enterpriseId
            folderId = cloudBoxDataSource.folderId
            supportsAccessControl = cloudBoxDataSource.supportsAccessControl
            userId = cloudBoxDataSource.userId
            additionalProperties = cloudBoxDataSource.additionalProperties.toMutableMap()
        }

        /** The type of authentication to use (Developer Token or CCG) */
        fun authenticationMechanism(authenticationMechanism: AuthenticationMechanism) =
            authenticationMechanism(JsonField.of(authenticationMechanism))

        /**
         * Sets [Builder.authenticationMechanism] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationMechanism] with a well-typed
         * [AuthenticationMechanism] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun authenticationMechanism(authenticationMechanism: JsonField<AuthenticationMechanism>) =
            apply {
                this.authenticationMechanism = authenticationMechanism
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

        /** Box API key used for identifying the application the user is authenticating with */
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

        /** Box API secret used for making auth requests. */
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

        /** Developer token for authentication if authentication_mechanism is 'developer_token'. */
        fun developerToken(developerToken: String?) =
            developerToken(JsonField.ofNullable(developerToken))

        /** Alias for calling [Builder.developerToken] with `developerToken.orElse(null)`. */
        fun developerToken(developerToken: Optional<String>) =
            developerToken(developerToken.getOrNull())

        /**
         * Sets [Builder.developerToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.developerToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun developerToken(developerToken: JsonField<String>) = apply {
            this.developerToken = developerToken
        }

        /** Box Enterprise ID, if provided authenticates as service. */
        fun enterpriseId(enterpriseId: String?) = enterpriseId(JsonField.ofNullable(enterpriseId))

        /** Alias for calling [Builder.enterpriseId] with `enterpriseId.orElse(null)`. */
        fun enterpriseId(enterpriseId: Optional<String>) = enterpriseId(enterpriseId.getOrNull())

        /**
         * Sets [Builder.enterpriseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enterpriseId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enterpriseId(enterpriseId: JsonField<String>) = apply {
            this.enterpriseId = enterpriseId
        }

        /** The ID of the Box folder to read from. */
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

        /** Box User ID, if provided authenticates as user. */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [CloudBoxDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authenticationMechanism()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudBoxDataSource =
            CloudBoxDataSource(
                checkRequired("authenticationMechanism", authenticationMechanism),
                className,
                clientId,
                clientSecret,
                developerToken,
                enterpriseId,
                folderId,
                supportsAccessControl,
                userId,
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
    fun validate(): CloudBoxDataSource = apply {
        if (validated) {
            return@apply
        }

        authenticationMechanism().validate()
        className()
        clientId()
        clientSecret()
        developerToken()
        enterpriseId()
        folderId()
        supportsAccessControl()
        userId()
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
        (authenticationMechanism.asKnown().getOrNull()?.validity() ?: 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (clientId.asKnown().isPresent) 1 else 0) +
            (if (clientSecret.asKnown().isPresent) 1 else 0) +
            (if (developerToken.asKnown().isPresent) 1 else 0) +
            (if (enterpriseId.asKnown().isPresent) 1 else 0) +
            (if (folderId.asKnown().isPresent) 1 else 0) +
            (if (supportsAccessControl.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    /** The type of authentication to use (Developer Token or CCG) */
    class AuthenticationMechanism
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CCG = of("ccg")

            @JvmField val DEVELOPER_TOKEN = of("developer_token")

            @JvmStatic fun of(value: String) = AuthenticationMechanism(JsonField.of(value))
        }

        /** An enum containing [AuthenticationMechanism]'s known values. */
        enum class Known {
            CCG,
            DEVELOPER_TOKEN,
        }

        /**
         * An enum containing [AuthenticationMechanism]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AuthenticationMechanism] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CCG,
            DEVELOPER_TOKEN,
            /**
             * An enum member indicating that [AuthenticationMechanism] was instantiated with an
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
                CCG -> Value.CCG
                DEVELOPER_TOKEN -> Value.DEVELOPER_TOKEN
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
                CCG -> Known.CCG
                DEVELOPER_TOKEN -> Known.DEVELOPER_TOKEN
                else ->
                    throw LlamaCloudInvalidDataException("Unknown AuthenticationMechanism: $value")
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
        fun validate(): AuthenticationMechanism = apply {
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

            return other is AuthenticationMechanism && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudBoxDataSource &&
            authenticationMechanism == other.authenticationMechanism &&
            className == other.className &&
            clientId == other.clientId &&
            clientSecret == other.clientSecret &&
            developerToken == other.developerToken &&
            enterpriseId == other.enterpriseId &&
            folderId == other.folderId &&
            supportsAccessControl == other.supportsAccessControl &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authenticationMechanism,
            className,
            clientId,
            clientSecret,
            developerToken,
            enterpriseId,
            folderId,
            supportsAccessControl,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudBoxDataSource{authenticationMechanism=$authenticationMechanism, className=$className, clientId=$clientId, clientSecret=$clientSecret, developerToken=$developerToken, enterpriseId=$enterpriseId, folderId=$folderId, supportsAccessControl=$supportsAccessControl, userId=$userId, additionalProperties=$additionalProperties}"
}
