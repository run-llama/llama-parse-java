// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
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

class CloudGoogleDriveDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val folderId: JsonField<String>,
    private val className: JsonField<String>,
    private val folderName: JsonField<String>,
    private val serviceAccountKey: JsonField<ServiceAccountKey>,
    private val supportsAccessControl: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("folder_id") @ExcludeMissing folderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("folder_name")
        @ExcludeMissing
        folderName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_account_key")
        @ExcludeMissing
        serviceAccountKey: JsonField<ServiceAccountKey> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        folderId,
        className,
        folderName,
        serviceAccountKey,
        supportsAccessControl,
        mutableMapOf(),
    )

    /**
     * The ID of the Google Drive folder to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun folderId(): String = folderId.getRequired("folder_id")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * Human-readable name of the selected folder, for display.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderName(): Optional<String> = folderName.getOptional("folder_name")

    /**
     * A dictionary containing secret values
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceAccountKey(): Optional<ServiceAccountKey> =
        serviceAccountKey.getOptional("service_account_key")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsAccessControl(): Optional<Boolean> =
        supportsAccessControl.getOptional("supports_access_control")

    /**
     * Returns the raw JSON value of [folderId].
     *
     * Unlike [folderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder_id") @ExcludeMissing fun _folderId(): JsonField<String> = folderId

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [folderName].
     *
     * Unlike [folderName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder_name") @ExcludeMissing fun _folderName(): JsonField<String> = folderName

    /**
     * Returns the raw JSON value of [serviceAccountKey].
     *
     * Unlike [serviceAccountKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("service_account_key")
    @ExcludeMissing
    fun _serviceAccountKey(): JsonField<ServiceAccountKey> = serviceAccountKey

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
         * Returns a mutable builder for constructing an instance of [CloudGoogleDriveDataSource].
         *
         * The following fields are required:
         * ```java
         * .folderId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudGoogleDriveDataSource]. */
    class Builder internal constructor() {

        private var folderId: JsonField<String>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var folderName: JsonField<String> = JsonMissing.of()
        private var serviceAccountKey: JsonField<ServiceAccountKey> = JsonMissing.of()
        private var supportsAccessControl: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudGoogleDriveDataSource: CloudGoogleDriveDataSource) = apply {
            folderId = cloudGoogleDriveDataSource.folderId
            className = cloudGoogleDriveDataSource.className
            folderName = cloudGoogleDriveDataSource.folderName
            serviceAccountKey = cloudGoogleDriveDataSource.serviceAccountKey
            supportsAccessControl = cloudGoogleDriveDataSource.supportsAccessControl
            additionalProperties = cloudGoogleDriveDataSource.additionalProperties.toMutableMap()
        }

        /** The ID of the Google Drive folder to read from. */
        fun folderId(folderId: String) = folderId(JsonField.of(folderId))

        /**
         * Sets [Builder.folderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folderId(folderId: JsonField<String>) = apply { this.folderId = folderId }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** Human-readable name of the selected folder, for display. */
        fun folderName(folderName: String?) = folderName(JsonField.ofNullable(folderName))

        /** Alias for calling [Builder.folderName] with `folderName.orElse(null)`. */
        fun folderName(folderName: Optional<String>) = folderName(folderName.getOrNull())

        /**
         * Sets [Builder.folderName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun folderName(folderName: JsonField<String>) = apply { this.folderName = folderName }

        /** A dictionary containing secret values */
        fun serviceAccountKey(serviceAccountKey: ServiceAccountKey?) =
            serviceAccountKey(JsonField.ofNullable(serviceAccountKey))

        /** Alias for calling [Builder.serviceAccountKey] with `serviceAccountKey.orElse(null)`. */
        fun serviceAccountKey(serviceAccountKey: Optional<ServiceAccountKey>) =
            serviceAccountKey(serviceAccountKey.getOrNull())

        /**
         * Sets [Builder.serviceAccountKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceAccountKey] with a well-typed [ServiceAccountKey]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun serviceAccountKey(serviceAccountKey: JsonField<ServiceAccountKey>) = apply {
            this.serviceAccountKey = serviceAccountKey
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
         * Returns an immutable instance of [CloudGoogleDriveDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .folderId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudGoogleDriveDataSource =
            CloudGoogleDriveDataSource(
                checkRequired("folderId", folderId),
                className,
                folderName,
                serviceAccountKey,
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
    fun validate(): CloudGoogleDriveDataSource = apply {
        if (validated) {
            return@apply
        }

        folderId()
        className()
        folderName()
        serviceAccountKey().ifPresent { it.validate() }
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
        (if (folderId.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (folderName.asKnown().isPresent) 1 else 0) +
            (serviceAccountKey.asKnown().getOrNull()?.validity() ?: 0) +
            (if (supportsAccessControl.asKnown().isPresent) 1 else 0)

    /** A dictionary containing secret values */
    class ServiceAccountKey
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

            /** Returns a mutable builder for constructing an instance of [ServiceAccountKey]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ServiceAccountKey]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(serviceAccountKey: ServiceAccountKey) = apply {
                additionalProperties = serviceAccountKey.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ServiceAccountKey].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ServiceAccountKey = ServiceAccountKey(additionalProperties.toImmutable())
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
        fun validate(): ServiceAccountKey = apply {
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

            return other is ServiceAccountKey && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ServiceAccountKey{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudGoogleDriveDataSource &&
            folderId == other.folderId &&
            className == other.className &&
            folderName == other.folderName &&
            serviceAccountKey == other.serviceAccountKey &&
            supportsAccessControl == other.supportsAccessControl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            folderId,
            className,
            folderName,
            serviceAccountKey,
            supportsAccessControl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudGoogleDriveDataSource{folderId=$folderId, className=$className, folderName=$folderName, serviceAccountKey=$serviceAccountKey, supportsAccessControl=$supportsAccessControl, additionalProperties=$additionalProperties}"
}
