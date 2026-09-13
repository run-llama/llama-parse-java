// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.datasinks

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.DataSinkService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DataSinkService.listPaginated */
class DataSinkListPaginatedPage
private constructor(
    private val service: DataSinkService,
    private val params: DataSinkListPaginatedParams,
    private val response: DataSinkListPaginatedPageResponse,
) : Page<DataSink> {

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

    override fun nextPage(): DataSinkListPaginatedPage = service.listPaginated(nextPageParams())

    fun autoPager(): AutoPager<DataSink> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DataSinkListPaginatedParams = params

    /** The response that this page was parsed from. */
    fun response(): DataSinkListPaginatedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataSinkListPaginatedPage].
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

    /** A builder for [DataSinkListPaginatedPage]. */
    class Builder internal constructor() {

        private var service: DataSinkService? = null
        private var params: DataSinkListPaginatedParams? = null
        private var response: DataSinkListPaginatedPageResponse? = null

        @JvmSynthetic
        internal fun from(dataSinkListPaginatedPage: DataSinkListPaginatedPage) = apply {
            service = dataSinkListPaginatedPage.service
            params = dataSinkListPaginatedPage.params
            response = dataSinkListPaginatedPage.response
        }

        fun service(service: DataSinkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DataSinkListPaginatedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataSinkListPaginatedPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DataSinkListPaginatedPage].
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
        fun build(): DataSinkListPaginatedPage =
            DataSinkListPaginatedPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataSinkListPaginatedPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DataSinkListPaginatedPage{service=$service, params=$params, response=$response}"
}
