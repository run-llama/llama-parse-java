// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormSectionTest {

    @Test
    fun create() {
        val formSection =
            FormSection.builder()
                .addItem(
                    FormField.builder()
                        .field(FormField.Field.CHECKBOX)
                        .id("id")
                        .isEmpty(true)
                        .label("label")
                        .type(FormField.Type.FIELD)
                        .value("string")
                        .addValueItem(
                            FormTable.builder()
                                .addRow(listOf(FormTable.Row.ofString("string")))
                                .id("id")
                                .addColumn("string")
                                .label("label")
                                .type(FormTable.Type.TABLE)
                                .build()
                        )
                        .build()
                )
                .id("id")
                .label("label")
                .type(FormSection.Type.SECTION)
                .build()

        assertThat(formSection.items())
            .containsExactly(
                FormSection.Item.ofField(
                    FormField.builder()
                        .field(FormField.Field.CHECKBOX)
                        .id("id")
                        .isEmpty(true)
                        .label("label")
                        .type(FormField.Type.FIELD)
                        .value("string")
                        .addValueItem(
                            FormTable.builder()
                                .addRow(listOf(FormTable.Row.ofString("string")))
                                .id("id")
                                .addColumn("string")
                                .label("label")
                                .type(FormTable.Type.TABLE)
                                .build()
                        )
                        .build()
                )
            )
        assertThat(formSection.id()).contains("id")
        assertThat(formSection.label()).contains("label")
        assertThat(formSection.type()).contains(FormSection.Type.SECTION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formSection =
            FormSection.builder()
                .addItem(
                    FormField.builder()
                        .field(FormField.Field.CHECKBOX)
                        .id("id")
                        .isEmpty(true)
                        .label("label")
                        .type(FormField.Type.FIELD)
                        .value("string")
                        .addValueItem(
                            FormTable.builder()
                                .addRow(listOf(FormTable.Row.ofString("string")))
                                .id("id")
                                .addColumn("string")
                                .label("label")
                                .type(FormTable.Type.TABLE)
                                .build()
                        )
                        .build()
                )
                .id("id")
                .label("label")
                .type(FormSection.Type.SECTION)
                .build()

        val roundtrippedFormSection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formSection),
                jacksonTypeRef<FormSection>(),
            )

        assertThat(roundtrippedFormSection).isEqualTo(formSection)
    }
}
