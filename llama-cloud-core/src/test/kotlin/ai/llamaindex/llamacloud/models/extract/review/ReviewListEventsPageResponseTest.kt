// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReviewListEventsPageResponseTest {

    @Test
    fun create() {
        val reviewListEventsPageResponse =
            ReviewListEventsPageResponse.builder()
                .addItem(
                    ExtractReviewEvent.builder()
                        .id("id")
                        .actorId("actor_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .kind(ExtractReviewEvent.Kind.APPROVED)
                        .detail(
                            ExtractReviewEvent.Detail.ExtractReviewCreatedDetail.builder()
                                .confidenceThreshold(0.0)
                                .addFieldsInScope("string")
                                .origin(
                                    ExtractReviewEvent.Detail.ExtractReviewCreatedDetail.Origin.API
                                )
                                .addRequiredField("string")
                                .build()
                        )
                        .path("path")
                        .valueAfter(JsonValue.from(mapOf<String, Any>()))
                        .valueBefore(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(reviewListEventsPageResponse.items())
            .containsExactly(
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
            )
        assertThat(reviewListEventsPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(reviewListEventsPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reviewListEventsPageResponse =
            ReviewListEventsPageResponse.builder()
                .addItem(
                    ExtractReviewEvent.builder()
                        .id("id")
                        .actorId("actor_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .kind(ExtractReviewEvent.Kind.APPROVED)
                        .detail(
                            ExtractReviewEvent.Detail.ExtractReviewCreatedDetail.builder()
                                .confidenceThreshold(0.0)
                                .addFieldsInScope("string")
                                .origin(
                                    ExtractReviewEvent.Detail.ExtractReviewCreatedDetail.Origin.API
                                )
                                .addRequiredField("string")
                                .build()
                        )
                        .path("path")
                        .valueAfter(JsonValue.from(mapOf<String, Any>()))
                        .valueBefore(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedReviewListEventsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reviewListEventsPageResponse),
                jacksonTypeRef<ReviewListEventsPageResponse>(),
            )

        assertThat(roundtrippedReviewListEventsPageResponse).isEqualTo(reviewListEventsPageResponse)
    }
}
