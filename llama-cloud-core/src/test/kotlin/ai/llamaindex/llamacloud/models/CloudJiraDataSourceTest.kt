// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudJiraDataSourceTest {

    @Test
    fun create() {
        val cloudJiraDataSource =
            CloudJiraDataSource.builder()
                .authenticationMechanism("authentication_mechanism")
                .query("query")
                .apiToken("api_token")
                .className("class_name")
                .cloudId("cloud_id")
                .email("email")
                .serverUrl("server_url")
                .supportsAccessControl(true)
                .build()

        assertThat(cloudJiraDataSource.authenticationMechanism())
            .isEqualTo("authentication_mechanism")
        assertThat(cloudJiraDataSource.query()).isEqualTo("query")
        assertThat(cloudJiraDataSource.apiToken()).contains("api_token")
        assertThat(cloudJiraDataSource.className()).contains("class_name")
        assertThat(cloudJiraDataSource.cloudId()).contains("cloud_id")
        assertThat(cloudJiraDataSource.email()).contains("email")
        assertThat(cloudJiraDataSource.serverUrl()).contains("server_url")
        assertThat(cloudJiraDataSource.supportsAccessControl()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudJiraDataSource =
            CloudJiraDataSource.builder()
                .authenticationMechanism("authentication_mechanism")
                .query("query")
                .apiToken("api_token")
                .className("class_name")
                .cloudId("cloud_id")
                .email("email")
                .serverUrl("server_url")
                .supportsAccessControl(true)
                .build()

        val roundtrippedCloudJiraDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudJiraDataSource),
                jacksonTypeRef<CloudJiraDataSource>(),
            )

        assertThat(roundtrippedCloudJiraDataSource).isEqualTo(cloudJiraDataSource)
    }
}
