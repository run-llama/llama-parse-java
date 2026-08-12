// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.webhookconfigs

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookConfigCreateParamsTest {

    @Test
    fun create() {
        WebhookConfigCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .webhookConfigCreate(
                WebhookConfigCreate.builder()
                    .webhookUrl("https://example.com/webhooks/llamacloud")
                    .addWebhookEvent(WebhookConfigCreate.WebhookEvent.PARSE_SUCCESS)
                    .addWebhookEvent(WebhookConfigCreate.WebhookEvent.PARSE_ERROR)
                    .webhookHeaders(
                        WebhookConfigCreate.WebhookHeaders.builder()
                            .putAdditionalProperty("Authorization", JsonValue.from("Bearer sk-..."))
                            .build()
                    )
                    .webhookOutputFormat(WebhookConfigCreate.WebhookOutputFormat.JSON)
                    .webhookSigningSecret("whsec_...")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WebhookConfigCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .webhookConfigCreate(
                    WebhookConfigCreate.builder()
                        .webhookUrl("https://example.com/webhooks/llamacloud")
                        .addWebhookEvent(WebhookConfigCreate.WebhookEvent.PARSE_SUCCESS)
                        .addWebhookEvent(WebhookConfigCreate.WebhookEvent.PARSE_ERROR)
                        .webhookHeaders(
                            WebhookConfigCreate.WebhookHeaders.builder()
                                .putAdditionalProperty(
                                    "Authorization",
                                    JsonValue.from("Bearer sk-..."),
                                )
                                .build()
                        )
                        .webhookOutputFormat(WebhookConfigCreate.WebhookOutputFormat.JSON)
                        .webhookSigningSecret("whsec_...")
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
            WebhookConfigCreateParams.builder()
                .webhookConfigCreate(
                    WebhookConfigCreate.builder()
                        .webhookUrl("https://example.com/webhooks/llamacloud")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            WebhookConfigCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .webhookConfigCreate(
                    WebhookConfigCreate.builder()
                        .webhookUrl("https://example.com/webhooks/llamacloud")
                        .addWebhookEvent(WebhookConfigCreate.WebhookEvent.PARSE_SUCCESS)
                        .addWebhookEvent(WebhookConfigCreate.WebhookEvent.PARSE_ERROR)
                        .webhookHeaders(
                            WebhookConfigCreate.WebhookHeaders.builder()
                                .putAdditionalProperty(
                                    "Authorization",
                                    JsonValue.from("Bearer sk-..."),
                                )
                                .build()
                        )
                        .webhookOutputFormat(WebhookConfigCreate.WebhookOutputFormat.JSON)
                        .webhookSigningSecret("whsec_...")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WebhookConfigCreate.builder()
                    .webhookUrl("https://example.com/webhooks/llamacloud")
                    .addWebhookEvent(WebhookConfigCreate.WebhookEvent.PARSE_SUCCESS)
                    .addWebhookEvent(WebhookConfigCreate.WebhookEvent.PARSE_ERROR)
                    .webhookHeaders(
                        WebhookConfigCreate.WebhookHeaders.builder()
                            .putAdditionalProperty("Authorization", JsonValue.from("Bearer sk-..."))
                            .build()
                    )
                    .webhookOutputFormat(WebhookConfigCreate.WebhookOutputFormat.JSON)
                    .webhookSigningSecret("whsec_...")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookConfigCreateParams.builder()
                .webhookConfigCreate(
                    WebhookConfigCreate.builder()
                        .webhookUrl("https://example.com/webhooks/llamacloud")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WebhookConfigCreate.builder()
                    .webhookUrl("https://example.com/webhooks/llamacloud")
                    .build()
            )
    }
}
