// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.jobdatapoints

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.JobDataPointServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see JobDataPointServiceAsync.list */
class JobDataPointListPageAsync
private constructor(
    private val service: JobDataPointServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: JobDataPointListParams,
    private val response: JobDataPointListPageResponse,
) : PageAsync<JobDataPoint> {

    /**
     * Delegates to [JobDataPointListPageResponse], but gracefully handles missing data.
     *
     * @see JobDataPointListPageResponse.items
     */
    override fun items(): List<JobDataPoint> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [JobDataPointListPageResponse], but gracefully handles missing data.
     *
     * @see JobDataPointListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): JobDataPointListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<JobDataPointListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<JobDataPoint> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): JobDataPointListParams = params

    /** The response that this page was parsed from. */
    fun response(): JobDataPointListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobDataPointListPageAsync].
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

    /** A builder for [JobDataPointListPageAsync]. */
    class Builder internal constructor() {

        private var service: JobDataPointServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: JobDataPointListParams? = null
        private var response: JobDataPointListPageResponse? = null

        @JvmSynthetic
        internal fun from(jobDataPointListPageAsync: JobDataPointListPageAsync) = apply {
            service = jobDataPointListPageAsync.service
            streamHandlerExecutor = jobDataPointListPageAsync.streamHandlerExecutor
            params = jobDataPointListPageAsync.params
            response = jobDataPointListPageAsync.response
        }

        fun service(service: JobDataPointServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: JobDataPointListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: JobDataPointListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [JobDataPointListPageAsync].
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
        fun build(): JobDataPointListPageAsync =
            JobDataPointListPageAsync(
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

        return other is JobDataPointListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "JobDataPointListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
