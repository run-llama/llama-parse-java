// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.datasources

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSourceReaderVersionMetadataTest {

    @Test
    fun create() {
        val dataSourceReaderVersionMetadata =
            DataSourceReaderVersionMetadata.builder()
                .readerVersion(DataSourceReaderVersionMetadata.ReaderVersion._1_0)
                .build()

        assertThat(dataSourceReaderVersionMetadata.readerVersion())
            .contains(DataSourceReaderVersionMetadata.ReaderVersion._1_0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataSourceReaderVersionMetadata =
            DataSourceReaderVersionMetadata.builder()
                .readerVersion(DataSourceReaderVersionMetadata.ReaderVersion._1_0)
                .build()

        val roundtrippedDataSourceReaderVersionMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataSourceReaderVersionMetadata),
                jacksonTypeRef<DataSourceReaderVersionMetadata>(),
            )

        assertThat(roundtrippedDataSourceReaderVersionMetadata)
            .isEqualTo(dataSourceReaderVersionMetadata)
    }
}
