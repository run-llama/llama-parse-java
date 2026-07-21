// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.configurations

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UntypedParametersTest {

    @Test
    fun create() {
        val untypedParameters = UntypedParameters.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val untypedParameters = UntypedParameters.builder().build()

        val roundtrippedUntypedParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(untypedParameters),
                jacksonTypeRef<UntypedParameters>(),
            )

        assertThat(roundtrippedUntypedParameters).isEqualTo(untypedParameters)
    }
}
