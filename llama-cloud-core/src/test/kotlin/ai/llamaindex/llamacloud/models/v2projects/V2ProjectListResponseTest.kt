// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.v2projects

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2ProjectListResponseTest {

    @Test
    fun create() {
        val v2ProjectListResponse =
            V2ProjectListResponse.builder()
                .id("id")
                .name("name")
                .organizationId("organization_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(v2ProjectListResponse.id()).isEqualTo("id")
        assertThat(v2ProjectListResponse.name()).isEqualTo("name")
        assertThat(v2ProjectListResponse.organizationId()).isEqualTo("organization_id")
        assertThat(v2ProjectListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v2ProjectListResponse.isDefault()).contains(true)
        assertThat(v2ProjectListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v2ProjectListResponse =
            V2ProjectListResponse.builder()
                .id("id")
                .name("name")
                .organizationId("organization_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedV2ProjectListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2ProjectListResponse),
                jacksonTypeRef<V2ProjectListResponse>(),
            )

        assertThat(roundtrippedV2ProjectListResponse).isEqualTo(v2ProjectListResponse)
    }
}
