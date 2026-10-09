// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.services.blocking.alpha.VerifyService
import ai.llamaindex.llamacloud.services.blocking.alpha.VerifyServiceImpl
import java.util.function.Consumer

class AlphaServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AlphaService {

    private val withRawResponse: AlphaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val verify: VerifyService by lazy { VerifyServiceImpl(clientOptions) }

    override fun withRawResponse(): AlphaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlphaService =
        AlphaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun verify(): VerifyService = verify

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlphaService.WithRawResponse {

        private val verify: VerifyService.WithRawResponse by lazy {
            VerifyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlphaService.WithRawResponse =
            AlphaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun verify(): VerifyService.WithRawResponse = verify
    }
}
