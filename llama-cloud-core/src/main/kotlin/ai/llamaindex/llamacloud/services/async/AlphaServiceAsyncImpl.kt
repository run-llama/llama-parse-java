// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.services.async.alpha.VerifyServiceAsync
import ai.llamaindex.llamacloud.services.async.alpha.VerifyServiceAsyncImpl
import java.util.function.Consumer

class AlphaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AlphaServiceAsync {

    private val withRawResponse: AlphaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val verify: VerifyServiceAsync by lazy { VerifyServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AlphaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlphaServiceAsync =
        AlphaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun verify(): VerifyServiceAsync = verify

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlphaServiceAsync.WithRawResponse {

        private val verify: VerifyServiceAsync.WithRawResponse by lazy {
            VerifyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlphaServiceAsync.WithRawResponse =
            AlphaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun verify(): VerifyServiceAsync.WithRawResponse = verify
    }
}
