// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.services.async.classifier.JobServiceAsync
import com.llamacloud_prod.api.services.async.classifier.JobServiceAsyncImpl
import java.util.function.Consumer

class ClassifierServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ClassifierServiceAsync {

    private val withRawResponse: ClassifierServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ClassifierServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClassifierServiceAsync =
        ClassifierServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun jobs(): JobServiceAsync = jobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClassifierServiceAsync.WithRawResponse {

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClassifierServiceAsync.WithRawResponse =
            ClassifierServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs
    }
}
