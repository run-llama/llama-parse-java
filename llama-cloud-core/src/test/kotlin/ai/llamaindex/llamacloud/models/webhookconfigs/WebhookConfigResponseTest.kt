// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.webhookconfigs

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookConfigResponseTest {

    @Test
    fun create() {
        val webhookConfigResponse =
            WebhookConfigResponse.builder()
                .id("id")
                .hasSecret(true)
                .tenantId("tenant_id")
                .webhookUrl("webhook_url")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addWebhookEvent(WebhookConfigResponse.WebhookEvent.BATCH_CANCELLED)
                .webhookHeaders(
                    WebhookConfigResponse.WebhookHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .webhookOutputFormat(WebhookConfigResponse.WebhookOutputFormat.JSON)
                .build()

        assertThat(webhookConfigResponse.id()).isEqualTo("id")
        assertThat(webhookConfigResponse.hasSecret()).isEqualTo(true)
        assertThat(webhookConfigResponse.tenantId()).isEqualTo("tenant_id")
        assertThat(webhookConfigResponse.webhookUrl()).isEqualTo("webhook_url")
        assertThat(webhookConfigResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhookConfigResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhookConfigResponse.webhookEvents().getOrNull())
            .containsExactly(WebhookConfigResponse.WebhookEvent.BATCH_CANCELLED)
        assertThat(webhookConfigResponse.webhookHeaders())
            .contains(
                WebhookConfigResponse.WebhookHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(webhookConfigResponse.webhookOutputFormat())
            .contains(WebhookConfigResponse.WebhookOutputFormat.JSON)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookConfigResponse =
            WebhookConfigResponse.builder()
                .id("id")
                .hasSecret(true)
                .tenantId("tenant_id")
                .webhookUrl("webhook_url")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addWebhookEvent(WebhookConfigResponse.WebhookEvent.BATCH_CANCELLED)
                .webhookHeaders(
                    WebhookConfigResponse.WebhookHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .webhookOutputFormat(WebhookConfigResponse.WebhookOutputFormat.JSON)
                .build()

        val roundtrippedWebhookConfigResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookConfigResponse),
                jacksonTypeRef<WebhookConfigResponse>(),
            )

        assertThat(roundtrippedWebhookConfigResponse).isEqualTo(webhookConfigResponse)
    }
}
