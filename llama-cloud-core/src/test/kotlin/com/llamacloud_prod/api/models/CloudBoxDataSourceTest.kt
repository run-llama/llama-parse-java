// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudBoxDataSourceTest {

    @Test
    fun create() {
        val cloudBoxDataSource =
            CloudBoxDataSource.builder()
                .authenticationMechanism(CloudBoxDataSource.AuthenticationMechanism.CCG)
                .className("class_name")
                .clientId("client_id")
                .clientSecret("client_secret")
                .developerToken("developer_token")
                .enterpriseId("enterprise_id")
                .folderId("folder_id")
                .supportsAccessControl(true)
                .userId("user_id")
                .build()

        assertThat(cloudBoxDataSource.authenticationMechanism())
            .isEqualTo(CloudBoxDataSource.AuthenticationMechanism.CCG)
        assertThat(cloudBoxDataSource.className()).contains("class_name")
        assertThat(cloudBoxDataSource.clientId()).contains("client_id")
        assertThat(cloudBoxDataSource.clientSecret()).contains("client_secret")
        assertThat(cloudBoxDataSource.developerToken()).contains("developer_token")
        assertThat(cloudBoxDataSource.enterpriseId()).contains("enterprise_id")
        assertThat(cloudBoxDataSource.folderId()).contains("folder_id")
        assertThat(cloudBoxDataSource.supportsAccessControl()).contains(true)
        assertThat(cloudBoxDataSource.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudBoxDataSource =
            CloudBoxDataSource.builder()
                .authenticationMechanism(CloudBoxDataSource.AuthenticationMechanism.CCG)
                .className("class_name")
                .clientId("client_id")
                .clientSecret("client_secret")
                .developerToken("developer_token")
                .enterpriseId("enterprise_id")
                .folderId("folder_id")
                .supportsAccessControl(true)
                .userId("user_id")
                .build()

        val roundtrippedCloudBoxDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudBoxDataSource),
                jacksonTypeRef<CloudBoxDataSource>(),
            )

        assertThat(roundtrippedCloudBoxDataSource).isEqualTo(cloudBoxDataSource)
    }
}
