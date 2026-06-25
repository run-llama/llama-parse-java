package com.llamacloud_prod.api.errors

open class LlamaCloudException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
