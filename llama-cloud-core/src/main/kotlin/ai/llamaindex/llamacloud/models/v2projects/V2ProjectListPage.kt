// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.v2projects

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.V2ProjectService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see V2ProjectService.list */
class V2ProjectListPage
private constructor(
    private val service: V2ProjectService,
    private val params: V2ProjectListParams,
    private val response: V2ProjectListPageResponse,
) : Page<V2ProjectListResponse> {

    /**
     * Delegates to [V2ProjectListPageResponse], but gracefully handles missing data.
     *
     * @see V2ProjectListPageResponse.items
     */
    override fun items(): List<V2ProjectListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [V2ProjectListPageResponse], but gracefully handles missing data.
     *
     * @see V2ProjectListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): V2ProjectListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): V2ProjectListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<V2ProjectListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): V2ProjectListParams = params

    /** The response that this page was parsed from. */
    fun response(): V2ProjectListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V2ProjectListPage].
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

    /** A builder for [V2ProjectListPage]. */
    class Builder internal constructor() {

        private var service: V2ProjectService? = null
        private var params: V2ProjectListParams? = null
        private var response: V2ProjectListPageResponse? = null

        @JvmSynthetic
        internal fun from(v2ProjectListPage: V2ProjectListPage) = apply {
            service = v2ProjectListPage.service
            params = v2ProjectListPage.params
            response = v2ProjectListPage.response
        }

        fun service(service: V2ProjectService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: V2ProjectListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: V2ProjectListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [V2ProjectListPage].
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
        fun build(): V2ProjectListPage =
            V2ProjectListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2ProjectListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "V2ProjectListPage{service=$service, params=$params, response=$response}"
}
