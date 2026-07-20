// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.sheets

import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SheetGetResultTableParamsTest {

    @Test
    fun create() {
        SheetGetResultTableParams.builder()
            .spreadsheetJobId("spreadsheet_job_id")
            .regionId("region_id")
            .regionType(SheetGetResultTableParams.RegionType.CELL_METADATA)
            .expiresAtSeconds(0L)
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SheetGetResultTableParams.builder()
                .spreadsheetJobId("spreadsheet_job_id")
                .regionId("region_id")
                .regionType(SheetGetResultTableParams.RegionType.CELL_METADATA)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("spreadsheet_job_id")
        assertThat(params._pathParam(1)).isEqualTo("region_id")
        assertThat(params._pathParam(2)).isEqualTo("cell_metadata")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SheetGetResultTableParams.builder()
                .spreadsheetJobId("spreadsheet_job_id")
                .regionId("region_id")
                .regionType(SheetGetResultTableParams.RegionType.CELL_METADATA)
                .expiresAtSeconds(0L)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("expires_at_seconds", "0")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SheetGetResultTableParams.builder()
                .spreadsheetJobId("spreadsheet_job_id")
                .regionId("region_id")
                .regionType(SheetGetResultTableParams.RegionType.CELL_METADATA)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
