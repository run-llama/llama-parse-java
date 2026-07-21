// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.metadata

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataCreateResponseTest {

    @Test
    fun create() {
        val metadataCreateResponse =
            MetadataCreateResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadataCreateResponse =
            MetadataCreateResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()

        val roundtrippedMetadataCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadataCreateResponse),
                jacksonTypeRef<MetadataCreateResponse>(),
            )

        assertThat(roundtrippedMetadataCreateResponse).isEqualTo(metadataCreateResponse)
    }
}
