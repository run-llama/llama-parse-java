// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.handlers.emptyHandler
import ai.llamaindex.llamacloud.core.handlers.errorBodyHandler
import ai.llamaindex.llamacloud.core.handlers.errorHandler
import ai.llamaindex.llamacloud.core.handlers.jsonHandler
import ai.llamaindex.llamacloud.core.http.HttpMethod
import ai.llamaindex.llamacloud.core.http.HttpRequest
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponse.Handler
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.core.http.json
import ai.llamaindex.llamacloud.core.http.parseable
import ai.llamaindex.llamacloud.core.prepare
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigCreateParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigDeleteParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigListParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigResponse
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigRetrieveParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WebhookConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookConfigService {

    private val withRawResponse: WebhookConfigService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookConfigService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookConfigService =
        WebhookConfigServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WebhookConfigCreateParams,
        requestOptions: RequestOptions,
    ): WebhookConfigResponse =
        // post /api/v1/beta/webhook-configs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: WebhookConfigRetrieveParams,
        requestOptions: RequestOptions,
    ): WebhookConfigResponse =
        // get /api/v1/beta/webhook-configs/{config_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: WebhookConfigUpdateParams,
        requestOptions: RequestOptions,
    ): WebhookConfigResponse =
        // put /api/v1/beta/webhook-configs/{config_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: WebhookConfigListParams,
        requestOptions: RequestOptions,
    ): List<WebhookConfigResponse> =
        // get /api/v1/beta/webhook-configs
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: WebhookConfigDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/beta/webhook-configs/{config_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookConfigService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookConfigService.WithRawResponse =
            WebhookConfigServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WebhookConfigResponse> =
            jsonHandler<WebhookConfigResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WebhookConfigCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookConfigResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "webhook-configs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<WebhookConfigResponse> =
            jsonHandler<WebhookConfigResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WebhookConfigRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookConfigResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configId", params.configId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "webhook-configs", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<WebhookConfigResponse> =
            jsonHandler<WebhookConfigResponse>(clientOptions.jsonMapper)

        override fun update(
            params: WebhookConfigUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookConfigResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configId", params.configId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "webhook-configs", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<WebhookConfigResponse>> =
            jsonHandler<List<WebhookConfigResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: WebhookConfigListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<WebhookConfigResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "webhook-configs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: WebhookConfigDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configId", params.configId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "webhook-configs", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
