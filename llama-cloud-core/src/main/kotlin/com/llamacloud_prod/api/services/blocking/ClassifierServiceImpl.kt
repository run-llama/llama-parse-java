// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.services.blocking.classifier.JobService
import com.llamacloud_prod.api.services.blocking.classifier.JobServiceImpl
import java.util.function.Consumer

class ClassifierServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ClassifierService {

    private val withRawResponse: ClassifierService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun withRawResponse(): ClassifierService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClassifierService =
        ClassifierServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun jobs(): JobService = jobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClassifierService.WithRawResponse {

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClassifierService.WithRawResponse =
            ClassifierServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun jobs(): JobService.WithRawResponse = jobs
    }
}
