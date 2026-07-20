// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.classifier.jobs

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.models.parsing.ParsingLanguages
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            JobCreateParams.builder()
                .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addRule(
                    ClassifierRule.builder()
                        .description("contains invoice number, line items, and total amount")
                        .type("invoice")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.fileIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.rules())
            .containsExactly(
                ClassifierRule.builder()
                    .description("contains invoice number, line items, and total amount")
                    .type("invoice")
                    .build()
            )
        assertThat(body.mode()).contains(JobCreateParams.Mode.FAST)
        assertThat(body.parsingConfiguration())
            .contains(
                ClassifyParsingConfiguration.builder()
                    .lang(ParsingLanguages.ABQ)
                    .maxPages(0L)
                    .addTargetPage(0L)
                    .build()
            )
        assertThat(body.webhookConfigurations().getOrNull())
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            JobCreateParams.builder()
                .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addRule(
                    ClassifierRule.builder()
                        .description("contains invoice number, line items, and total amount")
                        .type("invoice")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.fileIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.rules())
            .containsExactly(
                ClassifierRule.builder()
                    .description("contains invoice number, line items, and total amount")
                    .type("invoice")
                    .build()
            )
    }
}
