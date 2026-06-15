// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.beta.split.SplitCategory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationCreateTest {

    @Test
    fun create() {
        val configurationCreate =
            ConfigurationCreate.builder()
                .name("x")
                .parameters(
                    SplitV1Parameters.builder()
                        .addCategory(SplitCategory.builder().name("x").description("x").build())
                        .splittingStrategy(
                            SplitV1Parameters.SplittingStrategy.builder()
                                .allowUncategorized(
                                    SplitV1Parameters.SplittingStrategy.AllowUncategorized.INCLUDE
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(configurationCreate.name()).isEqualTo("x")
        assertThat(configurationCreate.parameters())
            .isEqualTo(
                ConfigurationCreate.Parameters.ofSplitV1(
                    SplitV1Parameters.builder()
                        .addCategory(SplitCategory.builder().name("x").description("x").build())
                        .splittingStrategy(
                            SplitV1Parameters.SplittingStrategy.builder()
                                .allowUncategorized(
                                    SplitV1Parameters.SplittingStrategy.AllowUncategorized.INCLUDE
                                )
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configurationCreate =
            ConfigurationCreate.builder()
                .name("x")
                .parameters(
                    SplitV1Parameters.builder()
                        .addCategory(SplitCategory.builder().name("x").description("x").build())
                        .splittingStrategy(
                            SplitV1Parameters.SplittingStrategy.builder()
                                .allowUncategorized(
                                    SplitV1Parameters.SplittingStrategy.AllowUncategorized.INCLUDE
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedConfigurationCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurationCreate),
                jacksonTypeRef<ConfigurationCreate>(),
            )

        assertThat(roundtrippedConfigurationCreate).isEqualTo(configurationCreate)
    }
}
