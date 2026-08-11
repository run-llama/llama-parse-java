// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.v2projects

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2ProjectGetResponseTest {

    @Test
    fun create() {
        val v2ProjectGetResponse =
            V2ProjectGetResponse.builder()
                .id("id")
                .name("name")
                .organizationId("organization_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(v2ProjectGetResponse.id()).isEqualTo("id")
        assertThat(v2ProjectGetResponse.name()).isEqualTo("name")
        assertThat(v2ProjectGetResponse.organizationId()).isEqualTo("organization_id")
        assertThat(v2ProjectGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v2ProjectGetResponse.isDefault()).contains(true)
        assertThat(v2ProjectGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v2ProjectGetResponse =
            V2ProjectGetResponse.builder()
                .id("id")
                .name("name")
                .organizationId("organization_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedV2ProjectGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2ProjectGetResponse),
                jacksonTypeRef<V2ProjectGetResponse>(),
            )

        assertThat(roundtrippedV2ProjectGetResponse).isEqualTo(v2ProjectGetResponse)
    }
}
