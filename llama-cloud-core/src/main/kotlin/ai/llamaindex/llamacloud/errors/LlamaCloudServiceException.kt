// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.errors

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.Headers

abstract class LlamaCloudServiceException
protected constructor(message: String, cause: Throwable? = null) :
    LlamaCloudException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
