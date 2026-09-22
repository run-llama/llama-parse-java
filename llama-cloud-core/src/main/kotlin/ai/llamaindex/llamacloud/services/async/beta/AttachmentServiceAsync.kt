// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentGetParams
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentListPageAsync
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentListParams
import ai.llamaindex.llamacloud.models.files.PresignedUrl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AttachmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttachmentServiceAsync

    /** List the attachments associated with a file (e.g. per-page screenshots). */
    fun list(params: AttachmentListParams): CompletableFuture<AttachmentListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AttachmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttachmentListPageAsync>

    /** Return a presigned download URL for a specific attachment. */
    fun get(attachmentName: String, params: AttachmentGetParams): CompletableFuture<PresignedUrl> =
        get(attachmentName, params, RequestOptions.none())

    /** @see get */
    fun get(
        attachmentName: String,
        params: AttachmentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PresignedUrl> =
        get(params.toBuilder().attachmentName(attachmentName).build(), requestOptions)

    /** @see get */
    fun get(params: AttachmentGetParams): CompletableFuture<PresignedUrl> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AttachmentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PresignedUrl>

    /**
     * A view of [AttachmentServiceAsync] that provides access to raw HTTP responses for each
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
        ): AttachmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/attachments`, but is otherwise the same
         * as [AttachmentServiceAsync.list].
         */
        fun list(
            params: AttachmentListParams
        ): CompletableFuture<HttpResponseFor<AttachmentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AttachmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttachmentListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/attachments/{attachment_name}`, but is
         * otherwise the same as [AttachmentServiceAsync.get].
         */
        fun get(
            attachmentName: String,
            params: AttachmentGetParams,
        ): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            get(attachmentName, params, RequestOptions.none())

        /** @see get */
        fun get(
            attachmentName: String,
            params: AttachmentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            get(params.toBuilder().attachmentName(attachmentName).build(), requestOptions)

        /** @see get */
        fun get(params: AttachmentGetParams): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: AttachmentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PresignedUrl>>
    }
}
