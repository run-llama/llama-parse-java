package com.llamacloud_prod.api.errors

class LlamaCloudIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LlamaCloudException(message, cause)
