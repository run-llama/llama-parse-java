// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.PipelineService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PipelineService.listPaginated */
class PipelineListPaginatedPage
private constructor(
    private val service: PipelineService,
    private val params: PipelineListPaginatedParams,
    private val response: PipelineListPaginatedPageResponse,
) : Page<PipelineListPaginatedResponse> {

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

    override fun nextPage(): PipelineListPaginatedPage = service.listPaginated(nextPageParams())

    fun autoPager(): AutoPager<PipelineListPaginatedResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PipelineListPaginatedParams = params

    /** The response that this page was parsed from. */
    fun response(): PipelineListPaginatedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PipelineListPaginatedPage].
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

    /** A builder for [PipelineListPaginatedPage]. */
    class Builder internal constructor() {

        private var service: PipelineService? = null
        private var params: PipelineListPaginatedParams? = null
        private var response: PipelineListPaginatedPageResponse? = null

        @JvmSynthetic
        internal fun from(pipelineListPaginatedPage: PipelineListPaginatedPage) = apply {
            service = pipelineListPaginatedPage.service
            params = pipelineListPaginatedPage.params
            response = pipelineListPaginatedPage.response
        }

        fun service(service: PipelineService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PipelineListPaginatedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PipelineListPaginatedPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PipelineListPaginatedPage].
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
        fun build(): PipelineListPaginatedPage =
            PipelineListPaginatedPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PipelineListPaginatedPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PipelineListPaginatedPage{service=$service, params=$params, response=$response}"
}
