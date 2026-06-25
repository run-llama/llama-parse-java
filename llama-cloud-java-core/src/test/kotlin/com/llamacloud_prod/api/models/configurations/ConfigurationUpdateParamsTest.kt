// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationUpdateParamsTest {

    @Test
    fun create() {
        ConfigurationUpdateParams.builder()
            .configId("config_id")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("x")
            .parameters(
                ClassifyV2Parameters.builder()
                    .addRule(
                        ClassifyV2Parameters.Rule.builder()
                            .description("contains invoice number, line items, and total amount")
                            .type("invoice")
                            .build()
                    )
                    .mode(ClassifyV2Parameters.Mode.FAST)
                    .parsingConfiguration(
                        ClassifyV2Parameters.ParsingConfiguration.builder()
                            .lang("en")
                            .maxPages(10L)
                            .targetPages("1,3,5-7")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ConfigurationUpdateParams.builder().configId("config_id").build()

        assertThat(params._pathParam(0)).isEqualTo("config_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ConfigurationUpdateParams.builder()
                .configId("config_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .parameters(
                    ClassifyV2Parameters.builder()
                        .addRule(
                            ClassifyV2Parameters.Rule.builder()
                                .description(
                                    "contains invoice number, line items, and total amount"
                                )
                                .type("invoice")
                                .build()
                        )
                        .mode(ClassifyV2Parameters.Mode.FAST)
                        .parsingConfiguration(
                            ClassifyV2Parameters.ParsingConfiguration.builder()
                                .lang("en")
                                .maxPages(10L)
                                .targetPages("1,3,5-7")
                                .build()
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConfigurationUpdateParams.builder().configId("config_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ConfigurationUpdateParams.builder()
                .configId("config_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .parameters(
                    ClassifyV2Parameters.builder()
                        .addRule(
                            ClassifyV2Parameters.Rule.builder()
                                .description(
                                    "contains invoice number, line items, and total amount"
                                )
                                .type("invoice")
                                .build()
                        )
                        .mode(ClassifyV2Parameters.Mode.FAST)
                        .parsingConfiguration(
                            ClassifyV2Parameters.ParsingConfiguration.builder()
                                .lang("en")
                                .maxPages(10L)
                                .targetPages("1,3,5-7")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).contains("x")
        assertThat(body.parameters())
            .contains(
                ConfigurationUpdateParams.Parameters.ofClassifyV2(
                    ClassifyV2Parameters.builder()
                        .addRule(
                            ClassifyV2Parameters.Rule.builder()
                                .description(
                                    "contains invoice number, line items, and total amount"
                                )
                                .type("invoice")
                                .build()
                        )
                        .mode(ClassifyV2Parameters.Mode.FAST)
                        .parsingConfiguration(
                            ClassifyV2Parameters.ParsingConfiguration.builder()
                                .lang("en")
                                .maxPages(10L)
                                .targetPages("1,3,5-7")
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ConfigurationUpdateParams.builder().configId("config_id").build()

        val body = params._body()
    }
}
