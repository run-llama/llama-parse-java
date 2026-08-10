// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
