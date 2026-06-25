// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

import com.llamacloud_prod.api.core.AutoPagerAsync
import com.llamacloud_prod.api.core.PageAsync
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.async.ConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ConfigurationServiceAsync.list */
class ConfigurationListPageAsync
private constructor(
    private val service: ConfigurationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ConfigurationListParams,
    private val response: ConfigurationListPageResponse,
) : PageAsync<ConfigurationResponse> {

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

    override fun nextPage(): CompletableFuture<ConfigurationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ConfigurationResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): ConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConfigurationListPageAsync].
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

    /** A builder for [ConfigurationListPageAsync]. */
    class Builder internal constructor() {

        private var service: ConfigurationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ConfigurationListParams? = null
        private var response: ConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(configurationListPageAsync: ConfigurationListPageAsync) = apply {
            service = configurationListPageAsync.service
            streamHandlerExecutor = configurationListPageAsync.streamHandlerExecutor
            params = configurationListPageAsync.params
            response = configurationListPageAsync.response
        }

        fun service(service: ConfigurationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConfigurationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ConfigurationListPageAsync].
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
        fun build(): ConfigurationListPageAsync =
            ConfigurationListPageAsync(
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

        return other is ConfigurationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ConfigurationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
