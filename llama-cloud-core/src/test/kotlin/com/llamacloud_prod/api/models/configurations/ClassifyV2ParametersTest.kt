// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyV2ParametersTest {

    @Test
    fun create() {
        val classifyV2Parameters =
            ClassifyV2Parameters.builder()
                .addRule(
                    ClassifyV2Parameters.Rule.builder()
                        .description("contains invoice number, line items, and total amount")
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

        assertThat(classifyV2Parameters.rules())
            .containsExactly(
                ClassifyV2Parameters.Rule.builder()
                    .description("contains invoice number, line items, and total amount")
                    .type("invoice")
                    .build()
            )
        assertThat(classifyV2Parameters.mode()).contains(ClassifyV2Parameters.Mode.FAST)
        assertThat(classifyV2Parameters.parsingConfiguration())
            .contains(
                ClassifyV2Parameters.ParsingConfiguration.builder()
                    .lang("en")
                    .maxPages(10L)
                    .targetPages("1,3,5-7")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyV2Parameters =
            ClassifyV2Parameters.builder()
                .addRule(
                    ClassifyV2Parameters.Rule.builder()
                        .description("contains invoice number, line items, and total amount")
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

        val roundtrippedClassifyV2Parameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyV2Parameters),
                jacksonTypeRef<ClassifyV2Parameters>(),
            )

        assertThat(roundtrippedClassifyV2Parameters).isEqualTo(classifyV2Parameters)
    }
}
