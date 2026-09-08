// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.datasources

import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSourceUpdateDataSourcesParamsTest {

    @Test
    fun create() {
        DataSourceUpdateDataSourcesParams.builder()
            .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addBody(
                DataSourceUpdateDataSourcesParams.Body.builder()
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .syncInterval(0.0)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DataSourceUpdateDataSourcesParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    DataSourceUpdateDataSourcesParams.Body.builder()
                        .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DataSourceUpdateDataSourcesParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    DataSourceUpdateDataSourcesParams.Body.builder()
                        .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .syncInterval(0.0)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DataSourceUpdateDataSourcesParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    DataSourceUpdateDataSourcesParams.Body.builder()
                        .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            DataSourceUpdateDataSourcesParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    DataSourceUpdateDataSourcesParams.Body.builder()
                        .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .syncInterval(0.0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                DataSourceUpdateDataSourcesParams.Body.builder()
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .syncInterval(0.0)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataSourceUpdateDataSourcesParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    DataSourceUpdateDataSourcesParams.Body.builder()
                        .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                DataSourceUpdateDataSourcesParams.Body.builder()
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
