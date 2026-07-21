// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.split

import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitCreateParamsTest {

    @Test
    fun create() {
        SplitCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .documentInput(SplitDocumentInput.builder().type("type").value("value").build())
            .configuration(
                SplitCreateParams.Configuration.builder()
                    .addCategory(SplitCategory.builder().name("x").description("x").build())
                    .splittingStrategy(
                        SplitCreateParams.Configuration.SplittingStrategy.builder()
                            .allowUncategorized(
                                SplitCreateParams.Configuration.SplittingStrategy.AllowUncategorized
                                    .FORBID
                            )
                            .build()
                    )
                    .build()
            )
            .configurationId("configuration_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SplitCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentInput(SplitDocumentInput.builder().type("type").value("value").build())
                .configuration(
                    SplitCreateParams.Configuration.builder()
                        .addCategory(SplitCategory.builder().name("x").description("x").build())
                        .splittingStrategy(
                            SplitCreateParams.Configuration.SplittingStrategy.builder()
                                .allowUncategorized(
                                    SplitCreateParams.Configuration.SplittingStrategy
                                        .AllowUncategorized
                                        .FORBID
                                )
                                .build()
                        )
                        .build()
                )
                .configurationId("configuration_id")
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
            SplitCreateParams.builder()
                .documentInput(SplitDocumentInput.builder().type("type").value("value").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            SplitCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentInput(SplitDocumentInput.builder().type("type").value("value").build())
                .configuration(
                    SplitCreateParams.Configuration.builder()
                        .addCategory(SplitCategory.builder().name("x").description("x").build())
                        .splittingStrategy(
                            SplitCreateParams.Configuration.SplittingStrategy.builder()
                                .allowUncategorized(
                                    SplitCreateParams.Configuration.SplittingStrategy
                                        .AllowUncategorized
                                        .FORBID
                                )
                                .build()
                        )
                        .build()
                )
                .configurationId("configuration_id")
                .build()

        val body = params._body()

        assertThat(body.documentInput())
            .isEqualTo(SplitDocumentInput.builder().type("type").value("value").build())
        assertThat(body.configuration())
            .contains(
                SplitCreateParams.Configuration.builder()
                    .addCategory(SplitCategory.builder().name("x").description("x").build())
                    .splittingStrategy(
                        SplitCreateParams.Configuration.SplittingStrategy.builder()
                            .allowUncategorized(
                                SplitCreateParams.Configuration.SplittingStrategy.AllowUncategorized
                                    .FORBID
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.configurationId()).contains("configuration_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SplitCreateParams.builder()
                .documentInput(SplitDocumentInput.builder().type("type").value("value").build())
                .build()

        val body = params._body()

        assertThat(body.documentInput())
            .isEqualTo(SplitDocumentInput.builder().type("type").value("value").build())
    }
}
