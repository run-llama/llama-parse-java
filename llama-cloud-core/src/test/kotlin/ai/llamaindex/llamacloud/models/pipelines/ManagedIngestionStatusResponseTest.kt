// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedIngestionStatusResponseTest {

    @Test
    fun create() {
        val managedIngestionStatusResponse =
            ManagedIngestionStatusResponse.builder()
                .status(ManagedIngestionStatusResponse.Status.CANCELLED)
                .deploymentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addError(
                    ManagedIngestionStatusResponse.Error.builder()
                        .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .message("message")
                        .step(ManagedIngestionStatusResponse.Error.Step.DATA_SOURCE)
                        .build()
                )
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(managedIngestionStatusResponse.status())
            .isEqualTo(ManagedIngestionStatusResponse.Status.CANCELLED)
        assertThat(managedIngestionStatusResponse.deploymentDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(managedIngestionStatusResponse.effectiveAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(managedIngestionStatusResponse.error().getOrNull())
            .containsExactly(
                ManagedIngestionStatusResponse.Error.builder()
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .message("message")
                    .step(ManagedIngestionStatusResponse.Error.Step.DATA_SOURCE)
                    .build()
            )
        assertThat(managedIngestionStatusResponse.jobId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val managedIngestionStatusResponse =
            ManagedIngestionStatusResponse.builder()
                .status(ManagedIngestionStatusResponse.Status.CANCELLED)
                .deploymentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addError(
                    ManagedIngestionStatusResponse.Error.builder()
                        .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .message("message")
                        .step(ManagedIngestionStatusResponse.Error.Step.DATA_SOURCE)
                        .build()
                )
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedManagedIngestionStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(managedIngestionStatusResponse),
                jacksonTypeRef<ManagedIngestionStatusResponse>(),
            )

        assertThat(roundtrippedManagedIngestionStatusResponse)
            .isEqualTo(managedIngestionStatusResponse)
    }
}
