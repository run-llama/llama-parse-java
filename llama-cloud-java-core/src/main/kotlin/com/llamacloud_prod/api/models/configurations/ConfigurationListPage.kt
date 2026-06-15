// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

import com.llamacloud_prod.api.core.AutoPager
import com.llamacloud_prod.api.core.Page
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.blocking.ConfigurationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ConfigurationService.list */
class ConfigurationListPage
private constructor(
    private val service: ConfigurationService,
    private val params: ConfigurationListParams,
    private val response: ConfigurationListPageResponse,
) : Page<ConfigurationResponse> {

    /**
     * Delegates to [ConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see ConfigurationListPageResponse.items
     */
    override fun items(): List<ConfigurationResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see ConfigurationListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): ConfigurationListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): ConfigurationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ConfigurationResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): ConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConfigurationListPage].
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

    /** A builder for [ConfigurationListPage]. */
    class Builder internal constructor() {

        private var service: ConfigurationService? = null
        private var params: ConfigurationListParams? = null
        private var response: ConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(configurationListPage: ConfigurationListPage) = apply {
            service = configurationListPage.service
            params = configurationListPage.params
            response = configurationListPage.response
        }

        fun service(service: ConfigurationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConfigurationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ConfigurationListPage].
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
        fun build(): ConfigurationListPage =
            ConfigurationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigurationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ConfigurationListPage{service=$service, params=$params, response=$response}"
}
