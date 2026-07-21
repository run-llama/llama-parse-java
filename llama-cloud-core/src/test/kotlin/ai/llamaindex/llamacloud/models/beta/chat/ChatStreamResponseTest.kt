// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.chat

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatStreamResponseTest {

    @Test
    fun create() {
        val chatStreamResponse = ChatStreamResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatStreamResponse = ChatStreamResponse.builder().build()

        val roundtrippedChatStreamResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatStreamResponse),
                jacksonTypeRef<ChatStreamResponse>(),
            )

        assertThat(roundtrippedChatStreamResponse).isEqualTo(chatStreamResponse)
    }
}
