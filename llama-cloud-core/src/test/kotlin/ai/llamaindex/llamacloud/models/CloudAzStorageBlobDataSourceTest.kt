// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudAzStorageBlobDataSourceTest {

    @Test
    fun create() {
        val cloudAzStorageBlobDataSource =
            CloudAzStorageBlobDataSource.builder()
                .accountUrl("account_url")
                .containerName("container_name")
                .accountKey("account_key")
                .accountName("account_name")
                .blob("blob")
                .className("class_name")
                .clientId("client_id")
                .clientSecret("client_secret")
                .prefix("prefix")
                .supportsAccessControl(true)
                .tenantId("tenant_id")
                .build()

        assertThat(cloudAzStorageBlobDataSource.accountUrl()).isEqualTo("account_url")
        assertThat(cloudAzStorageBlobDataSource.containerName()).isEqualTo("container_name")
        assertThat(cloudAzStorageBlobDataSource.accountKey()).contains("account_key")
        assertThat(cloudAzStorageBlobDataSource.accountName()).contains("account_name")
        assertThat(cloudAzStorageBlobDataSource.blob()).contains("blob")
        assertThat(cloudAzStorageBlobDataSource.className()).contains("class_name")
        assertThat(cloudAzStorageBlobDataSource.clientId()).contains("client_id")
        assertThat(cloudAzStorageBlobDataSource.clientSecret()).contains("client_secret")
        assertThat(cloudAzStorageBlobDataSource.prefix()).contains("prefix")
        assertThat(cloudAzStorageBlobDataSource.supportsAccessControl()).contains(true)
        assertThat(cloudAzStorageBlobDataSource.tenantId()).contains("tenant_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudAzStorageBlobDataSource =
            CloudAzStorageBlobDataSource.builder()
                .accountUrl("account_url")
                .containerName("container_name")
                .accountKey("account_key")
                .accountName("account_name")
                .blob("blob")
                .className("class_name")
                .clientId("client_id")
                .clientSecret("client_secret")
                .prefix("prefix")
                .supportsAccessControl(true)
                .tenantId("tenant_id")
                .build()

        val roundtrippedCloudAzStorageBlobDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudAzStorageBlobDataSource),
                jacksonTypeRef<CloudAzStorageBlobDataSource>(),
            )

        assertThat(roundtrippedCloudAzStorageBlobDataSource).isEqualTo(cloudAzStorageBlobDataSource)
    }
}
