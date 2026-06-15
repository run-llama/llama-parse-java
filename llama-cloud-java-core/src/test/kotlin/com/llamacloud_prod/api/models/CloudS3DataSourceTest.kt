// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudS3DataSourceTest {

    @Test
    fun create() {
        val cloudS3DataSource =
            CloudS3DataSource.builder()
                .bucket("bucket")
                .awsAccessId("aws_access_id")
                .awsAccessSecret("aws_access_secret")
                .className("class_name")
                .prefix("prefix")
                .regexPattern("regex_pattern")
                .s3EndpointUrl("s3_endpoint_url")
                .supportsAccessControl(true)
                .build()

        assertThat(cloudS3DataSource.bucket()).isEqualTo("bucket")
        assertThat(cloudS3DataSource.awsAccessId()).contains("aws_access_id")
        assertThat(cloudS3DataSource.awsAccessSecret()).contains("aws_access_secret")
        assertThat(cloudS3DataSource.className()).contains("class_name")
        assertThat(cloudS3DataSource.prefix()).contains("prefix")
        assertThat(cloudS3DataSource.regexPattern()).contains("regex_pattern")
        assertThat(cloudS3DataSource.s3EndpointUrl()).contains("s3_endpoint_url")
        assertThat(cloudS3DataSource.supportsAccessControl()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudS3DataSource =
            CloudS3DataSource.builder()
                .bucket("bucket")
                .awsAccessId("aws_access_id")
                .awsAccessSecret("aws_access_secret")
                .className("class_name")
                .prefix("prefix")
                .regexPattern("regex_pattern")
                .s3EndpointUrl("s3_endpoint_url")
                .supportsAccessControl(true)
                .build()

        val roundtrippedCloudS3DataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudS3DataSource),
                jacksonTypeRef<CloudS3DataSource>(),
            )

        assertThat(roundtrippedCloudS3DataSource).isEqualTo(cloudS3DataSource)
    }
}
