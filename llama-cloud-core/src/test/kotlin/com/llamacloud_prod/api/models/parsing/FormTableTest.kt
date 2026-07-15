// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormTableTest {

    @Test
    fun create() {
        val formTable =
            FormTable.builder()
                .addRow(listOf(FormTable.Row.ofString("string")))
                .id("id")
                .addColumn("string")
                .label("label")
                .type(FormTable.Type.TABLE)
                .build()

        assertThat(formTable.rows()).containsExactly(listOf(FormTable.Row.ofString("string")))
        assertThat(formTable.id()).contains("id")
        assertThat(formTable.columns().getOrNull()).containsExactly("string")
        assertThat(formTable.label()).contains("label")
        assertThat(formTable.type()).contains(FormTable.Type.TABLE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formTable =
            FormTable.builder()
                .addRow(listOf(FormTable.Row.ofString("string")))
                .id("id")
                .addColumn("string")
                .label("label")
                .type(FormTable.Type.TABLE)
                .build()

        val roundtrippedFormTable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formTable),
                jacksonTypeRef<FormTable>(),
            )

        assertThat(roundtrippedFormTable).isEqualTo(formTable)
    }
}
