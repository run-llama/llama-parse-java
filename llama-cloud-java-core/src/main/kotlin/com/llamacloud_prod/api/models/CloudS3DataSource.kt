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

class CloudS3DataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bucket: JsonField<String>,
    private val awsAccessId: JsonField<String>,
    private val awsAccessSecret: JsonField<String>,
    private val className: JsonField<String>,
    private val prefix: JsonField<String>,
    private val regexPattern: JsonField<String>,
    private val s3EndpointUrl: JsonField<String>,
    private val supportsAccessControl: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aws_access_id")
        @ExcludeMissing
        awsAccessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aws_access_secret")
        @ExcludeMissing
        awsAccessSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regex_pattern")
        @ExcludeMissing
        regexPattern: JsonField<String> = JsonMissing.of(),
        @JsonProperty("s3_endpoint_url")
        @ExcludeMissing
        s3EndpointUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        bucket,
        awsAccessId,
        awsAccessSecret,
        className,
        prefix,
        regexPattern,
        s3EndpointUrl,
        supportsAccessControl,
        mutableMapOf(),
    )

    /**
     * The name of the S3 bucket to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucket(): String = bucket.getRequired("bucket")

    /**
     * The AWS access ID to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsAccessId(): Optional<String> = awsAccessId.getOptional("aws_access_id")

    /**
     * The AWS access secret to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awsAccessSecret(): Optional<String> = awsAccessSecret.getOptional("aws_access_secret")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The prefix of the S3 objects to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prefix(): Optional<String> = prefix.getOptional("prefix")

    /**
     * The regex pattern to filter S3 objects. Must be a valid regex pattern.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regexPattern(): Optional<String> = regexPattern.getOptional("regex_pattern")

    /**
     * The S3 endpoint URL to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s3EndpointUrl(): Optional<String> = s3EndpointUrl.getOptional("s3_endpoint_url")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsAccessControl(): Optional<Boolean> =
        supportsAccessControl.getOptional("supports_access_control")

    /**
     * Returns the raw JSON value of [bucket].
     *
     * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

    /**
     * Returns the raw JSON value of [awsAccessId].
     *
     * Unlike [awsAccessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aws_access_id")
    @ExcludeMissing
    fun _awsAccessId(): JsonField<String> = awsAccessId

    /**
     * Returns the raw JSON value of [awsAccessSecret].
     *
     * Unlike [awsAccessSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aws_access_secret")
    @ExcludeMissing
    fun _awsAccessSecret(): JsonField<String> = awsAccessSecret

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [prefix].
     *
     * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

    /**
     * Returns the raw JSON value of [regexPattern].
     *
     * Unlike [regexPattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regex_pattern")
    @ExcludeMissing
    fun _regexPattern(): JsonField<String> = regexPattern

    /**
     * Returns the raw JSON value of [s3EndpointUrl].
     *
     * Unlike [s3EndpointUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s3_endpoint_url")
    @ExcludeMissing
    fun _s3EndpointUrl(): JsonField<String> = s3EndpointUrl

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
         * Returns a mutable builder for constructing an instance of [CloudS3DataSource].
         *
         * The following fields are required:
         * ```java
         * .bucket()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudS3DataSource]. */
    class Builder internal constructor() {

        private var bucket: JsonField<String>? = null
        private var awsAccessId: JsonField<String> = JsonMissing.of()
        private var awsAccessSecret: JsonField<String> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var prefix: JsonField<String> = JsonMissing.of()
        private var regexPattern: JsonField<String> = JsonMissing.of()
        private var s3EndpointUrl: JsonField<String> = JsonMissing.of()
        private var supportsAccessControl: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudS3DataSource: CloudS3DataSource) = apply {
            bucket = cloudS3DataSource.bucket
            awsAccessId = cloudS3DataSource.awsAccessId
            awsAccessSecret = cloudS3DataSource.awsAccessSecret
            className = cloudS3DataSource.className
            prefix = cloudS3DataSource.prefix
            regexPattern = cloudS3DataSource.regexPattern
            s3EndpointUrl = cloudS3DataSource.s3EndpointUrl
            supportsAccessControl = cloudS3DataSource.supportsAccessControl
            additionalProperties = cloudS3DataSource.additionalProperties.toMutableMap()
        }

        /** The name of the S3 bucket to read from. */
        fun bucket(bucket: String) = bucket(JsonField.of(bucket))

        /**
         * Sets [Builder.bucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucket] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

        /** The AWS access ID to use for authentication. */
        fun awsAccessId(awsAccessId: String?) = awsAccessId(JsonField.ofNullable(awsAccessId))

        /** Alias for calling [Builder.awsAccessId] with `awsAccessId.orElse(null)`. */
        fun awsAccessId(awsAccessId: Optional<String>) = awsAccessId(awsAccessId.getOrNull())

        /**
         * Sets [Builder.awsAccessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsAccessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun awsAccessId(awsAccessId: JsonField<String>) = apply { this.awsAccessId = awsAccessId }

        /** The AWS access secret to use for authentication. */
        fun awsAccessSecret(awsAccessSecret: String?) =
            awsAccessSecret(JsonField.ofNullable(awsAccessSecret))

        /** Alias for calling [Builder.awsAccessSecret] with `awsAccessSecret.orElse(null)`. */
        fun awsAccessSecret(awsAccessSecret: Optional<String>) =
            awsAccessSecret(awsAccessSecret.getOrNull())

        /**
         * Sets [Builder.awsAccessSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsAccessSecret] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun awsAccessSecret(awsAccessSecret: JsonField<String>) = apply {
            this.awsAccessSecret = awsAccessSecret
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

        /** The prefix of the S3 objects to read from. */
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

        /** The regex pattern to filter S3 objects. Must be a valid regex pattern. */
        fun regexPattern(regexPattern: String?) = regexPattern(JsonField.ofNullable(regexPattern))

        /** Alias for calling [Builder.regexPattern] with `regexPattern.orElse(null)`. */
        fun regexPattern(regexPattern: Optional<String>) = regexPattern(regexPattern.getOrNull())

        /**
         * Sets [Builder.regexPattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regexPattern] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regexPattern(regexPattern: JsonField<String>) = apply {
            this.regexPattern = regexPattern
        }

        /** The S3 endpoint URL to use for authentication. */
        fun s3EndpointUrl(s3EndpointUrl: String?) =
            s3EndpointUrl(JsonField.ofNullable(s3EndpointUrl))

        /** Alias for calling [Builder.s3EndpointUrl] with `s3EndpointUrl.orElse(null)`. */
        fun s3EndpointUrl(s3EndpointUrl: Optional<String>) =
            s3EndpointUrl(s3EndpointUrl.getOrNull())

        /**
         * Sets [Builder.s3EndpointUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s3EndpointUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun s3EndpointUrl(s3EndpointUrl: JsonField<String>) = apply {
            this.s3EndpointUrl = s3EndpointUrl
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
         * Returns an immutable instance of [CloudS3DataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucket()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudS3DataSource =
            CloudS3DataSource(
                checkRequired("bucket", bucket),
                awsAccessId,
                awsAccessSecret,
                className,
                prefix,
                regexPattern,
                s3EndpointUrl,
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
    fun validate(): CloudS3DataSource = apply {
        if (validated) {
            return@apply
        }

        bucket()
        awsAccessId()
        awsAccessSecret()
        className()
        prefix()
        regexPattern()
        s3EndpointUrl()
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
        (if (bucket.asKnown().isPresent) 1 else 0) +
            (if (awsAccessId.asKnown().isPresent) 1 else 0) +
            (if (awsAccessSecret.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (prefix.asKnown().isPresent) 1 else 0) +
            (if (regexPattern.asKnown().isPresent) 1 else 0) +
            (if (s3EndpointUrl.asKnown().isPresent) 1 else 0) +
            (if (supportsAccessControl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudS3DataSource &&
            bucket == other.bucket &&
            awsAccessId == other.awsAccessId &&
            awsAccessSecret == other.awsAccessSecret &&
            className == other.className &&
            prefix == other.prefix &&
            regexPattern == other.regexPattern &&
            s3EndpointUrl == other.s3EndpointUrl &&
            supportsAccessControl == other.supportsAccessControl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            bucket,
            awsAccessId,
            awsAccessSecret,
            className,
            prefix,
            regexPattern,
            s3EndpointUrl,
            supportsAccessControl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudS3DataSource{bucket=$bucket, awsAccessId=$awsAccessId, awsAccessSecret=$awsAccessSecret, className=$className, prefix=$prefix, regexPattern=$regexPattern, s3EndpointUrl=$s3EndpointUrl, supportsAccessControl=$supportsAccessControl, additionalProperties=$additionalProperties}"
}
