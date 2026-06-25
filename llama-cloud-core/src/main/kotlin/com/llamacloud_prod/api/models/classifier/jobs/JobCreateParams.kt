// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classifier.jobs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.Params
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a classify job. Experimental: not production-ready and subject to change. */
@Deprecated("Please use `client.classify.create()`")
class JobCreateParams
private constructor(
    private val organizationId: String?,
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * The IDs of the files to classify
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileIds(): List<String> = body.fileIds()

    /**
     * The rules to classify the files
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rules(): List<ClassifierRule> = body.rules()

    /**
     * The classification mode to use
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = body.mode()

    /**
     * The configuration for the parsing job
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parsingConfiguration(): Optional<ClassifyParsingConfiguration> = body.parsingConfiguration()

    /**
     * List of webhook configurations for notifications
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookConfigurations(): Optional<List<WebhookConfiguration>> = body.webhookConfigurations()

    /**
     * Returns the raw JSON value of [fileIds].
     *
     * Unlike [fileIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fileIds(): JsonField<List<String>> = body._fileIds()

    /**
     * Returns the raw JSON value of [rules].
     *
     * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rules(): JsonField<List<ClassifierRule>> = body._rules()

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mode(): JsonField<Mode> = body._mode()

    /**
     * Returns the raw JSON value of [parsingConfiguration].
     *
     * Unlike [parsingConfiguration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _parsingConfiguration(): JsonField<ClassifyParsingConfiguration> =
        body._parsingConfiguration()

    /**
     * Returns the raw JSON value of [webhookConfigurations].
     *
     * Unlike [webhookConfigurations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookConfigurations(): JsonField<List<WebhookConfiguration>> =
        body._webhookConfigurations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobCreateParams].
         *
         * The following fields are required:
         * ```java
         * .fileIds()
         * .rules()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobCreateParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(jobCreateParams: JobCreateParams) = apply {
            organizationId = jobCreateParams.organizationId
            projectId = jobCreateParams.projectId
            body = jobCreateParams.body.toBuilder()
            additionalHeaders = jobCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobCreateParams.additionalQueryParams.toBuilder()
        }

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [fileIds]
         * - [rules]
         * - [mode]
         * - [parsingConfiguration]
         * - [webhookConfigurations]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The IDs of the files to classify */
        fun fileIds(fileIds: List<String>) = apply { body.fileIds(fileIds) }

        /**
         * Sets [Builder.fileIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fileIds(fileIds: JsonField<List<String>>) = apply { body.fileIds(fileIds) }

        /**
         * Adds a single [String] to [fileIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFileId(fileId: String) = apply { body.addFileId(fileId) }

        /** The rules to classify the files */
        fun rules(rules: List<ClassifierRule>) = apply { body.rules(rules) }

        /**
         * Sets [Builder.rules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rules] with a well-typed `List<ClassifierRule>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rules(rules: JsonField<List<ClassifierRule>>) = apply { body.rules(rules) }

        /**
         * Adds a single [ClassifierRule] to [rules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRule(rule: ClassifierRule) = apply { body.addRule(rule) }

        /** The classification mode to use */
        fun mode(mode: Mode) = apply { body.mode(mode) }

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { body.mode(mode) }

        /** The configuration for the parsing job */
        fun parsingConfiguration(parsingConfiguration: ClassifyParsingConfiguration) = apply {
            body.parsingConfiguration(parsingConfiguration)
        }

        /**
         * Sets [Builder.parsingConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parsingConfiguration] with a well-typed
         * [ClassifyParsingConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun parsingConfiguration(parsingConfiguration: JsonField<ClassifyParsingConfiguration>) =
            apply {
                body.parsingConfiguration(parsingConfiguration)
            }

        /** List of webhook configurations for notifications */
        fun webhookConfigurations(webhookConfigurations: List<WebhookConfiguration>) = apply {
            body.webhookConfigurations(webhookConfigurations)
        }

        /**
         * Sets [Builder.webhookConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookConfigurations] with a well-typed
         * `List<WebhookConfiguration>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun webhookConfigurations(webhookConfigurations: JsonField<List<WebhookConfiguration>>) =
            apply {
                body.webhookConfigurations(webhookConfigurations)
            }

        /**
         * Adds a single [WebhookConfiguration] to [webhookConfigurations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWebhookConfiguration(webhookConfiguration: WebhookConfiguration) = apply {
            body.addWebhookConfiguration(webhookConfiguration)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [JobCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fileIds()
         * .rules()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobCreateParams =
            JobCreateParams(
                organizationId,
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                organizationId?.let { put("organization_id", it) }
                projectId?.let { put("project_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** A classify job. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fileIds: JsonField<List<String>>,
        private val rules: JsonField<List<ClassifierRule>>,
        private val mode: JsonField<Mode>,
        private val parsingConfiguration: JsonField<ClassifyParsingConfiguration>,
        private val webhookConfigurations: JsonField<List<WebhookConfiguration>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("file_ids")
            @ExcludeMissing
            fileIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("rules")
            @ExcludeMissing
            rules: JsonField<List<ClassifierRule>> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            @JsonProperty("parsing_configuration")
            @ExcludeMissing
            parsingConfiguration: JsonField<ClassifyParsingConfiguration> = JsonMissing.of(),
            @JsonProperty("webhook_configurations")
            @ExcludeMissing
            webhookConfigurations: JsonField<List<WebhookConfiguration>> = JsonMissing.of(),
        ) : this(fileIds, rules, mode, parsingConfiguration, webhookConfigurations, mutableMapOf())

        /**
         * The IDs of the files to classify
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileIds(): List<String> = fileIds.getRequired("file_ids")

        /**
         * The rules to classify the files
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rules(): List<ClassifierRule> = rules.getRequired("rules")

        /**
         * The classification mode to use
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mode(): Optional<Mode> = mode.getOptional("mode")

        /**
         * The configuration for the parsing job
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parsingConfiguration(): Optional<ClassifyParsingConfiguration> =
            parsingConfiguration.getOptional("parsing_configuration")

        /**
         * List of webhook configurations for notifications
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookConfigurations(): Optional<List<WebhookConfiguration>> =
            webhookConfigurations.getOptional("webhook_configurations")

        /**
         * Returns the raw JSON value of [fileIds].
         *
         * Unlike [fileIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_ids") @ExcludeMissing fun _fileIds(): JsonField<List<String>> = fileIds

        /**
         * Returns the raw JSON value of [rules].
         *
         * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<ClassifierRule>> = rules

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

        /**
         * Returns the raw JSON value of [parsingConfiguration].
         *
         * Unlike [parsingConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("parsing_configuration")
        @ExcludeMissing
        fun _parsingConfiguration(): JsonField<ClassifyParsingConfiguration> = parsingConfiguration

        /**
         * Returns the raw JSON value of [webhookConfigurations].
         *
         * Unlike [webhookConfigurations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_configurations")
        @ExcludeMissing
        fun _webhookConfigurations(): JsonField<List<WebhookConfiguration>> = webhookConfigurations

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .fileIds()
             * .rules()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var fileIds: JsonField<MutableList<String>>? = null
            private var rules: JsonField<MutableList<ClassifierRule>>? = null
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var parsingConfiguration: JsonField<ClassifyParsingConfiguration> =
                JsonMissing.of()
            private var webhookConfigurations: JsonField<MutableList<WebhookConfiguration>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                fileIds = body.fileIds.map { it.toMutableList() }
                rules = body.rules.map { it.toMutableList() }
                mode = body.mode
                parsingConfiguration = body.parsingConfiguration
                webhookConfigurations = body.webhookConfigurations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The IDs of the files to classify */
            fun fileIds(fileIds: List<String>) = fileIds(JsonField.of(fileIds))

            /**
             * Sets [Builder.fileIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileIds(fileIds: JsonField<List<String>>) = apply {
                this.fileIds = fileIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [fileIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFileId(fileId: String) = apply {
                fileIds =
                    (fileIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fileIds", it).add(fileId)
                    }
            }

            /** The rules to classify the files */
            fun rules(rules: List<ClassifierRule>) = rules(JsonField.of(rules))

            /**
             * Sets [Builder.rules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rules] with a well-typed `List<ClassifierRule>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rules(rules: JsonField<List<ClassifierRule>>) = apply {
                this.rules = rules.map { it.toMutableList() }
            }

            /**
             * Adds a single [ClassifierRule] to [rules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRule(rule: ClassifierRule) = apply {
                rules =
                    (rules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rules", it).add(rule)
                    }
            }

            /** The classification mode to use */
            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

            /** The configuration for the parsing job */
            fun parsingConfiguration(parsingConfiguration: ClassifyParsingConfiguration) =
                parsingConfiguration(JsonField.of(parsingConfiguration))

            /**
             * Sets [Builder.parsingConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parsingConfiguration] with a well-typed
             * [ClassifyParsingConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun parsingConfiguration(
                parsingConfiguration: JsonField<ClassifyParsingConfiguration>
            ) = apply { this.parsingConfiguration = parsingConfiguration }

            /** List of webhook configurations for notifications */
            fun webhookConfigurations(webhookConfigurations: List<WebhookConfiguration>) =
                webhookConfigurations(JsonField.of(webhookConfigurations))

            /**
             * Sets [Builder.webhookConfigurations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookConfigurations] with a well-typed
             * `List<WebhookConfiguration>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun webhookConfigurations(
                webhookConfigurations: JsonField<List<WebhookConfiguration>>
            ) = apply {
                this.webhookConfigurations = webhookConfigurations.map { it.toMutableList() }
            }

            /**
             * Adds a single [WebhookConfiguration] to [webhookConfigurations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWebhookConfiguration(webhookConfiguration: WebhookConfiguration) = apply {
                webhookConfigurations =
                    (webhookConfigurations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("webhookConfigurations", it).add(webhookConfiguration)
                    }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fileIds()
             * .rules()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("fileIds", fileIds).map { it.toImmutable() },
                    checkRequired("rules", rules).map { it.toImmutable() },
                    mode,
                    parsingConfiguration,
                    (webhookConfigurations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            fileIds()
            rules().forEach { it.validate() }
            mode().ifPresent { it.validate() }
            parsingConfiguration().ifPresent { it.validate() }
            webhookConfigurations().ifPresent { it.forEach { it.validate() } }
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
            (fileIds.asKnown().getOrNull()?.size ?: 0) +
                (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0) +
                (parsingConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (webhookConfigurations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                fileIds == other.fileIds &&
                rules == other.rules &&
                mode == other.mode &&
                parsingConfiguration == other.parsingConfiguration &&
                webhookConfigurations == other.webhookConfigurations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fileIds,
                rules,
                mode,
                parsingConfiguration,
                webhookConfigurations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{fileIds=$fileIds, rules=$rules, mode=$mode, parsingConfiguration=$parsingConfiguration, webhookConfigurations=$webhookConfigurations, additionalProperties=$additionalProperties}"
    }

    /** The classification mode to use */
    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FAST = of("FAST")

            @JvmField val MULTIMODAL = of("MULTIMODAL")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            FAST,
            MULTIMODAL,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAST,
            MULTIMODAL,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                FAST -> Value.FAST
                MULTIMODAL -> Value.MULTIMODAL
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
                FAST -> Known.FAST
                MULTIMODAL -> Known.MULTIMODAL
                else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
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
        fun validate(): Mode = apply {
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Webhook configuration for receiving parsing job notifications.
     *
     * Webhooks are called when specified events occur during job processing. Configure multiple
     * webhook configurations to send to different endpoints.
     */
    class WebhookConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val webhookEvents: JsonField<List<String>>,
        private val webhookHeaders: JsonField<WebhookHeaders>,
        private val webhookOutputFormat: JsonField<WebhookOutputFormat>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("webhook_events")
            @ExcludeMissing
            webhookEvents: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("webhook_headers")
            @ExcludeMissing
            webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of(),
            @JsonProperty("webhook_output_format")
            @ExcludeMissing
            webhookOutputFormat: JsonField<WebhookOutputFormat> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(webhookEvents, webhookHeaders, webhookOutputFormat, webhookUrl, mutableMapOf())

        /**
         * Events that trigger this webhook. Options: 'parse.success' (job completed), 'parse.error'
         * (job failed), 'parse.partial_success' (some pages failed), 'parse.pending',
         * 'parse.running', 'parse.cancelled'. If not specified, webhook fires for all events
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookEvents(): Optional<List<String>> = webhookEvents.getOptional("webhook_events")

        /**
         * Custom HTTP headers to include in webhook requests. Use for authentication tokens or
         * custom routing. Example: {'Authorization': 'Bearer xyz'}
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookHeaders(): Optional<WebhookHeaders> =
            webhookHeaders.getOptional("webhook_headers")

        /**
         * Format of the webhook payload body. 'string' (default) sends the payload as a
         * JSON-encoded string; 'json' sends it as a JSON object.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookOutputFormat(): Optional<WebhookOutputFormat> =
            webhookOutputFormat.getOptional("webhook_output_format")

        /**
         * HTTPS URL to receive webhook POST requests. Must be publicly accessible
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [webhookEvents].
         *
         * Unlike [webhookEvents], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_events")
        @ExcludeMissing
        fun _webhookEvents(): JsonField<List<String>> = webhookEvents

        /**
         * Returns the raw JSON value of [webhookHeaders].
         *
         * Unlike [webhookHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_headers")
        @ExcludeMissing
        fun _webhookHeaders(): JsonField<WebhookHeaders> = webhookHeaders

        /**
         * Returns the raw JSON value of [webhookOutputFormat].
         *
         * Unlike [webhookOutputFormat], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_output_format")
        @ExcludeMissing
        fun _webhookOutputFormat(): JsonField<WebhookOutputFormat> = webhookOutputFormat

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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

            /** Returns a mutable builder for constructing an instance of [WebhookConfiguration]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookConfiguration]. */
        class Builder internal constructor() {

            private var webhookEvents: JsonField<MutableList<String>>? = null
            private var webhookHeaders: JsonField<WebhookHeaders> = JsonMissing.of()
            private var webhookOutputFormat: JsonField<WebhookOutputFormat> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookConfiguration: WebhookConfiguration) = apply {
                webhookEvents = webhookConfiguration.webhookEvents.map { it.toMutableList() }
                webhookHeaders = webhookConfiguration.webhookHeaders
                webhookOutputFormat = webhookConfiguration.webhookOutputFormat
                webhookUrl = webhookConfiguration.webhookUrl
                additionalProperties = webhookConfiguration.additionalProperties.toMutableMap()
            }

            /**
             * Events that trigger this webhook. Options: 'parse.success' (job completed),
             * 'parse.error' (job failed), 'parse.partial_success' (some pages failed),
             * 'parse.pending', 'parse.running', 'parse.cancelled'. If not specified, webhook fires
             * for all events
             */
            fun webhookEvents(webhookEvents: List<String>?) =
                webhookEvents(JsonField.ofNullable(webhookEvents))

            /** Alias for calling [Builder.webhookEvents] with `webhookEvents.orElse(null)`. */
            fun webhookEvents(webhookEvents: Optional<List<String>>) =
                webhookEvents(webhookEvents.getOrNull())

            /**
             * Sets [Builder.webhookEvents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookEvents] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun webhookEvents(webhookEvents: JsonField<List<String>>) = apply {
                this.webhookEvents = webhookEvents.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [webhookEvents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWebhookEvent(webhookEvent: String) = apply {
                webhookEvents =
                    (webhookEvents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("webhookEvents", it).add(webhookEvent)
                    }
            }

            /**
             * Custom HTTP headers to include in webhook requests. Use for authentication tokens or
             * custom routing. Example: {'Authorization': 'Bearer xyz'}
             */
            fun webhookHeaders(webhookHeaders: WebhookHeaders?) =
                webhookHeaders(JsonField.ofNullable(webhookHeaders))

            /** Alias for calling [Builder.webhookHeaders] with `webhookHeaders.orElse(null)`. */
            fun webhookHeaders(webhookHeaders: Optional<WebhookHeaders>) =
                webhookHeaders(webhookHeaders.getOrNull())

            /**
             * Sets [Builder.webhookHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookHeaders] with a well-typed [WebhookHeaders]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun webhookHeaders(webhookHeaders: JsonField<WebhookHeaders>) = apply {
                this.webhookHeaders = webhookHeaders
            }

            /**
             * Format of the webhook payload body. 'string' (default) sends the payload as a
             * JSON-encoded string; 'json' sends it as a JSON object.
             */
            fun webhookOutputFormat(webhookOutputFormat: WebhookOutputFormat?) =
                webhookOutputFormat(JsonField.ofNullable(webhookOutputFormat))

            /**
             * Alias for calling [Builder.webhookOutputFormat] with
             * `webhookOutputFormat.orElse(null)`.
             */
            fun webhookOutputFormat(webhookOutputFormat: Optional<WebhookOutputFormat>) =
                webhookOutputFormat(webhookOutputFormat.getOrNull())

            /**
             * Sets [Builder.webhookOutputFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookOutputFormat] with a well-typed
             * [WebhookOutputFormat] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun webhookOutputFormat(webhookOutputFormat: JsonField<WebhookOutputFormat>) = apply {
                this.webhookOutputFormat = webhookOutputFormat
            }

            /** HTTPS URL to receive webhook POST requests. Must be publicly accessible */
            fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

            /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
            fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
             * Returns an immutable instance of [WebhookConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookConfiguration =
                WebhookConfiguration(
                    (webhookEvents ?: JsonMissing.of()).map { it.toImmutable() },
                    webhookHeaders,
                    webhookOutputFormat,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): WebhookConfiguration = apply {
            if (validated) {
                return@apply
            }

            webhookEvents()
            webhookHeaders().ifPresent { it.validate() }
            webhookOutputFormat().ifPresent { it.validate() }
            webhookUrl()
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
            (webhookEvents.asKnown().getOrNull()?.size ?: 0) +
                (webhookHeaders.asKnown().getOrNull()?.validity() ?: 0) +
                (webhookOutputFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        /**
         * Custom HTTP headers to include in webhook requests. Use for authentication tokens or
         * custom routing. Example: {'Authorization': 'Bearer xyz'}
         */
        class WebhookHeaders
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

                /** Returns a mutable builder for constructing an instance of [WebhookHeaders]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WebhookHeaders]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(webhookHeaders: WebhookHeaders) = apply {
                    additionalProperties = webhookHeaders.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [WebhookHeaders].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): WebhookHeaders = WebhookHeaders(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): WebhookHeaders = apply {
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

                return other is WebhookHeaders && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "WebhookHeaders{additionalProperties=$additionalProperties}"
        }

        /**
         * Format of the webhook payload body. 'string' (default) sends the payload as a
         * JSON-encoded string; 'json' sends it as a JSON object.
         */
        class WebhookOutputFormat
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val JSON = of("json")

                @JvmField val STRING = of("string")

                @JvmStatic fun of(value: String) = WebhookOutputFormat(JsonField.of(value))
            }

            /** An enum containing [WebhookOutputFormat]'s known values. */
            enum class Known {
                JSON,
                STRING,
            }

            /**
             * An enum containing [WebhookOutputFormat]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [WebhookOutputFormat] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                JSON,
                STRING,
                /**
                 * An enum member indicating that [WebhookOutputFormat] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    JSON -> Value.JSON
                    STRING -> Value.STRING
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    JSON -> Known.JSON
                    STRING -> Known.STRING
                    else ->
                        throw LlamaCloudInvalidDataException("Unknown WebhookOutputFormat: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaCloudInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): WebhookOutputFormat = apply {
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

                return other is WebhookOutputFormat && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WebhookConfiguration &&
                webhookEvents == other.webhookEvents &&
                webhookHeaders == other.webhookHeaders &&
                webhookOutputFormat == other.webhookOutputFormat &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                webhookEvents,
                webhookHeaders,
                webhookOutputFormat,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WebhookConfiguration{webhookEvents=$webhookEvents, webhookHeaders=$webhookHeaders, webhookOutputFormat=$webhookOutputFormat, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobCreateParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "JobCreateParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
