// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.classifier

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.classifier.jobs.ClassifierRule
import com.llamacloud_prod.api.models.classifier.jobs.ClassifyParsingConfiguration
import com.llamacloud_prod.api.models.classifier.jobs.JobCreateParams
import com.llamacloud_prod.api.models.classifier.jobs.JobGetParams
import com.llamacloud_prod.api.models.classifier.jobs.JobGetResultsParams
import com.llamacloud_prod.api.models.parsing.ParsingLanguages
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobServiceAsync = client.classifier().jobs()

        val classifyJobFuture =
            jobServiceAsync.create(
                JobCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addRule(
                        ClassifierRule.builder()
                            .description("contains invoice number, line items, and total amount")
                            .type("invoice")
                            .build()
                    )
                    .mode(JobCreateParams.Mode.FAST)
                    .parsingConfiguration(
                        ClassifyParsingConfiguration.builder()
                            .lang(ParsingLanguages.ABQ)
                            .maxPages(0L)
                            .addTargetPage(0L)
                            .build()
                    )
                    .addWebhookConfiguration(
                        JobCreateParams.WebhookConfiguration.builder()
                            .addWebhookEvent("parse.success")
                            .addWebhookEvent("parse.error")
                            .webhookHeaders(
                                JobCreateParams.WebhookConfiguration.WebhookHeaders.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .webhookOutputFormat(
                                JobCreateParams.WebhookConfiguration.WebhookOutputFormat.JSON
                            )
                            .webhookUrl("https:")
                            .build()
                    )
                    .build()
            )

        val classifyJob = classifyJobFuture.get()
        classifyJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobServiceAsync = client.classifier().jobs()

        val pageFuture = jobServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobServiceAsync = client.classifier().jobs()

        val classifyJobFuture =
            jobServiceAsync.get(
                JobGetParams.builder()
                    .classifyJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val classifyJob = classifyJobFuture.get()
        classifyJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getResults() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobServiceAsync = client.classifier().jobs()

        val responseFuture =
            jobServiceAsync.getResults(
                JobGetResultsParams.builder()
                    .classifyJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
