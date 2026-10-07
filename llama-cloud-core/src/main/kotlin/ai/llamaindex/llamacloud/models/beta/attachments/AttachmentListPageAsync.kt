// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.attachments

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.beta.AttachmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AttachmentServiceAsync.list */
class AttachmentListPageAsync
private constructor(
    private val service: AttachmentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AttachmentListParams,
    private val response: AttachmentListPageResponse,
) : PageAsync<AttachmentListResponse> {

    /**
     * Delegates to [AttachmentListPageResponse], but gracefully handles missing data.
     *
     * @see AttachmentListPageResponse.items
     */
    override fun items(): List<AttachmentListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [AttachmentListPageResponse], but gracefully handles missing data.
     *
     * @see AttachmentListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): AttachmentListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AttachmentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AttachmentListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AttachmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): AttachmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AttachmentListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttachmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: AttachmentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AttachmentListParams? = null
        private var response: AttachmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(attachmentListPageAsync: AttachmentListPageAsync) = apply {
            service = attachmentListPageAsync.service
            streamHandlerExecutor = attachmentListPageAsync.streamHandlerExecutor
            params = attachmentListPageAsync.params
            response = attachmentListPageAsync.response
        }

        fun service(service: AttachmentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AttachmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AttachmentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AttachmentListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttachmentListPageAsync =
            AttachmentListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttachmentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AttachmentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
