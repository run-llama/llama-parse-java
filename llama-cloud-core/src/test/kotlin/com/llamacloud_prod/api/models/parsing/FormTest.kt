// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormTest {

    @Test
    fun create() {
        val form =
            Form.builder()
                .addJson(
                    FormField.builder()
                        .field(FormField.Field.CHECKBOX)
                        .id("id")
                        .isEmpty(true)
                        .label("label")
                        .type(FormField.Type.FIELD)
                        .value("string")
                        .addValueItem(
                            FormSection.builder()
                                .addItem(
                                    FormTable.builder()
                                        .addRow(listOf(FormTable.Row.ofString("string")))
                                        .id("id")
                                        .addColumn("string")
                                        .label("label")
                                        .type(FormTable.Type.TABLE)
                                        .build()
                                )
                                .id("id")
                                .label("label")
                                .type(FormSection.Type.SECTION)
                                .build()
                        )
                        .build()
                )
                .list(
                    FormListItem.builder()
                        .addItem(
                            FormListTextItem.builder()
                                .md("md")
                                .value("value")
                                .type(FormListTextItem.Type.TEXT)
                                .build()
                        )
                        .md("md")
                        .ordered(true)
                        .type(FormListItem.Type.LIST)
                        .build()
                )
                .build()

        assertThat(form.json())
            .containsExactly(
                Form.Json.ofField(
                    FormField.builder()
                        .field(FormField.Field.CHECKBOX)
                        .id("id")
                        .isEmpty(true)
                        .label("label")
                        .type(FormField.Type.FIELD)
                        .value("string")
                        .addValueItem(
                            FormSection.builder()
                                .addItem(
                                    FormTable.builder()
                                        .addRow(listOf(FormTable.Row.ofString("string")))
                                        .id("id")
                                        .addColumn("string")
                                        .label("label")
                                        .type(FormTable.Type.TABLE)
                                        .build()
                                )
                                .id("id")
                                .label("label")
                                .type(FormSection.Type.SECTION)
                                .build()
                        )
                        .build()
                )
            )
        assertThat(form.list())
            .isEqualTo(
                FormListItem.builder()
                    .addItem(
                        FormListTextItem.builder()
                            .md("md")
                            .value("value")
                            .type(FormListTextItem.Type.TEXT)
                            .build()
                    )
                    .md("md")
                    .ordered(true)
                    .type(FormListItem.Type.LIST)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val form =
            Form.builder()
                .addJson(
                    FormField.builder()
                        .field(FormField.Field.CHECKBOX)
                        .id("id")
                        .isEmpty(true)
                        .label("label")
                        .type(FormField.Type.FIELD)
                        .value("string")
                        .addValueItem(
                            FormSection.builder()
                                .addItem(
                                    FormTable.builder()
                                        .addRow(listOf(FormTable.Row.ofString("string")))
                                        .id("id")
                                        .addColumn("string")
                                        .label("label")
                                        .type(FormTable.Type.TABLE)
                                        .build()
                                )
                                .id("id")
                                .label("label")
                                .type(FormSection.Type.SECTION)
                                .build()
                        )
                        .build()
                )
                .list(
                    FormListItem.builder()
                        .addItem(
                            FormListTextItem.builder()
                                .md("md")
                                .value("value")
                                .type(FormListTextItem.Type.TEXT)
                                .build()
                        )
                        .md("md")
                        .ordered(true)
                        .type(FormListItem.Type.LIST)
                        .build()
                )
                .build()

        val roundtrippedForm =
            jsonMapper.readValue(jsonMapper.writeValueAsString(form), jacksonTypeRef<Form>())

        assertThat(roundtrippedForm).isEqualTo(form)
    }
}
