// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.attachments

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentListResponseTest {

    @Test
    fun create() {
        val attachmentListResponse =
            AttachmentListResponse.builder()
                .name("name")
                .size(0L)
                .lastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(attachmentListResponse.name()).isEqualTo("name")
        assertThat(attachmentListResponse.size()).isEqualTo(0L)
        assertThat(attachmentListResponse.lastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachmentListResponse =
            AttachmentListResponse.builder()
                .name("name")
                .size(0L)
                .lastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAttachmentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachmentListResponse),
                jacksonTypeRef<AttachmentListResponse>(),
            )

        assertThat(roundtrippedAttachmentListResponse).isEqualTo(attachmentListResponse)
    }
}
