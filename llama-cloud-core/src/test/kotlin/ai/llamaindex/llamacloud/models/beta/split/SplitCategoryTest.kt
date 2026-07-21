// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.split

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitCategoryTest {

    @Test
    fun create() {
        val splitCategory = SplitCategory.builder().name("x").description("x").build()

        assertThat(splitCategory.name()).isEqualTo("x")
        assertThat(splitCategory.description()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitCategory = SplitCategory.builder().name("x").description("x").build()

        val roundtrippedSplitCategory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitCategory),
                jacksonTypeRef<SplitCategory>(),
            )

        assertThat(roundtrippedSplitCategory).isEqualTo(splitCategory)
    }
}
