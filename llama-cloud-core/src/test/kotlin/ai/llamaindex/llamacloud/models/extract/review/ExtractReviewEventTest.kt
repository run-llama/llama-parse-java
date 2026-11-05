// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractReviewEventTest {

    @Test
    fun create() {
        val extractReviewEvent =
            ExtractReviewEvent.builder()
                .id("id")
                .actorId("actor_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .kind(ExtractReviewEvent.Kind.APPROVED)
                .detail(
                    ExtractReviewEvent.Detail.ExtractReviewCreatedDetail.builder()
                        .confidenceThreshold(0.0)
                        .addFieldsInScope("string")
                        .origin(ExtractReviewEvent.Detail.ExtractReviewCreatedDetail.Origin.API)
                        .addRequiredField("string")
                        .build()
                )
                .path("path")
                .valueAfter(JsonValue.from(mapOf<String, Any>()))
                .valueBefore(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(extractReviewEvent.id()).isEqualTo("id")
        assertThat(extractReviewEvent.actorId()).isEqualTo("actor_id")
        assertThat(extractReviewEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(extractReviewEvent.kind()).isEqualTo(ExtractReviewEvent.Kind.APPROVED)
        assertThat(extractReviewEvent.detail())
            .contains(
                ExtractReviewEvent.Detail.ofExtractReviewCreated(
                    ExtractReviewEvent.Detail.ExtractReviewCreatedDetail.builder()
                        .confidenceThreshold(0.0)
                        .addFieldsInScope("string")
                        .origin(ExtractReviewEvent.Detail.ExtractReviewCreatedDetail.Origin.API)
                        .addRequiredField("string")
                        .build()
                )
            )
        assertThat(extractReviewEvent.path()).contains("path")
        assertThat(extractReviewEvent._valueAfter()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(extractReviewEvent._valueBefore())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractReviewEvent =
            ExtractReviewEvent.builder()
                .id("id")
                .actorId("actor_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .kind(ExtractReviewEvent.Kind.APPROVED)
                .detail(
                    ExtractReviewEvent.Detail.ExtractReviewCreatedDetail.builder()
                        .confidenceThreshold(0.0)
                        .addFieldsInScope("string")
                        .origin(ExtractReviewEvent.Detail.ExtractReviewCreatedDetail.Origin.API)
                        .addRequiredField("string")
                        .build()
                )
                .path("path")
                .valueAfter(JsonValue.from(mapOf<String, Any>()))
                .valueBefore(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedExtractReviewEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractReviewEvent),
                jacksonTypeRef<ExtractReviewEvent>(),
            )

        assertThat(roundtrippedExtractReviewEvent).isEqualTo(extractReviewEvent)
    }
}
