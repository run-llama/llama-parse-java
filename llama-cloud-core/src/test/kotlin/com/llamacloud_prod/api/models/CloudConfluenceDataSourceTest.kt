// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudConfluenceDataSourceTest {

    @Test
    fun create() {
        val cloudConfluenceDataSource =
            CloudConfluenceDataSource.builder()
                .authenticationMechanism("authentication_mechanism")
                .serverUrl("server_url")
                .apiToken("api_token")
                .className("class_name")
                .cql("cql")
                .failureHandling(FailureHandlingConfig.builder().skipListFailures(true).build())
                .indexRestrictedPages(true)
                .keepMarkdownFormat(true)
                .label("label")
                .pageIds("page_ids")
                .spaceKey("space_key")
                .supportsAccessControl(true)
                .syncPermissions(true)
                .userName("user_name")
                .build()

        assertThat(cloudConfluenceDataSource.authenticationMechanism())
            .isEqualTo("authentication_mechanism")
        assertThat(cloudConfluenceDataSource.serverUrl()).isEqualTo("server_url")
        assertThat(cloudConfluenceDataSource.apiToken()).contains("api_token")
        assertThat(cloudConfluenceDataSource.className()).contains("class_name")
        assertThat(cloudConfluenceDataSource.cql()).contains("cql")
        assertThat(cloudConfluenceDataSource.failureHandling())
            .contains(FailureHandlingConfig.builder().skipListFailures(true).build())
        assertThat(cloudConfluenceDataSource.indexRestrictedPages()).contains(true)
        assertThat(cloudConfluenceDataSource.keepMarkdownFormat()).contains(true)
        assertThat(cloudConfluenceDataSource.label()).contains("label")
        assertThat(cloudConfluenceDataSource.pageIds()).contains("page_ids")
        assertThat(cloudConfluenceDataSource.spaceKey()).contains("space_key")
        assertThat(cloudConfluenceDataSource.supportsAccessControl()).contains(true)
        assertThat(cloudConfluenceDataSource.syncPermissions()).contains(true)
        assertThat(cloudConfluenceDataSource.userName()).contains("user_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudConfluenceDataSource =
            CloudConfluenceDataSource.builder()
                .authenticationMechanism("authentication_mechanism")
                .serverUrl("server_url")
                .apiToken("api_token")
                .className("class_name")
                .cql("cql")
                .failureHandling(FailureHandlingConfig.builder().skipListFailures(true).build())
                .indexRestrictedPages(true)
                .keepMarkdownFormat(true)
                .label("label")
                .pageIds("page_ids")
                .spaceKey("space_key")
                .supportsAccessControl(true)
                .syncPermissions(true)
                .userName("user_name")
                .build()

        val roundtrippedCloudConfluenceDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudConfluenceDataSource),
                jacksonTypeRef<CloudConfluenceDataSource>(),
            )

        assertThat(roundtrippedCloudConfluenceDataSource).isEqualTo(cloudConfluenceDataSource)
    }
}
