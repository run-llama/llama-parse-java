// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.alpha.verify

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyCreateParamsTest {

    @Test
    fun create() {
        VerifyCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .configuration(
                VerifyCreateParams.Configuration.builder()
                    .targetPages("1,3,5-7")
                    .tier(VerifyCreateParams.Configuration.Tier.AGENTIC)
                    .build()
            )
            .fileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
            .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
            .transactionId("tx-unique-idempotency-key")
            .addWebhookConfigurationId("whc-...")
            .addWebhookConfigurationId("whc-...")
            .addWebhookConfiguration(
                VerifyCreateParams.WebhookConfiguration.builder()
                    .addWebhookEvent(
                        VerifyCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                    )
                    .addWebhookEvent(
                        VerifyCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                    )
                    .webhookHeaders(
                        VerifyCreateParams.WebhookConfiguration.WebhookHeaders.builder()
                            .putAdditionalProperty("Authorization", JsonValue.from("Bearer sk-..."))
                            .build()
                    )
                    .webhookOutputFormat("json")
                    .webhookSigningSecret("whsec_...")
                    .webhookUrl("https://example.com/webhooks/llamacloud")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VerifyCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .configuration(
                    VerifyCreateParams.Configuration.builder()
                        .targetPages("1,3,5-7")
                        .tier(VerifyCreateParams.Configuration.Tier.AGENTIC)
                        .build()
                )
                .fileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .transactionId("tx-unique-idempotency-key")
                .addWebhookConfigurationId("whc-...")
                .addWebhookConfigurationId("whc-...")
                .addWebhookConfiguration(
                    VerifyCreateParams.WebhookConfiguration.builder()
                        .addWebhookEvent(
                            VerifyCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                        )
                        .addWebhookEvent(
                            VerifyCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                        )
                        .webhookHeaders(
                            VerifyCreateParams.WebhookConfiguration.WebhookHeaders.builder()
                                .putAdditionalProperty(
                                    "Authorization",
                                    JsonValue.from("Bearer sk-..."),
                                )
                                .build()
                        )
                        .webhookOutputFormat("json")
                        .webhookSigningSecret("whsec_...")
                        .webhookUrl("https://example.com/webhooks/llamacloud")
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
        val params = VerifyCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            VerifyCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .configuration(
                    VerifyCreateParams.Configuration.builder()
                        .targetPages("1,3,5-7")
                        .tier(VerifyCreateParams.Configuration.Tier.AGENTIC)
                        .build()
                )
                .fileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .transactionId("tx-unique-idempotency-key")
                .addWebhookConfigurationId("whc-...")
                .addWebhookConfigurationId("whc-...")
                .addWebhookConfiguration(
                    VerifyCreateParams.WebhookConfiguration.builder()
                        .addWebhookEvent(
                            VerifyCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                        )
                        .addWebhookEvent(
                            VerifyCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                        )
                        .webhookHeaders(
                            VerifyCreateParams.WebhookConfiguration.WebhookHeaders.builder()
                                .putAdditionalProperty(
                                    "Authorization",
                                    JsonValue.from("Bearer sk-..."),
                                )
                                .build()
                        )
                        .webhookOutputFormat("json")
                        .webhookSigningSecret("whsec_...")
                        .webhookUrl("https://example.com/webhooks/llamacloud")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.configuration())
            .contains(
                VerifyCreateParams.Configuration.builder()
                    .targetPages("1,3,5-7")
                    .tier(VerifyCreateParams.Configuration.Tier.AGENTIC)
                    .build()
            )
        assertThat(body.fileId()).contains("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(body.fileInput()).contains("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(body.transactionId()).contains("tx-unique-idempotency-key")
        assertThat(body.webhookConfigurationIds().getOrNull()).containsExactly("whc-...", "whc-...")
        assertThat(body.webhookConfigurations().getOrNull())
            .containsExactly(
                VerifyCreateParams.WebhookConfiguration.builder()
                    .addWebhookEvent(
                        VerifyCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                    )
                    .addWebhookEvent(
                        VerifyCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                    )
                    .webhookHeaders(
                        VerifyCreateParams.WebhookConfiguration.WebhookHeaders.builder()
                            .putAdditionalProperty("Authorization", JsonValue.from("Bearer sk-..."))
                            .build()
                    )
                    .webhookOutputFormat("json")
                    .webhookSigningSecret("whsec_...")
                    .webhookUrl("https://example.com/webhooks/llamacloud")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = VerifyCreateParams.builder().build()

        val body = params._body()
    }
}
