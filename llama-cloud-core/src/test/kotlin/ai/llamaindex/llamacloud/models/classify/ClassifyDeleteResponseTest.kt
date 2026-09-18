// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.classify

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyDeleteResponseTest {

    @Test
    fun create() {
        val classifyDeleteResponse =
            ClassifyDeleteResponse.builder()
                .id("clj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .build()

        assertThat(classifyDeleteResponse.id())
            .isEqualTo("clj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(classifyDeleteResponse.projectId())
            .contains("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyDeleteResponse =
            ClassifyDeleteResponse.builder()
                .id("clj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .build()

        val roundtrippedClassifyDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyDeleteResponse),
                jacksonTypeRef<ClassifyDeleteResponse>(),
            )

        assertThat(roundtrippedClassifyDeleteResponse).isEqualTo(classifyDeleteResponse)
    }
}
