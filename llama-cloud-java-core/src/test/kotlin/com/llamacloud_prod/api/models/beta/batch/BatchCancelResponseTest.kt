// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCancelResponseTest {

    @Test
    fun create() {
        val batchCancelResponse =
            BatchCancelResponse.builder()
                .jobId("job_id")
                .message("message")
                .processedItems(0L)
                .status(BatchCancelResponse.Status.CANCELLED)
                .build()

        assertThat(batchCancelResponse.jobId()).isEqualTo("job_id")
        assertThat(batchCancelResponse.message()).isEqualTo("message")
        assertThat(batchCancelResponse.processedItems()).isEqualTo(0L)
        assertThat(batchCancelResponse.status()).isEqualTo(BatchCancelResponse.Status.CANCELLED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCancelResponse =
            BatchCancelResponse.builder()
                .jobId("job_id")
                .message("message")
                .processedItems(0L)
                .status(BatchCancelResponse.Status.CANCELLED)
                .build()

        val roundtrippedBatchCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCancelResponse),
                jacksonTypeRef<BatchCancelResponse>(),
            )

        assertThat(roundtrippedBatchCancelResponse).isEqualTo(batchCancelResponse)
    }
}
