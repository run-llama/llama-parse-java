// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.attachments

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.beta.AttachmentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AttachmentService.list */
class AttachmentListPage
private constructor(
    private val service: AttachmentService,
    private val params: AttachmentListParams,
    private val response: AttachmentListPageResponse,
) : Page<AttachmentListResponse> {

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

    override fun nextPage(): AttachmentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AttachmentListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AttachmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): AttachmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AttachmentListPage].
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

    /** A builder for [AttachmentListPage]. */
    class Builder internal constructor() {

        private var service: AttachmentService? = null
        private var params: AttachmentListParams? = null
        private var response: AttachmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(attachmentListPage: AttachmentListPage) = apply {
            service = attachmentListPage.service
            params = attachmentListPage.params
            response = attachmentListPage.response
        }

        fun service(service: AttachmentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AttachmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AttachmentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AttachmentListPage].
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
        fun build(): AttachmentListPage =
            AttachmentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttachmentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AttachmentListPage{service=$service, params=$params, response=$response}"
}
