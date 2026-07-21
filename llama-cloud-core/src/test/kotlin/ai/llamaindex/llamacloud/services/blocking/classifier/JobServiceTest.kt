// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.classifier

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.classifier.jobs.ClassifierRule
import ai.llamaindex.llamacloud.models.classifier.jobs.ClassifyParsingConfiguration
import ai.llamaindex.llamacloud.models.classifier.jobs.JobCreateParams
import ai.llamaindex.llamacloud.models.classifier.jobs.JobGetParams
import ai.llamaindex.llamacloud.models.classifier.jobs.JobGetResultsParams
import ai.llamaindex.llamacloud.models.parsing.ParsingLanguages
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.classifier().jobs()

        val classifyJob =
            jobService.create(
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
                            .webhookSigningSecret("webhook_signing_secret")
                            .webhookUrl("https:")
                            .build()
                    )
                    .build()
            )

        classifyJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.classifier().jobs()

        val page = jobService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.classifier().jobs()

        val classifyJob =
            jobService.get(
                JobGetParams.builder()
                    .classifyJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        classifyJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getResults() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.classifier().jobs()

        val response =
            jobService.getResults(
                JobGetResultsParams.builder()
                    .classifyJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
