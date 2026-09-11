// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.datasinks

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.DataSinkServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DataSinkServiceAsync.listPaginated */
class DataSinkListPaginatedPageAsync
private constructor(
    private val service: DataSinkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DataSinkListPaginatedParams,
    private val response: DataSinkListPaginatedPageResponse,
) : PageAsync<DataSink> {

    /**
     * Delegates to [DataSinkListPaginatedPageResponse], but gracefully handles missing data.
     *
     * @see DataSinkListPaginatedPageResponse.items
     */
    override fun items(): List<DataSink> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataSinkListPaginatedPageResponse], but gracefully handles missing data.
     *
     * @see DataSinkListPaginatedPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): DataSinkListPaginatedParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DataSinkListPaginatedPageAsync> =
        service.listPaginated(nextPageParams())

    fun autoPager(): AutoPagerAsync<DataSink> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DataSinkListPaginatedParams = params

    /** The response that this page was parsed from. */
    fun response(): DataSinkListPaginatedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataSinkListPaginatedPageAsync].
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

    /** A builder for [DataSinkListPaginatedPageAsync]. */
    class Builder internal constructor() {

        private var service: DataSinkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DataSinkListPaginatedParams? = null
        private var response: DataSinkListPaginatedPageResponse? = null

        @JvmSynthetic
        internal fun from(dataSinkListPaginatedPageAsync: DataSinkListPaginatedPageAsync) = apply {
            service = dataSinkListPaginatedPageAsync.service
            streamHandlerExecutor = dataSinkListPaginatedPageAsync.streamHandlerExecutor
            params = dataSinkListPaginatedPageAsync.params
            response = dataSinkListPaginatedPageAsync.response
        }

        fun service(service: DataSinkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DataSinkListPaginatedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataSinkListPaginatedPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DataSinkListPaginatedPageAsync].
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
        fun build(): DataSinkListPaginatedPageAsync =
            DataSinkListPaginatedPageAsync(
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

        return other is DataSinkListPaginatedPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DataSinkListPaginatedPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
