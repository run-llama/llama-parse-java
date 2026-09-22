// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigCreate
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigCreateParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigDeleteParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigListParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigResponse
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigRetrieveParams
import ai.llamaindex.llamacloud.models.webhookconfigs.WebhookConfigUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebhookConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookConfigServiceAsync

    /** Create a reusable webhook configuration for the current project. */
    fun create(params: WebhookConfigCreateParams): CompletableFuture<WebhookConfigResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookConfigResponse>

    /** @see create */
    fun create(
        webhookConfigCreate: WebhookConfigCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookConfigResponse> =
        create(
            WebhookConfigCreateParams.builder().webhookConfigCreate(webhookConfigCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(webhookConfigCreate: WebhookConfigCreate): CompletableFuture<WebhookConfigResponse> =
        create(webhookConfigCreate, RequestOptions.none())

    /** Get a single webhook configuration by ID. */
    fun retrieve(configId: String): CompletableFuture<WebhookConfigResponse> =
        retrieve(configId, WebhookConfigRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        configId: String,
        params: WebhookConfigRetrieveParams = WebhookConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookConfigResponse> =
        retrieve(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        configId: String,
        params: WebhookConfigRetrieveParams = WebhookConfigRetrieveParams.none(),
    ): CompletableFuture<WebhookConfigResponse> = retrieve(configId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookConfigResponse>

    /** @see retrieve */
    fun retrieve(params: WebhookConfigRetrieveParams): CompletableFuture<WebhookConfigResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        configId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookConfigResponse> =
        retrieve(configId, WebhookConfigRetrieveParams.none(), requestOptions)

    /** Update a webhook configuration. Only fields present in the request change. */
    fun update(configId: String): CompletableFuture<WebhookConfigResponse> =
        update(configId, WebhookConfigUpdateParams.none())

    /** @see update */
    fun update(
        configId: String,
        params: WebhookConfigUpdateParams = WebhookConfigUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookConfigResponse> =
        update(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see update */
    fun update(
        configId: String,
        params: WebhookConfigUpdateParams = WebhookConfigUpdateParams.none(),
    ): CompletableFuture<WebhookConfigResponse> = update(configId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookConfigResponse>

    /** @see update */
    fun update(params: WebhookConfigUpdateParams): CompletableFuture<WebhookConfigResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        configId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookConfigResponse> =
        update(configId, WebhookConfigUpdateParams.none(), requestOptions)

    /** List the webhook configurations for the current project, newest first. */
    fun list(): CompletableFuture<List<WebhookConfigResponse>> =
        list(WebhookConfigListParams.none())

    /** @see list */
    fun list(
        params: WebhookConfigListParams = WebhookConfigListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<WebhookConfigResponse>>

    /** @see list */
    fun list(
        params: WebhookConfigListParams = WebhookConfigListParams.none()
    ): CompletableFuture<List<WebhookConfigResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<WebhookConfigResponse>> =
        list(WebhookConfigListParams.none(), requestOptions)

    /** Delete a webhook configuration. */
    fun delete(configId: String): CompletableFuture<Void?> =
        delete(configId, WebhookConfigDeleteParams.none())

    /** @see delete */
    fun delete(
        configId: String,
        params: WebhookConfigDeleteParams = WebhookConfigDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see delete */
    fun delete(
        configId: String,
        params: WebhookConfigDeleteParams = WebhookConfigDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(configId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: WebhookConfigDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(configId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(configId, WebhookConfigDeleteParams.none(), requestOptions)

    /**
     * A view of [WebhookConfigServiceAsync] that provides access to raw HTTP responses for each
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
        ): WebhookConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/webhook-configs`, but is otherwise the
         * same as [WebhookConfigServiceAsync.create].
         */
        fun create(
            params: WebhookConfigCreateParams
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WebhookConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>>

        /** @see create */
        fun create(
            webhookConfigCreate: WebhookConfigCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            create(
                WebhookConfigCreateParams.builder()
                    .webhookConfigCreate(webhookConfigCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            webhookConfigCreate: WebhookConfigCreate
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            create(webhookConfigCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/webhook-configs/{config_id}`, but is
         * otherwise the same as [WebhookConfigServiceAsync.retrieve].
         */
        fun retrieve(configId: String): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            retrieve(configId, WebhookConfigRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            configId: String,
            params: WebhookConfigRetrieveParams = WebhookConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            retrieve(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            configId: String,
            params: WebhookConfigRetrieveParams = WebhookConfigRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            retrieve(configId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WebhookConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>>

        /** @see retrieve */
        fun retrieve(
            params: WebhookConfigRetrieveParams
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            configId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            retrieve(configId, WebhookConfigRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/beta/webhook-configs/{config_id}`, but is
         * otherwise the same as [WebhookConfigServiceAsync.update].
         */
        fun update(configId: String): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            update(configId, WebhookConfigUpdateParams.none())

        /** @see update */
        fun update(
            configId: String,
            params: WebhookConfigUpdateParams = WebhookConfigUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            update(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see update */
        fun update(
            configId: String,
            params: WebhookConfigUpdateParams = WebhookConfigUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            update(configId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WebhookConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>>

        /** @see update */
        fun update(
            params: WebhookConfigUpdateParams
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            configId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookConfigResponse>> =
            update(configId, WebhookConfigUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/webhook-configs`, but is otherwise the
         * same as [WebhookConfigServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<WebhookConfigResponse>>> =
            list(WebhookConfigListParams.none())

        /** @see list */
        fun list(
            params: WebhookConfigListParams = WebhookConfigListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<WebhookConfigResponse>>>

        /** @see list */
        fun list(
            params: WebhookConfigListParams = WebhookConfigListParams.none()
        ): CompletableFuture<HttpResponseFor<List<WebhookConfigResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<WebhookConfigResponse>>> =
            list(WebhookConfigListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/webhook-configs/{config_id}`, but is
         * otherwise the same as [WebhookConfigServiceAsync.delete].
         */
        fun delete(configId: String): CompletableFuture<HttpResponse> =
            delete(configId, WebhookConfigDeleteParams.none())

        /** @see delete */
        fun delete(
            configId: String,
            params: WebhookConfigDeleteParams = WebhookConfigDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see delete */
        fun delete(
            configId: String,
            params: WebhookConfigDeleteParams = WebhookConfigDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(configId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WebhookConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: WebhookConfigDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            configId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(configId, WebhookConfigDeleteParams.none(), requestOptions)
    }
}
