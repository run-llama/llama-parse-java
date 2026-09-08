// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParsingDeleteResponseTest {

    @Test
    fun create() {
        val parsingDeleteResponse =
            ParsingDeleteResponse.builder()
                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .build()

        assertThat(parsingDeleteResponse.id()).isEqualTo("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(parsingDeleteResponse.projectId())
            .isEqualTo("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parsingDeleteResponse =
            ParsingDeleteResponse.builder()
                .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .build()

        val roundtrippedParsingDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsingDeleteResponse),
                jacksonTypeRef<ParsingDeleteResponse>(),
            )

        assertThat(roundtrippedParsingDeleteResponse).isEqualTo(parsingDeleteResponse)
    }
}
