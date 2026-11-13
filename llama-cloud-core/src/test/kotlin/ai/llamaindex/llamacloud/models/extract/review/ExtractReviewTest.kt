// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractReviewTest {

    @Test
    fun create() {
        val extractReview =
            ExtractReview.builder()
                .id("id")
                .confidenceThreshold(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .decidedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .decidedBy("decided_by")
                .decidedReason("decided_reason")
                .fieldActions(
                    ExtractReview.FieldActions.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "action" to "clear",
                                    "actor_id" to "actor_id",
                                    "at" to "2019-12-27T18:11:19.117Z",
                                    "value" to mapOf<String, Any>(),
                                )
                            ),
                        )
                        .build()
                )
                .addFieldsInScope("string")
                .addFlag(
                    ExtractReview.Flag.builder()
                        .handled(true)
                        .path("path")
                        .reason(ExtractReview.Flag.Reason.BELOW_THRESHOLD)
                        .cell(ExtractReview.Flag.Cell.builder().row(0L).column("column").build())
                        .confidence(0.0)
                        .build()
                )
                .jobId("job_id")
                .addOpenFlag("string")
                .originalResult(
                    ExtractReview.OriginalResult.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addRequiredField("string")
                .retainUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .reviewedResult(
                    ExtractReview.ReviewedResult.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .revision(0L)
                .sourceFileId("source_file_id")
                .status(ExtractReview.Status.APPROVED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(extractReview.id()).isEqualTo("id")
        assertThat(extractReview.confidenceThreshold()).isEqualTo(0.0)
        assertThat(extractReview.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(extractReview.decidedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(extractReview.decidedBy()).contains("decided_by")
        assertThat(extractReview.decidedReason()).contains("decided_reason")
        assertThat(extractReview.fieldActions())
            .isEqualTo(
                ExtractReview.FieldActions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "action" to "clear",
                                "actor_id" to "actor_id",
                                "at" to "2019-12-27T18:11:19.117Z",
                                "value" to mapOf<String, Any>(),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(extractReview.fieldsInScope()).containsExactly("string")
        assertThat(extractReview.flags())
            .containsExactly(
                ExtractReview.Flag.builder()
                    .handled(true)
                    .path("path")
                    .reason(ExtractReview.Flag.Reason.BELOW_THRESHOLD)
                    .cell(ExtractReview.Flag.Cell.builder().row(0L).column("column").build())
                    .confidence(0.0)
                    .build()
            )
        assertThat(extractReview.jobId()).isEqualTo("job_id")
        assertThat(extractReview.openFlags()).containsExactly("string")
        assertThat(extractReview.originalResult())
            .contains(
                ExtractReview.OriginalResult.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(extractReview.requiredFields()).containsExactly("string")
        assertThat(extractReview.retainUntil())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(extractReview.reviewedResult())
            .isEqualTo(
                ExtractReview.ReviewedResult.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(extractReview.revision()).isEqualTo(0L)
        assertThat(extractReview.sourceFileId()).contains("source_file_id")
        assertThat(extractReview.status()).isEqualTo(ExtractReview.Status.APPROVED)
        assertThat(extractReview.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractReview =
            ExtractReview.builder()
                .id("id")
                .confidenceThreshold(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .decidedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .decidedBy("decided_by")
                .decidedReason("decided_reason")
                .fieldActions(
                    ExtractReview.FieldActions.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "action" to "clear",
                                    "actor_id" to "actor_id",
                                    "at" to "2019-12-27T18:11:19.117Z",
                                    "value" to mapOf<String, Any>(),
                                )
                            ),
                        )
                        .build()
                )
                .addFieldsInScope("string")
                .addFlag(
                    ExtractReview.Flag.builder()
                        .handled(true)
                        .path("path")
                        .reason(ExtractReview.Flag.Reason.BELOW_THRESHOLD)
                        .cell(ExtractReview.Flag.Cell.builder().row(0L).column("column").build())
                        .confidence(0.0)
                        .build()
                )
                .jobId("job_id")
                .addOpenFlag("string")
                .originalResult(
                    ExtractReview.OriginalResult.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addRequiredField("string")
                .retainUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .reviewedResult(
                    ExtractReview.ReviewedResult.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .revision(0L)
                .sourceFileId("source_file_id")
                .status(ExtractReview.Status.APPROVED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedExtractReview =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractReview),
                jacksonTypeRef<ExtractReview>(),
            )

        assertThat(roundtrippedExtractReview).isEqualTo(extractReview)
    }
}
