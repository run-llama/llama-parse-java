// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.files

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.FileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see FileServiceAsync.list */
class FileListPageAsync
private constructor(
    private val service: FileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FileListParams,
    private val response: FileListPageResponse,
) : PageAsync<FileListResponse> {

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see FileListPageResponse.items
     */
    override fun items(): List<FileListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see FileListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): FileListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<FileListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FileListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FileListParams = params

    /** The response that this page was parsed from. */
    fun response(): FileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileListPageAsync].
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

    /** A builder for [FileListPageAsync]. */
    class Builder internal constructor() {

        private var service: FileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FileListParams? = null
        private var response: FileListPageResponse? = null

        @JvmSynthetic
        internal fun from(fileListPageAsync: FileListPageAsync) = apply {
            service = fileListPageAsync.service
            streamHandlerExecutor = fileListPageAsync.streamHandlerExecutor
            params = fileListPageAsync.params
            response = fileListPageAsync.response
        }

        fun service(service: FileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FileListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FileListPageAsync].
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
        fun build(): FileListPageAsync =
            FileListPageAsync(
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

        return other is FileListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FileListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
