package com.mvukosav.studenthub.utils

import com.mvukosav.studenthub.network.ErrorCode
import com.mvukosav.studenthub.network.Response
import java.io.IOException

object ErrorManager {

    fun isErrorApi(errorList: List<String>?): Boolean {
        return errorList != null
    }

    fun <T> errorHandler(e: Throwable): Response<T> {
        return if (isNetworkError(e)) {
            Response.NetworkError()
        } else {
            Response.Error(-1, ErrorCode.UNKNOWN_ERROR.name)
        }
    }

    fun <T> parserApiError(errorList: List<String>?): Response.ErrorApi<T> {
        errorList?.find {
            it == "Error fetching new Token"
        }?.let {
            return Response.ErrorApi(ErrorCode.AUTHORIZATION_ERROR)
        }
        return Response.ErrorApi(ErrorCode.UNKNOWN_ERROR)
    }

    private fun isNetworkError(e: Throwable): Boolean {
        return e is IOException
    }
}