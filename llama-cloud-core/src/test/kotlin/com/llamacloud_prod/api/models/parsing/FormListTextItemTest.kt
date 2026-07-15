// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormListTextItemTest {

    @Test
    fun create() {
        val formListTextItem =
            FormListTextItem.builder()
                .md("md")
                .value("value")
                .type(FormListTextItem.Type.TEXT)
                .build()

        assertThat(formListTextItem.md()).isEqualTo("md")
        assertThat(formListTextItem.value()).isEqualTo("value")
        assertThat(formListTextItem.type()).contains(FormListTextItem.Type.TEXT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formListTextItem =
            FormListTextItem.builder()
                .md("md")
                .value("value")
                .type(FormListTextItem.Type.TEXT)
                .build()

        val roundtrippedFormListTextItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formListTextItem),
                jacksonTypeRef<FormListTextItem>(),
            )

        assertThat(roundtrippedFormListTextItem).isEqualTo(formListTextItem)
    }
}
