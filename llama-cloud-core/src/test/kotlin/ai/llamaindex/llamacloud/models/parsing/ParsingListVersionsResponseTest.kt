// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParsingListVersionsResponseTest {

    @Test
    fun create() {
        val parsingListVersionsResponse =
            ParsingListVersionsResponse.builder()
                .addAgentic(ParsingListVersionsResponse.Agentic._2026_07_24)
                .addAgenticPlus(ParsingListVersionsResponse.AgenticPlus._2026_07_08)
                .addCostEffective(ParsingListVersionsResponse.CostEffective._2026_08_08)
                .addFast(ParsingListVersionsResponse.Fast._2026_06_15)
                .build()

        assertThat(parsingListVersionsResponse.agentic())
            .containsExactly(ParsingListVersionsResponse.Agentic._2026_07_24)
        assertThat(parsingListVersionsResponse.agenticPlus())
            .containsExactly(ParsingListVersionsResponse.AgenticPlus._2026_07_08)
        assertThat(parsingListVersionsResponse.costEffective())
            .containsExactly(ParsingListVersionsResponse.CostEffective._2026_08_08)
        assertThat(parsingListVersionsResponse.fast())
            .containsExactly(ParsingListVersionsResponse.Fast._2026_06_15)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parsingListVersionsResponse =
            ParsingListVersionsResponse.builder()
                .addAgentic(ParsingListVersionsResponse.Agentic._2026_07_24)
                .addAgenticPlus(ParsingListVersionsResponse.AgenticPlus._2026_07_08)
                .addCostEffective(ParsingListVersionsResponse.CostEffective._2026_08_08)
                .addFast(ParsingListVersionsResponse.Fast._2026_06_15)
                .build()

        val roundtrippedParsingListVersionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsingListVersionsResponse),
                jacksonTypeRef<ParsingListVersionsResponse>(),
            )

        assertThat(roundtrippedParsingListVersionsResponse).isEqualTo(parsingListVersionsResponse)
    }
}
