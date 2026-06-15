// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.models.beta.split.SplitCategory
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
                SplitV1Parameters.builder()
                    .addCategory(SplitCategory.builder().name("x").description("x").build())
                    .splittingStrategy(
                        SplitV1Parameters.SplittingStrategy.builder()
                            .allowUncategorized(
                                SplitV1Parameters.SplittingStrategy.AllowUncategorized.INCLUDE
                            )
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
                    SplitV1Parameters.builder()
                        .addCategory(SplitCategory.builder().name("x").description("x").build())
                        .splittingStrategy(
                            SplitV1Parameters.SplittingStrategy.builder()
                                .allowUncategorized(
                                    SplitV1Parameters.SplittingStrategy.AllowUncategorized.INCLUDE
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
                    SplitV1Parameters.builder()
                        .addCategory(SplitCategory.builder().name("x").description("x").build())
                        .splittingStrategy(
                            SplitV1Parameters.SplittingStrategy.builder()
                                .allowUncategorized(
                                    SplitV1Parameters.SplittingStrategy.AllowUncategorized.INCLUDE
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).contains("x")
        assertThat(body.parameters())
            .contains(
                ConfigurationUpdateParams.Parameters.ofSplitV1(
                    SplitV1Parameters.builder()
                        .addCategory(SplitCategory.builder().name("x").description("x").build())
                        .splittingStrategy(
                            SplitV1Parameters.SplittingStrategy.builder()
                                .allowUncategorized(
                                    SplitV1Parameters.SplittingStrategy.AllowUncategorized.INCLUDE
                                )
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
