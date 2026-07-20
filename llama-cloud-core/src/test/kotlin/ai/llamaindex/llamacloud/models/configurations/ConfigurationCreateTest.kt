// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.configurations

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationCreateTest {

    @Test
    fun create() {
        val configurationCreate =
            ConfigurationCreate.builder()
                .name("x")
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
                .build()

        assertThat(configurationCreate.name()).isEqualTo("x")
        assertThat(configurationCreate.parameters())
            .isEqualTo(
                ConfigurationCreate.Parameters.ofClassifyV2(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configurationCreate =
            ConfigurationCreate.builder()
                .name("x")
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
                .build()

        val roundtrippedConfigurationCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurationCreate),
                jacksonTypeRef<ConfigurationCreate>(),
            )

        assertThat(roundtrippedConfigurationCreate).isEqualTo(configurationCreate)
    }
}
