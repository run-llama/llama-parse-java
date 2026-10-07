// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.webhookconfigs

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.WebhookConfigService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see WebhookConfigService.listPaginated */
class WebhookConfigListPaginatedPage
private constructor(
    private val service: WebhookConfigService,
    private val params: WebhookConfigListPaginatedParams,
    private val response: WebhookConfigListPaginatedPageResponse,
) : Page<WebhookConfigResponse> {

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

    override fun nextPage(): WebhookConfigListPaginatedPage =
        service.listPaginated(nextPageParams())

    fun autoPager(): AutoPager<WebhookConfigResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WebhookConfigListPaginatedParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookConfigListPaginatedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [WebhookConfigListPaginatedPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookConfigListPaginatedPage]. */
    class Builder internal constructor() {

        private var service: WebhookConfigService? = null
        private var params: WebhookConfigListPaginatedParams? = null
        private var response: WebhookConfigListPaginatedPageResponse? = null

        @JvmSynthetic
        internal fun from(webhookConfigListPaginatedPage: WebhookConfigListPaginatedPage) = apply {
            service = webhookConfigListPaginatedPage.service
            params = webhookConfigListPaginatedPage.params
            response = webhookConfigListPaginatedPage.response
        }

        fun service(service: WebhookConfigService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookConfigListPaginatedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookConfigListPaginatedPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WebhookConfigListPaginatedPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookConfigListPaginatedPage =
            WebhookConfigListPaginatedPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookConfigListPaginatedPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WebhookConfigListPaginatedPage{service=$service, params=$params, response=$response}"
}
