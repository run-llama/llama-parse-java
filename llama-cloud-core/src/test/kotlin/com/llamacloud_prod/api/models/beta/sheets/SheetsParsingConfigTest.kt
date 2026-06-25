// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.sheets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SheetsParsingConfigTest {

    @Test
    fun create() {
        val sheetsParsingConfig =
            SheetsParsingConfig.builder()
                .extractionRange("extraction_range")
                .flattenHierarchicalTables(true)
                .generateAdditionalMetadata(true)
                .includeHiddenCells(true)
                .addSheetName("string")
                .specialization("specialization")
                .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                .useExperimentalProcessing(true)
                .build()

        assertThat(sheetsParsingConfig.extractionRange()).contains("extraction_range")
        assertThat(sheetsParsingConfig.flattenHierarchicalTables()).contains(true)
        assertThat(sheetsParsingConfig.generateAdditionalMetadata()).contains(true)
        assertThat(sheetsParsingConfig.includeHiddenCells()).contains(true)
        assertThat(sheetsParsingConfig.sheetNames().getOrNull()).containsExactly("string")
        assertThat(sheetsParsingConfig.specialization()).contains("specialization")
        assertThat(sheetsParsingConfig.tableMergeSensitivity())
            .contains(SheetsParsingConfig.TableMergeSensitivity.STRONG)
        assertThat(sheetsParsingConfig.useExperimentalProcessing()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sheetsParsingConfig =
            SheetsParsingConfig.builder()
                .extractionRange("extraction_range")
                .flattenHierarchicalTables(true)
                .generateAdditionalMetadata(true)
                .includeHiddenCells(true)
                .addSheetName("string")
                .specialization("specialization")
                .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                .useExperimentalProcessing(true)
                .build()

        val roundtrippedSheetsParsingConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sheetsParsingConfig),
                jacksonTypeRef<SheetsParsingConfig>(),
            )

        assertThat(roundtrippedSheetsParsingConfig).isEqualTo(sheetsParsingConfig)
    }
}
