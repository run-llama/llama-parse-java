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

class CloudSlackDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val slackToken: JsonField<String>,
    private val channelIds: JsonField<String>,
    private val channelPatterns: JsonField<String>,
    private val className: JsonField<String>,
    private val earliestDate: JsonField<String>,
    private val earliestDateTimestamp: JsonField<Double>,
    private val latestDate: JsonField<String>,
    private val latestDateTimestamp: JsonField<Double>,
    private val supportsAccessControl: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("slack_token")
        @ExcludeMissing
        slackToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel_ids")
        @ExcludeMissing
        channelIds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel_patterns")
        @ExcludeMissing
        channelPatterns: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("earliest_date")
        @ExcludeMissing
        earliestDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("earliest_date_timestamp")
        @ExcludeMissing
        earliestDateTimestamp: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("latest_date")
        @ExcludeMissing
        latestDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latest_date_timestamp")
        @ExcludeMissing
        latestDateTimestamp: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        slackToken,
        channelIds,
        channelPatterns,
        className,
        earliestDate,
        earliestDateTimestamp,
        latestDate,
        latestDateTimestamp,
        supportsAccessControl,
        mutableMapOf(),
    )

    /**
     * Slack Bot Token.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun slackToken(): String = slackToken.getRequired("slack_token")

    /**
     * Slack Channel.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelIds(): Optional<String> = channelIds.getOptional("channel_ids")

    /**
     * Slack Channel name pattern.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelPatterns(): Optional<String> = channelPatterns.getOptional("channel_patterns")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * Earliest date.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun earliestDate(): Optional<String> = earliestDate.getOptional("earliest_date")

    /**
     * Earliest date timestamp.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun earliestDateTimestamp(): Optional<Double> =
        earliestDateTimestamp.getOptional("earliest_date_timestamp")

    /**
     * Latest date.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestDate(): Optional<String> = latestDate.getOptional("latest_date")

    /**
     * Latest date timestamp.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestDateTimestamp(): Optional<Double> =
        latestDateTimestamp.getOptional("latest_date_timestamp")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsAccessControl(): Optional<Boolean> =
        supportsAccessControl.getOptional("supports_access_control")

    /**
     * Returns the raw JSON value of [slackToken].
     *
     * Unlike [slackToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slack_token") @ExcludeMissing fun _slackToken(): JsonField<String> = slackToken

    /**
     * Returns the raw JSON value of [channelIds].
     *
     * Unlike [channelIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel_ids") @ExcludeMissing fun _channelIds(): JsonField<String> = channelIds

    /**
     * Returns the raw JSON value of [channelPatterns].
     *
     * Unlike [channelPatterns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel_patterns")
    @ExcludeMissing
    fun _channelPatterns(): JsonField<String> = channelPatterns

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [earliestDate].
     *
     * Unlike [earliestDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("earliest_date")
    @ExcludeMissing
    fun _earliestDate(): JsonField<String> = earliestDate

    /**
     * Returns the raw JSON value of [earliestDateTimestamp].
     *
     * Unlike [earliestDateTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("earliest_date_timestamp")
    @ExcludeMissing
    fun _earliestDateTimestamp(): JsonField<Double> = earliestDateTimestamp

    /**
     * Returns the raw JSON value of [latestDate].
     *
     * Unlike [latestDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latest_date") @ExcludeMissing fun _latestDate(): JsonField<String> = latestDate

    /**
     * Returns the raw JSON value of [latestDateTimestamp].
     *
     * Unlike [latestDateTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("latest_date_timestamp")
    @ExcludeMissing
    fun _latestDateTimestamp(): JsonField<Double> = latestDateTimestamp

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
         * Returns a mutable builder for constructing an instance of [CloudSlackDataSource].
         *
         * The following fields are required:
         * ```java
         * .slackToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudSlackDataSource]. */
    class Builder internal constructor() {

        private var slackToken: JsonField<String>? = null
        private var channelIds: JsonField<String> = JsonMissing.of()
        private var channelPatterns: JsonField<String> = JsonMissing.of()
        private var className: JsonField<String> = JsonMissing.of()
        private var earliestDate: JsonField<String> = JsonMissing.of()
        private var earliestDateTimestamp: JsonField<Double> = JsonMissing.of()
        private var latestDate: JsonField<String> = JsonMissing.of()
        private var latestDateTimestamp: JsonField<Double> = JsonMissing.of()
        private var supportsAccessControl: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudSlackDataSource: CloudSlackDataSource) = apply {
            slackToken = cloudSlackDataSource.slackToken
            channelIds = cloudSlackDataSource.channelIds
            channelPatterns = cloudSlackDataSource.channelPatterns
            className = cloudSlackDataSource.className
            earliestDate = cloudSlackDataSource.earliestDate
            earliestDateTimestamp = cloudSlackDataSource.earliestDateTimestamp
            latestDate = cloudSlackDataSource.latestDate
            latestDateTimestamp = cloudSlackDataSource.latestDateTimestamp
            supportsAccessControl = cloudSlackDataSource.supportsAccessControl
            additionalProperties = cloudSlackDataSource.additionalProperties.toMutableMap()
        }

        /** Slack Bot Token. */
        fun slackToken(slackToken: String) = slackToken(JsonField.of(slackToken))

        /**
         * Sets [Builder.slackToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slackToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun slackToken(slackToken: JsonField<String>) = apply { this.slackToken = slackToken }

        /** Slack Channel. */
        fun channelIds(channelIds: String?) = channelIds(JsonField.ofNullable(channelIds))

        /** Alias for calling [Builder.channelIds] with `channelIds.orElse(null)`. */
        fun channelIds(channelIds: Optional<String>) = channelIds(channelIds.getOrNull())

        /**
         * Sets [Builder.channelIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelIds] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channelIds(channelIds: JsonField<String>) = apply { this.channelIds = channelIds }

        /** Slack Channel name pattern. */
        fun channelPatterns(channelPatterns: String?) =
            channelPatterns(JsonField.ofNullable(channelPatterns))

        /** Alias for calling [Builder.channelPatterns] with `channelPatterns.orElse(null)`. */
        fun channelPatterns(channelPatterns: Optional<String>) =
            channelPatterns(channelPatterns.getOrNull())

        /**
         * Sets [Builder.channelPatterns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelPatterns] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channelPatterns(channelPatterns: JsonField<String>) = apply {
            this.channelPatterns = channelPatterns
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

        /** Earliest date. */
        fun earliestDate(earliestDate: String?) = earliestDate(JsonField.ofNullable(earliestDate))

        /** Alias for calling [Builder.earliestDate] with `earliestDate.orElse(null)`. */
        fun earliestDate(earliestDate: Optional<String>) = earliestDate(earliestDate.getOrNull())

        /**
         * Sets [Builder.earliestDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earliestDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun earliestDate(earliestDate: JsonField<String>) = apply {
            this.earliestDate = earliestDate
        }

        /** Earliest date timestamp. */
        fun earliestDateTimestamp(earliestDateTimestamp: Double?) =
            earliestDateTimestamp(JsonField.ofNullable(earliestDateTimestamp))

        /**
         * Alias for [Builder.earliestDateTimestamp].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun earliestDateTimestamp(earliestDateTimestamp: Double) =
            earliestDateTimestamp(earliestDateTimestamp as Double?)

        /**
         * Alias for calling [Builder.earliestDateTimestamp] with
         * `earliestDateTimestamp.orElse(null)`.
         */
        fun earliestDateTimestamp(earliestDateTimestamp: Optional<Double>) =
            earliestDateTimestamp(earliestDateTimestamp.getOrNull())

        /**
         * Sets [Builder.earliestDateTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earliestDateTimestamp] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun earliestDateTimestamp(earliestDateTimestamp: JsonField<Double>) = apply {
            this.earliestDateTimestamp = earliestDateTimestamp
        }

        /** Latest date. */
        fun latestDate(latestDate: String?) = latestDate(JsonField.ofNullable(latestDate))

        /** Alias for calling [Builder.latestDate] with `latestDate.orElse(null)`. */
        fun latestDate(latestDate: Optional<String>) = latestDate(latestDate.getOrNull())

        /**
         * Sets [Builder.latestDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun latestDate(latestDate: JsonField<String>) = apply { this.latestDate = latestDate }

        /** Latest date timestamp. */
        fun latestDateTimestamp(latestDateTimestamp: Double?) =
            latestDateTimestamp(JsonField.ofNullable(latestDateTimestamp))

        /**
         * Alias for [Builder.latestDateTimestamp].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latestDateTimestamp(latestDateTimestamp: Double) =
            latestDateTimestamp(latestDateTimestamp as Double?)

        /**
         * Alias for calling [Builder.latestDateTimestamp] with `latestDateTimestamp.orElse(null)`.
         */
        fun latestDateTimestamp(latestDateTimestamp: Optional<Double>) =
            latestDateTimestamp(latestDateTimestamp.getOrNull())

        /**
         * Sets [Builder.latestDateTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestDateTimestamp] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun latestDateTimestamp(latestDateTimestamp: JsonField<Double>) = apply {
            this.latestDateTimestamp = latestDateTimestamp
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
         * Returns an immutable instance of [CloudSlackDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .slackToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudSlackDataSource =
            CloudSlackDataSource(
                checkRequired("slackToken", slackToken),
                channelIds,
                channelPatterns,
                className,
                earliestDate,
                earliestDateTimestamp,
                latestDate,
                latestDateTimestamp,
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
    fun validate(): CloudSlackDataSource = apply {
        if (validated) {
            return@apply
        }

        slackToken()
        channelIds()
        channelPatterns()
        className()
        earliestDate()
        earliestDateTimestamp()
        latestDate()
        latestDateTimestamp()
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
        (if (slackToken.asKnown().isPresent) 1 else 0) +
            (if (channelIds.asKnown().isPresent) 1 else 0) +
            (if (channelPatterns.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (earliestDate.asKnown().isPresent) 1 else 0) +
            (if (earliestDateTimestamp.asKnown().isPresent) 1 else 0) +
            (if (latestDate.asKnown().isPresent) 1 else 0) +
            (if (latestDateTimestamp.asKnown().isPresent) 1 else 0) +
            (if (supportsAccessControl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudSlackDataSource &&
            slackToken == other.slackToken &&
            channelIds == other.channelIds &&
            channelPatterns == other.channelPatterns &&
            className == other.className &&
            earliestDate == other.earliestDate &&
            earliestDateTimestamp == other.earliestDateTimestamp &&
            latestDate == other.latestDate &&
            latestDateTimestamp == other.latestDateTimestamp &&
            supportsAccessControl == other.supportsAccessControl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            slackToken,
            channelIds,
            channelPatterns,
            className,
            earliestDate,
            earliestDateTimestamp,
            latestDate,
            latestDateTimestamp,
            supportsAccessControl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudSlackDataSource{slackToken=$slackToken, channelIds=$channelIds, channelPatterns=$channelPatterns, className=$className, earliestDate=$earliestDate, earliestDateTimestamp=$earliestDateTimestamp, latestDate=$latestDate, latestDateTimestamp=$latestDateTimestamp, supportsAccessControl=$supportsAccessControl, additionalProperties=$additionalProperties}"
}
