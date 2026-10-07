// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentGetParams
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentListPage
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentListParams
import ai.llamaindex.llamacloud.models.files.PresignedUrl
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AttachmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttachmentService

    /** List the attachments associated with a file (e.g. per-page screenshots). */
    fun list(params: AttachmentListParams): AttachmentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AttachmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentListPage

    /** Return a presigned download URL for a specific attachment. */
    fun get(attachmentName: String, params: AttachmentGetParams): PresignedUrl =
        get(attachmentName, params, RequestOptions.none())

    /** @see get */
    fun get(
        attachmentName: String,
        params: AttachmentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PresignedUrl = get(params.toBuilder().attachmentName(attachmentName).build(), requestOptions)

    /** @see get */
    fun get(params: AttachmentGetParams): PresignedUrl = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AttachmentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PresignedUrl

    /** A view of [AttachmentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttachmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/attachments`, but is otherwise the same
         * as [AttachmentService.list].
         */
        @MustBeClosed
        fun list(params: AttachmentListParams): HttpResponseFor<AttachmentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AttachmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentListPage>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/attachments/{attachment_name}`, but is
         * otherwise the same as [AttachmentService.get].
         */
        @MustBeClosed
        fun get(
            attachmentName: String,
            params: AttachmentGetParams,
        ): HttpResponseFor<PresignedUrl> = get(attachmentName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            attachmentName: String,
            params: AttachmentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PresignedUrl> =
            get(params.toBuilder().attachmentName(attachmentName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: AttachmentGetParams): HttpResponseFor<PresignedUrl> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AttachmentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PresignedUrl>
    }
}
