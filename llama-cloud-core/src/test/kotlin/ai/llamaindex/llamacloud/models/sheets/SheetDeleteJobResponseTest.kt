// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.sheets

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SheetDeleteJobResponseTest {

    @Test
    fun create() {
        val sheetDeleteJobResponse = SheetDeleteJobResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sheetDeleteJobResponse = SheetDeleteJobResponse.builder().build()

        val roundtrippedSheetDeleteJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sheetDeleteJobResponse),
                jacksonTypeRef<SheetDeleteJobResponse>(),
            )

        assertThat(roundtrippedSheetDeleteJobResponse).isEqualTo(sheetDeleteJobResponse)
    }
}
