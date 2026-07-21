// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractDeleteResponseTest {

    @Test
    fun create() {
        val extractDeleteResponse = ExtractDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractDeleteResponse = ExtractDeleteResponse.builder().build()

        val roundtrippedExtractDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractDeleteResponse),
                jacksonTypeRef<ExtractDeleteResponse>(),
            )

        assertThat(roundtrippedExtractDeleteResponse).isEqualTo(extractDeleteResponse)
    }
}
