// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.datasinks

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSinkListPaginatedPageResponseTest {

    @Test
    fun create() {
        val dataSinkListPaginatedPageResponse =
            DataSinkListPaginatedPageResponse.builder()
                .addItem(
                    DataSink.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .component(
                            DataSink.Component.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sinkType(DataSink.SinkType.ASTRA_DB)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(dataSinkListPaginatedPageResponse.items())
            .containsExactly(
                DataSink.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .component(
                        DataSink.Component.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sinkType(DataSink.SinkType.ASTRA_DB)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(dataSinkListPaginatedPageResponse.nextPageToken()).contains("next_page_token")
        assertThat(dataSinkListPaginatedPageResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataSinkListPaginatedPageResponse =
            DataSinkListPaginatedPageResponse.builder()
                .addItem(
                    DataSink.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .component(
                            DataSink.Component.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sinkType(DataSink.SinkType.ASTRA_DB)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedDataSinkListPaginatedPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataSinkListPaginatedPageResponse),
                jacksonTypeRef<DataSinkListPaginatedPageResponse>(),
            )

        assertThat(roundtrippedDataSinkListPaginatedPageResponse)
            .isEqualTo(dataSinkListPaginatedPageResponse)
    }
}
