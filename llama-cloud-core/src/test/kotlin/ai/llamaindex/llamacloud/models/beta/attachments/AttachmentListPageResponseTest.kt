// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.attachments

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentListPageResponseTest {

    @Test
    fun create() {
        val attachmentListPageResponse =
            AttachmentListPageResponse.builder()
                .addItem(
                    AttachmentListResponse.builder()
                        .name("name")
                        .size(0L)
                        .lastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(attachmentListPageResponse.items())
            .containsExactly(
                AttachmentListResponse.builder()
                    .name("name")
                    .size(0L)
                    .lastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(attachmentListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(attachmentListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachmentListPageResponse =
            AttachmentListPageResponse.builder()
                .addItem(
                    AttachmentListResponse.builder()
                        .name("name")
                        .size(0L)
                        .lastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedAttachmentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachmentListPageResponse),
                jacksonTypeRef<AttachmentListPageResponse>(),
            )

        assertThat(roundtrippedAttachmentListPageResponse).isEqualTo(attachmentListPageResponse)
    }
}
