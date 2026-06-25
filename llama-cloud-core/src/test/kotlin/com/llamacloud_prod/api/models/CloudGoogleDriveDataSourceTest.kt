// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudGoogleDriveDataSourceTest {

    @Test
    fun create() {
        val cloudGoogleDriveDataSource =
            CloudGoogleDriveDataSource.builder()
                .folderId("folder_id")
                .className("class_name")
                .serviceAccountKey(
                    CloudGoogleDriveDataSource.ServiceAccountKey.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .supportsAccessControl(true)
                .build()

        assertThat(cloudGoogleDriveDataSource.folderId()).isEqualTo("folder_id")
        assertThat(cloudGoogleDriveDataSource.className()).contains("class_name")
        assertThat(cloudGoogleDriveDataSource.serviceAccountKey())
            .contains(
                CloudGoogleDriveDataSource.ServiceAccountKey.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(cloudGoogleDriveDataSource.supportsAccessControl()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudGoogleDriveDataSource =
            CloudGoogleDriveDataSource.builder()
                .folderId("folder_id")
                .className("class_name")
                .serviceAccountKey(
                    CloudGoogleDriveDataSource.ServiceAccountKey.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .supportsAccessControl(true)
                .build()

        val roundtrippedCloudGoogleDriveDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudGoogleDriveDataSource),
                jacksonTypeRef<CloudGoogleDriveDataSource>(),
            )

        assertThat(roundtrippedCloudGoogleDriveDataSource).isEqualTo(cloudGoogleDriveDataSource)
    }
}
