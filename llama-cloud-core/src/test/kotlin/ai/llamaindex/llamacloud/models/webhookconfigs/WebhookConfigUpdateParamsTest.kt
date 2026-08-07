// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.webhookconfigs

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookConfigUpdateParamsTest {

    @Test
    fun create() {
        WebhookConfigUpdateParams.builder()
            .configId("config_id")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addWebhookEvent(WebhookConfigUpdateParams.WebhookEvent.BATCH_CANCELLED)
            .webhookHeaders(
                WebhookConfigUpdateParams.WebhookHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .webhookOutputFormat(WebhookConfigUpdateParams.WebhookOutputFormat.JSON)
            .webhookSigningSecret("webhook_signing_secret")
            .webhookUrl("webhook_url")
            .build()
    }

    @Test
    fun pathParams() {
        val params = WebhookConfigUpdateParams.builder().configId("config_id").build()

        assertThat(params._pathParam(0)).isEqualTo("config_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            WebhookConfigUpdateParams.builder()
                .configId("config_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addWebhookEvent(WebhookConfigUpdateParams.WebhookEvent.BATCH_CANCELLED)
                .webhookHeaders(
                    WebhookConfigUpdateParams.WebhookHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .webhookOutputFormat(WebhookConfigUpdateParams.WebhookOutputFormat.JSON)
                .webhookSigningSecret("webhook_signing_secret")
                .webhookUrl("webhook_url")
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
        val params = WebhookConfigUpdateParams.builder().configId("config_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            WebhookConfigUpdateParams.builder()
                .configId("config_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addWebhookEvent(WebhookConfigUpdateParams.WebhookEvent.BATCH_CANCELLED)
                .webhookHeaders(
                    WebhookConfigUpdateParams.WebhookHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .webhookOutputFormat(WebhookConfigUpdateParams.WebhookOutputFormat.JSON)
                .webhookSigningSecret("webhook_signing_secret")
                .webhookUrl("webhook_url")
                .build()

        val body = params._body()

        assertThat(body.webhookEvents().getOrNull())
            .containsExactly(WebhookConfigUpdateParams.WebhookEvent.BATCH_CANCELLED)
        assertThat(body.webhookHeaders())
            .contains(
                WebhookConfigUpdateParams.WebhookHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.webhookOutputFormat())
            .contains(WebhookConfigUpdateParams.WebhookOutputFormat.JSON)
        assertThat(body.webhookSigningSecret()).contains("webhook_signing_secret")
        assertThat(body.webhookUrl()).contains("webhook_url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebhookConfigUpdateParams.builder().configId("config_id").build()

        val body = params._body()
    }
}
