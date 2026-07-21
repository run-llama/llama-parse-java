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

class CloudPostgresVectorStore
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val database: JsonField<String>,
    private val embedDim: JsonField<Long>,
    private val host: JsonField<String>,
    private val password: JsonField<String>,
    private val port: JsonField<Long>,
    private val schemaName: JsonField<String>,
    private val tableName: JsonField<String>,
    private val user: JsonField<String>,
    private val className: JsonField<String>,
    private val hnswSettings: JsonField<PgVectorHnswSettings>,
    private val hybridSearch: JsonField<Boolean>,
    private val performSetup: JsonField<Boolean>,
    private val supportsNestedMetadataFilters: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("database") @ExcludeMissing database: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embed_dim") @ExcludeMissing embedDim: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("host") @ExcludeMissing host: JsonField<String> = JsonMissing.of(),
        @JsonProperty("password") @ExcludeMissing password: JsonField<String> = JsonMissing.of(),
        @JsonProperty("port") @ExcludeMissing port: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("schema_name")
        @ExcludeMissing
        schemaName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("table_name") @ExcludeMissing tableName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_name") @ExcludeMissing className: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hnsw_settings")
        @ExcludeMissing
        hnswSettings: JsonField<PgVectorHnswSettings> = JsonMissing.of(),
        @JsonProperty("hybrid_search")
        @ExcludeMissing
        hybridSearch: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("perform_setup")
        @ExcludeMissing
        performSetup: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("supports_nested_metadata_filters")
        @ExcludeMissing
        supportsNestedMetadataFilters: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        database,
        embedDim,
        host,
        password,
        port,
        schemaName,
        tableName,
        user,
        className,
        hnswSettings,
        hybridSearch,
        performSetup,
        supportsNestedMetadataFilters,
        mutableMapOf(),
    )

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun database(): String = database.getRequired("database")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embedDim(): Long = embedDim.getRequired("embed_dim")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun host(): String = host.getRequired("host")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun password(): String = password.getRequired("password")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun port(): Long = port.getRequired("port")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun schemaName(): String = schemaName.getRequired("schema_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tableName(): String = tableName.getRequired("table_name")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun user(): String = user.getRequired("user")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun className(): Optional<String> = className.getOptional("class_name")

    /**
     * HNSW settings for PGVector.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hnswSettings(): Optional<PgVectorHnswSettings> = hnswSettings.getOptional("hnsw_settings")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hybridSearch(): Optional<Boolean> = hybridSearch.getOptional("hybrid_search")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun performSetup(): Optional<Boolean> = performSetup.getOptional("perform_setup")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsNestedMetadataFilters(): Optional<Boolean> =
        supportsNestedMetadataFilters.getOptional("supports_nested_metadata_filters")

    /**
     * Returns the raw JSON value of [database].
     *
     * Unlike [database], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("database") @ExcludeMissing fun _database(): JsonField<String> = database

    /**
     * Returns the raw JSON value of [embedDim].
     *
     * Unlike [embedDim], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embed_dim") @ExcludeMissing fun _embedDim(): JsonField<Long> = embedDim

    /**
     * Returns the raw JSON value of [host].
     *
     * Unlike [host], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("host") @ExcludeMissing fun _host(): JsonField<String> = host

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

    /**
     * Returns the raw JSON value of [port].
     *
     * Unlike [port], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("port") @ExcludeMissing fun _port(): JsonField<Long> = port

    /**
     * Returns the raw JSON value of [schemaName].
     *
     * Unlike [schemaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schema_name") @ExcludeMissing fun _schemaName(): JsonField<String> = schemaName

    /**
     * Returns the raw JSON value of [tableName].
     *
     * Unlike [tableName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("table_name") @ExcludeMissing fun _tableName(): JsonField<String> = tableName

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

    /**
     * Returns the raw JSON value of [className].
     *
     * Unlike [className], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_name") @ExcludeMissing fun _className(): JsonField<String> = className

    /**
     * Returns the raw JSON value of [hnswSettings].
     *
     * Unlike [hnswSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hnsw_settings")
    @ExcludeMissing
    fun _hnswSettings(): JsonField<PgVectorHnswSettings> = hnswSettings

    /**
     * Returns the raw JSON value of [hybridSearch].
     *
     * Unlike [hybridSearch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hybrid_search")
    @ExcludeMissing
    fun _hybridSearch(): JsonField<Boolean> = hybridSearch

    /**
     * Returns the raw JSON value of [performSetup].
     *
     * Unlike [performSetup], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("perform_setup")
    @ExcludeMissing
    fun _performSetup(): JsonField<Boolean> = performSetup

    /**
     * Returns the raw JSON value of [supportsNestedMetadataFilters].
     *
     * Unlike [supportsNestedMetadataFilters], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("supports_nested_metadata_filters")
    @ExcludeMissing
    fun _supportsNestedMetadataFilters(): JsonField<Boolean> = supportsNestedMetadataFilters

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
         * Returns a mutable builder for constructing an instance of [CloudPostgresVectorStore].
         *
         * The following fields are required:
         * ```java
         * .database()
         * .embedDim()
         * .host()
         * .password()
         * .port()
         * .schemaName()
         * .tableName()
         * .user()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudPostgresVectorStore]. */
    class Builder internal constructor() {

        private var database: JsonField<String>? = null
        private var embedDim: JsonField<Long>? = null
        private var host: JsonField<String>? = null
        private var password: JsonField<String>? = null
        private var port: JsonField<Long>? = null
        private var schemaName: JsonField<String>? = null
        private var tableName: JsonField<String>? = null
        private var user: JsonField<String>? = null
        private var className: JsonField<String> = JsonMissing.of()
        private var hnswSettings: JsonField<PgVectorHnswSettings> = JsonMissing.of()
        private var hybridSearch: JsonField<Boolean> = JsonMissing.of()
        private var performSetup: JsonField<Boolean> = JsonMissing.of()
        private var supportsNestedMetadataFilters: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudPostgresVectorStore: CloudPostgresVectorStore) = apply {
            database = cloudPostgresVectorStore.database
            embedDim = cloudPostgresVectorStore.embedDim
            host = cloudPostgresVectorStore.host
            password = cloudPostgresVectorStore.password
            port = cloudPostgresVectorStore.port
            schemaName = cloudPostgresVectorStore.schemaName
            tableName = cloudPostgresVectorStore.tableName
            user = cloudPostgresVectorStore.user
            className = cloudPostgresVectorStore.className
            hnswSettings = cloudPostgresVectorStore.hnswSettings
            hybridSearch = cloudPostgresVectorStore.hybridSearch
            performSetup = cloudPostgresVectorStore.performSetup
            supportsNestedMetadataFilters = cloudPostgresVectorStore.supportsNestedMetadataFilters
            additionalProperties = cloudPostgresVectorStore.additionalProperties.toMutableMap()
        }

        fun database(database: String) = database(JsonField.of(database))

        /**
         * Sets [Builder.database] to an arbitrary JSON value.
         *
         * You should usually call [Builder.database] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun database(database: JsonField<String>) = apply { this.database = database }

        fun embedDim(embedDim: Long) = embedDim(JsonField.of(embedDim))

        /**
         * Sets [Builder.embedDim] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embedDim] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun embedDim(embedDim: JsonField<Long>) = apply { this.embedDim = embedDim }

        fun host(host: String) = host(JsonField.of(host))

        /**
         * Sets [Builder.host] to an arbitrary JSON value.
         *
         * You should usually call [Builder.host] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun host(host: JsonField<String>) = apply { this.host = host }

        fun password(password: String) = password(JsonField.of(password))

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { this.password = password }

        fun port(port: Long) = port(JsonField.of(port))

        /**
         * Sets [Builder.port] to an arbitrary JSON value.
         *
         * You should usually call [Builder.port] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun port(port: JsonField<Long>) = apply { this.port = port }

        fun schemaName(schemaName: String) = schemaName(JsonField.of(schemaName))

        /**
         * Sets [Builder.schemaName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schemaName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun schemaName(schemaName: JsonField<String>) = apply { this.schemaName = schemaName }

        fun tableName(tableName: String) = tableName(JsonField.of(tableName))

        /**
         * Sets [Builder.tableName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tableName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tableName(tableName: JsonField<String>) = apply { this.tableName = tableName }

        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

        fun className(className: String) = className(JsonField.of(className))

        /**
         * Sets [Builder.className] to an arbitrary JSON value.
         *
         * You should usually call [Builder.className] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun className(className: JsonField<String>) = apply { this.className = className }

        /** HNSW settings for PGVector. */
        fun hnswSettings(hnswSettings: PgVectorHnswSettings?) =
            hnswSettings(JsonField.ofNullable(hnswSettings))

        /** Alias for calling [Builder.hnswSettings] with `hnswSettings.orElse(null)`. */
        fun hnswSettings(hnswSettings: Optional<PgVectorHnswSettings>) =
            hnswSettings(hnswSettings.getOrNull())

        /**
         * Sets [Builder.hnswSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hnswSettings] with a well-typed [PgVectorHnswSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hnswSettings(hnswSettings: JsonField<PgVectorHnswSettings>) = apply {
            this.hnswSettings = hnswSettings
        }

        fun hybridSearch(hybridSearch: Boolean?) = hybridSearch(JsonField.ofNullable(hybridSearch))

        /**
         * Alias for [Builder.hybridSearch].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hybridSearch(hybridSearch: Boolean) = hybridSearch(hybridSearch as Boolean?)

        /** Alias for calling [Builder.hybridSearch] with `hybridSearch.orElse(null)`. */
        fun hybridSearch(hybridSearch: Optional<Boolean>) = hybridSearch(hybridSearch.getOrNull())

        /**
         * Sets [Builder.hybridSearch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hybridSearch] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hybridSearch(hybridSearch: JsonField<Boolean>) = apply {
            this.hybridSearch = hybridSearch
        }

        fun performSetup(performSetup: Boolean) = performSetup(JsonField.of(performSetup))

        /**
         * Sets [Builder.performSetup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.performSetup] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun performSetup(performSetup: JsonField<Boolean>) = apply {
            this.performSetup = performSetup
        }

        fun supportsNestedMetadataFilters(supportsNestedMetadataFilters: Boolean) =
            supportsNestedMetadataFilters(JsonField.of(supportsNestedMetadataFilters))

        /**
         * Sets [Builder.supportsNestedMetadataFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportsNestedMetadataFilters] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun supportsNestedMetadataFilters(supportsNestedMetadataFilters: JsonField<Boolean>) =
            apply {
                this.supportsNestedMetadataFilters = supportsNestedMetadataFilters
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
         * Returns an immutable instance of [CloudPostgresVectorStore].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .database()
         * .embedDim()
         * .host()
         * .password()
         * .port()
         * .schemaName()
         * .tableName()
         * .user()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CloudPostgresVectorStore =
            CloudPostgresVectorStore(
                checkRequired("database", database),
                checkRequired("embedDim", embedDim),
                checkRequired("host", host),
                checkRequired("password", password),
                checkRequired("port", port),
                checkRequired("schemaName", schemaName),
                checkRequired("tableName", tableName),
                checkRequired("user", user),
                className,
                hnswSettings,
                hybridSearch,
                performSetup,
                supportsNestedMetadataFilters,
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
    fun validate(): CloudPostgresVectorStore = apply {
        if (validated) {
            return@apply
        }

        database()
        embedDim()
        host()
        password()
        port()
        schemaName()
        tableName()
        user()
        className()
        hnswSettings().ifPresent { it.validate() }
        hybridSearch()
        performSetup()
        supportsNestedMetadataFilters()
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
        (if (database.asKnown().isPresent) 1 else 0) +
            (if (embedDim.asKnown().isPresent) 1 else 0) +
            (if (host.asKnown().isPresent) 1 else 0) +
            (if (password.asKnown().isPresent) 1 else 0) +
            (if (port.asKnown().isPresent) 1 else 0) +
            (if (schemaName.asKnown().isPresent) 1 else 0) +
            (if (tableName.asKnown().isPresent) 1 else 0) +
            (if (user.asKnown().isPresent) 1 else 0) +
            (if (className.asKnown().isPresent) 1 else 0) +
            (hnswSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hybridSearch.asKnown().isPresent) 1 else 0) +
            (if (performSetup.asKnown().isPresent) 1 else 0) +
            (if (supportsNestedMetadataFilters.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudPostgresVectorStore &&
            database == other.database &&
            embedDim == other.embedDim &&
            host == other.host &&
            password == other.password &&
            port == other.port &&
            schemaName == other.schemaName &&
            tableName == other.tableName &&
            user == other.user &&
            className == other.className &&
            hnswSettings == other.hnswSettings &&
            hybridSearch == other.hybridSearch &&
            performSetup == other.performSetup &&
            supportsNestedMetadataFilters == other.supportsNestedMetadataFilters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            database,
            embedDim,
            host,
            password,
            port,
            schemaName,
            tableName,
            user,
            className,
            hnswSettings,
            hybridSearch,
            performSetup,
            supportsNestedMetadataFilters,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudPostgresVectorStore{database=$database, embedDim=$embedDim, host=$host, password=$password, port=$port, schemaName=$schemaName, tableName=$tableName, user=$user, className=$className, hnswSettings=$hnswSettings, hybridSearch=$hybridSearch, performSetup=$performSetup, supportsNestedMetadataFilters=$supportsNestedMetadataFilters, additionalProperties=$additionalProperties}"
}
