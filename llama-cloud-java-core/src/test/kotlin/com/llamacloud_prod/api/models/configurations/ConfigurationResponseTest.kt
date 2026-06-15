// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.beta.split.SplitCategory
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationResponseTest {

    @Test
    fun create() {
        val configurationResponse =
            ConfigurationResponse.builder()
                .id("id")
                .name("name")
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
                .productType(ConfigurationResponse.ProductType.SPLIT_V1)
                .version("version")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(configurationResponse.id()).isEqualTo("id")
        assertThat(configurationResponse.name()).isEqualTo("name")
        assertThat(configurationResponse.parameters())
            .isEqualTo(
                ConfigurationResponse.Parameters.ofSplitV1(
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
        assertThat(configurationResponse.productType())
            .isEqualTo(ConfigurationResponse.ProductType.SPLIT_V1)
        assertThat(configurationResponse.version()).isEqualTo("version")
        assertThat(configurationResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(configurationResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configurationResponse =
            ConfigurationResponse.builder()
                .id("id")
                .name("name")
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
                .productType(ConfigurationResponse.ProductType.SPLIT_V1)
                .version("version")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedConfigurationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurationResponse),
                jacksonTypeRef<ConfigurationResponse>(),
            )

        assertThat(roundtrippedConfigurationResponse).isEqualTo(configurationResponse)
    }
}
