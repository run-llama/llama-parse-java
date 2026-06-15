package com.llamacloud_prod.api.errors

class LlamaCloudInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LlamaCloudException(message, cause)
