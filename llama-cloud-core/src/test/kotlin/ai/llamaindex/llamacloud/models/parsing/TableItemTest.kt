// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableItemTest {

    @Test
    fun create() {
        val tableItem =
            TableItem.builder()
                .csv("csv")
                .html("html")
                .md("md")
                .addRow(listOf(TableItem.Row.ofString("string")))
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
                .addMergedFromPage(0L)
                .mergedIntoPage(0L)
                .addParseConcern(
                    TableItem.ParseConcern.builder().details("details").type("type").build()
                )
                .type(TableItem.Type.TABLE)
                .build()

        assertThat(tableItem.csv()).isEqualTo("csv")
        assertThat(tableItem.html()).isEqualTo("html")
        assertThat(tableItem.md()).isEqualTo("md")
        assertThat(tableItem.rows()).containsExactly(listOf(TableItem.Row.ofString("string")))
        assertThat(tableItem.bbox().getOrNull())
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
        assertThat(tableItem.mergedFromPages().getOrNull()).containsExactly(0L)
        assertThat(tableItem.mergedIntoPage()).contains(0L)
        assertThat(tableItem.parseConcerns().getOrNull())
            .containsExactly(
                TableItem.ParseConcern.builder().details("details").type("type").build()
            )
        assertThat(tableItem.type()).contains(TableItem.Type.TABLE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tableItem =
            TableItem.builder()
                .csv("csv")
                .html("html")
                .md("md")
                .addRow(listOf(TableItem.Row.ofString("string")))
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
                .addMergedFromPage(0L)
                .mergedIntoPage(0L)
                .addParseConcern(
                    TableItem.ParseConcern.builder().details("details").type("type").build()
                )
                .type(TableItem.Type.TABLE)
                .build()

        val roundtrippedTableItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tableItem),
                jacksonTypeRef<TableItem>(),
            )

        assertThat(roundtrippedTableItem).isEqualTo(tableItem)
    }
}
