package ai.llamaindex.llamacloud.errors

open class LlamaCloudException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
