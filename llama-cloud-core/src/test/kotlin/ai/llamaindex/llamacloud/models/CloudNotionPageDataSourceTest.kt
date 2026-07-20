// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudNotionPageDataSourceTest {

    @Test
    fun create() {
        val cloudNotionPageDataSource =
            CloudNotionPageDataSource.builder()
                .integrationToken("integration_token")
                .className("class_name")
                .databaseIds("database_ids")
                .pageIds("page_ids")
                .supportsAccessControl(true)
                .build()

        assertThat(cloudNotionPageDataSource.integrationToken()).isEqualTo("integration_token")
        assertThat(cloudNotionPageDataSource.className()).contains("class_name")
        assertThat(cloudNotionPageDataSource.databaseIds()).contains("database_ids")
        assertThat(cloudNotionPageDataSource.pageIds()).contains("page_ids")
        assertThat(cloudNotionPageDataSource.supportsAccessControl()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudNotionPageDataSource =
            CloudNotionPageDataSource.builder()
                .integrationToken("integration_token")
                .className("class_name")
                .databaseIds("database_ids")
                .pageIds("page_ids")
                .supportsAccessControl(true)
                .build()

        val roundtrippedCloudNotionPageDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudNotionPageDataSource),
                jacksonTypeRef<CloudNotionPageDataSource>(),
            )

        assertThat(roundtrippedCloudNotionPageDataSource).isEqualTo(cloudNotionPageDataSource)
    }
}
