// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface WebhookConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookConfigService

    /** Create a reusable webhook configuration for the current project. */
    fun create(params: WebhookConfigCreateParams): WebhookConfigResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookConfigResponse

    /** @see create */
    fun create(
        webhookConfigCreate: WebhookConfigCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookConfigResponse =
        create(
            WebhookConfigCreateParams.builder().webhookConfigCreate(webhookConfigCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(webhookConfigCreate: WebhookConfigCreate): WebhookConfigResponse =
        create(webhookConfigCreate, RequestOptions.none())

    /** Get a single webhook configuration by ID. */
    fun retrieve(configId: String): WebhookConfigResponse =
        retrieve(configId, WebhookConfigRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        configId: String,
        params: WebhookConfigRetrieveParams = WebhookConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookConfigResponse =
        retrieve(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        configId: String,
        params: WebhookConfigRetrieveParams = WebhookConfigRetrieveParams.none(),
    ): WebhookConfigResponse = retrieve(configId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookConfigResponse

    /** @see retrieve */
    fun retrieve(params: WebhookConfigRetrieveParams): WebhookConfigResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(configId: String, requestOptions: RequestOptions): WebhookConfigResponse =
        retrieve(configId, WebhookConfigRetrieveParams.none(), requestOptions)

    /** Update a webhook configuration. Only fields present in the request change. */
    fun update(configId: String): WebhookConfigResponse =
        update(configId, WebhookConfigUpdateParams.none())

    /** @see update */
    fun update(
        configId: String,
        params: WebhookConfigUpdateParams = WebhookConfigUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookConfigResponse = update(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see update */
    fun update(
        configId: String,
        params: WebhookConfigUpdateParams = WebhookConfigUpdateParams.none(),
    ): WebhookConfigResponse = update(configId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookConfigResponse

    /** @see update */
    fun update(params: WebhookConfigUpdateParams): WebhookConfigResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(configId: String, requestOptions: RequestOptions): WebhookConfigResponse =
        update(configId, WebhookConfigUpdateParams.none(), requestOptions)

    /** List the webhook configurations for the current project, newest first. */
    fun list(): List<WebhookConfigResponse> = list(WebhookConfigListParams.none())

    /** @see list */
    fun list(
        params: WebhookConfigListParams = WebhookConfigListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<WebhookConfigResponse>

    /** @see list */
    fun list(
        params: WebhookConfigListParams = WebhookConfigListParams.none()
    ): List<WebhookConfigResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<WebhookConfigResponse> =
        list(WebhookConfigListParams.none(), requestOptions)

    /** Delete a webhook configuration. */
    fun delete(configId: String) = delete(configId, WebhookConfigDeleteParams.none())

    /** @see delete */
    fun delete(
        configId: String,
        params: WebhookConfigDeleteParams = WebhookConfigDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see delete */
    fun delete(
        configId: String,
        params: WebhookConfigDeleteParams = WebhookConfigDeleteParams.none(),
    ) = delete(configId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: WebhookConfigDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(configId: String, requestOptions: RequestOptions) =
        delete(configId, WebhookConfigDeleteParams.none(), requestOptions)

    /**
     * A view of [WebhookConfigService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/webhook-configs`, but is otherwise the
         * same as [WebhookConfigService.create].
         */
        @MustBeClosed
        fun create(params: WebhookConfigCreateParams): HttpResponseFor<WebhookConfigResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WebhookConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookConfigResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            webhookConfigCreate: WebhookConfigCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookConfigResponse> =
            create(
                WebhookConfigCreateParams.builder()
                    .webhookConfigCreate(webhookConfigCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            webhookConfigCreate: WebhookConfigCreate
        ): HttpResponseFor<WebhookConfigResponse> =
            create(webhookConfigCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/webhook-configs/{config_id}`, but is
         * otherwise the same as [WebhookConfigService.retrieve].
         */
        @MustBeClosed
        fun retrieve(configId: String): HttpResponseFor<WebhookConfigResponse> =
            retrieve(configId, WebhookConfigRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            configId: String,
            params: WebhookConfigRetrieveParams = WebhookConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookConfigResponse> =
            retrieve(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            configId: String,
            params: WebhookConfigRetrieveParams = WebhookConfigRetrieveParams.none(),
        ): HttpResponseFor<WebhookConfigResponse> =
            retrieve(configId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WebhookConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookConfigResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: WebhookConfigRetrieveParams): HttpResponseFor<WebhookConfigResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            configId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookConfigResponse> =
            retrieve(configId, WebhookConfigRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/beta/webhook-configs/{config_id}`, but is
         * otherwise the same as [WebhookConfigService.update].
         */
        @MustBeClosed
        fun update(configId: String): HttpResponseFor<WebhookConfigResponse> =
            update(configId, WebhookConfigUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            configId: String,
            params: WebhookConfigUpdateParams = WebhookConfigUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookConfigResponse> =
            update(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            configId: String,
            params: WebhookConfigUpdateParams = WebhookConfigUpdateParams.none(),
        ): HttpResponseFor<WebhookConfigResponse> = update(configId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WebhookConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookConfigResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: WebhookConfigUpdateParams): HttpResponseFor<WebhookConfigResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            configId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookConfigResponse> =
            update(configId, WebhookConfigUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/webhook-configs`, but is otherwise the
         * same as [WebhookConfigService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<WebhookConfigResponse>> =
            list(WebhookConfigListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookConfigListParams = WebhookConfigListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<WebhookConfigResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookConfigListParams = WebhookConfigListParams.none()
        ): HttpResponseFor<List<WebhookConfigResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<WebhookConfigResponse>> =
            list(WebhookConfigListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/webhook-configs/{config_id}`, but is
         * otherwise the same as [WebhookConfigService.delete].
         */
        @MustBeClosed
        fun delete(configId: String): HttpResponse =
            delete(configId, WebhookConfigDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            configId: String,
            params: WebhookConfigDeleteParams = WebhookConfigDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            configId: String,
            params: WebhookConfigDeleteParams = WebhookConfigDeleteParams.none(),
        ): HttpResponse = delete(configId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WebhookConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: WebhookConfigDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(configId: String, requestOptions: RequestOptions): HttpResponse =
            delete(configId, WebhookConfigDeleteParams.none(), requestOptions)
    }
}
