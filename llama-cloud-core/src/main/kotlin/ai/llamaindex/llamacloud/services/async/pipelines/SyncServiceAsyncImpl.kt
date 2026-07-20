// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.pipelines

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.checkRequired
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
import ai.llamaindex.llamacloud.core.prepareAsync
import ai.llamaindex.llamacloud.models.pipelines.Pipeline
import ai.llamaindex.llamacloud.models.pipelines.sync.SyncCancelParams
import ai.llamaindex.llamacloud.models.pipelines.sync.SyncCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SyncServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SyncServiceAsync {

    private val withRawResponse: SyncServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SyncServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SyncServiceAsync =
        SyncServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun create(
        params: SyncCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // post /api/v1/pipelines/{pipeline_id}/sync
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun cancel(
        params: SyncCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // post /api/v1/pipelines/{pipeline_id}/sync/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SyncServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SyncServiceAsync.WithRawResponse =
            SyncServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun create(
            params: SyncCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0), "sync")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val cancelHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun cancel(
            params: SyncCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "sync",
                        "cancel",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
