// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.pipelines

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
import com.llamacloud_prod.api.core.http.parseable
import com.llamacloud_prod.api.core.prepare
import com.llamacloud_prod.api.models.pipelines.images.ImageGetPageFigureParams
import com.llamacloud_prod.api.models.pipelines.images.ImageGetPageFigureResponse
import com.llamacloud_prod.api.models.pipelines.images.ImageGetPageScreenshotParams
import com.llamacloud_prod.api.models.pipelines.images.ImageGetPageScreenshotResponse
import com.llamacloud_prod.api.models.pipelines.images.ImageListPageFiguresParams
import com.llamacloud_prod.api.models.pipelines.images.ImageListPageFiguresResponse
import com.llamacloud_prod.api.models.pipelines.images.ImageListPageScreenshotsParams
import com.llamacloud_prod.api.models.pipelines.images.ImageListPageScreenshotsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ImageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ImageService {

    private val withRawResponse: ImageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ImageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImageService =
        ImageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getPageFigure(
        params: ImageGetPageFigureParams,
        requestOptions: RequestOptions,
    ): ImageGetPageFigureResponse =
        // get /api/v1/files/{id}/page-figures/{page_index}/{figure_name}
        withRawResponse().getPageFigure(params, requestOptions).parse()

    override fun getPageScreenshot(
        params: ImageGetPageScreenshotParams,
        requestOptions: RequestOptions,
    ): ImageGetPageScreenshotResponse =
        // get /api/v1/files/{id}/page_screenshots/{page_index}
        withRawResponse().getPageScreenshot(params, requestOptions).parse()

    override fun listPageFigures(
        params: ImageListPageFiguresParams,
        requestOptions: RequestOptions,
    ): List<ImageListPageFiguresResponse> =
        // get /api/v1/files/{id}/page-figures
        withRawResponse().listPageFigures(params, requestOptions).parse()

    override fun listPageScreenshots(
        params: ImageListPageScreenshotsParams,
        requestOptions: RequestOptions,
    ): List<ImageListPageScreenshotsResponse> =
        // get /api/v1/files/{id}/page_screenshots
        withRawResponse().listPageScreenshots(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ImageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ImageService.WithRawResponse =
            ImageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getPageFigureHandler: Handler<ImageGetPageFigureResponse> =
            jsonHandler<ImageGetPageFigureResponse>(clientOptions.jsonMapper)

        override fun getPageFigure(
            params: ImageGetPageFigureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImageGetPageFigureResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("figureName", params.figureName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "files",
                        params._pathParam(0),
                        "page-figures",
                        params._pathParam(1),
                        params._pathParam(2),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPageFigureHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getPageScreenshotHandler: Handler<ImageGetPageScreenshotResponse> =
            jsonHandler<ImageGetPageScreenshotResponse>(clientOptions.jsonMapper)

        override fun getPageScreenshot(
            params: ImageGetPageScreenshotParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImageGetPageScreenshotResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pageIndex", params.pageIndex().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "files",
                        params._pathParam(0),
                        "page_screenshots",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPageScreenshotHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listPageFiguresHandler: Handler<List<ImageListPageFiguresResponse>> =
            jsonHandler<List<ImageListPageFiguresResponse>>(clientOptions.jsonMapper)

        override fun listPageFigures(
            params: ImageListPageFiguresParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ImageListPageFiguresResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "files", params._pathParam(0), "page-figures")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPageFiguresHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listPageScreenshotsHandler: Handler<List<ImageListPageScreenshotsResponse>> =
            jsonHandler<List<ImageListPageScreenshotsResponse>>(clientOptions.jsonMapper)

        override fun listPageScreenshots(
            params: ImageListPageScreenshotsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ImageListPageScreenshotsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "files", params._pathParam(0), "page_screenshots")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPageScreenshotsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
