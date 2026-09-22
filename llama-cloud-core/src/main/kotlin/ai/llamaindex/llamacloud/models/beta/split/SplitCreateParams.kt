// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.split

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.Params
import ai.llamaindex.llamacloud.core.checkKnown
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
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

/** Create a document split job. */
class SplitCreateParams
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
     * Document to be split.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentInput(): SplitDocumentInput = body.documentInput()

    /**
     * Split configuration with categories and splitting strategy.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configuration(): Optional<Configuration> = body.configuration()

    /**
     * Saved split configuration ID.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configurationId(): Optional<String> = body.configurationId()

    /**
     * Returns the raw JSON value of [documentInput].
     *
     * Unlike [documentInput], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _documentInput(): JsonField<SplitDocumentInput> = body._documentInput()

    /**
     * Returns the raw JSON value of [configuration].
     *
     * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _configuration(): JsonField<Configuration> = body._configuration()

    /**
     * Returns the raw JSON value of [configurationId].
     *
     * Unlike [configurationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _configurationId(): JsonField<String> = body._configurationId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SplitCreateParams].
         *
         * The following fields are required:
         * ```java
         * .documentInput()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SplitCreateParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(splitCreateParams: SplitCreateParams) = apply {
            organizationId = splitCreateParams.organizationId
            projectId = splitCreateParams.projectId
            body = splitCreateParams.body.toBuilder()
            additionalHeaders = splitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = splitCreateParams.additionalQueryParams.toBuilder()
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
         * - [documentInput]
         * - [configuration]
         * - [configurationId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Document to be split. */
        fun documentInput(documentInput: SplitDocumentInput) = apply {
            body.documentInput(documentInput)
        }

        /**
         * Sets [Builder.documentInput] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentInput] with a well-typed [SplitDocumentInput]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentInput(documentInput: JsonField<SplitDocumentInput>) = apply {
            body.documentInput(documentInput)
        }

        /** Split configuration with categories and splitting strategy. */
        fun configuration(configuration: Configuration?) = apply {
            body.configuration(configuration)
        }

        /** Alias for calling [Builder.configuration] with `configuration.orElse(null)`. */
        fun configuration(configuration: Optional<Configuration>) =
            configuration(configuration.getOrNull())

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed [Configuration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configuration(configuration: JsonField<Configuration>) = apply {
            body.configuration(configuration)
        }

        /** Saved split configuration ID. */
        fun configurationId(configurationId: String?) = apply {
            body.configurationId(configurationId)
        }

        /** Alias for calling [Builder.configurationId] with `configurationId.orElse(null)`. */
        fun configurationId(configurationId: Optional<String>) =
            configurationId(configurationId.getOrNull())

        /**
         * Sets [Builder.configurationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configurationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configurationId(configurationId: JsonField<String>) = apply {
            body.configurationId(configurationId)
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
         * Returns an immutable instance of [SplitCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .documentInput()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SplitCreateParams =
            SplitCreateParams(
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

    /** Beta create request — accepts legacy document_input and flat formats. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val documentInput: JsonField<SplitDocumentInput>,
        private val configuration: JsonField<Configuration>,
        private val configurationId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_input")
            @ExcludeMissing
            documentInput: JsonField<SplitDocumentInput> = JsonMissing.of(),
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<Configuration> = JsonMissing.of(),
            @JsonProperty("configuration_id")
            @ExcludeMissing
            configurationId: JsonField<String> = JsonMissing.of(),
        ) : this(documentInput, configuration, configurationId, mutableMapOf())

        /**
         * Document to be split.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentInput(): SplitDocumentInput = documentInput.getRequired("document_input")

        /**
         * Split configuration with categories and splitting strategy.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun configuration(): Optional<Configuration> = configuration.getOptional("configuration")

        /**
         * Saved split configuration ID.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun configurationId(): Optional<String> = configurationId.getOptional("configuration_id")

        /**
         * Returns the raw JSON value of [documentInput].
         *
         * Unlike [documentInput], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_input")
        @ExcludeMissing
        fun _documentInput(): JsonField<SplitDocumentInput> = documentInput

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        /**
         * Returns the raw JSON value of [configurationId].
         *
         * Unlike [configurationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration_id")
        @ExcludeMissing
        fun _configurationId(): JsonField<String> = configurationId

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
             * .documentInput()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var documentInput: JsonField<SplitDocumentInput>? = null
            private var configuration: JsonField<Configuration> = JsonMissing.of()
            private var configurationId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                documentInput = body.documentInput
                configuration = body.configuration
                configurationId = body.configurationId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Document to be split. */
            fun documentInput(documentInput: SplitDocumentInput) =
                documentInput(JsonField.of(documentInput))

            /**
             * Sets [Builder.documentInput] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentInput] with a well-typed
             * [SplitDocumentInput] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun documentInput(documentInput: JsonField<SplitDocumentInput>) = apply {
                this.documentInput = documentInput
            }

            /** Split configuration with categories and splitting strategy. */
            fun configuration(configuration: Configuration?) =
                configuration(JsonField.ofNullable(configuration))

            /** Alias for calling [Builder.configuration] with `configuration.orElse(null)`. */
            fun configuration(configuration: Optional<Configuration>) =
                configuration(configuration.getOrNull())

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed [Configuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
            }

            /** Saved split configuration ID. */
            fun configurationId(configurationId: String?) =
                configurationId(JsonField.ofNullable(configurationId))

            /** Alias for calling [Builder.configurationId] with `configurationId.orElse(null)`. */
            fun configurationId(configurationId: Optional<String>) =
                configurationId(configurationId.getOrNull())

            /**
             * Sets [Builder.configurationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configurationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun configurationId(configurationId: JsonField<String>) = apply {
                this.configurationId = configurationId
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
             * .documentInput()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("documentInput", documentInput),
                    configuration,
                    configurationId,
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

            documentInput().validate()
            configuration().ifPresent { it.validate() }
            configurationId()
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
            (documentInput.asKnown().getOrNull()?.validity() ?: 0) +
                (configuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (configurationId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                documentInput == other.documentInput &&
                configuration == other.configuration &&
                configurationId == other.configurationId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(documentInput, configuration, configurationId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{documentInput=$documentInput, configuration=$configuration, configurationId=$configurationId, additionalProperties=$additionalProperties}"
    }

    /** Split configuration with categories and splitting strategy. */
    class Configuration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val categories: JsonField<List<SplitCategory>>,
        private val splittingStrategy: JsonField<SplittingStrategy>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("categories")
            @ExcludeMissing
            categories: JsonField<List<SplitCategory>> = JsonMissing.of(),
            @JsonProperty("splitting_strategy")
            @ExcludeMissing
            splittingStrategy: JsonField<SplittingStrategy> = JsonMissing.of(),
        ) : this(categories, splittingStrategy, mutableMapOf())

        /**
         * Categories to split documents into.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun categories(): List<SplitCategory> = categories.getRequired("categories")

        /**
         * Strategy for splitting documents.
         *
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun splittingStrategy(): Optional<SplittingStrategy> =
            splittingStrategy.getOptional("splitting_strategy")

        /**
         * Returns the raw JSON value of [categories].
         *
         * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("categories")
        @ExcludeMissing
        fun _categories(): JsonField<List<SplitCategory>> = categories

        /**
         * Returns the raw JSON value of [splittingStrategy].
         *
         * Unlike [splittingStrategy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("splitting_strategy")
        @ExcludeMissing
        fun _splittingStrategy(): JsonField<SplittingStrategy> = splittingStrategy

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
             * Returns a mutable builder for constructing an instance of [Configuration].
             *
             * The following fields are required:
             * ```java
             * .categories()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Configuration]. */
        class Builder internal constructor() {

            private var categories: JsonField<MutableList<SplitCategory>>? = null
            private var splittingStrategy: JsonField<SplittingStrategy> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configuration: Configuration) = apply {
                categories = configuration.categories.map { it.toMutableList() }
                splittingStrategy = configuration.splittingStrategy
                additionalProperties = configuration.additionalProperties.toMutableMap()
            }

            /** Categories to split documents into. */
            fun categories(categories: List<SplitCategory>) = categories(JsonField.of(categories))

            /**
             * Sets [Builder.categories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categories] with a well-typed `List<SplitCategory>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun categories(categories: JsonField<List<SplitCategory>>) = apply {
                this.categories = categories.map { it.toMutableList() }
            }

            /**
             * Adds a single [SplitCategory] to [categories].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCategory(category: SplitCategory) = apply {
                categories =
                    (categories ?: JsonField.of(mutableListOf())).also {
                        checkKnown("categories", it).add(category)
                    }
            }

            /** Strategy for splitting documents. */
            fun splittingStrategy(splittingStrategy: SplittingStrategy) =
                splittingStrategy(JsonField.of(splittingStrategy))

            /**
             * Sets [Builder.splittingStrategy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.splittingStrategy] with a well-typed
             * [SplittingStrategy] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun splittingStrategy(splittingStrategy: JsonField<SplittingStrategy>) = apply {
                this.splittingStrategy = splittingStrategy
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
             * Returns an immutable instance of [Configuration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .categories()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Configuration =
                Configuration(
                    checkRequired("categories", categories).map { it.toImmutable() },
                    splittingStrategy,
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
        fun validate(): Configuration = apply {
            if (validated) {
                return@apply
            }

            categories().forEach { it.validate() }
            splittingStrategy().ifPresent { it.validate() }
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
            (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (splittingStrategy.asKnown().getOrNull()?.validity() ?: 0)

        /** Strategy for splitting documents. */
        class SplittingStrategy
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val allowUncategorized: JsonField<AllowUncategorized>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allow_uncategorized")
                @ExcludeMissing
                allowUncategorized: JsonField<AllowUncategorized> = JsonMissing.of()
            ) : this(allowUncategorized, mutableMapOf())

            /**
             * Controls handling of pages that don't match any category. 'include': pages can be
             * grouped as 'uncategorized' and included in results. 'forbid': all pages must be
             * assigned to a defined category. 'omit': pages can be classified as 'uncategorized'
             * but are excluded from results.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allowUncategorized(): Optional<AllowUncategorized> =
                allowUncategorized.getOptional("allow_uncategorized")

            /**
             * Returns the raw JSON value of [allowUncategorized].
             *
             * Unlike [allowUncategorized], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("allow_uncategorized")
            @ExcludeMissing
            fun _allowUncategorized(): JsonField<AllowUncategorized> = allowUncategorized

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
                 * Returns a mutable builder for constructing an instance of [SplittingStrategy].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SplittingStrategy]. */
            class Builder internal constructor() {

                private var allowUncategorized: JsonField<AllowUncategorized> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(splittingStrategy: SplittingStrategy) = apply {
                    allowUncategorized = splittingStrategy.allowUncategorized
                    additionalProperties = splittingStrategy.additionalProperties.toMutableMap()
                }

                /**
                 * Controls handling of pages that don't match any category. 'include': pages can be
                 * grouped as 'uncategorized' and included in results. 'forbid': all pages must be
                 * assigned to a defined category. 'omit': pages can be classified as
                 * 'uncategorized' but are excluded from results.
                 */
                fun allowUncategorized(allowUncategorized: AllowUncategorized) =
                    allowUncategorized(JsonField.of(allowUncategorized))

                /**
                 * Sets [Builder.allowUncategorized] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowUncategorized] with a well-typed
                 * [AllowUncategorized] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun allowUncategorized(allowUncategorized: JsonField<AllowUncategorized>) = apply {
                    this.allowUncategorized = allowUncategorized
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
                 * Returns an immutable instance of [SplittingStrategy].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SplittingStrategy =
                    SplittingStrategy(allowUncategorized, additionalProperties.toMutableMap())
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
            fun validate(): SplittingStrategy = apply {
                if (validated) {
                    return@apply
                }

                allowUncategorized().ifPresent { it.validate() }
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
                (allowUncategorized.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Controls handling of pages that don't match any category. 'include': pages can be
             * grouped as 'uncategorized' and included in results. 'forbid': all pages must be
             * assigned to a defined category. 'omit': pages can be classified as 'uncategorized'
             * but are excluded from results.
             */
            class AllowUncategorized
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FORBID = of("forbid")

                    @JvmField val INCLUDE = of("include")

                    @JvmField val OMIT = of("omit")

                    @JvmStatic fun of(value: String) = AllowUncategorized(JsonField.of(value))
                }

                /** An enum containing [AllowUncategorized]'s known values. */
                enum class Known {
                    FORBID,
                    INCLUDE,
                    OMIT,
                }

                /**
                 * An enum containing [AllowUncategorized]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AllowUncategorized] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FORBID,
                    INCLUDE,
                    OMIT,
                    /**
                     * An enum member indicating that [AllowUncategorized] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FORBID -> Value.FORBID
                        INCLUDE -> Value.INCLUDE
                        OMIT -> Value.OMIT
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
                        FORBID -> Known.FORBID
                        INCLUDE -> Known.INCLUDE
                        OMIT -> Known.OMIT
                        else ->
                            throw LlamaCloudInvalidDataException(
                                "Unknown AllowUncategorized: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AllowUncategorized = apply {
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

                    return other is AllowUncategorized && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SplittingStrategy &&
                    allowUncategorized == other.allowUncategorized &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(allowUncategorized, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SplittingStrategy{allowUncategorized=$allowUncategorized, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Configuration &&
                categories == other.categories &&
                splittingStrategy == other.splittingStrategy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(categories, splittingStrategy, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Configuration{categories=$categories, splittingStrategy=$splittingStrategy, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SplitCreateParams &&
            organizationId == other.organizationId &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(organizationId, projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SplitCreateParams{organizationId=$organizationId, projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
