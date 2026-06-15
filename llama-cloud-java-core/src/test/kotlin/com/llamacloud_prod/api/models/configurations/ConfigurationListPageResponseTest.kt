// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.beta.split.SplitCategory
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationListPageResponseTest {

    @Test
    fun create() {
        val configurationListPageResponse =
            ConfigurationListPageResponse.builder()
                .addItem(
                    ConfigurationResponse.builder()
                        .id("id")
                        .name("name")
                        .parameters(
                            SplitV1Parameters.builder()
                                .addCategory(
                                    SplitCategory.builder().name("x").description("x").build()
                                )
                                .splittingStrategy(
                                    SplitV1Parameters.SplittingStrategy.builder()
                                        .allowUncategorized(
                                            SplitV1Parameters.SplittingStrategy.AllowUncategorized
                                                .INCLUDE
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(configurationListPageResponse.items())
            .containsExactly(
                ConfigurationResponse.builder()
                    .id("id")
                    .name("name")
                    .parameters(
                        SplitV1Parameters.builder()
                            .addCategory(SplitCategory.builder().name("x").description("x").build())
                            .splittingStrategy(
                                SplitV1Parameters.SplittingStrategy.builder()
                                    .allowUncategorized(
                                        SplitV1Parameters.SplittingStrategy.AllowUncategorized
                                            .INCLUDE
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
            )
        assertThat(configurationListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(configurationListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configurationListPageResponse =
            ConfigurationListPageResponse.builder()
                .addItem(
                    ConfigurationResponse.builder()
                        .id("id")
                        .name("name")
                        .parameters(
                            SplitV1Parameters.builder()
                                .addCategory(
                                    SplitCategory.builder().name("x").description("x").build()
                                )
                                .splittingStrategy(
                                    SplitV1Parameters.SplittingStrategy.builder()
                                        .allowUncategorized(
                                            SplitV1Parameters.SplittingStrategy.AllowUncategorized
                                                .INCLUDE
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
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedConfigurationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurationListPageResponse),
                jacksonTypeRef<ConfigurationListPageResponse>(),
            )

        assertThat(roundtrippedConfigurationListPageResponse)
            .isEqualTo(configurationListPageResponse)
    }
}
