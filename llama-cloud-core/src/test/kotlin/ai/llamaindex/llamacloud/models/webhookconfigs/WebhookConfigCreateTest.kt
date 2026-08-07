// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.webhookconfigs

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookConfigCreateTest {

    @Test
    fun create() {
        val webhookConfigCreate =
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

        assertThat(webhookConfigCreate.webhookUrl())
            .isEqualTo("https://example.com/webhooks/llamacloud")
        assertThat(webhookConfigCreate.webhookEvents().getOrNull())
            .containsExactly(
                WebhookConfigCreate.WebhookEvent.PARSE_SUCCESS,
                WebhookConfigCreate.WebhookEvent.PARSE_ERROR,
            )
        assertThat(webhookConfigCreate.webhookHeaders())
            .contains(
                WebhookConfigCreate.WebhookHeaders.builder()
                    .putAdditionalProperty("Authorization", JsonValue.from("Bearer sk-..."))
                    .build()
            )
        assertThat(webhookConfigCreate.webhookOutputFormat())
            .contains(WebhookConfigCreate.WebhookOutputFormat.JSON)
        assertThat(webhookConfigCreate.webhookSigningSecret()).contains("whsec_...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookConfigCreate =
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

        val roundtrippedWebhookConfigCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookConfigCreate),
                jacksonTypeRef<WebhookConfigCreate>(),
            )

        assertThat(roundtrippedWebhookConfigCreate).isEqualTo(webhookConfigCreate)
    }
}
