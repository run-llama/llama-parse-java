// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListItemTest {

    @Test
    fun create() {
        val listItem =
            ListItem.builder()
                .addItem(
                    TextItem.builder()
                        .md("md")
                        .value("value")
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
                        .type(TextItem.Type.TEXT)
                        .build()
                )
                .md("md")
                .ordered(true)
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
                .type(ListItem.Type.LIST)
                .build()

        assertThat(listItem.items())
            .containsExactly(
                ListItem.Item.ofText(
                    TextItem.builder()
                        .md("md")
                        .value("value")
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
                        .type(TextItem.Type.TEXT)
                        .build()
                )
            )
        assertThat(listItem.md()).isEqualTo("md")
        assertThat(listItem.ordered()).isEqualTo(true)
        assertThat(listItem.bbox().getOrNull())
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
        assertThat(listItem.type()).contains(ListItem.Type.LIST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listItem =
            ListItem.builder()
                .addItem(
                    TextItem.builder()
                        .md("md")
                        .value("value")
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
                        .type(TextItem.Type.TEXT)
                        .build()
                )
                .md("md")
                .ordered(true)
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
                .type(ListItem.Type.LIST)
                .build()

        val roundtrippedListItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listItem),
                jacksonTypeRef<ListItem>(),
            )

        assertThat(roundtrippedListItem).isEqualTo(listItem)
    }
}
