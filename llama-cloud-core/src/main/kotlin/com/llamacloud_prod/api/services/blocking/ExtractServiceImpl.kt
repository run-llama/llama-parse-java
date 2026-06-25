// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

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
import com.llamacloud_prod.api.models.configurations.ConfigurationCreate
import com.llamacloud_prod.api.models.extract.ExtractCreateParams
import com.llamacloud_prod.api.models.extract.ExtractDeleteParams
import com.llamacloud_prod.api.models.extract.ExtractDeleteResponse
import com.llamacloud_prod.api.models.extract.ExtractGenerateSchemaParams
import com.llamacloud_prod.api.models.extract.ExtractGetParams
import com.llamacloud_prod.api.models.extract.ExtractListPage
import com.llamacloud_prod.api.models.extract.ExtractListParams
import com.llamacloud_prod.api.models.extract.ExtractV2Job
import com.llamacloud_prod.api.models.extract.ExtractV2JobQueryResponse
import com.llamacloud_prod.api.models.extract.ExtractV2SchemaValidateResponse
import com.llamacloud_prod.api.models.extract.ExtractValidateSchemaParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExtractServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExtractService {

    private val withRawResponse: ExtractService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExtractService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractService =
        ExtractServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ExtractCreateParams, requestOptions: RequestOptions): ExtractV2Job =
        // post /api/v2/extract
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: ExtractListParams, requestOptions: RequestOptions): ExtractListPage =
        // get /api/v2/extract
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ExtractDeleteParams,
        requestOptions: RequestOptions,
    ): ExtractDeleteResponse =
        // delete /api/v2/extract/{job_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun generateSchema(
        params: ExtractGenerateSchemaParams,
        requestOptions: RequestOptions,
    ): ConfigurationCreate =
        // post /api/v2/extract/schema/generate
        withRawResponse().generateSchema(params, requestOptions).parse()

    override fun get(params: ExtractGetParams, requestOptions: RequestOptions): ExtractV2Job =
        // get /api/v2/extract/{job_id}
        withRawResponse().get(params, requestOptions).parse()

    override fun validateSchema(
        params: ExtractValidateSchemaParams,
        requestOptions: RequestOptions,
    ): ExtractV2SchemaValidateResponse =
        // post /api/v2/extract/schema/validation
        withRawResponse().validateSchema(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExtractService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtractService.WithRawResponse =
            ExtractServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExtractV2Job> =
            jsonHandler<ExtractV2Job>(clientOptions.jsonMapper)

        override fun create(
            params: ExtractCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractV2Job> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "extract")
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

        private val listHandler: Handler<ExtractV2JobQueryResponse> =
            jsonHandler<ExtractV2JobQueryResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExtractListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "extract")
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
                        ExtractListPage.builder()
                            .service(ExtractServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<ExtractDeleteResponse> =
            jsonHandler<ExtractDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ExtractDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "extract", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val generateSchemaHandler: Handler<ConfigurationCreate> =
            jsonHandler<ConfigurationCreate>(clientOptions.jsonMapper)

        override fun generateSchema(
            params: ExtractGenerateSchemaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationCreate> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "extract", "schema", "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateSchemaHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<ExtractV2Job> =
            jsonHandler<ExtractV2Job>(clientOptions.jsonMapper)

        override fun get(
            params: ExtractGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractV2Job> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "extract", params._pathParam(0))
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

        private val validateSchemaHandler: Handler<ExtractV2SchemaValidateResponse> =
            jsonHandler<ExtractV2SchemaValidateResponse>(clientOptions.jsonMapper)

        override fun validateSchema(
            params: ExtractValidateSchemaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractV2SchemaValidateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "extract", "schema", "validation")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validateSchemaHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
