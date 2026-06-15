// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudOneDriveDataSourceTest {

    @Test
    fun create() {
        val cloudOneDriveDataSource =
            CloudOneDriveDataSource.builder()
                .clientId("client_id")
                .clientSecret("client_secret")
                .tenantId("tenant_id")
                .userPrincipalName("user_principal_name")
                .className("class_name")
                .folderId("folder_id")
                .folderPath("folder_path")
                .addRequiredExt("string")
                .supportsAccessControl(CloudOneDriveDataSource.SupportsAccessControl.TRUE)
                .build()

        assertThat(cloudOneDriveDataSource.clientId()).isEqualTo("client_id")
        assertThat(cloudOneDriveDataSource.clientSecret()).isEqualTo("client_secret")
        assertThat(cloudOneDriveDataSource.tenantId()).isEqualTo("tenant_id")
        assertThat(cloudOneDriveDataSource.userPrincipalName()).isEqualTo("user_principal_name")
        assertThat(cloudOneDriveDataSource.className()).contains("class_name")
        assertThat(cloudOneDriveDataSource.folderId()).contains("folder_id")
        assertThat(cloudOneDriveDataSource.folderPath()).contains("folder_path")
        assertThat(cloudOneDriveDataSource.requiredExts().getOrNull()).containsExactly("string")
        assertThat(cloudOneDriveDataSource.supportsAccessControl())
            .contains(CloudOneDriveDataSource.SupportsAccessControl.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudOneDriveDataSource =
            CloudOneDriveDataSource.builder()
                .clientId("client_id")
                .clientSecret("client_secret")
                .tenantId("tenant_id")
                .userPrincipalName("user_principal_name")
                .className("class_name")
                .folderId("folder_id")
                .folderPath("folder_path")
                .addRequiredExt("string")
                .supportsAccessControl(CloudOneDriveDataSource.SupportsAccessControl.TRUE)
                .build()

        val roundtrippedCloudOneDriveDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudOneDriveDataSource),
                jacksonTypeRef<CloudOneDriveDataSource>(),
            )

        assertThat(roundtrippedCloudOneDriveDataSource).isEqualTo(cloudOneDriveDataSource)
    }
}
