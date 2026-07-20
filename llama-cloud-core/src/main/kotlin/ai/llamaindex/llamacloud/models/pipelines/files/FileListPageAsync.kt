// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.files

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.pipelines.FileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FileServiceAsync.list */
@Deprecated("deprecated")
class FileListPageAsync
private constructor(
    private val service: FileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FileListParams,
    private val response: FileListPageResponse,
) : PageAsync<PipelineFile> {

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see FileListPageResponse.files
     */
    fun files(): List<PipelineFile> =
        response._files().getOptional("files").getOrNull() ?: emptyList()

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see FileListPageResponse.totalCount
     */
    fun totalCount(): Optional<Long> = response._totalCount().getOptional("total_count")

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see FileListPageResponse.offset
     */
    fun offset(): Optional<Long> = response._offset().getOptional("offset")

    override fun items(): List<PipelineFile> = files()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = offset().getOrDefault(0)
        val totalCount = totalCount().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): FileListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<FileListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PipelineFile> = AutoPagerAsync.from(this, streamHandlerExecutor)

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
