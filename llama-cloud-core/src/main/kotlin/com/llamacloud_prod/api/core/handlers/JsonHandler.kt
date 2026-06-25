@file:JvmName("JsonHandler")

package com.llamacloud_prod.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponse.Handler
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw LlamaCloudInvalidDataException("Error reading response", e)
            }
    }
