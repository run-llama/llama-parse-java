// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.alpha.verify

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.alpha.VerifyService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see VerifyService.list */
class VerifyListPage
private constructor(
    private val service: VerifyService,
    private val params: VerifyListParams,
    private val response: VerifyListPageResponse,
) : Page<VerifyListResponse> {

    /**
     * Delegates to [VerifyListPageResponse], but gracefully handles missing data.
     *
     * @see VerifyListPageResponse.items
     */
    override fun items(): List<VerifyListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [VerifyListPageResponse], but gracefully handles missing data.
     *
     * @see VerifyListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): VerifyListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): VerifyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VerifyListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VerifyListParams = params

    /** The response that this page was parsed from. */
    fun response(): VerifyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerifyListPage].
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

    /** A builder for [VerifyListPage]. */
    class Builder internal constructor() {

        private var service: VerifyService? = null
        private var params: VerifyListParams? = null
        private var response: VerifyListPageResponse? = null

        @JvmSynthetic
        internal fun from(verifyListPage: VerifyListPage) = apply {
            service = verifyListPage.service
            params = verifyListPage.params
            response = verifyListPage.response
        }

        fun service(service: VerifyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VerifyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VerifyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VerifyListPage].
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
        fun build(): VerifyListPage =
            VerifyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerifyListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "VerifyListPage{service=$service, params=$params, response=$response}"
}
