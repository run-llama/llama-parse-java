// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.batch.jobitems

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobItemListResponseTest {

    @Test
    fun create() {
        val jobItemListResponse =
            JobItemListResponse.builder()
                .itemId("item_id")
                .itemName("item_name")
                .status(JobItemListResponse.Status.PENDING)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .jobId("job_id")
                .jobRecordId("job_record_id")
                .skipReason("skip_reason")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(jobItemListResponse.itemId()).isEqualTo("item_id")
        assertThat(jobItemListResponse.itemName()).isEqualTo("item_name")
        assertThat(jobItemListResponse.status()).isEqualTo(JobItemListResponse.Status.PENDING)
        assertThat(jobItemListResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(jobItemListResponse.effectiveAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(jobItemListResponse.errorMessage()).contains("error_message")
        assertThat(jobItemListResponse.jobId()).contains("job_id")
        assertThat(jobItemListResponse.jobRecordId()).contains("job_record_id")
        assertThat(jobItemListResponse.skipReason()).contains("skip_reason")
        assertThat(jobItemListResponse.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobItemListResponse =
            JobItemListResponse.builder()
                .itemId("item_id")
                .itemName("item_name")
                .status(JobItemListResponse.Status.PENDING)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorMessage("error_message")
                .jobId("job_id")
                .jobRecordId("job_record_id")
                .skipReason("skip_reason")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedJobItemListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobItemListResponse),
                jacksonTypeRef<JobItemListResponse>(),
            )

        assertThat(roundtrippedJobItemListResponse).isEqualTo(jobItemListResponse)
    }
}
