// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.split

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import ai.llamaindex.llamacloud.models.beta.split.SplitCategory
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitCreateParamsTest {

    @Test
    fun create() {
        SplitCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
            .configuration(
                SplitCreateParams.Configuration.builder()
                    .addCategory(SplitCategory.builder().name("x").description("x").build())
                    .splittingStrategy(
                        SplitCreateParams.Configuration.SplittingStrategy.builder()
                            .allowUncategorized(
                                SplitCreateParams.Configuration.SplittingStrategy.AllowUncategorized
                                    .FORBID
                            )
                            .customInstructions("Start a new segment at every signature page.")
                            .minPagesPerSplit(1L)
                            .build()
                    )
                    .build()
            )
            .configurationId("cfg-11111111-2222-3333-4444-555555555555")
            .transactionId("tx-unique-idempotency-key")
            .addWebhookConfigurationId("whc-...")
            .addWebhookConfigurationId("whc-...")
            .addWebhookConfiguration(
                SplitCreateParams.WebhookConfiguration.builder()
                    .addWebhookEvent(
                        SplitCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                    )
                    .addWebhookEvent(
                        SplitCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                    )
                    .webhookHeaders(
                        SplitCreateParams.WebhookConfiguration.WebhookHeaders.builder()
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
            SplitCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .configuration(
                    SplitCreateParams.Configuration.builder()
                        .addCategory(SplitCategory.builder().name("x").description("x").build())
                        .splittingStrategy(
                            SplitCreateParams.Configuration.SplittingStrategy.builder()
                                .allowUncategorized(
                                    SplitCreateParams.Configuration.SplittingStrategy
                                        .AllowUncategorized
                                        .FORBID
                                )
                                .customInstructions("Start a new segment at every signature page.")
                                .minPagesPerSplit(1L)
                                .build()
                        )
                        .build()
                )
                .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                .transactionId("tx-unique-idempotency-key")
                .addWebhookConfigurationId("whc-...")
                .addWebhookConfigurationId("whc-...")
                .addWebhookConfiguration(
                    SplitCreateParams.WebhookConfiguration.builder()
                        .addWebhookEvent(
                            SplitCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                        )
                        .addWebhookEvent(
                            SplitCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                        )
                        .webhookHeaders(
                            SplitCreateParams.WebhookConfiguration.WebhookHeaders.builder()
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
        val params =
            SplitCreateParams.builder()
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            SplitCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .configuration(
                    SplitCreateParams.Configuration.builder()
                        .addCategory(SplitCategory.builder().name("x").description("x").build())
                        .splittingStrategy(
                            SplitCreateParams.Configuration.SplittingStrategy.builder()
                                .allowUncategorized(
                                    SplitCreateParams.Configuration.SplittingStrategy
                                        .AllowUncategorized
                                        .FORBID
                                )
                                .customInstructions("Start a new segment at every signature page.")
                                .minPagesPerSplit(1L)
                                .build()
                        )
                        .build()
                )
                .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                .transactionId("tx-unique-idempotency-key")
                .addWebhookConfigurationId("whc-...")
                .addWebhookConfigurationId("whc-...")
                .addWebhookConfiguration(
                    SplitCreateParams.WebhookConfiguration.builder()
                        .addWebhookEvent(
                            SplitCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                        )
                        .addWebhookEvent(
                            SplitCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                        )
                        .webhookHeaders(
                            SplitCreateParams.WebhookConfiguration.WebhookHeaders.builder()
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

        assertThat(body.fileInput()).isEqualTo("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(body.configuration())
            .contains(
                SplitCreateParams.Configuration.builder()
                    .addCategory(SplitCategory.builder().name("x").description("x").build())
                    .splittingStrategy(
                        SplitCreateParams.Configuration.SplittingStrategy.builder()
                            .allowUncategorized(
                                SplitCreateParams.Configuration.SplittingStrategy.AllowUncategorized
                                    .FORBID
                            )
                            .customInstructions("Start a new segment at every signature page.")
                            .minPagesPerSplit(1L)
                            .build()
                    )
                    .build()
            )
        assertThat(body.configurationId()).contains("cfg-11111111-2222-3333-4444-555555555555")
        assertThat(body.transactionId()).contains("tx-unique-idempotency-key")
        assertThat(body.webhookConfigurationIds().getOrNull()).containsExactly("whc-...", "whc-...")
        assertThat(body.webhookConfigurations().getOrNull())
            .containsExactly(
                SplitCreateParams.WebhookConfiguration.builder()
                    .addWebhookEvent(
                        SplitCreateParams.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                    )
                    .addWebhookEvent(
                        SplitCreateParams.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                    )
                    .webhookHeaders(
                        SplitCreateParams.WebhookConfiguration.WebhookHeaders.builder()
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
        val params =
            SplitCreateParams.builder()
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .build()

        val body = params._body()

        assertThat(body.fileInput()).isEqualTo("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
    }
}
