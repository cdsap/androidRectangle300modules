package com.awesomeapp.sessioncheckout

sealed class State218_57 {
    data object Loading : State218_57()
    data class Success(val data: String) : State218_57()
    data class Error(val message: String) : State218_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}