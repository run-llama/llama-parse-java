// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractJobUsageTest {

    @Test
    fun create() {
        val extractJobUsage = ExtractJobUsage.builder().numPagesExtracted(0L).build()

        assertThat(extractJobUsage.numPagesExtracted()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractJobUsage = ExtractJobUsage.builder().numPagesExtracted(0L).build()

        val roundtrippedExtractJobUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractJobUsage),
                jacksonTypeRef<ExtractJobUsage>(),
            )

        assertThat(roundtrippedExtractJobUsage).isEqualTo(extractJobUsage)
    }
}
