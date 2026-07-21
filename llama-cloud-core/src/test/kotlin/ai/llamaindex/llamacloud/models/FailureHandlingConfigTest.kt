// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FailureHandlingConfigTest {

    @Test
    fun create() {
        val failureHandlingConfig = FailureHandlingConfig.builder().skipListFailures(true).build()

        assertThat(failureHandlingConfig.skipListFailures()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val failureHandlingConfig = FailureHandlingConfig.builder().skipListFailures(true).build()

        val roundtrippedFailureHandlingConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(failureHandlingConfig),
                jacksonTypeRef<FailureHandlingConfig>(),
            )

        assertThat(roundtrippedFailureHandlingConfig).isEqualTo(failureHandlingConfig)
    }
}
