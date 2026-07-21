// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.configurations.ConfigurationCreate
import ai.llamaindex.llamacloud.models.configurations.ConfigurationCreateParams
import ai.llamaindex.llamacloud.models.configurations.ConfigurationDeleteParams
import ai.llamaindex.llamacloud.models.configurations.ConfigurationListPage
import ai.llamaindex.llamacloud.models.configurations.ConfigurationListParams
import ai.llamaindex.llamacloud.models.configurations.ConfigurationResponse
import ai.llamaindex.llamacloud.models.configurations.ConfigurationRetrieveParams
import ai.llamaindex.llamacloud.models.configurations.ConfigurationUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigurationService

    /**
     * Upsert a product configuration; updates if one with the same name + product type + project
     * exists, otherwise creates.
     */
    fun create(params: ConfigurationCreateParams): ConfigurationResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationResponse

    /** @see create */
    fun create(
        configurationCreate: ConfigurationCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationResponse =
        create(
            ConfigurationCreateParams.builder().configurationCreate(configurationCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(configurationCreate: ConfigurationCreate): ConfigurationResponse =
        create(configurationCreate, RequestOptions.none())

    /** Get a single product configuration by ID. */
    fun retrieve(configId: String): ConfigurationResponse =
        retrieve(configId, ConfigurationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        configId: String,
        params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationResponse =
        retrieve(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        configId: String,
        params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
    ): ConfigurationResponse = retrieve(configId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationResponse

    /** @see retrieve */
    fun retrieve(params: ConfigurationRetrieveParams): ConfigurationResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(configId: String, requestOptions: RequestOptions): ConfigurationResponse =
        retrieve(configId, ConfigurationRetrieveParams.none(), requestOptions)

    /** Update an existing product configuration. */
    fun update(configId: String): ConfigurationResponse =
        update(configId, ConfigurationUpdateParams.none())

    /** @see update */
    fun update(
        configId: String,
        params: ConfigurationUpdateParams = ConfigurationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationResponse = update(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see update */
    fun update(
        configId: String,
        params: ConfigurationUpdateParams = ConfigurationUpdateParams.none(),
    ): ConfigurationResponse = update(configId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationResponse

    /** @see update */
    fun update(params: ConfigurationUpdateParams): ConfigurationResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(configId: String, requestOptions: RequestOptions): ConfigurationResponse =
        update(configId, ConfigurationUpdateParams.none(), requestOptions)

    /** List product configurations for the current project. */
    fun list(): ConfigurationListPage = list(ConfigurationListParams.none())

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationListPage

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none()
    ): ConfigurationListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ConfigurationListPage =
        list(ConfigurationListParams.none(), requestOptions)

    /** Delete a product configuration. */
    fun delete(configId: String) = delete(configId, ConfigurationDeleteParams.none())

    /** @see delete */
    fun delete(
        configId: String,
        params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see delete */
    fun delete(
        configId: String,
        params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
    ) = delete(configId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: ConfigurationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(configId: String, requestOptions: RequestOptions) =
        delete(configId, ConfigurationDeleteParams.none(), requestOptions)

    /**
     * A view of [ConfigurationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigurationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/configurations`, but is otherwise the
         * same as [ConfigurationService.create].
         */
        @MustBeClosed
        fun create(params: ConfigurationCreateParams): HttpResponseFor<ConfigurationResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            configurationCreate: ConfigurationCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationResponse> =
            create(
                ConfigurationCreateParams.builder()
                    .configurationCreate(configurationCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            configurationCreate: ConfigurationCreate
        ): HttpResponseFor<ConfigurationResponse> =
            create(configurationCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/configurations/{config_id}`, but is
         * otherwise the same as [ConfigurationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(configId: String): HttpResponseFor<ConfigurationResponse> =
            retrieve(configId, ConfigurationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            configId: String,
            params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationResponse> =
            retrieve(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            configId: String,
            params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
        ): HttpResponseFor<ConfigurationResponse> =
            retrieve(configId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ConfigurationRetrieveParams): HttpResponseFor<ConfigurationResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            configId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationResponse> =
            retrieve(configId, ConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/beta/configurations/{config_id}`, but is
         * otherwise the same as [ConfigurationService.update].
         */
        @MustBeClosed
        fun update(configId: String): HttpResponseFor<ConfigurationResponse> =
            update(configId, ConfigurationUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            configId: String,
            params: ConfigurationUpdateParams = ConfigurationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationResponse> =
            update(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            configId: String,
            params: ConfigurationUpdateParams = ConfigurationUpdateParams.none(),
        ): HttpResponseFor<ConfigurationResponse> = update(configId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: ConfigurationUpdateParams): HttpResponseFor<ConfigurationResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            configId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationResponse> =
            update(configId, ConfigurationUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/configurations`, but is otherwise the
         * same as [ConfigurationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ConfigurationListPage> = list(ConfigurationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none()
        ): HttpResponseFor<ConfigurationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ConfigurationListPage> =
            list(ConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/configurations/{config_id}`, but is
         * otherwise the same as [ConfigurationService.delete].
         */
        @MustBeClosed
        fun delete(configId: String): HttpResponse =
            delete(configId, ConfigurationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            configId: String,
            params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            configId: String,
            params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
        ): HttpResponse = delete(configId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ConfigurationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(configId: String, requestOptions: RequestOptions): HttpResponse =
            delete(configId, ConfigurationDeleteParams.none(), requestOptions)
    }
}
