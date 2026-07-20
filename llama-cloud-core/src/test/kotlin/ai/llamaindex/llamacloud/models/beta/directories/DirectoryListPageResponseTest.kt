// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.directories

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryListPageResponseTest {

    @Test
    fun create() {
        val directoryListPageResponse =
            DirectoryListPageResponse.builder()
                .addItem(
                    DirectoryListResponse.builder()
                        .id("id")
                        .name("x")
                        .projectId("project_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .systemMetadata(
                            DirectoryListResponse.SystemMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(DirectoryListResponse.Type.EPHEMERAL)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(directoryListPageResponse.items())
            .containsExactly(
                DirectoryListResponse.builder()
                    .id("id")
                    .name("x")
                    .projectId("project_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .systemMetadata(
                        DirectoryListResponse.SystemMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type(DirectoryListResponse.Type.EPHEMERAL)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(directoryListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(directoryListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val directoryListPageResponse =
            DirectoryListPageResponse.builder()
                .addItem(
                    DirectoryListResponse.builder()
                        .id("id")
                        .name("x")
                        .projectId("project_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .systemMetadata(
                            DirectoryListResponse.SystemMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(DirectoryListResponse.Type.EPHEMERAL)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedDirectoryListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directoryListPageResponse),
                jacksonTypeRef<DirectoryListPageResponse>(),
            )

        assertThat(roundtrippedDirectoryListPageResponse).isEqualTo(directoryListPageResponse)
    }
}
