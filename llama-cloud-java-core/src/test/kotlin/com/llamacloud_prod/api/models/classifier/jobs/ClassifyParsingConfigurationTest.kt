// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classifier.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.parsing.ParsingLanguages
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyParsingConfigurationTest {

    @Test
    fun create() {
        val classifyParsingConfiguration =
            ClassifyParsingConfiguration.builder()
                .lang(ParsingLanguages.AF)
                .maxPages(0L)
                .addTargetPage(0L)
                .build()

        assertThat(classifyParsingConfiguration.lang()).contains(ParsingLanguages.AF)
        assertThat(classifyParsingConfiguration.maxPages()).contains(0L)
        assertThat(classifyParsingConfiguration.targetPages().getOrNull()).containsExactly(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyParsingConfiguration =
            ClassifyParsingConfiguration.builder()
                .lang(ParsingLanguages.AF)
                .maxPages(0L)
                .addTargetPage(0L)
                .build()

        val roundtrippedClassifyParsingConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyParsingConfiguration),
                jacksonTypeRef<ClassifyParsingConfiguration>(),
            )

        assertThat(roundtrippedClassifyParsingConfiguration).isEqualTo(classifyParsingConfiguration)
    }
}
