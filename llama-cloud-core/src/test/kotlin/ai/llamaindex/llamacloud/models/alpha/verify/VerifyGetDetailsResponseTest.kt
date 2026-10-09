// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.alpha.verify

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyGetDetailsResponseTest {

    @Test
    fun create() {
        val verifyGetDetailsResponse =
            VerifyGetDetailsResponse.builder()
                .jobId("job_id")
                .addDegradedTool(
                    VerifyGetDetailsResponse.DegradedTool.builder()
                        .tool("tool")
                        .reason("reason")
                        .build()
                )
                .addEvidence(
                    VerifyGetDetailsResponse.Evidence.builder()
                        .code("code")
                        .detail("detail")
                        .family("family")
                        .score(0.0)
                        .tool("tool")
                        .data(
                            VerifyGetDetailsResponse.Evidence.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .hard(true)
                        .build()
                )
                .addHeatmap(
                    VerifyGetDetailsResponse.Heatmap.builder()
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .kind("kind")
                        .page(0L)
                        .url("url")
                        .score(0.0)
                        .build()
                )
                .addPageDimension(
                    VerifyGetDetailsResponse.PageDimension.builder()
                        .height(0L)
                        .page(0L)
                        .width(0L)
                        .build()
                )
                .addRegion(
                    VerifyGetDetailsResponse.Region.builder()
                        .bbox(listOf(0L, 0L, 0L, 0L))
                        .detail("detail")
                        .kind("kind")
                        .page(0L)
                        .score(0.0)
                        .source("source")
                        .primary(true)
                        .review("review")
                        .reviewNote("review_note")
                        .build()
                )
                .subScores(
                    VerifyGetDetailsResponse.SubScores.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        assertThat(verifyGetDetailsResponse.jobId()).isEqualTo("job_id")
        assertThat(verifyGetDetailsResponse.degradedTools().getOrNull())
            .containsExactly(
                VerifyGetDetailsResponse.DegradedTool.builder()
                    .tool("tool")
                    .reason("reason")
                    .build()
            )
        assertThat(verifyGetDetailsResponse.evidence().getOrNull())
            .containsExactly(
                VerifyGetDetailsResponse.Evidence.builder()
                    .code("code")
                    .detail("detail")
                    .family("family")
                    .score(0.0)
                    .tool("tool")
                    .data(
                        VerifyGetDetailsResponse.Evidence.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .hard(true)
                    .build()
            )
        assertThat(verifyGetDetailsResponse.heatmaps().getOrNull())
            .containsExactly(
                VerifyGetDetailsResponse.Heatmap.builder()
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .kind("kind")
                    .page(0L)
                    .url("url")
                    .score(0.0)
                    .build()
            )
        assertThat(verifyGetDetailsResponse.pageDimensions().getOrNull())
            .containsExactly(
                VerifyGetDetailsResponse.PageDimension.builder()
                    .height(0L)
                    .page(0L)
                    .width(0L)
                    .build()
            )
        assertThat(verifyGetDetailsResponse.regions().getOrNull())
            .containsExactly(
                VerifyGetDetailsResponse.Region.builder()
                    .bbox(listOf(0L, 0L, 0L, 0L))
                    .detail("detail")
                    .kind("kind")
                    .page(0L)
                    .score(0.0)
                    .source("source")
                    .primary(true)
                    .review("review")
                    .reviewNote("review_note")
                    .build()
            )
        assertThat(verifyGetDetailsResponse.subScores())
            .contains(
                VerifyGetDetailsResponse.SubScores.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyGetDetailsResponse =
            VerifyGetDetailsResponse.builder()
                .jobId("job_id")
                .addDegradedTool(
                    VerifyGetDetailsResponse.DegradedTool.builder()
                        .tool("tool")
                        .reason("reason")
                        .build()
                )
                .addEvidence(
                    VerifyGetDetailsResponse.Evidence.builder()
                        .code("code")
                        .detail("detail")
                        .family("family")
                        .score(0.0)
                        .tool("tool")
                        .data(
                            VerifyGetDetailsResponse.Evidence.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .hard(true)
                        .build()
                )
                .addHeatmap(
                    VerifyGetDetailsResponse.Heatmap.builder()
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .kind("kind")
                        .page(0L)
                        .url("url")
                        .score(0.0)
                        .build()
                )
                .addPageDimension(
                    VerifyGetDetailsResponse.PageDimension.builder()
                        .height(0L)
                        .page(0L)
                        .width(0L)
                        .build()
                )
                .addRegion(
                    VerifyGetDetailsResponse.Region.builder()
                        .bbox(listOf(0L, 0L, 0L, 0L))
                        .detail("detail")
                        .kind("kind")
                        .page(0L)
                        .score(0.0)
                        .source("source")
                        .primary(true)
                        .review("review")
                        .reviewNote("review_note")
                        .build()
                )
                .subScores(
                    VerifyGetDetailsResponse.SubScores.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        val roundtrippedVerifyGetDetailsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyGetDetailsResponse),
                jacksonTypeRef<VerifyGetDetailsResponse>(),
            )

        assertThat(roundtrippedVerifyGetDetailsResponse).isEqualTo(verifyGetDetailsResponse)
    }
}
