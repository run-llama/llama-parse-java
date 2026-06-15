// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.configurations.ConfigurationCreate
import com.llamacloud_prod.api.models.configurations.ConfigurationCreateParams
import com.llamacloud_prod.api.models.configurations.ConfigurationDeleteParams
import com.llamacloud_prod.api.models.configurations.ConfigurationListPageAsync
import com.llamacloud_prod.api.models.configurations.ConfigurationListParams
import com.llamacloud_prod.api.models.configurations.ConfigurationResponse
import com.llamacloud_prod.api.models.configurations.ConfigurationRetrieveParams
import com.llamacloud_prod.api.models.configurations.ConfigurationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigurationServiceAsync

    /**
     * Upsert a product configuration; updates if one with the same name + product type + project
     * exists, otherwise creates.
     */
    fun create(params: ConfigurationCreateParams): CompletableFuture<ConfigurationResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigurationResponse>

    /** @see create */
    fun create(
        configurationCreate: ConfigurationCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigurationResponse> =
        create(
            ConfigurationCreateParams.builder().configurationCreate(configurationCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(configurationCreate: ConfigurationCreate): CompletableFuture<ConfigurationResponse> =
        create(configurationCreate, RequestOptions.none())

    /** Get a single product configuration by ID. */
    fun retrieve(configId: String): CompletableFuture<ConfigurationResponse> =
        retrieve(configId, ConfigurationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        configId: String,
        params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigurationResponse> =
        retrieve(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        configId: String,
        params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
    ): CompletableFuture<ConfigurationResponse> = retrieve(configId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigurationResponse>

    /** @see retrieve */
    fun retrieve(params: ConfigurationRetrieveParams): CompletableFuture<ConfigurationResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        configId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigurationResponse> =
        retrieve(configId, ConfigurationRetrieveParams.none(), requestOptions)

    /** Update an existing product configuration. */
    fun update(configId: String): CompletableFuture<ConfigurationResponse> =
        update(configId, ConfigurationUpdateParams.none())

    /** @see update */
    fun update(
        configId: String,
        params: ConfigurationUpdateParams = ConfigurationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigurationResponse> =
        update(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see update */
    fun update(
        configId: String,
        params: ConfigurationUpdateParams = ConfigurationUpdateParams.none(),
    ): CompletableFuture<ConfigurationResponse> = update(configId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigurationResponse>

    /** @see update */
    fun update(params: ConfigurationUpdateParams): CompletableFuture<ConfigurationResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        configId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigurationResponse> =
        update(configId, ConfigurationUpdateParams.none(), requestOptions)

    /** List product configurations for the current project. */
    fun list(): CompletableFuture<ConfigurationListPageAsync> = list(ConfigurationListParams.none())

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigurationListPageAsync>

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none()
    ): CompletableFuture<ConfigurationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ConfigurationListPageAsync> =
        list(ConfigurationListParams.none(), requestOptions)

    /** Delete a product configuration. */
    fun delete(configId: String): CompletableFuture<Void?> =
        delete(configId, ConfigurationDeleteParams.none())

    /** @see delete */
    fun delete(
        configId: String,
        params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see delete */
    fun delete(
        configId: String,
        params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(configId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ConfigurationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(configId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(configId, ConfigurationDeleteParams.none(), requestOptions)

    /**
     * A view of [ConfigurationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/configurations`, but is otherwise the
         * same as [ConfigurationServiceAsync.create].
         */
        fun create(
            params: ConfigurationCreateParams
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>>

        /** @see create */
        fun create(
            configurationCreate: ConfigurationCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            create(
                ConfigurationCreateParams.builder()
                    .configurationCreate(configurationCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            configurationCreate: ConfigurationCreate
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            create(configurationCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/configurations/{config_id}`, but is
         * otherwise the same as [ConfigurationServiceAsync.retrieve].
         */
        fun retrieve(configId: String): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            retrieve(configId, ConfigurationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            configId: String,
            params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            retrieve(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            configId: String,
            params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            retrieve(configId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ConfigurationRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            configId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            retrieve(configId, ConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/beta/configurations/{config_id}`, but is
         * otherwise the same as [ConfigurationServiceAsync.update].
         */
        fun update(configId: String): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            update(configId, ConfigurationUpdateParams.none())

        /** @see update */
        fun update(
            configId: String,
            params: ConfigurationUpdateParams = ConfigurationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            update(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see update */
        fun update(
            configId: String,
            params: ConfigurationUpdateParams = ConfigurationUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            update(configId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>>

        /** @see update */
        fun update(
            params: ConfigurationUpdateParams
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            configId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> =
            update(configId, ConfigurationUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/configurations`, but is otherwise the
         * same as [ConfigurationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ConfigurationListPageAsync>> =
            list(ConfigurationListParams.none())

        /** @see list */
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationListPageAsync>>

        /** @see list */
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none()
        ): CompletableFuture<HttpResponseFor<ConfigurationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConfigurationListPageAsync>> =
            list(ConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/configurations/{config_id}`, but is
         * otherwise the same as [ConfigurationServiceAsync.delete].
         */
        fun delete(configId: String): CompletableFuture<HttpResponse> =
            delete(configId, ConfigurationDeleteParams.none())

        /** @see delete */
        fun delete(
            configId: String,
            params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see delete */
        fun delete(
            configId: String,
            params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(configId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ConfigurationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            configId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(configId, ConfigurationDeleteParams.none(), requestOptions)
    }
}
