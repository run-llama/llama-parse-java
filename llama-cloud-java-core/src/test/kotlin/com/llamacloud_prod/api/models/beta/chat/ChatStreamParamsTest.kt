// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.chat

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatStreamParamsTest {

    @Test
    fun create() {
        ChatStreamParams.builder()
            .sessionId("session_id")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addIndexId("idx-abc123")
            .addIndexId("idx-def456")
            .prompt("What were the main findings in Q3?")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChatStreamParams.builder()
                .sessionId("session_id")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .prompt("What were the main findings in Q3?")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("session_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ChatStreamParams.builder()
                .sessionId("session_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .prompt("What were the main findings in Q3?")
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
            ChatStreamParams.builder()
                .sessionId("session_id")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .prompt("What were the main findings in Q3?")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ChatStreamParams.builder()
                .sessionId("session_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .prompt("What were the main findings in Q3?")
                .build()

        val body = params._body()

        assertThat(body.indexIds()).containsExactly("idx-abc123", "idx-def456")
        assertThat(body.prompt()).isEqualTo("What were the main findings in Q3?")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChatStreamParams.builder()
                .sessionId("session_id")
                .addIndexId("idx-abc123")
                .addIndexId("idx-def456")
                .prompt("What were the main findings in Q3?")
                .build()

        val body = params._body()

        assertThat(body.indexIds()).containsExactly("idx-abc123", "idx-def456")
        assertThat(body.prompt()).isEqualTo("What were the main findings in Q3?")
    }
}
