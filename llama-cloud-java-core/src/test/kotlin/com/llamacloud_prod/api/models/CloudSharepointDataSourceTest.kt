// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudSharepointDataSourceTest {

    @Test
    fun create() {
        val cloudSharepointDataSource =
            CloudSharepointDataSource.builder()
                .clientId("client_id")
                .clientSecret("client_secret")
                .tenantId("tenant_id")
                .className("class_name")
                .driveName("drive_name")
                .addExcludePathPattern("string")
                .folderId("folder_id")
                .folderPath("folder_path")
                .getPermissions(true)
                .addIncludePathPattern("string")
                .addRequiredExt("string")
                .siteId("site_id")
                .siteName("site_name")
                .supportsAccessControl(CloudSharepointDataSource.SupportsAccessControl.TRUE)
                .build()

        assertThat(cloudSharepointDataSource.clientId()).isEqualTo("client_id")
        assertThat(cloudSharepointDataSource.clientSecret()).isEqualTo("client_secret")
        assertThat(cloudSharepointDataSource.tenantId()).isEqualTo("tenant_id")
        assertThat(cloudSharepointDataSource.className()).contains("class_name")
        assertThat(cloudSharepointDataSource.driveName()).contains("drive_name")
        assertThat(cloudSharepointDataSource.excludePathPatterns().getOrNull())
            .containsExactly("string")
        assertThat(cloudSharepointDataSource.folderId()).contains("folder_id")
        assertThat(cloudSharepointDataSource.folderPath()).contains("folder_path")
        assertThat(cloudSharepointDataSource.getPermissions()).contains(true)
        assertThat(cloudSharepointDataSource.includePathPatterns().getOrNull())
            .containsExactly("string")
        assertThat(cloudSharepointDataSource.requiredExts().getOrNull()).containsExactly("string")
        assertThat(cloudSharepointDataSource.siteId()).contains("site_id")
        assertThat(cloudSharepointDataSource.siteName()).contains("site_name")
        assertThat(cloudSharepointDataSource.supportsAccessControl())
            .contains(CloudSharepointDataSource.SupportsAccessControl.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudSharepointDataSource =
            CloudSharepointDataSource.builder()
                .clientId("client_id")
                .clientSecret("client_secret")
                .tenantId("tenant_id")
                .className("class_name")
                .driveName("drive_name")
                .addExcludePathPattern("string")
                .folderId("folder_id")
                .folderPath("folder_path")
                .getPermissions(true)
                .addIncludePathPattern("string")
                .addRequiredExt("string")
                .siteId("site_id")
                .siteName("site_name")
                .supportsAccessControl(CloudSharepointDataSource.SupportsAccessControl.TRUE)
                .build()

        val roundtrippedCloudSharepointDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudSharepointDataSource),
                jacksonTypeRef<CloudSharepointDataSource>(),
            )

        assertThat(roundtrippedCloudSharepointDataSource).isEqualTo(cloudSharepointDataSource)
    }
}
