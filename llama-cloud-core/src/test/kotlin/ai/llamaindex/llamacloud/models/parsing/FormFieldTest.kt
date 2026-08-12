// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormFieldTest {

    @Test
    fun create() {
        val formField =
            FormField.builder()
                .field(FormField.Field.CHECKBOX)
                .id("id")
                .addBbox(
                    BBox.builder()
                        .h(0.0)
                        .w(0.0)
                        .x(0.0)
                        .y(0.0)
                        .confidence(0.0)
                        .endIndex(0L)
                        .label("label")
                        .r(0.0)
                        .startIndex(0L)
                        .build()
                )
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
                                .addBbox(
                                    BBox.builder()
                                        .h(0.0)
                                        .w(0.0)
                                        .x(0.0)
                                        .y(0.0)
                                        .confidence(0.0)
                                        .endIndex(0L)
                                        .label("label")
                                        .r(0.0)
                                        .startIndex(0L)
                                        .build()
                                )
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

        assertThat(formField.field()).isEqualTo(FormField.Field.CHECKBOX)
        assertThat(formField.id()).contains("id")
        assertThat(formField.bbox().getOrNull())
            .containsExactly(
                BBox.builder()
                    .h(0.0)
                    .w(0.0)
                    .x(0.0)
                    .y(0.0)
                    .confidence(0.0)
                    .endIndex(0L)
                    .label("label")
                    .r(0.0)
                    .startIndex(0L)
                    .build()
            )
        assertThat(formField.isEmpty()).contains(true)
        assertThat(formField.label()).contains("label")
        assertThat(formField.type()).contains(FormField.Type.FIELD)
        assertThat(formField.value()).contains(FormField.Value.ofString("string"))
        assertThat(formField.valueItems().getOrNull())
            .containsExactly(
                FormField.ValueItem.ofSection(
                    FormSection.builder()
                        .addItem(
                            FormTable.builder()
                                .addRow(listOf(FormTable.Row.ofString("string")))
                                .id("id")
                                .addBbox(
                                    BBox.builder()
                                        .h(0.0)
                                        .w(0.0)
                                        .x(0.0)
                                        .y(0.0)
                                        .confidence(0.0)
                                        .endIndex(0L)
                                        .label("label")
                                        .r(0.0)
                                        .startIndex(0L)
                                        .build()
                                )
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formField =
            FormField.builder()
                .field(FormField.Field.CHECKBOX)
                .id("id")
                .addBbox(
                    BBox.builder()
                        .h(0.0)
                        .w(0.0)
                        .x(0.0)
                        .y(0.0)
                        .confidence(0.0)
                        .endIndex(0L)
                        .label("label")
                        .r(0.0)
                        .startIndex(0L)
                        .build()
                )
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
                                .addBbox(
                                    BBox.builder()
                                        .h(0.0)
                                        .w(0.0)
                                        .x(0.0)
                                        .y(0.0)
                                        .confidence(0.0)
                                        .endIndex(0L)
                                        .label("label")
                                        .r(0.0)
                                        .startIndex(0L)
                                        .build()
                                )
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

        val roundtrippedFormField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formField),
                jacksonTypeRef<FormField>(),
            )

        assertThat(roundtrippedFormField).isEqualTo(formField)
    }
}
