// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.checkRequired
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
import com.llamacloud_prod.api.core.prepare
import com.llamacloud_prod.api.models.beta.sheets.SheetCreateParams
import com.llamacloud_prod.api.models.beta.sheets.SheetDeleteJobParams
import com.llamacloud_prod.api.models.beta.sheets.SheetDeleteJobResponse
import com.llamacloud_prod.api.models.beta.sheets.SheetGetParams
import com.llamacloud_prod.api.models.beta.sheets.SheetGetResultTableParams
import com.llamacloud_prod.api.models.beta.sheets.SheetListPage
import com.llamacloud_prod.api.models.beta.sheets.SheetListPageResponse
import com.llamacloud_prod.api.models.beta.sheets.SheetListParams
import com.llamacloud_prod.api.models.beta.sheets.SheetsJob
import com.llamacloud_prod.api.models.files.PresignedUrl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SheetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SheetService {

    private val withRawResponse: SheetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SheetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SheetService =
        SheetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun create(params: SheetCreateParams, requestOptions: RequestOptions): SheetsJob =
        // post /api/v1/beta/sheets/jobs
        withRawResponse().create(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun list(params: SheetListParams, requestOptions: RequestOptions): SheetListPage =
        // get /api/v1/beta/sheets/jobs
        withRawResponse().list(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun deleteJob(
        params: SheetDeleteJobParams,
        requestOptions: RequestOptions,
    ): SheetDeleteJobResponse =
        // delete /api/v1/beta/sheets/jobs/{spreadsheet_job_id}
        withRawResponse().deleteJob(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun get(params: SheetGetParams, requestOptions: RequestOptions): SheetsJob =
        // get /api/v1/beta/sheets/jobs/{spreadsheet_job_id}
        withRawResponse().get(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun getResultTable(
        params: SheetGetResultTableParams,
        requestOptions: RequestOptions,
    ): PresignedUrl =
        // get
        // /api/v1/beta/sheets/jobs/{spreadsheet_job_id}/regions/{region_id}/result/{region_type}
        withRawResponse().getResultTable(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SheetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SheetService.WithRawResponse =
            SheetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SheetsJob> =
            jsonHandler<SheetsJob>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun create(
            params: SheetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SheetsJob> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "sheets", "jobs")
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

        private val listHandler: Handler<SheetListPageResponse> =
            jsonHandler<SheetListPageResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun list(
            params: SheetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SheetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "sheets", "jobs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SheetListPage.builder()
                            .service(SheetServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteJobHandler: Handler<SheetDeleteJobResponse> =
            jsonHandler<SheetDeleteJobResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun deleteJob(
            params: SheetDeleteJobParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SheetDeleteJobResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("spreadsheetJobId", params.spreadsheetJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "sheets", "jobs", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteJobHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<SheetsJob> =
            jsonHandler<SheetsJob>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun get(
            params: SheetGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SheetsJob> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("spreadsheetJobId", params.spreadsheetJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "sheets", "jobs", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getResultTableHandler: Handler<PresignedUrl> =
            jsonHandler<PresignedUrl>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getResultTable(
            params: SheetGetResultTableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PresignedUrl> {
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
                        "beta",
                        "sheets",
                        "jobs",
                        params._pathParam(0),
                        "regions",
                        params._pathParam(1),
                        "result",
                        params._pathParam(2),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
