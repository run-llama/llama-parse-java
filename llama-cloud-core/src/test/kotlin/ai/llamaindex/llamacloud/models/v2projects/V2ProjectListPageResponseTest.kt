// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.v2projects

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2ProjectListPageResponseTest {

    @Test
    fun create() {
        val v2ProjectListPageResponse =
            V2ProjectListPageResponse.builder()
                .addItem(
                    V2ProjectListResponse.builder()
                        .id("id")
                        .name("name")
                        .organizationId("organization_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isDefault(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(v2ProjectListPageResponse.items())
            .containsExactly(
                V2ProjectListResponse.builder()
                    .id("id")
                    .name("name")
                    .organizationId("organization_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isDefault(true)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(v2ProjectListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(v2ProjectListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v2ProjectListPageResponse =
            V2ProjectListPageResponse.builder()
                .addItem(
                    V2ProjectListResponse.builder()
                        .id("id")
                        .name("name")
                        .organizationId("organization_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isDefault(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedV2ProjectListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2ProjectListPageResponse),
                jacksonTypeRef<V2ProjectListPageResponse>(),
            )

        assertThat(roundtrippedV2ProjectListPageResponse).isEqualTo(v2ProjectListPageResponse)
    }
}
