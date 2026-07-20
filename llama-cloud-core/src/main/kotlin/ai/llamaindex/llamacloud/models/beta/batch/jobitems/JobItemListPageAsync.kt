// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.batch.jobitems

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.beta.batch.JobItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see JobItemServiceAsync.list */
class JobItemListPageAsync
private constructor(
    private val service: JobItemServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: JobItemListParams,
    private val response: JobItemListPageResponse,
) : PageAsync<JobItemListResponse> {

    /**
     * Delegates to [JobItemListPageResponse], but gracefully handles missing data.
     *
     * @see JobItemListPageResponse.items
     */
    override fun items(): List<JobItemListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [JobItemListPageResponse], but gracefully handles missing data.
     *
     * @see JobItemListPageResponse.totalSize
     */
    fun totalSize(): Optional<Long> = response._totalSize().getOptional("total_size")

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = params.offset().getOrDefault(0)
        val totalCount = totalSize().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): JobItemListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<JobItemListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<JobItemListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): JobItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): JobItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobItemListPageAsync].
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

    /** A builder for [JobItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: JobItemServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: JobItemListParams? = null
        private var response: JobItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(jobItemListPageAsync: JobItemListPageAsync) = apply {
            service = jobItemListPageAsync.service
            streamHandlerExecutor = jobItemListPageAsync.streamHandlerExecutor
            params = jobItemListPageAsync.params
            response = jobItemListPageAsync.response
        }

        fun service(service: JobItemServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: JobItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: JobItemListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [JobItemListPageAsync].
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
        fun build(): JobItemListPageAsync =
            JobItemListPageAsync(
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

        return other is JobItemListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "JobItemListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
