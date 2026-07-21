// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.batch.jobitems

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobItemListPageResponseTest {

    @Test
    fun create() {
        val jobItemListPageResponse =
            JobItemListPageResponse.builder()
                .addItem(
                    JobItemListResponse.builder()
                        .itemId("item_id")
                        .itemName("item_name")
                        .status(JobItemListResponse.Status.CANCELLED)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("error_message")
                        .jobId("job_id")
                        .jobRecordId("job_record_id")
                        .skipReason("skip_reason")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(jobItemListPageResponse.items().getOrNull())
            .containsExactly(
                JobItemListResponse.builder()
                    .itemId("item_id")
                    .itemName("item_name")
                    .status(JobItemListResponse.Status.CANCELLED)
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .errorMessage("error_message")
                    .jobId("job_id")
                    .jobRecordId("job_record_id")
                    .skipReason("skip_reason")
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(jobItemListPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(jobItemListPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobItemListPageResponse =
            JobItemListPageResponse.builder()
                .addItem(
                    JobItemListResponse.builder()
                        .itemId("item_id")
                        .itemName("item_name")
                        .status(JobItemListResponse.Status.CANCELLED)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("error_message")
                        .jobId("job_id")
                        .jobRecordId("job_record_id")
                        .skipReason("skip_reason")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedJobItemListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobItemListPageResponse),
                jacksonTypeRef<JobItemListPageResponse>(),
            )

        assertThat(roundtrippedJobItemListPageResponse).isEqualTo(jobItemListPageResponse)
    }
}
