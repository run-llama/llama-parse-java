// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.extract.ReviewService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ReviewService.listEvents */
class ReviewListEventsPage
private constructor(
    private val service: ReviewService,
    private val params: ReviewListEventsParams,
    private val response: ReviewListEventsPageResponse,
) : Page<ExtractReviewEvent> {

    /**
     * Delegates to [ReviewListEventsPageResponse], but gracefully handles missing data.
     *
     * @see ReviewListEventsPageResponse.items
     */
    override fun items(): List<ExtractReviewEvent> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReviewListEventsPageResponse], but gracefully handles missing data.
     *
     * @see ReviewListEventsPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): ReviewListEventsParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): ReviewListEventsPage = service.listEvents(nextPageParams())

    fun autoPager(): AutoPager<ExtractReviewEvent> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReviewListEventsParams = params

    /** The response that this page was parsed from. */
    fun response(): ReviewListEventsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReviewListEventsPage].
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

    /** A builder for [ReviewListEventsPage]. */
    class Builder internal constructor() {

        private var service: ReviewService? = null
        private var params: ReviewListEventsParams? = null
        private var response: ReviewListEventsPageResponse? = null

        @JvmSynthetic
        internal fun from(reviewListEventsPage: ReviewListEventsPage) = apply {
            service = reviewListEventsPage.service
            params = reviewListEventsPage.params
            response = reviewListEventsPage.response
        }

        fun service(service: ReviewService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReviewListEventsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReviewListEventsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReviewListEventsPage].
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
        fun build(): ReviewListEventsPage =
            ReviewListEventsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReviewListEventsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ReviewListEventsPage{service=$service, params=$params, response=$response}"
}
