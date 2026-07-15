// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormListItemTest {

    @Test
    fun create() {
        val formListItem =
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

        assertThat(formListItem.items())
            .containsExactly(
                FormListItem.Item.ofFormListText(
                    FormListTextItem.builder()
                        .md("md")
                        .value("value")
                        .type(FormListTextItem.Type.TEXT)
                        .build()
                )
            )
        assertThat(formListItem.md()).isEqualTo("md")
        assertThat(formListItem.ordered()).isEqualTo(true)
        assertThat(formListItem.type()).contains(FormListItem.Type.LIST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formListItem =
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

        val roundtrippedFormListItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formListItem),
                jacksonTypeRef<FormListItem>(),
            )

        assertThat(roundtrippedFormListItem).isEqualTo(formListItem)
    }
}
