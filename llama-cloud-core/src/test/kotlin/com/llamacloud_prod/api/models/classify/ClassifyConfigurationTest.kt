// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classify

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyConfigurationTest {

    @Test
    fun create() {
        val classifyConfiguration =
            ClassifyConfiguration.builder()
                .addRule(
                    ClassifyConfiguration.Rule.builder()
                        .description("contains invoice number, line items, and total amount")
                        .type("invoice")
                        .build()
                )
                .mode(ClassifyConfiguration.Mode.FAST)
                .parsingConfiguration(
                    ClassifyConfiguration.ParsingConfiguration.builder()
                        .lang("en")
                        .maxPages(10L)
                        .targetPages("1,3,5-7")
                        .build()
                )
                .build()

        assertThat(classifyConfiguration.rules())
            .containsExactly(
                ClassifyConfiguration.Rule.builder()
                    .description("contains invoice number, line items, and total amount")
                    .type("invoice")
                    .build()
            )
        assertThat(classifyConfiguration.mode()).contains(ClassifyConfiguration.Mode.FAST)
        assertThat(classifyConfiguration.parsingConfiguration())
            .contains(
                ClassifyConfiguration.ParsingConfiguration.builder()
                    .lang("en")
                    .maxPages(10L)
                    .targetPages("1,3,5-7")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyConfiguration =
            ClassifyConfiguration.builder()
                .addRule(
                    ClassifyConfiguration.Rule.builder()
                        .description("contains invoice number, line items, and total amount")
                        .type("invoice")
                        .build()
                )
                .mode(ClassifyConfiguration.Mode.FAST)
                .parsingConfiguration(
                    ClassifyConfiguration.ParsingConfiguration.builder()
                        .lang("en")
                        .maxPages(10L)
                        .targetPages("1,3,5-7")
                        .build()
                )
                .build()

        val roundtrippedClassifyConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyConfiguration),
                jacksonTypeRef<ClassifyConfiguration>(),
            )

        assertThat(roundtrippedClassifyConfiguration).isEqualTo(classifyConfiguration)
    }
}
