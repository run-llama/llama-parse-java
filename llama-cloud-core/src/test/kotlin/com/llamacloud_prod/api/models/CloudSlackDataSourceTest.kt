// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudSlackDataSourceTest {

    @Test
    fun create() {
        val cloudSlackDataSource =
            CloudSlackDataSource.builder()
                .slackToken("slack_token")
                .channelIds("channel_ids")
                .channelPatterns("channel_patterns")
                .className("class_name")
                .earliestDate("earliest_date")
                .earliestDateTimestamp(0.0)
                .latestDate("latest_date")
                .latestDateTimestamp(0.0)
                .supportsAccessControl(true)
                .build()

        assertThat(cloudSlackDataSource.slackToken()).isEqualTo("slack_token")
        assertThat(cloudSlackDataSource.channelIds()).contains("channel_ids")
        assertThat(cloudSlackDataSource.channelPatterns()).contains("channel_patterns")
        assertThat(cloudSlackDataSource.className()).contains("class_name")
        assertThat(cloudSlackDataSource.earliestDate()).contains("earliest_date")
        assertThat(cloudSlackDataSource.earliestDateTimestamp()).contains(0.0)
        assertThat(cloudSlackDataSource.latestDate()).contains("latest_date")
        assertThat(cloudSlackDataSource.latestDateTimestamp()).contains(0.0)
        assertThat(cloudSlackDataSource.supportsAccessControl()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudSlackDataSource =
            CloudSlackDataSource.builder()
                .slackToken("slack_token")
                .channelIds("channel_ids")
                .channelPatterns("channel_patterns")
                .className("class_name")
                .earliestDate("earliest_date")
                .earliestDateTimestamp(0.0)
                .latestDate("latest_date")
                .latestDateTimestamp(0.0)
                .supportsAccessControl(true)
                .build()

        val roundtrippedCloudSlackDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudSlackDataSource),
                jacksonTypeRef<CloudSlackDataSource>(),
            )

        assertThat(roundtrippedCloudSlackDataSource).isEqualTo(cloudSlackDataSource)
    }
}
