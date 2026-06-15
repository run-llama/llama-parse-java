// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudJiraDataSourceV2Test {

    @Test
    fun create() {
        val cloudJiraDataSourceV2 =
            CloudJiraDataSourceV2.builder()
                .authenticationMechanism("authentication_mechanism")
                .query("query")
                .serverUrl("server_url")
                .apiToken("api_token")
                .apiVersion(CloudJiraDataSourceV2.ApiVersion._2)
                .className("class_name")
                .cloudId("cloud_id")
                .email("email")
                .expand("expand")
                .addField("string")
                .getPermissions(true)
                .requestsPerMinute(0L)
                .supportsAccessControl(true)
                .build()

        assertThat(cloudJiraDataSourceV2.authenticationMechanism())
            .isEqualTo("authentication_mechanism")
        assertThat(cloudJiraDataSourceV2.query()).isEqualTo("query")
        assertThat(cloudJiraDataSourceV2.serverUrl()).isEqualTo("server_url")
        assertThat(cloudJiraDataSourceV2.apiToken()).contains("api_token")
        assertThat(cloudJiraDataSourceV2.apiVersion()).contains(CloudJiraDataSourceV2.ApiVersion._2)
        assertThat(cloudJiraDataSourceV2.className()).contains("class_name")
        assertThat(cloudJiraDataSourceV2.cloudId()).contains("cloud_id")
        assertThat(cloudJiraDataSourceV2.email()).contains("email")
        assertThat(cloudJiraDataSourceV2.expand()).contains("expand")
        assertThat(cloudJiraDataSourceV2.fields().getOrNull()).containsExactly("string")
        assertThat(cloudJiraDataSourceV2.getPermissions()).contains(true)
        assertThat(cloudJiraDataSourceV2.requestsPerMinute()).contains(0L)
        assertThat(cloudJiraDataSourceV2.supportsAccessControl()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudJiraDataSourceV2 =
            CloudJiraDataSourceV2.builder()
                .authenticationMechanism("authentication_mechanism")
                .query("query")
                .serverUrl("server_url")
                .apiToken("api_token")
                .apiVersion(CloudJiraDataSourceV2.ApiVersion._2)
                .className("class_name")
                .cloudId("cloud_id")
                .email("email")
                .expand("expand")
                .addField("string")
                .getPermissions(true)
                .requestsPerMinute(0L)
                .supportsAccessControl(true)
                .build()

        val roundtrippedCloudJiraDataSourceV2 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudJiraDataSourceV2),
                jacksonTypeRef<CloudJiraDataSourceV2>(),
            )

        assertThat(roundtrippedCloudJiraDataSourceV2).isEqualTo(cloudJiraDataSourceV2)
    }
}
