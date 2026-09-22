// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormTableCellItemsTest {

    @Test
    fun create() {
        val formTableCellItems =
            FormTableCellItems.builder()
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
                )
                .build()

        assertThat(formTableCellItems.items())
            .containsExactly(
                FormTableCellItems.Item.ofField(
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
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formTableCellItems =
            FormTableCellItems.builder()
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
                )
                .build()

        val roundtrippedFormTableCellItems =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formTableCellItems),
                jacksonTypeRef<FormTableCellItems>(),
            )

        assertThat(roundtrippedFormTableCellItems).isEqualTo(formTableCellItems)
    }
}
