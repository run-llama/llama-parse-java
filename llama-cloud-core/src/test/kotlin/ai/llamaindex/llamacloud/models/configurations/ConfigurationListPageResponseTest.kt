// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.configurations

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
                            ClassifyV2Parameters.builder()
                                .addRule(
                                    ClassifyV2Parameters.Rule.builder()
                                        .description(
                                            "contains invoice number, line items, and total amount"
                                        )
                                        .type("invoice")
                                        .build()
                                )
                                .mode(ClassifyV2Parameters.Mode.FAST)
                                .parsingConfiguration(
                                    ClassifyV2Parameters.ParsingConfiguration.builder()
                                        .lang("en")
                                        .maxPages(10L)
                                        .targetPages("1,3,5-7")
                                        .build()
                                )
                                .build()
                        )
                        .productType(ConfigurationResponse.ProductType.CLASSIFY_V2)
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
                        ClassifyV2Parameters.builder()
                            .addRule(
                                ClassifyV2Parameters.Rule.builder()
                                    .description(
                                        "contains invoice number, line items, and total amount"
                                    )
                                    .type("invoice")
                                    .build()
                            )
                            .mode(ClassifyV2Parameters.Mode.FAST)
                            .parsingConfiguration(
                                ClassifyV2Parameters.ParsingConfiguration.builder()
                                    .lang("en")
                                    .maxPages(10L)
                                    .targetPages("1,3,5-7")
                                    .build()
                            )
                            .build()
                    )
                    .productType(ConfigurationResponse.ProductType.CLASSIFY_V2)
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
                            ClassifyV2Parameters.builder()
                                .addRule(
                                    ClassifyV2Parameters.Rule.builder()
                                        .description(
                                            "contains invoice number, line items, and total amount"
                                        )
                                        .type("invoice")
                                        .build()
                                )
                                .mode(ClassifyV2Parameters.Mode.FAST)
                                .parsingConfiguration(
                                    ClassifyV2Parameters.ParsingConfiguration.builder()
                                        .lang("en")
                                        .maxPages(10L)
                                        .targetPages("1,3,5-7")
                                        .build()
                                )
                                .build()
                        )
                        .productType(ConfigurationResponse.ProductType.CLASSIFY_V2)
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
