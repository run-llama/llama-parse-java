@file:JvmName("EmptyHandler")

package com.llamacloud_prod.api.core.handlers

import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
