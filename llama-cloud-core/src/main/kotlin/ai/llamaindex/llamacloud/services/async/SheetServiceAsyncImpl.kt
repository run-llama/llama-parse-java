// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

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
import ai.llamaindex.llamacloud.models.beta.sheets.SheetsJob
import ai.llamaindex.llamacloud.models.files.PresignedUrl
import ai.llamaindex.llamacloud.models.sheets.SheetCreateParams
import ai.llamaindex.llamacloud.models.sheets.SheetDeleteJobParams
import ai.llamaindex.llamacloud.models.sheets.SheetDeleteJobResponse
import ai.llamaindex.llamacloud.models.sheets.SheetGetParams
import ai.llamaindex.llamacloud.models.sheets.SheetGetResultTableParams
import ai.llamaindex.llamacloud.models.sheets.SheetListPageAsync
import ai.llamaindex.llamacloud.models.sheets.SheetListPageResponse
import ai.llamaindex.llamacloud.models.sheets.SheetListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SheetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SheetServiceAsync {

    private val withRawResponse: SheetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SheetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SheetServiceAsync =
        SheetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SheetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SheetsJob> =
        // post /api/v1/sheets/jobs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SheetListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SheetListPageAsync> =
        // get /api/v1/sheets/jobs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deleteJob(
        params: SheetDeleteJobParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SheetDeleteJobResponse> =
        // delete /api/v1/sheets/jobs/{spreadsheet_job_id}
        withRawResponse().deleteJob(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SheetGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SheetsJob> =
        // get /api/v1/sheets/jobs/{spreadsheet_job_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getResultTable(
        params: SheetGetResultTableParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PresignedUrl> =
        // get /api/v1/sheets/jobs/{spreadsheet_job_id}/regions/{region_id}/result/{region_type}
        withRawResponse().getResultTable(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SheetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SheetServiceAsync.WithRawResponse =
            SheetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SheetsJob> =
            jsonHandler<SheetsJob>(clientOptions.jsonMapper)

        override fun create(
            params: SheetCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SheetsJob>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sheets", "jobs")
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

        private val listHandler: Handler<SheetListPageResponse> =
            jsonHandler<SheetListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SheetListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SheetListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sheets", "jobs")
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
                                SheetListPageAsync.builder()
                                    .service(SheetServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteJobHandler: Handler<SheetDeleteJobResponse> =
            jsonHandler<SheetDeleteJobResponse>(clientOptions.jsonMapper)

        override fun deleteJob(
            params: SheetDeleteJobParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SheetDeleteJobResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("spreadsheetJobId", params.spreadsheetJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sheets", "jobs", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteJobHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<SheetsJob> =
            jsonHandler<SheetsJob>(clientOptions.jsonMapper)

        override fun get(
            params: SheetGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SheetsJob>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("spreadsheetJobId", params.spreadsheetJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sheets", "jobs", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getResultTableHandler: Handler<PresignedUrl> =
            jsonHandler<PresignedUrl>(clientOptions.jsonMapper)

        override fun getResultTable(
            params: SheetGetResultTableParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PresignedUrl>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("regionType", params.regionType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "sheets",
                        "jobs",
                        params._pathParam(0),
                        "regions",
                        params._pathParam(1),
                        "result",
                        params._pathParam(2),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getResultTableHandler.handle(it) }
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
