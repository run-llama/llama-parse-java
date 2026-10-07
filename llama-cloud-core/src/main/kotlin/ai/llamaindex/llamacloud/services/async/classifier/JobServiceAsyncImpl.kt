// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.classifier

import ai.llamaindex.llamacloud.core.ClientOptions
import java.util.function.Consumer

class JobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobServiceAsync {

    private val withRawResponse: JobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync =
        JobServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobServiceAsync.WithRawResponse =
            JobServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
