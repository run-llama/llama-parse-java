// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.extract.ReviewServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ReviewServiceAsync.listEvents */
class ReviewListEventsPageAsync
private constructor(
    private val service: ReviewServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ReviewListEventsParams,
    private val response: ReviewListEventsPageResponse,
) : PageAsync<ExtractReviewEvent> {

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

    override fun nextPage(): CompletableFuture<ReviewListEventsPageAsync> =
        service.listEvents(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExtractReviewEvent> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ReviewListEventsParams = params

    /** The response that this page was parsed from. */
    fun response(): ReviewListEventsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReviewListEventsPageAsync].
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

    /** A builder for [ReviewListEventsPageAsync]. */
    class Builder internal constructor() {

        private var service: ReviewServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ReviewListEventsParams? = null
        private var response: ReviewListEventsPageResponse? = null

        @JvmSynthetic
        internal fun from(reviewListEventsPageAsync: ReviewListEventsPageAsync) = apply {
            service = reviewListEventsPageAsync.service
            streamHandlerExecutor = reviewListEventsPageAsync.streamHandlerExecutor
            params = reviewListEventsPageAsync.params
            response = reviewListEventsPageAsync.response
        }

        fun service(service: ReviewServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ReviewListEventsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReviewListEventsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReviewListEventsPageAsync].
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
        fun build(): ReviewListEventsPageAsync =
            ReviewListEventsPageAsync(
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

        return other is ReviewListEventsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ReviewListEventsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
