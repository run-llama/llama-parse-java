// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.models.beta.chat.ChatCreateParams
import com.llamacloud_prod.api.models.beta.chat.ChatDeleteParams
import com.llamacloud_prod.api.models.beta.chat.ChatGetSummaryParams
import com.llamacloud_prod.api.models.beta.chat.ChatRetrieveParams
import com.llamacloud_prod.api.models.beta.chat.ChatStreamParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChatServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.beta().chat()

        val chat =
            chatService.create(
                ChatCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addIndexId("idx-abc123")
                    .addIndexId("idx-def456")
                    .build()
            )

        chat.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.beta().chat()

        val chat =
            chatService.retrieve(
                ChatRetrieveParams.builder()
                    .sessionId("session_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        chat.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.beta().chat()

        val page = chatService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.beta().chat()

        chatService.delete(
            ChatDeleteParams.builder()
                .sessionId("session_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSummary() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.beta().chat()

        val response =
            chatService.getSummary(
                ChatGetSummaryParams.builder()
                    .sessionId("session_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stream() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.beta().chat()

        val response =
            chatService.stream(
                ChatStreamParams.builder()
                    .sessionId("session_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addIndexId("idx-abc123")
                    .addIndexId("idx-def456")
                    .prompt("What were the main findings in Q3?")
                    .build()
            )

        response.validate()
    }
}
