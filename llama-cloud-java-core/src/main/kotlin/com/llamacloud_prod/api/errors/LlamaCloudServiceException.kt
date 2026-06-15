// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.errors

import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.http.Headers

abstract class LlamaCloudServiceException
protected constructor(message: String, cause: Throwable? = null) :
    LlamaCloudException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
