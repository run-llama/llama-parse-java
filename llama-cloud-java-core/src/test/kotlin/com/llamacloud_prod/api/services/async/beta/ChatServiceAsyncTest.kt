// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.models.beta.chat.ChatCreateParams
import com.llamacloud_prod.api.models.beta.chat.ChatDeleteParams
import com.llamacloud_prod.api.models.beta.chat.ChatGetSummaryParams
import com.llamacloud_prod.api.models.beta.chat.ChatRetrieveParams
import com.llamacloud_prod.api.models.beta.chat.ChatStreamParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChatServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.beta().chat()

        val chatFuture =
            chatServiceAsync.create(
                ChatCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addIndexId("idx-abc123")
                    .addIndexId("idx-def456")
                    .build()
            )

        val chat = chatFuture.get()
        chat.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.beta().chat()

        val chatFuture =
            chatServiceAsync.retrieve(
                ChatRetrieveParams.builder()
                    .sessionId("session_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val chat = chatFuture.get()
        chat.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.beta().chat()

        val pageFuture = chatServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.beta().chat()

        val future =
            chatServiceAsync.delete(
                ChatDeleteParams.builder()
                    .sessionId("session_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSummary() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.beta().chat()

        val responseFuture =
            chatServiceAsync.getSummary(
                ChatGetSummaryParams.builder()
                    .sessionId("session_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stream() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.beta().chat()

        val responseFuture =
            chatServiceAsync.stream(
                ChatStreamParams.builder()
                    .sessionId("session_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addIndexId("idx-abc123")
                    .addIndexId("idx-def456")
                    .prompt("What were the main findings in Q3?")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
