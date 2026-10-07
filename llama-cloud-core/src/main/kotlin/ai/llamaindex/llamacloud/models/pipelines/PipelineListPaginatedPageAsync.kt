// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.PipelineServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PipelineServiceAsync.listPaginated */
class PipelineListPaginatedPageAsync
private constructor(
    private val service: PipelineServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PipelineListPaginatedParams,
    private val response: PipelineListPaginatedPageResponse,
) : PageAsync<PipelineListPaginatedResponse> {

    /**
     * Delegates to [PipelineListPaginatedPageResponse], but gracefully handles missing data.
     *
     * @see PipelineListPaginatedPageResponse.items
     */
    override fun items(): List<PipelineListPaginatedResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [PipelineListPaginatedPageResponse], but gracefully handles missing data.
     *
     * @see PipelineListPaginatedPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): PipelineListPaginatedParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PipelineListPaginatedPageAsync> =
        service.listPaginated(nextPageParams())

    fun autoPager(): AutoPagerAsync<PipelineListPaginatedResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PipelineListPaginatedParams = params

    /** The response that this page was parsed from. */
    fun response(): PipelineListPaginatedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PipelineListPaginatedPageAsync].
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

    /** A builder for [PipelineListPaginatedPageAsync]. */
    class Builder internal constructor() {

        private var service: PipelineServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PipelineListPaginatedParams? = null
        private var response: PipelineListPaginatedPageResponse? = null

        @JvmSynthetic
        internal fun from(pipelineListPaginatedPageAsync: PipelineListPaginatedPageAsync) = apply {
            service = pipelineListPaginatedPageAsync.service
            streamHandlerExecutor = pipelineListPaginatedPageAsync.streamHandlerExecutor
            params = pipelineListPaginatedPageAsync.params
            response = pipelineListPaginatedPageAsync.response
        }

        fun service(service: PipelineServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PipelineListPaginatedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PipelineListPaginatedPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PipelineListPaginatedPageAsync].
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
        fun build(): PipelineListPaginatedPageAsync =
            PipelineListPaginatedPageAsync(
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

        return other is PipelineListPaginatedPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PipelineListPaginatedPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
