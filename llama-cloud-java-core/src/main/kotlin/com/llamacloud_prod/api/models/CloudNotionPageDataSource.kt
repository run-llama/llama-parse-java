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

class CloudNotionPageDataSource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val integrationToken: JsonField<String>,
    private val className: JsonField<String>,
    private val databaseIds: JsonField<String>,
    private val pageIds: JsonField<String>,
    private val supportsAccessControl: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("integration_token")
        @ExcludeMissing
        integrationToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("database_ids")
        @ExcludeMissing
        databaseIds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("page_ids") @ExcludeMissing pageIds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_access_control")
        @ExcludeMissing
        supportsAccessControl: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        integrationToken,
        className,
        databaseIds,
        pageIds,
        supportsAccessControl,
        mutableMapOf(),
    )

    /**
     * The integration token to use for authentication.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationToken(): String = integrationToken.getRequired("integration_token")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * The Notion Database Id to read content from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun databaseIds(): Optional<String> = databaseIds.getOptional("database_ids")

    /**
     * The Page ID's of the Notion to read from.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageIds(): Optional<String> = pageIds.getOptional("page_ids")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsAccessControl(): Optional<Boolean> =
        supportsAccessControl.getOptional("supports_access_control")

    /**
     * Returns the raw JSON value of [integrationToken].
     *
     * Unlike [integrationToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("integration_token")
    @ExcludeMissing
    fun _integrationToken(): JsonField<String> = integrationToken

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [databaseIds].
     *
     * Unlike [databaseIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("database_ids")
    @ExcludeMissing
    fun _databaseIds(): JsonField<String> = databaseIds

    /**
     * Returns the raw JSON value of [pageIds].
     *
     * Unlike [pageIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_ids") @ExcludeMissing fun _pageIds(): JsonField<String> = pageIds

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
         * Returns a mutable builder for constructing an instance of [CloudNotionPageDataSource].
         *
         * The following fields are required:
         * ```java
         * .integrationToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudNotionPageDataSource]. */
    class Builder internal constructor() {

        private var integrationToken: JsonField<String>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var databaseIds: JsonField<String> = JsonMissing.of()
        private var pageIds: JsonField<String> = JsonMissing.of()
        private var supportsAccessControl: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudNotionPageDataSource: CloudNotionPageDataSource) = apply {
            integrationToken = cloudNotionPageDataSource.integrationToken
            className = cloudNotionPageDataSource.className
            databaseIds = cloudNotionPageDataSource.databaseIds
            pageIds = cloudNotionPageDataSource.pageIds
            supportsAccessControl = cloudNotionPageDataSource.supportsAccessControl
            additionalProperties = cloudNotionPageDataSource.additionalProperties.toMutableMap()
        }

        /** The integration token to use for authentication. */
        fun integrationToken(integrationToken: String) =
            integrationToken(JsonField.of(integrationToken))

        /**
         * Sets [Builder.integrationToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun integrationToken(integrationToken: JsonField<String>) = apply {
            this.integrationToken = integrationToken
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

        /** The Notion Database Id to read content from. */
        fun databaseIds(databaseIds: String?) = databaseIds(JsonField.ofNullable(databaseIds))

        /** Alias for calling [Builder.databaseIds] with `databaseIds.orElse(null)`. */
        fun databaseIds(databaseIds: Optional<String>) = databaseIds(databaseIds.getOrNull())

        /**
         * Sets [Builder.databaseIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.databaseIds] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun databaseIds(databaseIds: JsonField<String>) = apply { this.databaseIds = databaseIds }

        /** The Page ID's of the Notion to read from. */
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
         * Returns an immutable instance of [CloudNotionPageDataSource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .integrationToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudNotionPageDataSource =
            CloudNotionPageDataSource(
                checkRequired("integrationToken", integrationToken),
                className,
                databaseIds,
                pageIds,
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
    fun validate(): CloudNotionPageDataSource = apply {
        if (validated) {
            return@apply
        }

        integrationToken()
        className()
        databaseIds()
        pageIds()
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
        (if (integrationToken.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (if (databaseIds.asKnown().isPresent) 1 else 0) +
            (if (pageIds.asKnown().isPresent) 1 else 0) +
            (if (supportsAccessControl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudNotionPageDataSource &&
            integrationToken == other.integrationToken &&
            className == other.className &&
            databaseIds == other.databaseIds &&
            pageIds == other.pageIds &&
            supportsAccessControl == other.supportsAccessControl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            integrationToken,
            className,
            databaseIds,
            pageIds,
            supportsAccessControl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudNotionPageDataSource{integrationToken=$integrationToken, className=$className, databaseIds=$databaseIds, pageIds=$pageIds, supportsAccessControl=$supportsAccessControl, additionalProperties=$additionalProperties}"
}
