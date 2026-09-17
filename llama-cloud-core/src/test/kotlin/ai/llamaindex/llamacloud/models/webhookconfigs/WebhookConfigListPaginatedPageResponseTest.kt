// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.webhookconfigs

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookConfigListPaginatedPageResponseTest {

    @Test
    fun create() {
        val webhookConfigListPaginatedPageResponse =
            WebhookConfigListPaginatedPageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(webhookConfigListPaginatedPageResponse.items())
            .containsExactly(
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
            )
        assertThat(webhookConfigListPaginatedPageResponse.nextPageToken())
            .contains("next_page_token")
        assertThat(webhookConfigListPaginatedPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookConfigListPaginatedPageResponse =
            WebhookConfigListPaginatedPageResponse.builder()
                .addItem(
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedWebhookConfigListPaginatedPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookConfigListPaginatedPageResponse),
                jacksonTypeRef<WebhookConfigListPaginatedPageResponse>(),
            )

        assertThat(roundtrippedWebhookConfigListPaginatedPageResponse)
            .isEqualTo(webhookConfigListPaginatedPageResponse)
    }
}
