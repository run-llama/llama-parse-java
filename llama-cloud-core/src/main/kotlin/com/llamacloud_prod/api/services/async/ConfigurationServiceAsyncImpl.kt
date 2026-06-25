// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.handlers.emptyHandler
import com.llamacloud_prod.api.core.handlers.errorBodyHandler
import com.llamacloud_prod.api.core.handlers.errorHandler
import com.llamacloud_prod.api.core.handlers.jsonHandler
import com.llamacloud_prod.api.core.http.HttpMethod
import com.llamacloud_prod.api.core.http.HttpRequest
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponse.Handler
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.core.http.json
import com.llamacloud_prod.api.core.http.parseable
import com.llamacloud_prod.api.core.prepareAsync
import com.llamacloud_prod.api.models.configurations.ConfigurationCreateParams
import com.llamacloud_prod.api.models.configurations.ConfigurationDeleteParams
import com.llamacloud_prod.api.models.configurations.ConfigurationListPageAsync
import com.llamacloud_prod.api.models.configurations.ConfigurationListPageResponse
import com.llamacloud_prod.api.models.configurations.ConfigurationListParams
import com.llamacloud_prod.api.models.configurations.ConfigurationResponse
import com.llamacloud_prod.api.models.configurations.ConfigurationRetrieveParams
import com.llamacloud_prod.api.models.configurations.ConfigurationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConfigurationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigurationServiceAsync {

    private val withRawResponse: ConfigurationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigurationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigurationServiceAsync =
        ConfigurationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigurationResponse> =
        // post /api/v1/beta/configurations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigurationResponse> =
        // get /api/v1/beta/configurations/{config_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigurationResponse> =
        // put /api/v1/beta/configurations/{config_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ConfigurationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigurationListPageAsync> =
        // get /api/v1/beta/configurations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ConfigurationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v1/beta/configurations/{config_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigurationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigurationServiceAsync.WithRawResponse =
            ConfigurationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ConfigurationResponse> =
            jsonHandler<ConfigurationResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ConfigurationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "configurations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<ConfigurationResponse> =
            jsonHandler<ConfigurationResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configId", params.configId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "configurations", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<ConfigurationResponse> =
            jsonHandler<ConfigurationResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ConfigurationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigurationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configId", params.configId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "configurations", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<ConfigurationListPageResponse> =
            jsonHandler<ConfigurationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConfigurationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigurationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "configurations")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ConfigurationListPageAsync.builder()
                                    .service(ConfigurationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ConfigurationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configId", params.configId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "configurations", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
