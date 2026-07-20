// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.configurations

import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationCreateParamsTest {

    @Test
    fun create() {
        ConfigurationCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .configurationCreate(
                ConfigurationCreate.builder()
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
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ConfigurationCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .configurationCreate(
                    ConfigurationCreate.builder()
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
        val params =
            ConfigurationCreateParams.builder()
                .configurationCreate(
                    ConfigurationCreate.builder()
                        .name("x")
                        .classifyV2Parameters(
                            listOf(
                                ClassifyV2Parameters.Rule.builder()
                                    .description(
                                        "contains invoice number, line items, and total amount"
                                    )
                                    .type("invoice")
                                    .build()
                            )
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ConfigurationCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .configurationCreate(
                    ConfigurationCreate.builder()
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ConfigurationCreate.builder()
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConfigurationCreateParams.builder()
                .configurationCreate(
                    ConfigurationCreate.builder()
                        .name("x")
                        .classifyV2Parameters(
                            listOf(
                                ClassifyV2Parameters.Rule.builder()
                                    .description(
                                        "contains invoice number, line items, and total amount"
                                    )
                                    .type("invoice")
                                    .build()
                            )
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ConfigurationCreate.builder()
                    .name("x")
                    .classifyV2Parameters(
                        listOf(
                            ClassifyV2Parameters.Rule.builder()
                                .description(
                                    "contains invoice number, line items, and total amount"
                                )
                                .type("invoice")
                                .build()
                        )
                    )
                    .build()
            )
    }
}
