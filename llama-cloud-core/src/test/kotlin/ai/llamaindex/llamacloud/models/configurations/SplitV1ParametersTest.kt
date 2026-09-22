// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.configurations

import ai.llamaindex.llamacloud.core.jsonMapper
import ai.llamaindex.llamacloud.models.beta.split.SplitCategory
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitV1ParametersTest {

    @Test
    fun create() {
        val splitV1Parameters =
            SplitV1Parameters.builder()
                .addCategory(SplitCategory.builder().name("x").description("x").build())
                .splittingStrategy(
                    SplitV1Parameters.SplittingStrategy.builder()
                        .allowUncategorized(
                            SplitV1Parameters.SplittingStrategy.AllowUncategorized.FORBID
                        )
                        .build()
                )
                .build()

        assertThat(splitV1Parameters.categories())
            .containsExactly(SplitCategory.builder().name("x").description("x").build())
        assertThat(splitV1Parameters.splittingStrategy())
            .contains(
                SplitV1Parameters.SplittingStrategy.builder()
                    .allowUncategorized(
                        SplitV1Parameters.SplittingStrategy.AllowUncategorized.FORBID
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitV1Parameters =
            SplitV1Parameters.builder()
                .addCategory(SplitCategory.builder().name("x").description("x").build())
                .splittingStrategy(
                    SplitV1Parameters.SplittingStrategy.builder()
                        .allowUncategorized(
                            SplitV1Parameters.SplittingStrategy.AllowUncategorized.FORBID
                        )
                        .build()
                )
                .build()

        val roundtrippedSplitV1Parameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitV1Parameters),
                jacksonTypeRef<SplitV1Parameters>(),
            )

        assertThat(roundtrippedSplitV1Parameters).isEqualTo(splitV1Parameters)
    }
}
