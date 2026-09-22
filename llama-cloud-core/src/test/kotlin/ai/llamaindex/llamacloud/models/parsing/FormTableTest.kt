// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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

        assertThat(formTable.rows()).containsExactly(listOf(FormTable.Row.ofString("string")))
        assertThat(formTable.id()).contains("id")
        assertThat(formTable.bbox().getOrNull())
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

        val roundtrippedFormTable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formTable),
                jacksonTypeRef<FormTable>(),
            )

        assertThat(roundtrippedFormTable).isEqualTo(formTable)
    }
}
