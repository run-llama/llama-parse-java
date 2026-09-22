// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.webhookconfigs

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.WebhookConfigServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see WebhookConfigServiceAsync.listPaginated */
class WebhookConfigListPaginatedPageAsync
private constructor(
    private val service: WebhookConfigServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WebhookConfigListPaginatedParams,
    private val response: WebhookConfigListPaginatedPageResponse,
) : PageAsync<WebhookConfigResponse> {

    /**
     * Delegates to [WebhookConfigListPaginatedPageResponse], but gracefully handles missing data.
     *
     * @see WebhookConfigListPaginatedPageResponse.items
     */
    override fun items(): List<WebhookConfigResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [WebhookConfigListPaginatedPageResponse], but gracefully handles missing data.
     *
     * @see WebhookConfigListPaginatedPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): WebhookConfigListPaginatedParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<WebhookConfigListPaginatedPageAsync> =
        service.listPaginated(nextPageParams())

    fun autoPager(): AutoPagerAsync<WebhookConfigResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WebhookConfigListPaginatedParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookConfigListPaginatedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [WebhookConfigListPaginatedPageAsync].
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

    /** A builder for [WebhookConfigListPaginatedPageAsync]. */
    class Builder internal constructor() {

        private var service: WebhookConfigServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WebhookConfigListPaginatedParams? = null
        private var response: WebhookConfigListPaginatedPageResponse? = null

        @JvmSynthetic
        internal fun from(
            webhookConfigListPaginatedPageAsync: WebhookConfigListPaginatedPageAsync
        ) = apply {
            service = webhookConfigListPaginatedPageAsync.service
            streamHandlerExecutor = webhookConfigListPaginatedPageAsync.streamHandlerExecutor
            params = webhookConfigListPaginatedPageAsync.params
            response = webhookConfigListPaginatedPageAsync.response
        }

        fun service(service: WebhookConfigServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookConfigListPaginatedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookConfigListPaginatedPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WebhookConfigListPaginatedPageAsync].
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
        fun build(): WebhookConfigListPaginatedPageAsync =
            WebhookConfigListPaginatedPageAsync(
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

        return other is WebhookConfigListPaginatedPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WebhookConfigListPaginatedPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
