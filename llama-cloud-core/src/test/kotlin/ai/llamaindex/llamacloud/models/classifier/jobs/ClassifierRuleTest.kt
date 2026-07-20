// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.classifier.jobs

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifierRuleTest {

    @Test
    fun create() {
        val classifierRule =
            ClassifierRule.builder()
                .description("contains invoice number, line items, and total amount")
                .type("invoice")
                .build()

        assertThat(classifierRule.description())
            .isEqualTo("contains invoice number, line items, and total amount")
        assertThat(classifierRule.type()).isEqualTo("invoice")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifierRule =
            ClassifierRule.builder()
                .description("contains invoice number, line items, and total amount")
                .type("invoice")
                .build()

        val roundtrippedClassifierRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifierRule),
                jacksonTypeRef<ClassifierRule>(),
            )

        assertThat(roundtrippedClassifierRule).isEqualTo(classifierRule)
    }
}
