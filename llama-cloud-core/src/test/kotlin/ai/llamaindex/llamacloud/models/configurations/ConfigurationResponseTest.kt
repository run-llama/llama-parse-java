// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.configurations

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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

        assertThat(configurationResponse.id()).isEqualTo("id")
        assertThat(configurationResponse.name()).isEqualTo("name")
        assertThat(configurationResponse.parameters())
            .isEqualTo(
                ConfigurationResponse.Parameters.ofClassifyV2(
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
            )
        assertThat(configurationResponse.productType())
            .isEqualTo(ConfigurationResponse.ProductType.CLASSIFY_V2)
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

        val roundtrippedConfigurationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurationResponse),
                jacksonTypeRef<ConfigurationResponse>(),
            )

        assertThat(roundtrippedConfigurationResponse).isEqualTo(configurationResponse)
    }
}
